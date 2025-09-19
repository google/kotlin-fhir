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

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.NutritionOrder
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class NutritionOrderOralDietSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var schedule: MutableList<Timing>? = null,
  public var nutrient: MutableList<NutritionOrder.OralDiet.Nutrient>? = null,
  public var texture: MutableList<NutritionOrder.OralDiet.Texture>? = null,
  public var fluidConsistencyType: MutableList<CodeableConcept>? = null,
  public var instruction: KotlinString? = null,
  public var _instruction: Element? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet =
    NutritionOrder.OralDiet(
      id = this@NutritionOrderOralDietSurrogate.id,
      extension = this@NutritionOrderOralDietSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@NutritionOrderOralDietSurrogate.modifierExtension ?: mutableListOf(),
      type = this@NutritionOrderOralDietSurrogate.type ?: mutableListOf(),
      schedule = this@NutritionOrderOralDietSurrogate.schedule ?: mutableListOf(),
      nutrient = this@NutritionOrderOralDietSurrogate.nutrient ?: mutableListOf(),
      texture = this@NutritionOrderOralDietSurrogate.texture ?: mutableListOf(),
      fluidConsistencyType =
        this@NutritionOrderOralDietSurrogate.fluidConsistencyType ?: mutableListOf(),
      instruction =
        R4String.of(
          this@NutritionOrderOralDietSurrogate.instruction,
          this@NutritionOrderOralDietSurrogate._instruction,
        ),
    )

  public companion object {
    public fun fromModel(model: NutritionOrder.OralDiet): NutritionOrderOralDietSurrogate =
      with(model) {
        NutritionOrderOralDietSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          type = this@with.type.takeIf { it.isNotEmpty() },
          schedule = this@with.schedule.takeIf { it.isNotEmpty() },
          nutrient = this@with.nutrient.takeIf { it.isNotEmpty() },
          texture = this@with.texture.takeIf { it.isNotEmpty() },
          fluidConsistencyType = this@with.fluidConsistencyType.takeIf { it.isNotEmpty() },
          instruction = this@with.instruction?.value,
          _instruction = this@with.instruction?.toElement(),
        )
      }
  }
}

