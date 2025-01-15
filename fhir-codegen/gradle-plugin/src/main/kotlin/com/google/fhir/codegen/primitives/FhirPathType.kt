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

package com.google.fhir.codegen.primitives

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.asClassName
import kotlinx.datetime.LocalTime

/**
 * FHIRPath data types and their properties to aid code generation. Each [FhirPathType] has the
 * following properties:
 * - **URI:** The unique identifier for the FHIRPath type (e.g.,
 *   "http://hl7.org/fhirpath/System.Boolean").
 * - **FHIR Type Codes:** A list of FHIR primitive type codes associated with this type (e.g.
 *   "integer", "integer64", "positiveInt", "unsignedInt" are all associated with the FHIRPath
 *   Integer type, and should be handled in the generated data class and surrogate class
 *   accordingly).
 * - **Kotlin Type in Data Class:** The Kotlin class used for representing the value in the data
 *   class (e.g. FHIRPath DateTime is represented in the data class as FHIRDateTime, an interface
 *   generated to handle the DateTime type in FHIR specifically).
 * - **Kotlin Type in Surrogate Class:** The Kotlin class used for representing the value in the
 *   surrogate classes (e.g., FHIRPath DateTime is mapped to a Kotlin String in the surrogate
 *   class).
 */
enum class FhirPathType(
  val uri: String,
  val fhirTypeCodes: List<String>,
  val typeInSurrogateClass: ClassName,
) {
  BOOLEAN(
    "http://hl7.org/fhirpath/System.Boolean",
    listOf("boolean"),
    Boolean::class.asClassName(),
  ) {
    override fun getTypeInDataClass(packageName: String) = Boolean::class.asClassName()
  },
  INTEGER(
    "http://hl7.org/fhirpath/System.Integer",
    listOf("integer", "integer64", "positiveInt", "unsignedInt"),
    Int::class.asClassName(),
  ) {
    override fun getTypeInDataClass(packageName: String) = Int::class.asClassName()
  },
  DECIMAL(
    "http://hl7.org/fhirpath/System.Decimal",
    listOf("decimal"),
    Double::class.asClassName(),
  ) {
    override fun getTypeInDataClass(packageName: String) = Double::class.asClassName()
  },
  STRING(
    "http://hl7.org/fhirpath/System.String",
    listOf(
      "string",
      "code",
      "canonical",
      "uri",
      "oid",
      "url",
      "id",
      "uuid",
      "markdown",
      "xhtml",
      "base64Binary",
    ),
    String::class.asClassName(),
  ) {
    override fun getTypeInDataClass(packageName: String) = String::class.asClassName()
  },
  DATE("http://hl7.org/fhirpath/System.Date", listOf("date"), String::class.asClassName()) {
    override fun getTypeInDataClass(packageName: String) = ClassName(packageName, "FhirDate")
  },
  TIME("http://hl7.org/fhirpath/System.Time", listOf("time"), LocalTime::class.asClassName()) {
    override fun getTypeInDataClass(packageName: String) = LocalTime::class.asClassName()
  },
  DATETIME(
    "http://hl7.org/fhirpath/System.DateTime",
    listOf("dateTime", "instant"),
    String::class.asClassName(),
  ) {
    override fun getTypeInDataClass(packageName: String) = ClassName(packageName, "FhirDateTime")
  };

  abstract fun getTypeInDataClass(packageName: String): ClassName

  companion object {
    /**
     * Returns all URIs of supported FHIRPath types. This function is used to determine if an
     * element of FHIRPath type (always in the StructureDefinition of FHIR primitive types) should
     * be mapped to the corresponding Kotlin type. For example, element `string.value` should be
     * mapped to Kotlin [String].
     */
    fun getUris() = entries.map { it.uri }

    /**
     * Returns the [FhirPathType] corresponding to the given URI. This function is used to retrieve
     * the [FhirPathType] to map an element to the corresponding Kotlin type.
     */
    fun getFromUri(uri: String) = entries.find { it.uri == uri }

    /**
     * Whether any [FhirPathType] contains the given [fhirTypeCode]. This function is used to
     * determine whether a type code is a supported FHIR primitive type. This is used to generate
     * code in the surrogate class since FHIR primitive types are mapped to fields in the surrogate
     * class corresponding to two JSON properties.
     */
    fun containsFhirTypeCode(fhirTypeCode: String) =
      entries.any { it.fhirTypeCodes.contains(fhirTypeCode) }

    /**
     * Returns the [FhirPathType] corresponding to the given FHIR type code. This function is used
     * to determine the type of a primitive field in the surrogate class.
     */
    fun getFromFhirTypeCode(fhirTypeCode: String) =
      entries.find { it.fhirTypeCodes.contains(fhirTypeCode) }
  }
}
