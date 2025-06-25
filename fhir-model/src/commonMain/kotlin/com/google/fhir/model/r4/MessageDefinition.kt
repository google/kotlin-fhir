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

import com.google.fhir.model.r4.serializers.MessageDefinitionAllowedResponseSerializer
import com.google.fhir.model.r4.serializers.MessageDefinitionFocusSerializer
import com.google.fhir.model.r4.serializers.MessageDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines the characteristics of a message that can be shared between systems, including the type
 * of event that initiates the message, the content to be transmitted and what response(s), if any,
 * are permitted.
 */
@Serializable(with = MessageDefinitionSerializer::class)
@SerialName("MessageDefinition")
public data class MessageDefinition(
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
   * The business identifier that is used to reference the MessageDefinition and *is* expected to be
   * consistent from server to server.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   *
   * The determination of when to create a new version of a resource (same url, new version) vs.
   * defining a new artifact is up to the author. Considerations for making this decision are found
   * in [Technical and Business Versions](resource.html#versions).
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the [meta.source](resource.html#meta) element to indicate where
   * the current master source of the resource can be found.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this message definition when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this message definition outside of FHIR, where it is not possible
   * to use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the message definition when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the message definition author and is not expected to be globally unique. For example, it might
   * be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence.
   *
   * There may be different message definition instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the message definition with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the message definition. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the message definition.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /** A MessageDefinition that is superseded by this definition. */
  public var replaces: List<Canonical?>? = null,
  /**
   * The status of this message definition. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of message definitions that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this message definition is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of message definitions that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the message definition was published. The date must change
   * when the business version changes and it must change if the status code changes. In addition,
   * it should change when the substantive content of the message definition changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the message definition. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the message definition.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the message
   * definition is the organization or individual primarily responsible for the maintenance and
   * upkeep of the message definition. This is not necessarily the same individual or organization
   * that developed and initially authored the content. The publisher is the primary point of
   * contact for questions or issues with the message definition. This item SHOULD be populated
   * unless the information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the message definition from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as why the message definition was built,
   * comments about misuse, instructions for clinical use and interpretation, literature references,
   * examples from the paper world, etc. It is not a rendering of the message definition as conveyed
   * in the 'text' field of the resource itself. This item SHOULD be populated unless the
   * information is available from context (e.g. the language of the message definition is presumed
   * to be the predominant language in the place the message definition was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate message definition instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the message definition is intended to be used.
   *
   * It may be possible for the message definition to be used in jurisdictions other than those for
   * which it was originally designed or intended.
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this message definition is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the message definition. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * message definition.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the message definition and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the message
   * definition.
   */
  public var copyright: Markdown? = null,
  /** The MessageDefinition that is the basis for the contents of this resource. */
  public var base: Canonical? = null,
  /**
   * Identifies a protocol or workflow that this MessageDefinition represents a step in.
   *
   * It should be possible to use MessageDefinition to describe a message to be used by certain
   * steps in a particular protocol as part of a PlanDefinition or ActivityDefinition.
   */
  public var parent: List<Canonical?>? = null,
  /** Event code or link to the EventDefinition. */
  public var event: Event? = null,
  /** The impact of the content of the message. */
  public var category: Enumeration<MessageSignificanceCategory>? = null,
  /**
   * Identifies the resource (or resources) that are being addressed by the event. For example, the
   * Encounter for an admit message or two Account records for a merge.
   */
  public var focus: List<Focus>? = null,
  /**
   * Declare at a message definition level whether a response is required or only upon error or
   * success, or never.
   *
   * This enables the capability currently available through MSH-16 (Application Level
   * acknowledgement) in HL7 Version 2 to declare at a message instance level whether a response is
   * required or only upon error or success, or never.
   */
  public var responseRequired: Enumeration<MessageheaderResponseRequest>? = null,
  /**
   * Indicates what types of messages may be sent as an application-level response to this message.
   *
   * This indicates an application level response to "close" a transaction implicit in a particular
   * request message. To define a complete workflow scenario, look to the [[PlanDefinition]]
   * resource which allows the definition of complex orchestrations, conditionality, etc.
   */
  public var allowedResponse: List<AllowedResponse>? = null,
  /**
   * Canonical reference to a GraphDefinition. If a URL is provided, it is the canonical reference
   * to a [GraphDefinition](graphdefinition.html) that it controls what resources are to be added to
   * the bundle when building the document. The GraphDefinition can also specify profiles that apply
   * to the various resources.
   */
  public var graph: List<Canonical?>? = null,
) : DomainResource() {
  /**
   * Identifies the resource (or resources) that are being addressed by the event. For example, the
   * Encounter for an admit message or two Account records for a merge.
   */
  @Serializable(with = MessageDefinitionFocusSerializer::class)
  public class Focus(
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
     * The kind of resource that must be the focus for this message.
     *
     * Multiple focuses addressing different resources may occasionally occur. E.g. to link or
     * unlink a resource from a particular account or encounter, etc.
     */
    public var code: Enumeration<ResourceType>? = null,
    /**
     * A profile that reflects constraints for the focal resource (and potentially for related
     * resources).
     *
     * This should be present for most message definitions. However, if the message focus is only a
     * single resource and there is no need to include referenced resources or otherwise enforce the
     * presence of particular elements, it can be omitted.
     */
    public var profile: Canonical? = null,
    /**
     * Identifies the minimum number of resources of this type that must be pointed to by a message
     * in order for it to be valid against this MessageDefinition.
     */
    public var min: UnsignedInt? = null,
    /**
     * Identifies the maximum number of resources of this type that must be pointed to by a message
     * in order for it to be valid against this MessageDefinition.
     */
    public var max: String? = null,
  ) : BackboneElement()

  /**
   * Indicates what types of messages may be sent as an application-level response to this message.
   */
  @Serializable(with = MessageDefinitionAllowedResponseSerializer::class)
  public class AllowedResponse(
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
    /** A reference to the message definition that must be adhered to by this supported response. */
    public var message: Canonical? = null,
    /**
     * Provides a description of the circumstances in which this response should be used (as opposed
     * to one of the alternative responses).
     */
    public var situation: Markdown? = null,
  ) : BackboneElement()

  public sealed interface Event {
    public fun asCoding(): Coding? = this as? Coding

    public fun asUri(): Uri? = this as? Uri

    public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Event

    public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Event

    public companion object {
      public fun from(
        CodingValue: com.google.fhir.model.r4.Coding?,
        uriValue: com.google.fhir.model.r4.Uri?,
      ): Event? {
        if (CodingValue != null) return Coding(CodingValue)
        if (uriValue != null) return Uri(uriValue)
        return null
      }
    }
  }

  /** The impact of the content of a message. */
  public enum class MessageSignificanceCategory(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The message represents/requests a change that should not be processed more than once; e.g.,
     * making a booking for an appointment.
     */
    Consequence(
      "consequence",
      "http://hl7.org/fhir/message-significance-category",
      "Consequence",
      "The message represents/requests a change that should not be processed more than once; e.g., making a booking for an appointment.",
    ),
    /**
     * The message represents a response to query for current information. Retrospective processing
     * is wrong and/or wasteful.
     */
    Currency(
      "currency",
      "http://hl7.org/fhir/message-significance-category",
      "Currency",
      "The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.",
    ),
    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though
     * there may be version issues created by processing old notifications.
     */
    Notification(
      "notification",
      "http://hl7.org/fhir/message-significance-category",
      "Notification",
      "The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): MessageSignificanceCategory =
        when (code) {
          "consequence" -> Consequence
          "currency" -> Currency
          "notification" -> Notification
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum MessageSignificanceCategory"
            )
        }
    }
  }

  /**
   * HL7-defined table of codes which identify conditions under which acknowledgments are required
   * to be returned in response to a message.
   */
  public enum class MessageheaderResponseRequest(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** initiator expects a response for this message. */
    Always(
      "always",
      "http://hl7.org/fhir/messageheader-response-request",
      "Always",
      "initiator expects a response for this message.",
    ),
    /** initiator expects a response only if in error. */
    On_Error(
      "on-error",
      "http://hl7.org/fhir/messageheader-response-request",
      "Error/reject conditions only",
      "initiator expects a response only if in error.",
    ),
    /** initiator does not expect a response. */
    Never(
      "never",
      "http://hl7.org/fhir/messageheader-response-request",
      "Never",
      "initiator does not expect a response.",
    ),
    /** initiator expects a response only if successful. */
    On_Success(
      "on-success",
      "http://hl7.org/fhir/messageheader-response-request",
      "Successful completion only",
      "initiator expects a response only if successful.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): MessageheaderResponseRequest =
        when (code) {
          "always" -> Always
          "on-error" -> On_Error
          "never" -> Never
          "on-success" -> On_Success
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum MessageheaderResponseRequest"
            )
        }
    }
  }
}
