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

import com.google.fhir.model.r5.serializers.TaskInputSerializer
import com.google.fhir.model.r5.serializers.TaskOutputSerializer
import com.google.fhir.model.r5.serializers.TaskPerformerSerializer
import com.google.fhir.model.r5.serializers.TaskRestrictionSerializer
import com.google.fhir.model.r5.serializers.TaskSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A task to be performed. */
@Serializable(with = TaskSerializer::class)
@SerialName("Task")
public data class Task(
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
  /** The business identifier for this task. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is
   * adhered to in whole or in part by this Task.
   */
  public var instantiatesCanonical: Canonical? = null,
  /**
   * The URL pointing to an *externally* maintained protocol, guideline, orderset or other
   * definition that is adhered to in whole or in part by this Task.
   */
  public var instantiatesUri: Uri? = null,
  /**
   * BasedOn refers to a higher-level authorization that triggered the creation of the task. It
   * references a "request" resource such as a ServiceRequest, MedicationRequest, CarePlan, etc.
   * which is distinct from the "request" resource the task is seeking to fulfill. This latter
   * resource is referenced by focus. For example, based on a CarePlan (= basedOn), a task is
   * created to fulfill a ServiceRequest ( = focus ) to collect a specimen from a patient.
   *
   * Task.basedOn is never the same as Task.focus. Task.basedOn will typically not be present for
   * 'please fulfill' Tasks as a distinct authorization is rarely needed to request fulfillment. If
   * the Task is seeking fulfillment of an order, the order to be fulfilled is always communicated
   * using `focus`, never basedOn. However, authorization may be needed to perform other types of
   * Task actions. As an example of when both would be present, a Task seeking suspension of a
   * prescription might have a Task.basedOn pointing to the ServiceRequest ordering surgery (which
   * is the driver for suspending the MedicationRequest - which would be the Task.focus).
   */
  public var basedOn: List<Reference?>? = null,
  /**
   * A shared identifier common to multiple independent Task and Request instances that were
   * activated/authorized more or less simultaneously by a single author. The presence of the same
   * identifier on each request ties those requests together and may have business ramifications in
   * terms of reporting of results, billing, etc. E.g. a requisition number shared by a set of lab
   * tests ordered together, or a prescription number shared by all meds ordered at one time.
   */
  public var groupIdentifier: Identifier? = null,
  /**
   * Task that this particular task is part of.
   *
   * This should usually be 0..1.
   */
  public var partOf: List<Reference?>? = null,
  /** The current status of the task. */
  public var status: Enumeration<TaskStatus>? = null,
  /**
   * An explanation as to why this task is held, failed, was refused, etc.
   *
   * This applies to the current status. Look at the history of the task to see reasons for past
   * statuses.
   */
  public var statusReason: CodeableReference? = null,
  /** Contains business-specific nuances of the business state. */
  public var businessStatus: CodeableConcept? = null,
  /**
   * Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed
   * task, a planned task, an actionable task, etc.
   *
   * This element is immutable. Proposed tasks, planned tasks, etc. must be distinct instances.
   *
   * In most cases, Tasks will have an intent of "order".
   */
  public var intent: Enumeration<TaskIntent>? = null,
  /** Indicates how quickly the Task should be addressed with respect to other requests. */
  public var priority: Enumeration<TaskPriority>? = null,
  /**
   * If true indicates that the Task is asking for the specified action to *not* occur.
   *
   * The attributes provided with the Task qualify what is not to be done. For example, if a
   * requestedPeriod is provided, the 'do not' request only applies within the specified time. If a
   * requestedPerformer is specified then the 'do not' request only applies to performers of that
   * type. Qualifiers include: code, subject, occurrence, requestedPerformer and performer.
   *
   * In some cases, the Request.code may pre-coordinate prohibition into the requested action. E.g.
   * 'NPO' (nothing by mouth), 'DNR' (do not recussitate). If this happens, doNotPerform SHALL NOT
   * be set to true. I.e. The resource shall not have double negation. (E.g. 'Do not DNR').
   *
   * doNotPerform should ONLY be used with Tasks that are tightly bounded in time or process phase.
   * E.g. 'Do not fulfill the midnight dose of medication X tonight due to the early morning
   * scheduled procedure, where the nurse could reasonably check off 'Med X not given at midnight as
   * instructed'. Similarly, a decision support proposal that a patient should not be given a
   * standard intake questionnaire (because the patient is cognitively impaired) would be marked as
   * 'complete' or 'rejected' when the clinician preps the CarePlan or order set after reviewing the
   * decision support results. If there is a need to create a standing order to not do something
   * that can't be satisfied by a single 'non-action', but rather an ongoing refusal to perform the
   * function, MedicationRequest, ServiceRequest or some other form of authorization should be used.
   */
  public var doNotPerform: Boolean? = null,
  /**
   * A name or code (or both) briefly describing what the task involves.
   *
   * The title (eg "My Tasks", "Outstanding Tasks for Patient X") should go into the code.
   */
  public var code: CodeableConcept? = null,
  /** A free-text description of what is to be performed. */
  public var description: String? = null,
  /**
   * The request being fulfilled or the resource being manipulated (changed, suspended, etc.) by
   * this task.
   *
   * If multiple resources need to be manipulated, use sub-tasks. (This ensures that status can be
   * tracked independently for each referenced resource.).
   */
  public var focus: Reference? = null,
  /**
   * The entity who benefits from the performance of the service specified in the task (e.g., the
   * patient).
   */
  public var `for`: Reference? = null,
  /**
   * The healthcare event (e.g. a patient and healthcare provider interaction) during which this
   * task was created.
   */
  public var encounter: Reference? = null,
  /**
   * Indicates the start and/or end of the period of time when completion of the task is desired to
   * take place.
   *
   * This is typically used when the Task is *not* seeking fulfillment of a focus Request, as in
   * that case the period would be specified on the Request and/or in the Task.restriction.period.
   * Instead, it is used for stand-alone tasks.
   */
  public var requestedPeriod: Period? = null,
  /**
   * Identifies the time action was first taken against the task (start) and/or the time final
   * action was taken against the task prior to marking it as completed (end).
   */
  public var executionPeriod: Period? = null,
  /** The date and time this task was created. */
  public var authoredOn: DateTime? = null,
  /** The date and time of last modification to this task. */
  public var lastModified: DateTime? = null,
  /** The creator of the task. */
  public var requester: Reference? = null,
  /** The kind of participant or specific participant that should perform the task. */
  public var requestedPerformer: List<CodeableReference?>? = null,
  /**
   * Party responsible for managing task execution.
   *
   * Tasks may be created with an owner not yet identified.
   */
  public var owner: Reference? = null,
  /** The entity who performed the requested task. */
  public var performer: List<Performer>? = null,
  /**
   * Principal physical location where this task is performed.
   *
   * This should only be specified when the Task to be/being performed happens or is expected to
   * happen primarily within the bounds of a single Location. Other locations (e.g. source,
   * destination, etc.) would either be reflected on the 'basedOn' Request or be conveyed as
   * distinct Task.input values.
   */
  public var location: Reference? = null,
  /**
   * A description, code, or reference indicating why this task needs to be performed.
   *
   * This will typically not be present for Tasks with a code of 'please fulfill' as, for those, the
   * reason for action is conveyed on the Request pointed to by Task.focus. Some types of tasks will
   * not need a 'reason'. E.g. a request to discharge a patient can be inferred to be 'because the
   * patient is ready' and this would not need a reason to be stated on the Task.
   */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be
   * relevant to the Task.
   */
  public var insurance: List<Reference?>? = null,
  /** Free-text information captured about the task as it progresses. */
  public var note: List<Annotation?>? = null,
  /**
   * Links to Provenance records for past versions of this Task that identify key state transitions
   * or updates that are likely to be relevant to a user looking at the current version of the task.
   *
   * This element does not point to the Provenance associated with the *current* version of the
   * resource - as it would be created after this version existed. The Provenance for the current
   * version can be retrieved with a _revinclude.
   */
  public var relevantHistory: List<Reference?>? = null,
  /**
   * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for
   * the request to be actioned), this element identifies any limitations on what parts of the
   * referenced request should be actioned.
   *
   * Task.restriction can only be present if the Task is seeking fulfillment of another Request
   * resource, and the restriction identifies what subset of the authorization conveyed by the
   * request is supposed to be fulfilled by this Task. A possible example could be a standing order
   * (the request) covering a significant time period and/or individuals, while the Task seeks
   * fulfillment for only a subset of that time-period and a single individual.
   */
  public var restriction: Restriction? = null,
  /** Additional information that may be needed in the execution of the task. */
  public var input: List<Input>? = null,
  /** Outputs produced by the Task. */
  public var output: List<Output>? = null,
) : DomainResource() {
  /** The entity who performed the requested task. */
  @Serializable(with = TaskPerformerSerializer::class)
  public class Performer(
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
    /** A code or description of the performer of the task. */
    public var function: CodeableConcept? = null,
    /** The actor or entity who performed the task. */
    public var actor: Reference? = null,
  ) : BackboneElement()

  /**
   * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for
   * the request to be actioned), this element identifies any limitations on what parts of the
   * referenced request should be actioned.
   */
  @Serializable(with = TaskRestrictionSerializer::class)
  public class Restriction(
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
    /** Indicates the number of times the requested action should occur. */
    public var repetitions: PositiveInt? = null,
    /**
     * The time-period for which fulfillment is sought. This must fall within the overall time
     * period authorized in the referenced request. E.g. ServiceRequest.occurance[x].
     *
     * This is distinct from Task.executionPeriod. ExecutionPeriod indicates when the task needs to
     * be initiated, while Task.restriction.period specifies the subset of the overall authorization
     * that this period covers. For example, a MedicationRequest with an overall effective period of
     * 1 year might have a Task whose restriction.period is 2 months (i.e. satisfy 2 months of
     * medication therapy), while the execution period might be 'between now and 5 days from now' -
     * i.e. If you say yes to this, then you're agreeing to supply medication for that 2 month
     * period within the next 5 days.
     *
     * Note that period.high is the due date representing the time by which the task should be
     * completed.
     */
    public var period: Period? = null,
    /**
     * For requests that are targeted to more than one potential recipient/target, to identify who
     * is fulfillment is sought for.
     */
    public var recipient: List<Reference?>? = null,
  ) : BackboneElement()

  /** Additional information that may be needed in the execution of the task. */
  @Serializable(with = TaskInputSerializer::class)
  public class Input(
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
     * A code or description indicating how the input is intended to be used as part of the task
     * execution.
     *
     * If referencing a BPMN workflow or Protocol, the "system" is the URL for the workflow
     * definition and the code is the "name" of the required input.
     */
    public var type: CodeableConcept? = null,
    /** The value of the input parameter as a basic type. */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asCode(): Code? = this as? Code

      public fun asDate(): Date? = this as? Date

      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asDecimal(): Decimal? = this as? Decimal

      public fun asId(): Id? = this as? Id

      public fun asInstant(): Instant? = this as? Instant

      public fun asInteger(): Integer? = this as? Integer

      public fun asInteger64(): Integer64? = this as? Integer64

      public fun asMarkdown(): Markdown? = this as? Markdown

      public fun asOid(): Oid? = this as? Oid

      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public fun asTime(): Time? = this as? Time

      public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

      public fun asUri(): Uri? = this as? Uri

      public fun asUrl(): Url? = this as? Url

      public fun asUuid(): Uuid? = this as? Uuid

      public fun asAddress(): Address? = this as? Address

      public fun asAge(): Age? = this as? Age

      public fun asAnnotation(): Annotation? = this as? Annotation

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asCodeableReference(): CodeableReference? = this as? CodeableReference

      public fun asCoding(): Coding? = this as? Coding

      public fun asContactPoint(): ContactPoint? = this as? ContactPoint

      public fun asCount(): Count? = this as? Count

      public fun asDistance(): Distance? = this as? Distance

      public fun asDuration(): Duration? = this as? Duration

      public fun asHumanName(): HumanName? = this as? HumanName

      public fun asIdentifier(): Identifier? = this as? Identifier

      public fun asMoney(): Money? = this as? Money

      public fun asPeriod(): Period? = this as? Period

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asRatioRange(): RatioRange? = this as? RatioRange

      public fun asReference(): Reference? = this as? Reference

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asSignature(): Signature? = this as? Signature

      public fun asTiming(): Timing? = this as? Timing

      public fun asContactDetail(): ContactDetail? = this as? ContactDetail

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public fun asExpression(): Expression? = this as? Expression

      public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

      public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

      public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

      public fun asUsageContext(): UsageContext? = this as? UsageContext

      public fun asAvailability(): Availability? = this as? Availability

      public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

      public fun asDosage(): Dosage? = this as? Dosage

      public fun asMeta(): Meta? = this as? Meta

      public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
        Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Value

      public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Value

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

      public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Value

      public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Value

      public data class Oid(public val `value`: com.google.fhir.model.r5.Oid) : Value

      public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
        Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

      public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
        Value

      public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Value

      public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Value

      public data class Uuid(public val `value`: com.google.fhir.model.r5.Uuid) : Value

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Value

      public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class CodeableReference(
        public val `value`: com.google.fhir.model.r5.CodeableReference
      ) : Value

      public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

      public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
        Value

      public data class Count(public val `value`: com.google.fhir.model.r5.Count) : Value

      public data class Distance(public val `value`: com.google.fhir.model.r5.Distance) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Value

      public data class HumanName(public val `value`: com.google.fhir.model.r5.HumanName) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) : Value

      public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

      public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) :
        Value

      public data class Signature(public val `value`: com.google.fhir.model.r5.Signature) : Value

      public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Value

      public data class ContactDetail(public val `value`: com.google.fhir.model.r5.ContactDetail) :
        Value

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r5.DataRequirement
      ) : Value

      public data class Expression(public val `value`: com.google.fhir.model.r5.Expression) : Value

      public data class ParameterDefinition(
        public val `value`: com.google.fhir.model.r5.ParameterDefinition
      ) : Value

      public data class RelatedArtifact(
        public val `value`: com.google.fhir.model.r5.RelatedArtifact
      ) : Value

      public data class TriggerDefinition(
        public val `value`: com.google.fhir.model.r5.TriggerDefinition
      ) : Value

      public data class UsageContext(public val `value`: com.google.fhir.model.r5.UsageContext) :
        Value

      public data class Availability(public val `value`: com.google.fhir.model.r5.Availability) :
        Value

      public data class ExtendedContactDetail(
        public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
      ) : Value

      public data class Dosage(public val `value`: com.google.fhir.model.r5.Dosage) : Value

      public data class Meta(public val `value`: com.google.fhir.model.r5.Meta) : Value

      public companion object {
        public fun from(
          base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          canonicalValue: com.google.fhir.model.r5.Canonical?,
          codeValue: com.google.fhir.model.r5.Code?,
          dateValue: com.google.fhir.model.r5.Date?,
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          decimalValue: com.google.fhir.model.r5.Decimal?,
          idValue: com.google.fhir.model.r5.Id?,
          instantValue: com.google.fhir.model.r5.Instant?,
          integerValue: com.google.fhir.model.r5.Integer?,
          integer64Value: com.google.fhir.model.r5.Integer64?,
          markdownValue: com.google.fhir.model.r5.Markdown?,
          oidValue: com.google.fhir.model.r5.Oid?,
          positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
          stringValue: com.google.fhir.model.r5.String?,
          timeValue: com.google.fhir.model.r5.Time?,
          unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
          uriValue: com.google.fhir.model.r5.Uri?,
          urlValue: com.google.fhir.model.r5.Url?,
          uuidValue: com.google.fhir.model.r5.Uuid?,
          AddressValue: com.google.fhir.model.r5.Address?,
          AgeValue: com.google.fhir.model.r5.Age?,
          AnnotationValue: com.google.fhir.model.r5.Annotation?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          CodeableReferenceValue: com.google.fhir.model.r5.CodeableReference?,
          CodingValue: com.google.fhir.model.r5.Coding?,
          ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
          CountValue: com.google.fhir.model.r5.Count?,
          DistanceValue: com.google.fhir.model.r5.Distance?,
          DurationValue: com.google.fhir.model.r5.Duration?,
          HumanNameValue: com.google.fhir.model.r5.HumanName?,
          IdentifierValue: com.google.fhir.model.r5.Identifier?,
          MoneyValue: com.google.fhir.model.r5.Money?,
          PeriodValue: com.google.fhir.model.r5.Period?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
          RatioValue: com.google.fhir.model.r5.Ratio?,
          RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
          SampledDataValue: com.google.fhir.model.r5.SampledData?,
          SignatureValue: com.google.fhir.model.r5.Signature?,
          TimingValue: com.google.fhir.model.r5.Timing?,
          ContactDetailValue: com.google.fhir.model.r5.ContactDetail?,
          DataRequirementValue: com.google.fhir.model.r5.DataRequirement?,
          ExpressionValue: com.google.fhir.model.r5.Expression?,
          ParameterDefinitionValue: com.google.fhir.model.r5.ParameterDefinition?,
          RelatedArtifactValue: com.google.fhir.model.r5.RelatedArtifact?,
          TriggerDefinitionValue: com.google.fhir.model.r5.TriggerDefinition?,
          UsageContextValue: com.google.fhir.model.r5.UsageContext?,
          AvailabilityValue: com.google.fhir.model.r5.Availability?,
          ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
          DosageValue: com.google.fhir.model.r5.Dosage?,
          MetaValue: com.google.fhir.model.r5.Meta?,
        ): Value? {
          if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (codeValue != null) return Code(codeValue)
          if (dateValue != null) return Date(dateValue)
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (decimalValue != null) return Decimal(decimalValue)
          if (idValue != null) return Id(idValue)
          if (instantValue != null) return Instant(instantValue)
          if (integerValue != null) return Integer(integerValue)
          if (integer64Value != null) return Integer64(integer64Value)
          if (markdownValue != null) return Markdown(markdownValue)
          if (oidValue != null) return Oid(oidValue)
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          if (timeValue != null) return Time(timeValue)
          if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
          if (uriValue != null) return Uri(uriValue)
          if (urlValue != null) return Url(urlValue)
          if (uuidValue != null) return Uuid(uuidValue)
          if (AddressValue != null) return Address(AddressValue)
          if (AgeValue != null) return Age(AgeValue)
          if (AnnotationValue != null) return Annotation(AnnotationValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (CodeableReferenceValue != null) return CodeableReference(CodeableReferenceValue)
          if (CodingValue != null) return Coding(CodingValue)
          if (ContactPointValue != null) return ContactPoint(ContactPointValue)
          if (CountValue != null) return Count(CountValue)
          if (DistanceValue != null) return Distance(DistanceValue)
          if (DurationValue != null) return Duration(DurationValue)
          if (HumanNameValue != null) return HumanName(HumanNameValue)
          if (IdentifierValue != null) return Identifier(IdentifierValue)
          if (MoneyValue != null) return Money(MoneyValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (SignatureValue != null) return Signature(SignatureValue)
          if (TimingValue != null) return Timing(TimingValue)
          if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
          if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
          if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
          if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
          if (UsageContextValue != null) return UsageContext(UsageContextValue)
          if (AvailabilityValue != null) return Availability(AvailabilityValue)
          if (ExtendedContactDetailValue != null)
            return ExtendedContactDetail(ExtendedContactDetailValue)
          if (DosageValue != null) return Dosage(DosageValue)
          if (MetaValue != null) return Meta(MetaValue)
          return null
        }
      }
    }
  }

  /** Outputs produced by the Task. */
  @Serializable(with = TaskOutputSerializer::class)
  public class Output(
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
    /** The name of the Output parameter. */
    public var type: CodeableConcept? = null,
    /** The value of the Output parameter as a basic type. */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asCode(): Code? = this as? Code

      public fun asDate(): Date? = this as? Date

      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asDecimal(): Decimal? = this as? Decimal

      public fun asId(): Id? = this as? Id

      public fun asInstant(): Instant? = this as? Instant

      public fun asInteger(): Integer? = this as? Integer

      public fun asInteger64(): Integer64? = this as? Integer64

      public fun asMarkdown(): Markdown? = this as? Markdown

      public fun asOid(): Oid? = this as? Oid

      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public fun asTime(): Time? = this as? Time

      public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

      public fun asUri(): Uri? = this as? Uri

      public fun asUrl(): Url? = this as? Url

      public fun asUuid(): Uuid? = this as? Uuid

      public fun asAddress(): Address? = this as? Address

      public fun asAge(): Age? = this as? Age

      public fun asAnnotation(): Annotation? = this as? Annotation

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asCodeableReference(): CodeableReference? = this as? CodeableReference

      public fun asCoding(): Coding? = this as? Coding

      public fun asContactPoint(): ContactPoint? = this as? ContactPoint

      public fun asCount(): Count? = this as? Count

      public fun asDistance(): Distance? = this as? Distance

      public fun asDuration(): Duration? = this as? Duration

      public fun asHumanName(): HumanName? = this as? HumanName

      public fun asIdentifier(): Identifier? = this as? Identifier

      public fun asMoney(): Money? = this as? Money

      public fun asPeriod(): Period? = this as? Period

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asRatioRange(): RatioRange? = this as? RatioRange

      public fun asReference(): Reference? = this as? Reference

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asSignature(): Signature? = this as? Signature

      public fun asTiming(): Timing? = this as? Timing

      public fun asContactDetail(): ContactDetail? = this as? ContactDetail

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public fun asExpression(): Expression? = this as? Expression

      public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

      public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

      public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

      public fun asUsageContext(): UsageContext? = this as? UsageContext

      public fun asAvailability(): Availability? = this as? Availability

      public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

      public fun asDosage(): Dosage? = this as? Dosage

      public fun asMeta(): Meta? = this as? Meta

      public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
        Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Value

      public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Value

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

      public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Value

      public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Value

      public data class Oid(public val `value`: com.google.fhir.model.r5.Oid) : Value

      public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
        Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

      public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
        Value

      public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Value

      public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Value

      public data class Uuid(public val `value`: com.google.fhir.model.r5.Uuid) : Value

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Value

      public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class CodeableReference(
        public val `value`: com.google.fhir.model.r5.CodeableReference
      ) : Value

      public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

      public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
        Value

      public data class Count(public val `value`: com.google.fhir.model.r5.Count) : Value

      public data class Distance(public val `value`: com.google.fhir.model.r5.Distance) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Value

      public data class HumanName(public val `value`: com.google.fhir.model.r5.HumanName) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) : Value

      public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

      public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) :
        Value

      public data class Signature(public val `value`: com.google.fhir.model.r5.Signature) : Value

      public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Value

      public data class ContactDetail(public val `value`: com.google.fhir.model.r5.ContactDetail) :
        Value

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r5.DataRequirement
      ) : Value

      public data class Expression(public val `value`: com.google.fhir.model.r5.Expression) : Value

      public data class ParameterDefinition(
        public val `value`: com.google.fhir.model.r5.ParameterDefinition
      ) : Value

      public data class RelatedArtifact(
        public val `value`: com.google.fhir.model.r5.RelatedArtifact
      ) : Value

      public data class TriggerDefinition(
        public val `value`: com.google.fhir.model.r5.TriggerDefinition
      ) : Value

      public data class UsageContext(public val `value`: com.google.fhir.model.r5.UsageContext) :
        Value

      public data class Availability(public val `value`: com.google.fhir.model.r5.Availability) :
        Value

      public data class ExtendedContactDetail(
        public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
      ) : Value

      public data class Dosage(public val `value`: com.google.fhir.model.r5.Dosage) : Value

      public data class Meta(public val `value`: com.google.fhir.model.r5.Meta) : Value

      public companion object {
        public fun from(
          base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          canonicalValue: com.google.fhir.model.r5.Canonical?,
          codeValue: com.google.fhir.model.r5.Code?,
          dateValue: com.google.fhir.model.r5.Date?,
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          decimalValue: com.google.fhir.model.r5.Decimal?,
          idValue: com.google.fhir.model.r5.Id?,
          instantValue: com.google.fhir.model.r5.Instant?,
          integerValue: com.google.fhir.model.r5.Integer?,
          integer64Value: com.google.fhir.model.r5.Integer64?,
          markdownValue: com.google.fhir.model.r5.Markdown?,
          oidValue: com.google.fhir.model.r5.Oid?,
          positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
          stringValue: com.google.fhir.model.r5.String?,
          timeValue: com.google.fhir.model.r5.Time?,
          unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
          uriValue: com.google.fhir.model.r5.Uri?,
          urlValue: com.google.fhir.model.r5.Url?,
          uuidValue: com.google.fhir.model.r5.Uuid?,
          AddressValue: com.google.fhir.model.r5.Address?,
          AgeValue: com.google.fhir.model.r5.Age?,
          AnnotationValue: com.google.fhir.model.r5.Annotation?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          CodeableReferenceValue: com.google.fhir.model.r5.CodeableReference?,
          CodingValue: com.google.fhir.model.r5.Coding?,
          ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
          CountValue: com.google.fhir.model.r5.Count?,
          DistanceValue: com.google.fhir.model.r5.Distance?,
          DurationValue: com.google.fhir.model.r5.Duration?,
          HumanNameValue: com.google.fhir.model.r5.HumanName?,
          IdentifierValue: com.google.fhir.model.r5.Identifier?,
          MoneyValue: com.google.fhir.model.r5.Money?,
          PeriodValue: com.google.fhir.model.r5.Period?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
          RatioValue: com.google.fhir.model.r5.Ratio?,
          RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
          SampledDataValue: com.google.fhir.model.r5.SampledData?,
          SignatureValue: com.google.fhir.model.r5.Signature?,
          TimingValue: com.google.fhir.model.r5.Timing?,
          ContactDetailValue: com.google.fhir.model.r5.ContactDetail?,
          DataRequirementValue: com.google.fhir.model.r5.DataRequirement?,
          ExpressionValue: com.google.fhir.model.r5.Expression?,
          ParameterDefinitionValue: com.google.fhir.model.r5.ParameterDefinition?,
          RelatedArtifactValue: com.google.fhir.model.r5.RelatedArtifact?,
          TriggerDefinitionValue: com.google.fhir.model.r5.TriggerDefinition?,
          UsageContextValue: com.google.fhir.model.r5.UsageContext?,
          AvailabilityValue: com.google.fhir.model.r5.Availability?,
          ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
          DosageValue: com.google.fhir.model.r5.Dosage?,
          MetaValue: com.google.fhir.model.r5.Meta?,
        ): Value? {
          if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (codeValue != null) return Code(codeValue)
          if (dateValue != null) return Date(dateValue)
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (decimalValue != null) return Decimal(decimalValue)
          if (idValue != null) return Id(idValue)
          if (instantValue != null) return Instant(instantValue)
          if (integerValue != null) return Integer(integerValue)
          if (integer64Value != null) return Integer64(integer64Value)
          if (markdownValue != null) return Markdown(markdownValue)
          if (oidValue != null) return Oid(oidValue)
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          if (timeValue != null) return Time(timeValue)
          if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
          if (uriValue != null) return Uri(uriValue)
          if (urlValue != null) return Url(urlValue)
          if (uuidValue != null) return Uuid(uuidValue)
          if (AddressValue != null) return Address(AddressValue)
          if (AgeValue != null) return Age(AgeValue)
          if (AnnotationValue != null) return Annotation(AnnotationValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (CodeableReferenceValue != null) return CodeableReference(CodeableReferenceValue)
          if (CodingValue != null) return Coding(CodingValue)
          if (ContactPointValue != null) return ContactPoint(ContactPointValue)
          if (CountValue != null) return Count(CountValue)
          if (DistanceValue != null) return Distance(DistanceValue)
          if (DurationValue != null) return Duration(DurationValue)
          if (HumanNameValue != null) return HumanName(HumanNameValue)
          if (IdentifierValue != null) return Identifier(IdentifierValue)
          if (MoneyValue != null) return Money(MoneyValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (SignatureValue != null) return Signature(SignatureValue)
          if (TimingValue != null) return Timing(TimingValue)
          if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
          if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
          if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
          if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
          if (UsageContextValue != null) return UsageContext(UsageContextValue)
          if (AvailabilityValue != null) return Availability(AvailabilityValue)
          if (ExtendedContactDetailValue != null)
            return ExtendedContactDetail(ExtendedContactDetailValue)
          if (DosageValue != null) return Dosage(DosageValue)
          if (MetaValue != null) return Meta(MetaValue)
          return null
        }
      }
    }
  }

  /** The current status of the task. */
  public enum class TaskStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Draft("draft", "http://hl7.org/fhir/task-status", "Draft", null),
    Requested("requested", "http://hl7.org/fhir/task-status", "Requested", null),
    Received("received", "http://hl7.org/fhir/task-status", "Received", null),
    Accepted("accepted", "http://hl7.org/fhir/task-status", "Accepted", null),
    Rejected("rejected", "http://hl7.org/fhir/task-status", "Rejected", null),
    Ready("ready", "http://hl7.org/fhir/task-status", "Ready", null),
    Cancelled("cancelled", "http://hl7.org/fhir/task-status", "Cancelled", null),
    In_Progress("in-progress", "http://hl7.org/fhir/task-status", "In Progress", null),
    On_Hold("on-hold", "http://hl7.org/fhir/task-status", "On Hold", null),
    Failed("failed", "http://hl7.org/fhir/task-status", "Failed", null),
    Completed("completed", "http://hl7.org/fhir/task-status", "Completed", null),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/task-status",
      "Entered in Error",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TaskStatus =
        when (code) {
          "draft" -> Draft
          "requested" -> Requested
          "received" -> Received
          "accepted" -> Accepted
          "rejected" -> Rejected
          "ready" -> Ready
          "cancelled" -> Cancelled
          "in-progress" -> In_Progress
          "on-hold" -> On_Hold
          "failed" -> Failed
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum TaskStatus")
        }
    }
  }

  /** Distinguishes whether the task is a proposal, plan or full order. */
  public enum class TaskIntent(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Unknown("unknown", "http://hl7.org/fhir/task-intent", "Unknown", null),
    Proposal("proposal", "http://hl7.org/fhir/request-intent", "Proposal", null),
    Plan("plan", "http://hl7.org/fhir/request-intent", "Plan", null),
    Order("order", "http://hl7.org/fhir/request-intent", "Order", null),
    Original_Order("original-order", "http://hl7.org/fhir/request-intent", "Original Order", null),
    Reflex_Order("reflex-order", "http://hl7.org/fhir/request-intent", "Reflex Order", null),
    Filler_Order("filler-order", "http://hl7.org/fhir/request-intent", "Filler Order", null),
    Instance_Order("instance-order", "http://hl7.org/fhir/request-intent", "Instance Order", null),
    Option("option", "http://hl7.org/fhir/request-intent", "Option", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TaskIntent =
        when (code) {
          "unknown" -> Unknown
          "proposal" -> Proposal
          "plan" -> Plan
          "order" -> Order
          "original-order" -> Original_Order
          "reflex-order" -> Reflex_Order
          "filler-order" -> Filler_Order
          "instance-order" -> Instance_Order
          "option" -> Option
          else -> throw IllegalArgumentException("Unknown code $code for enum TaskIntent")
        }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class TaskPriority(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Routine("routine", "http://hl7.org/fhir/request-priority", "Routine", null),
    Urgent("urgent", "http://hl7.org/fhir/request-priority", "Urgent", null),
    Asap("asap", "http://hl7.org/fhir/request-priority", "ASAP", null),
    Stat("stat", "http://hl7.org/fhir/request-priority", "STAT", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TaskPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else -> throw IllegalArgumentException("Unknown code $code for enum TaskPriority")
        }
    }
  }
}
