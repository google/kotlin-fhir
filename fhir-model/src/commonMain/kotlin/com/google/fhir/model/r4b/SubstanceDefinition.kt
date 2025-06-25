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

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.SubstanceDefinitionCodeSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionMoietySerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionMolecularWeightSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionNameOfficialSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionNameSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionPropertySerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionRelationshipSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionSourceMaterialSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionStructureRepresentationSerializer
import com.google.fhir.model.r4b.serializers.SubstanceDefinitionStructureSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The detailed description of a substance, typically at a level beyond what is used for
 * prescribing.
 */
@Serializable(with = SubstanceDefinitionSerializer::class)
@SerialName("SubstanceDefinition")
public data class SubstanceDefinition(
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
  override var language: com.google.fhir.model.r4b.Code? = null,
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
  /** Identifier by which this substance is known. */
  public var identifier: List<Identifier?>? = null,
  /** A business level version identifier of the substance. */
  public var version: String? = null,
  /** Status of substance within the catalogue e.g. active, retired. */
  public var status: CodeableConcept? = null,
  /**
   * A high level categorization, e.g. polymer or nucleic acid, or food, chemical, biological, or a
   * lower level such as the general types of polymer (linear or branch chain) or type of impurity
   * (process related or contaminant).
   */
  public var classification: List<CodeableConcept?>? = null,
  /** If the substance applies to human or veterinary use. */
  public var domain: CodeableConcept? = null,
  /**
   * The quality standard, established benchmark, to which substance complies (e.g. USP/NF, Ph. Eur,
   * JP, BP, Company Standard).
   */
  public var grade: List<CodeableConcept?>? = null,
  /** Textual description of the substance. */
  public var description: Markdown? = null,
  /** Supporting literature. */
  public var informationSource: List<Reference?>? = null,
  /** Textual comment about the substance's catalogue or registry record. */
  public var note: List<Annotation?>? = null,
  /**
   * The entity that creates, makes, produces or fabricates the substance. This is a set of
   * potential manufacturers but is not necessarily comprehensive.
   */
  public var manufacturer: List<Reference?>? = null,
  /**
   * An entity that is the source for the substance. It may be different from the manufacturer.
   * Supplier is synonymous to a distributor.
   */
  public var supplier: List<Reference?>? = null,
  /** Moiety, for structural modifications. */
  public var moiety: List<Moiety>? = null,
  /** General specifications for this substance. */
  public var `property`: List<Property>? = null,
  /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
  public var molecularWeight: List<MolecularWeight>? = null,
  /** Structural information. */
  public var structure: Structure? = null,
  /** Codes associated with the substance. */
  public var code: List<Code>? = null,
  /** Names applicable to this substance. */
  public var name: List<Name>? = null,
  /** A link between this substance and another, with details of the relationship. */
  public var relationship: List<Relationship>? = null,
  /** Material or taxonomic/anatomical source for the substance. */
  public var sourceMaterial: SourceMaterial? = null,
) : DomainResource() {
  /** Moiety, for structural modifications. */
  @Serializable(with = SubstanceDefinitionMoietySerializer::class)
  public class Moiety(
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
    /** Role that the moiety is playing. */
    public var role: CodeableConcept? = null,
    /** Identifier by which this moiety substance is known. */
    public var identifier: Identifier? = null,
    /** Textual name for this moiety substance. */
    public var name: String? = null,
    /** Stereochemistry type. */
    public var stereochemistry: CodeableConcept? = null,
    /** Optical activity type. */
    public var opticalActivity: CodeableConcept? = null,
    /** Molecular formula for this moiety of this substance, typically using the Hill system. */
    public var molecularFormula: String? = null,
    /** Quantitative value for this moiety. */
    public var amount: Amount? = null,
    /**
     * The measurement type of the quantitative value. In capturing the actual relative amounts of
     * substances or molecular fragments it may be necessary to indicate whether the amount refers
     * to, for example, a mole ratio or weight ratio.
     */
    public var measurementType: CodeableConcept? = null,
  ) : BackboneElement() {
    public sealed interface Amount {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asString(): String? = this as? String

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Amount

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : Amount

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r4b.Quantity?,
          stringValue: com.google.fhir.model.r4b.String?,
        ): Amount? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }

  /** General specifications for this substance. */
  @Serializable(with = SubstanceDefinitionPropertySerializer::class)
  public class Property(
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
    /** A code expressing the type of property. */
    public var type: CodeableConcept? = null,
    /** A value for the property. */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asDate(): Date? = this as? Date

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asAttachment(): Attachment? = this as? Attachment

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Value

      public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Value

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          QuantityValue: com.google.fhir.model.r4b.Quantity?,
          dateValue: com.google.fhir.model.r4b.Date?,
          booleanValue: com.google.fhir.model.r4b.Boolean?,
          AttachmentValue: com.google.fhir.model.r4b.Attachment?,
        ): Value? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (dateValue != null) return Date(dateValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          return null
        }
      }
    }
  }

  /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
  @Serializable(with = SubstanceDefinitionMolecularWeightSerializer::class)
  public class MolecularWeight(
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
    /** The method by which the molecular weight was determined. */
    public var method: CodeableConcept? = null,
    /**
     * Type of molecular weight such as exact, average (also known as. number average), weight
     * average.
     */
    public var type: CodeableConcept? = null,
    /**
     * Used to capture quantitative values for a variety of elements. If only limits are given, the
     * arithmetic mean would be the average. If only a single definite value for a given element is
     * given, it would be captured in this field.
     */
    public var amount: Quantity? = null,
  ) : BackboneElement()

  /** Structural information. */
  @Serializable(with = SubstanceDefinitionStructureSerializer::class)
  public class Structure(
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
    /** Stereochemistry type. */
    public var stereochemistry: CodeableConcept? = null,
    /** Optical activity type. */
    public var opticalActivity: CodeableConcept? = null,
    /** Molecular formula of this substance, typically using the Hill system. */
    public var molecularFormula: String? = null,
    /**
     * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical,
     * each moiety separated by a dot.
     */
    public var molecularFormulaByMoiety: String? = null,
    /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
    public var molecularWeight: MolecularWeight? = null,
    /**
     * The method used to elucidate the structure or characterization of the drug substance.
     * Examples: X-ray, HPLC, NMR, Peptide mapping, Ligand binding assay.
     */
    public var technique: List<CodeableConcept?>? = null,
    /** The source of information about the structure. */
    public var sourceDocument: List<Reference?>? = null,
    /** A depiction of the structure or characterization of the substance. */
    public var representation: List<Representation>? = null,
  ) : BackboneElement() {
    /** A depiction of the structure or characterization of the substance. */
    @Serializable(with = SubstanceDefinitionStructureRepresentationSerializer::class)
    public class Representation(
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
      /** The kind of structural representation (e.g. full, partial). */
      public var type: CodeableConcept? = null,
      /**
       * The structural representation or characterization as a text string in a standard format.
       */
      public var representation: String? = null,
      /**
       * The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF. The
       * logical content type rather than the physical file format of a document.
       */
      public var format: CodeableConcept? = null,
      /**
       * An attached file with the structural representation or characterization e.g. a molecular
       * structure graphic of the substance, a JCAMP or AnIML file.
       */
      public var document: Reference? = null,
    ) : BackboneElement()
  }

  /** Codes associated with the substance. */
  @Serializable(with = SubstanceDefinitionCodeSerializer::class)
  public class Code(
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
    /** The specific code. */
    public var code: CodeableConcept? = null,
    /** Status of the code assignment, for example 'provisional', 'approved'. */
    public var status: CodeableConcept? = null,
    /** The date at which the code status was changed as part of the terminology maintenance. */
    public var statusDate: DateTime? = null,
    /** Any comment can be provided in this field, if necessary. */
    public var note: List<Annotation?>? = null,
    /** Supporting literature. */
    public var source: List<Reference?>? = null,
  ) : BackboneElement()

  /** Names applicable to this substance. */
  @Serializable(with = SubstanceDefinitionNameSerializer::class)
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
    /** The actual name. */
    public var name: String? = null,
    /** Name type, for example 'systematic', 'scientific, 'brand'. */
    public var type: CodeableConcept? = null,
    /** The status of the name, for example 'current', 'proposed'. */
    public var status: CodeableConcept? = null,
    /** If this is the preferred name for this substance. */
    public var preferred: Boolean? = null,
    /** Human language that the name is written in. */
    public var language: List<CodeableConcept?>? = null,
    /**
     * The use context of this name for example if there is a different name a drug active
     * ingredient as opposed to a food colour additive.
     */
    public var domain: List<CodeableConcept?>? = null,
    /** The jurisdiction where this name applies. */
    public var jurisdiction: List<CodeableConcept?>? = null,
    /** A synonym of this particular name, by which the substance is also known. */
    public var synonym: List<Name?>? = null,
    /** A translation for this name into another human language. */
    public var translation: List<Name?>? = null,
    /** Details of the official nature of this name. */
    public var official: List<Official>? = null,
    /** Supporting literature. */
    public var source: List<Reference?>? = null,
  ) : BackboneElement() {
    /** Details of the official nature of this name. */
    @Serializable(with = SubstanceDefinitionNameOfficialSerializer::class)
    public class Official(
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
      /** Which authority uses this official name. */
      public var authority: CodeableConcept? = null,
      /** The status of the official name, for example 'draft', 'active', 'retired'. */
      public var status: CodeableConcept? = null,
      /** Date of the official name change. */
      public var date: DateTime? = null,
    ) : BackboneElement()
  }

  /** A link between this substance and another, with details of the relationship. */
  @Serializable(with = SubstanceDefinitionRelationshipSerializer::class)
  public class Relationship(
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
    /** A pointer to another substance, as a resource or just a representational code. */
    public var substanceDefinition: SubstanceDefinition? = null,
    /**
     * For example "salt to parent", "active moiety", "starting material", "polymorph", "impurity
     * of".
     */
    public var type: CodeableConcept? = null,
    /**
     * For example where an enzyme strongly bonds with a particular substance, this is a defining
     * relationship for that enzyme, out of several possible substance relationships.
     */
    public var isDefining: Boolean? = null,
    /**
     * A numeric factor for the relationship, for instance to express that the salt of a substance
     * has some percentage of the active substance in relation to some other.
     */
    public var amount: Amount? = null,
    /** For use when the numeric has an uncertain range. */
    public var ratioHighLimitAmount: Ratio? = null,
    /** An operator for the amount, for example "average", "approximately", "less than". */
    public var comparator: CodeableConcept? = null,
    /** Supporting literature. */
    public var source: List<Reference?>? = null,
  ) : BackboneElement() {
    public sealed interface SubstanceDefinition {
      public fun asReference(): Reference? = this as? Reference

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        SubstanceDefinition

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : SubstanceDefinition

      public companion object {
        public fun from(
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        ): SubstanceDefinition? {
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          return null
        }
      }
    }

    public sealed interface Amount {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asString(): String? = this as? String

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Amount

      public data class Ratio(public val `value`: com.google.fhir.model.r4b.Ratio) : Amount

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : Amount

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r4b.Quantity?,
          RatioValue: com.google.fhir.model.r4b.Ratio?,
          stringValue: com.google.fhir.model.r4b.String?,
        ): Amount? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }

  /** Material or taxonomic/anatomical source for the substance. */
  @Serializable(with = SubstanceDefinitionSourceMaterialSerializer::class)
  public class SourceMaterial(
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
     * A classification that provides the origin of the raw material. Example: cat hair would be an
     * Animal source type.
     */
    public var type: CodeableConcept? = null,
    /**
     * The genus of an organism, typically referring to the Latin epithet of the genus element of
     * the plant/animal scientific name.
     */
    public var genus: CodeableConcept? = null,
    /**
     * The species of an organism, typically referring to the Latin epithet of the species of the
     * plant/animal.
     */
    public var species: CodeableConcept? = null,
    /** An anatomical origin of the source material within an organism. */
    public var part: CodeableConcept? = null,
    /** The country or countries where the material is harvested. */
    public var countryOfOrigin: List<CodeableConcept?>? = null,
  ) : BackboneElement()
}
