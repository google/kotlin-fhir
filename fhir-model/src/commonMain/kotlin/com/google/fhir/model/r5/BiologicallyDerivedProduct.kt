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

import com.google.fhir.model.r5.serializers.BiologicallyDerivedProductCollectionSerializer
import com.google.fhir.model.r5.serializers.BiologicallyDerivedProductPropertySerializer
import com.google.fhir.model.r5.serializers.BiologicallyDerivedProductSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A biological material originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 */
@Serializable(with = BiologicallyDerivedProductSerializer::class)
@SerialName("BiologicallyDerivedProduct")
public data class BiologicallyDerivedProduct(
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
  /** Broad category of this product. */
  public var productCategory: Coding? = null,
  /**
   * A codified value that systematically supports characterization and classification of medical
   * products of human origin inclusive of processing conditions such as additives, volumes and
   * handling conditions.
   */
  public var productCode: CodeableConcept? = null,
  /**
   * Parent product (if any) for this biologically-derived product.
   *
   * For products that have multiple collections. For example Peripheral Blood Stem Cells may be
   * collected over several days from a single donor and the donation split into in multiple
   * containers which must be linked to the parent donation.
   */
  public var parent: List<Reference?>? = null,
  /** Request to obtain and/or infuse this biologically derived product. */
  public var request: List<Reference?>? = null,
  /**
   * Unique instance identifiers assigned to a biologically derived product. Note: This is a
   * business identifier, not a resource identifier.
   *
   * This identifier should uniquely identify the product instance in the business domain. Ideally
   * it should be a globally unique identifier under the control of an ISO/IEC 15459 Issuing Agency.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * An identifier that supports traceability to the event during which material in this product
   * from one or more biological entities was obtained or pooled.
   *
   * Necessary to support mandatory requirements for traceability from donor/source to recipient and
   * vice versa, while also satisfying donor anonymity requirements. The element is defined
   * consistently across BiologicallyDerivedProduct, NutritionProduct, and Device. The identifier
   * references an event that links to a single biological entity such as a blood donor, or to
   * multiple biological entities (e.g. when the product is an embryo or a pooled platelet product).
   * A single biologicalSourceEvent identifier may appear on multiple products of many types derived
   * from a single donation event or source extraction. As an example, a single donation event may
   * provide 2 kidneys and a liver for organ transplantation, 2 corneas for eye surgery, heart
   * valves and arterial tissue for cardiovascular surgery, multiple skin grafts, tendons, multiple
   * shaped bone grafts and a large number of bone putty/paste products; and each of them may be
   * assigned to the same biological source event identifier.
   */
  public var biologicalSourceEvent: Identifier? = null,
  /**
   * Processing facilities responsible for the labeling and distribution of this biologically
   * derived product.
   */
  public var processingFacility: List<Reference?>? = null,
  /**
   * A unique identifier for an aliquot of a product. Used to distinguish individual aliquots of a
   * product carrying the same biologicalSource and productCode identifiers.
   */
  public var division: String? = null,
  /** Whether the product is currently available. */
  public var productStatus: Coding? = null,
  /** Date, and where relevant time, of expiration. */
  public var expirationDate: DateTime? = null,
  /** How this product was collected. */
  public var collection: Collection? = null,
  /**
   * The temperature requirements for storage of the biologically-derived product.
   *
   * May be extracted from information held in the Product Description Code.
   */
  public var storageTempRequirements: Range? = null,
  /**
   * A property that is specific to this BiologicallyDerviedProduct instance.
   *
   * Property can be used to provide information on a wide range of additional information specific
   * to a particular biologicallyDerivedProduct.
   */
  public var `property`: List<Property>? = null,
) : DomainResource() {
  /** How this product was collected. */
  @Serializable(with = BiologicallyDerivedProductCollectionSerializer::class)
  public class Collection(
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
    /** Healthcare professional who is performing the collection. */
    public var collector: Reference? = null,
    /**
     * The patient or entity, such as a hospital or vendor in the case of a
     * processed/manipulated/manufactured product, providing the product.
     */
    public var source: Reference? = null,
    /** Time of product collection. */
    public var collected: Collected? = null,
  ) : BackboneElement() {
    public sealed interface Collected {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Collected

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Collected

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          PeriodValue: com.google.fhir.model.r5.Period?,
        ): Collected? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return null
        }
      }
    }
  }

  /** A property that is specific to this BiologicallyDerviedProduct instance. */
  @Serializable(with = BiologicallyDerivedProductPropertySerializer::class)
  public class Property(
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
     * Code that specifies the property. It should reference an established coding system.
     *
     * The element is identified by name and system URI in the type. Some types may have multiple
     * occurrences.
     */
    public var type: CodeableConcept? = null,
    /**
     * Property values.
     *
     * The value should be provided as a boolean, integer, CodeableConcept, period, quantity, range,
     * ratio, or attachment. The description can be a string only when these others are not
     * available. The type of value will depend on the property type and is specified in ST-027.
     */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asInteger(): Integer? = this as? Integer

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asPeriod(): Period? = this as? Period

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asString(): String? = this as? String

      public fun asAttachment(): Attachment? = this as? Attachment

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public companion object {
        public fun from(
          booleanValue: com.google.fhir.model.r5.Boolean?,
          integerValue: com.google.fhir.model.r5.Integer?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          PeriodValue: com.google.fhir.model.r5.Period?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
          RatioValue: com.google.fhir.model.r5.Ratio?,
          stringValue: com.google.fhir.model.r5.String?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
        ): Value? {
          if (booleanValue != null) return Boolean(booleanValue)
          if (integerValue != null) return Integer(integerValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (stringValue != null) return String(stringValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          return null
        }
      }
    }
  }
}
