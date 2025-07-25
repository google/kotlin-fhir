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

import com.google.fhir.model.r5.ServiceRequest
import com.google.fhir.model.r5.surrogates.ServiceRequestOrderDetailParameterSurrogate
import com.google.fhir.model.r5.surrogates.ServiceRequestOrderDetailSurrogate
import com.google.fhir.model.r5.surrogates.ServiceRequestPatientInstructionSurrogate
import com.google.fhir.model.r5.surrogates.ServiceRequestSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ServiceRequestOrderDetailParameterSerializer :
  KSerializer<ServiceRequest.OrderDetail.Parameter> {
  internal val surrogateSerializer:
    KSerializer<ServiceRequestOrderDetailParameterSurrogate> by lazy {
    ServiceRequestOrderDetailParameterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Parameter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ServiceRequest.OrderDetail.Parameter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ServiceRequest.OrderDetail.Parameter) {
    surrogateSerializer.serialize(
      encoder,
      ServiceRequestOrderDetailParameterSurrogate.fromModel(value),
    )
  }
}

public object ServiceRequestOrderDetailSerializer : KSerializer<ServiceRequest.OrderDetail> {
  internal val surrogateSerializer: KSerializer<ServiceRequestOrderDetailSurrogate> by lazy {
    ServiceRequestOrderDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("OrderDetail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ServiceRequest.OrderDetail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ServiceRequest.OrderDetail) {
    surrogateSerializer.serialize(encoder, ServiceRequestOrderDetailSurrogate.fromModel(value))
  }
}

public object ServiceRequestPatientInstructionSerializer :
  KSerializer<ServiceRequest.PatientInstruction> {
  internal val surrogateSerializer: KSerializer<ServiceRequestPatientInstructionSurrogate> by lazy {
    ServiceRequestPatientInstructionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PatientInstruction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ServiceRequest.PatientInstruction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ServiceRequest.PatientInstruction) {
    surrogateSerializer.serialize(
      encoder,
      ServiceRequestPatientInstructionSurrogate.fromModel(value),
    )
  }
}

public object ServiceRequestSerializer : KSerializer<ServiceRequest> {
  internal val surrogateSerializer: KSerializer<ServiceRequestSurrogate> by lazy {
    ServiceRequestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ServiceRequest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ServiceRequest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ServiceRequest) {
    surrogateSerializer.serialize(encoder, ServiceRequestSurrogate.fromModel(value))
  }
}
