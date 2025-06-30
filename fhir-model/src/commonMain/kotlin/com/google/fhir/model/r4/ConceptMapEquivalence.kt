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

/** The degree of equivalence between concepts. */
public enum class ConceptMapEquivalence(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Relatedto("relatedto", "http://hl7.org/fhir/concept-map-equivalence", "Related To", null),
  Equivalent("equivalent", "http://hl7.org/fhir/concept-map-equivalence", "Equivalent", null),
  Equal("equal", "http://hl7.org/fhir/concept-map-equivalence", "Equal", null),
  Wider("wider", "http://hl7.org/fhir/concept-map-equivalence", "Wider", null),
  Subsumes("subsumes", "http://hl7.org/fhir/concept-map-equivalence", "Subsumes", null),
  Narrower("narrower", "http://hl7.org/fhir/concept-map-equivalence", "Narrower", null),
  Specializes("specializes", "http://hl7.org/fhir/concept-map-equivalence", "Specializes", null),
  Inexact("inexact", "http://hl7.org/fhir/concept-map-equivalence", "Inexact", null),
  Unmatched("unmatched", "http://hl7.org/fhir/concept-map-equivalence", "Unmatched", null),
  Disjoint("disjoint", "http://hl7.org/fhir/concept-map-equivalence", "Disjoint", null);

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
