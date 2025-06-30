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

import com.google.fhir.model.r4.serializers.CoverageEligibilityRequestInsuranceSerializer
import com.google.fhir.model.r4.serializers.CoverageEligibilityRequestItemDiagnosisSerializer
import com.google.fhir.model.r4.serializers.CoverageEligibilityRequestItemSerializer
import com.google.fhir.model.r4.serializers.CoverageEligibilityRequestSerializer
import com.google.fhir.model.r4.serializers.CoverageEligibilityRequestSupportingInfoSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer
 * for them to respond, in the form of an CoverageEligibilityResponse, with information regarding
 * whether the stated coverage is valid and in-force and optionally to provide the insurance details
 * of the policy.
 */
@Serializable(with = CoverageEligibilityRequestSerializer::class)
@SerialName("CoverageEligibilityRequest")
public data class CoverageEligibilityRequest(
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
  /** A unique identifier assigned to this coverage eligiblity request. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<EligibilityRequestStatus>? = null,
  /** When the requestor expects the processor to complete processing. */
  public var priority: CodeableConcept? = null,
  /**
   * Code to specify whether requesting: prior authorization requirements for some service
   * categories or billing codes; benefits for coverages specified or discovered; discovery and
   * return of coverages for the patient; and/or validation that the specified coverage is in-force
   * at the date/period specified or 'now' if not specified.
   */
  public var purpose: List<Enumeration<EligibilityRequestPurpose>>? = null,
  /**
   * The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.
   *
   * 1..1.
   */
  public var patient: Reference? = null,
  /** The date or dates when the enclosed suite of services were performed or completed. */
  public var serviced: Serviced? = null,
  /** The date when this resource was created. */
  public var created: DateTime? = null,
  /** Person who created the request. */
  public var enterer: Reference? = null,
  /**
   * The provider which is responsible for the request.
   *
   * Typically this field would be 1..1 where this party is responsible for the eligibility request
   * but not necessarily professionally responsible for the provision of the individual products and
   * services listed below.
   */
  public var provider: Reference? = null,
  /** The Insurer who issued the coverage in question and is the recipient of the request. */
  public var insurer: Reference? = null,
  /** Facility where the services are intended to be provided. */
  public var facility: Reference? = null,
  /**
   * Additional information codes regarding exceptions, special considerations, the condition,
   * situation, prior or concurrent issues.
   *
   * Often there are multiple jurisdiction specific valuesets which are required.
   */
  public var supportingInfo: List<SupportingInfo>? = null,
  /**
   * Financial instruments for reimbursement for the health care products and services.
   *
   * All insurance coverages for the patient which may be applicable for reimbursement, of the
   * products and services listed in the claim, are typically provided in the claim to allow
   * insurers to confirm the ordering of the insurance coverages relative to local 'coordination of
   * benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication
   * of this claim. Coverages appearing before the focal Coverage in the list, and where
   * 'subrogation=false', should provide a reference to the ClaimResponse containing the
   * adjudication results of the prior claim.
   */
  public var insurance: List<Insurance>? = null,
  /**
   * Service categories or billable services for which benefit details and/or an authorization prior
   * to service delivery may be required by the payor.
   */
  public var item: List<Item>? = null,
) : DomainResource() {
  /**
   * Additional information codes regarding exceptions, special considerations, the condition,
   * situation, prior or concurrent issues.
   */
  @Serializable(with = CoverageEligibilityRequestSupportingInfoSerializer::class)
  public class SupportingInfo(
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
    /** A number to uniquely identify supporting information entries. */
    public var sequence: PositiveInt? = null,
    /**
     * Additional data or information such as resources, documents, images etc. including references
     * to the data or the actual inclusion of the data.
     *
     * Could be used to provide references to other resources, document. For example could contain a
     * PDF in an Attachment of the Police Report for an Accident.
     */
    public var information: Reference? = null,
    /**
     * The supporting materials are applicable for all detail items, product/servce categories and
     * specific billing codes.
     */
    public var appliesToAll: Boolean? = null,
  ) : BackboneElement()

  /** Financial instruments for reimbursement for the health care products and services. */
  @Serializable(with = CoverageEligibilityRequestInsuranceSerializer::class)
  public class Insurance(
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
     * A flag to indicate that this Coverage is to be used for evaluation of this request when set
     * to true.
     *
     * A patient may (will) have multiple insurance policies which provide reimburement for
     * healthcare services and products. For example a person may also be covered by their spouse's
     * policy and both appear in the list (and may be from the same insurer). This flag will be set
     * to true for only one of the listed policies and that policy will be used for evaluating this
     * request. Other requests would be created to request evaluation against the other listed
     * policies.
     */
    public var focal: Boolean? = null,
    /**
     * Reference to the insurance card level information contained in the Coverage resource. The
     * coverage issuing insurer will use these details to locate the patient's actual coverage
     * within the insurer's information system.
     */
    public var coverage: Reference? = null,
    /**
     * A business agreement number established between the provider and the insurer for special
     * business processing purposes.
     */
    public var businessArrangement: String? = null,
  ) : BackboneElement()

  /**
   * Service categories or billable services for which benefit details and/or an authorization prior
   * to service delivery may be required by the payor.
   */
  @Serializable(with = CoverageEligibilityRequestItemSerializer::class)
  public class Item(
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
     * Exceptions, special conditions and supporting information applicable for this service or
     * product line.
     */
    public var supportingInfoSequence: List<PositiveInt?>? = null,
    /**
     * Code to identify the general type of benefits under which products and services are provided.
     *
     * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
     */
    public var category: CodeableConcept? = null,
    /**
     * This contains the product, service, drug or other billing code for the item.
     *
     * Code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10,
     * NCPDP, DIN, RxNorm, ACHI, CCI).
     */
    public var productOrService: CodeableConcept? = null,
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     *
     * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical
     * whether the treatment was outside the clinic or out of office hours.
     */
    public var modifier: List<CodeableConcept?>? = null,
    /**
     * The practitioner who is responsible for the product or service to be rendered to the patient.
     */
    public var provider: Reference? = null,
    /** The number of repetitions of a service or product. */
    public var quantity: Quantity? = null,
    /** The amount charged to the patient by the provider for a single unit. */
    public var unitPrice: Money? = null,
    /** Facility where the services will be provided. */
    public var facility: Reference? = null,
    /** Patient diagnosis for which care is sought. */
    public var diagnosis: List<Diagnosis>? = null,
    /** The plan/proposal/order describing the proposed service in detail. */
    public var detail: List<Reference?>? = null,
  ) : BackboneElement() {
    /** Patient diagnosis for which care is sought. */
    @Serializable(with = CoverageEligibilityRequestItemDiagnosisSerializer::class)
    public class Diagnosis(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * The nature of illness or problem in a coded form or as a reference to an external defined
       * Condition.
       */
      public var diagnosis: Diagnosis? = null,
    ) : BackboneElement() {
      public sealed interface Diagnosis {
        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asReference(): Reference? = this as? Reference

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r4.CodeableConcept
        ) : Diagnosis

        public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
          Diagnosis

        public companion object {
          public fun from(
            CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
            ReferenceValue: com.google.fhir.model.r4.Reference?,
          ): Diagnosis? {
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }
  }

  public sealed interface Serviced {
    public fun asDate(): Date? = this as? Date

    public fun asPeriod(): Period? = this as? Period

    public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Serviced

    public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Serviced

    public companion object {
      public fun from(
        dateValue: com.google.fhir.model.r4.Date?,
        PeriodValue: com.google.fhir.model.r4.Period?,
      ): Serviced? {
        if (dateValue != null) return Date(dateValue)
        if (PeriodValue != null) return Period(PeriodValue)
        return null
      }
    }
  }

  /** This value set includes Status codes. */
  public enum class EligibilityRequestStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Active("active", "http://hl7.org/fhir/fm-status", "Active", null),
    Cancelled("cancelled", "http://hl7.org/fhir/fm-status", "Cancelled", null),
    Draft("draft", "http://hl7.org/fhir/fm-status", "Draft", null),
    Entered_In_Error("entered-in-error", "http://hl7.org/fhir/fm-status", "Entered in Error", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): EligibilityRequestStatus =
        when (code) {
          "active" -> Active
          "cancelled" -> Cancelled
          "draft" -> Draft
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EligibilityRequestStatus")
        }
    }
  }

  /** A code specifying the types of information being requested. */
  public enum class EligibilityRequestPurpose(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Auth_Requirements(
      "auth-requirements",
      "http://hl7.org/fhir/eligibilityrequest-purpose",
      "Coverage auth-requirements",
      null,
    ),
    Benefits(
      "benefits",
      "http://hl7.org/fhir/eligibilityrequest-purpose",
      "Coverage benefits",
      null,
    ),
    Discovery(
      "discovery",
      "http://hl7.org/fhir/eligibilityrequest-purpose",
      "Coverage Discovery",
      null,
    ),
    Validation(
      "validation",
      "http://hl7.org/fhir/eligibilityrequest-purpose",
      "Coverage Validation",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): EligibilityRequestPurpose =
        when (code) {
          "auth-requirements" -> Auth_Requirements
          "benefits" -> Benefits
          "discovery" -> Discovery
          "validation" -> Validation
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EligibilityRequestPurpose")
        }
    }
  }
}
