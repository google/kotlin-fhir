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

import com.google.fhir.model.r5.serializers.SearchParameterComponentSerializer
import com.google.fhir.model.r5.serializers.SearchParameterSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A search parameter that defines a named search item that can be used to search/filter on a
 * resource.
 */
@Serializable(with = SearchParameterSerializer::class)
@SerialName("SearchParameter")
public data class SearchParameter(
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
   * An absolute URI that is used to identify this search parameter when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * search parameter is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the search parameter is stored on different servers.
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
   * A formal identifier that is used to identify this search parameter when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the search parameter when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the search parameter author and is not expected to be globally unique. For example, it might be
   * a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different search parameter instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the search parameter with the format [url]|[version]. The
   * version SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
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
   * A natural language name identifying the search parameter. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the search parameter.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * Where this search parameter is originally defined. If a derivedFrom is provided, then the
   * details in the search parameter must be consistent with the definition from which it is
   * defined. i.e. the parameter should have the same meaning, and (usually) the functionality
   * should be a proper subset of the underlying search parameter.
   *
   * The intent of this is that a server can designate that it provides support for a search
   * parameter defined in the specification itself (e.g.
   * [`value-quantity`](http://hl7.org/fhir/SearchParameter/Observation-value-quantity), but detail
   * how it is supported by the server.
   */
  public var derivedFrom: Canonical? = null,
  /**
   * The status of this search parameter. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of search parameters that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this search parameter is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of search parameters that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the search parameter was last significantly changed. The
   * date must change when the business version changes and it must change if the status code
   * changes. In addition, it should change when the substantive content of the search parameter
   * changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the search parameter. Additional specific dates may be
   * added as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual tresponsible for the release and ongoing maintenance
   * of the search parameter.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the search
   * parameter is the organization or individual primarily responsible for the maintenance and
   * upkeep of the search parameter. This is not necessarily the same individual or organization
   * that developed and initially authored the content. The publisher is the primary point of
   * contact for questions or issues with the search parameter. This item SHOULD be populated unless
   * the information is available from context.
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
   * And how it used.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the search parameter as conveyed in the 'text' field of the resource
   * itself. This item SHOULD be populated unless the information is available from context (e.g.
   * the language of the search parameter is presumed to be the predominant language in the place
   * the search parameter was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate search parameter instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the search parameter is intended to be used.
   *
   * It may be possible for the search parameter to be used in jurisdictions other than those for
   * which it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this search parameter is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the search parameter. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * search parameter.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the search parameter and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the search parameter.
   *
   * ...
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
   * The label that is recommended to be used in the URL or the parameter name in a parameters
   * resource for this search parameter. In some cases, servers may need to use a different
   * CapabilityStatement searchParam.name to differentiate between multiple SearchParameters that
   * happen to have the same code.
   *
   * For maximum compatibility, use only lowercase ASCII characters. Note that HL7 will never define
   * multiple search parameters with the same code.
   */
  public var code: Code? = null,
  /**
   * The base resource type(s) that this search parameter can be used against.
   *
   * A search parameter must always apply to at least one resource type. When search parameters
   * apply to more than one resource type, they can be used against any of the listed resource
   * types, or in a cross-type search (see [Cross Resource Search](http.html#xres-search)).
   */
  public var base: List<Code?>? = null,
  /** The type of value that a search parameter may contain, and how the content is interpreted. */
  public var type: Enumeration<SearchParamType>? = null,
  /**
   * A FHIRPath expression that returns a set of elements for the search parameter.
   *
   * Note that the elements returned by the expression are sometimes complex elements where logic is
   * required to determine quite how to handle them; e.g. CodeableConcepts may contain text and/or
   * multiple codings, where the codings themselves contain a code and a system. For composite
   * search parameters, the outcome of the expression must a collection of base elements from which
   * the composites are derived.
   */
  public var expression: String? = null,
  /**
   * How the search parameter relates to the set of elements returned by evaluating the expression
   * query.
   */
  public var processingMode: Enumeration<SearchProcessingModeType>? = null,
  /**
   * FHIRPath expression that defines/sets a complex constraint for when this SearchParameter is
   * applicable.
   */
  public var constraint: String? = null,
  /**
   * Types of resource (if a resource is referenced).
   *
   * In some cases, targets may exist for a search parameter that do not exist for the specified
   * FHIRPath for all of the resources identified in SearchParameter.base. For example, the core
   * clinical-encounter search parameter allows both Encounter and EpisodeOfCare as targets, even
   * though not all of the base resources have EpisodeOfCare as a valid target.
   *
   * However, the list of targets SHOULD cover all targets that might appear that are permitted by
   * the specified FHIRPath.
   */
  public var target: List<Code?>? = null,
  /**
   * Whether multiple values are allowed for each time the parameter exists. Values are separated by
   * commas, and the parameter matches if any of the values match.
   */
  public var multipleOr: Boolean? = null,
  /**
   * Whether multiple parameters are allowed - e.g. more than one parameter with the same name. The
   * search matches if all the parameters match.
   */
  public var multipleAnd: Boolean? = null,
  /**
   * Comparators supported for the search parameter.
   *
   * If no comparators are listed, clients should not expect servers to support any comparators.
   */
  public var comparator: List<Enumeration<SearchComparator>>? = null,
  /** A modifier supported for the search parameter. */
  public var modifier: List<Enumeration<SearchModifierCode>>? = null,
  /**
   * Contains the names of any search parameters which may be chained to the containing search
   * parameter. Chained parameters may be added to search parameters of type reference and specify
   * that resources will only be returned if they contain a reference to a resource which matches
   * the chained parameter value. Values for this field should be drawn from SearchParameter.code
   * for a parameter on the target resource type.
   *
   * Notes:
   * * Not all systems will declare chain values. If no chain values are specified at all, then no
   *   presumptions can be made about the degree of chaining support available
   * * A server may use a single chain value of '*' to mean that all reference search types
   *   supported can be chained rather than enumerating all chain values
   * * If a particular reference search parameter is supported, but not subsequent chaining, then
   *   just list that search parameter name - e.g. for Patient.practitioner, the chain value would
   *   be ```practitioner```
   * * If a particular reference search parameter is supported with unlimited chaining beneath it,
   *   then follow the search parameter name with '.'. E.g. ```practitioner.```
   * * If there are specific (not unlimited) chaining paths allowed they can be explicitly
   *   enumerated. E.g. ```practitioner.organization```
   */
  public var chain: List<String?>? = null,
  /** Used to define the parts of a composite search parameter. */
  public var component: List<Component>? = null,
) : DomainResource() {
  /** Used to define the parts of a composite search parameter. */
  @Serializable(with = SearchParameterComponentSerializer::class)
  public class Component(
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
    /** The definition of the search parameter that describes this part. */
    public var definition: Canonical? = null,
    /**
     * A sub-expression that defines how to extract values for this component from the output of the
     * main SearchParameter.expression.
     *
     * This expression overrides the expression in the definition and extracts the index values from
     * the outcome of the composite expression.
     */
    public var expression: String? = null,
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

  /**
   * How a search parameter relates to the set of elements returned by evaluating its expression
   * query.
   */
  public enum class SearchProcessingModeType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The search parameter is derived directly from the selected nodes based on the type
     * definitions.
     */
    Normal(
      "normal",
      "http://hl7.org/fhir/search-processingmode",
      "Normal",
      "The search parameter is derived directly from the selected nodes based on the type definitions.",
    ),
    /** The search parameter is derived by a phonetic transform from the selected nodes. */
    Phonetic(
      "phonetic",
      "http://hl7.org/fhir/search-processingmode",
      "Phonetic",
      "The search parameter is derived by a phonetic transform from the selected nodes.",
    ),
    /** The interpretation of the xpath statement is unknown (and can't be automated). */
    Other(
      "other",
      "http://hl7.org/fhir/search-processingmode",
      "Other",
      "The interpretation of the xpath statement is unknown (and can't be automated).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SearchProcessingModeType =
        when (code) {
          "normal" -> Normal
          "phonetic" -> Phonetic
          "other" -> Other
          else ->
            throw IllegalArgumentException("Unknown code $code for enum SearchProcessingModeType")
        }
    }
  }

  /** What Search Comparator Codes are supported in search. */
  public enum class SearchComparator(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** the value for the parameter in the resource is equal to the provided value. */
    Eq(
      "eq",
      "http://hl7.org/fhir/search-comparator",
      "Equals",
      "the value for the parameter in the resource is equal to the provided value.",
    ),
    /** the value for the parameter in the resource is not equal to the provided value. */
    Ne(
      "ne",
      "http://hl7.org/fhir/search-comparator",
      "Not Equals",
      "the value for the parameter in the resource is not equal to the provided value.",
    ),
    /** the value for the parameter in the resource is greater than the provided value. */
    Gt(
      "gt",
      "http://hl7.org/fhir/search-comparator",
      "Greater Than",
      "the value for the parameter in the resource is greater than the provided value.",
    ),
    /** the value for the parameter in the resource is less than the provided value. */
    Lt(
      "lt",
      "http://hl7.org/fhir/search-comparator",
      "Less Than",
      "the value for the parameter in the resource is less than the provided value.",
    ),
    /** the value for the parameter in the resource is greater or equal to the provided value. */
    Ge(
      "ge",
      "http://hl7.org/fhir/search-comparator",
      "Greater or Equals",
      "the value for the parameter in the resource is greater or equal to the provided value.",
    ),
    /** the value for the parameter in the resource is less or equal to the provided value. */
    Le(
      "le",
      "http://hl7.org/fhir/search-comparator",
      "Less of Equal",
      "the value for the parameter in the resource is less or equal to the provided value.",
    ),
    /** the value for the parameter in the resource starts after the provided value. */
    Sa(
      "sa",
      "http://hl7.org/fhir/search-comparator",
      "Starts After",
      "the value for the parameter in the resource starts after the provided value.",
    ),
    /** the value for the parameter in the resource ends before the provided value. */
    Eb(
      "eb",
      "http://hl7.org/fhir/search-comparator",
      "Ends Before",
      "the value for the parameter in the resource ends before the provided value.",
    ),
    /**
     * the value for the parameter in the resource is approximately the same to the provided value.
     */
    Ap(
      "ap",
      "http://hl7.org/fhir/search-comparator",
      "Approximately",
      "the value for the parameter in the resource is approximately the same to the provided value.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SearchComparator =
        when (code) {
          "eq" -> Eq
          "ne" -> Ne
          "gt" -> Gt
          "lt" -> Lt
          "ge" -> Ge
          "le" -> Le
          "sa" -> Sa
          "eb" -> Eb
          "ap" -> Ap
          else -> throw IllegalArgumentException("Unknown code $code for enum SearchComparator")
        }
    }
  }

  /** A supported modifier for a search parameter. */
  public enum class SearchModifierCode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The search parameter returns resources that have a value or not. */
    Missing(
      "missing",
      "http://hl7.org/fhir/search-modifier-code",
      "Missing",
      "The search parameter returns resources that have a value or not.",
    ),
    /**
     * The search parameter returns resources that have a value that exactly matches the supplied
     * parameter (the whole string, including casing and accents).
     */
    Exact(
      "exact",
      "http://hl7.org/fhir/search-modifier-code",
      "Exact",
      "The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).",
    ),
    /**
     * The search parameter returns resources that include the supplied parameter value anywhere
     * within the field being searched.
     */
    Contains(
      "contains",
      "http://hl7.org/fhir/search-modifier-code",
      "Contains",
      "The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.",
    ),
    /** The search parameter returns resources that do not contain a match. */
    Not(
      "not",
      "http://hl7.org/fhir/search-modifier-code",
      "Not",
      "The search parameter returns resources that do not contain a match.",
    ),
    /**
     * The search parameter is processed as a string that searches text associated with the
     * code/value - either CodeableConcept.text, Coding.display, Identifier.type.text, or
     * Reference.display.
     */
    Text(
      "text",
      "http://hl7.org/fhir/search-modifier-code",
      "Text",
      "The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, Identifier.type.text, or Reference.display.",
    ),
    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the
     * search parameter tests whether the coding is in the specified value set.
     */
    In(
      "in",
      "http://hl7.org/fhir/search-modifier-code",
      "In",
      "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.",
    ),
    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the
     * search parameter tests whether the coding is not in the specified value set.
     */
    Not_In(
      "not-in",
      "http://hl7.org/fhir/search-modifier-code",
      "Not In",
      "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.",
    ),
    /**
     * The search parameter tests whether the value in a resource is subsumed by the specified value
     * (is-a, or hierarchical relationships).
     */
    Below(
      "below",
      "http://hl7.org/fhir/search-modifier-code",
      "Below",
      "The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).",
    ),
    /**
     * The search parameter tests whether the value in a resource subsumes the specified value
     * (is-a, or hierarchical relationships).
     */
    Above(
      "above",
      "http://hl7.org/fhir/search-modifier-code",
      "Above",
      "The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).",
    ),
    /**
     * The search parameter only applies to the Resource Type specified as a modifier (e.g. the
     * modifier is not actually :type, but :Patient etc.).
     */
    Type(
      "type",
      "http://hl7.org/fhir/search-modifier-code",
      "Type",
      "The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).",
    ),
    /** The search parameter applies to the identifier on the resource, not the reference. */
    Identifier(
      "identifier",
      "http://hl7.org/fhir/search-modifier-code",
      "Identifier",
      "The search parameter applies to the identifier on the resource, not the reference.",
    ),
    /**
     * The search parameter has the format system|code|value, where the system and code refer to an
     * Identifier.type.coding.system and .code, and match if any of the type codes match. All 3
     * parts must be present.
     */
    Of_Type(
      "of-type",
      "http://hl7.org/fhir/search-modifier-code",
      "Of Type",
      "The search parameter has the format system|code|value, where the system and code refer to an Identifier.type.coding.system and .code, and match if any of the type codes match. All 3 parts must be present.",
    ),
    /**
     * Tests whether the textual display value in a resource (e.g., CodeableConcept.text,
     * Coding.display, or Reference.display) matches the supplied parameter value.
     */
    Code_Text(
      "code-text",
      "http://hl7.org/fhir/search-modifier-code",
      "Code Text",
      "Tests whether the textual display value in a resource (e.g., CodeableConcept.text, Coding.display, or Reference.display) matches the supplied parameter value.",
    ),
    /**
     * Tests whether the value in a resource matches the supplied parameter value using advanced
     * text handling that searches text associated with the code/value - e.g., CodeableConcept.text,
     * Coding.display, or Identifier.type.text.
     */
    Text_Advanced(
      "text-advanced",
      "http://hl7.org/fhir/search-modifier-code",
      "Text Advanced",
      "Tests whether the value in a resource matches the supplied parameter value using advanced text handling that searches text associated with the code/value - e.g., CodeableConcept.text, Coding.display, or Identifier.type.text.",
    ),
    /**
     * The search parameter indicates an inclusion directive (_include, _revinclude) that is applied
     * to an included resource instead of the matching resource.
     */
    Iterate(
      "iterate",
      "http://hl7.org/fhir/search-modifier-code",
      "Iterate",
      "The search parameter indicates an inclusion directive (_include, _revinclude) that is applied to an included resource instead of the matching resource.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SearchModifierCode =
        when (code) {
          "missing" -> Missing
          "exact" -> Exact
          "contains" -> Contains
          "not" -> Not
          "text" -> Text
          "in" -> In
          "not-in" -> Not_In
          "below" -> Below
          "above" -> Above
          "type" -> Type
          "identifier" -> Identifier
          "of-type" -> Of_Type
          "code-text" -> Code_Text
          "text-advanced" -> Text_Advanced
          "iterate" -> Iterate
          else -> throw IllegalArgumentException("Unknown code $code for enum SearchModifierCode")
        }
    }
  }
}
