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

import com.google.fhir.model.r5.serializers.MedicationKnowledgeCostCostSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeCostSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeDefinitionalDrugCharacteristicSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeDefinitionalDrugCharacteristicValueSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeDefinitionalIngredientSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeDefinitionalIngredientStrengthSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeDefinitionalSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeIndicationGuidelineDosingGuidelineSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeIndicationGuidelineSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeMedicineClassificationSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeMedicineClassificationSourceSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeMonitoringProgramSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeMonographSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgePackagingSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeRegulatoryMaxDispenseSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeRegulatorySerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeRegulatorySubstitutionSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeRelatedMedicationKnowledgeSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeStorageGuidelineEnvironmentalSettingSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSerializer
import com.google.fhir.model.r5.serializers.MedicationKnowledgeStorageGuidelineSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Information about a medication that is used to support knowledge. */
@Serializable(with = MedicationKnowledgeSerializer::class)
@SerialName("MedicationKnowledge")
public data class MedicationKnowledge(
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
   * Business identifier for this medication.
   *
   * This is a business identifier, not a resource identifier (see discussion).
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * A code that specifies this medication, or a textual description if no code is available. Usage
   * note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc.
   * It could also be a national or local formulary code, optionally with translations to other code
   * systems.
   *
   * Depending on the context of use, the code that was actually selected by the user (prescriber,
   * dispenser, etc.) will have the coding.userSelected set to true. As described in the coding
   * datatype: "A coding may be marked as a "userSelected" if a user selected the particular coded
   * value in a user interface (e.g. the user selects an item in a pick-list). If a user selected
   * coding exists, it is the preferred choice for performing translations etc. Other codes can only
   * be literal translations to alternative code systems, or codes at a lower level of granularity
   * (e.g. a generic code for a vendor-specific primary one).
   */
  public var code: CodeableConcept? = null,
  /**
   * A code to indicate if the medication referred to by this MedicationKnowledge is in active use
   * within the drug database or inventory system. The status refers to the validity about the
   * information of the medication and not to its medicinal properties.
   *
   * This status is intended to identify if the medication in a local system is in active use within
   * a drug database or inventory. For example, a pharmacy system may create a new drug file record
   * for a compounded product "ABC Hospital Special Cream" with an active status. At some point in
   * the future, it may be determined that the drug record was created with an error and the status
   * is changed to "entered in error". This status is not intended to specify if a medication is
   * part of a particular formulary. It is possible that the drug record may be referenced by
   * multiple formularies or catalogues and each of those entries would have a separate status.
   */
  public var status: Enumeration<MedicationKnowledgeStatus>? = null,
  /** The creator or owner of the knowledge or information about the medication. */
  public var author: Reference? = null,
  /**
   * Lists the jurisdictions that this medication knowledge was written for.
   *
   * The codes could have varying granularity from a country or group of countries down to a
   * specific district.
   */
  public var intendedJurisdiction: List<CodeableConcept?>? = null,
  /**
   * All of the names for a medication, for example, the name(s) given to a medication in different
   * countries. For example, acetaminophen and paracetamol or salbutamol and albuterol.
   */
  public var name: List<String?>? = null,
  /**
   * Associated or related medications. For example, if the medication is a branded product (e.g.
   * Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication
   * (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor.
   */
  public var relatedMedicationKnowledge: List<RelatedMedicationKnowledge>? = null,
  /** Links to associated medications that could be prescribed, dispensed or administered. */
  public var associatedMedication: List<Reference?>? = null,
  /**
   * Category of the medication or product (e.g. branded product, therapeutic moeity, generic
   * product, innovator product, etc.).
   */
  public var productType: List<CodeableConcept?>? = null,
  /** Associated documentation about the medication. */
  public var monograph: List<Monograph>? = null,
  /** The instructions for preparing the medication. */
  public var preparationInstruction: Markdown? = null,
  /** The price of the medication. */
  public var cost: List<Cost>? = null,
  /** The program under which the medication is reviewed. */
  public var monitoringProgram: List<MonitoringProgram>? = null,
  /**
   * Guidelines or protocols that are applicable for the administration of the medication based on
   * indication.
   */
  public var indicationGuideline: List<IndicationGuideline>? = null,
  /** Categorization of the medication within a formulary or classification system. */
  public var medicineClassification: List<MedicineClassification>? = null,
  /** Information that only applies to packages (not products). */
  public var packaging: List<Packaging>? = null,
  /**
   * Potential clinical issue with or between medication(s) (for example, drug-drug interaction,
   * drug-disease contraindication, drug-allergy interaction, etc.).
   */
  public var clinicalUseIssue: List<Reference?>? = null,
  /**
   * Information on how the medication should be stored, for example, refrigeration temperatures and
   * length of stability at a given temperature.
   */
  public var storageGuideline: List<StorageGuideline>? = null,
  /** Regulatory information about a medication. */
  public var regulatory: List<Regulatory>? = null,
  /**
   * Along with the link to a Medicinal Product Definition resource, this information provides
   * common definitional elements that are needed to understand the specific medication that is
   * being described.
   */
  public var definitional: Definitional? = null,
) : DomainResource() {
  /**
   * Associated or related medications. For example, if the medication is a branded product (e.g.
   * Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication
   * (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor.
   */
  @Serializable(with = MedicationKnowledgeRelatedMedicationKnowledgeSerializer::class)
  public class RelatedMedicationKnowledge(
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
    /** The category of the associated medication knowledge reference. */
    public var type: CodeableConcept? = null,
    /** Associated documentation about the associated medication knowledge. */
    public var reference: List<Reference?>? = null,
  ) : BackboneElement()

  /** Associated documentation about the medication. */
  @Serializable(with = MedicationKnowledgeMonographSerializer::class)
  public class Monograph(
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
     * The category of documentation about the medication. (e.g. professional monograph, patient
     * education monograph).
     */
    public var type: CodeableConcept? = null,
    /** Associated documentation about the medication. */
    public var source: Reference? = null,
  ) : BackboneElement()

  /** The price of the medication. */
  @Serializable(with = MedicationKnowledgeCostSerializer::class)
  public class Cost(
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
    /** The date range for which the cost information of the medication is effective. */
    public var effectiveDate: List<Period?>? = null,
    /**
     * The category of the cost information. For example, manufacturers' cost, patient cost, claim
     * reimbursement cost, actual acquisition cost.
     */
    public var type: CodeableConcept? = null,
    /** The source or owner that assigns the price to the medication. */
    public var source: String? = null,
    /**
     * The price or representation of the cost (for example, Band A, Band B or $, $$) of the
     * medication.
     */
    public var cost: Cost? = null,
  ) : BackboneElement() {
    @Serializable(with = MedicationKnowledgeCostCostSerializer::class)
    public sealed interface Cost {
      public fun asMoney(): Money? = this as? Money

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Cost

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Cost

      public data object Null : Cost

      public companion object {
        public fun from(
          MoneyValue: com.google.fhir.model.r5.Money?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        ): Cost {
          if (MoneyValue != null) return Money(MoneyValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          return Null
        }
      }
    }
  }

  /** The program under which the medication is reviewed. */
  @Serializable(with = MedicationKnowledgeMonitoringProgramSerializer::class)
  public class MonitoringProgram(
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
    /** Type of program under which the medication is monitored. */
    public var type: CodeableConcept? = null,
    /** Name of the reviewing program. */
    public var name: String? = null,
  ) : BackboneElement()

  /**
   * Guidelines or protocols that are applicable for the administration of the medication based on
   * indication.
   */
  @Serializable(with = MedicationKnowledgeIndicationGuidelineSerializer::class)
  public class IndicationGuideline(
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
     * Indication or reason for use of the medication that applies to the specific administration
     * guideline.
     */
    public var indication: List<CodeableReference?>? = null,
    /** The guidelines for the dosage of the medication for the indication. */
    public var dosingGuideline: List<DosingGuideline>? = null,
  ) : BackboneElement() {
    /** The guidelines for the dosage of the medication for the indication. */
    @Serializable(with = MedicationKnowledgeIndicationGuidelineDosingGuidelineSerializer::class)
    public class DosingGuideline(
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
       * The overall intention of the treatment, for example, prophylactic, supporative, curative,
       * etc.
       */
      public var treatmentIntent: CodeableConcept? = null,
      /** Dosage for the medication for the specific guidelines. */
      public var dosage: List<Dosage>? = null,
      /**
       * The type of the treatment that the guideline applies to, for example, long term therapy,
       * first line treatment, etc.
       */
      public var administrationTreatment: CodeableConcept? = null,
      /**
       * Characteristics of the patient that are relevant to the administration guidelines (for
       * example, height, weight, gender, etc.).
       */
      public var patientCharacteristic: List<PatientCharacteristic>? = null,
    ) : BackboneElement() {
      /** Dosage for the medication for the specific guidelines. */
      @Serializable(
        with = MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSerializer::class
      )
      public class Dosage(
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
         * The type or category of dosage for a given medication (for example, prophylaxis,
         * maintenance, therapeutic, etc.).
         */
        public var type: CodeableConcept? = null,
        /** Dosage for the medication for the specific guidelines. */
        public var dosage: List<com.google.fhir.model.r5.Dosage?>? = null,
      ) : BackboneElement()

      /**
       * Characteristics of the patient that are relevant to the administration guidelines (for
       * example, height, weight, gender, etc.).
       */
      @Serializable(
        with =
          MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSerializer::class
      )
      public class PatientCharacteristic(
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
         * The categorization of the specific characteristic that is relevant to the administration
         * guideline (e.g. height, weight, gender).
         */
        public var type: CodeableConcept? = null,
        /** The specific characteristic (e.g. height, weight, gender, etc.). */
        public var `value`: Value? = null,
      ) : BackboneElement() {
        @Serializable(
          with =
            MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSerializer::class
        )
        public sealed interface Value {
          public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

          public fun asQuantity(): Quantity? = this as? Quantity

          public fun asRange(): Range? = this as? Range

          public data class CodeableConcept(
            public val `value`: com.google.fhir.model.r5.CodeableConcept
          ) : Value

          public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

          public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

          public data object Null : Value

          public companion object {
            public fun from(
              CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
              QuantityValue: com.google.fhir.model.r5.Quantity?,
              RangeValue: com.google.fhir.model.r5.Range?,
            ): Value {
              if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
              if (QuantityValue != null) return Quantity(QuantityValue)
              if (RangeValue != null) return Range(RangeValue)
              return Null
            }
          }
        }
      }
    }
  }

  /** Categorization of the medication within a formulary or classification system. */
  @Serializable(with = MedicationKnowledgeMedicineClassificationSerializer::class)
  public class MedicineClassification(
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
     * The type of category for the medication (for example, therapeutic classification, therapeutic
     * sub-classification).
     */
    public var type: CodeableConcept? = null,
    /** Either a textual source of the classification or a reference to an online source. */
    public var source: Source? = null,
    /**
     * Specific category assigned to the medication (e.g. anti-infective, anti-hypertensive,
     * antibiotic, etc.).
     */
    public var classification: List<CodeableConcept?>? = null,
  ) : BackboneElement() {
    @Serializable(with = MedicationKnowledgeMedicineClassificationSourceSerializer::class)
    public sealed interface Source {
      public fun asString(): String? = this as? String

      public fun asUri(): Uri? = this as? Uri

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Source

      public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Source

      public data object Null : Source

      public companion object {
        public fun from(
          stringValue: com.google.fhir.model.r5.String?,
          uriValue: com.google.fhir.model.r5.Uri?,
        ): Source {
          if (stringValue != null) return String(stringValue)
          if (uriValue != null) return Uri(uriValue)
          return Null
        }
      }
    }
  }

  /** Information that only applies to packages (not products). */
  @Serializable(with = MedicationKnowledgePackagingSerializer::class)
  public class Packaging(
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
    /** The cost of the packaged medication. */
    public var cost: List<Cost?>? = null,
    /**
     * A reference to a PackagedProductDefinition that provides the details of the product that is
     * in the packaging and is being priced.
     */
    public var packagedProduct: Reference? = null,
  ) : BackboneElement()

  /**
   * Information on how the medication should be stored, for example, refrigeration temperatures and
   * length of stability at a given temperature.
   */
  @Serializable(with = MedicationKnowledgeStorageGuidelineSerializer::class)
  public class StorageGuideline(
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
    /** Reference to additional information about the storage guidelines. */
    public var reference: Uri? = null,
    /** Additional notes about the storage. */
    public var note: List<Annotation?>? = null,
    /** Duration that the medication remains stable if the environmentalSetting is respected. */
    public var stabilityDuration: Duration? = null,
    /**
     * Describes a setting/value on the environment for the adequate storage of the medication and
     * other substances. Environment settings may involve temperature, humidity, or exposure to
     * light.
     */
    public var environmentalSetting: List<EnvironmentalSetting>? = null,
  ) : BackboneElement() {
    /**
     * Describes a setting/value on the environment for the adequate storage of the medication and
     * other substances. Environment settings may involve temperature, humidity, or exposure to
     * light.
     */
    @Serializable(with = MedicationKnowledgeStorageGuidelineEnvironmentalSettingSerializer::class)
    public class EnvironmentalSetting(
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
       * Identifies the category or type of setting (e.g., type of location, temperature, humidity).
       */
      public var type: CodeableConcept? = null,
      /** Value associated to the setting. E.g., 40° – 50°F for temperature. */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      @Serializable(
        with = MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSerializer::class
      )
      public sealed interface Value {
        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asRange(): Range? = this as? Range

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

        public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Value

        public data object Null : Value

        public companion object {
          public fun from(
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            RangeValue: com.google.fhir.model.r5.Range?,
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          ): Value {
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (RangeValue != null) return Range(RangeValue)
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            return Null
          }
        }
      }
    }
  }

  /** Regulatory information about a medication. */
  @Serializable(with = MedicationKnowledgeRegulatorySerializer::class)
  public class Regulatory(
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
    /** The authority that is specifying the regulations. */
    public var regulatoryAuthority: Reference? = null,
    /**
     * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
     */
    public var substitution: List<Substitution>? = null,
    /** Specifies the schedule of a medication in jurisdiction. */
    public var schedule: List<CodeableConcept?>? = null,
    /** The maximum number of units of the medication that can be dispensed in a period. */
    public var maxDispense: MaxDispense? = null,
  ) : BackboneElement() {
    /**
     * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
     */
    @Serializable(with = MedicationKnowledgeRegulatorySubstitutionSerializer::class)
    public class Substitution(
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
      /** Specifies the type of substitution allowed. */
      public var type: CodeableConcept? = null,
      /** Specifies if regulation allows for changes in the medication when dispensing. */
      public var allowed: Boolean? = null,
    ) : BackboneElement()

    /** The maximum number of units of the medication that can be dispensed in a period. */
    @Serializable(with = MedicationKnowledgeRegulatoryMaxDispenseSerializer::class)
    public class MaxDispense(
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
      /** The maximum number of units of the medication that can be dispensed. */
      public var quantity: Quantity? = null,
      /** The period that applies to the maximum number of units. */
      public var period: Duration? = null,
    ) : BackboneElement()
  }

  /**
   * Along with the link to a Medicinal Product Definition resource, this information provides
   * common definitional elements that are needed to understand the specific medication that is
   * being described.
   */
  @Serializable(with = MedicationKnowledgeDefinitionalSerializer::class)
  public class Definitional(
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
    /** Associated definitions for this medication. */
    public var definition: List<Reference?>? = null,
    /**
     * Describes the form of the item. Powder; tablets; capsule.
     *
     * When Medication is referenced from MedicationRequest, this is the ordered form. When
     * Medication is referenced within MedicationDispense, this is the dispensed form. When
     * Medication is referenced within MedicationAdministration, this is administered form.
     */
    public var doseForm: CodeableConcept? = null,
    /** The intended or approved route of administration. */
    public var intendedRoute: List<CodeableConcept?>? = null,
    /** Identifies a particular constituent of interest in the product. */
    public var ingredient: List<Ingredient>? = null,
    /** Specifies descriptive properties of the medicine, such as color, shape, imprints, etc. */
    public var drugCharacteristic: List<DrugCharacteristic>? = null,
  ) : BackboneElement() {
    /** Identifies a particular constituent of interest in the product. */
    @Serializable(with = MedicationKnowledgeDefinitionalIngredientSerializer::class)
    public class Ingredient(
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
      /** A reference to the resource that provides information about the ingredient. */
      public var item: CodeableReference? = null,
      /** Indication of whether this ingredient affects the therapeutic action of the drug. */
      public var type: CodeableConcept? = null,
      /**
       * Specifies how many (or how much) of the items there are in this Medication. For example,
       * 250 mg per tablet. This is expressed as a ratio where the numerator is 250mg and the
       * denominator is 1 tablet but can also be expressed a quantity when the denominator is
       * assumed to be 1 tablet.
       */
      public var strength: Strength? = null,
    ) : BackboneElement() {
      @Serializable(with = MedicationKnowledgeDefinitionalIngredientStrengthSerializer::class)
      public sealed interface Strength {
        public fun asRatio(): Ratio? = this as? Ratio

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asQuantity(): Quantity? = this as? Quantity

        public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Strength

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Strength

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
          Strength

        public data object Null : Strength

        public companion object {
          public fun from(
            RatioValue: com.google.fhir.model.r5.Ratio?,
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
          ): Strength {
            if (RatioValue != null) return Ratio(RatioValue)
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            return Null
          }
        }
      }
    }

    /** Specifies descriptive properties of the medicine, such as color, shape, imprints, etc. */
    @Serializable(with = MedicationKnowledgeDefinitionalDrugCharacteristicSerializer::class)
    public class DrugCharacteristic(
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
       * A code specifying which characteristic of the medicine is being described (for example,
       * colour, shape, imprint).
       */
      public var type: CodeableConcept? = null,
      /**
       * Description of the characteristic.
       *
       * The description should be provided as a CodeableConcept, SimpleQuantity or an image. The
       * description can be a string only when these others are not available.
       */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      @Serializable(with = MedicationKnowledgeDefinitionalDrugCharacteristicValueSerializer::class)
      public sealed interface Value {
        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asString(): String? = this as? String

        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

        public fun asAttachment(): Attachment? = this as? Attachment

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Value

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

        public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
          Value

        public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
          Value

        public data object Null : Value

        public companion object {
          public fun from(
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            stringValue: com.google.fhir.model.r5.String?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
            AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ): Value {
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (stringValue != null) return String(stringValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
            if (AttachmentValue != null) return Attachment(AttachmentValue)
            return Null
          }
        }
      }
    }
  }

  /** MedicationKnowledge Status Codes */
  public enum class MedicationKnowledgeStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The medication referred to by this MedicationKnowledge is in active use within the drug
     * database or inventory system.
     */
    Active(
      "active",
      "http://hl7.org/fhir/CodeSystem/medicationknowledge-status",
      "Active",
      "The medication referred to by this MedicationKnowledge is in active use within the drug database or inventory system.",
    ),
    /**
     * The medication referred to by this MedicationKnowledge was entered in error within the drug
     * database or inventory system.
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/CodeSystem/medicationknowledge-status",
      "Entered in Error",
      "The medication referred to by this MedicationKnowledge was entered in error within the drug database or inventory system.",
    ),
    /**
     * The medication referred to by this MedicationKnowledge is not in active use within the drug
     * database or inventory system.
     */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/CodeSystem/medicationknowledge-status",
      "Inactive",
      "The medication referred to by this MedicationKnowledge is not in active use within the drug database or inventory system.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): MedicationKnowledgeStatus =
        when (code) {
          "active" -> Active
          "entered-in-error" -> Entered_In_Error
          "inactive" -> Inactive
          else ->
            throw IllegalArgumentException("Unknown code $code for enum MedicationKnowledgeStatus")
        }
    }
  }
}
