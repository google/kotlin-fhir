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

import com.google.fhir.model.r5.serializers.VerificationResultAttestationSerializer
import com.google.fhir.model.r5.serializers.VerificationResultPrimarySourceSerializer
import com.google.fhir.model.r5.serializers.VerificationResultSerializer
import com.google.fhir.model.r5.serializers.VerificationResultValidatorSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Describes validation requirements, source(s), status and dates for one or more elements. */
@Serializable(with = VerificationResultSerializer::class)
@SerialName("VerificationResult")
public data class VerificationResult(
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
  /** A resource that was validated. */
  public var target: List<Reference?>? = null,
  /** The fhirpath location(s) within the resource that was validated. */
  public var targetLocation: List<String?>? = null,
  /** The frequency with which the target must be validated (none; initial; periodic). */
  public var need: CodeableConcept? = null,
  /**
   * The validation status of the target (attested; validated; in process; requires revalidation;
   * validation failed; revalidation failed).
   */
  public var status: Enumeration<Status>? = null,
  /** When the validation status was updated. */
  public var statusDate: DateTime? = null,
  /** What the target is validated against (nothing; primary source; multiple sources). */
  public var validationType: CodeableConcept? = null,
  /**
   * The primary process by which the target is validated (edit check; value set; primary source;
   * multiple sources; standalone; in context).
   */
  public var validationProcess: List<CodeableConcept?>? = null,
  /** Frequency of revalidation. */
  public var frequency: Timing? = null,
  /** The date/time validation was last completed (including failed validations). */
  public var lastPerformed: DateTime? = null,
  /** The date when target is next validated, if appropriate. */
  public var nextScheduled: Date? = null,
  /** The result if validation fails (fatal; warning; record only; none). */
  public var failureAction: CodeableConcept? = null,
  /** Information about the primary source(s) involved in validation. */
  public var primarySource: List<PrimarySource>? = null,
  /** Information about the entity attesting to information. */
  public var attestation: Attestation? = null,
  /** Information about the entity validating information. */
  public var validator: List<Validator>? = null,
) : DomainResource() {
  /** Information about the primary source(s) involved in validation. */
  @Serializable(with = VerificationResultPrimarySourceSerializer::class)
  public class PrimarySource(
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
    /** Reference to the primary source. */
    public var who: Reference? = null,
    /**
     * Type of primary source (License Board; Primary Education; Continuing Education; Postal
     * Service; Relationship owner; Registration Authority; legal source; issuing source;
     * authoritative source).
     */
    public var type: List<CodeableConcept?>? = null,
    /** Method for communicating with the primary source (manual; API; Push). */
    public var communicationMethod: List<CodeableConcept?>? = null,
    /**
     * Status of the validation of the target against the primary source (successful; failed;
     * unknown).
     */
    public var validationStatus: CodeableConcept? = null,
    /** When the target was validated against the primary source. */
    public var validationDate: DateTime? = null,
    /** Ability of the primary source to push updates/alerts (yes; no; undetermined). */
    public var canPushUpdates: CodeableConcept? = null,
    /**
     * Type of alerts/updates the primary source can send (specific requested changes; any changes;
     * as defined by source).
     */
    public var pushTypeAvailable: List<CodeableConcept?>? = null,
  ) : BackboneElement()

  /** Information about the entity attesting to information. */
  @Serializable(with = VerificationResultAttestationSerializer::class)
  public class Attestation(
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
    /** The individual or organization attesting to information. */
    public var who: Reference? = null,
    /** When the who is asserting on behalf of another (organization or individual). */
    public var onBehalfOf: Reference? = null,
    /** The method by which attested information was submitted/retrieved (manual; API; Push). */
    public var communicationMethod: CodeableConcept? = null,
    /** The date the information was attested to. */
    public var date: Date? = null,
    /** A digital identity certificate associated with the attestation source. */
    public var sourceIdentityCertificate: String? = null,
    /**
     * A digital identity certificate associated with the proxy entity submitting attested
     * information on behalf of the attestation source.
     */
    public var proxyIdentityCertificate: String? = null,
    /**
     * Signed assertion by the proxy entity indicating that they have the right to submit attested
     * information on behalf of the attestation source.
     */
    public var proxySignature: Signature? = null,
    /** Signed assertion by the attestation source that they have attested to the information. */
    public var sourceSignature: Signature? = null,
  ) : BackboneElement()

  /** Information about the entity validating information. */
  @Serializable(with = VerificationResultValidatorSerializer::class)
  public class Validator(
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
    /** Reference to the organization validating information. */
    public var organization: Reference? = null,
    /** A digital identity certificate associated with the validator. */
    public var identityCertificate: String? = null,
    /** Signed assertion by the validator that they have validated the information. */
    public var attestationSignature: Signature? = null,
  ) : BackboneElement()

  /** The validation status of the target */
  public enum class Status(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Attested(
      "attested",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "Attested",
      null,
    ),
    Validated(
      "validated",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "Validated",
      null,
    ),
    In_Process(
      "in-process",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "In process",
      null,
    ),
    Req_Revalid(
      "req-revalid",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "Requires revalidation",
      null,
    ),
    Val_Fail(
      "val-fail",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "Validation failed",
      null,
    ),
    Reval_Fail(
      "reval-fail",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "Re-Validation failed",
      null,
    ),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/CodeSystem/verificationresult-status",
      "Entered in Error",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): Status =
        when (code) {
          "attested" -> Attested
          "validated" -> Validated
          "in-process" -> In_Process
          "req-revalid" -> Req_Revalid
          "val-fail" -> Val_Fail
          "reval-fail" -> Reval_Fail
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum Status")
        }
    }
  }
}
