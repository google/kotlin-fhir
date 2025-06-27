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

import com.google.fhir.model.r4.Contract
import com.google.fhir.model.r4.surrogates.ContractContentDefinitionSurrogate
import com.google.fhir.model.r4.surrogates.ContractFriendlySurrogate
import com.google.fhir.model.r4.surrogates.ContractLegalSurrogate
import com.google.fhir.model.r4.surrogates.ContractRuleSurrogate
import com.google.fhir.model.r4.surrogates.ContractSignerSurrogate
import com.google.fhir.model.r4.surrogates.ContractSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermActionSubjectSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermActionSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermAssetContextSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermAssetSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermAssetValuedItemSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermOfferAnswerSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermOfferPartySurrogate
import com.google.fhir.model.r4.surrogates.ContractTermOfferSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermSecurityLabelSurrogate
import com.google.fhir.model.r4.surrogates.ContractTermSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ContractContentDefinitionSerializer : KSerializer<Contract.ContentDefinition> {
  internal val surrogateSerializer: KSerializer<ContractContentDefinitionSurrogate> by lazy {
    ContractContentDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ContentDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.ContentDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.ContentDefinition) {
    surrogateSerializer.serialize(encoder, ContractContentDefinitionSurrogate.fromModel(value))
  }
}

public object ContractTermSecurityLabelSerializer : KSerializer<Contract.Term.SecurityLabel> {
  internal val surrogateSerializer: KSerializer<ContractTermSecurityLabelSurrogate> by lazy {
    ContractTermSecurityLabelSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SecurityLabel", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.SecurityLabel =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.SecurityLabel) {
    surrogateSerializer.serialize(encoder, ContractTermSecurityLabelSurrogate.fromModel(value))
  }
}

public object ContractTermOfferPartySerializer : KSerializer<Contract.Term.Offer.Party> {
  internal val surrogateSerializer: KSerializer<ContractTermOfferPartySurrogate> by lazy {
    ContractTermOfferPartySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Party", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Offer.Party =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Offer.Party) {
    surrogateSerializer.serialize(encoder, ContractTermOfferPartySurrogate.fromModel(value))
  }
}

public object ContractTermOfferAnswerSerializer : KSerializer<Contract.Term.Offer.Answer> {
  internal val surrogateSerializer: KSerializer<ContractTermOfferAnswerSurrogate> by lazy {
    ContractTermOfferAnswerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Answer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Offer.Answer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Offer.Answer) {
    surrogateSerializer.serialize(encoder, ContractTermOfferAnswerSurrogate.fromModel(value))
  }
}

public object ContractTermOfferSerializer : KSerializer<Contract.Term.Offer> {
  internal val surrogateSerializer: KSerializer<ContractTermOfferSurrogate> by lazy {
    ContractTermOfferSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Offer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Offer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Offer) {
    surrogateSerializer.serialize(encoder, ContractTermOfferSurrogate.fromModel(value))
  }
}

public object ContractTermAssetContextSerializer : KSerializer<Contract.Term.Asset.Context> {
  internal val surrogateSerializer: KSerializer<ContractTermAssetContextSurrogate> by lazy {
    ContractTermAssetContextSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Context", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Asset.Context =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Asset.Context) {
    surrogateSerializer.serialize(encoder, ContractTermAssetContextSurrogate.fromModel(value))
  }
}

public object ContractTermAssetValuedItemSerializer : KSerializer<Contract.Term.Asset.ValuedItem> {
  internal val surrogateSerializer: KSerializer<ContractTermAssetValuedItemSurrogate> by lazy {
    ContractTermAssetValuedItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ValuedItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Asset.ValuedItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Asset.ValuedItem) {
    surrogateSerializer.serialize(encoder, ContractTermAssetValuedItemSurrogate.fromModel(value))
  }
}

public object ContractTermAssetSerializer : KSerializer<Contract.Term.Asset> {
  internal val surrogateSerializer: KSerializer<ContractTermAssetSurrogate> by lazy {
    ContractTermAssetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Asset", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Asset =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Asset) {
    surrogateSerializer.serialize(encoder, ContractTermAssetSurrogate.fromModel(value))
  }
}

public object ContractTermActionSubjectSerializer : KSerializer<Contract.Term.Action.Subject> {
  internal val surrogateSerializer: KSerializer<ContractTermActionSubjectSurrogate> by lazy {
    ContractTermActionSubjectSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Subject", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Action.Subject =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Action.Subject) {
    surrogateSerializer.serialize(encoder, ContractTermActionSubjectSurrogate.fromModel(value))
  }
}

public object ContractTermActionSerializer : KSerializer<Contract.Term.Action> {
  internal val surrogateSerializer: KSerializer<ContractTermActionSurrogate> by lazy {
    ContractTermActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Action", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term.Action =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term.Action) {
    surrogateSerializer.serialize(encoder, ContractTermActionSurrogate.fromModel(value))
  }
}

public object ContractTermSerializer : KSerializer<Contract.Term> {
  internal val surrogateSerializer: KSerializer<ContractTermSurrogate> by lazy {
    ContractTermSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Term", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Term =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Term) {
    surrogateSerializer.serialize(encoder, ContractTermSurrogate.fromModel(value))
  }
}

public object ContractSignerSerializer : KSerializer<Contract.Signer> {
  internal val surrogateSerializer: KSerializer<ContractSignerSurrogate> by lazy {
    ContractSignerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Signer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Signer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Signer) {
    surrogateSerializer.serialize(encoder, ContractSignerSurrogate.fromModel(value))
  }
}

public object ContractFriendlySerializer : KSerializer<Contract.Friendly> {
  internal val surrogateSerializer: KSerializer<ContractFriendlySurrogate> by lazy {
    ContractFriendlySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Friendly", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Friendly =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Friendly) {
    surrogateSerializer.serialize(encoder, ContractFriendlySurrogate.fromModel(value))
  }
}

public object ContractLegalSerializer : KSerializer<Contract.Legal> {
  internal val surrogateSerializer: KSerializer<ContractLegalSurrogate> by lazy {
    ContractLegalSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Legal", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Legal =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Legal) {
    surrogateSerializer.serialize(encoder, ContractLegalSurrogate.fromModel(value))
  }
}

public object ContractRuleSerializer : KSerializer<Contract.Rule> {
  internal val surrogateSerializer: KSerializer<ContractRuleSurrogate> by lazy {
    ContractRuleSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Rule", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract.Rule =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract.Rule) {
    surrogateSerializer.serialize(encoder, ContractRuleSurrogate.fromModel(value))
  }
}

public object ContractSerializer : KSerializer<Contract> {
  internal val surrogateSerializer: KSerializer<ContractSurrogate> by lazy {
    ContractSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Contract", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Contract =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Contract) {
    surrogateSerializer.serialize(encoder, ContractSurrogate.fromModel(value))
  }
}
