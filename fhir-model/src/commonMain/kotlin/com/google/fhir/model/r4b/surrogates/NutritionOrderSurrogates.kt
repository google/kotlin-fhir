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

@file:UseSerializers(DoubleSerializer::class, LocalTimeSerializer::class)
@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.NutritionOrder
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class NutritionOrderOralDietNutrientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var modifier: CodeableConcept? = null,
  public var amount: Quantity? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet.Nutrient =
    NutritionOrder.OralDiet.Nutrient().apply {
      id = this@NutritionOrderOralDietNutrientSurrogate.id
      extension = this@NutritionOrderOralDietNutrientSurrogate.extension
      modifierExtension = this@NutritionOrderOralDietNutrientSurrogate.modifierExtension
      modifier = this@NutritionOrderOralDietNutrientSurrogate.modifier
      amount = this@NutritionOrderOralDietNutrientSurrogate.amount
    }

  public companion object {
    public fun fromModel(
      model: NutritionOrder.OralDiet.Nutrient
    ): NutritionOrderOralDietNutrientSurrogate =
      with(model) {
        NutritionOrderOralDietNutrientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          modifier = this@with.modifier
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal data class NutritionOrderOralDietTextureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var modifier: CodeableConcept? = null,
  public var foodType: CodeableConcept? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet.Texture =
    NutritionOrder.OralDiet.Texture().apply {
      id = this@NutritionOrderOralDietTextureSurrogate.id
      extension = this@NutritionOrderOralDietTextureSurrogate.extension
      modifierExtension = this@NutritionOrderOralDietTextureSurrogate.modifierExtension
      modifier = this@NutritionOrderOralDietTextureSurrogate.modifier
      foodType = this@NutritionOrderOralDietTextureSurrogate.foodType
    }

  public companion object {
    public fun fromModel(
      model: NutritionOrder.OralDiet.Texture
    ): NutritionOrderOralDietTextureSurrogate =
      with(model) {
        NutritionOrderOralDietTextureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          modifier = this@with.modifier
          foodType = this@with.foodType
        }
      }
  }
}

@Serializable
internal data class NutritionOrderOralDietSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var schedule: List<Timing?>? = null,
  public var nutrient: List<NutritionOrder.OralDiet.Nutrient>? = null,
  public var texture: List<NutritionOrder.OralDiet.Texture>? = null,
  public var fluidConsistencyType: List<CodeableConcept?>? = null,
  public var instruction: KotlinString? = null,
  public var _instruction: Element? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet =
    NutritionOrder.OralDiet().apply {
      id = this@NutritionOrderOralDietSurrogate.id
      extension = this@NutritionOrderOralDietSurrogate.extension
      modifierExtension = this@NutritionOrderOralDietSurrogate.modifierExtension
      type = this@NutritionOrderOralDietSurrogate.type
      schedule = this@NutritionOrderOralDietSurrogate.schedule
      nutrient = this@NutritionOrderOralDietSurrogate.nutrient
      texture = this@NutritionOrderOralDietSurrogate.texture
      fluidConsistencyType = this@NutritionOrderOralDietSurrogate.fluidConsistencyType
      instruction =
        R4bString.of(
          this@NutritionOrderOralDietSurrogate.instruction,
          this@NutritionOrderOralDietSurrogate._instruction,
        )
    }

  public companion object {
    public fun fromModel(model: NutritionOrder.OralDiet): NutritionOrderOralDietSurrogate =
      with(model) {
        NutritionOrderOralDietSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          schedule = this@with.schedule
          nutrient = this@with.nutrient
          texture = this@with.texture
          fluidConsistencyType = this@with.fluidConsistencyType
          instruction = this@with.instruction?.value
          _instruction = this@with.instruction?.toElement()
        }
      }
  }
}

