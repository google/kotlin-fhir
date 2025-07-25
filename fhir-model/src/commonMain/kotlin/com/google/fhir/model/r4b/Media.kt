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

import com.google.fhir.model.r4b.serializers.MediaSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be
 * inline or provided by direct reference.
 */
@Serializable(with = MediaSerializer::class)
@SerialName("Media")
public data class Media(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override var id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override var meta: Meta? = null,
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
   * to an implementation guide that defines these special rules as part of it's narrative along
   * with other profiles, value sets, etc.
   */
  override var implicitRules: Uri? = null,
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
  override var language: Code? = null,
  /**
   * A human-readable narrative that contains a summary of the resource and can be used to represent
   * the content of the resource to a human. The narrative need not encode all the structured data,
   * but is required to contain sufficient detail to make it "clinically safe" for a human to just
   * read the narrative. Resource definitions may define what content should be represented in the
   * narrative to ensure clinical safety.
   *
   * Contained resources do not have narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, and nor can they have their own independent
   * transaction scope.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags In their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: MutableList<Resource> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and manageable, there is a strict set of
   * governance applied to the definition and use of extensions. Though any implementer can define
   * an extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: MutableList<Extension> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
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
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /**
   * Identifiers associated with the image - these may include identifiers for the image itself,
   * identifiers for the context of its collection (e.g. series ids) and context ids such as
   * accession numbers or other workflow identifiers.
   *
   * The identifier label and use can be used to determine what kind of identifier it is.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /** A procedure that is fulfilled in whole or in part by the creation of this media. */
  public var basedOn: MutableList<Reference> = mutableListOf(),
  /**
   * A larger event of which this particular event is a component or step.
   *
   * Not to be used to link an event to an Encounter - use Media.encounter for that.
   *
   * [The allowed reference resources may be adjusted as appropriate for the event resource].
   */
  public var partOf: MutableList<Reference> = mutableListOf(),
  /**
   * The current state of the {{title}}.
   *
   * A nominal state-transition diagram can be found in the [[event.html#statemachine | Event
   * pattern]] documentation
   *
   * Unknown does not represent "other" - one of the defined statuses must apply. Unknown is used
   * when the authoring system is not sure what the current status is.
   */
  public var status: Enumeration<MediaStatus>,
  /**
   * A code that classifies whether the media is an image, video or audio recording or some other
   * media category.
   */
  public var type: CodeableConcept? = null,
  /**
   * Details of the type of the media - usually, how it was acquired (what type of device). If
   * images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
   */
  public var modality: CodeableConcept? = null,
  /** The name of the imaging view e.g. Lateral or Antero-posterior (AP). */
  public var view: CodeableConcept? = null,
  /** Who/What this Media is a record of. */
  public var subject: Reference? = null,
  /**
   * The encounter that establishes the context for this media.
   *
   * This will typically be the encounter the media occurred within.
   */
  public var encounter: Reference? = null,
  /** The date and time(s) at which the media was collected. */
  public var created: Created? = null,
  /**
   * The date and time this version of the media was made available to providers, typically after
   * having been reviewed.
   *
   * It may be the same as the [`lastUpdated` ](resource-definitions.html#Meta.lastUpdated) time of
   * the resource itself. For Observations that do require review and verification for certain
   * updates, it might not be the same as the `lastUpdated` time of the resource itself due to a
   * non-clinically significant update that does not require the new version to be reviewed and
   * verified again.
   */
  public var issued: Instant? = null,
  /** The person who administered the collection of the image. */
  public var `operator`: Reference? = null,
  /**
   * Describes why the event occurred in coded or textual form.
   *
   * Textual reasons can be captured using reasonCode.text.
   */
  public var reasonCode: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Indicates the site on the subject's body where the observation was made (i.e. the target site).
   *
   * Only used if not implicit in code found in Observation.code. In many systems, this may be
   * represented as a related observation instead of an inline component.
   *
   * If the use case requires BodySite to be handled as a separate resource (e.g. to identify and
   * track separately) then use the standard extension[ bodySite](extension-bodysite.html).
   */
  public var bodySite: CodeableConcept? = null,
  /** The name of the device / manufacturer of the device that was used to make the recording. */
  public var deviceName: String? = null,
  /**
   * The device used to collect the media.
   *
   * An extension should be used if further typing of the device is needed. Secondary devices used
   * to support collecting a media can be represented using either extension or through the
   * Observation.related element.
   */
  public var device: Reference? = null,
  /** Height of the image in pixels (photo/video). */
  public var height: PositiveInt? = null,
  /** Width of the image in pixels (photo/video). */
  public var width: PositiveInt? = null,
  /**
   * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition
   * context that takes multiple slices in a single image, or an animated gif. If there is more than
   * one frame, this SHALL have a value in order to alert interface software that a multi-frame
   * capable rendering widget is required.
   *
   * if the number of frames is not supplied, the value may be unknown. Applications should not
   * assume that there is only one frame unless it is explicitly stated.
   */
  public var frames: PositiveInt? = null,
  /**
   * The duration of the recording in seconds - for audio and video.
   *
   * The duration might differ from occurrencePeriod if recording was paused.
   */
  public var duration: Decimal? = null,
  /**
   * The actual content of the media - inline or by direct reference to the media source file.
   *
   * Recommended content types: image/jpeg, image/png, image/tiff, video/mpeg, audio/mp4,
   * application/dicom. Application/dicom can contain the transfer syntax as a parameter. For media
   * that covers a period of time (video/sound), the content.creationTime is the end time. Creation
   * time is used for tracking, organizing versions and searching.
   */
  public var content: Attachment,
  /**
   * Comments made about the media by the performer, subject or other participants.
   *
   * Not to be used for observations, conclusions, etc. Instead use an
   * [Observation](observation.html) based on the Media/ImagingStudy resource.
   */
  public var note: MutableList<Annotation> = mutableListOf(),
) : DomainResource() {
  public sealed interface Created {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Created

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Created

    public companion object {
      internal fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        periodValue: com.google.fhir.model.r4b.Period?,
      ): Created? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (periodValue != null) return Period(periodValue)
        return null
      }
    }
  }

  /** Codes identifying the lifecycle stage of an event. */
  public enum class MediaStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Preparation("preparation", "http://hl7.org/fhir/event-status", "Preparation"),
    In_Progress("in-progress", "http://hl7.org/fhir/event-status", "In Progress"),
    Not_Done("not-done", "http://hl7.org/fhir/event-status", "Not Done"),
    On_Hold("on-hold", "http://hl7.org/fhir/event-status", "On Hold"),
    Stopped("stopped", "http://hl7.org/fhir/event-status", "Stopped"),
    Completed("completed", "http://hl7.org/fhir/event-status", "Completed"),
    Entered_In_Error("entered-in-error", "http://hl7.org/fhir/event-status", "Entered in Error"),
    Unknown("unknown", "http://hl7.org/fhir/event-status", "Unknown");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): MediaStatus =
        when (code) {
          "preparation" -> Preparation
          "in-progress" -> In_Progress
          "not-done" -> Not_Done
          "on-hold" -> On_Hold
          "stopped" -> Stopped
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum MediaStatus")
        }
    }
  }
}
