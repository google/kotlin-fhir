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

import com.google.fhir.model.r4b.BiologicallyDerivedProduct
import com.google.fhir.model.r4b.surrogates.BiologicallyDerivedProductCollectionSurrogate
import com.google.fhir.model.r4b.surrogates.BiologicallyDerivedProductManipulationSurrogate
import com.google.fhir.model.r4b.surrogates.BiologicallyDerivedProductProcessingSurrogate
import com.google.fhir.model.r4b.surrogates.BiologicallyDerivedProductStorageSurrogate
import com.google.fhir.model.r4b.surrogates.BiologicallyDerivedProductSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object BiologicallyDerivedProductCollectionSerializer :
  KSerializer<BiologicallyDerivedProduct.Collection> {
  internal val surrogateSerializer:
    KSerializer<BiologicallyDerivedProductCollectionSurrogate> by lazy {
    BiologicallyDerivedProductCollectionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Collection", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): BiologicallyDerivedProduct.Collection =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: BiologicallyDerivedProduct.Collection) {
    surrogateSerializer.serialize(
      encoder,
      BiologicallyDerivedProductCollectionSurrogate.fromModel(value),
    )
  }
}

public object BiologicallyDerivedProductProcessingSerializer :
  KSerializer<BiologicallyDerivedProduct.Processing> {
  internal val surrogateSerializer:
    KSerializer<BiologicallyDerivedProductProcessingSurrogate> by lazy {
    BiologicallyDerivedProductProcessingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Processing", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): BiologicallyDerivedProduct.Processing =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: BiologicallyDerivedProduct.Processing) {
    surrogateSerializer.serialize(
      encoder,
      BiologicallyDerivedProductProcessingSurrogate.fromModel(value),
    )
  }
}

public object BiologicallyDerivedProductManipulationSerializer :
  KSerializer<BiologicallyDerivedProduct.Manipulation> {
  internal val surrogateSerializer:
    KSerializer<BiologicallyDerivedProductManipulationSurrogate> by lazy {
    BiologicallyDerivedProductManipulationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Manipulation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): BiologicallyDerivedProduct.Manipulation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: BiologicallyDerivedProduct.Manipulation) {
    surrogateSerializer.serialize(
      encoder,
      BiologicallyDerivedProductManipulationSurrogate.fromModel(value),
    )
  }
}

public object BiologicallyDerivedProductStorageSerializer :
  KSerializer<BiologicallyDerivedProduct.Storage> {
  internal val surrogateSerializer:
    KSerializer<BiologicallyDerivedProductStorageSurrogate> by lazy {
    BiologicallyDerivedProductStorageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Storage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): BiologicallyDerivedProduct.Storage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: BiologicallyDerivedProduct.Storage) {
    surrogateSerializer.serialize(
      encoder,
      BiologicallyDerivedProductStorageSurrogate.fromModel(value),
    )
  }
}

public object BiologicallyDerivedProductSerializer : KSerializer<BiologicallyDerivedProduct> {
  internal val surrogateSerializer: KSerializer<BiologicallyDerivedProductSurrogate> by lazy {
    BiologicallyDerivedProductSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("BiologicallyDerivedProduct", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): BiologicallyDerivedProduct =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: BiologicallyDerivedProduct) {
    surrogateSerializer.serialize(encoder, BiologicallyDerivedProductSurrogate.fromModel(value))
  }
}
