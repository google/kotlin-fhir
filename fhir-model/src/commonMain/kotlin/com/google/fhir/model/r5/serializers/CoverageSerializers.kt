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

import com.google.fhir.model.r5.Coverage
import com.google.fhir.model.r5.surrogates.CoverageClassSurrogate
import com.google.fhir.model.r5.surrogates.CoverageCostToBeneficiaryExceptionSurrogate
import com.google.fhir.model.r5.surrogates.CoverageCostToBeneficiarySurrogate
import com.google.fhir.model.r5.surrogates.CoveragePaymentBySurrogate
import com.google.fhir.model.r5.surrogates.CoverageSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CoveragePaymentBySerializer : KSerializer<Coverage.PaymentBy> {
  internal val surrogateSerializer: KSerializer<CoveragePaymentBySurrogate> by lazy {
    CoveragePaymentBySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PaymentBy", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Coverage.PaymentBy =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Coverage.PaymentBy) {
    surrogateSerializer.serialize(encoder, CoveragePaymentBySurrogate.fromModel(value))
  }
}

public object CoverageClassSerializer : KSerializer<Coverage.Class> {
  internal val surrogateSerializer: KSerializer<CoverageClassSurrogate> by lazy {
    CoverageClassSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Class", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Coverage.Class =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Coverage.Class) {
    surrogateSerializer.serialize(encoder, CoverageClassSurrogate.fromModel(value))
  }
}

public object CoverageCostToBeneficiaryExceptionSerializer :
  KSerializer<Coverage.CostToBeneficiary.Exception> {
  internal val surrogateSerializer:
    KSerializer<CoverageCostToBeneficiaryExceptionSurrogate> by lazy {
    CoverageCostToBeneficiaryExceptionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Exception", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Coverage.CostToBeneficiary.Exception =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Coverage.CostToBeneficiary.Exception) {
    surrogateSerializer.serialize(
      encoder,
      CoverageCostToBeneficiaryExceptionSurrogate.fromModel(value),
    )
  }
}

public object CoverageCostToBeneficiarySerializer : KSerializer<Coverage.CostToBeneficiary> {
  internal val surrogateSerializer: KSerializer<CoverageCostToBeneficiarySurrogate> by lazy {
    CoverageCostToBeneficiarySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CostToBeneficiary", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Coverage.CostToBeneficiary =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Coverage.CostToBeneficiary) {
    surrogateSerializer.serialize(encoder, CoverageCostToBeneficiarySurrogate.fromModel(value))
  }
}

public object CoverageSerializer : KSerializer<Coverage> {
  internal val surrogateSerializer: KSerializer<CoverageSurrogate> by lazy {
    CoverageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Coverage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Coverage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Coverage) {
    surrogateSerializer.serialize(encoder, CoverageSurrogate.fromModel(value))
  }
}
