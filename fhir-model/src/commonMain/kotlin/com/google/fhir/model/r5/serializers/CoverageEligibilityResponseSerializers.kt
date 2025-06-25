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

import com.google.fhir.model.r5.CoverageEligibilityResponse
import com.google.fhir.model.r5.surrogates.CoverageEligibilityResponseErrorSurrogate
import com.google.fhir.model.r5.surrogates.CoverageEligibilityResponseEventSurrogate
import com.google.fhir.model.r5.surrogates.CoverageEligibilityResponseInsuranceItemBenefitSurrogate
import com.google.fhir.model.r5.surrogates.CoverageEligibilityResponseInsuranceItemSurrogate
import com.google.fhir.model.r5.surrogates.CoverageEligibilityResponseInsuranceSurrogate
import com.google.fhir.model.r5.surrogates.CoverageEligibilityResponseSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CoverageEligibilityResponseEventSerializer :
  KSerializer<CoverageEligibilityResponse.Event> {
  internal val surrogateSerializer: KSerializer<CoverageEligibilityResponseEventSurrogate> by lazy {
    CoverageEligibilityResponseEventSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Event", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityResponse.Event =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityResponse.Event) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityResponseEventSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityResponseInsuranceItemBenefitSerializer :
  KSerializer<CoverageEligibilityResponse.Insurance.Item.Benefit> {
  internal val surrogateSerializer:
    KSerializer<CoverageEligibilityResponseInsuranceItemBenefitSurrogate> by lazy {
    CoverageEligibilityResponseInsuranceItemBenefitSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Benefit", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityResponse.Insurance.Item.Benefit =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: CoverageEligibilityResponse.Insurance.Item.Benefit,
  ) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityResponseInsuranceItemBenefitSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityResponseInsuranceItemSerializer :
  KSerializer<CoverageEligibilityResponse.Insurance.Item> {
  internal val surrogateSerializer:
    KSerializer<CoverageEligibilityResponseInsuranceItemSurrogate> by lazy {
    CoverageEligibilityResponseInsuranceItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityResponse.Insurance.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityResponse.Insurance.Item) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityResponseInsuranceItemSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityResponseInsuranceSerializer :
  KSerializer<CoverageEligibilityResponse.Insurance> {
  internal val surrogateSerializer:
    KSerializer<CoverageEligibilityResponseInsuranceSurrogate> by lazy {
    CoverageEligibilityResponseInsuranceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Insurance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityResponse.Insurance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityResponse.Insurance) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityResponseInsuranceSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityResponseErrorSerializer :
  KSerializer<CoverageEligibilityResponse.Error> {
  internal val surrogateSerializer: KSerializer<CoverageEligibilityResponseErrorSurrogate> by lazy {
    CoverageEligibilityResponseErrorSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Error", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityResponse.Error =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityResponse.Error) {
    surrogateSerializer.serialize(
      encoder,
      CoverageEligibilityResponseErrorSurrogate.fromModel(value),
    )
  }
}

public object CoverageEligibilityResponseSerializer : KSerializer<CoverageEligibilityResponse> {
  internal val surrogateSerializer: KSerializer<CoverageEligibilityResponseSurrogate> by lazy {
    CoverageEligibilityResponseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CoverageEligibilityResponse", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CoverageEligibilityResponse =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CoverageEligibilityResponse) {
    surrogateSerializer.serialize(encoder, CoverageEligibilityResponseSurrogate.fromModel(value))
  }
}
