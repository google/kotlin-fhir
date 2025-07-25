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

import com.google.fhir.model.r4.serializers.CodeSystemConceptDesignationSerializer
import com.google.fhir.model.r4.serializers.CodeSystemConceptPropertySerializer
import com.google.fhir.model.r4.serializers.CodeSystemConceptSerializer
import com.google.fhir.model.r4.serializers.CodeSystemFilterSerializer
import com.google.fhir.model.r4.serializers.CodeSystemPropertySerializer
import com.google.fhir.model.r4.serializers.CodeSystemSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The CodeSystem resource is used to declare the existence of and describe a code system or code
 * system supplement and its key properties, and optionally define a part or all of its content.
 */
@Serializable(with = CodeSystemSerializer::class)
@SerialName("CodeSystem")
public data class CodeSystem(
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
   * An absolute URI that is used to identify this code system when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this code system is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the code system is stored on different servers. This
   * is used in [Coding](datatypes.html#Coding).system.
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
   * A formal identifier that is used to identify this code system when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this code system outside of FHIR, where it is not possible to use
   * the logical URI. Note that HL7 defines at least three identifiers for many of its code
   * systems - the FHIR canonical URL, the OID and the V2 Table 0396 mnemonic code.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The identifier that is used to identify this version of the code system when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the code
   * system author and is not expected to be globally unique. For example, it might be a timestamp
   * (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that
   * versions can be placed in a lexicographical sequence. This is used in
   * [Coding](datatypes.html#Coding).version.
   *
   * There may be different code system instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the code system with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the code system. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the code system.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The date (and optionally time) when the code system resource was created or revised.
   *
   * Allows filtering of code systems that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this code system is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of code systems that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the code system was published. The date must change when
   * the business version changes and it must change if the status code changes. In addition, it
   * should change when the substantive content of the code system changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the code system. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the code system.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the code system
   * is the organization or individual primarily responsible for the maintenance and upkeep of the
   * code system. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the code system. This item SHOULD be populated unless the information is available
   * from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * A free text natural language description of the code system from a consumer's perspective.
   *
   * This description can be used to capture details such as why the code system was built, comments
   * about misuse, instructions for clinical use and interpretation, literature references, examples
   * from the paper world, etc. It is not a rendering of the code system as conveyed in the 'text'
   * field of the resource itself. This item SHOULD be populated unless the information is available
   * from context (e.g. the language of the code system is presumed to be the predominant language
   * in the place the code system was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate code system instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A legal or geographic region in which the code system is intended to be used.
   *
   * It may be possible for the code system to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Explanation of why this code system is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the code system. Instead, it provides traceability
   * of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this code system.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the code system and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the code system.
   *
   * ... Sometimes, the copyright differs between the code system and the codes that are included.
   * The copyright statement should clearly differentiate between these when required.
   */
  public var copyright: Markdown? = null,
  /**
   * If code comparison is case sensitive when codes within this system are compared to each other.
   *
   * If this value is missing, then it is not specified whether a code system is case sensitive or
   * not. When the rule is not known, Postel's law should be followed: produce codes with the
   * correct case, and accept codes in any case. This element is primarily provided to support
   * validation software.
   */
  public var caseSensitive: Boolean? = null,
  /**
   * Canonical reference to the value set that contains the entire code system.
   *
   * The definition of the value set SHALL include all codes from this code system and only codes
   * from this code system, and it SHALL be immutable.
   */
  public var valueSet: Canonical? = null,
  /**
   * The meaning of the hierarchy of concepts as represented in this resource.
   *
   * Note that other representations might have a different hierarchy or none at all, and represent
   * the information using properties.
   */
  public var hierarchyMeaning: Enumeration<CodeSystemHierarchyMeaning>? = null,
  /**
   * The code system defines a compositional (post-coordination) grammar.
   *
   * Note that the code system resource does not define what the compositional grammar is, only
   * whether or not there is one.
   */
  public var compositional: Boolean? = null,
  /**
   * This flag is used to signify that the code system does not commit to concept permanence across
   * versions. If true, a version must be specified when referencing this code system.
   *
   * Best practice is that code systems do not redefine concepts, or that if concepts are redefined,
   * a new code system definition is created. But this is not always possible, so some code systems
   * may be defined as 'versionNeeded'.
   *
   * Most code systems occasionally refine the displays defined for concepts between versions.
   * Contexts in which the concept display values are validated may require that the version be
   * specified for some code systems irrespective of the value of this property.
   */
  public var versionNeeded: Boolean? = null,
  /**
   * The extent of the content of the code system (the concepts and codes it defines) are
   * represented in this resource instance.
   */
  public var content: Enumeration<CodeSystemContentMode>,
  /**
   * The canonical URL of the code system that this code system supplement is adding designations
   * and properties to.
   *
   * The most common use of a code system supplement is to add additional language support.
   */
  public var supplements: Canonical? = null,
  /**
   * The total number of concepts defined by the code system. Where the code system has a
   * compositional grammar, the basis of this count is defined by the system steward.
   *
   * The count of concepts defined in this resource cannot be more than this value but may be less
   * for several reasons - see the content element.
   */
  public var count: UnsignedInt? = null,
  /**
   * A filter that can be used in a value set compose statement when selecting concepts using a
   * filter.
   *
   * Note that filters defined in code systems usually require custom code on the part of any
   * terminology engine that will make them available for use in value set filters. For this reason,
   * they are generally only seen in high value published terminologies.
   */
  public var filter: MutableList<Filter> = mutableListOf(),
  /**
   * A property defines an additional slot through which additional information can be provided
   * about a concept.
   */
  public var `property`: MutableList<Property> = mutableListOf(),
  /**
   * Concepts that are in the code system. The concept definitions are inherently hierarchical, but
   * the definitions must be consulted to determine what the meanings of the hierarchical
   * relationships are.
   *
   * If this is empty, it means that the code system resource does not represent the content of the
   * code system.
   */
  public var concept: MutableList<Concept> = mutableListOf(),
) : DomainResource() {
  /**
   * A filter that can be used in a value set compose statement when selecting concepts using a
   * filter.
   */
  @Serializable(with = CodeSystemFilterSerializer::class)
  public class Filter(
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
    /**
     * The code that identifies this filter when it is used as a filter in
     * [ValueSet](valueset.html#).compose.include.filter.
     */
    public var code: Code,
    /** A description of how or why the filter is used. */
    public var description: String? = null,
    /** A list of operators that can be used with the filter. */
    public var `operator`: MutableList<Enumeration<FilterOperator>> = mutableListOf(),
    /** A description of what the value for the filter should be. */
    public var `value`: String,
  ) : BackboneElement()

  /**
   * A property defines an additional slot through which additional information can be provided
   * about a concept.
   */
  @Serializable(with = CodeSystemPropertySerializer::class)
  public class Property(
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
    /**
     * A code that is used to identify the property. The code is used internally (in
     * CodeSystem.concept.property.code) and also externally, such as in property filters.
     */
    public var code: Code,
    /**
     * Reference to the formal meaning of the property. One possible source of meaning is the
     * [Concept Properties](codesystem-concept-properties.html) code system.
     */
    public var uri: Uri? = null,
    /** A description of the property- why it is defined, and how its value might be used. */
    public var description: String? = null,
    /**
     * The type of the property value. Properties of type "code" contain a code defined by the code
     * system (e.g. a reference to another defined concept).
     */
    public var type: Enumeration<PropertyType>,
  ) : BackboneElement()

  /**
   * Concepts that are in the code system. The concept definitions are inherently hierarchical, but
   * the definitions must be consulted to determine what the meanings of the hierarchical
   * relationships are.
   */
  @Serializable(with = CodeSystemConceptSerializer::class)
  public class Concept(
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
    /** A code - a text symbol - that uniquely identifies the concept within the code system. */
    public var code: Code,
    /**
     * A human readable string that is the recommended default way to present this concept to a
     * user.
     */
    public var display: String? = null,
    /**
     * The formal definition of the concept. The code system resource does not make formal
     * definitions required, because of the prevalence of legacy systems. However, they are highly
     * recommended, as without them there is no formal meaning associated with the concept.
     */
    public var definition: String? = null,
    /**
     * Additional representations for the concept - other languages, aliases, specialized purposes,
     * used for particular purposes, etc.
     *
     * Concepts have both a ```display``` and an array of ```designation```. The display is
     * equivalent to a special designation with an implied ```designation.use``` of "primary code"
     * and a language equal to the [Resource Language](resource.html#language).
     */
    public var designation: MutableList<Designation> = mutableListOf(),
    /** A property value for this concept. */
    public var `property`: MutableList<Property> = mutableListOf(),
    /**
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the
     * relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
     */
    public var concept: MutableList<Concept> = mutableListOf(),
  ) : BackboneElement() {
    /**
     * Additional representations for the concept - other languages, aliases, specialized purposes,
     * used for particular purposes, etc.
     */
    @Serializable(with = CodeSystemConceptDesignationSerializer::class)
    public class Designation(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
       * The language this designation is defined for.
       *
       * In the absence of a language, the resource language applies.
       */
      public var language: Code? = null,
      /**
       * A code that details how this designation would be used.
       *
       * If no use is provided, the designation can be assumed to be suitable for general display to
       * a human user.
       */
      public var use: Coding? = null,
      /** The text value for this designation. */
      public var `value`: String,
    ) : BackboneElement()

    /** A property value for this concept. */
    @Serializable(with = CodeSystemConceptPropertySerializer::class)
    public class Property(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      /** A code that is a reference to CodeSystem.property.code. */
      public var code: Code,
      /** The value of this property. */
      public var `value`: Value,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asCode(): Code? = this as? Code

        public fun asCoding(): Coding? = this as? Coding

        public fun asString(): String? = this as? String

        public fun asInteger(): Integer? = this as? Integer

        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asDecimal(): Decimal? = this as? Decimal

        public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Value

        public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Value

        public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

        public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Value

        public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Value

        public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Value

        public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Value

        public companion object {
          internal fun from(
            codeValue: com.google.fhir.model.r4.Code?,
            codingValue: com.google.fhir.model.r4.Coding?,
            stringValue: com.google.fhir.model.r4.String?,
            integerValue: com.google.fhir.model.r4.Integer?,
            booleanValue: com.google.fhir.model.r4.Boolean?,
            dateTimeValue: com.google.fhir.model.r4.DateTime?,
            decimalValue: com.google.fhir.model.r4.Decimal?,
          ): Value? {
            if (codeValue != null) return Code(codeValue)
            if (codingValue != null) return Coding(codingValue)
            if (stringValue != null) return String(stringValue)
            if (integerValue != null) return Integer(integerValue)
            if (booleanValue != null) return Boolean(booleanValue)
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (decimalValue != null) return Decimal(decimalValue)
            return null
          }
        }
      }
    }
  }

  /** The kind of operation to perform as a part of a property based filter. */
  public enum class FilterOperator(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    EqualTo("=", "http://hl7.org/fhir/filter-operator", "Equals"),
    Is_A("is-a", "http://hl7.org/fhir/filter-operator", "Is A (by subsumption)"),
    Descendent_Of(
      "descendent-of",
      "http://hl7.org/fhir/filter-operator",
      "Descendent Of (by subsumption)",
    ),
    Is_Not_A("is-not-a", "http://hl7.org/fhir/filter-operator", "Not (Is A) (by subsumption)"),
    Regex("regex", "http://hl7.org/fhir/filter-operator", "Regular Expression"),
    In("in", "http://hl7.org/fhir/filter-operator", "In Set"),
    Not_In("not-in", "http://hl7.org/fhir/filter-operator", "Not in Set"),
    Generalizes(
      "generalizes",
      "http://hl7.org/fhir/filter-operator",
      "Generalizes (by Subsumption)",
    ),
    Exists("exists", "http://hl7.org/fhir/filter-operator", "Exists");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): FilterOperator =
        when (code) {
          "=" -> EqualTo
          "is-a" -> Is_A
          "descendent-of" -> Descendent_Of
          "is-not-a" -> Is_Not_A
          "regex" -> Regex
          "in" -> In
          "not-in" -> Not_In
          "generalizes" -> Generalizes
          "exists" -> Exists
          else -> throw IllegalArgumentException("Unknown code $code for enum FilterOperator")
        }
    }
  }

  /** The type of a property value. */
  public enum class PropertyType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Code("code", "http://hl7.org/fhir/concept-property-type", "code (internal reference)"),
    Coding("Coding", "http://hl7.org/fhir/concept-property-type", "Coding (external reference)"),
    String("string", "http://hl7.org/fhir/concept-property-type", "string"),
    Integer("integer", "http://hl7.org/fhir/concept-property-type", "integer"),
    Boolean("boolean", "http://hl7.org/fhir/concept-property-type", "boolean"),
    DateTime("dateTime", "http://hl7.org/fhir/concept-property-type", "dateTime"),
    Decimal("decimal", "http://hl7.org/fhir/concept-property-type", "decimal");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): PropertyType =
        when (code) {
          "code" -> Code
          "Coding" -> Coding
          "string" -> String
          "integer" -> Integer
          "boolean" -> Boolean
          "dateTime" -> DateTime
          "decimal" -> Decimal
          else -> throw IllegalArgumentException("Unknown code $code for enum PropertyType")
        }
    }
  }

  /** The meaning of the hierarchy of concepts in a code system. */
  public enum class CodeSystemHierarchyMeaning(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Grouped_By("grouped-by", "http://hl7.org/fhir/codesystem-hierarchy-meaning", "Grouped By"),
    Is_A("is-a", "http://hl7.org/fhir/codesystem-hierarchy-meaning", "Is-A"),
    Part_Of("part-of", "http://hl7.org/fhir/codesystem-hierarchy-meaning", "Part Of"),
    Classified_With(
      "classified-with",
      "http://hl7.org/fhir/codesystem-hierarchy-meaning",
      "Classified With",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): CodeSystemHierarchyMeaning =
        when (code) {
          "grouped-by" -> Grouped_By
          "is-a" -> Is_A
          "part-of" -> Part_Of
          "classified-with" -> Classified_With
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CodeSystemHierarchyMeaning")
        }
    }
  }

  /**
   * The extent of the content of the code system (the concepts and codes it defines) are
   * represented in a code system resource.
   */
  public enum class CodeSystemContentMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Not_Present("not-present", "http://hl7.org/fhir/codesystem-content-mode", "Not Present"),
    Example("example", "http://hl7.org/fhir/codesystem-content-mode", "Example"),
    Fragment("fragment", "http://hl7.org/fhir/codesystem-content-mode", "Fragment"),
    Complete("complete", "http://hl7.org/fhir/codesystem-content-mode", "Complete"),
    Supplement("supplement", "http://hl7.org/fhir/codesystem-content-mode", "Supplement");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): CodeSystemContentMode =
        when (code) {
          "not-present" -> Not_Present
          "example" -> Example
          "fragment" -> Fragment
          "complete" -> Complete
          "supplement" -> Supplement
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CodeSystemContentMode")
        }
    }
  }
}
