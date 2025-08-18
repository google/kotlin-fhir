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

import com.google.fhir.model.r4.serializers.MedicinalProductManufacturingBusinessOperationSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductNameCountryLanguageSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductNameNamePartSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductNameSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductSpecialDesignationIndicationSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductSpecialDesignationSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Detailed definition of a medicinal product, typically for uses other than direct patient care
 * (e.g. regulatory use).
 */
@Serializable(with = MedicinalProductSerializer::class)
@SerialName("MedicinalProduct")
public data class MedicinalProduct(
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
  override var contained: MutableList<Resource> = mutableListOf(),
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
  override var extension: MutableList<Extension> = mutableListOf(),
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
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /** Business identifier for this product. Could be an MPID. */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /** Regulatory type, e.g. Investigational or Authorized. */
  public var type: CodeableConcept? = null,
  /** If this medicine applies to human or veterinary uses. */
  public var domain: Coding? = null,
  /** The dose form for a single part product, or combined form of a multiple part product. */
  public var combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  /** The legal status of supply of the medicinal product as classified by the regulator. */
  public var legalStatusOfSupply: CodeableConcept? = null,
  /** Whether the Medicinal Product is subject to additional monitoring for regulatory reasons. */
  public var additionalMonitoringIndicator: CodeableConcept? = null,
  /** Whether the Medicinal Product is subject to special measures for regulatory reasons. */
  public var specialMeasures: MutableList<String> = mutableListOf(),
  /** If authorised for use in children. */
  public var paediatricUseIndicator: CodeableConcept? = null,
  /** Allows the product to be classified by various systems. */
  public var productClassification: MutableList<CodeableConcept> = mutableListOf(),
  /** Marketing status of the medicinal product, in contrast to marketing authorizaton. */
  public var marketingStatus: MutableList<MarketingStatus> = mutableListOf(),
  /** Pharmaceutical aspects of product. */
  public var pharmaceuticalProduct: MutableList<Reference> = mutableListOf(),
  /** Package representation for the product. */
  public var packagedMedicinalProduct: MutableList<Reference> = mutableListOf(),
  /** Supporting documentation, typically for regulatory submission. */
  public var attachedDocument: MutableList<Reference> = mutableListOf(),
  /** A master file for to the medicinal product (e.g. Pharmacovigilance System Master File). */
  public var masterFile: MutableList<Reference> = mutableListOf(),
  /** A product specific contact, person (in a role), or an organization. */
  public var contact: MutableList<Reference> = mutableListOf(),
  /** Clinical trials or studies that this product is involved in. */
  public var clinicalTrial: MutableList<Reference> = mutableListOf(),
  /** The product's name, including full name and possibly coded parts. */
  public var name: MutableList<Name> = mutableListOf(),
  /** Reference to another product, e.g. for linking authorised to investigational product. */
  public var crossReference: MutableList<Identifier> = mutableListOf(),
  /** An operation applied to the product, for manufacturing or adminsitrative purpose. */
  public var manufacturingBusinessOperation: MutableList<ManufacturingBusinessOperation> =
    mutableListOf(),
  /**
   * Indicates if the medicinal product has an orphan designation for the treatment of a rare
   * disease.
   */
  public var specialDesignation: MutableList<SpecialDesignation> = mutableListOf(),
) : DomainResource() {
  /** The product's name, including full name and possibly coded parts. */
  @Serializable(with = MedicinalProductNameSerializer::class)
  public class Name(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** The full product name. */
    public var productName: String,
    /** Coding words or phrases of the name. */
    public var namePart: MutableList<NamePart> = mutableListOf(),
    /** Country where the name applies. */
    public var countryLanguage: MutableList<CountryLanguage> = mutableListOf(),
  ) : BackboneElement() {
    /** Coding words or phrases of the name. */
    @Serializable(with = MedicinalProductNameNamePartSerializer::class)
    public class NamePart(
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** A fragment of a product name. */
      public var part: String,
      /** Idenifying type for this part of the name (e.g. strength part). */
      public var type: Coding,
    ) : BackboneElement()

    /** Country where the name applies. */
    @Serializable(with = MedicinalProductNameCountryLanguageSerializer::class)
    public class CountryLanguage(
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Country code for where this name applies. */
      public var country: CodeableConcept,
      /** Jurisdiction code for where this name applies. */
      public var jurisdiction: CodeableConcept? = null,
      /** Language code for this name. */
      public var language: CodeableConcept,
    ) : BackboneElement()
  }

  /** An operation applied to the product, for manufacturing or adminsitrative purpose. */
  @Serializable(with = MedicinalProductManufacturingBusinessOperationSerializer::class)
  public class ManufacturingBusinessOperation(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** The type of manufacturing operation. */
    public var operationType: CodeableConcept? = null,
    /** Regulatory authorization reference number. */
    public var authorisationReferenceNumber: Identifier? = null,
    /** Regulatory authorization date. */
    public var effectiveDate: DateTime? = null,
    /** To indicate if this proces is commercially confidential. */
    public var confidentialityIndicator: CodeableConcept? = null,
    /** The manufacturer or establishment associated with the process. */
    public var manufacturer: MutableList<Reference> = mutableListOf(),
    /** A regulator which oversees the operation. */
    public var regulator: Reference? = null,
  ) : BackboneElement()

  /**
   * Indicates if the medicinal product has an orphan designation for the treatment of a rare
   * disease.
   */
  @Serializable(with = MedicinalProductSpecialDesignationSerializer::class)
  public class SpecialDesignation(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** Identifier for the designation, or procedure number. */
    public var identifier: MutableList<Identifier> = mutableListOf(),
    /** The type of special designation, e.g. orphan drug, minor use. */
    public var type: CodeableConcept? = null,
    /** The intended use of the product, e.g. prevention, treatment. */
    public var intendedUse: CodeableConcept? = null,
    /** Condition for which the medicinal use applies. */
    public var indication: Indication? = null,
    /** For example granted, pending, expired or withdrawn. */
    public var status: CodeableConcept? = null,
    /** Date when the designation was granted. */
    public var date: DateTime? = null,
    /** Animal species for which this applies. */
    public var species: CodeableConcept? = null,
  ) : BackboneElement() {
    @Serializable(with = MedicinalProductSpecialDesignationIndicationSerializer::class)
    public sealed interface Indication {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Indication

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Indication

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Indication? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (referenceValue != null) return Reference(referenceValue)
          return null
        }
      }
    }
  }
}
