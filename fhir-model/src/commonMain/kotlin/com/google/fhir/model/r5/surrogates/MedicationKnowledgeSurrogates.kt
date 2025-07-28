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

@file:UseSerializers(DoubleSerializer::class, LocalTimeSerializer::class)
@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r5.surrogates

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Base64Binary
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Dosage
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.MedicationKnowledge
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationKnowledgeRelatedMedicationKnowledgeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var reference: MutableList<Reference>? = null,
) {
  public fun toModel(): MedicationKnowledge.RelatedMedicationKnowledge =
    MedicationKnowledge.RelatedMedicationKnowledge(
      id = this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.id,
      extension =
        this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.type,
      reference =
        this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.reference ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.RelatedMedicationKnowledge
    ): MedicationKnowledgeRelatedMedicationKnowledgeSurrogate =
      with(model) {
        MedicationKnowledgeRelatedMedicationKnowledgeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          reference = this@with.reference.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMonographSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var source: Reference? = null,
) {
  public fun toModel(): MedicationKnowledge.Monograph =
    MedicationKnowledge.Monograph(
      id = this@MedicationKnowledgeMonographSurrogate.id,
      extension = this@MedicationKnowledgeMonographSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeMonographSurrogate.modifierExtension ?: mutableListOf(),
      type = this@MedicationKnowledgeMonographSurrogate.type,
      source = this@MedicationKnowledgeMonographSurrogate.source,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Monograph
    ): MedicationKnowledgeMonographSurrogate =
      with(model) {
        MedicationKnowledgeMonographSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          source = this@with.source,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeCostCostSurrogate(
  public var costMoney: Money? = null,
  public var costCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): MedicationKnowledge.Cost.Cost =
    MedicationKnowledge.Cost.Cost.from(
      this@MedicationKnowledgeCostCostSurrogate.costMoney,
      this@MedicationKnowledgeCostCostSurrogate.costCodeableConcept,
    )!!

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Cost.Cost
    ): MedicationKnowledgeCostCostSurrogate =
      with(model) {
        MedicationKnowledgeCostCostSurrogate().apply {
          MedicationKnowledge.Cost.Cost.from(
            this@MedicationKnowledgeCostCostSurrogate.costMoney,
            this@MedicationKnowledgeCostCostSurrogate.costCodeableConcept,
          )!!
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var effectiveDate: MutableList<Period>? = null,
  public var type: CodeableConcept,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var cost: MedicationKnowledge.Cost.Cost,
) {
  public fun toModel(): MedicationKnowledge.Cost =
    MedicationKnowledge.Cost(
      id = this@MedicationKnowledgeCostSurrogate.id,
      extension = this@MedicationKnowledgeCostSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeCostSurrogate.modifierExtension ?: mutableListOf(),
      effectiveDate = this@MedicationKnowledgeCostSurrogate.effectiveDate ?: mutableListOf(),
      type = this@MedicationKnowledgeCostSurrogate.type,
      source =
        R5String.of(
          this@MedicationKnowledgeCostSurrogate.source,
          this@MedicationKnowledgeCostSurrogate._source,
        ),
      cost = this@MedicationKnowledgeCostSurrogate.cost,
    )

  public companion object {
    public fun fromModel(model: MedicationKnowledge.Cost): MedicationKnowledgeCostSurrogate =
      with(model) {
        MedicationKnowledgeCostSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          effectiveDate = this@with.effectiveDate.takeUnless { it.all { it == null } },
          type = this@with.type,
          source = this@with.source?.value,
          _source = this@with.source?.toElement(),
          cost = this@with.cost,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMonitoringProgramSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
) {
  public fun toModel(): MedicationKnowledge.MonitoringProgram =
    MedicationKnowledge.MonitoringProgram(
      id = this@MedicationKnowledgeMonitoringProgramSurrogate.id,
      extension = this@MedicationKnowledgeMonitoringProgramSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeMonitoringProgramSurrogate.modifierExtension ?: mutableListOf(),
      type = this@MedicationKnowledgeMonitoringProgramSurrogate.type,
      name =
        R5String.of(
          this@MedicationKnowledgeMonitoringProgramSurrogate.name,
          this@MedicationKnowledgeMonitoringProgramSurrogate._name,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.MonitoringProgram
    ): MedicationKnowledgeMonitoringProgramSurrogate =
      with(model) {
        MedicationKnowledgeMonitoringProgramSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var dosage: MutableList<Dosage>? = null,
) {
  public fun toModel(): MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage =
    MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage(
      id = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.id,
      extension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.type,
      dosage =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.dosage
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          dosage = this@with.dosage.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
) {
  public fun toModel():
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value? =
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value?.from(
      this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
        .valueCodeableConcept,
      this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
        .valueQuantity,
      this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
        .valueRange,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate()
          .apply {
            MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value
              ?.from(
                this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
                  .valueCodeableConcept,
                this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
                  .valueQuantity,
                this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
                  .valueRange,
              )
          }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`:
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value? =
    null,
) {
  public fun toModel():
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic =
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic(
      id =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate.id,
      extension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .modifierExtension ?: mutableListOf(),
      type =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .type,
      `value` =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .`value`,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var treatmentIntent: CodeableConcept? = null,
  public var dosage: MutableList<MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage>? =
    null,
  public var administrationTreatment: CodeableConcept? = null,
  public var patientCharacteristic:
    MutableList<MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.IndicationGuideline.DosingGuideline =
    MedicationKnowledge.IndicationGuideline.DosingGuideline(
      id = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.id,
      extension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.modifierExtension
          ?: mutableListOf(),
      treatmentIntent =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.treatmentIntent,
      dosage =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.dosage
          ?: mutableListOf(),
      administrationTreatment =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.administrationTreatment,
      patientCharacteristic =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.patientCharacteristic
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          treatmentIntent = this@with.treatmentIntent,
          dosage = this@with.dosage.takeUnless { it.all { it == null } },
          administrationTreatment = this@with.administrationTreatment,
          patientCharacteristic =
            this@with.patientCharacteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var indication: MutableList<CodeableReference>? = null,
  public var dosingGuideline:
    MutableList<MedicationKnowledge.IndicationGuideline.DosingGuideline>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.IndicationGuideline =
    MedicationKnowledge.IndicationGuideline(
      id = this@MedicationKnowledgeIndicationGuidelineSurrogate.id,
      extension = this@MedicationKnowledgeIndicationGuidelineSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineSurrogate.modifierExtension ?: mutableListOf(),
      indication =
        this@MedicationKnowledgeIndicationGuidelineSurrogate.indication ?: mutableListOf(),
      dosingGuideline =
        this@MedicationKnowledgeIndicationGuidelineSurrogate.dosingGuideline ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline
    ): MedicationKnowledgeIndicationGuidelineSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          indication = this@with.indication.takeUnless { it.all { it == null } },
          dosingGuideline = this@with.dosingGuideline.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMedicineClassificationSourceSurrogate(
  public var sourceString: KotlinString? = null,
  public var _sourceString: Element? = null,
  public var sourceUri: KotlinString? = null,
  public var _sourceUri: Element? = null,
) {
  public fun toModel(): MedicationKnowledge.MedicineClassification.Source? =
    MedicationKnowledge.MedicineClassification.Source?.from(
      R5String.of(
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate.sourceString,
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate._sourceString,
      ),
      Uri.of(
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate.sourceUri,
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate._sourceUri,
      ),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.MedicineClassification.Source
    ): MedicationKnowledgeMedicineClassificationSourceSurrogate =
      with(model) {
        MedicationKnowledgeMedicineClassificationSourceSurrogate().apply {
          MedicationKnowledge.MedicineClassification.Source?.from(
            R5String.of(
              this@MedicationKnowledgeMedicineClassificationSourceSurrogate.sourceString,
              this@MedicationKnowledgeMedicineClassificationSourceSurrogate._sourceString,
            ),
            Uri.of(
              this@MedicationKnowledgeMedicineClassificationSourceSurrogate.sourceUri,
              this@MedicationKnowledgeMedicineClassificationSourceSurrogate._sourceUri,
            ),
          )
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMedicineClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var classification: MutableList<CodeableConcept>? = null,
  public var source: MedicationKnowledge.MedicineClassification.Source? = null,
) {
  public fun toModel(): MedicationKnowledge.MedicineClassification =
    MedicationKnowledge.MedicineClassification(
      id = this@MedicationKnowledgeMedicineClassificationSurrogate.id,
      extension =
        this@MedicationKnowledgeMedicineClassificationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeMedicineClassificationSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@MedicationKnowledgeMedicineClassificationSurrogate.type,
      source = this@MedicationKnowledgeMedicineClassificationSurrogate.source,
      classification =
        this@MedicationKnowledgeMedicineClassificationSurrogate.classification ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.MedicineClassification
    ): MedicationKnowledgeMedicineClassificationSurrogate =
      with(model) {
        MedicationKnowledgeMedicineClassificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          source = this@with.source,
          classification = this@with.classification.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgePackagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var cost: MutableList<MedicationKnowledge.Cost>? = null,
  public var packagedProduct: Reference? = null,
) {
  public fun toModel(): MedicationKnowledge.Packaging =
    MedicationKnowledge.Packaging(
      id = this@MedicationKnowledgePackagingSurrogate.id,
      extension = this@MedicationKnowledgePackagingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgePackagingSurrogate.modifierExtension ?: mutableListOf(),
      cost = this@MedicationKnowledgePackagingSurrogate.cost ?: mutableListOf(),
      packagedProduct = this@MedicationKnowledgePackagingSurrogate.packagedProduct,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Packaging
    ): MedicationKnowledgePackagingSurrogate =
      with(model) {
        MedicationKnowledgePackagingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          cost = this@with.cost.takeUnless { it.all { it == null } },
          packagedProduct = this@with.packagedProduct,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate(
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value =
    MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.from(
      this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate.valueQuantity,
      this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate.valueRange,
      this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate
        .valueCodeableConcept,
    )!!

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value
    ): MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate =
      with(model) {
        MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate().apply {
          MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.from(
            this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate
              .valueQuantity,
            this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate.valueRange,
            this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate
              .valueCodeableConcept,
          )!!
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value,
) {
  public fun toModel(): MedicationKnowledge.StorageGuideline.EnvironmentalSetting =
    MedicationKnowledge.StorageGuideline.EnvironmentalSetting(
      id = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.id,
      extension =
        this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.type,
      `value` = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.StorageGuideline.EnvironmentalSetting
    ): MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate =
      with(model) {
        MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeStorageGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: KotlinString? = null,
  public var _reference: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var stabilityDuration: Duration? = null,
  public var environmentalSetting:
    MutableList<MedicationKnowledge.StorageGuideline.EnvironmentalSetting>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.StorageGuideline =
    MedicationKnowledge.StorageGuideline(
      id = this@MedicationKnowledgeStorageGuidelineSurrogate.id,
      extension = this@MedicationKnowledgeStorageGuidelineSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeStorageGuidelineSurrogate.modifierExtension ?: mutableListOf(),
      reference =
        Uri.of(
          this@MedicationKnowledgeStorageGuidelineSurrogate.reference,
          this@MedicationKnowledgeStorageGuidelineSurrogate._reference,
        ),
      note = this@MedicationKnowledgeStorageGuidelineSurrogate.note ?: mutableListOf(),
      stabilityDuration = this@MedicationKnowledgeStorageGuidelineSurrogate.stabilityDuration,
      environmentalSetting =
        this@MedicationKnowledgeStorageGuidelineSurrogate.environmentalSetting ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.StorageGuideline
    ): MedicationKnowledgeStorageGuidelineSurrogate =
      with(model) {
        MedicationKnowledgeStorageGuidelineSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference?.value,
          _reference = this@with.reference?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          stabilityDuration = this@with.stabilityDuration,
          environmentalSetting = this@with.environmentalSetting.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeRegulatorySubstitutionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var allowed: KotlinBoolean? = null,
  public var _allowed: Element? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory.Substitution =
    MedicationKnowledge.Regulatory.Substitution(
      id = this@MedicationKnowledgeRegulatorySubstitutionSurrogate.id,
      extension =
        this@MedicationKnowledgeRegulatorySubstitutionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeRegulatorySubstitutionSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@MedicationKnowledgeRegulatorySubstitutionSurrogate.type,
      allowed =
        R5Boolean.of(
          this@MedicationKnowledgeRegulatorySubstitutionSurrogate.allowed,
          this@MedicationKnowledgeRegulatorySubstitutionSurrogate._allowed,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory.Substitution
    ): MedicationKnowledgeRegulatorySubstitutionSurrogate =
      with(model) {
        MedicationKnowledgeRegulatorySubstitutionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          allowed = this@with.allowed.value,
          _allowed = this@with.allowed.toElement(),
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeRegulatoryMaxDispenseSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var quantity: Quantity,
  public var period: Duration? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory.MaxDispense =
    MedicationKnowledge.Regulatory.MaxDispense(
      id = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.id,
      extension =
        this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.modifierExtension ?: mutableListOf(),
      quantity = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.quantity,
      period = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.period,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory.MaxDispense
    ): MedicationKnowledgeRegulatoryMaxDispenseSurrogate =
      with(model) {
        MedicationKnowledgeRegulatoryMaxDispenseSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeRegulatorySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var regulatoryAuthority: Reference,
  public var substitution: MutableList<MedicationKnowledge.Regulatory.Substitution>? = null,
  public var schedule: MutableList<CodeableConcept>? = null,
  public var maxDispense: MedicationKnowledge.Regulatory.MaxDispense? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory =
    MedicationKnowledge.Regulatory(
      id = this@MedicationKnowledgeRegulatorySurrogate.id,
      extension = this@MedicationKnowledgeRegulatorySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeRegulatorySurrogate.modifierExtension ?: mutableListOf(),
      regulatoryAuthority = this@MedicationKnowledgeRegulatorySurrogate.regulatoryAuthority,
      substitution = this@MedicationKnowledgeRegulatorySurrogate.substitution ?: mutableListOf(),
      schedule = this@MedicationKnowledgeRegulatorySurrogate.schedule ?: mutableListOf(),
      maxDispense = this@MedicationKnowledgeRegulatorySurrogate.maxDispense,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory
    ): MedicationKnowledgeRegulatorySurrogate =
      with(model) {
        MedicationKnowledgeRegulatorySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          regulatoryAuthority = this@with.regulatoryAuthority,
          substitution = this@with.substitution.takeUnless { it.all { it == null } },
          schedule = this@with.schedule.takeUnless { it.all { it == null } },
          maxDispense = this@with.maxDispense,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalIngredientStrengthSurrogate(
  public var strengthRatio: Ratio? = null,
  public var strengthCodeableConcept: CodeableConcept? = null,
  public var strengthQuantity: Quantity? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional.Ingredient.Strength? =
    MedicationKnowledge.Definitional.Ingredient.Strength?.from(
      this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthRatio,
      this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthCodeableConcept,
      this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthQuantity,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.Ingredient.Strength
    ): MedicationKnowledgeDefinitionalIngredientStrengthSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalIngredientStrengthSurrogate().apply {
          MedicationKnowledge.Definitional.Ingredient.Strength?.from(
            this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthRatio,
            this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthCodeableConcept,
            this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthQuantity,
          )
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: CodeableReference,
  public var type: CodeableConcept? = null,
  public var strength: MedicationKnowledge.Definitional.Ingredient.Strength? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional.Ingredient =
    MedicationKnowledge.Definitional.Ingredient(
      id = this@MedicationKnowledgeDefinitionalIngredientSurrogate.id,
      extension =
        this@MedicationKnowledgeDefinitionalIngredientSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeDefinitionalIngredientSurrogate.modifierExtension
          ?: mutableListOf(),
      item = this@MedicationKnowledgeDefinitionalIngredientSurrogate.item,
      type = this@MedicationKnowledgeDefinitionalIngredientSurrogate.type,
      strength = this@MedicationKnowledgeDefinitionalIngredientSurrogate.strength,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.Ingredient
    ): MedicationKnowledgeDefinitionalIngredientSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalIngredientSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
          type = this@with.type,
          strength = this@with.strength,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueBase64Binary: KotlinString? = null,
  public var _valueBase64Binary: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional.DrugCharacteristic.Value? =
    MedicationKnowledge.Definitional.DrugCharacteristic.Value?.from(
      this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueCodeableConcept,
      R5String.of(
        this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueString,
        this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate._valueString,
      ),
      this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueQuantity,
      Base64Binary.of(
        this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueBase64Binary,
        this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate._valueBase64Binary,
      ),
      this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueAttachment,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.DrugCharacteristic.Value
    ): MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate().apply {
          MedicationKnowledge.Definitional.DrugCharacteristic.Value?.from(
            this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate
              .valueCodeableConcept,
            R5String.of(
              this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueString,
              this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate._valueString,
            ),
            this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueQuantity,
            Base64Binary.of(
              this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate
                .valueBase64Binary,
              this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate
                ._valueBase64Binary,
            ),
            this@MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate.valueAttachment,
          )
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: MedicationKnowledge.Definitional.DrugCharacteristic.Value? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional.DrugCharacteristic =
    MedicationKnowledge.Definitional.DrugCharacteristic(
      id = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.id,
      extension =
        this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.type,
      `value` = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.DrugCharacteristic
    ): MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var definition: MutableList<Reference>? = null,
  public var doseForm: CodeableConcept? = null,
  public var intendedRoute: MutableList<CodeableConcept>? = null,
  public var ingredient: MutableList<MedicationKnowledge.Definitional.Ingredient>? = null,
  public var drugCharacteristic: MutableList<MedicationKnowledge.Definitional.DrugCharacteristic>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.Definitional =
    MedicationKnowledge.Definitional(
      id = this@MedicationKnowledgeDefinitionalSurrogate.id,
      extension = this@MedicationKnowledgeDefinitionalSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationKnowledgeDefinitionalSurrogate.modifierExtension ?: mutableListOf(),
      definition = this@MedicationKnowledgeDefinitionalSurrogate.definition ?: mutableListOf(),
      doseForm = this@MedicationKnowledgeDefinitionalSurrogate.doseForm,
      intendedRoute =
        this@MedicationKnowledgeDefinitionalSurrogate.intendedRoute ?: mutableListOf(),
      ingredient = this@MedicationKnowledgeDefinitionalSurrogate.ingredient ?: mutableListOf(),
      drugCharacteristic =
        this@MedicationKnowledgeDefinitionalSurrogate.drugCharacteristic ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional
    ): MedicationKnowledgeDefinitionalSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          definition = this@with.definition.takeUnless { it.all { it == null } },
          doseForm = this@with.doseForm,
          intendedRoute = this@with.intendedRoute.takeUnless { it.all { it == null } },
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          drugCharacteristic = this@with.drugCharacteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationKnowledgeSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var code: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var author: Reference? = null,
  public var intendedJurisdiction: MutableList<CodeableConcept>? = null,
  public var name: MutableList<KotlinString?>? = null,
  public var _name: MutableList<Element?>? = null,
  public var relatedMedicationKnowledge:
    MutableList<MedicationKnowledge.RelatedMedicationKnowledge>? =
    null,
  public var associatedMedication: MutableList<Reference>? = null,
  public var productType: MutableList<CodeableConcept>? = null,
  public var monograph: MutableList<MedicationKnowledge.Monograph>? = null,
  public var preparationInstruction: KotlinString? = null,
  public var _preparationInstruction: Element? = null,
  public var cost: MutableList<MedicationKnowledge.Cost>? = null,
  public var monitoringProgram: MutableList<MedicationKnowledge.MonitoringProgram>? = null,
  public var indicationGuideline: MutableList<MedicationKnowledge.IndicationGuideline>? = null,
  public var medicineClassification: MutableList<MedicationKnowledge.MedicineClassification>? =
    null,
  public var packaging: MutableList<MedicationKnowledge.Packaging>? = null,
  public var clinicalUseIssue: MutableList<Reference>? = null,
  public var storageGuideline: MutableList<MedicationKnowledge.StorageGuideline>? = null,
  public var regulatory: MutableList<MedicationKnowledge.Regulatory>? = null,
  public var definitional: MedicationKnowledge.Definitional? = null,
) {
  public fun toModel(): MedicationKnowledge =
    MedicationKnowledge(
      id = this@MedicationKnowledgeSurrogate.id,
      meta = this@MedicationKnowledgeSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicationKnowledgeSurrogate.implicitRules,
          this@MedicationKnowledgeSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicationKnowledgeSurrogate.language,
          this@MedicationKnowledgeSurrogate._language,
        ),
      text = this@MedicationKnowledgeSurrogate.text,
      contained = this@MedicationKnowledgeSurrogate.contained ?: mutableListOf(),
      extension = this@MedicationKnowledgeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationKnowledgeSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicationKnowledgeSurrogate.identifier ?: mutableListOf(),
      code = this@MedicationKnowledgeSurrogate.code,
      status =
        this@MedicationKnowledgeSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.MedicationKnowledge.MedicationKnowledgeStatus.fromCode(it!!),
            this@MedicationKnowledgeSurrogate._status,
          )
        },
      author = this@MedicationKnowledgeSurrogate.author,
      intendedJurisdiction =
        this@MedicationKnowledgeSurrogate.intendedJurisdiction ?: mutableListOf(),
      name =
        if (
          this@MedicationKnowledgeSurrogate.name == null &&
            this@MedicationKnowledgeSurrogate._name == null
        ) {
          mutableListOf()
        } else {
          (this@MedicationKnowledgeSurrogate.name
              ?: List(this@MedicationKnowledgeSurrogate._name!!.size) { null })
            .zip(
              this@MedicationKnowledgeSurrogate._name
                ?: List(this@MedicationKnowledgeSurrogate.name!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      relatedMedicationKnowledge =
        this@MedicationKnowledgeSurrogate.relatedMedicationKnowledge ?: mutableListOf(),
      associatedMedication =
        this@MedicationKnowledgeSurrogate.associatedMedication ?: mutableListOf(),
      productType = this@MedicationKnowledgeSurrogate.productType ?: mutableListOf(),
      monograph = this@MedicationKnowledgeSurrogate.monograph ?: mutableListOf(),
      preparationInstruction =
        Markdown.of(
          this@MedicationKnowledgeSurrogate.preparationInstruction,
          this@MedicationKnowledgeSurrogate._preparationInstruction,
        ),
      cost = this@MedicationKnowledgeSurrogate.cost ?: mutableListOf(),
      monitoringProgram = this@MedicationKnowledgeSurrogate.monitoringProgram ?: mutableListOf(),
      indicationGuideline =
        this@MedicationKnowledgeSurrogate.indicationGuideline ?: mutableListOf(),
      medicineClassification =
        this@MedicationKnowledgeSurrogate.medicineClassification ?: mutableListOf(),
      packaging = this@MedicationKnowledgeSurrogate.packaging ?: mutableListOf(),
      clinicalUseIssue = this@MedicationKnowledgeSurrogate.clinicalUseIssue ?: mutableListOf(),
      storageGuideline = this@MedicationKnowledgeSurrogate.storageGuideline ?: mutableListOf(),
      regulatory = this@MedicationKnowledgeSurrogate.regulatory ?: mutableListOf(),
      definitional = this@MedicationKnowledgeSurrogate.definitional,
    )

  public companion object {
    public fun fromModel(model: MedicationKnowledge): MedicationKnowledgeSurrogate =
      with(model) {
        MedicationKnowledgeSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          code = this@with.code,
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          author = this@with.author,
          intendedJurisdiction =
            this@with.intendedJurisdiction.takeUnless { it.all { it == null } },
          name =
            this@with.name.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _name =
            this@with.name
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          relatedMedicationKnowledge =
            this@with.relatedMedicationKnowledge.takeUnless { it.all { it == null } },
          associatedMedication =
            this@with.associatedMedication.takeUnless { it.all { it == null } },
          productType = this@with.productType.takeUnless { it.all { it == null } },
          monograph = this@with.monograph.takeUnless { it.all { it == null } },
          preparationInstruction = this@with.preparationInstruction?.value,
          _preparationInstruction = this@with.preparationInstruction?.toElement(),
          cost = this@with.cost.takeUnless { it.all { it == null } },
          monitoringProgram = this@with.monitoringProgram.takeUnless { it.all { it == null } },
          indicationGuideline = this@with.indicationGuideline.takeUnless { it.all { it == null } },
          medicineClassification =
            this@with.medicineClassification.takeUnless { it.all { it == null } },
          packaging = this@with.packaging.takeUnless { it.all { it == null } },
          clinicalUseIssue = this@with.clinicalUseIssue.takeUnless { it.all { it == null } },
          storageGuideline = this@with.storageGuideline.takeUnless { it.all { it == null } },
          regulatory = this@with.regulatory.takeUnless { it.all { it == null } },
          definitional = this@with.definitional,
        )
      }
  }
}
