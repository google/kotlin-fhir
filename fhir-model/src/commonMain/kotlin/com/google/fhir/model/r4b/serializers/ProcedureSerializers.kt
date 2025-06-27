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

import com.google.fhir.model.r4b.Procedure
import com.google.fhir.model.r4b.surrogates.ProcedureFocalDeviceSurrogate
import com.google.fhir.model.r4b.surrogates.ProcedurePerformerSurrogate
import com.google.fhir.model.r4b.surrogates.ProcedureSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ProcedurePerformerSerializer : KSerializer<Procedure.Performer> {
  internal val surrogateSerializer: KSerializer<ProcedurePerformerSurrogate> by lazy {
    ProcedurePerformerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Procedure.Performer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Procedure.Performer) {
    surrogateSerializer.serialize(encoder, ProcedurePerformerSurrogate.fromModel(value))
  }
}

public object ProcedureFocalDeviceSerializer : KSerializer<Procedure.FocalDevice> {
  internal val surrogateSerializer: KSerializer<ProcedureFocalDeviceSurrogate> by lazy {
    ProcedureFocalDeviceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("FocalDevice", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Procedure.FocalDevice =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Procedure.FocalDevice) {
    surrogateSerializer.serialize(encoder, ProcedureFocalDeviceSurrogate.fromModel(value))
  }
}

public object ProcedureSerializer : KSerializer<Procedure> {
  internal val surrogateSerializer: KSerializer<ProcedureSurrogate> by lazy {
    ProcedureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Procedure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Procedure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Procedure) {
    surrogateSerializer.serialize(encoder, ProcedureSurrogate.fromModel(value))
  }
}
