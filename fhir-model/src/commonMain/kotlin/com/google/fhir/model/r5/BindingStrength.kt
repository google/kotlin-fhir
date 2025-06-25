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

/** Indication of the degree of conformance expectations associated with a binding. */
public enum class BindingStrength(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** To be conformant, the concept in this element SHALL be from the specified value set. */
  Required(
    "required",
    "http://hl7.org/fhir/binding-strength",
    "Required",
    "To be conformant, the concept in this element SHALL be from the specified value set.",
  ),
  /**
   * To be conformant, the concept in this element SHALL be from the specified value set if any of
   * the codes within the value set can apply to the concept being communicated. If the value set
   * does not cover the concept (based on human review), alternate codings (or, data type allowing,
   * text) may be included instead.
   */
  Extensible(
    "extensible",
    "http://hl7.org/fhir/binding-strength",
    "Extensible",
    "To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.",
  ),
  /**
   * Instances are encouraged to draw from the specified codes for interoperability purposes but are
   * not required to do so to be considered conformant.
   */
  Preferred(
    "preferred",
    "http://hl7.org/fhir/binding-strength",
    "Preferred",
    "Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.",
  ),
  /**
   * Instances are not expected or even encouraged to draw from the specified value set. The value
   * set merely provides examples of the types of concepts intended to be included.
   */
  Example(
    "example",
    "http://hl7.org/fhir/binding-strength",
    "Example",
    "Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): BindingStrength =
      when (code) {
        "required" -> Required
        "extensible" -> Extensible
        "preferred" -> Preferred
        "example" -> Example
        else -> throw IllegalArgumentException("Unknown code $code for enum BindingStrength")
      }
  }
}
