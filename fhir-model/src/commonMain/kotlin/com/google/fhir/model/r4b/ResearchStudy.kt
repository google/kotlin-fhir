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

import com.google.fhir.model.r4b.serializers.ResearchStudyArmSerializer
import com.google.fhir.model.r4b.serializers.ResearchStudyObjectiveSerializer
import com.google.fhir.model.r4b.serializers.ResearchStudySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A process where a researcher or organization plans and then executes a series of steps intended
 * to increase the field of healthcare-related knowledge. This includes studies of safety, efficacy,
 * comparative effectiveness and other information about medications, devices, therapies and other
 * interventional and investigative techniques. A ResearchStudy involves the gathering of
 * information about human or animal subjects.
 */
@Serializable(with = ResearchStudySerializer::class)
@SerialName("ResearchStudy")
public data class ResearchStudy(
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
  /** Identifiers assigned to this research study by the sponsor or other systems. */
  public var identifier: List<Identifier?>? = null,
  /** A short, descriptive user-friendly label for the study. */
  public var title: String? = null,
  /** The set of steps expected to be performed as part of the execution of the study. */
  public var protocol: List<Reference?>? = null,
  /** A larger research study of which this particular study is a component or step. */
  public var partOf: List<Reference?>? = null,
  /** The current state of the study. */
  public var status: Enumeration<ResearchStudyStatus>? = null,
  /**
   * The type of study based upon the intent of the study's activities. A classification of the
   * intent of the study.
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
  public var category: List<CodeableConcept?>? = null,
  /**
   * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the
   * study is seeking to gain more information about.
   */
  public var focus: List<CodeableConcept?>? = null,
  /**
   * The condition that is the focus of the study. For example, In a study to examine risk factors
   * for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition
   * code would be a Lupus SNOMED code.
   */
  public var condition: List<CodeableConcept?>? = null,
  /** Contact details to assist a user in learning more about or engaging with the study. */
  public var contact: List<ContactDetail?>? = null,
  /** Citations, references and other related documents. */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /** Key terms to aid in searching for or filtering the study. */
  public var keyword: List<CodeableConcept?>? = null,
  /** Indicates a country, state or other region where the study is taking place. */
  public var location: List<CodeableConcept?>? = null,
  /** A full description of how the study is being conducted. */
  public var description: Markdown? = null,
  /**
   * Reference to a Group that defines the criteria for and quantity of subjects participating in
   * the study. E.g. " 200 female Europeans between the ages of 20 and 45 with early onset
   * diabetes".
   *
   * The Group referenced should not generally enumerate specific subjects. Subjects will be linked
   * to the study using the ResearchSubject resource.
   */
  public var enrollment: List<Reference?>? = null,
  /**
   * Identifies the start date and the expected (or actual, depending on status) end date for the
   * study.
   */
  public var period: Period? = null,
  /** An organization that initiates the investigation and is legally responsible for the study. */
  public var sponsor: Reference? = null,
  /**
   * A researcher in a study who oversees multiple aspects of the study, such as concept
   * development, protocol writing, protocol submission for IRB approval, participant recruitment,
   * informed consent, data collection, analysis, interpretation and presentation.
   */
  public var principalInvestigator: Reference? = null,
  /** A facility in which study activities are conducted. */
  public var site: List<Reference?>? = null,
  /** A description and/or code explaining the premature termination of the study. */
  public var reasonStopped: CodeableConcept? = null,
  /** Comments made about the study by the performer, subject or other participants. */
  public var note: List<Annotation?>? = null,
  /**
   * Describes an expected sequence of events for one of the participants of a study. E.g. Exposure
   * to drug A, wash-out, exposure to drug B, wash-out, follow-up.
   */
  public var arm: List<Arm>? = null,
  /**
   * A goal that the study is aiming to achieve in terms of a scientific question to be answered by
   * the analysis of data collected during the study.
   */
  public var objective: List<Objective>? = null,
) : DomainResource() {
  /**
   * Describes an expected sequence of events for one of the participants of a study. E.g. Exposure
   * to drug A, wash-out, exposure to drug B, wash-out, follow-up.
   */
  @Serializable(with = ResearchStudyArmSerializer::class)
  public class Arm(
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
    /** Unique, human-readable label for this arm of the study. */
    public var name: String? = null,
    /** Categorization of study arm, e.g. experimental, active comparator, placebo comparater. */
    public var type: CodeableConcept? = null,
    /**
     * A succinct description of the path through the study that would be followed by a subject
     * adhering to this arm.
     */
    public var description: String? = null,
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
    /** Unique, human-readable label for this objective of the study. */
    public var name: String? = null,
    /** The kind of study objective. */
    public var type: CodeableConcept? = null,
  ) : BackboneElement()

  /** Codes that convey the current status of the research study. */
  public enum class ResearchStudyStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Study is opened for accrual. */
    Active(
      "active",
      "http://hl7.org/fhir/research-study-status",
      "Active",
      "Study is opened for accrual.",
    ),
    /**
     * Study is completed prematurely and will not resume; patients are no longer examined nor
     * treated.
     */
    Administratively_Completed(
      "administratively-completed",
      "http://hl7.org/fhir/research-study-status",
      "Administratively Completed",
      "Study is completed prematurely and will not resume; patients are no longer examined nor treated.",
    ),
    /** Protocol is approved by the review board. */
    Approved(
      "approved",
      "http://hl7.org/fhir/research-study-status",
      "Approved",
      "Protocol is approved by the review board.",
    ),
    /** Study is closed for accrual; patients can be examined and treated. */
    Closed_To_Accrual(
      "closed-to-accrual",
      "http://hl7.org/fhir/research-study-status",
      "Closed to Accrual",
      "Study is closed for accrual; patients can be examined and treated.",
    ),
    /**
     * Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all
     * study subjects have completed treatment or intervention but are still being followed
     * according to the primary objective of the study.
     */
    Closed_To_Accrual_And_Intervention(
      "closed-to-accrual-and-intervention",
      "http://hl7.org/fhir/research-study-status",
      "Closed to Accrual and Intervention",
      "Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all study subjects have completed treatment or intervention but are still being followed according to the primary objective of the study.",
    ),
    /**
     * Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all
     * study subjects have completed treatment or intervention but are still being followed
     * according to the primary objective of the study.
     */
    Completed(
      "completed",
      "http://hl7.org/fhir/research-study-status",
      "Completed",
      """
    |Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all study subjects have completed treatment
    |or intervention but are still being followed according to the primary objective of the study.
    """
        .trimMargin(),
    ),
    /** Protocol was disapproved by the review board. */
    Disapproved(
      "disapproved",
      "http://hl7.org/fhir/research-study-status",
      "Disapproved",
      "Protocol was disapproved by the review board.",
    ),
    /** Protocol is submitted to the review board for approval. */
    In_Review(
      "in-review",
      "http://hl7.org/fhir/research-study-status",
      "In Review",
      "Protocol is submitted to the review board for approval.",
    ),
    /**
     * Study is temporarily closed for accrual; can be potentially resumed in the future; patients
     * can be examined and treated.
     */
    Temporarily_Closed_To_Accrual(
      "temporarily-closed-to-accrual",
      "http://hl7.org/fhir/research-study-status",
      "Temporarily Closed to Accrual",
      "Study is temporarily closed for accrual; can be potentially resumed in the future; patients can be examined and treated.",
    ),
    /**
     * Study is temporarily closed for accrual and intervention and potentially can be resumed in
     * the future.
     */
    Temporarily_Closed_To_Accrual_And_Intervention(
      "temporarily-closed-to-accrual-and-intervention",
      "http://hl7.org/fhir/research-study-status",
      "Temporarily Closed to Accrual and Intervention",
      "Study is temporarily closed for accrual and intervention and potentially can be resumed in the future.",
    ),
    /** Protocol was withdrawn by the lead organization. */
    Withdrawn(
      "withdrawn",
      "http://hl7.org/fhir/research-study-status",
      "Withdrawn",
      "Protocol was withdrawn by the lead organization.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ResearchStudyStatus =
        when (code) {
          "active" -> Active
          "administratively-completed" -> Administratively_Completed
          "approved" -> Approved
          "closed-to-accrual" -> Closed_To_Accrual
          "closed-to-accrual-and-intervention" -> Closed_To_Accrual_And_Intervention
          "completed" -> Completed
          "disapproved" -> Disapproved
          "in-review" -> In_Review
          "temporarily-closed-to-accrual" -> Temporarily_Closed_To_Accrual
          "temporarily-closed-to-accrual-and-intervention" ->
            Temporarily_Closed_To_Accrual_And_Intervention
          "withdrawn" -> Withdrawn
          else -> throw IllegalArgumentException("Unknown code $code for enum ResearchStudyStatus")
        }
    }
  }
}
