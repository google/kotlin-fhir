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

import com.google.fhir.model.r5.serializers.InsurancePlanCoverageBenefitLimitSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanCoverageBenefitSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanCoverageSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanPlanGeneralCostSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanPlanSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanPlanSpecificCostBenefitCostSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanPlanSpecificCostBenefitSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanPlanSpecificCostSerializer
import com.google.fhir.model.r5.serializers.InsurancePlanSerializer
import com.google.fhir.model.r5.terminologies.PublicationStatus
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Details of a Health Insurance product/plan provided by an organization. */
@Serializable(with = InsurancePlanSerializer::class)
@SerialName("InsurancePlan")
public data class InsurancePlan(
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
  /**
   * Business identifiers assigned to this health insurance product which remain constant as the
   * resource is updated and propagates from server to server.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /** The current state of the health insurance product. */
  public var status: Enumeration<PublicationStatus>? = null,
  /** The kind of health insurance product. */
  public var type: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Official name of the health insurance product as designated by the owner.
   *
   * If the name of the product/plan changes, consider putting the old name in the alias column so
   * that it can still be located through searches.
   */
  public var name: String? = null,
  /**
   * A list of alternate names that the product is known as, or was known as in the past.
   *
   * There are no dates associated with the alias/historic names, as this is not intended to track
   * when names were used, but to assist in searching so that older names can still result in
   * identifying the product/plan.
   */
  public var alias: MutableList<String> = mutableListOf(),
  /** The period of time that the health insurance product is available. */
  public var period: Period? = null,
  /**
   * The entity that is providing the health insurance product and underwriting the risk. This is
   * typically an insurance carriers, other third-party payers, or health plan sponsors comonly
   * referred to as 'payers'.
   */
  public var ownedBy: Reference? = null,
  /**
   * An organization which administer other services such as underwriting, customer service and/or
   * claims processing on behalf of the health insurance product owner.
   */
  public var administeredBy: Reference? = null,
  /** The geographic region in which a health insurance product's benefits apply. */
  public var coverageArea: MutableList<Reference> = mutableListOf(),
  /**
   * The contact details of communication devices available relevant to the specific Insurance
   * Plan/Product. This can include addresses, phone numbers, fax numbers, mobile numbers, email
   * addresses and web sites.
   *
   * The address/telecom use code 'home' are not to be used.
   */
  public var contact: MutableList<ExtendedContactDetail> = mutableListOf(),
  /**
   * The technical endpoints providing access to services operated for the health insurance product.
   */
  public var endpoint: MutableList<Reference> = mutableListOf(),
  /**
   * Reference to the network included in the health insurance product.
   *
   * Networks are represented as a hierarchy of organization resources.
   */
  public var network: MutableList<Reference> = mutableListOf(),
  /** Details about the coverage offered by the insurance product. */
  public var coverage: MutableList<Coverage> = mutableListOf(),
  /** Details about an insurance plan. */
  public var plan: MutableList<Plan> = mutableListOf(),
) : DomainResource() {
  /** Details about the coverage offered by the insurance product. */
  @Serializable(with = InsurancePlanCoverageSerializer::class)
  public class Coverage(
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
     * Type of coverage (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term;
     * Long Term Care; Hospice; Home Health).
     */
    public var type: CodeableConcept,
    /**
     * Reference to the network that providing the type of coverage.
     *
     * Networks are represented as a hierarchy of organization resources.
     */
    public var network: MutableList<Reference> = mutableListOf(),
    /** Specific benefits under this type of coverage. */
    public var benefit: MutableList<Benefit> = mutableListOf(),
  ) : BackboneElement() {
    /** Specific benefits under this type of coverage. */
    @Serializable(with = InsurancePlanCoverageBenefitSerializer::class)
    public class Benefit(
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
      /** Type of benefit (primary care; speciality care; inpatient; outpatient). */
      public var type: CodeableConcept,
      /** The referral requirements to have access/coverage for this benefit. */
      public var requirement: String? = null,
      /** The specific limits on the benefit. */
      public var limit: MutableList<Limit> = mutableListOf(),
    ) : BackboneElement() {
      /** The specific limits on the benefit. */
      @Serializable(with = InsurancePlanCoverageBenefitLimitSerializer::class)
      public class Limit(
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
         * The maximum amount of a service item a plan will pay for a covered benefit. For examples.
         * wellness visits, or eyeglasses.
         *
         * May also be called “eligible expense,” “payment allowance,” or “negotiated rate.”.
         */
        public var `value`: Quantity? = null,
        /**
         * The specific limit on the benefit.
         *
         * Use `CodeableConcept.text` element if the data is free (uncoded) text.
         */
        public var code: CodeableConcept? = null,
      ) : BackboneElement()
    }
  }

  /** Details about an insurance plan. */
  @Serializable(with = InsurancePlanPlanSerializer::class)
  public class Plan(
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
     * Business identifiers assigned to this health insurance plan which remain constant as the
     * resource is updated and propagates from server to server.
     */
    public var identifier: MutableList<Identifier> = mutableListOf(),
    /** Type of plan. For example, "Platinum" or "High Deductable". */
    public var type: CodeableConcept? = null,
    /** The geographic region in which a health insurance plan's benefits apply. */
    public var coverageArea: MutableList<Reference> = mutableListOf(),
    /**
     * Reference to the network that providing the type of coverage.
     *
     * Networks are represented as a hierarchy of organization resources.
     */
    public var network: MutableList<Reference> = mutableListOf(),
    /** Overall costs associated with the plan. */
    public var generalCost: MutableList<GeneralCost> = mutableListOf(),
    /** Costs associated with the coverage provided by the product. */
    public var specificCost: MutableList<SpecificCost> = mutableListOf(),
  ) : BackboneElement() {
    /** Overall costs associated with the plan. */
    @Serializable(with = InsurancePlanPlanGeneralCostSerializer::class)
    public class GeneralCost(
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
      /** Type of cost. */
      public var type: CodeableConcept? = null,
      /** Number of participants enrolled in the plan. */
      public var groupSize: PositiveInt? = null,
      /** Value of the cost. */
      public var cost: Money? = null,
      /** Additional information about the general costs associated with this plan. */
      public var comment: String? = null,
    ) : BackboneElement()

    /** Costs associated with the coverage provided by the product. */
    @Serializable(with = InsurancePlanPlanSpecificCostSerializer::class)
    public class SpecificCost(
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
       * General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse;
       * Hospice, Home Health).
       */
      public var category: CodeableConcept,
      /** List of the specific benefits under this category of benefit. */
      public var benefit: MutableList<Benefit> = mutableListOf(),
    ) : BackboneElement() {
      /** List of the specific benefits under this category of benefit. */
      @Serializable(with = InsurancePlanPlanSpecificCostBenefitSerializer::class)
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
         * Type of specific benefit (preventative; primary care office visit; speciality office
         * visit; hospitalization; emergency room; urgent care).
         */
        public var type: CodeableConcept,
        /** List of the costs associated with a specific benefit. */
        public var cost: MutableList<Cost> = mutableListOf(),
      ) : BackboneElement() {
        /** List of the costs associated with a specific benefit. */
        @Serializable(with = InsurancePlanPlanSpecificCostBenefitCostSerializer::class)
        public class Cost(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and managable, there is a
           * strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: MutableList<Extension> = mutableListOf(),
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and managable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: MutableList<Extension> = mutableListOf(),
          /** Type of cost (copay; individual cap; family cap; coinsurance; deductible). */
          public var type: CodeableConcept,
          /**
           * Whether the cost applies to in-network or out-of-network providers (in-network;
           * out-of-network; other).
           */
          public var applicability: CodeableConcept? = null,
          /**
           * Additional information about the cost, such as information about funding sources (e.g.
           * HSA, HRA, FSA, RRA).
           */
          public var qualifiers: MutableList<CodeableConcept> = mutableListOf(),
          /**
           * The actual cost value. (some of the costs may be represented as percentages rather than
           * currency, e.g. 10% coinsurance).
           */
          public var `value`: Quantity? = null,
        ) : BackboneElement()
      }
    }
  }
}
