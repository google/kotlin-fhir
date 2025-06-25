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

import com.google.fhir.model.r4.CoverageEligibilityRequest
import com.google.fhir.model.r4.surrogates.CoverageEligibilityRequestInsuranceSurrogate
import com.google.fhir.model.r4.surrogates.CoverageEligibilityRequestItemDiagnosisSurrogate
import com.google.fhir.model.r4.surrogates.CoverageEligibilityRequestItemSurrogate
import com.google.fhir.model.r4.surrogates.CoverageEligibilityRequestSupportingInfoSurrogate
import com.google.fhir.model.r4.surrogates.CoverageEligibilityRequestSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CoverageEligibilityRequestSupportingInfoSerializer :
  KSerializer<CoverageEligibilityRequest.SupportingInfo> {
  internal val surrogateSerializer:
    KSerializer<CoverageEligibilityRequestSupportingInfoSurrogate> by lazy {
    CoverageEligibilityRequestSupportingInfoSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupportingInfo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityRequest.SupportingInfo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityRequest.SupportingInfo) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityRequestSupportingInfoSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityRequestInsuranceSerializer :
  KSerializer<CoverageEligibilityRequest.Insurance> {
  internal val surrogateSerializer:
    KSerializer<CoverageEligibilityRequestInsuranceSurrogate> by lazy {
    CoverageEligibilityRequestInsuranceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Insurance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityRequest.Insurance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityRequest.Insurance) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityRequestInsuranceSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityRequestItemDiagnosisSerializer :
  KSerializer<CoverageEligibilityRequest.Item.Diagnosis> {
  internal val surrogateSerializer:
    KSerializer<CoverageEligibilityRequestItemDiagnosisSurrogate> by lazy {
    CoverageEligibilityRequestItemDiagnosisSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Diagnosis", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityRequest.Item.Diagnosis =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityRequest.Item.Diagnosis) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityRequestItemDiagnosisSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityRequestItemSerializer :
  KSerializer<CoverageEligibilityRequest.Item> {
  internal val surrogateSerializer: KSerializer<CoverageEligibilityRequestItemSurrogate> by lazy {
    CoverageEligibilityRequestItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityRequest.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityRequest.Item) {
    surrogateSerializer.serialize(encoder, CoverageEligibilityRequestItemSurrogate.fromModel(value))
  }
}

public object CoverageEligibilityRequestSerializer : KSerializer<CoverageEligibilityRequest> {
  internal val surrogateSerializer: KSerializer<CoverageEligibilityRequestSurrogate> by lazy {
    CoverageEligibilityRequestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CoverageEligibilityRequest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityRequest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityRequest) {
    surrogateSerializer.serialize(encoder, CoverageEligibilityRequestSurrogate.fromModel(value))
  }
}
