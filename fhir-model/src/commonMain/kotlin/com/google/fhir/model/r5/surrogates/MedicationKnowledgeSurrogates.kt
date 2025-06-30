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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationKnowledgeRelatedMedicationKnowledgeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var reference: List<Reference?>? = null,
) {
  public fun toModel(): MedicationKnowledge.RelatedMedicationKnowledge =
    MedicationKnowledge.RelatedMedicationKnowledge().apply {
      id = this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.id
      extension = this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.modifierExtension
      type = this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.type
      reference = this@MedicationKnowledgeRelatedMedicationKnowledgeSurrogate.reference
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.RelatedMedicationKnowledge
    ): MedicationKnowledgeRelatedMedicationKnowledgeSurrogate =
      with(model) {
        MedicationKnowledgeRelatedMedicationKnowledgeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          reference = this@with.reference
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMonographSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var source: Reference? = null,
) {
  public fun toModel(): MedicationKnowledge.Monograph =
    MedicationKnowledge.Monograph().apply {
      id = this@MedicationKnowledgeMonographSurrogate.id
      extension = this@MedicationKnowledgeMonographSurrogate.extension
      modifierExtension = this@MedicationKnowledgeMonographSurrogate.modifierExtension
      type = this@MedicationKnowledgeMonographSurrogate.type
      source = this@MedicationKnowledgeMonographSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Monograph
    ): MedicationKnowledgeMonographSurrogate =
      with(model) {
        MedicationKnowledgeMonographSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          source = this@with.source
        }
      }
  }
}

@Serializable
internal class MedicationKnowledgeCostCostSurrogate {
  public var costMoney: Money? = null

  public var costCodeableConcept: CodeableConcept? = null

