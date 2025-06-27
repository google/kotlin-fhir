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

import com.google.fhir.model.r5.serializers.InventoryItemAssociationSerializer
import com.google.fhir.model.r5.serializers.InventoryItemCharacteristicSerializer
import com.google.fhir.model.r5.serializers.InventoryItemDescriptionSerializer
import com.google.fhir.model.r5.serializers.InventoryItemInstanceSerializer
import com.google.fhir.model.r5.serializers.InventoryItemNameSerializer
import com.google.fhir.model.r5.serializers.InventoryItemResponsibleOrganizationSerializer
import com.google.fhir.model.r5.serializers.InventoryItemSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** functional description of an inventory item used in inventory and supply-related workflows. */
@Serializable(with = InventoryItemSerializer::class)
@SerialName("InventoryItem")
public data class InventoryItem(
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
  /** Business identifier for the inventory item. */
  public var identifier: List<Identifier?>? = null,
  /** Status of the item entry. */
  public var status: Enumeration<InventoryItemStatus>? = null,
  /** Category or class of the item. */
  public var category: List<CodeableConcept?>? = null,
  /** Code designating the specific type of item. */
  public var code: List<CodeableConcept?>? = null,
  /** The item name(s) - the brand name, or common name, functional name, generic name. */
  public var name: List<Name>? = null,
  /** Organization(s) responsible for the product. */
  public var responsibleOrganization: List<ResponsibleOrganization>? = null,
  /** The descriptive characteristics of the inventory item. */
  public var description: Description? = null,
  /**
   * The usage status e.g. recalled, in use, discarded... This can be used to indicate that the
   * items have been taken out of inventory, or are in use, etc.
   */
  public var inventoryStatus: List<CodeableConcept?>? = null,
  /** The base unit of measure - the unit in which the product is used or counted. */
  public var baseUnit: CodeableConcept? = null,
  /** Net content or amount present in the item. */
  public var netContent: Quantity? = null,
  /** Association with other items or products. */
  public var association: List<Association>? = null,
  /** The descriptive or identifying characteristics of the item. */
  public var characteristic: List<Characteristic>? = null,
  /** Instances or occurrences of the product. */
  public var instance: Instance? = null,
  /** Link to a product resource used in clinical workflows. */
  public var productReference: Reference? = null,
) : DomainResource() {
  /** The item name(s) - the brand name, or common name, functional name, generic name. */
  @Serializable(with = InventoryItemNameSerializer::class)
  public class Name(
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
    /** The type of name e.g. 'brand-name', 'functional-name', 'common-name'. */
    public var nameType: Coding? = null,
    /** The language that the item name is expressed in. */
    public var language: Code? = null,
    /** The name or designation that the item is given. */
    public var name: String? = null,
  ) : BackboneElement()

  /** Organization(s) responsible for the product. */
  @Serializable(with = InventoryItemResponsibleOrganizationSerializer::class)
  public class ResponsibleOrganization(
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
    /** The role of the organization e.g. manufacturer, distributor, etc. */
    public var role: CodeableConcept? = null,
    /**
     * An organization that has an association with the item, e.g. manufacturer, distributor,
     * responsible, etc.
     */
    public var organization: Reference? = null,
  ) : BackboneElement()

  /** The descriptive characteristics of the inventory item. */
  @Serializable(with = InventoryItemDescriptionSerializer::class)
  public class Description(
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
     * The language for the item description, when an item must be described in different languages
     * and those languages may be authoritative and not translations of a 'main' language.
     */
    public var language: Code? = null,
    /** Textual description of the item. */
    public var description: String? = null,
  ) : BackboneElement()

  /** Association with other items or products. */
  @Serializable(with = InventoryItemAssociationSerializer::class)
  public class Association(
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
     * This attribute defined the type of association when establishing associations or relations
     * between items, e.g. 'packaged within' or 'used with' or 'to be mixed with.
     */
    public var associationType: CodeableConcept? = null,
    /** The related item or product. */
    public var relatedItem: Reference? = null,
    /**
     * The quantity of the related product in this product - Numerator is the quantity of the
     * related product. Denominator is the quantity of the present product. For example a value of
     * 20 means that this product contains 20 units of the related product; a value of 1:20 means
     * the inverse - that the contained product contains 20 units of the present product.
     */
    public var quantity: Ratio? = null,
  ) : BackboneElement()

  /** The descriptive or identifying characteristics of the item. */
  @Serializable(with = InventoryItemCharacteristicSerializer::class)
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
    /** The type of characteristic that is being defined. */
    public var characteristicType: CodeableConcept? = null,
    /**
     * The value of the attribute.
     *
     * The string value is used for characteristics that are descriptive and not codeable
     * information. CodeableConcept.text is used when the characteristic is discrete and could
     * otherwise be coded but for which there is no code available.
     */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asString(): String? = this as? String

      public fun asInteger(): Integer? = this as? Integer

      public fun asDecimal(): Decimal? = this as? Decimal

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asUrl(): Url? = this as? Url

      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asAnnotation(): Annotation? = this as? Annotation

      public fun asAddress(): Address? = this as? Address

      public fun asDuration(): Duration? = this as? Duration

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) : Value

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public companion object {
        public fun from(
          stringValue: com.google.fhir.model.r5.String?,
          integerValue: com.google.fhir.model.r5.Integer?,
          decimalValue: com.google.fhir.model.r5.Decimal?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          urlValue: com.google.fhir.model.r5.Url?,
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
          RatioValue: com.google.fhir.model.r5.Ratio?,
          AnnotationValue: com.google.fhir.model.r5.Annotation?,
          AddressValue: com.google.fhir.model.r5.Address?,
          DurationValue: com.google.fhir.model.r5.Duration?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        ): Value? {
          if (stringValue != null) return String(stringValue)
          if (integerValue != null) return Integer(integerValue)
          if (decimalValue != null) return Decimal(decimalValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (urlValue != null) return Url(urlValue)
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (AnnotationValue != null) return Annotation(AnnotationValue)
          if (AddressValue != null) return Address(AddressValue)
          if (DurationValue != null) return Duration(DurationValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          return null
        }
      }
    }
  }

  /** Instances or occurrences of the product. */
  @Serializable(with = InventoryItemInstanceSerializer::class)
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
    /** The identifier for the physical instance, typically a serial number. */
    public var identifier: List<Identifier?>? = null,
    /** The lot or batch number of the item. */
    public var lotNumber: String? = null,
    /** The expiry date or date and time for the product. */
    public var expiry: DateTime? = null,
    /** The subject that the item is associated with. */
    public var subject: Reference? = null,
    /** The location that the item is associated with. */
    public var location: Reference? = null,
  ) : BackboneElement()

  /** InventoryItem Status Codes */
  public enum class InventoryItemStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The item is active and can be referenced. */
    Active(
      "active",
      "http://hl7.org/fhir/inventoryitem-status",
      "Active",
      "The item is active and can be referenced.",
    ),
    /**
     * The item is presently inactive - there may be references to it but the item is not expected
     * to be used.
     */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/inventoryitem-status",
      "Inactive",
      "The item is presently inactive - there may be references to it but the item is not expected to be used.",
    ),
    /** The item record was entered in error. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/inventoryitem-status",
      "Entered in Error",
      "The item record was entered in error.",
    ),
    /** The item status has not been determined. */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/inventoryitem-status",
      "Unknown",
      "The item status has not been determined.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): InventoryItemStatus =
        when (code) {
          "active" -> Active
          "inactive" -> Inactive
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum InventoryItemStatus")
        }
    }
  }
}
