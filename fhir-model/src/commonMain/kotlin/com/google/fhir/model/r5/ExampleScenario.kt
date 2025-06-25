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

import com.google.fhir.model.r5.serializers.ExampleScenarioActorSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioInstanceContainedInstanceSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioInstanceSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioInstanceVersionSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioProcessSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioProcessStepAlternativeSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioProcessStepOperationSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioProcessStepSerializer
import com.google.fhir.model.r5.serializers.ExampleScenarioSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A walkthrough of a workflow showing the interaction between systems and the instances shared,
 * possibly including the evolution of instances over time.
 */
@Serializable(with = ExampleScenarioSerializer::class)
@SerialName("ExampleScenario")
public data class ExampleScenario(
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
   * An absolute URI that is used to identify this example scenario when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * example scenario is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the example scenario is stored on different servers.
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
   * A formal identifier that is used to identify this example scenario when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this example scenario outside of FHIR, where it is not possible to
   * use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the example scenario when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the example scenario author and is not expected to be globally unique. For example, it might be
   * a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different example scenario instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the example scenario with the format [url]|[version]. The
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
   * Temporarily retained for tooling purposes.
   *
   * Not needed as code will never be generated from one of these
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the ExampleScenario.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this example scenario. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of example scenarios that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this example scenario is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of example scenarios that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the example scenario was last significantly changed. The
   * date must change when the business version changes and it must change if the status code
   * changes. In addition, it should change when the substantive content of the example scenario
   * changes. (e.g. the 'content logical definition').
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the example scenario. Additional specific dates may be
   * added as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the example scenario.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the example
   * scenario is the organization or individual primarily responsible for the maintenance and upkeep
   * of the example scenario. This is not necessarily the same individual or organization that
   * developed and initially authored the content. The publisher is the primary point of contact for
   * questions or issues with the example scenario. This item SHOULD be populated unless the
   * information is available from context.
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
   * A free text natural language description of the ExampleScenario from a consumer's perspective.
   *
   * This description can be used to capture details such as comments about misuse. It is not a
   * rendering of the ExampleScenario as conveyed in the 'text' field of the resource itself.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate example scenario instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the example scenario is intended to be used.
   *
   * It may be possible for the example scenario to be used in jurisdictions other than those for
   * which it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * What the example scenario resource is created for. This should not be used to show the business
   * purpose of the scenario itself, but the purpose of documenting a scenario.
   *
   * This element does not describe the usage of the example scenario. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * example scenario.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the example scenario and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the example scenario.
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
  /** A system or person who shares or receives an instance within the scenario. */
  public var actor: List<Actor>? = null,
  /** A single data collection that is shared as part of the scenario. */
  public var instance: List<Instance>? = null,
  /**
   * A group of operations that represents a significant step within a scenario.
   *
   * Some scenarios might describe only one process.
   */
  public var process: List<Process>? = null,
) : DomainResource() {
  /** A system or person who shares or receives an instance within the scenario. */
  @Serializable(with = ExampleScenarioActorSerializer::class)
  public class Actor(
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
    /** A unique string within the scenario that is used to reference the actor. */
    public var key: String? = null,
    /** The category of actor - person or system. */
    public var type: Enumeration<ExampleScenarioActorType>? = null,
    /** The human-readable name for the actor used when rendering the scenario. */
    public var title: String? = null,
    /** An explanation of who/what the actor is and its role in the scenario. */
    public var description: Markdown? = null,
  ) : BackboneElement()

  /** A single data collection that is shared as part of the scenario. */
  @Serializable(with = ExampleScenarioInstanceSerializer::class)
  public class Instance(
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
    /** A unique string within the scenario that is used to reference the instance. */
    public var key: String? = null,
    /**
     * A code indicating the kind of data structure (FHIR resource or some other standard) this is
     * an instance of.
     */
    public var structureType: Coding? = null,
    /**
     * Conveys the version of the data structure instantiated. I.e. what release of FHIR, X12,
     * OpenEHR, etc. is instance compliant with.
     */
    public var structureVersion: String? = null,
    /** Refers to a profile, template or other ruleset the instance adheres to. */
    public var structureProfile: StructureProfile? = null,
    /** A short descriptive label the instance to be used in tables or diagrams. */
    public var title: String? = null,
    /** An explanation of what the instance contains and what it's for. */
    public var description: Markdown? = null,
    /**
     * Points to an instance (typically an example) that shows the data that would corespond to this
     * instance.
     *
     * If not conveying FHIR data or not using the same version of FHIR as this ExampleScenario
     * instance, the reference must be to a Binary.
     */
    public var content: Reference? = null,
    /**
     * Represents the instance as it was at a specific time-point.
     *
     * Not used if an instance doesn't change
     */
    public var version: List<Version>? = null,
    /**
     * References to other instances that can be found within this instance (e.g. the observations
     * contained in a bundle).
     */
    public var containedInstance: List<ContainedInstance>? = null,
  ) : BackboneElement() {
    /** Represents the instance as it was at a specific time-point. */
    @Serializable(with = ExampleScenarioInstanceVersionSerializer::class)
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
      /**
       * A unique string within the instance that is used to reference the version of the instance.
       */
      public var key: String? = null,
      /** A short descriptive label the version to be used in tables or diagrams. */
      public var title: String? = null,
      /** An explanation of what this specific version of the instance contains and represents. */
      public var description: Markdown? = null,
      /**
       * Points to an instance (typically an example) that shows the data that would flow at this
       * point in the scenario.
       *
       * If not conveying FHIR data or not using the same version of FHIR as this ExampleScenario
       * instance, the reference must be to a Binary.
       */
      public var content: Reference? = null,
    ) : BackboneElement()

    /**
     * References to other instances that can be found within this instance (e.g. the observations
     * contained in a bundle).
     */
    @Serializable(with = ExampleScenarioInstanceContainedInstanceSerializer::class)
    public class ContainedInstance(
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
      /** A reference to the key of an instance found within this one. */
      public var instanceReference: String? = null,
      /**
       * A reference to the key of a specific version of an instance in this instance.
       *
       * Required if the referenced instance has versions
       */
      public var versionReference: String? = null,
    ) : BackboneElement()

    public sealed interface StructureProfile {
      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asUri(): Uri? = this as? Uri

      public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
        StructureProfile

      public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : StructureProfile

      public companion object {
        public fun from(
          canonicalValue: com.google.fhir.model.r5.Canonical?,
          uriValue: com.google.fhir.model.r5.Uri?,
        ): StructureProfile? {
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (uriValue != null) return Uri(uriValue)
          return null
        }
      }
    }
  }

  /** A group of operations that represents a significant step within a scenario. */
  @Serializable(with = ExampleScenarioProcessSerializer::class)
  public class Process(
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
    /** A short descriptive label the process to be used in tables or diagrams. */
    public var title: String? = null,
    /** An explanation of what the process represents and what it does. */
    public var description: Markdown? = null,
    /**
     * Description of the initial state of the actors, environment and data before the process
     * starts.
     */
    public var preConditions: Markdown? = null,
    /**
     * Description of the final state of the actors, environment and data after the process has been
     * successfully completed.
     *
     * Alternate steps might not result in all post conditions holding
     */
    public var postConditions: Markdown? = null,
    /** A significant action that occurs as part of the process. */
    public var step: List<Step>? = null,
  ) : BackboneElement() {
    /** A significant action that occurs as part of the process. */
    @Serializable(with = ExampleScenarioProcessStepSerializer::class)
    public class Step(
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
       * The sequential number of the step, e.g. 1.2.5.
       *
       * If step numbers are simultaneous, they will be the same. Numbers don't have to be numeric.
       * E.g. '2c)' is a valid step number
       */
      public var number: String? = null,
      /** Indicates that the step is a complex sub-process with its own steps. */
      public var process: Process? = null,
      /** Indicates that the step is defined by a seaparate scenario instance. */
      public var workflow: Canonical? = null,
      /** The step represents a single operation invoked on receiver by sender. */
      public var operation: Operation? = null,
      /**
       * Indicates an alternative step that can be taken instead of the sub-process, scenario or
       * operation. E.g. to represent non-happy-path/exceptional/atypical circumstances.
       */
      public var alternative: List<Alternative>? = null,
      /**
       * If true, indicates that, following this step, there is a pause in the flow and the
       * subsequent step will occur at some later time (triggered by some event).
       */
      public var pause: Boolean? = null,
    ) : BackboneElement() {
      /** The step represents a single operation invoked on receiver by sender. */
      @Serializable(with = ExampleScenarioProcessStepOperationSerializer::class)
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
        /** The standardized type of action (FHIR or otherwise). */
        public var type: Coding? = null,
        /** A short descriptive label the step to be used in tables or diagrams. */
        public var title: String? = null,
        /**
         * The system that invokes the action/transmits the data.
         *
         * This must either be the 'key' of one of the actors defined in this scenario or the
         * special keyword 'OTHER' if the initiator is not one of the actors defined for the
         * scenario. (Multiple references to 'OTHER' don't necessarily indicate the same actor.)
         */
        public var initiator: String? = null,
        /**
         * The system on which the action is invoked/receives the data.
         *
         * This must either be the 'key' of one of the actors defined in this scenario or the
         * special keyword 'OTHER' if the receiver is not one of the actors defined for the
         * scenario. (Multiple references to 'OTHER' don't necessarily indicate the same actor.) In
         * some cases, receiver could be same as sender if representing a local operation
         */
        public var `receiver`: String? = null,
        /**
         * An explanation of what the operation represents and what it does.
         *
         * This should contain information not already present in the process step. It's more of a
         * description of what the operation in general does - if not already evident from the
         * operation.type
         */
        public var description: Markdown? = null,
        /**
         * If false, the initiator is deactivated right after the operation.
         *
         * De-activation of an actor means they have no further role until such time as they are the
         * recipient of an operation.
         */
        public var initiatorActive: Boolean? = null,
        /**
         * If false, the receiver is deactivated right after the operation.
         *
         * De-activation of an actor means they have no further role until such time as they are the
         * recipient of an operation.
         */
        public var receiverActive: Boolean? = null,
        /**
         * A reference to the instance that is transmitted from requester to receiver as part of the
         * invocation of the operation.
         */
        public var request: Instance.ContainedInstance? = null,
        /**
         * A reference to the instance that is transmitted from receiver to requester as part of the
         * operation's synchronous response (if any).
         */
        public var response: Instance.ContainedInstance? = null,
      ) : BackboneElement()

      /**
       * Indicates an alternative step that can be taken instead of the sub-process, scenario or
       * operation. E.g. to represent non-happy-path/exceptional/atypical circumstances.
       */
      @Serializable(with = ExampleScenarioProcessStepAlternativeSerializer::class)
      public class Alternative(
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
         * The label to display for the alternative that gives a sense of the circumstance in which
         * the alternative should be invoked.
         */
        public var title: String? = null,
        /**
         * A human-readable description of the alternative explaining when the alternative should
         * occur rather than the base step.
         */
        public var description: Markdown? = null,
        /**
         * Indicates the operation, sub-process or scenario that happens if the alternative option
         * is selected.
         */
        public var step: List<Step?>? = null,
      ) : BackboneElement()
    }
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

  /** The type of actor - system or human. */
  public enum class ExampleScenarioActorType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** A human actor */
    Person("person", "http://hl7.org/fhir/examplescenario-actor-type", "Person", "A human actor"),
    /** A software application or other system */
    System(
      "system",
      "http://hl7.org/fhir/examplescenario-actor-type",
      "System",
      "A software application or other system",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ExampleScenarioActorType =
        when (code) {
          "person" -> Person
          "system" -> System
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ExampleScenarioActorType")
        }
    }
  }
}
