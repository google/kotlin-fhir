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

package com.google.fhir.model.r5

import com.google.fhir.model.r5.serializers.RelatedArtifactSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * RelatedArtifact Type: Related artifacts such as additional documentation, justification, or
 * bibliographic references.
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
   * element. To make the use of extensions safe and managable, there is a strict set of governance
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
   * The type of relationship to the related artifact.
   *
   * The presence of both sides of a relationship type (e.g. successor and predecessor) is required
   * to support use cases where one side of a relationship is not represented in FHIR. However, this
   * feature SHALL NOT be used to create bi-directional resource links in FHIR instances.
   * Specifically, following the methodology of "new points to old" and "many points to one", when
   * using related artifact elements to describe and reference FHIR resources, the type element
   * SHALL be drawn from the fhir-related-artifact-type ValueSet.
   */
  public var type: Enumeration<RelatedArtifactType>? = null,
  /** Provides additional classifiers of the related artifact. */
  public var classifier: List<CodeableConcept?>? = null,
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
   * The document being referenced, represented as an attachment. This is exclusive with the
   * resource element.
   */
  public var document: Attachment? = null,
  /**
   * The related artifact, such as a library, value set, profile, or other knowledge resource.
   *
   * If the type is predecessor, this is a reference to the succeeding knowledge resource. If the
   * type is successor, this is a reference to the prior knowledge resource.
   */
  public var resource: Canonical? = null,
  /**
   * The related artifact, if the artifact is not a canonical resource, or a resource reference to a
   * canonical resource.
   *
   * If both resource and resourceReference are present, they SHOULD be consistent and reference the
   * same resource. Although relatedArtifact is intended to support references to definitional
   * resources, there are cases where non-definitional resources can be definitional (such as
   * Location where the kind is mode). Related artifacts SHOULD be used to reference definitional
   * resources, and profiles SHOULD be used to make that explicit for particular use cases.
   */
  public var resourceReference: Reference? = null,
  /** The publication status of the artifact being referred to. */
  public var publicationStatus: Enumeration<RelatedArtifactPublicationStatus>? = null,
  /** The date of publication of the artifact being referred to. */
  public var publicationDate: Date? = null,
) : DataType() {
  /** The type of relationship to the related artifact. */
  public enum class RelatedArtifactType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Documentation(
      "documentation",
      "http://hl7.org/fhir/related-artifact-type",
      "Documentation",
      null,
    ),
    Justification(
      "justification",
      "http://hl7.org/fhir/related-artifact-type",
      "Justification",
      null,
    ),
    Citation("citation", "http://hl7.org/fhir/related-artifact-type", "Citation", null),
    Predecessor("predecessor", "http://hl7.org/fhir/related-artifact-type", "Predecessor", null),
    Successor("successor", "http://hl7.org/fhir/related-artifact-type", "Successor", null),
    Derived_From("derived-from", "http://hl7.org/fhir/related-artifact-type", "Derived From", null),
    Depends_On("depends-on", "http://hl7.org/fhir/related-artifact-type", "Depends On", null),
    Composed_Of("composed-of", "http://hl7.org/fhir/related-artifact-type", "Composed Of", null),
    Part_Of("part-of", "http://hl7.org/fhir/related-artifact-type", "Part Of", null),
    Amends("amends", "http://hl7.org/fhir/related-artifact-type", "Amends", null),
    Amended_With("amended-with", "http://hl7.org/fhir/related-artifact-type", "Amended With", null),
    Appends("appends", "http://hl7.org/fhir/related-artifact-type", "Appends", null),
    Appended_With(
      "appended-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Appended With",
      null,
    ),
    Cites("cites", "http://hl7.org/fhir/related-artifact-type", "Cites", null),
    Cited_By("cited-by", "http://hl7.org/fhir/related-artifact-type", "Cited By", null),
    Comments_On("comments-on", "http://hl7.org/fhir/related-artifact-type", "Is Comment On", null),
    Comment_In("comment-in", "http://hl7.org/fhir/related-artifact-type", "Has Comment In", null),
    Contains("contains", "http://hl7.org/fhir/related-artifact-type", "Contains", null),
    Contained_In("contained-in", "http://hl7.org/fhir/related-artifact-type", "Contained In", null),
    Corrects("corrects", "http://hl7.org/fhir/related-artifact-type", "Corrects", null),
    Correction_In(
      "correction-in",
      "http://hl7.org/fhir/related-artifact-type",
      "Correction In",
      null,
    ),
    Replaces("replaces", "http://hl7.org/fhir/related-artifact-type", "Replaces", null),
    Replaced_With(
      "replaced-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Replaced With",
      null,
    ),
    Retracts("retracts", "http://hl7.org/fhir/related-artifact-type", "Retracts", null),
    Retracted_By("retracted-by", "http://hl7.org/fhir/related-artifact-type", "Retracted By", null),
    Signs("signs", "http://hl7.org/fhir/related-artifact-type", "Signs", null),
    Similar_To("similar-to", "http://hl7.org/fhir/related-artifact-type", "Similar To", null),
    Supports("supports", "http://hl7.org/fhir/related-artifact-type", "Supports", null),
    Supported_With(
      "supported-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Supported With",
      null,
    ),
    Transforms("transforms", "http://hl7.org/fhir/related-artifact-type", "Transforms", null),
    Transformed_Into(
      "transformed-into",
      "http://hl7.org/fhir/related-artifact-type",
      "Transformed Into",
      null,
    ),
    Transformed_With(
      "transformed-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Transformed With",
      null,
    ),
    Documents("documents", "http://hl7.org/fhir/related-artifact-type", "Documents", null),
    Specification_Of(
      "specification-of",
      "http://hl7.org/fhir/related-artifact-type",
      "Specification Of",
      null,
    ),
    Created_With("created-with", "http://hl7.org/fhir/related-artifact-type", "Created With", null),
    Cite_As("cite-as", "http://hl7.org/fhir/related-artifact-type", "Cite As", null);

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
          "part-of" -> Part_Of
          "amends" -> Amends
          "amended-with" -> Amended_With
          "appends" -> Appends
          "appended-with" -> Appended_With
          "cites" -> Cites
          "cited-by" -> Cited_By
          "comments-on" -> Comments_On
          "comment-in" -> Comment_In
          "contains" -> Contains
          "contained-in" -> Contained_In
          "corrects" -> Corrects
          "correction-in" -> Correction_In
          "replaces" -> Replaces
          "replaced-with" -> Replaced_With
          "retracts" -> Retracts
          "retracted-by" -> Retracted_By
          "signs" -> Signs
          "similar-to" -> Similar_To
          "supports" -> Supports
          "supported-with" -> Supported_With
          "transforms" -> Transforms
          "transformed-into" -> Transformed_Into
          "transformed-with" -> Transformed_With
          "documents" -> Documents
          "specification-of" -> Specification_Of
          "created-with" -> Created_With
          "cite-as" -> Cite_As
          else -> throw IllegalArgumentException("Unknown code $code for enum RelatedArtifactType")
        }
    }
  }
}
