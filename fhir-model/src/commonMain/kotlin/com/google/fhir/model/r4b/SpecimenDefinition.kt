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

import com.google.fhir.model.r4b.serializers.SpecimenDefinitionSerializer
import com.google.fhir.model.r4b.serializers.SpecimenDefinitionTypeTestedContainerAdditiveSerializer
import com.google.fhir.model.r4b.serializers.SpecimenDefinitionTypeTestedContainerSerializer
import com.google.fhir.model.r4b.serializers.SpecimenDefinitionTypeTestedHandlingSerializer
import com.google.fhir.model.r4b.serializers.SpecimenDefinitionTypeTestedSerializer
import kotlin.Suppress
import kotlin.collections.List
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
  /** A business identifier associated with the kind of specimen. */
  public var identifier: Identifier? = null,
  /** The kind of material to be collected. */
  public var typeCollected: CodeableConcept? = null,
  /** Preparation of the patient for specimen collection. */
  public var patientPreparation: List<CodeableConcept?>? = null,
  /** Time aspect of specimen collection (duration or offset). */
  public var timeAspect: String? = null,
  /** The action to be performed for collecting the specimen. */
  public var collection: List<CodeableConcept?>? = null,
  /** Specimen conditioned in a container as expected by the testing laboratory. */
  public var typeTested: List<TypeTested>? = null,
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
    /** Primary of secondary specimen. */
    public var isDerived: Boolean? = null,
    /** The kind of specimen conditioned for testing expected by lab. */
    public var type: CodeableConcept? = null,
    /** The preference for this type of conditioned specimen. */
    public var preference: Enumeration<SpecimenContainedPreference>? = null,
    /** The specimen's container. */
    public var container: Container? = null,
    /** Requirements for delivery and special handling of this kind of conditioned specimen. */
    public var requirement: String? = null,
    /**
     * The usual time that a specimen of this kind is retained after the ordered tests are
     * completed, for the purpose of additional testing.
     */
    public var retentionTime: Duration? = null,
    /** Criterion for rejection of the specimen in its container by the laboratory. */
    public var rejectionCriterion: List<CodeableConcept?>? = null,
    /**
     * Set of instructions for preservation/transport of the specimen at a defined temperature
     * interval, prior the testing process.
     */
    public var handling: List<Handling>? = null,
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
      /** The type of material of the container. */
      public var material: CodeableConcept? = null,
      /** The type of container used to contain this kind of specimen. */
      public var type: CodeableConcept? = null,
      /** Color of container cap. */
      public var cap: CodeableConcept? = null,
      /** The textual description of the kind of container. */
      public var description: String? = null,
      /** The capacity (volume or other measure) of this kind of container. */
      public var capacity: Quantity? = null,
      /** The minimum volume to be conditioned in the container. */
      public var minimumVolume: MinimumVolume? = null,
      /**
       * Substance introduced in the kind of container to preserve, maintain or enhance the
       * specimen. Examples: Formalin, Citrate, EDTA.
       */
      public var additive: List<Additive>? = null,
      /** Special processing that should be applied to the container for this kind of specimen. */
      public var preparation: String? = null,
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
         * Substance introduced in the kind of container to preserve, maintain or enhance the
         * specimen. Examples: Formalin, Citrate, EDTA.
         */
        public var additive: Additive? = null,
      ) : BackboneElement() {
        public sealed interface Additive {
          public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

          public fun asReference(): Reference? = this as? Reference

          public data class CodeableConcept(
            public val `value`: com.google.fhir.model.r4b.CodeableConcept
          ) : Additive

          public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
            Additive

          public companion object {
            public fun from(
              CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
              ReferenceValue: com.google.fhir.model.r4b.Reference?,
            ): Additive? {
              if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
              if (ReferenceValue != null) return Reference(ReferenceValue)
              return null
            }
          }
        }
      }

      public sealed interface MinimumVolume {
        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asString(): String? = this as? String

        public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) :
          MinimumVolume

        public data class String(public val `value`: com.google.fhir.model.r4b.String) :
          MinimumVolume

        public companion object {
          public fun from(
            QuantityValue: com.google.fhir.model.r4b.Quantity?,
            stringValue: com.google.fhir.model.r4b.String?,
          ): MinimumVolume? {
            if (QuantityValue != null) return Quantity(QuantityValue)
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
      public var instruction: String? = null,
    ) : BackboneElement()
  }

  /** Degree of preference of a type of conditioned specimen. */
  public enum class SpecimenContainedPreference(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** This type of contained specimen is preferred to collect this kind of specimen. */
    Preferred(
      "preferred",
      "http://hl7.org/fhir/specimen-contained-preference",
      "Preferred",
      "This type of contained specimen is preferred to collect this kind of specimen.",
    ),
    /** This type of conditioned specimen is an alternate. */
    Alternate(
      "alternate",
      "http://hl7.org/fhir/specimen-contained-preference",
      "Alternate",
      "This type of conditioned specimen is an alternate.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