@Serializable
internal data class NutritionOrderSupplementSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var schedule: List<Timing?>? = null,
  public var quantity: Quantity? = null,
  public var instruction: KotlinString? = null,
  public var _instruction: Element? = null,
) {
  public fun toModel(): NutritionOrder.Supplement =
    NutritionOrder.Supplement().apply {
      id = this@NutritionOrderSupplementSurrogate.id
      extension = this@NutritionOrderSupplementSurrogate.extension
      modifierExtension = this@NutritionOrderSupplementSurrogate.modifierExtension
      type = this@NutritionOrderSupplementSurrogate.type
      productName =
        R4bString.of(
          this@NutritionOrderSupplementSurrogate.productName,
          this@NutritionOrderSupplementSurrogate._productName,
        )
      schedule = this@NutritionOrderSupplementSurrogate.schedule
      quantity = this@NutritionOrderSupplementSurrogate.quantity
      instruction =
        R4bString.of(
          this@NutritionOrderSupplementSurrogate.instruction,
          this@NutritionOrderSupplementSurrogate._instruction,
        )
    }

  public companion object {
    public fun fromModel(model: NutritionOrder.Supplement): NutritionOrderSupplementSurrogate =
      with(model) {
        NutritionOrderSupplementSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          productName = this@with.productName?.value
          _productName = this@with.productName?.toElement()
          schedule = this@with.schedule
          quantity = this@with.quantity
          instruction = this@with.instruction?.value
          _instruction = this@with.instruction?.toElement()
        }
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaAdministrationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var schedule: Timing? = null,
  public var quantity: Quantity? = null,
  public var rateQuantity: Quantity? = null,
  public var rateRatio: Ratio? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula.Administration =
    NutritionOrder.EnteralFormula.Administration().apply {
      id = this@NutritionOrderEnteralFormulaAdministrationSurrogate.id
      extension = this@NutritionOrderEnteralFormulaAdministrationSurrogate.extension
      modifierExtension = this@NutritionOrderEnteralFormulaAdministrationSurrogate.modifierExtension
      schedule = this@NutritionOrderEnteralFormulaAdministrationSurrogate.schedule
      quantity = this@NutritionOrderEnteralFormulaAdministrationSurrogate.quantity
      rate =
        NutritionOrder.EnteralFormula.Administration.Rate?.from(
          this@NutritionOrderEnteralFormulaAdministrationSurrogate.rateQuantity,
          this@NutritionOrderEnteralFormulaAdministrationSurrogate.rateRatio,
        )
    }

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula.Administration
    ): NutritionOrderEnteralFormulaAdministrationSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaAdministrationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          schedule = this@with.schedule
          quantity = this@with.quantity
          rateQuantity = this@with.rate?.asQuantity()?.value
          rateRatio = this@with.rate?.asRatio()?.value
        }
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var baseFormulaType: CodeableConcept? = null,
  public var baseFormulaProductName: KotlinString? = null,
  public var _baseFormulaProductName: Element? = null,
  public var additiveType: CodeableConcept? = null,
  public var additiveProductName: KotlinString? = null,
  public var _additiveProductName: Element? = null,
  public var caloricDensity: Quantity? = null,
  public var routeofAdministration: CodeableConcept? = null,
  public var administration: List<NutritionOrder.EnteralFormula.Administration>? = null,
  public var maxVolumeToDeliver: Quantity? = null,
  public var administrationInstruction: KotlinString? = null,
  public var _administrationInstruction: Element? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula =
    NutritionOrder.EnteralFormula().apply {
      id = this@NutritionOrderEnteralFormulaSurrogate.id
      extension = this@NutritionOrderEnteralFormulaSurrogate.extension
      modifierExtension = this@NutritionOrderEnteralFormulaSurrogate.modifierExtension
      baseFormulaType = this@NutritionOrderEnteralFormulaSurrogate.baseFormulaType
      baseFormulaProductName =
        R4bString.of(
          this@NutritionOrderEnteralFormulaSurrogate.baseFormulaProductName,
          this@NutritionOrderEnteralFormulaSurrogate._baseFormulaProductName,
        )
      additiveType = this@NutritionOrderEnteralFormulaSurrogate.additiveType
      additiveProductName =
        R4bString.of(
          this@NutritionOrderEnteralFormulaSurrogate.additiveProductName,
          this@NutritionOrderEnteralFormulaSurrogate._additiveProductName,
        )
      caloricDensity = this@NutritionOrderEnteralFormulaSurrogate.caloricDensity
      routeofAdministration = this@NutritionOrderEnteralFormulaSurrogate.routeofAdministration
      administration = this@NutritionOrderEnteralFormulaSurrogate.administration
      maxVolumeToDeliver = this@NutritionOrderEnteralFormulaSurrogate.maxVolumeToDeliver
      administrationInstruction =
        R4bString.of(
          this@NutritionOrderEnteralFormulaSurrogate.administrationInstruction,
          this@NutritionOrderEnteralFormulaSurrogate._administrationInstruction,
        )
    }

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula
    ): NutritionOrderEnteralFormulaSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          baseFormulaType = this@with.baseFormulaType
          baseFormulaProductName = this@with.baseFormulaProductName?.value
          _baseFormulaProductName = this@with.baseFormulaProductName?.toElement()
          additiveType = this@with.additiveType
          additiveProductName = this@with.additiveProductName?.value
          _additiveProductName = this@with.additiveProductName?.toElement()
          caloricDensity = this@with.caloricDensity
          routeofAdministration = this@with.routeofAdministration
          administration = this@with.administration
          maxVolumeToDeliver = this@with.maxVolumeToDeliver
          administrationInstruction = this@with.administrationInstruction?.value
          _administrationInstruction = this@with.administrationInstruction?.toElement()
        }
      }
  }
}

