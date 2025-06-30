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

import com.google.fhir.model.r5.MedicationKnowledge
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeCostSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeDefinitionalIngredientSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeDefinitionalSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeIndicationGuidelineSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeMedicineClassificationSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeMonitoringProgramSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeMonographSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgePackagingSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeRegulatoryMaxDispenseSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeRegulatorySubstitutionSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeRegulatorySurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeRelatedMedicationKnowledgeSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeStorageGuidelineSurrogate
import com.google.fhir.model.r5.surrogates.MedicationKnowledgeSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MedicationKnowledgeRelatedMedicationKnowledgeSerializer :
  KSerializer<MedicationKnowledge.RelatedMedicationKnowledge> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeRelatedMedicationKnowledgeSurrogate> by lazy {
    MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RelatedMedicationKnowledge", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.RelatedMedicationKnowledge =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.RelatedMedicationKnowledge,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeMonographSerializer : KSerializer<MedicationKnowledge.Monograph> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeMonographSurrogate> by lazy {
    MedicationKnowledgeMonographSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Monograph", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Monograph =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Monograph) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgeMonographSurrogate.fromModel(value))
  }
}

public object MedicationKnowledgeCostSerializer : KSerializer<MedicationKnowledge.Cost> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeCostSurrogate> by lazy {
    MedicationKnowledgeCostSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Cost", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Cost =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Cost) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgeCostSurrogate.fromModel(value))
  }
}

public object MedicationKnowledgeMonitoringProgramSerializer :
  KSerializer<MedicationKnowledge.MonitoringProgram> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeMonitoringProgramSurrogate> by lazy {
    MedicationKnowledgeMonitoringProgramSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MonitoringProgram", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.MonitoringProgram =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.MonitoringProgram) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeMonitoringProgramSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSerializer :
  KSerializer<MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate> by lazy {
    MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Dosage", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSerializer :
  KSerializer<MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic> {
  internal val surrogateSerializer:
    KSerializer<
      MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
    > by lazy {
    MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PatientCharacteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate.fromModel(
        value
      ),
    )
  }
}

public object MedicationKnowledgeIndicationGuidelineDosingGuidelineSerializer :
  KSerializer<MedicationKnowledge.IndicationGuideline.DosingGuideline> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate> by lazy {
    MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DosingGuideline", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): MedicationKnowledge.IndicationGuideline.DosingGuideline =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.IndicationGuideline.DosingGuideline,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeIndicationGuidelineSerializer :
  KSerializer<MedicationKnowledge.IndicationGuideline> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeIndicationGuidelineSurrogate> by lazy {
    MedicationKnowledgeIndicationGuidelineSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("IndicationGuideline", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.IndicationGuideline =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.IndicationGuideline) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeIndicationGuidelineSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeMedicineClassificationSerializer :
  KSerializer<MedicationKnowledge.MedicineClassification> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeMedicineClassificationSurrogate> by lazy {
    MedicationKnowledgeMedicineClassificationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MedicineClassification", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.MedicineClassification =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.MedicineClassification) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeMedicineClassificationSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgePackagingSerializer : KSerializer<MedicationKnowledge.Packaging> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgePackagingSurrogate> by lazy {
    MedicationKnowledgePackagingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Packaging", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Packaging =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Packaging) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgePackagingSurrogate.fromModel(value))
  }
}

public object MedicationKnowledgeStorageGuidelineEnvironmentalSettingSerializer :
  KSerializer<MedicationKnowledge.StorageGuideline.EnvironmentalSetting> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate> by lazy {
    MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("EnvironmentalSetting", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): MedicationKnowledge.StorageGuideline.EnvironmentalSetting =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.StorageGuideline.EnvironmentalSetting,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeStorageGuidelineSerializer :
  KSerializer<MedicationKnowledge.StorageGuideline> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeStorageGuidelineSurrogate> by lazy {
    MedicationKnowledgeStorageGuidelineSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("StorageGuideline", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.StorageGuideline =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.StorageGuideline) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeStorageGuidelineSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeRegulatorySubstitutionSerializer :
  KSerializer<MedicationKnowledge.Regulatory.Substitution> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeRegulatorySubstitutionSurrogate> by lazy {
    MedicationKnowledgeRegulatorySubstitutionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Substitution", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Regulatory.Substitution =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Regulatory.Substitution) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeRegulatorySubstitutionSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeRegulatoryMaxDispenseSerializer :
  KSerializer<MedicationKnowledge.Regulatory.MaxDispense> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeRegulatoryMaxDispenseSurrogate> by lazy {
    MedicationKnowledgeRegulatoryMaxDispenseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MaxDispense", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Regulatory.MaxDispense =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Regulatory.MaxDispense) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeRegulatoryMaxDispenseSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeRegulatorySerializer :
  KSerializer<MedicationKnowledge.Regulatory> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeRegulatorySurrogate> by lazy {
    MedicationKnowledgeRegulatorySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Regulatory", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Regulatory =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Regulatory) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgeRegulatorySurrogate.fromModel(value))
  }
}

public object MedicationKnowledgeDefinitionalIngredientSerializer :
  KSerializer<MedicationKnowledge.Definitional.Ingredient> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeDefinitionalIngredientSurrogate> by lazy {
    MedicationKnowledgeDefinitionalIngredientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Ingredient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Definitional.Ingredient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Definitional.Ingredient) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeDefinitionalIngredientSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeDefinitionalDrugCharacteristicSerializer :
  KSerializer<MedicationKnowledge.Definitional.DrugCharacteristic> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate> by lazy {
    MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DrugCharacteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Definitional.DrugCharacteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.Definitional.DrugCharacteristic,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeDefinitionalSerializer :
  KSerializer<MedicationKnowledge.Definitional> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeDefinitionalSurrogate> by lazy {
    MedicationKnowledgeDefinitionalSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Definitional", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Definitional =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Definitional) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeDefinitionalSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeSerializer : KSerializer<MedicationKnowledge> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeSurrogate> by lazy {
    MedicationKnowledgeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MedicationKnowledge", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgeSurrogate.fromModel(value))
  }
}
