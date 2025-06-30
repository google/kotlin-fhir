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

import com.google.fhir.model.r5.serializers.RequestOrchestrationActionConditionSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionDefinitionSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionDynamicValueSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionInputSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionOutputSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionParticipantActorSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionParticipantSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionRelatedActionOffsetSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionRelatedActionSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationActionTimingSerializer
import com.google.fhir.model.r5.serializers.RequestOrchestrationSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A set of related requests that can be used to capture intended activities that have
 * inter-dependencies such as "give this medication after that one".
 */
@Serializable(with = RequestOrchestrationSerializer::class)
@SerialName("RequestOrchestration")
public data class RequestOrchestration(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
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
  /** Allows a service to provide a unique, business identifier for the request. */
  public var identifier: List<Identifier?>? = null,
  /**
   * A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition
   * that is adhered to in whole or in part by this request.
   */
  public var instantiatesCanonical: List<Canonical?>? = null,
  /**
   * A URL referencing an externally defined protocol, guideline, orderset or other definition that
   * is adhered to in whole or in part by this request.
   */
  public var instantiatesUri: List<Uri?>? = null,
  /** A plan, proposal or order that is fulfilled in whole or in part by this request. */
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
  /**
   * The current state of the request. For request orchestrations, the status reflects the status of
   * all the requests in the orchestration.
   */
  public var status: Enumeration<RequestStatus>? = null,
  /**
   * Indicates the level of authority/intentionality associated with the request and where the
   * request fits into the workflow chain.
   */
  public var intent: Enumeration<RequestIntent>? = null,
  /** Indicates how quickly the request should be addressed with respect to other requests. */
  public var priority: Enumeration<RequestPriority>? = null,
  /**
   * A code that identifies what the overall request orchestration is.
   *
   * This element can be used to provide a code that captures the meaning of the request
   * orchestration as a whole, as opposed to the code of the action element, which captures the
   * meaning of the individual actions within the request orchestration.
   */
  public var code: CodeableConcept? = null,
  /** The subject for which the request orchestration was created. */
  public var subject: Reference? = null,
  /** Describes the context of the request orchestration, if any. */
  public var encounter: Reference? = null,
  /** Indicates when the request orchestration was created. */
  public var authoredOn: DateTime? = null,
  /** Provides a reference to the author of the request orchestration. */
  public var author: Reference? = null,
  /** Describes the reason for the request orchestration in coded or textual form. */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Goals that are intended to be achieved by following the requests in this RequestOrchestration.
   */
  public var goal: List<Reference?>? = null,
  /** Provides a mechanism to communicate additional information about the response. */
  public var note: List<Annotation?>? = null,
  /** The actions, if any, produced by the evaluation of the artifact. */
  public var action: List<Action>? = null,
) : DomainResource() {
  /** The actions, if any, produced by the evaluation of the artifact. */
  @Serializable(with = RequestOrchestrationActionSerializer::class)
  public class Action(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
     * The linkId of the action from the PlanDefinition that corresponds to this action in the
     * RequestOrchestration resource.
     */
    public var linkId: String? = null,
    /**
     * A user-visible prefix for the action. For example a section or item numbering such as 1. or
     * A.
     */
    public var prefix: String? = null,
    /** The title of the action displayed to a user. */
    public var title: String? = null,
    /** A short description of the action used to provide a summary to display to the user. */
    public var description: Markdown? = null,
    /**
     * A text equivalent of the action to be performed. This provides a human-interpretable
     * description of the action when the definition is consumed by a system that might not be
     * capable of interpreting it dynamically.
     */
    public var textEquivalent: Markdown? = null,
    /** Indicates how quickly the action should be addressed with respect to other actions. */
    public var priority: Enumeration<RequestPriority>? = null,
    /**
     * A code that provides meaning for the action or action group. For example, a section may have
     * a LOINC code for a section of a documentation template.
     */
    public var code: List<CodeableConcept?>? = null,
    /**
     * Didactic or other informational resources associated with the action that can be provided to
     * the CDS recipient. Information resources can include inline text commentary and links to web
     * resources.
     */
    public var documentation: List<RelatedArtifact?>? = null,
    /** Goals that are intended to be achieved by following the requests in this action. */
    public var goal: List<Reference?>? = null,
    /**
     * An expression that describes applicability criteria, or start/stop conditions for the action.
     *
     * When multiple conditions of the same kind are present, the effects are combined using AND
     * semantics, so the overall condition is true only if all of the conditions are true.
     */
    public var condition: List<Condition>? = null,
    /** Defines input data requirements for the action. */
    public var input: List<Input>? = null,
    /** Defines the outputs of the action, if any. */
    public var output: List<Output>? = null,
    /** A relationship to another action such as "before" or "30-60 minutes after start of". */
    public var relatedAction: List<RelatedAction>? = null,
    /**
     * An optional value describing when the action should be performed.
     *
     * The intent of the timing element is to provide timing for when the action should be
     * performed. The timing may be absolute (specified as a dateTime or Period) or relative
     * (specified as an Age, Duration, or Range), or it may be a more complex, potentially repeating
     * timing specified using Timing.
     */
    public var timing: Timing? = null,
    /**
     * Identifies the facility where the action will occur; e.g. home, hospital, specific clinic,
     * etc.
     *
     * May reference a specific clinical location or may just identify a type of location.
     */
    public var location: CodeableReference? = null,
    /**
     * The participant that should perform or be responsible for this action.
     *
     * Because request orchestrations represent potential options for performing activities, some
     * specific participants may still be unknown, so this element allows for both definitional
     * participants (in the same way they are specified in ActivityDefinition and PlanDefinition
     * resources) as well as identifying specific participants when they are known.
     */
    public var participant: List<Participant>? = null,
    /** The type of action to perform (create, update, remove). */
    public var type: CodeableConcept? = null,
    /** Defines the grouping behavior for the action and its children. */
    public var groupingBehavior: Enumeration<ActionGroupingBehavior>? = null,
    /** Defines the selection behavior for the action and its children. */
    public var selectionBehavior: Enumeration<ActionSelectionBehavior>? = null,
    /** Defines expectations around whether an action is required. */
    public var requiredBehavior: Enumeration<ActionRequiredBehavior>? = null,
    /** Defines whether the action should usually be preselected. */
    public var precheckBehavior: Enumeration<ActionPrecheckBehavior>? = null,
    /** Defines whether the action can be selected multiple times. */
    public var cardinalityBehavior: Enumeration<ActionCardinalityBehavior>? = null,
    /**
     * The resource that is the target of the action (e.g. CommunicationRequest).
     *
     * The target resource SHALL be a [Request](request.html) resource with a Request.intent set to
     * "option".
     */
    public var resource: Reference? = null,
    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, a
     * PlanDefinition that describes a series of actions to be taken, a Questionnaire that should be
     * filled out, a SpecimenDefinition describing a specimen to be collected, or an
     * ObservationDefinition that specifies what observation should be captured.
     *
     * Note that the definition is optional, and if no definition is specified, a dynamicValue with
     * a root ($this) path can be used to define the entire resource dynamically.
     */
    public var definition: Definition? = null,
    /**
     * A reference to a StructureMap resource that defines a transform that can be executed to
     * produce the intent resource using the ActivityDefinition instance as the input.
     *
     * Note that when a referenced ActivityDefinition also defines a transform, the transform
     * specified here generally takes precedence. In addition, if both a transform and dynamic
     * values are specific, the dynamic values are applied to the result of the transform.
     */
    public var transform: Canonical? = null,
    /**
     * Customizations that should be applied to the statically defined resource. For example, if the
     * dosage of a medication must be computed based on the patient's weight, a customization would
     * be used to specify an expression that calculated the weight, and the path on the resource
     * that would contain the result.
     *
     * Dynamic values are applied in the order in which they are defined in the RequestOrchestration
     * resource. Note that when dynamic values are also specified by a referenced
     * ActivityDefinition, the dynamicValues from the ActivityDefinition are applied first, followed
     * by the dynamicValues specified here. In addition, if both a transform and dynamic values are
     * specific, the dynamic values are applied to the result of the transform.
     */
    public var dynamicValue: List<DynamicValue>? = null,
    /** Sub actions. */
    public var action: List<Action?>? = null,
  ) : BackboneElement() {
    /**
     * An expression that describes applicability criteria, or start/stop conditions for the action.
     */
    @Serializable(with = RequestOrchestrationActionConditionSerializer::class)
    public class Condition(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * The kind of condition.
       *
       * Applicability criteria are used to determine immediate applicability when a plan definition
       * is applied to a given context. Start and stop criteria are carried through application and
       * used to describe enter/exit criteria for an action.
       */
      public var kind: Enumeration<ActionConditionKind>? = null,
      /**
       * An expression that returns true or false, indicating whether or not the condition is
       * satisfied.
       *
       * The expression may be inlined, or may be a reference to a named expression within a logic
       * library referenced by the library element.
       */
      public var expression: Expression? = null,
    ) : BackboneElement()

    /** Defines input data requirements for the action. */
    @Serializable(with = RequestOrchestrationActionInputSerializer::class)
    public class Input(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * A human-readable label for the data requirement used to label data flows in BPMN or similar
       * diagrams. Also provides a human readable label when rendering the data requirement that
       * conveys its purpose to human readers.
       */
      public var title: String? = null,
      /** Defines the data that is to be provided as input to the action. */
      public var requirement: DataRequirement? = null,
      /**
       * Points to an existing input or output element that provides data to this input.
       *
       * The relatedData element allows indicating that an input to a parent action is an input to
       * specific child actions. It also allows the output of one action to be identified as the
       * input to a different action
       */
      public var relatedData: Id? = null,
    ) : BackboneElement()

    /** Defines the outputs of the action, if any. */
    @Serializable(with = RequestOrchestrationActionOutputSerializer::class)
    public class Output(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * A human-readable label for the data requirement used to label data flows in BPMN or similar
       * diagrams. Also provides a human readable label when rendering the data requirement that
       * conveys its purpose to human readers.
       */
      public var title: String? = null,
      /** Defines the data that results as output from the action. */
      public var requirement: DataRequirement? = null,
      /**
       * Points to an existing input or output element that is results as output from the action.
       *
       * The relatedData element allows indicating that the output of child action is also the
       * output of a parent action. It also allows the input of one action to be identified as the
       * output of a different action
       */
      public var relatedData: String? = null,
    ) : BackboneElement()

    /** A relationship to another action such as "before" or "30-60 minutes after start of". */
    @Serializable(with = RequestOrchestrationActionRelatedActionSerializer::class)
    public class RelatedAction(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /** The element id of the target related action. */
      public var targetId: Id? = null,
      /** The relationship of this action to the related action. */
      public var relationship: Enumeration<ActionRelationshipType>? = null,
      /** The relationship of the end of this action to the related action. */
      public var endRelationship: Enumeration<ActionRelationshipType>? = null,
      /**
       * A duration or range of durations to apply to the relationship. For example, 30-60 minutes
       * before.
       */
      public var offset: Offset? = null,
    ) : BackboneElement() {
      @Serializable(with = RequestOrchestrationActionRelatedActionOffsetSerializer::class)
      public sealed interface Offset {
        public fun asDuration(): Duration? = this as? Duration

        public fun asRange(): Range? = this as? Range

        public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Offset

        public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Offset

        public data object Null : Offset

        public companion object {
          public fun from(
            DurationValue: com.google.fhir.model.r5.Duration?,
            RangeValue: com.google.fhir.model.r5.Range?,
          ): Offset {
            if (DurationValue != null) return Duration(DurationValue)
            if (RangeValue != null) return Range(RangeValue)
            return Null
          }
        }
      }
    }

    /** The participant that should perform or be responsible for this action. */
    @Serializable(with = RequestOrchestrationActionParticipantSerializer::class)
    public class Participant(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /** The type of participant in the action. */
      public var type: Enumeration<ActivityParticipantType>? = null,
      /** The type of participant in the action. */
      public var typeCanonical: Canonical? = null,
      /**
       * The type of participant in the action.
       *
       * When this element is a reference, it SHOULD be a reference to a definitional resource (for
       * example, a location type, rather than a specific location).
       */
      public var typeReference: Reference? = null,
      /** The role the participant should play in performing the described action. */
      public var role: CodeableConcept? = null,
      /**
       * Indicates how the actor will be involved in the action - author, reviewer, witness, etc.
       */
      public var function: CodeableConcept? = null,
      /** A reference to the actual participant. */
      public var actor: Actor? = null,
    ) : BackboneElement() {
      @Serializable(with = RequestOrchestrationActionParticipantActorSerializer::class)
      public sealed interface Actor {
        public fun asCanonical(): Canonical? = this as? Canonical

        public fun asReference(): Reference? = this as? Reference

        public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Actor

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Actor

        public data object Null : Actor

        public companion object {
          public fun from(
            canonicalValue: com.google.fhir.model.r5.Canonical?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
          ): Actor {
            if (canonicalValue != null) return Canonical(canonicalValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return Null
          }
        }
      }
    }

    /**
     * Customizations that should be applied to the statically defined resource. For example, if the
     * dosage of a medication must be computed based on the patient's weight, a customization would
     * be used to specify an expression that calculated the weight, and the path on the resource
     * that would contain the result.
     */
    @Serializable(with = RequestOrchestrationActionDynamicValueSerializer::class)
    public class DynamicValue(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * The path to the element to be customized. This is the path on the resource that will hold
       * the result of the calculation defined by the expression. The specified path SHALL be a
       * FHIRPath resolvable on the specified target type of the ActivityDefinition, and SHALL
       * consist only of identifiers, constant indexers, and a restricted subset of functions. The
       * path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers
       * ([x]) to traverse multiple-cardinality sub-elements (see the
       * [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
       *
       * To specify the path to the current action being realized, the %action environment variable
       * is available in this path. For example, to specify the description element of the target
       * action, the path would be %action.description. The path attribute contains a
       * [Simple FHIRPath Subset](fhirpath.html#simple) that allows path traversal, but not
       * calculation.
       */
      public var path: String? = null,
      /**
       * An expression specifying the value of the customized element.
       *
       * The expression may be inlined or may be a reference to a named expression within a logic
       * library referenced by the library element.
       */
      public var expression: Expression? = null,
    ) : BackboneElement()

    @Serializable(with = RequestOrchestrationActionTimingSerializer::class)
    public sealed interface Timing {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asAge(): Age? = this as? Age

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public fun asRange(): Range? = this as? Range

      public fun asTiming(): Timing? = this as? Timing

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) :
        Action.Timing

      public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Action.Timing

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Action.Timing

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) :
        Action.Timing

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Action.Timing

      public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Action.Timing

      public data object Null : Action.Timing

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          AgeValue: com.google.fhir.model.r5.Age?,
          PeriodValue: com.google.fhir.model.r5.Period?,
          DurationValue: com.google.fhir.model.r5.Duration?,
          RangeValue: com.google.fhir.model.r5.Range?,
          TimingValue: com.google.fhir.model.r5.Timing?,
        ): Action.Timing {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (AgeValue != null) return Age(AgeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (DurationValue != null) return Duration(DurationValue)
          if (RangeValue != null) return Range(RangeValue)
          if (TimingValue != null) return Timing(TimingValue)
          return Null
        }
      }
    }

    @Serializable(with = RequestOrchestrationActionDefinitionSerializer::class)
    public sealed interface Definition {
      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asUri(): Uri? = this as? Uri

      public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
        Definition

      public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Definition

      public data object Null : Definition

      public companion object {
        public fun from(
          canonicalValue: com.google.fhir.model.r5.Canonical?,
          uriValue: com.google.fhir.model.r5.Uri?,
        ): Definition {
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (uriValue != null) return Uri(uriValue)
          return Null
        }
      }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class RequestPriority(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The request has normal priority. */
    Routine(
      "routine",
      "http://hl7.org/fhir/request-priority",
      "Routine",
      "The request has normal priority.",
    ),
    /** The request should be actioned promptly - higher priority than routine. */
    Urgent(
      "urgent",
      "http://hl7.org/fhir/request-priority",
      "Urgent",
      "The request should be actioned promptly - higher priority than routine.",
    ),
    /** The request should be actioned as soon as possible - higher priority than urgent. */
    Asap(
      "asap",
      "http://hl7.org/fhir/request-priority",
      "ASAP",
      "The request should be actioned as soon as possible - higher priority than urgent.",
    ),
    /**
     * The request should be actioned immediately - highest possible priority. E.g. an emergency.
     */
    Stat(
      "stat",
      "http://hl7.org/fhir/request-priority",
      "STAT",
      "The request should be actioned immediately - highest possible priority.  E.g. an emergency.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): RequestPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else -> throw IllegalArgumentException("Unknown code $code for enum RequestPriority")
        }
    }
  }

  /** Defines organization behavior of a group. */
  public enum class ActionGroupingBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Any group marked with this behavior should be displayed as a visual group to the end user.
     */
    Visual_Group(
      "visual-group",
      "http://hl7.org/fhir/action-grouping-behavior",
      "Visual Group",
      "Any group marked with this behavior should be displayed as a visual group to the end user.",
    ),
    /**
     * A group with this behavior logically groups its sub-elements, and may be shown as a visual
     * group to the end user, but it is not required to do so.
     */
    Logical_Group(
      "logical-group",
      "http://hl7.org/fhir/action-grouping-behavior",
      "Logical Group",
      "A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.",
    ),
    /**
     * A group of related alternative actions is a sentence group if the target referenced by the
     * action is the same in all the actions and each action simply constitutes a different
     * variation on how to specify the details for the target. For example, two actions that could
     * be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times
     * per day". In both cases, aspirin is the target referenced by the action, and the two actions
     * represent different options for how aspirin might be ordered for the patient. Note that a
     * SentenceGroup would almost always have an associated selection behavior of "AtMostOne",
     * unless it's a required action, in which case, it would be "ExactlyOne".
     */
    Sentence_Group(
      "sentence-group",
      "http://hl7.org/fhir/action-grouping-behavior",
      "Sentence Group",
      "A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are \"aspirin, 500 mg, 2 times per day\" and \"aspirin, 300 mg, 3 times per day\". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of \"AtMostOne\", unless it's a required action, in which case, it would be \"ExactlyOne\".",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionGroupingBehavior =
        when (code) {
          "visual-group" -> Visual_Group
          "logical-group" -> Logical_Group
          "sentence-group" -> Sentence_Group
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionGroupingBehavior")
        }
    }
  }

  /** Defines selection behavior of a group. */
  public enum class ActionSelectionBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Any number of the actions in the group may be chosen, from zero to all. */
    Any(
      "any",
      "http://hl7.org/fhir/action-selection-behavior",
      "Any",
      "Any number of the actions in the group may be chosen, from zero to all.",
    ),
    /** All the actions in the group must be selected as a single unit. */
    All(
      "all",
      "http://hl7.org/fhir/action-selection-behavior",
      "All",
      "All the actions in the group must be selected as a single unit.",
    ),
    /**
     * All the actions in the group are meant to be chosen as a single unit: either all must be
     * selected by the end user, or none may be selected.
     */
    All_Or_None(
      "all-or-none",
      "http://hl7.org/fhir/action-selection-behavior",
      "All Or None",
      "All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.",
    ),
    /**
     * The end user must choose one and only one of the selectable actions in the group. The user
     * SHALL NOT choose none of the actions in the group.
     */
    Exactly_One(
      "exactly-one",
      "http://hl7.org/fhir/action-selection-behavior",
      "Exactly One",
      "The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.",
    ),
    /** The end user may choose zero or at most one of the actions in the group. */
    At_Most_One(
      "at-most-one",
      "http://hl7.org/fhir/action-selection-behavior",
      "At Most One",
      "The end user may choose zero or at most one of the actions in the group.",
    ),
    /** The end user must choose a minimum of one, and as many additional as desired. */
    One_Or_More(
      "one-or-more",
      "http://hl7.org/fhir/action-selection-behavior",
      "One Or More",
      "The end user must choose a minimum of one, and as many additional as desired.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionSelectionBehavior =
        when (code) {
          "any" -> Any
          "all" -> All
          "all-or-none" -> All_Or_None
          "exactly-one" -> Exactly_One
          "at-most-one" -> At_Most_One
          "one-or-more" -> One_Or_More
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionSelectionBehavior")
        }
    }
  }

  /** Defines expectations around whether an action or action group is required. */
  public enum class ActionRequiredBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * An action with this behavior must be included in the actions processed by the end user; the
     * end user SHALL NOT choose not to include this action.
     */
    Must(
      "must",
      "http://hl7.org/fhir/action-required-behavior",
      "Must",
      "An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action.",
    ),
    /**
     * An action with this behavior may be included in the set of actions processed by the end user.
     */
    Could(
      "could",
      "http://hl7.org/fhir/action-required-behavior",
      "Could",
      "An action with this behavior may be included in the set of actions processed by the end user.",
    ),
    /**
     * An action with this behavior must be included in the set of actions processed by the end
     * user, unless the end user provides documentation as to why the action was not included.
     */
    Must_Unless_Documented(
      "must-unless-documented",
      "http://hl7.org/fhir/action-required-behavior",
      "Must Unless Documented",
      "An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionRequiredBehavior =
        when (code) {
          "must" -> Must
          "could" -> Could
          "must-unless-documented" -> Must_Unless_Documented
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionRequiredBehavior")
        }
    }
  }

  /** Defines selection frequency behavior for an action or group. */
  public enum class ActionPrecheckBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * An action with this behavior is one of the most frequent action that is, or should be,
     * included by an end user, for the particular context in which the action occurs. The system
     * displaying the action to the end user should consider "pre-checking" such an action as a
     * convenience for the user.
     */
    Yes(
      "yes",
      "http://hl7.org/fhir/action-precheck-behavior",
      "Yes",
      "An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider \"pre-checking\" such an action as a convenience for the user.",
    ),
    /**
     * An action with this behavior is one of the less frequent actions included by the end user,
     * for the particular context in which the action occurs. The system displaying the actions to
     * the end user would typically not "pre-check" such an action.
     */
    No(
      "no",
      "http://hl7.org/fhir/action-precheck-behavior",
      "No",
      "An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not \"pre-check\" such an action.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionPrecheckBehavior =
        when (code) {
          "yes" -> Yes
          "no" -> No
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionPrecheckBehavior")
        }
    }
  }

  /** Defines behavior for an action or a group for how many times that item may be repeated. */
  public enum class ActionCardinalityBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The action may only be selected one time. */
    Single(
      "single",
      "http://hl7.org/fhir/action-cardinality-behavior",
      "Single",
      "The action may only be selected one time.",
    ),
    /** The action may be selected multiple times. */
    Multiple(
      "multiple",
      "http://hl7.org/fhir/action-cardinality-behavior",
      "Multiple",
      "The action may be selected multiple times.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionCardinalityBehavior =
        when (code) {
          "single" -> Single
          "multiple" -> Multiple
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionCardinalityBehavior")
        }
    }
  }

  /** Defines the kinds of conditions that can appear on actions. */
  public enum class ActionConditionKind(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The condition describes whether or not a given action is applicable. */
    Applicability(
      "applicability",
      "http://hl7.org/fhir/action-condition-kind",
      "Applicability",
      "The condition describes whether or not a given action is applicable.",
    ),
    /** The condition is a starting condition for the action. */
    Start(
      "start",
      "http://hl7.org/fhir/action-condition-kind",
      "Start",
      "The condition is a starting condition for the action.",
    ),
    /** The condition is a stop, or exit condition for the action. */
    Stop(
      "stop",
      "http://hl7.org/fhir/action-condition-kind",
      "Stop",
      "The condition is a stop, or exit condition for the action.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionConditionKind =
        when (code) {
          "applicability" -> Applicability
          "start" -> Start
          "stop" -> Stop
          else -> throw IllegalArgumentException("Unknown code $code for enum ActionConditionKind")
        }
    }
  }

  /** Defines the types of relationships between actions. */
  public enum class ActionRelationshipType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The action must be performed before the related action. */
    Before(
      "before",
      "http://hl7.org/fhir/action-relationship-type",
      "Before",
      "The action must be performed before the related action.",
    ),
    /** The action must be performed before the start of the related action. */
    Before_Start(
      "before-start",
      "http://hl7.org/fhir/action-relationship-type",
      "Before Start",
      "The action must be performed before the start of the related action.",
    ),
    /** The action must be performed before the end of the related action. */
    Before_End(
      "before-end",
      "http://hl7.org/fhir/action-relationship-type",
      "Before End",
      "The action must be performed before the end of the related action.",
    ),
    /** The action must be performed concurrent with the related action. */
    Concurrent(
      "concurrent",
      "http://hl7.org/fhir/action-relationship-type",
      "Concurrent",
      "The action must be performed concurrent with the related action.",
    ),
    /** The action must be performed concurrent with the start of the related action. */
    Concurrent_With_Start(
      "concurrent-with-start",
      "http://hl7.org/fhir/action-relationship-type",
      "Concurrent With Start",
      "The action must be performed concurrent with the start of the related action.",
    ),
    /** The action must be performed concurrent with the end of the related action. */
    Concurrent_With_End(
      "concurrent-with-end",
      "http://hl7.org/fhir/action-relationship-type",
      "Concurrent With End",
      "The action must be performed concurrent with the end of the related action.",
    ),
    /** The action must be performed after the related action. */
    After(
      "after",
      "http://hl7.org/fhir/action-relationship-type",
      "After",
      "The action must be performed after the related action.",
    ),
    /** The action must be performed after the start of the related action. */
    After_Start(
      "after-start",
      "http://hl7.org/fhir/action-relationship-type",
      "After Start",
      "The action must be performed after the start of the related action.",
    ),
    /** The action must be performed after the end of the related action. */
    After_End(
      "after-end",
      "http://hl7.org/fhir/action-relationship-type",
      "After End",
      "The action must be performed after the end of the related action.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActionRelationshipType =
        when (code) {
          "before" -> Before
          "before-start" -> Before_Start
          "before-end" -> Before_End
          "concurrent" -> Concurrent
          "concurrent-with-start" -> Concurrent_With_Start
          "concurrent-with-end" -> Concurrent_With_End
          "after" -> After
          "after-start" -> After_Start
          "after-end" -> After_End
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionRelationshipType")
        }
    }
  }

  /** The type of participant for the action. */
  public enum class ActivityParticipantType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The participant is a care team caring for the patient under evaluation. */
    Careteam(
      "careteam",
      "http://hl7.org/fhir/action-participant-type",
      "CareTeam",
      "The participant is a care team caring for the patient under evaluation.",
    ),
    /** The participant is a system or device used in the care of the patient. */
    Device(
      "device",
      "http://hl7.org/fhir/action-participant-type",
      "Device",
      "The participant is a system or device used in the care of the patient.",
    ),
    /** The participant is a group of participants involved in the care of the patient. */
    Group(
      "group",
      "http://hl7.org/fhir/action-participant-type",
      "Group",
      "The participant is a group of participants involved in the care of the patient.",
    ),
    /**
     * The participant is an institution that can provide the given healthcare service used in the
     * care of the patient.
     */
    Healthcareservice(
      "healthcareservice",
      "http://hl7.org/fhir/action-participant-type",
      "HealthcareService",
      "The participant is an institution that can provide the given healthcare service used in the care of the patient.",
    ),
    /** The participant is a location involved in the care of the patient. */
    Location(
      "location",
      "http://hl7.org/fhir/action-participant-type",
      "Location",
      "The participant is a location involved in the care of the patient.",
    ),
    /** The participant is an organization involved in the care of the patient. */
    Organization(
      "organization",
      "http://hl7.org/fhir/action-participant-type",
      "Organization",
      "The participant is an organization involved in the care of the patient.",
    ),
    /** The participant is the patient under evaluation. */
    Patient(
      "patient",
      "http://hl7.org/fhir/action-participant-type",
      "Patient",
      "The participant is the patient under evaluation.",
    ),
    /** The participant is a practitioner involved in the patient's care. */
    Practitioner(
      "practitioner",
      "http://hl7.org/fhir/action-participant-type",
      "Practitioner",
      "The participant is a practitioner involved in the patient's care.",
    ),
    /** The participant is a particular practitioner role involved in the patient's care. */
    Practitionerrole(
      "practitionerrole",
      "http://hl7.org/fhir/action-participant-type",
      "PractitionerRole",
      "The participant is a particular practitioner role involved in the patient's care.",
    ),
    /** The participant is a person related to the patient. */
    Relatedperson(
      "relatedperson",
      "http://hl7.org/fhir/action-participant-type",
      "RelatedPerson",
      "The participant is a person related to the patient.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActivityParticipantType =
        when (code) {
          "careteam" -> Careteam
          "device" -> Device
          "group" -> Group
          "healthcareservice" -> Healthcareservice
          "location" -> Location
          "organization" -> Organization
          "patient" -> Patient
          "practitioner" -> Practitioner
          "practitionerrole" -> Practitionerrole
          "relatedperson" -> Relatedperson
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActivityParticipantType")
        }
    }
  }

  /** Codes identifying the lifecycle stage of a request. */
  public enum class RequestStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The request has been created but is not yet complete or ready for action. */
    Draft(
      "draft",
      "http://hl7.org/fhir/request-status",
      "Draft",
      "The request has been created but is not yet complete or ready for action.",
    ),
    /** The request is in force and ready to be acted upon. */
    Active(
      "active",
      "http://hl7.org/fhir/request-status",
      "Active",
      "The request is in force and ready to be acted upon.",
    ),
    /**
     * The request (and any implicit authorization to act) has been temporarily withdrawn but is
     * expected to resume in the future.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/request-status",
      "On Hold",
      "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.",
    ),
    /**
     * The request (and any implicit authorization to act) has been terminated prior to the known
     * full completion of the intended actions. No further activity should occur.
     */
    Revoked(
      "revoked",
      "http://hl7.org/fhir/request-status",
      "Revoked",
      "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.",
    ),
    /**
     * The activity described by the request has been fully performed. No further activity will
     * occur.
     */
    Completed(
      "completed",
      "http://hl7.org/fhir/request-status",
      "Completed",
      "The activity described by the request has been fully performed.  No further activity will occur.",
    ),
    /**
     * This request should never have existed and should be considered 'void'. (It is possible that
     * real-world decisions were based on it. If real-world activity has occurred, the status should
     * be "revoked" rather than "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/request-status",
      "Entered in Error",
      "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this request. Note: This concept is not to be used for "other" - one of the listed statuses
     * is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/request-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): RequestStatus =
        when (code) {
          "draft" -> Draft
          "active" -> Active
          "on-hold" -> On_Hold
          "revoked" -> Revoked
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum RequestStatus")
        }
    }
  }

  /** Codes indicating the degree of authority/intentionality associated with a request. */
  public enum class RequestIntent(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The request is a suggestion made by someone/something that does not have an intention to
     * ensure it occurs and without providing an authorization to act.
     */
    Proposal(
      "proposal",
      "http://hl7.org/fhir/request-intent",
      "Proposal",
      "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.",
    ),
    /**
     * The request represents an intention to ensure something occurs without providing an
     * authorization for others to act.
     */
    Plan(
      "plan",
      "http://hl7.org/fhir/request-intent",
      "Plan",
      "The request represents an intention to ensure something occurs without providing an authorization for others to act.",
    ),
    /**
     * The request represents a legally binding instruction authored by a Patient or RelatedPerson.
     */
    Directive(
      "directive",
      "http://hl7.org/fhir/request-intent",
      "Directive",
      "The request represents a legally binding instruction authored by a Patient or RelatedPerson.",
    ),
    /** The request represents a request/demand and authorization for action by the requestor. */
    Order(
      "order",
      "http://hl7.org/fhir/request-intent",
      "Order",
      "The request represents a request/demand and authorization for action by the requestor.",
    ),
    /** The request represents an original authorization for action. */
    Original_Order(
      "original-order",
      "http://hl7.org/fhir/request-intent",
      "Original Order",
      "The request represents an original authorization for action.",
    ),
    /**
     * The request represents an automatically generated supplemental authorization for action based
     * on a parent authorization together with initial results of the action taken against that
     * parent authorization.
     */
    Reflex_Order(
      "reflex-order",
      "http://hl7.org/fhir/request-intent",
      "Reflex Order",
      "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.",
    ),
    /**
     * The request represents the view of an authorization instantiated by a fulfilling system
     * representing the details of the fulfiller's intention to act upon a submitted order.
     */
    Filler_Order(
      "filler-order",
      "http://hl7.org/fhir/request-intent",
      "Filler Order",
      "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.",
    ),
    /**
     * An order created in fulfillment of a broader order that represents the authorization for a
     * single activity occurrence. E.g. The administration of a single dose of a drug.
     */
    Instance_Order(
      "instance-order",
      "http://hl7.org/fhir/request-intent",
      "Instance Order",
      "An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.",
    ),
    /**
     * The request represents a component or option for a RequestOrchestration that establishes
     * timing, conditionality and/or other constraints among a set of requests. Refer to
     * [[[RequestOrchestration]]] for additional information on how this status is used.
     */
    Option(
      "option",
      "http://hl7.org/fhir/request-intent",
      "Option",
      "The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): RequestIntent =
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
          else -> throw IllegalArgumentException("Unknown code $code for enum RequestIntent")
        }
    }
  }
}
