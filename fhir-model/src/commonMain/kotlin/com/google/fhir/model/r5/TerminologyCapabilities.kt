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

import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesClosureSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesCodeSystemSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesCodeSystemVersionFilterSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesCodeSystemVersionSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesExpansionParameterSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesExpansionSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesImplementationSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesSoftwareSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesTranslationSerializer
import com.google.fhir.model.r5.serializers.TerminologyCapabilitiesValidateCodeSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR
 * Terminology Server that may be used as a statement of actual server functionality or a statement
 * of required or desired server implementation.
 */
@Serializable(with = TerminologyCapabilitiesSerializer::class)
@SerialName("TerminologyCapabilities")
public data class TerminologyCapabilities(
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
   * An absolute URI that is used to identify this terminology capabilities when it is referenced in
   * a specification, model, design or an instance; also called its canonical identifier. This
   * SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of
   * this terminology capabilities is (or will be) published. This URL can be the target of a
   * canonical reference. It SHALL remain the same when the terminology capabilities is stored on
   * different servers.
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
   * A formal identifier that is used to identify this terminology capabilities when it is
   * represented in other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this terminology capabilities outside of FHIR, where it is not
   * possible to use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the terminology capabilities when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the terminology capabilities author and is not expected to be globally unique. For example, it
   * might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence.
   *
   * There may be different terminology capabilities instances that have the same identifier but
   * different versions. The version can be appended to the url in a reference to allow a reference
   * to a particular business version of the terminology capabilities with the format
   * [url]|[version]. The version SHOULD NOT contain a '#' - see
   * [Business Version](resource.html#bv-format).
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
   * A natural language name identifying the terminology capabilities. This name should be usable as
   * an identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the terminology capabilities.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this terminology capabilities. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of terminology capabilitiess that are appropriate for use versus not.This is
   * not intended for use with actual capability statements, but where capability statements are
   * used to describe possible or desired systems.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this terminology capabilities is authored for testing purposes
   * (or education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of terminology capabilitiess that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the terminology capabilities was last significantly
   * changed. The date must change when the business version changes and it must change if the
   * status code changes. In addition, it should change when the substantive content of the
   * terminology capabilities changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the terminology capabilities. Additional specific dates
   * may be added as extensions or be found by consulting Provenances associated with past versions
   * of the resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the terminology capabilities.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the terminology
   * capabilities is the organization or individual primarily responsible for the maintenance and
   * upkeep of the terminology capabilities. This is not necessarily the same individual or
   * organization that developed and initially authored the content. The publisher is the primary
   * point of contact for questions or issues with the terminology capabilities. This item SHOULD be
   * populated unless the information is available from context.
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
   * A free text natural language description of the terminology capabilities from a consumer's
   * perspective. Typically, this is used when the capability statement describes a desired rather
   * than an actual solution, for example as a formal expression of requirements as part of an RFP.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the terminology capabilities as conveyed in the 'text' field of the
   * resource itself. This item SHOULD be populated unless the information is available from context
   * (e.g. the language of the terminology capabilities is presumed to be the predominant language
   * in the place the terminology capabilities was created).This does not need to be populated if
   * the description is adequately implied by the software or implementation details.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate terminology capabilities instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the terminology capabilities is intended to be used.
   *
   * It may be possible for the terminology capabilities to be used in jurisdictions other than
   * those for which it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this terminology capabilities is needed and why it has been designed as it
   * has.
   *
   * This element does not describe the usage of the terminology capabilities. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * terminology capabilities.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the terminology capabilities and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the terminology
   * capabilities.
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
   * The way that this statement is intended to be used, to describe an actual running instance of
   * software, a particular product (kind, not instance of software) or a class of implementation
   * (e.g. a desired purchase).
   */
  public var kind: Enumeration<CapabilityStatementKind>? = null,
  /**
   * Software that is covered by this terminology capability statement. It is used when the
   * statement describes the capabilities of a particular software version, independent of an
   * installation.
   */
  public var software: Software? = null,
  /**
   * Identifies a specific implementation instance that is described by the terminology capability
   * statement - i.e. a particular installation, rather than the capabilities of a software program.
   */
  public var implementation: Implementation? = null,
  /** Whether the server supports lockedDate. */
  public var lockedDate: Boolean? = null,
  /**
   * Identifies a code system that is supported by the server. If there is a no code system URL,
   * then this declares the general assumptions a client can make about support for any CodeSystem
   * resource.
   *
   * The code system - identified by its system URL - may also be declared explicitly as a Code
   * System Resource at /CodeSystem, but it might not be.
   */
  public var codeSystem: List<CodeSystem>? = null,
  /** Information about the [ValueSet/$expand](valueset-operation-expand.html) operation. */
  public var expansion: Expansion? = null,
  /**
   * The degree to which the server supports the code search parameter on ValueSet, if it is
   * supported.
   *
   * See notes on the [ValueSet](valueset.html#) resource.
   */
  public var codeSearch: Enumeration<CodeSearchSupport>? = null,
  /**
   * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html)
   * operation.
   */
  public var validateCode: ValidateCode? = null,
  /**
   * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation.
   */
  public var translation: Translation? = null,
  /** Whether the $closure operation is supported. */
  public var closure: Closure? = null,
) : DomainResource() {
  /**
   * Software that is covered by this terminology capability statement. It is used when the
   * statement describes the capabilities of a particular software version, independent of an
   * installation.
   */
  @Serializable(with = TerminologyCapabilitiesSoftwareSerializer::class)
  public class Software(
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
    /** Name the software is known by. */
    public var name: String? = null,
    /**
     * The version identifier for the software covered by this statement.
     *
     * If possible, a version should be specified, as statements are likely to be different for
     * different versions of software.
     */
    public var version: String? = null,
  ) : BackboneElement()

  /**
   * Identifies a specific implementation instance that is described by the terminology capability
   * statement - i.e. a particular installation, rather than the capabilities of a software program.
   */
  @Serializable(with = TerminologyCapabilitiesImplementationSerializer::class)
  public class Implementation(
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
     * Information about the specific installation that this terminology capability statement
     * relates to.
     */
    public var description: String? = null,
    /** An absolute base URL for the implementation. */
    public var url: Url? = null,
  ) : BackboneElement()

  /**
   * Identifies a code system that is supported by the server. If there is a no code system URL,
   * then this declares the general assumptions a client can make about support for any CodeSystem
   * resource.
   */
  @Serializable(with = TerminologyCapabilitiesCodeSystemSerializer::class)
  public class CodeSystem(
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
    /** Canonical identifier for the code system, represented as a URI. */
    public var uri: Canonical? = null,
    /**
     * For the code system, a list of versions that are supported by the server.
     *
     * Language translations might not be available for all codes.
     */
    public var version: List<Version>? = null,
    /**
     * The extent of the content of the code system (the concepts and codes it defines) are
     * represented in this resource instance.
     */
    public var content: Enumeration<CodeSystemContentMode>? = null,
    /** True if subsumption is supported for this version of the code system. */
    public var subsumption: Boolean? = null,
  ) : BackboneElement() {
    /** For the code system, a list of versions that are supported by the server. */
    @Serializable(with = TerminologyCapabilitiesCodeSystemVersionSerializer::class)
    public class Version(
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
      /** For version-less code systems, there should be a single version with no identifier. */
      public var code: String? = null,
      /** If this is the default version for this code system. */
      public var isDefault: Boolean? = null,
      /** If the compositional grammar defined by the code system is supported. */
      public var compositional: Boolean? = null,
      /** Language Displays supported. */
      public var language: List<Code?>? = null,
      /** Filter Properties supported. */
      public var filter: List<Filter>? = null,
      /** Properties supported for $lookup. */
      public var `property`: List<Code?>? = null,
    ) : BackboneElement() {
      /** Filter Properties supported. */
      @Serializable(with = TerminologyCapabilitiesCodeSystemVersionFilterSerializer::class)
      public class Filter(
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
        /** Code of the property supported. */
        public var code: Code? = null,
        /** Operations supported for the property. */
        public var op: List<Code?>? = null,
      ) : BackboneElement()
    }
  }

  /** Information about the [ValueSet/$expand](valueset-operation-expand.html) operation. */
  @Serializable(with = TerminologyCapabilitiesExpansionSerializer::class)
  public class Expansion(
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
    /** Whether the server can return nested value sets. */
    public var hierarchical: Boolean? = null,
    /** Whether the server supports paging on expansion. */
    public var paging: Boolean? = null,
    /** True if requests for incomplete expansions are allowed. */
    public var incomplete: Boolean? = null,
    /** Supported expansion parameter. */
    public var parameter: List<Parameter>? = null,
    /**
     * Documentation about text searching works.
     *
     * This documentation should cover things like case sensitivity, use of punctuation if not
     * ignored, what wild cards are supported (if any), whether text is starts with or contains, and
     * whether word order matters.
     */
    public var textFilter: Markdown? = null,
  ) : BackboneElement() {
    /** Supported expansion parameter. */
    @Serializable(with = TerminologyCapabilitiesExpansionParameterSerializer::class)
    public class Parameter(
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
      /** Name of the supported expansion parameter. */
      public var name: Code? = null,
      /** Description of support for parameter. */
      public var documentation: String? = null,
    ) : BackboneElement()
  }

  /**
   * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html)
   * operation.
   */
  @Serializable(with = TerminologyCapabilitiesValidateCodeSerializer::class)
  public class ValidateCode(
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
    /** Whether translations are validated. */
    public var translations: Boolean? = null,
  ) : BackboneElement()

  /**
   * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation.
   */
  @Serializable(with = TerminologyCapabilitiesTranslationSerializer::class)
  public class Translation(
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
    /** Whether the client must identify the map. */
    public var needsMap: Boolean? = null,
  ) : BackboneElement()

  /** Whether the $closure operation is supported. */
  @Serializable(with = TerminologyCapabilitiesClosureSerializer::class)
  public class Closure(
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
    /** If cross-system closure is supported. */
    public var translation: Boolean? = null,
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
   * The extent of the content of the code system (the concepts and codes it defines) are
   * represented in a code system resource.
   */
  public enum class CodeSystemContentMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** None of the concepts defined by the code system are included in the code system resource. */
    Not_Present(
      "not-present",
      "http://hl7.org/fhir/codesystem-content-mode",
      "Not Present",
      "None of the concepts defined by the code system are included in the code system resource.",
    ),
    /**
     * A subset of the valid externally defined concepts are included in the code system resource.
     * There is no specific purpose or documented intent other than for illustrative purposes.
     */
    Example(
      "example",
      "http://hl7.org/fhir/codesystem-content-mode",
      "Example",
      "A subset of the valid externally defined concepts are included in the code system resource. There is no specific purpose or documented intent other than for illustrative purposes.",
    ),
    /**
     * A subset of the code system concepts are included in the code system resource. This is a
     * curated subset released for a specific purpose under the governance of the code system
     * steward, and that the intent, bounds and consequences of the fragmentation are clearly
     * defined in the fragment or the code system documentation. Fragments are also known as
     * partitions.
     */
    Fragment(
      "fragment",
      "http://hl7.org/fhir/codesystem-content-mode",
      "Fragment",
      "A subset of the code system concepts are included in the code system resource. This is a curated subset released for a specific purpose under the governance of the code system steward, and that the intent, bounds and consequences of the fragmentation are clearly defined in the fragment or the code system documentation. Fragments are also known as partitions.",
    ),
    /** All the concepts defined by the code system are included in the code system resource. */
    Complete(
      "complete",
      "http://hl7.org/fhir/codesystem-content-mode",
      "Complete",
      "All the concepts defined by the code system are included in the code system resource.",
    ),
    /**
     * The resource doesn't define any new concepts; it just provides additional designations and
     * properties to another code system.
     */
    Supplement(
      "supplement",
      "http://hl7.org/fhir/codesystem-content-mode",
      "Supplement",
      "The resource doesn't define any new concepts; it just provides additional designations and properties to another code system.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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

  /** How a capability statement is intended to be used. */
  public enum class CapabilityStatementKind(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The CapabilityStatement instance represents the present capabilities of a specific system
     * instance. This is the kind returned by /metadata for a FHIR server end-point.
     */
    Instance(
      "instance",
      "http://hl7.org/fhir/capability-statement-kind",
      "Instance",
      "The CapabilityStatement instance represents the present capabilities of a specific system instance.  This is the kind returned by /metadata for a FHIR server end-point.",
    ),
    /**
     * The CapabilityStatement instance represents the capabilities of a system or piece of
     * software, independent of a particular installation.
     */
    Capability(
      "capability",
      "http://hl7.org/fhir/capability-statement-kind",
      "Capability",
      "The CapabilityStatement instance represents the capabilities of a system or piece of software, independent of a particular installation.",
    ),
    /**
     * The CapabilityStatement instance represents a set of requirements for other systems to meet;
     * e.g. as part of an implementation guide or 'request for proposal'.
     */
    Requirements(
      "requirements",
      "http://hl7.org/fhir/capability-statement-kind",
      "Requirements",
      "The CapabilityStatement instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CapabilityStatementKind =
        when (code) {
          "instance" -> Instance
          "capability" -> Capability
          "requirements" -> Requirements
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CapabilityStatementKind")
        }
    }
  }

  /**
   * The degree to which the server supports the code search parameter on ValueSet, if it is
   * supported.
   */
  public enum class CodeSearchSupport(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The search for code on ValueSet returns ValueSet resources where the code is included in the
     * extensional definition of the ValueSet.
     */
    In_Compose(
      "in-compose",
      "http://hl7.org/fhir/code-search-support",
      "In Compose",
      "The search for code on ValueSet returns ValueSet resources where the code is included in the extensional definition of the ValueSet.",
    ),
    /**
     * The search for code on ValueSet returns ValueSet resources where the code is contained in the
     * ValueSet expansion.
     */
    In_Expansion(
      "in-expansion",
      "http://hl7.org/fhir/code-search-support",
      "In Expansion",
      "The search for code on ValueSet returns ValueSet resources where the code is contained in the  ValueSet expansion.",
    ),
    /**
     * The search for code on ValueSet returns ValueSet resources where the code is included in the
     * extensional definition or contained in the ValueSet expansion.
     */
    In_Compose_Or_Expansion(
      "in-compose-or-expansion",
      "http://hl7.org/fhir/code-search-support",
      "In Compose Or Expansion",
      "The search for code on ValueSet returns ValueSet resources where the code is included in the extensional definition or contained in the ValueSet expansion.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CodeSearchSupport =
        when (code) {
          "in-compose" -> In_Compose
          "in-expansion" -> In_Expansion
          "in-compose-or-expansion" -> In_Compose_Or_Expansion
          else -> throw IllegalArgumentException("Unknown code $code for enum CodeSearchSupport")
        }
    }
  }
}
