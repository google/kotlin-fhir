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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ExplanationOfBenefitRelatedSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var claim: Reference? = null,
  public var relationship: CodeableConcept? = null,
  public var reference: Identifier? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Related =
    ExplanationOfBenefit.Related().apply {
      id = this@ExplanationOfBenefitRelatedSurrogate.id
      extension = this@ExplanationOfBenefitRelatedSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitRelatedSurrogate.modifierExtension
      claim = this@ExplanationOfBenefitRelatedSurrogate.claim
      relationship = this@ExplanationOfBenefitRelatedSurrogate.relationship
      reference = this@ExplanationOfBenefitRelatedSurrogate.reference
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Related
    ): ExplanationOfBenefitRelatedSurrogate =
      with(model) {
        ExplanationOfBenefitRelatedSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          claim = this@with.claim
          relationship = this@with.relationship
          reference = this@with.reference
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var whenDateTime: KotlinString? = null,
  public var _whenDateTime: Element? = null,
  public var whenPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Event =
    ExplanationOfBenefit.Event().apply {
      id = this@ExplanationOfBenefitEventSurrogate.id
      extension = this@ExplanationOfBenefitEventSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitEventSurrogate.modifierExtension
      type = this@ExplanationOfBenefitEventSurrogate.type
      `when` =
        ExplanationOfBenefit.Event.When?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ExplanationOfBenefitEventSurrogate.whenDateTime),
            this@ExplanationOfBenefitEventSurrogate._whenDateTime,
          ),
          this@ExplanationOfBenefitEventSurrogate.whenPeriod,
        )
    }

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Event): ExplanationOfBenefitEventSurrogate =
      with(model) {
        ExplanationOfBenefitEventSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          whenDateTime = this@with.`when`?.asDateTime()?.value?.value?.toString()
          _whenDateTime = this@with.`when`?.asDateTime()?.value?.toElement()
          whenPeriod = this@with.`when`?.asPeriod()?.value
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitPayeeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Payee =
    ExplanationOfBenefit.Payee().apply {
      id = this@ExplanationOfBenefitPayeeSurrogate.id
      extension = this@ExplanationOfBenefitPayeeSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitPayeeSurrogate.modifierExtension
      type = this@ExplanationOfBenefitPayeeSurrogate.type
      party = this@ExplanationOfBenefitPayeeSurrogate.party
    }

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Payee): ExplanationOfBenefitPayeeSurrogate =
      with(model) {
        ExplanationOfBenefitPayeeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          party = this@with.party
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitCareTeamSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var provider: Reference? = null,
  public var responsible: KotlinBoolean? = null,
  public var _responsible: Element? = null,
  public var role: CodeableConcept? = null,
  public var specialty: CodeableConcept? = null,
) {
  public fun toModel(): ExplanationOfBenefit.CareTeam =
    ExplanationOfBenefit.CareTeam().apply {
      id = this@ExplanationOfBenefitCareTeamSurrogate.id
      extension = this@ExplanationOfBenefitCareTeamSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitCareTeamSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitCareTeamSurrogate.sequence,
          this@ExplanationOfBenefitCareTeamSurrogate._sequence,
        )
      provider = this@ExplanationOfBenefitCareTeamSurrogate.provider
      responsible =
        R5Boolean.of(
          this@ExplanationOfBenefitCareTeamSurrogate.responsible,
          this@ExplanationOfBenefitCareTeamSurrogate._responsible,
        )
      role = this@ExplanationOfBenefitCareTeamSurrogate.role
      specialty = this@ExplanationOfBenefitCareTeamSurrogate.specialty
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.CareTeam
    ): ExplanationOfBenefitCareTeamSurrogate =
      with(model) {
        ExplanationOfBenefitCareTeamSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          provider = this@with.provider
          responsible = this@with.responsible?.value
          _responsible = this@with.responsible?.toElement()
          role = this@with.role
          specialty = this@with.specialty
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var category: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var timingDate: KotlinString? = null,
  public var _timingDate: Element? = null,
  public var timingPeriod: Period? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueAttachment: Attachment? = null,
  public var valueReference: Reference? = null,
  public var valueIdentifier: Identifier? = null,
  public var reason: Coding? = null,
) {
  public fun toModel(): ExplanationOfBenefit.SupportingInfo =
    ExplanationOfBenefit.SupportingInfo().apply {
      id = this@ExplanationOfBenefitSupportingInfoSurrogate.id
      extension = this@ExplanationOfBenefitSupportingInfoSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitSupportingInfoSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitSupportingInfoSurrogate.sequence,
          this@ExplanationOfBenefitSupportingInfoSurrogate._sequence,
        )
      category = this@ExplanationOfBenefitSupportingInfoSurrogate.category
      code = this@ExplanationOfBenefitSupportingInfoSurrogate.code
      timing =
        ExplanationOfBenefit.SupportingInfo.Timing?.from(
          Date.of(
            FhirDate.fromString(this@ExplanationOfBenefitSupportingInfoSurrogate.timingDate),
            this@ExplanationOfBenefitSupportingInfoSurrogate._timingDate,
          ),
          this@ExplanationOfBenefitSupportingInfoSurrogate.timingPeriod,
        )
      `value` =
        ExplanationOfBenefit.SupportingInfo.Value?.from(
          R5Boolean.of(
            this@ExplanationOfBenefitSupportingInfoSurrogate.valueBoolean,
            this@ExplanationOfBenefitSupportingInfoSurrogate._valueBoolean,
          ),
          R5String.of(
            this@ExplanationOfBenefitSupportingInfoSurrogate.valueString,
            this@ExplanationOfBenefitSupportingInfoSurrogate._valueString,
          ),
          this@ExplanationOfBenefitSupportingInfoSurrogate.valueQuantity,
          this@ExplanationOfBenefitSupportingInfoSurrogate.valueAttachment,
          this@ExplanationOfBenefitSupportingInfoSurrogate.valueReference,
          this@ExplanationOfBenefitSupportingInfoSurrogate.valueIdentifier,
        )
      reason = this@ExplanationOfBenefitSupportingInfoSurrogate.reason
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.SupportingInfo
    ): ExplanationOfBenefitSupportingInfoSurrogate =
      with(model) {
        ExplanationOfBenefitSupportingInfoSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          category = this@with.category
          code = this@with.code
          timingDate = this@with.timing?.asDate()?.value?.value?.toString()
          _timingDate = this@with.timing?.asDate()?.value?.toElement()
          timingPeriod = this@with.timing?.asPeriod()?.value
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueAttachment = this@with.`value`?.asAttachment()?.value
          valueReference = this@with.`value`?.asReference()?.value
          valueIdentifier = this@with.`value`?.asIdentifier()?.value
          reason = this@with.reason
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var diagnosisCodeableConcept: CodeableConcept? = null,
  public var diagnosisReference: Reference? = null,
  public var type: List<CodeableConcept?>? = null,
  public var onAdmission: CodeableConcept? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Diagnosis =
    ExplanationOfBenefit.Diagnosis().apply {
      id = this@ExplanationOfBenefitDiagnosisSurrogate.id
      extension = this@ExplanationOfBenefitDiagnosisSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitDiagnosisSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitDiagnosisSurrogate.sequence,
          this@ExplanationOfBenefitDiagnosisSurrogate._sequence,
        )
      diagnosis =
        ExplanationOfBenefit.Diagnosis.Diagnosis?.from(
          this@ExplanationOfBenefitDiagnosisSurrogate.diagnosisCodeableConcept,
          this@ExplanationOfBenefitDiagnosisSurrogate.diagnosisReference,
        )
      type = this@ExplanationOfBenefitDiagnosisSurrogate.type
      onAdmission = this@ExplanationOfBenefitDiagnosisSurrogate.onAdmission
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Diagnosis
    ): ExplanationOfBenefitDiagnosisSurrogate =
      with(model) {
        ExplanationOfBenefitDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          diagnosisCodeableConcept = this@with.diagnosis?.asCodeableConcept()?.value
          diagnosisReference = this@with.diagnosis?.asReference()?.value
          type = this@with.type
          onAdmission = this@with.onAdmission
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var procedureCodeableConcept: CodeableConcept? = null,
  public var procedureReference: Reference? = null,
  public var udi: List<Reference?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Procedure =
    ExplanationOfBenefit.Procedure().apply {
      id = this@ExplanationOfBenefitProcedureSurrogate.id
      extension = this@ExplanationOfBenefitProcedureSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitProcedureSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitProcedureSurrogate.sequence,
          this@ExplanationOfBenefitProcedureSurrogate._sequence,
        )
      type = this@ExplanationOfBenefitProcedureSurrogate.type
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ExplanationOfBenefitProcedureSurrogate.date),
          this@ExplanationOfBenefitProcedureSurrogate._date,
        )
      procedure =
        ExplanationOfBenefit.Procedure.Procedure?.from(
          this@ExplanationOfBenefitProcedureSurrogate.procedureCodeableConcept,
          this@ExplanationOfBenefitProcedureSurrogate.procedureReference,
        )
      udi = this@ExplanationOfBenefitProcedureSurrogate.udi
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Procedure
    ): ExplanationOfBenefitProcedureSurrogate =
      with(model) {
        ExplanationOfBenefitProcedureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          type = this@with.type
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          procedureCodeableConcept = this@with.procedure?.asCodeableConcept()?.value
          procedureReference = this@with.procedure?.asReference()?.value
          udi = this@with.udi
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var coverage: Reference? = null,
  public var preAuthRef: List<KotlinString?>? = null,
  public var _preAuthRef: List<Element?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Insurance =
    ExplanationOfBenefit.Insurance().apply {
      id = this@ExplanationOfBenefitInsuranceSurrogate.id
      extension = this@ExplanationOfBenefitInsuranceSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitInsuranceSurrogate.modifierExtension
      focal =
        R5Boolean.of(
          this@ExplanationOfBenefitInsuranceSurrogate.focal,
          this@ExplanationOfBenefitInsuranceSurrogate._focal,
        )
      coverage = this@ExplanationOfBenefitInsuranceSurrogate.coverage
      preAuthRef =
        if (
          this@ExplanationOfBenefitInsuranceSurrogate.preAuthRef == null &&
            this@ExplanationOfBenefitInsuranceSurrogate._preAuthRef == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitInsuranceSurrogate.preAuthRef
              ?: List(this@ExplanationOfBenefitInsuranceSurrogate._preAuthRef!!.size) { null })
            .zip(
              this@ExplanationOfBenefitInsuranceSurrogate._preAuthRef
                ?: List(this@ExplanationOfBenefitInsuranceSurrogate.preAuthRef!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Insurance
    ): ExplanationOfBenefitInsuranceSurrogate =
      with(model) {
        ExplanationOfBenefitInsuranceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          focal = this@with.focal?.value
          _focal = this@with.focal?.toElement()
          coverage = this@with.coverage
          preAuthRef = this@with.preAuthRef?.map { it?.value }?.takeUnless { it.all { it == null } }
          _preAuthRef =
            this@with.preAuthRef?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAccidentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var type: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Accident =
    ExplanationOfBenefit.Accident().apply {
      id = this@ExplanationOfBenefitAccidentSurrogate.id
      extension = this@ExplanationOfBenefitAccidentSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitAccidentSurrogate.modifierExtension
      date =
        Date.of(
          FhirDate.fromString(this@ExplanationOfBenefitAccidentSurrogate.date),
          this@ExplanationOfBenefitAccidentSurrogate._date,
        )
      type = this@ExplanationOfBenefitAccidentSurrogate.type
      location =
        ExplanationOfBenefit.Accident.Location?.from(
          this@ExplanationOfBenefitAccidentSurrogate.locationAddress,
          this@ExplanationOfBenefitAccidentSurrogate.locationReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Accident
    ): ExplanationOfBenefitAccidentSurrogate =
      with(model) {
        ExplanationOfBenefitAccidentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          type = this@with.type
          locationAddress = this@with.location?.asAddress()?.value
          locationReference = this@with.location?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemBodySiteSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var site: List<CodeableReference?>? = null,
  public var subSite: List<CodeableConcept?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.BodySite =
    ExplanationOfBenefit.Item.BodySite().apply {
      id = this@ExplanationOfBenefitItemBodySiteSurrogate.id
      extension = this@ExplanationOfBenefitItemBodySiteSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitItemBodySiteSurrogate.modifierExtension
      site = this@ExplanationOfBenefitItemBodySiteSurrogate.site
      subSite = this@ExplanationOfBenefitItemBodySiteSurrogate.subSite
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.BodySite
    ): ExplanationOfBenefitItemBodySiteSurrogate =
      with(model) {
        ExplanationOfBenefitItemBodySiteSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          site = this@with.site
          subSite = this@with.subSite
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemReviewOutcomeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var decision: CodeableConcept? = null,
  public var reason: List<CodeableConcept?>? = null,
  public var preAuthRef: KotlinString? = null,
  public var _preAuthRef: Element? = null,
  public var preAuthPeriod: Period? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.ReviewOutcome =
    ExplanationOfBenefit.Item.ReviewOutcome().apply {
      id = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.id
      extension = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.modifierExtension
      decision = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.decision
      reason = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.reason
      preAuthRef =
        R5String.of(
          this@ExplanationOfBenefitItemReviewOutcomeSurrogate.preAuthRef,
          this@ExplanationOfBenefitItemReviewOutcomeSurrogate._preAuthRef,
        )
      preAuthPeriod = this@ExplanationOfBenefitItemReviewOutcomeSurrogate.preAuthPeriod
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.ReviewOutcome
    ): ExplanationOfBenefitItemReviewOutcomeSurrogate =
      with(model) {
        ExplanationOfBenefitItemReviewOutcomeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          decision = this@with.decision
          reason = this@with.reason
          preAuthRef = this@with.preAuthRef?.value
          _preAuthRef = this@with.preAuthRef?.toElement()
          preAuthPeriod = this@with.preAuthPeriod
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemAdjudicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var reason: CodeableConcept? = null,
  public var amount: Money? = null,
  public var quantity: Quantity? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Adjudication =
    ExplanationOfBenefit.Item.Adjudication().apply {
      id = this@ExplanationOfBenefitItemAdjudicationSurrogate.id
      extension = this@ExplanationOfBenefitItemAdjudicationSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitItemAdjudicationSurrogate.modifierExtension
      category = this@ExplanationOfBenefitItemAdjudicationSurrogate.category
      reason = this@ExplanationOfBenefitItemAdjudicationSurrogate.reason
      amount = this@ExplanationOfBenefitItemAdjudicationSurrogate.amount
      quantity = this@ExplanationOfBenefitItemAdjudicationSurrogate.quantity
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Adjudication
    ): ExplanationOfBenefitItemAdjudicationSurrogate =
      with(model) {
        ExplanationOfBenefitItemAdjudicationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          reason = this@with.reason
          amount = this@with.amount
          quantity = this@with.quantity
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var udi: List<Reference?>? = null,
  public var noteNumber: List<Int?>? = null,
  public var _noteNumber: List<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Detail.SubDetail =
    ExplanationOfBenefit.Item.Detail.SubDetail().apply {
      id = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.id
      extension = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate.sequence,
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate._sequence,
        )
      traceNumber = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.traceNumber
      revenue = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.revenue
      category = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.category
      productOrService = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.productOrService
      productOrServiceEnd =
        this@ExplanationOfBenefitItemDetailSubDetailSurrogate.productOrServiceEnd
      modifier = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.modifier
      programCode = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.programCode
      patientPaid = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.patientPaid
      quantity = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.quantity
      unitPrice = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate.factor,
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate._factor,
        )
      tax = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.tax
      net = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.net
      udi = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.udi
      noteNumber =
        if (
          this@ExplanationOfBenefitItemDetailSubDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitItemDetailSubDetailSurrogate._noteNumber == null
        ) {
          null
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
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      reviewOutcome = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.reviewOutcome
      adjudication = this@ExplanationOfBenefitItemDetailSubDetailSurrogate.adjudication
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Detail.SubDetail
    ): ExplanationOfBenefitItemDetailSubDetailSurrogate =
      with(model) {
        ExplanationOfBenefitItemDetailSubDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          traceNumber = this@with.traceNumber
          revenue = this@with.revenue
          category = this@with.category
          productOrService = this@with.productOrService
          productOrServiceEnd = this@with.productOrServiceEnd
          modifier = this@with.modifier
          programCode = this@with.programCode
          patientPaid = this@with.patientPaid
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          tax = this@with.tax
          net = this@with.net
          udi = this@with.udi
          noteNumber = this@with.noteNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _noteNumber =
            this@with.noteNumber?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reviewOutcome = this@with.reviewOutcome
          adjudication = this@with.adjudication
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var udi: List<Reference?>? = null,
  public var noteNumber: List<Int?>? = null,
  public var _noteNumber: List<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication?>? = null,
  public var subDetail: List<ExplanationOfBenefit.Item.Detail.SubDetail>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item.Detail =
    ExplanationOfBenefit.Item.Detail().apply {
      id = this@ExplanationOfBenefitItemDetailSurrogate.id
      extension = this@ExplanationOfBenefitItemDetailSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitItemDetailSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitItemDetailSurrogate.sequence,
          this@ExplanationOfBenefitItemDetailSurrogate._sequence,
        )
      traceNumber = this@ExplanationOfBenefitItemDetailSurrogate.traceNumber
      revenue = this@ExplanationOfBenefitItemDetailSurrogate.revenue
      category = this@ExplanationOfBenefitItemDetailSurrogate.category
      productOrService = this@ExplanationOfBenefitItemDetailSurrogate.productOrService
      productOrServiceEnd = this@ExplanationOfBenefitItemDetailSurrogate.productOrServiceEnd
      modifier = this@ExplanationOfBenefitItemDetailSurrogate.modifier
      programCode = this@ExplanationOfBenefitItemDetailSurrogate.programCode
      patientPaid = this@ExplanationOfBenefitItemDetailSurrogate.patientPaid
      quantity = this@ExplanationOfBenefitItemDetailSurrogate.quantity
      unitPrice = this@ExplanationOfBenefitItemDetailSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ExplanationOfBenefitItemDetailSurrogate.factor,
          this@ExplanationOfBenefitItemDetailSurrogate._factor,
        )
      tax = this@ExplanationOfBenefitItemDetailSurrogate.tax
      net = this@ExplanationOfBenefitItemDetailSurrogate.net
      udi = this@ExplanationOfBenefitItemDetailSurrogate.udi
      noteNumber =
        if (
          this@ExplanationOfBenefitItemDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitItemDetailSurrogate._noteNumber == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitItemDetailSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitItemDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemDetailSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitItemDetailSurrogate.noteNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      reviewOutcome = this@ExplanationOfBenefitItemDetailSurrogate.reviewOutcome
      adjudication = this@ExplanationOfBenefitItemDetailSurrogate.adjudication
      subDetail = this@ExplanationOfBenefitItemDetailSurrogate.subDetail
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Item.Detail
    ): ExplanationOfBenefitItemDetailSurrogate =
      with(model) {
        ExplanationOfBenefitItemDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          traceNumber = this@with.traceNumber
          revenue = this@with.revenue
          category = this@with.category
          productOrService = this@with.productOrService
          productOrServiceEnd = this@with.productOrServiceEnd
          modifier = this@with.modifier
          programCode = this@with.programCode
          patientPaid = this@with.patientPaid
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          tax = this@with.tax
          net = this@with.net
          udi = this@with.udi
          noteNumber = this@with.noteNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _noteNumber =
            this@with.noteNumber?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reviewOutcome = this@with.reviewOutcome
          adjudication = this@with.adjudication
          subDetail = this@with.subDetail
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var careTeamSequence: List<Int?>? = null,
  public var _careTeamSequence: List<Element?>? = null,
  public var diagnosisSequence: List<Int?>? = null,
  public var _diagnosisSequence: List<Element?>? = null,
  public var procedureSequence: List<Int?>? = null,
  public var _procedureSequence: List<Element?>? = null,
  public var informationSequence: List<Int?>? = null,
  public var _informationSequence: List<Element?>? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var request: List<Reference?>? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var locationCodeableConcept: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var udi: List<Reference?>? = null,
  public var bodySite: List<ExplanationOfBenefit.Item.BodySite>? = null,
  public var encounter: List<Reference?>? = null,
  public var noteNumber: List<Int?>? = null,
  public var _noteNumber: List<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication>? = null,
  public var detail: List<ExplanationOfBenefit.Item.Detail>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Item =
    ExplanationOfBenefit.Item().apply {
      id = this@ExplanationOfBenefitItemSurrogate.id
      extension = this@ExplanationOfBenefitItemSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitItemSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ExplanationOfBenefitItemSurrogate.sequence,
          this@ExplanationOfBenefitItemSurrogate._sequence,
        )
      careTeamSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.careTeamSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._careTeamSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitItemSurrogate.careTeamSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._careTeamSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._careTeamSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.careTeamSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      diagnosisSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.diagnosisSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._diagnosisSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitItemSurrogate.diagnosisSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._diagnosisSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._diagnosisSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.diagnosisSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      procedureSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.procedureSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._procedureSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitItemSurrogate.procedureSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._procedureSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._procedureSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.procedureSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      informationSequence =
        if (
          this@ExplanationOfBenefitItemSurrogate.informationSequence == null &&
            this@ExplanationOfBenefitItemSurrogate._informationSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitItemSurrogate.informationSequence
              ?: List(this@ExplanationOfBenefitItemSurrogate._informationSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._informationSequence
                ?: List(this@ExplanationOfBenefitItemSurrogate.informationSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      traceNumber = this@ExplanationOfBenefitItemSurrogate.traceNumber
      revenue = this@ExplanationOfBenefitItemSurrogate.revenue
      category = this@ExplanationOfBenefitItemSurrogate.category
      productOrService = this@ExplanationOfBenefitItemSurrogate.productOrService
      productOrServiceEnd = this@ExplanationOfBenefitItemSurrogate.productOrServiceEnd
      request = this@ExplanationOfBenefitItemSurrogate.request
      modifier = this@ExplanationOfBenefitItemSurrogate.modifier
      programCode = this@ExplanationOfBenefitItemSurrogate.programCode
      serviced =
        ExplanationOfBenefit.Item.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@ExplanationOfBenefitItemSurrogate.servicedDate),
            this@ExplanationOfBenefitItemSurrogate._servicedDate,
          ),
          this@ExplanationOfBenefitItemSurrogate.servicedPeriod,
        )
      location =
        ExplanationOfBenefit.Item.Location?.from(
          this@ExplanationOfBenefitItemSurrogate.locationCodeableConcept,
          this@ExplanationOfBenefitItemSurrogate.locationAddress,
          this@ExplanationOfBenefitItemSurrogate.locationReference,
        )
      patientPaid = this@ExplanationOfBenefitItemSurrogate.patientPaid
      quantity = this@ExplanationOfBenefitItemSurrogate.quantity
      unitPrice = this@ExplanationOfBenefitItemSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ExplanationOfBenefitItemSurrogate.factor,
          this@ExplanationOfBenefitItemSurrogate._factor,
        )
      tax = this@ExplanationOfBenefitItemSurrogate.tax
      net = this@ExplanationOfBenefitItemSurrogate.net
      udi = this@ExplanationOfBenefitItemSurrogate.udi
      bodySite = this@ExplanationOfBenefitItemSurrogate.bodySite
      encounter = this@ExplanationOfBenefitItemSurrogate.encounter
      noteNumber =
        if (
          this@ExplanationOfBenefitItemSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitItemSurrogate._noteNumber == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitItemSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitItemSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitItemSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitItemSurrogate.noteNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      reviewOutcome = this@ExplanationOfBenefitItemSurrogate.reviewOutcome
      adjudication = this@ExplanationOfBenefitItemSurrogate.adjudication
      detail = this@ExplanationOfBenefitItemSurrogate.detail
    }

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Item): ExplanationOfBenefitItemSurrogate =
      with(model) {
        ExplanationOfBenefitItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          careTeamSequence =
            this@with.careTeamSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _careTeamSequence =
            this@with.careTeamSequence
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          diagnosisSequence =
            this@with.diagnosisSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _diagnosisSequence =
            this@with.diagnosisSequence
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          procedureSequence =
            this@with.procedureSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _procedureSequence =
            this@with.procedureSequence
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          informationSequence =
            this@with.informationSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _informationSequence =
            this@with.informationSequence
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          traceNumber = this@with.traceNumber
          revenue = this@with.revenue
          category = this@with.category
          productOrService = this@with.productOrService
          productOrServiceEnd = this@with.productOrServiceEnd
          request = this@with.request
          modifier = this@with.modifier
          programCode = this@with.programCode
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString()
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement()
          servicedPeriod = this@with.serviced?.asPeriod()?.value
          locationCodeableConcept = this@with.location?.asCodeableConcept()?.value
          locationAddress = this@with.location?.asAddress()?.value
          locationReference = this@with.location?.asReference()?.value
          patientPaid = this@with.patientPaid
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          tax = this@with.tax
          net = this@with.net
          udi = this@with.udi
          bodySite = this@with.bodySite
          encounter = this@with.encounter
          noteNumber = this@with.noteNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _noteNumber =
            this@with.noteNumber?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reviewOutcome = this@with.reviewOutcome
          adjudication = this@with.adjudication
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemBodySiteSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var site: List<CodeableReference?>? = null,
  public var subSite: List<CodeableConcept?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.BodySite =
    ExplanationOfBenefit.AddItem.BodySite().apply {
      id = this@ExplanationOfBenefitAddItemBodySiteSurrogate.id
      extension = this@ExplanationOfBenefitAddItemBodySiteSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitAddItemBodySiteSurrogate.modifierExtension
      site = this@ExplanationOfBenefitAddItemBodySiteSurrogate.site
      subSite = this@ExplanationOfBenefitAddItemBodySiteSurrogate.subSite
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.BodySite
    ): ExplanationOfBenefitAddItemBodySiteSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemBodySiteSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          site = this@with.site
          subSite = this@with.subSite
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var noteNumber: List<Int?>? = null,
  public var _noteNumber: List<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication?>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.Detail.SubDetail =
    ExplanationOfBenefit.AddItem.Detail.SubDetail().apply {
      id = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.id
      extension = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.modifierExtension
      traceNumber = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.traceNumber
      revenue = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.revenue
      productOrService = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.productOrService
      productOrServiceEnd =
        this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.productOrServiceEnd
      modifier = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.modifier
      patientPaid = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.patientPaid
      quantity = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.quantity
      unitPrice = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.factor,
          this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate._factor,
        )
      tax = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.tax
      net = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.net
      noteNumber =
        if (
          this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate._noteNumber == null
        ) {
          null
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
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      reviewOutcome = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.reviewOutcome
      adjudication = this@ExplanationOfBenefitAddItemDetailSubDetailSurrogate.adjudication
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.Detail.SubDetail
    ): ExplanationOfBenefitAddItemDetailSubDetailSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemDetailSubDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          traceNumber = this@with.traceNumber
          revenue = this@with.revenue
          productOrService = this@with.productOrService
          productOrServiceEnd = this@with.productOrServiceEnd
          modifier = this@with.modifier
          patientPaid = this@with.patientPaid
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          tax = this@with.tax
          net = this@with.net
          noteNumber = this@with.noteNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _noteNumber =
            this@with.noteNumber?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reviewOutcome = this@with.reviewOutcome
          adjudication = this@with.adjudication
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var noteNumber: List<Int?>? = null,
  public var _noteNumber: List<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication?>? = null,
  public var subDetail: List<ExplanationOfBenefit.AddItem.Detail.SubDetail>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem.Detail =
    ExplanationOfBenefit.AddItem.Detail().apply {
      id = this@ExplanationOfBenefitAddItemDetailSurrogate.id
      extension = this@ExplanationOfBenefitAddItemDetailSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitAddItemDetailSurrogate.modifierExtension
      traceNumber = this@ExplanationOfBenefitAddItemDetailSurrogate.traceNumber
      revenue = this@ExplanationOfBenefitAddItemDetailSurrogate.revenue
      productOrService = this@ExplanationOfBenefitAddItemDetailSurrogate.productOrService
      productOrServiceEnd = this@ExplanationOfBenefitAddItemDetailSurrogate.productOrServiceEnd
      modifier = this@ExplanationOfBenefitAddItemDetailSurrogate.modifier
      patientPaid = this@ExplanationOfBenefitAddItemDetailSurrogate.patientPaid
      quantity = this@ExplanationOfBenefitAddItemDetailSurrogate.quantity
      unitPrice = this@ExplanationOfBenefitAddItemDetailSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ExplanationOfBenefitAddItemDetailSurrogate.factor,
          this@ExplanationOfBenefitAddItemDetailSurrogate._factor,
        )
      tax = this@ExplanationOfBenefitAddItemDetailSurrogate.tax
      net = this@ExplanationOfBenefitAddItemDetailSurrogate.net
      noteNumber =
        if (
          this@ExplanationOfBenefitAddItemDetailSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitAddItemDetailSurrogate._noteNumber == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitAddItemDetailSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitAddItemDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemDetailSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitAddItemDetailSurrogate.noteNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      reviewOutcome = this@ExplanationOfBenefitAddItemDetailSurrogate.reviewOutcome
      adjudication = this@ExplanationOfBenefitAddItemDetailSurrogate.adjudication
      subDetail = this@ExplanationOfBenefitAddItemDetailSurrogate.subDetail
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem.Detail
    ): ExplanationOfBenefitAddItemDetailSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          traceNumber = this@with.traceNumber
          revenue = this@with.revenue
          productOrService = this@with.productOrService
          productOrServiceEnd = this@with.productOrServiceEnd
          modifier = this@with.modifier
          patientPaid = this@with.patientPaid
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          tax = this@with.tax
          net = this@with.net
          noteNumber = this@with.noteNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _noteNumber =
            this@with.noteNumber?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reviewOutcome = this@with.reviewOutcome
          adjudication = this@with.adjudication
          subDetail = this@with.subDetail
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitAddItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemSequence: List<Int?>? = null,
  public var _itemSequence: List<Element?>? = null,
  public var detailSequence: List<Int?>? = null,
  public var _detailSequence: List<Element?>? = null,
  public var subDetailSequence: List<Int?>? = null,
  public var _subDetailSequence: List<Element?>? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var provider: List<Reference?>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var request: List<Reference?>? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var locationCodeableConcept: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
  public var patientPaid: Money? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var bodySite: List<ExplanationOfBenefit.AddItem.BodySite>? = null,
  public var noteNumber: List<Int?>? = null,
  public var _noteNumber: List<Element?>? = null,
  public var reviewOutcome: ExplanationOfBenefit.Item.ReviewOutcome? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication?>? = null,
  public var detail: List<ExplanationOfBenefit.AddItem.Detail>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.AddItem =
    ExplanationOfBenefit.AddItem().apply {
      id = this@ExplanationOfBenefitAddItemSurrogate.id
      extension = this@ExplanationOfBenefitAddItemSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitAddItemSurrogate.modifierExtension
      itemSequence =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.itemSequence == null &&
            this@ExplanationOfBenefitAddItemSurrogate._itemSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.itemSequence
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._itemSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._itemSequence
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.itemSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      detailSequence =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.detailSequence == null &&
            this@ExplanationOfBenefitAddItemSurrogate._detailSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.detailSequence
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._detailSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._detailSequence
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.detailSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      subDetailSequence =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.subDetailSequence == null &&
            this@ExplanationOfBenefitAddItemSurrogate._subDetailSequence == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.subDetailSequence
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._subDetailSequence!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._subDetailSequence
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.subDetailSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      traceNumber = this@ExplanationOfBenefitAddItemSurrogate.traceNumber
      provider = this@ExplanationOfBenefitAddItemSurrogate.provider
      revenue = this@ExplanationOfBenefitAddItemSurrogate.revenue
      productOrService = this@ExplanationOfBenefitAddItemSurrogate.productOrService
      productOrServiceEnd = this@ExplanationOfBenefitAddItemSurrogate.productOrServiceEnd
      request = this@ExplanationOfBenefitAddItemSurrogate.request
      modifier = this@ExplanationOfBenefitAddItemSurrogate.modifier
      programCode = this@ExplanationOfBenefitAddItemSurrogate.programCode
      serviced =
        ExplanationOfBenefit.AddItem.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@ExplanationOfBenefitAddItemSurrogate.servicedDate),
            this@ExplanationOfBenefitAddItemSurrogate._servicedDate,
          ),
          this@ExplanationOfBenefitAddItemSurrogate.servicedPeriod,
        )
      location =
        ExplanationOfBenefit.AddItem.Location?.from(
          this@ExplanationOfBenefitAddItemSurrogate.locationCodeableConcept,
          this@ExplanationOfBenefitAddItemSurrogate.locationAddress,
          this@ExplanationOfBenefitAddItemSurrogate.locationReference,
        )
      patientPaid = this@ExplanationOfBenefitAddItemSurrogate.patientPaid
      quantity = this@ExplanationOfBenefitAddItemSurrogate.quantity
      unitPrice = this@ExplanationOfBenefitAddItemSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ExplanationOfBenefitAddItemSurrogate.factor,
          this@ExplanationOfBenefitAddItemSurrogate._factor,
        )
      tax = this@ExplanationOfBenefitAddItemSurrogate.tax
      net = this@ExplanationOfBenefitAddItemSurrogate.net
      bodySite = this@ExplanationOfBenefitAddItemSurrogate.bodySite
      noteNumber =
        if (
          this@ExplanationOfBenefitAddItemSurrogate.noteNumber == null &&
            this@ExplanationOfBenefitAddItemSurrogate._noteNumber == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitAddItemSurrogate.noteNumber
              ?: List(this@ExplanationOfBenefitAddItemSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ExplanationOfBenefitAddItemSurrogate._noteNumber
                ?: List(this@ExplanationOfBenefitAddItemSurrogate.noteNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      reviewOutcome = this@ExplanationOfBenefitAddItemSurrogate.reviewOutcome
      adjudication = this@ExplanationOfBenefitAddItemSurrogate.adjudication
      detail = this@ExplanationOfBenefitAddItemSurrogate.detail
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.AddItem
    ): ExplanationOfBenefitAddItemSurrogate =
      with(model) {
        ExplanationOfBenefitAddItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemSequence =
            this@with.itemSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _itemSequence =
            this@with.itemSequence?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          detailSequence =
            this@with.detailSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _detailSequence =
            this@with.detailSequence?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          subDetailSequence =
            this@with.subDetailSequence?.map { it?.value }?.takeUnless { it.all { it == null } }
          _subDetailSequence =
            this@with.subDetailSequence
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          traceNumber = this@with.traceNumber
          provider = this@with.provider
          revenue = this@with.revenue
          productOrService = this@with.productOrService
          productOrServiceEnd = this@with.productOrServiceEnd
          request = this@with.request
          modifier = this@with.modifier
          programCode = this@with.programCode
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString()
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement()
          servicedPeriod = this@with.serviced?.asPeriod()?.value
          locationCodeableConcept = this@with.location?.asCodeableConcept()?.value
          locationAddress = this@with.location?.asAddress()?.value
          locationReference = this@with.location?.asReference()?.value
          patientPaid = this@with.patientPaid
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          tax = this@with.tax
          net = this@with.net
          bodySite = this@with.bodySite
          noteNumber = this@with.noteNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _noteNumber =
            this@with.noteNumber?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reviewOutcome = this@with.reviewOutcome
          adjudication = this@with.adjudication
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitTotalSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var amount: Money? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Total =
    ExplanationOfBenefit.Total().apply {
      id = this@ExplanationOfBenefitTotalSurrogate.id
      extension = this@ExplanationOfBenefitTotalSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitTotalSurrogate.modifierExtension
      category = this@ExplanationOfBenefitTotalSurrogate.category
      amount = this@ExplanationOfBenefitTotalSurrogate.amount
    }

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit.Total): ExplanationOfBenefitTotalSurrogate =
      with(model) {
        ExplanationOfBenefitTotalSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitPaymentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var adjustment: Money? = null,
  public var adjustmentReason: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var amount: Money? = null,
  public var identifier: Identifier? = null,
) {
  public fun toModel(): ExplanationOfBenefit.Payment =
    ExplanationOfBenefit.Payment().apply {
      id = this@ExplanationOfBenefitPaymentSurrogate.id
      extension = this@ExplanationOfBenefitPaymentSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitPaymentSurrogate.modifierExtension
      type = this@ExplanationOfBenefitPaymentSurrogate.type
      adjustment = this@ExplanationOfBenefitPaymentSurrogate.adjustment
      adjustmentReason = this@ExplanationOfBenefitPaymentSurrogate.adjustmentReason
      date =
        Date.of(
          FhirDate.fromString(this@ExplanationOfBenefitPaymentSurrogate.date),
          this@ExplanationOfBenefitPaymentSurrogate._date,
        )
      amount = this@ExplanationOfBenefitPaymentSurrogate.amount
      identifier = this@ExplanationOfBenefitPaymentSurrogate.identifier
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.Payment
    ): ExplanationOfBenefitPaymentSurrogate =
      with(model) {
        ExplanationOfBenefitPaymentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          adjustment = this@with.adjustment
          adjustmentReason = this@with.adjustmentReason
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          amount = this@with.amount
          identifier = this@with.identifier
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitProcessNoteSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var type: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var language: CodeableConcept? = null,
) {
  public fun toModel(): ExplanationOfBenefit.ProcessNote =
    ExplanationOfBenefit.ProcessNote().apply {
      id = this@ExplanationOfBenefitProcessNoteSurrogate.id
      extension = this@ExplanationOfBenefitProcessNoteSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitProcessNoteSurrogate.modifierExtension
      number =
        PositiveInt.of(
          this@ExplanationOfBenefitProcessNoteSurrogate.number,
          this@ExplanationOfBenefitProcessNoteSurrogate._number,
        )
      type = this@ExplanationOfBenefitProcessNoteSurrogate.type
      text =
        R5String.of(
          this@ExplanationOfBenefitProcessNoteSurrogate.text,
          this@ExplanationOfBenefitProcessNoteSurrogate._text,
        )
      language = this@ExplanationOfBenefitProcessNoteSurrogate.language
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.ProcessNote
    ): ExplanationOfBenefitProcessNoteSurrogate =
      with(model) {
        ExplanationOfBenefitProcessNoteSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          number = this@with.number?.value
          _number = this@with.number?.toElement()
          type = this@with.type
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          language = this@with.language
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitBenefitBalanceFinancialSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var allowedUnsignedInt: Int? = null,
  public var _allowedUnsignedInt: Element? = null,
  public var allowedString: KotlinString? = null,
  public var _allowedString: Element? = null,
  public var allowedMoney: Money? = null,
  public var usedUnsignedInt: Int? = null,
  public var _usedUnsignedInt: Element? = null,
  public var usedMoney: Money? = null,
) {
  public fun toModel(): ExplanationOfBenefit.BenefitBalance.Financial =
    ExplanationOfBenefit.BenefitBalance.Financial().apply {
      id = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.id
      extension = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.extension
      modifierExtension =
        this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.modifierExtension
      type = this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.type
      allowed =
        ExplanationOfBenefit.BenefitBalance.Financial.Allowed?.from(
          UnsignedInt.of(
            this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.allowedUnsignedInt,
            this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate._allowedUnsignedInt,
          ),
          R5String.of(
            this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.allowedString,
            this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate._allowedString,
          ),
          this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.allowedMoney,
        )
      used =
        ExplanationOfBenefit.BenefitBalance.Financial.Used?.from(
          UnsignedInt.of(
            this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.usedUnsignedInt,
            this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate._usedUnsignedInt,
          ),
          this@ExplanationOfBenefitBenefitBalanceFinancialSurrogate.usedMoney,
        )
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.BenefitBalance.Financial
    ): ExplanationOfBenefitBenefitBalanceFinancialSurrogate =
      with(model) {
        ExplanationOfBenefitBenefitBalanceFinancialSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          allowedUnsignedInt = this@with.allowed?.asUnsignedInt()?.value?.value
          _allowedUnsignedInt = this@with.allowed?.asUnsignedInt()?.value?.toElement()
          allowedString = this@with.allowed?.asString()?.value?.value
          _allowedString = this@with.allowed?.asString()?.value?.toElement()
          allowedMoney = this@with.allowed?.asMoney()?.value
          usedUnsignedInt = this@with.used?.asUnsignedInt()?.value?.value
          _usedUnsignedInt = this@with.used?.asUnsignedInt()?.value?.toElement()
          usedMoney = this@with.used?.asMoney()?.value
        }
      }
  }
}

@Serializable
internal data class ExplanationOfBenefitBenefitBalanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var excluded: KotlinBoolean? = null,
  public var _excluded: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var network: CodeableConcept? = null,
  public var unit: CodeableConcept? = null,
  public var term: CodeableConcept? = null,
  public var financial: List<ExplanationOfBenefit.BenefitBalance.Financial>? = null,
) {
  public fun toModel(): ExplanationOfBenefit.BenefitBalance =
    ExplanationOfBenefit.BenefitBalance().apply {
      id = this@ExplanationOfBenefitBenefitBalanceSurrogate.id
      extension = this@ExplanationOfBenefitBenefitBalanceSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitBenefitBalanceSurrogate.modifierExtension
      category = this@ExplanationOfBenefitBenefitBalanceSurrogate.category
      excluded =
        R5Boolean.of(
          this@ExplanationOfBenefitBenefitBalanceSurrogate.excluded,
          this@ExplanationOfBenefitBenefitBalanceSurrogate._excluded,
        )
      name =
        R5String.of(
          this@ExplanationOfBenefitBenefitBalanceSurrogate.name,
          this@ExplanationOfBenefitBenefitBalanceSurrogate._name,
        )
      description =
        R5String.of(
          this@ExplanationOfBenefitBenefitBalanceSurrogate.description,
          this@ExplanationOfBenefitBenefitBalanceSurrogate._description,
        )
      network = this@ExplanationOfBenefitBenefitBalanceSurrogate.network
      unit = this@ExplanationOfBenefitBenefitBalanceSurrogate.unit
      term = this@ExplanationOfBenefitBenefitBalanceSurrogate.term
      financial = this@ExplanationOfBenefitBenefitBalanceSurrogate.financial
    }

  public companion object {
    public fun fromModel(
      model: ExplanationOfBenefit.BenefitBalance
    ): ExplanationOfBenefitBenefitBalanceSurrogate =
      with(model) {
        ExplanationOfBenefitBenefitBalanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          excluded = this@with.excluded?.value
          _excluded = this@with.excluded?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          network = this@with.network
          unit = this@with.unit
          term = this@with.term
          financial = this@with.financial
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var traceNumber: List<Identifier?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept? = null,
  public var subType: CodeableConcept? = null,
  public var use: KotlinString? = null,
  public var _use: Element? = null,
  public var patient: Reference? = null,
  public var billablePeriod: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var enterer: Reference? = null,
  public var insurer: Reference? = null,
  public var provider: Reference? = null,
  public var priority: CodeableConcept? = null,
  public var fundsReserveRequested: CodeableConcept? = null,
  public var fundsReserve: CodeableConcept? = null,
  public var related: List<ExplanationOfBenefit.Related>? = null,
  public var prescription: Reference? = null,
  public var originalPrescription: Reference? = null,
  public var event: List<ExplanationOfBenefit.Event>? = null,
  public var payee: ExplanationOfBenefit.Payee? = null,
  public var referral: Reference? = null,
  public var encounter: List<Reference?>? = null,
  public var facility: Reference? = null,
  public var claim: Reference? = null,
  public var claimResponse: Reference? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var decision: CodeableConcept? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var preAuthRef: List<KotlinString?>? = null,
  public var _preAuthRef: List<Element?>? = null,
  public var preAuthRefPeriod: List<Period?>? = null,
  public var diagnosisRelatedGroup: CodeableConcept? = null,
  public var careTeam: List<ExplanationOfBenefit.CareTeam>? = null,
  public var supportingInfo: List<ExplanationOfBenefit.SupportingInfo>? = null,
  public var diagnosis: List<ExplanationOfBenefit.Diagnosis>? = null,
  public var procedure: List<ExplanationOfBenefit.Procedure>? = null,
  public var precedence: Int? = null,
  public var _precedence: Element? = null,
  public var insurance: List<ExplanationOfBenefit.Insurance>? = null,
  public var accident: ExplanationOfBenefit.Accident? = null,
  public var patientPaid: Money? = null,
  public var item: List<ExplanationOfBenefit.Item>? = null,
  public var addItem: List<ExplanationOfBenefit.AddItem>? = null,
  public var adjudication: List<ExplanationOfBenefit.Item.Adjudication?>? = null,
  public var total: List<ExplanationOfBenefit.Total>? = null,
  public var payment: ExplanationOfBenefit.Payment? = null,
  public var formCode: CodeableConcept? = null,
  public var form: Attachment? = null,
  public var processNote: List<ExplanationOfBenefit.ProcessNote>? = null,
  public var benefitPeriod: Period? = null,
  public var benefitBalance: List<ExplanationOfBenefit.BenefitBalance>? = null,
) {
  public fun toModel(): ExplanationOfBenefit =
    ExplanationOfBenefit().apply {
      id = this@ExplanationOfBenefitSurrogate.id
      meta = this@ExplanationOfBenefitSurrogate.meta
      implicitRules =
        Uri.of(
          this@ExplanationOfBenefitSurrogate.implicitRules,
          this@ExplanationOfBenefitSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ExplanationOfBenefitSurrogate.language,
          this@ExplanationOfBenefitSurrogate._language,
        )
      text = this@ExplanationOfBenefitSurrogate.text
      contained = this@ExplanationOfBenefitSurrogate.contained
      extension = this@ExplanationOfBenefitSurrogate.extension
      modifierExtension = this@ExplanationOfBenefitSurrogate.modifierExtension
      identifier = this@ExplanationOfBenefitSurrogate.identifier
      traceNumber = this@ExplanationOfBenefitSurrogate.traceNumber
      status =
        Enumeration.of(
          this@ExplanationOfBenefitSurrogate.status?.let {
            com.google.fhir.model.r5.ExplanationOfBenefit.ExplanationOfBenefitStatus.fromCode(it)
          },
          this@ExplanationOfBenefitSurrogate._status,
        )
      type = this@ExplanationOfBenefitSurrogate.type
      subType = this@ExplanationOfBenefitSurrogate.subType
      use =
        Enumeration.of(
          this@ExplanationOfBenefitSurrogate.use?.let {
            com.google.fhir.model.r5.ExplanationOfBenefit.Use.fromCode(it)
          },
          this@ExplanationOfBenefitSurrogate._use,
        )
      patient = this@ExplanationOfBenefitSurrogate.patient
      billablePeriod = this@ExplanationOfBenefitSurrogate.billablePeriod
      created =
        DateTime.of(
          FhirDateTime.fromString(this@ExplanationOfBenefitSurrogate.created),
          this@ExplanationOfBenefitSurrogate._created,
        )
      enterer = this@ExplanationOfBenefitSurrogate.enterer
      insurer = this@ExplanationOfBenefitSurrogate.insurer
      provider = this@ExplanationOfBenefitSurrogate.provider
      priority = this@ExplanationOfBenefitSurrogate.priority
      fundsReserveRequested = this@ExplanationOfBenefitSurrogate.fundsReserveRequested
      fundsReserve = this@ExplanationOfBenefitSurrogate.fundsReserve
      related = this@ExplanationOfBenefitSurrogate.related
      prescription = this@ExplanationOfBenefitSurrogate.prescription
      originalPrescription = this@ExplanationOfBenefitSurrogate.originalPrescription
      event = this@ExplanationOfBenefitSurrogate.event
      payee = this@ExplanationOfBenefitSurrogate.payee
      referral = this@ExplanationOfBenefitSurrogate.referral
      encounter = this@ExplanationOfBenefitSurrogate.encounter
      facility = this@ExplanationOfBenefitSurrogate.facility
      claim = this@ExplanationOfBenefitSurrogate.claim
      claimResponse = this@ExplanationOfBenefitSurrogate.claimResponse
      outcome =
        Enumeration.of(
          this@ExplanationOfBenefitSurrogate.outcome?.let {
            com.google.fhir.model.r5.ExplanationOfBenefit.ClaimOutcome.fromCode(it)
          },
          this@ExplanationOfBenefitSurrogate._outcome,
        )
      decision = this@ExplanationOfBenefitSurrogate.decision
      disposition =
        R5String.of(
          this@ExplanationOfBenefitSurrogate.disposition,
          this@ExplanationOfBenefitSurrogate._disposition,
        )
      preAuthRef =
        if (
          this@ExplanationOfBenefitSurrogate.preAuthRef == null &&
            this@ExplanationOfBenefitSurrogate._preAuthRef == null
        ) {
          null
        } else {
          (this@ExplanationOfBenefitSurrogate.preAuthRef
              ?: List(this@ExplanationOfBenefitSurrogate._preAuthRef!!.size) { null })
            .zip(
              this@ExplanationOfBenefitSurrogate._preAuthRef
                ?: List(this@ExplanationOfBenefitSurrogate.preAuthRef!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      preAuthRefPeriod = this@ExplanationOfBenefitSurrogate.preAuthRefPeriod
      diagnosisRelatedGroup = this@ExplanationOfBenefitSurrogate.diagnosisRelatedGroup
      careTeam = this@ExplanationOfBenefitSurrogate.careTeam
      supportingInfo = this@ExplanationOfBenefitSurrogate.supportingInfo
      diagnosis = this@ExplanationOfBenefitSurrogate.diagnosis
      procedure = this@ExplanationOfBenefitSurrogate.procedure
      precedence =
        PositiveInt.of(
          this@ExplanationOfBenefitSurrogate.precedence,
          this@ExplanationOfBenefitSurrogate._precedence,
        )
      insurance = this@ExplanationOfBenefitSurrogate.insurance
      accident = this@ExplanationOfBenefitSurrogate.accident
      patientPaid = this@ExplanationOfBenefitSurrogate.patientPaid
      item = this@ExplanationOfBenefitSurrogate.item
      addItem = this@ExplanationOfBenefitSurrogate.addItem
      adjudication = this@ExplanationOfBenefitSurrogate.adjudication
      total = this@ExplanationOfBenefitSurrogate.total
      payment = this@ExplanationOfBenefitSurrogate.payment
      formCode = this@ExplanationOfBenefitSurrogate.formCode
      form = this@ExplanationOfBenefitSurrogate.form
      processNote = this@ExplanationOfBenefitSurrogate.processNote
      benefitPeriod = this@ExplanationOfBenefitSurrogate.benefitPeriod
      benefitBalance = this@ExplanationOfBenefitSurrogate.benefitBalance
    }

  public companion object {
    public fun fromModel(model: ExplanationOfBenefit): ExplanationOfBenefitSurrogate =
      with(model) {
        ExplanationOfBenefitSurrogate().apply {
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
          traceNumber = this@with.traceNumber
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          type = this@with.type
          subType = this@with.subType
          use = this@with.use?.value?.getCode()
          _use = this@with.use?.toElement()
          patient = this@with.patient
          billablePeriod = this@with.billablePeriod
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          enterer = this@with.enterer
          insurer = this@with.insurer
          provider = this@with.provider
          priority = this@with.priority
          fundsReserveRequested = this@with.fundsReserveRequested
          fundsReserve = this@with.fundsReserve
          related = this@with.related
          prescription = this@with.prescription
          originalPrescription = this@with.originalPrescription
          event = this@with.event
          payee = this@with.payee
          referral = this@with.referral
          encounter = this@with.encounter
          facility = this@with.facility
          claim = this@with.claim
          claimResponse = this@with.claimResponse
          outcome = this@with.outcome?.value?.getCode()
          _outcome = this@with.outcome?.toElement()
          decision = this@with.decision
          disposition = this@with.disposition?.value
          _disposition = this@with.disposition?.toElement()
          preAuthRef = this@with.preAuthRef?.map { it?.value }?.takeUnless { it.all { it == null } }
          _preAuthRef =
            this@with.preAuthRef?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          preAuthRefPeriod = this@with.preAuthRefPeriod
          diagnosisRelatedGroup = this@with.diagnosisRelatedGroup
          careTeam = this@with.careTeam
          supportingInfo = this@with.supportingInfo
          diagnosis = this@with.diagnosis
          procedure = this@with.procedure
          precedence = this@with.precedence?.value
          _precedence = this@with.precedence?.toElement()
          insurance = this@with.insurance
          accident = this@with.accident
          patientPaid = this@with.patientPaid
          item = this@with.item
          addItem = this@with.addItem
          adjudication = this@with.adjudication
          total = this@with.total
          payment = this@with.payment
          formCode = this@with.formCode
          form = this@with.form
          processNote = this@with.processNote
          benefitPeriod = this@with.benefitPeriod
          benefitBalance = this@with.benefitBalance
        }
      }
  }
}
