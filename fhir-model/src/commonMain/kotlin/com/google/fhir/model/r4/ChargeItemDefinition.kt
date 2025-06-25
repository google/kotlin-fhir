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

import com.google.fhir.model.r4.serializers.ChargeItemDefinitionApplicabilitySerializer
import com.google.fhir.model.r4.serializers.ChargeItemDefinitionPropertyGroupPriceComponentSerializer
import com.google.fhir.model.r4.serializers.ChargeItemDefinitionPropertyGroupSerializer
import com.google.fhir.model.r4.serializers.ChargeItemDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
 * necessary to calculate costs and prices. The properties may differ largely depending on type and
 * realm, therefore this resource gives only a rough structure and requires profiling for each type
 * of billing code system.
 */
@Serializable(with = ChargeItemDefinitionSerializer::class)
@SerialName("ChargeItemDefinition")
public data class ChargeItemDefinition(
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
  /**
   * An absolute URI that is used to identify this charge item definition when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this charge item definition is (or will be) published. This URL can be the target of a
   * canonical reference. It SHALL remain the same when the charge item definition is stored on
   * different servers.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   *
   * The determination of when to create a new version of a resource (same url, new version) vs.
   * defining a new artifact is up to the author. Considerations for making this decision are found
   * in [Technical and Business Versions](resource.html#versions).
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the [meta.source](resource.html#meta) element to indicate where
   * the current master source of the resource can be found.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this charge item definition when it is represented
   * in other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this charge item definition outside of FHIR, where it is not
   * possible to use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the charge item definition when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the charge item definition author and is not expected to be globally unique. For example, it
   * might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence. To provide a version
   * consistent with the Decision Support Service specification, use the format Major.Minor.Revision
   * (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision
   * Support Service specification. Note that a version is required for non-experimental active
   * assets.
   *
   * There may be different charge item definition instances that have the same identifier but
   * different versions. The version can be appended to the url in a reference to allow a reference
   * to a particular business version of the charge item definition with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A short, descriptive, user-friendly title for the charge item definition.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The URL pointing to an externally-defined charge item definition that is adhered to in whole or
   * in part by this definition.
   */
  public var derivedFromUri: List<Uri?>? = null,
  /** A larger definition of which this particular definition is a component or step. */
  public var partOf: List<Canonical?>? = null,
  /**
   * As new versions of a protocol or guideline are defined, allows identification of what versions
   * are replaced by a new instance.
   */
  public var replaces: List<Canonical?>? = null,
  /**
   * The current state of the ChargeItemDefinition.
   *
   * Allows filtering of charge item definitions that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this charge item definition is authored for testing purposes
   * (or education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of charge item definitions that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the charge item definition was published. The date must
   * change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the charge item definition changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the charge item definition. Additional specific dates may be added
   * as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the charge item definition.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the charge item
   * definition is the organization or individual primarily responsible for the maintenance and
   * upkeep of the charge item definition. This is not necessarily the same individual or
   * organization that developed and initially authored the content. The publisher is the primary
   * point of contact for questions or issues with the charge item definition. This item SHOULD be
   * populated unless the information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the charge item definition from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as why the charge item definition was
   * built, comments about misuse, instructions for clinical use and interpretation, literature
   * references, examples from the paper world, etc. It is not a rendering of the charge item
   * definition as conveyed in the 'text' field of the resource itself. This item SHOULD be
   * populated unless the information is available from context (e.g. the language of the charge
   * item definition is presumed to be the predominant language in the place the charge item
   * definition was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate charge item definition instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the charge item definition is intended to be used.
   *
   * It may be possible for the charge item definition to be used in jurisdictions other than those
   * for which it was originally designed or intended.
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * A copyright statement relating to the charge item definition and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the charge item
   * definition.
   */
  public var copyright: Markdown? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the charge item definition content was or is planned to be in active
   * use.
   *
   * The effective period for a charge item definition determines when the content is applicable for
   * usage and is independent of publication and review dates. For example, a measure intended to be
   * used for the year 2016 might be published in 2015.
   */
  public var effectivePeriod: Period? = null,
  /** The defined billing details in this resource pertain to the given billing code. */
  public var code: CodeableConcept? = null,
  /**
   * The defined billing details in this resource pertain to the given product instance(s).
   *
   * In case of highly customized, individually produced or fitted devices/substances, the pricing
   * information may be different for each instance of the product. This reference links pricing
   * details to specific product instances.
   */
  public var instance: List<Reference?>? = null,
  /**
   * Expressions that describe applicability criteria for the billing code.
   *
   * The applicability conditions can be used to ascertain whether a billing item is allowed in a
   * specific context. E.g. some billing codes may only be applicable in out-patient settings, only
   * to male/female patients or only to children.
   */
  public var applicability: List<Applicability>? = null,
  /**
   * Group of properties which are applicable under the same conditions. If no applicability rules
   * are established for the group, then all properties always apply.
   */
  public var propertyGroup: List<PropertyGroup>? = null,
) : DomainResource() {
  /** Expressions that describe applicability criteria for the billing code. */
  @Serializable(with = ChargeItemDefinitionApplicabilitySerializer::class)
  public class Applicability(
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
     * A brief, natural language description of the condition that effectively communicates the
     * intended semantics.
     */
    public var description: String? = null,
    /**
     * The media type of the language for the expression, e.g. "text/cql" for Clinical Query
     * Language expressions or "text/fhirpath" for FHIRPath expressions.
     */
    public var language: String? = null,
    /**
     * An expression that returns true or false, indicating whether the condition is satisfied. When
     * using FHIRPath expressions, the %context environment variable must be replaced at runtime
     * with the ChargeItem resource to which this definition is applied.
     *
     * Please note that FHIRPath Expressions can only be evaluated in the scope of the current
     * ChargeItem resource to which this definition is being applied. FHIRPath expressions can
     * traverse into other resources linked from the ChargeItem resource, however, testing rules
     * such as that a billing code may be billed only once per encounter need a wider scope. In such
     * scenarios, CQL may be the appropriate choice.
     */
    public var expression: String? = null,
  ) : BackboneElement()

  /**
   * Group of properties which are applicable under the same conditions. If no applicability rules
   * are established for the group, then all properties always apply.
   */
  @Serializable(with = ChargeItemDefinitionPropertyGroupSerializer::class)
  public class PropertyGroup(
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
     * Expressions that describe applicability criteria for the priceComponent.
     *
     * The applicability conditions can be used to ascertain whether a billing item is allowed in a
     * specific context. E.g. some billing codes may only be applicable in out-patient settings,
     * only to male/female patients or only to children.
     */
    public var applicability: List<Applicability?>? = null,
    /**
     * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that
     * apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors
     * and conditions that apply to a billing code is currently under development. The
     * priceComponent element can be used to offer transparency to the recipient of the Invoice of
     * how the prices have been calculated.
     */
    public var priceComponent: List<PriceComponent>? = null,
  ) : BackboneElement() {
    /**
     * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that
     * apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors
     * and conditions that apply to a billing code is currently under development. The
     * priceComponent element can be used to offer transparency to the recipient of the Invoice of
     * how the prices have been calculated.
     */
    @Serializable(with = ChargeItemDefinitionPropertyGroupPriceComponentSerializer::class)
    public class PriceComponent(
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
      /** This code identifies the type of the component. */
      public var type: Enumeration<ChargeItemDefinitionPriceComponentType>? = null,
      /**
       * A code that identifies the component. Codes may be used to differentiate between kinds of
       * taxes, surcharges, discounts etc.
       */
      public var code: CodeableConcept? = null,
      /** The factor that has been applied on the base price for calculating this component. */
      public var factor: Decimal? = null,
      /** The amount calculated for this component. */
      public var amount: Money? = null,
    ) : BackboneElement()
  }

  /** Codes indicating the kind of the price component. */
  public enum class ChargeItemDefinitionPriceComponentType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * the amount is the base price used for calculating the total price before applying surcharges,
     * discount or taxes.
     */
    Base(
      "base",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "base price",
      "the amount is the base price used for calculating the total price before applying surcharges, discount or taxes.",
    ),
    /** the amount is a surcharge applied on the base price. */
    Surcharge(
      "surcharge",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "surcharge",
      "the amount is a surcharge applied on the base price.",
    ),
    /** the amount is a deduction applied on the base price. */
    Deduction(
      "deduction",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "deduction",
      "the amount is a deduction applied on the base price.",
    ),
    /** the amount is a discount applied on the base price. */
    Discount(
      "discount",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "discount",
      "the amount is a discount applied on the base price.",
    ),
    /** the amount is the tax component of the total price. */
    Tax(
      "tax",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "tax",
      "the amount is the tax component of the total price.",
    ),
    /**
     * the amount is of informational character, it has not been applied in the calculation of the
     * total price.
     */
    Informational(
      "informational",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "informational",
      "the amount is of informational character, it has not been applied in the calculation of the total price.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ChargeItemDefinitionPriceComponentType =
        when (code) {
          "base" -> Base
          "surcharge" -> Surcharge
          "deduction" -> Deduction
          "discount" -> Discount
          "tax" -> Tax
          "informational" -> Informational
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum ChargeItemDefinitionPriceComponentType"
            )
        }
    }
  }
}
