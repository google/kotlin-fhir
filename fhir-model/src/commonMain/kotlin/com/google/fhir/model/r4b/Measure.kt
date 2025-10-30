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

import com.google.fhir.model.r4b.serializers.MeasureGroupPopulationSerializer
import com.google.fhir.model.r4b.serializers.MeasureGroupSerializer
import com.google.fhir.model.r4b.serializers.MeasureGroupStratifierComponentSerializer
import com.google.fhir.model.r4b.serializers.MeasureGroupStratifierSerializer
import com.google.fhir.model.r4b.serializers.MeasureSerializer
import com.google.fhir.model.r4b.serializers.MeasureSubjectSerializer
import com.google.fhir.model.r4b.serializers.MeasureSupplementalDataSerializer
import com.google.fhir.model.r4b.terminologies.PublicationStatus
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** The Measure resource provides the definition of a quality measure. */
@Serializable(with = MeasureSerializer::class)
@SerialName("Measure")
public data class Measure(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override val id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override val meta: Meta? = null,
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
  override val implicitRules: Uri? = null,
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
  override val language: Code? = null,
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
  override val text: Narrative? = null,
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
  override val contained: List<Resource> = listOf(),
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
  override val extension: List<Extension> = listOf(),
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
  override val modifierExtension: List<Extension> = listOf(),
  /**
   * An absolute URI that is used to identify this measure when it is referenced in a specification,
   * model, design or an instance; also called its canonical identifier. This SHOULD be globally
   * unique and SHOULD be a literal address at which at which an authoritative instance of this
   * measure is (or will be) published. This URL can be the target of a canonical reference. It
   * SHALL remain the same when the measure is stored on different servers.
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
  public val url: Uri? = null,
  /**
   * A formal identifier that is used to identify this measure when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this measure outside of FHIR, where it is not possible to use the
   * logical URI.
   */
  public val identifier: List<Identifier> = listOf(),
  /**
   * The identifier that is used to identify this version of the measure when it is referenced in a
   * specification, model, design or instance. This is an arbitrary value managed by the measure
   * author and is not expected to be globally unique. For example, it might be a timestamp (e.g.
   * yyyymmdd) if a managed version is not available. There is also no expectation that versions can
   * be placed in a lexicographical sequence. To provide a version consistent with the Decision
   * Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more
   * information on versioning knowledge assets, refer to the Decision Support Service
   * specification. Note that a version is required for non-experimental active artifacts.
   *
   * There may be different measure instances that have the same identifier but different versions.
   * The version can be appended to the url in a reference to allow a reference to a particular
   * business version of the measure with the format [url]|[version].
   */
  public val version: String? = null,
  /**
   * A natural language name identifying the measure. This name should be usable as an identifier
   * for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public val name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the measure.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public val title: String? = null,
  /**
   * An explanatory or alternate title for the measure giving additional information about its
   * content.
   */
  public val subtitle: String? = null,
  /**
   * The status of this measure. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of measures that are appropriate for use versus not.
   */
  public val status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this measure is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of measures that are appropriate for use versus not.
   */
  public val experimental: Boolean? = null,
  /**
   * The intended subjects for the measure. If this element is not provided, a Patient subject is
   * assumed, but the subject of the measure can be anything.
   *
   * The subject of the measure is critical in interpreting the criteria definitions, as the logic
   * in the measures is evaluated with respect to a particular subject. This corresponds roughly to
   * the notion of a Compartment in that it limits what content is available based on its
   * relationship to the subject. In CQL, this corresponds to the context declaration.
   */
  public val subject: Subject? = null,
  /**
   * The date (and optionally time) when the measure was published. The date must change when the
   * business version changes and it must change if the status code changes. In addition, it should
   * change when the substantive content of the measure changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the measure. Additional specific dates may be added as extensions
   * or be found by consulting Provenances associated with past versions of the resource.
   */
  public val date: DateTime? = null,
  /**
   * The name of the organization or individual that published the measure.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the measure is
   * the organization or individual primarily responsible for the maintenance and upkeep of the
   * measure. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the measure. This item SHOULD be populated unless the information is available from
   * context.
   */
  public val publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public val contact: List<ContactDetail> = listOf(),
  /**
   * A free text natural language description of the measure from a consumer's perspective.
   *
   * This description can be used to capture details such as why the measure was built, comments
   * about misuse, instructions for clinical use and interpretation, literature references, examples
   * from the paper world, etc. It is not a rendering of the measure as conveyed in the 'text' field
   * of the resource itself. This item SHOULD be populated unless the information is available from
   * context (e.g. the language of the measure is presumed to be the predominant language in the
   * place the measure was created).
   */
  public val description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate measure instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public val useContext: List<UsageContext> = listOf(),
  /**
   * A legal or geographic region in which the measure is intended to be used.
   *
   * It may be possible for the measure to be used in jurisdictions other than those for which it
   * was originally designed or intended.
   */
  public val jurisdiction: List<CodeableConcept> = listOf(),
  /**
   * Explanation of why this measure is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the measure. Instead, it provides traceability of
   * ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this measure.
   */
  public val purpose: Markdown? = null,
  /** A detailed description, from a clinical perspective, of how the measure is used. */
  public val usage: String? = null,
  /**
   * A copyright statement relating to the measure and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the measure.
   */
  public val copyright: Markdown? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   */
  public val approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   */
  public val lastReviewDate: Date? = null,
  /**
   * The period during which the measure content was or is planned to be in active use.
   *
   * The effective period for a measure determines when the content is applicable for usage and is
   * independent of publication and review dates. For example, a measure intended to be used for the
   * year 2016 might be published in 2015.
   */
  public val effectivePeriod: Period? = null,
  /**
   * Descriptive topics related to the content of the measure. Topics provide a high-level
   * categorization grouping types of measures that can be useful for filtering and searching.
   */
  public val topic: List<CodeableConcept> = listOf(),
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * content.
   */
  public val author: List<ContactDetail> = listOf(),
  /** An individual or organization primarily responsible for internal coherence of the content. */
  public val editor: List<ContactDetail> = listOf(),
  /**
   * An individual or organization primarily responsible for review of some aspect of the content.
   */
  public val reviewer: List<ContactDetail> = listOf(),
  /**
   * An individual or organization responsible for officially endorsing the content for use in some
   * setting.
   */
  public val endorser: List<ContactDetail> = listOf(),
  /**
   * Related artifacts such as additional documentation, justification, or bibliographic references.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public val relatedArtifact: List<RelatedArtifact> = listOf(),
  /** A reference to a Library resource containing the formal logic used by the measure. */
  public val library: List<Canonical> = listOf(),
  /**
   * Notices and disclaimers regarding the use of the measure or related to intellectual property
   * (such as code systems) referenced by the measure.
   */
  public val disclaimer: Markdown? = null,
  /**
   * Indicates how the calculation is performed for the measure, including proportion, ratio,
   * continuous-variable, and cohort. The value set is extensible, allowing additional measure
   * scoring types to be represented.
   */
  public val scoring: CodeableConcept? = null,
  /**
   * If this is a composite measure, the scoring method used to combine the component measures to
   * determine the composite score.
   */
  public val compositeScoring: CodeableConcept? = null,
  /**
   * Indicates whether the measure is used to examine a process, an outcome over time, a
   * patient-reported outcome, or a structure measure such as utilization.
   */
  public val type: List<CodeableConcept> = listOf(),
  /**
   * A description of the risk adjustment factors that may impact the resulting score for the
   * measure and how they may be accounted for when computing and reporting measure results.
   *
   * Describes the method of adjusting for clinical severity and conditions present at the start of
   * care that can influence patient outcomes for making valid comparisons of outcome measures
   * across providers. Indicates whether a measure is subject to the statistical process for
   * reducing, removing, or clarifying the influences of confounding factors to allow for more
   * useful comparisons.
   */
  public val riskAdjustment: String? = null,
  /**
   * Describes how to combine the information calculated, based on logic in each of several
   * populations, into one summarized result.
   *
   * The measure rate for an organization or clinician is based upon the entities’ aggregate data
   * and summarizes the performance of the entity over a given time period (e.g., monthly,
   * quarterly, yearly). The aggregated data are derived from the results of a specific measure
   * algorithm and, if appropriate, the application of specific risk adjustment models. Can also be
   * used to describe how to risk adjust the data based on supplemental data elements described in
   * the eMeasure (e.g., pneumonia hospital measures antibiotic selection in the ICU versus non-ICU
   * and then the roll-up of the two). This could be applied to aggregated cohort measure
   * definitions (e.g., CDC's aggregate reporting for TB at the state level).
   */
  public val rateAggregation: String? = null,
  /**
   * Provides a succinct statement of the need for the measure. Usually includes statements
   * pertaining to importance criterion: impact, gap in care, and evidence.
   */
  public val rationale: Markdown? = null,
  /**
   * Provides a summary of relevant clinical guidelines or other clinical recommendations supporting
   * the measure.
   */
  public val clinicalRecommendationStatement: Markdown? = null,
  /**
   * Information on whether an increase or decrease in score is the preferred result (e.g., a higher
   * score indicates better quality OR a lower score indicates better quality OR quality is within a
   * range).
   */
  public val improvementNotation: CodeableConcept? = null,
  /** Provides a description of an individual term used within the measure. */
  public val definition: List<Markdown> = listOf(),
  /**
   * Additional guidance for the measure including how it can be used in a clinical context, and the
   * intent of the measure.
   */
  public val guidance: Markdown? = null,
  /** A group of population criteria for the measure. */
  public val group: List<Group> = listOf(),
  /**
   * The supplemental data criteria for the measure report, specified as either the name of a valid
   * CQL expression within a referenced library, or a valid FHIR Resource Path.
   *
   * Note that supplemental data are reported as observations for each patient and included in the
   * evaluatedResources bundle. See the MeasureReport resource or the Quality Reporting topic for
   * more information.
   */
  public val supplementalData: List<SupplementalData> = listOf(),
) : DomainResource() {
  /** A group of population criteria for the measure. */
  @Serializable(with = MeasureGroupSerializer::class)
  public class Group(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /**
     * Indicates a meaning for the group. This can be as simple as a unique identifier, or it can
     * establish meaning in a broader context by drawing from a terminology, allowing groups to be
     * correlated across measures.
     */
    public val code: CodeableConcept? = null,
    /** The human readable description of this population group. */
    public val description: String? = null,
    /** A population criteria for the measure. */
    public val population: List<Population> = listOf(),
    /**
     * The stratifier criteria for the measure report, specified as either the name of a valid CQL
     * expression defined within a referenced library or a valid FHIR Resource Path.
     */
    public val stratifier: List<Stratifier> = listOf(),
  ) : BackboneElement() {
    /** A population criteria for the measure. */
    @Serializable(with = MeasureGroupPopulationSerializer::class)
    public class Population(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** The type of population criteria. */
      public val code: CodeableConcept? = null,
      /** The human readable description of this population criteria. */
      public val description: String? = null,
      /**
       * An expression that specifies the criteria for the population, typically the name of an
       * expression in a library.
       *
       * In the case of a continuous-variable or ratio measure, this may be the name of a function
       * that calculates the value of the individual observation for each patient or event in the
       * population. For these types of measures, individual observations are reported as
       * observation resources included in the evaluatedResources bundle for each patient. See the
       * MeasureReport resource or the Quality Reporting topic for more information.
       */
      public val criteria: Expression,
    ) : BackboneElement()

    /**
     * The stratifier criteria for the measure report, specified as either the name of a valid CQL
     * expression defined within a referenced library or a valid FHIR Resource Path.
     */
    @Serializable(with = MeasureGroupStratifierSerializer::class)
    public class Stratifier(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /**
       * Indicates a meaning for the stratifier. This can be as simple as a unique identifier, or it
       * can establish meaning in a broader context by drawing from a terminology, allowing
       * stratifiers to be correlated across measures.
       */
      public val code: CodeableConcept? = null,
      /** The human readable description of this stratifier criteria. */
      public val description: String? = null,
      /**
       * An expression that specifies the criteria for the stratifier. This is typically the name of
       * an expression defined within a referenced library, but it may also be a path to a
       * stratifier element.
       */
      public val criteria: Expression? = null,
      /**
       * A component of the stratifier criteria for the measure report, specified as either the name
       * of a valid CQL expression defined within a referenced library or a valid FHIR Resource
       * Path.
       *
       * Stratifiers are defined either as a single criteria, or as a set of component criteria.
       */
      public val component: List<Component> = listOf(),
    ) : BackboneElement() {
      /**
       * A component of the stratifier criteria for the measure report, specified as either the name
       * of a valid CQL expression defined within a referenced library or a valid FHIR Resource
       * Path.
       */
      @Serializable(with = MeasureGroupStratifierComponentSerializer::class)
      public class Component(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override val id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override val extension: List<Extension> = listOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override val modifierExtension: List<Extension> = listOf(),
        /**
         * Indicates a meaning for the stratifier component. This can be as simple as a unique
         * identifier, or it can establish meaning in a broader context by drawing from a
         * terminology, allowing stratifiers to be correlated across measures.
         */
        public val code: CodeableConcept? = null,
        /** The human readable description of this stratifier criteria component. */
        public val description: String? = null,
        /**
         * An expression that specifies the criteria for this component of the stratifier. This is
         * typically the name of an expression defined within a referenced library, but it may also
         * be a path to a stratifier element.
         */
        public val criteria: Expression,
      ) : BackboneElement()
    }
  }

  /**
   * The supplemental data criteria for the measure report, specified as either the name of a valid
   * CQL expression within a referenced library, or a valid FHIR Resource Path.
   */
  @Serializable(with = MeasureSupplementalDataSerializer::class)
  public class SupplementalData(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /**
     * Indicates a meaning for the supplemental data. This can be as simple as a unique identifier,
     * or it can establish meaning in a broader context by drawing from a terminology, allowing
     * supplemental data to be correlated across measures.
     */
    public val code: CodeableConcept? = null,
    /**
     * An indicator of the intended usage for the supplemental data element. Supplemental data
     * indicates the data is additional information requested to augment the measure information.
     * Risk adjustment factor indicates the data is additional information used to calculate risk
     * adjustment factors when applying a risk model to the measure calculation.
     */
    public val usage: List<CodeableConcept> = listOf(),
    /** The human readable description of this supplemental data. */
    public val description: String? = null,
    /**
     * The criteria for the supplemental data. This is typically the name of a valid expression
     * defined within a referenced library, but it may also be a path to a specific data element.
     * The criteria defines the data to be returned for this element.
     */
    public val criteria: Expression,
  ) : BackboneElement()

  @Serializable(with = MeasureSubjectSerializer::class)
  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Subject

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        referenceValue: com.google.fhir.model.r4b.Reference?,
      ): Subject? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }
}
