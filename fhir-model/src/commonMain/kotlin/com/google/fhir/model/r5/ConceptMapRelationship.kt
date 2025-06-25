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

/** The relationship between concepts. */
public enum class ConceptMapRelationship(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** The concepts are related to each other, but the exact relationship is not known. */
  Related_To(
    "related-to",
    "http://hl7.org/fhir/concept-map-relationship",
    "Related To",
    "The concepts are related to each other, but the exact relationship is not known.",
  ),
  /** The definitions of the concepts mean the same thing. */
  Equivalent(
    "equivalent",
    "http://hl7.org/fhir/concept-map-relationship",
    "Equivalent",
    "The definitions of the concepts mean the same thing.",
  ),
  /** The source concept is narrower in meaning than the target concept. */
  Source_Is_Narrower_Than_Target(
    "source-is-narrower-than-target",
    "http://hl7.org/fhir/concept-map-relationship",
    "Source Is Narrower Than Target",
    "The source concept is narrower in meaning than the target concept.",
  ),
  /** The source concept is broader in meaning than the target concept. */
  Source_Is_Broader_Than_Target(
    "source-is-broader-than-target",
    "http://hl7.org/fhir/concept-map-relationship",
    "Source Is Broader Than Target",
    "The source concept is broader in meaning than the target concept.",
  ),
  /** This is an explicit assertion that the target concept is not related to the source concept. */
  Not_Related_To(
    "not-related-to",
    "http://hl7.org/fhir/concept-map-relationship",
    "Not Related To",
    "This is an explicit assertion that the target concept is not related to the source concept.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): ConceptMapRelationship =
      when (code) {
        "related-to" -> Related_To
        "equivalent" -> Equivalent
        "source-is-narrower-than-target" -> Source_Is_Narrower_Than_Target
        "source-is-broader-than-target" -> Source_Is_Broader_Than_Target
        "not-related-to" -> Not_Related_To
        else -> throw IllegalArgumentException("Unknown code $code for enum ConceptMapRelationship")
      }
  }
}
