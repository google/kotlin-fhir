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

package com.google.fhir.model.r4

import kotlin.String

/**
 * This value set defines the set of codes that can be used to indicate the marital status of a
 * person.
 */
public enum class MaritalStatus(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** Marriage contract has been declared null and to not have existed */
  A(
    "A",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Annulled",
    "Marriage contract has been declared null and to not have existed",
  ),
  /** Marriage contract has been declared dissolved and inactive */
  D(
    "D",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Divorced",
    "Marriage contract has been declared dissolved and inactive",
  ),
  /** Subject to an Interlocutory Decree. */
  I(
    "I",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Interlocutory",
    "Subject to an Interlocutory Decree.",
  ),
  /** Legally Separated */
  L(
    "L",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Legally Separated",
    "Legally Separated",
  ),
  /** A current marriage contract is active */
  M(
    "M",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Married",
    "A current marriage contract is active",
  ),
  /** More than 1 current spouse */
  P(
    "P",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Polygamous",
    "More than 1 current spouse",
  ),
  /** No marriage contract has ever been entered */
  S(
    "S",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Never Married",
    "No marriage contract has ever been entered",
  ),
  /** Person declares that a domestic partner relationship exists. */
  T(
    "T",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Domestic partner",
    "Person declares that a domestic partner relationship exists.",
  ),
  /** Currently not in a marriage contract. */
  U(
    "U",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "unmarried",
    "Currently not in a marriage contract.",
  ),
  /** The spouse has died */
  W(
    "W",
    "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
    "Widowed",
    "The spouse has died",
  ),
  /**
   * Description:A proper value is applicable, but not known.
   *
   *                            Usage Notes: This means the actual value is not known.  If the only thing that is unknown is how to properly express the value in the necessary constraints (value set, datatype, etc.), then the OTH or UNC flavor should be used.  No properties should be included for a datatype with this property unless:
   *                            Those properties themselves directly translate to a semantic of "unknown".  (E.g. a local code sent as a translation that conveys 'unknown')
   *                            Those properties further qualify the nature of what is unknown.  (E.g. specifying a use code of "H" and a URL prefix of "tel:" to convey that it is the home phone number that is unknown.)
   */
  Unk(
    "UNK",
    "http://terminology.hl7.org/CodeSystem/v3-NullFlavor",
    "unknown",
    """
  |Description:A proper value is applicable, but not known.
  |
  |                        
  |                           Usage Notes: This means the actual value is not known.  If the only thing that is unknown is how to properly express the value in the necessary constraints (value set, datatype, etc.), then the OTH or UNC flavor should be used.  No properties should be included for a datatype with this property unless:
  |
  |                        
  |                           Those properties themselves directly translate to a semantic of "unknown".  (E.g. a local code sent as a translation that conveys 'unknown')
  |                           Those properties further qualify the nature of what is unknown.  (E.g. specifying a use code of "H" and a URL prefix of "tel:" to convey that it is the home phone number that is unknown.)
  """
      .trimMargin(),
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): MaritalStatus =
      when (code) {
        "A" -> A
        "D" -> D
        "I" -> I
        "L" -> L
        "M" -> M
        "P" -> P
        "S" -> S
        "T" -> T
        "U" -> U
        "W" -> W
        "UNK" -> Unk
        else -> throw IllegalArgumentException("Unknown code $code for enum MaritalStatus")
      }
  }
}
