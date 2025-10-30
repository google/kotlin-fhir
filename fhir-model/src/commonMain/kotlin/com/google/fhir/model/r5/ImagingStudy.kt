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

import com.google.fhir.model.r5.serializers.ImagingStudySerializer
import com.google.fhir.model.r5.serializers.ImagingStudySeriesInstanceSerializer
import com.google.fhir.model.r5.serializers.ImagingStudySeriesPerformerSerializer
import com.google.fhir.model.r5.serializers.ImagingStudySeriesSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of
 * series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or
 * other data) acquired or produced in a common context. A series is of only one modality (e.g.
 * X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 */
@Serializable(with = ImagingStudySerializer::class)
@SerialName("ImagingStudy")
public data class ImagingStudy(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override val id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override val meta: Meta? = null,
  /**
   * A reference to a set of rules that were followed when the resource was constructed, and which
   * must be understood when processing the content. Often, this is a reference to an implementation
   * guide that defines the special rules along with other profiles etc.
   *
   * Asserting this rule set restricts the content to be only understood by a limited set of trading
   * partners. This inherently limits the usefulness of the data in the long term. However, the
   * existing health eco-system is highly fractured, and not yet ready to define, collect, and
   * exchange data in a generally computable sense. Wherever possible, implementers and/or
   * specification writers should avoid using this element. Often, when used, the URL is a reference
   * to an implementation guide that defines these special rules as part of its narrative along with
   * other profiles, value sets, etc.
   */
  override val implicitRules: Uri? = null,
  /**
   * The base language in which the resource is written.
   *
   * Language is provided to support indexing and accessibility (typically, services such as text to
   * speech use the language tag). The html language tag in the narrative applies to the narrative.
   * The language tag on the resource may be used to specify the language of other presentations
   * generated from the data in the resource. Not all the content has to be in the base language.
   * The Resource.language should not be assumed to apply to the narrative automatically. If a
   * language is specified, it should it also be specified on the div element in the html (see rules
   * in HTML5 for information about the relationship between xml:lang and the html lang attribute).
   */
  override val language: Code? = null,
  /**
   * A human-readable narrative that contains a summary of the resource and can be used to represent
   * the content of the resource to a human. The narrative need not encode all the structured data,
   * but is required to contain sufficient detail to make it "clinically safe" for a human to just
   * read the narrative. Resource definitions may define what content should be represented in the
   * narrative to ensure clinical safety.
   *
   * Contained resources do not have a narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override val text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, nor can they have their own independent
   * transaction scope. This is allowed to be a Parameters resource if and only if it is referenced
   * by a resource that provides context/meaning.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags in their meta elements, but SHALL NOT have security
   * labels.
   */
  override val contained: List<Resource> = listOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and managable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override val extension: List<Extension> = listOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and managable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer is
   * allowed to define an extension, there is a set of requirements that SHALL be met as part of the
   * definition of the extension. Applications processing a resource are required to check for
   * modifier extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource
   * (including cannot change the meaning of modifierExtension itself).
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override val modifierExtension: List<Extension> = listOf(),
  /**
   * Identifiers for the ImagingStudy such as DICOM Study Instance UID.
   *
   * See discussion under [Imaging Study Implementation Notes](imagingstudy.html#notes) for encoding
   * of DICOM Study Instance UID.
   */
  public val identifier: List<Identifier> = listOf(),
  /**
   * The current state of the ImagingStudy resource. This is not the status of any ServiceRequest or
   * Task resources associated with the ImagingStudy.
   *
   * Unknown does not represent "other" - one of the defined statuses must apply. Unknown is used
   * when the authoring system is not sure what the current status is.
   */
  public val status: Enumeration<ImagingStudyStatus>,
  /**
   * A list of all the distinct values of series.modality. This may include both acquisition and
   * non-acquisition modalities.
   */
  public val modality: List<CodeableConcept> = listOf(),
  /**
   * The subject, typically a patient, of the imaging study.
   *
   * QA phantoms can be recorded with a Device; multiple subjects (such as mice) can be recorded
   * with a Group.
   */
  public val subject: Reference,
  /**
   * The healthcare event (e.g. a patient and healthcare provider interaction) during which this
   * ImagingStudy is made.
   *
   * This will typically be the encounter the event occurred within, but some events may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter (e.g. pre-admission test).
   */
  public val encounter: Reference? = null,
  /** Date and time the study started. */
  public val started: DateTime? = null,
  /** A list of the diagnostic requests that resulted in this imaging study being performed. */
  public val basedOn: List<Reference> = listOf(),
  /**
   * A larger event of which this particular ImagingStudy is a component or step. For example, an
   * ImagingStudy as part of a procedure.
   *
   * To link an ImagingStudy to an Encounter use `encounter`.
   */
  public val partOf: List<Reference> = listOf(),
  /** The requesting/referring physician. */
  public val referrer: Reference? = null,
  /**
   * The network service providing access (e.g., query, view, or retrieval) for the study. See
   * implementation notes for information about using DICOM endpoints. A study-level endpoint
   * applies to each series in the study, unless overridden by a series-level endpoint with the same
   * Endpoint.connectionType.
   *
   * Typical endpoint types include DICOM WADO-RS, which is used to retrieve DICOM instances in
   * native or rendered (e.g., JPG, PNG), formats using a RESTful API; DICOM WADO-URI, which can
   * similarly retrieve native or rendered instances, except using an HTTP query-based approach;
   * DICOM QIDO-RS, which allows RESTful query for DICOM information without retrieving the actual
   * instances; or IHE Invoke Image Display (IID), which provides standard invocation of an imaging
   * web viewer.
   */
  public val endpoint: List<Reference> = listOf(),
  /**
   * Number of Series in the Study. This value given may be larger than the number of series
   * elements this Resource contains due to resource availability, security, or other factors. This
   * element should be present if any series elements are present.
   */
  public val numberOfSeries: UnsignedInt? = null,
  /**
   * Number of SOP Instances in Study. This value given may be larger than the number of instance
   * elements this resource contains due to resource availability, security, or other factors. This
   * element should be present if any instance elements are present.
   */
  public val numberOfInstances: UnsignedInt? = null,
  /**
   * This field corresponds to the DICOM Procedure Code Sequence (0008,1032). This is different from
   * the FHIR Procedure resource that may include the ImagingStudy.
   */
  public val procedure: List<CodeableReference> = listOf(),
  /** The principal physical location where the ImagingStudy was performed. */
  public val location: Reference? = null,
  /**
   * Description of clinical condition indicating why the ImagingStudy was requested, and/or
   * Indicates another resource whose existence justifies this Study.
   */
  public val reason: List<CodeableReference> = listOf(),
  /**
   * Per the recommended DICOM mapping, this element is derived from the Study Description attribute
   * (0008,1030). Observations or findings about the imaging study should be recorded in another
   * resource, e.g. Observation, and not in this element.
   */
  public val note: List<Annotation> = listOf(),
  /**
   * The Imaging Manager description of the study. Institution-generated description or
   * classification of the Study (component) performed.
   */
  public val description: String? = null,
  /** Each study has one or more series of images or other content. */
  public val series: List<Series> = listOf(),
) : DomainResource() {
  /** Each study has one or more series of images or other content. */
  @Serializable(with = ImagingStudySeriesSerializer::class)
  public class Series(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override val extension: List<Extension> = listOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and managable, there is
     * a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override val modifierExtension: List<Extension> = listOf(),
    /**
     * The DICOM Series Instance UID for the series.
     *
     * See
     * [DICOM PS3.3 C.7.3](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.3.html).
     */
    public val uid: Id,
    /** The numeric identifier of this series in the study. */
    public val number: UnsignedInt? = null,
    /**
     * The distinct modality for this series. This may include both acquisition and non-acquisition
     * modalities.
     */
    public val modality: CodeableConcept,
    /** A description of the series. */
    public val description: String? = null,
    /**
     * Number of SOP Instances in the Study. The value given may be larger than the number of
     * instance elements this resource contains due to resource availability, security, or other
     * factors. This element should be present if any instance elements are present.
     */
    public val numberOfInstances: UnsignedInt? = null,
    /**
     * The network service providing access (e.g., query, view, or retrieval) for this series. See
     * implementation notes for information about using DICOM endpoints. A series-level endpoint, if
     * present, has precedence over a study-level endpoint with the same Endpoint.connectionType.
     *
     * Typical endpoint types include DICOM WADO-RS, which is used to retrieve DICOM instances in
     * native or rendered (e.g., JPG, PNG) formats using a RESTful API; DICOM WADO-URI, which can
     * similarly retrieve native or rendered instances, except using an HTTP query-based approach;
     * and DICOM QIDO-RS, which allows RESTful query for DICOM information without retrieving the
     * actual instances.
     */
    public val endpoint: List<Reference> = listOf(),
    /**
     * The anatomic structures examined. See DICOM Part 16 Annex L
     * (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to
     * SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it
     * shall be consistent with any content of ImagingStudy.series.laterality.
     */
    public val bodySite: CodeableReference? = null,
    /**
     * The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee,
     * both lungs, or unpaired abdomen. If present, shall be consistent with any laterality
     * information indicated in ImagingStudy.series.bodySite.
     */
    public val laterality: CodeableConcept? = null,
    /** The specimen imaged, e.g., for whole slide imaging of a biopsy. */
    public val specimen: List<Reference> = listOf(),
    /** The date and time the series was started. */
    public val started: DateTime? = null,
    /**
     * Indicates who or what performed the series and how they were involved.
     *
     * If the person who performed the series is not known, their Organization may be recorded. A
     * patient, or related person, may be the performer, e.g. for patient-captured images.
     */
    public val performer: List<Performer> = listOf(),
    /** A single SOP instance within the series, e.g. an image, or presentation state. */
    public val instance: List<Instance> = listOf(),
  ) : BackboneElement() {
    /** Indicates who or what performed the series and how they were involved. */
    @Serializable(with = ImagingStudySeriesPerformerSerializer::class)
    public class Performer(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override val extension: List<Extension> = listOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and managable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override val modifierExtension: List<Extension> = listOf(),
      /** Distinguishes the type of involvement of the performer in the series. */
      public val function: CodeableConcept? = null,
      /** Indicates who or what performed the series. */
      public val actor: Reference,
    ) : BackboneElement()

    /** A single SOP instance within the series, e.g. an image, or presentation state. */
    @Serializable(with = ImagingStudySeriesInstanceSerializer::class)
    public class Instance(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override val extension: List<Extension> = listOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and managable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override val modifierExtension: List<Extension> = listOf(),
      /**
       * The DICOM SOP Instance UID for this image or other DICOM content.
       *
       * See
       * [DICOM PS3.3 C.12.1](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.12.html#sect_C.12.1).
       */
      public val uid: Id,
      /** DICOM instance type. */
      public val sopClass: Coding,
      /** The number of instance in the series. */
      public val number: UnsignedInt? = null,
      /**
       * The description of the instance.
       *
       * Particularly for post-acquisition analytic objects, such as SR, presentation states, value
       * mapping, etc.
       */
      public val title: String? = null,
    ) : BackboneElement()
  }

  /** The status of the ImagingStudy. */
  public enum class ImagingStudyStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Registered("registered", "http://hl7.org/fhir/imagingstudy-status", "Registered"),
    Available("available", "http://hl7.org/fhir/imagingstudy-status", "Available"),
    Cancelled("cancelled", "http://hl7.org/fhir/imagingstudy-status", "Cancelled"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/imagingstudy-status",
      "Entered in Error",
    ),
    Unknown("unknown", "http://hl7.org/fhir/imagingstudy-status", "Unknown");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ImagingStudyStatus =
        when (code) {
          "registered" -> Registered
          "available" -> Available
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum ImagingStudyStatus")
        }
    }
  }
}
