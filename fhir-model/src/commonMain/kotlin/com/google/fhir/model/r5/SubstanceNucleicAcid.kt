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

import com.google.fhir.model.r5.serializers.SubstanceNucleicAcidSerializer
import com.google.fhir.model.r5.serializers.SubstanceNucleicAcidSubunitLinkageSerializer
import com.google.fhir.model.r5.serializers.SubstanceNucleicAcidSubunitSerializer
import com.google.fhir.model.r5.serializers.SubstanceNucleicAcidSubunitSugarSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual
 * substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be
 * always entered in the 5’-3’ direction.
 */
@Serializable(with = SubstanceNucleicAcidSerializer::class)
@SerialName("SubstanceNucleicAcid")
public data class SubstanceNucleicAcid(
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
  /** The type of the sequence shall be specified based on a controlled vocabulary. */
  public var sequenceType: CodeableConcept? = null,
  /**
   * The number of linear sequences of nucleotides linked through phosphodiester bonds shall be
   * described. Subunits would be strands of nucleic acids that are tightly associated typically
   * through Watson-Crick base pairing. NOTE: If not specified in the reference source, the
   * assumption is that there is 1 subunit.
   */
  public var numberOfSubunits: Integer? = null,
  /**
   * The area of hybridisation shall be described if applicable for double stranded RNA or DNA. The
   * number associated with the subunit followed by the number associated to the residue shall be
   * specified in increasing order. The underscore “” shall be used as separator as follows:
   * “Subunitnumber Residue”.
   */
  public var areaOfHybridisation: String? = null,
  /** (TBC). */
  public var oligoNucleotideType: CodeableConcept? = null,
  /**
   * Subunits are listed in order of decreasing length; sequences of the same length will be ordered
   * by molecular weight; subunits that have identical sequences will be repeated multiple times.
   */
  public var subunit: MutableList<Subunit> = mutableListOf(),
) : DomainResource() {
  /**
   * Subunits are listed in order of decreasing length; sequences of the same length will be ordered
   * by molecular weight; subunits that have identical sequences will be repeated multiple times.
   */
  @Serializable(with = SubstanceNucleicAcidSubunitSerializer::class)
  public class Subunit(
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
     * Index of linear sequences of nucleic acids in order of decreasing length. Sequences of the
     * same length will be ordered by molecular weight. Subunits that have identical sequences will
     * be repeated and have sequential subscripts.
     */
    public var subunit: Integer? = null,
    /**
     * Actual nucleotide sequence notation from 5' to 3' end using standard single letter codes. In
     * addition to the base sequence, sugar and type of phosphate or non-phosphate linkage should
     * also be captured.
     */
    public var sequence: String? = null,
    /** The length of the sequence shall be captured. */
    public var length: Integer? = null,
    /** (TBC). */
    public var sequenceAttachment: Attachment? = null,
    /**
     * The nucleotide present at the 5’ terminal shall be specified based on a controlled
     * vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime
     * nucleotide is the letter at the first position in the sequence. A separate representation
     * would be redundant.
     */
    public var fivePrime: CodeableConcept? = null,
    /**
     * The nucleotide present at the 3’ terminal shall be specified based on a controlled
     * vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime
     * nucleotide is the letter at the last position in the sequence. A separate representation
     * would be redundant.
     */
    public var threePrime: CodeableConcept? = null,
    /** The linkages between sugar residues will also be captured. */
    public var linkage: MutableList<Linkage> = mutableListOf(),
    /** 5.3.6.8.1 Sugar ID (Mandatory). */
    public var sugar: MutableList<Sugar> = mutableListOf(),
  ) : BackboneElement() {
    /** The linkages between sugar residues will also be captured. */
    @Serializable(with = SubstanceNucleicAcidSubunitLinkageSerializer::class)
    public class Linkage(
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
      /**
       * The entity that links the sugar residues together should also be captured for nearly all
       * naturally occurring nucleic acid the linkage is a phosphate group. For many synthetic
       * oligonucleotides phosphorothioate linkages are often seen. Linkage connectivity is assumed
       * to be 3’-5’. If the linkage is either 3’-3’ or 5’-5’ this should be specified.
       */
      public var connectivity: String? = null,
      /** Each linkage will be registered as a fragment and have an ID. */
      public var identifier: Identifier? = null,
      /**
       * Each linkage will be registered as a fragment and have at least one name. A single name
       * shall be assigned to each linkage.
       */
      public var name: String? = null,
      /** Residues shall be captured as described in 5.3.6.8.3. */
      public var residueSite: String? = null,
    ) : BackboneElement()

    /** 5.3.6.8.1 Sugar ID (Mandatory). */
    @Serializable(with = SubstanceNucleicAcidSubunitSugarSerializer::class)
    public class Sugar(
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
      /** The Substance ID of the sugar or sugar-like component that make up the nucleotide. */
      public var identifier: Identifier? = null,
      /** The name of the sugar or sugar-like component that make up the nucleotide. */
      public var name: String? = null,
      /**
       * The residues that contain a given sugar will be captured. The order of given residues will
       * be captured in the 5‘-3‘direction consistent with the base sequences listed above.
       */
      public var residueSite: String? = null,
    ) : BackboneElement()
  }
}
