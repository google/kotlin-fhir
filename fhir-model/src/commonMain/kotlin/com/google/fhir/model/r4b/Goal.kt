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

import com.google.fhir.model.r4b.serializers.GoalSerializer
import com.google.fhir.model.r4b.serializers.GoalTargetSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the intended objective(s) for a patient, group or organization care, for example,
 * weight loss, restoring an activity of daily living, obtaining herd immunity via immunization,
 * meeting a process improvement objective, etc.
 */
@Serializable(with = GoalSerializer::class)
@SerialName("Goal")
public data class Goal(
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
   * Business identifiers assigned to this goal by the performer or other systems which remain
   * constant as the resource is updated and propagates from server to server.
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
   * The state of the goal throughout its lifecycle.
   *
   * This element is labeled as a modifier because the lifecycleStatus contains codes that mark the
   * resource as not currently valid.
   */
  public var lifecycleStatus: Enumeration<GoalLifecycleStatus>? = null,
  /** Describes the progression, or lack thereof, towards the goal against the target. */
  public var achievementStatus: CodeableConcept? = null,
  /** Indicates a category the goal falls within. */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Identifies the mutually agreed level of importance associated with reaching/sustaining the
   * goal.
   *
   * Extensions are available to track priorities as established by each participant (i.e. Priority
   * from the patient's perspective, different practitioners' perspectives, family member's
   * perspectives)
   *
   * The ordinal extension on Coding can be used to convey a numerically comparable ranking to
   * priority. (Keep in mind that different coding systems may use a "low value=important".
   */
  public var priority: CodeableConcept? = null,
  /**
   * Human-readable and/or coded description of a specific desired objective of care, such as
   * "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
   *
   * If no code is available, use CodeableConcept.text.
   */
  public var description: CodeableConcept? = null,
  /** Identifies the patient, group or organization for whom the goal is being established. */
  public var subject: Reference? = null,
  /** The date or event after which the goal should begin being pursued. */
  public var start: Start? = null,
  /**
   * Indicates what should be done by when.
   *
   * When multiple targets are present for a single goal instance, all targets must be met for the
   * overall goal to be met.
   */
  public var target: List<Target>? = null,
  /**
   * Identifies when the current status. I.e. When initially created, when achieved, when cancelled,
   * etc.
   *
   * To see the date for past statuses, query history.
   */
  public var statusDate: Date? = null,
  /**
   * Captures the reason for the current status.
   *
   * This will typically be captured for statuses such as rejected, on-hold or cancelled, but could
   * be present for others.
   */
  public var statusReason: String? = null,
  /**
   * Indicates whose goal this is - patient goal, practitioner goal, etc.
   *
   * This is the individual responsible for establishing the goal, not necessarily who recorded it.
   * (For that, use the Provenance resource.).
   */
  public var expressedBy: Reference? = null,
  /**
   * The identified conditions and other health record elements that are intended to be addressed by
   * the goal.
   */
  public var addresses: List<Reference?>? = null,
  /**
   * Any comments related to the goal.
   *
   * May be used for progress notes, concerns or other related information that doesn't actually
   * describe the goal itself.
   */
  public var note: List<Annotation?>? = null,
  /**
   * Identifies the change (or lack of change) at the point when the status of the goal is assessed.
   *
   * Note that this should not duplicate the goal status.
   */
  public var outcomeCode: List<CodeableConcept?>? = null,
  /**
   * Details of what's changed (or not changed).
   *
   * The goal outcome is independent of the outcome of the related activities. For example, if the
   * Goal is to achieve a target body weight of 150 lb and a care plan activity is defined to diet,
   * then the care plan’s activity outcome could be calories consumed whereas goal outcome is an
   * observation for the actual body weight measured.
   */
  public var outcomeReference: List<Reference?>? = null,
) : DomainResource() {
  /** Indicates what should be done by when. */
  @Serializable(with = GoalTargetSerializer::class)
  public class Target(
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
     * The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin
     * A1c level.
     */
    public var measure: CodeableConcept? = null,
    /**
     * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150
     * pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low
     * value is missing, it indicates that the goal is achieved at any focus value at or below the
     * high value. Similarly, if the high value is missing, it indicates that the goal is achieved
     * at any focus value at or above the low value.
     *
     * A CodeableConcept with just a text would be used instead of a string if the field was usually
     * coded, or if the type associated with the Goal.target.measure defines a coded value.
     */
    public var detail: Detail? = null,
    /** Indicates either the date or the duration after start by which the goal should be met. */
    public var due: Due? = null,
  ) : BackboneElement() {
    public sealed interface Detail {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asString(): String? = this as? String

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asInteger(): Integer? = this as? Integer

      public fun asRatio(): Ratio? = this as? Ratio

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Detail

      public data class Range(public val `value`: com.google.fhir.model.r4b.Range) : Detail

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Detail

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : Detail

      public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) : Detail

      public data class Integer(public val `value`: com.google.fhir.model.r4b.Integer) : Detail

      public data class Ratio(public val `value`: com.google.fhir.model.r4b.Ratio) : Detail

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r4b.Quantity?,
          RangeValue: com.google.fhir.model.r4b.Range?,
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          stringValue: com.google.fhir.model.r4b.String?,
          booleanValue: com.google.fhir.model.r4b.Boolean?,
          integerValue: com.google.fhir.model.r4b.Integer?,
          RatioValue: com.google.fhir.model.r4b.Ratio?,
        ): Detail? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (stringValue != null) return String(stringValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (integerValue != null) return Integer(integerValue)
          if (RatioValue != null) return Ratio(RatioValue)
          return null
        }
      }
    }

    public sealed interface Due {
      public fun asDate(): Date? = this as? Date

      public fun asDuration(): Duration? = this as? Duration

      public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Due

      public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) : Due

      public companion object {
        public fun from(
          dateValue: com.google.fhir.model.r4b.Date?,
          DurationValue: com.google.fhir.model.r4b.Duration?,
        ): Due? {
          if (dateValue != null) return Date(dateValue)
          if (DurationValue != null) return Duration(DurationValue)
          return null
        }
      }
    }
  }

  public sealed interface Start {
    public fun asDate(): Date? = this as? Date

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Start

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Start

    public companion object {
      public fun from(
        dateValue: com.google.fhir.model.r4b.Date?,
        CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
      ): Start? {
        if (dateValue != null) return Date(dateValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        return null
      }
    }
  }

  /**
   * Codes that reflect the current state of a goal and whether the goal is still being targeted.
   */
  public enum class GoalLifecycleStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** A goal is proposed for this patient. */
    Proposed(
      "proposed",
      "http://hl7.org/fhir/goal-status",
      "Proposed",
      "A goal is proposed for this patient.",
    ),
    /** A goal is planned for this patient. */
    Planned(
      "planned",
      "http://hl7.org/fhir/goal-status",
      "Planned",
      "A goal is planned for this patient.",
    ),
    /** A proposed goal was accepted or acknowledged. */
    Accepted(
      "accepted",
      "http://hl7.org/fhir/goal-status",
      "Accepted",
      "A proposed goal was accepted or acknowledged.",
    ),
    /** The goal is being sought actively. */
    Active(
      "active",
      "http://hl7.org/fhir/goal-status",
      "Active",
      "The goal is being sought actively.",
    ),
    /**
     * The goal remains a long term objective but is no longer being actively pursued for a
     * temporary period of time.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/goal-status",
      "On Hold",
      "The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.",
    ),
    /** The goal is no longer being sought. */
    Completed(
      "completed",
      "http://hl7.org/fhir/goal-status",
      "Completed",
      "The goal is no longer being sought.",
    ),
    /** The goal has been abandoned. */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/goal-status",
      "Cancelled",
      "The goal has been abandoned.",
    ),
    /** The goal was entered in error and voided. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/goal-status",
      "Entered in Error",
      "The goal was entered in error and voided.",
    ),
    /** A proposed goal was rejected. */
    Rejected(
      "rejected",
      "http://hl7.org/fhir/goal-status",
      "Rejected",
      "A proposed goal was rejected.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): GoalLifecycleStatus =
        when (code) {
          "proposed" -> Proposed
          "planned" -> Planned
          "accepted" -> Accepted
          "active" -> Active
          "on-hold" -> On_Hold
          "completed" -> Completed
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "rejected" -> Rejected
          else -> throw IllegalArgumentException("Unknown code $code for enum GoalLifecycleStatus")
        }
    }
  }
}
