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

import com.google.fhir.model.r5.serializers.MolecularSequenceRelativeEditSerializer
import com.google.fhir.model.r5.serializers.MolecularSequenceRelativeSerializer
import com.google.fhir.model.r5.serializers.MolecularSequenceRelativeStartingSequenceSerializer
import com.google.fhir.model.r5.serializers.MolecularSequenceSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Representation of a molecular sequence. */
@Serializable(with = MolecularSequenceSerializer::class)
@SerialName("MolecularSequence")
public data class MolecularSequence(
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
  /** A unique identifier for this particular sequence instance. */
  public var identifier: List<Identifier?>? = null,
  /** Amino Acid Sequence/ DNA Sequence / RNA Sequence. */
  public var type: Enumeration<SequenceType>? = null,
  /** Indicates the subject this sequence is associated too. */
  public var subject: Reference? = null,
  /**
   * The actual focus of a molecular sequence when it is not the patient of record representing
   * something or someone associated with the patient such as a spouse, parent, child, or sibling.
   * For example, in trio testing, the subject would be the child (proband) and the focus would be
   * the parent.
   */
  public var focus: List<Reference?>? = null,
  /** Specimen used for sequencing. */
  public var specimen: Reference? = null,
  /** The method for sequencing, for example, chip information. */
  public var device: Reference? = null,
  /** The organization or lab that should be responsible for this result. */
  public var performer: Reference? = null,
  /** Sequence that was observed. */
  public var literal: String? = null,
  /**
   * Sequence that was observed as file content. Can be an actual file contents, or referenced by a
   * URL to an external system.
   */
  public var formatted: List<Attachment?>? = null,
  /** A sequence defined relative to another sequence. */
  public var relative: List<Relative>? = null,
) : DomainResource() {
  /** A sequence defined relative to another sequence. */
  @Serializable(with = MolecularSequenceRelativeSerializer::class)
  public class Relative(
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
     * These are different ways of identifying nucleotides or amino acids within a sequence.
     * Different databases and file types may use different systems. For detail definitions, see
     * https://loinc.org/92822-6/ for more detail.
     */
    public var coordinateSystem: CodeableConcept? = null,
    /**
     * Indicates the order in which the sequence should be considered when putting multiple
     * 'relative' elements together.
     */
    public var ordinalPosition: Integer? = null,
    /**
     * Indicates the nucleotide range in the composed sequence when multiple 'relative' elements are
     * used together.
     */
    public var sequenceRange: Range? = null,
    /**
     * A sequence that is used as a starting sequence to describe variants that are present in a
     * sequence analyzed.
     */
    public var startingSequence: StartingSequence? = null,
    /** Changes in sequence from the starting sequence. */
    public var edit: List<Edit>? = null,
  ) : BackboneElement() {
    /**
     * A sequence that is used as a starting sequence to describe variants that are present in a
     * sequence analyzed.
     */
    @Serializable(with = MolecularSequenceRelativeStartingSequenceSerializer::class)
    public class StartingSequence(
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
      /** The genome assembly used for starting sequence, e.g. GRCh38. */
      public var genomeAssembly: CodeableConcept? = null,
      /**
       * Structural unit composed of a nucleic acid molecule which controls its own replication
       * through the interaction of specific proteins at one or more origins of replication
       * ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
       */
      public var chromosome: CodeableConcept? = null,
      /**
       * The reference sequence that represents the starting sequence.
       *
       * A starting sequence may be represented in one of three ways:
       * 1. CodeableConcept, using NCBI, LRG or other appropriate code systems
       * 1. a simple string of IUPAC codes
       * 1. a reference to another MolecularSequence resource.
       */
      public var sequence: Sequence? = null,
      /**
       * Start position of the window on the starting sequence. This value should honor the rules of
       * the coordinateSystem.
       */
      public var windowStart: Integer? = null,
      /**
       * End position of the window on the starting sequence. This value should honor the rules of
       * the coordinateSystem.
       */
      public var windowEnd: Integer? = null,
      /**
       * A relative reference to a DNA strand based on gene orientation. The strand that contains
       * the open reading frame of the gene is the "sense" strand, and the opposite complementary
       * strand is the "antisense" strand.
       */
      public var orientation: Enumeration<OrientationType>? = null,
      /**
       * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the
       * short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long
       * arm.
       */
      public var strand: Enumeration<StrandType>? = null,
    ) : BackboneElement() {
      public sealed interface Sequence {
        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asString(): String? = this as? String

        public fun asReference(): Reference? = this as? Reference

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Sequence

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Sequence

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
          Sequence

        public companion object {
          public fun from(
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            stringValue: com.google.fhir.model.r5.String?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
          ): Sequence? {
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (stringValue != null) return String(stringValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }

    /** Changes in sequence from the starting sequence. */
    @Serializable(with = MolecularSequenceRelativeEditSerializer::class)
    public class Edit(
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
       * Start position of the edit on the starting sequence. If the coordinate system is either
       * 0-based or 1-based, then start position is inclusive.
       */
      public var start: Integer? = null,
      /**
       * End position of the edit on the starting sequence. If the coordinate system is 0-based then
       * end is exclusive and does not include the last position. If the coordinate system is
       * 1-base, then end is inclusive and includes the last position.
       */
      public var end: Integer? = null,
      /**
       * Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop
       * position of sequence on the positive (+) strand of the observed sequence. When the sequence
       * type is DNA, it should be the sequence on the positive (+) strand. This will lay in the
       * range between variant.start and variant.end.
       */
      public var replacementSequence: String? = null,
      /**
       * Allele in the starting sequence. Nucleotide(s)/amino acids from start position of sequence
       * to stop position of sequence on the positive (+) strand of the starting sequence. When the
       * sequence type is DNA, it should be the sequence on the positive (+) strand. This will lay
       * in the range between variant.start and variant.end.
       */
      public var replacedSequence: String? = null,
    ) : BackboneElement()
  }

  /** Type for orientation. */
  public enum class OrientationType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Sense orientation of reference sequence. */
    Sense(
      "sense",
      "http://hl7.org/fhir/orientation-type",
      "Sense orientation of referenceSeq",
      "Sense orientation of reference sequence.",
    ),
    /** Antisense orientation of reference sequence. */
    Antisense(
      "antisense",
      "http://hl7.org/fhir/orientation-type",
      "Antisense orientation of referenceSeq",
      "Antisense orientation of reference sequence.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): OrientationType =
        when (code) {
          "sense" -> Sense
          "antisense" -> Antisense
          else -> throw IllegalArgumentException("Unknown code $code for enum OrientationType")
        }
    }
  }

  /** Type for strand. */
  public enum class StrandType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Watson strand of starting sequence. */
    Watson(
      "watson",
      "http://hl7.org/fhir/strand-type",
      "Watson strand of starting sequence",
      "Watson strand of starting sequence.",
    ),
    /** Crick strand of starting sequence. */
    Crick(
      "crick",
      "http://hl7.org/fhir/strand-type",
      "Crick strand of starting sequence",
      "Crick strand of starting sequence.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): StrandType =
        when (code) {
          "watson" -> Watson
          "crick" -> Crick
          else -> throw IllegalArgumentException("Unknown code $code for enum StrandType")
        }
    }
  }

  /** Type if a sequence -- DNA, RNA, or amino acid sequence. */
  public enum class SequenceType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Amino acid sequence. */
    Aa("aa", "http://hl7.org/fhir/sequence-type", "AA Sequence", "Amino acid sequence."),
    /** DNA Sequence. */
    Dna("dna", "http://hl7.org/fhir/sequence-type", "DNA Sequence", "DNA Sequence."),
    /** RNA Sequence. */
    Rna("rna", "http://hl7.org/fhir/sequence-type", "RNA Sequence", "RNA Sequence.");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SequenceType =
        when (code) {
          "aa" -> Aa
          "dna" -> Dna
          "rna" -> Rna
          else -> throw IllegalArgumentException("Unknown code $code for enum SequenceType")
        }
    }
  }
}
