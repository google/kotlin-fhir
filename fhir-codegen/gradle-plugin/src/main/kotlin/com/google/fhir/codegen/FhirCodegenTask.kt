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

import com.google.fhir.codegen.primitives.DoubleSerializerTypeSpecGenerator
import com.google.fhir.codegen.primitives.EnumerationTypeGenerator
import com.google.fhir.codegen.primitives.FhirDateTimeTypeGenerator
import com.google.fhir.codegen.primitives.FhirDateTypeGenerator
import com.google.fhir.codegen.primitives.LocalTimeSerializerTypeSpecGenerator
import com.google.fhir.codegen.schema.CodeSystem
import com.google.fhir.codegen.schema.StructureDefinition
import com.google.fhir.codegen.schema.ValueSet
import com.google.fhir.codegen.schema.getCodeSystemName
import com.google.fhir.codegen.schema.getMergedCodeSystem
import com.squareup.kotlinpoet.FileSpec
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
import org.gradle.configurationcache.extensions.capitalized

@CacheableTask
abstract class FhirCodegenTask : DefaultTask() {
  @get:InputFiles
  @get:PathSensitive(PathSensitivity.NONE)
  abstract val definitionFiles: ConfigurableFileCollection

  @get:Input abstract val packageName: Property<String>

  @get:OutputDirectory abstract val outputDirectory: DirectoryProperty

  private val json = Json {
    ignoreUnknownKeys = true
    prettyPrint = true
  }

  private val nonCommonBindingValueSetIds = hashSetOf<String>()

  @TaskAction
  fun generateCode() {
    // Prepare the output folder
    val outputDir = outputDirectory.get().asFile
    outputDir.deleteRecursively()
    outputDir.mkdirs()

    // Prepare the input files and log them in the output folder
    val inputFiles =
      definitionFiles.files.flatMap { file ->
        // Use structure definitions, value set and code system files
        // NB filtering by file name is only an approximation.
        file.walkTopDown().filter {
          it.isFile &&
            (it.name.matches("StructureDefinition-[A-Za-z0-9]*\\.json".toRegex()) ||
              it.name.matches("(?i)^(ValueSet|CodeSystem)((-v3.*)?|(?!-v\\d).*)\\.json$".toRegex()))
        }
      }
    outputDir.resolve("inputs.txt").writeText(inputFiles.joinToString("\n"))

    val valueSetMap =
      inputFiles
        .asSequence()
        .filter { it.name.startsWith("ValueSet", ignoreCase = true) }
        .map { json.decodeFromString<ValueSet>(it.readText(Charsets.UTF_8)) }
        .filter { it.id != "FHIR-version" }
        .groupBy { it.url }
        .mapValues { it.value.first() }

    val codeSystemMap =
      inputFiles
        .asSequence()
        .filter { it.name.startsWith("CodeSystem", ignoreCase = true) }
        .map { json.decodeFromString<CodeSystem>(it.readText(Charsets.UTF_8)) }
        .groupBy { it.url }
        .mapValues { it.value.first() }

    // Only use structure definition files for resource types.
    val structureDefinitions =
      inputFiles
        .asSequence()
        .filter { it.name.startsWith("StructureDefinition") }
        .map { json.decodeFromString<StructureDefinition>(it.readText(Charsets.UTF_8)) }
        .filterNot {
          // Do not generate classes for logical types e.g. `Definition`, `Request`, `Event`, etc.
          it.kind == StructureDefinition.Kind.LOGICAL
        }
        .filterNot {
          // ???
          it.kind == StructureDefinition.Kind.RESOURCE && it.name != it.id
        }
        .filterNot {
          // Filter out files like StructureDefinition-hdlcholesterol.json
          it.baseDefinition?.endsWith(it.type) == true
        }
        .toList()

    val baseClasses =
      structureDefinitions
        .map {
          if (it.name == "MetadataResource") {
            "CanonicalResource"
          } else {
            it.baseDefinition?.substringAfterLast('/')?.capitalized()
          }
        }
        .distinct()

    val packageName = this.packageName.get()
    structureDefinitions
      .flatMap { structureDefinition ->
        FhirCodegen.generateFileSpecs(
          packageName = packageName,
          structureDefinition = structureDefinition,
          isBaseClass = baseClasses.contains(structureDefinition.name.capitalized()),
          valueSetMap = valueSetMap,
          codeSystemMap = codeSystemMap,
          nonCommonBindingValueSetIds = nonCommonBindingValueSetIds,
        )
      }
      .forEach { it.writeTo(outputDir) }

    // Generate enum classes, exclude those generated from StructureDefinitions
    valueSetMap.values
      .filterNot { nonCommonBindingValueSetIds.contains(it.id) }
      .forEach { valueSet ->
        val codeSystem = valueSet.getMergedCodeSystem(codeSystemMap)
        if (codeSystem != null) {
          val enumClassName = codeSystem.getCodeSystemName()
          FileSpec.builder(packageName = "$packageName.enums", fileName = enumClassName)
            .addType(EnumTypeSpecGenerator.generate(enumClassName, codeSystem))
            .build()
            .writeTo(outputDir)
        }
      }

    FhirDateTimeTypeGenerator.generate(packageName).writeTo(outputDir)
    FhirDateTypeGenerator.generate(packageName).writeTo(outputDir)

    // Generate an extension to the primitive type - "code", to be used where code is tied to an
    // enumerated list of possible values. FHIR has no primitive type for enums.
    EnumerationTypeGenerator.generate(packageName).writeTo(outputDir)

    // Generate custom serializers
    val serializersPackageName = "$packageName.serializers"
    DoubleSerializerTypeSpecGenerator.generate(serializersPackageName).writeTo(outputDir)
    LocalTimeSerializerTypeSpecGenerator.generate(serializersPackageName).writeTo(outputDir)
  }
}
