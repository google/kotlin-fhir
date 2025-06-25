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

import com.google.fhir.model.r4.serializers.DiagnosticReportMediaSerializer
import com.google.fhir.model.r4.serializers.DiagnosticReportSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
 * devices, and locations, and/or specimens derived from these. The report includes clinical context
 * such as requesting and provider information, and some mix of atomic results, images, textual and
 * coded interpretations, and formatted representation of diagnostic reports.
 */
@Serializable(with = DiagnosticReportSerializer::class)
@SerialName("DiagnosticReport")
public data class DiagnosticReport(
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
  /**
   * Identifiers assigned to this report by the performer or other systems.
   *
   * Usually assigned by the Information System of the diagnostic service provider (filler id).
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * Details concerning a service requested.
   *
   * Note: Usually there is one test request for each result, however in some circumstances multiple
   * test requests may be represented using a single test result resource. Note that there are also
   * cases where one request leads to multiple reports.
   */
  public var basedOn: List<Reference?>? = null,
  /** The status of the diagnostic report. */
  public var status: Enumeration<DiagnosticReportStatus>? = null,
  /**
   * A code that classifies the clinical discipline, department or diagnostic service that created
   * the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching,
   * sorting and display purposes.
   *
   * Multiple categories are allowed using various categorization schemes. The level of granularity
   * is defined by the category concepts in the value set. More fine-grained filtering can be
   * performed using the metadata and/or terminology hierarchy in DiagnosticReport.code.
   */
  public var category: List<CodeableConcept?>? = null,
  /** A code or name that describes this diagnostic report. */
  public var code: CodeableConcept? = null,
  /**
   * The subject of the report. Usually, but not always, this is a patient. However, diagnostic
   * services also perform analyses on specimens collected from a variety of other sources.
   */
  public var subject: Reference? = null,
  /**
   * The healthcare event (e.g. a patient and healthcare provider interaction) which this
   * DiagnosticReport is about.
   *
   * This will typically be the encounter the event occurred within, but some events may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter (e.g. pre-admission laboratory tests).
   */
  public var encounter: Reference? = null,
  /**
   * The time or time-period the observed values are related to. When the subject of the report is a
   * patient, this is usually either the time of the procedure or of specimen collection(s), but
   * very often the source of the date/time is not known, only the date/time itself.
   *
   * If the diagnostic procedure was performed on the patient, this is the time it was performed. If
   * there are specimens, the diagnostically relevant time can be derived from the specimen
   * collection times, but the specimen information is not always available, and the exact
   * relationship between the specimens and the diagnostically relevant time is not always
   * automatic.
   */
  public var effective: Effective? = null,
  /**
   * The date and time that this version of the report was made available to providers, typically
   * after the report was reviewed and verified.
   *
   * May be different from the update time of the resource itself, because that is the status of the
   * record (potentially a secondary copy), not the actual release time of the report.
   */
  public var issued: Instant? = null,
  /**
   * The diagnostic service that is responsible for issuing the report.
   *
   * This is not necessarily the source of the atomic data items or the entity that interpreted the
   * results. It is the entity that takes responsibility for the clinical report.
   */
  public var performer: List<Reference?>? = null,
  /**
   * The practitioner or organization that is responsible for the report's conclusions and
   * interpretations.
   *
   * Might not be the same entity that takes responsibility for the clinical report.
   */
  public var resultsInterpreter: List<Reference?>? = null,
  /**
   * Details about the specimens on which this diagnostic report is based.
   *
   * If the specimen is sufficiently specified with a code in the test result name, then this
   * additional data may be redundant. If there are multiple specimens, these may be represented per
   * observation or group.
   */
  public var specimen: List<Reference?>? = null,
  /**
   * [Observations](observation.html) that are part of this diagnostic report.
   *
   * Observations can contain observations.
   */
  public var result: List<Reference?>? = null,
  /**
   * One or more links to full details of any imaging performed during the diagnostic investigation.
   * Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A
   * fully enabled PACS viewer can use this information to provide views of the source images.
   *
   * ImagingStudy and the image element are somewhat overlapping - typically, the list of image
   * references in the image element will also be found in one of the imaging study resources.
   * However, each caters to different types of displays for different types of purposes. Neither,
   * either, or both may be provided.
   */
  public var imagingStudy: List<Reference?>? = null,
  /**
   * A list of key images associated with this report. The images are generally created during the
   * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
   * interest).
   */
  public var media: List<Media>? = null,
  /**
   * Concise and clinically contextualized summary conclusion (interpretation/impression) of the
   * diagnostic report.
   */
  public var conclusion: String? = null,
  /**
   * One or more codes that represent the summary conclusion (interpretation/impression) of the
   * diagnostic report.
   */
  public var conclusionCode: List<CodeableConcept?>? = null,
  /**
   * Rich text representation of the entire result as issued by the diagnostic service. Multiple
   * formats are allowed but they SHALL be semantically equivalent.
   *
   * "application/pdf" is recommended as the most reliable and interoperable in this context.
   */
  public var presentedForm: List<Attachment?>? = null,
) : DomainResource() {
  /**
   * A list of key images associated with this report. The images are generally created during the
   * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
   * interest).
   */
  @Serializable(with = DiagnosticReportMediaSerializer::class)
  public class Media(
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
     * A comment about the image. Typically, this is used to provide an explanation for why the
     * image is included, or to draw the viewer's attention to important features.
     *
     * The comment should be displayed with the image. It would be common for the report to include
     * additional discussion of the image contents in other sections such as the conclusion.
     */
    public var comment: String? = null,
    /** Reference to the image source. */
    public var link: Reference? = null,
  ) : BackboneElement()

  public sealed interface Effective {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Effective

    public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Effective

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r4.DateTime?,
        PeriodValue: com.google.fhir.model.r4.Period?,
      ): Effective? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        return null
      }
    }
  }

  /** The status of the diagnostic report. */
  public enum class DiagnosticReportStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The existence of the report is registered, but there is nothing yet available. */
    Registered(
      "registered",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Registered",
      "The existence of the report is registered, but there is nothing yet available.",
    ),
    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be
     * incomplete or unverified.
     */
    Partial(
      "partial",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Partial",
      "This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.",
    ),
    /** Verified early results are available, but not all results are final. */
    Preliminary(
      "preliminary",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Preliminary",
      "Verified early results are available, but not all  results are final.",
    ),
    /** The report is complete and verified by an authorized person. */
    Final(
      "final",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Final",
      "The report is complete and verified by an authorized person.",
    ),
    /**
     * Subsequent to being final, the report has been modified. This includes any change in the
     * results, diagnosis, narrative text, or other content of a report that has been issued.
     */
    Amended(
      "amended",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Amended",
      "Subsequent to being final, the report has been modified.  This includes any change in the results, diagnosis, narrative text, or other content of a report that has been issued.",
    ),
    /**
     * Subsequent to being final, the report has been modified to correct an error in the report or
     * referenced results.
     */
    Corrected(
      "corrected",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Corrected",
      "Subsequent to being final, the report has been modified  to correct an error in the report or referenced results.",
    ),
    /**
     * Subsequent to being final, the report has been modified by adding new content. The existing
     * content is unchanged.
     */
    Appended(
      "appended",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Appended",
      "Subsequent to being final, the report has been modified by adding new content. The existing content is unchanged.",
    ),
    /**
     * The report is unavailable because the measurement was not started or not completed (also
     * sometimes called "aborted").
     */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Cancelled",
      "The report is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").",
    ),
    /**
     * The report has been withdrawn following a previous final release. This electronic record
     * should never have existed, though it is possible that real-world decisions were based on it.
     * (If real-world activity has occurred, the status should be "cancelled" rather than
     * "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Entered in Error",
      "The report has been withdrawn following a previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this observation. Note: This concept is not to be used for "other" - one of the listed
     * statuses is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/diagnostic-report-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DiagnosticReportStatus =
        when (code) {
          "registered" -> Registered
          "partial" -> Partial
          "preliminary" -> Preliminary
          "final" -> Final
          "amended" -> Amended
          "corrected" -> Corrected
          "appended" -> Appended
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException("Unknown code $code for enum DiagnosticReportStatus")
        }
    }
  }
}
