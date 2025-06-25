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

import com.google.fhir.model.r5.serializers.NamingSystemSerializer
import com.google.fhir.model.r5.serializers.NamingSystemUniqueIdSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A curated namespace that issues unique symbols within that namespace for the identification of
 * concepts, people, devices, etc. Represents a "System" used within the Identifier and Coding data
 * types.
 */
@Serializable(with = NamingSystemSerializer::class)
@SerialName("NamingSystem")
public data class NamingSystem(
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
   * An absolute URI that is used to identify this naming system when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * naming system is (or will be) published. This URL can be the target of a canonical reference.
   * It SHALL remain the same when the naming system is stored on different servers.
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
   * A formal identifier that is used to identify this naming system when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this naming system outside of FHIR, where it is not possible to use
   * the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the naming system when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the naming
   * system author and is not expected to be globally unique. For example, it might be a timestamp
   * (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that
   * versions can be placed in a lexicographical sequence.
   *
   * There may be different naming system instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the naming system with the format [url]|[version]. The version
   * SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
   */
  public var version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which NamingSystem is more
   * current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 and a 0 if the version ordering can't be successfully be
   * determined.
   */
  public var versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the naming system. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.The"symbolic name" for an OID would be
   * captured as an extension.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the naming system.
   *
   * This title does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this naming system. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of naming systems that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /** Indicates the purpose for the naming system - what kinds of things does it make unique? */
  public var kind: Enumeration<NamingSystemType>? = null,
  /**
   * A Boolean value to indicate that this naming system is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of naming systems that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the naming system was last significantly changed. The date
   * must change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the naming system changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the naming system. Additional specific dates may be added
   * as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the naming system.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the naming
   * system is the organization or individual primarily responsible for the maintenance and upkeep
   * of the naming system. This is not necessarily the same individual or organization that
   * developed and initially authored the content. The publisher is the primary point of contact for
   * questions or issues with the naming system. This item SHOULD be populated unless the
   * information is available from context.
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
   * The name of the organization that is responsible for issuing identifiers or codes for this
   * namespace and ensuring their non-collision.
   *
   * This is the primary organization. Responsibility for some aspects of a namespace may be
   * delegated.
   */
  public var responsible: String? = null,
  /**
   * Categorizes a naming system for easier search by grouping related naming systems.
   *
   * This will most commonly be used for identifier namespaces, but categories could potentially be
   * useful for code systems and authorities as well.
   */
  public var type: CodeableConcept? = null,
  /**
   * A free text natural language description of the naming system from a consumer's perspective.
   * Details about what the namespace identifies including scope, granularity, version labeling,
   * etc.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the naming system as conveyed in the 'text' field of the resource itself.
   * This item SHOULD be populated unless the information is available from context (e.g. the
   * language of the naming system is presumed to be the predominant language in the place the
   * naming system was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate naming system instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the naming system is intended to be used.
   *
   * It may be possible for the naming system to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this naming system is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the code system. Instead, it provides traceability
   * of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this code system.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the naming system and/or its contents. Copyright statements
   * are generally legal restrictions on the use and publishing of the naming system.
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
   * The period during which the NamingSystem content was or is planned to be in active use.
   *
   * The effective period for a NamingSystem determines when the content is applicable for usage and
   * is independent of publication and review dates. For example, a NamingSystem intended to be used
   * for the year 2016 might be published in 2015.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var effectivePeriod: Period? = null,
  /**
   * Descriptions related to the content of the NamingSystem. Topics provide a high-level
   * categorization as well as keywords for the NamingSystem that can be useful for filtering and
   * searching.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'topic' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#topic and
   * useContext.valueCodeableConcept indicating the topic)
   */
  public var topic: List<CodeableConcept?>? = null,
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * NamingSystem.
   */
  public var author: List<ContactDetail?>? = null,
  /**
   * An individual or organization primarily responsible for internal coherence of the NamingSystem.
   */
  public var editor: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be primarily responsible for review
   * of some aspect of the NamingSystem.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var reviewer: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be responsible for officially
   * endorsing the NamingSystem for use in some setting.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var endorser: List<ContactDetail?>? = null,
  /**
   * Related artifacts such as additional documentation, justification, dependencies, bibliographic
   * references, and predecessor and successor artifacts.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /**
   * Provides guidance on the use of the namespace, including the handling of formatting characters,
   * use of upper vs. lower case, etc.
   */
  public var usage: String? = null,
  /**
   * Indicates how the system may be identified when referenced in electronic exchange.
   *
   * Multiple identifiers may exist, either due to duplicate registration, regional rules, needs of
   * different communication technologies, etc.
   */
  public var uniqueId: List<UniqueId>? = null,
) : DomainResource() {
  /** Indicates how the system may be identified when referenced in electronic exchange. */
  @Serializable(with = NamingSystemUniqueIdSerializer::class)
  public class UniqueId(
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
     * Identifies the unique identifier scheme used for this particular identifier.
     *
     * Different identifier types may be used in different types of communications (OIDs for v3,
     * URIs for FHIR, etc.). Other includes RUIDs from v3, standard v2 code name strings, etc.
     * Preferred identifiers for the same identifier type SHOULD NOT overlap by period.
     */
    public var type: Enumeration<NamingSystemIdentifierType>? = null,
    /**
     * The string that should be sent over the wire to identify the code system or identifier
     * system.
     *
     * If the value is a URI intended for use as FHIR system identifier, the URI should not contain
     * "\" or "?" or "," since this makes escaping very difficult.
     */
    public var `value`: String? = null,
    /** Indicates whether this identifier is the "preferred" identifier of this type. */
    public var preferred: Boolean? = null,
    /**
     * Notes about the past or intended usage of this identifier.
     *
     * e.g. "must be used in Germany" or "was initially published in error with this value".
     */
    public var comment: String? = null,
    /**
     * Identifies the period of time over which this identifier is considered appropriate to refer
     * to the naming system. Outside of this window, the identifier might be non-deterministic.
     *
     * Within a registry, a given identifier should only be "active" for a single namespace at a
     * time. (Ideally, an identifier should only ever be associated with a single namespace across
     * all time).
     *
     * The nuance of identifier deprecation is not represented with a separate element. When a
     * determination is made that an identifier should not be used, the validity period end date is
     * updated with the date the identifier is deemed to be deprecated. The identifier should no
     * longer be used once the period end date is reached.
     */
    public var period: Period? = null,
    /**
     * Indicates whether this identifier ie endorsed by the official owner of the associated naming
     * system.
     */
    public var authoritative: Boolean? = null,
  ) : BackboneElement()

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

  /** Identifies the style of unique identifier used to identify a namespace. */
  public enum class NamingSystemIdentifierType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** An ISO object identifier; e.g. 1.2.3.4.5. */
    Oid(
      "oid",
      "http://hl7.org/fhir/namingsystem-identifier-type",
      "OID",
      "An ISO object identifier; e.g. 1.2.3.4.5.",
    ),
    /** A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11. */
    Uuid(
      "uuid",
      "http://hl7.org/fhir/namingsystem-identifier-type",
      "UUID",
      "A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.",
    ),
    /**
     * A uniform resource identifier (ideally a URL - uniform resource locator); e.g.
     * http://unitsofmeasure.org.
     */
    Uri(
      "uri",
      "http://hl7.org/fhir/namingsystem-identifier-type",
      "URI",
      "A uniform resource identifier (ideally a URL - uniform resource locator); e.g. http://unitsofmeasure.org.",
    ),
    /**
     * An IRI string that can be prepended to the code to obtain a concept IRI for RDF applications.
     * This should be a valid, absolute IRI as defined in RFC 3987. See rdf.html#iri-stem for
     * details on how this value may be used.
     */
    Iri_Stem(
      "iri-stem",
      "http://hl7.org/fhir/namingsystem-identifier-type",
      "IRI stem",
      "An IRI string that can be prepended to the code to obtain a concept IRI for RDF applications. This should be a valid, absolute IRI as defined in RFC 3987. See rdf.html#iri-stem for details on how this value may be used.",
    ),
    /**
     * A short string published by HL7 for use in the V2 family of standsrds to idenfify a code
     * system in the V12 coded data types CWE, CNE, and CF. The code values are also published by
     * HL7 at http://www.hl7.org/Special/committees/vocab/table_0396/index.cfm
     */
    V2csmnemonic(
      "v2csmnemonic",
      "http://hl7.org/fhir/namingsystem-identifier-type",
      "V2CSMNemonic",
      "A short string published by HL7 for use in the V2 family of standsrds to idenfify a code system in the V12 coded data types CWE, CNE, and CF. The code values are also published by HL7 at http://www.hl7.org/Special/committees/vocab/table_0396/index.cfm",
    ),
    /**
     * Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for LOINC.
     */
    Other(
      "other",
      "http://hl7.org/fhir/namingsystem-identifier-type",
      "Other",
      "Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for LOINC.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): NamingSystemIdentifierType =
        when (code) {
          "oid" -> Oid
          "uuid" -> Uuid
          "uri" -> Uri
          "iri-stem" -> Iri_Stem
          "v2csmnemonic" -> V2csmnemonic
          "other" -> Other
          else ->
            throw IllegalArgumentException("Unknown code $code for enum NamingSystemIdentifierType")
        }
    }
  }

  /** Identifies the purpose of the naming system. */
  public enum class NamingSystemType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The naming system is used to define concepts and symbols to represent those concepts; e.g.
     * UCUM, LOINC, NDC code, local lab codes, etc.
     */
    Codesystem(
      "codesystem",
      "http://hl7.org/fhir/namingsystem-type",
      "Code System",
      "The naming system is used to define concepts and symbols to represent those concepts; e.g. UCUM, LOINC, NDC code, local lab codes, etc.",
    ),
    /**
     * The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).
     */
    Identifier(
      "identifier",
      "http://hl7.org/fhir/namingsystem-type",
      "Identifier",
      "The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).",
    ),
    /** The naming system is used as the root for other identifiers and naming systems. */
    Root(
      "root",
      "http://hl7.org/fhir/namingsystem-type",
      "Root",
      "The naming system is used as the root for other identifiers and naming systems.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): NamingSystemType =
        when (code) {
          "codesystem" -> Codesystem
          "identifier" -> Identifier
          "root" -> Root
          else -> throw IllegalArgumentException("Unknown code $code for enum NamingSystemType")
        }
    }
  }
}
