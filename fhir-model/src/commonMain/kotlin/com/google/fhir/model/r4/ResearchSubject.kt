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

import com.google.fhir.model.r4.serializers.ResearchSubjectSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A physical entity which is the primary unit of operational and/or administrative interest in a
 * study.
 */
@Serializable(with = ResearchSubjectSerializer::class)
@SerialName("ResearchSubject")
public data class ResearchSubject(
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
  /** Identifiers assigned to this research subject for a study. */
  public var identifier: List<Identifier?>? = null,
  /** The current state of the subject. */
  public var status: Enumeration<ResearchSubjectStatus>? = null,
  /** The dates the subject began and ended their participation in the study. */
  public var period: Period? = null,
  /** Reference to the study the subject is participating in. */
  public var study: Reference? = null,
  /** The record of the person or animal who is involved in the study. */
  public var individual: Reference? = null,
  /** The name of the arm in the study the subject is expected to follow as part of this study. */
  public var assignedArm: String? = null,
  /** The name of the arm in the study the subject actually followed as part of this study. */
  public var actualArm: String? = null,
  /** A record of the patient's informed agreement to participate in the study. */
  public var consent: Reference? = null,
) : DomainResource() {
  /** Indicates the progression of a study subject through a study. */
  public enum class ResearchSubjectStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** An identified person that can be considered for inclusion in a study. */
    Candidate(
      "candidate",
      "http://hl7.org/fhir/research-subject-status",
      "Candidate",
      "An identified person that can be considered for inclusion in a study.",
    ),
    /** A person that has met the eligibility criteria for inclusion in a study. */
    Eligible(
      "eligible",
      "http://hl7.org/fhir/research-subject-status",
      "Eligible",
      "A person that has met the eligibility criteria for inclusion in a study.",
    ),
    /**
     * A person is no longer receiving study intervention and/or being evaluated with tests and
     * procedures according to the protocol, but they are being monitored on a protocol-prescribed
     * schedule.
     */
    Follow_Up(
      "follow-up",
      "http://hl7.org/fhir/research-subject-status",
      "Follow-up",
      "A person is no longer receiving study intervention and/or being evaluated with tests and procedures according to the protocol, but they are being monitored on a protocol-prescribed schedule.",
    ),
    /**
     * A person who did not meet one or more criteria required for participation in a study is
     * considered to have failed screening or is ineligible for the study.
     */
    Ineligible(
      "ineligible",
      "http://hl7.org/fhir/research-subject-status",
      "Ineligible",
      """
    |A person who did not meet one or more criteria required for participation in a study is considered to have failed screening or
    |is ineligible for the study.
    """
        .trimMargin(),
    ),
    /** A person for whom registration was not completed. */
    Not_Registered(
      "not-registered",
      "http://hl7.org/fhir/research-subject-status",
      "Not Registered",
      "A person for whom registration was not completed.",
    ),
    /**
     * A person that has ended their participation on a study either because their
     * treatment/observation is complete or through not responding, withdrawal, non-compliance
     * and/or adverse event.
     */
    Off_Study(
      "off-study",
      "http://hl7.org/fhir/research-subject-status",
      "Off-study",
      """
    |A person that has ended their participation on a study either because their treatment/observation is complete or through not
    |responding, withdrawal, non-compliance and/or adverse event.
    """
        .trimMargin(),
    ),
    /** A person that is enrolled or registered on a study. */
    On_Study(
      "on-study",
      "http://hl7.org/fhir/research-subject-status",
      "On-study",
      "A person that is enrolled or registered on a study.",
    ),
    /**
     * The person is receiving the treatment or participating in an activity (e.g. yoga, diet, etc.)
     * that the study is evaluating.
     */
    On_Study_Intervention(
      "on-study-intervention",
      "http://hl7.org/fhir/research-subject-status",
      "On-study-intervention",
      "The person is receiving the treatment or participating in an activity (e.g. yoga, diet, etc.) that the study is evaluating.",
    ),
    /**
     * The subject is being evaluated via tests and assessments according to the study calendar, but
     * is not receiving any intervention. Note that this state is study-dependent and might not
     * exist in all studies. A synonym for this is "short-term follow-up".
     */
    On_Study_Observation(
      "on-study-observation",
      "http://hl7.org/fhir/research-subject-status",
      "On-study-observation",
      "The subject is being evaluated via tests and assessments according to the study calendar, but is not receiving any intervention. Note that this state is study-dependent and might not exist in all studies.  A synonym for this is \"short-term follow-up\".",
    ),
    /** A person is pre-registered for a study. */
    Pending_On_Study(
      "pending-on-study",
      "http://hl7.org/fhir/research-subject-status",
      "Pending on-study",
      "A person is pre-registered for a study.",
    ),
    /** A person that is potentially eligible for participation in the study. */
    Potential_Candidate(
      "potential-candidate",
      "http://hl7.org/fhir/research-subject-status",
      "Potential Candidate",
      "A person that is potentially eligible for participation in the study.",
    ),
    /** A person who is being evaluated for eligibility for a study. */
    Screening(
      "screening",
      "http://hl7.org/fhir/research-subject-status",
      "Screening",
      "A person who is being evaluated for eligibility for a study.",
    ),
    /** The person has withdrawn their participation in the study before registration. */
    Withdrawn(
      "withdrawn",
      "http://hl7.org/fhir/research-subject-status",
      "Withdrawn",
      "The person has withdrawn their participation in the study before registration.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ResearchSubjectStatus =
        when (code) {
          "candidate" -> Candidate
          "eligible" -> Eligible
          "follow-up" -> Follow_Up
          "ineligible" -> Ineligible
          "not-registered" -> Not_Registered
          "off-study" -> Off_Study
          "on-study" -> On_Study
          "on-study-intervention" -> On_Study_Intervention
          "on-study-observation" -> On_Study_Observation
          "pending-on-study" -> Pending_On_Study
          "potential-candidate" -> Potential_Candidate
          "screening" -> Screening
          "withdrawn" -> Withdrawn
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ResearchSubjectStatus")
        }
    }
  }
}
