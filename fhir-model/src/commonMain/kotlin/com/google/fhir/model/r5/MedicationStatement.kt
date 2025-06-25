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

import com.google.fhir.model.r5.serializers.MedicationStatementAdherenceSerializer
import com.google.fhir.model.r5.serializers.MedicationStatementSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of a medication that is being consumed by a patient. A MedicationStatement may indicate
 * that the patient may be taking the medication now or has taken the medication in the past or will
 * be taking the medication in the future. The source of this information can be the patient,
 * significant other (such as a family member or spouse), or a clinician. A common scenario where
 * this information is captured is during the history taking process during a patient visit or stay.
 * The medication information may come from sources such as the patient's memory, from a
 * prescription bottle, or from a list of medications the patient, clinician or other party
 * maintains.
 *
 * The primary difference between a medicationstatement and a medicationadministration is that the
 * medication administration has complete administration information and is based on actual
 * administration information from the person who administered the medication. A medicationstatement
 * is often, if not always, less specific. There is no required date/time when the medication was
 * administered, in fact we only know that a source has reported the patient is taking this
 * medication, where details such as time, quantity, or rate or even medication product may be
 * incomplete or missing or less precise. As stated earlier, the Medication Statement information
 * may come from the patient's memory, from a prescription bottle or from a list of medications the
 * patient, clinician or other party maintains. Medication administration is more formal and is not
 * missing detailed information.
 */
