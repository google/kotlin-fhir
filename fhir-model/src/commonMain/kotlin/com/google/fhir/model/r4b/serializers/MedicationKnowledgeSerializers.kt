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

import com.google.fhir.model.r4b.MedicationKnowledge
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeAdministrationGuidelinesDosageSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeAdministrationGuidelinesSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeCostSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeDrugCharacteristicSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeIngredientSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeKineticsSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeMedicineClassificationSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeMonitoringProgramSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeMonographSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgePackagingSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeRegulatoryMaxDispenseSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeRegulatoryScheduleSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeRegulatorySubstitutionSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeRegulatorySurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeRelatedMedicationKnowledgeSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationKnowledgeSurrogate
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

public object MedicationKnowledgeIngredientSerializer :
  KSerializer<MedicationKnowledge.Ingredient> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeIngredientSurrogate> by lazy {
    MedicationKnowledgeIngredientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Ingredient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Ingredient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Ingredient) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgeIngredientSurrogate.fromModel(value))
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

public object MedicationKnowledgeAdministrationGuidelinesDosageSerializer :
  KSerializer<MedicationKnowledge.AdministrationGuidelines.Dosage> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeAdministrationGuidelinesDosageSurrogate> by lazy {
    MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Dosage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.AdministrationGuidelines.Dosage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.AdministrationGuidelines.Dosage,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSerializer :
  KSerializer<MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics> {
  internal val surrogateSerializer:
    KSerializer<
      MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
    > by lazy {
    MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PatientCharacteristics", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate.fromModel(value),
    )
  }
}

public object MedicationKnowledgeAdministrationGuidelinesSerializer :
  KSerializer<MedicationKnowledge.AdministrationGuidelines> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeAdministrationGuidelinesSurrogate> by lazy {
    MedicationKnowledgeAdministrationGuidelinesSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AdministrationGuidelines", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.AdministrationGuidelines =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.AdministrationGuidelines) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeAdministrationGuidelinesSurrogate.fromModel(value),
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

public object MedicationKnowledgeDrugCharacteristicSerializer :
  KSerializer<MedicationKnowledge.DrugCharacteristic> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeDrugCharacteristicSurrogate> by lazy {
    MedicationKnowledgeDrugCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DrugCharacteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.DrugCharacteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.DrugCharacteristic) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeDrugCharacteristicSurrogate.fromModel(value),
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

public object MedicationKnowledgeRegulatoryScheduleSerializer :
  KSerializer<MedicationKnowledge.Regulatory.Schedule> {
  internal val surrogateSerializer:
    KSerializer<MedicationKnowledgeRegulatoryScheduleSurrogate> by lazy {
    MedicationKnowledgeRegulatoryScheduleSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Schedule", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Regulatory.Schedule =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Regulatory.Schedule) {
    surrogateSerializer.serialize(
      encoder,
      MedicationKnowledgeRegulatoryScheduleSurrogate.fromModel(value),
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

public object MedicationKnowledgeKineticsSerializer : KSerializer<MedicationKnowledge.Kinetics> {
  internal val surrogateSerializer: KSerializer<MedicationKnowledgeKineticsSurrogate> by lazy {
    MedicationKnowledgeKineticsSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Kinetics", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationKnowledge.Kinetics =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationKnowledge.Kinetics) {
    surrogateSerializer.serialize(encoder, MedicationKnowledgeKineticsSurrogate.fromModel(value))
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