  public fun toModel(): MedicationKnowledge.Cost.Cost =
    MedicationKnowledge.Cost.Cost?.from(
      this@MedicationKnowledgeCostCostSurrogate.costMoney,
      this@MedicationKnowledgeCostCostSurrogate.costCodeableConcept,
    ) ?: MedicationKnowledge.Cost.Cost.Null

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Cost.Cost
    ): MedicationKnowledgeCostCostSurrogate =
      with(model) {
        MedicationKnowledgeCostCostSurrogate().apply {
          costMoney = this@with.asMoney()?.value
          costCodeableConcept = this@with.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var effectiveDate: List<Period?>? = null,
  public var type: CodeableConcept? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var cost: MedicationKnowledge.Cost.Cost? = null,
) {
  public fun toModel(): MedicationKnowledge.Cost =
    MedicationKnowledge.Cost().apply {
      id = this@MedicationKnowledgeCostSurrogate.id
      extension = this@MedicationKnowledgeCostSurrogate.extension
      modifierExtension = this@MedicationKnowledgeCostSurrogate.modifierExtension
      effectiveDate = this@MedicationKnowledgeCostSurrogate.effectiveDate
      type = this@MedicationKnowledgeCostSurrogate.type
      source =
        R5String.of(
          this@MedicationKnowledgeCostSurrogate.source,
          this@MedicationKnowledgeCostSurrogate._source,
        )
      cost = this@MedicationKnowledgeCostSurrogate.cost
    }

  public companion object {
    public fun fromModel(model: MedicationKnowledge.Cost): MedicationKnowledgeCostSurrogate =
      with(model) {
        MedicationKnowledgeCostSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          effectiveDate = this@with.effectiveDate
          type = this@with.type
          source = this@with.source?.value
          _source = this@with.source?.toElement()
          cost = this@with.cost
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMonitoringProgramSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
) {
  public fun toModel(): MedicationKnowledge.MonitoringProgram =
    MedicationKnowledge.MonitoringProgram().apply {
      id = this@MedicationKnowledgeMonitoringProgramSurrogate.id
      extension = this@MedicationKnowledgeMonitoringProgramSurrogate.extension
      modifierExtension = this@MedicationKnowledgeMonitoringProgramSurrogate.modifierExtension
      type = this@MedicationKnowledgeMonitoringProgramSurrogate.type
      name =
        R5String.of(
          this@MedicationKnowledgeMonitoringProgramSurrogate.name,
          this@MedicationKnowledgeMonitoringProgramSurrogate._name,
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.MonitoringProgram
    ): MedicationKnowledgeMonitoringProgramSurrogate =
      with(model) {
        MedicationKnowledgeMonitoringProgramSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          name = this@with.name?.value
          _name = this@with.name?.toElement()
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var dosage: List<Dosage?>? = null,
) {
  public fun toModel(): MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage =
    MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage().apply {
      id = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.id
      extension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.modifierExtension
      type = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.type
      dosage = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate.dosage
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelineDosageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          dosage = this@with.dosage
        }
      }
  }
}

@Serializable
internal class MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public fun toModel():
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value =
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value?.from(
      this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
        .valueCodeableConcept,
      this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
        .valueQuantity,
      this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate
        .valueRange,
    ) ?: MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Null

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicValueSurrogate()
          .apply {
            valueCodeableConcept = this@with.asCodeableConcept()?.value
            valueQuantity = this@with.asQuantity()?.value
            valueRange = this@with.asRange()?.value
          }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`:
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value? =
    null,
) {
  public fun toModel():
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic =
    MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic().apply {
      id =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate.id
      extension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .extension
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .modifierExtension
      type =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .type
      `value` =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate
          .`value`
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristicSurrogate()
          .apply {
            id = this@with.id
            extension = this@with.extension
            modifierExtension = this@with.modifierExtension
            type = this@with.type
            `value` = this@with.`value`
          }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var treatmentIntent: CodeableConcept? = null,
  public var dosage: List<MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage>? = null,
  public var administrationTreatment: CodeableConcept? = null,
  public var patientCharacteristic:
    List<MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.IndicationGuideline.DosingGuideline =
    MedicationKnowledge.IndicationGuideline.DosingGuideline().apply {
      id = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.id
      extension = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.modifierExtension
      treatmentIntent =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.treatmentIntent
      dosage = this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.dosage
      administrationTreatment =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.administrationTreatment
      patientCharacteristic =
        this@MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate.patientCharacteristic
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline.DosingGuideline
    ): MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineDosingGuidelineSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          treatmentIntent = this@with.treatmentIntent
          dosage = this@with.dosage
          administrationTreatment = this@with.administrationTreatment
          patientCharacteristic = this@with.patientCharacteristic
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeIndicationGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var indication: List<CodeableReference?>? = null,
  public var dosingGuideline: List<MedicationKnowledge.IndicationGuideline.DosingGuideline>? = null,
) {
  public fun toModel(): MedicationKnowledge.IndicationGuideline =
    MedicationKnowledge.IndicationGuideline().apply {
      id = this@MedicationKnowledgeIndicationGuidelineSurrogate.id
      extension = this@MedicationKnowledgeIndicationGuidelineSurrogate.extension
      modifierExtension = this@MedicationKnowledgeIndicationGuidelineSurrogate.modifierExtension
      indication = this@MedicationKnowledgeIndicationGuidelineSurrogate.indication
      dosingGuideline = this@MedicationKnowledgeIndicationGuidelineSurrogate.dosingGuideline
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.IndicationGuideline
    ): MedicationKnowledgeIndicationGuidelineSurrogate =
      with(model) {
        MedicationKnowledgeIndicationGuidelineSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          indication = this@with.indication
          dosingGuideline = this@with.dosingGuideline
        }
      }
  }
}

@Serializable
internal class MedicationKnowledgeMedicineClassificationSourceSurrogate {
  public var sourceString: KotlinString? = null

  public var _sourceString: Element? = null

  public var sourceUri: KotlinString? = null

  public var _sourceUri: Element? = null

  public fun toModel(): MedicationKnowledge.MedicineClassification.Source =
    MedicationKnowledge.MedicineClassification.Source?.from(
      R5String.of(
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate.sourceString,
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate._sourceString,
      ),
      Uri.of(
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate.sourceUri,
        this@MedicationKnowledgeMedicineClassificationSourceSurrogate._sourceUri,
      ),
    ) ?: MedicationKnowledge.MedicineClassification.Source.Null

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.MedicineClassification.Source
    ): MedicationKnowledgeMedicineClassificationSourceSurrogate =
      with(model) {
        MedicationKnowledgeMedicineClassificationSourceSurrogate().apply {
          sourceString = this@with.asString()?.value?.value
          _sourceString = this@with.asString()?.value?.toElement()
          sourceUri = this@with.asUri()?.value?.value
          _sourceUri = this@with.asUri()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeMedicineClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var classification: List<CodeableConcept?>? = null,
  public var source: MedicationKnowledge.MedicineClassification.Source? = null,
) {
  public fun toModel(): MedicationKnowledge.MedicineClassification =
    MedicationKnowledge.MedicineClassification().apply {
      id = this@MedicationKnowledgeMedicineClassificationSurrogate.id
      extension = this@MedicationKnowledgeMedicineClassificationSurrogate.extension
      modifierExtension = this@MedicationKnowledgeMedicineClassificationSurrogate.modifierExtension
      type = this@MedicationKnowledgeMedicineClassificationSurrogate.type
      source = this@MedicationKnowledgeMedicineClassificationSurrogate.source
      classification = this@MedicationKnowledgeMedicineClassificationSurrogate.classification
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.MedicineClassification
    ): MedicationKnowledgeMedicineClassificationSurrogate =
      with(model) {
        MedicationKnowledgeMedicineClassificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          source = this@with.source
          classification = this@with.classification
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgePackagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var cost: List<MedicationKnowledge.Cost?>? = null,
  public var packagedProduct: Reference? = null,
) {
  public fun toModel(): MedicationKnowledge.Packaging =
    MedicationKnowledge.Packaging().apply {
      id = this@MedicationKnowledgePackagingSurrogate.id
      extension = this@MedicationKnowledgePackagingSurrogate.extension
      modifierExtension = this@MedicationKnowledgePackagingSurrogate.modifierExtension
      cost = this@MedicationKnowledgePackagingSurrogate.cost
      packagedProduct = this@MedicationKnowledgePackagingSurrogate.packagedProduct
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Packaging
    ): MedicationKnowledgePackagingSurrogate =
      with(model) {
        MedicationKnowledgePackagingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          cost = this@with.cost
          packagedProduct = this@with.packagedProduct
        }
      }
  }
}

@Serializable
internal class MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate {
  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public var valueCodeableConcept: CodeableConcept? = null

  public fun toModel(): MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value =
    MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value?.from(
      this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate.valueQuantity,
      this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate.valueRange,
      this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate
        .valueCodeableConcept,
    ) ?: MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Null

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value
    ): MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate =
      with(model) {
        MedicationKnowledgeStorageGuidelineEnvironmentalSettingValueSurrogate().apply {
          valueQuantity = this@with.asQuantity()?.value
          valueRange = this@with.asRange()?.value
          valueCodeableConcept = this@with.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value? = null,
) {
  public fun toModel(): MedicationKnowledge.StorageGuideline.EnvironmentalSetting =
    MedicationKnowledge.StorageGuideline.EnvironmentalSetting().apply {
      id = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.id
      extension = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.modifierExtension
      type = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.type
      `value` = this@MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.StorageGuideline.EnvironmentalSetting
    ): MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate =
      with(model) {
        MedicationKnowledgeStorageGuidelineEnvironmentalSettingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeStorageGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: KotlinString? = null,
  public var _reference: Element? = null,
  public var note: List<Annotation?>? = null,
  public var stabilityDuration: Duration? = null,
  public var environmentalSetting:
    List<MedicationKnowledge.StorageGuideline.EnvironmentalSetting>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.StorageGuideline =
    MedicationKnowledge.StorageGuideline().apply {
      id = this@MedicationKnowledgeStorageGuidelineSurrogate.id
      extension = this@MedicationKnowledgeStorageGuidelineSurrogate.extension
      modifierExtension = this@MedicationKnowledgeStorageGuidelineSurrogate.modifierExtension
      reference =
        Uri.of(
          this@MedicationKnowledgeStorageGuidelineSurrogate.reference,
          this@MedicationKnowledgeStorageGuidelineSurrogate._reference,
        )
      note = this@MedicationKnowledgeStorageGuidelineSurrogate.note
      stabilityDuration = this@MedicationKnowledgeStorageGuidelineSurrogate.stabilityDuration
      environmentalSetting = this@MedicationKnowledgeStorageGuidelineSurrogate.environmentalSetting
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.StorageGuideline
    ): MedicationKnowledgeStorageGuidelineSurrogate =
      with(model) {
        MedicationKnowledgeStorageGuidelineSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference?.value
          _reference = this@with.reference?.toElement()
          note = this@with.note
          stabilityDuration = this@with.stabilityDuration
          environmentalSetting = this@with.environmentalSetting
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeRegulatorySubstitutionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var allowed: KotlinBoolean? = null,
  public var _allowed: Element? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory.Substitution =
    MedicationKnowledge.Regulatory.Substitution().apply {
      id = this@MedicationKnowledgeRegulatorySubstitutionSurrogate.id
      extension = this@MedicationKnowledgeRegulatorySubstitutionSurrogate.extension
      modifierExtension = this@MedicationKnowledgeRegulatorySubstitutionSurrogate.modifierExtension
      type = this@MedicationKnowledgeRegulatorySubstitutionSurrogate.type
      allowed =
        R5Boolean.of(
          this@MedicationKnowledgeRegulatorySubstitutionSurrogate.allowed,
          this@MedicationKnowledgeRegulatorySubstitutionSurrogate._allowed,
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory.Substitution
    ): MedicationKnowledgeRegulatorySubstitutionSurrogate =
      with(model) {
        MedicationKnowledgeRegulatorySubstitutionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          allowed = this@with.allowed?.value
          _allowed = this@with.allowed?.toElement()
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeRegulatoryMaxDispenseSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var quantity: Quantity? = null,
  public var period: Duration? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory.MaxDispense =
    MedicationKnowledge.Regulatory.MaxDispense().apply {
      id = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.id
      extension = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.extension
      modifierExtension = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.modifierExtension
      quantity = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.quantity
      period = this@MedicationKnowledgeRegulatoryMaxDispenseSurrogate.period
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory.MaxDispense
    ): MedicationKnowledgeRegulatoryMaxDispenseSurrogate =
      with(model) {
        MedicationKnowledgeRegulatoryMaxDispenseSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          quantity = this@with.quantity
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeRegulatorySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var regulatoryAuthority: Reference? = null,
  public var substitution: List<MedicationKnowledge.Regulatory.Substitution>? = null,
  public var schedule: List<CodeableConcept?>? = null,
  public var maxDispense: MedicationKnowledge.Regulatory.MaxDispense? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory =
    MedicationKnowledge.Regulatory().apply {
      id = this@MedicationKnowledgeRegulatorySurrogate.id
      extension = this@MedicationKnowledgeRegulatorySurrogate.extension
      modifierExtension = this@MedicationKnowledgeRegulatorySurrogate.modifierExtension
      regulatoryAuthority = this@MedicationKnowledgeRegulatorySurrogate.regulatoryAuthority
      substitution = this@MedicationKnowledgeRegulatorySurrogate.substitution
      schedule = this@MedicationKnowledgeRegulatorySurrogate.schedule
      maxDispense = this@MedicationKnowledgeRegulatorySurrogate.maxDispense
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory
    ): MedicationKnowledgeRegulatorySurrogate =
      with(model) {
        MedicationKnowledgeRegulatorySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          regulatoryAuthority = this@with.regulatoryAuthority
          substitution = this@with.substitution
          schedule = this@with.schedule
          maxDispense = this@with.maxDispense
        }
      }
  }
}

@Serializable
internal class MedicationKnowledgeDefinitionalIngredientStrengthSurrogate {
  public var strengthRatio: Ratio? = null

  public var strengthCodeableConcept: CodeableConcept? = null

  public var strengthQuantity: Quantity? = null

  public fun toModel(): MedicationKnowledge.Definitional.Ingredient.Strength =
    MedicationKnowledge.Definitional.Ingredient.Strength?.from(
      this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthRatio,
      this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthCodeableConcept,
      this@MedicationKnowledgeDefinitionalIngredientStrengthSurrogate.strengthQuantity,
    ) ?: MedicationKnowledge.Definitional.Ingredient.Strength.Null

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.Ingredient.Strength
    ): MedicationKnowledgeDefinitionalIngredientStrengthSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalIngredientStrengthSurrogate().apply {
          strengthRatio = this@with.asRatio()?.value
          strengthCodeableConcept = this@with.asCodeableConcept()?.value
          strengthQuantity = this@with.asQuantity()?.value
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var item: CodeableReference? = null,
  public var type: CodeableConcept? = null,
  public var strength: MedicationKnowledge.Definitional.Ingredient.Strength? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional.Ingredient =
    MedicationKnowledge.Definitional.Ingredient().apply {
      id = this@MedicationKnowledgeDefinitionalIngredientSurrogate.id
      extension = this@MedicationKnowledgeDefinitionalIngredientSurrogate.extension
      modifierExtension = this@MedicationKnowledgeDefinitionalIngredientSurrogate.modifierExtension
      item = this@MedicationKnowledgeDefinitionalIngredientSurrogate.item
      type = this@MedicationKnowledgeDefinitionalIngredientSurrogate.type
      strength = this@MedicationKnowledgeDefinitionalIngredientSurrogate.strength
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.Ingredient
    ): MedicationKnowledgeDefinitionalIngredientSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalIngredientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          item = this@with.item
          type = this@with.type
          strength = this@with.strength
        }
      }
  }
}

@Serializable
internal class MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueString: KotlinString? = null

  public var _valueString: Element? = null

  public var valueQuantity: Quantity? = null

  public var valueBase64Binary: KotlinString? = null

  public var _valueBase64Binary: Element? = null

  public var valueAttachment: Attachment? = null

  public fun toModel(): MedicationKnowledge.Definitional.DrugCharacteristic.Value =
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
    ) ?: MedicationKnowledge.Definitional.DrugCharacteristic.Value.Null

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.DrugCharacteristic.Value
    ): MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalDrugCharacteristicValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueString = this@with.asString()?.value?.value
          _valueString = this@with.asString()?.value?.toElement()
          valueQuantity = this@with.asQuantity()?.value
          valueBase64Binary = this@with.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.asBase64Binary()?.value?.toElement()
          valueAttachment = this@with.asAttachment()?.value
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: MedicationKnowledge.Definitional.DrugCharacteristic.Value? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional.DrugCharacteristic =
    MedicationKnowledge.Definitional.DrugCharacteristic().apply {
      id = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.id
      extension = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.modifierExtension
      type = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.type
      `value` = this@MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional.DrugCharacteristic
    ): MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalDrugCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDefinitionalSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var definition: List<Reference?>? = null,
  public var doseForm: CodeableConcept? = null,
  public var intendedRoute: List<CodeableConcept?>? = null,
  public var ingredient: List<MedicationKnowledge.Definitional.Ingredient>? = null,
  public var drugCharacteristic: List<MedicationKnowledge.Definitional.DrugCharacteristic>? = null,
) {
  public fun toModel(): MedicationKnowledge.Definitional =
    MedicationKnowledge.Definitional().apply {
      id = this@MedicationKnowledgeDefinitionalSurrogate.id
      extension = this@MedicationKnowledgeDefinitionalSurrogate.extension
      modifierExtension = this@MedicationKnowledgeDefinitionalSurrogate.modifierExtension
      definition = this@MedicationKnowledgeDefinitionalSurrogate.definition
      doseForm = this@MedicationKnowledgeDefinitionalSurrogate.doseForm
      intendedRoute = this@MedicationKnowledgeDefinitionalSurrogate.intendedRoute
      ingredient = this@MedicationKnowledgeDefinitionalSurrogate.ingredient
      drugCharacteristic = this@MedicationKnowledgeDefinitionalSurrogate.drugCharacteristic
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Definitional
    ): MedicationKnowledgeDefinitionalSurrogate =
      with(model) {
        MedicationKnowledgeDefinitionalSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          definition = this@with.definition
          doseForm = this@with.doseForm
          intendedRoute = this@with.intendedRoute
          ingredient = this@with.ingredient
          drugCharacteristic = this@with.drugCharacteristic
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var code: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var author: Reference? = null,
  public var intendedJurisdiction: List<CodeableConcept?>? = null,
  public var name: List<KotlinString?>? = null,
  public var _name: List<Element?>? = null,
  public var relatedMedicationKnowledge: List<MedicationKnowledge.RelatedMedicationKnowledge>? =
    null,
  public var associatedMedication: List<Reference?>? = null,
  public var productType: List<CodeableConcept?>? = null,
  public var monograph: List<MedicationKnowledge.Monograph>? = null,
  public var preparationInstruction: KotlinString? = null,
  public var _preparationInstruction: Element? = null,
  public var cost: List<MedicationKnowledge.Cost>? = null,
  public var monitoringProgram: List<MedicationKnowledge.MonitoringProgram>? = null,
  public var indicationGuideline: List<MedicationKnowledge.IndicationGuideline>? = null,
  public var medicineClassification: List<MedicationKnowledge.MedicineClassification>? = null,
  public var packaging: List<MedicationKnowledge.Packaging>? = null,
  public var clinicalUseIssue: List<Reference?>? = null,
  public var storageGuideline: List<MedicationKnowledge.StorageGuideline>? = null,
  public var regulatory: List<MedicationKnowledge.Regulatory>? = null,
  public var definitional: MedicationKnowledge.Definitional? = null,
) {
  public fun toModel(): MedicationKnowledge =
    MedicationKnowledge().apply {
      id = this@MedicationKnowledgeSurrogate.id
      meta = this@MedicationKnowledgeSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicationKnowledgeSurrogate.implicitRules,
          this@MedicationKnowledgeSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicationKnowledgeSurrogate.language,
          this@MedicationKnowledgeSurrogate._language,
        )
      text = this@MedicationKnowledgeSurrogate.text
      contained = this@MedicationKnowledgeSurrogate.contained
      extension = this@MedicationKnowledgeSurrogate.extension
      modifierExtension = this@MedicationKnowledgeSurrogate.modifierExtension
      identifier = this@MedicationKnowledgeSurrogate.identifier
      code = this@MedicationKnowledgeSurrogate.code
      status =
        Enumeration.of(
          this@MedicationKnowledgeSurrogate.status?.let {
            com.google.fhir.model.r5.MedicationKnowledge.MedicationKnowledgeStatus.fromCode(it)
          },
          this@MedicationKnowledgeSurrogate._status,
        )
      author = this@MedicationKnowledgeSurrogate.author
      intendedJurisdiction = this@MedicationKnowledgeSurrogate.intendedJurisdiction
      name =
        if (
          this@MedicationKnowledgeSurrogate.name == null &&
            this@MedicationKnowledgeSurrogate._name == null
        ) {
          null
        } else {
          (this@MedicationKnowledgeSurrogate.name
              ?: List(this@MedicationKnowledgeSurrogate._name!!.size) { null })
            .zip(
              this@MedicationKnowledgeSurrogate._name
                ?: List(this@MedicationKnowledgeSurrogate.name!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      relatedMedicationKnowledge = this@MedicationKnowledgeSurrogate.relatedMedicationKnowledge
      associatedMedication = this@MedicationKnowledgeSurrogate.associatedMedication
      productType = this@MedicationKnowledgeSurrogate.productType
      monograph = this@MedicationKnowledgeSurrogate.monograph
      preparationInstruction =
        Markdown.of(
          this@MedicationKnowledgeSurrogate.preparationInstruction,
          this@MedicationKnowledgeSurrogate._preparationInstruction,
        )
      cost = this@MedicationKnowledgeSurrogate.cost
      monitoringProgram = this@MedicationKnowledgeSurrogate.monitoringProgram
      indicationGuideline = this@MedicationKnowledgeSurrogate.indicationGuideline
      medicineClassification = this@MedicationKnowledgeSurrogate.medicineClassification
      packaging = this@MedicationKnowledgeSurrogate.packaging
      clinicalUseIssue = this@MedicationKnowledgeSurrogate.clinicalUseIssue
      storageGuideline = this@MedicationKnowledgeSurrogate.storageGuideline
      regulatory = this@MedicationKnowledgeSurrogate.regulatory
      definitional = this@MedicationKnowledgeSurrogate.definitional
    }

  public companion object {
    public fun fromModel(model: MedicationKnowledge): MedicationKnowledgeSurrogate =
      with(model) {
        MedicationKnowledgeSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          code = this@with.code
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          author = this@with.author
          intendedJurisdiction = this@with.intendedJurisdiction
          name = this@with.name?.map { it?.value }?.takeUnless { it.all { it == null } }
          _name = this@with.name?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          relatedMedicationKnowledge = this@with.relatedMedicationKnowledge
          associatedMedication = this@with.associatedMedication
          productType = this@with.productType
          monograph = this@with.monograph
          preparationInstruction = this@with.preparationInstruction?.value
          _preparationInstruction = this@with.preparationInstruction?.toElement()
          cost = this@with.cost
          monitoringProgram = this@with.monitoringProgram
          indicationGuideline = this@with.indicationGuideline
          medicineClassification = this@with.medicineClassification
          packaging = this@with.packaging
          clinicalUseIssue = this@with.clinicalUseIssue
          storageGuideline = this@with.storageGuideline
          regulatory = this@with.regulatory
          definitional = this@with.definitional
        }
      }
  }
}