@Serializable(with = MedicationStatementSerializer::class)
@SerialName("MedicationStatement")
public data class MedicationStatement(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override var id: String? = null,
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
  /**
   * Identifiers associated with this Medication Statement that are defined by business processes
   * and/or used to refer to it when a direct URL reference to the resource itself is not
   * appropriate. They are business identifiers assigned to this resource by the performer or other
   * systems and remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier.
   */
  public var identifier: List<Identifier?>? = null,
  /** A larger event of which this particular MedicationStatement is a component or step. */
  public var partOf: List<Reference?>? = null,
  /**
   * A code representing the status of recording the medication statement.
   *
   * This status concerns just the recording of the medication statement.
   * MedicationStatement.adherence should be used for indicating a patient's adherence to the
   * information in this resource. Note, the statuses are different than in previous releases for
   * MedicationStatement or MedicationStatement.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<MedicationStatementStatus>? = null,
  /**
   * Type of medication statement (for example, drug classification like ATC, where meds would be
   * administered, legal category of the medication.).
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Identifies the medication being administered. This is either a link to a resource representing
   * the details of the medication or a simple attribute carrying a code that identifies the
   * medication from a known list of medications.
   *
   * If only a code is specified, then it needs to be a code for a specific product. If more
   * information is required, then the use of the medication resource is recommended. For example,
   * if you require form or lot number, then you must reference the Medication resource.
   */
  public var medication: CodeableReference? = null,
  /** The person, animal or group who is/was taking the medication. */
  public var subject: Reference? = null,
  /** The encounter that establishes the context for this MedicationStatement. */
  public var encounter: Reference? = null,
  /**
   * The interval of time during which it is being asserted that the patient is/was/will be taking
   * the medication (or was not taking, when the MedicationStatement.adherence element is Not
   * Taking).
   *
   * This attribute reflects the period over which the patient consumed the medication and is
   * expected to be populated on the majority of Medication Statements. If the medication is still
   * being taken and is expected to continue indefinitely at the time the usage is recorded, the
   * "end" date will be omitted. If the end date is known, then it is included as the "end date".
   * The date/time attribute supports a variety of dates - year, year/month and exact date. If
   * something more than this is required, this should be conveyed as text.
   */
  public var effective: Effective? = null,
  /** The date when the Medication Statement was asserted by the information source. */
  public var dateAsserted: DateTime? = null,
  /**
   * The person or organization that provided the information about the taking of this medication.
   * Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g. Claim or
   * MedicationRequest.
   */
  public var informationSource: List<Reference?>? = null,
  /**
   * Allows linking the MedicationStatement to the underlying MedicationRequest, or to other
   * information that supports or is used to derive the MedicationStatement.
   *
   * Likely references would be to MedicationRequest, MedicationDispense, Claim, Observation or
   * QuestionnaireAnswers. The most common use cases for deriving a MedicationStatement comes from
   * creating a MedicationStatement from a MedicationRequest or from a lab observation or a claim.
   * it should be noted that the amount of information that is available varies from the type
   * resource that you derive the MedicationStatement from.
   */
  public var derivedFrom: List<Reference?>? = null,
  /**
   * A concept, Condition or observation that supports why the medication is being/was taken.
   *
   * This could be a diagnosis code. If a full condition record exists or additional detail is
   * needed, use reasonForUseReference.
   */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Provides extra information about the Medication Statement that is not conveyed by the other
   * attributes.
   */
  public var note: List<Annotation?>? = null,
  /**
   * Link to information that is relevant to a medication statement, for example, illicit drug use,
   * gestational age, etc.
   */
  public var relatedClinicalInformation: List<Reference?>? = null,
  /**
   * The full representation of the dose of the medication included in all dosage instructions. To
   * be used when multiple dosage instructions are included to represent complex dosing such as
   * increasing or tapering doses.
   */
  public var renderedDosageInstruction: Markdown? = null,
  /**
   * Indicates how the medication is/was or should be taken by the patient.
   *
   * The dates included in the dosage on a Medication Statement reflect the dates for a given dose.
   * For example, "from November 1, 2016 to November 3, 2016, take one tablet daily and from
   * November 4, 2016 to November 7, 2016, take two tablets daily." It is expected that this
   * specificity may only be populated where the patient brings in their labeled container or where
   * the Medication Statement is derived from a MedicationRequest.
   */
  public var dosage: List<Dosage?>? = null,
  /**
   * Indicates whether the medication is or is not being consumed or administered.
   *
   * This element can be used to indicate whether a patient is following a course of treatment as
   * instructed/prescribed or whether they are taking medications of their own volition. It can also
   * be used to indicate that a patient is not taking a medication, either because they were told
   * not to or because they decided on their own.
   */
  public var adherence: Adherence? = null,
) : DomainResource() {
  /** Indicates whether the medication is or is not being consumed or administered. */
  @Serializable(with = MedicationStatementAdherenceSerializer::class)
  public class Adherence(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** Type of the adherence for the medication. */
    public var code: CodeableConcept? = null,
    /**
     * Captures the reason for the current use or adherence of a medication.
     *
     * This is generally only used for "exception" statuses such as "entered-in-error". The reason
     * for performing the event at all is captured in reasonCode, not here.
     */
    public var reason: CodeableConcept? = null,
  ) : BackboneElement()

  public sealed interface Effective {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asTiming(): Timing? = this as? Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Effective

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Effective

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Effective

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        TimingValue: com.google.fhir.model.r5.Timing?,
      ): Effective? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (TimingValue != null) return Timing(TimingValue)
        return null
      }
    }
  }

  /** MedicationStatement Status Codes */
  public enum class MedicationStatementStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The action of recording the medication statement is finished. */
    Recorded(
      "recorded",
      "http://hl7.org/fhir/CodeSystem/medication-statement-status",
      "Recorded",
      "The action of recording the medication statement is finished.",
    ),
    /**
     * Some of the actions that are implied by the medication usage may have occurred. For example,
     * the patient may have taken some of the medication. Clinical decision support systems should
     * take this status into account.
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/CodeSystem/medication-statement-status",
      "Entered in Error",
      "Some of the actions that are implied by the medication usage may have occurred.  For example, the patient may have taken some of the medication.  Clinical decision support systems should take this status into account.",
    ),
    /** The medication usage is draft or preliminary. */
    Draft(
      "draft",
      "http://hl7.org/fhir/CodeSystem/medication-statement-status",
      "Draft",
      "The medication usage is draft or preliminary.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): MedicationStatementStatus =
        when (code) {
          "recorded" -> Recorded
          "entered-in-error" -> Entered_In_Error
          "draft" -> Draft
          else ->
            throw IllegalArgumentException("Unknown code $code for enum MedicationStatementStatus")
        }
    }
  }
}
