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

import com.google.fhir.model.r5.serializers.StructureMapConstSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupInputSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupRuleDependentSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupRuleSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupRuleSourceSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupRuleTargetParameterSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupRuleTargetParameterValueSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupRuleTargetSerializer
import com.google.fhir.model.r5.serializers.StructureMapGroupSerializer
import com.google.fhir.model.r5.serializers.StructureMapSerializer
import com.google.fhir.model.r5.serializers.StructureMapStructureSerializer
import com.google.fhir.model.r5.serializers.StructureMapVersionAlgorithmSerializer
import com.google.fhir.model.r5.terminologies.PublicationStatus
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A Map of relationships between 2 structures that can be used to transform data. */
@Serializable(with = StructureMapSerializer::class)
@SerialName("StructureMap")
public data class StructureMap(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override val id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override val meta: Meta? = null,
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
  override val implicitRules: Uri? = null,
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
  override val language: Code? = null,
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
  override val text: Narrative? = null,
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
  override val contained: List<Resource> = listOf(),
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
  override val extension: List<Extension> = listOf(),
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
  override val modifierExtension: List<Extension> = listOf(),
  /**
   * An absolute URI that is used to identify this structure map when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * structure map is (or will be) published. This URL can be the target of a canonical reference.
   * It SHALL remain the same when the structure map is stored on different servers.
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
  public val url: Uri,
  /**
   * A formal identifier that is used to identify this structure map when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this structure map outside of FHIR, where it is not possible to use
   * the logical URI.
   */
  public val identifier: List<Identifier> = listOf(),
  /**
   * The identifier that is used to identify this version of the structure map when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the
   * structure map author and is not expected to be globally unique. For example, it might be a
   * timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different structure map instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the structure map with the format [url]|[version]. The version
   * SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
   */
  public val version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which is more current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 and a 0 if the version ordering can't be successfully be
   * determined.
   */
  public val versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the structure map. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public val name: String,
  /**
   * A short, descriptive, user-friendly title for the structure map.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public val title: String? = null,
  /**
   * The status of this structure map. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of structure maps that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this structure map is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of structure maps that are appropriate for use versus not.
   */
  public val experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the structure map was last significantly changed. The date
   * must change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the structure map changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the structure map. Additional specific dates may be added
   * as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the structure map.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the structure
   * map is the organization or individual primarily responsible for the maintenance and upkeep of
   * the structure map. This is not necessarily the same individual or organization that developed
   * and initially authored the content. The publisher is the primary point of contact for questions
   * or issues with the structure map. This item SHOULD be populated unless the information is
   * available from context.
   */
  public val publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public val contact: List<ContactDetail> = listOf(),
  /**
   * A free text natural language description of the structure map from a consumer's perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the structure map as conveyed in the 'text' field of the resource itself.
   * This item SHOULD be populated unless the information is available from context (e.g. the
   * language of the structure map is presumed to be the predominant language in the place the
   * structure map was created).
   */
  public val description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate structure map instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public val useContext: List<UsageContext> = listOf(),
  /**
   * A legal or geographic region in which the structure map is intended to be used.
   *
   * It may be possible for the structure map to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public val jurisdiction: List<CodeableConcept> = listOf(),
  /**
   * Explanation of why this structure map is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the structure map. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * structure map.
   */
  public val purpose: Markdown? = null,
  /**
   * A copyright statement relating to the structure map and/or its contents. Copyright statements
   * are generally legal restrictions on the use and publishing of the structure map.
   *
   * ...
   */
  public val copyright: Markdown? = null,
  /**
   * A short string (<50 characters), suitable for inclusion in a page footer that identifies the
   * copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All
   * rights reserved', 'Some rights reserved').
   *
   * The (c) symbol should NOT be included in this string. It will be added by software when
   * rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in
   * the more general 'copyright' element.
   */
  public val copyrightLabel: String? = null,
  /**
   * A structure definition used by this map. The structure definition may describe instances that
   * are converted, or the instances that are produced.
   *
   * It is not necessary for a structure map to identify any dependent structures, though not
   * listing them may restrict its usefulness.
   */
  public val structure: List<Structure> = listOf(),
  /** Other maps used by this map (canonical URLs). */
  public val `import`: List<Canonical> = listOf(),
  /** Definition of a constant value used in the map rules. */
  public val `const`: List<Const> = listOf(),
  /** Organizes the mapping into managable chunks for human review/ease of maintenance. */
  public val group: List<Group> = listOf(),
) : DomainResource() {
  /**
   * A structure definition used by this map. The structure definition may describe instances that
   * are converted, or the instances that are produced.
   */
  @Serializable(with = StructureMapStructureSerializer::class)
  public class Structure(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** The canonical reference to the structure. */
    public val url: Canonical,
    /** How the referenced structure is used in this mapping. */
    public val mode: Enumeration<StructureMapModelMode>,
    /**
     * The name used for this type in the map.
     *
     * This is needed if both types have the same name (e.g. version conversion).
     */
    public val alias: String? = null,
    /** Documentation that describes how the structure is used in the mapping. */
    public val documentation: String? = null,
  ) : BackboneElement()

  /** Definition of a constant value used in the map rules. */
  @Serializable(with = StructureMapConstSerializer::class)
  public class Const(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** Other maps used by this map (canonical URLs). */
    public val name: Id? = null,
    /** A FHIRPath expression that is the value of this variable. */
    public val `value`: String? = null,
  ) : BackboneElement()

  /** Organizes the mapping into managable chunks for human review/ease of maintenance. */
  @Serializable(with = StructureMapGroupSerializer::class)
  public class Group(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** A unique name for the group for the convenience of human readers. */
    public val name: Id,
    /** Another group that this group adds rules to. */
    public val extends: Id? = null,
    /**
     * If this is the default rule set to apply for the source type or this combination of types.
     *
     * Not applicable if the underlying model is untyped. There can only be one default mapping for
     * any particular type combination.
     */
    public val typeMode: Enumeration<StructureMapGroupTypeMode>? = null,
    /**
     * Additional supporting documentation that explains the purpose of the group and the types of
     * mappings within it.
     */
    public val documentation: String? = null,
    /**
     * A name assigned to an instance of data. The instance must be provided when the mapping is
     * invoked.
     *
     * If no inputs are named, then the entry mappings are type based.
     */
    public val input: List<Input> = listOf(),
    /** Transform Rule from source to target. */
    public val rule: List<Rule> = listOf(),
  ) : BackboneElement() {
    /**
     * A name assigned to an instance of data. The instance must be provided when the mapping is
     * invoked.
     */
    @Serializable(with = StructureMapGroupInputSerializer::class)
    public class Input(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** Name for this instance of data. */
      public val name: Id,
      /** Type for this instance of data. */
      public val type: String? = null,
      /** Mode for this instance of data. */
      public val mode: Enumeration<StructureMapInputMode>,
      /** Documentation for this instance of data. */
      public val documentation: String? = null,
    ) : BackboneElement()

    /** Transform Rule from source to target. */
    @Serializable(with = StructureMapGroupRuleSerializer::class)
    public class Rule(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: kotlin.String? = null,
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
      override val extension: List<Extension> = listOf(),
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
      override val modifierExtension: List<Extension> = listOf(),
      /** Name of the rule for internal references. */
      public val name: Id? = null,
      /** Source inputs to the mapping. */
      public val source: List<Source> = listOf(),
      /** Content to create because of this mapping rule. */
      public val target: List<Target> = listOf(),
      /** Rules contained in this rule. */
      public val rule: List<Rule> = listOf(),
      /** Which other rules to apply in the context of this rule. */
      public val dependent: List<Dependent> = listOf(),
      /** Documentation for this instance of data. */
      public val documentation: String? = null,
    ) : BackboneElement() {
      /** Source inputs to the mapping. */
      @Serializable(with = StructureMapGroupRuleSourceSerializer::class)
      public class Source(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override val id: kotlin.String? = null,
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
        override val extension: List<Extension> = listOf(),
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
        override val modifierExtension: List<Extension> = listOf(),
        /** Type or variable this rule applies to. */
        public val context: Id,
        /**
         * Specified minimum cardinality for the element. This is optional; if present, it acts an
         * implicit check on the input content.
         */
        public val min: Integer? = null,
        /**
         * Specified maximum cardinality for the element - a number or a "*". This is optional; if
         * present, it acts an implicit check on the input content (* just serves as documentation;
         * it's the default value).
         */
        public val max: String? = null,
        /**
         * Specified type for the element. This works as a condition on the mapping - use for
         * polymorphic elements.
         */
        public val type: String? = null,
        /**
         * A value to use if there is no existing value in the source object.
         *
         * If there's a default value on an item that can repeat, it will only be used once.
         */
        public val defaultValue: String? = null,
        /** Optional field for this source. */
        public val element: String? = null,
        /** How to handle the list mode for this element. */
        public val listMode: Enumeration<StructureMapSourceListMode>? = null,
        /** Named context for field, if a field is specified. */
        public val variable: Id? = null,
        /** FHIRPath expression - must be true or the rule does not apply. */
        public val condition: String? = null,
        /**
         * FHIRPath expression - must be true or the mapping engine throws an error instead of
         * completing.
         */
        public val check: String? = null,
        /**
         * A FHIRPath expression which specifies a message to put in the transform log when content
         * matching the source rule is found.
         *
         * This is typically used for recording that something Is not transformed to the target for
         * some reason.
         */
        public val logMessage: String? = null,
      ) : BackboneElement()

      /** Content to create because of this mapping rule. */
      @Serializable(with = StructureMapGroupRuleTargetSerializer::class)
      public class Target(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override val id: kotlin.String? = null,
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
        override val extension: List<Extension> = listOf(),
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
        override val modifierExtension: List<Extension> = listOf(),
        /** Variable this rule applies to. */
        public val context: String? = null,
        /** Field to create in the context. */
        public val element: String? = null,
        /** Named context for field, if desired, and a field is specified. */
        public val variable: Id? = null,
        /** If field is a list, how to manage the list. */
        public val listMode: List<Enumeration<StructureMapTargetListMode>> = listOf(),
        /** Internal rule reference for shared list items. */
        public val listRuleId: Id? = null,
        /** How the data is copied / created. */
        public val transform: Enumeration<StructureMapTransform>? = null,
        /** Parameters to the transform. */
        public val parameter: List<Parameter> = listOf(),
      ) : BackboneElement() {
        /** Parameters to the transform. */
        @Serializable(with = StructureMapGroupRuleTargetParameterSerializer::class)
        public class Parameter(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override val id: kotlin.String? = null,
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
          override val extension: List<Extension> = listOf(),
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
          override val modifierExtension: List<Extension> = listOf(),
          /** Parameter value - variable or literal. */
          public val `value`: Value,
        ) : BackboneElement() {
          @Serializable(with = StructureMapGroupRuleTargetParameterValueSerializer::class)
          public sealed interface Value {
            public fun asId(): Id? = this as? Id

            public fun asString(): String? = this as? String

            public fun asBoolean(): Boolean? = this as? Boolean

            public fun asInteger(): Integer? = this as? Integer

            public fun asDecimal(): Decimal? = this as? Decimal

            public fun asDate(): Date? = this as? Date

            public fun asTime(): Time? = this as? Time

            public fun asDateTime(): DateTime? = this as? DateTime

            public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Value

            public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

            public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

            public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

            public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

            public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

            public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

            public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) :
              Value

            public companion object {
              internal fun from(
                idValue: com.google.fhir.model.r5.Id?,
                stringValue: com.google.fhir.model.r5.String?,
                booleanValue: com.google.fhir.model.r5.Boolean?,
                integerValue: com.google.fhir.model.r5.Integer?,
                decimalValue: com.google.fhir.model.r5.Decimal?,
                dateValue: com.google.fhir.model.r5.Date?,
                timeValue: com.google.fhir.model.r5.Time?,
                dateTimeValue: com.google.fhir.model.r5.DateTime?,
              ): Value? {
                if (idValue != null) return Id(idValue)
                if (stringValue != null) return String(stringValue)
                if (booleanValue != null) return Boolean(booleanValue)
                if (integerValue != null) return Integer(integerValue)
                if (decimalValue != null) return Decimal(decimalValue)
                if (dateValue != null) return Date(dateValue)
                if (timeValue != null) return Time(timeValue)
                if (dateTimeValue != null) return DateTime(dateTimeValue)
                return null
              }
            }
          }
        }
      }

      /** Which other rules to apply in the context of this rule. */
      @Serializable(with = StructureMapGroupRuleDependentSerializer::class)
      public class Dependent(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override val id: kotlin.String? = null,
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
        override val extension: List<Extension> = listOf(),
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
        override val modifierExtension: List<Extension> = listOf(),
        /** Name of a rule or group to apply. */
        public val name: Id,
        /** Parameter to pass to the rule or group. */
        public val parameter: List<Target.Parameter> = listOf(),
      ) : BackboneElement()
    }
  }

  @Serializable(with = StructureMapVersionAlgorithmSerializer::class)
  public sealed interface VersionAlgorithm {
    public fun asString(): String? = this as? String

    public fun asCoding(): Coding? = this as? Coding

    public data class String(public val `value`: com.google.fhir.model.r5.String) :
      VersionAlgorithm

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) :
      VersionAlgorithm

    public companion object {
      internal fun from(
        stringValue: com.google.fhir.model.r5.String?,
        codingValue: com.google.fhir.model.r5.Coding?,
      ): VersionAlgorithm? {
        if (stringValue != null) return String(stringValue)
        if (codingValue != null) return Coding(codingValue)
        return null
      }
    }
  }

  /** How the referenced structure is used in this mapping. */
  public enum class StructureMapModelMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Source("source", "http://hl7.org/fhir/map-model-mode", "Source Structure Definition"),
    Queried("queried", "http://hl7.org/fhir/map-model-mode", "Queried Structure Definition"),
    Target("target", "http://hl7.org/fhir/map-model-mode", "Target Structure Definition"),
    Produced("produced", "http://hl7.org/fhir/map-model-mode", "Produced Structure Definition");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapModelMode =
        when (code) {
          "source" -> Source
          "queried" -> Queried
          "target" -> Target
          "produced" -> Produced
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapModelMode")
        }
    }
  }

  /** If this is the default rule set to apply for the source type, or this combination of types. */
  public enum class StructureMapGroupTypeMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Types("types", "http://hl7.org/fhir/map-group-type-mode", "Default for Type Combination"),
    Type_And_Types(
      "type-and-types",
      "http://hl7.org/fhir/map-group-type-mode",
      "Default for type + combination",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapGroupTypeMode =
        when (code) {
          "types" -> Types
          "type-and-types" -> Type_And_Types
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapGroupTypeMode")
        }
    }
  }

  /** Mode for this instance of data. */
  public enum class StructureMapInputMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Source("source", "http://hl7.org/fhir/map-input-mode", "Source Instance"),
    Target("target", "http://hl7.org/fhir/map-input-mode", "Target Instance");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapInputMode =
        when (code) {
          "source" -> Source
          "target" -> Target
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapInputMode")
        }
    }
  }

  /** If field is a list, how to manage the source. */
  public enum class StructureMapSourceListMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    First("first", "http://hl7.org/fhir/map-source-list-mode", "First"),
    Not_First("not_first", "http://hl7.org/fhir/map-source-list-mode", "All but the first"),
    Last("last", "http://hl7.org/fhir/map-source-list-mode", "Last"),
    Not_Last("not_last", "http://hl7.org/fhir/map-source-list-mode", "All but the last"),
    Only_One("only_one", "http://hl7.org/fhir/map-source-list-mode", "Enforce only one");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapSourceListMode =
        when (code) {
          "first" -> First
          "not_first" -> Not_First
          "last" -> Last
          "not_last" -> Not_Last
          "only_one" -> Only_One
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapSourceListMode")
        }
    }
  }

  /** If field is a list, how to manage the production. */
  public enum class StructureMapTargetListMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    First("first", "http://hl7.org/fhir/map-target-list-mode", "First"),
    Share("share", "http://hl7.org/fhir/map-target-list-mode", "Share"),
    Last("last", "http://hl7.org/fhir/map-target-list-mode", "Last"),
    Single("single", "http://hl7.org/fhir/map-target-list-mode", "single");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapTargetListMode =
        when (code) {
          "first" -> First
          "share" -> Share
          "last" -> Last
          "single" -> Single
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapTargetListMode")
        }
    }
  }

  /** How data is copied/created. */
  public enum class StructureMapTransform(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Create("create", "http://hl7.org/fhir/map-transform", "create"),
    Copy("copy", "http://hl7.org/fhir/map-transform", "copy"),
    Truncate("truncate", "http://hl7.org/fhir/map-transform", "truncate"),
    Escape("escape", "http://hl7.org/fhir/map-transform", "escape"),
    Cast("cast", "http://hl7.org/fhir/map-transform", "cast"),
    Append("append", "http://hl7.org/fhir/map-transform", "append"),
    Translate("translate", "http://hl7.org/fhir/map-transform", "translate"),
    Reference("reference", "http://hl7.org/fhir/map-transform", "reference"),
    DateOp("dateOp", "http://hl7.org/fhir/map-transform", "dateOp"),
    Uuid("uuid", "http://hl7.org/fhir/map-transform", "uuid"),
    Pointer("pointer", "http://hl7.org/fhir/map-transform", "pointer"),
    Evaluate("evaluate", "http://hl7.org/fhir/map-transform", "evaluate"),
    Cc("cc", "http://hl7.org/fhir/map-transform", "cc"),
    C("c", "http://hl7.org/fhir/map-transform", "c"),
    Qty("qty", "http://hl7.org/fhir/map-transform", "qty"),
    Id("id", "http://hl7.org/fhir/map-transform", "id"),
    Cp("cp", "http://hl7.org/fhir/map-transform", "cp");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapTransform =
        when (code) {
          "create" -> Create
          "copy" -> Copy
          "truncate" -> Truncate
          "escape" -> Escape
          "cast" -> Cast
          "append" -> Append
          "translate" -> Translate
          "reference" -> Reference
          "dateOp" -> DateOp
          "uuid" -> Uuid
          "pointer" -> Pointer
          "evaluate" -> Evaluate
          "cc" -> Cc
          "c" -> C
          "qty" -> Qty
          "id" -> Id
          "cp" -> Cp
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapTransform")
        }
    }
  }
}
