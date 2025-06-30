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

import com.google.fhir.model.r4b.serializers.RelatedArtifactSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for RelatedArtifact Type: Related artifacts such as additional
 * documentation, justification, or bibliographic references.
 */
@Serializable(with = RelatedArtifactSerializer::class)
public data class RelatedArtifact(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
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
  /** The type of relationship to the related artifact. */
  public var type: Enumeration<RelatedArtifactType>? = null,
  /**
   * A short label that can be used to reference the citation from elsewhere in the containing
   * artifact, such as a footnote index.
   */
  public var label: String? = null,
  /**
   * A brief description of the document or knowledge resource being referenced, suitable for
   * display to a consumer.
   */
  public var display: String? = null,
  /**
   * A bibliographic citation for the related artifact. This text SHOULD be formatted according to
   * an accepted citation format.
   *
   * Additional structured information about citations should be captured as extensions.
   */
  public var citation: Markdown? = null,
  /**
   * A url for the artifact that can be followed to access the actual content.
   *
   * If a document or resource element is present, this element SHALL NOT be provided (use the url
   * or reference in the Attachment or resource reference).
   */
  public var url: Url? = null,
  /**
   * The document being referenced, represented as an attachment. This is exclusive with the
   * resource element.
   */
  public var document: Attachment? = null,
  /**
   * The related resource, such as a library, value set, profile, or other knowledge resource.
   *
   * If the type is predecessor, this is a reference to the succeeding knowledge resource. If the
   * type is successor, this is a reference to the prior knowledge resource.
   */
  public var resource: Canonical? = null,
) : Element() {
  /** The type of relationship to the related artifact. */
  public enum class RelatedArtifactType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Additional documentation for the knowledge resource. This would include additional
     * instructions on usage as well as additional information on clinical context or
     * appropriateness.
     */
    Documentation(
      "documentation",
      "http://hl7.org/fhir/related-artifact-type",
      "Documentation",
      "Additional documentation for the knowledge resource. This would include additional instructions on usage as well as additional information on clinical context or appropriateness.",
    ),
    /**
     * A summary of the justification for the knowledge resource including supporting evidence,
     * relevant guidelines, or other clinically important information. This information is intended
     * to provide a way to make the justification for the knowledge resource available to the
     * consumer of interventions or results produced by the knowledge resource.
     */
    Justification(
      "justification",
      "http://hl7.org/fhir/related-artifact-type",
      "Justification",
      "A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource.",
    ),
    /**
     * Bibliographic citation for papers, references, or other relevant material for the knowledge
     * resource. This is intended to allow for citation of related material, but that was not
     * necessarily specifically prepared in connection with this knowledge resource.
     */
    Citation(
      "citation",
      "http://hl7.org/fhir/related-artifact-type",
      "Citation",
      "Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource.",
    ),
    /** The previous version of the knowledge resource. */
    Predecessor(
      "predecessor",
      "http://hl7.org/fhir/related-artifact-type",
      "Predecessor",
      "The previous version of the knowledge resource.",
    ),
    /** The next version of the knowledge resource. */
    Successor(
      "successor",
      "http://hl7.org/fhir/related-artifact-type",
      "Successor",
      "The next version of the knowledge resource.",
    ),
    /**
     * The knowledge resource is derived from the related artifact. This is intended to capture the
     * relationship in which a particular knowledge resource is based on the content of another
     * artifact, but is modified to capture either a different set of overall requirements, or a
     * more specific set of requirements such as those involved in a particular institution or
     * clinical setting.
     */
    Derived_From(
      "derived-from",
      "http://hl7.org/fhir/related-artifact-type",
      "Derived From",
      "The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting.",
    ),
    /** The knowledge resource depends on the given related artifact. */
    Depends_On(
      "depends-on",
      "http://hl7.org/fhir/related-artifact-type",
      "Depends On",
      "The knowledge resource depends on the given related artifact.",
    ),
    /** The knowledge resource is composed of the given related artifact. */
    Composed_Of(
      "composed-of",
      "http://hl7.org/fhir/related-artifact-type",
      "Composed Of",
      "The knowledge resource is composed of the given related artifact.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): RelatedArtifactType =
        when (code) {
          "documentation" -> Documentation
          "justification" -> Justification
          "citation" -> Citation
          "predecessor" -> Predecessor
          "successor" -> Successor
          "derived-from" -> Derived_From
          "depends-on" -> Depends_On
          "composed-of" -> Composed_Of
          else -> throw IllegalArgumentException("Unknown code $code for enum RelatedArtifactType")
        }
    }
  }
}
