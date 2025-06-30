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

import com.google.fhir.model.r5.serializers.CommunicationRequestPayloadSerializer
import com.google.fhir.model.r5.serializers.CommunicationRequestSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a
 * responsible provider, the CDS system proposes that the public health agency be notified about a
 * reportable condition.
 */
@Serializable(with = CommunicationRequestSerializer::class)
@SerialName("CommunicationRequest")
public data class CommunicationRequest(
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
   * Business identifiers assigned to this communication request by the performer or other systems
   * which remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var identifier: List<Identifier?>? = null,
  /** A plan or proposal that is fulfilled in whole or in part by this request. */
  public var basedOn: List<Reference?>? = null,
  /**
   * Completed or terminated request(s) whose function is taken by this new request.
   *
   * The replacement could be because the initial request was immediately rejected (due to an issue)
   * or because the previous request was completed, but the need for the action described by the
   * request remains ongoing.
   */
  public var replaces: List<Reference?>? = null,
  /**
   * A shared identifier common to multiple independent Request instances that were
   * activated/authorized more or less simultaneously by a single author. The presence of the same
   * identifier on each request ties those requests together and may have business ramifications in
   * terms of reporting of results, billing, etc. E.g. a requisition number shared by a set of lab
   * tests ordered together, or a prescription number shared by all meds ordered at one time.
   *
   * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another)
   * or by having a common requisition. Requests that are part of the same requisition are generally
   * treated independently from the perspective of changing their state or maintaining them after
   * initial creation.
   */
  public var groupIdentifier: Identifier? = null,
  /** The status of the proposal or order. */
  public var status: Enumeration<CommunicationRequestStatus>? = null,
  /**
   * Captures the reason for the current state of the CommunicationRequest.
   *
   * This is generally only used for "exception" statuses such as "on-hold" or "revoked". The reason
   * why the CommunicationRequest was created at all is captured in reasonCode, not here.
   */
  public var statusReason: CodeableConcept? = null,
  /**
   * Indicates the level of authority/intentionality associated with the CommunicationRequest and
   * where the request fits into the workflow chain.
   *
   * This element is expected to be immutable. E.g. A "proposal" instance should never change to be
   * a "plan" instance or "order" instance. Instead, a new instance 'basedOn' the prior instance
   * should be created with the new 'intent' value.
   *
   * One exception to this is that the granularity of CommunicationRequest.intent is allowed to
   * change. For example, a Request identified as an "order" might later be clarified to be a
   * "filler-order". Or, in rarer cases (to meet recipient constraints), the reverse might also
   * occur.
   */
  public var intent: Enumeration<CommunicationRequestIntent>? = null,
  /**
   * The type of message to be sent such as alert, notification, reminder, instruction, etc.
   *
   * There may be multiple axes of categorization and one communication request may serve multiple
   * purposes.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Characterizes how quickly the proposed act must be initiated. Includes concepts such as stat,
   * urgent, routine.
   */
  public var priority: Enumeration<CommunicationPriority>? = null,
  /**
   * If true indicates that the CommunicationRequest is asking for the specified action to *not*
   * occur.
   *
   * The attributes provided with the request qualify what is not to be done.
   */
  public var doNotPerform: Boolean? = null,
  /** A channel that was used for this communication (e.g. email, fax). */
  public var medium: List<CodeableConcept?>? = null,
  /** The patient or group that is the focus of this communication request. */
  public var subject: Reference? = null,
  /**
   * Other resources that pertain to this communication request and to which this communication
   * request should be associated.
   *
   * Don't use CommunicationRequest.about element when a more specific element exists, such as
   * basedOn, reasonReference, or replaces.
   */
  public var about: List<Reference?>? = null,
  /**
   * The Encounter during which this CommunicationRequest was created or to which the creation of
   * this record is tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter.
   */
  public var encounter: Reference? = null,
  /** Text, attachment(s), or resource(s) to be communicated to the recipient. */
  public var payload: List<Payload>? = null,
  /** The time when this communication is to occur. */
  public var occurrence: Occurrence? = null,
  /**
   * For draft requests, indicates the date of initial creation. For requests with other statuses,
   * indicates the date of activation.
   */
  public var authoredOn: DateTime? = null,
  /** The device, individual, or organization who asks for the information to be shared. */
  public var requester: Reference? = null,
  /**
   * The entity (e.g. person, organization, clinical information system, device, group, or care
   * team) which is the intended target of the communication.
   */
  public var recipient: List<Reference?>? = null,
  /**
   * The entity (e.g. person, organization, clinical information system, or device) which is to be
   * the source of the communication.
   */
  public var informationProvider: List<Reference?>? = null,
  /**
   * Describes why the request is being made in coded or textual form.
   *
   * Textual reasons can be captured using reasonCode.text.
   */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Comments made about the request by the requester, sender, recipient, subject or other
   * participants.
   */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  /** Text, attachment(s), or resource(s) to be communicated to the recipient. */
  @Serializable(with = CommunicationRequestPayloadSerializer::class)
  public class Payload(
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
     * The communicated content (or for multi-part communications, one portion of the
     * communication).
     *
     * The content can be codified or textual. As an example of codified content, when working with
     * machine generated communications, the payload may be drawn from a finite, terminology defined
     * set of communications, especially for short, status update kinds of communications where more
     * of a natural language approach isn't appropriate.
     *
     * If the content isn't codified, contentCodeableConcept.text can be used.
     *
     * When using contentCodeableConcept, the CodeableConcept is what is being communicated and is
     * not a categorization of the content.
     */
    public var content: Content? = null,
  ) : BackboneElement() {
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Content

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Content

      public companion object {
        public fun from(
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        ): Content? {
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          return null
        }
      }
    }
  }

  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Occurrence

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Occurrence

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        return null
      }
    }
  }

  /** Codes identifying the lifecycle stage of a request. */
  public enum class CommunicationRequestStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    Draft("draft", "http://hl7.org/fhir/request-status", "Draft", null),
    Active("active", "http://hl7.org/fhir/request-status", "Active", null),
    On_Hold("on-hold", "http://hl7.org/fhir/request-status", "On Hold", null),
    Revoked("revoked", "http://hl7.org/fhir/request-status", "Revoked", null),
    Completed("completed", "http://hl7.org/fhir/request-status", "Completed", null),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/request-status",
      "Entered in Error",
      null,
    ),
    Unknown("unknown", "http://hl7.org/fhir/request-status", "Unknown", null);

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): CommunicationRequestStatus =
        when (code) {
          "draft" -> Draft
          "active" -> Active
          "on-hold" -> On_Hold
          "revoked" -> Revoked
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CommunicationRequestStatus")
        }
    }
  }

  /** Codes indicating the degree of authority/intentionality associated with a request. */
  public enum class CommunicationRequestIntent(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    Proposal("proposal", "http://hl7.org/fhir/request-intent", "Proposal", null),
    Plan("plan", "http://hl7.org/fhir/request-intent", "Plan", null),
    Directive("directive", "http://hl7.org/fhir/request-intent", "Directive", null),
    Order("order", "http://hl7.org/fhir/request-intent", "Order", null),
    Original_Order("original-order", "http://hl7.org/fhir/request-intent", "Original Order", null),
    Reflex_Order("reflex-order", "http://hl7.org/fhir/request-intent", "Reflex Order", null),
    Filler_Order("filler-order", "http://hl7.org/fhir/request-intent", "Filler Order", null),
    Instance_Order("instance-order", "http://hl7.org/fhir/request-intent", "Instance Order", null),
    Option("option", "http://hl7.org/fhir/request-intent", "Option", null);

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): CommunicationRequestIntent =
        when (code) {
          "proposal" -> Proposal
          "plan" -> Plan
          "directive" -> Directive
          "order" -> Order
          "original-order" -> Original_Order
          "reflex-order" -> Reflex_Order
          "filler-order" -> Filler_Order
          "instance-order" -> Instance_Order
          "option" -> Option
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CommunicationRequestIntent")
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
