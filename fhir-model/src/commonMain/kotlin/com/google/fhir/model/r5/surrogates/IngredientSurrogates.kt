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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Ingredient
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.RatioRange
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class IngredientManufacturerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var role: KotlinString? = null,
  public var _role: Element? = null,
  public var manufacturer: Reference? = null,
) {
  public fun toModel(): Ingredient.Manufacturer =
    Ingredient.Manufacturer().apply {
      id = this@IngredientManufacturerSurrogate.id
      extension = this@IngredientManufacturerSurrogate.extension
      modifierExtension = this@IngredientManufacturerSurrogate.modifierExtension
      role =
        Enumeration.of(
          this@IngredientManufacturerSurrogate.role?.let {
            com.google.fhir.model.r5.IngredientManufacturerRole.fromCode(it)
          },
          this@IngredientManufacturerSurrogate._role,
        )
      manufacturer = this@IngredientManufacturerSurrogate.manufacturer
    }

  public companion object {
    public fun fromModel(model: Ingredient.Manufacturer): IngredientManufacturerSurrogate =
      with(model) {
        IngredientManufacturerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          role = this@with.role?.value?.getCode()
          _role = this@with.role?.toElement()
          manufacturer = this@with.manufacturer
        }
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthReferenceStrengthSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var substance: CodeableReference? = null,
  public var strengthRatio: Ratio? = null,
  public var strengthRatioRange: RatioRange? = null,
  public var strengthQuantity: Quantity? = null,
  public var measurementPoint: KotlinString? = null,
  public var _measurementPoint: Element? = null,
  public var country: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Ingredient.Substance.Strength.ReferenceStrength =
    Ingredient.Substance.Strength.ReferenceStrength().apply {
      id = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.id
      extension = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.extension
      modifierExtension =
        this@IngredientSubstanceStrengthReferenceStrengthSurrogate.modifierExtension
      substance = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.substance
      strength =
        Ingredient.Substance.Strength.ReferenceStrength.Strength?.from(
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate.strengthRatio,
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate.strengthRatioRange,
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate.strengthQuantity,
        )
      measurementPoint =
        R5String.of(
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate.measurementPoint,
          this@IngredientSubstanceStrengthReferenceStrengthSurrogate._measurementPoint,
        )
      country = this@IngredientSubstanceStrengthReferenceStrengthSurrogate.country
    }

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength.ReferenceStrength
    ): IngredientSubstanceStrengthReferenceStrengthSurrogate =
      with(model) {
        IngredientSubstanceStrengthReferenceStrengthSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          substance = this@with.substance
          strengthRatio = this@with.strength?.asRatio()?.value
          strengthRatioRange = this@with.strength?.asRatioRange()?.value
          strengthQuantity = this@with.strength?.asQuantity()?.value
          measurementPoint = this@with.measurementPoint?.value
          _measurementPoint = this@with.measurementPoint?.toElement()
          country = this@with.country
        }
      }
  }
}

