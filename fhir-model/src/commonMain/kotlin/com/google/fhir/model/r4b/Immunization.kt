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

import com.google.fhir.model.r4b.serializers.ImmunizationEducationSerializer
import com.google.fhir.model.r4b.serializers.ImmunizationPerformerSerializer
import com.google.fhir.model.r4b.serializers.ImmunizationProtocolAppliedSerializer
import com.google.fhir.model.r4b.serializers.ImmunizationReactionSerializer
import com.google.fhir.model.r4b.serializers.ImmunizationSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 */
@Serializable(with = ImmunizationSerializer::class)
@SerialName("Immunization")
public data class Immunization(
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
  /** A unique identifier assigned to this immunization record. */
  public var identifier: List<Identifier?>? = null,
  /**
   * Indicates the current status of the immunization event.
   *
   * Will generally be set to show that the immunization has been completed or not done. This
   * element is labeled as a modifier because the status contains codes that mark the resource as
   * not currently valid.
   */
  public var status: Enumeration<ImmunizationStatus>? = null,
  /**
   * Indicates the reason the immunization event was not performed.
   *
   * This is generally only used for the status of "not-done". The reason for performing the
   * immunization event is captured in reasonCode, not here.
   */
  public var statusReason: CodeableConcept? = null,
  /** Vaccine that was administered or was to be administered. */
  public var vaccineCode: CodeableConcept? = null,
  /** The patient who either received or did not receive the immunization. */
  public var patient: Reference? = null,
  /**
   * The visit or admission or other contact between patient and health care provider the
   * immunization was performed as part of.
   */
  public var encounter: Reference? = null,
  /**
   * Date vaccine administered or was to be administered.
   *
   * When immunizations are given a specific date and time should always be known. When
   * immunizations are patient reported, a specific date might not be known. Although partial dates
   * are allowed, an adult patient might not be able to recall the year a childhood immunization was
   * given. An exact date is always preferable, but the use of the String data type is acceptable
   * when an exact date is not known. A small number of vaccines (e.g. live oral typhoid vaccine)
   * are given as a series of patient self-administered dose over a span of time. In cases like
   * this, often, only the first dose (typically a provider supervised dose) is recorded with the
   * occurrence indicating the date/time of the first dose.
   */
  public var occurrence: Occurrence? = null,
  /**
   * The date the occurrence of the immunization was first captured in the record - potentially
   * significantly after the occurrence of the event.
   */
  public var recorded: DateTime? = null,
  /**
   * An indication that the content of the record is based on information from the person who
   * administered the vaccine. This reflects the context under which the data was originally
   * recorded.
   *
   * Reflects the “reliability” of the content.
   */
  public var primarySource: Boolean? = null,
  /**
   * The source of the data when the report of the immunization event is not based on information
   * from the person who administered the vaccine.
   *
   * Should not be populated if primarySource = True, not required even if primarySource = False.
   */
  public var reportOrigin: CodeableConcept? = null,
  /** The service delivery location where the vaccine administration occurred. */
  public var location: Reference? = null,
  /** Name of vaccine manufacturer. */
  public var manufacturer: Reference? = null,
  /** Lot number of the vaccine product. */
  public var lotNumber: String? = null,
  /** Date vaccine batch expires. */
  public var expirationDate: Date? = null,
  /** Body site where vaccine was administered. */
  public var site: CodeableConcept? = null,
  /** The path by which the vaccine product is taken into the body. */
  public var route: CodeableConcept? = null,
  /** The quantity of vaccine product that was administered. */
  public var doseQuantity: Quantity? = null,
  /** Indicates who performed the immunization event. */
  public var performer: List<Performer>? = null,
  /** Extra information about the immunization that is not conveyed by the other attributes. */
  public var note: List<Annotation?>? = null,
  /** Reasons why the vaccine was administered. */
  public var reasonCode: List<CodeableConcept?>? = null,
  /**
   * Condition, Observation or DiagnosticReport that supports why the immunization was administered.
   */
  public var reasonReference: List<Reference?>? = null,
  /**
   * Indication if a dose is considered to be subpotent. By default, a dose should be considered to
   * be potent.
   *
   * Typically, the recognition of the dose being sub-potent is retrospective, after the
   * administration (ex. notification of a manufacturer recall after administration). However, in
   * the case of a partial administration (the patient moves unexpectedly and only some of the dose
   * is actually administered), subpotency may be recognized immediately, but it is still important
   * to record the event.
   */
  public var isSubpotent: Boolean? = null,
  /** Reason why a dose is considered to be subpotent. */
  public var subpotentReason: List<CodeableConcept?>? = null,
  /**
   * Educational material presented to the patient (or guardian) at the time of vaccine
   * administration.
   */
  public var education: List<Education>? = null,
  /** Indicates a patient's eligibility for a funding program. */
  public var programEligibility: List<CodeableConcept?>? = null,
  /**
   * Indicates the source of the vaccine actually administered. This may be different than the
   * patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but
   * due to inventory issues, vaccine purchased with private funds was actually administered).
   */
  public var fundingSource: CodeableConcept? = null,
  /**
   * Categorical data indicating that an adverse event is associated in time to an immunization.
   *
   * A reaction may be an indication of an allergy or intolerance and, if this is determined to be
   * the case, it should be recorded as a new AllergyIntolerance resource instance as most systems
   * will not query against past Immunization.reaction elements.
   */
  public var reaction: List<Reaction>? = null,
  /**
   * The protocol (set of recommendations) being followed by the provider who administered the dose.
   */
  public var protocolApplied: List<ProtocolApplied>? = null,
) : DomainResource() {
  /** Indicates who performed the immunization event. */
  @Serializable(with = ImmunizationPerformerSerializer::class)
  public class Performer(
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
    /** Describes the type of performance (e.g. ordering provider, administering provider, etc.). */
    public var function: CodeableConcept? = null,
    /**
     * The practitioner or organization who performed the action.
     *
     * When the individual practitioner who performed the action is known, it is best to send.
     */
    public var actor: Reference? = null,
  ) : BackboneElement()

  /**
   * Educational material presented to the patient (or guardian) at the time of vaccine
   * administration.
   */
  @Serializable(with = ImmunizationEducationSerializer::class)
  public class Education(
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
    /** Identifier of the material presented to the patient. */
    public var documentType: String? = null,
    /**
     * Reference pointer to the educational material given to the patient if the information was on
     * line.
     */
    public var reference: Uri? = null,
    /** Date the educational material was published. */
    public var publicationDate: DateTime? = null,
    /** Date the educational material was given to the patient. */
    public var presentationDate: DateTime? = null,
  ) : BackboneElement()

  /** Categorical data indicating that an adverse event is associated in time to an immunization. */
  @Serializable(with = ImmunizationReactionSerializer::class)
  public class Reaction(
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
    /** Date of reaction to the immunization. */
    public var date: DateTime? = null,
    /** Details of the reaction. */
    public var detail: Reference? = null,
    /** Self-reported indicator. */
    public var reported: Boolean? = null,
  ) : BackboneElement()

  /**
   * The protocol (set of recommendations) being followed by the provider who administered the dose.
   */
  @Serializable(with = ImmunizationProtocolAppliedSerializer::class)
  public class ProtocolApplied(
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
     * One possible path to achieve presumed immunity against a disease - within the context of an
     * authority.
     */
    public var series: String? = null,
    /** Indicates the authority who published the protocol (e.g. ACIP) that is being followed. */
    public var authority: Reference? = null,
    /** The vaccine preventable disease the dose is being administered against. */
    public var targetDisease: List<CodeableConcept?>? = null,
    /**
     * Nominal position in a series.
     *
     * The use of an integer is preferred if known. A string should only be used in cases where an
     * integer is not available (such as when documenting a recurring booster dose).
     */
    public var doseNumber: DoseNumber? = null,
    /**
     * The recommended number of doses to achieve immunity.
     *
     * The use of an integer is preferred if known. A string should only be used in cases where an
     * integer is not available (such as when documenting a recurring booster dose).
     */
    public var seriesDoses: SeriesDoses? = null,
  ) : BackboneElement() {
    public sealed interface DoseNumber {
      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4b.PositiveInt) :
        DoseNumber

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : DoseNumber

      public companion object {
        public fun from(
          positiveIntValue: com.google.fhir.model.r4b.PositiveInt?,
          stringValue: com.google.fhir.model.r4b.String?,
        ): DoseNumber? {
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }

    public sealed interface SeriesDoses {
      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4b.PositiveInt) :
        SeriesDoses

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : SeriesDoses

      public companion object {
        public fun from(
          positiveIntValue: com.google.fhir.model.r4b.PositiveInt?,
          stringValue: com.google.fhir.model.r4b.String?,
        ): SeriesDoses? {
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }

  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asString(): String? = this as? String

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Occurrence

    public data class String(public val `value`: com.google.fhir.model.r4b.String) : Occurrence

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        stringValue: com.google.fhir.model.r4b.String?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (stringValue != null) return String(stringValue)
        return null
      }
    }
  }

  /**
   * The value set to instantiate this attribute should be drawn from a terminologically robust code
   * system that consists of or contains concepts to support describing the current status of the
   * administered dose of vaccine.
   */
  public enum class ImmunizationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The event was terminated prior to any activity beyond preparation. I.e. The 'main' activity
     * has not yet begun. The boundary between preparatory and the 'main' activity is
     * context-specific.
     */
    Not_Done(
      "not-done",
      "http://hl7.org/fhir/event-status",
      "Not Done",
      "The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific.",
    ),
    /** The event has now concluded. */
    Completed(
      "completed",
      "http://hl7.org/fhir/event-status",
      "Completed",
      "The event has now concluded.",
    ),
    /**
     * This electronic record should never have existed, though it is possible that real-world
     * decisions were based on it. (If real-world activity has occurred, the status should be
     * "stopped" rather than "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/event-status",
      "Entered in Error",
      "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"stopped\" rather than \"entered-in-error\".).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ImmunizationStatus =
        when (code) {
          "not-done" -> Not_Done
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum ImmunizationStatus")
        }
    }
  }
}
