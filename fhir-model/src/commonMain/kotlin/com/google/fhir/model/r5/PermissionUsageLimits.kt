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

/**
 * A sample of security labels from
 * [Healthcare Privacy and Security Classification System](security-labels.html#hcs) that are used
 * on events and requests/responses (aka user context or organization context) made up of
 * PurposeOfUse and maybe a refrain/obligation.
 */
public enum class PermissionUsageLimits(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Treat("TREAT", "http://terminology.hl7.org/CodeSystem/v3-ActReason", null, null),
  Hpaymt("HPAYMT", "http://terminology.hl7.org/CodeSystem/v3-ActReason", null, null),
  Etreat("ETREAT", "http://terminology.hl7.org/CodeSystem/v3-ActReason", null, null),
  Noauth("NOAUTH", "http://terminology.hl7.org/CodeSystem/v3-ActCode", null, null),
  Delau("DELAU", "http://terminology.hl7.org/CodeSystem/v3-ActCode", null, null),
  Nordsclcd("NORDSCLCD", "http://terminology.hl7.org/CodeSystem/v3-ActCode", null, null);

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): PermissionUsageLimits =
      when (code) {
        "TREAT" -> Treat
        "HPAYMT" -> Hpaymt
        "ETREAT" -> Etreat
        "NOAUTH" -> Noauth
        "DELAU" -> Delau
        "NORDSCLCD" -> Nordsclcd
        else -> throw IllegalArgumentException("Unknown code $code for enum PermissionUsageLimits")
      }
  }
}
