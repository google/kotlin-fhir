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

import com.google.fhir.model.r5.ClinicalUseDefinition
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionContraindicationOtherTherapySurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionContraindicationSurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionIndicationSurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionInteractionInteractantSurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionInteractionSurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionSurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionUndesirableEffectSurrogate
import com.google.fhir.model.r5.surrogates.ClinicalUseDefinitionWarningSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ClinicalUseDefinitionContraindicationOtherTherapySerializer :
  KSerializer<ClinicalUseDefinition.Contraindication.OtherTherapy> {
  internal val surrogateSerializer:
    KSerializer<ClinicalUseDefinitionContraindicationOtherTherapySurrogate> by lazy {
    ClinicalUseDefinitionContraindicationOtherTherapySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("OtherTherapy", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.Contraindication.OtherTherapy =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: ClinicalUseDefinition.Contraindication.OtherTherapy,
  ) {
    surrogateSerializer.serialize(
      encoder,
      ClinicalUseDefinitionContraindicationOtherTherapySurrogate.fromModel(value),
    )
  }
}

public object ClinicalUseDefinitionContraindicationSerializer :
  KSerializer<ClinicalUseDefinition.Contraindication> {
  internal val surrogateSerializer:
    KSerializer<ClinicalUseDefinitionContraindicationSurrogate> by lazy {
    ClinicalUseDefinitionContraindicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Contraindication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.Contraindication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition.Contraindication) {
    surrogateSerializer.serialize(
      encoder,
      ClinicalUseDefinitionContraindicationSurrogate.fromModel(value),
    )
  }
}

public object ClinicalUseDefinitionIndicationSerializer :
  KSerializer<ClinicalUseDefinition.Indication> {
  internal val surrogateSerializer: KSerializer<ClinicalUseDefinitionIndicationSurrogate> by lazy {
    ClinicalUseDefinitionIndicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Indication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.Indication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition.Indication) {
    surrogateSerializer.serialize(
      encoder,
      ClinicalUseDefinitionIndicationSurrogate.fromModel(value),
    )
  }
}

public object ClinicalUseDefinitionInteractionInteractantSerializer :
  KSerializer<ClinicalUseDefinition.Interaction.Interactant> {
  internal val surrogateSerializer:
    KSerializer<ClinicalUseDefinitionInteractionInteractantSurrogate> by lazy {
    ClinicalUseDefinitionInteractionInteractantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Interactant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.Interaction.Interactant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition.Interaction.Interactant) {
    surrogateSerializer.serialize(
      encoder,
      ClinicalUseDefinitionInteractionInteractantSurrogate.fromModel(value),
    )
  }
}

public object ClinicalUseDefinitionInteractionSerializer :
  KSerializer<ClinicalUseDefinition.Interaction> {
  internal val surrogateSerializer: KSerializer<ClinicalUseDefinitionInteractionSurrogate> by lazy {
    ClinicalUseDefinitionInteractionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Interaction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.Interaction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition.Interaction) {
    surrogateSerializer.serialize(
      encoder,
      ClinicalUseDefinitionInteractionSurrogate.fromModel(value),
    )
  }
}

public object ClinicalUseDefinitionUndesirableEffectSerializer :
  KSerializer<ClinicalUseDefinition.UndesirableEffect> {
  internal val surrogateSerializer:
    KSerializer<ClinicalUseDefinitionUndesirableEffectSurrogate> by lazy {
    ClinicalUseDefinitionUndesirableEffectSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("UndesirableEffect", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.UndesirableEffect =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition.UndesirableEffect) {
    surrogateSerializer.serialize(
      encoder,
      ClinicalUseDefinitionUndesirableEffectSurrogate.fromModel(value),
    )
  }
}

public object ClinicalUseDefinitionWarningSerializer : KSerializer<ClinicalUseDefinition.Warning> {
  internal val surrogateSerializer: KSerializer<ClinicalUseDefinitionWarningSurrogate> by lazy {
    ClinicalUseDefinitionWarningSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Warning", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition.Warning =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition.Warning) {
    surrogateSerializer.serialize(encoder, ClinicalUseDefinitionWarningSurrogate.fromModel(value))
  }
}

public object ClinicalUseDefinitionSerializer : KSerializer<ClinicalUseDefinition> {
  internal val surrogateSerializer: KSerializer<ClinicalUseDefinitionSurrogate> by lazy {
    ClinicalUseDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ClinicalUseDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClinicalUseDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClinicalUseDefinition) {
    surrogateSerializer.serialize(encoder, ClinicalUseDefinitionSurrogate.fromModel(value))
  }
}
