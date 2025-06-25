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

package com.google.fhir.model.r4b

import kotlin.String

/** Used to specify why the normally expected content of the data element is missing. */
public enum class ObservationValueAbsentReason(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** The value is expected to exist but is not known. */
  Unknown(
    "unknown",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Unknown",
    "The value is expected to exist but is not known.",
  ),
  /** The source was asked but does not know the value. */
  Asked_Unknown(
    "asked-unknown",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Asked But Unknown",
    "The source was asked but does not know the value.",
  ),
  /** There is reason to expect (from the workflow) that the value may become known. */
  Temp_Unknown(
    "temp-unknown",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Temporarily Unknown",
    "There is reason to expect (from the workflow) that the value may become known.",
  ),
  /** The workflow didn't lead to this value being known. */
  Not_Asked(
    "not-asked",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Not Asked",
    "The workflow didn't lead to this value being known.",
  ),
  /** The source was asked but declined to answer. */
  Asked_Declined(
    "asked-declined",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Asked But Declined",
    "The source was asked but declined to answer.",
  ),
  /** The information is not available due to security, privacy or related reasons. */
  Masked(
    "masked",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Masked",
    "The information is not available due to security, privacy or related reasons.",
  ),
  /** There is no proper value for this element (e.g. last menstrual period for a male). */
  Not_Applicable(
    "not-applicable",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Not Applicable",
    "There is no proper value for this element (e.g. last menstrual period for a male).",
  ),
  /** The source system wasn't capable of supporting this element. */
  Unsupported(
    "unsupported",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Unsupported",
    "The source system wasn't capable of supporting this element.",
  ),
  /** The content of the data is represented in the resource narrative. */
  As_Text(
    "as-text",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "As Text",
    "The content of the data is represented in the resource narrative.",
  ),
  /** Some system or workflow process error means that the information is not available. */
  Error(
    "error",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Error",
    "Some system or workflow process error means that the information is not available.",
  ),
  /** The numeric value is undefined or unrepresentable due to a floating point processing error. */
  Not_A_Number(
    "not-a-number",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Not a Number (NaN)",
    "The numeric value is undefined or unrepresentable due to a floating point processing error.",
  ),
  /**
   * The numeric value is excessively low and unrepresentable due to a floating point processing
   * error.
   */
  Negative_Infinity(
    "negative-infinity",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Negative Infinity (NINF)",
    "The numeric value is excessively low and unrepresentable due to a floating point processing error.",
  ),
  /**
   * The numeric value is excessively high and unrepresentable due to a floating point processing
   * error.
   */
  Positive_Infinity(
    "positive-infinity",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Positive Infinity (PINF)",
    "The numeric value is excessively high and unrepresentable due to a floating point processing error.",
  ),
  /**
   * The value is not available because the observation procedure (test, etc.) was not performed.
   */
  Not_Performed(
    "not-performed",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Not Performed",
    "The value is not available because the observation procedure (test, etc.) was not performed.",
  ),
  /** The value is not permitted in this context (e.g. due to profiles, or the base data types). */
  Not_Permitted(
    "not-permitted",
    "http://terminology.hl7.org/CodeSystem/data-absent-reason",
    "Not Permitted",
    "The value is not permitted in this context (e.g. due to profiles, or the base data types).",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): ObservationValueAbsentReason =
      when (code) {
        "unknown" -> Unknown
        "asked-unknown" -> Asked_Unknown
        "temp-unknown" -> Temp_Unknown
        "not-asked" -> Not_Asked
        "asked-declined" -> Asked_Declined
        "masked" -> Masked
        "not-applicable" -> Not_Applicable
        "unsupported" -> Unsupported
        "as-text" -> As_Text
        "error" -> Error
        "not-a-number" -> Not_A_Number
        "negative-infinity" -> Negative_Infinity
        "positive-infinity" -> Positive_Infinity
        "not-performed" -> Not_Performed
        "not-permitted" -> Not_Permitted
        else ->
          throw IllegalArgumentException("Unknown code $code for enum ObservationValueAbsentReason")
      }
  }
}
