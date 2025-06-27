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

import com.google.fhir.model.r5.BiologicallyDerivedProduct
import com.google.fhir.model.r5.surrogates.BiologicallyDerivedProductCollectionSurrogate
import com.google.fhir.model.r5.surrogates.BiologicallyDerivedProductPropertySurrogate
import com.google.fhir.model.r5.surrogates.BiologicallyDerivedProductSurrogate
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

public object BiologicallyDerivedProductPropertySerializer :
  KSerializer<BiologicallyDerivedProduct.Property> {
  internal val surrogateSerializer:
    KSerializer<BiologicallyDerivedProductPropertySurrogate> by lazy {
    BiologicallyDerivedProductPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): BiologicallyDerivedProduct.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: BiologicallyDerivedProduct.Property) {
    surrogateSerializer.serialize(
      encoder,
      BiologicallyDerivedProductPropertySurrogate.fromModel(value),
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
