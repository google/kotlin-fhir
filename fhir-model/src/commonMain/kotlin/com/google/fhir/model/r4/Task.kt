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

import com.google.fhir.model.r4.serializers.TaskInputSerializer
import com.google.fhir.model.r4.serializers.TaskOutputSerializer
import com.google.fhir.model.r4.serializers.TaskRestrictionSerializer
import com.google.fhir.model.r4.serializers.TaskSerializer
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
   * references a "request" resource such as a ServiceRequest, MedicationRequest, ServiceRequest,
   * CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfill.
   * This latter resource is referenced by FocusOn. For example, based on a ServiceRequest (=
   * BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen
   * from a patient.
   */
  public var basedOn: List<Reference?>? = null,
  /**
   * An identifier that links together multiple tasks and other requests that were created in the
   * same context.
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
  public var statusReason: CodeableConcept? = null,
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
   * A name or code (or both) briefly describing what the task involves.
   *
   * The title (eg "My Tasks", "Outstanding Tasks for Patient X") should go into the code.
   */
  public var code: CodeableConcept? = null,
  /** A free-text description of what is to be performed. */
  public var description: String? = null,
  /**
   * The request being actioned or the resource being manipulated by this task.
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
  /** The kind of participant that should perform the task. */
  public var performerType: List<CodeableConcept?>? = null,
  /**
   * Individual organization or Device currently responsible for task execution.
   *
   * Tasks may be created with an owner not yet identified.
   */
  public var owner: Reference? = null,
  /** Principal physical location where the this task is performed. */
  public var location: Reference? = null,
  /**
   * A description or code indicating why this task needs to be performed.
   *
   * This should only be included if there is no focus or if it differs from the reason indicated on
   * the focus.
   */
  public var reasonCode: CodeableConcept? = null,
  /**
   * A resource reference indicating why this task needs to be performed.
   *
   * Tasks might be justified based on an Observation, a Condition, a past or planned procedure,
   * etc. This should only be included if there is no focus or if it differs from the reason
   * indicated on the focus. Use the CodeableConcept text element in `Task.reasonCode` if the data
   * is free (uncoded) text.
   */
  public var reasonReference: Reference? = null,
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
   */
  public var restriction: Restriction? = null,
  /** Additional information that may be needed in the execution of the task. */
  public var input: List<Input>? = null,
  /** Outputs produced by the Task. */
  public var output: List<Output>? = null,
) : DomainResource() {
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
    /** Indicates the number of times the requested action should occur. */
    public var repetitions: PositiveInt? = null,
    /**
     * Over what time-period is fulfillment sought.
     *
     * Note that period.high is the due date representing the time by which the task should be
     * completed.
     */
    public var period: Period? = null,
    /**
     * For requests that are targeted to more than on potential recipient/target, for whom is
     * fulfillment sought?
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

      public fun asReference(): Reference? = this as? Reference

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asSignature(): Signature? = this as? Signature

      public fun asTiming(): Timing? = this as? Timing

      public fun asContactDetail(): ContactDetail? = this as? ContactDetail

      public fun asContributor(): Contributor? = this as? Contributor

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public fun asExpression(): Expression? = this as? Expression

      public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

      public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

      public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

      public fun asUsageContext(): UsageContext? = this as? UsageContext

      public fun asDosage(): Dosage? = this as? Dosage

      public fun asMeta(): Meta? = this as? Meta

      public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
        Value

      public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Value

      public data class Canonical(public val `value`: com.google.fhir.model.r4.Canonical) : Value

      public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Value

      public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Value

      public data class Id(public val `value`: com.google.fhir.model.r4.Id) : Value

      public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r4.Markdown) : Value

      public data class Oid(public val `value`: com.google.fhir.model.r4.Oid) : Value

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
        Value

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

      public data class Time(public val `value`: com.google.fhir.model.r4.Time) : Value

      public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
        Value

      public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Value

      public data class Url(public val `value`: com.google.fhir.model.r4.Url) : Value

      public data class Uuid(public val `value`: com.google.fhir.model.r4.Uuid) : Value

      public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Value

      public data class Age(public val `value`: com.google.fhir.model.r4.Age) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r4.Annotation) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Value

      public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Value

      public data class ContactPoint(public val `value`: com.google.fhir.model.r4.ContactPoint) :
        Value

      public data class Count(public val `value`: com.google.fhir.model.r4.Count) : Value

      public data class Distance(public val `value`: com.google.fhir.model.r4.Distance) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) : Value

      public data class HumanName(public val `value`: com.google.fhir.model.r4.HumanName) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) : Value

      public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Value

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r4.SampledData) :
        Value

      public data class Signature(public val `value`: com.google.fhir.model.r4.Signature) : Value

      public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : Value

      public data class ContactDetail(public val `value`: com.google.fhir.model.r4.ContactDetail) :
        Value

      public data class Contributor(public val `value`: com.google.fhir.model.r4.Contributor) :
        Value

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r4.DataRequirement
      ) : Value

      public data class Expression(public val `value`: com.google.fhir.model.r4.Expression) : Value

      public data class ParameterDefinition(
        public val `value`: com.google.fhir.model.r4.ParameterDefinition
      ) : Value

      public data class RelatedArtifact(
        public val `value`: com.google.fhir.model.r4.RelatedArtifact
      ) : Value

      public data class TriggerDefinition(
        public val `value`: com.google.fhir.model.r4.TriggerDefinition
      ) : Value

      public data class UsageContext(public val `value`: com.google.fhir.model.r4.UsageContext) :
        Value

      public data class Dosage(public val `value`: com.google.fhir.model.r4.Dosage) : Value

      public data class Meta(public val `value`: com.google.fhir.model.r4.Meta) : Value

      public companion object {
        public fun from(
          base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
          booleanValue: com.google.fhir.model.r4.Boolean?,
          canonicalValue: com.google.fhir.model.r4.Canonical?,
          codeValue: com.google.fhir.model.r4.Code?,
          dateValue: com.google.fhir.model.r4.Date?,
          dateTimeValue: com.google.fhir.model.r4.DateTime?,
          decimalValue: com.google.fhir.model.r4.Decimal?,
          idValue: com.google.fhir.model.r4.Id?,
          instantValue: com.google.fhir.model.r4.Instant?,
          integerValue: com.google.fhir.model.r4.Integer?,
          markdownValue: com.google.fhir.model.r4.Markdown?,
          oidValue: com.google.fhir.model.r4.Oid?,
          positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
          stringValue: com.google.fhir.model.r4.String?,
          timeValue: com.google.fhir.model.r4.Time?,
          unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
          uriValue: com.google.fhir.model.r4.Uri?,
          urlValue: com.google.fhir.model.r4.Url?,
          uuidValue: com.google.fhir.model.r4.Uuid?,
          AddressValue: com.google.fhir.model.r4.Address?,
          AgeValue: com.google.fhir.model.r4.Age?,
          AnnotationValue: com.google.fhir.model.r4.Annotation?,
          AttachmentValue: com.google.fhir.model.r4.Attachment?,
          CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          CodingValue: com.google.fhir.model.r4.Coding?,
          ContactPointValue: com.google.fhir.model.r4.ContactPoint?,
          CountValue: com.google.fhir.model.r4.Count?,
          DistanceValue: com.google.fhir.model.r4.Distance?,
          DurationValue: com.google.fhir.model.r4.Duration?,
          HumanNameValue: com.google.fhir.model.r4.HumanName?,
          IdentifierValue: com.google.fhir.model.r4.Identifier?,
          MoneyValue: com.google.fhir.model.r4.Money?,
          PeriodValue: com.google.fhir.model.r4.Period?,
          QuantityValue: com.google.fhir.model.r4.Quantity?,
          RangeValue: com.google.fhir.model.r4.Range?,
          RatioValue: com.google.fhir.model.r4.Ratio?,
          ReferenceValue: com.google.fhir.model.r4.Reference?,
          SampledDataValue: com.google.fhir.model.r4.SampledData?,
          SignatureValue: com.google.fhir.model.r4.Signature?,
          TimingValue: com.google.fhir.model.r4.Timing?,
          ContactDetailValue: com.google.fhir.model.r4.ContactDetail?,
          ContributorValue: com.google.fhir.model.r4.Contributor?,
          DataRequirementValue: com.google.fhir.model.r4.DataRequirement?,
          ExpressionValue: com.google.fhir.model.r4.Expression?,
          ParameterDefinitionValue: com.google.fhir.model.r4.ParameterDefinition?,
          RelatedArtifactValue: com.google.fhir.model.r4.RelatedArtifact?,
          TriggerDefinitionValue: com.google.fhir.model.r4.TriggerDefinition?,
          UsageContextValue: com.google.fhir.model.r4.UsageContext?,
          DosageValue: com.google.fhir.model.r4.Dosage?,
          MetaValue: com.google.fhir.model.r4.Meta?,
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
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (SignatureValue != null) return Signature(SignatureValue)
          if (TimingValue != null) return Timing(TimingValue)
          if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
          if (ContributorValue != null) return Contributor(ContributorValue)
          if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
          if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
          if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
          if (UsageContextValue != null) return UsageContext(UsageContextValue)
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

      public fun asReference(): Reference? = this as? Reference

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asSignature(): Signature? = this as? Signature

      public fun asTiming(): Timing? = this as? Timing

      public fun asContactDetail(): ContactDetail? = this as? ContactDetail

      public fun asContributor(): Contributor? = this as? Contributor

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public fun asExpression(): Expression? = this as? Expression

      public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

      public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

      public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

      public fun asUsageContext(): UsageContext? = this as? UsageContext

      public fun asDosage(): Dosage? = this as? Dosage

      public fun asMeta(): Meta? = this as? Meta

      public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
        Value

      public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Value

      public data class Canonical(public val `value`: com.google.fhir.model.r4.Canonical) : Value

      public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Value

      public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Value

      public data class Id(public val `value`: com.google.fhir.model.r4.Id) : Value

      public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r4.Markdown) : Value

      public data class Oid(public val `value`: com.google.fhir.model.r4.Oid) : Value

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
        Value

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

      public data class Time(public val `value`: com.google.fhir.model.r4.Time) : Value

      public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
        Value

      public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Value

      public data class Url(public val `value`: com.google.fhir.model.r4.Url) : Value

      public data class Uuid(public val `value`: com.google.fhir.model.r4.Uuid) : Value

      public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Value

      public data class Age(public val `value`: com.google.fhir.model.r4.Age) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r4.Annotation) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Value

      public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Value

      public data class ContactPoint(public val `value`: com.google.fhir.model.r4.ContactPoint) :
        Value

      public data class Count(public val `value`: com.google.fhir.model.r4.Count) : Value

      public data class Distance(public val `value`: com.google.fhir.model.r4.Distance) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) : Value

      public data class HumanName(public val `value`: com.google.fhir.model.r4.HumanName) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) : Value

      public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Value

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r4.SampledData) :
        Value

      public data class Signature(public val `value`: com.google.fhir.model.r4.Signature) : Value

      public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : Value

      public data class ContactDetail(public val `value`: com.google.fhir.model.r4.ContactDetail) :
        Value

      public data class Contributor(public val `value`: com.google.fhir.model.r4.Contributor) :
        Value

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r4.DataRequirement
      ) : Value

      public data class Expression(public val `value`: com.google.fhir.model.r4.Expression) : Value

      public data class ParameterDefinition(
        public val `value`: com.google.fhir.model.r4.ParameterDefinition
      ) : Value

      public data class RelatedArtifact(
        public val `value`: com.google.fhir.model.r4.RelatedArtifact
      ) : Value

      public data class TriggerDefinition(
        public val `value`: com.google.fhir.model.r4.TriggerDefinition
      ) : Value

      public data class UsageContext(public val `value`: com.google.fhir.model.r4.UsageContext) :
        Value

      public data class Dosage(public val `value`: com.google.fhir.model.r4.Dosage) : Value

      public data class Meta(public val `value`: com.google.fhir.model.r4.Meta) : Value

      public companion object {
        public fun from(
          base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
          booleanValue: com.google.fhir.model.r4.Boolean?,
          canonicalValue: com.google.fhir.model.r4.Canonical?,
          codeValue: com.google.fhir.model.r4.Code?,
          dateValue: com.google.fhir.model.r4.Date?,
          dateTimeValue: com.google.fhir.model.r4.DateTime?,
          decimalValue: com.google.fhir.model.r4.Decimal?,
          idValue: com.google.fhir.model.r4.Id?,
          instantValue: com.google.fhir.model.r4.Instant?,
          integerValue: com.google.fhir.model.r4.Integer?,
          markdownValue: com.google.fhir.model.r4.Markdown?,
          oidValue: com.google.fhir.model.r4.Oid?,
          positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
          stringValue: com.google.fhir.model.r4.String?,
          timeValue: com.google.fhir.model.r4.Time?,
          unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
          uriValue: com.google.fhir.model.r4.Uri?,
          urlValue: com.google.fhir.model.r4.Url?,
          uuidValue: com.google.fhir.model.r4.Uuid?,
          AddressValue: com.google.fhir.model.r4.Address?,
          AgeValue: com.google.fhir.model.r4.Age?,
          AnnotationValue: com.google.fhir.model.r4.Annotation?,
          AttachmentValue: com.google.fhir.model.r4.Attachment?,
          CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          CodingValue: com.google.fhir.model.r4.Coding?,
          ContactPointValue: com.google.fhir.model.r4.ContactPoint?,
          CountValue: com.google.fhir.model.r4.Count?,
          DistanceValue: com.google.fhir.model.r4.Distance?,
          DurationValue: com.google.fhir.model.r4.Duration?,
          HumanNameValue: com.google.fhir.model.r4.HumanName?,
          IdentifierValue: com.google.fhir.model.r4.Identifier?,
          MoneyValue: com.google.fhir.model.r4.Money?,
          PeriodValue: com.google.fhir.model.r4.Period?,
          QuantityValue: com.google.fhir.model.r4.Quantity?,
          RangeValue: com.google.fhir.model.r4.Range?,
          RatioValue: com.google.fhir.model.r4.Ratio?,
          ReferenceValue: com.google.fhir.model.r4.Reference?,
          SampledDataValue: com.google.fhir.model.r4.SampledData?,
          SignatureValue: com.google.fhir.model.r4.Signature?,
          TimingValue: com.google.fhir.model.r4.Timing?,
          ContactDetailValue: com.google.fhir.model.r4.ContactDetail?,
          ContributorValue: com.google.fhir.model.r4.Contributor?,
          DataRequirementValue: com.google.fhir.model.r4.DataRequirement?,
          ExpressionValue: com.google.fhir.model.r4.Expression?,
          ParameterDefinitionValue: com.google.fhir.model.r4.ParameterDefinition?,
          RelatedArtifactValue: com.google.fhir.model.r4.RelatedArtifact?,
          TriggerDefinitionValue: com.google.fhir.model.r4.TriggerDefinition?,
          UsageContextValue: com.google.fhir.model.r4.UsageContext?,
          DosageValue: com.google.fhir.model.r4.Dosage?,
          MetaValue: com.google.fhir.model.r4.Meta?,
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
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (SignatureValue != null) return Signature(SignatureValue)
          if (TimingValue != null) return Timing(TimingValue)
          if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
          if (ContributorValue != null) return Contributor(ContributorValue)
          if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
          if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
          if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
          if (UsageContextValue != null) return UsageContext(UsageContextValue)
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

  /** The clinical priority of a diagnostic order. */
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
