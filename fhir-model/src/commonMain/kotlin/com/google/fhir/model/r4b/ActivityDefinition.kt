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

import com.google.fhir.model.r4b.serializers.ActivityDefinitionDynamicValueSerializer
import com.google.fhir.model.r4b.serializers.ActivityDefinitionParticipantSerializer
import com.google.fhir.model.r4b.serializers.ActivityDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource allows for the definition of some activity to be performed, independent of a
 * particular patient, practitioner, or other performance context.
 */
@Serializable(with = ActivityDefinitionSerializer::class)
@SerialName("ActivityDefinition")
public data class ActivityDefinition(
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
   * An absolute URI that is used to identify this activity definition when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this activity definition is (or will be) published. This URL can be the target of a
   * canonical reference. It SHALL remain the same when the activity definition is stored on
   * different servers.
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
   * A formal identifier that is used to identify this activity definition when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this activity definition outside of FHIR, where it is not possible
   * to use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the activity definition when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the activity definition author and is not expected to be globally unique. For example, it might
   * be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence. To provide a version
   * consistent with the Decision Support Service specification, use the format Major.Minor.Revision
   * (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision
   * Support Service specification. Note that a version is required for non-experimental active
   * assets.
   *
   * There may be different activity definition instances that have the same identifier but
   * different versions. The version can be appended to the url in a reference to allow a reference
   * to a particular business version of the activity definition with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the activity definition. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the activity definition.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * An explanatory or alternate title for the activity definition giving additional information
   * about its content.
   */
  public var subtitle: String? = null,
  /**
   * The status of this activity definition. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of activity definitions that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this activity definition is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of activity definitions that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * A code, group definition, or canonical reference that describes or identifies the intended
   * subject of the activity being defined. Canonical references are allowed to support the
   * definition of protocols for drug and substance quality specifications, and is allowed to
   * reference a MedicinalProductDefinition, SubstanceDefinition, AdministrableProductDefinition,
   * ManufacturedItemDefinition, or PackagedProductDefinition resource.
   *
   * Note that the choice of canonical for the subject element was introduced in R4B to support
   * pharmaceutical quality use cases. To ensure as much backwards-compatibility as possible, it is
   * recommended to only use the new canonical type with these use cases.
   */
  public var subject: Subject? = null,
  /**
   * The date (and optionally time) when the activity definition was published. The date must change
   * when the business version changes and it must change if the status code changes. In addition,
   * it should change when the substantive content of the activity definition changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the activity definition. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the activity definition.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the activity
   * definition is the organization or individual primarily responsible for the maintenance and
   * upkeep of the activity definition. This is not necessarily the same individual or organization
   * that developed and initially authored the content. The publisher is the primary point of
   * contact for questions or issues with the activity definition. This item SHOULD be populated
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
   * A free text natural language description of the activity definition from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as why the activity definition was built,
   * comments about misuse, instructions for clinical use and interpretation, literature references,
   * examples from the paper world, etc. It is not a rendering of the activity definition as
   * conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the
   * information is available from context (e.g. the language of the activity definition is presumed
   * to be the predominant language in the place the activity definition was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate activity definition instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the activity definition is intended to be used.
   *
   * It may be possible for the activity definition to be used in jurisdictions other than those for
   * which it was originally designed or intended.
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this activity definition is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the activity definition. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * activity definition.
   */
  public var purpose: Markdown? = null,
  /** A detailed description of how the activity definition is used from a clinical perspective. */
  public var usage: String? = null,
  /**
   * A copyright statement relating to the activity definition and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the activity
   * definition.
   */
  public var copyright: Markdown? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the activity definition content was or is planned to be in active use.
   *
   * The effective period for a activity definition determines when the content is applicable for
   * usage and is independent of publication and review dates. For example, a measure intended to be
   * used for the year 2016 might be published in 2015.
   */
  public var effectivePeriod: Period? = null,
  /**
   * Descriptive topics related to the content of the activity. Topics provide a high-level
   * categorization of the activity that can be useful for filtering and searching.
   */
  public var topic: List<CodeableConcept?>? = null,
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * content.
   */
  public var author: List<ContactDetail?>? = null,
  /** An individual or organization primarily responsible for internal coherence of the content. */
  public var editor: List<ContactDetail?>? = null,
  /**
   * An individual or organization primarily responsible for review of some aspect of the content.
   */
  public var reviewer: List<ContactDetail?>? = null,
  /**
   * An individual or organization responsible for officially endorsing the content for use in some
   * setting.
   */
  public var endorser: List<ContactDetail?>? = null,
  /**
   * Related artifacts such as additional documentation, justification, or bibliographic references.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /**
   * A reference to a Library resource containing any formal logic used by the activity definition.
   */
  public var library: List<Canonical?>? = null,
  /**
   * A description of the kind of resource the activity definition is representing. For example, a
   * MedicationRequest, a ServiceRequest, or a CommunicationRequest. Typically, but not always, this
   * is a Request resource.
   *
   * May determine what types of extensions are permitted.
   */
  public var kind: Enumeration<ActivityDefinitionKind>? = null,
  /** A profile to which the target of the activity definition is expected to conform. */
  public var profile: Canonical? = null,
  /**
   * Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of
   * encounter.
   *
   * Tends to be less relevant for activities involving particular products.
   */
  public var code: CodeableConcept? = null,
  /**
   * Indicates the level of authority/intentionality associated with the activity and where the
   * request should fit into the workflow chain.
   */
  public var intent: Enumeration<RequestIntent>? = null,
  /** Indicates how quickly the activity should be addressed with respect to other requests. */
  public var priority: Enumeration<RequestPriority>? = null,
  /**
   * Set this to true if the definition is to indicate that a particular activity should NOT be
   * performed. If true, this element should be interpreted to reinforce a negative coding. For
   * example NPO as a code with a doNotPerform of true would still indicate to NOT perform the
   * action.
   *
   * This element is not intended to be used to communicate a decision support response to cancel an
   * order in progress. That should be done with the "remove" type of a PlanDefinition or
   * RequestGroup.
   */
  public var doNotPerform: Boolean? = null,
  /** The period, timing or frequency upon which the described activity is to occur. */
  public var timing: Timing? = null,
  /**
   * Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic,
   * etc.
   *
   * May reference a specific clinical location or may just identify a type of location.
   */
  public var location: Reference? = null,
  /** Indicates who should participate in performing the action described. */
  public var participant: List<Participant>? = null,
  /** Identifies the food, drug or other product being consumed or supplied in the activity. */
  public var product: Product? = null,
  /** Identifies the quantity expected to be consumed at once (per dose, per meal, etc.). */
  public var quantity: Quantity? = null,
  /**
   * Provides detailed dosage instructions in the same way that they are described for
   * MedicationRequest resources.
   *
   * If a dosage instruction is used, the definition should not specify timing or quantity.
   */
  public var dosage: List<Dosage?>? = null,
  /**
   * Indicates the sites on the subject's body where the procedure should be performed (I.e. the
   * target sites).
   *
   * Only used if not implicit in the code found in ServiceRequest.type.
   */
  public var bodySite: List<CodeableConcept?>? = null,
  /**
   * Defines specimen requirements for the action to be performed, such as required specimens for a
   * lab test.
   */
  public var specimenRequirement: List<Reference?>? = null,
  /**
   * Defines observation requirements for the action to be performed, such as body weight or surface
   * area.
   */
  public var observationRequirement: List<Reference?>? = null,
  /** Defines the observations that are expected to be produced by the action. */
  public var observationResultRequirement: List<Reference?>? = null,
  /**
   * A reference to a StructureMap resource that defines a transform that can be executed to produce
   * the intent resource using the ActivityDefinition instance as the input.
   *
   * Note that if both a transform and dynamic values are specified, the dynamic values will be
   * applied to the result of the transform.
   */
  public var transform: Canonical? = null,
  /**
   * Dynamic values that will be evaluated to produce values for elements of the resulting resource.
   * For example, if the dosage of a medication must be computed based on the patient's weight, a
   * dynamic value would be used to specify an expression that calculated the weight, and the path
   * on the request resource that would contain the result.
   *
   * Dynamic values are applied in the order in which they are defined in the ActivityDefinition.
   * Note that if both a transform and dynamic values are specified, the dynamic values will be
   * applied to the result of the transform.
   */
  public var dynamicValue: List<DynamicValue>? = null,
) : DomainResource() {
  /** Indicates who should participate in performing the action described. */
  @Serializable(with = ActivityDefinitionParticipantSerializer::class)
  public class Participant(
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
    /** The type of participant in the action. */
    public var type: Enumeration<ActivityParticipantType>? = null,
    /** The role the participant should play in performing the described action. */
    public var role: CodeableConcept? = null,
  ) : BackboneElement()

  /**
   * Dynamic values that will be evaluated to produce values for elements of the resulting resource.
   * For example, if the dosage of a medication must be computed based on the patient's weight, a
   * dynamic value would be used to specify an expression that calculated the weight, and the path
   * on the request resource that would contain the result.
   */
  @Serializable(with = ActivityDefinitionDynamicValueSerializer::class)
  public class DynamicValue(
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
     * The path to the element to be customized. This is the path on the resource that will hold the
     * result of the calculation defined by the expression. The specified path SHALL be a FHIRPath
     * resolveable on the specified target type of the ActivityDefinition, and SHALL consist only of
     * identifiers, constant indexers, and a restricted subset of functions. The path is allowed to
     * contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse
     * multiple-cardinality sub-elements (see the [Simple FHIRPath Profile](fhirpath.html#simple)
     * for full details).
     *
     * The path attribute contains a [Simple FHIRPath Subset](fhirpath.html#simple) that allows path
     * traversal, but not calculation.
     */
    public var path: String? = null,
    /**
     * An expression specifying the value of the customized element.
     *
     * The expression may be inlined, or may be a reference to a named expression within a logic
     * library referenced by the library element.
     */
    public var expression: Expression? = null,
  ) : BackboneElement()

  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public fun asCanonical(): Canonical? = this as? Canonical

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Subject

    public data class Canonical(public val `value`: com.google.fhir.model.r4b.Canonical) : Subject

    public companion object {
      public fun from(
        CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        ReferenceValue: com.google.fhir.model.r4b.Reference?,
        canonicalValue: com.google.fhir.model.r4b.Canonical?,
      ): Subject? {
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        return null
      }
    }
  }

  public sealed interface Timing {
    public fun asTiming(): Timing? = this as? Timing

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asAge(): Age? = this as? Age

    public fun asPeriod(): Period? = this as? Period

    public fun asRange(): Range? = this as? Range

    public fun asDuration(): Duration? = this as? Duration

    public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) :
      ActivityDefinition.Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
      ActivityDefinition.Timing

    public data class Age(public val `value`: com.google.fhir.model.r4b.Age) :
      ActivityDefinition.Timing

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) :
      ActivityDefinition.Timing

    public data class Range(public val `value`: com.google.fhir.model.r4b.Range) :
      ActivityDefinition.Timing

    public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) :
      ActivityDefinition.Timing

    public companion object {
      public fun from(
        TimingValue: com.google.fhir.model.r4b.Timing?,
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        AgeValue: com.google.fhir.model.r4b.Age?,
        PeriodValue: com.google.fhir.model.r4b.Period?,
        RangeValue: com.google.fhir.model.r4b.Range?,
        DurationValue: com.google.fhir.model.r4b.Duration?,
      ): ActivityDefinition.Timing? {
        if (TimingValue != null) return Timing(TimingValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (AgeValue != null) return Age(AgeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (RangeValue != null) return Range(RangeValue)
        if (DurationValue != null) return Duration(DurationValue)
        return null
      }
    }
  }

  public sealed interface Product {
    public fun asReference(): Reference? = this as? Reference

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Product

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Product

    public companion object {
      public fun from(
        ReferenceValue: com.google.fhir.model.r4b.Reference?,
        CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
      ): Product? {
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        return null
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
    /** The participant is a person related to the patient. */
    Related_Person(
      "related-person",
      "http://hl7.org/fhir/action-participant-type",
      "Related Person",
      "The participant is a person related to the patient.",
    ),
    /** The participant is a system or device used in the care of the patient. */
    Device(
      "device",
      "http://hl7.org/fhir/action-participant-type",
      "Device",
      "The participant is a system or device used in the care of the patient.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ActivityParticipantType =
        when (code) {
          "patient" -> Patient
          "practitioner" -> Practitioner
          "related-person" -> Related_Person
          "device" -> Device
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ActivityParticipantType")
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
}
