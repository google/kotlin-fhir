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

import com.google.fhir.model.r5.serializers.GenomicStudyAnalysisDeviceSerializer
import com.google.fhir.model.r5.serializers.GenomicStudyAnalysisInputSerializer
import com.google.fhir.model.r5.serializers.GenomicStudyAnalysisOutputSerializer
import com.google.fhir.model.r5.serializers.GenomicStudyAnalysisPerformerSerializer
import com.google.fhir.model.r5.serializers.GenomicStudyAnalysisSerializer
import com.google.fhir.model.r5.serializers.GenomicStudySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A set of analyses performed to analyze and generate genomic data. */
@Serializable(with = GenomicStudySerializer::class)
@SerialName("GenomicStudy")
public data class GenomicStudy(
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
  /** Identifiers for this genomic study. */
  public var identifier: List<Identifier?>? = null,
  /** The status of the genomic study. */
  public var status: Enumeration<GenomicStudyStatus>? = null,
  /**
   * The type of the study, e.g., Familial variant segregation, Functional variation detection, or
   * Gene expression profiling.
   */
  public var type: List<CodeableConcept?>? = null,
  /** The primary subject of the genomic study. */
  public var subject: Reference? = null,
  /** The healthcare event with which this genomics study is associated. */
  public var encounter: Reference? = null,
  /** When the genomic study was started. */
  public var startDate: DateTime? = null,
  /** Event resources that the genomic study is based on. */
  public var basedOn: List<Reference?>? = null,
  /** Healthcare professional who requested or referred the genomic study. */
  public var referrer: Reference? = null,
  /** Healthcare professionals who interpreted the genomic study. */
  public var interpreter: List<Reference?>? = null,
  /** Why the genomic study was performed. */
  public var reason: List<CodeableReference?>? = null,
  /** The defined protocol that describes the study. */
  public var instantiatesCanonical: Canonical? = null,
  /** The URL pointing to an externally maintained protocol that describes the study. */
  public var instantiatesUri: Uri? = null,
  /** Comments related to the genomic study. */
  public var note: List<Annotation?>? = null,
  /** Description of the genomic study. */
  public var description: Markdown? = null,
  /** The details about a specific analysis that was performed in this GenomicStudy. */
  public var analysis: List<Analysis>? = null,
) : DomainResource() {
  /** The details about a specific analysis that was performed in this GenomicStudy. */
  @Serializable(with = GenomicStudyAnalysisSerializer::class)
  public class Analysis(
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
    /** Identifiers for the analysis event. */
    public var identifier: List<Identifier?>? = null,
    /**
     * Type of the methods used in the analysis, e.g., Fluorescence in situ hybridization (FISH),
     * Karyotyping, or Microsatellite instability testing (MSI).
     */
    public var methodType: List<CodeableConcept?>? = null,
    /**
     * Type of the genomic changes studied in the analysis, e.g., DNA, RNA, or amino acid change.
     */
    public var changeType: List<CodeableConcept?>? = null,
    /** The reference genome build that is used in this analysis. */
    public var genomeBuild: CodeableConcept? = null,
    /** The defined protocol that describes the analysis. */
    public var instantiatesCanonical: Canonical? = null,
    /** The URL pointing to an externally maintained protocol that describes the analysis. */
    public var instantiatesUri: Uri? = null,
    /** Name of the analysis event (human friendly). */
    public var title: String? = null,
    /**
     * The focus of a genomic analysis when it is not the patient of record representing something
     * or someone associated with the patient such as a spouse, parent, child, or sibling. For
     * example, in trio testing, the GenomicStudy.subject would be the child (proband) and the
     * GenomicStudy.analysis.focus of a specific analysis would be the parent.
     *
     * If the focus of the analysis is not known, the value of this field SHALL use the data absent
     * extension.
     */
    public var focus: List<Reference?>? = null,
    /** The specimen used in the analysis event. */
    public var specimen: List<Reference?>? = null,
    /** The date of the analysis event. */
    public var date: DateTime? = null,
    /** Any notes capture with the analysis event. */
    public var note: List<Annotation?>? = null,
    /** The protocol that was performed for the analysis event. */
    public var protocolPerformed: Reference? = null,
    /** The genomic regions to be studied in the analysis (BED file). */
    public var regionsStudied: List<Reference?>? = null,
    /** Genomic regions actually called in the analysis event (BED file). */
    public var regionsCalled: List<Reference?>? = null,
    /** Inputs for the analysis event. */
    public var input: List<Input>? = null,
    /** Outputs for the analysis event. */
    public var output: List<Output>? = null,
    /** Performer for the analysis event. */
    public var performer: List<Performer>? = null,
    /**
     * Devices used for the analysis (e.g., instruments, software), with settings and parameters.
     */
    public var device: List<Device>? = null,
  ) : BackboneElement() {
    /** Inputs for the analysis event. */
    @Serializable(with = GenomicStudyAnalysisInputSerializer::class)
    public class Input(
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
      /** File containing input data. */
      public var `file`: Reference? = null,
      /** Type of input data, e.g., BAM, CRAM, or FASTA. */
      public var type: CodeableConcept? = null,
      /** The analysis event or other GenomicStudy that generated this input file. */
      public var generatedBy: GeneratedBy? = null,
    ) : BackboneElement() {
      public sealed interface GeneratedBy {
        public fun asIdentifier(): Identifier? = this as? Identifier

        public fun asReference(): Reference? = this as? Reference

        public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) :
          GeneratedBy

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
          GeneratedBy

        public companion object {
          public fun from(
            IdentifierValue: com.google.fhir.model.r5.Identifier?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
          ): GeneratedBy? {
            if (IdentifierValue != null) return Identifier(IdentifierValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }

    /** Outputs for the analysis event. */
    @Serializable(with = GenomicStudyAnalysisOutputSerializer::class)
    public class Output(
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
      /** File containing output data. */
      public var `file`: Reference? = null,
      /** Type of output data, e.g., VCF, MAF, or BAM. */
      public var type: CodeableConcept? = null,
    ) : BackboneElement()

    /** Performer for the analysis event. */
    @Serializable(with = GenomicStudyAnalysisPerformerSerializer::class)
    public class Performer(
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
       * The organization, healthcare professional, or others who participated in performing this
       * analysis.
       */
      public var actor: Reference? = null,
      /** Role of the actor for this analysis. */
      public var role: CodeableConcept? = null,
    ) : BackboneElement()

    /**
     * Devices used for the analysis (e.g., instruments, software), with settings and parameters.
     */
    @Serializable(with = GenomicStudyAnalysisDeviceSerializer::class)
    public class Device(
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
      /** Device used for the analysis. */
      public var device: Reference? = null,
      /** Specific function for the device used for the analysis. */
      public var function: CodeableConcept? = null,
    ) : BackboneElement()
  }

  /** The status of the GenomicStudy. */
  public enum class GenomicStudyStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The existence of the genomic study is registered, but there is nothing yet available. */
    Registered(
      "registered",
      "http://hl7.org/fhir/genomicstudy-status",
      "Registered",
      "The existence of the genomic study is registered, but there is nothing yet available.",
    ),
    /** At least one instance has been associated with this genomic study. */
    Available(
      "available",
      "http://hl7.org/fhir/genomicstudy-status",
      "Available",
      "At least one instance has been associated with this genomic study.",
    ),
    /**
     * The genomic study is unavailable because the genomic study was not started or not completed
     * (also sometimes called "aborted").
     */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/genomicstudy-status",
      "Cancelled",
      "The genomic study is unavailable because the genomic study was not started or not completed (also sometimes called \"aborted\").",
    ),
    /**
     * The genomic study has been withdrawn following a previous final release. This electronic
     * record should never have existed, though it is possible that real-world decisions were based
     * on it. (If real-world activity has occurred, the status should be "cancelled" rather than
     * "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/genomicstudy-status",
      "Entered in Error",
      "The genomic study has been withdrawn following a previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).",
    ),
    /**
     * The system does not know which of the status values currently applies for this request. Note:
     * This concept is not to be used for "other" - one of the listed statuses is presumed to apply,
     * it's just not known which one.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/genomicstudy-status",
      "Unknown",
      "The system does not know which of the status values currently applies for this request. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): GenomicStudyStatus =
        when (code) {
          "registered" -> Registered
          "available" -> Available
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum GenomicStudyStatus")
        }
    }
  }
}
