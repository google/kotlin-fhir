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

/**
 * This value set defines a set of codes that can be used to express the role of a diagnosis on the
 * Encounter or EpisodeOfCare record.
 */
public enum class DiagnosisRole(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Ad("AD", "http://terminology.hl7.org/CodeSystem/diagnosis-role", "Admission diagnosis", null),
  Dd("DD", "http://terminology.hl7.org/CodeSystem/diagnosis-role", "Discharge diagnosis", null),
  Cc("CC", "http://terminology.hl7.org/CodeSystem/diagnosis-role", "Chief complaint", null),
  Cm("CM", "http://terminology.hl7.org/CodeSystem/diagnosis-role", "Comorbidity diagnosis", null),
  Pre_Op(
    "pre-op",
    "http://terminology.hl7.org/CodeSystem/diagnosis-role",
    "pre-op diagnosis",
    null,
  ),
  Post_Op(
    "post-op",
    "http://terminology.hl7.org/CodeSystem/diagnosis-role",
    "post-op diagnosis",
    null,
  ),
  Billing("billing", "http://terminology.hl7.org/CodeSystem/diagnosis-role", "Billing", null);

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): DiagnosisRole =
      when (code) {
        "AD" -> Ad
        "DD" -> Dd
        "CC" -> Cc
        "CM" -> Cm
        "pre-op" -> Pre_Op
        "post-op" -> Post_Op
        "billing" -> Billing
        else -> throw IllegalArgumentException("Unknown code $code for enum DiagnosisRole")
      }
  }
}
