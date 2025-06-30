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

import com.google.fhir.model.r5.serializers.ResearchStudyAssociatedPartySerializer
import com.google.fhir.model.r5.serializers.ResearchStudyComparisonGroupSerializer
import com.google.fhir.model.r5.serializers.ResearchStudyLabelSerializer
import com.google.fhir.model.r5.serializers.ResearchStudyObjectiveSerializer
import com.google.fhir.model.r5.serializers.ResearchStudyOutcomeMeasureSerializer
import com.google.fhir.model.r5.serializers.ResearchStudyProgressStatusSerializer
import com.google.fhir.model.r5.serializers.ResearchStudyRecruitmentSerializer
import com.google.fhir.model.r5.serializers.ResearchStudySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A scientific study of nature that sometimes includes processes involved in health and disease.
 * For example, clinical trials are research studies that involve people. These studies may be
 * related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain
 * outcomes and certain groups of people by looking at data collected in the past or future.
 */
@Serializable(with = ResearchStudySerializer::class)
@SerialName("ResearchStudy")
public data class ResearchStudy(
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
  /** Canonical identifier for this study resource, represented as a globally unique URI. */
  public var url: Uri? = null,
  /** Identifiers assigned to this research study by the sponsor or other systems. */
  public var identifier: List<Identifier?>? = null,
  /** The business version for the study record. */
  public var version: String? = null,
  /** Name for this study (computer friendly). */
  public var name: String? = null,
  /** The human readable name of the research study. */
  public var title: String? = null,
  /** Additional names for the study. */
  public var label: List<Label>? = null,
  /** The set of steps expected to be performed as part of the execution of the study. */
  public var protocol: List<Reference?>? = null,
  /** A larger research study of which this particular study is a component or step. */
  public var partOf: List<Reference?>? = null,
  /**
   * Citations, references, URLs and other related documents. When using relatedArtifact to share
   * URLs, the relatedArtifact.type will often be set to one of "documentation" or "supported-with"
   * and the URL value will often be in relatedArtifact.document.url but another possible location
   * is relatedArtifact.resource when it is a canonical URL.
   */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /**
   * The date (and optionally time) when the ResearchStudy Resource was last significantly changed.
   * The date must change when the business version changes and it must change if the status code
   * changes. In addition, it should change when the substantive content of the ResearchStudy
   * Resource changes.
   */
  public var date: DateTime? = null,
  /** The publication state of the resource (not of the study). */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * The type of study based upon the intent of the study activities. A classification of the intent
   * of the study.
   */
  public var primaryPurposeType: CodeableConcept? = null,
  /**
   * The stage in the progression of a therapy from initial experimental use in humans in clinical
   * trials to post-market evaluation.
   */
  public var phase: CodeableConcept? = null,
  /**
   * Codes categorizing the type of study such as investigational vs. observational, type of
   * blinding, type of randomization, safety vs. efficacy, etc.
   */
  public var studyDesign: List<CodeableConcept?>? = null,
  /**
   * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the
   * study is seeking to gain more information about.
   */
  public var focus: List<CodeableReference?>? = null,
  /**
   * The condition that is the focus of the study. For example, In a study to examine risk factors
   * for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition
   * code would be a Lupus SNOMED code.
   */
  public var condition: List<CodeableConcept?>? = null,
  /** Key terms to aid in searching for or filtering the study. */
  public var keyword: List<CodeableConcept?>? = null,
  /**
   * A country, state or other area where the study is taking place rather than its precise
   * geographic location or address.
   */
  public var region: List<CodeableConcept?>? = null,
  /** A brief text for explaining the study. */
  public var descriptionSummary: Markdown? = null,
  /** A detailed and human-readable narrative of the study. E.g., study abstract. */
  public var description: Markdown? = null,
  /**
   * Identifies the start date and the expected (or actual, depending on status) end date for the
   * study.
   */
  public var period: Period? = null,
  /** A facility in which study activities are conducted. */
  public var site: List<Reference?>? = null,
  /** Comments made about the study by the performer, subject or other participants. */
  public var note: List<Annotation?>? = null,
  /**
   * Additional grouping mechanism or categorization of a research study. Example: FDA regulated
   * device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc.
   * Implementation Note: do not use the classifier element to support existing semantics that are
   * already supported thru explicit elements in the resource.
   */
  public var classifier: List<CodeableConcept?>? = null,
  /**
   * Sponsors, collaborators, and other parties.
   *
   * For a Sponsor or a PrincipalInvestigator use the dedicated attributes provided.
   */
  public var associatedParty: List<AssociatedParty>? = null,
  /** Status of study with time for that status. */
  public var progressStatus: List<ProgressStatus>? = null,
  /** A description and/or code explaining the premature termination of the study. */
  public var whyStopped: CodeableConcept? = null,
  /** Target or actual group of participants enrolled in study. */
  public var recruitment: Recruitment? = null,
  /**
   * Describes an expected event or sequence of events for one of the subjects of a study. E.g. for
   * a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g.
   * for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from
   * lot A at 40 degrees for 1 month}.
   *
   * In many clinical trials this is refered to as the ARM of the study, but such a term is not used
   * in other sorts of trials even when there is a comparison between two or more groups.
   */
  public var comparisonGroup: List<ComparisonGroup>? = null,
  /**
   * A goal that the study is aiming to achieve in terms of a scientific question to be answered by
   * the analysis of data collected during the study.
   */
  public var objective: List<Objective>? = null,
  /**
   * An "outcome measure", "endpoint", "effect measure" or "measure of effect" is a specific
   * measurement or observation used to quantify the effect of experimental variables on the
   * participants in a study, or for observational studies, to describe patterns of diseases or
   * traits or associations with exposures, risk factors or treatment.
   *
   * A study may have multiple distinct outcome measures that can be used to assess the overall goal
   * for a study. The goal of a study is in the objective whereas the metric by which the goal is
   * assessed is the outcomeMeasure. Examples: Time to Local Recurrence (TLR), Disease-free Survival
   * (DFS), 30 Day Mortality, Systolic BP
   */
  public var outcomeMeasure: List<OutcomeMeasure>? = null,
  /**
   * Link to one or more sets of results generated by the study. Could also link to a research
   * registry holding the results such as ClinicalTrials.gov.
   */
  public var result: List<Reference?>? = null,
) : DomainResource() {
  /** Additional names for the study. */
  @Serializable(with = ResearchStudyLabelSerializer::class)
  public class Label(
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
    /** Kind of name. */
    public var type: CodeableConcept? = null,
    /** The name. */
    public var `value`: String? = null,
  ) : BackboneElement()

  /** Sponsors, collaborators, and other parties. */
  @Serializable(with = ResearchStudyAssociatedPartySerializer::class)
  public class AssociatedParty(
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
    /** Name of associated party. */
    public var name: String? = null,
    /** Type of association. */
    public var role: CodeableConcept? = null,
    /**
     * Identifies the start date and the end date of the associated party in the role.
     *
     * The cardinality is 0..* due to the fact that an associated party may be intermittently active
     * in a given role over multiple time periods.
     */
    public var period: List<Period?>? = null,
    /** A categorization other than role for the associated party. */
    public var classifier: List<CodeableConcept?>? = null,
    /**
     * Individual or organization associated with study (use practitionerRole to specify their
     * organisation).
     *
     * Suggestions of a better attribute name are appreciated
     */
    public var party: Reference? = null,
  ) : BackboneElement()

  /** Status of study with time for that status. */
  @Serializable(with = ResearchStudyProgressStatusSerializer::class)
  public class ProgressStatus(
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
    /** Label for status or state (e.g. recruitment status). */
    public var state: CodeableConcept? = null,
    /**
     * An indication of whether or not the date is a known date when the state changed or will
     * change. A value of true indicates a known date. A value of false indicates an estimated date.
     */
    public var `actual`: Boolean? = null,
    /** Date range. */
    public var period: Period? = null,
  ) : BackboneElement()

  /** Target or actual group of participants enrolled in study. */
  @Serializable(with = ResearchStudyRecruitmentSerializer::class)
  public class Recruitment(
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
    /** Estimated total number of participants to be enrolled. */
    public var targetNumber: UnsignedInt? = null,
    /** Actual total number of participants enrolled in study. */
    public var actualNumber: UnsignedInt? = null,
    /** Inclusion and exclusion criteria. */
    public var eligibility: Reference? = null,
    /** Group of participants who were enrolled in study. */
    public var actualGroup: Reference? = null,
  ) : BackboneElement()

  /**
   * Describes an expected event or sequence of events for one of the subjects of a study. E.g. for
   * a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g.
   * for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from
   * lot A at 40 degrees for 1 month}.
   */
  @Serializable(with = ResearchStudyComparisonGroupSerializer::class)
  public class ComparisonGroup(
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
     * Allows the comparisonGroup for the study and the comparisonGroup for the subject to be linked
     * easily.
     */
    public var linkId: Id? = null,
    /** Unique, human-readable label for this comparisonGroup of the study. */
    public var name: String? = null,
    /**
     * Categorization of study comparisonGroup, e.g. experimental, active comparator, placebo
     * comparater.
     */
    public var type: CodeableConcept? = null,
    /**
     * A succinct description of the path through the study that would be followed by a subject
     * adhering to this comparisonGroup.
     */
    public var description: Markdown? = null,
    /** Interventions or exposures in this comparisonGroup or cohort. */
    public var intendedExposure: List<Reference?>? = null,
    /** Group of participants who were enrolled in study comparisonGroup. */
    public var observedGroup: Reference? = null,
  ) : BackboneElement()

  /**
   * A goal that the study is aiming to achieve in terms of a scientific question to be answered by
   * the analysis of data collected during the study.
   */
  @Serializable(with = ResearchStudyObjectiveSerializer::class)
  public class Objective(
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
    /** Unique, human-readable label for this objective of the study. */
    public var name: String? = null,
    /** The kind of study objective. */
    public var type: CodeableConcept? = null,
    /**
     * Free text description of the objective of the study. This is what the study is trying to
     * achieve rather than how it is going to achieve it (see ResearchStudy.description).
     */
    public var description: Markdown? = null,
  ) : BackboneElement()

  /**
   * An "outcome measure", "endpoint", "effect measure" or "measure of effect" is a specific
   * measurement or observation used to quantify the effect of experimental variables on the
   * participants in a study, or for observational studies, to describe patterns of diseases or
   * traits or associations with exposures, risk factors or treatment.
   */
  @Serializable(with = ResearchStudyOutcomeMeasureSerializer::class)
  public class OutcomeMeasure(
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
    /** Label for the outcome. */
    public var name: String? = null,
    /**
     * The parameter or characteristic being assessed as one of the values by which the study is
     * assessed.
     */
    public var type: List<CodeableConcept?>? = null,
    /** Description of the outcome. */
    public var description: Markdown? = null,
    /** Structured outcome definition. */
    public var reference: Reference? = null,
  ) : BackboneElement()
}
