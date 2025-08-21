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

package com.google.fhir.model.r5.surrogates

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.NutritionOrder
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class NutritionOrderOralDietScheduleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var timing: MutableList<Timing>? = null,
  public var asNeeded: KotlinBoolean? = null,
  public var _asNeeded: Element? = null,
  public var asNeededFor: CodeableConcept? = null,
) {
  public fun toModel(): NutritionOrder.OralDiet.Schedule =
    NutritionOrder.OralDiet.Schedule(
      id = this@NutritionOrderOralDietScheduleSurrogate.id,
      extension = this@NutritionOrderOralDietScheduleSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderOralDietScheduleSurrogate.modifierExtension ?: mutableListOf(),
      timing = this@NutritionOrderOralDietScheduleSurrogate.timing ?: mutableListOf(),
      asNeeded =
        R5Boolean.of(
          this@NutritionOrderOralDietScheduleSurrogate.asNeeded,
          this@NutritionOrderOralDietScheduleSurrogate._asNeeded,
        ),
      asNeededFor = this@NutritionOrderOralDietScheduleSurrogate.asNeededFor,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.OralDiet.Schedule
    ): NutritionOrderOralDietScheduleSurrogate =
      with(model) {
        NutritionOrderOralDietScheduleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          timing = this@with.timing.takeUnless { it.all { it == null } },
          asNeeded = this@with.asNeeded?.value,
          _asNeeded = this@with.asNeeded?.toElement(),
          asNeededFor = this@with.asNeededFor,
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
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
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
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          modifier = this@with.modifier,
          foodType = this@with.foodType,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderOralDietSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var schedule: NutritionOrder.OralDiet.Schedule? = null,
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
      schedule = this@NutritionOrderOralDietSurrogate.schedule,
      nutrient = this@NutritionOrderOralDietSurrogate.nutrient ?: mutableListOf(),
      texture = this@NutritionOrderOralDietSurrogate.texture ?: mutableListOf(),
      fluidConsistencyType =
        this@NutritionOrderOralDietSurrogate.fluidConsistencyType ?: mutableListOf(),
      instruction =
        R5String.of(
          this@NutritionOrderOralDietSurrogate.instruction,
          this@NutritionOrderOralDietSurrogate._instruction,
        ),
    )

  public companion object {
    public fun fromModel(model: NutritionOrder.OralDiet): NutritionOrderOralDietSurrogate =
      with(model) {
        NutritionOrderOralDietSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.takeUnless { it.all { it == null } },
          schedule = this@with.schedule,
          nutrient = this@with.nutrient.takeUnless { it.all { it == null } },
          texture = this@with.texture.takeUnless { it.all { it == null } },
          fluidConsistencyType =
            this@with.fluidConsistencyType.takeUnless { it.all { it == null } },
          instruction = this@with.instruction?.value,
          _instruction = this@with.instruction?.toElement(),
        )
      }
  }
}

