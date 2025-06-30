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

/** All published FHIR Versions. */
public enum class FHIRVersion(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** Oldest archived version of FHIR. */
  _0_01("0.01", "http://hl7.org/fhir/FHIR-version", "0.01", "Oldest archived version of FHIR."),
  /** 1st Draft for Comment (Sept 2012 Ballot). */
  _0_05(
    "0.05",
    "http://hl7.org/fhir/FHIR-version",
    "0.05",
    "1st Draft for Comment (Sept 2012 Ballot).",
  ),
  /** 2nd Draft for Comment (January 2013 Ballot). */
  _0_06(
    "0.06",
    "http://hl7.org/fhir/FHIR-version",
    "0.06",
    "2nd Draft for Comment (January 2013 Ballot).",
  ),
  /** DSTU 1 Ballot version. */
  _0_11("0.11", "http://hl7.org/fhir/FHIR-version", "0.11", "DSTU 1 Ballot version."),
  /** DSTU 1 Official version. */
  _0_0_80("0.0.80", "http://hl7.org/fhir/FHIR-version", "0.0.80", "DSTU 1 Official version."),
  /** DSTU 1 Official version Technical Errata #1. */
  _0_0_81(
    "0.0.81",
    "http://hl7.org/fhir/FHIR-version",
    "0.0.81",
    "DSTU 1 Official version Technical Errata #1.",
  ),
  /** DSTU 1 Official version Technical Errata #2. */
  _0_0_82(
    "0.0.82",
    "http://hl7.org/fhir/FHIR-version",
    "0.0.82",
    "DSTU 1 Official version Technical Errata #2.",
  ),
  /** Draft For Comment (January 2015 Ballot). */
  _0_4_0(
    "0.4.0",
    "http://hl7.org/fhir/FHIR-version",
    "0.4.0",
    "Draft For Comment (January 2015 Ballot).",
  ),
  /** DSTU 2 Ballot version (May 2015 Ballot). */
  _0_5_0(
    "0.5.0",
    "http://hl7.org/fhir/FHIR-version",
    "0.5.0",
    "DSTU 2 Ballot version (May 2015 Ballot).",
  ),
  /** DSTU 2 QA Preview + CQIF Ballot (Sep 2015). */
  _1_0_0(
    "1.0.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.0.0",
    "DSTU 2 QA Preview + CQIF Ballot (Sep 2015).",
  ),
  /** DSTU 2 (Official version). */
  _1_0_1("1.0.1", "http://hl7.org/fhir/FHIR-version", "1.0.1", "DSTU 2 (Official version)."),
  /** DSTU 2 (Official version) with 1 technical errata. */
  _1_0_2(
    "1.0.2",
    "http://hl7.org/fhir/FHIR-version",
    "1.0.2",
    "DSTU 2 (Official version) with 1 technical errata.",
  ),
  /** GAO Ballot + draft changes to main FHIR standard. */
  _1_1_0(
    "1.1.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.1.0",
    "GAO Ballot + draft changes to main FHIR standard.",
  ),
  /** CQF on FHIR Ballot + Connectathon 12 (Montreal). */
  _1_4_0(
    "1.4.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.4.0",
    "CQF on FHIR Ballot + Connectathon 12 (Montreal).",
  ),
  /** FHIR STU3 Ballot + Connectathon 13 (Baltimore). */
  _1_6_0(
    "1.6.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.6.0",
    "FHIR STU3 Ballot + Connectathon 13 (Baltimore).",
  ),
  /** FHIR STU3 Candidate + Connectathon 14 (San Antonio). */
  _1_8_0(
    "1.8.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.8.0",
    "FHIR STU3 Candidate + Connectathon 14 (San Antonio).",
  ),
  /** FHIR Release 3 (STU). */
  _3_0_0("3.0.0", "http://hl7.org/fhir/FHIR-version", "3.0.0", "FHIR Release 3 (STU)."),
  /** FHIR Release 3 (STU) with 1 technical errata. */
  _3_0_1(
    "3.0.1",
    "http://hl7.org/fhir/FHIR-version",
    "3.0.1",
    "FHIR Release 3 (STU) with 1 technical errata.",
  ),
  /** FHIR Release 3 (STU) with 2 technical errata. */
  _3_0_2(
    "3.0.2",
    "http://hl7.org/fhir/FHIR-version",
    "3.0.2",
    "FHIR Release 3 (STU) with 2 technical errata.",
  ),
  /** R4 Ballot #1. */
  _3_3_0("3.3.0", "http://hl7.org/fhir/FHIR-version", "3.3.0", "R4 Ballot #1."),
  /** R4 Ballot #2. */
  _3_5_0("3.5.0", "http://hl7.org/fhir/FHIR-version", "3.5.0", "R4 Ballot #2."),
  /** FHIR Release 4 (Normative + STU). */
  _4_0_0("4.0.0", "http://hl7.org/fhir/FHIR-version", "4.0.0", "FHIR Release 4 (Normative + STU)."),
  /** FHIR Release 4 Technical Correction. */
  _4_0_1(
    "4.0.1",
    "http://hl7.org/fhir/FHIR-version",
    "4.0.1",
    "FHIR Release 4 Technical Correction.",
  ),
  /** FHIR Release 4B Ballot #1. */
  _4_1_0("4.1.0", "http://hl7.org/fhir/FHIR-version", "4.1.0", "FHIR Release 4B Ballot #1."),
  /** FHIR Release 4B CI-Build. */
  _4_3_0_Cibuild(
    "4.3.0-cibuild",
    "http://hl7.org/fhir/FHIR-version",
    "4.3.0-cibuild",
    "FHIR Release 4B CI-Build.",
  ),
  /** FHIR Release 4B Snapshot #1. */
  _4_3_0_Snapshot1(
    "4.3.0-snapshot1",
    "http://hl7.org/fhir/FHIR-version",
    "4.3.0-snapshot1",
    "FHIR Release 4B Snapshot #1.",
  ),
  /** FHIR Release 4B. */
  _4_3_0("4.3.0", "http://hl7.org/fhir/FHIR-version", "4.3.0", "FHIR Release 4B.");

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): FHIRVersion =
      when (code) {
        "0.01" -> _0_01
        "0.05" -> _0_05
        "0.06" -> _0_06
        "0.11" -> _0_11
        "0.0.80" -> _0_0_80
        "0.0.81" -> _0_0_81
        "0.0.82" -> _0_0_82
        "0.4.0" -> _0_4_0
        "0.5.0" -> _0_5_0
        "1.0.0" -> _1_0_0
        "1.0.1" -> _1_0_1
        "1.0.2" -> _1_0_2
        "1.1.0" -> _1_1_0
        "1.4.0" -> _1_4_0
        "1.6.0" -> _1_6_0
        "1.8.0" -> _1_8_0
        "3.0.0" -> _3_0_0
        "3.0.1" -> _3_0_1
        "3.0.2" -> _3_0_2
        "3.3.0" -> _3_3_0
        "3.5.0" -> _3_5_0
        "4.0.0" -> _4_0_0
        "4.0.1" -> _4_0_1
        "4.1.0" -> _4_1_0
        "4.3.0-cibuild" -> _4_3_0_Cibuild
        "4.3.0-snapshot1" -> _4_3_0_Snapshot1
        "4.3.0" -> _4_3_0
        else -> throw IllegalArgumentException("Unknown code $code for enum FHIRVersion")
      }
  }
}
