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

import com.google.fhir.model.r4.SubstanceAmount
import com.google.fhir.model.r4.surrogates.SubstanceAmountReferenceRangeSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceAmountSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SubstanceAmountReferenceRangeSerializer :
  KSerializer<SubstanceAmount.ReferenceRange> {
  internal val surrogateSerializer: KSerializer<SubstanceAmountReferenceRangeSurrogate> by lazy {
    SubstanceAmountReferenceRangeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ReferenceRange", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceAmount.ReferenceRange =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceAmount.ReferenceRange) {
    surrogateSerializer.serialize(encoder, SubstanceAmountReferenceRangeSurrogate.fromModel(value))
  }
}

public object SubstanceAmountSerializer : KSerializer<SubstanceAmount> {
  internal val surrogateSerializer: KSerializer<SubstanceAmountSurrogate> by lazy {
    SubstanceAmountSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubstanceAmount", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceAmount =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceAmount) {
    surrogateSerializer.serialize(encoder, SubstanceAmountSurrogate.fromModel(value))
  }
}
