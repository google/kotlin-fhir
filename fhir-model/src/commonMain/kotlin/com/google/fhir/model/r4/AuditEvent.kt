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

package com.google.fhir.model.r4

import com.google.fhir.model.r4.serializers.AuditEventAgentNetworkSerializer
import com.google.fhir.model.r4.serializers.AuditEventAgentSerializer
import com.google.fhir.model.r4.serializers.AuditEventEntityDetailSerializer
import com.google.fhir.model.r4.serializers.AuditEventEntitySerializer
import com.google.fhir.model.r4.serializers.AuditEventSerializer
import com.google.fhir.model.r4.serializers.AuditEventSourceSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include
 * detection of intrusion attempts and monitoring for inappropriate usage.
 */
@Serializable(with = AuditEventSerializer::class)
@SerialName("AuditEvent")
public data class AuditEvent(
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
   * Identifier for a family of the event. For example, a menu item, program, rule, policy, function
   * code, application name or URL. It identifies the performed function.
   */
  public var type: Coding? = null,
  /** Identifier for the category of event. */
  public var subtype: List<Coding?>? = null,
  /** Indicator for type of action performed during the event that generated the audit. */
  public var action: Enumeration<AuditEventAction>? = null,
  /**
   * The period during which the activity occurred.
   *
   * The period can be a little arbitrary; where possible, the time should correspond to human
   * assessment of the activity time.
   */
  public var period: Period? = null,
  /**
   * The time when the event was recorded.
   *
   * In a distributed system, some sort of common time base (e.g. an NTP [RFC1305] server) is a good
   * implementation tactic.
   */
  public var recorded: Instant? = null,
  /**
   * Indicates whether the event succeeded or failed.
   *
   * In some cases a "success" may be partial, for example, an incomplete or interrupted transfer of
   * a radiological study. For the purpose of establishing accountability, these distinctions are
   * not relevant.
   */
  public var outcome: Enumeration<AuditEventOutcome>? = null,
  /** A free text description of the outcome of the event. */
  public var outcomeDesc: String? = null,
  /**
   * The purposeOfUse (reason) that was used during the event being recorded.
   *
   * Use AuditEvent.agent.purposeOfUse when you know that it is specific to the agent, otherwise use
   * AuditEvent.purposeOfEvent. For example, during a machine-to-machine transfer it might not be
   * obvious to the audit system who caused the event, but it does know why.
   */
  public var purposeOfEvent: List<CodeableConcept?>? = null,
  /**
   * An actor taking an active role in the event or activity that is logged.
   *
   * Several agents may be associated (i.e. have some responsibility for an activity) with an event
   * or activity.
   *
   * For example, an activity may be initiated by one user for other users or involve more than one
   * user. However, only one user may be the initiator/requestor for the activity.
   */
  public var agent: List<Agent>? = null,
  /**
   * The system that is reporting the event.
   *
   * Since multi-tier, distributed, or composite applications make source identification ambiguous,
   * this collection of fields may repeat for each application or process actively involved in the
   * event. For example, multiple value-sets can identify participating web servers, application
   * processes, and database server threads in an n-tier distributed application. Passive event
   * participants (e.g. low-level network transports) need not be identified.
   */
  public var source: Source? = null,
  /**
   * Specific instances of data or objects that have been accessed.
   *
   * Required unless the values for event identification, agent identification, and audit source
   * identification are sufficient to document the entire auditable event. Because events may have
   * more than one entity, this group can be a repeating set of values.
   */
  public var entity: List<Entity>? = null,
) : DomainResource() {
  /** An actor taking an active role in the event or activity that is logged. */
  @Serializable(with = AuditEventAgentSerializer::class)
  public class Agent(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
    /** Specification of the participation type the user plays when performing the event. */
    public var type: CodeableConcept? = null,
    /**
     * The security role that the user was acting under, that come from local codes defined by the
     * access control security system (e.g. RBAC, ABAC) used in the local context.
     *
     * Should be roles relevant to the event. Should not be an exhaustive list of roles.
     */
    public var role: List<CodeableConcept?>? = null,
    /**
     * Reference to who this agent is that was involved in the event.
     *
     * Where a User ID is available it will go into who.identifier.
     */
    public var who: Reference? = null,
    /**
     * Alternative agent Identifier. For a human, this should be a user identifier text string from
     * authentication system. This identifier would be one known to a common authentication system
     * (e.g. single sign-on), if available.
     */
    public var altId: String? = null,
    /** Human-meaningful name for the agent. */
    public var name: String? = null,
    /**
     * Indicator that the user is or is not the requestor, or initiator, for the event being
     * audited.
     *
     * There can only be one initiator. If the initiator is not clear, then do not choose any one
     * agent as the initiator.
     */
    public var requestor: Boolean? = null,
    /** Where the event occurred. */
    public var location: Reference? = null,
    /**
     * The policy or plan that authorized the activity being recorded. Typically, a single activity
     * may have multiple applicable policies, such as patient consent, guarantor funding, etc. The
     * policy would also indicate the security token used.
     *
     * For example: Where an OAuth token authorizes, the unique identifier from the OAuth token is
     * placed into the policy element Where a policy engine (e.g. XACML) holds policy logic, the
     * unique policy identifier is placed into the policy element.
     */
    public var policy: List<Uri?>? = null,
    /** Type of media involved. Used when the event is about exporting/importing onto media. */
    public var media: Coding? = null,
    /**
     * Logical network location for application activity, if the activity has a network location.
     */
    public var network: Network? = null,
    /**
     * The reason (purpose of use), specific to this agent, that was used during the event being
     * recorded.
     *
     * Use AuditEvent.agent.purposeOfUse when you know that is specific to the agent, otherwise use
     * AuditEvent.purposeOfEvent. For example, during a machine-to-machine transfer it might not be
     * obvious to the audit system who caused the event, but it does know why.
     */
    public var purposeOfUse: List<CodeableConcept?>? = null,
  ) : BackboneElement() {
    /**
     * Logical network location for application activity, if the activity has a network location.
     */
    @Serializable(with = AuditEventAgentNetworkSerializer::class)
    public class Network(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * An identifier for the network access point of the user device for the audit event.
       *
       * This could be a device id, IP address or some other identifier associated with a device.
       */
      public var address: String? = null,
      /** An identifier for the type of network access point that originated the audit event. */
      public var type: Enumeration<AuditEventAgentNetworkType>? = null,
    ) : BackboneElement()
  }

  /** The system that is reporting the event. */
  @Serializable(with = AuditEventSourceSerializer::class)
  public class Source(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
     * Logical source location within the healthcare enterprise network. For example, a hospital or
     * other provider location within a multi-entity provider group.
     */
    public var site: String? = null,
    /** Identifier of the source where the event was detected. */
    public var observer: Reference? = null,
    /** Code specifying the type of source where event originated. */
    public var type: List<Coding?>? = null,
  ) : BackboneElement()

  /** Specific instances of data or objects that have been accessed. */
  @Serializable(with = AuditEventEntitySerializer::class)
  public class Entity(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
    /** Identifies a specific instance of the entity. The reference should be version specific. */
    public var what: Reference? = null,
    /**
     * The type of the object that was involved in this audit event.
     *
     * This value is distinct from the user's role or any user relationship to the entity.
     */
    public var type: Coding? = null,
    /** Code representing the role the entity played in the event being audited. */
    public var role: Coding? = null,
    /**
     * Identifier for the data life-cycle stage for the entity.
     *
     * This can be used to provide an audit trail for data, over time, as it passes through the
     * system.
     */
    public var lifecycle: Coding? = null,
    /**
     * Security labels for the identified entity.
     *
     * Copied from entity meta security tags.
     */
    public var securityLabel: List<Coding?>? = null,
    /**
     * A name of the entity in the audit event.
     *
     * This field may be used in a query/report to identify audit events for a specific person. For
     * example, where multiple synonymous entity identifiers (patient number, medical record number,
     * encounter number, etc.) have been used.
     */
    public var name: String? = null,
    /** Text that describes the entity in more detail. */
    public var description: String? = null,
    /**
     * The query parameters for a query-type entities.
     *
     * The meaning and secondary-encoding of the content of base64 encoded blob is specific to the
     * AuditEvent.type, AuditEvent.subtype, AuditEvent.entity.type, and AuditEvent.entity.role. The
     * base64 is a general-use and safe container for event specific data blobs regardless of the
     * encoding used by the transaction being recorded. An AuditEvent consuming application must
     * understand the event it is consuming and the formats used by the event. For example, if
     * auditing an Oracle network database access, the Oracle formats must be understood as they
     * will be simply encoded in the base64binary blob.
     */
    public var query: Base64Binary? = null,
    /** Tagged value pairs for conveying additional information about the entity. */
    public var detail: List<Detail>? = null,
  ) : BackboneElement() {
    /** Tagged value pairs for conveying additional information about the entity. */
    @Serializable(with = AuditEventEntityDetailSerializer::class)
    public class Detail(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      override var modifierExtension: List<Extension?>? = null,
      /** The type of extra detail provided in the value. */
      public var type: String? = null,
      /**
       * The value of the extra detail.
       *
       * The value can be string when known to be a string, else base64 encoding should be used to
       * protect binary or undefined content. The meaning and secondary-encoding of the content of
       * base64 encoded blob is specific to the AuditEvent.type, AuditEvent.subtype,
       * AuditEvent.entity.type, and AuditEvent.entity.role. The base64 is a general-use and safe
       * container for event specific data blobs regardless of the encoding used by the transaction
       * being recorded. An AuditEvent consuming application must understand the event it is
       * consuming and the formats used by the event. For example if auditing an Oracle network
       * database access, the Oracle formats must be understood as they will be simply encoded in
       * the base64binary blob.
       */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asString(): String? = this as? String

        public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

        public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

        public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
          Value

        public companion object {
          public fun from(
            stringValue: com.google.fhir.model.r4.String?,
            base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
          ): Value? {
            if (stringValue != null) return String(stringValue)
            if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
            return null
          }
        }
      }
    }
  }

  /** The type of network access point of this agent in the audit event. */
  public enum class AuditEventAgentNetworkType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The machine name, including DNS name. */
    _1(
      "1",
      "http://hl7.org/fhir/network-type",
      "Machine Name",
      "The machine name, including DNS name.",
    ),
    /** The assigned Internet Protocol (IP) address. */
    _2(
      "2",
      "http://hl7.org/fhir/network-type",
      "IP Address",
      "The assigned Internet Protocol (IP) address.",
    ),
    /** The assigned telephone number. */
    _3(
      "3",
      "http://hl7.org/fhir/network-type",
      "Telephone Number",
      "The assigned telephone number.",
    ),
    /** The assigned email address. */
    _4("4", "http://hl7.org/fhir/network-type", "Email address", "The assigned email address."),
    /** URI (User directory, HTTP-PUT, ftp, etc.). */
    _5(
      "5",
      "http://hl7.org/fhir/network-type",
      "URI",
      "URI (User directory, HTTP-PUT, ftp, etc.).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AuditEventAgentNetworkType =
        when (code) {
          "1" -> _1
          "2" -> _2
          "3" -> _3
          "4" -> _4
          "5" -> _5
          else ->
            throw IllegalArgumentException("Unknown code $code for enum AuditEventAgentNetworkType")
        }
    }
  }

  /** Indicator for type of action performed during the event that generated the event. */
  public enum class AuditEventAction(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Create a new database object, such as placing an order. */
    C(
      "C",
      "http://hl7.org/fhir/audit-event-action",
      "Create",
      "Create a new database object, such as placing an order.",
    ),
    /** Display or print data, such as a doctor census. */
    R(
      "R",
      "http://hl7.org/fhir/audit-event-action",
      "Read/View/Print",
      "Display or print data, such as a doctor census.",
    ),
    /** Update data, such as revise patient information. */
    U(
      "U",
      "http://hl7.org/fhir/audit-event-action",
      "Update",
      "Update data, such as revise patient information.",
    ),
    /** Delete items, such as a doctor master file record. */
    D(
      "D",
      "http://hl7.org/fhir/audit-event-action",
      "Delete",
      "Delete items, such as a doctor master file record.",
    ),
    /**
     * Perform a system or application function such as log-on, program execution or use of an
     * object's method, or perform a query/search operation.
     */
    E(
      "E",
      "http://hl7.org/fhir/audit-event-action",
      "Execute",
      "Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AuditEventAction =
        when (code) {
          "C" -> C
          "R" -> R
          "U" -> U
          "D" -> D
          "E" -> E
          else -> throw IllegalArgumentException("Unknown code $code for enum AuditEventAction")
        }
    }
  }

  /** Indicates whether the event succeeded or failed. */
  public enum class AuditEventOutcome(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The operation completed successfully (whether with warnings or not). */
    _0(
      "0",
      "http://hl7.org/fhir/audit-event-outcome",
      "Success",
      "The operation completed successfully (whether with warnings or not).",
    ),
    /**
     * The action was not successful due to some kind of minor failure (often equivalent to an HTTP
     * 400 response).
     */
    _4(
      "4",
      "http://hl7.org/fhir/audit-event-outcome",
      "Minor failure",
      "The action was not successful due to some kind of minor failure (often equivalent to an HTTP 400 response).",
    ),
    /**
     * The action was not successful due to some kind of unexpected error (often equivalent to an
     * HTTP 500 response).
     */
    _8(
      "8",
      "http://hl7.org/fhir/audit-event-outcome",
      "Serious failure",
      "The action was not successful due to some kind of unexpected error (often equivalent to an HTTP 500 response).",
    ),
    /**
     * An error of such magnitude occurred that the system is no longer available for use (i.e. the
     * system died).
     */
    _12(
      "12",
      "http://hl7.org/fhir/audit-event-outcome",
      "Major failure",
      "An error of such magnitude occurred that the system is no longer available for use (i.e. the system died).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AuditEventOutcome =
        when (code) {
          "0" -> _0
          "4" -> _4
          "8" -> _8
          "12" -> _12
          else -> throw IllegalArgumentException("Unknown code $code for enum AuditEventOutcome")
        }
    }
  }
}