@Serializable
internal data class IngredientSubstanceStrengthSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var presentationRatio: Ratio? = null,
  public var presentationRatioRange: RatioRange? = null,
  public var presentationCodeableConcept: CodeableConcept? = null,
  public var presentationQuantity: Quantity? = null,
  public var textPresentation: KotlinString? = null,
  public var _textPresentation: Element? = null,
  public var concentrationRatio: Ratio? = null,
  public var concentrationRatioRange: RatioRange? = null,
  public var concentrationCodeableConcept: CodeableConcept? = null,
  public var concentrationQuantity: Quantity? = null,
  public var textConcentration: KotlinString? = null,
  public var _textConcentration: Element? = null,
  public var basis: CodeableConcept? = null,
  public var measurementPoint: KotlinString? = null,
  public var _measurementPoint: Element? = null,
  public var country: List<CodeableConcept?>? = null,
  public var referenceStrength: List<Ingredient.Substance.Strength.ReferenceStrength>? = null,
) {
  public fun toModel(): Ingredient.Substance.Strength =
    Ingredient.Substance.Strength().apply {
      id = this@IngredientSubstanceStrengthSurrogate.id
      extension = this@IngredientSubstanceStrengthSurrogate.extension
      modifierExtension = this@IngredientSubstanceStrengthSurrogate.modifierExtension
      presentation =
        Ingredient.Substance.Strength.Presentation?.from(
          this@IngredientSubstanceStrengthSurrogate.presentationRatio,
          this@IngredientSubstanceStrengthSurrogate.presentationRatioRange,
          this@IngredientSubstanceStrengthSurrogate.presentationCodeableConcept,
          this@IngredientSubstanceStrengthSurrogate.presentationQuantity,
        )
      textPresentation =
        R5String.of(
          this@IngredientSubstanceStrengthSurrogate.textPresentation,
          this@IngredientSubstanceStrengthSurrogate._textPresentation,
        )
      concentration =
        Ingredient.Substance.Strength.Concentration?.from(
          this@IngredientSubstanceStrengthSurrogate.concentrationRatio,
          this@IngredientSubstanceStrengthSurrogate.concentrationRatioRange,
          this@IngredientSubstanceStrengthSurrogate.concentrationCodeableConcept,
          this@IngredientSubstanceStrengthSurrogate.concentrationQuantity,
        )
      textConcentration =
        R5String.of(
          this@IngredientSubstanceStrengthSurrogate.textConcentration,
          this@IngredientSubstanceStrengthSurrogate._textConcentration,
        )
      basis = this@IngredientSubstanceStrengthSurrogate.basis
      measurementPoint =
        R5String.of(
          this@IngredientSubstanceStrengthSurrogate.measurementPoint,
          this@IngredientSubstanceStrengthSurrogate._measurementPoint,
        )
      country = this@IngredientSubstanceStrengthSurrogate.country
      referenceStrength = this@IngredientSubstanceStrengthSurrogate.referenceStrength
    }

  public companion object {
    public fun fromModel(
      model: Ingredient.Substance.Strength
    ): IngredientSubstanceStrengthSurrogate =
      with(model) {
        IngredientSubstanceStrengthSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          presentationRatio = this@with.presentation?.asRatio()?.value
          presentationRatioRange = this@with.presentation?.asRatioRange()?.value
          presentationCodeableConcept = this@with.presentation?.asCodeableConcept()?.value
          presentationQuantity = this@with.presentation?.asQuantity()?.value
          textPresentation = this@with.textPresentation?.value
          _textPresentation = this@with.textPresentation?.toElement()
          concentrationRatio = this@with.concentration?.asRatio()?.value
          concentrationRatioRange = this@with.concentration?.asRatioRange()?.value
          concentrationCodeableConcept = this@with.concentration?.asCodeableConcept()?.value
          concentrationQuantity = this@with.concentration?.asQuantity()?.value
          textConcentration = this@with.textConcentration?.value
          _textConcentration = this@with.textConcentration?.toElement()
          basis = this@with.basis
          measurementPoint = this@with.measurementPoint?.value
          _measurementPoint = this@with.measurementPoint?.toElement()
          country = this@with.country
          referenceStrength = this@with.referenceStrength
        }
      }
  }
}

@Serializable
internal data class IngredientSubstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableReference? = null,
  public var strength: List<Ingredient.Substance.Strength>? = null,
) {
  public fun toModel(): Ingredient.Substance =
    Ingredient.Substance().apply {
      id = this@IngredientSubstanceSurrogate.id
      extension = this@IngredientSubstanceSurrogate.extension
      modifierExtension = this@IngredientSubstanceSurrogate.modifierExtension
      code = this@IngredientSubstanceSurrogate.code
      strength = this@IngredientSubstanceSurrogate.strength
    }

  public companion object {
    public fun fromModel(model: Ingredient.Substance): IngredientSubstanceSurrogate =
      with(model) {
        IngredientSubstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          strength = this@with.strength
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var `for`: List<Reference?>? = null,
  public var role: CodeableConcept? = null,
  public var function: List<CodeableConcept?>? = null,
  public var group: CodeableConcept? = null,
  public var allergenicIndicator: KotlinBoolean? = null,
  public var _allergenicIndicator: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var manufacturer: List<Ingredient.Manufacturer>? = null,
  public var substance: Ingredient.Substance? = null,
) {
  public fun toModel(): Ingredient =
    Ingredient().apply {
      id = this@IngredientSurrogate.id
      meta = this@IngredientSurrogate.meta
      implicitRules =
        Uri.of(this@IngredientSurrogate.implicitRules, this@IngredientSurrogate._implicitRules)
      language = Code.of(this@IngredientSurrogate.language, this@IngredientSurrogate._language)
      text = this@IngredientSurrogate.text
      contained = this@IngredientSurrogate.contained
      extension = this@IngredientSurrogate.extension
      modifierExtension = this@IngredientSurrogate.modifierExtension
      identifier = this@IngredientSurrogate.identifier
      status =
        Enumeration.of(
          this@IngredientSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@IngredientSurrogate._status,
        )
      `for` = this@IngredientSurrogate.`for`
      role = this@IngredientSurrogate.role
      function = this@IngredientSurrogate.function
      group = this@IngredientSurrogate.group
      allergenicIndicator =
        R5Boolean.of(
          this@IngredientSurrogate.allergenicIndicator,
          this@IngredientSurrogate._allergenicIndicator,
        )
      comment = Markdown.of(this@IngredientSurrogate.comment, this@IngredientSurrogate._comment)
      manufacturer = this@IngredientSurrogate.manufacturer
      substance = this@IngredientSurrogate.substance
    }

  public companion object {
    public fun fromModel(model: Ingredient): IngredientSurrogate =
      with(model) {
        IngredientSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          `for` = this@with.`for`
          role = this@with.role
          function = this@with.function
          group = this@with.group
          allergenicIndicator = this@with.allergenicIndicator?.value
          _allergenicIndicator = this@with.allergenicIndicator?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          manufacturer = this@with.manufacturer
          substance = this@with.substance
        }
      }
  }
}
