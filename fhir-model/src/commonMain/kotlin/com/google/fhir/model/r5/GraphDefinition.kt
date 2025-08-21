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

import com.google.fhir.model.r5.serializers.GraphDefinitionLinkCompartmentSerializer
import com.google.fhir.model.r5.serializers.GraphDefinitionLinkSerializer
import com.google.fhir.model.r5.serializers.GraphDefinitionNodeSerializer
import com.google.fhir.model.r5.serializers.GraphDefinitionSerializer
import com.google.fhir.model.r5.serializers.GraphDefinitionVersionAlgorithmSerializer
import com.google.fhir.model.r5.terminologies.PublicationStatus
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A formal computable definition of a graph of resources - that is, a coherent set of resources
 * that form a graph by following references. The Graph Definition resource defines a set and makes
 * rules about the set.
 */
@Serializable(with = GraphDefinitionSerializer::class)
@SerialName("GraphDefinition")
public data class GraphDefinition(
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
  override var contained: MutableList<Resource> = mutableListOf(),
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
  override var extension: MutableList<Extension> = mutableListOf(),
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
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /**
   * An absolute URI that is used to identify this graph definition when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * graph definition is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the graph definition is stored on different servers.
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
   * A formal identifier that is used to identify this GraphDefinition when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The identifier that is used to identify this version of the graph definition when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the graph definition author and is not expected to be globally unique. For example, it might be
   * a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different graph definition instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the graph definition with the format [url]|[version]. The
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
   * A natural language name identifying the graph definition. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String,
  /**
   * A short, descriptive, user-friendly title for the capability statement.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this graph definition. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of graph definitions that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this graph definition is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of graph definitions that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the graph definition was last significantly changed. The
   * date must change when the business version changes and it must change if the status code
   * changes. In addition, it should change when the substantive content of the graph definition
   * changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the graph definition. Additional specific dates may be
   * added as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the graph definition.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the graph
   * definition is the organization or individual primarily responsible for the maintenance and
   * upkeep of the graph definition. This is not necessarily the same individual or organization
   * that developed and initially authored the content. The publisher is the primary point of
   * contact for questions or issues with the graph definition. This item SHOULD be populated unless
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
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * A free text natural language description of the graph definition from a consumer's perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the graph definition as conveyed in the 'text' field of the resource
   * itself. This item SHOULD be populated unless the information is available from context (e.g.
   * the language of the graph definition is presumed to be the predominant language in the place
   * the graph definition was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate graph definition instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A legal or geographic region in which the graph definition is intended to be used.
   *
   * It may be possible for the graph definition to be used in jurisdictions other than those for
   * which it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Explanation of why this graph definition is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the graph definition. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * graph definition.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the graph definition and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the graph definition.
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
   * The Node at which instances of this graph start. If there is no nominated start, the graph can
   * start at any of the nodes.
   */
  public var start: Id? = null,
  /** Potential target for the link. */
  public var node: MutableList<Node> = mutableListOf(),
  /** Links this graph makes rules about. */
  public var link: MutableList<Link> = mutableListOf(),
) : DomainResource() {
  /** Potential target for the link. */
  @Serializable(with = GraphDefinitionNodeSerializer::class)
  public class Node(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** Internal ID of node - target for link references. */
    public var nodeId: Id,
    /** Information about why this node is of interest in this graph definition. */
    public var description: String? = null,
    /** Type of resource this link refers to. */
    public var type: Enumeration<VersionIndependentResourceTypesAll>,
    /** Profile for the target resource. */
    public var profile: Canonical? = null,
  ) : BackboneElement()

  /** Links this graph makes rules about. */
  @Serializable(with = GraphDefinitionLinkSerializer::class)
  public class Link(
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
    override var extension: MutableList<Extension> = mutableListOf(),
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** Information about why this link is of interest in this graph definition. */
    public var description: String? = null,
    /** Minimum occurrences for this link. */
    public var min: Integer? = null,
    /** Maximum occurrences for this link. */
    public var max: String? = null,
    /** The source node for this link. */
    public var sourceId: Id,
    /**
     * A FHIRPath expression that identifies one of FHIR References to other resources.
     *
     * The path expression cannot contain a resolve() function. If there is no path, the link is a
     * reverse lookup, using target.params. If the path is "*" then this means all references in the
     * resource.
     */
    public var path: String? = null,
    /** Which slice (if profiled). */
    public var sliceName: String? = null,
    /** The target node for this link. */
    public var targetId: Id,
    /**
     * A set of parameters to look up.
     *
     * At least one of the parameters must have the value {ref} which identifies the focus resource.
     */
    public var params: String? = null,
    /** Compartment Consistency Rules. */
    public var compartment: MutableList<Compartment> = mutableListOf(),
  ) : BackboneElement() {
    /** Compartment Consistency Rules. */
    @Serializable(with = GraphDefinitionLinkCompartmentSerializer::class)
    public class Compartment(
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * Defines how the compartment rule is used - whether it it is used to test whether resources
       * are subject to the rule, or whether it is a rule that must be followed.
       *
       * All conditional rules are evaluated; if they are true, then the rules are evaluated.
       */
      public var use: Enumeration<GraphCompartmentUse>,
      /** identical | matching | different | no-rule | custom. */
      public var rule: Enumeration<GraphCompartmentRule>,
      /** Identifies the compartment. */
      public var code: Enumeration<CompartmentType>,
      /** Custom rule, as a FHIRPath expression. */
      public var expression: String? = null,
      /** Documentation for FHIRPath expression. */
      public var description: String? = null,
    ) : BackboneElement()
  }

  @Serializable(with = GraphDefinitionVersionAlgorithmSerializer::class)
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

  /** Current and past FHIR resource types (deleted or renamed), including abstract types */
  public enum class VersionIndependentResourceTypesAll(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Account("Account", "http://hl7.org/fhir/fhir-types", "Account"),
    ActivityDefinition(
      "ActivityDefinition",
      "http://hl7.org/fhir/fhir-types",
      "ActivityDefinition",
    ),
    ActorDefinition("ActorDefinition", "http://hl7.org/fhir/fhir-types", "ActorDefinition"),
    AdministrableProductDefinition(
      "AdministrableProductDefinition",
      "http://hl7.org/fhir/fhir-types",
      "AdministrableProductDefinition",
    ),
    AdverseEvent("AdverseEvent", "http://hl7.org/fhir/fhir-types", "AdverseEvent"),
    AllergyIntolerance(
      "AllergyIntolerance",
      "http://hl7.org/fhir/fhir-types",
      "AllergyIntolerance",
    ),
    Appointment("Appointment", "http://hl7.org/fhir/fhir-types", "Appointment"),
    AppointmentResponse(
      "AppointmentResponse",
      "http://hl7.org/fhir/fhir-types",
      "AppointmentResponse",
    ),
    ArtifactAssessment(
      "ArtifactAssessment",
      "http://hl7.org/fhir/fhir-types",
      "ArtifactAssessment",
    ),
    AuditEvent("AuditEvent", "http://hl7.org/fhir/fhir-types", "AuditEvent"),
    Basic("Basic", "http://hl7.org/fhir/fhir-types", "Basic"),
    Binary("Binary", "http://hl7.org/fhir/fhir-types", "Binary"),
    BiologicallyDerivedProduct(
      "BiologicallyDerivedProduct",
      "http://hl7.org/fhir/fhir-types",
      "BiologicallyDerivedProduct",
    ),
    BiologicallyDerivedProductDispense(
      "BiologicallyDerivedProductDispense",
      "http://hl7.org/fhir/fhir-types",
      "BiologicallyDerivedProductDispense",
    ),
    BodyStructure("BodyStructure", "http://hl7.org/fhir/fhir-types", "BodyStructure"),
    Bundle("Bundle", "http://hl7.org/fhir/fhir-types", "Bundle"),
    CanonicalResource("CanonicalResource", "http://hl7.org/fhir/fhir-types", "CanonicalResource"),
    CapabilityStatement(
      "CapabilityStatement",
      "http://hl7.org/fhir/fhir-types",
      "CapabilityStatement",
    ),
    CarePlan("CarePlan", "http://hl7.org/fhir/fhir-types", "CarePlan"),
    CareTeam("CareTeam", "http://hl7.org/fhir/fhir-types", "CareTeam"),
    ChargeItem("ChargeItem", "http://hl7.org/fhir/fhir-types", "ChargeItem"),
    ChargeItemDefinition(
      "ChargeItemDefinition",
      "http://hl7.org/fhir/fhir-types",
      "ChargeItemDefinition",
    ),
    Citation("Citation", "http://hl7.org/fhir/fhir-types", "Citation"),
    Claim("Claim", "http://hl7.org/fhir/fhir-types", "Claim"),
    ClaimResponse("ClaimResponse", "http://hl7.org/fhir/fhir-types", "ClaimResponse"),
    ClinicalImpression(
      "ClinicalImpression",
      "http://hl7.org/fhir/fhir-types",
      "ClinicalImpression",
    ),
    ClinicalUseDefinition(
      "ClinicalUseDefinition",
      "http://hl7.org/fhir/fhir-types",
      "ClinicalUseDefinition",
    ),
    CodeSystem("CodeSystem", "http://hl7.org/fhir/fhir-types", "CodeSystem"),
    Communication("Communication", "http://hl7.org/fhir/fhir-types", "Communication"),
    CommunicationRequest(
      "CommunicationRequest",
      "http://hl7.org/fhir/fhir-types",
      "CommunicationRequest",
    ),
    CompartmentDefinition(
      "CompartmentDefinition",
      "http://hl7.org/fhir/fhir-types",
      "CompartmentDefinition",
    ),
    Composition("Composition", "http://hl7.org/fhir/fhir-types", "Composition"),
    ConceptMap("ConceptMap", "http://hl7.org/fhir/fhir-types", "ConceptMap"),
    Condition("Condition", "http://hl7.org/fhir/fhir-types", "Condition"),
    ConditionDefinition(
      "ConditionDefinition",
      "http://hl7.org/fhir/fhir-types",
      "ConditionDefinition",
    ),
    Consent("Consent", "http://hl7.org/fhir/fhir-types", "Consent"),
    Contract("Contract", "http://hl7.org/fhir/fhir-types", "Contract"),
    Coverage("Coverage", "http://hl7.org/fhir/fhir-types", "Coverage"),
    CoverageEligibilityRequest(
      "CoverageEligibilityRequest",
      "http://hl7.org/fhir/fhir-types",
      "CoverageEligibilityRequest",
    ),
    CoverageEligibilityResponse(
      "CoverageEligibilityResponse",
      "http://hl7.org/fhir/fhir-types",
      "CoverageEligibilityResponse",
    ),
    DetectedIssue("DetectedIssue", "http://hl7.org/fhir/fhir-types", "DetectedIssue"),
    Device("Device", "http://hl7.org/fhir/fhir-types", "Device"),
    DeviceAssociation("DeviceAssociation", "http://hl7.org/fhir/fhir-types", "DeviceAssociation"),
    DeviceDefinition("DeviceDefinition", "http://hl7.org/fhir/fhir-types", "DeviceDefinition"),
    DeviceDispense("DeviceDispense", "http://hl7.org/fhir/fhir-types", "DeviceDispense"),
    DeviceMetric("DeviceMetric", "http://hl7.org/fhir/fhir-types", "DeviceMetric"),
    DeviceRequest("DeviceRequest", "http://hl7.org/fhir/fhir-types", "DeviceRequest"),
    DeviceUsage("DeviceUsage", "http://hl7.org/fhir/fhir-types", "DeviceUsage"),
    DiagnosticReport("DiagnosticReport", "http://hl7.org/fhir/fhir-types", "DiagnosticReport"),
    DocumentReference("DocumentReference", "http://hl7.org/fhir/fhir-types", "DocumentReference"),
    DomainResource("DomainResource", "http://hl7.org/fhir/fhir-types", "DomainResource"),
    Encounter("Encounter", "http://hl7.org/fhir/fhir-types", "Encounter"),
    EncounterHistory("EncounterHistory", "http://hl7.org/fhir/fhir-types", "EncounterHistory"),
    Endpoint("Endpoint", "http://hl7.org/fhir/fhir-types", "Endpoint"),
    EnrollmentRequest("EnrollmentRequest", "http://hl7.org/fhir/fhir-types", "EnrollmentRequest"),
    EnrollmentResponse(
      "EnrollmentResponse",
      "http://hl7.org/fhir/fhir-types",
      "EnrollmentResponse",
    ),
    EpisodeOfCare("EpisodeOfCare", "http://hl7.org/fhir/fhir-types", "EpisodeOfCare"),
    EventDefinition("EventDefinition", "http://hl7.org/fhir/fhir-types", "EventDefinition"),
    Evidence("Evidence", "http://hl7.org/fhir/fhir-types", "Evidence"),
    EvidenceReport("EvidenceReport", "http://hl7.org/fhir/fhir-types", "EvidenceReport"),
    EvidenceVariable("EvidenceVariable", "http://hl7.org/fhir/fhir-types", "EvidenceVariable"),
    ExampleScenario("ExampleScenario", "http://hl7.org/fhir/fhir-types", "ExampleScenario"),
    ExplanationOfBenefit(
      "ExplanationOfBenefit",
      "http://hl7.org/fhir/fhir-types",
      "ExplanationOfBenefit",
    ),
    FamilyMemberHistory(
      "FamilyMemberHistory",
      "http://hl7.org/fhir/fhir-types",
      "FamilyMemberHistory",
    ),
    Flag("Flag", "http://hl7.org/fhir/fhir-types", "Flag"),
    FormularyItem("FormularyItem", "http://hl7.org/fhir/fhir-types", "FormularyItem"),
    GenomicStudy("GenomicStudy", "http://hl7.org/fhir/fhir-types", "GenomicStudy"),
    Goal("Goal", "http://hl7.org/fhir/fhir-types", "Goal"),
    GraphDefinition("GraphDefinition", "http://hl7.org/fhir/fhir-types", "GraphDefinition"),
    Group("Group", "http://hl7.org/fhir/fhir-types", "Group"),
    GuidanceResponse("GuidanceResponse", "http://hl7.org/fhir/fhir-types", "GuidanceResponse"),
    HealthcareService("HealthcareService", "http://hl7.org/fhir/fhir-types", "HealthcareService"),
    ImagingSelection("ImagingSelection", "http://hl7.org/fhir/fhir-types", "ImagingSelection"),
    ImagingStudy("ImagingStudy", "http://hl7.org/fhir/fhir-types", "ImagingStudy"),
    Immunization("Immunization", "http://hl7.org/fhir/fhir-types", "Immunization"),
    ImmunizationEvaluation(
      "ImmunizationEvaluation",
      "http://hl7.org/fhir/fhir-types",
      "ImmunizationEvaluation",
    ),
    ImmunizationRecommendation(
      "ImmunizationRecommendation",
      "http://hl7.org/fhir/fhir-types",
      "ImmunizationRecommendation",
    ),
    ImplementationGuide(
      "ImplementationGuide",
      "http://hl7.org/fhir/fhir-types",
      "ImplementationGuide",
    ),
    Ingredient("Ingredient", "http://hl7.org/fhir/fhir-types", "Ingredient"),
    InsurancePlan("InsurancePlan", "http://hl7.org/fhir/fhir-types", "InsurancePlan"),
    InventoryItem("InventoryItem", "http://hl7.org/fhir/fhir-types", "InventoryItem"),
    InventoryReport("InventoryReport", "http://hl7.org/fhir/fhir-types", "InventoryReport"),
    Invoice("Invoice", "http://hl7.org/fhir/fhir-types", "Invoice"),
    Library("Library", "http://hl7.org/fhir/fhir-types", "Library"),
    Linkage("Linkage", "http://hl7.org/fhir/fhir-types", "Linkage"),
    List("List", "http://hl7.org/fhir/fhir-types", "List"),
    Location("Location", "http://hl7.org/fhir/fhir-types", "Location"),
    ManufacturedItemDefinition(
      "ManufacturedItemDefinition",
      "http://hl7.org/fhir/fhir-types",
      "ManufacturedItemDefinition",
    ),
    Measure("Measure", "http://hl7.org/fhir/fhir-types", "Measure"),
    MeasureReport("MeasureReport", "http://hl7.org/fhir/fhir-types", "MeasureReport"),
    Medication("Medication", "http://hl7.org/fhir/fhir-types", "Medication"),
    MedicationAdministration(
      "MedicationAdministration",
      "http://hl7.org/fhir/fhir-types",
      "MedicationAdministration",
    ),
    MedicationDispense(
      "MedicationDispense",
      "http://hl7.org/fhir/fhir-types",
      "MedicationDispense",
    ),
    MedicationKnowledge(
      "MedicationKnowledge",
      "http://hl7.org/fhir/fhir-types",
      "MedicationKnowledge",
    ),
    MedicationRequest("MedicationRequest", "http://hl7.org/fhir/fhir-types", "MedicationRequest"),
    MedicationStatement(
      "MedicationStatement",
      "http://hl7.org/fhir/fhir-types",
      "MedicationStatement",
    ),
    MedicinalProductDefinition(
      "MedicinalProductDefinition",
      "http://hl7.org/fhir/fhir-types",
      "MedicinalProductDefinition",
    ),
    MessageDefinition("MessageDefinition", "http://hl7.org/fhir/fhir-types", "MessageDefinition"),
    MessageHeader("MessageHeader", "http://hl7.org/fhir/fhir-types", "MessageHeader"),
    MetadataResource("MetadataResource", "http://hl7.org/fhir/fhir-types", "MetadataResource"),
    MolecularSequence("MolecularSequence", "http://hl7.org/fhir/fhir-types", "MolecularSequence"),
    NamingSystem("NamingSystem", "http://hl7.org/fhir/fhir-types", "NamingSystem"),
    NutritionIntake("NutritionIntake", "http://hl7.org/fhir/fhir-types", "NutritionIntake"),
    NutritionOrder("NutritionOrder", "http://hl7.org/fhir/fhir-types", "NutritionOrder"),
    NutritionProduct("NutritionProduct", "http://hl7.org/fhir/fhir-types", "NutritionProduct"),
    Observation("Observation", "http://hl7.org/fhir/fhir-types", "Observation"),
    ObservationDefinition(
      "ObservationDefinition",
      "http://hl7.org/fhir/fhir-types",
      "ObservationDefinition",
    ),
    OperationDefinition(
      "OperationDefinition",
      "http://hl7.org/fhir/fhir-types",
      "OperationDefinition",
    ),
    OperationOutcome("OperationOutcome", "http://hl7.org/fhir/fhir-types", "OperationOutcome"),
    Organization("Organization", "http://hl7.org/fhir/fhir-types", "Organization"),
    OrganizationAffiliation(
      "OrganizationAffiliation",
      "http://hl7.org/fhir/fhir-types",
      "OrganizationAffiliation",
    ),
    PackagedProductDefinition(
      "PackagedProductDefinition",
      "http://hl7.org/fhir/fhir-types",
      "PackagedProductDefinition",
    ),
    Parameters("Parameters", "http://hl7.org/fhir/fhir-types", "Parameters"),
    Patient("Patient", "http://hl7.org/fhir/fhir-types", "Patient"),
    PaymentNotice("PaymentNotice", "http://hl7.org/fhir/fhir-types", "PaymentNotice"),
    PaymentReconciliation(
      "PaymentReconciliation",
      "http://hl7.org/fhir/fhir-types",
      "PaymentReconciliation",
    ),
    Permission("Permission", "http://hl7.org/fhir/fhir-types", "Permission"),
    Person("Person", "http://hl7.org/fhir/fhir-types", "Person"),
    PlanDefinition("PlanDefinition", "http://hl7.org/fhir/fhir-types", "PlanDefinition"),
    Practitioner("Practitioner", "http://hl7.org/fhir/fhir-types", "Practitioner"),
    PractitionerRole("PractitionerRole", "http://hl7.org/fhir/fhir-types", "PractitionerRole"),
    Procedure("Procedure", "http://hl7.org/fhir/fhir-types", "Procedure"),
    Provenance("Provenance", "http://hl7.org/fhir/fhir-types", "Provenance"),
    Questionnaire("Questionnaire", "http://hl7.org/fhir/fhir-types", "Questionnaire"),
    QuestionnaireResponse(
      "QuestionnaireResponse",
      "http://hl7.org/fhir/fhir-types",
      "QuestionnaireResponse",
    ),
    RegulatedAuthorization(
      "RegulatedAuthorization",
      "http://hl7.org/fhir/fhir-types",
      "RegulatedAuthorization",
    ),
    RelatedPerson("RelatedPerson", "http://hl7.org/fhir/fhir-types", "RelatedPerson"),
    RequestOrchestration(
      "RequestOrchestration",
      "http://hl7.org/fhir/fhir-types",
      "RequestOrchestration",
    ),
    Requirements("Requirements", "http://hl7.org/fhir/fhir-types", "Requirements"),
    ResearchStudy("ResearchStudy", "http://hl7.org/fhir/fhir-types", "ResearchStudy"),
    ResearchSubject("ResearchSubject", "http://hl7.org/fhir/fhir-types", "ResearchSubject"),
    Resource("Resource", "http://hl7.org/fhir/fhir-types", "Resource"),
    RiskAssessment("RiskAssessment", "http://hl7.org/fhir/fhir-types", "RiskAssessment"),
    Schedule("Schedule", "http://hl7.org/fhir/fhir-types", "Schedule"),
    SearchParameter("SearchParameter", "http://hl7.org/fhir/fhir-types", "SearchParameter"),
    ServiceRequest("ServiceRequest", "http://hl7.org/fhir/fhir-types", "ServiceRequest"),
    Slot("Slot", "http://hl7.org/fhir/fhir-types", "Slot"),
    Specimen("Specimen", "http://hl7.org/fhir/fhir-types", "Specimen"),
    SpecimenDefinition(
      "SpecimenDefinition",
      "http://hl7.org/fhir/fhir-types",
      "SpecimenDefinition",
    ),
    StructureDefinition(
      "StructureDefinition",
      "http://hl7.org/fhir/fhir-types",
      "StructureDefinition",
    ),
    StructureMap("StructureMap", "http://hl7.org/fhir/fhir-types", "StructureMap"),
    Subscription("Subscription", "http://hl7.org/fhir/fhir-types", "Subscription"),
    SubscriptionStatus(
      "SubscriptionStatus",
      "http://hl7.org/fhir/fhir-types",
      "SubscriptionStatus",
    ),
    SubscriptionTopic("SubscriptionTopic", "http://hl7.org/fhir/fhir-types", "SubscriptionTopic"),
    Substance("Substance", "http://hl7.org/fhir/fhir-types", "Substance"),
    SubstanceDefinition(
      "SubstanceDefinition",
      "http://hl7.org/fhir/fhir-types",
      "SubstanceDefinition",
    ),
    SubstanceNucleicAcid(
      "SubstanceNucleicAcid",
      "http://hl7.org/fhir/fhir-types",
      "SubstanceNucleicAcid",
    ),
    SubstancePolymer("SubstancePolymer", "http://hl7.org/fhir/fhir-types", "SubstancePolymer"),
    SubstanceProtein("SubstanceProtein", "http://hl7.org/fhir/fhir-types", "SubstanceProtein"),
    SubstanceReferenceInformation(
      "SubstanceReferenceInformation",
      "http://hl7.org/fhir/fhir-types",
      "SubstanceReferenceInformation",
    ),
    SubstanceSourceMaterial(
      "SubstanceSourceMaterial",
      "http://hl7.org/fhir/fhir-types",
      "SubstanceSourceMaterial",
    ),
    SupplyDelivery("SupplyDelivery", "http://hl7.org/fhir/fhir-types", "SupplyDelivery"),
    SupplyRequest("SupplyRequest", "http://hl7.org/fhir/fhir-types", "SupplyRequest"),
    Task("Task", "http://hl7.org/fhir/fhir-types", "Task"),
    TerminologyCapabilities(
      "TerminologyCapabilities",
      "http://hl7.org/fhir/fhir-types",
      "TerminologyCapabilities",
    ),
    TestPlan("TestPlan", "http://hl7.org/fhir/fhir-types", "TestPlan"),
    TestReport("TestReport", "http://hl7.org/fhir/fhir-types", "TestReport"),
    TestScript("TestScript", "http://hl7.org/fhir/fhir-types", "TestScript"),
    Transport("Transport", "http://hl7.org/fhir/fhir-types", "Transport"),
    ValueSet("ValueSet", "http://hl7.org/fhir/fhir-types", "ValueSet"),
    VerificationResult(
      "VerificationResult",
      "http://hl7.org/fhir/fhir-types",
      "VerificationResult",
    ),
    VisionPrescription(
      "VisionPrescription",
      "http://hl7.org/fhir/fhir-types",
      "VisionPrescription",
    ),
    BodySite("BodySite", "http://hl7.org/fhir/fhir-old-types", "BodySite"),
    CatalogEntry("CatalogEntry", "http://hl7.org/fhir/fhir-old-types", "CatalogEntry"),
    Conformance("Conformance", "http://hl7.org/fhir/fhir-old-types", "Conformance"),
    DataElement("DataElement", "http://hl7.org/fhir/fhir-old-types", "DataElement"),
    DeviceComponent("DeviceComponent", "http://hl7.org/fhir/fhir-old-types", "DeviceComponent"),
    DeviceUseRequest("DeviceUseRequest", "http://hl7.org/fhir/fhir-old-types", "DeviceUseRequest"),
    DeviceUseStatement(
      "DeviceUseStatement",
      "http://hl7.org/fhir/fhir-old-types",
      "DeviceUseStatement",
    ),
    DiagnosticOrder("DiagnosticOrder", "http://hl7.org/fhir/fhir-old-types", "DiagnosticOrder"),
    DocumentManifest("DocumentManifest", "http://hl7.org/fhir/fhir-old-types", "DocumentManifest"),
    EffectEvidenceSynthesis(
      "EffectEvidenceSynthesis",
      "http://hl7.org/fhir/fhir-old-types",
      "EffectEvidenceSynthesis",
    ),
    EligibilityRequest(
      "EligibilityRequest",
      "http://hl7.org/fhir/fhir-old-types",
      "EligibilityRequest",
    ),
    EligibilityResponse(
      "EligibilityResponse",
      "http://hl7.org/fhir/fhir-old-types",
      "EligibilityResponse",
    ),
    ExpansionProfile("ExpansionProfile", "http://hl7.org/fhir/fhir-old-types", "ExpansionProfile"),
    ImagingManifest("ImagingManifest", "http://hl7.org/fhir/fhir-old-types", "ImagingManifest"),
    ImagingObjectSelection(
      "ImagingObjectSelection",
      "http://hl7.org/fhir/fhir-old-types",
      "ImagingObjectSelection",
    ),
    Media("Media", "http://hl7.org/fhir/fhir-old-types", "Media"),
    MedicationOrder("MedicationOrder", "http://hl7.org/fhir/fhir-old-types", "MedicationOrder"),
    MedicationUsage("MedicationUsage", "http://hl7.org/fhir/fhir-old-types", "MedicationUsage"),
    MedicinalProduct("MedicinalProduct", "http://hl7.org/fhir/fhir-old-types", "MedicinalProduct"),
    MedicinalProductAuthorization(
      "MedicinalProductAuthorization",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductAuthorization",
    ),
    MedicinalProductContraindication(
      "MedicinalProductContraindication",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductContraindication",
    ),
    MedicinalProductIndication(
      "MedicinalProductIndication",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductIndication",
    ),
    MedicinalProductIngredient(
      "MedicinalProductIngredient",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductIngredient",
    ),
    MedicinalProductInteraction(
      "MedicinalProductInteraction",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductInteraction",
    ),
    MedicinalProductManufactured(
      "MedicinalProductManufactured",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductManufactured",
    ),
    MedicinalProductPackaged(
      "MedicinalProductPackaged",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductPackaged",
    ),
    MedicinalProductPharmaceutical(
      "MedicinalProductPharmaceutical",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductPharmaceutical",
    ),
    MedicinalProductUndesirableEffect(
      "MedicinalProductUndesirableEffect",
      "http://hl7.org/fhir/fhir-old-types",
      "MedicinalProductUndesirableEffect",
    ),
    Order("Order", "http://hl7.org/fhir/fhir-old-types", "Order"),
    OrderResponse("OrderResponse", "http://hl7.org/fhir/fhir-old-types", "OrderResponse"),
    ProcedureRequest("ProcedureRequest", "http://hl7.org/fhir/fhir-old-types", "ProcedureRequest"),
    ProcessRequest("ProcessRequest", "http://hl7.org/fhir/fhir-old-types", "ProcessRequest"),
    ProcessResponse("ProcessResponse", "http://hl7.org/fhir/fhir-old-types", "ProcessResponse"),
    ReferralRequest("ReferralRequest", "http://hl7.org/fhir/fhir-old-types", "ReferralRequest"),
    RequestGroup("RequestGroup", "http://hl7.org/fhir/fhir-old-types", "RequestGroup"),
    ResearchDefinition(
      "ResearchDefinition",
      "http://hl7.org/fhir/fhir-old-types",
      "ResearchDefinition",
    ),
    ResearchElementDefinition(
      "ResearchElementDefinition",
      "http://hl7.org/fhir/fhir-old-types",
      "ResearchElementDefinition",
    ),
    RiskEvidenceSynthesis(
      "RiskEvidenceSynthesis",
      "http://hl7.org/fhir/fhir-old-types",
      "RiskEvidenceSynthesis",
    ),
    Sequence("Sequence", "http://hl7.org/fhir/fhir-old-types", "Sequence"),
    ServiceDefinition(
      "ServiceDefinition",
      "http://hl7.org/fhir/fhir-old-types",
      "ServiceDefinition",
    ),
    SubstanceSpecification(
      "SubstanceSpecification",
      "http://hl7.org/fhir/fhir-old-types",
      "SubstanceSpecification",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): VersionIndependentResourceTypesAll =
        when (code) {
          "Account" -> Account
          "ActivityDefinition" -> ActivityDefinition
          "ActorDefinition" -> ActorDefinition
          "AdministrableProductDefinition" -> AdministrableProductDefinition
          "AdverseEvent" -> AdverseEvent
          "AllergyIntolerance" -> AllergyIntolerance
          "Appointment" -> Appointment
          "AppointmentResponse" -> AppointmentResponse
          "ArtifactAssessment" -> ArtifactAssessment
          "AuditEvent" -> AuditEvent
          "Basic" -> Basic
          "Binary" -> Binary
          "BiologicallyDerivedProduct" -> BiologicallyDerivedProduct
          "BiologicallyDerivedProductDispense" -> BiologicallyDerivedProductDispense
          "BodyStructure" -> BodyStructure
          "Bundle" -> Bundle
          "CanonicalResource" -> CanonicalResource
          "CapabilityStatement" -> CapabilityStatement
          "CarePlan" -> CarePlan
          "CareTeam" -> CareTeam
          "ChargeItem" -> ChargeItem
          "ChargeItemDefinition" -> ChargeItemDefinition
          "Citation" -> Citation
          "Claim" -> Claim
          "ClaimResponse" -> ClaimResponse
          "ClinicalImpression" -> ClinicalImpression
          "ClinicalUseDefinition" -> ClinicalUseDefinition
          "CodeSystem" -> CodeSystem
          "Communication" -> Communication
          "CommunicationRequest" -> CommunicationRequest
          "CompartmentDefinition" -> CompartmentDefinition
          "Composition" -> Composition
          "ConceptMap" -> ConceptMap
          "Condition" -> Condition
          "ConditionDefinition" -> ConditionDefinition
          "Consent" -> Consent
          "Contract" -> Contract
          "Coverage" -> Coverage
          "CoverageEligibilityRequest" -> CoverageEligibilityRequest
          "CoverageEligibilityResponse" -> CoverageEligibilityResponse
          "DetectedIssue" -> DetectedIssue
          "Device" -> Device
          "DeviceAssociation" -> DeviceAssociation
          "DeviceDefinition" -> DeviceDefinition
          "DeviceDispense" -> DeviceDispense
          "DeviceMetric" -> DeviceMetric
          "DeviceRequest" -> DeviceRequest
          "DeviceUsage" -> DeviceUsage
          "DiagnosticReport" -> DiagnosticReport
          "DocumentReference" -> DocumentReference
          "DomainResource" -> DomainResource
          "Encounter" -> Encounter
          "EncounterHistory" -> EncounterHistory
          "Endpoint" -> Endpoint
          "EnrollmentRequest" -> EnrollmentRequest
          "EnrollmentResponse" -> EnrollmentResponse
          "EpisodeOfCare" -> EpisodeOfCare
          "EventDefinition" -> EventDefinition
          "Evidence" -> Evidence
          "EvidenceReport" -> EvidenceReport
          "EvidenceVariable" -> EvidenceVariable
          "ExampleScenario" -> ExampleScenario
          "ExplanationOfBenefit" -> ExplanationOfBenefit
          "FamilyMemberHistory" -> FamilyMemberHistory
          "Flag" -> Flag
          "FormularyItem" -> FormularyItem
          "GenomicStudy" -> GenomicStudy
          "Goal" -> Goal
          "GraphDefinition" -> GraphDefinition
          "Group" -> Group
          "GuidanceResponse" -> GuidanceResponse
          "HealthcareService" -> HealthcareService
          "ImagingSelection" -> ImagingSelection
          "ImagingStudy" -> ImagingStudy
          "Immunization" -> Immunization
          "ImmunizationEvaluation" -> ImmunizationEvaluation
          "ImmunizationRecommendation" -> ImmunizationRecommendation
          "ImplementationGuide" -> ImplementationGuide
          "Ingredient" -> Ingredient
          "InsurancePlan" -> InsurancePlan
          "InventoryItem" -> InventoryItem
          "InventoryReport" -> InventoryReport
          "Invoice" -> Invoice
          "Library" -> Library
          "Linkage" -> Linkage
          "List" -> List
          "Location" -> Location
          "ManufacturedItemDefinition" -> ManufacturedItemDefinition
          "Measure" -> Measure
          "MeasureReport" -> MeasureReport
          "Medication" -> Medication
          "MedicationAdministration" -> MedicationAdministration
          "MedicationDispense" -> MedicationDispense
          "MedicationKnowledge" -> MedicationKnowledge
          "MedicationRequest" -> MedicationRequest
          "MedicationStatement" -> MedicationStatement
          "MedicinalProductDefinition" -> MedicinalProductDefinition
          "MessageDefinition" -> MessageDefinition
          "MessageHeader" -> MessageHeader
          "MetadataResource" -> MetadataResource
          "MolecularSequence" -> MolecularSequence
          "NamingSystem" -> NamingSystem
          "NutritionIntake" -> NutritionIntake
          "NutritionOrder" -> NutritionOrder
          "NutritionProduct" -> NutritionProduct
          "Observation" -> Observation
          "ObservationDefinition" -> ObservationDefinition
          "OperationDefinition" -> OperationDefinition
          "OperationOutcome" -> OperationOutcome
          "Organization" -> Organization
          "OrganizationAffiliation" -> OrganizationAffiliation
          "PackagedProductDefinition" -> PackagedProductDefinition
          "Parameters" -> Parameters
          "Patient" -> Patient
          "PaymentNotice" -> PaymentNotice
          "PaymentReconciliation" -> PaymentReconciliation
          "Permission" -> Permission
          "Person" -> Person
          "PlanDefinition" -> PlanDefinition
          "Practitioner" -> Practitioner
          "PractitionerRole" -> PractitionerRole
          "Procedure" -> Procedure
          "Provenance" -> Provenance
          "Questionnaire" -> Questionnaire
          "QuestionnaireResponse" -> QuestionnaireResponse
          "RegulatedAuthorization" -> RegulatedAuthorization
          "RelatedPerson" -> RelatedPerson
          "RequestOrchestration" -> RequestOrchestration
          "Requirements" -> Requirements
          "ResearchStudy" -> ResearchStudy
          "ResearchSubject" -> ResearchSubject
          "Resource" -> Resource
          "RiskAssessment" -> RiskAssessment
          "Schedule" -> Schedule
          "SearchParameter" -> SearchParameter
          "ServiceRequest" -> ServiceRequest
          "Slot" -> Slot
          "Specimen" -> Specimen
          "SpecimenDefinition" -> SpecimenDefinition
          "StructureDefinition" -> StructureDefinition
          "StructureMap" -> StructureMap
          "Subscription" -> Subscription
          "SubscriptionStatus" -> SubscriptionStatus
          "SubscriptionTopic" -> SubscriptionTopic
          "Substance" -> Substance
          "SubstanceDefinition" -> SubstanceDefinition
          "SubstanceNucleicAcid" -> SubstanceNucleicAcid
          "SubstancePolymer" -> SubstancePolymer
          "SubstanceProtein" -> SubstanceProtein
          "SubstanceReferenceInformation" -> SubstanceReferenceInformation
          "SubstanceSourceMaterial" -> SubstanceSourceMaterial
          "SupplyDelivery" -> SupplyDelivery
          "SupplyRequest" -> SupplyRequest
          "Task" -> Task
          "TerminologyCapabilities" -> TerminologyCapabilities
          "TestPlan" -> TestPlan
          "TestReport" -> TestReport
          "TestScript" -> TestScript
          "Transport" -> Transport
          "ValueSet" -> ValueSet
          "VerificationResult" -> VerificationResult
          "VisionPrescription" -> VisionPrescription
          "BodySite" -> BodySite
          "CatalogEntry" -> CatalogEntry
          "Conformance" -> Conformance
          "DataElement" -> DataElement
          "DeviceComponent" -> DeviceComponent
          "DeviceUseRequest" -> DeviceUseRequest
          "DeviceUseStatement" -> DeviceUseStatement
          "DiagnosticOrder" -> DiagnosticOrder
          "DocumentManifest" -> DocumentManifest
          "EffectEvidenceSynthesis" -> EffectEvidenceSynthesis
          "EligibilityRequest" -> EligibilityRequest
          "EligibilityResponse" -> EligibilityResponse
          "ExpansionProfile" -> ExpansionProfile
          "ImagingManifest" -> ImagingManifest
          "ImagingObjectSelection" -> ImagingObjectSelection
          "Media" -> Media
          "MedicationOrder" -> MedicationOrder
          "MedicationUsage" -> MedicationUsage
          "MedicinalProduct" -> MedicinalProduct
          "MedicinalProductAuthorization" -> MedicinalProductAuthorization
          "MedicinalProductContraindication" -> MedicinalProductContraindication
          "MedicinalProductIndication" -> MedicinalProductIndication
          "MedicinalProductIngredient" -> MedicinalProductIngredient
          "MedicinalProductInteraction" -> MedicinalProductInteraction
          "MedicinalProductManufactured" -> MedicinalProductManufactured
          "MedicinalProductPackaged" -> MedicinalProductPackaged
          "MedicinalProductPharmaceutical" -> MedicinalProductPharmaceutical
          "MedicinalProductUndesirableEffect" -> MedicinalProductUndesirableEffect
          "Order" -> Order
          "OrderResponse" -> OrderResponse
          "ProcedureRequest" -> ProcedureRequest
          "ProcessRequest" -> ProcessRequest
          "ProcessResponse" -> ProcessResponse
          "ReferralRequest" -> ReferralRequest
          "RequestGroup" -> RequestGroup
          "ResearchDefinition" -> ResearchDefinition
          "ResearchElementDefinition" -> ResearchElementDefinition
          "RiskEvidenceSynthesis" -> RiskEvidenceSynthesis
          "Sequence" -> Sequence
          "ServiceDefinition" -> ServiceDefinition
          "SubstanceSpecification" -> SubstanceSpecification
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum VersionIndependentResourceTypesAll"
            )
        }
    }
  }

  /** Defines how a compartment rule is used. */
  public enum class GraphCompartmentUse(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Where("where", "http://hl7.org/fhir/graph-compartment-use", "Where"),
    Requires("requires", "http://hl7.org/fhir/graph-compartment-use", "requires");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): GraphCompartmentUse =
        when (code) {
          "where" -> Where
          "requires" -> Requires
          else -> throw IllegalArgumentException("Unknown code $code for enum GraphCompartmentUse")
        }
    }
  }

  /** How a compartment must be linked. */
  public enum class GraphCompartmentRule(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Identical("identical", "http://hl7.org/fhir/graph-compartment-rule", "Identical"),
    Matching("matching", "http://hl7.org/fhir/graph-compartment-rule", "Matching"),
    Different("different", "http://hl7.org/fhir/graph-compartment-rule", "Different"),
    Custom("custom", "http://hl7.org/fhir/graph-compartment-rule", "Custom");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): GraphCompartmentRule =
        when (code) {
          "identical" -> Identical
          "matching" -> Matching
          "different" -> Different
          "custom" -> Custom
          else -> throw IllegalArgumentException("Unknown code $code for enum GraphCompartmentRule")
        }
    }
  }

  /** Which type a compartment definition describes. */
  public enum class CompartmentType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Patient("Patient", "http://hl7.org/fhir/compartment-type", "Patient"),
    Encounter("Encounter", "http://hl7.org/fhir/compartment-type", "Encounter"),
    RelatedPerson("RelatedPerson", "http://hl7.org/fhir/compartment-type", "RelatedPerson"),
    Practitioner("Practitioner", "http://hl7.org/fhir/compartment-type", "Practitioner"),
    Device("Device", "http://hl7.org/fhir/compartment-type", "Device"),
    EpisodeOfCare("EpisodeOfCare", "http://hl7.org/fhir/compartment-type", "EpisodeOfCare");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): CompartmentType =
        when (code) {
          "Patient" -> Patient
          "Encounter" -> Encounter
          "RelatedPerson" -> RelatedPerson
          "Practitioner" -> Practitioner
          "Device" -> Device
          "EpisodeOfCare" -> EpisodeOfCare
          else -> throw IllegalArgumentException("Unknown code $code for enum CompartmentType")
        }
    }
  }
}
