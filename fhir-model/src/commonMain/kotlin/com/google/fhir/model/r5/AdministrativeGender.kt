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

import kotlin.String

/** The gender of a person used for administrative purposes. */
public enum class AdministrativeGender(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** Male. */
  Male("male", "http://hl7.org/fhir/administrative-gender", "Male", "Male."),
  /** Female. */
  Female("female", "http://hl7.org/fhir/administrative-gender", "Female", "Female."),
  /** Other. */
  Other("other", "http://hl7.org/fhir/administrative-gender", "Other", "Other."),
  /** Unknown. */
  Unknown("unknown", "http://hl7.org/fhir/administrative-gender", "Unknown", "Unknown.");

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): AdministrativeGender =
      when (code) {
        "male" -> Male
        "female" -> Female
        "other" -> Other
        "unknown" -> Unknown
        else -> throw IllegalArgumentException("Unknown code $code for enum AdministrativeGender")
      }
  }
}
