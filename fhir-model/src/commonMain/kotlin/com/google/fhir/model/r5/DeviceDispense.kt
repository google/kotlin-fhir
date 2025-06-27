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

import com.google.fhir.model.r5.serializers.DeviceDispensePerformerSerializer
import com.google.fhir.model.r5.serializers.DeviceDispenseSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indicates that a device is to be or has been dispensed for a named person/patient. This includes
 * a description of the product (supply) provided and the instructions for using the device.
 */
@Serializable(with = DeviceDispenseSerializer::class)
@SerialName("DeviceDispense")
public data class DeviceDispense(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override var id: String? = null,
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
   * to an implementation guide that defines these special rules as part of its narrative along with
   * other profiles, value sets, etc.
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
   * Contained resources do not have a narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
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
  override var contained: List<Resource?>? = null,
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
  override var extension: List<Extension?>? = null,
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
  override var modifierExtension: List<Extension?>? = null,
  /**
   * Business identifier for this dispensation.
   *
   * This is a business identifier, not a resource identifier.
   */
  public var identifier: List<Identifier?>? = null,
  /** The order or request that this dispense is fulfilling. */
  public var basedOn: List<Reference?>? = null,
  /** The bigger event that this dispense is a part of. */
  public var partOf: List<Reference?>? = null,
  /**
   * A code specifying the state of the set of dispense events.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<DeviceDispenseStatus>? = null,
  /** Indicates the reason why a dispense was or was not performed. */
  public var statusReason: CodeableReference? = null,
  /**
   * Indicates the type of device dispense.
   *
   * The category can be used to include where the device is expected to be consumed or other types
   * of dispenses. Invariants can be used to bind to different value sets when profiling to bind.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Identifies the device being dispensed. This is either a link to a resource representing the
   * details of the device or a simple attribute carrying a code that identifies the device from a
   * known list of devices.
   */
  public var device: CodeableReference? = null,
  /**
   * A link to a resource representing the person to whom the device is intended.
   *
   * What about 'this measuring Device is now asigned to Dr X who needs it now'?
   */
  public var subject: Reference? = null,
  /**
   * Identifies the person who picked up the device or the person or location where the device was
   * delivered. This may be a patient or their caregiver, but some cases exist where it can be a
   * healthcare professional or a location.
   */
  public var `receiver`: Reference? = null,
  /** The encounter that establishes the context for this event. */
  public var encounter: Reference? = null,
  /** Additional information that supports the device being dispensed. */
  public var supportingInformation: List<Reference?>? = null,
  /** Indicates who or what performed the event. */
  public var performer: List<Performer>? = null,
  /** The principal physical location where the dispense was performed. */
  public var location: Reference? = null,
  /** Indicates the type of dispensing event that is performed. */
  public var type: CodeableConcept? = null,
  /** The number of devices that have been dispensed. */
  public var quantity: Quantity? = null,
  /** The time when the dispensed product was packaged and reviewed. */
  public var preparedDate: DateTime? = null,
  /** The time the dispensed product was made available to the patient or their representative. */
  public var whenHandedOver: DateTime? = null,
  /**
   * Identification of the facility/location where the device was /should be shipped to, as part of
   * the dispense process.
   */
  public var destination: Reference? = null,
  /** Extra information about the dispense that could not be conveyed in the other attributes. */
  public var note: List<Annotation?>? = null,
  /**
   * The full representation of the instructions.
   *
   * The content of the renderedDosageInstructions must not be different than the dose represented
   * in the dosageInstruction content.
   */
  public var usageInstruction: Markdown? = null,
  /**
   * A summary of the events of interest that have occurred, such as when the dispense was verified.
   *
   * This might not include provenances for all versions of the request – only those deemed
   * “relevant” or important. This SHALL NOT include the Provenance associated with this current
   * version of the resource. (If that provenance is deemed to be a “relevant” change, it will need
   * to be added as part of a later update. Until then, it can be queried directly as the Provenance
   * that points to this version using _revinclude All Provenances should have some historical
   * version of this Request as their subject.).
   */
  public var eventHistory: List<Reference?>? = null,
) : DomainResource() {
  /** Indicates who or what performed the event. */
  @Serializable(with = DeviceDispensePerformerSerializer::class)
  public class Performer(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    override var extension: List<Extension?>? = null,
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
    override var modifierExtension: List<Extension?>? = null,
    /**
     * Distinguishes the type of performer in the dispense. For example, date enterer, packager,
     * final checker.
     */
    public var function: CodeableConcept? = null,
    /**
     * The device, practitioner, etc. who performed the action. It should be assumed that the actor
     * is the dispenser of the device.
     */
    public var actor: Reference? = null,
  ) : BackboneElement()

  /** DeviceDispense Status Codes */
  public enum class DeviceDispenseStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The core event has not started yet, but some staging activities have begun (e.g. initial
     * preparing of the device. Preparation stages may be tracked e.g. for planning, supply or
     * billing purposes.
     */
    Preparation(
      "preparation",
      "http://hl7.org/fhir/devicedispense-status",
      "Preparation",
      "The core event has not started yet, but some staging activities have begun (e.g. initial preparing of the device. Preparation stages may be tracked e.g. for planning, supply or billing purposes.",
    ),
    /** The dispensed product is ready for pickup. */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/devicedispense-status",
      "In Progress",
      "The dispensed product is ready for pickup.",
    ),
    /** The dispensed product was not and will never be picked up by the patient. */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/devicedispense-status",
      "Cancelled",
      "The dispensed product was not and will never be picked up by the patient.",
    ),
    /**
     * The dispense process is paused while waiting for an external event to reactivate the
     * dispense. For example, new stock has arrived or the prescriber has called.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/devicedispense-status",
      "On Hold",
      "The dispense process is paused while waiting for an external event to reactivate the dispense.  For example, new stock has arrived or the prescriber has called.",
    ),
    /** The dispensed product has been picked up. */
    Completed(
      "completed",
      "http://hl7.org/fhir/devicedispense-status",
      "Completed",
      "The dispensed product has been picked up.",
    ),
    /** The dispense was entered in error and therefore nullified. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/devicedispense-status",
      "Entered in Error",
      "The dispense was entered in error and therefore nullified.",
    ),
    /**
     * Actions implied by the dispense have been permanently halted, before all of them occurred.
     */
    Stopped(
      "stopped",
      "http://hl7.org/fhir/devicedispense-status",
      "Stopped",
      "Actions implied by the dispense have been permanently halted, before all of them occurred.",
    ),
    /** The dispense was declined and not performed. */
    Declined(
      "declined",
      "http://hl7.org/fhir/devicedispense-status",
      "Declined",
      "The dispense was declined and not performed.",
    ),
    /**
     * The authoring system does not know which of the status values applies for this dispense.
     * Note: this concept is not to be used for other - one of the listed statuses is presumed to
     * apply, it's just now known which one.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/devicedispense-status",
      "Unknown",
      "The authoring system does not know which of the status values applies for this dispense.  Note: this concept is not to be used for other - one of the listed statuses is presumed to apply, it's just now known which one.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): DeviceDispenseStatus =
        when (code) {
          "preparation" -> Preparation
          "in-progress" -> In_Progress
          "cancelled" -> Cancelled
          "on-hold" -> On_Hold
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "stopped" -> Stopped
          "declined" -> Declined
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum DeviceDispenseStatus")
        }
    }
  }
}
