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

import com.google.fhir.model.r5.SubstanceReferenceInformation
import com.google.fhir.model.r5.surrogates.SubstanceReferenceInformationGeneElementSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceReferenceInformationGeneSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceReferenceInformationSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceReferenceInformationTargetSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SubstanceReferenceInformationGeneSerializer :
  KSerializer<SubstanceReferenceInformation.Gene> {
  internal val surrogateSerializer:
    KSerializer<SubstanceReferenceInformationGeneSurrogate> by lazy {
    SubstanceReferenceInformationGeneSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Gene", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceReferenceInformation.Gene =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceReferenceInformation.Gene) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceReferenceInformationGeneSurrogate.fromModel(value),
    )
  }
}

public object SubstanceReferenceInformationGeneElementSerializer :
  KSerializer<SubstanceReferenceInformation.GeneElement> {
  internal val surrogateSerializer:
    KSerializer<SubstanceReferenceInformationGeneElementSurrogate> by lazy {
    SubstanceReferenceInformationGeneElementSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("GeneElement", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceReferenceInformation.GeneElement =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceReferenceInformation.GeneElement) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceReferenceInformationGeneElementSurrogate.fromModel(value),
    )
  }
}

public object SubstanceReferenceInformationTargetSerializer :
  KSerializer<SubstanceReferenceInformation.Target> {
  internal val surrogateSerializer:
    KSerializer<SubstanceReferenceInformationTargetSurrogate> by lazy {
    SubstanceReferenceInformationTargetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Target", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceReferenceInformation.Target =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceReferenceInformation.Target) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceReferenceInformationTargetSurrogate.fromModel(value),
    )
  }
}

public object SubstanceReferenceInformationSerializer : KSerializer<SubstanceReferenceInformation> {
  internal val surrogateSerializer: KSerializer<SubstanceReferenceInformationSurrogate> by lazy {
    SubstanceReferenceInformationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubstanceReferenceInformation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceReferenceInformation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceReferenceInformation) {
    surrogateSerializer.serialize(encoder, SubstanceReferenceInformationSurrogate.fromModel(value))
  }
}
