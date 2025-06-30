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

import com.google.fhir.model.r5.serializers.ManufacturedItemDefinitionComponentConstituentSerializer
import com.google.fhir.model.r5.serializers.ManufacturedItemDefinitionComponentSerializer
import com.google.fhir.model.r5.serializers.ManufacturedItemDefinitionPropertySerializer
import com.google.fhir.model.r5.serializers.ManufacturedItemDefinitionPropertyValueSerializer
import com.google.fhir.model.r5.serializers.ManufacturedItemDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule,
 * as contained in a packaged medicinal product.
 */
@Serializable(with = ManufacturedItemDefinitionSerializer::class)
@SerialName("ManufacturedItemDefinition")
public data class ManufacturedItemDefinition(
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
  /** Unique identifier. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The status of this item. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of manufactured items that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /** A descriptive name applied to this item. */
  public var name: String? = null,
  /** Dose form as manufactured and before any transformation into the pharmaceutical product. */
  public var manufacturedDoseForm: CodeableConcept? = null,
  /** The “real-world” units in which the quantity of the manufactured item is described. */
  public var unitOfPresentation: CodeableConcept? = null,
  /** Manufacturer of the item, one of several possible. */
  public var manufacturer: List<Reference?>? = null,
  /**
   * Allows specifying that an item is on the market for sale, or that it is not available, and the
   * dates and locations associated.
   */
  public var marketingStatus: List<MarketingStatus?>? = null,
  /**
   * The ingredients of this manufactured item. This is only needed if the ingredients are not
   * specified by incoming references from the Ingredient resource.
   */
  public var ingredient: List<CodeableConcept?>? = null,
  /** General characteristics of this item. */
  public var `property`: List<Property>? = null,
  /**
   * Physical parts of the manufactured item, that it is intrisically made from. This is distinct
   * from the ingredients that are part of its chemical makeup.
   */
  public var component: List<Component>? = null,
) : DomainResource() {
  /** General characteristics of this item. */
  @Serializable(with = ManufacturedItemDefinitionPropertySerializer::class)
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
    /** A code expressing the type of characteristic. */
    public var type: CodeableConcept? = null,
    /** A value for the characteristic. */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    @Serializable(with = ManufacturedItemDefinitionPropertyValueSerializer::class)
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asDate(): Date? = this as? Date

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asMarkdown(): Markdown? = this as? Markdown

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public data object Null : Value

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          dateValue: com.google.fhir.model.r5.Date?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          markdownValue: com.google.fhir.model.r5.Markdown?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Value {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (dateValue != null) return Date(dateValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (markdownValue != null) return Markdown(markdownValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return Null
        }
      }
    }
  }

  /**
   * Physical parts of the manufactured item, that it is intrisically made from. This is distinct
   * from the ingredients that are part of its chemical makeup.
   */
  @Serializable(with = ManufacturedItemDefinitionComponentSerializer::class)
  public class Component(
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
    /** Defining type of the component e.g. shell, layer, ink. */
    public var type: CodeableConcept? = null,
    /**
     * The function of this component within the item e.g. delivers active ingredient, masks taste.
     */
    public var function: List<CodeableConcept?>? = null,
    /**
     * The measurable amount of total quantity of all substances in the component, expressable in
     * different ways (e.g. by mass or volume).
     */
    public var amount: List<Quantity?>? = null,
    /**
     * A reference to a constituent of the manufactured item as a whole, linked here so that its
     * component location within the item can be indicated. This not where the item's ingredient are
     * primarily stated (for which see Ingredient.for or ManufacturedItemDefinition.ingredient).
     */
    public var constituent: List<Constituent>? = null,
    /** General characteristics of this component. */
    public var `property`: List<Property?>? = null,
    /** A component that this component contains or is made from. */
    public var component: List<Component?>? = null,
  ) : BackboneElement() {
    /**
     * A reference to a constituent of the manufactured item as a whole, linked here so that its
     * component location within the item can be indicated. This not where the item's ingredient are
     * primarily stated (for which see Ingredient.for or ManufacturedItemDefinition.ingredient).
     */
    @Serializable(with = ManufacturedItemDefinitionComponentConstituentSerializer::class)
    public class Constituent(
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
       * The measurable amount of the substance, expressable in different ways (e.g. by mass or
       * volume).
       */
      public var amount: List<Quantity?>? = null,
      /**
       * The physical location of the constituent/ingredient within the component. Example – if the
       * component is the bead in the capsule, then the location would be where the ingredient
       * resides within the product part – intragranular, extra-granular, etc.
       */
      public var location: List<CodeableConcept?>? = null,
      /** The function of this constituent within the component e.g. binder. */
      public var function: List<CodeableConcept?>? = null,
      /** The ingredient that is the constituent of the given component. */
      public var hasIngredient: List<CodeableReference?>? = null,
    ) : BackboneElement()
  }
}
