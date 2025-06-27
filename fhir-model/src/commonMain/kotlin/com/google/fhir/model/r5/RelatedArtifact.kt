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
     * The target artifact is a summary of the justification for the knowledge resource including
     * supporting evidence, relevant guidelines, or other clinically important information. This
     * information is intended to provide a way to make the justification for the knowledge resource
     * available to the consumer of interventions or results produced by the knowledge resource.
     */
    Justification(
      "justification",
      "http://hl7.org/fhir/related-artifact-type",
      "Justification",
      "The target artifact is a summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource.",
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
    /**
     * The previous version of the knowledge artifact, used to establish an ordering of versions of
     * an artifact, independent of the status of each version.
     */
    Predecessor(
      "predecessor",
      "http://hl7.org/fhir/related-artifact-type",
      "Predecessor",
      "The previous version of the knowledge artifact, used to establish an ordering of versions of an artifact, independent of the status of each version.",
    ),
    /**
     * The subsequent version of the knowledge artfact, used to establish an ordering of versions of
     * an artifact, independent of the status of each version.
     */
    Successor(
      "successor",
      "http://hl7.org/fhir/related-artifact-type",
      "Successor",
      "The subsequent version of the knowledge artfact, used to establish an ordering of versions of an artifact, independent of the status of each version.",
    ),
    /**
     * This artifact is derived from the target artifact. This is intended to capture the
     * relationship in which a particular knowledge resource is based on the content of another
     * artifact, but is modified to capture either a different set of overall requirements, or a
     * more specific set of requirements such as those involved in a particular institution or
     * clinical setting. The artifact may be derived from one or more target artifacts.
     */
    Derived_From(
      "derived-from",
      "http://hl7.org/fhir/related-artifact-type",
      "Derived From",
      "This artifact is derived from the target artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting. The artifact may be derived from one or more target artifacts.",
    ),
    /**
     * This artifact depends on the target artifact. There is a requirement to use the target
     * artifact in the creation or interpretation of this artifact.
     */
    Depends_On(
      "depends-on",
      "http://hl7.org/fhir/related-artifact-type",
      "Depends On",
      "This artifact depends on the target artifact. There is a requirement to use the target artifact in the creation or interpretation of this artifact.",
    ),
    /**
     * This artifact is composed of the target artifact. This artifact is constructed with the
     * target artifact as a component. The target artifact is a part of this artifact. (A dataset is
     * composed of data.).
     */
    Composed_Of(
      "composed-of",
      "http://hl7.org/fhir/related-artifact-type",
      "Composed Of",
      "This artifact is composed of the target artifact. This artifact is constructed with the target artifact as a component. The target artifact is a part of this artifact. (A dataset is composed of data.).",
    ),
    /**
     * This artifact is a part of the target artifact. The target artifact is composed of this
     * artifact (and possibly other artifacts).
     */
    Part_Of(
      "part-of",
      "http://hl7.org/fhir/related-artifact-type",
      "Part Of",
      "This artifact is a part of the target artifact. The target artifact is composed of this artifact (and possibly other artifacts).",
    ),
    /**
     * This artifact amends or changes the target artifact. This artifact adds additional
     * information that is functionally expected to replace information in the target artifact. This
     * artifact replaces a part but not all of the target artifact.
     */
    Amends(
      "amends",
      "http://hl7.org/fhir/related-artifact-type",
      "Amends",
      "This artifact amends or changes the target artifact. This artifact adds additional information that is functionally expected to replace information in the target artifact. This artifact replaces a part but not all of the target artifact.",
    ),
    /**
     * This artifact is amended with or changed by the target artifact. There is information in this
     * artifact that should be functionally replaced with information in the target artifact.
     */
    Amended_With(
      "amended-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Amended With",
      "This artifact is amended with or changed by the target artifact. There is information in this artifact that should be functionally replaced with information in the target artifact.",
    ),
    /**
     * This artifact adds additional information to the target artifact. The additional information
     * does not replace or change information in the target artifact.
     */
    Appends(
      "appends",
      "http://hl7.org/fhir/related-artifact-type",
      "Appends",
      "This artifact adds additional information to the target artifact. The additional information does not replace or change information in the target artifact.",
    ),
    /** This artifact has additional information in the target artifact. */
    Appended_With(
      "appended-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Appended With",
      "This artifact has additional information in the target artifact.",
    ),
    /**
     * This artifact cites the target artifact. This may be a bibliographic citation for papers,
     * references, or other relevant material for the knowledge resource. This is intended to allow
     * for citation of related material, but that was not necessarily specifically prepared in
     * connection with this knowledge resource.
     */
    Cites(
      "cites",
      "http://hl7.org/fhir/related-artifact-type",
      "Cites",
      "This artifact cites the target artifact. This may be a bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource.",
    ),
    /** This artifact is cited by the target artifact. */
    Cited_By(
      "cited-by",
      "http://hl7.org/fhir/related-artifact-type",
      "Cited By",
      "This artifact is cited by the target artifact.",
    ),
    /** This artifact contains comments about the target artifact. */
    Comments_On(
      "comments-on",
      "http://hl7.org/fhir/related-artifact-type",
      "Is Comment On",
      "This artifact contains comments about the target artifact.",
    ),
    /**
     * This artifact has comments about it in the target artifact. The type of comments may be
     * expressed in the targetClassifier element such as reply, review, editorial, feedback,
     * solicited, unsolicited, structured, unstructured.
     */
    Comment_In(
      "comment-in",
      "http://hl7.org/fhir/related-artifact-type",
      "Has Comment In",
      "This artifact has comments about it in the target artifact.  The type of comments may be expressed in the targetClassifier element such as reply, review, editorial, feedback, solicited, unsolicited, structured, unstructured.",
    ),
    /**
     * This artifact is a container in which the target artifact is contained. A container is a data
     * structure whose instances are collections of other objects. (A database contains the
     * dataset.).
     */
    Contains(
      "contains",
      "http://hl7.org/fhir/related-artifact-type",
      "Contains",
      "This artifact is a container in which the target artifact is contained. A container is a data structure whose instances are collections of other objects. (A database contains the dataset.).",
    ),
    /**
     * This artifact is contained in the target artifact. The target artifact is a data structure
     * whose instances are collections of other objects.
     */
    Contained_In(
      "contained-in",
      "http://hl7.org/fhir/related-artifact-type",
      "Contained In",
      "This artifact is contained in the target artifact. The target artifact is a data structure whose instances are collections of other objects.",
    ),
    /** This artifact identifies errors and replacement content for the target artifact. */
    Corrects(
      "corrects",
      "http://hl7.org/fhir/related-artifact-type",
      "Corrects",
      "This artifact identifies errors and replacement content for the target artifact.",
    ),
    /**
     * This artifact has corrections to it in the target artifact. The target artifact identifies
     * errors and replacement content for this artifact.
     */
    Correction_In(
      "correction-in",
      "http://hl7.org/fhir/related-artifact-type",
      "Correction In",
      "This artifact has corrections to it in the target artifact. The target artifact identifies errors and replacement content for this artifact.",
    ),
    /**
     * This artifact replaces or supersedes the target artifact. The target artifact may be
     * considered deprecated.
     */
    Replaces(
      "replaces",
      "http://hl7.org/fhir/related-artifact-type",
      "Replaces",
      "This artifact replaces or supersedes the target artifact. The target artifact may be considered deprecated.",
    ),
    /**
     * This artifact is replaced with or superseded by the target artifact. This artifact may be
     * considered deprecated.
     */
    Replaced_With(
      "replaced-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Replaced With",
      "This artifact is replaced with or superseded by the target artifact. This artifact may be considered deprecated.",
    ),
    /**
     * This artifact retracts the target artifact. The content that was published in the target
     * artifact should be considered removed from publication and should no longer be considered
     * part of the public record.
     */
    Retracts(
      "retracts",
      "http://hl7.org/fhir/related-artifact-type",
      "Retracts",
      "This artifact retracts the target artifact. The content that was published in the target artifact should be considered removed from publication and should no longer be considered part of the public record.",
    ),
    /**
     * This artifact is retracted by the target artifact. The content that was published in this
     * artifact should be considered removed from publication and should no longer be considered
     * part of the public record.
     */
    Retracted_By(
      "retracted-by",
      "http://hl7.org/fhir/related-artifact-type",
      "Retracted By",
      "This artifact is retracted by the target artifact. The content that was published in this artifact should be considered removed from publication and should no longer be considered part of the public record.",
    ),
    /** This artifact is a signature of the target artifact. */
    Signs(
      "signs",
      "http://hl7.org/fhir/related-artifact-type",
      "Signs",
      "This artifact is a signature of the target artifact.",
    ),
    /**
     * This artifact has characteristics in common with the target artifact. This relationship may
     * be used in systems to “deduplicate” knowledge artifacts from different sources, or in systems
     * to show “similar items”.
     */
    Similar_To(
      "similar-to",
      "http://hl7.org/fhir/related-artifact-type",
      "Similar To",
      "This artifact has characteristics in common with the target artifact. This relationship may be used in systems to “deduplicate” knowledge artifacts from different sources, or in systems to show “similar items”.",
    ),
    /**
     * This artifact provides additional support for the target artifact. The type of support is not
     * documentation as it does not describe, explain, or instruct regarding the target artifact.
     */
    Supports(
      "supports",
      "http://hl7.org/fhir/related-artifact-type",
      "Supports",
      "This artifact provides additional support for the target artifact. The type of support  is not documentation as it does not describe, explain, or instruct regarding the target artifact.",
    ),
    /**
     * The target artifact contains additional information related to the knowledge artifact but is
     * not documentation as the additional information does not describe, explain, or instruct
     * regarding the knowledge artifact content or application. This could include an associated
     * dataset.
     */
    Supported_With(
      "supported-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Supported With",
      "The target artifact contains additional information related to the knowledge artifact but is not documentation as the additional information does not describe, explain, or instruct regarding the knowledge artifact content or application. This could include an associated dataset.",
    ),
    /**
     * This artifact was generated by transforming the target artifact (e.g., format or language
     * conversion). This is intended to capture the relationship in which a particular knowledge
     * resource is based on the content of another artifact, but changes are only apparent in form
     * and there is only one target artifact with the “transforms” relationship type.
     */
    Transforms(
      "transforms",
      "http://hl7.org/fhir/related-artifact-type",
      "Transforms",
      "This artifact was generated by transforming the target artifact (e.g., format or language conversion). This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but changes are only apparent in form and there is only one target artifact with the “transforms” relationship type.",
    ),
    /**
     * This artifact was transformed into the target artifact (e.g., by format or language
     * conversion).
     */
    Transformed_Into(
      "transformed-into",
      "http://hl7.org/fhir/related-artifact-type",
      "Transformed Into",
      "This artifact was transformed into the target artifact (e.g., by format or language conversion).",
    ),
    /**
     * This artifact was generated by transforming a related artifact (e.g., format or language
     * conversion), noted separately with the “transforms” relationship type. This transformation
     * used the target artifact to inform the transformation. The target artifact may be a
     * conversion script or translation guide.
     */
    Transformed_With(
      "transformed-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Transformed With",
      "This artifact was generated by transforming a related artifact (e.g., format or language conversion), noted separately with the “transforms” relationship type. This transformation used the target artifact to inform the transformation. The target artifact may be a conversion script or translation guide.",
    ),
    /**
     * This artifact provides additional documentation for the target artifact. This could include
     * additional instructions on usage as well as additional information on clinical context or
     * appropriateness.
     */
    Documents(
      "documents",
      "http://hl7.org/fhir/related-artifact-type",
      "Documents",
      "This artifact provides additional documentation for the target artifact. This could include additional instructions on usage as well as additional information on clinical context or appropriateness.",
    ),
    /**
     * The target artifact is a precise description of a concept in this artifact. This may be used
     * when the RelatedArtifact datatype is used in elements contained in this artifact.
     */
    Specification_Of(
      "specification-of",
      "http://hl7.org/fhir/related-artifact-type",
      "Specification Of",
      "The target artifact is a precise description of a concept in this artifact. This may be used when the RelatedArtifact datatype is used in elements contained in this artifact.",
    ),
    /**
     * This artifact was created with the target artifact. The target artifact is a tool or support
     * material used in the creation of the artifact, and not content that the artifact was derived
     * from.
     */
    Created_With(
      "created-with",
      "http://hl7.org/fhir/related-artifact-type",
      "Created With",
      "This artifact was created with the target artifact. The target artifact is a tool or support material used in the creation of the artifact, and not content that the artifact was derived from.",
    ),
    /** The related artifact is the citation for this artifact. */
    Cite_As(
      "cite-as",
      "http://hl7.org/fhir/related-artifact-type",
      "Cite As",
      "The related artifact is the citation for this artifact.",
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
