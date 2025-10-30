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

import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionContraindicationOtherTherapySerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionContraindicationSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionIndicationDurationSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionIndicationSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionInteractionInteractantItemSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionInteractionInteractantSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionInteractionSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionUndesirableEffectSerializer
import com.google.fhir.model.r5.serializers.ClinicalUseDefinitionWarningSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for
 * a medicinal product, medication, device or procedure.
 */
@Serializable(with = ClinicalUseDefinitionSerializer::class)
@SerialName("ClinicalUseDefinition")
public data class ClinicalUseDefinition(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override val id: String? = null,
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
  /** Business identifier for this issue. */
  public val identifier: List<Identifier> = listOf(),
  /** indication | contraindication | interaction | undesirable-effect | warning. */
  public val type: Enumeration<ClinicalUseDefinitionType>,
  /**
   * A categorisation of the issue, primarily for dividing warnings into subject heading areas such
   * as "Pregnancy and Lactation", "Overdose", "Effects on Ability to Drive and Use Machines".
   */
  public val category: List<CodeableConcept> = listOf(),
  /** The medication, product, substance, device, procedure etc. for which this is an indication. */
  public val subject: List<Reference> = listOf(),
  /** Whether this is a current issue or one that has been retired etc. */
  public val status: CodeableConcept? = null,
  /** Specifics for when this is a contraindication. */
  public val contraindication: Contraindication? = null,
  /** Specifics for when this is an indication. */
  public val indication: Indication? = null,
  /** Specifics for when this is an interaction. */
  public val interaction: Interaction? = null,
  /** The population group to which this applies. */
  public val population: List<Reference> = listOf(),
  /** Logic used by the clinical use definition. */
  public val library: List<Canonical> = listOf(),
  /**
   * Describe the possible undesirable effects (negative outcomes) from the use of the medicinal
   * product as treatment.
   */
  public val undesirableEffect: UndesirableEffect? = null,
  /**
   * A critical piece of information about environmental, health or physical risks or hazards that
   * serve as caution to the user. For example 'Do not operate heavy machinery', 'May cause
   * drowsiness', or 'Get medical advice/attention if you feel unwell'.
   */
  public val warning: Warning? = null,
) : DomainResource() {
  /** Specifics for when this is a contraindication. */
  @Serializable(with = ClinicalUseDefinitionContraindicationSerializer::class)
  public class Contraindication(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: String? = null,
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
    /** The situation that is being documented as contraindicating against this item. */
    public val diseaseSymptomProcedure: CodeableReference? = null,
    /**
     * The status of the disease or symptom for the contraindication, for example "chronic" or
     * "metastatic".
     */
    public val diseaseStatus: CodeableReference? = null,
    /** A comorbidity (concurrent condition) or coinfection. */
    public val comorbidity: List<CodeableReference> = listOf(),
    /** The indication which this is a contraidication for. */
    public val indication: List<Reference> = listOf(),
    /**
     * An expression that returns true or false, indicating whether the indication is applicable or
     * not, after having applied its other elements.
     *
     * The expression may be inlined or may be a reference to a named expression within a logic
     * library referenced by the library element.
     */
    public val applicability: Expression? = null,
    /**
     * Information about the use of the medicinal product in relation to other therapies described
     * as part of the contraindication.
     */
    public val otherTherapy: List<OtherTherapy> = listOf(),
  ) : BackboneElement() {
    /**
     * Information about the use of the medicinal product in relation to other therapies described
     * as part of the contraindication.
     */
    @Serializable(with = ClinicalUseDefinitionContraindicationOtherTherapySerializer::class)
    public class OtherTherapy(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: String? = null,
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
      /**
       * The type of relationship between the medicinal product indication or contraindication and
       * another therapy.
       */
      public val relationshipType: CodeableConcept,
      /**
       * Reference to a specific medication (active substance, medicinal product or class of
       * products, biological, food etc.) as part of an indication or contraindication.
       */
      public val treatment: CodeableReference,
    ) : BackboneElement()
  }

  /** Specifics for when this is an indication. */
  @Serializable(with = ClinicalUseDefinitionIndicationSerializer::class)
  public class Indication(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: String? = null,
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
    /** The situation that is being documented as an indicaton for this item. */
    public val diseaseSymptomProcedure: CodeableReference? = null,
    /**
     * The status of the disease or symptom for the indication, for example "chronic" or
     * "metastatic".
     */
    public val diseaseStatus: CodeableReference? = null,
    /** A comorbidity (concurrent condition) or coinfection as part of the indication. */
    public val comorbidity: List<CodeableReference> = listOf(),
    /** The intended effect, aim or strategy to be achieved. */
    public val intendedEffect: CodeableReference? = null,
    /**
     * Timing or duration information, that may be associated with use with the indicated condition
     * e.g. Adult patients suffering from myocardial infarction (from a few days until less than 35
     * days), ischaemic stroke (from 7 days until less than 6 months).
     */
    public val duration: Duration? = null,
    /**
     * An unwanted side effect or negative outcome that may happen if you use the drug (or other
     * subject of this resource) for this indication.
     */
    public val undesirableEffect: List<Reference> = listOf(),
    /**
     * An expression that returns true or false, indicating whether the indication is applicable or
     * not, after having applied its other elements.
     *
     * The expression may be inlined or may be a reference to a named expression within a logic
     * library referenced by the library element.
     */
    public val applicability: Expression? = null,
    /**
     * Information about the use of the medicinal product in relation to other therapies described
     * as part of the indication.
     */
    public val otherTherapy: List<Contraindication.OtherTherapy> = listOf(),
  ) : BackboneElement() {
    @Serializable(with = ClinicalUseDefinitionIndicationDurationSerializer::class)
    public sealed interface Duration {
      public fun asRange(): Range? = this as? Range

      public fun asString(): String? = this as? String

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Duration

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Duration

      public companion object {
        internal fun from(
          rangeValue: com.google.fhir.model.r5.Range?,
          stringValue: com.google.fhir.model.r5.String?,
        ): Duration? {
          if (rangeValue != null) return Range(rangeValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }

  /** Specifics for when this is an interaction. */
  @Serializable(with = ClinicalUseDefinitionInteractionSerializer::class)
  public class Interaction(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: String? = null,
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
    /** The specific medication, product, food, substance etc. or laboratory test that interacts. */
    public val interactant: List<Interactant> = listOf(),
    /**
     * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test
     * interaction.
     */
    public val type: CodeableConcept? = null,
    /**
     * The effect of the interaction, for example "reduced gastric absorption of primary
     * medication".
     */
    public val effect: CodeableReference? = null,
    /** The incidence of the interaction, e.g. theoretical, observed. */
    public val incidence: CodeableConcept? = null,
    /** Actions for managing the interaction. */
    public val management: List<CodeableConcept> = listOf(),
  ) : BackboneElement() {
    /** The specific medication, product, food, substance etc. or laboratory test that interacts. */
    @Serializable(with = ClinicalUseDefinitionInteractionInteractantSerializer::class)
    public class Interactant(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override val id: String? = null,
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
      /**
       * The specific medication, product, food, substance etc. or laboratory test that interacts.
       */
      public val item: Item,
    ) : BackboneElement() {
      @Serializable(with = ClinicalUseDefinitionInteractionInteractantItemSerializer::class)
      public sealed interface Item {
        public fun asReference(): Reference? = this as? Reference

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Item

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Item

        public companion object {
          internal fun from(
            referenceValue: com.google.fhir.model.r5.Reference?,
            codeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          ): Item? {
            if (referenceValue != null) return Reference(referenceValue)
            if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
            return null
          }
        }
      }
    }
  }

  /**
   * Describe the possible undesirable effects (negative outcomes) from the use of the medicinal
   * product as treatment.
   */
  @Serializable(with = ClinicalUseDefinitionUndesirableEffectSerializer::class)
  public class UndesirableEffect(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: String? = null,
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
    /** The situation in which the undesirable effect may manifest. */
    public val symptomConditionEffect: CodeableReference? = null,
    /** High level classification of the effect. */
    public val classification: CodeableConcept? = null,
    /** How often the effect is seen. */
    public val frequencyOfOccurrence: CodeableConcept? = null,
  ) : BackboneElement()

  /**
   * A critical piece of information about environmental, health or physical risks or hazards that
   * serve as caution to the user. For example 'Do not operate heavy machinery', 'May cause
   * drowsiness', or 'Get medical advice/attention if you feel unwell'.
   */
  @Serializable(with = ClinicalUseDefinitionWarningSerializer::class)
  public class Warning(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: String? = null,
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
    /** A textual definition of this warning, with formatting. */
    public val description: Markdown? = null,
    /** A coded or unformatted textual definition of this warning. */
    public val code: CodeableConcept? = null,
  ) : BackboneElement()

  /** Overall defining type of this clinical use definition. */
  public enum class ClinicalUseDefinitionType(
    private val code: String,
    private val system: String,
    private val display: String?,
  ) {
    Indication("indication", "http://hl7.org/fhir/clinical-use-definition-type", "Indication"),
    Contraindication(
      "contraindication",
      "http://hl7.org/fhir/clinical-use-definition-type",
      "Contraindication",
    ),
    Interaction("interaction", "http://hl7.org/fhir/clinical-use-definition-type", "Interaction"),
    Undesirable_Effect(
      "undesirable-effect",
      "http://hl7.org/fhir/clinical-use-definition-type",
      "Undesirable Effect",
    ),
    Warning("warning", "http://hl7.org/fhir/clinical-use-definition-type", "Warning");

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public companion object {
      public fun fromCode(code: String): ClinicalUseDefinitionType =
        when (code) {
          "indication" -> Indication
          "contraindication" -> Contraindication
          "interaction" -> Interaction
          "undesirable-effect" -> Undesirable_Effect
          "warning" -> Warning
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ClinicalUseDefinitionType")
        }
    }
  }
}
