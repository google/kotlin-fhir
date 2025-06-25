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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.NarrativeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for Narrative Type: A human-readable summary of the resource conveying
 * the essential clinical and business information for the resource.
 */
@Serializable(with = NarrativeSerializer::class)
public data class Narrative(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and manageable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: List<Extension?>? = null,
  /**
   * The status of the narrative - whether it's entirely generated (from just the defined data or
   * the extensions too), or whether a human authored it and it may contain additional data.
   */
  public var status: Enumeration<NarrativeStatus>? = null,
  /**
   * The actual narrative content, a stripped down version of XHTML.
   *
   * The contents of the html element are an XHTML fragment containing only the basic html
   * formatting elements described in chapters 7-11 and 15 of the HTML 4.0 standard, <a> elements
   * (either name or href), images and internally contained stylesheets. The XHTML content SHALL NOT
   * contain a head, a body, external stylesheet references, scripts, forms, base/link/xlink,
   * frames, iframes and objects.
   */
  public var div: Xhtml? = null,
) : Element() {
  /** The status of a resource narrative. */
  public enum class NarrativeStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The contents of the narrative are entirely generated from the core elements in the content.
     */
    Generated(
      "generated",
      "http://hl7.org/fhir/narrative-status",
      "Generated",
      "The contents of the narrative are entirely generated from the core elements in the content.",
    ),
    /**
     * The contents of the narrative are entirely generated from the core elements in the content
     * and some of the content is generated from extensions. The narrative SHALL reflect the impact
     * of all modifier extensions.
     */
    Extensions(
      "extensions",
      "http://hl7.org/fhir/narrative-status",
      "Extensions",
      "The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions.",
    ),
    /**
     * The contents of the narrative may contain additional information not found in the structured
     * data. Note that there is no computable way to determine what the extra information is, other
     * than by human inspection.
     */
    Additional(
      "additional",
      "http://hl7.org/fhir/narrative-status",
      "Additional",
      "The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection.",
    ),
    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this
     * case".
     */
    Empty(
      "empty",
      "http://hl7.org/fhir/narrative-status",
      "Empty",
      "The contents of the narrative are some equivalent of \"No human-readable text provided in this case\".",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): NarrativeStatus =
        when (code) {
          "generated" -> Generated
          "extensions" -> Extensions
          "additional" -> Additional
          "empty" -> Empty
          else -> throw IllegalArgumentException("Unknown code $code for enum NarrativeStatus")
        }
    }
  }
}
