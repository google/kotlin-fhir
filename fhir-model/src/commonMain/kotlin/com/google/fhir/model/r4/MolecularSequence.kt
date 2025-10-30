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

import com.google.fhir.model.r4.serializers.MolecularSequenceQualityRocSerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceQualitySerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceReferenceSeqSerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceRepositorySerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceSerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceStructureVariantInnerSerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceStructureVariantOuterSerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceStructureVariantSerializer
import com.google.fhir.model.r4.serializers.MolecularSequenceVariantSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Raw data describing a biological sequence. */
@Serializable(with = MolecularSequenceSerializer::class)
@SerialName("MolecularSequence")
public data class MolecularSequence(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override val id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override val meta: Meta? = null,
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
  override val implicitRules: Uri? = null,
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
  override val language: Code? = null,
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
  override val text: Narrative? = null,
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
  override val contained: List<Resource> = listOf(),
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
  override val extension: List<Extension> = listOf(),
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
  override val modifierExtension: List<Extension> = listOf(),
  /** A unique identifier for this particular sequence instance. This is a FHIR-defined id. */
  public val identifier: List<Identifier> = listOf(),
  /** Amino Acid Sequence/ DNA Sequence / RNA Sequence. */
  public val type: Enumeration<SequenceType>? = null,
  /**
   * Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive
   * start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end).
   */
  public val coordinateSystem: Integer,
  /** The patient whose sequencing results are described by this resource. */
  public val patient: Reference? = null,
  /** Specimen used for sequencing. */
  public val specimen: Reference? = null,
  /** The method for sequencing, for example, chip information. */
  public val device: Reference? = null,
  /** The organization or lab that should be responsible for this result. */
  public val performer: Reference? = null,
  /** The number of copies of the sequence of interest. (RNASeq). */
  public val quantity: Quantity? = null,
  /**
   * A sequence that is used as a reference to describe variants that are present in a sequence
   * analyzed.
   */
  public val referenceSeq: ReferenceSeq? = null,
  /**
   * The definition of variant here originates from Sequence ontology
   * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This
   * element can represent amino acid or nucleic sequence change(including
   * insertion,deletion,SNP,etc.) It can represent some complex mutation or segment variation with
   * the assist of CIGAR string.
   */
  public val variant: List<Variant> = listOf(),
  /**
   * Sequence that was observed. It is the result marked by referenceSeq along with variant records
   * on referenceSeq. This shall start from referenceSeq.windowStart and end by
   * referenceSeq.windowEnd.
   */
  public val observedSeq: String? = null,
  /**
   * An experimental feature attribute that defines the quality of the feature in a quantitative
   * way, such as a phred quality score
   * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
   */
  public val quality: List<Quality> = listOf(),
  /**
   * Coverage (read depth or depth) is the average number of reads representing a given nucleotide
   * in the reconstructed sequence.
   */
  public val readCoverage: Integer? = null,
  /**
   * Configurations of the external repository. The repository shall store target's observedSeq or
   * records related with target's observedSeq.
   */
  public val repository: List<Repository> = listOf(),
  /** Pointer to next atomic sequence which at most contains one variant. */
  public val pointer: List<Reference> = listOf(),
  /** Information about chromosome structure variation. */
  public val structureVariant: List<StructureVariant> = listOf(),
) : DomainResource() {
  /**
   * A sequence that is used as a reference to describe variants that are present in a sequence
   * analyzed.
   */
  @Serializable(with = MolecularSequenceReferenceSeqSerializer::class)
  public class ReferenceSeq(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /**
     * Structural unit composed of a nucleic acid molecule which controls its own replication
     * through the interaction of specific proteins at one or more origins of replication
     * ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
     */
    public val chromosome: CodeableConcept? = null,
    /**
     * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'. Version
     * number must be included if a versioned release of a primary build was used.
     */
    public val genomeBuild: String? = null,
    /**
     * A relative reference to a DNA strand based on gene orientation. The strand that contains the
     * open reading frame of the gene is the "sense" strand, and the opposite complementary strand
     * is the "antisense" strand.
     */
    public val orientation: Enumeration<OrientationType>? = null,
    /**
     * Reference identifier of reference sequence submitted to NCBI. It must match the type in the
     * MolecularSequence.type field. For example, the prefix, “NG_” identifies reference sequence
     * for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences.
     */
    public val referenceSeqId: CodeableConcept? = null,
    /** A pointer to another MolecularSequence entity as reference sequence. */
    public val referenceSeqPointer: Reference? = null,
    /** A string like "ACGT". */
    public val referenceSeqString: String? = null,
    /**
     * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the
     * short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
     */
    public val strand: Enumeration<StrandType>? = null,
    /**
     * Start position of the window on the reference sequence. If the coordinate system is either
     * 0-based or 1-based, then start position is inclusive.
     */
    public val windowStart: Integer? = null,
    /**
     * End position of the window on the reference sequence. If the coordinate system is 0-based
     * then end is exclusive and does not include the last position. If the coordinate system is
     * 1-base, then end is inclusive and includes the last position.
     */
    public val windowEnd: Integer? = null,
  ) : BackboneElement()

  /**
   * The definition of variant here originates from Sequence ontology
   * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This
   * element can represent amino acid or nucleic sequence change(including
   * insertion,deletion,SNP,etc.) It can represent some complex mutation or segment variation with
   * the assist of CIGAR string.
   */
  @Serializable(with = MolecularSequenceVariantSerializer::class)
  public class Variant(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /**
     * Start position of the variant on the reference sequence. If the coordinate system is either
     * 0-based or 1-based, then start position is inclusive.
     */
    public val start: Integer? = null,
    /**
     * End position of the variant on the reference sequence. If the coordinate system is 0-based
     * then end is exclusive and does not include the last position. If the coordinate system is
     * 1-base, then end is inclusive and includes the last position.
     */
    public val end: Integer? = null,
    /**
     * An allele is one of a set of coexisting sequence variants of a gene
     * ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).
     * Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the
     * positive (+) strand of the observed sequence. When the sequence type is DNA, it should be the
     * sequence on the positive (+) strand. This will lay in the range between variant.start and
     * variant.end.
     */
    public val observedAllele: String? = null,
    /**
     * An allele is one of a set of coexisting sequence variants of a gene
     * ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).
     * Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the
     * positive (+) strand of the reference sequence. When the sequence type is DNA, it should be
     * the sequence on the positive (+) strand. This will lay in the range between variant.start and
     * variant.end.
     */
    public val referenceAllele: String? = null,
    /**
     * Extended CIGAR string for aligning the sequence with reference bases. See detailed
     * documentation
     * [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm).
     */
    public val cigar: String? = null,
    /** A pointer to an Observation containing variant information. */
    public val variantPointer: Reference? = null,
  ) : BackboneElement()

  /**
   * An experimental feature attribute that defines the quality of the feature in a quantitative
   * way, such as a phred quality score
   * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
   */
  @Serializable(with = MolecularSequenceQualitySerializer::class)
  public class Quality(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** INDEL / SNP / Undefined variant. */
    public val type: Enumeration<QualityType>,
    /** Gold standard sequence used for comparing against. */
    public val standardSequence: CodeableConcept? = null,
    /**
     * Start position of the sequence. If the coordinate system is either 0-based or 1-based, then
     * start position is inclusive.
     */
    public val start: Integer? = null,
    /**
     * End position of the sequence. If the coordinate system is 0-based then end is exclusive and
     * does not include the last position. If the coordinate system is 1-base, then end is inclusive
     * and includes the last position.
     */
    public val end: Integer? = null,
    /**
     * The score of an experimentally derived feature such as a p-value
     * ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685)).
     */
    public val score: Quantity? = null,
    /** Which method is used to get sequence quality. */
    public val method: CodeableConcept? = null,
    /**
     * True positives, from the perspective of the truth data, i.e. the number of sites in the Truth
     * Call Set for which there are paths through the Query Call Set that are consistent with all of
     * the alleles at this site, and for which there is an accurate genotype call for the event.
     */
    public val truthTP: Decimal? = null,
    /**
     * True positives, from the perspective of the query data, i.e. the number of sites in the Query
     * Call Set for which there are paths through the Truth Call Set that are consistent with all of
     * the alleles at this site, and for which there is an accurate genotype call for the event.
     */
    public val queryTP: Decimal? = null,
    /**
     * False negatives, i.e. the number of sites in the Truth Call Set for which there is no path
     * through the Query Call Set that is consistent with all of the alleles at this site, or sites
     * for which there is an inaccurate genotype call for the event. Sites with correct variant but
     * incorrect genotype are counted here.
     */
    public val truthFN: Decimal? = null,
    /**
     * False positives, i.e. the number of sites in the Query Call Set for which there is no path
     * through the Truth Call Set that is consistent with this site. Sites with correct variant but
     * incorrect genotype are counted here.
     */
    public val queryFP: Decimal? = null,
    /**
     * The number of false positives where the non-REF alleles in the Truth and Query Call Sets
     * match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar).
     */
    public val gtFP: Decimal? = null,
    /** QUERY.TP / (QUERY.TP + QUERY.FP). */
    public val precision: Decimal? = null,
    /** TRUTH.TP / (TRUTH.TP + TRUTH.FN). */
    public val recall: Decimal? = null,
    /**
     * Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision +
     * recall).
     */
    public val fScore: Decimal? = null,
    /** Receiver Operator Characteristic (ROC) Curve to give sensitivity/specificity tradeoff. */
    public val roc: Roc? = null,
  ) : BackboneElement() {
    /** Receiver Operator Characteristic (ROC) Curve to give sensitivity/specificity tradeoff. */
    @Serializable(with = MolecularSequenceQualityRocSerializer::class)
    public class Roc(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** Invidual data point representing the GQ (genotype quality) score threshold. */
      public val score: List<Integer> = listOf(),
      /** The number of true positives if the GQ score threshold was set to "score" field value. */
      public val numTP: List<Integer> = listOf(),
      /** The number of false positives if the GQ score threshold was set to "score" field value. */
      public val numFP: List<Integer> = listOf(),
      /** The number of false negatives if the GQ score threshold was set to "score" field value. */
      public val numFN: List<Integer> = listOf(),
      /** Calculated precision if the GQ score threshold was set to "score" field value. */
      public val precision: List<Decimal> = listOf(),
      /** Calculated sensitivity if the GQ score threshold was set to "score" field value. */
      public val sensitivity: List<Decimal> = listOf(),
      /** Calculated fScore if the GQ score threshold was set to "score" field value. */
      public val fMeasure: List<Decimal> = listOf(),
    ) : BackboneElement()
  }

  /**
   * Configurations of the external repository. The repository shall store target's observedSeq or
   * records related with target's observedSeq.
   */
  @Serializable(with = MolecularSequenceRepositorySerializer::class)
  public class Repository(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /**
     * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other
     * ways to see resource.
     */
    public val type: Enumeration<RepositoryType>,
    /** URI of an external repository which contains further details about the genetics data. */
    public val url: Uri? = null,
    /** URI of an external repository which contains further details about the genetics data. */
    public val name: String? = null,
    /**
     * Id of the variant in this external repository. The server will understand how to use this id
     * to call for more info about datasets in external repository.
     */
    public val datasetId: String? = null,
    /**
     * Id of the variantset in this external repository. The server will understand how to use this
     * id to call for more info about variantsets in external repository.
     */
    public val variantsetId: String? = null,
    /** Id of the read in this external repository. */
    public val readsetId: String? = null,
  ) : BackboneElement()

  /** Information about chromosome structure variation. */
  @Serializable(with = MolecularSequenceStructureVariantSerializer::class)
  public class StructureVariant(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** Information about chromosome structure variation DNA change type. */
    public val variantType: CodeableConcept? = null,
    /** Used to indicate if the outer and inner start-end values have the same meaning. */
    public val exact: Boolean? = null,
    /** Length of the variant chromosome. */
    public val length: Integer? = null,
    /** Structural variant outer. */
    public val outer: Outer? = null,
    /** Structural variant inner. */
    public val `inner`: Inner? = null,
  ) : BackboneElement() {
    /** Structural variant outer. */
    @Serializable(with = MolecularSequenceStructureVariantOuterSerializer::class)
    public class Outer(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /**
       * Structural variant outer start. If the coordinate system is either 0-based or 1-based, then
       * start position is inclusive.
       */
      public val start: Integer? = null,
      /**
       * Structural variant outer end. If the coordinate system is 0-based then end is exclusive and
       * does not include the last position. If the coordinate system is 1-base, then end is
       * inclusive and includes the last position.
       */
      public val end: Integer? = null,
    ) : BackboneElement()

    /** Structural variant inner. */
    @Serializable(with = MolecularSequenceStructureVariantInnerSerializer::class)
    public class Inner(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /**
       * Structural variant inner start. If the coordinate system is either 0-based or 1-based, then
       * start position is inclusive.
       */
      public val start: Integer? = null,
      /**
       * Structural variant inner end. If the coordinate system is 0-based then end is exclusive and
       * does not include the last position. If the coordinate system is 1-base, then end is
       * inclusive and includes the last position.
       */
      public val end: Integer? = null,
    ) : BackboneElement()
  }

  /** Type for orientation. */
  public enum class OrientationType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Sense("sense", "http://hl7.org/fhir/orientation-type", "Sense orientation of referenceSeq"),
    Antisense(
      "antisense",
      "http://hl7.org/fhir/orientation-type",
      "Antisense orientation of referenceSeq",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

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
  ) {
    Watson("watson", "http://hl7.org/fhir/strand-type", "Watson strand of referenceSeq"),
    Crick("crick", "http://hl7.org/fhir/strand-type", "Crick strand of referenceSeq");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StrandType =
        when (code) {
          "watson" -> Watson
          "crick" -> Crick
          else -> throw IllegalArgumentException("Unknown code $code for enum StrandType")
        }
    }
  }

  /** Type for quality report. */
  public enum class QualityType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Indel("indel", "http://hl7.org/fhir/quality-type", "INDEL Comparison"),
    Snp("snp", "http://hl7.org/fhir/quality-type", "SNP Comparison"),
    Unknown("unknown", "http://hl7.org/fhir/quality-type", "UNKNOWN Comparison");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): QualityType =
        when (code) {
          "indel" -> Indel
          "snp" -> Snp
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum QualityType")
        }
    }
  }

  /** Type for access of external URI. */
  public enum class RepositoryType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Directlink("directlink", "http://hl7.org/fhir/repository-type", "Click and see"),
    Openapi(
      "openapi",
      "http://hl7.org/fhir/repository-type",
      "The URL is the RESTful or other kind of API that can access to the result.",
    ),
    Login(
      "login",
      "http://hl7.org/fhir/repository-type",
      "Result cannot be access unless an account is logged in",
    ),
    Oauth(
      "oauth",
      "http://hl7.org/fhir/repository-type",
      "Result need to be fetched with API and need LOGIN( or cookies are required when visiting the link of resource)",
    ),
    Other(
      "other",
      "http://hl7.org/fhir/repository-type",
      "Some other complicated or particular way to get resource from URL.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): RepositoryType =
        when (code) {
          "directlink" -> Directlink
          "openapi" -> Openapi
          "login" -> Login
          "oauth" -> Oauth
          "other" -> Other
          else -> throw IllegalArgumentException("Unknown code $code for enum RepositoryType")
        }
    }
  }

  /** Type if a sequence -- DNA, RNA, or amino acid sequence. */
  public enum class SequenceType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Aa("aa", "http://hl7.org/fhir/sequence-type", "AA Sequence"),
    Dna("dna", "http://hl7.org/fhir/sequence-type", "DNA Sequence"),
    Rna("rna", "http://hl7.org/fhir/sequence-type", "RNA Sequence");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

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
