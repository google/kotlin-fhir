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

import com.google.fhir.model.r5.serializers.SpecimenDefinitionSerializer
import com.google.fhir.model.r5.serializers.SpecimenDefinitionTypeTestedContainerAdditiveSerializer
import com.google.fhir.model.r5.serializers.SpecimenDefinitionTypeTestedContainerSerializer
import com.google.fhir.model.r5.serializers.SpecimenDefinitionTypeTestedHandlingSerializer
import com.google.fhir.model.r5.serializers.SpecimenDefinitionTypeTestedSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A kind of specimen with associated set of requirements. */
@Serializable(with = SpecimenDefinitionSerializer::class)
@SerialName("SpecimenDefinition")
public data class SpecimenDefinition(
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
   * An absolute URL that is used to identify this SpecimenDefinition when it is referenced in a
   * specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique,
   * and SHOULD be an address at which this SpecimenDefinition is (or will be) published. The URL
   * SHOULD include the major version of the SpecimenDefinition. For more information see Technical
   * and Business Versions.
   *
   * Can be a urn:uuid: or a urn:oid:, but real http: addresses are preferred. This is the URI that
   * will be used when making canonical references to this resource.
   */
  public var url: Uri? = null,
  /** A business identifier assigned to this SpecimenDefinition. */
  public var identifier: Identifier? = null,
  /**
   * The identifier that is used to identify this version of the SpecimenDefinition when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the SpecimenDefinition author and is not expected to be globally unique.
   *
   * There may be multiple different instances of a SpecimenDefinition that have the same identifier
   * but different versions.
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
   * A natural language name identifying the {{title}}. This name should be usable as an identifier
   * for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /** A short, descriptive, user-friendly title for the SpecimenDefinition. */
  public var title: String? = null,
  /**
   * The canonical URL pointing to another FHIR-defined SpecimenDefinition that is adhered to in
   * whole or in part by this definition.
   */
  public var derivedFromCanonical: MutableList<Canonical> = mutableListOf(),
  /**
   * The URL pointing to an externally-defined type of specimen, guideline or other definition that
   * is adhered to in whole or in part by this definition.
   */
  public var derivedFromUri: MutableList<Uri> = mutableListOf(),
  /**
   * The current state of theSpecimenDefinition.
   *
   * A nominal state-transition diagram can be found in the
   * [Definition pattern](definition.html#statemachine) documentation Unknown does not represent
   * "other" - one of the defined statuses must apply. Unknown is used when the authoring system is
   * not sure what the current status is.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A flag to indicate that this SpecimenDefinition is not authored for genuine usage.
   *
   * Allows filtering of SpecimenDefinition that are appropriate for use vs. not.
   */
  public var experimental: Boolean? = null,
  /**
   * A code or group definition that describes the intended subject from which this kind of specimen
   * is to be collected.
   *
   * Examples: person, animal, device, water ….
   */
  public var subject: Subject? = null,
  /**
   * For draft definitions, indicates the date of initial creation. For active definitions,
   * represents the date of activation. For withdrawn definitions, indicates the date of withdrawal.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * Helps establish the "authority/credibility" of the SpecimenDefinition. May also allow for
   * contact.
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
   * A free text natural language description of the SpecimenDefinition from the consumer's
   * perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the module as conveyed in the text field of the resource itself. This
   * item SHOULD be populated unless the information is available from context.
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These terms may be used to assist with indexing and searching of specimen definitions.
   *
   * When multiple usageContexts are specified, there is no expectation for whether all or any of
   * the contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A jurisdiction in which the SpecimenDefinition is intended to be used.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Explains why this SpecimeDefinition is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the SpecimenDefinition. Rather it is for
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * SpecimenDefinition.
   */
  public var purpose: Markdown? = null,
  /**
   * Copyright statement relating to the SpecimenDefinition and/or its contents. Copyright
   * statements are generally legal restrictions on the use and publishing of the
   * SpecimenDefinition.
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
   * The date on which the asset content was approved by the publisher. Approval happens once when
   * the content is officially approved for usage.
   *
   * The date may be more recent than the approval date because of minor changes / editorial
   * corrections.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the asset content was last reviewed. Review happens periodically after that,
   * but doesn't change the original approval date.
   *
   * If specified, this is usually after the approval date.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the SpecimenDefinition content was or is planned to be effective.
   *
   * The effective period for a SpecimenDefinition determines when the content is applicable for
   * usage and is independent of publication and review dates.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var effectivePeriod: Period? = null,
  /** The kind of material to be collected. */
  public var typeCollected: CodeableConcept? = null,
  /** Preparation of the patient for specimen collection. */
  public var patientPreparation: MutableList<CodeableConcept> = mutableListOf(),
  /** Time aspect of specimen collection (duration or offset). */
  public var timeAspect: String? = null,
  /** The action to be performed for collecting the specimen. */
  public var collection: MutableList<CodeableConcept> = mutableListOf(),
  /** Specimen conditioned in a container as expected by the testing laboratory. */
  public var typeTested: MutableList<TypeTested> = mutableListOf(),
) : DomainResource() {
  /** Specimen conditioned in a container as expected by the testing laboratory. */
  @Serializable(with = SpecimenDefinitionTypeTestedSerializer::class)
  public class TypeTested(
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
    /** Primary of secondary specimen. */
    public var isDerived: Boolean? = null,
    /** The kind of specimen conditioned for testing expected by lab. */
    public var type: CodeableConcept? = null,
    /** The preference for this type of conditioned specimen. */
    public var preference: Enumeration<SpecimenContainedPreference>,
    /** The specimen's container. */
    public var container: Container? = null,
    /** Requirements for delivery and special handling of this kind of conditioned specimen. */
    public var requirement: Markdown? = null,
    /**
     * The usual time that a specimen of this kind is retained after the ordered tests are
     * completed, for the purpose of additional testing.
     */
    public var retentionTime: Duration? = null,
    /** Specimen can be used by only one test or panel if the value is "true". */
    public var singleUse: Boolean? = null,
    /** Criterion for rejection of the specimen in its container by the laboratory. */
    public var rejectionCriterion: MutableList<CodeableConcept> = mutableListOf(),
    /**
     * Set of instructions for preservation/transport of the specimen at a defined temperature
     * interval, prior the testing process.
     */
    public var handling: MutableList<Handling> = mutableListOf(),
    /** Where the specimen will be tested: e.g., lab, sector, device or any combination of these. */
    public var testingDestination: MutableList<CodeableConcept> = mutableListOf(),
  ) : BackboneElement() {
    /** The specimen's container. */
    @Serializable(with = SpecimenDefinitionTypeTestedContainerSerializer::class)
    public class Container(
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
       * The type of material of the container.
       *
       * Examples: glass, plastic, metal.
       */
      public var material: CodeableConcept? = null,
      /** The type of container used to contain this kind of specimen. */
      public var type: CodeableConcept? = null,
      /** Color of container cap. */
      public var cap: CodeableConcept? = null,
      /** The textual description of the kind of container. */
      public var description: Markdown? = null,
      /** The capacity (volume or other measure) of this kind of container. */
      public var capacity: Quantity? = null,
      /** The minimum volume to be conditioned in the container. */
      public var minimumVolume: MinimumVolume? = null,
      /**
       * Substance introduced in the kind of container to preserve, maintain or enhance the
       * specimen. Examples: Formalin, Citrate, EDTA.
       */
      public var additive: MutableList<Additive> = mutableListOf(),
      /** Special processing that should be applied to the container for this kind of specimen. */
      public var preparation: Markdown? = null,
    ) : BackboneElement() {
      /**
       * Substance introduced in the kind of container to preserve, maintain or enhance the
       * specimen. Examples: Formalin, Citrate, EDTA.
       */
      @Serializable(with = SpecimenDefinitionTypeTestedContainerAdditiveSerializer::class)
      public class Additive(
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
        override var extension: MutableList<Extension> = mutableListOf(),
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * Substance introduced in the kind of container to preserve, maintain or enhance the
         * specimen. Examples: Formalin, Citrate, EDTA.
         */
        public var additive: Additive,
      ) : BackboneElement() {
        public sealed interface Additive {
          public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

          public fun asReference(): Reference? = this as? Reference

          public data class CodeableConcept(
            public val `value`: com.google.fhir.model.r5.CodeableConcept
          ) : Additive

          public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
            Additive

          public companion object {
            internal fun from(
              codeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
              referenceValue: com.google.fhir.model.r5.Reference?,
            ): Additive? {
              if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
              if (referenceValue != null) return Reference(referenceValue)
              return null
            }
          }
        }
      }

      public sealed interface MinimumVolume {
        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asString(): String? = this as? String

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
          MinimumVolume

        public data class String(public val `value`: com.google.fhir.model.r5.String) :
          MinimumVolume

        public companion object {
          internal fun from(
            quantityValue: com.google.fhir.model.r5.Quantity?,
            stringValue: com.google.fhir.model.r5.String?,
          ): MinimumVolume? {
            if (quantityValue != null) return Quantity(quantityValue)
            if (stringValue != null) return String(stringValue)
            return null
          }
        }
      }
    }

    /**
     * Set of instructions for preservation/transport of the specimen at a defined temperature
     * interval, prior the testing process.
     */
    @Serializable(with = SpecimenDefinitionTypeTestedHandlingSerializer::class)
    public class Handling(
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
       * It qualifies the interval of temperature, which characterizes an occurrence of handling.
       * Conditions that are not related to temperature may be handled in the instruction element.
       */
      public var temperatureQualifier: CodeableConcept? = null,
      /** The temperature interval for this set of handling instructions. */
      public var temperatureRange: Range? = null,
      /** The maximum time interval of preservation of the specimen with these conditions. */
      public var maxDuration: Duration? = null,
      /**
       * Additional textual instructions for the preservation or transport of the specimen. For
       * instance, 'Protect from light exposure'.
       */
      public var instruction: Markdown? = null,
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

  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Subject

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        referenceValue: com.google.fhir.model.r5.Reference?,
      ): Subject? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  /** Degree of preference of a type of conditioned specimen. */
  public enum class SpecimenContainedPreference(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Preferred("preferred", "http://hl7.org/fhir/specimen-contained-preference", "Preferred"),
    Alternate("alternate", "http://hl7.org/fhir/specimen-contained-preference", "Alternate");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): SpecimenContainedPreference =
        when (code) {
          "preferred" -> Preferred
          "alternate" -> Alternate
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum SpecimenContainedPreference"
            )
        }
    }
  }
}
