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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.CodeableReference
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Ingredient
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.RatioRange
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class IngredientManufacturerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: KotlinString? = null,
  public var _role: Element? = null,
  public var manufacturer: Reference,
) {
  public fun toModel(): Ingredient.Manufacturer =
    Ingredient.Manufacturer(
      id = this@IngredientManufacturerSurrogate.id,
      extension = this@IngredientManufacturerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@IngredientManufacturerSurrogate.modifierExtension ?: mutableListOf(),
      role =
        this@IngredientManufacturerSurrogate.role?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.Ingredient.IngredientManufacturerRole.fromCode(it!!),
            this@IngredientManufacturerSurrogate._role,
          )
        },
      manufacturer = this@IngredientManufacturerSurrogate.manufacturer,
    )

  public companion object {
    public fun fromModel(model: Ingredient.Manufacturer): IngredientManufacturerSurrogate =
      with(model) {
        IngredientManufacturerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role?.value?.getCode(),
          _role = this@with.role?.toElement(),
          manufacturer = this@with.manufacturer,
        )
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate(
  public var strengthRatio: Ratio? = null,
  public var strengthRatioRange: RatioRange? = null,
) {
  public fun toModel(): Ingredient.Substance.Strength.ReferenceStrength.Strength =
    Ingredient.Substance.Strength.ReferenceStrength.Strength.from(
      this@IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate.strengthRatio,
      this@IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate.strengthRatioRange,
    )!! !!

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength.ReferenceStrength.Strength
    ): IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate =
      with(model) {
        IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate(
          strengthRatio = this@with.asRatio()?.value,
          strengthRatioRange = this@with.asRatioRange()?.value,
        )
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthReferenceStrengthSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var substance: CodeableReference? = null,
  public var measurementPoint: KotlinString? = null,
  public var _measurementPoint: Element? = null,
  public var country: MutableList<CodeableConcept>? = null,
  public var strength: Ingredient.Substance.Strength.ReferenceStrength.Strength,
) {
  public fun toModel(): Ingredient.Substance.Strength.ReferenceStrength =
    Ingredient.Substance.Strength.ReferenceStrength(
      id = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.id,
      extension =
        this@IngredientSubstanceStrengthReferenceStrengthSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@IngredientSubstanceStrengthReferenceStrengthSurrogate.modifierExtension
          ?: mutableListOf(),
      substance = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.substance,
      strength = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.strength,
      measurementPoint =
        R4bString.of(
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate.measurementPoint,
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate._measurementPoint,
        ),
      country =
        this@IngredientSubstanceStrengthReferenceStrengthSurrogate.country ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength.ReferenceStrength
    ): IngredientSubstanceStrengthReferenceStrengthSurrogate =
      with(model) {
        IngredientSubstanceStrengthReferenceStrengthSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          substance = this@with.substance,
          strength = this@with.strength,
          measurementPoint = this@with.measurementPoint?.value,
          _measurementPoint = this@with.measurementPoint?.toElement(),
          country = this@with.country.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthPresentationSurrogate(
  public var presentationRatio: Ratio? = null,
  public var presentationRatioRange: RatioRange? = null,
) {
  public fun toModel(): Ingredient.Substance.Strength.Presentation =
    Ingredient.Substance.Strength.Presentation?.from(
      this@IngredientSubstanceStrengthPresentationSurrogate.presentationRatio,
      this@IngredientSubstanceStrengthPresentationSurrogate.presentationRatioRange,
    )!!

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength.Presentation
    ): IngredientSubstanceStrengthPresentationSurrogate =
      with(model) {
        IngredientSubstanceStrengthPresentationSurrogate(
          presentationRatio = this@with.asRatio()?.value,
          presentationRatioRange = this@with.asRatioRange()?.value,
        )
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthConcentrationSurrogate(
  public var concentrationRatio: Ratio? = null,
  public var concentrationRatioRange: RatioRange? = null,
) {
  public fun toModel(): Ingredient.Substance.Strength.Concentration =
    Ingredient.Substance.Strength.Concentration?.from(
      this@IngredientSubstanceStrengthConcentrationSurrogate.concentrationRatio,
      this@IngredientSubstanceStrengthConcentrationSurrogate.concentrationRatioRange,
    )!!

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength.Concentration
    ): IngredientSubstanceStrengthConcentrationSurrogate =
      with(model) {
        IngredientSubstanceStrengthConcentrationSurrogate(
          concentrationRatio = this@with.asRatio()?.value,
          concentrationRatioRange = this@with.asRatioRange()?.value,
        )
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var textPresentation: KotlinString? = null,
  public var _textPresentation: Element? = null,
  public var textConcentration: KotlinString? = null,
  public var _textConcentration: Element? = null,
  public var measurementPoint: KotlinString? = null,
  public var _measurementPoint: Element? = null,
  public var country: MutableList<CodeableConcept>? = null,
  public var referenceStrength: MutableList<Ingredient.Substance.Strength.ReferenceStrength>? =
    null,
  public var presentation: Ingredient.Substance.Strength.Presentation? = null,
  public var concentration: Ingredient.Substance.Strength.Concentration? = null,
) {
  public fun toModel(): Ingredient.Substance.Strength =
    Ingredient.Substance.Strength(
      id = this@IngredientSubstanceStrengthSurrogate.id,
      extension = this@IngredientSubstanceStrengthSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@IngredientSubstanceStrengthSurrogate.modifierExtension ?: mutableListOf(),
      presentation = this@IngredientSubstanceStrengthSurrogate.presentation,
      textPresentation =
        R4bString.of(
          this@IngredientSubstanceStrengthSurrogate.textPresentation,
          this@IngredientSubstanceStrengthSurrogate._textPresentation,
        ),
      concentration = this@IngredientSubstanceStrengthSurrogate.concentration,
      textConcentration =
        R4bString.of(
          this@IngredientSubstanceStrengthSurrogate.textConcentration,
          this@IngredientSubstanceStrengthSurrogate._textConcentration,
        ),
      measurementPoint =
        R4bString.of(
          this@IngredientSubstanceStrengthSurrogate.measurementPoint,
          this@IngredientSubstanceStrengthSurrogate._measurementPoint,
        ),
      country = this@IngredientSubstanceStrengthSurrogate.country ?: mutableListOf(),
      referenceStrength =
        this@IngredientSubstanceStrengthSurrogate.referenceStrength ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength
    ): IngredientSubstanceStrengthSurrogate =
      with(model) {
        IngredientSubstanceStrengthSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          presentation = this@with.presentation,
          textPresentation = this@with.textPresentation?.value,
          _textPresentation = this@with.textPresentation?.toElement(),
          concentration = this@with.concentration,
          textConcentration = this@with.textConcentration?.value,
          _textConcentration = this@with.textConcentration?.toElement(),
          measurementPoint = this@with.measurementPoint?.value,
          _measurementPoint = this@with.measurementPoint?.toElement(),
          country = this@with.country.takeUnless { it.all { it == null } },
          referenceStrength = this@with.referenceStrength.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class IngredientSubstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableReference,
  public var strength: MutableList<Ingredient.Substance.Strength>? = null,
) {
  public fun toModel(): Ingredient.Substance =
    Ingredient.Substance(
      id = this@IngredientSubstanceSurrogate.id,
      extension = this@IngredientSubstanceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@IngredientSubstanceSurrogate.modifierExtension ?: mutableListOf(),
      code = this@IngredientSubstanceSurrogate.code,
      strength = this@IngredientSubstanceSurrogate.strength ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Ingredient.Substance): IngredientSubstanceSurrogate =
      with(model) {
        IngredientSubstanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          strength = this@with.strength.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class IngredientSurrogate(
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
  public var identifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var `for`: MutableList<Reference>? = null,
  public var role: CodeableConcept,
  public var function: MutableList<CodeableConcept>? = null,
  public var allergenicIndicator: KotlinBoolean? = null,
  public var _allergenicIndicator: Element? = null,
  public var manufacturer: MutableList<Ingredient.Manufacturer>? = null,
  public var substance: Ingredient.Substance,
) {
  public fun toModel(): Ingredient =
    Ingredient(
      id = this@IngredientSurrogate.id,
      meta = this@IngredientSurrogate.meta,
      implicitRules =
        Uri.of(this@IngredientSurrogate.implicitRules, this@IngredientSurrogate._implicitRules),
      language = Code.of(this@IngredientSurrogate.language, this@IngredientSurrogate._language),
      text = this@IngredientSurrogate.text,
      contained = this@IngredientSurrogate.contained ?: mutableListOf(),
      extension = this@IngredientSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@IngredientSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@IngredientSurrogate.identifier,
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(this@IngredientSurrogate.status!!),
          this@IngredientSurrogate._status,
        ),
      `for` = this@IngredientSurrogate.`for` ?: mutableListOf(),
      role = this@IngredientSurrogate.role,
      function = this@IngredientSurrogate.function ?: mutableListOf(),
      allergenicIndicator =
        R4bBoolean.of(
          this@IngredientSurrogate.allergenicIndicator,
          this@IngredientSurrogate._allergenicIndicator,
        ),
      manufacturer = this@IngredientSurrogate.manufacturer ?: mutableListOf(),
      substance = this@IngredientSurrogate.substance,
    )

  public companion object {
    public fun fromModel(model: Ingredient): IngredientSurrogate =
      with(model) {
        IngredientSurrogate(
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
          identifier = this@with.identifier,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          `for` = this@with.`for`.takeUnless { it.all { it == null } },
          role = this@with.role,
          function = this@with.function.takeUnless { it.all { it == null } },
          allergenicIndicator = this@with.allergenicIndicator?.value,
          _allergenicIndicator = this@with.allergenicIndicator?.toElement(),
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          substance = this@with.substance,
        )
      }
  }
}
