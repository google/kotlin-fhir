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
import com.google.fhir.codegen.primitives.FhirDateFileSpecGenerator
import com.google.fhir.codegen.primitives.FhirDateTimeFileSpecGenerator
import com.google.fhir.codegen.primitives.LocalTimeSerializerFileSpecGenerator
import com.google.fhir.codegen.schema.StructureDefinition
import com.squareup.kotlinpoet.ClassName
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

  @TaskAction
  fun generateCode() {
    // Prepare the output folder
    val outputDir = outputDirectory.get().asFile
    outputDir.deleteRecursively()
    outputDir.mkdirs()

    // Prepare the input files and log them in the output folder
    val inputFiles =
      definitionFiles.files.flatMap { file ->
        // Only use structure definition files for resource types.
        // NB filtering by file name is only an approximation.
        file.walkTopDown().filter {
          it.isFile && it.name.matches("StructureDefinition-[A-Za-z0-9]*\\.json".toRegex())
        }
      }
    outputDir.resolve("inputs.txt").writeText(inputFiles.joinToString("\n"))

    // Parse input files
    val json = Json {
      ignoreUnknownKeys = true
      prettyPrint = true
    }

    val structureDefinitions =
      inputFiles
        .asSequence()
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

    structureDefinitions
      .flatMap {
        FhirCodegen.generateFileSpecs(
          this.packageName.get(),
          it,
          baseClasses.contains(it.name.capitalized()),
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

    FhirDateTimeFileSpecGenerator.generate(this.packageName.get()).writeTo(outputDir)
    FhirDateFileSpecGenerator.generate(this.packageName.get()).writeTo(outputDir)

    // Generate custom serializers
    val serializersPackageName = "${this.packageName.get()}.serializers"
    DoubleSerializerFileSpecGenerator.generate(serializersPackageName).writeTo(outputDir)
    LocalTimeSerializerFileSpecGenerator.generate(serializersPackageName).writeTo(outputDir)
  }
}
