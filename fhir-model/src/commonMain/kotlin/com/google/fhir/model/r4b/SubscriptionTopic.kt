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

import com.google.fhir.model.r4b.serializers.SubscriptionTopicCanFilterBySerializer
import com.google.fhir.model.r4b.serializers.SubscriptionTopicEventTriggerSerializer
import com.google.fhir.model.r4b.serializers.SubscriptionTopicNotificationShapeSerializer
import com.google.fhir.model.r4b.serializers.SubscriptionTopicResourceTriggerQueryCriteriaSerializer
import com.google.fhir.model.r4b.serializers.SubscriptionTopicResourceTriggerSerializer
import com.google.fhir.model.r4b.serializers.SubscriptionTopicSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a stream of resource state changes identified by trigger criteria and annotated with
 * labels useful to filter projections from this topic.
 */
@Serializable(with = SubscriptionTopicSerializer::class)
@SerialName("SubscriptionTopic")
public data class SubscriptionTopic(
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
   * An absolute URI that is used to identify this subscription topic when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this subscription topic is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the subscription topic is stored on different servers.
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
  public var url: Uri,
  /**
   * Business identifiers assigned to this subscription topic by the performer and/or other systems.
   * These identifiers remain constant as the resource is updated and propagates from server to
   * server.
   *
   * Note: This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The identifier that is used to identify this version of the subscription topic when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the Topic author and is not expected to be globally unique. For example, it might be a
   * timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions are orderable.
   *
   * There may be multiple different instances of a subscription topic that have the same identifier
   * but different versions.
   */
  public var version: String? = null,
  /**
   * A short, descriptive, user-friendly title for the SubscriptionTopic, for example, "admission".
   */
  public var title: String? = null,
  /**
   * The canonical URL pointing to another FHIR-defined SubscriptionTopic that is adhered to in
   * whole or in part by this SubscriptionTopic.
   */
  public var derivedFrom: MutableList<Canonical> = mutableListOf(),
  /**
   * The current state of the SubscriptionTopic.
   *
   * A nominal state-transition diagram can be found in the [[definition.html#statemachine |
   * Definition pattern]] documentation
   *
   * Unknown does not represent "other" - one of the defined statuses must apply. Unknown is used
   * when the authoring system is not sure what the current status is.
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A flag to indicate that this TopSubscriptionTopicic is authored for testing purposes (or
   * education/evaluation/marketing), and is not intended to be used for genuine usage.
   *
   * Allows filtering of SubscriptionTopic that are appropriate for use vs. not.
   */
  public var experimental: Boolean? = null,
  /**
   * For draft definitions, indicates the date of initial creation. For active definitions,
   * represents the date of activation. For withdrawn definitions, indicates the date of withdrawal.
   */
  public var date: DateTime? = null,
  /**
   * Helps establish the "authority/credibility" of the SubscriptionTopic. May also allow for
   * contact.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * A free text natural language description of the Topic from the consumer's perspective.
   *
   * This description can be used to capture details such as why the Topic was built, comments about
   * misuse, instructions for clinical use and interpretation, literature references, examples from
   * the paper world, etc. It is not a rendering of the module as conveyed in the text field of the
   * resource itself. This item SHOULD be populated unless the information is available from
   * context.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These terms may be used to assist with indexing and searching of code system definitions.
   *
   * When multiple usageContexts are specified, there is no expectation for whether all or any of
   * the contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /** A jurisdiction in which the Topic is intended to be used. */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Explains why this Topic is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the Topic. Rather it is for traceability of ''why''
   * the resource is either needed or ''why'' it is defined as it is. This may be used to point to
   * source materials or specifications that drove the structure of this Topic.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the SubscriptionTopic and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the SubscriptionTopic.
   */
  public var copyright: Markdown? = null,
  /**
   * The date on which the asset content was approved by the publisher. Approval happens once when
   * the content is officially approved for usage.
   *
   * The date may be more recent than the approval date because of minor changes / editorial
   * corrections.
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the asset content was last reviewed. Review happens periodically after that,
   * but doesn't change the original approval date.
   *
   * If specified, this is usually after the approval date.
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the SubscriptionTopic content was or is planned to be effective.
   *
   * The effective period for a SubscriptionTopic determines when the content is applicable for
   * usage and is independent of publication and review dates. For example, a measure intended to be
   * used for the year 2016 would be published in 2015.
   */
  public var effectivePeriod: Period? = null,
  /**
   * A definition of a resource-based event that triggers a notification based on the
   * SubscriptionTopic. The criteria may be just a human readable description and/or a full FHIR
   * search string or FHIRPath expression. Multiple triggers are considered OR joined (e.g., a
   * resource update matching ANY of the definitions will trigger a notification).
   */
  public var resourceTrigger: MutableList<ResourceTrigger> = mutableListOf(),
  /** Event definition which can be used to trigger the SubscriptionTopic. */
  public var eventTrigger: MutableList<EventTrigger> = mutableListOf(),
  /**
   * List of properties by which Subscriptions on the SubscriptionTopic can be filtered. May be
   * defined Search Parameters (e.g., Encounter.patient) or parameters defined within this
   * SubscriptionTopic context (e.g., hub.event).
   */
  public var canFilterBy: MutableList<CanFilterBy> = mutableListOf(),
  /**
   * List of properties to describe the shape (e.g., resources) included in notifications from this
   * Subscription Topic.
   */
  public var notificationShape: MutableList<NotificationShape> = mutableListOf(),
) : DomainResource() {
  /**
   * A definition of a resource-based event that triggers a notification based on the
   * SubscriptionTopic. The criteria may be just a human readable description and/or a full FHIR
   * search string or FHIRPath expression. Multiple triggers are considered OR joined (e.g., a
   * resource update matching ANY of the definitions will trigger a notification).
   */
  @Serializable(with = SubscriptionTopicResourceTriggerSerializer::class)
  public class ResourceTrigger(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * The human readable description of this resource trigger for the SubscriptionTopic - for
     * example, "An Encounter enters the 'in-progress' state".
     *
     * Implementation of particular subscription topics might not use a computable definition and
     * instead base their design on the definition.
     */
    public var description: Markdown? = null,
    /**
     * URL of the Resource that is the type used in this resource trigger. Relative URLs are
     * relative to the StructureDefinition root of the implemented FHIR version (e.g.,
     * http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to
     * http://hl7.org/fhir/StructureDefinition/Patient. For more information, see <a
     * href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
     */
    public var resource: Uri,
    /**
     * The FHIR RESTful interaction which can be used to trigger a notification for the
     * SubscriptionTopic. Multiple values are considered OR joined (e.g., CREATE or UPDATE).
     */
    public var supportedInteraction: MutableList<Enumeration<MethodCode>> = mutableListOf(),
    /**
     * The FHIR query based rules that the server should use to determine when to trigger a
     * notification for this subscription topic.
     */
    public var queryCriteria: QueryCriteria? = null,
    /**
     * The FHIRPath based rules that the server should use to determine when to trigger a
     * notification for this topic.
     *
     * FHIRPath expression with %previous and %current vars.
     */
    public var fhirPathCriteria: String? = null,
  ) : BackboneElement() {
    /**
     * The FHIR query based rules that the server should use to determine when to trigger a
     * notification for this subscription topic.
     */
    @Serializable(with = SubscriptionTopicResourceTriggerQueryCriteriaSerializer::class)
    public class QueryCriteria(
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * The FHIR query based rules are applied to the previous resource state (e.g., state before
       * an update).
       *
       * The rules are search criteria (without the [base] part). Like Bundle.entry.request.url, it
       * has no leading "/".
       */
      public var previous: String? = null,
      /**
       * For "create" interactions, should the "previous" criteria count as an automatic pass or an
       * automatic fail.
       */
      public var resultForCreate: Enumeration<CriteriaNotExistsBehavior>? = null,
      /**
       * The FHIR query based rules are applied to the current resource state (e.g., state after an
       * update).
       *
       * The rules are search criteria (without the [base] part). Like Bundle.entry.request.url, it
       * has no leading "/".
       */
      public var current: String? = null,
      /**
       * For "delete" interactions, should the "current" criteria count as an automatic pass or an
       * automatic fail.
       */
      public var resultForDelete: Enumeration<CriteriaNotExistsBehavior>? = null,
      /**
       * If set to true, both current and previous criteria must evaluate true to trigger a
       * notification for this topic. Otherwise a notification for this topic will be triggered if
       * either one evaluates to true.
       */
      public var requireBoth: Boolean? = null,
    ) : BackboneElement()
  }

  /** Event definition which can be used to trigger the SubscriptionTopic. */
  @Serializable(with = SubscriptionTopicEventTriggerSerializer::class)
  public class EventTrigger(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * The human readable description of an event to trigger a notification for the
     * SubscriptionTopic - for example, "Patient Admission, as defined in HL7v2 via message
     * ADT^A01". Multiple values are considered OR joined (e.g., matching any single event listed).
     *
     * Implementation of particular subscription topics might not use a computable definition and
     * instead base their design on the definition.
     */
    public var description: Markdown? = null,
    /**
     * A well-defined event which can be used to trigger notifications from the SubscriptionTopic.
     */
    public var event: CodeableConcept,
    /**
     * URL of the Resource that is the focus type used in this event trigger. Relative URLs are
     * relative to the StructureDefinition root of the implemented FHIR version (e.g.,
     * http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to
     * http://hl7.org/fhir/StructureDefinition/Patient. For more information, see <a
     * href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
     */
    public var resource: Uri,
  ) : BackboneElement()

  /**
   * List of properties by which Subscriptions on the SubscriptionTopic can be filtered. May be
   * defined Search Parameters (e.g., Encounter.patient) or parameters defined within this
   * SubscriptionTopic context (e.g., hub.event).
   */
  @Serializable(with = SubscriptionTopicCanFilterBySerializer::class)
  public class CanFilterBy(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** Description of how this filtering parameter is intended to be used. */
    public var description: Markdown? = null,
    /**
     * URL of the Resource that is the type used in this filter. This is the "focus" of the topic
     * (or one of them if there are more than one). It will be the same, a generality, or a
     * specificity of SubscriptionTopic.resourceTrigger.resource or
     * SubscriptionTopic.eventTrigger.resource when they are present.
     *
     * URL of the Resource that is the type used in this filter. Relative URLs are relative to the
     * StructureDefinition root of the implemented FHIR version (e.g.,
     * http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to
     * http://hl7.org/fhir/StructureDefinition/Patient. For more information, see <a
     * href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
     */
    public var resource: Uri? = null,
    /**
     * Either the canonical URL to a search parameter (like
     * "http://hl7.org/fhir/SearchParameter/encounter-patient") or topic-defined parameter (like
     * "hub.event") which is a label for the filter.
     *
     * Chained parameters are allowed (like "patient.gender") - but can not use colons or modifiers.
     */
    public var filterParameter: String,
    /**
     * Either the canonical URL to a search parameter (like
     * "http://hl7.org/fhir/SearchParameter/encounter-patient") or the officially-defined URI for a
     * shared filter concept (like "http://example.org/concepts/shared-common-event").
     *
     * Chained parameters are allowed (like "patient.gender") - but can not use colons or modifiers.
     */
    public var filterDefinition: Uri? = null,
    /**
     * Allowable operators to apply when determining matches (Search Modifiers). If the
     * filterParameter is a SearchParameter, this list of modifiers SHALL be a strict subset of the
     * modifiers defined on that SearchParameter.
     */
    public var modifier: MutableList<Enumeration<SubscriptionTopicFilterBySearchModifier>> =
      mutableListOf(),
  ) : BackboneElement()

  /**
   * List of properties to describe the shape (e.g., resources) included in notifications from this
   * Subscription Topic.
   */
  @Serializable(with = SubscriptionTopicNotificationShapeSerializer::class)
  public class NotificationShape(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * URL of the Resource that is the type used in this shape. This is the "focus" of the topic (or
     * one of them if there are more than one) and the root resource for this shape definition. It
     * will be the same, a generality, or a specificity of
     * SubscriptionTopic.resourceTrigger.resource or SubscriptionTopic.eventTrigger.resource when
     * they are present.
     *
     * URL of the Resource that is the type used in this shape. Relative URLs are relative to the
     * StructureDefinition root of the implemented FHIR version (e.g.,
     * http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to
     * http://hl7.org/fhir/StructureDefinition/Patient. For more information, see <a
     * href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
     */
    public var resource: Uri,
    /**
     * Search-style _include directives, rooted in the resource for this shape. Servers SHOULD
     * include resources listed here, if they exist and the user is authorized to receive them.
     * Clients SHOULD be prepared to receive these additional resources, but SHALL function properly
     * without them.
     */
    public var include: MutableList<String> = mutableListOf(),
    /**
     * Search-style _revinclude directives, rooted in the resource for this shape. Servers SHOULD
     * include resources listed here, if they exist and the user is authorized to receive them.
     * Clients SHOULD be prepared to receive these additional resources, but SHALL function properly
     * without them.
     */
    public var revInclude: MutableList<String> = mutableListOf(),
  ) : BackboneElement()

  /** FHIR RESTful interaction codes used for SubscriptionTopic trigger. */
  public enum class MethodCode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Create("create", "http://hl7.org/fhir/restful-interaction", "create"),
    Update("update", "http://hl7.org/fhir/restful-interaction", "update"),
    Delete("delete", "http://hl7.org/fhir/restful-interaction", "delete");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): MethodCode =
        when (code) {
          "create" -> Create
          "update" -> Update
          "delete" -> Delete
          else -> throw IllegalArgumentException("Unknown code $code for enum MethodCode")
        }
    }
  }

  /**
   * Behavior a server can exhibit when a criteria state does not exist (e.g., state prior to a
   * create or after a delete).
   */
  public enum class CriteriaNotExistsBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Test_Passes("test-passes", "http://hl7.org/fhir/subscriptiontopic-cr-behavior", "test passes"),
    Test_Fails("test-fails", "http://hl7.org/fhir/subscriptiontopic-cr-behavior", "test fails");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): CriteriaNotExistsBehavior =
        when (code) {
          "test-passes" -> Test_Passes
          "test-fails" -> Test_Fails
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CriteriaNotExistsBehavior")
        }
    }
  }

  /** FHIR search modifiers allowed for use in Subscriptions and SubscriptionTopics. */
  public enum class SubscriptionTopicFilterBySearchModifier(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    EqualTo("=", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "="),
    Eq("eq", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Equal"),
    Ne("ne", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Not Equal"),
    Gt("gt", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Greater Than"),
    Lt("lt", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Less Than"),
    Ge(
      "ge",
      "http://terminology.hl7.org/CodeSystem/subscription-search-modifier",
      "Greater Than or Equal",
    ),
    Le(
      "le",
      "http://terminology.hl7.org/CodeSystem/subscription-search-modifier",
      "Less Than or Equal",
    ),
    Sa("sa", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Starts After"),
    Eb("eb", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Ends Before"),
    Ap("ap", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Approximately"),
    Above("above", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Above"),
    Below("below", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "Below"),
    In("in", "http://terminology.hl7.org/CodeSystem/subscription-search-modifier", "In"),
    Not_In(
      "not-in",
      "http://terminology.hl7.org/CodeSystem/subscription-search-modifier",
      "Not In",
    ),
    Of_Type(
      "of-type",
      "http://terminology.hl7.org/CodeSystem/subscription-search-modifier",
      "Of Type",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): SubscriptionTopicFilterBySearchModifier =
        when (code) {
          "=" -> EqualTo
          "eq" -> Eq
          "ne" -> Ne
          "gt" -> Gt
          "lt" -> Lt
          "ge" -> Ge
          "le" -> Le
          "sa" -> Sa
          "eb" -> Eb
          "ap" -> Ap
          "above" -> Above
          "below" -> Below
          "in" -> In
          "not-in" -> Not_In
          "of-type" -> Of_Type
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum SubscriptionTopicFilterBySearchModifier"
            )
        }
    }
  }
}
