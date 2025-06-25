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

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Base64Binary
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Dosage
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.MedicationKnowledge
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Money
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
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
internal data class MedicationKnowledgeIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
  public var isActive: KotlinBoolean? = null,
  public var _isActive: Element? = null,
  public var strength: Ratio? = null,
) {
  public fun toModel(): MedicationKnowledge.Ingredient =
    MedicationKnowledge.Ingredient().apply {
      id = this@MedicationKnowledgeIngredientSurrogate.id
      extension = this@MedicationKnowledgeIngredientSurrogate.extension
      modifierExtension = this@MedicationKnowledgeIngredientSurrogate.modifierExtension
      item =
        MedicationKnowledge.Ingredient.Item?.from(
          this@MedicationKnowledgeIngredientSurrogate.itemCodeableConcept,
          this@MedicationKnowledgeIngredientSurrogate.itemReference,
        )
      isActive =
        R4Boolean.of(
          this@MedicationKnowledgeIngredientSurrogate.isActive,
          this@MedicationKnowledgeIngredientSurrogate._isActive,
        )
      strength = this@MedicationKnowledgeIngredientSurrogate.strength
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Ingredient
    ): MedicationKnowledgeIngredientSurrogate =
      with(model) {
        MedicationKnowledgeIngredientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
          itemReference = this@with.item?.asReference()?.value
          isActive = this@with.isActive?.value
          _isActive = this@with.isActive?.toElement()
          strength = this@with.strength
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var cost: Money? = null,
) {
  public fun toModel(): MedicationKnowledge.Cost =
    MedicationKnowledge.Cost().apply {
      id = this@MedicationKnowledgeCostSurrogate.id
      extension = this@MedicationKnowledgeCostSurrogate.extension
      modifierExtension = this@MedicationKnowledgeCostSurrogate.modifierExtension
      type = this@MedicationKnowledgeCostSurrogate.type
      source =
        R4String.of(
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
        R4String.of(
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
internal data class MedicationKnowledgeAdministrationGuidelinesDosageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var dosage: List<Dosage?>? = null,
) {
  public fun toModel(): MedicationKnowledge.AdministrationGuidelines.Dosage =
    MedicationKnowledge.AdministrationGuidelines.Dosage().apply {
      id = this@MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.id
      extension = this@MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.modifierExtension
      type = this@MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.type
      dosage = this@MedicationKnowledgeAdministrationGuidelinesDosageSurrogate.dosage
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.AdministrationGuidelines.Dosage
    ): MedicationKnowledgeAdministrationGuidelinesDosageSurrogate =
      with(model) {
        MedicationKnowledgeAdministrationGuidelinesDosageSurrogate().apply {
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
internal data class MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var characteristicCodeableConcept: CodeableConcept? = null,
  public var characteristicQuantity: Quantity? = null,
  public var `value`: List<KotlinString?>? = null,
  public var _value: List<Element?>? = null,
) {
  public fun toModel(): MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics =
    MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics().apply {
      id = this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate.id
      extension =
        this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
          .modifierExtension
      characteristic =
        MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic?.from(
          this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
            .characteristicCodeableConcept,
          this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
            .characteristicQuantity,
        )
      `value` =
        if (
          this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate.`value` ==
            null &&
            this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
              ._value == null
        ) {
          null
        } else {
          (this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate.`value`
              ?: List(
                this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
                  ._value!!
                  .size
              ) {
                null
              })
            .zip(
              this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate._value
                ?: List(
                  this@MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate
                    .`value`!!
                    .size
                ) {
                  null
                }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics
    ): MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate =
      with(model) {
        MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          characteristicCodeableConcept = this@with.characteristic?.asCodeableConcept()?.value
          characteristicQuantity = this@with.characteristic?.asQuantity()?.value
          `value` = this@with.`value`?.map { it?.value }?.takeUnless { it.all { it == null } }
          _value = this@with.`value`?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeAdministrationGuidelinesSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var dosage: List<MedicationKnowledge.AdministrationGuidelines.Dosage>? = null,
  public var indicationCodeableConcept: CodeableConcept? = null,
  public var indicationReference: Reference? = null,
  public var patientCharacteristics:
    List<MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics>? =
    null,
) {
  public fun toModel(): MedicationKnowledge.AdministrationGuidelines =
    MedicationKnowledge.AdministrationGuidelines().apply {
      id = this@MedicationKnowledgeAdministrationGuidelinesSurrogate.id
      extension = this@MedicationKnowledgeAdministrationGuidelinesSurrogate.extension
      modifierExtension =
        this@MedicationKnowledgeAdministrationGuidelinesSurrogate.modifierExtension
      dosage = this@MedicationKnowledgeAdministrationGuidelinesSurrogate.dosage
      indication =
        MedicationKnowledge.AdministrationGuidelines.Indication?.from(
          this@MedicationKnowledgeAdministrationGuidelinesSurrogate.indicationCodeableConcept,
          this@MedicationKnowledgeAdministrationGuidelinesSurrogate.indicationReference,
        )
      patientCharacteristics =
        this@MedicationKnowledgeAdministrationGuidelinesSurrogate.patientCharacteristics
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.AdministrationGuidelines
    ): MedicationKnowledgeAdministrationGuidelinesSurrogate =
      with(model) {
        MedicationKnowledgeAdministrationGuidelinesSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          dosage = this@with.dosage
          indicationCodeableConcept = this@with.indication?.asCodeableConcept()?.value
          indicationReference = this@with.indication?.asReference()?.value
          patientCharacteristics = this@with.patientCharacteristics
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
) {
  public fun toModel(): MedicationKnowledge.MedicineClassification =
    MedicationKnowledge.MedicineClassification().apply {
      id = this@MedicationKnowledgeMedicineClassificationSurrogate.id
      extension = this@MedicationKnowledgeMedicineClassificationSurrogate.extension
      modifierExtension = this@MedicationKnowledgeMedicineClassificationSurrogate.modifierExtension
      type = this@MedicationKnowledgeMedicineClassificationSurrogate.type
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
  public var type: CodeableConcept? = null,
  public var quantity: Quantity? = null,
) {
  public fun toModel(): MedicationKnowledge.Packaging =
    MedicationKnowledge.Packaging().apply {
      id = this@MedicationKnowledgePackagingSurrogate.id
      extension = this@MedicationKnowledgePackagingSurrogate.extension
      modifierExtension = this@MedicationKnowledgePackagingSurrogate.modifierExtension
      type = this@MedicationKnowledgePackagingSurrogate.type
      quantity = this@MedicationKnowledgePackagingSurrogate.quantity
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
          type = this@with.type
          quantity = this@with.quantity
        }
      }
  }
}

@Serializable
internal data class MedicationKnowledgeDrugCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueBase64Binary: KotlinString? = null,
  public var _valueBase64Binary: Element? = null,
) {
  public fun toModel(): MedicationKnowledge.DrugCharacteristic =
    MedicationKnowledge.DrugCharacteristic().apply {
      id = this@MedicationKnowledgeDrugCharacteristicSurrogate.id
      extension = this@MedicationKnowledgeDrugCharacteristicSurrogate.extension
      modifierExtension = this@MedicationKnowledgeDrugCharacteristicSurrogate.modifierExtension
      type = this@MedicationKnowledgeDrugCharacteristicSurrogate.type
      `value` =
        MedicationKnowledge.DrugCharacteristic.Value?.from(
          this@MedicationKnowledgeDrugCharacteristicSurrogate.valueCodeableConcept,
          R4String.of(
            this@MedicationKnowledgeDrugCharacteristicSurrogate.valueString,
            this@MedicationKnowledgeDrugCharacteristicSurrogate._valueString,
          ),
          this@MedicationKnowledgeDrugCharacteristicSurrogate.valueQuantity,
          Base64Binary.of(
            this@MedicationKnowledgeDrugCharacteristicSurrogate.valueBase64Binary,
            this@MedicationKnowledgeDrugCharacteristicSurrogate._valueBase64Binary,
          ),
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.DrugCharacteristic
    ): MedicationKnowledgeDrugCharacteristicSurrogate =
      with(model) {
        MedicationKnowledgeDrugCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.toElement()
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
        R4Boolean.of(
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
internal data class MedicationKnowledgeRegulatoryScheduleSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var schedule: CodeableConcept? = null,
) {
  public fun toModel(): MedicationKnowledge.Regulatory.Schedule =
    MedicationKnowledge.Regulatory.Schedule().apply {
      id = this@MedicationKnowledgeRegulatoryScheduleSurrogate.id
      extension = this@MedicationKnowledgeRegulatoryScheduleSurrogate.extension
      modifierExtension = this@MedicationKnowledgeRegulatoryScheduleSurrogate.modifierExtension
      schedule = this@MedicationKnowledgeRegulatoryScheduleSurrogate.schedule
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Regulatory.Schedule
    ): MedicationKnowledgeRegulatoryScheduleSurrogate =
      with(model) {
        MedicationKnowledgeRegulatoryScheduleSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          schedule = this@with.schedule
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
  public var schedule: List<MedicationKnowledge.Regulatory.Schedule>? = null,
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
internal data class MedicationKnowledgeKineticsSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var areaUnderCurve: List<Quantity?>? = null,
  public var lethalDose50: List<Quantity?>? = null,
  public var halfLifePeriod: Duration? = null,
) {
  public fun toModel(): MedicationKnowledge.Kinetics =
    MedicationKnowledge.Kinetics().apply {
      id = this@MedicationKnowledgeKineticsSurrogate.id
      extension = this@MedicationKnowledgeKineticsSurrogate.extension
      modifierExtension = this@MedicationKnowledgeKineticsSurrogate.modifierExtension
      areaUnderCurve = this@MedicationKnowledgeKineticsSurrogate.areaUnderCurve
      lethalDose50 = this@MedicationKnowledgeKineticsSurrogate.lethalDose50
      halfLifePeriod = this@MedicationKnowledgeKineticsSurrogate.halfLifePeriod
    }

  public companion object {
    public fun fromModel(
      model: MedicationKnowledge.Kinetics
    ): MedicationKnowledgeKineticsSurrogate =
      with(model) {
        MedicationKnowledgeKineticsSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          areaUnderCurve = this@with.areaUnderCurve
          lethalDose50 = this@with.lethalDose50
          halfLifePeriod = this@with.halfLifePeriod
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
  public var code: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var manufacturer: Reference? = null,
  public var doseForm: CodeableConcept? = null,
  public var amount: Quantity? = null,
  public var synonym: List<KotlinString?>? = null,
  public var _synonym: List<Element?>? = null,
  public var relatedMedicationKnowledge: List<MedicationKnowledge.RelatedMedicationKnowledge>? =
    null,
  public var associatedMedication: List<Reference?>? = null,
  public var productType: List<CodeableConcept?>? = null,
  public var monograph: List<MedicationKnowledge.Monograph>? = null,
  public var ingredient: List<MedicationKnowledge.Ingredient>? = null,
  public var preparationInstruction: KotlinString? = null,
  public var _preparationInstruction: Element? = null,
  public var intendedRoute: List<CodeableConcept?>? = null,
  public var cost: List<MedicationKnowledge.Cost>? = null,
  public var monitoringProgram: List<MedicationKnowledge.MonitoringProgram>? = null,
  public var administrationGuidelines: List<MedicationKnowledge.AdministrationGuidelines>? = null,
  public var medicineClassification: List<MedicationKnowledge.MedicineClassification>? = null,
  public var packaging: MedicationKnowledge.Packaging? = null,
  public var drugCharacteristic: List<MedicationKnowledge.DrugCharacteristic>? = null,
  public var contraindication: List<Reference?>? = null,
  public var regulatory: List<MedicationKnowledge.Regulatory>? = null,
  public var kinetics: List<MedicationKnowledge.Kinetics>? = null,
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
      code = this@MedicationKnowledgeSurrogate.code
      status =
        Enumeration.of(
          this@MedicationKnowledgeSurrogate.status?.let {
            com.google.fhir.model.r4.MedicationKnowledge.MedicationKnowledgeStatus.fromCode(it)
          },
          this@MedicationKnowledgeSurrogate._status,
        )
      manufacturer = this@MedicationKnowledgeSurrogate.manufacturer
      doseForm = this@MedicationKnowledgeSurrogate.doseForm
      amount = this@MedicationKnowledgeSurrogate.amount
      synonym =
        if (
          this@MedicationKnowledgeSurrogate.synonym == null &&
            this@MedicationKnowledgeSurrogate._synonym == null
        ) {
          null
        } else {
          (this@MedicationKnowledgeSurrogate.synonym
              ?: List(this@MedicationKnowledgeSurrogate._synonym!!.size) { null })
            .zip(
              this@MedicationKnowledgeSurrogate._synonym
                ?: List(this@MedicationKnowledgeSurrogate.synonym!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      relatedMedicationKnowledge = this@MedicationKnowledgeSurrogate.relatedMedicationKnowledge
      associatedMedication = this@MedicationKnowledgeSurrogate.associatedMedication
      productType = this@MedicationKnowledgeSurrogate.productType
      monograph = this@MedicationKnowledgeSurrogate.monograph
      ingredient = this@MedicationKnowledgeSurrogate.ingredient
      preparationInstruction =
        Markdown.of(
          this@MedicationKnowledgeSurrogate.preparationInstruction,
          this@MedicationKnowledgeSurrogate._preparationInstruction,
        )
      intendedRoute = this@MedicationKnowledgeSurrogate.intendedRoute
      cost = this@MedicationKnowledgeSurrogate.cost
      monitoringProgram = this@MedicationKnowledgeSurrogate.monitoringProgram
      administrationGuidelines = this@MedicationKnowledgeSurrogate.administrationGuidelines
      medicineClassification = this@MedicationKnowledgeSurrogate.medicineClassification
      packaging = this@MedicationKnowledgeSurrogate.packaging
      drugCharacteristic = this@MedicationKnowledgeSurrogate.drugCharacteristic
      contraindication = this@MedicationKnowledgeSurrogate.contraindication
      regulatory = this@MedicationKnowledgeSurrogate.regulatory
      kinetics = this@MedicationKnowledgeSurrogate.kinetics
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
          code = this@with.code
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          manufacturer = this@with.manufacturer
          doseForm = this@with.doseForm
          amount = this@with.amount
          synonym = this@with.synonym?.map { it?.value }?.takeUnless { it.all { it == null } }
          _synonym =
            this@with.synonym?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          relatedMedicationKnowledge = this@with.relatedMedicationKnowledge
          associatedMedication = this@with.associatedMedication
          productType = this@with.productType
          monograph = this@with.monograph
          ingredient = this@with.ingredient
          preparationInstruction = this@with.preparationInstruction?.value
          _preparationInstruction = this@with.preparationInstruction?.toElement()
          intendedRoute = this@with.intendedRoute
          cost = this@with.cost
          monitoringProgram = this@with.monitoringProgram
          administrationGuidelines = this@with.administrationGuidelines
          medicineClassification = this@with.medicineClassification
          packaging = this@with.packaging
          drugCharacteristic = this@with.drugCharacteristic
          contraindication = this@with.contraindication
          regulatory = this@with.regulatory
          kinetics = this@with.kinetics
        }
      }
  }
}
