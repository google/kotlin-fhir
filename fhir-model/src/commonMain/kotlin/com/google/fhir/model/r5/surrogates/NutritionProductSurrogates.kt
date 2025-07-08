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
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Base64Binary
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.NutritionProduct
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
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
internal data class NutritionProductNutrientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var item: CodeableReference? = null,
  public var amount: List<Ratio?>? = null,
) {
  public fun toModel(): NutritionProduct.Nutrient =
    NutritionProduct.Nutrient().apply {
      id = this@NutritionProductNutrientSurrogate.id
      extension = this@NutritionProductNutrientSurrogate.extension
      modifierExtension = this@NutritionProductNutrientSurrogate.modifierExtension
      item = this@NutritionProductNutrientSurrogate.item
      amount = this@NutritionProductNutrientSurrogate.amount
    }

  public companion object {
    public fun fromModel(model: NutritionProduct.Nutrient): NutritionProductNutrientSurrogate =
      with(model) {
        NutritionProductNutrientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          item = this@with.item
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal data class NutritionProductIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var item: CodeableReference? = null,
  public var amount: List<Ratio?>? = null,
) {
  public fun toModel(): NutritionProduct.Ingredient =
    NutritionProduct.Ingredient().apply {
      id = this@NutritionProductIngredientSurrogate.id
      extension = this@NutritionProductIngredientSurrogate.extension
      modifierExtension = this@NutritionProductIngredientSurrogate.modifierExtension
      item = this@NutritionProductIngredientSurrogate.item
      amount = this@NutritionProductIngredientSurrogate.amount
    }

  public companion object {
    public fun fromModel(model: NutritionProduct.Ingredient): NutritionProductIngredientSurrogate =
      with(model) {
        NutritionProductIngredientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          item = this@with.item
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal class NutritionProductCharacteristicValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueString: KotlinString? = null

  public var _valueString: Element? = null

  public var valueQuantity: Quantity? = null

  public var valueBase64Binary: KotlinString? = null

  public var _valueBase64Binary: Element? = null

  public var valueAttachment: Attachment? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public fun toModel(): NutritionProduct.Characteristic.Value =
    NutritionProduct.Characteristic.Value?.from(
      this@NutritionProductCharacteristicValueSurrogate.valueCodeableConcept,
      R5String.of(
        this@NutritionProductCharacteristicValueSurrogate.valueString,
        this@NutritionProductCharacteristicValueSurrogate._valueString,
      ),
      this@NutritionProductCharacteristicValueSurrogate.valueQuantity,
      Base64Binary.of(
        this@NutritionProductCharacteristicValueSurrogate.valueBase64Binary,
        this@NutritionProductCharacteristicValueSurrogate._valueBase64Binary,
      ),
      this@NutritionProductCharacteristicValueSurrogate.valueAttachment,
      R5Boolean.of(
        this@NutritionProductCharacteristicValueSurrogate.valueBoolean,
        this@NutritionProductCharacteristicValueSurrogate._valueBoolean,
      ),
    ) ?: NutritionProduct.Characteristic.Value.Null

  public companion object {
    public fun fromModel(
      model: NutritionProduct.Characteristic.Value
    ): NutritionProductCharacteristicValueSurrogate =
      with(model) {
        NutritionProductCharacteristicValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueString = this@with.asString()?.value?.value
          _valueString = this@with.asString()?.value?.toElement()
          valueQuantity = this@with.asQuantity()?.value
          valueBase64Binary = this@with.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.asBase64Binary()?.value?.toElement()
          valueAttachment = this@with.asAttachment()?.value
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class NutritionProductCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: NutritionProduct.Characteristic.Value? = null,
) {
  public fun toModel(): NutritionProduct.Characteristic =
    NutritionProduct.Characteristic().apply {
      id = this@NutritionProductCharacteristicSurrogate.id
      extension = this@NutritionProductCharacteristicSurrogate.extension
      modifierExtension = this@NutritionProductCharacteristicSurrogate.modifierExtension
      type = this@NutritionProductCharacteristicSurrogate.type
      `value` = this@NutritionProductCharacteristicSurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: NutritionProduct.Characteristic
    ): NutritionProductCharacteristicSurrogate =
      with(model) {
        NutritionProductCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class NutritionProductInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var quantity: Quantity? = null,
  public var identifier: List<Identifier?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expiry: KotlinString? = null,
  public var _expiry: Element? = null,
  public var useBy: KotlinString? = null,
  public var _useBy: Element? = null,
  public var biologicalSourceEvent: Identifier? = null,
) {
  public fun toModel(): NutritionProduct.Instance =
    NutritionProduct.Instance().apply {
      id = this@NutritionProductInstanceSurrogate.id
      extension = this@NutritionProductInstanceSurrogate.extension
      modifierExtension = this@NutritionProductInstanceSurrogate.modifierExtension
      quantity = this@NutritionProductInstanceSurrogate.quantity
      identifier = this@NutritionProductInstanceSurrogate.identifier
      name =
        R5String.of(
          this@NutritionProductInstanceSurrogate.name,
          this@NutritionProductInstanceSurrogate._name,
        )
      lotNumber =
        R5String.of(
          this@NutritionProductInstanceSurrogate.lotNumber,
          this@NutritionProductInstanceSurrogate._lotNumber,
        )
      expiry =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionProductInstanceSurrogate.expiry),
          this@NutritionProductInstanceSurrogate._expiry,
        )
      useBy =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionProductInstanceSurrogate.useBy),
          this@NutritionProductInstanceSurrogate._useBy,
        )
      biologicalSourceEvent = this@NutritionProductInstanceSurrogate.biologicalSourceEvent
    }

  public companion object {
    public fun fromModel(model: NutritionProduct.Instance): NutritionProductInstanceSurrogate =
      with(model) {
        NutritionProductInstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          quantity = this@with.quantity
          identifier = this@with.identifier
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          lotNumber = this@with.lotNumber?.value
          _lotNumber = this@with.lotNumber?.toElement()
          expiry = this@with.expiry?.value?.toString()
          _expiry = this@with.expiry?.toElement()
          useBy = this@with.useBy?.value?.toString()
          _useBy = this@with.useBy?.toElement()
          biologicalSourceEvent = this@with.biologicalSourceEvent
        }
      }
  }
}

@Serializable
internal data class NutritionProductSurrogate(
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
  public var code: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var manufacturer: List<Reference?>? = null,
  public var nutrient: List<NutritionProduct.Nutrient>? = null,
  public var ingredient: List<NutritionProduct.Ingredient>? = null,
  public var knownAllergen: List<CodeableReference?>? = null,
  public var characteristic: List<NutritionProduct.Characteristic>? = null,
  public var instance: List<NutritionProduct.Instance>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): NutritionProduct =
    NutritionProduct().apply {
      id = this@NutritionProductSurrogate.id
      meta = this@NutritionProductSurrogate.meta
      implicitRules =
        Uri.of(
          this@NutritionProductSurrogate.implicitRules,
          this@NutritionProductSurrogate._implicitRules,
        )
      language =
        Code.of(this@NutritionProductSurrogate.language, this@NutritionProductSurrogate._language)
      text = this@NutritionProductSurrogate.text
      contained = this@NutritionProductSurrogate.contained
      extension = this@NutritionProductSurrogate.extension
      modifierExtension = this@NutritionProductSurrogate.modifierExtension
      code = this@NutritionProductSurrogate.code
      status =
        Enumeration.of(
          this@NutritionProductSurrogate.status?.let {
            com.google.fhir.model.r5.NutritionProduct.NutritionProductStatus.fromCode(it)
          },
          this@NutritionProductSurrogate._status,
        )
      category = this@NutritionProductSurrogate.category
      manufacturer = this@NutritionProductSurrogate.manufacturer
      nutrient = this@NutritionProductSurrogate.nutrient
      ingredient = this@NutritionProductSurrogate.ingredient
      knownAllergen = this@NutritionProductSurrogate.knownAllergen
      characteristic = this@NutritionProductSurrogate.characteristic
      instance = this@NutritionProductSurrogate.instance
      note = this@NutritionProductSurrogate.note
    }

  public companion object {
    public fun fromModel(model: NutritionProduct): NutritionProductSurrogate =
      with(model) {
        NutritionProductSurrogate().apply {
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
          code = this@with.code
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          category = this@with.category
          manufacturer = this@with.manufacturer
          nutrient = this@with.nutrient
          ingredient = this@with.ingredient
          knownAllergen = this@with.knownAllergen
          characteristic = this@with.characteristic
          instance = this@with.instance
          note = this@with.note
        }
      }
  }
}
