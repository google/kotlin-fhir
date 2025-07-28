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

import com.google.fhir.model.r5.Address
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.ExplanationOfBenefit
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ExplanationOfBenefitRelatedSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var claim: Reference? = null,
  public var relationship: CodeableConcept? = null,
  public var reference: Identifier? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Related =
    ExplanationOfBenefit.Related(
      id = this@ExplanationOfBenefitRelatedSurrogate.id,
      extension = this@ExplanationOfBenefitRelatedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitRelatedSurrogate.modifierExtension ?: mutableListOf(),
      claim = this@ExplanationOfBenefitRelatedSurrogate.claim,
      relationship = this@ExplanationOfBenefitRelatedSurrogate.relationship,
      reference = this@ExplanationOfBenefitRelatedSurrogate.reference,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Related
    ): ExplanationOfBenefitRelatedSurrogate =
      with(model) {
        ExplanationOfBenefitRelatedSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          claim = this@with.claim,
          relationship = this@with.relationship,
          reference = this@with.reference,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitEventWhenSurrogate(
  public var whenDateTime: KotlinString? = null,
  public var _whenDateTime: Element? = null,
  public var whenPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Event.When =
    ExplanationOfBenefit.Event.When.from(
      DateTime.of(
        FhirDateTime.fromString(this@ExplanationOfBenefitEventWhenSurrogate.whenDateTime),
        this@ExplanationOfBenefitEventWhenSurrogate._whenDateTime,
      ),
      this@ExplanationOfBenefitEventWhenSurrogate.whenPeriod,
    )!!

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Event.When
    ): ExplanationOfBenefitEventWhenSurrogate =
      with(model) {
        ExplanationOfBenefitEventWhenSurrogate().apply {
          ExplanationOfBenefit.Event.When.from(
            DateTime.of(
              FhirDateTime.fromString(this@ExplanationOfBenefitEventWhenSurrogate.whenDateTime),
              this@ExplanationOfBenefitEventWhenSurrogate._whenDateTime,
            ),
            this@ExplanationOfBenefitEventWhenSurrogate.whenPeriod,
          )!!
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `when`: ExplanationOfBenefit.Event.When,
) {
  public fun toModel(): ExplanationOfBenefit.Event =
    ExplanationOfBenefit.Event(
      id = this@ExplanationOfBenefitEventSurrogate.id,
      extension = this@ExplanationOfBenefitEventSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitEventSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ExplanationOfBenefitEventSurrogate.type,
      `when` = this@ExplanationOfBenefitEventSurrogate.`when`,
    )

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Event): ExplanationOfBenefitEventSurrogate =
      with(model) {
        ExplanationOfBenefitEventSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `when` = this@with.`when`,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitPayeeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Payee =
    ExplanationOfBenefit.Payee(
      id = this@ExplanationOfBenefitPayeeSurrogate.id,
      extension = this@ExplanationOfBenefitPayeeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitPayeeSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ExplanationOfBenefitPayeeSurrogate.type,
      party = this@ExplanationOfBenefitPayeeSurrogate.party,
    )

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Payee): ExplanationOfBenefitPayeeSurrogate =
      with(model) {
        ExplanationOfBenefitPayeeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          party = this@with.party,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitCareTeamSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var provider: Reference,
  public var responsible: KotlinBoolean? = null,
  public var _responsible: Element? = null,
  public var role: CodeableConcept? = null,
  public var specialty: CodeableConcept? = null,
) {
  public fun toModel(): ExplanationOfBenefit.CareTeam =
    ExplanationOfBenefit.CareTeam(
      id = this@ExplanationOfBenefitCareTeamSurrogate.id,
      extension = this@ExplanationOfBenefitCareTeamSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitCareTeamSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitCareTeamSurrogate.sequence,
          this@ExplanationOfBenefitCareTeamSurrogate._sequence,
        )!!,
      provider = this@ExplanationOfBenefitCareTeamSurrogate.provider,
      responsible =
        R5Boolean.of(
          this@ExplanationOfBenefitCareTeamSurrogate.responsible,
          this@ExplanationOfBenefitCareTeamSurrogate._responsible,
        ),
      role = this@ExplanationOfBenefitCareTeamSurrogate.role,
      specialty = this@ExplanationOfBenefitCareTeamSurrogate.specialty,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.CareTeam
    ): ExplanationOfBenefitCareTeamSurrogate =
      with(model) {
        ExplanationOfBenefitCareTeamSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          provider = this@with.provider,
          responsible = this@with.responsible?.value,
          _responsible = this@with.responsible?.toElement(),
          role = this@with.role,
          specialty = this@with.specialty,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitSupportingInfoTimingSurrogate(
  public var timingDate: KotlinString? = null,
  public var _timingDate: Element? = null,
  public var timingPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.SupportingInfo.Timing? =
    ExplanationOfBenefit.SupportingInfo.Timing?.from(
      Date.of(
        FhirDate.fromString(this@ExplanationOfBenefitSupportingInfoTimingSurrogate.timingDate),
        this@ExplanationOfBenefitSupportingInfoTimingSurrogate._timingDate,
      ),
      this@ExplanationOfBenefitSupportingInfoTimingSurrogate.timingPeriod,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.SupportingInfo.Timing
    ): ExplanationOfBenefitSupportingInfoTimingSurrogate =
      with(model) {
        ExplanationOfBenefitSupportingInfoTimingSurrogate().apply {
          ExplanationOfBenefit.SupportingInfo.Timing?.from(
            Date.of(
              FhirDate.fromString(
                this@ExplanationOfBenefitSupportingInfoTimingSurrogate.timingDate
              ),
              this@ExplanationOfBenefitSupportingInfoTimingSurrogate._timingDate,
            ),
            this@ExplanationOfBenefitSupportingInfoTimingSurrogate.timingPeriod,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitSupportingInfoValueSurrogate(
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueAttachment: Attachment? = null,
  public var valueReference: Reference? = null,
  public var valueIdentifier: Identifier? = null,
) {
  public fun toModel(): ExplanationOfBenefit.SupportingInfo.Value? =
    ExplanationOfBenefit.SupportingInfo.Value?.from(
      R5Boolean.of(
        this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueBoolean,
        this@ExplanationOfBenefitSupportingInfoValueSurrogate._valueBoolean,
      ),
      R5String.of(
        this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueString,
        this@ExplanationOfBenefitSupportingInfoValueSurrogate._valueString,
      ),
      this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueQuantity,
      this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueAttachment,
      this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueReference,
      this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueIdentifier,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.SupportingInfo.Value
    ): ExplanationOfBenefitSupportingInfoValueSurrogate =
      with(model) {
        ExplanationOfBenefitSupportingInfoValueSurrogate().apply {
          ExplanationOfBenefit.SupportingInfo.Value?.from(
            R5Boolean.of(
              this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueBoolean,
              this@ExplanationOfBenefitSupportingInfoValueSurrogate._valueBoolean,
            ),
            R5String.of(
              this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueString,
              this@ExplanationOfBenefitSupportingInfoValueSurrogate._valueString,
            ),
            this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueQuantity,
            this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueAttachment,
            this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueReference,
            this@ExplanationOfBenefitSupportingInfoValueSurrogate.valueIdentifier,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var category: CodeableConcept,
  public var code: CodeableConcept? = null,
  public var reason: Coding? = null,
  public var timing: ExplanationOfBenefit.SupportingInfo.Timing? = null,
  public var `value`: ExplanationOfBenefit.SupportingInfo.Value? = null,
) {
  public fun toModel(): ExplanationOfBenefit.SupportingInfo =
    ExplanationOfBenefit.SupportingInfo(
      id = this@ExplanationOfBenefitSupportingInfoSurrogate.id,
      extension = this@ExplanationOfBenefitSupportingInfoSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitSupportingInfoSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitSupportingInfoSurrogate.sequence,
          this@ExplanationOfBenefitSupportingInfoSurrogate._sequence,
        )!!,
      category = this@ExplanationOfBenefitSupportingInfoSurrogate.category,
      code = this@ExplanationOfBenefitSupportingInfoSurrogate.code,
      timing = this@ExplanationOfBenefitSupportingInfoSurrogate.timing,
      `value` = this@ExplanationOfBenefitSupportingInfoSurrogate.`value`,
      reason = this@ExplanationOfBenefitSupportingInfoSurrogate.reason,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.SupportingInfo
    ): ExplanationOfBenefitSupportingInfoSurrogate =
      with(model) {
        ExplanationOfBenefitSupportingInfoSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          category = this@with.category,
          code = this@with.code,
          timing = this@with.timing,
          `value` = this@with.`value`,
          reason = this@with.reason,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitDiagnosisDiagnosisSurrogate(
  public var diagnosisCodeableConcept: CodeableConcept? = null,
  public var diagnosisReference: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Diagnosis.Diagnosis =
    ExplanationOfBenefit.Diagnosis.Diagnosis.from(
      this@ExplanationOfBenefitDiagnosisDiagnosisSurrogate.diagnosisCodeableConcept,
      this@ExplanationOfBenefitDiagnosisDiagnosisSurrogate.diagnosisReference,
    )!!

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Diagnosis.Diagnosis
    ): ExplanationOfBenefitDiagnosisDiagnosisSurrogate =
      with(model) {
        ExplanationOfBenefitDiagnosisDiagnosisSurrogate().apply {
          ExplanationOfBenefit.Diagnosis.Diagnosis.from(
            this@ExplanationOfBenefitDiagnosisDiagnosisSurrogate.diagnosisCodeableConcept,
            this@ExplanationOfBenefitDiagnosisDiagnosisSurrogate.diagnosisReference,
          )!!
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var onAdmission: CodeableConcept? = null,
  public var diagnosis: ExplanationOfBenefit.Diagnosis.Diagnosis,
) {
  public fun toModel(): ExplanationOfBenefit.Diagnosis =
    ExplanationOfBenefit.Diagnosis(
      id = this@ExplanationOfBenefitDiagnosisSurrogate.id,
      extension = this@ExplanationOfBenefitDiagnosisSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitDiagnosisSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitDiagnosisSurrogate.sequence,
          this@ExplanationOfBenefitDiagnosisSurrogate._sequence,
        )!!,
      diagnosis = this@ExplanationOfBenefitDiagnosisSurrogate.diagnosis,
      type = this@ExplanationOfBenefitDiagnosisSurrogate.type ?: mutableListOf(),
      onAdmission = this@ExplanationOfBenefitDiagnosisSurrogate.onAdmission,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Diagnosis
    ): ExplanationOfBenefitDiagnosisSurrogate =
      with(model) {
        ExplanationOfBenefitDiagnosisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          diagnosis = this@with.diagnosis,
          type = this@with.type.takeUnless { it.all { it == null } },
          onAdmission = this@with.onAdmission,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitProcedureProcedureSurrogate(
  public var procedureCodeableConcept: CodeableConcept? = null,
  public var procedureReference: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Procedure.Procedure =
    ExplanationOfBenefit.Procedure.Procedure.from(
      this@ExplanationOfBenefitProcedureProcedureSurrogate.procedureCodeableConcept,
      this@ExplanationOfBenefitProcedureProcedureSurrogate.procedureReference,
    )!!

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Procedure.Procedure
    ): ExplanationOfBenefitProcedureProcedureSurrogate =
      with(model) {
        ExplanationOfBenefitProcedureProcedureSurrogate().apply {
          ExplanationOfBenefit.Procedure.Procedure.from(
            this@ExplanationOfBenefitProcedureProcedureSurrogate.procedureCodeableConcept,
            this@ExplanationOfBenefitProcedureProcedureSurrogate.procedureReference,
          )!!
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var udi: MutableList<Reference>? = null,
  public var procedure: ExplanationOfBenefit.Procedure.Procedure,
) {
  public fun toModel(): ExplanationOfBenefit.Procedure =
    ExplanationOfBenefit.Procedure(
      id = this@ExplanationOfBenefitProcedureSurrogate.id,
      extension = this@ExplanationOfBenefitProcedureSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitProcedureSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitProcedureSurrogate.sequence,
          this@ExplanationOfBenefitProcedureSurrogate._sequence,
        )!!,
      type = this@ExplanationOfBenefitProcedureSurrogate.type ?: mutableListOf(),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ExplanationOfBenefitProcedureSurrogate.date),
          this@ExplanationOfBenefitProcedureSurrogate._date,
        ),
      procedure = this@ExplanationOfBenefitProcedureSurrogate.procedure,
      udi = this@ExplanationOfBenefitProcedureSurrogate.udi ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Procedure
    ): ExplanationOfBenefitProcedureSurrogate =
      with(model) {
        ExplanationOfBenefitProcedureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          type = this@with.type.takeUnless { it.all { it == null } },
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          procedure = this@with.procedure,
          udi = this@with.udi.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var coverage: Reference,
  public var preAuthRef: MutableList<KotlinString?>? = null,
  public var _preAuthRef: MutableList<Element?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Insurance =
    ExplanationOfBenefit.Insurance(
      id = this@ExplanationOfBenefitInsuranceSurrogate.id,
      extension = this@ExplanationOfBenefitInsuranceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitInsuranceSurrogate.modifierExtension ?: mutableListOf(),
      focal =
        R5Boolean.of(
          this@ExplanationOfBenefitInsuranceSurrogate.focal,
          this@ExplanationOfBenefitInsuranceSurrogate._focal,
        )!!,
      coverage = this@ExplanationOfBenefitInsuranceSurrogate.coverage,
      preAuthRef =
        if (
          this@ExplanationOfBenefitInsuranceSurrogate.preAuthRef == null &&
            this@ExplanationOfBenefitInsuranceSurrogate._preAuthRef == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitInsuranceSurrogate.preAuthRef
              ?: List(this@ExplanationOfBenefitInsuranceSurrogate._preAuthRef!!.size) { null })
            .zip(
              this@ExplanationOfBenefitInsuranceSurrogate._preAuthRef
                ?: List(this@ExplanationOfBenefitInsuranceSurrogate.preAuthRef!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Insurance
    ): ExplanationOfBenefitInsuranceSurrogate =
      with(model) {
        ExplanationOfBenefitInsuranceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          focal = this@with.focal.value,
          _focal = this@with.focal.toElement(),
          coverage = this@with.coverage,
          preAuthRef =
            this@with.preAuthRef
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _preAuthRef =
            this@with.preAuthRef
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAccidentLocationSurrogate(
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Accident.Location? =
    ExplanationOfBenefit.Accident.Location?.from(
      this@ExplanationOfBenefitAccidentLocationSurrogate.locationAddress,
      this@ExplanationOfBenefitAccidentLocationSurrogate.locationReference,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Accident.Location
    ): ExplanationOfBenefitAccidentLocationSurrogate =
      with(model) {
        ExplanationOfBenefitAccidentLocationSurrogate().apply {
          ExplanationOfBenefit.Accident.Location?.from(
            this@ExplanationOfBenefitAccidentLocationSurrogate.locationAddress,
            this@ExplanationOfBenefitAccidentLocationSurrogate.locationReference,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAccidentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var type: CodeableConcept? = null,
  public var location: ExplanationOfBenefit.Accident.Location? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Accident =
    ExplanationOfBenefit.Accident(
      id = this@ExplanationOfBenefitAccidentSurrogate.id,
      extension = this@ExplanationOfBenefitAccidentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitAccidentSurrogate.modifierExtension ?: mutableListOf(),
      date =
        Date.of(
          FhirDate.fromString(this@ExplanationOfBenefitAccidentSurrogate.date),
          this@ExplanationOfBenefitAccidentSurrogate._date,
        ),
      type = this@ExplanationOfBenefitAccidentSurrogate.type,
      location = this@ExplanationOfBenefitAccidentSurrogate.location,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Accident
    ): ExplanationOfBenefitAccidentSurrogate =
      with(model) {
        ExplanationOfBenefitAccidentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          type = this@with.type,
          location = this@with.location,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemBodySiteSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var site: MutableList<CodeableReference>? = null,
  public var subSite: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.BodySite =
    ExplanationOfBenefit.Item.BodySite(
      id = this@ExplanationOfBenefitItemBodySiteSurrogate.id,
      extension = this@ExplanationOfBenefitItemBodySiteSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitItemBodySiteSurrogate.modifierExtension ?: mutableListOf(),
      site = this@ExplanationOfBenefitItemBodySiteSurrogate.site ?: mutableListOf(),
      subSite = this@ExplanationOfBenefitItemBodySiteSurrogate.subSite ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.BodySite
    ): ExplanationOfBenefitItemBodySiteSurrogate =
      with(model) {
        ExplanationOfBenefitItemBodySiteSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          site = this@with.site.takeUnless { it.all { it == null } },
          subSite = this@with.subSite.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemReviewOutcomeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var decision: CodeableConcept? = null,
  public var reason: MutableList<CodeableConcept>? = null,
  public var preAuthRef: KotlinString? = null,
  public var _preAuthRef: Element? = null,
  public var preAuthPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.ReviewOutcome =
    ExplanationOfBenefit.Item.ReviewOutcome(
      id = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.id,
      extension = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitItemReviewOutcomeSurrogate.modifierExtension ?: mutableListOf(),
      decision = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.decision,
      reason = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.reason ?: mutableListOf(),
      preAuthRef =
        R5String.of(
          this@ExplanationOfBenefitItemReviewOutcomeSurrogate.preAuthRef,
          this@ExplanationOfBenefitItemReviewOutcomeSurrogate._preAuthRef,
        ),
      preAuthPeriod = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.preAuthPeriod,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.ReviewOutcome
    ): ExplanationOfBenefitItemReviewOutcomeSurrogate =
      with(model) {
        ExplanationOfBenefitItemReviewOutcomeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          decision = this@with.decision,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          preAuthRef = this@with.preAuthRef?.value,
          _preAuthRef = this@with.preAuthRef?.toElement(),
          preAuthPeriod = this@with.preAuthPeriod,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemAdjudicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept,
  public var reason: CodeableConcept? = null,
  public var amount: Money? = null,
  public var quantity: Quantity? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Adjudication =
    ExplanationOfBenefit.Item.Adjudication(
      id = this@ExplanationOfBenefitItemAdjudicationSurrogate.id,
      extension = this@ExplanationOfBenefitItemAdjudicationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitItemAdjudicationSurrogate.modifierExtension ?: mutableListOf(),
      category = this@ExplanationOfBenefitItemAdjudicationSurrogate.category,
      reason = this@ExplanationOfBenefitItemAdjudicationSurrogate.reason,
      amount = this@ExplanationOfBenefitItemAdjudicationSurrogate.amount,
      quantity = this@ExplanationOfBenefitItemAdjudicationSurrogate.quantity,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Adjudication
    ): ExplanationOfBenefitItemAdjudicationSurrogate =
      with(model) {
        ExplanationOfBenefitItemAdjudicationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          reason = this@with.reason,
          amount = this@with.amount,
          quantity = this@with.quantity,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var udi: MutableList<Reference>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Detail.SubDetail =
    ExplanationOfBenefit.Item.Detail.SubDetail(
      id = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.id,
      extension =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate.sequence,
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate._sequence,
        )!!,
      traceNumber =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.revenue,
      category = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.category,
      productOrService = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.productOrService,
      productOrServiceEnd =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.productOrServiceEnd,
      modifier = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.modifier ?: mutableListOf(),
      programCode =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.programCode ?: mutableListOf(),
      patientPaid = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.patientPaid,
      quantity = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.quantity,
      unitPrice = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate.factor,
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate._factor,
        ),
      tax = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.tax,
      net = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.net,
      udi = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.udi ?: mutableListOf(),
      noteNumber =
        if (
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitItemDetailSubDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemDetailSubDetailSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitItemDetailSubDetailSurrogate._noteNumber!!.size) {
                null
              })
            .zip(
              this@ExplanationOfBenefitItemDetailSubDetailSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitItemDetailSubDetailSurrogate.noteNumber!!.size) {
                  null
                }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.reviewOutcome,
      adjudication =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.adjudication ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Detail.SubDetail
    ): ExplanationOfBenefitItemDetailSubDetailSurrogate =
      with(model) {
        ExplanationOfBenefitItemDetailSubDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          category = this@with.category,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          patientPaid = this@with.patientPaid,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          udi = this@with.udi.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var udi: MutableList<Reference>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
  public var subDetail: MutableList<ExplanationOfBenefit.Item.Detail.SubDetail>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Detail =
    ExplanationOfBenefit.Item.Detail(
      id = this@ExplanationOfBenefitItemDetailSurrogate.id,
      extension = this@ExplanationOfBenefitItemDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitItemDetailSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitItemDetailSurrogate.sequence,
          this@ExplanationOfBenefitItemDetailSurrogate._sequence,
        )!!,
      traceNumber = this@ExplanationOfBenefitItemDetailSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ExplanationOfBenefitItemDetailSurrogate.revenue,
      category = this@ExplanationOfBenefitItemDetailSurrogate.category,
      productOrService = this@ExplanationOfBenefitItemDetailSurrogate.productOrService,
      productOrServiceEnd = this@ExplanationOfBenefitItemDetailSurrogate.productOrServiceEnd,
      modifier = this@ExplanationOfBenefitItemDetailSurrogate.modifier ?: mutableListOf(),
      programCode = this@ExplanationOfBenefitItemDetailSurrogate.programCode ?: mutableListOf(),
      patientPaid = this@ExplanationOfBenefitItemDetailSurrogate.patientPaid,
      quantity = this@ExplanationOfBenefitItemDetailSurrogate.quantity,
      unitPrice = this@ExplanationOfBenefitItemDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ExplanationOfBenefitItemDetailSurrogate.factor,
          this@ExplanationOfBenefitItemDetailSurrogate._factor,
        ),
      tax = this@ExplanationOfBenefitItemDetailSurrogate.tax,
      net = this@ExplanationOfBenefitItemDetailSurrogate.net,
      udi = this@ExplanationOfBenefitItemDetailSurrogate.udi ?: mutableListOf(),
      noteNumber =
        if (
          this@ExplanationOfBenefitItemDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitItemDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemDetailSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitItemDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemDetailSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitItemDetailSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ExplanationOfBenefitItemDetailSurrogate.reviewOutcome,
      adjudication = this@ExplanationOfBenefitItemDetailSurrogate.adjudication ?: mutableListOf(),
      subDetail = this@ExplanationOfBenefitItemDetailSurrogate.subDetail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Detail
    ): ExplanationOfBenefitItemDetailSurrogate =
      with(model) {
        ExplanationOfBenefitItemDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          category = this@with.category,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          patientPaid = this@with.patientPaid,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          udi = this@with.udi.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          subDetail = this@with.subDetail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemServicedSurrogate(
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Serviced? =
    ExplanationOfBenefit.Item.Serviced?.from(
      Date.of(
        FhirDate.fromString(this@ExplanationOfBenefitItemServicedSurrogate.servicedDate),
        this@ExplanationOfBenefitItemServicedSurrogate._servicedDate,
      ),
      this@ExplanationOfBenefitItemServicedSurrogate.servicedPeriod,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Serviced
    ): ExplanationOfBenefitItemServicedSurrogate =
      with(model) {
        ExplanationOfBenefitItemServicedSurrogate().apply {
          ExplanationOfBenefit.Item.Serviced?.from(
            Date.of(
              FhirDate.fromString(this@ExplanationOfBenefitItemServicedSurrogate.servicedDate),
              this@ExplanationOfBenefitItemServicedSurrogate._servicedDate,
            ),
            this@ExplanationOfBenefitItemServicedSurrogate.servicedPeriod,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemLocationSurrogate(
  public var locationCodeableConcept: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Location? =
    ExplanationOfBenefit.Item.Location?.from(
      this@ExplanationOfBenefitItemLocationSurrogate.locationCodeableConcept,
      this@ExplanationOfBenefitItemLocationSurrogate.locationAddress,
      this@ExplanationOfBenefitItemLocationSurrogate.locationReference,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Location
    ): ExplanationOfBenefitItemLocationSurrogate =
      with(model) {
        ExplanationOfBenefitItemLocationSurrogate().apply {
          ExplanationOfBenefit.Item.Location?.from(
            this@ExplanationOfBenefitItemLocationSurrogate.locationCodeableConcept,
            this@ExplanationOfBenefitItemLocationSurrogate.locationAddress,
            this@ExplanationOfBenefitItemLocationSurrogate.locationReference,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var careTeamSequence: MutableList<Int?>? = null,
  public var _careTeamSequence: MutableList<Element?>? = null,
  public var diagnosisSequence: MutableList<Int?>? = null,
  public var _diagnosisSequence: MutableList<Element?>? = null,
  public var procedureSequence: MutableList<Int?>? = null,
  public var _procedureSequence: MutableList<Element?>? = null,
  public var informationSequence: MutableList<Int?>? = null,
  public var _informationSequence: MutableList<Element?>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var request: MutableList<Reference>? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var udi: MutableList<Reference>? = null,
  public var bodySite: MutableList<ExplanationOfBenefit.Item.BodySite>? = null,
  public var encounter: MutableList<Reference>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
  public var detail: MutableList<ExplanationOfBenefit.Item.Detail>? = null,
  public var serviced: ExplanationOfBenefit.Item.Serviced? = null,
  public var location: ExplanationOfBenefit.Item.Location? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item =
    ExplanationOfBenefit.Item(
      id = this@ExplanationOfBenefitItemSurrogate.id,
      extension = this@ExplanationOfBenefitItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitItemSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitItemSurrogate.sequence,
          this@ExplanationOfBenefitItemSurrogate._sequence,
        )!!,
      careTeamSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.careTeamSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._careTeamSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemSurrogate.careTeamSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._careTeamSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._careTeamSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.careTeamSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      diagnosisSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.diagnosisSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._diagnosisSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemSurrogate.diagnosisSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._diagnosisSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._diagnosisSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.diagnosisSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      procedureSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.procedureSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._procedureSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemSurrogate.procedureSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._procedureSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._procedureSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.procedureSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      informationSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.informationSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._informationSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemSurrogate.informationSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._informationSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._informationSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.informationSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      traceNumber = this@ExplanationOfBenefitItemSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ExplanationOfBenefitItemSurrogate.revenue,
      category = this@ExplanationOfBenefitItemSurrogate.category,
      productOrService = this@ExplanationOfBenefitItemSurrogate.productOrService,
      productOrServiceEnd = this@ExplanationOfBenefitItemSurrogate.productOrServiceEnd,
      request = this@ExplanationOfBenefitItemSurrogate.request ?: mutableListOf(),
      modifier = this@ExplanationOfBenefitItemSurrogate.modifier ?: mutableListOf(),
      programCode = this@ExplanationOfBenefitItemSurrogate.programCode ?: mutableListOf(),
      serviced = this@ExplanationOfBenefitItemSurrogate.serviced,
      location = this@ExplanationOfBenefitItemSurrogate.location,
      patientPaid = this@ExplanationOfBenefitItemSurrogate.patientPaid,
      quantity = this@ExplanationOfBenefitItemSurrogate.quantity,
      unitPrice = this@ExplanationOfBenefitItemSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ExplanationOfBenefitItemSurrogate.factor,
          this@ExplanationOfBenefitItemSurrogate._factor,
        ),
      tax = this@ExplanationOfBenefitItemSurrogate.tax,
      net = this@ExplanationOfBenefitItemSurrogate.net,
      udi = this@ExplanationOfBenefitItemSurrogate.udi ?: mutableListOf(),
      bodySite = this@ExplanationOfBenefitItemSurrogate.bodySite ?: mutableListOf(),
      encounter = this@ExplanationOfBenefitItemSurrogate.encounter ?: mutableListOf(),
      noteNumber =
        if (
          this@ExplanationOfBenefitItemSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitItemSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitItemSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitItemSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitItemSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ExplanationOfBenefitItemSurrogate.reviewOutcome,
      adjudication = this@ExplanationOfBenefitItemSurrogate.adjudication ?: mutableListOf(),
      detail = this@ExplanationOfBenefitItemSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Item): ExplanationOfBenefitItemSurrogate =
      with(model) {
        ExplanationOfBenefitItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          careTeamSequence =
            this@with.careTeamSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _careTeamSequence =
            this@with.careTeamSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          diagnosisSequence =
            this@with.diagnosisSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _diagnosisSequence =
            this@with.diagnosisSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          procedureSequence =
            this@with.procedureSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _procedureSequence =
            this@with.procedureSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          informationSequence =
            this@with.informationSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _informationSequence =
            this@with.informationSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          category = this@with.category,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          request = this@with.request.takeUnless { it.all { it == null } },
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          serviced = this@with.serviced,
          location = this@with.location,
          patientPaid = this@with.patientPaid,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          udi = this@with.udi.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          encounter = this@with.encounter.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemBodySiteSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var site: MutableList<CodeableReference>? = null,
  public var subSite: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.BodySite =
    ExplanationOfBenefit.AddItem.BodySite(
      id = this@ExplanationOfBenefitAddItemBodySiteSurrogate.id,
      extension = this@ExplanationOfBenefitAddItemBodySiteSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitAddItemBodySiteSurrogate.modifierExtension ?: mutableListOf(),
      site = this@ExplanationOfBenefitAddItemBodySiteSurrogate.site ?: mutableListOf(),
      subSite = this@ExplanationOfBenefitAddItemBodySiteSurrogate.subSite ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.BodySite
    ): ExplanationOfBenefitAddItemBodySiteSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemBodySiteSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          site = this@with.site.takeUnless { it.all { it == null } },
          subSite = this@with.subSite.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.Detail.SubDetail =
    ExplanationOfBenefit.AddItem.Detail.SubDetail(
      id = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.id,
      extension =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.modifierExtension
          ?: mutableListOf(),
      traceNumber =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.revenue,
      productOrService = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.productOrService,
      productOrServiceEnd =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.productOrServiceEnd,
      modifier =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.modifier ?: mutableListOf(),
      patientPaid = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.patientPaid,
      quantity = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.quantity,
      unitPrice = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.factor,
          this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate._factor,
        ),
      tax = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.tax,
      net = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.net,
      noteNumber =
        if (
          this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate._noteNumber!!.size) {
                null
              })
            .zip(
              this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate._noteNumber
                ?: List(
                  this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.noteNumber!!.size
                ) {
                  null
                }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.reviewOutcome,
      adjudication =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.adjudication ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.Detail.SubDetail
    ): ExplanationOfBenefitAddItemDetailSubDetailSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemDetailSubDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          patientPaid = this@with.patientPaid,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
  public var subDetail: MutableList<ExplanationOfBenefit.AddItem.Detail.SubDetail>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.Detail =
    ExplanationOfBenefit.AddItem.Detail(
      id = this@ExplanationOfBenefitAddItemDetailSurrogate.id,
      extension = this@ExplanationOfBenefitAddItemDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitAddItemDetailSurrogate.modifierExtension ?: mutableListOf(),
      traceNumber = this@ExplanationOfBenefitAddItemDetailSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ExplanationOfBenefitAddItemDetailSurrogate.revenue,
      productOrService = this@ExplanationOfBenefitAddItemDetailSurrogate.productOrService,
      productOrServiceEnd = this@ExplanationOfBenefitAddItemDetailSurrogate.productOrServiceEnd,
      modifier = this@ExplanationOfBenefitAddItemDetailSurrogate.modifier ?: mutableListOf(),
      patientPaid = this@ExplanationOfBenefitAddItemDetailSurrogate.patientPaid,
      quantity = this@ExplanationOfBenefitAddItemDetailSurrogate.quantity,
      unitPrice = this@ExplanationOfBenefitAddItemDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ExplanationOfBenefitAddItemDetailSurrogate.factor,
          this@ExplanationOfBenefitAddItemDetailSurrogate._factor,
        ),
      tax = this@ExplanationOfBenefitAddItemDetailSurrogate.tax,
      net = this@ExplanationOfBenefitAddItemDetailSurrogate.net,
      noteNumber =
        if (
          this@ExplanationOfBenefitAddItemDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitAddItemDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitAddItemDetailSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitAddItemDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemDetailSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitAddItemDetailSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ExplanationOfBenefitAddItemDetailSurrogate.reviewOutcome,
      adjudication =
        this@ExplanationOfBenefitAddItemDetailSurrogate.adjudication ?: mutableListOf(),
      subDetail = this@ExplanationOfBenefitAddItemDetailSurrogate.subDetail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.Detail
    ): ExplanationOfBenefitAddItemDetailSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          patientPaid = this@with.patientPaid,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          subDetail = this@with.subDetail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemServicedSurrogate(
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.Serviced? =
    ExplanationOfBenefit.AddItem.Serviced?.from(
      Date.of(
        FhirDate.fromString(this@ExplanationOfBenefitAddItemServicedSurrogate.servicedDate),
        this@ExplanationOfBenefitAddItemServicedSurrogate._servicedDate,
      ),
      this@ExplanationOfBenefitAddItemServicedSurrogate.servicedPeriod,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.Serviced
    ): ExplanationOfBenefitAddItemServicedSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemServicedSurrogate().apply {
          ExplanationOfBenefit.AddItem.Serviced?.from(
            Date.of(
              FhirDate.fromString(this@ExplanationOfBenefitAddItemServicedSurrogate.servicedDate),
              this@ExplanationOfBenefitAddItemServicedSurrogate._servicedDate,
            ),
            this@ExplanationOfBenefitAddItemServicedSurrogate.servicedPeriod,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemLocationSurrogate(
  public var locationCodeableConcept: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.Location? =
    ExplanationOfBenefit.AddItem.Location?.from(
      this@ExplanationOfBenefitAddItemLocationSurrogate.locationCodeableConcept,
      this@ExplanationOfBenefitAddItemLocationSurrogate.locationAddress,
      this@ExplanationOfBenefitAddItemLocationSurrogate.locationReference,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.Location
    ): ExplanationOfBenefitAddItemLocationSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemLocationSurrogate().apply {
          ExplanationOfBenefit.AddItem.Location?.from(
            this@ExplanationOfBenefitAddItemLocationSurrogate.locationCodeableConcept,
            this@ExplanationOfBenefitAddItemLocationSurrogate.locationAddress,
            this@ExplanationOfBenefitAddItemLocationSurrogate.locationReference,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var itemSequence: MutableList<Int?>? = null,
  public var _itemSequence: MutableList<Element?>? = null,
  public var detailSequence: MutableList<Int?>? = null,
  public var _detailSequence: MutableList<Element?>? = null,
  public var subDetailSequence: MutableList<Int?>? = null,
  public var _subDetailSequence: MutableList<Element?>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var provider: MutableList<Reference>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var request: MutableList<Reference>? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var bodySite: MutableList<ExplanationOfBenefit.AddItem.BodySite>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
  public var detail: MutableList<ExplanationOfBenefit.AddItem.Detail>? = null,
  public var serviced: ExplanationOfBenefit.AddItem.Serviced? = null,
  public var location: ExplanationOfBenefit.AddItem.Location? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem =
    ExplanationOfBenefit.AddItem(
      id = this@ExplanationOfBenefitAddItemSurrogate.id,
      extension = this@ExplanationOfBenefitAddItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitAddItemSurrogate.modifierExtension ?: mutableListOf(),
      itemSequence =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.itemSequence == null &&
            this@ExplanationOfBenefitAddItemSurrogate._itemSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.itemSequence
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._itemSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._itemSequence
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.itemSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      detailSequence =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.detailSequence == null &&
            this@ExplanationOfBenefitAddItemSurrogate._detailSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.detailSequence
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._detailSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._detailSequence
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.detailSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      subDetailSequence =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.subDetailSequence == null &&
            this@ExplanationOfBenefitAddItemSurrogate._subDetailSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.subDetailSequence
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._subDetailSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._subDetailSequence
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.subDetailSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      traceNumber = this@ExplanationOfBenefitAddItemSurrogate.traceNumber ?: mutableListOf(),
      provider = this@ExplanationOfBenefitAddItemSurrogate.provider ?: mutableListOf(),
      revenue = this@ExplanationOfBenefitAddItemSurrogate.revenue,
      productOrService = this@ExplanationOfBenefitAddItemSurrogate.productOrService,
      productOrServiceEnd = this@ExplanationOfBenefitAddItemSurrogate.productOrServiceEnd,
      request = this@ExplanationOfBenefitAddItemSurrogate.request ?: mutableListOf(),
      modifier = this@ExplanationOfBenefitAddItemSurrogate.modifier ?: mutableListOf(),
      programCode = this@ExplanationOfBenefitAddItemSurrogate.programCode ?: mutableListOf(),
      serviced = this@ExplanationOfBenefitAddItemSurrogate.serviced,
      location = this@ExplanationOfBenefitAddItemSurrogate.location,
      patientPaid = this@ExplanationOfBenefitAddItemSurrogate.patientPaid,
      quantity = this@ExplanationOfBenefitAddItemSurrogate.quantity,
      unitPrice = this@ExplanationOfBenefitAddItemSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ExplanationOfBenefitAddItemSurrogate.factor,
          this@ExplanationOfBenefitAddItemSurrogate._factor,
        ),
      tax = this@ExplanationOfBenefitAddItemSurrogate.tax,
      net = this@ExplanationOfBenefitAddItemSurrogate.net,
      bodySite = this@ExplanationOfBenefitAddItemSurrogate.bodySite ?: mutableListOf(),
      noteNumber =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitAddItemSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ExplanationOfBenefitAddItemSurrogate.reviewOutcome,
      adjudication = this@ExplanationOfBenefitAddItemSurrogate.adjudication ?: mutableListOf(),
      detail = this@ExplanationOfBenefitAddItemSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem
    ): ExplanationOfBenefitAddItemSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          itemSequence =
            this@with.itemSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _itemSequence =
            this@with.itemSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          detailSequence =
            this@with.detailSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _detailSequence =
            this@with.detailSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          subDetailSequence =
            this@with.subDetailSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _subDetailSequence =
            this@with.subDetailSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          provider = this@with.provider.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          request = this@with.request.takeUnless { it.all { it == null } },
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          serviced = this@with.serviced,
          location = this@with.location,
          patientPaid = this@with.patientPaid,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitTotalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept,
  public var amount: Money,
) {
  public fun toModel(): ExplanationOfBenefit.Total =
    ExplanationOfBenefit.Total(
      id = this@ExplanationOfBenefitTotalSurrogate.id,
      extension = this@ExplanationOfBenefitTotalSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitTotalSurrogate.modifierExtension ?: mutableListOf(),
      category = this@ExplanationOfBenefitTotalSurrogate.category,
      amount = this@ExplanationOfBenefitTotalSurrogate.amount,
    )

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Total): ExplanationOfBenefitTotalSurrogate =
      with(model) {
        ExplanationOfBenefitTotalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitPaymentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var adjustment: Money? = null,
  public var adjustmentReason: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var amount: Money? = null,
  public var identifier: Identifier? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Payment =
    ExplanationOfBenefit.Payment(
      id = this@ExplanationOfBenefitPaymentSurrogate.id,
      extension = this@ExplanationOfBenefitPaymentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitPaymentSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ExplanationOfBenefitPaymentSurrogate.type,
      adjustment = this@ExplanationOfBenefitPaymentSurrogate.adjustment,
      adjustmentReason = this@ExplanationOfBenefitPaymentSurrogate.adjustmentReason,
      date =
        Date.of(
          FhirDate.fromString(this@ExplanationOfBenefitPaymentSurrogate.date),
          this@ExplanationOfBenefitPaymentSurrogate._date,
        ),
      amount = this@ExplanationOfBenefitPaymentSurrogate.amount,
      identifier = this@ExplanationOfBenefitPaymentSurrogate.identifier,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Payment
    ): ExplanationOfBenefitPaymentSurrogate =
      with(model) {
        ExplanationOfBenefitPaymentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          adjustment = this@with.adjustment,
          adjustmentReason = this@with.adjustmentReason,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          amount = this@with.amount,
          identifier = this@with.identifier,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitProcessNoteSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var type: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var language: CodeableConcept? = null,
) {
  public fun toModel(): ExplanationOfBenefit.ProcessNote =
    ExplanationOfBenefit.ProcessNote(
      id = this@ExplanationOfBenefitProcessNoteSurrogate.id,
      extension = this@ExplanationOfBenefitProcessNoteSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitProcessNoteSurrogate.modifierExtension ?: mutableListOf(),
      number =
        PositiveInt.of(
          this@ExplanationOfBenefitProcessNoteSurrogate.number,
          this@ExplanationOfBenefitProcessNoteSurrogate._number,
        ),
      type = this@ExplanationOfBenefitProcessNoteSurrogate.type,
      text =
        R5String.of(
          this@ExplanationOfBenefitProcessNoteSurrogate.text,
          this@ExplanationOfBenefitProcessNoteSurrogate._text,
        ),
      language = this@ExplanationOfBenefitProcessNoteSurrogate.language,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.ProcessNote
    ): ExplanationOfBenefitProcessNoteSurrogate =
      with(model) {
        ExplanationOfBenefitProcessNoteSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          number = this@with.number?.value,
          _number = this@with.number?.toElement(),
          type = this@with.type,
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          language = this@with.language,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate(
  public var allowedUnsignedInt: Int? = null,
  public var _allowedUnsignedInt: Element? = null,
  public var allowedString: KotlinString? = null,
  public var _allowedString: Element? = null,
  public var allowedMoney: Money? = null,
) {
  public fun toModel(): ExplanationOfBenefit.BenefitBalance.Financial.Allowed? =
    ExplanationOfBenefit.BenefitBalance.Financial.Allowed?.from(
      UnsignedInt.of(
        this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate.allowedUnsignedInt,
        this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate._allowedUnsignedInt,
      ),
      R5String.of(
        this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate.allowedString,
        this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate._allowedString,
      ),
      this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate.allowedMoney,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.BenefitBalance.Financial.Allowed
    ): ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate =
      with(model) {
        ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate().apply {
          ExplanationOfBenefit.BenefitBalance.Financial.Allowed?.from(
            UnsignedInt.of(
              this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate.allowedUnsignedInt,
              this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate._allowedUnsignedInt,
            ),
            R5String.of(
              this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate.allowedString,
              this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate._allowedString,
            ),
            this@ExplanationOfBenefitBenefitBalanceFinancialAllowedSurrogate.allowedMoney,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate(
  public var usedUnsignedInt: Int? = null,
  public var _usedUnsignedInt: Element? = null,
  public var usedMoney: Money? = null,
) {
  public fun toModel(): ExplanationOfBenefit.BenefitBalance.Financial.Used? =
    ExplanationOfBenefit.BenefitBalance.Financial.Used?.from(
      UnsignedInt.of(
        this@ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate.usedUnsignedInt,
        this@ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate._usedUnsignedInt,
      ),
      this@ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate.usedMoney,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.BenefitBalance.Financial.Used
    ): ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate =
      with(model) {
        ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate().apply {
          ExplanationOfBenefit.BenefitBalance.Financial.Used?.from(
            UnsignedInt.of(
              this@ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate.usedUnsignedInt,
              this@ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate._usedUnsignedInt,
            ),
            this@ExplanationOfBenefitBenefitBalanceFinancialUsedSurrogate.usedMoney,
          )
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitBenefitBalanceFinancialSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var allowed: ExplanationOfBenefit.BenefitBalance.Financial.Allowed? = null,
  public var used: ExplanationOfBenefit.BenefitBalance.Financial.Used? = null,
) {
  public fun toModel(): ExplanationOfBenefit.BenefitBalance.Financial =
    ExplanationOfBenefit.BenefitBalance.Financial(
      id = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.id,
      extension =
        this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.type,
      allowed = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.allowed,
      used = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.used,
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.BenefitBalance.Financial
    ): ExplanationOfBenefitBenefitBalanceFinancialSurrogate =
      with(model) {
        ExplanationOfBenefitBenefitBalanceFinancialSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          allowed = this@with.allowed,
          used = this@with.used,
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitBenefitBalanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept,
  public var excluded: KotlinBoolean? = null,
  public var _excluded: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var network: CodeableConcept? = null,
  public var unit: CodeableConcept? = null,
  public var term: CodeableConcept? = null,
  public var financial: MutableList<ExplanationOfBenefit.BenefitBalance.Financial>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.BenefitBalance =
    ExplanationOfBenefit.BenefitBalance(
      id = this@ExplanationOfBenefitBenefitBalanceSurrogate.id,
      extension = this@ExplanationOfBenefitBenefitBalanceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ExplanationOfBenefitBenefitBalanceSurrogate.modifierExtension ?: mutableListOf(),
      category = this@ExplanationOfBenefitBenefitBalanceSurrogate.category,
      excluded =
        R5Boolean.of(
          this@ExplanationOfBenefitBenefitBalanceSurrogate.excluded,
          this@ExplanationOfBenefitBenefitBalanceSurrogate._excluded,
        ),
      name =
        R5String.of(
          this@ExplanationOfBenefitBenefitBalanceSurrogate.name,
          this@ExplanationOfBenefitBenefitBalanceSurrogate._name,
        ),
      description =
        R5String.of(
          this@ExplanationOfBenefitBenefitBalanceSurrogate.description,
          this@ExplanationOfBenefitBenefitBalanceSurrogate._description,
        ),
      network = this@ExplanationOfBenefitBenefitBalanceSurrogate.network,
      unit = this@ExplanationOfBenefitBenefitBalanceSurrogate.unit,
      term = this@ExplanationOfBenefitBenefitBalanceSurrogate.term,
      financial = this@ExplanationOfBenefitBenefitBalanceSurrogate.financial ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.BenefitBalance
    ): ExplanationOfBenefitBenefitBalanceSurrogate =
      with(model) {
        ExplanationOfBenefitBenefitBalanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          excluded = this@with.excluded?.value,
          _excluded = this@with.excluded?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          network = this@with.network,
          unit = this@with.unit,
          term = this@with.term,
          financial = this@with.financial.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitSurrogate(
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
  public var traceNumber: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept,
  public var subType: CodeableConcept? = null,
  public var use: KotlinString? = null,
  public var _use: Element? = null,
  public var patient: Reference,
  public var billablePeriod: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var enterer: Reference? = null,
  public var insurer: Reference? = null,
  public var provider: Reference? = null,
  public var priority: CodeableConcept? = null,
  public var fundsReserveRequested: CodeableConcept? = null,
  public var fundsReserve: CodeableConcept? = null,
  public var related: MutableList<ExplanationOfBenefit.Related>? = null,
  public var prescription: Reference? = null,
  public var originalPrescription: Reference? = null,
  public var event: MutableList<ExplanationOfBenefit.Event>? = null,
  public var payee: ExplanationOfBenefit.Payee? = null,
  public var referral: Reference? = null,
  public var encounter: MutableList<Reference>? = null,
  public var facility: Reference? = null,
  public var claim: Reference? = null,
  public var claimResponse: Reference? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var decision: CodeableConcept? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var preAuthRef: MutableList<KotlinString?>? = null,
  public var _preAuthRef: MutableList<Element?>? = null,
  public var preAuthRefPeriod: MutableList<Period>? = null,
  public var diagnosisRelatedGroup: CodeableConcept? = null,
  public var careTeam: MutableList<ExplanationOfBenefit.CareTeam>? = null,
  public var supportingInfo: MutableList<ExplanationOfBenefit.SupportingInfo>? = null,
  public var diagnosis: MutableList<ExplanationOfBenefit.Diagnosis>? = null,
  public var procedure: MutableList<ExplanationOfBenefit.Procedure>? = null,
  public var precedence: Int? = null,
  public var _precedence: Element? = null,
  public var insurance: MutableList<ExplanationOfBenefit.Insurance>? = null,
  public var accident: ExplanationOfBenefit.Accident? = null,
  public var patientPaid: Money? = null,
  public var item: MutableList<ExplanationOfBenefit.Item>? = null,
  public var addItem: MutableList<ExplanationOfBenefit.AddItem>? = null,
  public var adjudication: MutableList<ExplanationOfBenefit.Item.Adjudication>? = null,
  public var total: MutableList<ExplanationOfBenefit.Total>? = null,
  public var payment: ExplanationOfBenefit.Payment? = null,
  public var formCode: CodeableConcept? = null,
  public var form: Attachment? = null,
  public var processNote: MutableList<ExplanationOfBenefit.ProcessNote>? = null,
  public var benefitPeriod: Period? = null,
  public var benefitBalance: MutableList<ExplanationOfBenefit.BenefitBalance>? = null,
) {
  public fun toModel(): ExplanationOfBenefit =
    ExplanationOfBenefit(
      id = this@ExplanationOfBenefitSurrogate.id,
      meta = this@ExplanationOfBenefitSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ExplanationOfBenefitSurrogate.implicitRules,
          this@ExplanationOfBenefitSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ExplanationOfBenefitSurrogate.language,
          this@ExplanationOfBenefitSurrogate._language,
        ),
      text = this@ExplanationOfBenefitSurrogate.text,
      contained = this@ExplanationOfBenefitSurrogate.contained ?: mutableListOf(),
      extension = this@ExplanationOfBenefitSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ExplanationOfBenefitSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ExplanationOfBenefitSurrogate.identifier ?: mutableListOf(),
      traceNumber = this@ExplanationOfBenefitSurrogate.traceNumber ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.ExplanationOfBenefit.ExplanationOfBenefitStatus.fromCode(
            this@ExplanationOfBenefitSurrogate.status!!
          ),
          this@ExplanationOfBenefitSurrogate._status,
        ),
      type = this@ExplanationOfBenefitSurrogate.type,
      subType = this@ExplanationOfBenefitSurrogate.subType,
      use =
        Enumeration.of(
          com.google.fhir.model.r5.ExplanationOfBenefit.Use.fromCode(
            this@ExplanationOfBenefitSurrogate.use!!
          ),
          this@ExplanationOfBenefitSurrogate._use,
        ),
      patient = this@ExplanationOfBenefitSurrogate.patient,
      billablePeriod = this@ExplanationOfBenefitSurrogate.billablePeriod,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@ExplanationOfBenefitSurrogate.created),
          this@ExplanationOfBenefitSurrogate._created,
        )!!,
      enterer = this@ExplanationOfBenefitSurrogate.enterer,
      insurer = this@ExplanationOfBenefitSurrogate.insurer,
      provider = this@ExplanationOfBenefitSurrogate.provider,
      priority = this@ExplanationOfBenefitSurrogate.priority,
      fundsReserveRequested = this@ExplanationOfBenefitSurrogate.fundsReserveRequested,
      fundsReserve = this@ExplanationOfBenefitSurrogate.fundsReserve,
      related = this@ExplanationOfBenefitSurrogate.related ?: mutableListOf(),
      prescription = this@ExplanationOfBenefitSurrogate.prescription,
      originalPrescription = this@ExplanationOfBenefitSurrogate.originalPrescription,
      event = this@ExplanationOfBenefitSurrogate.event ?: mutableListOf(),
      payee = this@ExplanationOfBenefitSurrogate.payee,
      referral = this@ExplanationOfBenefitSurrogate.referral,
      encounter = this@ExplanationOfBenefitSurrogate.encounter ?: mutableListOf(),
      facility = this@ExplanationOfBenefitSurrogate.facility,
      claim = this@ExplanationOfBenefitSurrogate.claim,
      claimResponse = this@ExplanationOfBenefitSurrogate.claimResponse,
      outcome =
        Enumeration.of(
          com.google.fhir.model.r5.ExplanationOfBenefit.ClaimOutcome.fromCode(
            this@ExplanationOfBenefitSurrogate.outcome!!
          ),
          this@ExplanationOfBenefitSurrogate._outcome,
        ),
      decision = this@ExplanationOfBenefitSurrogate.decision,
      disposition =
        R5String.of(
          this@ExplanationOfBenefitSurrogate.disposition,
          this@ExplanationOfBenefitSurrogate._disposition,
        ),
      preAuthRef =
        if (
          this@ExplanationOfBenefitSurrogate.preAuthRef == null &&
            this@ExplanationOfBenefitSurrogate._preAuthRef == null
        ) {
          mutableListOf()
        } else {
          (this@ExplanationOfBenefitSurrogate.preAuthRef
              ?: List(this@ExplanationOfBenefitSurrogate._preAuthRef!!.size) { null })
            .zip(
              this@ExplanationOfBenefitSurrogate._preAuthRef
                ?: List(this@ExplanationOfBenefitSurrogate.preAuthRef!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      preAuthRefPeriod = this@ExplanationOfBenefitSurrogate.preAuthRefPeriod ?: mutableListOf(),
      diagnosisRelatedGroup = this@ExplanationOfBenefitSurrogate.diagnosisRelatedGroup,
      careTeam = this@ExplanationOfBenefitSurrogate.careTeam ?: mutableListOf(),
      supportingInfo = this@ExplanationOfBenefitSurrogate.supportingInfo ?: mutableListOf(),
      diagnosis = this@ExplanationOfBenefitSurrogate.diagnosis ?: mutableListOf(),
      procedure = this@ExplanationOfBenefitSurrogate.procedure ?: mutableListOf(),
      precedence =
        PositiveInt.of(
          this@ExplanationOfBenefitSurrogate.precedence,
          this@ExplanationOfBenefitSurrogate._precedence,
        ),
      insurance = this@ExplanationOfBenefitSurrogate.insurance ?: mutableListOf(),
      accident = this@ExplanationOfBenefitSurrogate.accident,
      patientPaid = this@ExplanationOfBenefitSurrogate.patientPaid,
      item = this@ExplanationOfBenefitSurrogate.item ?: mutableListOf(),
      addItem = this@ExplanationOfBenefitSurrogate.addItem ?: mutableListOf(),
      adjudication = this@ExplanationOfBenefitSurrogate.adjudication ?: mutableListOf(),
      total = this@ExplanationOfBenefitSurrogate.total ?: mutableListOf(),
      payment = this@ExplanationOfBenefitSurrogate.payment,
      formCode = this@ExplanationOfBenefitSurrogate.formCode,
      form = this@ExplanationOfBenefitSurrogate.form,
      processNote = this@ExplanationOfBenefitSurrogate.processNote ?: mutableListOf(),
      benefitPeriod = this@ExplanationOfBenefitSurrogate.benefitPeriod,
      benefitBalance = this@ExplanationOfBenefitSurrogate.benefitBalance ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit): ExplanationOfBenefitSurrogate =
      with(model) {
        ExplanationOfBenefitSurrogate(
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
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          type = this@with.type,
          subType = this@with.subType,
          use = this@with.use.value?.getCode(),
          _use = this@with.use.toElement(),
          patient = this@with.patient,
          billablePeriod = this@with.billablePeriod,
          created = this@with.created.value?.toString(),
          _created = this@with.created.toElement(),
          enterer = this@with.enterer,
          insurer = this@with.insurer,
          provider = this@with.provider,
          priority = this@with.priority,
          fundsReserveRequested = this@with.fundsReserveRequested,
          fundsReserve = this@with.fundsReserve,
          related = this@with.related.takeUnless { it.all { it == null } },
          prescription = this@with.prescription,
          originalPrescription = this@with.originalPrescription,
          event = this@with.event.takeUnless { it.all { it == null } },
          payee = this@with.payee,
          referral = this@with.referral,
          encounter = this@with.encounter.takeUnless { it.all { it == null } },
          facility = this@with.facility,
          claim = this@with.claim,
          claimResponse = this@with.claimResponse,
          outcome = this@with.outcome.value?.getCode(),
          _outcome = this@with.outcome.toElement(),
          decision = this@with.decision,
          disposition = this@with.disposition?.value,
          _disposition = this@with.disposition?.toElement(),
          preAuthRef =
            this@with.preAuthRef
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _preAuthRef =
            this@with.preAuthRef
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          preAuthRefPeriod = this@with.preAuthRefPeriod.takeUnless { it.all { it == null } },
          diagnosisRelatedGroup = this@with.diagnosisRelatedGroup,
          careTeam = this@with.careTeam.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          diagnosis = this@with.diagnosis.takeUnless { it.all { it == null } },
          procedure = this@with.procedure.takeUnless { it.all { it == null } },
          precedence = this@with.precedence?.value,
          _precedence = this@with.precedence?.toElement(),
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          accident = this@with.accident,
          patientPaid = this@with.patientPaid,
          item = this@with.item.takeUnless { it.all { it == null } },
          addItem = this@with.addItem.takeUnless { it.all { it == null } },
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          total = this@with.total.takeUnless { it.all { it == null } },
          payment = this@with.payment,
          formCode = this@with.formCode,
          form = this@with.form,
          processNote = this@with.processNote.takeUnless { it.all { it == null } },
          benefitPeriod = this@with.benefitPeriod,
          benefitBalance = this@with.benefitBalance.takeUnless { it.all { it == null } },
        )
      }
  }
}
