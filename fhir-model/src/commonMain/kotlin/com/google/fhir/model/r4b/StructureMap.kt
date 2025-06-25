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

import com.google.fhir.model.r4b.serializers.StructureMapGroupInputSerializer
import com.google.fhir.model.r4b.serializers.StructureMapGroupRuleDependentSerializer
import com.google.fhir.model.r4b.serializers.StructureMapGroupRuleSerializer
import com.google.fhir.model.r4b.serializers.StructureMapGroupRuleSourceSerializer
import com.google.fhir.model.r4b.serializers.StructureMapGroupRuleTargetParameterSerializer
import com.google.fhir.model.r4b.serializers.StructureMapGroupRuleTargetSerializer
import com.google.fhir.model.r4b.serializers.StructureMapGroupSerializer
import com.google.fhir.model.r4b.serializers.StructureMapSerializer
import com.google.fhir.model.r4b.serializers.StructureMapStructureSerializer
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
   * An absolute URI that is used to identify this structure map when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this structure map is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the structure map is stored on different servers.
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
   * A formal identifier that is used to identify this structure map when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this structure map outside of FHIR, where it is not possible to use
   * the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the structure map when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the
   * structure map author and is not expected to be globally unique. For example, it might be a
   * timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different structure map instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the structure map with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the structure map. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the structure map.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this structure map. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of structure maps that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this structure map is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of structure maps that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the structure map was published. The date must change when
   * the business version changes and it must change if the status code changes. In addition, it
   * should change when the substantive content of the structure map changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the structure map. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the structure map.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the structure
   * map is the organization or individual primarily responsible for the maintenance and upkeep of
   * the structure map. This is not necessarily the same individual or organization that developed
   * and initially authored the content. The publisher is the primary point of contact for questions
   * or issues with the structure map. This item SHOULD be populated unless the information is
   * available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the structure map from a consumer's perspective.
   *
   * This description can be used to capture details such as why the structure map was built,
   * comments about misuse, instructions for clinical use and interpretation, literature references,
   * examples from the paper world, etc. It is not a rendering of the structure map as conveyed in
   * the 'text' field of the resource itself. This item SHOULD be populated unless the information
   * is available from context (e.g. the language of the structure map is presumed to be the
   * predominant language in the place the structure map was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate structure map instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the structure map is intended to be used.
   *
   * It may be possible for the structure map to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this structure map is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the structure map. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * structure map.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the structure map and/or its contents. Copyright statements
   * are generally legal restrictions on the use and publishing of the structure map.
   */
  public var copyright: Markdown? = null,
  /**
   * A structure definition used by this map. The structure definition may describe instances that
   * are converted, or the instances that are produced.
   *
   * It is not necessary for a structure map to identify any dependent structures, though not
   * listing them may restrict its usefulness.
   */
  public var structure: List<Structure>? = null,
  /** Other maps used by this map (canonical URLs). */
  public var `import`: List<Canonical?>? = null,
  /** Organizes the mapping into manageable chunks for human review/ease of maintenance. */
  public var group: List<Group>? = null,
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
    /** The canonical reference to the structure. */
    public var url: Canonical? = null,
    /** How the referenced structure is used in this mapping. */
    public var mode: Enumeration<StructureMapModelMode>? = null,
    /**
     * The name used for this type in the map.
     *
     * This is needed if both types have the same name (e.g. version conversion).
     */
    public var alias: String? = null,
    /** Documentation that describes how the structure is used in the mapping. */
    public var documentation: String? = null,
  ) : BackboneElement()

  /** Organizes the mapping into manageable chunks for human review/ease of maintenance. */
  @Serializable(with = StructureMapGroupSerializer::class)
  public class Group(
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
    /** A unique name for the group for the convenience of human readers. */
    public var name: Id? = null,
    /** Another group that this group adds rules to. */
    public var extends: Id? = null,
    /**
     * If this is the default rule set to apply for the source type or this combination of types.
     *
     * Not applicable if the underlying model is untyped. There can only be one default mapping for
     * any particular type combination.
     */
    public var typeMode: Enumeration<StructureMapGroupTypeMode>? = null,
    /**
     * Additional supporting documentation that explains the purpose of the group and the types of
     * mappings within it.
     */
    public var documentation: String? = null,
    /**
     * A name assigned to an instance of data. The instance must be provided when the mapping is
     * invoked.
     *
     * If no inputs are named, then the entry mappings are type based.
     */
    public var input: List<Input>? = null,
    /** Transform Rule from source to target. */
    public var rule: List<Rule>? = null,
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /** Name for this instance of data. */
      public var name: Id? = null,
      /** Type for this instance of data. */
      public var type: String? = null,
      /** Mode for this instance of data. */
      public var mode: Enumeration<StructureMapInputMode>? = null,
      /** Documentation for this instance of data. */
      public var documentation: String? = null,
    ) : BackboneElement()

    /** Transform Rule from source to target. */
    @Serializable(with = StructureMapGroupRuleSerializer::class)
    public class Rule(
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /** Name of the rule for internal references. */
      public var name: Id? = null,
      /** Source inputs to the mapping. */
      public var source: List<Source>? = null,
      /** Content to create because of this mapping rule. */
      public var target: List<Target>? = null,
      /** Rules contained in this rule. */
      public var rule: List<Rule?>? = null,
      /** Which other rules to apply in the context of this rule. */
      public var dependent: List<Dependent>? = null,
      /** Documentation for this instance of data. */
      public var documentation: String? = null,
    ) : BackboneElement() {
      /** Source inputs to the mapping. */
      @Serializable(with = StructureMapGroupRuleSourceSerializer::class)
      public class Source(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
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
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        /** Type or variable this rule applies to. */
        public var context: Id? = null,
        /**
         * Specified minimum cardinality for the element. This is optional; if present, it acts an
         * implicit check on the input content.
         */
        public var min: Integer? = null,
        /**
         * Specified maximum cardinality for the element - a number or a "*". This is optional; if
         * present, it acts an implicit check on the input content (* just serves as documentation;
         * it's the default value).
         */
        public var max: String? = null,
        /**
         * Specified type for the element. This works as a condition on the mapping - use for
         * polymorphic elements.
         */
        public var type: String? = null,
        /**
         * A value to use if there is no existing value in the source object.
         *
         * If there's a default value on an item that can repeat, it will only be used once.
         */
        public var defaultValue: DefaultValue? = null,
        /** Optional field for this source. */
        public var element: String? = null,
        /** How to handle the list mode for this element. */
        public var listMode: Enumeration<StructureMapSourceListMode>? = null,
        /** Named context for field, if a field is specified. */
        public var variable: Id? = null,
        /** FHIRPath expression - must be true or the rule does not apply. */
        public var condition: String? = null,
        /**
         * FHIRPath expression - must be true or the mapping engine throws an error instead of
         * completing.
         */
        public var check: String? = null,
        /**
         * A FHIRPath expression which specifies a message to put in the transform log when content
         * matching the source rule is found.
         *
         * This is typically used for recording that something Is not transformed to the target for
         * some reason.
         */
        public var logMessage: String? = null,
      ) : BackboneElement() {
        public sealed interface DefaultValue {
          public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

          public fun asBoolean(): Boolean? = this as? Boolean

          public fun asCanonical(): Canonical? = this as? Canonical

          public fun asCode(): Code? = this as? Code

          public fun asDate(): Date? = this as? Date

          public fun asDateTime(): DateTime? = this as? DateTime

          public fun asDecimal(): Decimal? = this as? Decimal

          public fun asId(): Id? = this as? Id

          public fun asInstant(): Instant? = this as? Instant

          public fun asInteger(): Integer? = this as? Integer

          public fun asMarkdown(): Markdown? = this as? Markdown

          public fun asOid(): Oid? = this as? Oid

          public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

          public fun asString(): String? = this as? String

          public fun asTime(): Time? = this as? Time

          public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

          public fun asUri(): Uri? = this as? Uri

          public fun asUrl(): Url? = this as? Url

          public fun asUuid(): Uuid? = this as? Uuid

          public fun asAddress(): Address? = this as? Address

          public fun asAge(): Age? = this as? Age

          public fun asAnnotation(): Annotation? = this as? Annotation

          public fun asAttachment(): Attachment? = this as? Attachment

          public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

          public fun asCoding(): Coding? = this as? Coding

          public fun asContactPoint(): ContactPoint? = this as? ContactPoint

          public fun asCount(): Count? = this as? Count

          public fun asDistance(): Distance? = this as? Distance

          public fun asDuration(): Duration? = this as? Duration

          public fun asHumanName(): HumanName? = this as? HumanName

          public fun asIdentifier(): Identifier? = this as? Identifier

          public fun asMoney(): Money? = this as? Money

          public fun asPeriod(): Period? = this as? Period

          public fun asQuantity(): Quantity? = this as? Quantity

          public fun asRange(): Range? = this as? Range

          public fun asRatio(): Ratio? = this as? Ratio

          public fun asReference(): Reference? = this as? Reference

          public fun asSampledData(): SampledData? = this as? SampledData

          public fun asSignature(): Signature? = this as? Signature

          public fun asTiming(): Timing? = this as? Timing

          public fun asContactDetail(): ContactDetail? = this as? ContactDetail

          public fun asContributor(): Contributor? = this as? Contributor

          public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

          public fun asExpression(): Expression? = this as? Expression

          public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

          public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

          public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

          public fun asUsageContext(): UsageContext? = this as? UsageContext

          public fun asDosage(): Dosage? = this as? Dosage

          public fun asMeta(): Meta? = this as? Meta

          public data class Base64Binary(
            public val `value`: com.google.fhir.model.r4b.Base64Binary
          ) : DefaultValue

          public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) :
            DefaultValue

          public data class Canonical(public val `value`: com.google.fhir.model.r4b.Canonical) :
            DefaultValue

          public data class Code(public val `value`: com.google.fhir.model.r4b.Code) : DefaultValue

          public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : DefaultValue

          public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
            DefaultValue

          public data class Decimal(public val `value`: com.google.fhir.model.r4b.Decimal) :
            DefaultValue

          public data class Id(public val `value`: com.google.fhir.model.r4b.Id) : DefaultValue

          public data class Instant(public val `value`: com.google.fhir.model.r4b.Instant) :
            DefaultValue

          public data class Integer(public val `value`: com.google.fhir.model.r4b.Integer) :
            DefaultValue

          public data class Markdown(public val `value`: com.google.fhir.model.r4b.Markdown) :
            DefaultValue

          public data class Oid(public val `value`: com.google.fhir.model.r4b.Oid) : DefaultValue

          public data class PositiveInt(public val `value`: com.google.fhir.model.r4b.PositiveInt) :
            DefaultValue

          public data class String(public val `value`: com.google.fhir.model.r4b.String) :
            DefaultValue

          public data class Time(public val `value`: com.google.fhir.model.r4b.Time) : DefaultValue

          public data class UnsignedInt(public val `value`: com.google.fhir.model.r4b.UnsignedInt) :
            DefaultValue

          public data class Uri(public val `value`: com.google.fhir.model.r4b.Uri) : DefaultValue

          public data class Url(public val `value`: com.google.fhir.model.r4b.Url) : DefaultValue

          public data class Uuid(public val `value`: com.google.fhir.model.r4b.Uuid) : DefaultValue

          public data class Address(public val `value`: com.google.fhir.model.r4b.Address) :
            DefaultValue

          public data class Age(public val `value`: com.google.fhir.model.r4b.Age) : DefaultValue

          public data class Annotation(public val `value`: com.google.fhir.model.r4b.Annotation) :
            DefaultValue

          public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
            DefaultValue

          public data class CodeableConcept(
            public val `value`: com.google.fhir.model.r4b.CodeableConcept
          ) : DefaultValue

          public data class Coding(public val `value`: com.google.fhir.model.r4b.Coding) :
            DefaultValue

          public data class ContactPoint(
            public val `value`: com.google.fhir.model.r4b.ContactPoint
          ) : DefaultValue

          public data class Count(public val `value`: com.google.fhir.model.r4b.Count) :
            DefaultValue

          public data class Distance(public val `value`: com.google.fhir.model.r4b.Distance) :
            DefaultValue

          public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) :
            DefaultValue

          public data class HumanName(public val `value`: com.google.fhir.model.r4b.HumanName) :
            DefaultValue

          public data class Identifier(public val `value`: com.google.fhir.model.r4b.Identifier) :
            DefaultValue

          public data class Money(public val `value`: com.google.fhir.model.r4b.Money) :
            DefaultValue

          public data class Period(public val `value`: com.google.fhir.model.r4b.Period) :
            DefaultValue

          public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) :
            DefaultValue

          public data class Range(public val `value`: com.google.fhir.model.r4b.Range) :
            DefaultValue

          public data class Ratio(public val `value`: com.google.fhir.model.r4b.Ratio) :
            DefaultValue

          public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
            DefaultValue

          public data class SampledData(public val `value`: com.google.fhir.model.r4b.SampledData) :
            DefaultValue

          public data class Signature(public val `value`: com.google.fhir.model.r4b.Signature) :
            DefaultValue

          public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) :
            DefaultValue

          public data class ContactDetail(
            public val `value`: com.google.fhir.model.r4b.ContactDetail
          ) : DefaultValue

          public data class Contributor(public val `value`: com.google.fhir.model.r4b.Contributor) :
            DefaultValue

          public data class DataRequirement(
            public val `value`: com.google.fhir.model.r4b.DataRequirement
          ) : DefaultValue

          public data class Expression(public val `value`: com.google.fhir.model.r4b.Expression) :
            DefaultValue

          public data class ParameterDefinition(
            public val `value`: com.google.fhir.model.r4b.ParameterDefinition
          ) : DefaultValue

          public data class RelatedArtifact(
            public val `value`: com.google.fhir.model.r4b.RelatedArtifact
          ) : DefaultValue

          public data class TriggerDefinition(
            public val `value`: com.google.fhir.model.r4b.TriggerDefinition
          ) : DefaultValue

          public data class UsageContext(
            public val `value`: com.google.fhir.model.r4b.UsageContext
          ) : DefaultValue

          public data class Dosage(public val `value`: com.google.fhir.model.r4b.Dosage) :
            DefaultValue

          public data class Meta(public val `value`: com.google.fhir.model.r4b.Meta) : DefaultValue

          public companion object {
            public fun from(
              base64BinaryValue: com.google.fhir.model.r4b.Base64Binary?,
              booleanValue: com.google.fhir.model.r4b.Boolean?,
              canonicalValue: com.google.fhir.model.r4b.Canonical?,
              codeValue: com.google.fhir.model.r4b.Code?,
              dateValue: com.google.fhir.model.r4b.Date?,
              dateTimeValue: com.google.fhir.model.r4b.DateTime?,
              decimalValue: com.google.fhir.model.r4b.Decimal?,
              idValue: com.google.fhir.model.r4b.Id?,
              instantValue: com.google.fhir.model.r4b.Instant?,
              integerValue: com.google.fhir.model.r4b.Integer?,
              markdownValue: com.google.fhir.model.r4b.Markdown?,
              oidValue: com.google.fhir.model.r4b.Oid?,
              positiveIntValue: com.google.fhir.model.r4b.PositiveInt?,
              stringValue: com.google.fhir.model.r4b.String?,
              timeValue: com.google.fhir.model.r4b.Time?,
              unsignedIntValue: com.google.fhir.model.r4b.UnsignedInt?,
              uriValue: com.google.fhir.model.r4b.Uri?,
              urlValue: com.google.fhir.model.r4b.Url?,
              uuidValue: com.google.fhir.model.r4b.Uuid?,
              AddressValue: com.google.fhir.model.r4b.Address?,
              AgeValue: com.google.fhir.model.r4b.Age?,
              AnnotationValue: com.google.fhir.model.r4b.Annotation?,
              AttachmentValue: com.google.fhir.model.r4b.Attachment?,
              CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
              CodingValue: com.google.fhir.model.r4b.Coding?,
              ContactPointValue: com.google.fhir.model.r4b.ContactPoint?,
              CountValue: com.google.fhir.model.r4b.Count?,
              DistanceValue: com.google.fhir.model.r4b.Distance?,
              DurationValue: com.google.fhir.model.r4b.Duration?,
              HumanNameValue: com.google.fhir.model.r4b.HumanName?,
              IdentifierValue: com.google.fhir.model.r4b.Identifier?,
              MoneyValue: com.google.fhir.model.r4b.Money?,
              PeriodValue: com.google.fhir.model.r4b.Period?,
              QuantityValue: com.google.fhir.model.r4b.Quantity?,
              RangeValue: com.google.fhir.model.r4b.Range?,
              RatioValue: com.google.fhir.model.r4b.Ratio?,
              ReferenceValue: com.google.fhir.model.r4b.Reference?,
              SampledDataValue: com.google.fhir.model.r4b.SampledData?,
              SignatureValue: com.google.fhir.model.r4b.Signature?,
              TimingValue: com.google.fhir.model.r4b.Timing?,
              ContactDetailValue: com.google.fhir.model.r4b.ContactDetail?,
              ContributorValue: com.google.fhir.model.r4b.Contributor?,
              DataRequirementValue: com.google.fhir.model.r4b.DataRequirement?,
              ExpressionValue: com.google.fhir.model.r4b.Expression?,
              ParameterDefinitionValue: com.google.fhir.model.r4b.ParameterDefinition?,
              RelatedArtifactValue: com.google.fhir.model.r4b.RelatedArtifact?,
              TriggerDefinitionValue: com.google.fhir.model.r4b.TriggerDefinition?,
              UsageContextValue: com.google.fhir.model.r4b.UsageContext?,
              DosageValue: com.google.fhir.model.r4b.Dosage?,
              MetaValue: com.google.fhir.model.r4b.Meta?,
            ): DefaultValue? {
              if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
              if (booleanValue != null) return Boolean(booleanValue)
              if (canonicalValue != null) return Canonical(canonicalValue)
              if (codeValue != null) return Code(codeValue)
              if (dateValue != null) return Date(dateValue)
              if (dateTimeValue != null) return DateTime(dateTimeValue)
              if (decimalValue != null) return Decimal(decimalValue)
              if (idValue != null) return Id(idValue)
              if (instantValue != null) return Instant(instantValue)
              if (integerValue != null) return Integer(integerValue)
              if (markdownValue != null) return Markdown(markdownValue)
              if (oidValue != null) return Oid(oidValue)
              if (positiveIntValue != null) return PositiveInt(positiveIntValue)
              if (stringValue != null) return String(stringValue)
              if (timeValue != null) return Time(timeValue)
              if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
              if (uriValue != null) return Uri(uriValue)
              if (urlValue != null) return Url(urlValue)
              if (uuidValue != null) return Uuid(uuidValue)
              if (AddressValue != null) return Address(AddressValue)
              if (AgeValue != null) return Age(AgeValue)
              if (AnnotationValue != null) return Annotation(AnnotationValue)
              if (AttachmentValue != null) return Attachment(AttachmentValue)
              if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
              if (CodingValue != null) return Coding(CodingValue)
              if (ContactPointValue != null) return ContactPoint(ContactPointValue)
              if (CountValue != null) return Count(CountValue)
              if (DistanceValue != null) return Distance(DistanceValue)
              if (DurationValue != null) return Duration(DurationValue)
              if (HumanNameValue != null) return HumanName(HumanNameValue)
              if (IdentifierValue != null) return Identifier(IdentifierValue)
              if (MoneyValue != null) return Money(MoneyValue)
              if (PeriodValue != null) return Period(PeriodValue)
              if (QuantityValue != null) return Quantity(QuantityValue)
              if (RangeValue != null) return Range(RangeValue)
              if (RatioValue != null) return Ratio(RatioValue)
              if (ReferenceValue != null) return Reference(ReferenceValue)
              if (SampledDataValue != null) return SampledData(SampledDataValue)
              if (SignatureValue != null) return Signature(SignatureValue)
              if (TimingValue != null) return Timing(TimingValue)
              if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
              if (ContributorValue != null) return Contributor(ContributorValue)
              if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
              if (ExpressionValue != null) return Expression(ExpressionValue)
              if (ParameterDefinitionValue != null)
                return ParameterDefinition(ParameterDefinitionValue)
              if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
              if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
              if (UsageContextValue != null) return UsageContext(UsageContextValue)
              if (DosageValue != null) return Dosage(DosageValue)
              if (MetaValue != null) return Meta(MetaValue)
              return null
            }
          }
        }
      }

      /** Content to create because of this mapping rule. */
      @Serializable(with = StructureMapGroupRuleTargetSerializer::class)
      public class Target(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
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
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        /** Type or variable this rule applies to. */
        public var context: Id? = null,
        /** How to interpret the context. */
        public var contextType: Enumeration<StructureMapContextType>? = null,
        /** Field to create in the context. */
        public var element: String? = null,
        /** Named context for field, if desired, and a field is specified. */
        public var variable: Id? = null,
        /** If field is a list, how to manage the list. */
        public var listMode: List<Enumeration<StructureMapTargetListMode>>? = null,
        /** Internal rule reference for shared list items. */
        public var listRuleId: Id? = null,
        /** How the data is copied / created. */
        public var transform: Enumeration<StructureMapTransform>? = null,
        /** Parameters to the transform. */
        public var parameter: List<Parameter>? = null,
      ) : BackboneElement() {
        /** Parameters to the transform. */
        @Serializable(with = StructureMapGroupRuleTargetParameterSerializer::class)
        public class Parameter(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and manageable, there is
           * a strict set of governance applied to the definition and use of extensions. Though any
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
           * extensions safe and manageable, there is a strict set of governance applied to the
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
          /** Parameter value - variable or literal. */
          public var `value`: Value? = null,
        ) : BackboneElement() {
          public sealed interface Value {
            public fun asId(): Id? = this as? Id

            public fun asString(): String? = this as? String

            public fun asBoolean(): Boolean? = this as? Boolean

            public fun asInteger(): Integer? = this as? Integer

            public fun asDecimal(): Decimal? = this as? Decimal

            public data class Id(public val `value`: com.google.fhir.model.r4b.Id) : Value

            public data class String(public val `value`: com.google.fhir.model.r4b.String) : Value

            public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) :
              Value

            public data class Integer(public val `value`: com.google.fhir.model.r4b.Integer) :
              Value

            public data class Decimal(public val `value`: com.google.fhir.model.r4b.Decimal) :
              Value

            public companion object {
              public fun from(
                idValue: com.google.fhir.model.r4b.Id?,
                stringValue: com.google.fhir.model.r4b.String?,
                booleanValue: com.google.fhir.model.r4b.Boolean?,
                integerValue: com.google.fhir.model.r4b.Integer?,
                decimalValue: com.google.fhir.model.r4b.Decimal?,
              ): Value? {
                if (idValue != null) return Id(idValue)
                if (stringValue != null) return String(stringValue)
                if (booleanValue != null) return Boolean(booleanValue)
                if (integerValue != null) return Integer(integerValue)
                if (decimalValue != null) return Decimal(decimalValue)
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
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
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
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        /** Name of a rule or group to apply. */
        public var name: Id? = null,
        /** Variable to pass to the rule or group. */
        public var variable: List<String?>? = null,
      ) : BackboneElement()
    }
  }

  /** How the referenced structure is used in this mapping. */
  public enum class StructureMapModelMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * This structure describes an instance passed to the mapping engine that is used a source of
     * data.
     */
    Source(
      "source",
      "http://hl7.org/fhir/map-model-mode",
      "Source Structure Definition",
      "This structure describes an instance passed to the mapping engine that is used a source of data.",
    ),
    /**
     * This structure describes an instance that the mapping engine may ask for that is used a
     * source of data.
     */
    Queried(
      "queried",
      "http://hl7.org/fhir/map-model-mode",
      "Queried Structure Definition",
      "This structure describes an instance that the mapping engine may ask for that is used a source of data.",
    ),
    /**
     * This structure describes an instance passed to the mapping engine that is used a target of
     * data.
     */
    Target(
      "target",
      "http://hl7.org/fhir/map-model-mode",
      "Target Structure Definition",
      "This structure describes an instance passed to the mapping engine that is used a target of data.",
    ),
    /**
     * This structure describes an instance that the mapping engine may ask to create that is used a
     * target of data.
     */
    Produced(
      "produced",
      "http://hl7.org/fhir/map-model-mode",
      "Produced Structure Definition",
      "This structure describes an instance that the mapping engine may ask to create that is used a target of data.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
    private val definition: kotlin.String?,
  ) {
    /** This group is not a default group for the types. */
    None(
      "none",
      "http://hl7.org/fhir/map-group-type-mode",
      "Not a Default",
      "This group is not a default group for the types.",
    ),
    /**
     * This group is a default mapping group for the specified types and for the primary source
     * type.
     */
    Types(
      "types",
      "http://hl7.org/fhir/map-group-type-mode",
      "Default for Type Combination",
      "This group is a default mapping group for the specified types and for the primary source type.",
    ),
    /** This group is a default mapping group for the specified types. */
    Type_And_Types(
      "type-and-types",
      "http://hl7.org/fhir/map-group-type-mode",
      "Default for type + combination",
      "This group is a default mapping group for the specified types.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapGroupTypeMode =
        when (code) {
          "none" -> None
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
    private val definition: kotlin.String?,
  ) {
    /** Names an input instance used a source for mapping. */
    Source(
      "source",
      "http://hl7.org/fhir/map-input-mode",
      "Source Instance",
      "Names an input instance used a source for mapping.",
    ),
    /** Names an instance that is being populated. */
    Target(
      "target",
      "http://hl7.org/fhir/map-input-mode",
      "Target Instance",
      "Names an instance that is being populated.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
    private val definition: kotlin.String?,
  ) {
    /** Only process this rule for the first in the list. */
    First(
      "first",
      "http://hl7.org/fhir/map-source-list-mode",
      "First",
      "Only process this rule for the first in the list.",
    ),
    /** Process this rule for all but the first. */
    Not_First(
      "not_first",
      "http://hl7.org/fhir/map-source-list-mode",
      "All but the first",
      "Process this rule for all but the first.",
    ),
    /** Only process this rule for the last in the list. */
    Last(
      "last",
      "http://hl7.org/fhir/map-source-list-mode",
      "Last",
      "Only process this rule for the last in the list.",
    ),
    /** Process this rule for all but the last. */
    Not_Last(
      "not_last",
      "http://hl7.org/fhir/map-source-list-mode",
      "All but the last",
      "Process this rule for all but the last.",
    ),
    /** Only process this rule is there is only item. */
    Only_One(
      "only_one",
      "http://hl7.org/fhir/map-source-list-mode",
      "Enforce only one",
      "Only process this rule is there is only item.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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

  /** How to interpret the context. */
  public enum class StructureMapContextType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The context specifies a type. */
    Type("type", "http://hl7.org/fhir/map-context-type", "Type", "The context specifies a type."),
    /** The context specifies a variable. */
    Variable(
      "variable",
      "http://hl7.org/fhir/map-context-type",
      "Variable",
      "The context specifies a variable.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapContextType =
        when (code) {
          "type" -> Type
          "variable" -> Variable
          else ->
            throw IllegalArgumentException("Unknown code $code for enum StructureMapContextType")
        }
    }
  }

  /** If field is a list, how to manage the production. */
  public enum class StructureMapTargetListMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * when the target list is being assembled, the items for this rule go first. If more than one
     * rule defines a first item (for a given instance of mapping) then this is an error.
     */
    First(
      "first",
      "http://hl7.org/fhir/map-target-list-mode",
      "First",
      "when the target list is being assembled, the items for this rule go first. If more than one rule defines a first item (for a given instance of mapping) then this is an error.",
    ),
    /**
     * the target instance is shared with the target instances generated by another rule (up to the
     * first common n items, then create new ones).
     */
    Share(
      "share",
      "http://hl7.org/fhir/map-target-list-mode",
      "Share",
      "the target instance is shared with the target instances generated by another rule (up to the first common n items, then create new ones).",
    ),
    /**
     * when the target list is being assembled, the items for this rule go last. If more than one
     * rule defines a last item (for a given instance of mapping) then this is an error.
     */
    Last(
      "last",
      "http://hl7.org/fhir/map-target-list-mode",
      "Last",
      "when the target list is being assembled, the items for this rule go last. If more than one rule defines a last item (for a given instance of mapping) then this is an error.",
    ),
    /** re-use the first item in the list, and keep adding content to it. */
    Collate(
      "collate",
      "http://hl7.org/fhir/map-target-list-mode",
      "Collate",
      "re-use the first item in the list, and keep adding content to it.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): StructureMapTargetListMode =
        when (code) {
          "first" -> First
          "share" -> Share
          "last" -> Last
          "collate" -> Collate
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
    private val definition: kotlin.String?,
  ) {
    /**
     * create(type : string) - type is passed through to the application on the standard API, and
     * must be known by it.
     */
    Create(
      "create",
      "http://hl7.org/fhir/map-transform",
      "create",
      "create(type : string) - type is passed through to the application on the standard API, and must be known by it.",
    ),
    /** copy(source). */
    Copy("copy", "http://hl7.org/fhir/map-transform", "copy", "copy(source)."),
    /** truncate(source, length) - source must be stringy type. */
    Truncate(
      "truncate",
      "http://hl7.org/fhir/map-transform",
      "truncate",
      "truncate(source, length) - source must be stringy type.",
    ),
    /**
     * escape(source, fmt1, fmt2) - change source from one kind of escaping to another (plain, java,
     * xml, json). note that this is for when the string itself is escaped.
     */
    Escape(
      "escape",
      "http://hl7.org/fhir/map-transform",
      "escape",
      "escape(source, fmt1, fmt2) - change source from one kind of escaping to another (plain, java, xml, json). note that this is for when the string itself is escaped.",
    ),
    /**
     * cast(source, type?) - case source from one type to another. target type can be left as
     * implicit if there is one and only one target type known.
     */
    Cast(
      "cast",
      "http://hl7.org/fhir/map-transform",
      "cast",
      "cast(source, type?) - case source from one type to another. target type can be left as implicit if there is one and only one target type known.",
    ),
    /** append(source...) - source is element or string. */
    Append(
      "append",
      "http://hl7.org/fhir/map-transform",
      "append",
      "append(source...) - source is element or string.",
    ),
    /** translate(source, uri_of_map) - use the translate operation. */
    Translate(
      "translate",
      "http://hl7.org/fhir/map-transform",
      "translate",
      "translate(source, uri_of_map) - use the translate operation.",
    ),
    /** reference(source : object) - return a string that references the provided tree properly. */
    Reference(
      "reference",
      "http://hl7.org/fhir/map-transform",
      "reference",
      "reference(source : object) - return a string that references the provided tree properly.",
    ),
    /** Perform a date operation. *Parameters to be documented*. */
    DateOp(
      "dateOp",
      "http://hl7.org/fhir/map-transform",
      "dateOp",
      "Perform a date operation. *Parameters to be documented*.",
    ),
    /** Generate a random UUID (in lowercase). No Parameters. */
    Uuid(
      "uuid",
      "http://hl7.org/fhir/map-transform",
      "uuid",
      "Generate a random UUID (in lowercase). No Parameters.",
    ),
    /**
     * Return the appropriate string to put in a reference that refers to the resource provided as a
     * parameter.
     */
    Pointer(
      "pointer",
      "http://hl7.org/fhir/map-transform",
      "pointer",
      "Return the appropriate string to put in a reference that refers to the resource provided as a parameter.",
    ),
    /** Execute the supplied FHIRPath expression and use the value returned by that. */
    Evaluate(
      "evaluate",
      "http://hl7.org/fhir/map-transform",
      "evaluate",
      "Execute the supplied FHIRPath expression and use the value returned by that.",
    ),
    /** Create a CodeableConcept. Parameters = (text) or (system. Code[, display]). */
    Cc(
      "cc",
      "http://hl7.org/fhir/map-transform",
      "cc",
      "Create a CodeableConcept. Parameters = (text) or (system. Code[, display]).",
    ),
    /** Create a Coding. Parameters = (system. Code[, display]). */
    C(
      "c",
      "http://hl7.org/fhir/map-transform",
      "c",
      "Create a Coding. Parameters = (system. Code[, display]).",
    ),
    /**
     * Create a quantity. Parameters = (text) or (value, unit, [system, code]) where text is the
     * natural representation e.g. [comparator]value[space]unit.
     */
    Qty(
      "qty",
      "http://hl7.org/fhir/map-transform",
      "qty",
      "Create a quantity. Parameters = (text) or (value, unit, [system, code]) where text is the natural representation e.g. [comparator]value[space]unit.",
    ),
    /**
     * Create an identifier. Parameters = (system, value[, type]) where type is a code from the
     * identifier type value set.
     */
    Id(
      "id",
      "http://hl7.org/fhir/map-transform",
      "id",
      "Create an identifier. Parameters = (system, value[, type]) where type is a code from the identifier type value set.",
    ),
    /**
     * Create a contact details. Parameters = (value) or (system, value). If no system is provided,
     * the system should be inferred from the content of the value.
     */
    Cp(
      "cp",
      "http://hl7.org/fhir/map-transform",
      "cp",
      "Create a contact details. Parameters = (value) or (system, value). If no system is provided, the system should be inferred from the content of the value.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
