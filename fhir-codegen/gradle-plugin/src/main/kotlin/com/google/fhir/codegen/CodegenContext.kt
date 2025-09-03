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
import com.google.fhir.codegen.schema.capitalized
import com.google.fhir.codegen.schema.valueset.ValueSet
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import kotlinx.serialization.UseSerializers

/** Shared context object containing contextual information needed for code generation. */
data class CodegenContext(
  val packageName: String,
  val valueSetMap: Map<String, ValueSet>,
  val baseClassesSet: HashSet<String>,
) {
  fun getModelClassName(structureDefinition: StructureDefinition) =
    ClassName(packageName, structureDefinition.name.capitalized())

  fun isBaseClass(structureDefinition: StructureDefinition) =
    baseClassesSet.contains(structureDefinition.name.capitalized())

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
  fun getSurrogateFileSpecBuilder(structureDefinition: StructureDefinition): FileSpec.Builder =
    FileSpec.builder(
        "${packageName}.surrogates",
        getModelClassName(structureDefinition).simpleName.plus("Surrogates"),
      )
      .addUseSerializerAnnotations(structureDefinition)
      .addSuppressAnnotation()

  /**
   * Returns the [FileSpec.Builder] that represents the serializer file for this [ClassName]. The
   * serializer file will contain the serializer for the given [ClassName] and all serializers for
   * its nested classes. The serializer file will be under the `serializers` package with a name
   * suffixed with "Serializers".
   *
   * For example:
   * - `com.google.fhir.r4.Patient` will return [FileSpec] for `PatientSerializers.kt` in package
   *   `com.google.fhir.r4.serializers`.
   */
  fun getSerializerFileSpecBuilder(structureDefinition: StructureDefinition): FileSpec.Builder =
    FileSpec.builder(
        "${packageName}.serializers",
        getModelClassName(structureDefinition).simpleName.plus("Serializers"),
      )
      .addSuppressAnnotation()

  private fun FileSpec.Builder.addUseSerializerAnnotations(
    structureDefinition: StructureDefinition
  ) = apply {
    addAnnotation(
      AnnotationSpec.builder(UseSerializers::class)
        .addMember(
          "%T::class",
          ClassName(
            "${getModelClassName(structureDefinition).packageName}.serializers",
            "DoubleSerializer",
          ),
        )
        .addMember(
          "%T::class",
          ClassName(
            "${getModelClassName(structureDefinition).packageName}.serializers",
            "LocalTimeSerializer",
          ),
        )
        .build()
    )
  }
}

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
fun FileSpec.Builder.addSuppressAnnotation() = apply {
  addAnnotation(
    AnnotationSpec.builder(Suppress::class)
      // Suppresses warnings about redundant visibility modifiers (e.g., `public`) KotlinPoet
      // might
      // generate.
      .addMember("%S", "RedundantVisibilityModifier")
      // Suppress warnings about property names prefixed with an underscore `_` for FHIR primitive
      // data types.
      .addMember("%S", "PropertyName")
      .build()
  )
}
