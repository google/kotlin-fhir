/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.fhir.codegen

import com.google.fhir.codegen.primitives.DoubleSerializerFileSpecGenerator
import com.google.fhir.codegen.primitives.EnumerationFileSpecGenerator
import com.google.fhir.codegen.primitives.FhirDateFileSpecGenerator
import com.google.fhir.codegen.primitives.FhirDateTimeFileSpecGenerator
import com.google.fhir.codegen.primitives.LocalTimeSerializerFileSpecGenerator
import com.google.fhir.codegen.schema.StructureDefinition
import com.google.fhir.codegen.schema.capitalized
import com.google.fhir.codegen.schema.normalizeEnumName
import com.google.fhir.codegen.schema.urlPart
import com.google.fhir.codegen.schema.valueset.ValueSet
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import java.io.File
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

@CacheableTask
abstract class FhirCodegenTask : DefaultTask() {
  @get:InputFiles
  @get:PathSensitive(PathSensitivity.NONE)
  abstract val definitionFiles: ConfigurableFileCollection

  @get:InputFiles
  @get:PathSensitive(PathSensitivity.NONE)
  abstract val expansionFiles: ConfigurableFileCollection

  @get:Input abstract val packageName: Property<String>

  @get:OutputDirectory abstract val outputDirectory: DirectoryProperty

  private val json = Json {
    ignoreUnknownKeys = true
    prettyPrint = true
  }

  private val commonBindingValueSetUrls = mutableMapOf<String, HashSet<String>>()

  @TaskAction
  fun generateCode() {
    // Prepare the output folder
    val outputDir = outputDirectory.get().asFile
    outputDir.deleteRecursively()
    outputDir.mkdirs()

    // Prepare the input files and log them in the output folder
    val definitionInputFiles =
      definitionFiles.files.flatMap { file ->
        // Use structure definitions files
        // NB filtering by file name is only an approximation.
        file.walkTopDown().filter {
          it.isFile && it.name.matches("StructureDefinition-[A-Za-z0-9]*\\.json".toRegex())
        }
      }
    outputDir.resolve("inputs.txt").writeText(definitionInputFiles.joinToString("\n"))

    val expansionInputFiles =
      expansionFiles.files.flatMap { file ->
        // The files from the expansion package are only ValueSets, extract only the JSON
        // files'. These ValueSets are already expanded to include codes from concepts from the
        // referenced CodeSystems.
        file.walkTopDown().filter { it.isFile && it.name.matches("^ValueSet.*\\.json$".toRegex()) }
      }

    val valueSetMap =
      expansionInputFiles
        .asSequence()
        .map { json.decodeFromString<ValueSet>(it.readText(Charsets.UTF_8)) }
        .filter { valueSet ->
          valueSet.compose?.include?.all {
            !it.system.isNullOrBlank() &&
              // URN systems are excluded because they cannot be expanded (e.g., UCUM, MIME)
              !it.system.startsWith("urn", ignoreCase = true) &&
              // Excluded to avoid generating conflicting enum classes because the binding name
              // ("PublicationStatus") is already associated  with a different ValueSet. In this
              // case, two common binding elements reference different ValueSets.
              it.system != "http://hl7.org/fhir/specimen-combined"
          } == true
        }
        .groupBy { it.urlPart }
        .mapValues { it.value.first() }

    // Only use structure definition files for resource types.
    val structureDefinitions =
      definitionInputFiles
        .asSequence()
        .filter { it.name.startsWith("StructureDefinition") }
        .map { json.decodeFromString<StructureDefinition>(it.readText(Charsets.UTF_8)) }
        .filterNot {
          // Do not generate classes for logical types e.g. `Definition`, `Request`, `Event`, etc.
          it.kind == StructureDefinition.Kind.LOGICAL
        }
        .filterNot {
          // Do not generate metadata resource or canonical resource types as interface inheritance
          // has not been implemented.
          it.name == "MetadataResource" || it.name == "CanonicalResource"
        }
        .filterNot {
          // ???
          it.kind == StructureDefinition.Kind.RESOURCE && it.name != it.id
        }
        .filterNot { it.name == "MetadataResource" || it.name == "CanonicalResource" }
        .filterNot {
          // Filter out files like StructureDefinition-hdlcholesterol.json
          it.baseDefinition?.endsWith(it.type) == true
        }
        .toList()

    val baseClasses =
      structureDefinitions
        .map { it.baseDefinition?.substringAfterLast('/')?.capitalized() }
        .distinct()

    val packageName = this.packageName.get()

    val modelTypeSpecGenerator = ModelTypeSpecGenerator(valueSetMap, commonBindingValueSetUrls)
    val surrogateTypeSpecGenerator = SurrogateTypeSpecGenerator(valueSetMap)
    structureDefinitions
      .flatMap { structureDefinition ->
        FhirCodegen.generateFileSpecs(
          packageName = packageName,
          structureDefinition = structureDefinition,
          isBaseClass = baseClasses.contains(structureDefinition.name.capitalized()),
          modelTypeSpecGenerator = modelTypeSpecGenerator,
          surrogateTypeSpecGenerator = surrogateTypeSpecGenerator,
        )
      }
      .forEach { it.writeTo(outputDir) }

    MoreJsonBuilderFileSpecGenerator.generate(
        this.packageName.get(),
        ClassName(this.packageName.get(), "Resource"),
        structureDefinitions
          .mapNotNull {
            if (it.kind != StructureDefinition.Kind.RESOURCE) return@mapNotNull null
            if (it.abstract) return@mapNotNull null
            return@mapNotNull ClassName(this.packageName.get(), it.name.capitalized())
          }
          .toList(),
      )
      .writeTo(outputDir)

    FhirDateTimeFileSpecGenerator.generate(packageName).writeTo(outputDir)
    FhirDateFileSpecGenerator.generate(packageName).writeTo(outputDir)

    // Generates a wrapper for enum types
    EnumerationFileSpecGenerator.generate(packageName).writeTo(outputDir)

    generateSharedEnums(valueSetMap, packageName, outputDir)

    // Generate custom serializers
    val serializersPackageName = "$packageName.serializers"
    DoubleSerializerFileSpecGenerator.generate(serializersPackageName).writeTo(outputDir)
    LocalTimeSerializerFileSpecGenerator.generate(serializersPackageName).writeTo(outputDir)
  }

  /**
   * Generate shared enums. These enum classes are created from [StructureDefinition.snapshot]
   * Elements that have common binding extensions.
   */
  private fun generateSharedEnums(
    valueSetMap: Map<String, ValueSet>,
    packageName: String,
    outputDir: File,
  ) {
    valueSetMap.values
      .filter { commonBindingValueSetUrls.containsKey(it.urlPart) }
      .forEach { valueSet ->
        val valueSetName = valueSet.name.normalizeEnumName()
        val commonBindingNames = commonBindingValueSetUrls[valueSet.urlPart]

        // Create enums for a ValueSet that's used by several common binding names
        if (commonBindingNames != null) {
          commonBindingNames.forEach { name ->
            val enumTypeSpec = EnumTypeSpecGenerator.generate(name, valueSet)
            if (enumTypeSpec != null) {
              FileSpec.builder(packageName = packageName, fileName = name)
                .addType(enumTypeSpec)
                .build()
                .writeTo(outputDir)
            }
          }
        } else {
          val enumTypeSpec = EnumTypeSpecGenerator.generate(valueSetName, valueSet)
          if (enumTypeSpec != null) {
            FileSpec.builder(packageName = packageName, fileName = valueSetName)
              .addType(enumTypeSpec)
              .build()
              .writeTo(outputDir)
          }
        }
      }
  }
}