@Serializable
internal data class NutritionOrderSupplementScheduleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var timing: MutableList<Timing>? = null,
  public var asNeeded: KotlinBoolean? = null,
  public var _asNeeded: Element? = null,
  public var asNeededFor: CodeableConcept? = null,
) {
  public fun toModel(): NutritionOrder.Supplement.Schedule =
    NutritionOrder.Supplement.Schedule(
      id = this@NutritionOrderSupplementScheduleSurrogate.id,
      extension = this@NutritionOrderSupplementScheduleSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderSupplementScheduleSurrogate.modifierExtension ?: mutableListOf(),
      timing = this@NutritionOrderSupplementScheduleSurrogate.timing ?: mutableListOf(),
      asNeeded =
        R5Boolean.of(
          this@NutritionOrderSupplementScheduleSurrogate.asNeeded,
          this@NutritionOrderSupplementScheduleSurrogate._asNeeded,
        ),
      asNeededFor = this@NutritionOrderSupplementScheduleSurrogate.asNeededFor,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.Supplement.Schedule
    ): NutritionOrderSupplementScheduleSurrogate =
      with(model) {
        NutritionOrderSupplementScheduleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          timing = this@with.timing.takeUnless { it.all { it == null } },
          asNeeded = this@with.asNeeded?.value,
          _asNeeded = this@with.asNeeded?.toElement(),
          asNeededFor = this@with.asNeededFor,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderSupplementSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableReference? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var schedule: NutritionOrder.Supplement.Schedule? = null,
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
        R5String.of(
          this@NutritionOrderSupplementSurrogate.productName,
          this@NutritionOrderSupplementSurrogate._productName,
        ),
      schedule = this@NutritionOrderSupplementSurrogate.schedule,
      quantity = this@NutritionOrderSupplementSurrogate.quantity,
      instruction =
        R5String.of(
          this@NutritionOrderSupplementSurrogate.instruction,
          this@NutritionOrderSupplementSurrogate._instruction,
        ),
    )

  public companion object {
    public fun fromModel(model: NutritionOrder.Supplement): NutritionOrderSupplementSurrogate =
      with(model) {
        NutritionOrderSupplementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          productName = this@with.productName?.value,
          _productName = this@with.productName?.toElement(),
          schedule = this@with.schedule,
          quantity = this@with.quantity,
          instruction = this@with.instruction?.value,
          _instruction = this@with.instruction?.toElement(),
        )
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaAdditiveSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableReference? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var quantity: Quantity? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula.Additive =
    NutritionOrder.EnteralFormula.Additive(
      id = this@NutritionOrderEnteralFormulaAdditiveSurrogate.id,
      extension = this@NutritionOrderEnteralFormulaAdditiveSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderEnteralFormulaAdditiveSurrogate.modifierExtension ?: mutableListOf(),
      type = this@NutritionOrderEnteralFormulaAdditiveSurrogate.type,
      productName =
        R5String.of(
          this@NutritionOrderEnteralFormulaAdditiveSurrogate.productName,
          this@NutritionOrderEnteralFormulaAdditiveSurrogate._productName,
        ),
      quantity = this@NutritionOrderEnteralFormulaAdditiveSurrogate.quantity,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula.Additive
    ): NutritionOrderEnteralFormulaAdditiveSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaAdditiveSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          productName = this@with.productName?.value,
          _productName = this@with.productName?.toElement(),
          quantity = this@with.quantity,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaAdministrationScheduleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var timing: MutableList<Timing>? = null,
  public var asNeeded: KotlinBoolean? = null,
  public var _asNeeded: Element? = null,
  public var asNeededFor: CodeableConcept? = null,
) {
  public fun toModel(): NutritionOrder.EnteralFormula.Administration.Schedule =
    NutritionOrder.EnteralFormula.Administration.Schedule(
      id = this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate.id,
      extension =
        this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate.modifierExtension
          ?: mutableListOf(),
      timing =
        this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate.timing ?: mutableListOf(),
      asNeeded =
        R5Boolean.of(
          this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate.asNeeded,
          this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate._asNeeded,
        ),
      asNeededFor = this@NutritionOrderEnteralFormulaAdministrationScheduleSurrogate.asNeededFor,
    )

  public companion object {
    public fun fromModel(
      model: NutritionOrder.EnteralFormula.Administration.Schedule
    ): NutritionOrderEnteralFormulaAdministrationScheduleSurrogate =
      with(model) {
        NutritionOrderEnteralFormulaAdministrationScheduleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          timing = this@with.timing.takeUnless { it.all { it == null } },
          asNeeded = this@with.asNeeded?.value,
          _asNeeded = this@with.asNeeded?.toElement(),
          asNeededFor = this@with.asNeededFor,
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
    NutritionOrder.EnteralFormula.Administration.Rate?.from(
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
internal data class NutritionOrderEnteralFormulaAdministrationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var schedule: NutritionOrder.EnteralFormula.Administration.Schedule? = null,
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
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          schedule = this@with.schedule,
          quantity = this@with.quantity,
          rate = this@with.rate,
        )
      }
  }
}

@Serializable
internal data class NutritionOrderEnteralFormulaSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var baseFormulaType: CodeableReference? = null,
  public var baseFormulaProductName: KotlinString? = null,
  public var _baseFormulaProductName: Element? = null,
  public var deliveryDevice: MutableList<CodeableReference>? = null,
  public var additive: MutableList<NutritionOrder.EnteralFormula.Additive>? = null,
  public var caloricDensity: Quantity? = null,
  public var routeOfAdministration: CodeableConcept? = null,
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
        R5String.of(
          this@NutritionOrderEnteralFormulaSurrogate.baseFormulaProductName,
          this@NutritionOrderEnteralFormulaSurrogate._baseFormulaProductName,
        ),
      deliveryDevice = this@NutritionOrderEnteralFormulaSurrogate.deliveryDevice ?: mutableListOf(),
      additive = this@NutritionOrderEnteralFormulaSurrogate.additive ?: mutableListOf(),
      caloricDensity = this@NutritionOrderEnteralFormulaSurrogate.caloricDensity,
      routeOfAdministration = this@NutritionOrderEnteralFormulaSurrogate.routeOfAdministration,
      administration = this@NutritionOrderEnteralFormulaSurrogate.administration ?: mutableListOf(),
      maxVolumeToDeliver = this@NutritionOrderEnteralFormulaSurrogate.maxVolumeToDeliver,
      administrationInstruction =
        Markdown.of(
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
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          baseFormulaType = this@with.baseFormulaType,
          baseFormulaProductName = this@with.baseFormulaProductName?.value,
          _baseFormulaProductName = this@with.baseFormulaProductName?.toElement(),
          deliveryDevice = this@with.deliveryDevice.takeUnless { it.all { it == null } },
          additive = this@with.additive.takeUnless { it.all { it == null } },
          caloricDensity = this@with.caloricDensity,
          routeOfAdministration = this@with.routeOfAdministration,
          administration = this@with.administration.takeUnless { it.all { it == null } },
          maxVolumeToDeliver = this@with.maxVolumeToDeliver,
          administrationInstruction = this@with.administrationInstruction?.value,
          _administrationInstruction = this@with.administrationInstruction?.toElement(),
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
  public var basedOn: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var dateTime: KotlinString? = null,
  public var _dateTime: Element? = null,
  public var orderer: Reference? = null,
  public var performer: MutableList<CodeableReference>? = null,
  public var allergyIntolerance: MutableList<Reference>? = null,
  public var foodPreferenceModifier: MutableList<CodeableConcept>? = null,
  public var excludeFoodModifier: MutableList<CodeableConcept>? = null,
  public var outsideFoodAllowed: KotlinBoolean? = null,
  public var _outsideFoodAllowed: Element? = null,
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
      basedOn = this@NutritionOrderSurrogate.basedOn ?: mutableListOf(),
      groupIdentifier = this@NutritionOrderSurrogate.groupIdentifier,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.NutritionOrder.RequestStatus.fromCode(
            this@NutritionOrderSurrogate.status!!
          ),
          this@NutritionOrderSurrogate._status,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.NutritionOrder.RequestIntent.fromCode(
            this@NutritionOrderSurrogate.intent!!
          ),
          this@NutritionOrderSurrogate._intent,
        ),
      priority =
        this@NutritionOrderSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.NutritionOrder.RequestPriority.fromCode(it!!),
            this@NutritionOrderSurrogate._priority,
          )
        },
      subject = this@NutritionOrderSurrogate.subject,
      encounter = this@NutritionOrderSurrogate.encounter,
      supportingInformation = this@NutritionOrderSurrogate.supportingInformation ?: mutableListOf(),
      dateTime =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionOrderSurrogate.dateTime),
          this@NutritionOrderSurrogate._dateTime,
        )!!,
      orderer = this@NutritionOrderSurrogate.orderer,
      performer = this@NutritionOrderSurrogate.performer ?: mutableListOf(),
      allergyIntolerance = this@NutritionOrderSurrogate.allergyIntolerance ?: mutableListOf(),
      foodPreferenceModifier =
        this@NutritionOrderSurrogate.foodPreferenceModifier ?: mutableListOf(),
      excludeFoodModifier = this@NutritionOrderSurrogate.excludeFoodModifier ?: mutableListOf(),
      outsideFoodAllowed =
        R5Boolean.of(
          this@NutritionOrderSurrogate.outsideFoodAllowed,
          this@NutritionOrderSurrogate._outsideFoodAllowed,
        ),
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
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          groupIdentifier = this@with.groupIdentifier,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          dateTime = this@with.dateTime.value?.toString(),
          _dateTime = this@with.dateTime.toElement(),
          orderer = this@with.orderer,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          allergyIntolerance = this@with.allergyIntolerance.takeUnless { it.all { it == null } },
          foodPreferenceModifier =
            this@with.foodPreferenceModifier.takeUnless { it.all { it == null } },
          excludeFoodModifier = this@with.excludeFoodModifier.takeUnless { it.all { it == null } },
          outsideFoodAllowed = this@with.outsideFoodAllowed?.value,
          _outsideFoodAllowed = this@with.outsideFoodAllowed?.toElement(),
          oralDiet = this@with.oralDiet,
          supplement = this@with.supplement.takeUnless { it.all { it == null } },
          enteralFormula = this@with.enteralFormula,
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
