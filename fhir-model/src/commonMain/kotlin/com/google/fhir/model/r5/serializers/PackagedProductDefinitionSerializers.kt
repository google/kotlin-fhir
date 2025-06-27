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

import com.google.fhir.model.r5.PackagedProductDefinition
import com.google.fhir.model.r5.surrogates.PackagedProductDefinitionLegalStatusOfSupplySurrogate
import com.google.fhir.model.r5.surrogates.PackagedProductDefinitionPackagingContainedItemSurrogate
import com.google.fhir.model.r5.surrogates.PackagedProductDefinitionPackagingPropertySurrogate
import com.google.fhir.model.r5.surrogates.PackagedProductDefinitionPackagingSurrogate
import com.google.fhir.model.r5.surrogates.PackagedProductDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object PackagedProductDefinitionLegalStatusOfSupplySerializer :
  KSerializer<PackagedProductDefinition.LegalStatusOfSupply> {
  internal val surrogateSerializer:
    KSerializer<PackagedProductDefinitionLegalStatusOfSupplySurrogate> by lazy {
    PackagedProductDefinitionLegalStatusOfSupplySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("LegalStatusOfSupply", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PackagedProductDefinition.LegalStatusOfSupply =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PackagedProductDefinition.LegalStatusOfSupply) {
    surrogateSerializer.serialize(
      encoder,
      PackagedProductDefinitionLegalStatusOfSupplySurrogate.fromModel(value),
    )
  }
}

public object PackagedProductDefinitionPackagingPropertySerializer :
  KSerializer<PackagedProductDefinition.Packaging.Property> {
  internal val surrogateSerializer:
    KSerializer<PackagedProductDefinitionPackagingPropertySurrogate> by lazy {
    PackagedProductDefinitionPackagingPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PackagedProductDefinition.Packaging.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PackagedProductDefinition.Packaging.Property) {
    surrogateSerializer.serialize(
      encoder,
      PackagedProductDefinitionPackagingPropertySurrogate.fromModel(value),
    )
  }
}

public object PackagedProductDefinitionPackagingContainedItemSerializer :
  KSerializer<PackagedProductDefinition.Packaging.ContainedItem> {
  internal val surrogateSerializer:
    KSerializer<PackagedProductDefinitionPackagingContainedItemSurrogate> by lazy {
    PackagedProductDefinitionPackagingContainedItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ContainedItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PackagedProductDefinition.Packaging.ContainedItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: PackagedProductDefinition.Packaging.ContainedItem,
  ) {
    surrogateSerializer.serialize(
      encoder,
      PackagedProductDefinitionPackagingContainedItemSurrogate.fromModel(value),
    )
  }
}

public object PackagedProductDefinitionPackagingSerializer :
  KSerializer<PackagedProductDefinition.Packaging> {
  internal val surrogateSerializer:
    KSerializer<PackagedProductDefinitionPackagingSurrogate> by lazy {
    PackagedProductDefinitionPackagingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Packaging", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PackagedProductDefinition.Packaging =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PackagedProductDefinition.Packaging) {
    surrogateSerializer.serialize(
      encoder,
      PackagedProductDefinitionPackagingSurrogate.fromModel(value),
    )
  }
}

public object PackagedProductDefinitionSerializer : KSerializer<PackagedProductDefinition> {
  internal val surrogateSerializer: KSerializer<PackagedProductDefinitionSurrogate> by lazy {
    PackagedProductDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PackagedProductDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PackagedProductDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PackagedProductDefinition) {
    surrogateSerializer.serialize(encoder, PackagedProductDefinitionSurrogate.fromModel(value))
  }
}
