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

import com.google.fhir.model.r5.serializers.CapabilityStatementDocumentSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementImplementationSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementMessagingEndpointSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementMessagingSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementMessagingSupportedMessageSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestInteractionSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestResourceInteractionSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestResourceOperationSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestResourceSearchParamSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestResourceSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestSecuritySerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementRestSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementSoftwareSerializer
import com.google.fhir.model.r5.serializers.CapabilityStatementVersionAlgorithmSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for
 * a particular version of FHIR that may be used as a statement of actual server functionality or a
 * statement of required or desired server implementation.
 */
@Serializable(with = CapabilityStatementSerializer::class)
@SerialName("CapabilityStatement")
public data class CapabilityStatement(
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
   * An absolute URI that is used to identify this capability statement when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * capability statement is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the capability statement is stored on different
   * servers.
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
   * A formal identifier that is used to identify this CapabilityStatement when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the capability statement when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the capability statement author and is not expected to be globally unique. For example, it
   * might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence.
   *
   * There may be different capability statement instances that have the same identifier but
   * different versions. The version can be appended to the url in a reference to allow a reference
   * to a particular business version of the capability statement with the format [url]|[version].
   * The version SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
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
   * A natural language name identifying the capability statement. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the capability statement.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this capability statement. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of capability statements that are appropriate for use versus not.This is not
   * intended for use with actual capability statements, but where capability statements are used to
   * describe possible or desired systems.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this capability statement is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of capability statements that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the capability statement was last significantly changed.
   * The date must change when the business version changes and it must change if the status code
   * changes. In addition, it should change when the substantive content of the capability statement
   * changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the capability statement. Additional specific dates may be
   * added as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the capability statement.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the capability
   * statement is the organization or individual primarily responsible for the maintenance and
   * upkeep of the capability statement. This is not necessarily the same individual or organization
   * that developed and initially authored the content. The publisher is the primary point of
   * contact for questions or issues with the capability statement. This item SHOULD be populated
   * unless the information is available from context.
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
   * A free text natural language description of the capability statement from a consumer's
   * perspective. Typically, this is used when the capability statement describes a desired rather
   * than an actual solution, for example as a formal expression of requirements as part of an RFP.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the capability statement as conveyed in the 'text' field of the resource
   * itself. This item SHOULD be populated unless the information is available from context (e.g.
   * the language of the capability statement is presumed to be the predominant language in the
   * place the capability statement was created).This does not need to be populated if the
   * description is adequately implied by the software or implementation details.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate capability statement instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the capability statement is intended to be used.
   *
   * It may be possible for the capability statement to be used in jurisdictions other than those
   * for which it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this capability statement is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the capability statement. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * capability statement.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the capability statement and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the capability
   * statement.
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
   * The way that this statement is intended to be used, to describe an actual running instance of
   * software, a particular product (kind, not instance of software) or a class of implementation
   * (e.g. a desired purchase).
   */
  public var kind: Enumeration<CapabilityStatementKind>? = null,
  /**
   * Reference to a canonical URL of another CapabilityStatement that this software implements. This
   * capability statement is a published API description that corresponds to a business service. The
   * server may actually implement a subset of the capability statement it claims to implement, so
   * the capability statement must specify the full capability details.
   *
   * HL7 defines the following Services: [Terminology Service](terminology-service.html).
   *
   * Many [Implementation Guides](http://fhir.org/guides/registry) define additional services.
   */
  public var instantiates: List<Canonical?>? = null,
  /**
   * Reference to a canonical URL of another CapabilityStatement that this software adds to. The
   * capability statement automatically includes everything in the other statement, and it is not
   * duplicated, though the server may repeat the same resources, interactions and operations to add
   * additional details to them.
   *
   * the contents of any directly or indirectly imported CapabilityStatements SHALL NOT overlap,
   * i.e. they cannot refer to the same rest/resource, operations/name, searchparam/name,
   * interaction/code, messaging/endpoint, document/mode pair.
   *
   * A capability statement that imports another CapabilityStatement automatically instantiates it
   * too (though this is often not a very useful statement for the kinds of CapabilityStatements
   * that are suitable for importing).
   */
  public var imports: List<Canonical?>? = null,
  /**
   * Software that is covered by this capability statement. It is used when the capability statement
   * describes the capabilities of a particular software version, independent of an installation.
   */
  public var software: Software? = null,
  /**
   * Identifies a specific implementation instance that is described by the capability statement -
   * i.e. a particular installation, rather than the capabilities of a software program.
   */
  public var implementation: Implementation? = null,
  /**
   * The version of the FHIR specification that this CapabilityStatement describes (which SHALL be
   * the same as the FHIR version of the CapabilityStatement itself). There is no default value.
   *
   * Servers may implement multiple versions (see [Managing Multiple Versions](versioning.html), and
   * the [$versions](capabilitystatement-operation-versions.html) operation). If they do, and the
   * CapabilityStatement is requested from the server, then this fhirVersion will be either the
   * version requested, or the server's default version.
   */
  public var fhirVersion: Enumeration<FHIRVersion>? = null,
  /**
   * A list of the formats supported by this implementation using their content types.
   *
   * "xml", "json" and "ttl" are allowed, which describe the simple encodings described in the
   * specification (and imply appropriate bundle support). Otherwise, mime types are legal here.
   */
  public var format: List<Code?>? = null,
  /**
   * A list of the patch formats supported by this implementation using their content types.
   *
   * At present, the patch mime types application/json-patch+json and application/xml-patch+xml are
   * legal. Generally, if a server supports PATCH, it would be expected to support the patch formats
   * and match the formats it supports, but this is not always possible or necessary.
   */
  public var patchFormat: List<Code?>? = null,
  /**
   * A list of the languages supported by this implementation that are usefully supported in
   * the ```Accept-Language``` header.
   *
   * In general, if a server gets a request with an Accept-Language that it doesn't support, it
   * should still reutrn the resource, just in its default language for the resource.
   */
  public var acceptLanguage: List<Code?>? = null,
  /**
   * A list of implementation guides that the server does (or should) support in their entirety.
   *
   * Note: this is primarily only relevant in terms of ImplementationGuides that don't define
   * specific CapabilityStatements declaring the expectation of distinct roles. (E.g. generic IGs
   * that establish privacy policies.) In situations where an ImplementationGuide does define
   * CapabilityStatements, asserting CapabilityStatement.implementationGuide means that the
   * implementation adheres to any Implementation.global definitions present in that IG as well as
   * any textual requirements around security or other general interoperability behaviors. However,
   * it does not make any assertions as to conformance with any of the CapabilityStatements defined
   * in the IG. To assert conformance with CapabilityStatements in a referenced IG, it is necessary
   * to use the CapabilityStatement.instantiates element.
   */
  public var implementationGuide: List<Canonical?>? = null,
  /**
   * A definition of the restful capabilities of the solution, if any.
   *
   * Multiple repetitions allow definition of both client and/or server behaviors or possibly
   * behaviors under different configuration settings (for software or requirements statements).
   */
  public var rest: List<Rest>? = null,
  /**
   * A description of the messaging capabilities of the solution.
   *
   * Multiple repetitions allow the documentation of multiple endpoints per solution.
   */
  public var messaging: List<Messaging>? = null,
  /** A document definition. */
  public var document: List<Document>? = null,
) : DomainResource() {
  /**
   * Software that is covered by this capability statement. It is used when the capability statement
   * describes the capabilities of a particular software version, independent of an installation.
   */
  @Serializable(with = CapabilityStatementSoftwareSerializer::class)
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
    /** Date this version of the software was released. */
    public var releaseDate: DateTime? = null,
  ) : BackboneElement()

  /**
   * Identifies a specific implementation instance that is described by the capability statement -
   * i.e. a particular installation, rather than the capabilities of a software program.
   */
  @Serializable(with = CapabilityStatementImplementationSerializer::class)
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
    /** Information about the specific installation that this capability statement relates to. */
    public var description: Markdown? = null,
    /**
     * An absolute base URL for the implementation. This forms the base for REST interfaces as well
     * as the mailbox and document interfaces.
     */
    public var url: Url? = null,
    /**
     * The organization responsible for the management of the instance and oversight of the data on
     * the server at the specified URL.
     */
    public var custodian: Reference? = null,
  ) : BackboneElement()

  /** A definition of the restful capabilities of the solution, if any. */
  @Serializable(with = CapabilityStatementRestSerializer::class)
  public class Rest(
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
     * Identifies whether this portion of the statement is describing the ability to initiate or
     * receive restful operations.
     */
    public var mode: Enumeration<RestfulCapabilityMode>? = null,
    /**
     * Information about the system's restful capabilities that apply across all applications, such
     * as security.
     */
    public var documentation: Markdown? = null,
    /**
     * Information about security implementation from an interface perspective - what a client needs
     * to know.
     */
    public var security: Security? = null,
    /**
     * A specification of the restful capabilities of the solution for a specific resource type.
     *
     * Max of one repetition per resource type.
     */
    public var resource: List<Resource>? = null,
    /** A specification of restful operations supported by the system. */
    public var interaction: List<Interaction>? = null,
    /**
     * Search parameters that are supported for searching all resources for implementations to
     * support and/or make use of - either references to ones defined in the specification, or
     * additional ones defined for/by the implementation. This is only for searches executed against
     * the system-level endpoint.
     *
     * Typically, the only search parameters supported for all searches are those that apply to all
     * resources - tags, profiles, text search etc. These search parameters should include the
     * control search parameters such as _sort, _count, etc. that also apply to this resource
     * (though many will be listed at
     * [CapabilityStatement.rest.searchParam](capabilitystatement-definitions.html#CapabilityStatement.rest.searchParam)).
     * The behavior of some search parameters may be further described by other code or extension
     * elements, or narrative within the capability statement or linked
     * [SearchParameter](searchparameter.html#) definitions.
     */
    public var searchParam: List<Resource.SearchParam?>? = null,
    /**
     * Definition of an operation or a named query together with its parameters and their meaning
     * and type.
     *
     * CapabilityStatement.rest.operation is for operations invoked at the system level, or for
     * operations that are supported across multiple resource types. Operations linked from
     * CapabilityStatement.rest.operation must have OperationDefinition.system = true, or more than
     * one Operation.resource.
     */
    public var operation: List<Resource.Operation?>? = null,
    /**
     * An absolute URI which is a reference to the definition of a compartment that the system
     * supports. The reference is to a CompartmentDefinition resource by its canonical URL .
     *
     * At present, the only defined compartments are at
     * [CompartmentDefinition](compartmentdefinition.html).
     */
    public var compartment: List<Canonical?>? = null,
  ) : BackboneElement() {
    /**
     * Information about security implementation from an interface perspective - what a client needs
     * to know.
     */
    @Serializable(with = CapabilityStatementRestSecuritySerializer::class)
    public class Security(
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
       * Server adds CORS headers when responding to requests - this enables Javascript applications
       * to use the server.
       *
       * The easiest CORS headers to add are Access-Control-Allow-Origin: * &
       * Access-Control-Request-Method: GET, POST, PUT, DELETE. All servers SHOULD support CORS.
       */
      public var cors: Boolean? = null,
      /** Types of security services that are supported/required by the system. */
      public var service: List<CodeableConcept?>? = null,
      /** General description of how security works. */
      public var description: Markdown? = null,
    ) : BackboneElement()

    /** A specification of the restful capabilities of the solution for a specific resource type. */
    @Serializable(with = CapabilityStatementRestResourceSerializer::class)
    public class Resource(
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
      /** A type of resource exposed via the restful interface. */
      public var type: Enumeration<ResourceType>? = null,
      /**
       * A system-wide profile that is applied across *all* instances of the resource supported by
       * the system. For example, if declared on Observation, this profile is the "superset" of
       * capabilities for laboratory *and* vitals *and* other domains. See further discussion in
       * [Using Profiles](profiling.html#profile-uses).
       *
       * All other profiles for this type that are listed in `.rest.resource.supportedProfile` must
       * conform to this profile.
       */
      public var profile: Canonical? = null,
      /**
       * A list of profiles representing different use cases the system hosts/produces. A supported
       * profile is a statement about the functionality of the data and services provided by the
       * server (or the client) for supported use cases. For example, a system can define and
       * declare multiple Observation profiles for laboratory observations, vital sign observations,
       * etc. By declaring supported profiles, systems provide a way to determine whether individual
       * resources are conformant. See further discussion in
       * [Using Profiles](profiling.html#profile-uses).
       *
       * Supported profiles must conform to the resource profile in the `.rest.resource.profile`
       * element if it is present. The resource profile is a system-wide profile applied across
       * *all* instances of the resource supported by the system. A supported profile is a statement
       * about the functionality of the data and services provided by the server (or used by the
       * client) for a particular set of use cases and will not necessarily apply to all data
       * consumed or exposed by the server.
       */
      public var supportedProfile: List<Canonical?>? = null,
      /** Additional information about the resource type used by the system. */
      public var documentation: Markdown? = null,
      /**
       * Identifies a restful operation supported by the solution.
       *
       * In general, a Resource will only appear in a CapabilityStatement if the server actually has
       * some capabilities - e.g. there is at least one interaction supported. However interactions
       * can be omitted to support summarization (_summary = true).
       */
      public var interaction: List<Interaction>? = null,
      /**
       * This field is set to no-version to specify that the system does not support (server) or use
       * (client) versioning for this resource type. If this has some other value, the server must
       * at least correctly track and populate the versionId meta-property on resources. If the
       * value is 'versioned-update', then the server supports all the versioning features,
       * including using e-tags for version integrity in the API.
       *
       * If a server supports versionIds correctly, it SHOULD support vread too, but is not required
       * to do so.
       */
      public var versioning: Enumeration<ResourceVersionPolicy>? = null,
      /**
       * A flag for whether the server is able to return past versions as part of the vRead
       * operation.
       *
       * It is useful to support the vRead operation for current operations, even if past versions
       * aren't available.
       */
      public var readHistory: Boolean? = null,
      /**
       * A flag to indicate that the server allows or needs to allow the client to create new
       * identities on the server (that is, the client PUTs to a location where there is no existing
       * resource). Allowing this operation means that the server allows the client to create new
       * identities on the server.
       *
       * Allowing the clients to create new identities on the server means that the system
       * administrator needs to have confidence that the clients do not create clashing identities
       * between them. Obviously, if there is only one client, this won't happen. While creating
       * identities on the client means that the clients need to be managed, it's much more
       * convenient for many scenarios if such management can be put in place.
       */
      public var updateCreate: Boolean? = null,
      /**
       * A flag that indicates that the server supports conditional create.
       *
       * Conditional Create is mainly appropriate for interface engine scripts converting from other
       * formats, such as v2.
       */
      public var conditionalCreate: Boolean? = null,
      /**
       * A code that indicates how the server supports conditional read.
       *
       * Conditional Read is mainly appropriate for interface engine scripts converting from other
       * formats, such as v2.
       */
      public var conditionalRead: Enumeration<ConditionalReadStatus>? = null,
      /**
       * A flag that indicates that the server supports conditional update.
       *
       * Conditional Update is mainly appropriate for interface engine scripts converting from other
       * formats, such as v2.
       */
      public var conditionalUpdate: Boolean? = null,
      /**
       * A flag that indicates that the server supports conditional patch.
       *
       * Conditional Patch is mainly appropriate for interface engine scripts converting from other
       * formats, such as v2.
       */
      public var conditionalPatch: Boolean? = null,
      /**
       * A code that indicates how the server supports conditional delete.
       *
       * Conditional Delete is mainly appropriate for interface engine scripts converting from other
       * formats, such as v2.
       */
      public var conditionalDelete: Enumeration<ConditionalDeleteStatus>? = null,
      /** A set of flags that defines how references are supported. */
      public var referencePolicy: List<Enumeration<ReferenceHandlingPolicy>>? = null,
      /**
       * A list of _include values supported by the server.
       *
       * Documenting [`_include`](http://hl7.org/fhir/R5/search.html#revinclude) support helps set
       * conformance expectations for the desired system. Still, it is a level of detail that might
       * not be exposed by production servers or clients when using CapabilityStatement to describe
       * an actual implementation. If this list is empty, the server does not support includes.
       * Support for *iterative* (a.k.a., recursive) `_include` is communicated by listing the
       * iterative includes values supported by the server in the `searchInclude` element of the
       * "root" resource type. For example, to support the following search:
       *
       * `GET
       * [base]/CarePlan?_include=CarePlan:activity-reference:DeviceRequest&_include:iterate=DeviceRequest:device`
       *
       * These values would be listed as part of capabilities for "CarePlan":
       *
       * "searchInclude" : ["CarePlan:activity-reference:DeviceRequest","DeviceRequest:device"],
       */
      public var searchInclude: List<String?>? = null,
      /**
       * A list of _revinclude (reverse include) values supported by the server.
       *
       * See `CapabilityStatement.rest.resource.searchInclude` comments.
       */
      public var searchRevInclude: List<String?>? = null,
      /**
       * Search parameters for implementations to support and/or make use of - either references to
       * ones defined in the specification, or additional ones defined for/by the implementation.
       *
       * The search parameters should include the control search parameters such as _sort, _count,
       * etc. that also apply to this resource (though many will be listed at
       * [CapabilityStatement.rest.searchParam](capabilitystatement-definitions.html#CapabilityStatement.rest.searchParam)).
       * The behavior of some search parameters may be further described by other code or extension
       * elements, or narrative within the capability statement or linked
       * [SearchParameter](searchparameter.html#) definitions.
       */
      public var searchParam: List<SearchParam>? = null,
      /**
       * Definition of an operation or a named query together with its parameters and their meaning
       * and type. Consult the definition of the operation for details about how to invoke the
       * operation, and the parameters.
       *
       * Operations linked from CapabilityStatement.rest.resource.operation must have
       * OperationDefinition.type = true or OperationDefinition.instance = true.
       *
       * If an operation that is listed in multiple CapabilityStatement.rest.resource.operation
       * (e.g. for different resource types), then clients should understand that the operation is
       * only supported on the specified resource types, and that may be a subset of those listed in
       * OperationDefinition.resource.
       */
      public var operation: List<Operation>? = null,
    ) : BackboneElement() {
      /** Identifies a restful operation supported by the solution. */
      @Serializable(with = CapabilityStatementRestResourceInteractionSerializer::class)
      public class Interaction(
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
        /** Coded identifier of the operation, supported by the system resource. */
        public var code: Enumeration<TypeRestfulInteraction>? = null,
        /**
         * Guidance specific to the implementation of this operation, such as 'delete is a logical
         * delete' or 'updates are only allowed with version id' or 'creates permitted from
         * pre-authorized certificates only'.
         */
        public var documentation: Markdown? = null,
      ) : BackboneElement()

      /**
       * Search parameters for implementations to support and/or make use of - either references to
       * ones defined in the specification, or additional ones defined for/by the implementation.
       */
      @Serializable(with = CapabilityStatementRestResourceSearchParamSerializer::class)
      public class SearchParam(
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
        /**
         * The label used for the search parameter in this particular system's API - i.e. the 'name'
         * portion of the name-value pair that will appear as part of the search URL. This SHOULD be
         * the same as the SearchParameter.code of the defining SearchParameter. However, it can
         * sometimes differ if necessary to disambiguate when a server supports multiple
         * SearchParameters that happen to share the same code.
         *
         * Parameter names cannot overlap with standard parameter names, and standard parameters
         * cannot be redefined. There is no correspondence whatsoever between CapabilityStatement's
         * searchParam.name and SearchParameter.name - the latter is used as a class name when
         * generating code for the search parameter.
         */
        public var name: String? = null,
        /**
         * An absolute URI that is a formal reference to where this parameter was first defined, so
         * that a client can be confident of the meaning of the search parameter (a reference to
         * [SearchParameter.url](searchparameter-definitions.html#SearchParameter.url)). This
         * element SHALL be populated if the search parameter refers to a SearchParameter defined by
         * the FHIR core specification or externally defined IGs.
         *
         * This SHOULD be present, and matches refers to a SearchParameter by its canonical URL. If
         * systems wish to document their support for modifiers, comparators, target resource types,
         * and chained parameters, they should do using a search parameter resource. This element
         * SHALL be populated if the search parameter refers to a SearchParameter defined by the
         * FHIR core specification or externally defined IGs.
         */
        public var definition: Canonical? = null,
        /**
         * The type of value a search parameter refers to, and how the content is interpreted.
         *
         * While this can be looked up from the definition, it is included here as a convenience for
         * systems that autogenerate a query interface based on the server capability statement. It
         * SHALL be the same as the type in the search parameter definition.
         */
        public var type: Enumeration<SearchParamType>? = null,
        /**
         * This allows documentation of any distinct behaviors about how the search parameter is
         * used. For example, text matching algorithms.
         */
        public var documentation: Markdown? = null,
      ) : BackboneElement()

      /**
       * Definition of an operation or a named query together with its parameters and their meaning
       * and type. Consult the definition of the operation for details about how to invoke the
       * operation, and the parameters.
       */
      @Serializable(with = CapabilityStatementRestResourceOperationSerializer::class)
      public class Operation(
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
        /**
         * The name of the operation or query. For an operation, this name is prefixed with $ and
         * used in the URL. For a query, this is the name used in the _query parameter when the
         * query is called. This SHOULD be the same as the OperationDefinition.code of the defining
         * OperationDefinition. However, it can sometimes differ if necessary to disambiguate when a
         * server supports multiple OperationDefinition that happen to share the same code.
         *
         * The name here SHOULD be the same as the OperationDefinition.code in the referenced
         * OperationDefinition, unless there is a name clash and the OperationDefinition.code cannot
         * be used. The name does not include the "$" portion that is always included in the URL.
         * There is no correspondence whatsoever between CapabilityStatement's operation.name and
         * OperationDefinition.name - the latter is used as a class name when generating code for
         * the operation. HL7 will never define operations that have conflicting names.
         */
        public var name: String? = null,
        /**
         * Where the formal definition can be found. If a server references the base definition of
         * an Operation (i.e. from the specification itself such
         * as ```http://hl7.org/fhir/OperationDefinition/ValueSet-expand```), that means it supports
         * the full capabilities of the operation - e.g. both GET and POST invocation. If it only
         * supports a subset, it must define its own custom
         * [OperationDefinition](operationdefinition.html#) with a 'base' of the original
         * OperationDefinition. The custom definition would describe the specific subset of
         * functionality supported.
         *
         * This can be used to build an HTML form to invoke the operation, for instance.
         */
        public var definition: Canonical? = null,
        /**
         * Documentation that describes anything special about the operation behavior, possibly
         * detailing different behavior for system, type and instance-level invocation of the
         * operation.
         */
        public var documentation: Markdown? = null,
      ) : BackboneElement()
    }

    /** A specification of restful operations supported by the system. */
    @Serializable(with = CapabilityStatementRestInteractionSerializer::class)
    public class Interaction(
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
      /** A coded identifier of the operation, supported by the system. */
      public var code: Enumeration<SystemRestfulInteraction>? = null,
      /**
       * Guidance specific to the implementation of this operation, such as limitations on the kind
       * of transactions allowed, or information about system wide search is implemented.
       */
      public var documentation: Markdown? = null,
    ) : BackboneElement()
  }

  /** A description of the messaging capabilities of the solution. */
  @Serializable(with = CapabilityStatementMessagingSerializer::class)
  public class Messaging(
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
    /** An endpoint (network accessible address) to which messages and/or replies are to be sent. */
    public var endpoint: List<Endpoint>? = null,
    /**
     * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the
     * cache length on the receiver should be (if a sender).
     *
     * If this value is missing then the application does not implement (receiver) or depend on
     * (sender) reliable messaging.
     */
    public var reliableCache: UnsignedInt? = null,
    /**
     * Documentation about the system's messaging capabilities for this endpoint not otherwise
     * documented by the capability statement. For example, the process for becoming an authorized
     * messaging exchange partner.
     */
    public var documentation: Markdown? = null,
    /**
     * References to message definitions for messages this system can send or receive.
     *
     * This is a proposed alternative to the messaging.event structure.
     */
    public var supportedMessage: List<SupportedMessage>? = null,
  ) : BackboneElement() {
    /** An endpoint (network accessible address) to which messages and/or replies are to be sent. */
    @Serializable(with = CapabilityStatementMessagingEndpointSerializer::class)
    public class Endpoint(
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
      /** A list of the messaging transport protocol(s) identifiers, supported by this endpoint. */
      public var protocol: Coding? = null,
      /**
       * The network address of the endpoint. For solutions that do not use network addresses for
       * routing, it can be just an identifier.
       */
      public var address: Url? = null,
    ) : BackboneElement()

    /** References to message definitions for messages this system can send or receive. */
    @Serializable(with = CapabilityStatementMessagingSupportedMessageSerializer::class)
    public class SupportedMessage(
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
      /** The mode of this event declaration - whether application is sender or receiver. */
      public var mode: Enumeration<EventCapabilityMode>? = null,
      /**
       * Points to a message definition that identifies the messaging event, message structure,
       * allowed responses, etc.
       */
      public var definition: Canonical? = null,
    ) : BackboneElement()
  }

  /** A document definition. */
  @Serializable(with = CapabilityStatementDocumentSerializer::class)
  public class Document(
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
    /** Mode of this document declaration - whether an application is a producer or consumer. */
    public var mode: Enumeration<DocumentMode>? = null,
    /**
     * A description of how the application supports or uses the specified document profile. For
     * example, when documents are created, what action is taken with consumed documents, etc.
     */
    public var documentation: Markdown? = null,
    /**
     * A profile on the document Bundle that constrains which resources are present, and their
     * contents.
     *
     * The profile is actually on the Bundle.
     */
    public var profile: Canonical? = null,
  ) : BackboneElement()

  @Serializable(with = CapabilityStatementVersionAlgorithmSerializer::class)
  public sealed interface VersionAlgorithm {
    public fun asString(): String? = this as? String

    public fun asCoding(): Coding? = this as? Coding

    public data class String(public val `value`: com.google.fhir.model.r5.String) :
      VersionAlgorithm

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) :
      VersionAlgorithm

    public data object Null : VersionAlgorithm

    public companion object {
      public fun from(
        stringValue: com.google.fhir.model.r5.String?,
        CodingValue: com.google.fhir.model.r5.Coding?,
      ): VersionAlgorithm {
        if (stringValue != null) return String(stringValue)
        if (CodingValue != null) return Coding(CodingValue)
        return Null
      }
    }
  }

  /** The mode of a RESTful capability statement. */
  public enum class RestfulCapabilityMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The application acts as a client for this resource. */
    Client(
      "client",
      "http://hl7.org/fhir/restful-capability-mode",
      "Client",
      "The application acts as a client for this resource.",
    ),
    /** The application acts as a server for this resource. */
    Server(
      "server",
      "http://hl7.org/fhir/restful-capability-mode",
      "Server",
      "The application acts as a server for this resource.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): RestfulCapabilityMode =
        when (code) {
          "client" -> Client
          "server" -> Server
          else ->
            throw IllegalArgumentException("Unknown code $code for enum RestfulCapabilityMode")
        }
    }
  }

  /** How the system supports versioning for a resource. */
  public enum class ResourceVersionPolicy(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** VersionId meta-property is not supported (server) or used (client). */
    No_Version(
      "no-version",
      "http://hl7.org/fhir/versioning-policy",
      "No VersionId Support",
      "VersionId meta-property is not supported (server) or used (client).",
    ),
    /** VersionId meta-property is supported (server) or used (client). */
    Versioned(
      "versioned",
      "http://hl7.org/fhir/versioning-policy",
      "Versioned",
      "VersionId meta-property is supported (server) or used (client).",
    ),
    /**
     * Supports version-aware updates (server) or will be specified (If-match header) for updates
     * (client).
     */
    Versioned_Update(
      "versioned-update",
      "http://hl7.org/fhir/versioning-policy",
      "VersionId tracked fully",
      "Supports version-aware updates (server) or will be specified (If-match header) for updates (client).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ResourceVersionPolicy =
        when (code) {
          "no-version" -> No_Version
          "versioned" -> Versioned
          "versioned-update" -> Versioned_Update
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ResourceVersionPolicy")
        }
    }
  }

  /** A code that indicates how the server supports conditional read. */
  public enum class ConditionalReadStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** No support for conditional reads. */
    Not_Supported(
      "not-supported",
      "http://hl7.org/fhir/conditional-read-status",
      "Not Supported",
      "No support for conditional reads.",
    ),
    /** Conditional reads are supported, but only with the If-Modified-Since HTTP Header. */
    Modified_Since(
      "modified-since",
      "http://hl7.org/fhir/conditional-read-status",
      "If-Modified-Since",
      "Conditional reads are supported, but only with the If-Modified-Since HTTP Header.",
    ),
    /** Conditional reads are supported, but only with the If-None-Match HTTP Header. */
    Not_Match(
      "not-match",
      "http://hl7.org/fhir/conditional-read-status",
      "If-None-Match",
      "Conditional reads are supported, but only with the If-None-Match HTTP Header.",
    ),
    /**
     * Conditional reads are supported, with both If-Modified-Since and If-None-Match HTTP Headers.
     */
    Full_Support(
      "full-support",
      "http://hl7.org/fhir/conditional-read-status",
      "Full Support",
      "Conditional reads are supported, with both If-Modified-Since and If-None-Match HTTP Headers.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ConditionalReadStatus =
        when (code) {
          "not-supported" -> Not_Supported
          "modified-since" -> Modified_Since
          "not-match" -> Not_Match
          "full-support" -> Full_Support
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ConditionalReadStatus")
        }
    }
  }

  /** A code that indicates how the server supports conditional delete. */
  public enum class ConditionalDeleteStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** No support for conditional deletes. */
    Not_Supported(
      "not-supported",
      "http://hl7.org/fhir/conditional-delete-status",
      "Not Supported",
      "No support for conditional deletes.",
    ),
    /** Conditional deletes are supported, but only single resources at a time. */
    Single(
      "single",
      "http://hl7.org/fhir/conditional-delete-status",
      "Single Deletes Supported",
      "Conditional deletes are supported, but only single resources at a time.",
    ),
    /**
     * Conditional deletes are supported, and multiple resources can be deleted in a single
     * interaction.
     */
    Multiple(
      "multiple",
      "http://hl7.org/fhir/conditional-delete-status",
      "Multiple Deletes Supported",
      "Conditional deletes are supported, and multiple resources can be deleted in a single interaction.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ConditionalDeleteStatus =
        when (code) {
          "not-supported" -> Not_Supported
          "single" -> Single
          "multiple" -> Multiple
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ConditionalDeleteStatus")
        }
    }
  }

  /** A set of flags that defines how references are supported. */
  public enum class ReferenceHandlingPolicy(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The server supports and populates Literal references (i.e. using Reference.reference) where
     * they are known (this code does not guarantee that all references are literal; see
     * 'enforced').
     */
    Literal(
      "literal",
      "http://hl7.org/fhir/reference-handling-policy",
      "Literal References",
      "The server supports and populates Literal references (i.e. using Reference.reference) where they are known (this code does not guarantee that all references are literal; see 'enforced').",
    ),
    /** The server allows logical references (i.e. using Reference.identifier). */
    Logical(
      "logical",
      "http://hl7.org/fhir/reference-handling-policy",
      "Logical References",
      "The server allows logical references (i.e. using Reference.identifier).",
    ),
    /**
     * The server will attempt to resolve logical references to literal references - i.e. converting
     * Reference.identifier to Reference.reference (if resolution fails, the server may still accept
     * resources; see logical).
     */
    Resolves(
      "resolves",
      "http://hl7.org/fhir/reference-handling-policy",
      "Resolves References",
      "The server will attempt to resolve logical references to literal references - i.e. converting Reference.identifier to Reference.reference (if resolution fails, the server may still accept resources; see logical).",
    ),
    /**
     * The server enforces that references have integrity - e.g. it ensures that references can
     * always be resolved. This is typically the case for clinical record systems, but often not the
     * case for middleware/proxy systems.
     */
    Enforced(
      "enforced",
      "http://hl7.org/fhir/reference-handling-policy",
      "Reference Integrity Enforced",
      "The server enforces that references have integrity - e.g. it ensures that references can always be resolved. This is typically the case for clinical record systems, but often not the case for middleware/proxy systems.",
    ),
    /** The server does not support references that point to other servers. */
    Local(
      "local",
      "http://hl7.org/fhir/reference-handling-policy",
      "Local References Only",
      "The server does not support references that point to other servers.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ReferenceHandlingPolicy =
        when (code) {
          "literal" -> Literal
          "logical" -> Logical
          "resolves" -> Resolves
          "enforced" -> Enforced
          "local" -> Local
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ReferenceHandlingPolicy")
        }
    }
  }

  /** Operations supported by REST at the type or instance level. */
  public enum class TypeRestfulInteraction(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Read the current state of the resource. */
    Read(
      "read",
      "http://hl7.org/fhir/restful-interaction",
      "read",
      "Read the current state of the resource.",
    ),
    /** Read the state of a specific version of the resource. */
    Vread(
      "vread",
      "http://hl7.org/fhir/restful-interaction",
      "vread",
      "Read the state of a specific version of the resource.",
    ),
    /** Update an existing resource by its id (or create it if it is new). */
    Update(
      "update",
      "http://hl7.org/fhir/restful-interaction",
      "update",
      "Update an existing resource by its id (or create it if it is new).",
    ),
    /** Update an existing resource by posting a set of changes to it. */
    Patch(
      "patch",
      "http://hl7.org/fhir/restful-interaction",
      "patch",
      "Update an existing resource by posting a set of changes to it.",
    ),
    /** Delete a resource. */
    Delete("delete", "http://hl7.org/fhir/restful-interaction", "delete", "Delete a resource."),
    /** Retrieve the change history for a particular resource. */
    History_Instance(
      "history-instance",
      "http://hl7.org/fhir/restful-interaction",
      "history-instance",
      "Retrieve the change history for a particular resource.",
    ),
    /** Retrieve the change history for all resources of a particular type. */
    History_Type(
      "history-type",
      "http://hl7.org/fhir/restful-interaction",
      "history-type",
      "Retrieve the change history for all resources of a particular type.",
    ),
    /** Create a new resource with a server assigned id. */
    Create(
      "create",
      "http://hl7.org/fhir/restful-interaction",
      "create",
      "Create a new resource with a server assigned id.",
    ),
    /** Search all resources of the specified type based on some filter criteria. */
    Search_Type(
      "search-type",
      "http://hl7.org/fhir/restful-interaction",
      "search-type",
      "Search all resources of the specified type based on some filter criteria.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TypeRestfulInteraction =
        when (code) {
          "read" -> Read
          "vread" -> Vread
          "update" -> Update
          "patch" -> Patch
          "delete" -> Delete
          "history-instance" -> History_Instance
          "history-type" -> History_Type
          "create" -> Create
          "search-type" -> Search_Type
          else ->
            throw IllegalArgumentException("Unknown code $code for enum TypeRestfulInteraction")
        }
    }
  }

  /** Operations supported by REST at the system level. */
  public enum class SystemRestfulInteraction(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Retrieve the change history for all resources on a system. */
    History_System(
      "history-system",
      "http://hl7.org/fhir/restful-interaction",
      "history-system",
      "Retrieve the change history for all resources on a system.",
    ),
    /** Search all resources based on some filter criteria. */
    Search_System(
      "search-system",
      "http://hl7.org/fhir/restful-interaction",
      "search-system",
      "Search all resources based on some filter criteria.",
    ),
    /** Update, create or delete a set of resources as a single transaction. */
    Transaction(
      "transaction",
      "http://hl7.org/fhir/restful-interaction",
      "transaction",
      "Update, create or delete a set of resources as a single transaction.",
    ),
    /** perform a set of a separate interactions in a single http operation */
    Batch(
      "batch",
      "http://hl7.org/fhir/restful-interaction",
      "batch",
      "perform a set of a separate interactions in a single http operation",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SystemRestfulInteraction =
        when (code) {
          "history-system" -> History_System
          "search-system" -> Search_System
          "transaction" -> Transaction
          "batch" -> Batch
          else ->
            throw IllegalArgumentException("Unknown code $code for enum SystemRestfulInteraction")
        }
    }
  }

  /** The mode of a message capability statement. */
  public enum class EventCapabilityMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The application sends requests and receives responses. */
    Sender(
      "sender",
      "http://hl7.org/fhir/event-capability-mode",
      "Sender",
      "The application sends requests and receives responses.",
    ),
    /** The application receives requests and sends responses. */
    Receiver(
      "receiver",
      "http://hl7.org/fhir/event-capability-mode",
      "Receiver",
      "The application receives requests and sends responses.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): EventCapabilityMode =
        when (code) {
          "sender" -> Sender
          "receiver" -> Receiver
          else -> throw IllegalArgumentException("Unknown code $code for enum EventCapabilityMode")
        }
    }
  }

  /** Whether the application produces or consumes documents. */
  public enum class DocumentMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The application produces documents of the specified type. */
    Producer(
      "producer",
      "http://hl7.org/fhir/document-mode",
      "Producer",
      "The application produces documents of the specified type.",
    ),
    /** The application consumes documents of the specified type. */
    Consumer(
      "consumer",
      "http://hl7.org/fhir/document-mode",
      "Consumer",
      "The application consumes documents of the specified type.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DocumentMode =
        when (code) {
          "producer" -> Producer
          "consumer" -> Consumer
          else -> throw IllegalArgumentException("Unknown code $code for enum DocumentMode")
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
}
