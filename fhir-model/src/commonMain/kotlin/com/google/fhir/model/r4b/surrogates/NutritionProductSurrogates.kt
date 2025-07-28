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
import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Base64Binary
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.CodeableReference
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.NutritionProduct
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Ratio
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
internal data class NutritionProductNutrientSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: CodeableReference? = null,
  public var amount: MutableList<Ratio>? = null,
) {
  public fun toModel(): NutritionProduct.Nutrient =
    NutritionProduct.Nutrient(
      id = this@NutritionProductNutrientSurrogate.id,
      extension = this@NutritionProductNutrientSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionProductNutrientSurrogate.modifierExtension ?: mutableListOf(),
      item = this@NutritionProductNutrientSurrogate.item,
      amount = this@NutritionProductNutrientSurrogate.amount ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: NutritionProduct.Nutrient): NutritionProductNutrientSurrogate =
      with(model) {
        NutritionProductNutrientSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
          amount = this@with.amount.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class NutritionProductIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: CodeableReference,
  public var amount: MutableList<Ratio>? = null,
) {
  public fun toModel(): NutritionProduct.Ingredient =
    NutritionProduct.Ingredient(
      id = this@NutritionProductIngredientSurrogate.id,
      extension = this@NutritionProductIngredientSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionProductIngredientSurrogate.modifierExtension ?: mutableListOf(),
      item = this@NutritionProductIngredientSurrogate.item,
      amount = this@NutritionProductIngredientSurrogate.amount ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: NutritionProduct.Ingredient): NutritionProductIngredientSurrogate =
      with(model) {
        NutritionProductIngredientSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
          amount = this@with.amount.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class NutritionProductProductCharacteristicValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueBase64Binary: KotlinString? = null,
  public var _valueBase64Binary: Element? = null,
  public var valueAttachment: Attachment? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
) {
  public fun toModel(): NutritionProduct.ProductCharacteristic.Value =
    NutritionProduct.ProductCharacteristic.Value.from(
      this@NutritionProductProductCharacteristicValueSurrogate.valueCodeableConcept,
      R4bString.of(
        this@NutritionProductProductCharacteristicValueSurrogate.valueString,
        this@NutritionProductProductCharacteristicValueSurrogate._valueString,
      ),
      this@NutritionProductProductCharacteristicValueSurrogate.valueQuantity,
      Base64Binary.of(
        this@NutritionProductProductCharacteristicValueSurrogate.valueBase64Binary,
        this@NutritionProductProductCharacteristicValueSurrogate._valueBase64Binary,
      ),
      this@NutritionProductProductCharacteristicValueSurrogate.valueAttachment,
      R4bBoolean.of(
        this@NutritionProductProductCharacteristicValueSurrogate.valueBoolean,
        this@NutritionProductProductCharacteristicValueSurrogate._valueBoolean,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: NutritionProduct.ProductCharacteristic.Value
    ): NutritionProductProductCharacteristicValueSurrogate =
      with(model) {
        NutritionProductProductCharacteristicValueSurrogate().apply {
          NutritionProduct.ProductCharacteristic.Value.from(
            this@NutritionProductProductCharacteristicValueSurrogate.valueCodeableConcept,
            R4bString.of(
              this@NutritionProductProductCharacteristicValueSurrogate.valueString,
              this@NutritionProductProductCharacteristicValueSurrogate._valueString,
            ),
            this@NutritionProductProductCharacteristicValueSurrogate.valueQuantity,
            Base64Binary.of(
              this@NutritionProductProductCharacteristicValueSurrogate.valueBase64Binary,
              this@NutritionProductProductCharacteristicValueSurrogate._valueBase64Binary,
            ),
            this@NutritionProductProductCharacteristicValueSurrogate.valueAttachment,
            R4bBoolean.of(
              this@NutritionProductProductCharacteristicValueSurrogate.valueBoolean,
              this@NutritionProductProductCharacteristicValueSurrogate._valueBoolean,
            ),
          )!!
        }
      }
  }
}

@Serializable
internal data class NutritionProductProductCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: NutritionProduct.ProductCharacteristic.Value,
) {
  public fun toModel(): NutritionProduct.ProductCharacteristic =
    NutritionProduct.ProductCharacteristic(
      id = this@NutritionProductProductCharacteristicSurrogate.id,
      extension = this@NutritionProductProductCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionProductProductCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      type = this@NutritionProductProductCharacteristicSurrogate.type,
      `value` = this@NutritionProductProductCharacteristicSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: NutritionProduct.ProductCharacteristic
    ): NutritionProductProductCharacteristicSurrogate =
      with(model) {
        NutritionProductProductCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class NutritionProductInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var quantity: Quantity? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expiry: KotlinString? = null,
  public var _expiry: Element? = null,
  public var useBy: KotlinString? = null,
  public var _useBy: Element? = null,
) {
  public fun toModel(): NutritionProduct.Instance =
    NutritionProduct.Instance(
      id = this@NutritionProductInstanceSurrogate.id,
      extension = this@NutritionProductInstanceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionProductInstanceSurrogate.modifierExtension ?: mutableListOf(),
      quantity = this@NutritionProductInstanceSurrogate.quantity,
      identifier = this@NutritionProductInstanceSurrogate.identifier ?: mutableListOf(),
      lotNumber =
        R4bString.of(
          this@NutritionProductInstanceSurrogate.lotNumber,
          this@NutritionProductInstanceSurrogate._lotNumber,
        ),
      expiry =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionProductInstanceSurrogate.expiry),
          this@NutritionProductInstanceSurrogate._expiry,
        ),
      useBy =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionProductInstanceSurrogate.useBy),
          this@NutritionProductInstanceSurrogate._useBy,
        ),
    )

  public companion object {
    public fun fromModel(model: NutritionProduct.Instance): NutritionProductInstanceSurrogate =
      with(model) {
        NutritionProductInstanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          lotNumber = this@with.lotNumber?.value,
          _lotNumber = this@with.lotNumber?.toElement(),
          expiry = this@with.expiry?.value?.toString(),
          _expiry = this@with.expiry?.toElement(),
          useBy = this@with.useBy?.value?.toString(),
          _useBy = this@with.useBy?.toElement(),
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var nutrient: MutableList<NutritionProduct.Nutrient>? = null,
  public var ingredient: MutableList<NutritionProduct.Ingredient>? = null,
  public var knownAllergen: MutableList<CodeableReference>? = null,
  public var productCharacteristic: MutableList<NutritionProduct.ProductCharacteristic>? = null,
  public var instance: NutritionProduct.Instance? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): NutritionProduct =
    NutritionProduct(
      id = this@NutritionProductSurrogate.id,
      meta = this@NutritionProductSurrogate.meta,
      implicitRules =
        Uri.of(
          this@NutritionProductSurrogate.implicitRules,
          this@NutritionProductSurrogate._implicitRules,
        ),
      language =
        Code.of(this@NutritionProductSurrogate.language, this@NutritionProductSurrogate._language),
      text = this@NutritionProductSurrogate.text,
      contained = this@NutritionProductSurrogate.contained ?: mutableListOf(),
      extension = this@NutritionProductSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@NutritionProductSurrogate.modifierExtension ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.NutritionProduct.NutritionProductStatus.fromCode(
            this@NutritionProductSurrogate.status!!
          ),
          this@NutritionProductSurrogate._status,
        ),
      category = this@NutritionProductSurrogate.category ?: mutableListOf(),
      code = this@NutritionProductSurrogate.code,
      manufacturer = this@NutritionProductSurrogate.manufacturer ?: mutableListOf(),
      nutrient = this@NutritionProductSurrogate.nutrient ?: mutableListOf(),
      ingredient = this@NutritionProductSurrogate.ingredient ?: mutableListOf(),
      knownAllergen = this@NutritionProductSurrogate.knownAllergen ?: mutableListOf(),
      productCharacteristic =
        this@NutritionProductSurrogate.productCharacteristic ?: mutableListOf(),
      instance = this@NutritionProductSurrogate.instance,
      note = this@NutritionProductSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: NutritionProduct): NutritionProductSurrogate =
      with(model) {
        NutritionProductSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          nutrient = this@with.nutrient.takeUnless { it.all { it == null } },
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          knownAllergen = this@with.knownAllergen.takeUnless { it.all { it == null } },
          productCharacteristic =
            this@with.productCharacteristic.takeUnless { it.all { it == null } },
          instance = this@with.instance,
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
