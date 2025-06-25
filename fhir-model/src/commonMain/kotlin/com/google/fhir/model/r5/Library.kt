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

import com.google.fhir.model.r5.serializers.LibrarySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be
 * used to describe and expose existing knowledge assets such as logic libraries and information
 * model descriptions, as well as to describe a collection of knowledge assets.
 */
@Serializable(with = LibrarySerializer::class)
@SerialName("Library")
public data class Library(
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
   * An absolute URI that is used to identify this library when it is referenced in a specification,
   * model, design or an instance; also called its canonical identifier. This SHOULD be globally
   * unique and SHOULD be a literal address at which an authoritative instance of this library is
   * (or will be) published. This URL can be the target of a canonical reference. It SHALL remain
   * the same when the library is stored on different servers.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   *
   * The determination of when to create a new version of a resource (same url, new version) vs.
   * defining a new artifact is up to the author. Considerations for making this decision are found
   * in [Technical and Business Versions](resource.html#versions).
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the [meta.source](resource.html#meta) element to indicate where
   * the current master source of the resource can be found.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this library when it is represented in other
   * formats, or referenced in a specification, model, design or an instance. e.g. CMS or NQF
   * identifiers for a measure artifact. Note that at least one identifier is required for
   * non-experimental active artifacts.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this library outside of FHIR, where it is not possible to use the
   * logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the library when it is referenced in a
   * specification, model, design or instance. This is an arbitrary value managed by the library
   * author and is not expected to be globally unique. For example, it might be a timestamp (e.g.
   * yyyymmdd) if a managed version is not available. There is also no expectation that versions can
   * be placed in a lexicographical sequence. To provide a version consistent with the Decision
   * Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more
   * information on versioning knowledge assets, refer to the Decision Support Service
   * specification. Note that a version is required for non-experimental active artifacts.
   *
   * There may be different library instances that have the same identifier but different versions.
   * The version can be appended to the url in a reference to allow a reference to a particular
   * business version of the library with the format [url]|[version]. The version SHOULD NOT contain
   * a '#' - see [Business Version](resource.html#bv-format).
   */
  public var version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which is more current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 and a 0 if the version ordering can't be successfully be
   * determined.
   */
  public var versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the library. This name should be usable as an identifier
   * for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the library.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * An explanatory or alternate title for the library giving additional information about its
   * content.
   */
  public var subtitle: String? = null,
  /**
   * The status of this library. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of libraries that are appropriate for use vs. not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this library is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of librarys that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * Identifies the type of library such as a Logic Library, Model Definition, Asset Collection, or
   * Module Definition.
   */
  public var type: CodeableConcept? = null,
  /**
   * A code or group definition that describes the intended subject of the contents of the library.
   */
  public var subject: Subject? = null,
  /**
   * The date (and optionally time) when the library was last significantly changed. The date must
   * change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the library changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the library. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the library.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the library is
   * the organization or individual primarily responsible for the maintenance and upkeep of the
   * library. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the library. This item SHOULD be populated unless the information is available from
   * context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the library from a consumer's perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the library as conveyed in the 'text' field of the resource itself. This
   * item SHOULD be populated unless the information is available from context (e.g. the language of
   * the library is presumed to be the predominant language in the place the library was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate library instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the library is intended to be used.
   *
   * It may be possible for the library to be used in jurisdictions other than those for which it
   * was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this library is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the library. Instead, it provides traceability of
   * ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this library.
   */
  public var purpose: Markdown? = null,
  /** A detailed description of how the library is used from a clinical perspective. */
  public var usage: Markdown? = null,
  /**
   * A copyright statement relating to the library and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the library.
   *
   * The short copyright declaration (e.g. (c) '2015+ xyz organization' should be sent in the
   * copyrightLabel element.
   */
  public var copyright: Markdown? = null,
  /**
   * A short string (<50 characters), suitable for inclusion in a page footer that identifies the
   * copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All
   * rights reserved', 'Some rights reserved').
   *
   * The (c) symbol should NOT be included in this string. It will be added by software when
   * rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in
   * the more general 'copyright' element.
   */
  public var copyrightLabel: String? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the library content was or is planned to be in active use.
   *
   * The effective period for a library determines when the content is applicable for usage and is
   * independent of publication and review dates. For example, a library intended to be used for the
   * year 2016 might be published in 2015.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var effectivePeriod: Period? = null,
  /**
   * Descriptive topics related to the content of the library. Topics provide a high-level
   * categorization of the library that can be useful for filtering and searching.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'topic' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#topic and
   * useContext.valueCodeableConcept indicating the topic)
   */
  public var topic: List<CodeableConcept?>? = null,
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * content.
   */
  public var author: List<ContactDetail?>? = null,
  /** An individual or organization primarily responsible for internal coherence of the content. */
  public var editor: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be primarily responsible for review
   * of some aspect of the content.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var reviewer: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be responsible for officially
   * endorsing the content for use in some setting.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var endorser: List<ContactDetail?>? = null,
  /**
   * Related artifacts such as additional documentation, justification, or bibliographic references.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /** The parameter element defines parameters used by the library. */
  public var parameter: List<ParameterDefinition?>? = null,
  /**
   * Describes a set of data that must be provided in order to be able to successfully perform the
   * computations defined by the library.
   */
  public var dataRequirement: List<DataRequirement?>? = null,
  /**
   * The content of the library as an Attachment. The content may be a reference to a url, or may be
   * directly embedded as a base-64 string. Either way, the contentType of the attachment determines
   * how to interpret the content.
   */
  public var content: List<Attachment?>? = null,
) : DomainResource() {
  public sealed interface VersionAlgorithm {
    public fun asString(): String? = this as? String

    public fun asCoding(): Coding? = this as? Coding

    public data class String(public val `value`: com.google.fhir.model.r5.String) :
      VersionAlgorithm

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) :
      VersionAlgorithm

    public companion object {
      public fun from(
        stringValue: com.google.fhir.model.r5.String?,
        CodingValue: com.google.fhir.model.r5.Coding?,
      ): VersionAlgorithm? {
        if (stringValue != null) return String(stringValue)
        if (CodingValue != null) return Coding(CodingValue)
        return null
      }
    }
  }

  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Subject

    public companion object {
      public fun from(
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
      ): Subject? {
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }
}
