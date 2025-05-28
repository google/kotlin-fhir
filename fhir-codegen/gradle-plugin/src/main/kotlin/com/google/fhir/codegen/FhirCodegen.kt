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

import com.google.fhir.codegen.schema.StructureDefinition
import com.google.fhir.codegen.schema.rootElements
import com.google.fhir.codegen.schema.serializableWithCustomSerializer
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import kotlinx.serialization.UseSerializers
import org.gradle.configurationcache.extensions.capitalized

/**
 * Generates [FileSpec]s for a given FHIR StructureDefinition.
 *
 * This function produces three files:
 * 1. A data model file (e.g., `Patient.kt`) containing the primary data class and any nested
 *    classes for BackboneElements.
 * 2. A surrogate file (e.g., `PatientSurrogates.kt`) in the `surrogates` package with "flattened"
 *    surrogate classes for the primary class and its nested classes for BackboneElements.
 * 3. A serializer file (e.g., `PatientSerializers.kt`) in the `serializers` package with
 *    "flattened" custom serializers for the primary class and its nested classes for
 *    BackboneElements.
 *
 * For example, the following files are generated for the FHIR `Patient` resource:
 * - `Patient.kt` containing the `Patient` data class with its nested classes for BackboneElements.
 * - `PatientSurrogates.kt` in the `surrogates` package containing surrogate classes like
 *   `PatientSurrogate`, `PatientContactSurrogate`, etc.
 * - `PatientSerializers.kt` in the `serializers` package containing custom serializers like
 *   `PatientSerializer`, `PatientContactSerializer`, etc.
 */
object FhirCodegen {
  fun generateFileSpecs(
    packageName: String,
    structureDefinition: StructureDefinition,
    isBaseClass: Boolean,
  ): List<FileSpec> {
    val modelClassName = ClassName(packageName, structureDefinition.name.capitalized())
    val modelFileSpec = FileSpec.builder(modelClassName)
    val surrogateFileSpec = modelClassName.toSurrogateFileSpecBuilder()
    val serializerFileSpec = modelClassName.toSerializerFileSpecBuilder()

    val fileSpecs =
      mutableListOf(
        modelFileSpec
          .addType(
            ModelTypeSpecGenerator.generate(
              modelClassName,
              structureDefinition,
              isBaseClass,
              surrogateFileSpec,
              serializerFileSpec,
            )
          )
          .addSuppressAnnotation()
          .build()
      )

    if (structureDefinition.serializableWithCustomSerializer) {
      // TODO: Handle cases where the class does not need the surrogate class and the
      //  custom serializer since it does not have any primitive fields.
      val serializersPackageName = "${modelClassName.packageName}.serializers"
      fileSpecs +=
        surrogateFileSpec
          .apply {
            SurrogateTypeSpecGenerator.generate(
                ClassName(packageName, structureDefinition.name),
                structureDefinition.rootElements,
              )
              .forEach(surrogateFileSpec::addType)
          }
          .addAnnotation(
            AnnotationSpec.builder(UseSerializers::class)
              .addMember("%T::class", ClassName(serializersPackageName, "DoubleSerializer"))
              .addMember("%T::class", ClassName(serializersPackageName, "LocalTimeSerializer"))
              .build()
          )
          .addSuppressAnnotation()
          .build()

      fileSpecs +=
        serializerFileSpec
          .addType(
            SerializerTypeSpecGenerator.generate(ClassName(packageName, structureDefinition.name))
          )
          .addSuppressAnnotation()
          .build()
    }
    return fileSpecs
  }
}

/**
 * Returns the [FileSpec.Builder] that represents the surrogate file for this [ClassName]. The
 * surrogate file will contain the surrogate class for the given [ClassName] and all surrogate
 * classes of its nested classes. The surrogate file will be under the `surrogate` package with a
 * name suffixed with "Surrogates".
 *
 * For example:
 * - `com.google.fhir.r4.Patient` will return [FileSpec] for `PatientSurrogates.kt` in package
 *   `com.google.fhir.r4.surrogates`.
 */
private fun ClassName.toSurrogateFileSpecBuilder(): FileSpec.Builder =
  FileSpec.builder("${packageName}.surrogates", simpleName.plus("Surrogates"))

/**
 * Returns the [FileSpec.Builder] that represents the serializer file for this [ClassName]. The
 * serializer file will contain the serializer for the given [ClassName] and all serializers for its
 * nested classes. The serializer file will be under the `serializers` package with a name suffixed
 * with "Serializers".
 *
 * For example:
 * - `com.google.fhir.r4.Patient` will return [FileSpec] for `PatientSerializers.kt` in package
 *   `com.google.fhir.r4.serializers`.
 */
private fun ClassName.toSerializerFileSpecBuilder(): FileSpec.Builder =
  FileSpec.builder("${packageName}.serializers", simpleName.plus("Serializers"))

/**
 * Adds a `@Suppress` annotation to the [FileSpec.Builder] to prevent warnings.
 *
 * This function adds the following suppressions:
 * - `RedundantVisibilityModifier`: Suppresses warnings about redundant visibility modifiers (e.g.,
 *   `public`) that KotlinPoet might generate.
 * - `PropertyName`: Suppresses warnings about property names that start with an underscore (`_`),
 *   which is a convention used in the generated code for JSON properties associated with FHIR
 *   primitive types that may have extensions.
 */
private fun FileSpec.Builder.addSuppressAnnotation() = apply {
  addAnnotation(
    AnnotationSpec.builder(Suppress::class)
      // Suppresses warnings about redundant visibility modifiers (e.g., `public`) KotlinPoet might
      // generate.
      .addMember("%S", "RedundantVisibilityModifier")
      // Suppress warnings about property names prefixed with an underscore `_` for FHIR primitive
      // data types.
      .addMember("%S", "PropertyName")
      .build()
  )
}
