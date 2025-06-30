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

import com.google.fhir.model.r4b.CarePlan
import com.google.fhir.model.r4b.surrogates.CarePlanActivityDetailSurrogate
import com.google.fhir.model.r4b.surrogates.CarePlanActivitySurrogate
import com.google.fhir.model.r4b.surrogates.CarePlanSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CarePlanActivityDetailSerializer : KSerializer<CarePlan.Activity.Detail> {
  internal val surrogateSerializer: KSerializer<CarePlanActivityDetailSurrogate> by lazy {
    CarePlanActivityDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CarePlan.Activity.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CarePlan.Activity.Detail) {
    surrogateSerializer.serialize(encoder, CarePlanActivityDetailSurrogate.fromModel(value))
  }
}

public object CarePlanActivitySerializer : KSerializer<CarePlan.Activity> {
  internal val surrogateSerializer: KSerializer<CarePlanActivitySurrogate> by lazy {
    CarePlanActivitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Activity", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CarePlan.Activity =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CarePlan.Activity) {
    surrogateSerializer.serialize(encoder, CarePlanActivitySurrogate.fromModel(value))
  }
}

public object CarePlanSerializer : KSerializer<CarePlan> {
  internal val surrogateSerializer: KSerializer<CarePlanSurrogate> by lazy {
    CarePlanSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CarePlan", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CarePlan =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CarePlan) {
    surrogateSerializer.serialize(encoder, CarePlanSurrogate.fromModel(value))
  }
}
