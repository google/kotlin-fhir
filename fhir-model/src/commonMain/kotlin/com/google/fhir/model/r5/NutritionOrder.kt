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

import com.google.fhir.model.r5.serializers.NutritionOrderEnteralFormulaAdditiveSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderEnteralFormulaAdministrationScheduleSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderEnteralFormulaAdministrationSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderEnteralFormulaSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderOralDietNutrientSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderOralDietScheduleSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderOralDietSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderOralDietTextureSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderSupplementScheduleSerializer
import com.google.fhir.model.r5.serializers.NutritionOrderSupplementSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
 * patient/resident.
 */
@Serializable(with = NutritionOrderSerializer::class)
@SerialName("NutritionOrder")
public data class NutritionOrder(
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
   * Identifiers assigned to this order by the order sender or by the order receiver.
   *
   * The Identifier.type element can be to indicate filler vs. placer if needed. This is explained
   * in further detail [here](servicerequest.html#notes).
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is
   * adhered to in whole or in part by this NutritionOrder.
   *
   * Note: This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var instantiatesCanonical: List<Canonical?>? = null,
  /**
   * The URL pointing to an externally maintained protocol, guideline, orderset or other definition
   * that is adhered to in whole or in part by this NutritionOrder.
   *
   * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
   */
  public var instantiatesUri: List<Uri?>? = null,
  /**
   * The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in
   * whole or in part by this NutritionOrder.
   */
  public var instantiates: List<Uri?>? = null,
  /** A plan or request that is fulfilled in whole or in part by this nutrition order. */
  public var basedOn: List<Reference?>? = null,
  /**
   * A shared identifier common to all nutrition orders that were authorized more or less
   * simultaneously by a single author, representing the composite or group identifier.
   */
  public var groupIdentifier: Identifier? = null,
  /**
   * The workflow status of the nutrition order/request.
   *
   * Typically the system placing the order sets the status to "requested". Thereafter, the order is
   * maintained by the receiver that updates the status as the request is handled. This element is
   * labeled as a modifier because the status contains codes that mark the resource as not currently
   * valid.
   */
  public var status: Enumeration<NutritionOrderStatus>? = null,
  /**
   * Indicates the level of authority/intentionality associated with the NutrionOrder and where the
   * request fits into the workflow chain.
   *
   * When resources map to this element, they are free to define as many codes as necessary to cover
   * their space and will map to "proposal, plan or order". Can have multiple codes that map to one
   * of these. E.g. "original order", "encoded order", "reflex order" would all map to "order".
   * Expectation is that the set of codes is mutually exclusive or a strict all-encompassing
   * hierarchy.
   */
  public var intent: Enumeration<NutritiionOrderIntent>? = null,
  /**
   * Indicates how quickly the Nutrition Order should be addressed with respect to other requests.
   */
  public var priority: Enumeration<NutritionOrderPriority>? = null,
  /**
   * The person or set of individuals who needs the nutrition order for an oral diet, nutritional
   * supplement and/or enteral or formula feeding.
   */
  public var subject: Reference? = null,
  /**
   * An encounter that provides additional information about the healthcare context in which this
   * request is made.
   */
  public var encounter: Reference? = null,
  /**
   * Information to support fulfilling (i.e. dispensing or administering) of the nutrition, for
   * example, patient height and weight).
   */
  public var supportingInformation: List<Reference?>? = null,
  /** The date and time that this nutrition order was requested. */
  public var dateTime: DateTime? = null,
  /**
   * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement,
   * or formula feedings.
   */
  public var orderer: Reference? = null,
  /** The specified desired performer of the nutrition order. */
  public var performer: List<CodeableReference?>? = null,
  /**
   * A link to a record of allergies or intolerances which should be included in the nutrition
   * order.
   *
   * Information on a patient's food allergies and intolerances to inform healthcare personnel about
   * the type of foods that the patient shouldn't receive or consume.
   */
  public var allergyIntolerance: List<Reference?>? = null,
  /**
   * This modifier is used to convey order-specific modifiers about the type of food that should be
   * given. These can be derived from patient allergies, intolerances, or preferences such as Halal,
   * Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral
   * diet, nutritional supplements and enteral formula feedings.
   *
   * Information on a patient's food preferences that inform healthcare personnel about the food
   * that the patient should receive or consume.
   */
  public var foodPreferenceModifier: List<CodeableConcept?>? = null,
  /**
   * This modifier is used to convey Order-specific modifier about the type of oral food or oral
   * fluids that should not be given. These can be derived from patient allergies, intolerances, or
   * preferences such as No Red Meat, No Soy or No Wheat or Gluten-Free. While it should not be
   * necessary to repeat allergy or intolerance information captured in the referenced
   * AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey
   * additional specificity related to foods that should be eliminated from the patient’s diet for
   * any reason. This modifier applies to the entire nutrition order inclusive of the oral diet,
   * nutritional supplements and enteral formula feedings.
   *
   * Information on a patient's food allergies, intolerances and preferences to inform healthcare
   * personnel about the type of foods that the patient shouldn't receive or consume.
   */
  public var excludeFoodModifier: List<CodeableConcept?>? = null,
  /**
   * This modifier is used to convey whether a food item is allowed to be brought in by the patient
   * and/or family. If set to true, indicates that the receiving system does not need to supply the
   * food item.
   */
  public var outsideFoodAllowed: Boolean? = null,
  /** Diet given orally in contrast to enteral (tube) feeding. */
  public var oralDiet: OralDiet? = null,
  /**
   * Oral nutritional products given in order to add further nutritional value to the patient's
   * diet.
   */
  public var supplement: List<Supplement>? = null,
  /**
   * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that
   * delivers nutrition distal to the oral cavity.
   */
  public var enteralFormula: EnteralFormula? = null,
  /**
   * Comments made about the {{title}} by the requester, performer, subject or other participants.
   *
   * This element SHALL NOT be used to supply free text instructions for the diet which are
   * represented in the `.oralDiet.instruction`, `supplement.instruction`, or
   * `enteralFormula.administrationInstruction` elements.
   */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  /** Diet given orally in contrast to enteral (tube) feeding. */
  @Serializable(with = NutritionOrderOralDietSerializer::class)
  public class OralDiet(
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
    /** The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet. */
    public var type: List<CodeableConcept?>? = null,
    /** Schedule information for an oral diet. */
    public var schedule: Schedule? = null,
    /**
     * Class that defines the quantity and type of nutrient modifications (for example carbohydrate,
     * fiber or sodium) required for the oral diet.
     */
    public var nutrient: List<Nutrient>? = null,
    /**
     * Class that describes any texture modifications required for the patient to safely consume
     * various types of solid foods.
     */
    public var texture: List<Texture>? = null,
    /**
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or
     * fluids served to the patient.
     */
    public var fluidConsistencyType: List<CodeableConcept?>? = null,
    /**
     * Free text or additional instructions or information pertaining to the oral diet.
     *
     * Free text dosage instructions can be used for cases where the instructions are too complex to
     * code.
     */
    public var instruction: String? = null,
  ) : BackboneElement() {
    /** Schedule information for an oral diet. */
    @Serializable(with = NutritionOrderOralDietScheduleSerializer::class)
    public class Schedule(
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
       * The time period and frequency at which the diet should be given. The diet should be given
       * for the combination of all schedules if more than one schedule is present.
       */
      public var timing: List<Timing?>? = null,
      /**
       * Indicates whether the product is only taken when needed within a specific dosing schedule.
       */
      public var asNeeded: Boolean? = null,
      /**
       * Indicates whether the product is only taken based on a precondition for taking the product.
       */
      public var asNeededFor: CodeableConcept? = null,
    ) : BackboneElement()

    /**
     * Class that defines the quantity and type of nutrient modifications (for example carbohydrate,
     * fiber or sodium) required for the oral diet.
     */
    @Serializable(with = NutritionOrderOralDietNutrientSerializer::class)
    public class Nutrient(
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
      /** The nutrient that is being modified such as carbohydrate or sodium. */
      public var modifier: CodeableConcept? = null,
      /** The quantity of the specified nutrient to include in diet. */
      public var amount: Quantity? = null,
    ) : BackboneElement()

    /**
     * Class that describes any texture modifications required for the patient to safely consume
     * various types of solid foods.
     */
    @Serializable(with = NutritionOrderOralDietTextureSerializer::class)
    public class Texture(
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
       * Any texture modifications (for solid foods) that should be made, e.g. easy to chew,
       * chopped, ground, and pureed.
       *
       * Coupled with the foodType (Meat).
       */
      public var modifier: CodeableConcept? = null,
      /**
       * The food type(s) (e.g. meats, all foods) that the texture modification applies to. This
       * could be all foods types.
       *
       * Coupled with the `texture.modifier`; could be (All Foods).
       */
      public var foodType: CodeableConcept? = null,
    ) : BackboneElement()
  }

  /**
   * Oral nutritional products given in order to add further nutritional value to the patient's
   * diet.
   */
  @Serializable(with = NutritionOrderSupplementSerializer::class)
  public class Supplement(
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
     * The kind of nutritional supplement product required such as a high protein or pediatric clear
     * liquid supplement.
     */
    public var type: CodeableReference? = null,
    /** The product or brand name of the nutritional supplement such as "Acme Protein Shake". */
    public var productName: String? = null,
    /** Schedule information for a supplement. */
    public var schedule: Schedule? = null,
    /** The amount of the nutritional supplement to be given. */
    public var quantity: Quantity? = null,
    /**
     * Free text or additional instructions or information pertaining to the oral supplement.
     *
     * Free text dosage instructions can be used for cases where the instructions are too complex to
     * code.
     */
    public var instruction: String? = null,
  ) : BackboneElement() {
    /** Schedule information for a supplement. */
    @Serializable(with = NutritionOrderSupplementScheduleSerializer::class)
    public class Schedule(
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
       * The time period and frequency at which the supplement should be given. The supplement
       * should be given for the combination of all schedules if more than one schedule is present.
       */
      public var timing: List<Timing?>? = null,
      /**
       * Indicates whether the supplement is only taken when needed within a specific dosing
       * schedule.
       */
      public var asNeeded: Boolean? = null,
      /**
       * Indicates whether the supplement is only taken based on a precondition for taking the
       * supplement.
       */
      public var asNeededFor: CodeableConcept? = null,
    ) : BackboneElement()
  }

  /**
   * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that
   * delivers nutrition distal to the oral cavity.
   */
  @Serializable(with = NutritionOrderEnteralFormulaSerializer::class)
  public class EnteralFormula(
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
     * The type of enteral or infant formula such as an adult standard formula with fiber or a
     * soy-based infant formula.
     */
    public var baseFormulaType: CodeableReference? = null,
    /**
     * The product or brand name of the enteral or infant formula product such as "ACME Adult
     * Standard Formula".
     */
    public var baseFormulaProductName: String? = null,
    /**
     * The intended type of device that is to be used for the administration of the enteral formula.
     */
    public var deliveryDevice: List<CodeableReference?>? = null,
    /** Indicates modular components to be provided in addition or mixed with the base formula. */
    public var additive: List<Additive>? = null,
    /**
     * The amount of energy (calories) that the formula should provide per specified volume,
     * typically per mL or fluid oz. For example, an infant may require a formula that provides 24
     * calories per fluid ounce or an adult may require an enteral formula that provides 1.5
     * calorie/mL.
     */
    public var caloricDensity: Quantity? = null,
    /**
     * The route or physiological path of administration into the patient's gastrointestinal tract
     * for purposes of providing the formula feeding, e.g. nasogastric tube.
     */
    public var routeOfAdministration: CodeableConcept? = null,
    /**
     * Formula administration instructions as structured data. This repeating structure allows for
     * changing the administration rate or volume over time for both bolus and continuous feeding.
     * An example of this would be an instruction to increase the rate of continuous feeding every 2
     * hours.
     *
     * See implementation notes below for further discussion on how to order continuous vs bolus
     * enteral feeding using this resource.
     */
    public var administration: List<Administration>? = null,
    /**
     * The maximum total quantity of formula that may be administered to a subject over the period
     * of time, e.g. 1440 mL over 24 hours.
     */
    public var maxVolumeToDeliver: Quantity? = null,
    /**
     * Free text formula administration, feeding instructions or additional instructions or
     * information.
     *
     * Free text dosage instructions can be used for cases where the instructions are too complex to
     * code.
     */
    public var administrationInstruction: Markdown? = null,
  ) : BackboneElement() {
    /** Indicates modular components to be provided in addition or mixed with the base formula. */
    @Serializable(with = NutritionOrderEnteralFormulaAdditiveSerializer::class)
    public class Additive(
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
       * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be
       * provided in addition to or mixed with the base formula.
       */
      public var type: CodeableReference? = null,
      /** The product or brand name of the type of modular component to be added to the formula. */
      public var productName: String? = null,
      /** The amount of additive to be given in addition or to be mixed in with the base formula. */
      public var quantity: Quantity? = null,
    ) : BackboneElement()

    /**
     * Formula administration instructions as structured data. This repeating structure allows for
     * changing the administration rate or volume over time for both bolus and continuous feeding.
     * An example of this would be an instruction to increase the rate of continuous feeding every 2
     * hours.
     */
    @Serializable(with = NutritionOrderEnteralFormulaAdministrationSerializer::class)
    public class Administration(
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
      /** Schedule information for an enteral formula. */
      public var schedule: Schedule? = null,
      /**
       * The volume of formula to provide to the patient per the specified administration schedule.
       */
      public var quantity: Quantity? = null,
      /**
       * The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to
       * the specified schedule.
       *
       * Ratio is used when the quantity value in the denominator is not "1", otherwise use
       * Quantity. For example, the Ratio datatype is used for "200 mL/4 hrs" versus the Quantity
       * datatype for "50 mL/hr".
       */
      public var rate: Rate? = null,
    ) : BackboneElement() {
      /** Schedule information for an enteral formula. */
      @Serializable(with = NutritionOrderEnteralFormulaAdministrationScheduleSerializer::class)
      public class Schedule(
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
         * The time period and frequency at which the enteral formula should be given. The enteral
         * formula should be given for the combination of all schedules if more than one schedule is
         * present.
         */
        public var timing: List<Timing?>? = null,
        /**
         * Indicates whether the enteral formula is only taken when needed within a specific dosing
         * schedule.
         */
        public var asNeeded: Boolean? = null,
        /**
         * Indicates whether the enteral formula is only taken based on a precondition for taking
         * the enteral formula.
         */
        public var asNeededFor: CodeableConcept? = null,
      ) : BackboneElement()

      public sealed interface Rate {
        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asRatio(): Ratio? = this as? Ratio

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Rate

        public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Rate

        public companion object {
          public fun from(
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            RatioValue: com.google.fhir.model.r5.Ratio?,
          ): Rate? {
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (RatioValue != null) return Ratio(RatioValue)
            return null
          }
        }
      }
    }
  }

  /** Codes identifying the lifecycle stage of a request. */
  public enum class NutritionOrderStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The request has been created but is not yet complete or ready for action. */
    Draft(
      "draft",
      "http://hl7.org/fhir/request-status",
      "Draft",
      "The request has been created but is not yet complete or ready for action.",
    ),
    /** The request is in force and ready to be acted upon. */
    Active(
      "active",
      "http://hl7.org/fhir/request-status",
      "Active",
      "The request is in force and ready to be acted upon.",
    ),
    /**
     * The request (and any implicit authorization to act) has been temporarily withdrawn but is
     * expected to resume in the future.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/request-status",
      "On Hold",
      "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.",
    ),
    /**
     * The request (and any implicit authorization to act) has been terminated prior to the known
     * full completion of the intended actions. No further activity should occur.
     */
    Revoked(
      "revoked",
      "http://hl7.org/fhir/request-status",
      "Revoked",
      "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.",
    ),
    /**
     * The activity described by the request has been fully performed. No further activity will
     * occur.
     */
    Completed(
      "completed",
      "http://hl7.org/fhir/request-status",
      "Completed",
      "The activity described by the request has been fully performed.  No further activity will occur.",
    ),
    /**
     * This request should never have existed and should be considered 'void'. (It is possible that
     * real-world decisions were based on it. If real-world activity has occurred, the status should
     * be "revoked" rather than "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/request-status",
      "Entered in Error",
      "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this request. Note: This concept is not to be used for "other" - one of the listed statuses
     * is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/request-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): NutritionOrderStatus =
        when (code) {
          "draft" -> Draft
          "active" -> Active
          "on-hold" -> On_Hold
          "revoked" -> Revoked
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum NutritionOrderStatus")
        }
    }
  }

  /** Codes indicating the degree of authority/intentionality associated with a request. */
  public enum class NutritiionOrderIntent(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The request is a suggestion made by someone/something that does not have an intention to
     * ensure it occurs and without providing an authorization to act.
     */
    Proposal(
      "proposal",
      "http://hl7.org/fhir/request-intent",
      "Proposal",
      "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.",
    ),
    /**
     * The request represents an intention to ensure something occurs without providing an
     * authorization for others to act.
     */
    Plan(
      "plan",
      "http://hl7.org/fhir/request-intent",
      "Plan",
      "The request represents an intention to ensure something occurs without providing an authorization for others to act.",
    ),
    /**
     * The request represents a legally binding instruction authored by a Patient or RelatedPerson.
     */
    Directive(
      "directive",
      "http://hl7.org/fhir/request-intent",
      "Directive",
      "The request represents a legally binding instruction authored by a Patient or RelatedPerson.",
    ),
    /** The request represents a request/demand and authorization for action by the requestor. */
    Order(
      "order",
      "http://hl7.org/fhir/request-intent",
      "Order",
      "The request represents a request/demand and authorization for action by the requestor.",
    ),
    /** The request represents an original authorization for action. */
    Original_Order(
      "original-order",
      "http://hl7.org/fhir/request-intent",
      "Original Order",
      "The request represents an original authorization for action.",
    ),
    /**
     * The request represents an automatically generated supplemental authorization for action based
     * on a parent authorization together with initial results of the action taken against that
     * parent authorization.
     */
    Reflex_Order(
      "reflex-order",
      "http://hl7.org/fhir/request-intent",
      "Reflex Order",
      "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.",
    ),
    /**
     * The request represents the view of an authorization instantiated by a fulfilling system
     * representing the details of the fulfiller's intention to act upon a submitted order.
     */
    Filler_Order(
      "filler-order",
      "http://hl7.org/fhir/request-intent",
      "Filler Order",
      "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.",
    ),
    /**
     * An order created in fulfillment of a broader order that represents the authorization for a
     * single activity occurrence. E.g. The administration of a single dose of a drug.
     */
    Instance_Order(
      "instance-order",
      "http://hl7.org/fhir/request-intent",
      "Instance Order",
      "An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.",
    ),
    /**
     * The request represents a component or option for a RequestOrchestration that establishes
     * timing, conditionality and/or other constraints among a set of requests. Refer to
     * [[[RequestOrchestration]]] for additional information on how this status is used.
     */
    Option(
      "option",
      "http://hl7.org/fhir/request-intent",
      "Option",
      "The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): NutritiionOrderIntent =
        when (code) {
          "proposal" -> Proposal
          "plan" -> Plan
          "directive" -> Directive
          "order" -> Order
          "original-order" -> Original_Order
          "reflex-order" -> Reflex_Order
          "filler-order" -> Filler_Order
          "instance-order" -> Instance_Order
          "option" -> Option
          else ->
            throw IllegalArgumentException("Unknown code $code for enum NutritiionOrderIntent")
        }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class NutritionOrderPriority(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The request has normal priority. */
    Routine(
      "routine",
      "http://hl7.org/fhir/request-priority",
      "Routine",
      "The request has normal priority.",
    ),
    /** The request should be actioned promptly - higher priority than routine. */
    Urgent(
      "urgent",
      "http://hl7.org/fhir/request-priority",
      "Urgent",
      "The request should be actioned promptly - higher priority than routine.",
    ),
    /** The request should be actioned as soon as possible - higher priority than urgent. */
    Asap(
      "asap",
      "http://hl7.org/fhir/request-priority",
      "ASAP",
      "The request should be actioned as soon as possible - higher priority than urgent.",
    ),
    /**
     * The request should be actioned immediately - highest possible priority. E.g. an emergency.
     */
    Stat(
      "stat",
      "http://hl7.org/fhir/request-priority",
      "STAT",
      "The request should be actioned immediately - highest possible priority.  E.g. an emergency.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): NutritionOrderPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else ->
            throw IllegalArgumentException("Unknown code $code for enum NutritionOrderPriority")
        }
    }
  }
}
