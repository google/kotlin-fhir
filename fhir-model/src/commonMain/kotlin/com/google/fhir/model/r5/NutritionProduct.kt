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

import com.google.fhir.model.r5.serializers.NutritionProductCharacteristicSerializer
import com.google.fhir.model.r5.serializers.NutritionProductIngredientSerializer
import com.google.fhir.model.r5.serializers.NutritionProductInstanceSerializer
import com.google.fhir.model.r5.serializers.NutritionProductNutrientSerializer
import com.google.fhir.model.r5.serializers.NutritionProductSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A food or supplement that is consumed by patients. */
@Serializable(with = NutritionProductSerializer::class)
@SerialName("NutritionProduct")
public data class NutritionProduct(
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
   * The code assigned to the product, for example a USDA NDB number, a USDA FDC ID number, or a
   * Langual code.
   */
  public var code: CodeableConcept? = null,
  /**
   * The current state of the product.
   *
   * Unknown does not represent "other" - one of the defined statuses must apply. Unknown is used
   * when the authoring system is not sure what the current status is.
   */
  public var status: Enumeration<NutritionProductStatus>? = null,
  /**
   * Nutrition products can have different classifications - according to its nutritional
   * properties, preparation methods, etc.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * The organisation (manufacturer, representative or legal authorization holder) that is
   * responsible for the device.
   */
  public var manufacturer: List<Reference?>? = null,
  /**
   * The product's nutritional information expressed by the nutrients.
   *
   * Note: This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var nutrient: List<Nutrient>? = null,
  /** Ingredients contained in this product. */
  public var ingredient: List<Ingredient>? = null,
  /** Allergens that are known or suspected to be a part of this nutrition product. */
  public var knownAllergen: List<CodeableReference?>? = null,
  /** Specifies descriptive properties of the nutrition product. */
  public var characteristic: List<Characteristic>? = null,
  /**
   * Conveys instance-level information about this product item. One or several physical, countable
   * instances or occurrences of the product.
   */
  public var instance: List<Instance>? = null,
  /** Comments made about the product. */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  /** The product's nutritional information expressed by the nutrients. */
  @Serializable(with = NutritionProductNutrientSerializer::class)
  public class Nutrient(
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
    /** The (relevant) nutrients in the product. */
    public var item: CodeableReference? = null,
    /**
     * The amount of nutrient expressed in one or more units: X per pack / per serving / per dose.
     */
    public var amount: List<Ratio?>? = null,
  ) : BackboneElement()

  /** Ingredients contained in this product. */
  @Serializable(with = NutritionProductIngredientSerializer::class)
  public class Ingredient(
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
    /** The ingredient contained in the product. */
    public var item: CodeableReference? = null,
    /** The amount of ingredient that is in the product. */
    public var amount: List<Ratio?>? = null,
  ) : BackboneElement()

  /** Specifies descriptive properties of the nutrition product. */
  @Serializable(with = NutritionProductCharacteristicSerializer::class)
  public class Characteristic(
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
     * A code specifying which characteristic of the product is being described (for example,
     * colour, shape).
     */
    public var type: CodeableConcept? = null,
    /**
     * The actual characteristic value corresponding to the type.
     *
     * The description should be provided as a CodeableConcept, SimpleQuantity or an image. The
     * description can be a string only when these others are not available.
     */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asString(): String? = this as? String

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asBoolean(): Boolean? = this as? Boolean

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
        Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          stringValue: com.google.fhir.model.r5.String?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
        ): Value? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (stringValue != null) return String(stringValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (booleanValue != null) return Boolean(booleanValue)
          return null
        }
      }
    }
  }

  /**
   * Conveys instance-level information about this product item. One or several physical, countable
   * instances or occurrences of the product.
   */
  @Serializable(with = NutritionProductInstanceSerializer::class)
  public class Instance(
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
     * The amount of items or instances that the resource considers, for instance when referring to
     * 2 identical units together.
     */
    public var quantity: Quantity? = null,
    /**
     * The identifier for the physical instance, typically a serial number or manufacturer number.
     */
    public var identifier: List<Identifier?>? = null,
    /** The name for the specific product. */
    public var name: String? = null,
    /** The identification of the batch or lot of the product. */
    public var lotNumber: String? = null,
    /**
     * The time after which the product is no longer expected to be in proper condition, or its use
     * is not advised or not allowed.
     */
    public var expiry: DateTime? = null,
    /**
     * The time after which the product is no longer expected to be in proper condition, or its use
     * is not advised or not allowed.
     */
    public var useBy: DateTime? = null,
    /**
     * An identifier that supports traceability to the event during which material in this product
     * from one or more biological entities was obtained or pooled.
     *
     * Necessary to support mandatory requirements for traceability from donor/source to recipient
     * and vice versa, while also satisfying donor anonymity requirements. The element is defined
     * consistently across BiologicallyDerivedProduct, NutritionProduct, and Device. The identifier
     * references an event that links to a single biological entity such as a blood donor, or to
     * multiple biological entities (e.g. when the product is an embryo or a pooled platelet
     * product). A single biologicalSourceEvent identifier may appear on multiple products of many
     * types derived from a single donation event or source extraction. As an example, a single
     * donation event may provide 2 kidneys and a liver for organ transplantation, 2 corneas for eye
     * surgery, heart valves and arterial tissue for cardiovascular surgery, multiple skin grafts,
     * tendons, multiple shaped bone grafts and a large number of bone putty/paste products; and
     * each of them may be assigned to the same biological source event identifier.
     */
    public var biologicalSourceEvent: Identifier? = null,
  ) : BackboneElement()

  /** Codes identifying the lifecycle stage of a product. */
  public enum class NutritionProductStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Active("active", "http://hl7.org/fhir/nutritionproduct-status", "Active", null),
    Inactive("inactive", "http://hl7.org/fhir/nutritionproduct-status", "Inactive", null),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/nutritionproduct-status",
      "Entered in Error",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): NutritionProductStatus =
        when (code) {
          "active" -> Active
          "inactive" -> Inactive
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException("Unknown code $code for enum NutritionProductStatus")
        }
    }
  }
}
