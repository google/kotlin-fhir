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
 * A coded type for an identifier that can be used to determine which identifier to use for a
 * specific purpose.
 */
public enum class IdentifierType(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Dl("DL", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Ppn("PPN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Brn("BRN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Mr("MR", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Mcn("MCN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  En("EN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Tax("TAX", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Niip("NIIP", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Prn("PRN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Md("MD", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Dr("DR", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Acsn("ACSN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Udi("UDI", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Sno("SNO", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Sb("SB", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Plac("PLAC", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Fill("FILL", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null),
  Jhn("JHN", "http://terminology.hl7.org/CodeSystem/v2-0203", null, null);

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): IdentifierType =
      when (code) {
        "DL" -> Dl
        "PPN" -> Ppn
        "BRN" -> Brn
        "MR" -> Mr
        "MCN" -> Mcn
        "EN" -> En
        "TAX" -> Tax
        "NIIP" -> Niip
        "PRN" -> Prn
        "MD" -> Md
        "DR" -> Dr
        "ACSN" -> Acsn
        "UDI" -> Udi
        "SNO" -> Sno
        "SB" -> Sb
        "PLAC" -> Plac
        "FILL" -> Fill
        "JHN" -> Jhn
        else -> throw IllegalArgumentException("Unknown code $code for enum IdentifierType")
      }
  }
}
