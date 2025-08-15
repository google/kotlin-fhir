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

import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseErrorSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseEventSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseEventWhenSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseInsuranceItemBenefitAllowedSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseInsuranceItemBenefitSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseInsuranceItemBenefitUsedSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseInsuranceItemSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseInsuranceSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseSerializer
import com.google.fhir.model.r5.serializers.CoverageEligibilityResponseServicedSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource provides eligibility and plan details from the processing of an
 * CoverageEligibilityRequest resource.
 */
@Serializable(with = CoverageEligibilityResponseSerializer::class)
@SerialName("CoverageEligibilityResponse")
public data class CoverageEligibilityResponse(
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
  override var contained: MutableList<Resource> = mutableListOf(),
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
  override var extension: MutableList<Extension> = mutableListOf(),
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
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /** A unique identifier assigned to this coverage eligiblity request. */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<EligibilityResponseStatus>,
  /**
   * Code to specify whether requesting: prior authorization requirements for some service
   * categories or billing codes; benefits for coverages specified or discovered; discovery and
   * return of coverages for the patient; and/or validation that the specified coverage is in-force
   * at the date/period specified or 'now' if not specified.
   */
  public var purpose: MutableList<Enumeration<EligibilityResponsePurpose>> = mutableListOf(),
  /**
   * The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.
   */
  public var patient: Reference,
  /** Information code for an event with a corresponding date or period. */
  public var event: MutableList<Event> = mutableListOf(),
  /** The date or dates when the enclosed suite of services were performed or completed. */
  public var serviced: Serviced? = null,
  /** The date this resource was created. */
  public var created: DateTime,
  /**
   * The provider which is responsible for the request.
   *
   * This party is responsible for the claim but not necessarily professionally responsible for the
   * provision of the individual products and services listed below. This field is the Billing
   * Provider, for example, a facility, provider group, lab or practitioner.
   */
  public var requestor: Reference? = null,
  /** Reference to the original request resource. */
  public var request: Reference,
  /**
   * The outcome of the request processing.
   *
   * The resource may be used to indicate that: the request has been held (queued) for processing;
   * that it has been processed and errors found (error); that no errors were found and that some of
   * the adjudication has been undertaken (partial) or that all of the adjudication has been
   * undertaken (complete).
   */
  public var outcome: Enumeration<EligibilityOutcome>,
  /** A human readable description of the status of the adjudication. */
  public var disposition: String? = null,
  /** The Insurer who issued the coverage in question and is the author of the response. */
  public var insurer: Reference,
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
  public var insurance: MutableList<Insurance> = mutableListOf(),
  /**
   * A reference from the Insurer to which these services pertain to be used on further
   * communication and as proof that the request occurred.
   */
  public var preAuthRef: String? = null,
  /**
   * A code for the form to be used for printing the content.
   *
   * May be needed to identify specific jurisdictional forms.
   */
  public var form: CodeableConcept? = null,
  /** Errors encountered during the processing of the request. */
  public var error: MutableList<Error> = mutableListOf(),
) : DomainResource() {
  /** Information code for an event with a corresponding date or period. */
  @Serializable(with = CoverageEligibilityResponseEventSerializer::class)
  public class Event(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** A coded event such as when a service is expected or a card printed. */
    public var type: CodeableConcept,
    /**
     * A date or period in the past or future indicating when the event occurred or is expectd to
     * occur.
     */
    public var `when`: When,
  ) : BackboneElement() {
    @Serializable(with = CoverageEligibilityResponseEventWhenSerializer::class)
    public sealed interface When {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : When

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : When

      public companion object {
        internal fun from(
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          periodValue: com.google.fhir.model.r5.Period?,
        ): When? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (periodValue != null) return Period(periodValue)
          return null
        }
      }
    }
  }

  /** Financial instruments for reimbursement for the health care products and services. */
  @Serializable(with = CoverageEligibilityResponseInsuranceSerializer::class)
  public class Insurance(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * Reference to the insurance card level information contained in the Coverage resource. The
     * coverage issuing insurer will use these details to locate the patient's actual coverage
     * within the insurer's information system.
     */
    public var coverage: Reference,
    /**
     * Flag indicating if the coverage provided is inforce currently if no service date(s) specified
     * or for the whole duration of the service dates.
     */
    public var inforce: Boolean? = null,
    /** The term of the benefits documented in this response. */
    public var benefitPeriod: Period? = null,
    /**
     * Benefits and optionally current balances, and authorization details by category or service.
     */
    public var item: MutableList<Item> = mutableListOf(),
  ) : BackboneElement() {
    /**
     * Benefits and optionally current balances, and authorization details by category or service.
     */
    @Serializable(with = CoverageEligibilityResponseInsuranceItemSerializer::class)
    public class Item(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * Code to identify the general type of benefits under which products and services are
       * provided.
       *
       * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
       */
      public var category: CodeableConcept? = null,
      /**
       * This contains the product, service, drug or other billing code for the item.
       *
       * Code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS,
       * ICD10, NCPDP, DIN, RxNorm, ACHI, CCI).
       */
      public var productOrService: CodeableConcept? = null,
      /**
       * Item typification or modifiers codes to convey additional context for the product or
       * service.
       *
       * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for
       * Medical whether the treatment was outside the clinic or out of office hours.
       */
      public var modifier: MutableList<CodeableConcept> = mutableListOf(),
      /** The practitioner who is eligible for the provision of the product or service. */
      public var provider: Reference? = null,
      /**
       * True if the indicated class of service is excluded from the plan, missing or False
       * indicates the product or service is included in the coverage.
       */
      public var excluded: Boolean? = null,
      /**
       * A short name or tag for the benefit.
       *
       * For example: MED01, or DENT2.
       */
      public var name: String? = null,
      /**
       * A richer description of the benefit or services covered.
       *
       * For example 'DENT2 covers 100% of basic, 50% of major but excludes Ortho, Implants and
       * Cosmetic services'.
       */
      public var description: String? = null,
      /**
       * Is a flag to indicate whether the benefits refer to in-network providers or out-of-network
       * providers.
       */
      public var network: CodeableConcept? = null,
      /** Indicates if the benefits apply to an individual or to the family. */
      public var unit: CodeableConcept? = null,
      /**
       * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual
       * visits'.
       */
      public var term: CodeableConcept? = null,
      /** Benefits used to date. */
      public var benefit: MutableList<Benefit> = mutableListOf(),
      /**
       * A boolean flag indicating whether a preauthorization is required prior to actual service
       * delivery.
       */
      public var authorizationRequired: Boolean? = null,
      /**
       * Codes or comments regarding information or actions associated with the preauthorization.
       */
      public var authorizationSupporting: MutableList<CodeableConcept> = mutableListOf(),
      /**
       * A web location for obtaining requirements or descriptive information regarding the
       * preauthorization.
       */
      public var authorizationUrl: Uri? = null,
    ) : BackboneElement() {
      /** Benefits used to date. */
      @Serializable(with = CoverageEligibilityResponseInsuranceItemBenefitSerializer::class)
      public class Benefit(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
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
        override var extension: MutableList<Extension> = mutableListOf(),
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * Classification of benefit being provided.
         *
         * For example: deductible, visits, benefit amount.
         */
        public var type: CodeableConcept,
        /** The quantity of the benefit which is permitted under the coverage. */
        public var allowed: Allowed? = null,
        /** The quantity of the benefit which have been consumed to date. */
        public var used: Used? = null,
      ) : BackboneElement() {
        @Serializable(
          with = CoverageEligibilityResponseInsuranceItemBenefitAllowedSerializer::class
        )
        public sealed interface Allowed {
          public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

          public fun asString(): String? = this as? String

          public fun asMoney(): Money? = this as? Money

          public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
            Allowed

          public data class String(public val `value`: com.google.fhir.model.r5.String) : Allowed

          public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Allowed

          public companion object {
            internal fun from(
              unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
              stringValue: com.google.fhir.model.r5.String?,
              moneyValue: com.google.fhir.model.r5.Money?,
            ): Allowed? {
              if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
              if (stringValue != null) return String(stringValue)
              if (moneyValue != null) return Money(moneyValue)
              return null
            }
          }
        }

        @Serializable(with = CoverageEligibilityResponseInsuranceItemBenefitUsedSerializer::class)
        public sealed interface Used {
          public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

          public fun asString(): String? = this as? String

          public fun asMoney(): Money? = this as? Money

          public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
            Used

          public data class String(public val `value`: com.google.fhir.model.r5.String) : Used

          public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Used

          public companion object {
            internal fun from(
              unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
              stringValue: com.google.fhir.model.r5.String?,
              moneyValue: com.google.fhir.model.r5.Money?,
            ): Used? {
              if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
              if (stringValue != null) return String(stringValue)
              if (moneyValue != null) return Money(moneyValue)
              return null
            }
          }
        }
      }
    }
  }

  /** Errors encountered during the processing of the request. */
  @Serializable(with = CoverageEligibilityResponseErrorSerializer::class)
  public class Error(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * An error code,from a specified code system, which details why the eligibility check could not
     * be performed.
     */
    public var code: CodeableConcept,
    /**
     * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element names, repetition
     * indicators and the default child accessor that identifies one of the elements in the resource
     * that caused this issue to be raised.
     *
     * The root of the FHIRPath is the resource or bundle that generated OperationOutcome. Each
     * FHIRPath SHALL resolve to a single node.
     */
    public var expression: MutableList<String> = mutableListOf(),
  ) : BackboneElement()

  @Serializable(with = CoverageEligibilityResponseServicedSerializer::class)
  public sealed interface Serviced {
    public fun asDate(): Date? = this as? Date

    public fun asPeriod(): Period? = this as? Period

    public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Serviced

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Serviced

    public companion object {
      internal fun from(
        dateValue: com.google.fhir.model.r5.Date?,
        periodValue: com.google.fhir.model.r5.Period?,
      ): Serviced? {
        if (dateValue != null) return Date(dateValue)
        if (periodValue != null) return Period(periodValue)
        return null
      }
    }
  }

  /** This value set includes Status codes. */
  public enum class EligibilityResponseStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Active("active", "http://hl7.org/fhir/fm-status", "Active"),
    Cancelled("cancelled", "http://hl7.org/fhir/fm-status", "Cancelled"),
    Draft("draft", "http://hl7.org/fhir/fm-status", "Draft"),
    Entered_In_Error("entered-in-error", "http://hl7.org/fhir/fm-status", "Entered in Error");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): EligibilityResponseStatus =
        when (code) {
          "active" -> Active
          "cancelled" -> Cancelled
          "draft" -> Draft
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EligibilityResponseStatus")
        }
    }
  }

  /** A code specifying the types of information being requested. */
  public enum class EligibilityResponsePurpose(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Auth_Requirements(
      "auth-requirements",
      "http://hl7.org/fhir/eligibilityresponse-purpose",
      "Coverage auth-requirements",
    ),
    Benefits("benefits", "http://hl7.org/fhir/eligibilityresponse-purpose", "Coverage benefits"),
    Discovery("discovery", "http://hl7.org/fhir/eligibilityresponse-purpose", "Coverage Discovery"),
    Validation(
      "validation",
      "http://hl7.org/fhir/eligibilityresponse-purpose",
      "Coverage Validation",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): EligibilityResponsePurpose =
        when (code) {
          "auth-requirements" -> Auth_Requirements
          "benefits" -> Benefits
          "discovery" -> Discovery
          "validation" -> Validation
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EligibilityResponsePurpose")
        }
    }
  }

  /** The outcome of the processing. */
  public enum class EligibilityOutcome(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Queued("queued", "http://hl7.org/fhir/eligibility-outcome", "Queued"),
    Complete("complete", "http://hl7.org/fhir/eligibility-outcome", "Processing Complete"),
    Error("error", "http://hl7.org/fhir/eligibility-outcome", "Error"),
    Partial("partial", "http://hl7.org/fhir/eligibility-outcome", "Partial Processing");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): EligibilityOutcome =
        when (code) {
          "queued" -> Queued
          "complete" -> Complete
          "error" -> Error
          "partial" -> Partial
          else -> throw IllegalArgumentException("Unknown code $code for enum EligibilityOutcome")
        }
    }
  }
}
