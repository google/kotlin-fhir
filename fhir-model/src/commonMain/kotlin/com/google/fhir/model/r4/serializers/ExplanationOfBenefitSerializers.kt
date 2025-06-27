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

import com.google.fhir.model.r4.ExplanationOfBenefit
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitAccidentSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitAddItemDetailSubDetailSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitAddItemDetailSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitAddItemSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitBenefitBalanceFinancialSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitBenefitBalanceSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitCareTeamSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitDiagnosisSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitInsuranceSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitItemAdjudicationSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitItemDetailSubDetailSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitItemDetailSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitItemSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitPayeeSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitPaymentSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitProcedureSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitProcessNoteSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitRelatedSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitSupportingInfoSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitSurrogate
import com.google.fhir.model.r4.surrogates.ExplanationOfBenefitTotalSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ExplanationOfBenefitRelatedSerializer : KSerializer<ExplanationOfBenefit.Related> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitRelatedSurrogate> by lazy {
    ExplanationOfBenefitRelatedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Related", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Related =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Related) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitRelatedSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitPayeeSerializer : KSerializer<ExplanationOfBenefit.Payee> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitPayeeSurrogate> by lazy {
    ExplanationOfBenefitPayeeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Payee", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Payee =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Payee) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitPayeeSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitCareTeamSerializer : KSerializer<ExplanationOfBenefit.CareTeam> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitCareTeamSurrogate> by lazy {
    ExplanationOfBenefitCareTeamSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CareTeam", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.CareTeam =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.CareTeam) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitCareTeamSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitSupportingInfoSerializer :
  KSerializer<ExplanationOfBenefit.SupportingInfo> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitSupportingInfoSurrogate> by lazy {
    ExplanationOfBenefitSupportingInfoSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupportingInfo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.SupportingInfo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.SupportingInfo) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitSupportingInfoSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitDiagnosisSerializer :
  KSerializer<ExplanationOfBenefit.Diagnosis> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitDiagnosisSurrogate> by lazy {
    ExplanationOfBenefitDiagnosisSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Diagnosis", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Diagnosis =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Diagnosis) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitDiagnosisSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitProcedureSerializer :
  KSerializer<ExplanationOfBenefit.Procedure> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitProcedureSurrogate> by lazy {
    ExplanationOfBenefitProcedureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Procedure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Procedure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Procedure) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitProcedureSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitInsuranceSerializer :
  KSerializer<ExplanationOfBenefit.Insurance> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitInsuranceSurrogate> by lazy {
    ExplanationOfBenefitInsuranceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Insurance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Insurance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Insurance) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitInsuranceSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitAccidentSerializer : KSerializer<ExplanationOfBenefit.Accident> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitAccidentSurrogate> by lazy {
    ExplanationOfBenefitAccidentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Accident", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Accident =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Accident) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitAccidentSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitItemAdjudicationSerializer :
  KSerializer<ExplanationOfBenefit.Item.Adjudication> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitItemAdjudicationSurrogate> by lazy {
    ExplanationOfBenefitItemAdjudicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Adjudication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Item.Adjudication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Item.Adjudication) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitItemAdjudicationSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitItemDetailSubDetailSerializer :
  KSerializer<ExplanationOfBenefit.Item.Detail.SubDetail> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitItemDetailSubDetailSurrogate> by lazy {
    ExplanationOfBenefitItemDetailSubDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubDetail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Item.Detail.SubDetail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Item.Detail.SubDetail) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitItemDetailSubDetailSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitItemDetailSerializer :
  KSerializer<ExplanationOfBenefit.Item.Detail> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitItemDetailSurrogate> by lazy {
    ExplanationOfBenefitItemDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Item.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Item.Detail) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitItemDetailSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitItemSerializer : KSerializer<ExplanationOfBenefit.Item> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitItemSurrogate> by lazy {
    ExplanationOfBenefitItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Item) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitItemSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitAddItemDetailSubDetailSerializer :
  KSerializer<ExplanationOfBenefit.AddItem.Detail.SubDetail> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitAddItemDetailSubDetailSurrogate> by lazy {
    ExplanationOfBenefitAddItemDetailSubDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubDetail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.AddItem.Detail.SubDetail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.AddItem.Detail.SubDetail) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitAddItemDetailSubDetailSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitAddItemDetailSerializer :
  KSerializer<ExplanationOfBenefit.AddItem.Detail> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitAddItemDetailSurrogate> by lazy {
    ExplanationOfBenefitAddItemDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.AddItem.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.AddItem.Detail) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitAddItemDetailSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitAddItemSerializer : KSerializer<ExplanationOfBenefit.AddItem> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitAddItemSurrogate> by lazy {
    ExplanationOfBenefitAddItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AddItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.AddItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.AddItem) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitAddItemSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitTotalSerializer : KSerializer<ExplanationOfBenefit.Total> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitTotalSurrogate> by lazy {
    ExplanationOfBenefitTotalSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Total", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Total =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Total) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitTotalSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitPaymentSerializer : KSerializer<ExplanationOfBenefit.Payment> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitPaymentSurrogate> by lazy {
    ExplanationOfBenefitPaymentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Payment", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.Payment =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.Payment) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitPaymentSurrogate.fromModel(value))
  }
}

public object ExplanationOfBenefitProcessNoteSerializer :
  KSerializer<ExplanationOfBenefit.ProcessNote> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitProcessNoteSurrogate> by lazy {
    ExplanationOfBenefitProcessNoteSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ProcessNote", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.ProcessNote =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.ProcessNote) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitProcessNoteSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitBenefitBalanceFinancialSerializer :
  KSerializer<ExplanationOfBenefit.BenefitBalance.Financial> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitBenefitBalanceFinancialSurrogate> by lazy {
    ExplanationOfBenefitBenefitBalanceFinancialSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Financial", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.BenefitBalance.Financial =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.BenefitBalance.Financial) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitBenefitBalanceFinancialSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitBenefitBalanceSerializer :
  KSerializer<ExplanationOfBenefit.BenefitBalance> {
  internal val surrogateSerializer:
    KSerializer<ExplanationOfBenefitBenefitBalanceSurrogate> by lazy {
    ExplanationOfBenefitBenefitBalanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("BenefitBalance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit.BenefitBalance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit.BenefitBalance) {
    surrogateSerializer.serialize(
      encoder,
      ExplanationOfBenefitBenefitBalanceSurrogate.fromModel(value),
    )
  }
}

public object ExplanationOfBenefitSerializer : KSerializer<ExplanationOfBenefit> {
  internal val surrogateSerializer: KSerializer<ExplanationOfBenefitSurrogate> by lazy {
    ExplanationOfBenefitSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ExplanationOfBenefit", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ExplanationOfBenefit =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ExplanationOfBenefit) {
    surrogateSerializer.serialize(encoder, ExplanationOfBenefitSurrogate.fromModel(value))
  }
}
