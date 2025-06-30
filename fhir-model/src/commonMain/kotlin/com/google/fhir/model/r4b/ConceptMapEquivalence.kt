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

/** The degree of equivalence between concepts. */
public enum class ConceptMapEquivalence(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /**
   * The concepts are related to each other, and have at least some overlap in meaning, but the
   * exact relationship is not known.
   */
  Relatedto(
    "relatedto",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Related To",
    "The concepts are related to each other, and have at least some overlap in meaning, but the exact relationship is not known.",
  ),
  /**
   * The definitions of the concepts mean the same thing (including when structural implications of
   * meaning are considered) (i.e. extensionally identical).
   */
  Equivalent(
    "equivalent",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Equivalent",
    "The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).",
  ),
  /**
   * The definitions of the concepts are exactly the same (i.e. only grammatical differences) and
   * structural implications of meaning are identical or irrelevant (i.e. intentionally identical).
   */
  Equal(
    "equal",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Equal",
    "The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identical or irrelevant (i.e. intentionally identical).",
  ),
  /** The target mapping is wider in meaning than the source concept. */
  Wider(
    "wider",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Wider",
    "The target mapping is wider in meaning than the source concept.",
  ),
  /**
   * The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).
   */
  Subsumes(
    "subsumes",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Subsumes",
    "The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).",
  ),
  /**
   * The target mapping is narrower in meaning than the source concept. The sense in which the
   * mapping is narrower SHALL be described in the comments in this case, and applications should be
   * careful when attempting to use these mappings operationally.
   */
  Narrower(
    "narrower",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Narrower",
    "The target mapping is narrower in meaning than the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.",
  ),
  /**
   * The target mapping specializes the meaning of the source concept (e.g. the target is-a source).
   */
  Specializes(
    "specializes",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Specializes",
    "The target mapping specializes the meaning of the source concept (e.g. the target is-a source).",
  ),
  /**
   * The target mapping overlaps with the source concept, but both source and target cover
   * additional meaning, or the definitions are imprecise and it is uncertain whether they have the
   * same boundaries to their meaning. The sense in which the mapping is inexact SHALL be described
   * in the comments in this case, and applications should be careful when attempting to use these
   * mappings operationally.
   */
  Inexact(
    "inexact",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Inexact",
    "The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is inexact SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.",
  ),
  /** There is no match for this concept in the target code system. */
  Unmatched(
    "unmatched",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Unmatched",
    "There is no match for this concept in the target code system.",
  ),
  /**
   * This is an explicit assertion that there is no mapping between the source and target concept.
   */
  Disjoint(
    "disjoint",
    "http://hl7.org/fhir/concept-map-equivalence",
    "Disjoint",
    "This is an explicit assertion that there is no mapping between the source and target concept.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): ConceptMapEquivalence =
      when (code) {
        "relatedto" -> Relatedto
        "equivalent" -> Equivalent
        "equal" -> Equal
        "wider" -> Wider
        "subsumes" -> Subsumes
        "narrower" -> Narrower
        "specializes" -> Specializes
        "inexact" -> Inexact
        "unmatched" -> Unmatched
        "disjoint" -> Disjoint
        else -> throw IllegalArgumentException("Unknown code $code for enum ConceptMapEquivalence")
      }
  }
}
