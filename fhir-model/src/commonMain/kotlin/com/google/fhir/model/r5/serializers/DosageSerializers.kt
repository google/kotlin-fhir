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

import com.google.fhir.model.r5.Dosage
import com.google.fhir.model.r5.surrogates.DosageDoseAndRateSurrogate
import com.google.fhir.model.r5.surrogates.DosageSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DosageDoseAndRateSerializer : KSerializer<Dosage.DoseAndRate> {
  internal val surrogateSerializer: KSerializer<DosageDoseAndRateSurrogate> by lazy {
    DosageDoseAndRateSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DoseAndRate", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Dosage.DoseAndRate =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Dosage.DoseAndRate) {
    surrogateSerializer.serialize(encoder, DosageDoseAndRateSurrogate.fromModel(value))
  }
}

public object DosageSerializer : KSerializer<Dosage> {
  internal val surrogateSerializer: KSerializer<DosageSurrogate> by lazy {
    DosageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Dosage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Dosage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Dosage) {
    surrogateSerializer.serialize(encoder, DosageSurrogate.fromModel(value))
  }
}
