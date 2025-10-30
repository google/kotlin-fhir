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

import com.google.fhir.model.r5.serializers.EvidenceCertaintySerializer
import com.google.fhir.model.r5.serializers.EvidenceCiteAsSerializer
import com.google.fhir.model.r5.serializers.EvidenceSerializer
import com.google.fhir.model.r5.serializers.EvidenceStatisticAttributeEstimateSerializer
import com.google.fhir.model.r5.serializers.EvidenceStatisticModelCharacteristicSerializer
import com.google.fhir.model.r5.serializers.EvidenceStatisticModelCharacteristicVariableSerializer
import com.google.fhir.model.r5.serializers.EvidenceStatisticSampleSizeSerializer
import com.google.fhir.model.r5.serializers.EvidenceStatisticSerializer
import com.google.fhir.model.r5.serializers.EvidenceVariableDefinitionSerializer
import com.google.fhir.model.r5.serializers.EvidenceVersionAlgorithmSerializer
import com.google.fhir.model.r5.terminologies.PublicationStatus
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept
 * including the evidence variables (e.g., population, exposures/interventions, comparators,
 * outcomes, measured variables, confounding variables), the statistics, and the certainty of this
 * evidence.
 */
@Serializable(with = EvidenceSerializer::class)
@SerialName("Evidence")
public data class Evidence(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
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
   * to an implementation guide that defines these special rules as part of its narrative along with
   * other profiles, value sets, etc.
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
   * Contained resources do not have a narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override val text: Narrative? = null,
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
  override val contained: List<Resource> = listOf(),
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
  override val extension: List<Extension> = listOf(),
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
  override val modifierExtension: List<Extension> = listOf(),
  /**
   * An absolute URI that is used to identify this evidence when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * summary is (or will be) published. This URL can be the target of a canonical reference. It
   * SHALL remain the same when the summary is stored on different servers.
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the meta.source element to indicate where the current master
   * source of the resource can be found.
   */
  public val url: Uri? = null,
  /**
   * A formal identifier that is used to identify this summary when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this summary outside of FHIR, where it is not possible to use the
   * logical URI.
   */
  public val identifier: List<Identifier> = listOf(),
  /**
   * The identifier that is used to identify this version of the summary when it is referenced in a
   * specification, model, design or instance. This is an arbitrary value managed by the summary
   * author and is not expected to be globally unique. For example, it might be a timestamp (e.g.
   * yyyymmdd) if a managed version is not available. There is also no expectation that versions can
   * be placed in a lexicographical sequence.
   *
   * The determination of when to create a new version of a resource (same url, new version) vs.
   * defining a new artifact is up to the author. Considerations for making this decision are found
   * in Technical and Business Versions.
   */
  public val version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which is more current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 is newer, and a 0 if the version ordering can't successfully be
   * determined.
   */
  public val versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the evidence. This name should be usable as an identifier
   * for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public val name: String? = null,
  /** A short, descriptive, user-friendly title for the summary. */
  public val title: String? = null,
  /** Citation Resource or display of suggested citation for this evidence. */
  public val citeAs: CiteAs? = null,
  /**
   * The status of this summary. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of summarys s that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this resource is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   */
  public val experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the summary was last significantly changed. The date must
   * change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the summary changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the summary. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val date: DateTime? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val lastReviewDate: Date? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the evidence.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the evidence is
   * the organization or individual primarily responsible for the maintenance and upkeep of the
   * evidence. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the evidence. This item SHOULD be populated unless the information is available
   * from context.
   */
  public val publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val contact: List<ContactDetail> = listOf(),
  /**
   * An individiual, organization, or device primarily involved in the creation and maintenance of
   * the content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   */
  public val author: List<ContactDetail> = listOf(),
  /**
   * An individiual, organization, or device primarily responsible for internal coherence of the
   * content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   */
  public val editor: List<ContactDetail> = listOf(),
  /**
   * An individiual, organization, or device primarily responsible for review of some aspect of the
   * content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val reviewer: List<ContactDetail> = listOf(),
  /**
   * An individiual, organization, or device responsible for officially endorsing the content for
   * use in some setting.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val endorser: List<ContactDetail> = listOf(),
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate evidence instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public val useContext: List<UsageContext> = listOf(),
  /**
   * Explanation of why this Evidence is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the Evidence. Instead, it provides traceability of
   * ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this Evidence.
   */
  public val purpose: Markdown? = null,
  /**
   * A copyright statement relating to the Evidence and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the Evidence.
   *
   * The short copyright declaration (e.g. (c) '2015+ xyz organization' should be sent in the
   * copyrightLabel element.
   */
  public val copyright: Markdown? = null,
  /**
   * A short string (<50 characters), suitable for inclusion in a page footer that identifies the
   * copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All
   * rights reserved', 'Some rights reserved').
   *
   * The (c) symbol should NOT be included in this string. It will be added by software when
   * rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in
   * the more general 'copyright' element.
   */
  public val copyrightLabel: String? = null,
  /** Link or citation to artifact associated with the summary. */
  public val relatedArtifact: List<RelatedArtifact> = listOf(),
  /**
   * A free text natural language description of the evidence from a consumer's perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the evidence as conveyed in the 'text' field of the resource itself. This
   * item SHOULD be populated unless the information is available from context (e.g. the language of
   * the evidence is presumed to be the predominant language in the place the evidence was created).
   */
  public val description: Markdown? = null,
  /** Declarative description of the Evidence. */
  public val assertion: Markdown? = null,
  /** Footnotes and/or explanatory notes. */
  public val note: List<Annotation> = listOf(),
  /** Evidence variable such as population, exposure, or outcome. */
  public val variableDefinition: List<VariableDefinition> = listOf(),
  /** The method to combine studies. */
  public val synthesisType: CodeableConcept? = null,
  /**
   * The design of the study that produced this evidence. The design is described with any number of
   * study design characteristics.
   */
  public val studyDesign: List<CodeableConcept> = listOf(),
  /** Values and parameters for a single statistic. */
  public val statistic: List<Statistic> = listOf(),
  /** Assessment of certainty, confidence in the estimates, or quality of the evidence. */
  public val certainty: List<Certainty> = listOf(),
) : DomainResource() {
  /** Evidence variable such as population, exposure, or outcome. */
  @Serializable(with = EvidenceVariableDefinitionSerializer::class)
  public class VariableDefinition(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** A text description or summary of the variable. */
    public val description: Markdown? = null,
    /** Footnotes and/or explanatory notes. */
    public val note: List<Annotation> = listOf(),
    /**
     * population | subpopulation | exposure | referenceExposure | measuredVariable | confounder.
     */
    public val variableRole: CodeableConcept,
    /** Definition of the actual variable related to the statistic(s). */
    public val observed: Reference? = null,
    /** Definition of the intended variable related to the Evidence. */
    public val intended: Reference? = null,
    /** Indication of quality of match between intended variable to actual variable. */
    public val directnessMatch: CodeableConcept? = null,
  ) : BackboneElement()

  /** Values and parameters for a single statistic. */
  @Serializable(with = EvidenceStatisticSerializer::class)
  public class Statistic(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** A description of the content value of the statistic. */
    public val description: Markdown? = null,
    /** Footnotes and/or explanatory notes. */
    public val note: List<Annotation> = listOf(),
    /** Type of statistic, e.g., relative risk. */
    public val statisticType: CodeableConcept? = null,
    /**
     * When the measured variable is handled categorically, the category element is used to define
     * which category the statistic is reporting.
     *
     * Simple strings can be used for descriptive purposes. Exact matching to
     * EvidenceVariable.category.name for the
     * Evidence.variableDefinition[variableRole=measuredVariable].observed=Reference(EvidenceVariable)
     * could facilitate validation within datasets.
     */
    public val category: CodeableConcept? = null,
    /** Statistic value. */
    public val quantity: Quantity? = null,
    /**
     * The number of events associated with the statistic, where the unit of analysis is different
     * from numberAffected, sampleSize.knownDataCount and sampleSize.numberOfParticipants.
     *
     * When the number of events is the statistic, use Evidence.statistic.quantity and set
     * Evidence.statistic.type.coding.code=C25463 and Evidence.statistic.type.coding.display=Count.
     * When the statistic is an Event Rate (where individual participants may have 2 or more
     * events), use Evidence.statistic.numberOfEvents to record the total number of events rather
     * than the number of participants with events.
     */
    public val numberOfEvents: UnsignedInt? = null,
    /**
     * The number of participants affected where the unit of analysis is the same as
     * sampleSize.knownDataCount and sampleSize.numberOfParticipants.
     *
     * When the number affected is the statistic, use Evidence.statistic.quantity and set
     * Evidence.statistic.type.coding.code=C25463 and Evidence.statistic.type.coding.display=Count.
     * When the statistic is a Proportion, use Evidence.statistic.numberAffected and enter an
     * integer as the value. When the statistic is an Event Rate (where individual participants may
     * have 2 or more events), use Evidence.statistic.numberAffected to record the number of
     * participants with events rather than the total number of events.
     */
    public val numberAffected: UnsignedInt? = null,
    /** Number of samples in the statistic. */
    public val sampleSize: SampleSize? = null,
    /** A statistical attribute of the statistic such as a measure of heterogeneity. */
    public val attributeEstimate: List<AttributeEstimate> = listOf(),
    /** A component of the method to generate the statistic. */
    public val modelCharacteristic: List<ModelCharacteristic> = listOf(),
  ) : BackboneElement() {
    /** Number of samples in the statistic. */
    @Serializable(with = EvidenceStatisticSampleSizeSerializer::class)
    public class SampleSize(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** Human-readable summary of population sample size. */
      public val description: Markdown? = null,
      /** Footnote or explanatory note about the sample size. */
      public val note: List<Annotation> = listOf(),
      /** Number of participants in the population. */
      public val numberOfStudies: UnsignedInt? = null,
      /** A human-readable string to clarify or explain concepts about the sample size. */
      public val numberOfParticipants: UnsignedInt? = null,
      /** Number of participants with known results for measured variables. */
      public val knownDataCount: UnsignedInt? = null,
    ) : BackboneElement()

    /** A statistical attribute of the statistic such as a measure of heterogeneity. */
    @Serializable(with = EvidenceStatisticAttributeEstimateSerializer::class)
    public class AttributeEstimate(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** Human-readable summary of the estimate. */
      public val description: Markdown? = null,
      /** Footnote or explanatory note about the estimate. */
      public val note: List<Annotation> = listOf(),
      /** The type of attribute estimate, e.g., confidence interval or p value. */
      public val type: CodeableConcept? = null,
      /**
       * The singular quantity of the attribute estimate, for attribute estimates represented as
       * single values; also used to report unit of measure.
       *
       * Often the p value
       */
      public val quantity: Quantity? = null,
      /** Use 95 for a 95% confidence interval. */
      public val level: Decimal? = null,
      /** Lower bound of confidence interval. */
      public val range: Range? = null,
      /**
       * A nested attribute estimate; which is the attribute estimate of an attribute estimate.
       *
       * A nested attribute estimate; which is the attribute estimate of an attribute estimate
       */
      public val attributeEstimate: List<AttributeEstimate> = listOf(),
    ) : BackboneElement()

    /** A component of the method to generate the statistic. */
    @Serializable(with = EvidenceStatisticModelCharacteristicSerializer::class)
    public class ModelCharacteristic(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** Description of a component of the method to generate the statistic. */
      public val code: CodeableConcept,
      /**
       * Further specification of the quantified value of the component of the method to generate
       * the statistic.
       */
      public val `value`: Quantity? = null,
      /** A variable adjusted for in the adjusted analysis. */
      public val variable: List<Variable> = listOf(),
      /** An attribute of the statistic used as a model characteristic. */
      public val attributeEstimate: List<AttributeEstimate> = listOf(),
    ) : BackboneElement() {
      /** A variable adjusted for in the adjusted analysis. */
      @Serializable(with = EvidenceStatisticModelCharacteristicVariableSerializer::class)
      public class Variable(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override val id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
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
         * and managable, there is a strict set of governance applied to the definition and use of
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
        /** Description of the variable. */
        public val variableDefinition: Reference,
        /** How the variable is classified for use in adjusted analysis. */
        public val handling: Enumeration<EvidenceVariableHandling>? = null,
        /** Description for grouping of ordinal or polychotomous variables. */
        public val valueCategory: List<CodeableConcept> = listOf(),
        /** Discrete value for grouping of ordinal or polychotomous variables. */
        public val valueQuantity: List<Quantity> = listOf(),
        /** Range of values for grouping of ordinal or polychotomous variables. */
        public val valueRange: List<Range> = listOf(),
      ) : BackboneElement()
    }
  }

  /** Assessment of certainty, confidence in the estimates, or quality of the evidence. */
  @Serializable(with = EvidenceCertaintySerializer::class)
  public class Certainty(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** Textual description of certainty. */
    public val description: Markdown? = null,
    /** Footnotes and/or explanatory notes. */
    public val note: List<Annotation> = listOf(),
    /** Aspect of certainty being rated. */
    public val type: CodeableConcept? = null,
    /** Assessment or judgement of the aspect. */
    public val rating: CodeableConcept? = null,
    /** Individual or group who did the rating. */
    public val rater: String? = null,
    /** A domain or subdomain of certainty. */
    public val subcomponent: List<Certainty> = listOf(),
  ) : BackboneElement()

  @Serializable(with = EvidenceVersionAlgorithmSerializer::class)
  public sealed interface VersionAlgorithm {
    public fun asString(): String? = this as? String

    public fun asCoding(): Coding? = this as? Coding

    public data class String(public val `value`: com.google.fhir.model.r5.String) :
      VersionAlgorithm

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) :
      VersionAlgorithm

    public companion object {
      internal fun from(
        stringValue: com.google.fhir.model.r5.String?,
        codingValue: com.google.fhir.model.r5.Coding?,
      ): VersionAlgorithm? {
        if (stringValue != null) return String(stringValue)
        if (codingValue != null) return Coding(codingValue)
        return null
      }
    }
  }

  @Serializable(with = EvidenceCiteAsSerializer::class)
  public sealed interface CiteAs {
    public fun asReference(): Reference? = this as? Reference

    public fun asMarkdown(): Markdown? = this as? Markdown

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : CiteAs

    public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : CiteAs

    public companion object {
      internal fun from(
        referenceValue: com.google.fhir.model.r5.Reference?,
        markdownValue: com.google.fhir.model.r5.Markdown?,
      ): CiteAs? {
        if (referenceValue != null) return Reference(referenceValue)
        if (markdownValue != null) return Markdown(markdownValue)
        return null
      }
    }
  }

  /**
   * The handling of the variable in statistical analysis for exposures or outcomes (E.g.
   * Dichotomous, Continuous, Descriptive).
   */
  public enum class EvidenceVariableHandling(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Continuous("continuous", "http://hl7.org/fhir/variable-handling", "continuous variable"),
    Dichotomous("dichotomous", "http://hl7.org/fhir/variable-handling", "dichotomous variable"),
    Ordinal("ordinal", "http://hl7.org/fhir/variable-handling", "ordinal variable"),
    Polychotomous(
      "polychotomous",
      "http://hl7.org/fhir/variable-handling",
      "polychotomous variable",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): EvidenceVariableHandling =
        when (code) {
          "continuous" -> Continuous
          "dichotomous" -> Dichotomous
          "ordinal" -> Ordinal
          "polychotomous" -> Polychotomous
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EvidenceVariableHandling")
        }
    }
  }
}
