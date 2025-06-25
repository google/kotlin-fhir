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

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.NamingSystemSerializer
import com.google.fhir.model.r4b.serializers.NamingSystemUniqueIdSerializer
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
   * A natural language name identifying the naming system. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.The"symbolic name" for an OID would be
   * captured as an extension.
   */
  public var name: String? = null,
  /**
   * The status of this naming system. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of naming systems that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /** Indicates the purpose for the naming system - what kinds of things does it make unique? */
  public var kind: Enumeration<NamingSystemType>? = null,
  /**
   * The date (and optionally time) when the naming system was published. The date must change when
   * the business version changes and it must change if the status code changes. In addition, it
   * should change when the substantive content of the naming system changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the naming system. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the naming system.
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
   * This description can be used to capture details such as why the naming system was built,
   * comments about misuse, instructions for clinical use and interpretation, literature references,
   * examples from the paper world, etc. It is not a rendering of the naming system as conveyed in
   * the 'text' field of the resource itself. This item SHOULD be populated unless the information
   * is available from context (e.g. the language of the naming system is presumed to be the
   * predominant language in the place the naming system was created).
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
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
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
     * Identifies the unique identifier scheme used for this particular identifier.
     *
     * Different identifier types may be used in different types of communications (OIDs for v3,
     * URIs for FHIR, etc.). Other includes RUIDs from v3, standard v2 code name strings, etc.
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
     */
    public var period: Period? = null,
  ) : BackboneElement()

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