@Serializable
internal data class NutritionOrderSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var instantiates: List<KotlinString?>? = null,
  public var _instantiates: List<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var patient: Reference? = null,
  public var encounter: Reference? = null,
  public var dateTime: KotlinString? = null,
  public var _dateTime: Element? = null,
  public var orderer: Reference? = null,
  public var allergyIntolerance: List<Reference?>? = null,
  public var foodPreferenceModifier: List<CodeableConcept?>? = null,
  public var excludeFoodModifier: List<CodeableConcept?>? = null,
  public var oralDiet: NutritionOrder.OralDiet? = null,
  public var supplement: List<NutritionOrder.Supplement>? = null,
  public var enteralFormula: NutritionOrder.EnteralFormula? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): NutritionOrder =
    NutritionOrder().apply {
      id = this@NutritionOrderSurrogate.id
      meta = this@NutritionOrderSurrogate.meta
      implicitRules =
        Uri.of(
          this@NutritionOrderSurrogate.implicitRules,
          this@NutritionOrderSurrogate._implicitRules,
        )
      language =
        Code.of(this@NutritionOrderSurrogate.language, this@NutritionOrderSurrogate._language)
      text = this@NutritionOrderSurrogate.text
      contained = this@NutritionOrderSurrogate.contained
      extension = this@NutritionOrderSurrogate.extension
      modifierExtension = this@NutritionOrderSurrogate.modifierExtension
      identifier = this@NutritionOrderSurrogate.identifier
      instantiatesCanonical =
        if (
          this@NutritionOrderSurrogate.instantiatesCanonical == null &&
            this@NutritionOrderSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@NutritionOrderSurrogate.instantiatesCanonical
              ?: List(this@NutritionOrderSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@NutritionOrderSurrogate._instantiatesCanonical
                ?: List(this@NutritionOrderSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@NutritionOrderSurrogate.instantiatesUri == null &&
            this@NutritionOrderSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@NutritionOrderSurrogate.instantiatesUri
              ?: List(this@NutritionOrderSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@NutritionOrderSurrogate._instantiatesUri
                ?: List(this@NutritionOrderSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      instantiates =
        if (
          this@NutritionOrderSurrogate.instantiates == null &&
            this@NutritionOrderSurrogate._instantiates == null
        ) {
          null
        } else {
          (this@NutritionOrderSurrogate.instantiates
              ?: List(this@NutritionOrderSurrogate._instantiates!!.size) { null })
            .zip(
              this@NutritionOrderSurrogate._instantiates
                ?: List(this@NutritionOrderSurrogate.instantiates!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      status =
        Enumeration.of(
          this@NutritionOrderSurrogate.status?.let {
            com.google.fhir.model.r4b.NutritionOrder.NutritionOrderStatus.fromCode(it)
          },
          this@NutritionOrderSurrogate._status,
        )
      intent =
        Enumeration.of(
          this@NutritionOrderSurrogate.intent?.let {
            com.google.fhir.model.r4b.NutritionOrder.NutritiionOrderIntent.fromCode(it)
          },
          this@NutritionOrderSurrogate._intent,
        )
      patient = this@NutritionOrderSurrogate.patient
      encounter = this@NutritionOrderSurrogate.encounter
      dateTime =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionOrderSurrogate.dateTime),
          this@NutritionOrderSurrogate._dateTime,
        )
      orderer = this@NutritionOrderSurrogate.orderer
      allergyIntolerance = this@NutritionOrderSurrogate.allergyIntolerance
      foodPreferenceModifier = this@NutritionOrderSurrogate.foodPreferenceModifier
      excludeFoodModifier = this@NutritionOrderSurrogate.excludeFoodModifier
      oralDiet = this@NutritionOrderSurrogate.oralDiet
      supplement = this@NutritionOrderSurrogate.supplement
      enteralFormula = this@NutritionOrderSurrogate.enteralFormula
      note = this@NutritionOrderSurrogate.note
    }

  public companion object {
    public fun fromModel(model: NutritionOrder): NutritionOrderSurrogate =
      with(model) {
        NutritionOrderSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          instantiatesCanonical =
            this@with.instantiatesCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          instantiatesUri =
            this@with.instantiatesUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesUri =
            this@with.instantiatesUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          instantiates =
            this@with.instantiates?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiates =
            this@with.instantiates?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          patient = this@with.patient
          encounter = this@with.encounter
          dateTime = this@with.dateTime?.value?.toString()
          _dateTime = this@with.dateTime?.toElement()
          orderer = this@with.orderer
          allergyIntolerance = this@with.allergyIntolerance
          foodPreferenceModifier = this@with.foodPreferenceModifier
          excludeFoodModifier = this@with.excludeFoodModifier
          oralDiet = this@with.oralDiet
          supplement = this@with.supplement
          enteralFormula = this@with.enteralFormula
          note = this@with.note
        }
      }
  }
}
