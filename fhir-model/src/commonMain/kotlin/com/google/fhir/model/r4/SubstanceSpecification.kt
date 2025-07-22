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

import com.google.fhir.model.r4.serializers.SubstanceSpecificationCodeSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationMoietySerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationNameOfficialSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationNameSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationPropertySerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationRelationshipSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationStructureIsotopeMolecularWeightSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationStructureIsotopeSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationStructureRepresentationSerializer
import com.google.fhir.model.r4.serializers.SubstanceSpecificationStructureSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The detailed description of a substance, typically at a level beyond what is used for
 * prescribing.
 */
@Serializable(with = SubstanceSpecificationSerializer::class)
@SerialName("SubstanceSpecification")
public data class SubstanceSpecification(
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
  override var language: com.google.fhir.model.r4.Code? = null,
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
  /** Identifier by which this substance is known. */
  public var identifier: Identifier? = null,
  /** High level categorization, e.g. polymer or nucleic acid. */
  public var type: CodeableConcept? = null,
  /** Status of substance within the catalogue e.g. approved. */
  public var status: CodeableConcept? = null,
  /** If the substance applies to only human or veterinary use. */
  public var domain: CodeableConcept? = null,
  /** Textual description of the substance. */
  public var description: String? = null,
  /** Supporting literature. */
  public var source: MutableList<Reference> = mutableListOf(),
  /** Textual comment about this record of a substance. */
  public var comment: String? = null,
  /** Moiety, for structural modifications. */
  public var moiety: MutableList<Moiety> = mutableListOf(),
  /** General specifications for this substance, including how it is related to other substances. */
  public var `property`: MutableList<Property> = mutableListOf(),
  /** General information detailing this substance. */
  public var referenceInformation: Reference? = null,
  /** Structural information. */
  public var structure: Structure? = null,
  /** Codes associated with the substance. */
  public var code: MutableList<Code> = mutableListOf(),
  /** Names applicable to this substance. */
  public var name: MutableList<Name> = mutableListOf(),
  /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
  public var molecularWeight: MutableList<Structure.Isotope.MolecularWeight> = mutableListOf(),
  /** A link between this substance and another, with details of the relationship. */
  public var relationship: MutableList<Relationship> = mutableListOf(),
  /** Data items specific to nucleic acids. */
  public var nucleicAcid: Reference? = null,
  /** Data items specific to polymers. */
  public var polymer: Reference? = null,
  /** Data items specific to proteins. */
  public var protein: Reference? = null,
  /** Material or taxonomic/anatomical source for the substance. */
  public var sourceMaterial: Reference? = null,
) : DomainResource() {
  /** Moiety, for structural modifications. */
  @Serializable(with = SubstanceSpecificationMoietySerializer::class)
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
    /** Molecular formula. */
    public var molecularFormula: String? = null,
    /** Quantitative value for this moiety. */
    public var amount: Amount? = null,
  ) : BackboneElement() {
    public sealed interface Amount {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asString(): String? = this as? String

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Amount

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Amount

      public companion object {
        internal fun from(
          quantityValue: com.google.fhir.model.r4.Quantity?,
          stringValue: com.google.fhir.model.r4.String?,
        ): Amount? {
          if (quantityValue != null) return Quantity(quantityValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }

  /** General specifications for this substance, including how it is related to other substances. */
  @Serializable(with = SubstanceSpecificationPropertySerializer::class)
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
    /** A category for this property, e.g. Physical, Chemical, Enzymatic. */
    public var category: CodeableConcept? = null,
    /** Property type e.g. viscosity, pH, isoelectric point. */
    public var code: CodeableConcept? = null,
    /**
     * Parameters that were used in the measurement of a property (e.g. for viscosity: measured at
     * 20C with a pH of 7.1).
     */
    public var parameters: String? = null,
    /**
     * A substance upon which a defining property depends (e.g. for solubility: in water, in
     * alcohol).
     */
    public var definingSubstance: DefiningSubstance? = null,
    /** Quantitative value for this property. */
    public var amount: Amount? = null,
  ) : BackboneElement() {
    public sealed interface DefiningSubstance {
      public fun asReference(): Reference? = this as? Reference

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        DefiningSubstance

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : DefiningSubstance

      public companion object {
        internal fun from(
          referenceValue: com.google.fhir.model.r4.Reference?,
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
        ): DefiningSubstance? {
          if (referenceValue != null) return Reference(referenceValue)
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          return null
        }
      }
    }

    public sealed interface Amount {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asString(): String? = this as? String

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Amount

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Amount

      public companion object {
        internal fun from(
          quantityValue: com.google.fhir.model.r4.Quantity?,
          stringValue: com.google.fhir.model.r4.String?,
        ): Amount? {
          if (quantityValue != null) return Quantity(quantityValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }

  /** Structural information. */
  @Serializable(with = SubstanceSpecificationStructureSerializer::class)
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
    /** Stereochemistry type. */
    public var stereochemistry: CodeableConcept? = null,
    /** Optical activity type. */
    public var opticalActivity: CodeableConcept? = null,
    /** Molecular formula. */
    public var molecularFormula: String? = null,
    /**
     * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical,
     * each moiety separated by a dot.
     */
    public var molecularFormulaByMoiety: String? = null,
    /**
     * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
     */
    public var isotope: MutableList<Isotope> = mutableListOf(),
    /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
    public var molecularWeight: Isotope.MolecularWeight? = null,
    /** Supporting literature. */
    public var source: MutableList<Reference> = mutableListOf(),
    /** Molecular structural representation. */
    public var representation: MutableList<Representation> = mutableListOf(),
  ) : BackboneElement() {
    /**
     * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
     */
    @Serializable(with = SubstanceSpecificationStructureIsotopeSerializer::class)
    public class Isotope(
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
      /** Substance identifier for each non-natural or radioisotope. */
      public var identifier: Identifier? = null,
      /** Substance name for each non-natural or radioisotope. */
      public var name: CodeableConcept? = null,
      /** The type of isotopic substitution present in a single substance. */
      public var substitution: CodeableConcept? = null,
      /** Half life - for a non-natural nuclide. */
      public var halfLife: Quantity? = null,
      /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
      public var molecularWeight: MolecularWeight? = null,
    ) : BackboneElement() {
      /** The molecular weight or weight range (for proteins, polymers or nucleic acids). */
      @Serializable(with = SubstanceSpecificationStructureIsotopeMolecularWeightSerializer::class)
      public class MolecularWeight(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /** The method by which the molecular weight was determined. */
        public var method: CodeableConcept? = null,
        /**
         * Type of molecular weight such as exact, average (also known as. number average), weight
         * average.
         */
        public var type: CodeableConcept? = null,
        /**
         * Used to capture quantitative values for a variety of elements. If only limits are given,
         * the arithmetic mean would be the average. If only a single definite value for a given
         * element is given, it would be captured in this field.
         */
        public var amount: Quantity? = null,
      ) : BackboneElement()
    }

    /** Molecular structural representation. */
    @Serializable(with = SubstanceSpecificationStructureRepresentationSerializer::class)
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
      /** The type of structure (e.g. Full, Partial, Representative). */
      public var type: CodeableConcept? = null,
      /**
       * The structural representation as text string in a format e.g. InChI, SMILES, MOLFILE, CDX.
       */
      public var representation: String? = null,
      /** An attached file with the structural representation. */
      public var attachment: Attachment? = null,
    ) : BackboneElement()
  }

  /** Codes associated with the substance. */
  @Serializable(with = SubstanceSpecificationCodeSerializer::class)
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
    /** The specific code. */
    public var code: CodeableConcept? = null,
    /** Status of the code assignment. */
    public var status: CodeableConcept? = null,
    /** The date at which the code status is changed as part of the terminology maintenance. */
    public var statusDate: DateTime? = null,
    /** Any comment can be provided in this field, if necessary. */
    public var comment: String? = null,
    /** Supporting literature. */
    public var source: MutableList<Reference> = mutableListOf(),
  ) : BackboneElement()

  /** Names applicable to this substance. */
  @Serializable(with = SubstanceSpecificationNameSerializer::class)
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
    /** The actual name. */
    public var name: String,
    /** Name type. */
    public var type: CodeableConcept? = null,
    /** The status of the name. */
    public var status: CodeableConcept? = null,
    /** If this is the preferred name for this substance. */
    public var preferred: Boolean? = null,
    /** Language of the name. */
    public var language: MutableList<CodeableConcept> = mutableListOf(),
    /**
     * The use context of this name for example if there is a different name a drug active
     * ingredient as opposed to a food colour additive.
     */
    public var domain: MutableList<CodeableConcept> = mutableListOf(),
    /** The jurisdiction where this name applies. */
    public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
    /** A synonym of this name. */
    public var synonym: MutableList<Name> = mutableListOf(),
    /** A translation for this name. */
    public var translation: MutableList<Name> = mutableListOf(),
    /** Details of the official nature of this name. */
    public var official: MutableList<Official> = mutableListOf(),
    /** Supporting literature. */
    public var source: MutableList<Reference> = mutableListOf(),
  ) : BackboneElement() {
    /** Details of the official nature of this name. */
    @Serializable(with = SubstanceSpecificationNameOfficialSerializer::class)
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
      /** Which authority uses this official name. */
      public var authority: CodeableConcept? = null,
      /** The status of the official name. */
      public var status: CodeableConcept? = null,
      /** Date of official name change. */
      public var date: DateTime? = null,
    ) : BackboneElement()
  }

  /** A link between this substance and another, with details of the relationship. */
  @Serializable(with = SubstanceSpecificationRelationshipSerializer::class)
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
    /** A pointer to another substance, as a resource or just a representational code. */
    public var substance: Substance? = null,
    /** For example "salt to parent", "active moiety", "starting material". */
    public var relationship: CodeableConcept? = null,
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
    /** For use when the numeric. */
    public var amountRatioLowLimit: Ratio? = null,
    /** An operator for the amount, for example "average", "approximately", "less than". */
    public var amountType: CodeableConcept? = null,
    /** Supporting literature. */
    public var source: MutableList<Reference> = mutableListOf(),
  ) : BackboneElement() {
    public sealed interface Substance {
      public fun asReference(): Reference? = this as? Reference

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Substance

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Substance

      public companion object {
        internal fun from(
          referenceValue: com.google.fhir.model.r4.Reference?,
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
        ): Substance? {
          if (referenceValue != null) return Reference(referenceValue)
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          return null
        }
      }
    }

    public sealed interface Amount {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asString(): String? = this as? String

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Amount

      public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Amount

      public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : Amount

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Amount

      public companion object {
        internal fun from(
          quantityValue: com.google.fhir.model.r4.Quantity?,
          rangeValue: com.google.fhir.model.r4.Range?,
          ratioValue: com.google.fhir.model.r4.Ratio?,
          stringValue: com.google.fhir.model.r4.String?,
        ): Amount? {
          if (quantityValue != null) return Quantity(quantityValue)
          if (rangeValue != null) return Range(rangeValue)
          if (ratioValue != null) return Ratio(ratioValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }
}
