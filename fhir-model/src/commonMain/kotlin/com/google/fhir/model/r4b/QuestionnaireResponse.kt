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

import com.google.fhir.model.r4b.serializers.QuestionnaireResponseItemAnswerSerializer
import com.google.fhir.model.r4b.serializers.QuestionnaireResponseItemSerializer
import com.google.fhir.model.r4b.serializers.QuestionnaireResponseSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A structured set of questions and their answers. The questions are ordered and grouped into
 * coherent subsets, corresponding to the structure of the grouping of the questionnaire being
 * responded to.
 */
@Serializable(with = QuestionnaireResponseSerializer::class)
@SerialName("QuestionnaireResponse")
public data class QuestionnaireResponse(
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
   * A business identifier assigned to a particular completed (or partially completed)
   * questionnaire.
   */
  public var identifier: Identifier? = null,
  /**
   * The order, proposal or plan that is fulfilled in whole or in part by this
   * QuestionnaireResponse. For example, a ServiceRequest seeking an intake assessment or a decision
   * support recommendation to assess for post-partum depression.
   */
  public var basedOn: List<Reference?>? = null,
  /**
   * A procedure or observation that this questionnaire was performed as part of the execution of.
   * For example, the surgery a checklist was executed as part of.
   *
   * Composition of questionnaire responses will be handled by the parent questionnaire having
   * answers that reference the child questionnaire. For relationships to referrals, and other types
   * of requests, use basedOn.
   */
  public var partOf: List<Reference?>? = null,
  /**
   * The Questionnaire that defines and organizes the questions for which answers are being
   * provided.
   *
   * If a QuestionnaireResponse references a Questionnaire, then the QuestionnaireResponse structure
   * must be consistent with the Questionnaire (i.e. questions must be organized into the same
   * groups, nested questions must still be nested, etc.).
   */
  public var questionnaire: Canonical? = null,
  /**
   * The position of the questionnaire response within its overall lifecycle.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<QuestionnaireResponseStatus>? = null,
  /**
   * The subject of the questionnaire response. This could be a patient, organization, practitioner,
   * device, etc. This is who/what the answers apply to, but is not necessarily the source of
   * information.
   *
   * If the Questionnaire declared a subjectType, the resource pointed to by this element must be an
   * instance of one of the listed types.
   */
  public var subject: Reference? = null,
  /**
   * The Encounter during which this questionnaire response was created or to which the creation of
   * this record is tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter. A questionnaire that was initiated during an encounter but not fully
   * completed during the encounter would still generally be associated with the encounter.
   */
  public var encounter: Reference? = null,
  /**
   * The date and/or time that this set of answers were last changed.
   *
   * May be different from the lastUpdateTime of the resource itself, because that reflects when the
   * data was known to the server, not when the data was captured.
   *
   * This element is optional to allow for systems that might not know the value, however it SHOULD
   * be populated if possible.
   */
  public var authored: DateTime? = null,
  /**
   * Person who received the answers to the questions in the QuestionnaireResponse and recorded them
   * in the system.
   *
   * Mapping a subject's answers to multiple choice options and determining what to put in the
   * textual answer is a matter of interpretation. Authoring by device would indicate that some
   * portion of the questionnaire had been auto-populated.
   */
  public var author: Reference? = null,
  /**
   * The person who answered the questions about the subject.
   *
   * If not specified, no inference can be made about who provided the data.
   */
  public var source: Reference? = null,
  /**
   * A group or question item from the original questionnaire for which answers are provided.
   *
   * Groups cannot have answers and therefore must nest directly within item. When dealing with
   * questions, nesting must occur within each answer because some questions may have multiple
   * answers (and the nesting occurs for each answer).
   */
  public var item: List<Item>? = null,
) : DomainResource() {
  /** A group or question item from the original questionnaire for which answers are provided. */
  @Serializable(with = QuestionnaireResponseItemSerializer::class)
  public class Item(
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
     * The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse
     * resource.
     */
    public var linkId: String? = null,
    /**
     * A reference to an [ElementDefinition](elementdefinition.html) that provides the details for
     * the item.
     *
     * The ElementDefinition must be in a [StructureDefinition](structuredefinition.html#), and must
     * have a fragment identifier that identifies the specific data element by its id (Element.id).
     * E.g. http://hl7.org/fhir/StructureDefinition/Observation#Observation.value[x].
     *
     * There is no need for this element if the item pointed to by the linkId has a definition
     * listed.
     */
    public var definition: Uri? = null,
    /**
     * Text that is displayed above the contents of the group or as the text of the question being
     * answered.
     */
    public var text: String? = null,
    /**
     * The respondent's answer(s) to the question.
     *
     * The value is nested because we cannot have a repeating structure that has variable type.
     */
    public var answer: List<Answer>? = null,
    /** Questions or sub-groups nested beneath a question or group. */
    public var item: List<Item?>? = null,
  ) : BackboneElement() {
    /** The respondent's answer(s) to the question. */
    @Serializable(with = QuestionnaireResponseItemAnswerSerializer::class)
    public class Answer(
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
       * The answer (or one of the answers) provided by the respondent to the question.
       *
       * More complex structures (Attachment, Resource and Quantity) will typically be limited to
       * electronic forms that can expose an appropriate user interface to capture the components
       * and enforce the constraints of a complex data type. Additional complex types can be
       * introduced through extensions. Must match the datatype specified by Questionnaire.item.type
       * in the corresponding Questionnaire.
       */
      public var `value`: Value? = null,
      /** Nested groups and/or questions found within this particular answer. */
      public var item: List<Item?>? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asDecimal(): Decimal? = this as? Decimal

        public fun asInteger(): Integer? = this as? Integer

        public fun asDate(): Date? = this as? Date

        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asTime(): Time? = this as? Time

        public fun asString(): String? = this as? String

        public fun asUri(): Uri? = this as? Uri

        public fun asAttachment(): Attachment? = this as? Attachment

        public fun asCoding(): Coding? = this as? Coding

        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asReference(): Reference? = this as? Reference

        public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) : Value

        public data class Decimal(public val `value`: com.google.fhir.model.r4b.Decimal) : Value

        public data class Integer(public val `value`: com.google.fhir.model.r4b.Integer) : Value

        public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Value

        public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Value

        public data class Time(public val `value`: com.google.fhir.model.r4b.Time) : Value

        public data class String(public val `value`: com.google.fhir.model.r4b.String) : Value

        public data class Uri(public val `value`: com.google.fhir.model.r4b.Uri) : Value

        public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
          Value

        public data class Coding(public val `value`: com.google.fhir.model.r4b.Coding) : Value

        public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Value

        public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
          Value

        public companion object {
          public fun from(
            booleanValue: com.google.fhir.model.r4b.Boolean?,
            decimalValue: com.google.fhir.model.r4b.Decimal?,
            integerValue: com.google.fhir.model.r4b.Integer?,
            dateValue: com.google.fhir.model.r4b.Date?,
            dateTimeValue: com.google.fhir.model.r4b.DateTime?,
            timeValue: com.google.fhir.model.r4b.Time?,
            stringValue: com.google.fhir.model.r4b.String?,
            uriValue: com.google.fhir.model.r4b.Uri?,
            AttachmentValue: com.google.fhir.model.r4b.Attachment?,
            CodingValue: com.google.fhir.model.r4b.Coding?,
            QuantityValue: com.google.fhir.model.r4b.Quantity?,
            ReferenceValue: com.google.fhir.model.r4b.Reference?,
          ): Value? {
            if (booleanValue != null) return Boolean(booleanValue)
            if (decimalValue != null) return Decimal(decimalValue)
            if (integerValue != null) return Integer(integerValue)
            if (dateValue != null) return Date(dateValue)
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (timeValue != null) return Time(timeValue)
            if (stringValue != null) return String(stringValue)
            if (uriValue != null) return Uri(uriValue)
            if (AttachmentValue != null) return Attachment(AttachmentValue)
            if (CodingValue != null) return Coding(CodingValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }
  }

  /** Lifecycle status of the questionnaire response. */
  public enum class QuestionnaireResponseStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * This QuestionnaireResponse has been partially filled out with answers but changes or
     * additions are still expected to be made to it.
     */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/questionnaire-answers-status",
      "In Progress",
      "This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it.",
    ),
    /**
     * This QuestionnaireResponse has been filled out with answers and the current content is
     * regarded as definitive.
     */
    Completed(
      "completed",
      "http://hl7.org/fhir/questionnaire-answers-status",
      "Completed",
      "This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive.",
    ),
    /**
     * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet
     * changes or additions have been made to it afterwards.
     */
    Amended(
      "amended",
      "http://hl7.org/fhir/questionnaire-answers-status",
      "Amended",
      "This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.",
    ),
    /** This QuestionnaireResponse was entered in error and voided. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/questionnaire-answers-status",
      "Entered in Error",
      "This QuestionnaireResponse was entered in error and voided.",
    ),
    /**
     * This QuestionnaireResponse has been partially filled out with answers but has been abandoned.
     * It is unknown whether changes or additions are expected to be made to it.
     */
    Stopped(
      "stopped",
      "http://hl7.org/fhir/questionnaire-answers-status",
      "Stopped",
      "This QuestionnaireResponse has been partially filled out with answers but has been abandoned. It is unknown whether changes or additions are expected to be made to it.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): QuestionnaireResponseStatus =
        when (code) {
          "in-progress" -> In_Progress
          "completed" -> Completed
          "amended" -> Amended
          "entered-in-error" -> Entered_In_Error
          "stopped" -> Stopped
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum QuestionnaireResponseStatus"
            )
        }
    }
  }
}
