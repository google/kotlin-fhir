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

import com.google.fhir.model.r5.serializers.DeviceDefinitionChargeItemSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionClassificationSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionConformsToSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionCorrectiveActionSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionDeviceNameSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionGuidelineSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionHasPartSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionLinkSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionMaterialSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionPackagingDistributorSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionPackagingSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionPropertySerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionRegulatoryIdentifierSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionUdiDeviceIdentifierMarketDistributionSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionUdiDeviceIdentifierSerializer
import com.google.fhir.model.r5.serializers.DeviceDefinitionVersionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** This is a specialized resource that defines the characteristics and capabilities of a device. */
@Serializable(with = DeviceDefinitionSerializer::class)
@SerialName("DeviceDefinition")
public data class DeviceDefinition(
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
  /** Additional information to describe the device. */
  public var description: Markdown? = null,
  /**
   * Unique instance identifiers assigned to a device by the software, manufacturers, other
   * organizations or owners. For example: handle ID. The identifier is typically valued if the
   * udiDeviceIdentifier, partNumber or modelNumber is not valued and represents a different type of
   * identifier. However, it is permissible to still include those identifiers in
   * DeviceDefinition.identifier with the appropriate identifier.type.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * Unique device identifier (UDI) assigned to device label or package. Note that the Device may
   * include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction
   * it is sold, or for multiple jurisdictions it could have been sold.
   */
  public var udiDeviceIdentifier: List<UdiDeviceIdentifier>? = null,
  /**
   * Identifier associated with the regulatory documentation (certificates, technical documentation,
   * post-market surveillance documentation and reports) of a set of device models sharing the same
   * intended purpose, risk class and essential design and manufacturing characteristics. One
   * example is the Basic UDI-DI in Europe.
   *
   * This should not be used for regulatory authorization numbers which are to be captured
   * elsewhere.
   */
  public var regulatoryIdentifier: List<RegulatoryIdentifier>? = null,
  /**
   * The part number or catalog number of the device.
   *
   * Alphanumeric Maximum 20.
   */
  public var partNumber: String? = null,
  /**
   * A name of the manufacturer or legal representative e.g. labeler. Whether this is the actual
   * manufacturer or the labeler or responsible depends on implementation and jurisdiction.
   */
  public var manufacturer: Reference? = null,
  /** The name or names of the device as given by the manufacturer. */
  public var deviceName: List<DeviceName>? = null,
  /**
   * The model number for the device for example as defined by the manufacturer or labeler, or other
   * agency.
   */
  public var modelNumber: String? = null,
  /**
   * What kind of device or device system this is.
   *
   * In this element various classifications can be used, such as GMDN, EMDN, SNOMED CT, risk
   * classes, national product codes.
   */
  public var classification: List<Classification>? = null,
  /**
   * Identifies the standards, specifications, or formal guidances for the capabilities supported by
   * the device. The device may be certified as conformant to these specifications e.g.,
   * communication, performance, process, measurement, or specialization standards.
   */
  public var conformsTo: List<ConformsTo>? = null,
  /** A device that is part (for example a component) of the present device. */
  public var hasPart: List<HasPart>? = null,
  /** Information about the packaging of the device, i.e. how the device is packaged. */
  public var packaging: List<Packaging>? = null,
  /** The version of the device or software. */
  public var version: List<Version>? = null,
  /** Safety characteristics of the device. */
  public var safety: List<CodeableConcept?>? = null,
  /** Shelf Life and storage information. */
  public var shelfLifeStorage: List<ProductShelfLife?>? = null,
  /** Language code for the human-readable text strings produced by the device (all supported). */
  public var languageCode: List<CodeableConcept?>? = null,
  /**
   * Static or essentially fixed characteristics or features of this kind of device that are
   * otherwise not captured in more specific attributes, e.g., time or timing attributes,
   * resolution, accuracy, and physical attributes.
   *
   * Dynamic or current properties, such as settings, of an individual device are described using a
   * Device instance-specific DeviceMetric and recorded using Observation. Static characteristics of
   * an individual device could also be documented in a [Device] instance. The Device instance's
   * properties, and their values, could be, but need not be, the same as in the associated
   * DeviceDefinition.
   */
  public var `property`: List<Property>? = null,
  /**
   * An organization that is responsible for the provision and ongoing maintenance of the device.
   */
  public var owner: Reference? = null,
  /**
   * Contact details for an organization or a particular human that is responsible for the device.
   *
   * used for troubleshooting etc.
   */
  public var contact: List<ContactPoint?>? = null,
  /**
   * An associated device, attached to, used with, communicating with or linking a previous or new
   * device model to the focal device.
   */
  public var link: List<Link>? = null,
  /**
   * Descriptive information, usage information or implantation information that is not captured in
   * an existing element.
   */
  public var note: List<Annotation?>? = null,
  /** A substance used to create the material(s) of which the device is made. */
  public var material: List<Material>? = null,
  /**
   * Indicates the production identifier(s) that are expected to appear in the UDI carrier on the
   * device label.
   */
  public var productionIdentifierInUDI: List<Enumeration<DeviceProductionIdentifierInUDI>>? = null,
  /**
   * Information aimed at providing directions for the usage of this model of device.
   *
   * For more structured data, a ClinicalUseDefinition that points to the DeviceDefinition can be
   * used.
   */
  public var guideline: Guideline? = null,
  /** Tracking of latest field safety corrective action. */
  public var correctiveAction: CorrectiveAction? = null,
  /** Billing code or reference associated with the device. */
  public var chargeItem: List<ChargeItem>? = null,
) : DomainResource() {
  /**
   * Unique device identifier (UDI) assigned to device label or package. Note that the Device may
   * include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction
   * it is sold, or for multiple jurisdictions it could have been sold.
   */
  @Serializable(with = DeviceDefinitionUdiDeviceIdentifierSerializer::class)
  public class UdiDeviceIdentifier(
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
     * The identifier that is to be associated with every Device that references this
     * DeviceDefintiion for the issuer and jurisdiction provided in the
     * DeviceDefinition.udiDeviceIdentifier.
     */
    public var deviceIdentifier: String? = null,
    /** The organization that assigns the identifier algorithm. */
    public var issuer: Uri? = null,
    /** The jurisdiction to which the deviceIdentifier applies. */
    public var jurisdiction: Uri? = null,
    /** Indicates where and when the device is available on the market. */
    public var marketDistribution: List<MarketDistribution>? = null,
  ) : BackboneElement() {
    /** Indicates where and when the device is available on the market. */
    @Serializable(with = DeviceDefinitionUdiDeviceIdentifierMarketDistributionSerializer::class)
    public class MarketDistribution(
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
      /** Begin and end dates for the commercial distribution of the device. */
      public var marketPeriod: Period? = null,
      /**
       * National state or territory to which the marketDistribution recers, typically where the
       * device is commercialized.
       */
      public var subJurisdiction: Uri? = null,
    ) : BackboneElement()
  }

  /**
   * Identifier associated with the regulatory documentation (certificates, technical documentation,
   * post-market surveillance documentation and reports) of a set of device models sharing the same
   * intended purpose, risk class and essential design and manufacturing characteristics. One
   * example is the Basic UDI-DI in Europe.
   */
  @Serializable(with = DeviceDefinitionRegulatoryIdentifierSerializer::class)
  public class RegulatoryIdentifier(
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
    /** The type of identifier itself. */
    public var type: Enumeration<DeviceRegulatoryIdentifierType>? = null,
    /** The identifier itself. */
    public var deviceIdentifier: String? = null,
    /** The organization that issued this identifier. */
    public var issuer: Uri? = null,
    /** The jurisdiction to which the deviceIdentifier applies. */
    public var jurisdiction: Uri? = null,
  ) : BackboneElement()

  /** The name or names of the device as given by the manufacturer. */
  @Serializable(with = DeviceDefinitionDeviceNameSerializer::class)
  public class DeviceName(
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
     * A human-friendly name that is used to refer to the device - depending on the type, it can be
     * the brand name, the common name or alias, or other.
     */
    public var name: String? = null,
    /** The type of deviceName. RegisteredName | UserFriendlyName | PatientReportedName. */
    public var type: Enumeration<DeviceNameType>? = null,
  ) : BackboneElement()

  /** What kind of device or device system this is. */
  @Serializable(with = DeviceDefinitionClassificationSerializer::class)
  public class Classification(
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
    /** A classification or risk class of the device model. */
    public var type: CodeableConcept? = null,
    /** Further information qualifying this classification of the device model. */
    public var justification: List<RelatedArtifact?>? = null,
  ) : BackboneElement()

  /**
   * Identifies the standards, specifications, or formal guidances for the capabilities supported by
   * the device. The device may be certified as conformant to these specifications e.g.,
   * communication, performance, process, measurement, or specialization standards.
   */
  @Serializable(with = DeviceDefinitionConformsToSerializer::class)
  public class ConformsTo(
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
    /** Describes the type of the standard, specification, or formal guidance. */
    public var category: CodeableConcept? = null,
    /**
     * Code that identifies the specific standard, specification, protocol, formal guidance,
     * regulation, legislation, or certification scheme to which the device adheres.
     */
    public var specification: CodeableConcept? = null,
    /**
     * Identifies the specific form or variant of the standard, specification, or formal guidance.
     * This may be a 'version number', release, document edition, publication year, or other label.
     */
    public var version: List<String?>? = null,
    /**
     * Standard, regulation, certification, or guidance website, document, or other publication, or
     * similar, supporting the conformance.
     */
    public var source: List<RelatedArtifact?>? = null,
  ) : BackboneElement()

  /** A device that is part (for example a component) of the present device. */
  @Serializable(with = DeviceDefinitionHasPartSerializer::class)
  public class HasPart(
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
    /** Reference to the device that is part of the current device. */
    public var reference: Reference? = null,
    /** Number of instances of the component device in the current device. */
    public var count: Integer? = null,
  ) : BackboneElement()

  /** Information about the packaging of the device, i.e. how the device is packaged. */
  @Serializable(with = DeviceDefinitionPackagingSerializer::class)
  public class Packaging(
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
    /** The business identifier of the packaged medication. */
    public var identifier: Identifier? = null,
    /** A code that defines the specific type of packaging. */
    public var type: CodeableConcept? = null,
    /** The number of items contained in the package (devices or sub-packages). */
    public var count: Integer? = null,
    /** An organization that distributes the packaged device. */
    public var distributor: List<Distributor>? = null,
    /** Unique Device Identifier (UDI) Barcode string on the packaging. */
    public var udiDeviceIdentifier: List<UdiDeviceIdentifier?>? = null,
    /** Allows packages within packages. */
    public var packaging: List<Packaging?>? = null,
  ) : BackboneElement() {
    /** An organization that distributes the packaged device. */
    @Serializable(with = DeviceDefinitionPackagingDistributorSerializer::class)
    public class Distributor(
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
      /** Distributor's human-readable name. */
      public var name: String? = null,
      /** Distributor as an Organization resource. */
      public var organizationReference: List<Reference?>? = null,
    ) : BackboneElement()
  }

  /** The version of the device or software. */
  @Serializable(with = DeviceDefinitionVersionSerializer::class)
  public class Version(
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
    /** The type of the device version, e.g. manufacturer, approved, internal. */
    public var type: CodeableConcept? = null,
    /**
     * The hardware or software module of the device to which the version applies.
     *
     * Note that the module of the device would not need to be tracked as a separate device, e.g.,
     * using different UDI, thus would typically involve one or more software modules. For example,
     * a device may involve two software modules each on a different version.
     */
    public var component: Identifier? = null,
    /** The version text. */
    public var `value`: String? = null,
  ) : BackboneElement()

  /**
   * Static or essentially fixed characteristics or features of this kind of device that are
   * otherwise not captured in more specific attributes, e.g., time or timing attributes,
   * resolution, accuracy, and physical attributes.
   */
  @Serializable(with = DeviceDefinitionPropertySerializer::class)
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
    /** Code that specifies the property such as a resolution or color being represented. */
    public var type: CodeableConcept? = null,
    /**
     * The value of the property specified by the associated property.type code.
     *
     * This use of string or CodeableConcept is supported to address different purposes The text
     * element of the valueCodeableConcept choice type is used for properties which would usually be
     * coded (such as the size of an implant, or a security classification) but for which there is
     * not currently an appropriate concept in the vocabulary (e.g., a custom implant size, or a
     * security classification which depends on configuration. Otherwise the valueString choice type
     * is used for textual descriptive device properties that cannot be expressed in other elements.
     */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asString(): String? = this as? String

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asInteger(): Integer? = this as? Integer

      public fun asRange(): Range? = this as? Range

      public fun asAttachment(): Attachment? = this as? Attachment

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          stringValue: com.google.fhir.model.r5.String?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          integerValue: com.google.fhir.model.r5.Integer?,
          RangeValue: com.google.fhir.model.r5.Range?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
        ): Value? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (stringValue != null) return String(stringValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (integerValue != null) return Integer(integerValue)
          if (RangeValue != null) return Range(RangeValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          return null
        }
      }
    }
  }

  /**
   * An associated device, attached to, used with, communicating with or linking a previous or new
   * device model to the focal device.
   */
  @Serializable(with = DeviceDefinitionLinkSerializer::class)
  public class Link(
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
    /** The type indicates the relationship of the related device to the device instance. */
    public var relation: Coding? = null,
    /** A reference to the linked device. */
    public var relatedDevice: CodeableReference? = null,
  ) : BackboneElement()

  /** A substance used to create the material(s) of which the device is made. */
  @Serializable(with = DeviceDefinitionMaterialSerializer::class)
  public class Material(
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
     * A substance that the device contains, may contain, or is made of - for example latex - to be
     * used to determine patient compatibility. This is not intended to represent the composition of
     * the device, only the clinically relevant materials.
     */
    public var substance: CodeableConcept? = null,
    /** Indicates an alternative material of the device. */
    public var alternate: Boolean? = null,
    /** Whether the substance is a known or suspected allergen. */
    public var allergenicIndicator: Boolean? = null,
  ) : BackboneElement()

  /** Information aimed at providing directions for the usage of this model of device. */
  @Serializable(with = DeviceDefinitionGuidelineSerializer::class)
  public class Guideline(
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
    /** The circumstances that form the setting for using the device. */
    public var useContext: List<UsageContext?>? = null,
    /** Detailed written and visual directions for the user on how to use the device. */
    public var usageInstruction: Markdown? = null,
    /** A source of information or reference for this guideline. */
    public var relatedArtifact: List<RelatedArtifact?>? = null,
    /**
     * A clinical condition for which the device was designed to be used.
     *
     * A ClinicalUseDefinition that points to the DeviceDefinition can be used if more structured
     * data is needed.
     */
    public var indication: List<CodeableConcept?>? = null,
    /**
     * A specific situation when a device should not be used because it may cause harm.
     *
     * A ClinicalUseDefinition that points to the DeviceDefinition can be used if more structured
     * data is needed.
     */
    public var contraindication: List<CodeableConcept?>? = null,
    /**
     * Specific hazard alert information that a user needs to know before using the device.
     *
     * A ClinicalUseDefinition that points to the DeviceDefinition can be used if more structured
     * data is needed.
     */
    public var warning: List<CodeableConcept?>? = null,
    /** A description of the general purpose or medical use of the device or its function. */
    public var intendedUse: String? = null,
  ) : BackboneElement()

  /** Tracking of latest field safety corrective action. */
  @Serializable(with = DeviceDefinitionCorrectiveActionSerializer::class)
  public class CorrectiveAction(
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
     * Whether the last corrective action known for this device was a recall.
     *
     * When a field safety action has been initiated but not yet resulted in a recall, this element
     * will be set to 'false'.
     */
    public var recall: Boolean? = null,
    /**
     * The scope of the corrective action - whether the action targeted all units of a given device
     * model, or only a specific set of batches identified by lot numbers, or individually
     * identified devices identified by the serial name.
     */
    public var scope: Enumeration<DeviceCorrectiveActionScope>? = null,
    /** Start and end dates of the corrective action. */
    public var period: Period? = null,
  ) : BackboneElement()

  /** Billing code or reference associated with the device. */
  @Serializable(with = DeviceDefinitionChargeItemSerializer::class)
  public class ChargeItem(
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
    /** The code or reference for the charge item. */
    public var chargeItemCode: CodeableReference? = null,
    /** Coefficient applicable to the billing code. */
    public var count: Quantity? = null,
    /** A specific time period in which this charge item applies. */
    public var effectivePeriod: Period? = null,
    /** The context to which this charge item applies. */
    public var useContext: List<UsageContext?>? = null,
  ) : BackboneElement()

  /** Regulatory Identifier type */
  public enum class DeviceRegulatoryIdentifierType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Basic(
      "basic",
      "http://hl7.org/fhir/devicedefinition-regulatory-identifier-type",
      "Basic",
      null,
    ),
    Master(
      "master",
      "http://hl7.org/fhir/devicedefinition-regulatory-identifier-type",
      "Master",
      null,
    ),
    License(
      "license",
      "http://hl7.org/fhir/devicedefinition-regulatory-identifier-type",
      "License",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DeviceRegulatoryIdentifierType =
        when (code) {
          "basic" -> Basic
          "master" -> Master
          "license" -> License
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum DeviceRegulatoryIdentifierType"
            )
        }
    }
  }

  /** The type of name the device is referred by. */
  public enum class DeviceNameType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Registered_Name(
      "registered-name",
      "http://hl7.org/fhir/device-nametype",
      "Registered name",
      null,
    ),
    User_Friendly_Name(
      "user-friendly-name",
      "http://hl7.org/fhir/device-nametype",
      "User Friendly name",
      null,
    ),
    Patient_Reported_Name(
      "patient-reported-name",
      "http://hl7.org/fhir/device-nametype",
      "Patient Reported name",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DeviceNameType =
        when (code) {
          "registered-name" -> Registered_Name
          "user-friendly-name" -> User_Friendly_Name
          "patient-reported-name" -> Patient_Reported_Name
          else -> throw IllegalArgumentException("Unknown code $code for enum DeviceNameType")
        }
    }
  }

  /** Device - Corrective action scope */
  public enum class DeviceCorrectiveActionScope(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Model("model", "http://hl7.org/fhir/device-correctiveactionscope", "Model", null),
    Lot_Numbers(
      "lot-numbers",
      "http://hl7.org/fhir/device-correctiveactionscope",
      "Lot Numbers",
      null,
    ),
    Serial_Numbers(
      "serial-numbers",
      "http://hl7.org/fhir/device-correctiveactionscope",
      "Serial Numbers",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DeviceCorrectiveActionScope =
        when (code) {
          "model" -> Model
          "lot-numbers" -> Lot_Numbers
          "serial-numbers" -> Serial_Numbers
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum DeviceCorrectiveActionScope"
            )
        }
    }
  }

  /** Device Production Identifier in UDI */
  public enum class DeviceProductionIdentifierInUDI(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Lot_Number(
      "lot-number",
      "http://hl7.org/fhir/device-productidentifierinudi",
      "Lot Number",
      null,
    ),
    Manufactured_Date(
      "manufactured-date",
      "http://hl7.org/fhir/device-productidentifierinudi",
      "Manufactured date",
      null,
    ),
    Serial_Number(
      "serial-number",
      "http://hl7.org/fhir/device-productidentifierinudi",
      "Serial Number",
      null,
    ),
    Expiration_Date(
      "expiration-date",
      "http://hl7.org/fhir/device-productidentifierinudi",
      "Expiration date",
      null,
    ),
    Biological_Source(
      "biological-source",
      "http://hl7.org/fhir/device-productidentifierinudi",
      "Biological source",
      null,
    ),
    Software_Version(
      "software-version",
      "http://hl7.org/fhir/device-productidentifierinudi",
      "Software Version",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DeviceProductionIdentifierInUDI =
        when (code) {
          "lot-number" -> Lot_Number
          "manufactured-date" -> Manufactured_Date
          "serial-number" -> Serial_Number
          "expiration-date" -> Expiration_Date
          "biological-source" -> Biological_Source
          "software-version" -> Software_Version
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum DeviceProductionIdentifierInUDI"
            )
        }
    }
  }
}
