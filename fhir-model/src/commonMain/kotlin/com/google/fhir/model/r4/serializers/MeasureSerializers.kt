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

package com.google.fhir.model.r4.serializers

import com.google.fhir.model.r4.Measure
import com.google.fhir.model.r4.surrogates.MeasureGroupPopulationSurrogate
import com.google.fhir.model.r4.surrogates.MeasureGroupStratifierComponentSurrogate
import com.google.fhir.model.r4.surrogates.MeasureGroupStratifierSurrogate
import com.google.fhir.model.r4.surrogates.MeasureGroupSurrogate
import com.google.fhir.model.r4.surrogates.MeasureSupplementalDataSurrogate
import com.google.fhir.model.r4.surrogates.MeasureSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MeasureGroupPopulationSerializer : KSerializer<Measure.Group.Population> {
  internal val surrogateSerializer: KSerializer<MeasureGroupPopulationSurrogate> by lazy {
    MeasureGroupPopulationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Population", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Measure.Group.Population =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Measure.Group.Population) {
    surrogateSerializer.serialize(encoder, MeasureGroupPopulationSurrogate.fromModel(value))
  }
}

public object MeasureGroupStratifierComponentSerializer :
  KSerializer<Measure.Group.Stratifier.Component> {
  internal val surrogateSerializer: KSerializer<MeasureGroupStratifierComponentSurrogate> by lazy {
    MeasureGroupStratifierComponentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Component", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Measure.Group.Stratifier.Component =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Measure.Group.Stratifier.Component) {
    surrogateSerializer.serialize(
      encoder,
      MeasureGroupStratifierComponentSurrogate.fromModel(value),
    )
  }
}

public object MeasureGroupStratifierSerializer : KSerializer<Measure.Group.Stratifier> {
  internal val surrogateSerializer: KSerializer<MeasureGroupStratifierSurrogate> by lazy {
    MeasureGroupStratifierSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Stratifier", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Measure.Group.Stratifier =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Measure.Group.Stratifier) {
    surrogateSerializer.serialize(encoder, MeasureGroupStratifierSurrogate.fromModel(value))
  }
}

public object MeasureGroupSerializer : KSerializer<Measure.Group> {
  internal val surrogateSerializer: KSerializer<MeasureGroupSurrogate> by lazy {
    MeasureGroupSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Group", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Measure.Group =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Measure.Group) {
    surrogateSerializer.serialize(encoder, MeasureGroupSurrogate.fromModel(value))
  }
}

public object MeasureSupplementalDataSerializer : KSerializer<Measure.SupplementalData> {
  internal val surrogateSerializer: KSerializer<MeasureSupplementalDataSurrogate> by lazy {
    MeasureSupplementalDataSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupplementalData", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Measure.SupplementalData =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Measure.SupplementalData) {
    surrogateSerializer.serialize(encoder, MeasureSupplementalDataSurrogate.fromModel(value))
  }
}

public object MeasureSerializer : KSerializer<Measure> {
  internal val surrogateSerializer: KSerializer<MeasureSurrogate> by lazy {
    MeasureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Measure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Measure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Measure) {
    surrogateSerializer.serialize(encoder, MeasureSurrogate.fromModel(value))
  }
}
