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

package com.google.fhir.model.r4b.serializers

import com.google.fhir.model.r4b.FhirJsonTransformer
import com.google.fhir.model.r4b.Ingredient
import com.google.fhir.model.r4b.surrogates.IngredientManufacturerSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthConcentrationSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthPresentationSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthReferenceStrengthSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSurrogate
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject

public object IngredientManufacturerSerializer : KSerializer<Ingredient.Manufacturer> {
  internal val surrogateSerializer: KSerializer<IngredientManufacturerSurrogate> by lazy {
    IngredientManufacturerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Manufacturer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Manufacturer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Manufacturer) {
    surrogateSerializer.serialize(encoder, IngredientManufacturerSurrogate.fromModel(value))
  }
}

public object IngredientSubstanceStrengthReferenceStrengthStrengthSerializer :
  KSerializer<Ingredient.Substance.Strength.ReferenceStrength.Strength> {
  internal val surrogateSerializer:
    KSerializer<IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate> by lazy {
    IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Strength", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): Ingredient.Substance.Strength.ReferenceStrength.Strength =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: Ingredient.Substance.Strength.ReferenceStrength.Strength,
  ) {
    surrogateSerializer.serialize(
      encoder,
      IngredientSubstanceStrengthReferenceStrengthStrengthSurrogate.fromModel(value),
    )
  }
}

public object IngredientSubstanceStrengthReferenceStrengthSerializer :
  KSerializer<Ingredient.Substance.Strength.ReferenceStrength> {
  internal val surrogateSerializer:
    KSerializer<IngredientSubstanceStrengthReferenceStrengthSurrogate> by lazy {
    IngredientSubstanceStrengthReferenceStrengthSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("strength")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ReferenceStrength", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance.Strength.ReferenceStrength {
    val jsonDecoder =
      decoder as? JsonDecoder ?: error("This serializer only supports JSON decoding")
    val oldJsonObject =
      if (resourceType.isNullOrBlank()) {
        jsonDecoder.decodeJsonElement().jsonObject
      } else
        JsonObject(
          jsonDecoder.decodeJsonElement().jsonObject.toMutableMap().apply { remove("resourceType") }
        )
    val unflattenedJsonObject = FhirJsonTransformer.unflatten(oldJsonObject, multiChoiceProperties)
    val surrogate =
      jsonDecoder.json.decodeFromJsonElement(surrogateSerializer, unflattenedJsonObject)
    return surrogate.toModel()
  }

  override fun serialize(
    encoder: Encoder,
    `value`: Ingredient.Substance.Strength.ReferenceStrength,
  ) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = IngredientSubstanceStrengthReferenceStrengthSurrogate.fromModel(value)
    val oldJsonObject =
      if (resourceType.isNullOrBlank()) {
        jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).jsonObject
      } else {
        JsonObject(
          mutableMapOf("resourceType" to JsonPrimitive(resourceType))
            .plus(jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).jsonObject)
        )
      }
    val flattenedJsonObject = FhirJsonTransformer.flatten(oldJsonObject, multiChoiceProperties)
    jsonEncoder.encodeJsonElement(flattenedJsonObject)
  }
}

public object IngredientSubstanceStrengthPresentationSerializer :
  KSerializer<Ingredient.Substance.Strength.Presentation> {
  internal val surrogateSerializer:
    KSerializer<IngredientSubstanceStrengthPresentationSurrogate> by lazy {
    IngredientSubstanceStrengthPresentationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Presentation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance.Strength.Presentation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Substance.Strength.Presentation) {
    surrogateSerializer.serialize(
      encoder,
      IngredientSubstanceStrengthPresentationSurrogate.fromModel(value),
    )
  }
}

public object IngredientSubstanceStrengthConcentrationSerializer :
  KSerializer<Ingredient.Substance.Strength.Concentration> {
  internal val surrogateSerializer:
    KSerializer<IngredientSubstanceStrengthConcentrationSurrogate> by lazy {
    IngredientSubstanceStrengthConcentrationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Concentration", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance.Strength.Concentration =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Substance.Strength.Concentration) {
    surrogateSerializer.serialize(
      encoder,
      IngredientSubstanceStrengthConcentrationSurrogate.fromModel(value),
    )
  }
}

public object IngredientSubstanceStrengthSerializer : KSerializer<Ingredient.Substance.Strength> {
  internal val surrogateSerializer: KSerializer<IngredientSubstanceStrengthSurrogate> by lazy {
    IngredientSubstanceStrengthSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("presentation", "concentration")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Strength", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance.Strength {
    val jsonDecoder =
      decoder as? JsonDecoder ?: error("This serializer only supports JSON decoding")
    val oldJsonObject =
      if (resourceType.isNullOrBlank()) {
        jsonDecoder.decodeJsonElement().jsonObject
      } else
        JsonObject(
          jsonDecoder.decodeJsonElement().jsonObject.toMutableMap().apply { remove("resourceType") }
        )
    val unflattenedJsonObject = FhirJsonTransformer.unflatten(oldJsonObject, multiChoiceProperties)
    val surrogate =
      jsonDecoder.json.decodeFromJsonElement(surrogateSerializer, unflattenedJsonObject)
    return surrogate.toModel()
  }

  override fun serialize(encoder: Encoder, `value`: Ingredient.Substance.Strength) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = IngredientSubstanceStrengthSurrogate.fromModel(value)
    val oldJsonObject =
      if (resourceType.isNullOrBlank()) {
        jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).jsonObject
      } else {
        JsonObject(
          mutableMapOf("resourceType" to JsonPrimitive(resourceType))
            .plus(jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).jsonObject)
        )
      }
    val flattenedJsonObject = FhirJsonTransformer.flatten(oldJsonObject, multiChoiceProperties)
    jsonEncoder.encodeJsonElement(flattenedJsonObject)
  }
}

public object IngredientSubstanceSerializer : KSerializer<Ingredient.Substance> {
  internal val surrogateSerializer: KSerializer<IngredientSubstanceSurrogate> by lazy {
    IngredientSubstanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Substance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Substance) {
    surrogateSerializer.serialize(encoder, IngredientSubstanceSurrogate.fromModel(value))
  }
}

public object IngredientSerializer : KSerializer<Ingredient> {
  internal val surrogateSerializer: KSerializer<IngredientSurrogate> by lazy {
    IngredientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Ingredient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient) {
    surrogateSerializer.serialize(encoder, IngredientSurrogate.fromModel(value))
  }
}
