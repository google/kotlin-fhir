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

import com.google.fhir.model.r4.serializers.RequestGroupActionConditionSerializer
import com.google.fhir.model.r4.serializers.RequestGroupActionRelatedActionOffsetSerializer
import com.google.fhir.model.r4.serializers.RequestGroupActionRelatedActionSerializer
import com.google.fhir.model.r4.serializers.RequestGroupActionSerializer
import com.google.fhir.model.r4.serializers.RequestGroupActionTimingSerializer
import com.google.fhir.model.r4.serializers.RequestGroupSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A group of related requests that can be used to capture intended activities that have
 * inter-dependencies such as "give this medication after that one".
 */
@Serializable(with = RequestGroupSerializer::class)
@SerialName("RequestGroup")
public data class RequestGroup(
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
   * A shared identifier common to all requests that were authorized more or less simultaneously by
   * a single author, representing the identifier of the requisition, prescription or similar form.
   *
   * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another)
   * or by having a common requisition. Requests that are part of the same requisition are generally
   * treated independently from the perspective of changing their state or maintaining them after
   * initial creation.
   */
  public var groupIdentifier: Identifier? = null,
  /**
   * The current state of the request. For request groups, the status reflects the status of all the
   * requests in the group.
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
   * A code that identifies what the overall request group is.
   *
   * This element can be used to provide a code that captures the meaning of the request group as a
   * whole, as opposed to the code of the action element, which captures the meaning of the
   * individual actions within the request group.
   */
  public var code: CodeableConcept? = null,
  /** The subject for which the request group was created. */
  public var subject: Reference? = null,
  /** Describes the context of the request group, if any. */
  public var encounter: Reference? = null,
  /** Indicates when the request group was created. */
  public var authoredOn: DateTime? = null,
  /** Provides a reference to the author of the request group. */
  public var author: Reference? = null,
  /** Describes the reason for the request group in coded or textual form. */
  public var reasonCode: List<CodeableConcept?>? = null,
  /** Indicates another resource whose existence justifies this request group. */
  public var reasonReference: List<Reference?>? = null,
  /** Provides a mechanism to communicate additional information about the response. */
  public var note: List<Annotation?>? = null,
  /** The actions, if any, produced by the evaluation of the artifact. */
  public var action: List<Action>? = null,
) : DomainResource() {
  /** The actions, if any, produced by the evaluation of the artifact. */
  @Serializable(with = RequestGroupActionSerializer::class)
  public class Action(
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
    /** A user-visible prefix for the action. */
    public var prefix: String? = null,
    /** The title of the action displayed to a user. */
    public var title: String? = null,
    /** A short description of the action used to provide a summary to display to the user. */
    public var description: String? = null,
    /**
     * A text equivalent of the action to be performed. This provides a human-interpretable
     * description of the action when the definition is consumed by a system that might not be
     * capable of interpreting it dynamically.
     */
    public var textEquivalent: String? = null,
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
    /**
     * An expression that describes applicability criteria, or start/stop conditions for the action.
     *
     * When multiple conditions of the same kind are present, the effects are combined using AND
     * semantics, so the overall condition is true only if all of the conditions are true.
     */
    public var condition: List<Condition>? = null,
    /** A relationship to another action such as "before" or "30-60 minutes after start of". */
    public var relatedAction: List<RelatedAction>? = null,
    /** An optional value describing when the action should be performed. */
    public var timing: Timing? = null,
    /** The participant that should perform or be responsible for this action. */
    public var participant: List<Reference?>? = null,
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
    /** Sub actions. */
    public var action: List<Action?>? = null,
  ) : BackboneElement() {
    /**
     * An expression that describes applicability criteria, or start/stop conditions for the action.
     */
    @Serializable(with = RequestGroupActionConditionSerializer::class)
    public class Condition(
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

    /** A relationship to another action such as "before" or "30-60 minutes after start of". */
    @Serializable(with = RequestGroupActionRelatedActionSerializer::class)
    public class RelatedAction(
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
      /** The element id of the action this is related to. */
      public var actionId: Id? = null,
      /** The relationship of this action to the related action. */
      public var relationship: Enumeration<ActionRelationshipType>? = null,
      /**
       * A duration or range of durations to apply to the relationship. For example, 30-60 minutes
       * before.
       */
      public var offset: Offset? = null,
    ) : BackboneElement() {
      @Serializable(with = RequestGroupActionRelatedActionOffsetSerializer::class)
      public sealed interface Offset {
        public fun asDuration(): Duration? = this as? Duration

        public fun asRange(): Range? = this as? Range

        public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) : Offset

        public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Offset

        public data object Null : Offset

        public companion object {
          public fun from(
            DurationValue: com.google.fhir.model.r4.Duration?,
            RangeValue: com.google.fhir.model.r4.Range?,
          ): Offset {
            if (DurationValue != null) return Duration(DurationValue)
            if (RangeValue != null) return Range(RangeValue)
            return Null
          }
        }
      }
    }

    @Serializable(with = RequestGroupActionTimingSerializer::class)
    public sealed interface Timing {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asAge(): Age? = this as? Age

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public fun asRange(): Range? = this as? Range

      public fun asTiming(): Timing? = this as? Timing

      public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) :
        Action.Timing

      public data class Age(public val `value`: com.google.fhir.model.r4.Age) : Action.Timing

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Action.Timing

      public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) :
        Action.Timing

      public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Action.Timing

      public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : Action.Timing

      public data object Null : Action.Timing

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r4.DateTime?,
          AgeValue: com.google.fhir.model.r4.Age?,
          PeriodValue: com.google.fhir.model.r4.Period?,
          DurationValue: com.google.fhir.model.r4.Duration?,
          RangeValue: com.google.fhir.model.r4.Range?,
          TimingValue: com.google.fhir.model.r4.Timing?,
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
  }

  /** The clinical priority of a diagnostic order. */
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
    /** The action must be performed before the start of the related action. */
    Before_Start(
      "before-start",
      "http://hl7.org/fhir/action-relationship-type",
      "Before Start",
      "The action must be performed before the start of the related action.",
    ),
    /** The action must be performed before the related action. */
    Before(
      "before",
      "http://hl7.org/fhir/action-relationship-type",
      "Before",
      "The action must be performed before the related action.",
    ),
    /** The action must be performed before the end of the related action. */
    Before_End(
      "before-end",
      "http://hl7.org/fhir/action-relationship-type",
      "Before End",
      "The action must be performed before the end of the related action.",
    ),
    /** The action must be performed concurrent with the start of the related action. */
    Concurrent_With_Start(
      "concurrent-with-start",
      "http://hl7.org/fhir/action-relationship-type",
      "Concurrent With Start",
      "The action must be performed concurrent with the start of the related action.",
    ),
    /** The action must be performed concurrent with the related action. */
    Concurrent(
      "concurrent",
      "http://hl7.org/fhir/action-relationship-type",
      "Concurrent",
      "The action must be performed concurrent with the related action.",
    ),
    /** The action must be performed concurrent with the end of the related action. */
    Concurrent_With_End(
      "concurrent-with-end",
      "http://hl7.org/fhir/action-relationship-type",
      "Concurrent With End",
      "The action must be performed concurrent with the end of the related action.",
    ),
    /** The action must be performed after the start of the related action. */
    After_Start(
      "after-start",
      "http://hl7.org/fhir/action-relationship-type",
      "After Start",
      "The action must be performed after the start of the related action.",
    ),
    /** The action must be performed after the related action. */
    After(
      "after",
      "http://hl7.org/fhir/action-relationship-type",
      "After",
      "The action must be performed after the related action.",
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
          "before-start" -> Before_Start
          "before" -> Before
          "before-end" -> Before_End
          "concurrent-with-start" -> Concurrent_With_Start
          "concurrent" -> Concurrent
          "concurrent-with-end" -> Concurrent_With_End
          "after-start" -> After_Start
          "after" -> After
          "after-end" -> After_End
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActionRelationshipType")
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
    /** The request represents a request/demand and authorization for action by a Practitioner. */
    Order(
      "order",
      "http://hl7.org/fhir/request-intent",
      "Order",
      "The request represents a request/demand and authorization for action by a Practitioner.",
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
     * The request represents a component or option for a RequestGroup that establishes timing,
     * conditionality and/or other constraints among a set of requests. Refer to [[[RequestGroup]]]
     * for additional information on how this status is used.
     */
    Option(
      "option",
      "http://hl7.org/fhir/request-intent",
      "Option",
      "The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestGroup]]] for additional information on how this status is used.",
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
