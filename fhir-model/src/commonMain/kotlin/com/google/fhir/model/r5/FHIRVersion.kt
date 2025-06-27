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
  /** DSTU 1 version. */
  _0_0("0.0", "http://hl7.org/fhir/FHIR-version", "0.0", "DSTU 1 version."),
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
  /** January 2015 Ballot. */
  _0_4("0.4", "http://hl7.org/fhir/FHIR-version", "0.4", "January 2015 Ballot."),
  /** Draft For Comment (January 2015 Ballot). */
  _0_4_0(
    "0.4.0",
    "http://hl7.org/fhir/FHIR-version",
    "0.4.0",
    "Draft For Comment (January 2015 Ballot).",
  ),
  /** May 2015 Ballot. */
  _0_5("0.5", "http://hl7.org/fhir/FHIR-version", "0.5", "May 2015 Ballot."),
  /** DSTU 2 Ballot version (May 2015 Ballot). */
  _0_5_0(
    "0.5.0",
    "http://hl7.org/fhir/FHIR-version",
    "0.5.0",
    "DSTU 2 Ballot version (May 2015 Ballot).",
  ),
  /** DSTU 2 version. */
  _1_0("1.0", "http://hl7.org/fhir/FHIR-version", "1.0", "DSTU 2 version."),
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
  /** GAO Ballot version. */
  _1_1("1.1", "http://hl7.org/fhir/FHIR-version", "1.1", "GAO Ballot version."),
  /** GAO Ballot + draft changes to main FHIR standard. */
  _1_1_0(
    "1.1.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.1.0",
    "GAO Ballot + draft changes to main FHIR standard.",
  ),
  /** Connectathon 12 (Montreal) version. */
  _1_4("1.4", "http://hl7.org/fhir/FHIR-version", "1.4", "Connectathon 12 (Montreal) version."),
  /** CQF on FHIR Ballot + Connectathon 12 (Montreal). */
  _1_4_0(
    "1.4.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.4.0",
    "CQF on FHIR Ballot + Connectathon 12 (Montreal).",
  ),
  /** Connectathon 13 (Baltimore) version. */
  _1_6("1.6", "http://hl7.org/fhir/FHIR-version", "1.6", "Connectathon 13 (Baltimore) version."),
  /** FHIR STU3 Ballot + Connectathon 13 (Baltimore). */
  _1_6_0(
    "1.6.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.6.0",
    "FHIR STU3 Ballot + Connectathon 13 (Baltimore).",
  ),
  /** Connectathon 14 (San Antonio) version. */
  _1_8("1.8", "http://hl7.org/fhir/FHIR-version", "1.8", "Connectathon 14 (San Antonio) version."),
  /** FHIR STU3 Candidate + Connectathon 14 (San Antonio). */
  _1_8_0(
    "1.8.0",
    "http://hl7.org/fhir/FHIR-version",
    "1.8.0",
    "FHIR STU3 Candidate + Connectathon 14 (San Antonio).",
  ),
  /** STU3 version. */
  _3_0("3.0", "http://hl7.org/fhir/FHIR-version", "3.0", "STU3 version."),
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
  /** R4 Ballot #1 version. */
  _3_3("3.3", "http://hl7.org/fhir/FHIR-version", "3.3", "R4 Ballot #1 version."),
  /** R4 Ballot #1 + Connectaton 18 (Cologne). */
  _3_3_0(
    "3.3.0",
    "http://hl7.org/fhir/FHIR-version",
    "3.3.0",
    "R4 Ballot #1 + Connectaton 18 (Cologne).",
  ),
  /** R4 Ballot #2 version. */
  _3_5("3.5", "http://hl7.org/fhir/FHIR-version", "3.5", "R4 Ballot #2 version."),
  /** R4 Ballot #2 + Connectathon 19 (Baltimore). */
  _3_5_0(
    "3.5.0",
    "http://hl7.org/fhir/FHIR-version",
    "3.5.0",
    "R4 Ballot #2 + Connectathon 19 (Baltimore).",
  ),
  /** R4 version. */
  _4_0("4.0", "http://hl7.org/fhir/FHIR-version", "4.0", "R4 version."),
  /** FHIR Release 4 (Normative + STU). */
  _4_0_0("4.0.0", "http://hl7.org/fhir/FHIR-version", "4.0.0", "FHIR Release 4 (Normative + STU)."),
  /** FHIR Release 4 (Normative + STU) with 1 technical errata. */
  _4_0_1(
    "4.0.1",
    "http://hl7.org/fhir/FHIR-version",
    "4.0.1",
    "FHIR Release 4 (Normative + STU) with 1 technical errata.",
  ),
  /** R4B Ballot #1 version. */
  _4_1("4.1", "http://hl7.org/fhir/FHIR-version", "4.1", "R4B Ballot #1 version."),
  /** R4B Ballot #1 + Connectathon 27 (Virtual). */
  _4_1_0(
    "4.1.0",
    "http://hl7.org/fhir/FHIR-version",
    "4.1.0",
    "R4B Ballot #1 + Connectathon 27 (Virtual).",
  ),
  /** R5 Preview #1 version. */
  _4_2("4.2", "http://hl7.org/fhir/FHIR-version", "4.2", "R5 Preview #1 version."),
  /** R5 Preview #1 + Connectathon 23 (Sydney). */
  _4_2_0(
    "4.2.0",
    "http://hl7.org/fhir/FHIR-version",
    "4.2.0",
    "R5 Preview #1 + Connectathon 23 (Sydney).",
  ),
  /** R4B version. */
  _4_3("4.3", "http://hl7.org/fhir/FHIR-version", "4.3", "R4B version."),
  /** FHIR Release 4B (Normative + STU). */
  _4_3_0(
    "4.3.0",
    "http://hl7.org/fhir/FHIR-version",
    "4.3.0",
    "FHIR Release 4B (Normative + STU).",
  ),
  /** FHIR Release 4B CI-Builld. */
  _4_3_0_Cibuild(
    "4.3.0-cibuild",
    "http://hl7.org/fhir/FHIR-version",
    "4.3.0-cibuild",
    "FHIR Release 4B CI-Builld.",
  ),
  /** FHIR Release 4B Snapshot #1. */
  _4_3_0_Snapshot1(
    "4.3.0-snapshot1",
    "http://hl7.org/fhir/FHIR-version",
    "4.3.0-snapshot1",
    "FHIR Release 4B Snapshot #1.",
  ),
  /** R5 Preview #2 version. */
  _4_4("4.4", "http://hl7.org/fhir/FHIR-version", "4.4", "R5 Preview #2 version."),
  /** R5 Preview #2 + Connectathon 24 (Virtual). */
  _4_4_0(
    "4.4.0",
    "http://hl7.org/fhir/FHIR-version",
    "4.4.0",
    "R5 Preview #2 + Connectathon 24 (Virtual).",
  ),
  /** R5 Preview #3 version. */
  _4_5("4.5", "http://hl7.org/fhir/FHIR-version", "4.5", "R5 Preview #3 version."),
  /** R5 Preview #3 + Connectathon 25 (Virtual). */
  _4_5_0(
    "4.5.0",
    "http://hl7.org/fhir/FHIR-version",
    "4.5.0",
    "R5 Preview #3 + Connectathon 25 (Virtual).",
  ),
  /** R5 Draft Ballot version. */
  _4_6("4.6", "http://hl7.org/fhir/FHIR-version", "4.6", "R5 Draft Ballot version."),
  /** R5 Draft Ballot + Connectathon 27 (Virtual). */
  _4_6_0(
    "4.6.0",
    "http://hl7.org/fhir/FHIR-version",
    "4.6.0",
    "R5 Draft Ballot + Connectathon 27 (Virtual).",
  ),
  /** R5 Versions. */
  _5_0("5.0", "http://hl7.org/fhir/FHIR-version", "5.0", "R5 Versions."),
  /** R5 Final Version. */
  _5_0_0("5.0.0", "http://hl7.org/fhir/FHIR-version", "5.0.0", "R5 Final Version."),
  /** R5 Rolling ci-build. */
  _5_0_0_Cibuild(
    "5.0.0-cibuild",
    "http://hl7.org/fhir/FHIR-version",
    "5.0.0-cibuild",
    "R5 Rolling ci-build.",
  ),
  /** R5 Preview #2. */
  _5_0_0_Snapshot1(
    "5.0.0-snapshot1",
    "http://hl7.org/fhir/FHIR-version",
    "5.0.0-snapshot1",
    "R5 Preview #2.",
  ),
  /** R5 Interim tooling stage. */
  _5_0_0_Snapshot2(
    "5.0.0-snapshot2",
    "http://hl7.org/fhir/FHIR-version",
    "5.0.0-snapshot2",
    "R5 Interim tooling stage.",
  ),
  /** R5 Ballot. */
  _5_0_0_Ballot("5.0.0-ballot", "http://hl7.org/fhir/FHIR-version", "5.0.0-ballot", "R5 Ballot."),
  /** R5 January 2023 Staging Release + Connectathon 32. */
  _5_0_0_Snapshot3(
    "5.0.0-snapshot3",
    "http://hl7.org/fhir/FHIR-version",
    "5.0.0-snapshot3",
    "R5 January 2023 Staging Release + Connectathon 32.",
  ),
  /** R5 Final QA. */
  _5_0_0_Draft_Final(
    "5.0.0-draft-final",
    "http://hl7.org/fhir/FHIR-version",
    "5.0.0-draft-final",
    "R5 Final QA.",
  );

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
        "0.0" -> _0_0
        "0.0.80" -> _0_0_80
        "0.0.81" -> _0_0_81
        "0.0.82" -> _0_0_82
        "0.4" -> _0_4
        "0.4.0" -> _0_4_0
        "0.5" -> _0_5
        "0.5.0" -> _0_5_0
        "1.0" -> _1_0
        "1.0.0" -> _1_0_0
        "1.0.1" -> _1_0_1
        "1.0.2" -> _1_0_2
        "1.1" -> _1_1
        "1.1.0" -> _1_1_0
        "1.4" -> _1_4
        "1.4.0" -> _1_4_0
        "1.6" -> _1_6
        "1.6.0" -> _1_6_0
        "1.8" -> _1_8
        "1.8.0" -> _1_8_0
        "3.0" -> _3_0
        "3.0.0" -> _3_0_0
        "3.0.1" -> _3_0_1
        "3.0.2" -> _3_0_2
        "3.3" -> _3_3
        "3.3.0" -> _3_3_0
        "3.5" -> _3_5
        "3.5.0" -> _3_5_0
        "4.0" -> _4_0
        "4.0.0" -> _4_0_0
        "4.0.1" -> _4_0_1
        "4.1" -> _4_1
        "4.1.0" -> _4_1_0
        "4.2" -> _4_2
        "4.2.0" -> _4_2_0
        "4.3" -> _4_3
        "4.3.0" -> _4_3_0
        "4.3.0-cibuild" -> _4_3_0_Cibuild
        "4.3.0-snapshot1" -> _4_3_0_Snapshot1
        "4.4" -> _4_4
        "4.4.0" -> _4_4_0
        "4.5" -> _4_5
        "4.5.0" -> _4_5_0
        "4.6" -> _4_6
        "4.6.0" -> _4_6_0
        "5.0" -> _5_0
        "5.0.0" -> _5_0_0
        "5.0.0-cibuild" -> _5_0_0_Cibuild
        "5.0.0-snapshot1" -> _5_0_0_Snapshot1
        "5.0.0-snapshot2" -> _5_0_0_Snapshot2
        "5.0.0-ballot" -> _5_0_0_Ballot
        "5.0.0-snapshot3" -> _5_0_0_Snapshot3
        "5.0.0-draft-final" -> _5_0_0_Draft_Final
        else -> throw IllegalArgumentException("Unknown code $code for enum FHIRVersion")
      }
  }
}
