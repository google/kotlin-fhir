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

package com.google.fhir.model.r5

/** Allowed types for FHIR elements in ElementDefinition.type.code */
public enum class ElementDefinitionTypes(
  private val code: kotlin.String,
  private val system: kotlin.String,
  private val display: kotlin.String?,
  private val definition: kotlin.String?,
) {
  String(
    "http://hl7.org/fhirpath/System.String",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "String",
    null,
  ),
  Boolean(
    "http://hl7.org/fhirpath/System.Boolean",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "Boolean",
    null,
  ),
  Date(
    "http://hl7.org/fhirpath/System.Date",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "Date",
    null,
  ),
  DateTime(
    "http://hl7.org/fhirpath/System.DateTime",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "DateTime",
    null,
  ),
  Decimal(
    "http://hl7.org/fhirpath/System.Decimal",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "Decimal",
    null,
  ),
  Integer(
    "http://hl7.org/fhirpath/System.Integer",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "Integer",
    null,
  ),
  Time(
    "http://hl7.org/fhirpath/System.Time",
    "http://hl7.org/fhir/CodeSystem/fhirpath-types",
    "Time",
    null,
  );

  override fun toString(): kotlin.String = code

  public fun getCode(): kotlin.String = code

  public fun getSystem(): kotlin.String = system

  public fun getDisplay(): kotlin.String? = display

  public fun getDefinition(): kotlin.String? = definition

  public companion object {
    public fun fromCode(code: kotlin.String): ElementDefinitionTypes =
      when (code) {
        "http://hl7.org/fhirpath/System.String" -> String
        "http://hl7.org/fhirpath/System.Boolean" -> Boolean
        "http://hl7.org/fhirpath/System.Date" -> Date
        "http://hl7.org/fhirpath/System.DateTime" -> DateTime
        "http://hl7.org/fhirpath/System.Decimal" -> Decimal
        "http://hl7.org/fhirpath/System.Integer" -> Integer
        "http://hl7.org/fhirpath/System.Time" -> Time
        else -> throw IllegalArgumentException("Unknown code $code for enum ElementDefinitionTypes")
      }
  }
}
