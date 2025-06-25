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

import com.google.fhir.model.r5.serializers.ConceptMapAdditionalAttributeSerializer
import com.google.fhir.model.r5.serializers.ConceptMapGroupElementSerializer
import com.google.fhir.model.r5.serializers.ConceptMapGroupElementTargetDependsOnSerializer
import com.google.fhir.model.r5.serializers.ConceptMapGroupElementTargetPropertySerializer
import com.google.fhir.model.r5.serializers.ConceptMapGroupElementTargetSerializer
import com.google.fhir.model.r5.serializers.ConceptMapGroupSerializer
import com.google.fhir.model.r5.serializers.ConceptMapGroupUnmappedSerializer
import com.google.fhir.model.r5.serializers.ConceptMapPropertySerializer
import com.google.fhir.model.r5.serializers.ConceptMapSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A statement of relationships from one set of concepts to one or more other concepts - either
 * concepts in code systems, or data element/data element concepts, or classes in class models.
 */
@Serializable(with = ConceptMapSerializer::class)
@SerialName("ConceptMap")
public data class ConceptMap(
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
   * An absolute URI that is used to identify this concept map when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * concept map is (or will be) published. This URL can be the target of a canonical reference. It
   * SHALL remain the same when the concept map is stored on different servers.
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
   * A formal identifier that is used to identify this concept map when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this concept map outside of FHIR, where it is not possible to use
   * the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the concept map when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the
   * concept map author and is not expected to be globally unique. For example, it might be a
   * timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different concept map instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the concept map with the format [url]|[version]. The version
   * SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
   */
  public var version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which ConceptMap is more current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 and a 0 if the version ordering can't be successfully be
   * determined.
   */
  public var versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the concept map. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the concept map.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this concept map. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of concept maps that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this concept map is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of concept maps that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the concept map was last significantly changed. The date
   * must change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the concept map changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the concept map. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the concept map.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the concept map
   * is the organization or individual primarily responsible for the maintenance and upkeep of the
   * concept map. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the concept map. This item SHOULD be populated unless the information is available
   * from context.
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
   * A free text natural language description of the concept map from a consumer's perspective.
   *
   * The description is not intended to describe the semantics of the concept map. The description
   * should capture its intended use, which is needed for ensuring integrity for its use in models
   * across future changes.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate concept map instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the concept map is intended to be used.
   *
   * It may be possible for the concept map to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this concept map is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the concept map. Instead, it provides traceability
   * of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this concept map.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the concept map and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the concept map.
   *
   * Frequently the copyright differs between the concept map and codes that are included. The
   * copyright statement should clearly differentiate between these when required.
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
   * The period during which the ConceptMap content was or is planned to be in active use.
   *
   * The effective period for a ConceptMap determines when the content is applicable for usage and
   * is independent of publication and review dates. For example, a map intended to be used for the
   * year 2016 might be published in 2015.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var effectivePeriod: Period? = null,
  /**
   * Descriptions related to the content of the ConceptMap. Topics provide a high-level
   * categorization as well as keywords for the ConceptMap that can be useful for filtering and
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
   * ConceptMap.
   */
  public var author: List<ContactDetail?>? = null,
  /**
   * An individual or organization primarily responsible for internal coherence of the ConceptMap.
   */
  public var editor: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be primarily responsible for review
   * of some aspect of the ConceptMap.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var reviewer: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be responsible for officially
   * endorsing the ConceptMap for use in some setting.
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
   * A property defines a slot through which additional information can be provided about a map from
   * source -> target.
   *
   * Properties may be used to supply for example, mapping priority, provenance, presentation hints,
   * flag as experimental, and additional documentation. Multiple occurrences of
   * ConceptMap.group.element.target.property may occur for a ConceptMap.property where
   * ConceptMap.group.element.target.property.code is the same and the values in
   * ConceptMap.group.element.target.property.value differ.
   */
  public var `property`: List<Property>? = null,
  /**
   * An additionalAttribute defines an additional data element found in the source or target data
   * model where the data will come from or be mapped to. Some mappings are based on data in
   * addition to the source data element, where codes in multiple fields are combined to a single
   * field (or vice versa).
   *
   * Additional attributes are used to define additional data elements where mapping data can be
   * found. For an example, see [Specimen Type v2 -> SNOMED CT
   * Mapping(conceptmap-example-specimen-type.html)
   */
  public var additionalAttribute: List<AdditionalAttribute>? = null,
  /**
   * Identifier for the source value set that contains the concepts that are being mapped and
   * provides context for the mappings. Limits the scope of the map to source codes
   * (ConceptMap.group.element code or valueSet) that are members of this value set.
   *
   * Should be a version specific reference. URIs SHOULD be absolute. If there is no sourceScope or
   * targetScope value set, there is no specified context for the map (not recommended). The
   * sourceScope value set may select codes from either an explicit (standard or local) or implicit
   * code system.
   */
  public var sourceScope: SourceScope? = null,
  /**
   * Identifier for the target value set that provides important context about how the mapping
   * choices are made. Limits the scope of the map to target codes (ConceptMap.group.element.target
   * code or valueSet) that are members of this value set.
   *
   * Should be a version specific reference. URIs SHOULD be absolute. If there is no sourceScope or
   * targetScope value set, there is no specified context for the map (not recommended). The
   * targetScope value set may select codes from either an explicit (standard or local) or implicit
   * code system.
   */
  public var targetScope: TargetScope? = null,
  /** A group of mappings that all have the same source and target system. */
  public var group: List<Group>? = null,
) : DomainResource() {
  /**
   * A property defines a slot through which additional information can be provided about a map from
   * source -> target.
   */
  @Serializable(with = ConceptMapPropertySerializer::class)
  public class Property(
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
     * A code that is used to identify the property. The code is used internally (in
     * ConceptMap.group.element.target.property.code) and also in the $translate operation.
     */
    public var code: Code? = null,
    /** Reference to the formal meaning of the property. */
    public var uri: Uri? = null,
    /** A description of the property - why it is defined, and how its value might be used. */
    public var description: String? = null,
    /** The type of the property value. */
    public var type: Enumeration<PropertyType>? = null,
    /**
     * The CodeSystem that defines the codes from which values of type ```code``` in property
     * values.
     */
    public var system: Canonical? = null,
  ) : BackboneElement()

  /**
   * An additionalAttribute defines an additional data element found in the source or target data
   * model where the data will come from or be mapped to. Some mappings are based on data in
   * addition to the source data element, where codes in multiple fields are combined to a single
   * field (or vice versa).
   */
  @Serializable(with = ConceptMapAdditionalAttributeSerializer::class)
  public class AdditionalAttribute(
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
     * A code that is used to identify this additional data attribute. The code is used internally
     * in ConceptMap.group.element.target.dependsOn.attribute and
     * ConceptMap.group.element.target.product.attribute.
     */
    public var code: Code? = null,
    /**
     * Reference to the formal definition of the source/target data element. For elements defined by
     * the FHIR specification, or using a FHIR logical model, the correct format is
     * {canonical-url}#{element-id}.
     */
    public var uri: Uri? = null,
    /**
     * A description of the additional attribute and/or the data element it refers to - why it is
     * defined, and how the value might be used in mappings, and a discussion of issues associated
     * with the use of the data element.
     */
    public var description: String? = null,
    /**
     * The type of the source data contained in this concept map for this data element.
     *
     * When the source or target is not content defined by FHIR, some additional application logic
     * might be required to map from the FHIR Datatype to the externally defined content
     */
    public var type: Enumeration<ConceptMapmapAttributeType>? = null,
  ) : BackboneElement()

  /** A group of mappings that all have the same source and target system. */
  @Serializable(with = ConceptMapGroupSerializer::class)
  public class Group(
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
     * An absolute URI that identifies the source system where the concepts to be mapped are
     * defined.
     *
     * This is not needed if the source value set is specified and it contains concepts from only a
     * single system.
     */
    public var source: Canonical? = null,
    /**
     * An absolute URI that identifies the target system that the concepts will be mapped to.
     *
     * This is not needed if the target value set is specified and it contains concepts from only a
     * single system. The group target may also be omitted if all of the target element relationship
     * values are 'not-related-to'.
     */
    public var target: Canonical? = null,
    /**
     * Mappings for an individual concept in the source to one or more concepts in the target.
     *
     * Generally, the ideal is that there would only be one mapping for each concept in the source
     * value set, but a given concept may be mapped multiple times with different comments or
     * dependencies.
     */
    public var element: List<Element>? = null,
    /**
     * What to do when there is no mapping to a target concept from the source concept and
     * ConceptMap.group.element.noMap is not true. This provides the "default" to be applied when
     * there is no target concept mapping specified or the expansion of
     * ConceptMap.group.element.target.valueSet is empty.
     *
     * The 'unmapped' element is ignored if a code is specified to have relationship =
     * not-related-to or if ConceptMap.group.element.noMap = true.
     */
    public var unmapped: Unmapped? = null,
  ) : BackboneElement() {
    /** Mappings for an individual concept in the source to one or more concepts in the target. */
    @Serializable(with = ConceptMapGroupElementSerializer::class)
    public class Element(
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
      /** Identity (code or path) or the element/item being mapped. */
      public var code: Code? = null,
      /**
       * The display for the code. The display is only provided to help editors when editing the
       * concept map.
       *
       * The display is ignored when processing the map.
       */
      public var display: String? = null,
      /**
       * The set of concepts from the ConceptMap.group.source code system which are all being mapped
       * to the target as part of this mapping rule.
       *
       * If the value set expansion is empty then there are no source concepts to map in this rule.
       */
      public var valueSet: Canonical? = null,
      /**
       * If noMap = true this indicates that no mapping to a target concept exists for this source
       * concept.
       *
       * If noMap = true, then the behavior of ConceptMap.group.unmapped (if present) does not
       * apply.
       */
      public var noMap: Boolean? = null,
      /**
       * A concept from the target value set that this concept maps to.
       *
       * Ideally there would only be one map, with an 'equivalent' mapping. But multiple maps are
       * allowed for several narrower (i.e. source-is-broader-than-target) options, or to assert
       * that other concepts are not related.
       */
      public var target: List<Target>? = null,
    ) : BackboneElement() {
      /** A concept from the target value set that this concept maps to. */
      @Serializable(with = ConceptMapGroupElementTargetSerializer::class)
      public class Target(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
        /** Identity (code or path) or the element/item that the map refers to. */
        public var code: Code? = null,
        /**
         * The display for the code. The display is only provided to help editors when editing the
         * concept map.
         *
         * The display is ignored when processing the map.
         */
        public var display: String? = null,
        /**
         * The set of concepts from the ConceptMap.group.target code system which are all being
         * mapped to as part of this mapping rule. The effect of using this data element is the same
         * as having multiple ConceptMap.group.element.target elements with one for each concept in
         * the ConceptMap.group.element.target.valueSet value set.
         *
         * If the the value set expansion is empty then the source concept(s) are unmapped and the
         * behavior of ConceptMap.group.unmapped (if present) applies.
         */
        public var valueSet: Canonical? = null,
        /**
         * The relationship between the source and target concepts. The relationship is read from
         * source to target (e.g. source-is-narrower-than-target).
         *
         * This element is labeled as a modifier because it may indicate that there is no mapping.
         */
        public var relationship: Enumeration<ConceptMapRelationship>? = null,
        /**
         * A description of status/issues in mapping that conveys additional information not
         * represented in the structured data.
         */
        public var comment: String? = null,
        /** A property value for this source -> target mapping. */
        public var `property`: List<Property>? = null,
        /**
         * A set of additional dependencies for this mapping to hold. This mapping is only
         * applicable if the specified data attribute can be resolved, and it has the specified
         * value.
         */
        public var dependsOn: List<DependsOn>? = null,
        /**
         * Product is the output of a ConceptMap that provides additional values that go in other
         * attributes / data elemnts of the target data.
         */
        public var product: List<DependsOn?>? = null,
      ) : BackboneElement() {
        /** A property value for this source -> target mapping. */
        @Serializable(with = ConceptMapGroupElementTargetPropertySerializer::class)
        public class Property(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and managable, there is a
           * strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: List<Extension?>? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and managable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: List<Extension?>? = null,
          /** A reference to a mapping property defined in ConceptMap.property. */
          public var code: Code? = null,
          /**
           * The value of this property. If the type chosen for this element is 'code', then the
           * property SHALL be defined in a ConceptMap.property element.
           */
          public var `value`: Value? = null,
        ) : BackboneElement() {
          public sealed interface Value {
            public fun asCoding(): Coding? = this as? Coding

            public fun asString(): String? = this as? String

            public fun asInteger(): Integer? = this as? Integer

            public fun asBoolean(): Boolean? = this as? Boolean

            public fun asDateTime(): DateTime? = this as? DateTime

            public fun asDecimal(): Decimal? = this as? Decimal

            public fun asCode(): Code? = this as? Code

            public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

            public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

            public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

            public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

            public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) :
              Value

            public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

            public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Value

            public companion object {
              public fun from(
                CodingValue: com.google.fhir.model.r5.Coding?,
                stringValue: com.google.fhir.model.r5.String?,
                integerValue: com.google.fhir.model.r5.Integer?,
                booleanValue: com.google.fhir.model.r5.Boolean?,
                dateTimeValue: com.google.fhir.model.r5.DateTime?,
                decimalValue: com.google.fhir.model.r5.Decimal?,
                codeValue: com.google.fhir.model.r5.Code?,
              ): Value? {
                if (CodingValue != null) return Coding(CodingValue)
                if (stringValue != null) return String(stringValue)
                if (integerValue != null) return Integer(integerValue)
                if (booleanValue != null) return Boolean(booleanValue)
                if (dateTimeValue != null) return DateTime(dateTimeValue)
                if (decimalValue != null) return Decimal(decimalValue)
                if (codeValue != null) return Code(codeValue)
                return null
              }
            }
          }
        }

        /**
         * A set of additional dependencies for this mapping to hold. This mapping is only
         * applicable if the specified data attribute can be resolved, and it has the specified
         * value.
         */
        @Serializable(with = ConceptMapGroupElementTargetDependsOnSerializer::class)
        public class DependsOn(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and managable, there is a
           * strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: List<Extension?>? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and managable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: List<Extension?>? = null,
          /** A reference to the additional attribute that holds a value the map depends on. */
          public var attribute: Code? = null,
          /**
           * Data element value that the map depends on / produces.
           *
           * If the data type is a code, then the code system is .group.source for
           * .dependsOn.valueCode and .group.target for .product.valueCode.
           */
          public var `value`: Value? = null,
          /** This mapping applies if the data element value is a code from this value set. */
          public var valueSet: Canonical? = null,
        ) : BackboneElement() {
          public sealed interface Value {
            public fun asCode(): Code? = this as? Code

            public fun asCoding(): Coding? = this as? Coding

            public fun asString(): String? = this as? String

            public fun asBoolean(): Boolean? = this as? Boolean

            public fun asQuantity(): Quantity? = this as? Quantity

            public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Value

            public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

            public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

            public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

            public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
              Value

            public companion object {
              public fun from(
                codeValue: com.google.fhir.model.r5.Code?,
                CodingValue: com.google.fhir.model.r5.Coding?,
                stringValue: com.google.fhir.model.r5.String?,
                booleanValue: com.google.fhir.model.r5.Boolean?,
                QuantityValue: com.google.fhir.model.r5.Quantity?,
              ): Value? {
                if (codeValue != null) return Code(codeValue)
                if (CodingValue != null) return Coding(CodingValue)
                if (stringValue != null) return String(stringValue)
                if (booleanValue != null) return Boolean(booleanValue)
                if (QuantityValue != null) return Quantity(QuantityValue)
                return null
              }
            }
          }
        }
      }
    }

    /**
     * What to do when there is no mapping to a target concept from the source concept and
     * ConceptMap.group.element.noMap is not true. This provides the "default" to be applied when
     * there is no target concept mapping specified or the expansion of
     * ConceptMap.group.element.target.valueSet is empty.
     */
    @Serializable(with = ConceptMapGroupUnmappedSerializer::class)
    public class Unmapped(
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
       * Defines which action to take if there is no match for the source concept in the target
       * system designated for the group. One of 3 actions are possible: use the unmapped source
       * code (this is useful when doing a mapping between versions, and only a few codes have
       * changed), use a fixed code (a default code), or alternatively, a reference to a different
       * concept map can be provided (by canonical URL).
       */
      public var mode: Enumeration<ConceptMapGroupUnmappedMode>? = null,
      /**
       * The fixed code to use when the mode = 'fixed' - all unmapped codes are mapped to a single
       * fixed code.
       */
      public var code: Code? = null,
      /**
       * The display for the code. The display is only provided to help editors when editing the
       * concept map.
       *
       * The display is ignored when processing the map.
       */
      public var display: String? = null,
      /**
       * The set of fixed codes to use when the mode = 'fixed' - all unmapped codes are mapped to
       * each of the fixed codes.
       */
      public var valueSet: Canonical? = null,
      /**
       * The default relationship value to apply between the source and target concepts when the
       * source code is unmapped and the mode is 'fixed' or 'use-source-code'.
       *
       * This element is labeled as a modifier because it may indicate that there is no mapping.
       */
      public var relationship: Enumeration<UnmappedConceptMapRelationship>? = null,
      /**
       * The canonical reference to an additional ConceptMap resource instance to use for mapping if
       * this ConceptMap resource contains no matching mapping for the source concept.
       */
      public var otherMap: Canonical? = null,
    ) : BackboneElement()
  }

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

  public sealed interface SourceScope {
    public fun asUri(): Uri? = this as? Uri

    public fun asCanonical(): Canonical? = this as? Canonical

    public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : SourceScope

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
      SourceScope

    public companion object {
      public fun from(
        uriValue: com.google.fhir.model.r5.Uri?,
        canonicalValue: com.google.fhir.model.r5.Canonical?,
      ): SourceScope? {
        if (uriValue != null) return Uri(uriValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        return null
      }
    }
  }

  public sealed interface TargetScope {
    public fun asUri(): Uri? = this as? Uri

    public fun asCanonical(): Canonical? = this as? Canonical

    public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : TargetScope

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
      TargetScope

    public companion object {
      public fun from(
        uriValue: com.google.fhir.model.r5.Uri?,
        canonicalValue: com.google.fhir.model.r5.Canonical?,
      ): TargetScope? {
        if (uriValue != null) return Uri(uriValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        return null
      }
    }
  }

  /** The type of a ConceptMap mapping property value. */
  public enum class PropertyType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The property value is a code defined in an external code system. This may be used for
     * translations, but is not the intent.
     */
    Coding(
      "Coding",
      "http://hl7.org/fhir/conceptmap-property-type",
      "Coding (external reference)",
      "The property  value is a code defined in an external code system. This may be used for translations, but is not the intent.",
    ),
    /** The property value is a string. */
    String(
      "string",
      "http://hl7.org/fhir/conceptmap-property-type",
      "string",
      "The property value is a string.",
    ),
    /**
     * The property value is an integer (often used to assign ranking values to concepts for
     * supporting score assessments).
     */
    Integer(
      "integer",
      "http://hl7.org/fhir/conceptmap-property-type",
      "integer",
      "The property value is an integer (often used to assign ranking values to concepts for supporting score assessments).",
    ),
    /** The property value is a boolean true | false. */
    Boolean(
      "boolean",
      "http://hl7.org/fhir/conceptmap-property-type",
      "boolean",
      "The property value is a boolean true | false.",
    ),
    /** The property is a date or a date + time. */
    DateTime(
      "dateTime",
      "http://hl7.org/fhir/conceptmap-property-type",
      "dateTime",
      "The property is a date or a date + time.",
    ),
    /** The property value is a decimal number. */
    Decimal(
      "decimal",
      "http://hl7.org/fhir/conceptmap-property-type",
      "decimal",
      "The property value is a decimal number.",
    ),
    /** The property value is a code as defined in the CodeSystem in ConceptMap.property.system. */
    Code(
      "code",
      "http://hl7.org/fhir/conceptmap-property-type",
      "code",
      "The property value is a code as defined in the CodeSystem in ConceptMap.property.system.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): PropertyType =
        when (code) {
          "Coding" -> Coding
          "string" -> String
          "integer" -> Integer
          "boolean" -> Boolean
          "dateTime" -> DateTime
          "decimal" -> Decimal
          "code" -> Code
          else -> throw IllegalArgumentException("Unknown code $code for enum PropertyType")
        }
    }
  }

  /** The type of a ConceptMap mapping attribute value. */
  public enum class ConceptMapmapAttributeType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The attribute value is a code defined in the code system in context. */
    Code(
      "code",
      "http://hl7.org/fhir/conceptmap-attribute-type",
      "code",
      "The attribute value is a code defined in the code system in context.",
    ),
    /** The attribute value is a code defined in a code system. */
    Coding(
      "Coding",
      "http://hl7.org/fhir/conceptmap-attribute-type",
      "Coding",
      "The attribute value is a code defined in a code system.",
    ),
    /** The attribute value is a string. */
    String(
      "string",
      "http://hl7.org/fhir/conceptmap-attribute-type",
      "string",
      "The attribute value is a string.",
    ),
    /** The attribute value is a boolean true | false. */
    Boolean(
      "boolean",
      "http://hl7.org/fhir/conceptmap-attribute-type",
      "boolean",
      "The attribute value is a boolean true | false.",
    ),
    /** The attribute is a Quantity (may represent an integer or a decimal with no units). */
    Quantity(
      "Quantity",
      "http://hl7.org/fhir/conceptmap-attribute-type",
      "Quantity",
      "The attribute is a Quantity (may represent an integer or a decimal with no units).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ConceptMapmapAttributeType =
        when (code) {
          "code" -> Code
          "Coding" -> Coding
          "string" -> String
          "boolean" -> Boolean
          "Quantity" -> Quantity
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ConceptMapmapAttributeType")
        }
    }
  }

  /** Defines which action to take if there is no match in the group. */
  public enum class ConceptMapGroupUnmappedMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Use the code as provided in the $translate request in one of the following input parameters:
     * sourceCode, sourceCoding, sourceCodeableConcept.
     */
    Use_Source_Code(
      "use-source-code",
      "http://hl7.org/fhir/conceptmap-unmapped-mode",
      "Use Provided Source Code",
      "Use the code as provided in the ${'$'}translate request in one of the following input parameters: sourceCode, sourceCoding, sourceCodeableConcept.",
    ),
    /** Use the code(s) explicitly provided in the group.unmapped 'code' or 'valueSet' element. */
    Fixed(
      "fixed",
      "http://hl7.org/fhir/conceptmap-unmapped-mode",
      "Fixed Code",
      "Use the code(s) explicitly provided in the group.unmapped 'code' or 'valueSet' element.",
    ),
    /** Use the map identified by the canonical URL in the url element. */
    Other_Map(
      "other-map",
      "http://hl7.org/fhir/conceptmap-unmapped-mode",
      "Other Map",
      "Use the map identified by the canonical URL in the url element.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ConceptMapGroupUnmappedMode =
        when (code) {
          "use-source-code" -> Use_Source_Code
          "fixed" -> Fixed
          "other-map" -> Other_Map
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum ConceptMapGroupUnmappedMode"
            )
        }
    }
  }
}
