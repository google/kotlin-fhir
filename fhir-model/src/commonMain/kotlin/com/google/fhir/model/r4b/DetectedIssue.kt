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

import com.google.fhir.model.r4b.serializers.DetectedIssueEvidenceSerializer
import com.google.fhir.model.r4b.serializers.DetectedIssueMitigationSerializer
import com.google.fhir.model.r4b.serializers.DetectedIssueSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indicates an actual or potential clinical issue with or between one or more active or proposed
 * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
 * Procedure-condition conflict, etc.
 */
@Serializable(with = DetectedIssueSerializer::class)
@SerialName("DetectedIssue")
public data class DetectedIssue(
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
  /** Business identifier associated with the detected issue record. */
  public var identifier: List<Identifier?>? = null,
  /**
   * Indicates the status of the detected issue.
   *
   * This element is labeled as a modifier because the status contains the codes cancelled and
   * entered-in-error that mark the issue as not currently valid.
   */
  public var status: Enumeration<DetectedIssueStatus>? = null,
  /** Identifies the general type of issue identified. */
  public var code: CodeableConcept? = null,
  /**
   * Indicates the degree of importance associated with the identified issue based on the potential
   * impact on the patient.
   */
  public var severity: Enumeration<DetectedIssueSeverity>? = null,
  /** Indicates the patient whose record the detected issue is associated with. */
  public var patient: Reference? = null,
  /** The date or period when the detected issue was initially identified. */
  public var identified: Identified? = null,
  /**
   * Individual or device responsible for the issue being raised. For example, a decision support
   * application or a pharmacist conducting a medication review.
   */
  public var author: Reference? = null,
  /**
   * Indicates the resource representing the current activity or proposed activity that is
   * potentially problematic.
   *
   * There's an implicit constraint on the number of implicated resources based on
   * DetectedIssue.type; e.g. For drug-drug, there would be more than one. For timing, there would
   * typically only be one.
   */
  public var implicated: List<Reference?>? = null,
  /**
   * Supporting evidence or manifestations that provide the basis for identifying the detected issue
   * such as a GuidanceResponse or MeasureReport.
   */
  public var evidence: List<Evidence>? = null,
  /**
   * A textual explanation of the detected issue.
   *
   * Should focus on information not covered elsewhere as discrete data - no need to duplicate the
   * narrative.
   */
  public var detail: String? = null,
  /**
   * The literature, knowledge-base or similar reference that describes the propensity for the
   * detected issue identified.
   */
  public var reference: Uri? = null,
  /**
   * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood
   * of the risk identified by the detected issue from manifesting. Can also reflect an observation
   * of known mitigating factors that may reduce/eliminate the need for any action.
   */
  public var mitigation: List<Mitigation>? = null,
) : DomainResource() {
  /**
   * Supporting evidence or manifestations that provide the basis for identifying the detected issue
   * such as a GuidanceResponse or MeasureReport.
   */
  @Serializable(with = DetectedIssueEvidenceSerializer::class)
  public class Evidence(
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
    /** A manifestation that led to the recording of this detected issue. */
    public var code: List<CodeableConcept?>? = null,
    /**
     * Links to resources that constitute evidence for the detected issue such as a GuidanceResponse
     * or MeasureReport.
     */
    public var detail: List<Reference?>? = null,
  ) : BackboneElement()

  /**
   * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood
   * of the risk identified by the detected issue from manifesting. Can also reflect an observation
   * of known mitigating factors that may reduce/eliminate the need for any action.
   */
  @Serializable(with = DetectedIssueMitigationSerializer::class)
  public class Mitigation(
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
     * Describes the action that was taken or the observation that was made that reduces/eliminates
     * the risk associated with the identified issue.
     *
     * The "text" component can be used for detail or when no appropriate code exists.
     */
    public var action: CodeableConcept? = null,
    /**
     * Indicates when the mitigating action was documented.
     *
     * This might not be the same as when the mitigating step was actually taken.
     */
    public var date: DateTime? = null,
    /**
     * Identifies the practitioner who determined the mitigation and takes responsibility for the
     * mitigation step occurring.
     */
    public var author: Reference? = null,
  ) : BackboneElement()

  public sealed interface Identified {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Identified

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Identified

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        PeriodValue: com.google.fhir.model.r4b.Period?,
      ): Identified? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        return null
      }
    }
  }

  /** Codes providing the status of an observation. */
  public enum class DetectedIssueStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The existence of the observation is registered, but there is no result yet available. */
    Registered(
      "registered",
      "http://hl7.org/fhir/observation-status",
      "Registered",
      "The existence of the observation is registered, but there is no result yet available.",
    ),
    /** This is an initial or interim observation: data may be incomplete or unverified. */
    Preliminary(
      "preliminary",
      "http://hl7.org/fhir/observation-status",
      "Preliminary",
      "This is an initial or interim observation: data may be incomplete or unverified.",
    ),
    /**
     * The observation is complete and there are no further actions needed. Additional information
     * such "released", "signed", etc would be represented using [Provenance](provenance.html) which
     * provides not only the act but also the actors and dates and other related data. These act
     * states would be associated with an observation status of `preliminary` until they are all
     * completed and then a status of `final` would be applied.
     */
    Final(
      "final",
      "http://hl7.org/fhir/observation-status",
      "Final",
      "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.",
    ),
    /**
     * Subsequent to being Final, the observation has been modified subsequent. This includes
     * updates/new information and corrections.
     */
    Amended(
      "amended",
      "http://hl7.org/fhir/observation-status",
      "Amended",
      "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.",
    ),
    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test
     * result.
     */
    Corrected(
      "corrected",
      "http://hl7.org/fhir/observation-status",
      "Corrected",
      "Subsequent to being Final, the observation has been modified to correct an error in the test result.",
    ),
    /**
     * The observation is unavailable because the measurement was not started or not completed (also
     * sometimes called "aborted").
     */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/observation-status",
      "Cancelled",
      "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").",
    ),
    /**
     * The observation has been withdrawn following previous final release. This electronic record
     * should never have existed, though it is possible that real-world decisions were based on it.
     * (If real-world activity has occurred, the status should be "cancelled" rather than
     * "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/observation-status",
      "Entered in Error",
      "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this observation. Note: This concept is not to be used for "other" - one of the listed
     * statuses is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/observation-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DetectedIssueStatus =
        when (code) {
          "registered" -> Registered
          "preliminary" -> Preliminary
          "final" -> Final
          "amended" -> Amended
          "corrected" -> Corrected
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum DetectedIssueStatus")
        }
    }
  }

  /** Indicates the potential degree of impact of the identified issue on the patient. */
  public enum class DetectedIssueSeverity(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Indicates the issue may be life-threatening or has the potential to cause permanent injury.
     */
    High(
      "high",
      "http://hl7.org/fhir/detectedissue-severity",
      "High",
      "Indicates the issue may be life-threatening or has the potential to cause permanent injury.",
    ),
    /**
     * Indicates the issue may result in noticeable adverse consequences but is unlikely to be
     * life-threatening or cause permanent injury.
     */
    Moderate(
      "moderate",
      "http://hl7.org/fhir/detectedissue-severity",
      "Moderate",
      "Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.",
    ),
    /**
     * Indicates the issue may result in some adverse consequences but is unlikely to substantially
     * affect the situation of the subject.
     */
    Low(
      "low",
      "http://hl7.org/fhir/detectedissue-severity",
      "Low",
      "Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DetectedIssueSeverity =
        when (code) {
          "high" -> High
          "moderate" -> Moderate
          "low" -> Low
          else ->
            throw IllegalArgumentException("Unknown code $code for enum DetectedIssueSeverity")
        }
    }
  }
}