@Serializable
internal data class NutritionOrderOralDietNutrientSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var modifier: CodeableConcept? = null,
  public var amount: Quantity? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet.Nutrient =
    NutritionOrder.OralDiet.Nutrient(
      id = this@NutritionOrderOralDietNutrientSurrogate.id,
      extension = this@NutritionOrderOralDietNutrientSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderOralDietNutrientSurrogate.modifierExtension ?: mutableListOf(),
      modifier = this@NutritionOrderOralDietNutrientSurrogate.modifier,
      amount = this@NutritionOrderOralDietNutrientSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.OralDiet.Nutrient
    ): NutritionOrderOralDietNutrientSurrogate =
      with(model) {
        NutritionOrderOralDietNutrientSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          modifier = this@with.modifier,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderOralDietTextureSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var modifier: CodeableConcept? = null,
  public var foodType: CodeableConcept? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet.Texture =
    NutritionOrder.OralDiet.Texture(
      id = this@NutritionOrderOralDietTextureSurrogate.id,
      extension = this@NutritionOrderOralDietTextureSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderOralDietTextureSurrogate.modifierExtension ?: mutableListOf(),
      modifier = this@NutritionOrderOralDietTextureSurrogate.modifier,
      foodType = this@NutritionOrderOralDietTextureSurrogate.foodType,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.OralDiet.Texture
    ): NutritionOrderOralDietTextureSurrogate =
      with(model) {
        NutritionOrderOralDietTextureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          modifier = this@with.modifier,
          foodType = this@with.foodType,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderSupplementSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var schedule: MutableList<Timing>? = null,
  public var quantity: Quantity? = null,
  public var instruction: KotlinString? = null,
  public var _instruction: Element? = null,
) {
  public fun toModel(): NutritionOrder.Supplement =
    NutritionOrder.Supplement(
      id = this@NutritionOrderSupplementSurrogate.id,
      extension = this@NutritionOrderSupplementSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderSupplementSurrogate.modifierExtension ?: mutableListOf(),
      type = this@NutritionOrderSupplementSurrogate.type,
      productName =
        R4String.of(
          this@NutritionOrderSupplementSurrogate.productName,
          this@NutritionOrderSupplementSurrogate._productName,
        ),
      schedule = this@NutritionOrderSupplementSurrogate.schedule ?: mutableListOf(),
      quantity = this@NutritionOrderSupplementSurrogate.quantity,
      instruction =
        R4String.of(
          this@NutritionOrderSupplementSurrogate.instruction,
          this@NutritionOrderSupplementSurrogate._instruction,
        ),
    )

  public companion object {
    public fun fromModel(model: NutritionOrder.Supplement): NutritionOrderSupplementSurrogate =
      with(model) {
        NutritionOrderSupplementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          type = this@with.type,
          productName = this@with.productName?.value,
          _productName = this@with.productName?.toElement(),
          schedule = this@with.schedule.takeIf { it.isNotEmpty() },
          quantity = this@with.quantity,
          instruction = this@with.instruction?.value,
          _instruction = this@with.instruction?.toElement(),
        )
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var baseFormulaType: CodeableConcept? = null,
  public var baseFormulaProductName: KotlinString? = null,
  public var _baseFormulaProductName: Element? = null,
  public var additiveType: CodeableConcept? = null,
  public var additiveProductName: KotlinString? = null,
  public var _additiveProductName: Element? = null,
  public var caloricDensity: Quantity? = null,
  public var routeofAdministration: CodeableConcept? = null,
  public var administration: MutableList<NutritionOrder.EnteralFormula.Administration>? = null,
  public var maxVolumeToDeliver: Quantity? = null,
  public var administrationInstruction: KotlinString? = null,
  public var _administrationInstruction: Element? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula =
    NutritionOrder.EnteralFormula(
      id = this@NutritionOrderEnteralFormulaSurrogate.id,
      extension = this@NutritionOrderEnteralFormulaSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderEnteralFormulaSurrogate.modifierExtension ?: mutableListOf(),
      baseFormulaType = this@NutritionOrderEnteralFormulaSurrogate.baseFormulaType,
      baseFormulaProductName =
        R4String.of(
          this@NutritionOrderEnteralFormulaSurrogate.baseFormulaProductName,
          this@NutritionOrderEnteralFormulaSurrogate._baseFormulaProductName,
        ),
      additiveType = this@NutritionOrderEnteralFormulaSurrogate.additiveType,
      additiveProductName =
        R4String.of(
          this@NutritionOrderEnteralFormulaSurrogate.additiveProductName,
          this@NutritionOrderEnteralFormulaSurrogate._additiveProductName,
        ),
      caloricDensity = this@NutritionOrderEnteralFormulaSurrogate.caloricDensity,
      routeofAdministration = this@NutritionOrderEnteralFormulaSurrogate.routeofAdministration,
      administration = this@NutritionOrderEnteralFormulaSurrogate.administration ?: mutableListOf(),
      maxVolumeToDeliver = this@NutritionOrderEnteralFormulaSurrogate.maxVolumeToDeliver,
      administrationInstruction =
        R4String.of(
          this@NutritionOrderEnteralFormulaSurrogate.administrationInstruction,
          this@NutritionOrderEnteralFormulaSurrogate._administrationInstruction,
        ),
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula
    ): NutritionOrderEnteralFormulaSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          baseFormulaType = this@with.baseFormulaType,
          baseFormulaProductName = this@with.baseFormulaProductName?.value,
          _baseFormulaProductName = this@with.baseFormulaProductName?.toElement(),
          additiveType = this@with.additiveType,
          additiveProductName = this@with.additiveProductName?.value,
          _additiveProductName = this@with.additiveProductName?.toElement(),
          caloricDensity = this@with.caloricDensity,
          routeofAdministration = this@with.routeofAdministration,
          administration = this@with.administration.takeIf { it.isNotEmpty() },
          maxVolumeToDeliver = this@with.maxVolumeToDeliver,
          administrationInstruction = this@with.administrationInstruction?.value,
          _administrationInstruction = this@with.administrationInstruction?.toElement(),
        )
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaAdministrationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var schedule: Timing? = null,
  public var quantity: Quantity? = null,
  public var rate: NutritionOrder.EnteralFormula.Administration.Rate? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula.Administration =
    NutritionOrder.EnteralFormula.Administration(
      id = this@NutritionOrderEnteralFormulaAdministrationSurrogate.id,
      extension =
        this@NutritionOrderEnteralFormulaAdministrationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderEnteralFormulaAdministrationSurrogate.modifierExtension
          ?: mutableListOf(),
      schedule = this@NutritionOrderEnteralFormulaAdministrationSurrogate.schedule,
      quantity = this@NutritionOrderEnteralFormulaAdministrationSurrogate.quantity,
      rate = this@NutritionOrderEnteralFormulaAdministrationSurrogate.rate,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula.Administration
    ): NutritionOrderEnteralFormulaAdministrationSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaAdministrationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          schedule = this@with.schedule,
          quantity = this@with.quantity,
          rate = this@with.rate,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaAdministrationRateSurrogate(
  public var rateQuantity: Quantity? = null,
  public var rateRatio: Ratio? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula.Administration.Rate =
    NutritionOrder.EnteralFormula.Administration.Rate.from(
      this@NutritionOrderEnteralFormulaAdministrationRateSurrogate.rateQuantity,
      this@NutritionOrderEnteralFormulaAdministrationRateSurrogate.rateRatio,
    )!!

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula.Administration.Rate
    ): NutritionOrderEnteralFormulaAdministrationRateSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaAdministrationRateSurrogate(
          rateQuantity = this@with.asQuantity()?.value,
          rateRatio = this@with.asRatio()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var instantiates: MutableList<KotlinString?>? = null,
  public var _instantiates: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var patient: Reference,
  public var encounter: Reference? = null,
  public var dateTime: KotlinString? = null,
  public var _dateTime: Element? = null,
  public var orderer: Reference? = null,
  public var allergyIntolerance: MutableList<Reference>? = null,
  public var foodPreferenceModifier: MutableList<CodeableConcept>? = null,
  public var excludeFoodModifier: MutableList<CodeableConcept>? = null,
  public var oralDiet: NutritionOrder.OralDiet? = null,
  public var supplement: MutableList<NutritionOrder.Supplement>? = null,
  public var enteralFormula: NutritionOrder.EnteralFormula? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): NutritionOrder =
    NutritionOrder(
      id = this@NutritionOrderSurrogate.id,
      meta = this@NutritionOrderSurrogate.meta,
      implicitRules =
        Uri.of(
          this@NutritionOrderSurrogate.implicitRules,
          this@NutritionOrderSurrogate._implicitRules,
        ),
      language =
        Code.of(this@NutritionOrderSurrogate.language, this@NutritionOrderSurrogate._language),
      text = this@NutritionOrderSurrogate.text,
      contained = this@NutritionOrderSurrogate.contained ?: mutableListOf(),
      extension = this@NutritionOrderSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@NutritionOrderSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@NutritionOrderSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@NutritionOrderSurrogate.instantiatesCanonical == null &&
            this@NutritionOrderSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@NutritionOrderSurrogate.instantiatesCanonical
              ?: List(this@NutritionOrderSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@NutritionOrderSurrogate._instantiatesCanonical
                ?: List(this@NutritionOrderSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@NutritionOrderSurrogate.instantiatesUri == null &&
            this@NutritionOrderSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@NutritionOrderSurrogate.instantiatesUri
              ?: List(this@NutritionOrderSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@NutritionOrderSurrogate._instantiatesUri
                ?: List(this@NutritionOrderSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      instantiates =
        if (
          this@NutritionOrderSurrogate.instantiates == null &&
            this@NutritionOrderSurrogate._instantiates == null
        ) {
          mutableListOf()
        } else {
          (this@NutritionOrderSurrogate.instantiates
              ?: List(this@NutritionOrderSurrogate._instantiates!!.size) { null })
            .zip(
              this@NutritionOrderSurrogate._instantiates
                ?: List(this@NutritionOrderSurrogate.instantiates!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          NutritionOrder.RequestStatus.fromCode(this@NutritionOrderSurrogate.status!!),
          this@NutritionOrderSurrogate._status,
        ),
      intent =
        Enumeration.of(
          NutritionOrder.RequestIntent.fromCode(this@NutritionOrderSurrogate.intent!!),
          this@NutritionOrderSurrogate._intent,
        ),
      patient = this@NutritionOrderSurrogate.patient,
      encounter = this@NutritionOrderSurrogate.encounter,
      dateTime =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionOrderSurrogate.dateTime),
          this@NutritionOrderSurrogate._dateTime,
        )!!,
      orderer = this@NutritionOrderSurrogate.orderer,
      allergyIntolerance = this@NutritionOrderSurrogate.allergyIntolerance ?: mutableListOf(),
      foodPreferenceModifier =
        this@NutritionOrderSurrogate.foodPreferenceModifier ?: mutableListOf(),
      excludeFoodModifier = this@NutritionOrderSurrogate.excludeFoodModifier ?: mutableListOf(),
      oralDiet = this@NutritionOrderSurrogate.oralDiet,
      supplement = this@NutritionOrderSurrogate.supplement ?: mutableListOf(),
      enteralFormula = this@NutritionOrderSurrogate.enteralFormula,
      note = this@NutritionOrderSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: NutritionOrder): NutritionOrderSurrogate =
      with(model) {
        NutritionOrderSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiates =
            this@with.instantiates
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiates =
            this@with.instantiates
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          patient = this@with.patient,
          encounter = this@with.encounter,
          dateTime = this@with.dateTime.value?.toString(),
          _dateTime = this@with.dateTime.toElement(),
          orderer = this@with.orderer,
          allergyIntolerance = this@with.allergyIntolerance.takeIf { it.isNotEmpty() },
          foodPreferenceModifier = this@with.foodPreferenceModifier.takeIf { it.isNotEmpty() },
          excludeFoodModifier = this@with.excludeFoodModifier.takeIf { it.isNotEmpty() },
          oralDiet = this@with.oralDiet,
          supplement = this@with.supplement.takeIf { it.isNotEmpty() },
          enteralFormula = this@with.enteralFormula,
          note = this@with.note.takeIf { it.isNotEmpty() },
        )
      }
  }
}
