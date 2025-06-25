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

import com.google.fhir.model.r5.Specimen
import com.google.fhir.model.r5.surrogates.SpecimenCollectionSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenContainerSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenFeatureSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenProcessingSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SpecimenFeatureSerializer : KSerializer<Specimen.Feature> {
  internal val surrogateSerializer: KSerializer<SpecimenFeatureSurrogate> by lazy {
    SpecimenFeatureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Feature", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Feature =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Feature) {
    surrogateSerializer.serialize(encoder, SpecimenFeatureSurrogate.fromModel(value))
  }
}

public object SpecimenCollectionSerializer : KSerializer<Specimen.Collection> {
  internal val surrogateSerializer: KSerializer<SpecimenCollectionSurrogate> by lazy {
    SpecimenCollectionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Collection", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Collection =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Collection) {
    surrogateSerializer.serialize(encoder, SpecimenCollectionSurrogate.fromModel(value))
  }
}

public object SpecimenProcessingSerializer : KSerializer<Specimen.Processing> {
  internal val surrogateSerializer: KSerializer<SpecimenProcessingSurrogate> by lazy {
    SpecimenProcessingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Processing", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Processing =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Processing) {
    surrogateSerializer.serialize(encoder, SpecimenProcessingSurrogate.fromModel(value))
  }
}

public object SpecimenContainerSerializer : KSerializer<Specimen.Container> {
  internal val surrogateSerializer: KSerializer<SpecimenContainerSurrogate> by lazy {
    SpecimenContainerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Container", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Container =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Container) {
    surrogateSerializer.serialize(encoder, SpecimenContainerSurrogate.fromModel(value))
  }
}

public object SpecimenSerializer : KSerializer<Specimen> {
  internal val surrogateSerializer: KSerializer<SpecimenSurrogate> by lazy {
    SpecimenSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Specimen", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen) {
    surrogateSerializer.serialize(encoder, SpecimenSurrogate.fromModel(value))
  }
}
