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

import com.google.fhir.model.r5.serializers.DocumentReferenceAttesterSerializer
import com.google.fhir.model.r5.serializers.DocumentReferenceContentProfileSerializer
import com.google.fhir.model.r5.serializers.DocumentReferenceContentSerializer
import com.google.fhir.model.r5.serializers.DocumentReferenceRelatesToSerializer
import com.google.fhir.model.r5.serializers.DocumentReferenceSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A reference to a document of any kind for any purpose. While the term “document” implies a more
 * narrow focus, for this resource this “document” encompasses *any* serialized object with a
 * mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper,
 * non-patient specific documents like policy text, as well as a photo, video, or audio recording
 * acquired or used in healthcare. The DocumentReference resource provides metadata about the
 * document so that the document can be discovered and managed. The actual content may be inline
 * base64 encoded data or provided by direct reference.
 */
@Serializable(with = DocumentReferenceSerializer::class)
@SerialName("DocumentReference")
public data class DocumentReference(
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
  /**
   * Other business identifiers associated with the document, including version independent
   * identifiers.
   *
   * The structure and format of this identifier would be consistent with the specification
   * corresponding to the format of the document. (e.g. for a DICOM standard document, a
   * 64-character numeric UID; for an HL7 CDA format, the CDA Document Id root and extension).
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * An explicitly assigned identifer of a variation of the content in the DocumentReference.
   *
   * While each resource, including the DocumentReference itself, has its own version identifier,
   * this is a formal identifier for the logical version of the DocumentReference as a whole. It
   * would remain constant if the resources were moved to a new server, and all got new individual
   * resource versions, for example.
   */
  public var version: String? = null,
  /** A procedure that is fulfilled in whole or in part by the creation of this media. */
  public var basedOn: List<Reference?>? = null,
  /**
   * The status of this document reference.
   *
   * This is the status of the DocumentReference object, which might be independent from the
   * docStatus element.
   *
   * This element is labeled as a modifier because the status contains the codes that mark the
   * document or reference as not currently valid.
   */
  public var status: Enumeration<DocumentReferenceStatus>? = null,
  /**
   * The status of the underlying document.
   *
   * The document that is pointed to might be in various lifecycle states.
   */
  public var docStatus: Enumeration<ReferredDocumentStatus>? = null,
  /** Imaging modality used. This may include both acquisition and non-acquisition modalities. */
  public var modality: List<CodeableConcept?>? = null,
  /**
   * Specifies the particular kind of document referenced (e.g. History and Physical, Discharge
   * Summary, Progress Note). This usually equates to the purpose of making the document referenced.
   *
   * Key metadata element describing the document that describes he exact type of document. Helps
   * humans to assess whether the document is of interest when viewing a list of documents.
   */
  public var type: CodeableConcept? = null,
  /**
   * A categorization for the type of document referenced - helps for indexing and searching. This
   * may be implied by or derived from the code specified in the DocumentReference.type.
   *
   * Key metadata element describing the the category or classification of the document. This is a
   * broader perspective that groups similar documents based on how they would be used. This is a
   * primary key used in searching.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Who or what the document is about. The document can be about a person, (patient or healthcare
   * practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about
   * a herd of farm animals, or a set of patients that share a common exposure).
   */
  public var subject: Reference? = null,
  /**
   * Describes the clinical encounter or type of care that the document content is associated with.
   */
  public var context: List<Reference?>? = null,
  /**
   * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy,
   * being documented. In some cases, the event is inherent in the type Code, such as a "History and
   * Physical Report" in which the procedure being documented is necessarily a "History and
   * Physical" act.
   *
   * An event can further specialize the act inherent in the type, such as where it is simply
   * "Procedure Report" and the procedure was a "colonoscopy". If one or more event codes are
   * included, they shall not conflict with the values inherent in the class or type elements as
   * such a conflict would create an ambiguous situation.
   */
  public var event: List<CodeableReference?>? = null,
  /** The anatomic structures included in the document. */
  public var bodySite: List<CodeableReference?>? = null,
  /** The kind of facility where the patient was seen. */
  public var facilityType: CodeableConcept? = null,
  /**
   * This property may convey specifics about the practice setting where the content was created,
   * often reflecting the clinical specialty.
   *
   * This element should be based on a coarse classification system for the class of specialty
   * practice. Recommend the use of the classification system for Practice Setting, such as that
   * described by the Subject Matter Domain in LOINC.
   */
  public var practiceSetting: CodeableConcept? = null,
  /** The time period over which the service that is described by the document was provided. */
  public var period: Period? = null,
  /**
   * When the document reference was created.
   *
   * Referencing/indexing time is used for tracking, organizing versions and searching.
   */
  public var date: Instant? = null,
  /**
   * Identifies who is responsible for adding the information to the document.
   *
   * Not necessarily who did the actual data entry (i.e. typist) or who was the source (informant).
   */
  public var author: List<Reference?>? = null,
  /**
   * A participant who has authenticated the accuracy of the document.
   *
   * Only list each attester once.
   */
  public var attester: List<Attester>? = null,
  /**
   * Identifies the organization or group who is responsible for ongoing maintenance of and access
   * to the document.
   *
   * Identifies the logical organization (software system, vendor, or department) to go to find the
   * current version, where to report issues, etc. This is different from the physical location
   * (URL, disk drive, or server) of the document, which is the technical location of the document,
   * which host may be delegated to the management of some other organization.
   */
  public var custodian: Reference? = null,
  /**
   * Relationships that this document has with other document references that already exist.
   *
   * This element is labeled as a modifier because documents that append to other documents are
   * incomplete on their own.
   */
  public var relatesTo: List<RelatesTo>? = null,
  /**
   * Human-readable description of the source document.
   *
   * What the document is about, a terse summary of the document.
   */
  public var description: Markdown? = null,
  /**
   * A set of Security-Tag codes specifying the level of privacy/security of the Document found at
   * DocumentReference.content.attachment.url. Note that DocumentReference.meta.security contains
   * the security labels of the data elements in DocumentReference, while
   * DocumentReference.securityLabel contains the security labels for the document the reference
   * refers to. The distinction recognizes that the document may contain sensitive information,
   * while the DocumentReference is metadata about the document and thus might not be as sensitive
   * as the document. For example: a psychotherapy episode may contain highly sensitive information,
   * while the metadata may simply indicate that some episode happened.
   *
   * The confidentiality codes can carry multiple vocabulary items. HL7 has developed an
   * understanding of security and privacy tags that might be desirable in a Document Sharing
   * environment, called HL7 Healthcare Privacy and Security Classification System (HCS). The
   * following specification is recommended but not mandated, as the vocabulary bindings are an
   * administrative domain responsibility. The use of this method is up to the policy domain such as
   * the XDS Affinity Domain or other Trust Domain where all parties including sender and recipients
   * are trusted to appropriately tag and enforce.
   *
   * In the HL7 Healthcare Privacy and Security Classification (HCS) there are code systems specific
   * to Confidentiality, Sensitivity, Integrity, and Handling Caveats. Some values would come from a
   * local vocabulary as they are related to workflow roles and special projects.
   */
  public var securityLabel: List<CodeableConcept?>? = null,
  /**
   * The document and format referenced. If there are multiple content element repetitions, these
   * must all represent the same document in different format, or attachment metadata.
   *
   * content element shall not contain different versions of the same content. For version handling
   * use multiple DocumentReference with .relatesTo.
   */
  public var content: List<Content>? = null,
) : DomainResource() {
  /** A participant who has authenticated the accuracy of the document. */
  @Serializable(with = DocumentReferenceAttesterSerializer::class)
  public class Attester(
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
    /** The type of attestation the authenticator offers. */
    public var mode: CodeableConcept? = null,
    /** When the document was attested by the party. */
    public var time: DateTime? = null,
    /** Who attested the document in the specified way. */
    public var party: Reference? = null,
  ) : BackboneElement()

  /** Relationships that this document has with other document references that already exist. */
  @Serializable(with = DocumentReferenceRelatesToSerializer::class)
  public class RelatesTo(
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
     * The type of relationship that this document has with anther document.
     *
     * If this document appends another document, then the document cannot be fully understood
     * without also accessing the referenced document.
     */
    public var code: CodeableConcept? = null,
    /** The target document of this relationship. */
    public var target: Reference? = null,
  ) : BackboneElement()

  /**
   * The document and format referenced. If there are multiple content element repetitions, these
   * must all represent the same document in different format, or attachment metadata.
   */
  @Serializable(with = DocumentReferenceContentSerializer::class)
  public class Content(
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
     * The document or URL of the document along with critical metadata to prove content has
     * integrity.
     */
    public var attachment: Attachment? = null,
    /**
     * An identifier of the document constraints, encoding, structure, and template that the
     * document conforms to beyond the base format indicated in the mimeType.
     *
     * Note that IHE often issues URNs for formatCode codes, not all documents can be identified by
     * a URI.
     *
     * For FHIR content, .profile should indicate the structureDefinition profile canonical URI(s)
     * that the content complies with.
     */
    public var profile: List<Profile>? = null,
  ) : BackboneElement() {
    /**
     * An identifier of the document constraints, encoding, structure, and template that the
     * document conforms to beyond the base format indicated in the mimeType.
     */
    @Serializable(with = DocumentReferenceContentProfileSerializer::class)
    public class Profile(
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
      /** Code|uri|canonical. */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asCoding(): Coding? = this as? Coding

        public fun asUri(): Uri? = this as? Uri

        public fun asCanonical(): Canonical? = this as? Canonical

        public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

        public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Value

        public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Value

        public companion object {
          public fun from(
            CodingValue: com.google.fhir.model.r5.Coding?,
            uriValue: com.google.fhir.model.r5.Uri?,
            canonicalValue: com.google.fhir.model.r5.Canonical?,
          ): Value? {
            if (CodingValue != null) return Coding(CodingValue)
            if (uriValue != null) return Uri(uriValue)
            if (canonicalValue != null) return Canonical(canonicalValue)
            return null
          }
        }
      }
    }
  }

  /** The workflow/clinical status of the composition. */
  public enum class ReferredDocumentStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The existence of the composition is registered, but there is nothing yet available. */
    Registered(
      "registered",
      "http://hl7.org/fhir/composition-status",
      "Registered",
      "The existence of the composition is registered, but there is nothing yet available.",
    ),
    /**
     * This is a partial (e.g. initial, interim or preliminary) composition: data in the composition
     * may be incomplete or unverified.
     */
    Partial(
      "partial",
      "http://hl7.org/fhir/composition-status",
      "Partial",
      "This is a partial (e.g. initial, interim or preliminary) composition: data in the composition may be incomplete or unverified.",
    ),
    /** Verified early results are available, but not all results are final. */
    Preliminary(
      "preliminary",
      "http://hl7.org/fhir/composition-status",
      "Preliminary",
      "Verified early results are available, but not all results are final.",
    ),
    /**
     * This version of the composition is complete and verified by an appropriate person and no
     * further work is planned. Any subsequent updates would be on a new version of the composition.
     */
    Final(
      "final",
      "http://hl7.org/fhir/composition-status",
      "Final",
      "This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.",
    ),
    /**
     * The composition content or the referenced resources have been modified (edited or added to)
     * subsequent to being released as "final" and the composition is complete and verified by an
     * authorized person.
     */
    Amended(
      "amended",
      "http://hl7.org/fhir/composition-status",
      "Amended",
      "The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as \"final\" and the composition is complete and verified by an authorized person.",
    ),
    /**
     * Subsequent to being final, the composition content has been modified to correct an error in
     * the composition or referenced results.
     */
    Corrected(
      "corrected",
      "http://hl7.org/fhir/composition-status",
      "Corrected",
      "Subsequent to being final, the composition content has been modified to correct an error in the composition or referenced results.",
    ),
    /**
     * Subsequent to being final, the composition content has been modified by adding new content.
     * The existing content is unchanged.
     */
    Appended(
      "appended",
      "http://hl7.org/fhir/composition-status",
      "Appended",
      "Subsequent to being final, the composition content has been modified by adding new content. The existing content is unchanged.",
    ),
    /**
     * The composition is unavailable because the measurement was not started or not completed (also
     * sometimes called "aborted").
     */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/composition-status",
      "Cancelled",
      "The composition is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").",
    ),
    /**
     * The composition or document was originally created/issued in error, and this is an amendment
     * that marks that the entire series should not be considered as valid.
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/composition-status",
      "Entered in Error",
      "The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.",
    ),
    /** This composition has been withdrawn or superseded and should no longer be used. */
    Deprecated(
      "deprecated",
      "http://hl7.org/fhir/composition-status",
      "Deprecated",
      "This composition has been withdrawn or superseded and should no longer be used.",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this observation. Note: This concept is not to be used for "other" - one of the listed
     * statuses is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/composition-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ReferredDocumentStatus =
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
          "deprecated" -> Deprecated
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ReferredDocumentStatus")
        }
    }
  }
}
