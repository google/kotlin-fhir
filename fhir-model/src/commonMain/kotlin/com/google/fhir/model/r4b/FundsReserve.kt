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

/** This value set includes sample funds reservation type codes. */
public enum class FundsReserve(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /**
   * The payor is requested to reserve funds for the provision of the named services by any provider
   * for settlement of future claims related to this request.
   */
  Patient(
    "patient",
    "http://terminology.hl7.org/CodeSystem/fundsreserve",
    "Patient",
    "The payor is requested to reserve funds for the provision of the named services by any provider for settlement of future claims related to this request.",
  ),
  /**
   * The payor is requested to reserve funds solely for the named provider for settlement of future
   * claims related to this request.
   */
  Provider(
    "provider",
    "http://terminology.hl7.org/CodeSystem/fundsreserve",
    "Provider",
    "The payor is requested to reserve funds solely for the named provider for settlement of future claims related to this request.",
  ),
  /** The payor is not being requested to reserve any funds for the settlement of future claims. */
  None(
    "none",
    "http://terminology.hl7.org/CodeSystem/fundsreserve",
    "None",
    "The payor is not being requested to reserve any funds for the settlement of future claims.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): FundsReserve =
      when (code) {
        "patient" -> Patient
        "provider" -> Provider
        "none" -> None
        else -> throw IllegalArgumentException("Unknown code $code for enum FundsReserve")
      }
  }
}
