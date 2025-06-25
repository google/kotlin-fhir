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

import com.google.fhir.model.r4.Claim
import com.google.fhir.model.r4.surrogates.ClaimAccidentSurrogate
import com.google.fhir.model.r4.surrogates.ClaimCareTeamSurrogate
import com.google.fhir.model.r4.surrogates.ClaimDiagnosisSurrogate
import com.google.fhir.model.r4.surrogates.ClaimInsuranceSurrogate
import com.google.fhir.model.r4.surrogates.ClaimItemDetailSubDetailSurrogate
import com.google.fhir.model.r4.surrogates.ClaimItemDetailSurrogate
import com.google.fhir.model.r4.surrogates.ClaimItemSurrogate
import com.google.fhir.model.r4.surrogates.ClaimPayeeSurrogate
import com.google.fhir.model.r4.surrogates.ClaimProcedureSurrogate
import com.google.fhir.model.r4.surrogates.ClaimRelatedSurrogate
import com.google.fhir.model.r4.surrogates.ClaimSupportingInfoSurrogate
import com.google.fhir.model.r4.surrogates.ClaimSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ClaimRelatedSerializer : KSerializer<Claim.Related> {
  internal val surrogateSerializer: KSerializer<ClaimRelatedSurrogate> by lazy {
    ClaimRelatedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Related", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Related =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Related) {
    surrogateSerializer.serialize(encoder, ClaimRelatedSurrogate.fromModel(value))
  }
}

public object ClaimPayeeSerializer : KSerializer<Claim.Payee> {
  internal val surrogateSerializer: KSerializer<ClaimPayeeSurrogate> by lazy {
    ClaimPayeeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Payee", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Payee =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Payee) {
    surrogateSerializer.serialize(encoder, ClaimPayeeSurrogate.fromModel(value))
  }
}

public object ClaimCareTeamSerializer : KSerializer<Claim.CareTeam> {
  internal val surrogateSerializer: KSerializer<ClaimCareTeamSurrogate> by lazy {
    ClaimCareTeamSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CareTeam", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.CareTeam =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.CareTeam) {
    surrogateSerializer.serialize(encoder, ClaimCareTeamSurrogate.fromModel(value))
  }
}

public object ClaimSupportingInfoSerializer : KSerializer<Claim.SupportingInfo> {
  internal val surrogateSerializer: KSerializer<ClaimSupportingInfoSurrogate> by lazy {
    ClaimSupportingInfoSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupportingInfo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.SupportingInfo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.SupportingInfo) {
    surrogateSerializer.serialize(encoder, ClaimSupportingInfoSurrogate.fromModel(value))
  }
}

public object ClaimDiagnosisSerializer : KSerializer<Claim.Diagnosis> {
  internal val surrogateSerializer: KSerializer<ClaimDiagnosisSurrogate> by lazy {
    ClaimDiagnosisSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Diagnosis", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Diagnosis =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Diagnosis) {
    surrogateSerializer.serialize(encoder, ClaimDiagnosisSurrogate.fromModel(value))
  }
}

public object ClaimProcedureSerializer : KSerializer<Claim.Procedure> {
  internal val surrogateSerializer: KSerializer<ClaimProcedureSurrogate> by lazy {
    ClaimProcedureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Procedure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Procedure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Procedure) {
    surrogateSerializer.serialize(encoder, ClaimProcedureSurrogate.fromModel(value))
  }
}

public object ClaimInsuranceSerializer : KSerializer<Claim.Insurance> {
  internal val surrogateSerializer: KSerializer<ClaimInsuranceSurrogate> by lazy {
    ClaimInsuranceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Insurance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Insurance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Insurance) {
    surrogateSerializer.serialize(encoder, ClaimInsuranceSurrogate.fromModel(value))
  }
}

public object ClaimAccidentSerializer : KSerializer<Claim.Accident> {
  internal val surrogateSerializer: KSerializer<ClaimAccidentSurrogate> by lazy {
    ClaimAccidentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Accident", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Accident =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Accident) {
    surrogateSerializer.serialize(encoder, ClaimAccidentSurrogate.fromModel(value))
  }
}

public object ClaimItemDetailSubDetailSerializer : KSerializer<Claim.Item.Detail.SubDetail> {
  internal val surrogateSerializer: KSerializer<ClaimItemDetailSubDetailSurrogate> by lazy {
    ClaimItemDetailSubDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubDetail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Item.Detail.SubDetail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Item.Detail.SubDetail) {
    surrogateSerializer.serialize(encoder, ClaimItemDetailSubDetailSurrogate.fromModel(value))
  }
}

public object ClaimItemDetailSerializer : KSerializer<Claim.Item.Detail> {
  internal val surrogateSerializer: KSerializer<ClaimItemDetailSurrogate> by lazy {
    ClaimItemDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Item.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Item.Detail) {
    surrogateSerializer.serialize(encoder, ClaimItemDetailSurrogate.fromModel(value))
  }
}

public object ClaimItemSerializer : KSerializer<Claim.Item> {
  internal val surrogateSerializer: KSerializer<ClaimItemSurrogate> by lazy {
    ClaimItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim.Item) {
    surrogateSerializer.serialize(encoder, ClaimItemSurrogate.fromModel(value))
  }
}

public object ClaimSerializer : KSerializer<Claim> {
  internal val surrogateSerializer: KSerializer<ClaimSurrogate> by lazy {
    ClaimSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Claim", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Claim =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Claim) {
    surrogateSerializer.serialize(encoder, ClaimSurrogate.fromModel(value))
  }
}
