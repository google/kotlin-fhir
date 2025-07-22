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

import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionCharacteristicSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionContactSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionCrossReferenceSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionNamePartSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionNameSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionNameUsageSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionOperationSerializer
import com.google.fhir.model.r5.serializers.MedicinalProductDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Detailed definition of a medicinal product, typically for uses other than direct patient care
 * (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).
 */
@Serializable(with = MedicinalProductDefinitionSerializer::class)
@SerialName("MedicinalProductDefinition")
public data class MedicinalProductDefinition(
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
   * Business identifier for this product. Could be an MPID. When in development or being regulated,
   * products are typically referenced by official identifiers, assigned by a manufacturer or
   * regulator, and unique to a product (which, when compared to a product instance being
   * prescribed, is actually a product type). See also MedicinalProductDefinition.code.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /** Regulatory type, e.g. Investigational or Authorized. */
  public var type: CodeableConcept? = null,
  /** If this medicine applies to human or veterinary uses. */
  public var domain: CodeableConcept? = null,
  /**
   * A business identifier relating to a specific version of the product, this is commonly used to
   * support revisions to an existing product.
   */
  public var version: String? = null,
  /**
   * The status within the lifecycle of this product record. A high-level status, this is not
   * intended to duplicate details carried elsewhere such as legal status, or authorization status.
   */
  public var status: CodeableConcept? = null,
  /** The date at which the given status became applicable. */
  public var statusDate: DateTime? = null,
  /** General description of this product. */
  public var description: Markdown? = null,
  /**
   * The dose form for a single part product, or combined form of a multiple part product. This is
   * one concept that describes all the components. It does not represent the form with components
   * physically mixed, if that might be necessary, for which see
   * (AdministrableProductDefinition.administrableDoseForm).
   */
  public var combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  /**
   * The path by which the product is taken into or makes contact with the body. In some regions
   * this is referred to as the licenced or approved route. See also AdministrableProductDefinition
   * resource. MedicinalProductDefinition.route is the same concept as
   * AdministrableProductDefinition.routeOfAdministration.code, and they cannot be used together.
   */
  public var route: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Description of indication(s) for this product, used when structured indications are not
   * required. In cases where structured indications are required, they are captured using the
   * ClinicalUseDefinition resource. An indication is a medical situation for which using the
   * product is appropriate.
   */
  public var indication: Markdown? = null,
  /** The legal status of supply of the medicinal product as classified by the regulator. */
  public var legalStatusOfSupply: CodeableConcept? = null,
  /**
   * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons, such
   * as heightened reporting requirements.
   */
  public var additionalMonitoringIndicator: CodeableConcept? = null,
  /**
   * Whether the Medicinal Product is subject to special measures for regulatory reasons, such as a
   * requirement to conduct post-authorization studies.
   */
  public var specialMeasures: MutableList<CodeableConcept> = mutableListOf(),
  /** If authorised for use in children, or infants, neonates etc. */
  public var pediatricUseIndicator: CodeableConcept? = null,
  /** Allows the product to be classified by various systems, commonly WHO ATC. */
  public var classification: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Marketing status of the medicinal product, in contrast to marketing authorization. This refers
   * to the product being actually 'on the market' as opposed to being allowed to be on the market
   * (which is an authorization).
   */
  public var marketingStatus: MutableList<MarketingStatus> = mutableListOf(),
  /** Package type for the product. See also the PackagedProductDefinition resource. */
  public var packagedMedicinalProduct: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Types of medicinal manufactured items and/or devices that this product consists of, such as
   * tablets, capsule, or syringes. Used as a direct link when the item's packaging is not being
   * recorded (see also PackagedProductDefinition.package.containedItem.item).
   */
  public var comprisedOf: MutableList<Reference> = mutableListOf(),
  /**
   * The ingredients of this medicinal product - when not detailed in other resources. This is only
   * needed if the ingredients are not specified by incoming references from the Ingredient
   * resource, or indirectly via incoming AdministrableProductDefinition, PackagedProductDefinition
   * or ManufacturedItemDefinition references. In cases where those levels of detail are not used,
   * the ingredients may be specified directly here as codes.
   */
  public var ingredient: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Any component of the drug product which is not the chemical entity defined as the drug
   * substance, or an excipient in the drug product. This includes process-related impurities and
   * contaminants, product-related impurities including degradation products.
   */
  public var impurity: MutableList<CodeableReference> = mutableListOf(),
  /** Additional information or supporting documentation about the medicinal product. */
  public var attachedDocument: MutableList<Reference> = mutableListOf(),
  /**
   * A master file for the medicinal product (e.g. Pharmacovigilance System Master File). Drug
   * master files (DMFs) are documents submitted to regulatory agencies to provide confidential
   * detailed information about facilities, processes or articles used in the manufacturing,
   * processing, packaging and storing of drug products.
   */
  public var masterFile: MutableList<Reference> = mutableListOf(),
  /** A product specific contact, person (in a role), or an organization. */
  public var contact: MutableList<Contact> = mutableListOf(),
  /** Clinical trials or studies that this product is involved in. */
  public var clinicalTrial: MutableList<Reference> = mutableListOf(),
  /**
   * A code that this product is known by, usually within some formal terminology, perhaps assigned
   * by a third party (i.e. not the manufacturer or regulator). Products (types of medications) tend
   * to be known by identifiers during development and within regulatory process. However when they
   * are prescribed they tend to be identified by codes. The same product may be have multiple
   * codes, applied to it by multiple organizations.
   */
  public var code: MutableList<Coding> = mutableListOf(),
  /** The product's name, including full name and possibly coded parts. */
  public var name: MutableList<Name> = mutableListOf(),
  /**
   * Reference to another product, e.g. for linking authorised to investigational product, or a
   * virtual product.
   */
  public var crossReference: MutableList<CrossReference> = mutableListOf(),
  /**
   * A manufacturing or administrative process or step associated with (or performed on) the
   * medicinal product.
   */
  public var operation: MutableList<Operation> = mutableListOf(),
  /**
   * Allows the key product features to be recorded, such as "sugar free", "modified release",
   * "parallel import".
   */
  public var characteristic: MutableList<Characteristic> = mutableListOf(),
) : DomainResource() {
  /** A product specific contact, person (in a role), or an organization. */
  @Serializable(with = MedicinalProductDefinitionContactSerializer::class)
  public class Contact(
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
     * Allows the contact to be classified, for example QPPV, Pharmacovigilance Enquiry Information.
     */
    public var type: CodeableConcept? = null,
    /** A product specific contact, person (in a role), or an organization. */
    public var contact: Reference,
  ) : BackboneElement()

  /** The product's name, including full name and possibly coded parts. */
  @Serializable(with = MedicinalProductDefinitionNameSerializer::class)
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
    /** The full product name. */
    public var productName: String,
    /** Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary. */
    public var type: CodeableConcept? = null,
    /** Coding words or phrases of the name. */
    public var part: MutableList<Part> = mutableListOf(),
    /** Country and jurisdiction where the name applies, and associated language. */
    public var usage: MutableList<Usage> = mutableListOf(),
  ) : BackboneElement() {
    /** Coding words or phrases of the name. */
    @Serializable(with = MedicinalProductDefinitionNamePartSerializer::class)
    public class Part(
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
      /** A fragment of a product name. */
      public var part: String,
      /** Identifying type for this part of the name (e.g. strength part). */
      public var type: CodeableConcept,
    ) : BackboneElement()

    /** Country and jurisdiction where the name applies, and associated language. */
    @Serializable(with = MedicinalProductDefinitionNameUsageSerializer::class)
    public class Usage(
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
      /** Country code for where this name applies. */
      public var country: CodeableConcept,
      /**
       * Jurisdiction code for where this name applies. A jurisdiction may be a sub- or
       * supra-national entity (e.g. a state or a geographic region).
       */
      public var jurisdiction: CodeableConcept? = null,
      /** Language code for this name. */
      public var language: CodeableConcept,
    ) : BackboneElement()
  }

  /**
   * Reference to another product, e.g. for linking authorised to investigational product, or a
   * virtual product.
   */
  @Serializable(with = MedicinalProductDefinitionCrossReferenceSerializer::class)
  public class CrossReference(
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
    /** Reference to another product, e.g. for linking authorised to investigational product. */
    public var product: CodeableReference,
    /**
     * The type of relationship, for instance branded to generic, virtual to actual product, product
     * to development product (investigational), parallel import version.
     */
    public var type: CodeableConcept? = null,
  ) : BackboneElement()

  /**
   * A manufacturing or administrative process or step associated with (or performed on) the
   * medicinal product.
   */
  @Serializable(with = MedicinalProductDefinitionOperationSerializer::class)
  public class Operation(
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
     * The type of manufacturing operation e.g. manufacturing itself, re-packaging. For the
     * authorization of this, a RegulatedAuthorization would point to the same plan or activity
     * referenced here.
     */
    public var type: CodeableReference? = null,
    /** Date range of applicability. */
    public var effectiveDate: Period? = null,
    /**
     * The organization or establishment responsible for (or associated with) the particular process
     * or step, examples include the manufacturer, importer, agent.
     */
    public var organization: MutableList<Reference> = mutableListOf(),
    /**
     * Specifies whether this particular business or manufacturing process is considered proprietary
     * or confidential.
     */
    public var confidentialityIndicator: CodeableConcept? = null,
  ) : BackboneElement()

  /**
   * Allows the key product features to be recorded, such as "sugar free", "modified release",
   * "parallel import".
   */
  @Serializable(with = MedicinalProductDefinitionCharacteristicSerializer::class)
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
    /** A code expressing the type of characteristic. */
    public var type: CodeableConcept,
    /**
     * A value for the characteristic.text.
     *
     * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded.
     * Otherwise, for cases where a code is not available, but is feasible, use
     * CodeableConcept.text.
     */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asMarkdown(): Markdown? = this as? Markdown

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asInteger(): Integer? = this as? Integer

      public fun asDate(): Date? = this as? Date

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asAttachment(): Attachment? = this as? Attachment

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          markdownValue: com.google.fhir.model.r5.Markdown?,
          quantityValue: com.google.fhir.model.r5.Quantity?,
          integerValue: com.google.fhir.model.r5.Integer?,
          dateValue: com.google.fhir.model.r5.Date?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          attachmentValue: com.google.fhir.model.r5.Attachment?,
        ): Value? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (markdownValue != null) return Markdown(markdownValue)
          if (quantityValue != null) return Quantity(quantityValue)
          if (integerValue != null) return Integer(integerValue)
          if (dateValue != null) return Date(dateValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (attachmentValue != null) return Attachment(attachmentValue)
          return null
        }
      }
    }
  }
}
