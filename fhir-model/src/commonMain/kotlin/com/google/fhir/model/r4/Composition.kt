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

import com.google.fhir.model.r4.serializers.CompositionAttesterSerializer
import com.google.fhir.model.r4.serializers.CompositionEventSerializer
import com.google.fhir.model.r4.serializers.CompositionRelatesToSerializer
import com.google.fhir.model.r4.serializers.CompositionSectionSerializer
import com.google.fhir.model.r4.serializers.CompositionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A set of healthcare-related information that is assembled together into a single logical package
 * that provides a single coherent statement of meaning, establishes its own context and that has
 * clinical attestation with regard to who is making the statement. A Composition defines the
 * structure and narrative content necessary for a document. However, a Composition alone does not
 * constitute a document. Rather, the Composition must be the first entry in a Bundle where
 * Bundle.type=document, and any other resources referenced from Composition must be included as
 * subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 */
@Serializable(with = CompositionSerializer::class)
@SerialName("Composition")
public data class Composition(
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
   * A version-independent identifier for the Composition. This identifier stays constant as the
   * composition is changed over time.
   *
   * Similar to ClinicalDocument/setId in CDA. See discussion in resource definition for how these
   * relate.
   */
  public var identifier: Identifier? = null,
  /**
   * The workflow/clinical status of this composition. The status is a marker for the clinical
   * standing of the document.
   *
   * If a composition is marked as withdrawn, the compositions/documents in the series, or data from
   * the composition or document series, should never be displayed to a user without being clearly
   * marked as untrustworthy. The flag "entered-in-error" is why this element is labeled as a
   * modifier of other elements.
   *
   * Some reporting work flows require that the original narrative of a final document never be
   * altered; instead, only new narrative can be added. The composition resource has no explicit
   * status for explicitly noting whether this business rule is in effect. This would be handled by
   * an extension if required.
   */
  public var status: Enumeration<CompositionStatus>? = null,
  /**
   * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary,
   * Progress Note). This usually equates to the purpose of making the composition.
   *
   * For Composition type, LOINC is ubiquitous and strongly endorsed by HL7. Most implementation
   * guides will require a specific LOINC code, or use LOINC as an extensible binding.
   */
  public var type: CodeableConcept? = null,
  /**
   * A categorization for the type of the composition - helps for indexing and searching. This may
   * be implied by or derived from the code specified in the Composition Type.
   *
   * This is a metadata field from
   * [XDS/MHD](http://wiki.ihe.net/index.php?title=Mobile_access_to_Health_Documents_(MHD)).
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Who or what the composition is about. The composition can be about a person, (patient or
   * healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a
   * document about a herd of livestock, or a set of patients that share a common exposure).
   *
   * For clinical documents, this is usually the patient.
   */
  public var subject: Reference? = null,
  /** Describes the clinical encounter or type of care this documentation is associated with. */
  public var encounter: Reference? = null,
  /**
   * The composition editing time, when the composition was last logically changed by the author.
   *
   * The Last Modified Date on the composition may be after the date of the document was attested
   * without being changed.
   */
  public var date: DateTime? = null,
  /**
   * Identifies who is responsible for the information in the composition, not necessarily who typed
   * it in.
   */
  public var author: List<Reference?>? = null,
  /**
   * Official human-readable label for the composition.
   *
   * For many compositions, the title is the same as the text or a display name of Composition.type
   * (e.g. a "consultation" or "progress note"). Note that CDA does not make title mandatory, but
   * there are no known cases where it is useful for title to be omitted, so it is mandatory here.
   * Feedback on this requirement is welcome during the trial use period.
   */
  public var title: String? = null,
  /**
   * The code specifying the level of confidentiality of the Composition.
   *
   * The exact use of this element, and enforcement and issues related to highly sensitive documents
   * are out of scope for the base specification, and delegated to implementation profiles (see
   * security section). This element is labeled as a modifier because highly confidential documents
   * must not be treated as if they are not.
   */
  public var confidentiality: Enumeration<DocumentConfidentiality>? = null,
  /**
   * A participant who has attested to the accuracy of the composition/document.
   *
   * Only list each attester once.
   */
  public var attester: List<Attester>? = null,
  /**
   * Identifies the organization or group who is responsible for ongoing maintenance of and access
   * to the composition/document information.
   *
   * This is useful when documents are derived from a composition - provides guidance for how to get
   * the latest version of the document. This is optional because this is sometimes not known by the
   * authoring system, and can be inferred by context. However, it is important that this
   * information be known when working with a derived document, so providing a custodian is
   * encouraged.
   */
  public var custodian: Reference? = null,
  /**
   * Relationships that this composition has with other compositions or documents that already
   * exist.
   *
   * A document is a version specific composition.
   */
  public var relatesTo: List<RelatesTo>? = null,
  /**
   * The clinical service, such as a colonoscopy or an appendectomy, being documented.
   *
   * The event needs to be consistent with the type element, though can provide further information
   * if desired.
   */
  public var event: List<Event>? = null,
  /** The root of the sections that make up the composition. */
  public var section: List<Section>? = null,
) : DomainResource() {
  /** A participant who has attested to the accuracy of the composition/document. */
  @Serializable(with = CompositionAttesterSerializer::class)
  public class Attester(
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
    /** The type of attestation the authenticator offers. */
    public var mode: Enumeration<CompositionAttestationMode>? = null,
    /** When the composition was attested by the party. */
    public var time: DateTime? = null,
    /** Who attested the composition in the specified way. */
    public var party: Reference? = null,
  ) : BackboneElement()

  /**
   * Relationships that this composition has with other compositions or documents that already
   * exist.
   */
  @Serializable(with = CompositionRelatesToSerializer::class)
  public class RelatesTo(
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
     * The type of relationship that this composition has with anther composition or document.
     *
     * If this document appends another document, then the document cannot be fully understood
     * without also accessing the referenced document.
     */
    public var code: Enumeration<DocumentRelationshipType>? = null,
    /** The target composition/document of this relationship. */
    public var target: Target? = null,
  ) : BackboneElement() {
    public sealed interface Target {
      public fun asIdentifier(): Identifier? = this as? Identifier

      public fun asReference(): Reference? = this as? Reference

      public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) :
        Target

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Target

      public companion object {
        public fun from(
          IdentifierValue: com.google.fhir.model.r4.Identifier?,
          ReferenceValue: com.google.fhir.model.r4.Reference?,
        ): Target? {
          if (IdentifierValue != null) return Identifier(IdentifierValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** The clinical service, such as a colonoscopy or an appendectomy, being documented. */
  @Serializable(with = CompositionEventSerializer::class)
  public class Event(
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
     * This list of codes represents the main clinical acts, such as a colonoscopy or an
     * appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as
     * a "History and Physical Report" in which the procedure being documented is necessarily a
     * "History and Physical" act.
     *
     * An event can further specialize the act inherent in the typeCode, such as where it is simply
     * "Procedure Report" and the procedure was a "colonoscopy". If one or more eventCodes are
     * included, they SHALL NOT conflict with the values inherent in the classCode,
     * practiceSettingCode or typeCode, as such a conflict would create an ambiguous situation. This
     * short list of codes is provided to be used as key words for certain types of queries.
     */
    public var code: List<CodeableConcept?>? = null,
    /**
     * The period of time covered by the documentation. There is no assertion that the documentation
     * is a complete representation for this period, only that it documents events during this time.
     */
    public var period: Period? = null,
    /**
     * The description and/or reference of the event(s) being documented. For example, this could be
     * used to document such a colonoscopy or an appendectomy.
     */
    public var detail: List<Reference?>? = null,
  ) : BackboneElement()

  /** The root of the sections that make up the composition. */
  @Serializable(with = CompositionSectionSerializer::class)
  public class Section(
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
     * The label for this particular section. This will be part of the rendered content for the
     * document, and is often used to build a table of contents.
     *
     * The title identifies the section for a human reader. The title must be consistent with the
     * narrative of the resource that is the target of the section.content reference. Generally,
     * sections SHOULD have titles, but in some documents, it is unnecessary or inappropriate.
     * Typically, this is where a section has subsections that have their own adequately
     * distinguishing title, or documents that only have a single section. Most Implementation
     * Guides will make section title to be a required element.
     */
    public var title: String? = null,
    /**
     * A code identifying the kind of content contained within the section. This must be consistent
     * with the section title.
     *
     * The code identifies the section for an automated processor of the document. This is
     * particularly relevant when using profiles to control the structure of the document.
     *
     * If the section has content (instead of sub-sections), the section.code does not change the
     * meaning or interpretation of the resource that is the content of the section in the comments
     * for the section.code.
     */
    public var code: CodeableConcept? = null,
    /**
     * Identifies who is responsible for the information in this section, not necessarily who typed
     * it in.
     */
    public var author: List<Reference?>? = null,
    /**
     * The actual focus of the section when it is not the subject of the composition, but instead
     * represents something or someone associated with the subject such as (for a patient subject) a
     * spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus
     * of the parent section, or, for a section in the Composition itself, the subject of the
     * composition. Sections with a focus SHALL only include resources where the logical subject
     * (patient, subject, focus, etc.) matches the section focus, or the resources have no logical
     * subject (few resources).
     *
     * Typically, sections in a doument are about the subject of the document, whether that is a
     * patient, or group of patients, location, or device, or whatever. For some kind of documents,
     * some sections actually contain data about related entities. Typical examples are a section in
     * a newborn discharge summary concerning the mother, or family history documents, with a
     * section about each family member, though there are many other examples.
     */
    public var focus: Reference? = null,
    /**
     * A human-readable narrative that contains the attested content of the section, used to
     * represent the content of the resource to a human. The narrative need not encode all the
     * structured data, but is required to contain sufficient detail to make it "clinically safe"
     * for a human to just read the narrative.
     *
     * Document profiles may define what content should be represented in the narrative to ensure
     * clinical safety.
     */
    public var text: Narrative? = null,
    /**
     * How the entry list was prepared - whether it is a working list that is suitable for being
     * maintained on an ongoing basis, or if it represents a snapshot of a list of items from
     * another source, or whether it is a prepared list where items may be marked as added, modified
     * or deleted.
     *
     * This element is labeled as a modifier because a change list must not be misunderstood as a
     * complete list.
     */
    public var mode: Enumeration<SectionMode>? = null,
    /**
     * Specifies the order applied to the items in the section entries.
     *
     * Applications SHOULD render ordered lists in the order provided, but MAY allow users to
     * re-order based on their own preferences as well. If there is no order specified, the order is
     * unknown, though there may still be some order.
     */
    public var orderedBy: CodeableConcept? = null,
    /**
     * A reference to the actual resource from which the narrative in the section is derived.
     *
     * If there are no entries in the list, an emptyReason SHOULD be provided.
     */
    public var entry: List<Reference?>? = null,
    /**
     * If the section is empty, why the list is empty. An empty section typically has some text
     * explaining the empty reason.
     *
     * The various reasons for an empty section make a significant interpretation to its
     * interpretation. Note that this code is for use when the entire section content has been
     * suppressed, and not for when individual items are omitted - implementers may consider using a
     * text note or a flag on an entry in these cases.
     */
    public var emptyReason: CodeableConcept? = null,
    /**
     * A nested sub-section within this section.
     *
     * Nested sections are primarily used to help human readers navigate to particular portions of
     * the document.
     */
    public var section: List<Section?>? = null,
  ) : BackboneElement()

  /** The way in which a person authenticated a composition. */
  public enum class CompositionAttestationMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The person authenticated the content in their personal capacity. */
    Personal(
      "personal",
      "http://hl7.org/fhir/composition-attestation-mode",
      "Personal",
      "The person authenticated the content in their personal capacity.",
    ),
    /** The person authenticated the content in their professional capacity. */
    Professional(
      "professional",
      "http://hl7.org/fhir/composition-attestation-mode",
      "Professional",
      "The person authenticated the content in their professional capacity.",
    ),
    /** The person authenticated the content and accepted legal responsibility for its content. */
    Legal(
      "legal",
      "http://hl7.org/fhir/composition-attestation-mode",
      "Legal",
      "The person authenticated the content and accepted legal responsibility for its content.",
    ),
    /**
     * The organization authenticated the content as consistent with their policies and procedures.
     */
    Official(
      "official",
      "http://hl7.org/fhir/composition-attestation-mode",
      "Official",
      "The organization authenticated the content as consistent with their policies and procedures.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CompositionAttestationMode =
        when (code) {
          "personal" -> Personal
          "professional" -> Professional
          "legal" -> Legal
          "official" -> Official
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CompositionAttestationMode")
        }
    }
  }

  /** The type of relationship between documents. */
  public enum class DocumentRelationshipType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** This document logically replaces or supersedes the target document. */
    Replaces(
      "replaces",
      "http://hl7.org/fhir/document-relationship-type",
      "Replaces",
      "This document logically replaces or supersedes the target document.",
    ),
    /**
     * This document was generated by transforming the target document (e.g. format or language
     * conversion).
     */
    Transforms(
      "transforms",
      "http://hl7.org/fhir/document-relationship-type",
      "Transforms",
      "This document was generated by transforming the target document (e.g. format or language conversion).",
    ),
    /** This document is a signature of the target document. */
    Signs(
      "signs",
      "http://hl7.org/fhir/document-relationship-type",
      "Signs",
      "This document is a signature of the target document.",
    ),
    /** This document adds additional information to the target document. */
    Appends(
      "appends",
      "http://hl7.org/fhir/document-relationship-type",
      "Appends",
      "This document adds additional information to the target document.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DocumentRelationshipType =
        when (code) {
          "replaces" -> Replaces
          "transforms" -> Transforms
          "signs" -> Signs
          "appends" -> Appends
          else ->
            throw IllegalArgumentException("Unknown code $code for enum DocumentRelationshipType")
        }
    }
  }

  /** The processing mode that applies to this list. */
  public enum class SectionMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the
     * real world list it is tracking changes.
     */
    Working(
      "working",
      "http://hl7.org/fhir/list-mode",
      "Working List",
      "This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes.",
    ),
    /** This list was prepared as a snapshot. It should not be assumed to be current. */
    Snapshot(
      "snapshot",
      "http://hl7.org/fhir/list-mode",
      "Snapshot List",
      "This list was prepared as a snapshot. It should not be assumed to be current.",
    ),
    /**
     * A point-in-time list that shows what changes have been made or recommended. E.g. a discharge
     * medication list showing what was added and removed during an encounter.
     */
    Changes(
      "changes",
      "http://hl7.org/fhir/list-mode",
      "Change List",
      "A point-in-time list that shows what changes have been made or recommended.  E.g. a discharge medication list showing what was added and removed during an encounter.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SectionMode =
        when (code) {
          "working" -> Working
          "snapshot" -> Snapshot
          "changes" -> Changes
          else -> throw IllegalArgumentException("Unknown code $code for enum SectionMode")
        }
    }
  }

  /** The workflow/clinical status of the composition. */
  public enum class CompositionStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * This is a preliminary composition or document (also known as initial or interim). The content
     * may be incomplete or unverified.
     */
    Preliminary(
      "preliminary",
      "http://hl7.org/fhir/composition-status",
      "Preliminary",
      "This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.",
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
     * The composition or document was originally created/issued in error, and this is an amendment
     * that marks that the entire series should not be considered as valid.
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/composition-status",
      "Entered in Error",
      "The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CompositionStatus =
        when (code) {
          "preliminary" -> Preliminary
          "final" -> Final
          "amended" -> Amended
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum CompositionStatus")
        }
    }
  }

  /**
   * Set of codes used to value Act.Confidentiality and Role.Confidentiality attribute in accordance
   * with the definition for concept domain "Confidentiality".
   */
  public enum class DocumentConfidentiality(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Definition: Privacy metadata indicating that the information has been de-identified, and
     * there are mitigating circumstances that prevent re-identification, which minimize risk of
     * harm from unauthorized disclosure. The information requires protection to maintain low
     * sensitivity.
     *
     *                            Examples: Includes anonymized, pseudonymized, or non-personally identifiable information such as HIPAA limited data sets.
     *                            Map: No clear map to ISO 13606-4 Sensitivity Level (1) Care Management:   RECORD_COMPONENTs that might need to be accessed by a wide range of administrative staff to manage the subject of care's access to health services.
     *                            Usage Note: This metadata indicates the receiver may have an obligation to comply with a data use agreement.
     */
    L(
      "L",
      "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
      "low",
      """
    |Definition: Privacy metadata indicating that the information has been de-identified, and there are mitigating circumstances that prevent re-identification, which minimize risk of harm from unauthorized disclosure.  The information requires protection to maintain low sensitivity.
    |
    |                        
    |                           Examples: Includes anonymized, pseudonymized, or non-personally identifiable information such as HIPAA limited data sets.
    |
    |                        
    |                           Map: No clear map to ISO 13606-4 Sensitivity Level (1) Care Management:   RECORD_COMPONENTs that might need to be accessed by a wide range of administrative staff to manage the subject of care's access to health services.
    |
    |                        
    |                           Usage Note: This metadata indicates the receiver may have an obligation to comply with a data use agreement.
    """
        .trimMargin(),
    ),
    /**
     * Definition: Privacy metadata indicating moderately sensitive information, which presents
     * moderate risk of harm if disclosed without authorization.
     *
     *                            Examples: Includes allergies of non-sensitive nature used inform food service; health information a patient authorizes to be used for marketing, released to a bank for a health credit card or savings account; or information in personal health record systems that are not governed under health privacy laws.
     *                            Map: Partial Map to ISO 13606-4 Sensitivity Level (2) Clinical Management:  Less sensitive RECORD_COMPONENTs that might need to be accessed by a wider range of personnel not all of whom are actively caring for the patient (e.g. radiology staff).
     *                            Usage Note: This metadata indicates that the receiver may be obligated to comply with the receiver's terms of use or privacy policies.
     */
    M(
      "M",
      "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
      "moderate",
      """
    |Definition: Privacy metadata indicating moderately sensitive information, which presents moderate risk of harm if disclosed without authorization.
    |
    |                        
    |                           Examples: Includes allergies of non-sensitive nature used inform food service; health information a patient authorizes to be used for marketing, released to a bank for a health credit card or savings account; or information in personal health record systems that are not governed under health privacy laws.
    |
    |                        
    |                           Map: Partial Map to ISO 13606-4 Sensitivity Level (2) Clinical Management:  Less sensitive RECORD_COMPONENTs that might need to be accessed by a wider range of personnel not all of whom are actively caring for the patient (e.g. radiology staff).
    |
    |                        
    |                           Usage Note: This metadata indicates that the receiver may be obligated to comply with the receiver's terms of use or privacy policies.
    """
        .trimMargin(),
    ),
    /**
     * Definition: Privacy metadata indicating that the information is typical, non-stigmatizing
     * health information, which presents typical risk of harm if disclosed without authorization.
     *
     *                            Examples: In the US, this includes what HIPAA identifies as the minimum necessary protected health information (PHI) given a covered purpose of use (treatment, payment, or operations).  Includes typical, non-stigmatizing health information disclosed in an application for health, workers compensation, disability, or life insurance.
     *                            Map: Partial Map to ISO 13606-4 Sensitivity Level (3) Clinical Care:   Default for normal clinical care access (i.e. most clinical staff directly caring for the patient should be able to access nearly all of the EHR).   Maps to normal confidentiality for treatment information but not to ancillary care, payment and operations.
     *                            Usage Note: This metadata indicates that the receiver may be obligated to comply with applicable jurisdictional privacy law or disclosure authorization.
     */
    N(
      "N",
      "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
      "normal",
      """
    |Definition: Privacy metadata indicating that the information is typical, non-stigmatizing health information, which presents typical risk of harm if disclosed without authorization.
    |
    |                        
    |                           Examples: In the US, this includes what HIPAA identifies as the minimum necessary protected health information (PHI) given a covered purpose of use (treatment, payment, or operations).  Includes typical, non-stigmatizing health information disclosed in an application for health, workers compensation, disability, or life insurance.
    |
    |                        
    |                           Map: Partial Map to ISO 13606-4 Sensitivity Level (3) Clinical Care:   Default for normal clinical care access (i.e. most clinical staff directly caring for the patient should be able to access nearly all of the EHR).   Maps to normal confidentiality for treatment information but not to ancillary care, payment and operations.
    |
    |                        
    |                           Usage Note: This metadata indicates that the receiver may be obligated to comply with applicable jurisdictional privacy law or disclosure authorization.
    """
        .trimMargin(),
    ),
    /**
     * Privacy metadata indicating highly sensitive, potentially stigmatizing information, which
     * presents a high risk to the information subject if disclosed without authorization. May be
     * pre-empted by jurisdictional law, e.g., for public health reporting or emergency treatment.
     *
     *                            Examples: Includes information that is additionally protected such as sensitive conditions mental health, HIV, substance abuse, domestic violence, child abuse, genetic disease, and reproductive health; or sensitive demographic information such as a patient's standing as an employee or a celebrity. May be used to indicate proprietary or classified information that is not related to an individual, e.g., secret ingredients in a therapeutic substance; or the name of a manufacturer.
     *                            Map: Partial Map to ISO 13606-4 Sensitivity Level (3) Clinical Care: Default for normal clinical care access (i.e. most clinical staff directly caring for the patient should be able to access nearly all of the EHR). Maps to normal confidentiality for treatment information but not to ancillary care, payment and operations..
     *                            Usage Note: This metadata indicates that the receiver may be obligated to comply with applicable, prevailing (default) jurisdictional privacy law or disclosure authorization..
     */
    R(
      "R",
      "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
      "restricted",
      """
    |Privacy metadata indicating highly sensitive, potentially stigmatizing information, which presents a high risk to the information subject if disclosed without authorization. May be pre-empted by jurisdictional law, e.g., for public health reporting or emergency treatment.
    |
    |                        
    |                           Examples: Includes information that is additionally protected such as sensitive conditions mental health, HIV, substance abuse, domestic violence, child abuse, genetic disease, and reproductive health; or sensitive demographic information such as a patient's standing as an employee or a celebrity. May be used to indicate proprietary or classified information that is not related to an individual, e.g., secret ingredients in a therapeutic substance; or the name of a manufacturer.
    |
    |                        
    |                           Map: Partial Map to ISO 13606-4 Sensitivity Level (3) Clinical Care: Default for normal clinical care access (i.e. most clinical staff directly caring for the patient should be able to access nearly all of the EHR). Maps to normal confidentiality for treatment information but not to ancillary care, payment and operations..
    |
    |                        
    |                           Usage Note: This metadata indicates that the receiver may be obligated to comply with applicable, prevailing (default) jurisdictional privacy law or disclosure authorization..
    """
        .trimMargin(),
    ),
    /**
     * Definition: Privacy metadata indicating that the information is not classified as sensitive.
     *
     *                            Examples: Includes publicly available information, e.g., business name, phone, email or physical address.
     *                            Usage Note: This metadata indicates that the receiver has no obligation to consider additional policies when making access control decisions.   Note that in some jurisdictions, personally identifiable information must be protected as confidential, so it would not be appropriate to assign a confidentiality code of "unrestricted"  to that information even if it is publicly available.
     */
    U(
      "U",
      "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
      "unrestricted",
      """
    |Definition: Privacy metadata indicating that the information is not classified as sensitive.
    |
    |                        
    |                           Examples: Includes publicly available information, e.g., business name, phone, email or physical address.
    |
    |                        
    |                           Usage Note: This metadata indicates that the receiver has no obligation to consider additional policies when making access control decisions.   Note that in some jurisdictions, personally identifiable information must be protected as confidential, so it would not be appropriate to assign a confidentiality code of "unrestricted"  to that information even if it is publicly available.
    """
        .trimMargin(),
    ),
    /**
     * . Privacy metadata indicating that the information is extremely sensitive and likely
     * stigmatizing health information that presents a very high risk if disclosed without
     * authorization. This information must be kept in the highest confidence.
     *
     *                            Examples:  Includes information about a victim of abuse, patient requested information sensitivity, and taboo subjects relating to health status that must be discussed with the patient by an attending provider before sharing with the patient.  May also include information held under â€œlegal lockâ€? or attorney-client privilege
     *                            Map:  This metadata indicates that the receiver may not disclose this information except as directed by the information custodian, who may be the information subject.
     *                            Usage Note:  This metadata indicates that the receiver may not disclose this information except as directed by the information custodian, who may be the information subject.
     */
    V(
      "V",
      "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
      "very restricted",
      """
    |. Privacy metadata indicating that the information is extremely sensitive and likely stigmatizing health information that presents a very high risk if disclosed without authorization.  This information must be kept in the highest confidence.  
    |
    |                        
    |                           Examples:  Includes information about a victim of abuse, patient requested information sensitivity, and taboo subjects relating to health status that must be discussed with the patient by an attending provider before sharing with the patient.  May also include information held under â€œlegal lockâ€? or attorney-client privilege
    |
    |                        
    |                           Map:  This metadata indicates that the receiver may not disclose this information except as directed by the information custodian, who may be the information subject.
    |
    |                        
    |                           Usage Note:  This metadata indicates that the receiver may not disclose this information except as directed by the information custodian, who may be the information subject.
    """
        .trimMargin(),
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DocumentConfidentiality =
        when (code) {
          "L" -> L
          "M" -> M
          "N" -> N
          "R" -> R
          "U" -> U
          "V" -> V
          else ->
            throw IllegalArgumentException("Unknown code $code for enum DocumentConfidentiality")
        }
    }
  }
}
