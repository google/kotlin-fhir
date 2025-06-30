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

import com.google.fhir.model.r4b.serializers.CommunicationPayloadSerializer
import com.google.fhir.model.r4b.serializers.CommunicationSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible
 * provider, a public health agency that was notified about a reportable condition.
 */
@Serializable(with = CommunicationSerializer::class)
@SerialName("Communication")
public data class Communication(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
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
  override var contained: List<Resource?>? = null,
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
  override var extension: List<Extension?>? = null,
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
  override var modifierExtension: List<Extension?>? = null,
  /**
   * Business identifiers assigned to this communication by the performer or other systems which
   * remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is
   * adhered to in whole or in part by this Communication.
   */
  public var instantiatesCanonical: List<Canonical?>? = null,
  /**
   * The URL pointing to an externally maintained protocol, guideline, orderset or other definition
   * that is adhered to in whole or in part by this Communication.
   *
   * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
   */
  public var instantiatesUri: List<Uri?>? = null,
  /**
   * An order, proposal or plan fulfilled in whole or in part by this Communication.
   *
   * This must point to some sort of a 'Request' resource, such as CarePlan, CommunicationRequest,
   * ServiceRequest, MedicationRequest, etc.
   */
  public var basedOn: List<Reference?>? = null,
  /** Part of this action. */
  public var partOf: List<Reference?>? = null,
  /** Prior communication that this communication is in response to. */
  public var inResponseTo: List<Reference?>? = null,
  /**
   * The status of the transmission.
   *
   * This element is labeled as a modifier because the status contains the codes aborted and
   * entered-in-error that mark the communication as not currently valid.
   */
  public var status: Enumeration<CommunicationStatus>? = null,
  /**
   * Captures the reason for the current state of the Communication.
   *
   * This is generally only used for "exception" statuses such as "not-done", "suspended" or
   * "aborted". The reason for performing the event at all is captured in reasonCode, not here.
   */
  public var statusReason: CodeableConcept? = null,
  /**
   * The type of message conveyed such as alert, notification, reminder, instruction, etc.
   *
   * There may be multiple axes of categorization and one communication may serve multiple purposes.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Characterizes how quickly the planned or in progress communication must be addressed. Includes
   * concepts such as stat, urgent, routine.
   *
   * Used to prioritize workflow (such as which communication to read first) when the communication
   * is planned or in progress.
   */
  public var priority: Enumeration<CommunicationPriority>? = null,
  /** A channel that was used for this communication (e.g. email, fax). */
  public var medium: List<CodeableConcept?>? = null,
  /** The patient or group that was the focus of this communication. */
  public var subject: Reference? = null,
  /**
   * Description of the purpose/content, similar to a subject line in an email.
   *
   * Communication.topic.text can be used without any codings.
   */
  public var topic: CodeableConcept? = null,
  /**
   * Other resources that pertain to this communication and to which this communication should be
   * associated.
   *
   * Don't use Communication.about element when a more specific element exists, such as basedOn or
   * reasonReference.
   */
  public var about: List<Reference?>? = null,
  /**
   * The Encounter during which this Communication was created or to which the creation of this
   * record is tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter.
   */
  public var encounter: Reference? = null,
  /** The time when this communication was sent. */
  public var sent: DateTime? = null,
  /** The time when this communication arrived at the destination. */
  public var received: DateTime? = null,
  /**
   * The entity (e.g. person, organization, clinical information system, care team or device) which
   * was the target of the communication. If receipts need to be tracked by an individual, a
   * separate resource instance will need to be created for each recipient. Multiple recipient
   * communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a
   * receipt is captured in aggregate (all emails confirmed received by a particular time).
   */
  public var recipient: List<Reference?>? = null,
  /**
   * The entity (e.g. person, organization, clinical information system, or device) which was the
   * source of the communication.
   */
  public var sender: Reference? = null,
  /**
   * The reason or justification for the communication.
   *
   * Textual reasons can be captured using reasonCode.text.
   */
  public var reasonCode: List<CodeableConcept?>? = null,
  /** Indicates another resource whose existence justifies this communication. */
  public var reasonReference: List<Reference?>? = null,
  /** Text, attachment(s), or resource(s) that was communicated to the recipient. */
  public var payload: List<Payload>? = null,
  /**
   * Additional notes or commentary about the communication by the sender, receiver or other
   * interested parties.
   */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  /** Text, attachment(s), or resource(s) that was communicated to the recipient. */
  @Serializable(with = CommunicationPayloadSerializer::class)
  public class Payload(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
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
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
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
     * A communicated content (or for multi-part communications, one portion of the communication).
     */
    public var content: Content? = null,
  ) : BackboneElement() {
    public sealed interface Content {
      public fun asString(): String? = this as? String

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : Content

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Content

      public companion object {
        public fun from(
          stringValue: com.google.fhir.model.r4b.String?,
          AttachmentValue: com.google.fhir.model.r4b.Attachment?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Content? {
          if (stringValue != null) return String(stringValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** Codes identifying the lifecycle stage of an event. */
  public enum class CommunicationStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    Preparation("preparation", "http://hl7.org/fhir/event-status", "Preparation", null),
    In_Progress("in-progress", "http://hl7.org/fhir/event-status", "In Progress", null),
    Not_Done("not-done", "http://hl7.org/fhir/event-status", "Not Done", null),
    On_Hold("on-hold", "http://hl7.org/fhir/event-status", "On Hold", null),
    Stopped("stopped", "http://hl7.org/fhir/event-status", "Stopped", null),
    Completed("completed", "http://hl7.org/fhir/event-status", "Completed", null),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/event-status",
      "Entered in Error",
      null,
    ),
    Unknown("unknown", "http://hl7.org/fhir/event-status", "Unknown", null);

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): CommunicationStatus =
        when (code) {
          "preparation" -> Preparation
          "in-progress" -> In_Progress
          "not-done" -> Not_Done
          "on-hold" -> On_Hold
          "stopped" -> Stopped
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum CommunicationStatus")
        }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class CommunicationPriority(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    Routine("routine", "http://hl7.org/fhir/request-priority", "Routine", null),
    Urgent("urgent", "http://hl7.org/fhir/request-priority", "Urgent", null),
    Asap("asap", "http://hl7.org/fhir/request-priority", "ASAP", null),
    Stat("stat", "http://hl7.org/fhir/request-priority", "STAT", null);

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): CommunicationPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CommunicationPriority")
        }
    }
  }
}
