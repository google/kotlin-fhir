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

import com.google.fhir.model.r5.serializers.IngredientManufacturerSerializer
import com.google.fhir.model.r5.serializers.IngredientSerializer
import com.google.fhir.model.r5.serializers.IngredientSubstanceSerializer
import com.google.fhir.model.r5.serializers.IngredientSubstanceStrengthReferenceStrengthSerializer
import com.google.fhir.model.r5.serializers.IngredientSubstanceStrengthSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** An ingredient of a manufactured item or pharmaceutical product. */
@Serializable(with = IngredientSerializer::class)
@SerialName("Ingredient")
public data class Ingredient(
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
  /**
   * The identifier(s) of this Ingredient that are assigned by business processes and/or used to
   * refer to it when a direct URL reference to the resource itself is not appropriate.
   */
  public var identifier: Identifier? = null,
  /**
   * The status of this ingredient. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of ingredient that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /** The product which this ingredient is a constituent part of. */
  public var `for`: List<Reference?>? = null,
  /**
   * A classification of the ingredient identifying its purpose within the product, e.g. active,
   * inactive.
   */
  public var role: CodeableConcept? = null,
  /**
   * A classification of the ingredient identifying its precise purpose(s) in the drug product. This
   * extends the Ingredient.role to add more detail. Example: antioxidant, alkalizing agent.
   */
  public var function: List<CodeableConcept?>? = null,
  /**
   * A classification of the ingredient according to where in the physical item it tends to be used,
   * such the outer shell of a tablet, inner body or ink.
   */
  public var group: CodeableConcept? = null,
  /**
   * If the ingredient is a known or suspected allergen. Note that this is a property of the
   * substance, so if a reference to a SubstanceDefinition is used to decribe that (rather than just
   * a code), the allergen information should go there, not here.
   */
  public var allergenicIndicator: Boolean? = null,
  /**
   * A place for providing any notes that are relevant to the component, e.g. removed during
   * process, adjusted for loss on drying.
   */
  public var comment: Markdown? = null,
  /**
   * The organization(s) that manufacture this ingredient. Can be used to indicate: 1) Organizations
   * we are aware of that manufacture this ingredient 2) Specific Manufacturer(s) currently being
   * used 3) Set of organisations allowed to manufacture this ingredient for this product Users must
   * be clear on the application of context relevant to their use case.
   */
  public var manufacturer: List<Manufacturer>? = null,
  /** The substance that comprises this ingredient. */
  public var substance: Substance? = null,
) : DomainResource() {
  /**
   * The organization(s) that manufacture this ingredient. Can be used to indicate: 1) Organizations
   * we are aware of that manufacture this ingredient 2) Specific Manufacturer(s) currently being
   * used 3) Set of organisations allowed to manufacture this ingredient for this product Users must
   * be clear on the application of context relevant to their use case.
   */
  @Serializable(with = IngredientManufacturerSerializer::class)
  public class Manufacturer(
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
    /**
     * The way in which this manufacturer is associated with the ingredient. For example whether it
     * is a possible one (others allowed), or an exclusive authorized one for this ingredient. Note
     * that this is not the manufacturing process role.
     */
    public var role: Enumeration<IngredientManufacturerRole>? = null,
    /** An organization that manufactures this ingredient. */
    public var manufacturer: Reference? = null,
  ) : BackboneElement()

  /** The substance that comprises this ingredient. */
  @Serializable(with = IngredientSubstanceSerializer::class)
  public class Substance(
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
    /** A code or full resource that represents the ingredient's substance. */
    public var code: CodeableReference? = null,
    /**
     * The quantity of substance in the unit of presentation, or in the volume (or mass) of the
     * single pharmaceutical product or manufactured item. The allowed repetitions do not represent
     * different strengths, but are different representations - mathematically equivalent - of a
     * single strength.
     */
    public var strength: List<Strength>? = null,
  ) : BackboneElement() {
    /**
     * The quantity of substance in the unit of presentation, or in the volume (or mass) of the
     * single pharmaceutical product or manufactured item. The allowed repetitions do not represent
     * different strengths, but are different representations - mathematically equivalent - of a
     * single strength.
     */
    @Serializable(with = IngredientSubstanceStrengthSerializer::class)
    public class Strength(
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /**
       * The quantity of substance in the unit of presentation, or in the volume (or mass) of the
       * single pharmaceutical product or manufactured item. Unit of presentation refers to the
       * quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the
       * size of the tablet). It is not generally normalized as a unitary unit, which would be 'per
       * mg').
       */
      public var presentation: Presentation? = null,
      /**
       * A textual represention of either the whole of the presentation strength or a part of it -
       * with the rest being in Strength.presentation as a ratio.
       */
      public var textPresentation: String? = null,
      /** The strength per unitary volume (or mass). */
      public var concentration: Concentration? = null,
      /**
       * A textual represention of either the whole of the concentration strength or a part of it -
       * with the rest being in Strength.concentration as a ratio.
       */
      public var textConcentration: String? = null,
      /**
       * A code that indicates if the strength is, for example, based on the ingredient substance as
       * stated or on the substance base (when the ingredient is a salt).
       */
      public var basis: CodeableConcept? = null,
      /**
       * For when strength is measured at a particular point or distance. There are products where
       * strength is measured at a particular point. For example, the strength of the ingredient in
       * some inhalers is measured at a particular position relative to the point of aerosolization.
       */
      public var measurementPoint: String? = null,
      /** The country or countries for which the strength range applies. */
      public var country: List<CodeableConcept?>? = null,
      /**
       * Strength expressed in terms of a reference substance. For when the ingredient strength is
       * additionally expressed as equivalent to the strength of some other closely related
       * substance (e.g. salt vs. base). Reference strength represents the strength (quantitative
       * composition) of the active moiety of the active substance. There are situations when the
       * active substance and active moiety are different, therefore both a strength and a reference
       * strength are needed.
       */
      public var referenceStrength: List<ReferenceStrength>? = null,
    ) : BackboneElement() {
      /**
       * Strength expressed in terms of a reference substance. For when the ingredient strength is
       * additionally expressed as equivalent to the strength of some other closely related
       * substance (e.g. salt vs. base). Reference strength represents the strength (quantitative
       * composition) of the active moiety of the active substance. There are situations when the
       * active substance and active moiety are different, therefore both a strength and a reference
       * strength are needed.
       */
      @Serializable(with = IngredientSubstanceStrengthReferenceStrengthSerializer::class)
      public class ReferenceStrength(
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
        override var extension: List<Extension?>? = null,
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
        override var modifierExtension: List<Extension?>? = null,
        /** Relevant reference substance. */
        public var substance: CodeableReference? = null,
        /** Strength expressed in terms of a reference substance. */
        public var strength: Strength? = null,
        /** For when strength is measured at a particular point or distance. */
        public var measurementPoint: String? = null,
        /** The country or countries for which the strength range applies. */
        public var country: List<CodeableConcept?>? = null,
      ) : BackboneElement() {
        public sealed interface Strength {
          public fun asRatio(): Ratio? = this as? Ratio

          public fun asRatioRange(): RatioRange? = this as? RatioRange

          public fun asQuantity(): Quantity? = this as? Quantity

          public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Strength

          public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) :
            Strength

          public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
            Strength

          public companion object {
            public fun from(
              RatioValue: com.google.fhir.model.r5.Ratio?,
              RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
              QuantityValue: com.google.fhir.model.r5.Quantity?,
            ): Strength? {
              if (RatioValue != null) return Ratio(RatioValue)
              if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
              if (QuantityValue != null) return Quantity(QuantityValue)
              return null
            }
          }
        }
      }

      public sealed interface Presentation {
        public fun asRatio(): Ratio? = this as? Ratio

        public fun asRatioRange(): RatioRange? = this as? RatioRange

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asQuantity(): Quantity? = this as? Quantity

        public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Presentation

        public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) :
          Presentation

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Presentation

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
          Presentation

        public companion object {
          public fun from(
            RatioValue: com.google.fhir.model.r5.Ratio?,
            RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
          ): Presentation? {
            if (RatioValue != null) return Ratio(RatioValue)
            if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            return null
          }
        }
      }

      public sealed interface Concentration {
        public fun asRatio(): Ratio? = this as? Ratio

        public fun asRatioRange(): RatioRange? = this as? RatioRange

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asQuantity(): Quantity? = this as? Quantity

        public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Concentration

        public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) :
          Concentration

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Concentration

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
          Concentration

        public companion object {
          public fun from(
            RatioValue: com.google.fhir.model.r5.Ratio?,
            RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
          ): Concentration? {
            if (RatioValue != null) return Ratio(RatioValue)
            if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            return null
          }
        }
      }
    }
  }
}
