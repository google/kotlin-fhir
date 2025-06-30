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

import com.google.fhir.model.r5.Observation
import com.google.fhir.model.r5.surrogates.ObservationComponentSurrogate
import com.google.fhir.model.r5.surrogates.ObservationReferenceRangeSurrogate
import com.google.fhir.model.r5.surrogates.ObservationSurrogate
import com.google.fhir.model.r5.surrogates.ObservationTriggeredBySurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ObservationTriggeredBySerializer : KSerializer<Observation.TriggeredBy> {
  internal val surrogateSerializer: KSerializer<ObservationTriggeredBySurrogate> by lazy {
    ObservationTriggeredBySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("TriggeredBy", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Observation.TriggeredBy =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Observation.TriggeredBy) {
    surrogateSerializer.serialize(encoder, ObservationTriggeredBySurrogate.fromModel(value))
  }
}

public object ObservationReferenceRangeSerializer : KSerializer<Observation.ReferenceRange> {
  internal val surrogateSerializer: KSerializer<ObservationReferenceRangeSurrogate> by lazy {
    ObservationReferenceRangeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ReferenceRange", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Observation.ReferenceRange =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Observation.ReferenceRange) {
    surrogateSerializer.serialize(encoder, ObservationReferenceRangeSurrogate.fromModel(value))
  }
}

public object ObservationComponentSerializer : KSerializer<Observation.Component> {
  internal val surrogateSerializer: KSerializer<ObservationComponentSurrogate> by lazy {
    ObservationComponentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Component", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Observation.Component =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Observation.Component) {
    surrogateSerializer.serialize(encoder, ObservationComponentSurrogate.fromModel(value))
  }
}

public object ObservationSerializer : KSerializer<Observation> {
  internal val surrogateSerializer: KSerializer<ObservationSurrogate> by lazy {
    ObservationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Observation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Observation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Observation) {
    surrogateSerializer.serialize(encoder, ObservationSurrogate.fromModel(value))
  }
}
