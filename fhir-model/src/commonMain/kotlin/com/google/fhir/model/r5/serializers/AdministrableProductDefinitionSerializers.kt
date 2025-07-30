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

package com.google.fhir.model.r5.serializers

import com.google.fhir.model.r5.AdministrableProductDefinition
import com.google.fhir.model.r5.FhirJsonTransformer
import com.google.fhir.model.r5.surrogates.AdministrableProductDefinitionPropertySurrogate
import com.google.fhir.model.r5.surrogates.AdministrableProductDefinitionPropertyValueSurrogate
import com.google.fhir.model.r5.surrogates.AdministrableProductDefinitionRouteOfAdministrationSurrogate
import com.google.fhir.model.r5.surrogates.AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate
import com.google.fhir.model.r5.surrogates.AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
import com.google.fhir.model.r5.surrogates.AdministrableProductDefinitionSurrogate
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

public object AdministrableProductDefinitionPropertyValueSerializer :
  KSerializer<AdministrableProductDefinition.Property.Value> {
  internal val surrogateSerializer:
    KSerializer<AdministrableProductDefinitionPropertyValueSurrogate> by lazy {
    AdministrableProductDefinitionPropertyValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Value", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdministrableProductDefinition.Property.Value =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdministrableProductDefinition.Property.Value) {
    surrogateSerializer.serialize(
      encoder,
      AdministrableProductDefinitionPropertyValueSurrogate.fromModel(value),
    )
  }
}

public object AdministrableProductDefinitionPropertySerializer :
  KSerializer<AdministrableProductDefinition.Property> {
  internal val surrogateSerializer:
    KSerializer<AdministrableProductDefinitionPropertySurrogate> by lazy {
    AdministrableProductDefinitionPropertySurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("value")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdministrableProductDefinition.Property {
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

  override fun serialize(encoder: Encoder, `value`: AdministrableProductDefinition.Property) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = AdministrableProductDefinitionPropertySurrogate.fromModel(value)
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

public object AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSerializer :
  KSerializer<AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod> {
  internal val surrogateSerializer:
    KSerializer<
      AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
    > by lazy {
    AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
      .serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("WithdrawalPeriod", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod,
  ) {
    surrogateSerializer.serialize(
      encoder,
      AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
        .fromModel(value),
    )
  }
}

public object AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSerializer :
  KSerializer<AdministrableProductDefinition.RouteOfAdministration.TargetSpecies> {
  internal val surrogateSerializer:
    KSerializer<AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate> by lazy {
    AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("TargetSpecies", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): AdministrableProductDefinition.RouteOfAdministration.TargetSpecies =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: AdministrableProductDefinition.RouteOfAdministration.TargetSpecies,
  ) {
    surrogateSerializer.serialize(
      encoder,
      AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.fromModel(value),
    )
  }
}

public object AdministrableProductDefinitionRouteOfAdministrationSerializer :
  KSerializer<AdministrableProductDefinition.RouteOfAdministration> {
  internal val surrogateSerializer:
    KSerializer<AdministrableProductDefinitionRouteOfAdministrationSurrogate> by lazy {
    AdministrableProductDefinitionRouteOfAdministrationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RouteOfAdministration", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdministrableProductDefinition.RouteOfAdministration =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: AdministrableProductDefinition.RouteOfAdministration,
  ) {
    surrogateSerializer.serialize(
      encoder,
      AdministrableProductDefinitionRouteOfAdministrationSurrogate.fromModel(value),
    )
  }
}

public object AdministrableProductDefinitionSerializer :
  KSerializer<AdministrableProductDefinition> {
  internal val surrogateSerializer: KSerializer<AdministrableProductDefinitionSurrogate> by lazy {
    AdministrableProductDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AdministrableProductDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdministrableProductDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdministrableProductDefinition) {
    surrogateSerializer.serialize(encoder, AdministrableProductDefinitionSurrogate.fromModel(value))
  }
}
