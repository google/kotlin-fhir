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

/** The outcome of the processing. */
public enum class RemittanceOutcome(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /**
   * The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.
   */
  Queued(
    "queued",
    "http://hl7.org/fhir/remittance-outcome",
    "Queued",
    "The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.",
  ),
  /** The processing completed without errors. */
  Complete(
    "complete",
    "http://hl7.org/fhir/remittance-outcome",
    "Complete",
    "The processing completed without errors.",
  ),
  /** The processing identified errors. */
  Error(
    "error",
    "http://hl7.org/fhir/remittance-outcome",
    "Error",
    "The processing identified errors.",
  ),
  /** No errors have been detected and some of the adjudication has been performed. */
  Partial(
    "partial",
    "http://hl7.org/fhir/remittance-outcome",
    "Partial",
    "No errors have been detected and some of the adjudication has been performed.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): RemittanceOutcome =
      when (code) {
        "queued" -> Queued
        "complete" -> Complete
        "error" -> Error
        "partial" -> Partial
        else -> throw IllegalArgumentException("Unknown code $code for enum RemittanceOutcome")
      }
  }
}
