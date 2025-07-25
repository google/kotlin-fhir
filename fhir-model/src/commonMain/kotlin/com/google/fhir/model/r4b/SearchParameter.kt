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

import com.google.fhir.model.r4b.serializers.SearchParameterComponentSerializer
import com.google.fhir.model.r4b.serializers.SearchParameterSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
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
  override var contained: MutableList<Resource> = mutableListOf(),
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
  override var extension: MutableList<Extension> = mutableListOf(),
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
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /**
   * An absolute URI that is used to identify this search parameter when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this search parameter is (or will be) published. This URL can be the target of a canonical
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
  public var url: Uri,
  /**
   * The identifier that is used to identify this version of the search parameter when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the search parameter author and is not expected to be globally unique. For example, it might be
   * a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different search parameter instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the search parameter with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the search parameter. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String,
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
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this search parameter is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of search parameters that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the search parameter was published. The date must change
   * when the business version changes and it must change if the status code changes. In addition,
   * it should change when the substantive content of the search parameter changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the search parameter. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the search parameter.
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
   */
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * And how it used.
   *
   * This description can be used to capture details such as why the search parameter was built,
   * comments about misuse, instructions for clinical use and interpretation, literature references,
   * examples from the paper world, etc. It is not a rendering of the search parameter as conveyed
   * in the 'text' field of the resource itself. This item SHOULD be populated unless the
   * information is available from context (e.g. the language of the search parameter is presumed to
   * be the predominant language in the place the search parameter was created).
   */
  public var description: Markdown,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate search parameter instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A legal or geographic region in which the search parameter is intended to be used.
   *
   * It may be possible for the search parameter to be used in jurisdictions other than those for
   * which it was originally designed or intended.
   */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
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
   * The code used in the URL or the parameter name in a parameters resource for this search
   * parameter.
   *
   * For maximum compatibility, use only lowercase ASCII characters.
   */
  public var code: Code,
  /**
   * The base resource type(s) that this search parameter can be used against.
   *
   * A search parameter must always apply to at least one resource type. When search parameters
   * apply to more than one resource type, they can be used against any of the listed resource
   * types, or in a cross-type search (see [Cross Resource Search](http.html#xres-search)).
   */
  public var base: MutableList<Enumeration<ResourceType>> = mutableListOf(),
  /** The type of value that a search parameter may contain, and how the content is interpreted. */
  public var type: Enumeration<SearchParamType>,
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
   * An XPath expression that returns a set of elements for the search parameter.
   *
   * Note that the elements returned by the XPath are sometimes complex elements where logic is
   * required to determine quite how to handle them; e.g. CodeableConcepts may contain text and/or
   * multiple codings, where the codings themselves contain a code and a system.
   */
  public var xpath: String? = null,
  /**
   * How the search parameter relates to the set of elements returned by evaluating the xpath query.
   */
  public var xpathUsage: Enumeration<XPathUsageType>? = null,
  /** Types of resource (if a resource is referenced). */
  public var target: MutableList<Enumeration<ResourceType>> = mutableListOf(),
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
  public var comparator: MutableList<Enumeration<SearchComparator>> = mutableListOf(),
  /** A modifier supported for the search parameter. */
  public var modifier: MutableList<Enumeration<SearchModifierCode>> = mutableListOf(),
  /**
   * Contains the names of any search parameters which may be chained to the containing search
   * parameter. Chained parameters may be added to search parameters of type reference and specify
   * that resources will only be returned if they contain a reference to a resource which matches
   * the chained parameter value. Values for this field should be drawn from SearchParameter.code
   * for a parameter on the target resource type.
   *
   * Systems are not required to list all the chain names they support, but if they don't list them,
   * clients might not know to use them.
   */
  public var chain: MutableList<String> = mutableListOf(),
  /** Used to define the parts of a composite search parameter. */
  public var component: MutableList<Component> = mutableListOf(),
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** The definition of the search parameter that describes this part. */
    public var definition: Canonical,
    /**
     * A sub-expression that defines how to extract values for this component from the output of the
     * main SearchParameter.expression.
     *
     * This expression overrides the expression in the definition and extracts the index values from
     * the outcome of the composite expression.
     */
    public var expression: String,
  ) : BackboneElement()

  /**
   * How a search parameter relates to the set of elements returned by evaluating its xpath query.
   */
  public enum class XPathUsageType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Normal("normal", "http://hl7.org/fhir/search-xpath-usage", "Normal"),
    Phonetic("phonetic", "http://hl7.org/fhir/search-xpath-usage", "Phonetic"),
    Nearby("nearby", "http://hl7.org/fhir/search-xpath-usage", "Nearby"),
    Distance("distance", "http://hl7.org/fhir/search-xpath-usage", "Distance"),
    Other("other", "http://hl7.org/fhir/search-xpath-usage", "Other");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): XPathUsageType =
        when (code) {
          "normal" -> Normal
          "phonetic" -> Phonetic
          "nearby" -> Nearby
          "distance" -> Distance
          "other" -> Other
          else -> throw IllegalArgumentException("Unknown code $code for enum XPathUsageType")
        }
    }
  }

  /** What Search Comparator Codes are supported in search. */
  public enum class SearchComparator(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Eq("eq", "http://hl7.org/fhir/search-comparator", "Equals"),
    Ne("ne", "http://hl7.org/fhir/search-comparator", "Not Equals"),
    Gt("gt", "http://hl7.org/fhir/search-comparator", "Greater Than"),
    Lt("lt", "http://hl7.org/fhir/search-comparator", "Less Than"),
    Ge("ge", "http://hl7.org/fhir/search-comparator", "Greater or Equals"),
    Le("le", "http://hl7.org/fhir/search-comparator", "Less of Equal"),
    Sa("sa", "http://hl7.org/fhir/search-comparator", "Starts After"),
    Eb("eb", "http://hl7.org/fhir/search-comparator", "Ends Before"),
    Ap("ap", "http://hl7.org/fhir/search-comparator", "Approximately");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

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
  ) {
    Missing("missing", "http://hl7.org/fhir/search-modifier-code", "Missing"),
    Exact("exact", "http://hl7.org/fhir/search-modifier-code", "Exact"),
    Contains("contains", "http://hl7.org/fhir/search-modifier-code", "Contains"),
    Not("not", "http://hl7.org/fhir/search-modifier-code", "Not"),
    Text("text", "http://hl7.org/fhir/search-modifier-code", "Text"),
    In("in", "http://hl7.org/fhir/search-modifier-code", "In"),
    Not_In("not-in", "http://hl7.org/fhir/search-modifier-code", "Not In"),
    Below("below", "http://hl7.org/fhir/search-modifier-code", "Below"),
    Above("above", "http://hl7.org/fhir/search-modifier-code", "Above"),
    Type("type", "http://hl7.org/fhir/search-modifier-code", "Type"),
    Identifier("identifier", "http://hl7.org/fhir/search-modifier-code", "Identifier"),
    OfType("ofType", "http://hl7.org/fhir/search-modifier-code", "Of Type");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

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
          "ofType" -> OfType
          else -> throw IllegalArgumentException("Unknown code $code for enum SearchModifierCode")
        }
    }
  }
}
