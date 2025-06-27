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

/** This value set includes sample Payee Type codes. */
public enum class PayeeType(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** The subscriber (policy holder) will be reimbursed. */
  Subscriber(
    "subscriber",
    "http://terminology.hl7.org/CodeSystem/payeetype",
    "Subscriber",
    "The subscriber (policy holder) will be reimbursed.",
  ),
  /** Any benefit payable will be paid to the provider (Assignment of Benefit). */
  Provider(
    "provider",
    "http://terminology.hl7.org/CodeSystem/payeetype",
    "Provider",
    "Any benefit payable will be paid to the provider (Assignment of Benefit).",
  ),
  /** Any benefit payable will be paid to a third party such as a guarrantor. */
  Other(
    "other",
    "http://terminology.hl7.org/CodeSystem/payeetype",
    "Provider",
    "Any benefit payable will be paid to a third party such as a guarrantor.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): PayeeType =
      when (code) {
        "subscriber" -> Subscriber
        "provider" -> Provider
        "other" -> Other
        else -> throw IllegalArgumentException("Unknown code $code for enum PayeeType")
      }
  }
}
