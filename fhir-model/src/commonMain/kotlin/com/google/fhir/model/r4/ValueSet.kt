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

import com.google.fhir.model.r4.serializers.ValueSetComposeIncludeConceptDesignationSerializer
import com.google.fhir.model.r4.serializers.ValueSetComposeIncludeConceptSerializer
import com.google.fhir.model.r4.serializers.ValueSetComposeIncludeFilterSerializer
import com.google.fhir.model.r4.serializers.ValueSetComposeIncludeSerializer
import com.google.fhir.model.r4.serializers.ValueSetComposeSerializer
import com.google.fhir.model.r4.serializers.ValueSetExpansionContainsSerializer
import com.google.fhir.model.r4.serializers.ValueSetExpansionParameterSerializer
import com.google.fhir.model.r4.serializers.ValueSetExpansionSerializer
import com.google.fhir.model.r4.serializers.ValueSetSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems,
 * intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions
 * and their use in [coded elements](terminologies.html).
 */
@Serializable(with = ValueSetSerializer::class)
@SerialName("ValueSet")
public data class ValueSet(
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
   * An absolute URI that is used to identify this value set when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this value set is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the value set is stored on different servers.
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
   * A formal identifier that is used to identify this value set when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this value set outside of FHIR, where it is not possible to use the
   * logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the value set when it is referenced in
   * a specification, model, design or instance. This is an arbitrary value managed by the value set
   * author and is not expected to be globally unique. For example, it might be a timestamp (e.g.
   * yyyymmdd) if a managed version is not available. There is also no expectation that versions can
   * be placed in a lexicographical sequence.
   *
   * There may be different value set instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the value set with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the value set. This name should be usable as an identifier
   * for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.A name should be provided unless the
   * value set is a contained resource (e.g. an anonymous value set in a profile). Most registries
   * will require a name.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the value set.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this value set. Enables tracking the life-cycle of the content. The status of the
   * value set applies to the value set definition (ValueSet.compose) and the associated ValueSet
   * metadata. Expansions do not have a state.
   *
   * Allows filtering of value sets that are appropriate for use versus not.See also the
   * [valueset-workflowStatus](extension-valueset-workflowstatus.html) extension for additional
   * status information related to the editorial process.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this value set is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of value sets that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the value set was created or revised (e.g. the 'content
   * logical definition').
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the value set. Additional specific dates may be added as extensions
   * or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the value set.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the value set
   * is the organization or individual primarily responsible for the maintenance and upkeep of the
   * value set. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the value set. This item SHOULD be populated unless the information is available
   * from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the value set from a consumer's perspective. The
   * textual description specifies the span of meanings for concepts to be included within the Value
   * Set Expansion, and also may specify the intended use and limitations of the Value Set.
   *
   * This description can be used to capture details such as why the value set was built, comments
   * about misuse, instructions for clinical use and interpretation, literature references, examples
   * from the paper world, etc. It is not a rendering of the value set as conveyed in the 'text'
   * field of the resource itself. This item SHOULD be populated unless the information is available
   * from context (e.g. the language of the value set is presumed to be the predominant language in
   * the place the value set was created).The description is not intended to describe the semantics
   * of the Value Set - there are no intrinsic semantics separate from the codes contained in its
   * expansion. The description should capture its intended use, which is needed for ensuring
   * integrity for its use in models across future changes. A description should be provided unless
   * the value set is a contained resource (e.g. an anonymous value set in a profile). Most
   * registries will require a description.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate value set instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the value set is intended to be used.
   *
   * It may be possible for the value set to be used in jurisdictions other than those for which it
   * was originally designed or intended.
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * If this is set to 'true', then no new versions of the content logical definition can be
   * created. Note: Other metadata might still change.
   *
   * Normally immutability is set to 'false', which is the default assumption if it is not
   * populated. Note that the implication is that if this is set to 'true', there may be only one
   * ValueSet version for this definition. Immutability tends to be set to 'true' in one of two
   * cases: - Where the value set, by the nature of its usage, cannot change. For example "All
   * specializations of ACT in ActClassCode" - Where there's no safe way to express the "Purpose"
   * such that someone else could safely make changes to the value set definition. Source workflow
   * control must guarantee that the same URI always yields the same definition.
   */
  public var immutable: Boolean? = null,
  /**
   * Explanation of why this value set is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the value set. Instead, it provides traceability of
   * ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this value set.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the value set and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the value set.
   *
   * nullFrequently, the copyright differs between the value set and the codes that are included.
   * The copyright statement should clearly differentiate between these when required.
   */
  public var copyright: Markdown? = null,
  /**
   * A set of criteria that define the contents of the value set by including or excluding codes
   * selected from the specified code system(s) that the value set draws from. This is also known as
   * the Content Logical Definition (CLD).
   */
  public var compose: Compose? = null,
  /**
   * A value set can also be "expanded", where the value set is turned into a simple collection of
   * enumerated codes. This element holds the expansion, if it has been performed.
   *
   * Expansion is performed to produce a collection of codes that are ready to use for data entry or
   * validation. Value set expansions are always considered to be stateless - they are a record of
   * the set of codes in the value set at a point in time under a given set of conditions, and are
   * not subject to ongoing maintenance.
   *
   * Expansion.parameter is a simplified list of parameters - a subset of the features of the
   * [Parameters](parameters.html) resource.
   */
  public var expansion: Expansion? = null,
) : DomainResource() {
  /**
   * A set of criteria that define the contents of the value set by including or excluding codes
   * selected from the specified code system(s) that the value set draws from. This is also known as
   * the Content Logical Definition (CLD).
   */
  @Serializable(with = ValueSetComposeSerializer::class)
  public class Compose(
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
     * The Locked Date is the effective date that is used to determine the version of all referenced
     * Code Systems and Value Set Definitions included in the compose that are not already tied to a
     * specific version.
     *
     * With a defined lockedDate the value set is considered "Locked". Otherwise, the value set may
     * have different expansions as underlying code systems and/or value sets evolve. The
     * interpretation of lockedDate is often dependent on the context - e.g. a SNOMED CT derived
     * value set with a lockedDate will have a different expansion in USA than in UK. If a value set
     * specifies a version for include and exclude statements, and also specifies a locked date, the
     * specified versions need to be available that date, or the value set will not be usable.
     */
    public var lockedDate: Date? = null,
    /**
     * Whether inactive codes - codes that are not approved for current use - are in the value set.
     * If inactive = true, inactive codes are to be included in the expansion, if inactive = false,
     * the inactive codes will not be included in the expansion. If absent, the behavior is
     * determined by the implementation, or by the applicable $expand parameters (but generally,
     * inactive codes would be expected to be included).
     *
     * Note that in the FHIR terminology framework, "deprecated" does not mean inactive, but in some
     * code systems, e.g. LOINC, "deprecated" does mean inactive. Code systems should define what
     * codes are considered to be inactive. If this is not clearly defined (including in the FHIR
     * code system resource), then all codes are assumed to be active.
     *
     * The Value Set Definition specification defines an ActiveOnly element, which is the reverse of
     * this element e.g. (ValueSet.compose.inactive=FALSE) is the same as (VSD.ActiveOnly=TRUE).
     */
    public var inactive: Boolean? = null,
    /**
     * Include one or more codes from a code system or other value set(s).
     *
     * All the conditions in an include must be true. If a system is listed, all the codes from the
     * system are listed. If one or more filters are listed, all of the filters must apply. If one
     * or more value sets are listed, the codes must be in all the value sets. E.g. each include is
     * 'include all the codes that meet all these conditions'.
     */
    public var include: List<Include>? = null,
    /**
     * Exclude one or more codes from the value set based on code system filters and/or other value
     * sets.
     *
     * Usually this is used to selectively exclude codes that were included by subsumption in the
     * inclusions. Any display names specified for the codes are ignored.
     */
    public var exclude: List<Include?>? = null,
  ) : BackboneElement() {
    /** Include one or more codes from a code system or other value set(s). */
    @Serializable(with = ValueSetComposeIncludeSerializer::class)
    public class Include(
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
      /**
       * An absolute URI which is the code system from which the selected codes come from.
       *
       * If there are no codes or filters, the entire code system is included. Note that the set of
       * codes that are included may contain abstract codes. See ''Coding.system'' for further
       * documentation about the correct value for the system element.
       */
      public var system: Uri? = null,
      /**
       * The version of the code system that the codes are selected from, or the special version '*'
       * for all versions.
       *
       * This is used when selecting the descendants of a concept - they may change between
       * versions. If no version is specified, then the exact contents of the value set might not be
       * known until a context of use binds it to a particular version. The special value '*' means
       * all versions; It is at server discretion regarding expansions and which versions must be
       * supported.
       */
      public var version: String? = null,
      /**
       * Specifies a concept to be included or excluded.
       *
       * The list of concepts is considered ordered, though the order might not have any particular
       * significance. Typically, the order of an expansion follows that defined in the compose
       * element.
       */
      public var concept: List<Concept>? = null,
      /**
       * Select concepts by specify a matching criterion based on the properties (including
       * relationships) defined by the system, or on filters defined by the system. If multiple
       * filters are specified, they SHALL all be true.
       *
       * Selecting codes by specifying filters based on properties is only possible where the
       * underlying code system defines appropriate properties. Note that in some cases, the
       * underlying code system defines the logical concepts but not the literal codes for the
       * concepts. In such cases, the literal definitions may be provided by a third party.
       */
      public var filter: List<Filter>? = null,
      /**
       * Selects the concepts found in this value set (based on its value set definition). This is
       * an absolute URI that is a reference to ValueSet.url. If multiple value sets are specified
       * this includes the union of the contents of all of the referenced value sets.
       *
       * The value set URI is either a logical reference to a defined value set such as a
       * [SNOMED CT reference set](snomedct.html#implicit), or a direct reference to a value set
       * definition using ValueSet.url. The reference might not refer to an actual FHIR ValueSet
       * resource; in this case, whatever is referred to is an implicit definition of a value set
       * that needs to be clear about how versions are resolved.
       */
      public var valueSet: List<Canonical?>? = null,
    ) : BackboneElement() {
      /** Specifies a concept to be included or excluded. */
      @Serializable(with = ValueSetComposeIncludeConceptSerializer::class)
      public class Concept(
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
        /**
         * Specifies a code for the concept to be included or excluded.
         *
         * Expressions are allowed if defined by the underlying code system.
         */
        public var code: Code? = null,
        /**
         * The text to display to the user for this concept in the context of this valueset. If no
         * display is provided, then applications using the value set use the display specified for
         * the code by the system.
         *
         * The value set resource allows for an alternative display to be specified for when this
         * concept is used in this particular value set. See notes in the value set narrative about
         * the correct use of this element.
         */
        public var display: String? = null,
        /**
         * Additional representations for this concept when used in this value set - other
         * languages, aliases, specialized purposes, used for particular purposes, etc.
         *
         * Concepts have both a ```display``` and an array of ```designation```. The display is
         * equivalent to a special designation with an implied ```designation.use``` of "primary
         * code" and a language equal to the [Resource Language](resource.html#language).
         */
        public var designation: List<Designation>? = null,
      ) : BackboneElement() {
        /**
         * Additional representations for this concept when used in this value set - other
         * languages, aliases, specialized purposes, used for particular purposes, etc.
         */
        @Serializable(with = ValueSetComposeIncludeConceptDesignationSerializer::class)
        public class Designation(
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
          /**
           * The language this designation is defined for.
           *
           * In the absence of a language, the resource language applies.
           */
          public var language: Code? = null,
          /**
           * A code that represents types of uses of designations.
           *
           * If no use is provided, the designation can be assumed to be suitable for general
           * display to a human user.
           */
          public var use: Coding? = null,
          /** The text value for this designation. */
          public var `value`: String? = null,
        ) : BackboneElement()
      }

      /**
       * Select concepts by specify a matching criterion based on the properties (including
       * relationships) defined by the system, or on filters defined by the system. If multiple
       * filters are specified, they SHALL all be true.
       */
      @Serializable(with = ValueSetComposeIncludeFilterSerializer::class)
      public class Filter(
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
        /** A code that identifies a property or a filter defined in the code system. */
        public var `property`: Code? = null,
        /**
         * The kind of operation to perform as a part of the filter criteria.
         *
         * In case filter.property represents a property of the system, the operation applies to the
         * selected property. In case filter.property represents a filter of the system, the
         * operation SHALL match one of the CodeSystem.filter.operator values.
         */
        public var op: Enumeration<FilterOperator>? = null,
        /**
         * The match value may be either a code defined by the system, or a string value, which is a
         * regex match on the literal string of the property value (if the filter represents a
         * property defined in CodeSystem) or of the system filter value (if the filter represents a
         * filter defined in CodeSystem) when the operation is 'regex', or one of the values (true
         * and false), when the operation is 'exists'.
         *
         * Use regex matching with care - full regex matching on every SNOMED CT term is
         * prohibitive, for example.
         */
        public var `value`: String? = null,
      ) : BackboneElement()
    }
  }

  /**
   * A value set can also be "expanded", where the value set is turned into a simple collection of
   * enumerated codes. This element holds the expansion, if it has been performed.
   */
  @Serializable(with = ValueSetExpansionSerializer::class)
  public class Expansion(
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
     * An identifier that uniquely identifies this expansion of the valueset, based on a unique
     * combination of the provided parameters, the system default parameters, and the underlying
     * system code system versions etc. Systems may re-use the same identifier as long as those
     * factors remain the same, and the expansion is the same, but are not required to do so. This
     * is a business identifier.
     *
     * Typically, this uri is a UUID (e.g. urn:uuid:8230ff20-c97a-4167-a59d-dc2cb9df16dd).
     */
    public var identifier: Uri? = null,
    /**
     * The time at which the expansion was produced by the expanding system.
     *
     * This SHOULD be a fully populated instant, but in some circumstances, value sets are expanded
     * by hand, and the expansion is published without that precision.
     */
    public var timestamp: DateTime? = null,
    /**
     * The total number of concepts in the expansion. If the number of concept nodes in this
     * resource is less than the stated number, then the server can return more using the offset
     * parameter.
     *
     * Paging only applies to flat expansions.
     */
    public var total: Integer? = null,
    /**
     * If paging is being used, the offset at which this resource starts. I.e. this resource is a
     * partial view into the expansion. If paging is not being used, this element SHALL NOT be
     * present.
     *
     * Paging only applies to flat expansions. If a filter is applied, the count is the number of
     * concepts that matched the filter, not the number of concepts in an unfiltered view of the
     * expansion.
     */
    public var offset: Integer? = null,
    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of
     * expanded value sets to check whether the expansion is suitable for a particular purpose, or
     * to pick the correct expansion.
     *
     * The server decides which parameters to include here, but at a minimum, the list SHOULD
     * include all of the parameters that affect the $expand operation. If the expansion will be
     * persisted all of these parameters SHALL be included. If the codeSystem on the server has a
     * specified version then this version SHALL be provided as a parameter in the expansion (note
     * that not all code systems have a version).
     */
    public var parameter: List<Parameter>? = null,
    /** The codes that are contained in the value set expansion. */
    public var contains: List<Contains>? = null,
  ) : BackboneElement() {
    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of
     * expanded value sets to check whether the expansion is suitable for a particular purpose, or
     * to pick the correct expansion.
     */
    @Serializable(with = ValueSetExpansionParameterSerializer::class)
    public class Parameter(
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
      /**
       * Name of the input parameter to the $expand operation; may be a server-assigned name for
       * additional default or other server-supplied parameters used to control the expansion
       * process.
       *
       * The names are assigned at the discretion of the server.
       */
      public var name: String? = null,
      /** The value of the parameter. */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asString(): String? = this as? String

        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asInteger(): Integer? = this as? Integer

        public fun asDecimal(): Decimal? = this as? Decimal

        public fun asUri(): Uri? = this as? Uri

        public fun asCode(): Code? = this as? Code

        public fun asDateTime(): DateTime? = this as? DateTime

        public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

        public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Value

        public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Value

        public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Value

        public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Value

        public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Value

        public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Value

        public companion object {
          public fun from(
            stringValue: com.google.fhir.model.r4.String?,
            booleanValue: com.google.fhir.model.r4.Boolean?,
            integerValue: com.google.fhir.model.r4.Integer?,
            decimalValue: com.google.fhir.model.r4.Decimal?,
            uriValue: com.google.fhir.model.r4.Uri?,
            codeValue: com.google.fhir.model.r4.Code?,
            dateTimeValue: com.google.fhir.model.r4.DateTime?,
          ): Value? {
            if (stringValue != null) return String(stringValue)
            if (booleanValue != null) return Boolean(booleanValue)
            if (integerValue != null) return Integer(integerValue)
            if (decimalValue != null) return Decimal(decimalValue)
            if (uriValue != null) return Uri(uriValue)
            if (codeValue != null) return Code(codeValue)
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            return null
          }
        }
      }
    }

    /** The codes that are contained in the value set expansion. */
    @Serializable(with = ValueSetExpansionContainsSerializer::class)
    public class Contains(
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
      /**
       * An absolute URI which is the code system in which the code for this item in the expansion
       * is defined.
       */
      public var system: Uri? = null,
      /**
       * If true, this entry is included in the expansion for navigational purposes, and the user
       * cannot select the code directly as a proper value.
       *
       * This should not be understood to exclude its use for searching (e.g. by subsumption
       * testing). The client should know whether it is appropriate for the user to select an
       * abstract code or not.
       */
      public var `abstract`: Boolean? = null,
      /**
       * If the concept is inactive in the code system that defines it. Inactive codes are those
       * that are no longer to be used, but are maintained by the code system for understanding
       * legacy data. It might not be known or specified whether an concept is inactive (and it may
       * depend on the context of use).
       *
       * This should only have a value if the concept is inactive.
       */
      public var inactive: Boolean? = null,
      /**
       * The version of the code system from this code was taken. Note that a well-maintained code
       * system does not need the version reported, because the meaning of codes is consistent
       * across versions. However this cannot consistently be assured, and when the meaning is not
       * guaranteed to be consistent, the version SHOULD be exchanged.
       *
       * The exact value of the version string is specified by the system from which the code is
       * derived.
       */
      public var version: String? = null,
      /**
       * The code for this item in the expansion hierarchy. If this code is missing the entry in the
       * hierarchy is a place holder (abstract) and does not represent a valid code in the value
       * set.
       */
      public var code: Code? = null,
      /** The recommended display for this item in the expansion. */
      public var display: String? = null,
      /**
       * Additional representations for this item - other languages, aliases, specialized purposes,
       * used for particular purposes, etc. These are relevant when the conditions of the expansion
       * do not fix to a single correct representation.
       *
       * The designations provided must be based on the value set and code system definitions.
       */
      public var designation: List<Compose.Include.Concept.Designation?>? = null,
      /**
       * Other codes and entries contained under this entry in the hierarchy.
       *
       * If the expansion uses this element, there is no implication about the logical relationship
       * between them, and the structure cannot be used for logical inferencing. The structure
       * exists to provide navigational assistance for helping human users to locate codes in the
       * expansion.
       */
      public var contains: List<Contains?>? = null,
    ) : BackboneElement()
  }

  /** The kind of operation to perform as a part of a property based filter. */
  public enum class FilterOperator(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The specified property of the code equals the provided value. */
    EqualTo(
      "=",
      "http://hl7.org/fhir/filter-operator",
      "Equals",
      "The specified property of the code equals the provided value.",
    ),
    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id
     * provided as the value, including the provided concept itself (include descendant codes and
     * self).
     */
    Is_A(
      "is-a",
      "http://hl7.org/fhir/filter-operator",
      "Is A (by subsumption)",
      "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self).",
    ),
    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id
     * provided as the value, excluding the provided concept itself i.e. include descendant codes
     * only).
     */
    Descendent_Of(
      "descendent-of",
      "http://hl7.org/fhir/filter-operator",
      "Descendent Of (by subsumption)",
      "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself i.e. include descendant codes only).",
    ),
    /**
     * The specified property of the code does not have an is-a relationship with the provided
     * value.
     */
    Is_Not_A(
      "is-not-a",
      "http://hl7.org/fhir/filter-operator",
      "Not (Is A) (by subsumption)",
      "The specified property of the code does not have an is-a relationship with the provided value.",
    ),
    /** The specified property of the code matches the regex specified in the provided value. */
    Regex(
      "regex",
      "http://hl7.org/fhir/filter-operator",
      "Regular Expression",
      "The specified property of the code  matches the regex specified in the provided value.",
    ),
    /**
     * The specified property of the code is in the set of codes or concepts specified in the
     * provided value (comma separated list).
     */
    In(
      "in",
      "http://hl7.org/fhir/filter-operator",
      "In Set",
      "The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).",
    ),
    /**
     * The specified property of the code is not in the set of codes or concepts specified in the
     * provided value (comma separated list).
     */
    Not_In(
      "not-in",
      "http://hl7.org/fhir/filter-operator",
      "Not in Set",
      "The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).",
    ),
    /**
     * Includes all concept ids that have a transitive is-a relationship from the concept Id
     * provided as the value, including the provided concept itself (i.e. include ancestor codes and
     * self).
     */
    Generalizes(
      "generalizes",
      "http://hl7.org/fhir/filter-operator",
      "Generalizes (by Subsumption)",
      "Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self).",
    ),
    /**
     * The specified property of the code has at least one value (if the specified value is true; if
     * the specified value is false, then matches when the specified property of the code has no
     * values).
     */
    Exists(
      "exists",
      "http://hl7.org/fhir/filter-operator",
      "Exists",
      "The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
}
