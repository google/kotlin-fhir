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

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Address
import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Claim
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ClaimRelatedSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var claim: Reference? = null,
  public var relationship: CodeableConcept? = null,
  public var reference: Identifier? = null,
) {
  public fun toModel(): Claim.Related =
    Claim.Related().apply {
      id = this@ClaimRelatedSurrogate.id
      extension = this@ClaimRelatedSurrogate.extension
      modifierExtension = this@ClaimRelatedSurrogate.modifierExtension
      claim = this@ClaimRelatedSurrogate.claim
      relationship = this@ClaimRelatedSurrogate.relationship
      reference = this@ClaimRelatedSurrogate.reference
    }

  public companion object {
    public fun fromModel(model: Claim.Related): ClaimRelatedSurrogate =
      with(model) {
        ClaimRelatedSurrogate().apply {
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
internal data class ClaimPayeeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): Claim.Payee =
    Claim.Payee().apply {
      id = this@ClaimPayeeSurrogate.id
      extension = this@ClaimPayeeSurrogate.extension
      modifierExtension = this@ClaimPayeeSurrogate.modifierExtension
      type = this@ClaimPayeeSurrogate.type
      party = this@ClaimPayeeSurrogate.party
    }

  public companion object {
    public fun fromModel(model: Claim.Payee): ClaimPayeeSurrogate =
      with(model) {
        ClaimPayeeSurrogate().apply {
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
internal data class ClaimCareTeamSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var provider: Reference? = null,
  public var responsible: KotlinBoolean? = null,
  public var _responsible: Element? = null,
  public var role: CodeableConcept? = null,
  public var qualification: CodeableConcept? = null,
) {
  public fun toModel(): Claim.CareTeam =
    Claim.CareTeam().apply {
      id = this@ClaimCareTeamSurrogate.id
      extension = this@ClaimCareTeamSurrogate.extension
      modifierExtension = this@ClaimCareTeamSurrogate.modifierExtension
      sequence =
        PositiveInt.of(this@ClaimCareTeamSurrogate.sequence, this@ClaimCareTeamSurrogate._sequence)
      provider = this@ClaimCareTeamSurrogate.provider
      responsible =
        R4bBoolean.of(
          this@ClaimCareTeamSurrogate.responsible,
          this@ClaimCareTeamSurrogate._responsible,
        )
      role = this@ClaimCareTeamSurrogate.role
      qualification = this@ClaimCareTeamSurrogate.qualification
    }

  public companion object {
    public fun fromModel(model: Claim.CareTeam): ClaimCareTeamSurrogate =
      with(model) {
        ClaimCareTeamSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          provider = this@with.provider
          responsible = this@with.responsible?.value
          _responsible = this@with.responsible?.toElement()
          role = this@with.role
          qualification = this@with.qualification
        }
      }
  }
}

@Serializable
internal class ClaimSupportingInfoTimingSurrogate {
  public var timingDate: KotlinString? = null

  public var _timingDate: Element? = null

  public var timingPeriod: Period? = null

  public fun toModel(): Claim.SupportingInfo.Timing =
    Claim.SupportingInfo.Timing?.from(
      Date.of(
        FhirDate.fromString(this@ClaimSupportingInfoTimingSurrogate.timingDate),
        this@ClaimSupportingInfoTimingSurrogate._timingDate,
      ),
      this@ClaimSupportingInfoTimingSurrogate.timingPeriod,
    ) ?: Claim.SupportingInfo.Timing.Null

  public companion object {
    public fun fromModel(model: Claim.SupportingInfo.Timing): ClaimSupportingInfoTimingSurrogate =
      with(model) {
        ClaimSupportingInfoTimingSurrogate().apply {
          timingDate = this@with.asDate()?.value?.value?.toString()
          _timingDate = this@with.asDate()?.value?.toElement()
          timingPeriod = this@with.asPeriod()?.value
        }
      }
  }
}

@Serializable
internal class ClaimSupportingInfoValueSurrogate {
  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueString: KotlinString? = null

  public var _valueString: Element? = null

  public var valueQuantity: Quantity? = null

  public var valueAttachment: Attachment? = null

  public var valueReference: Reference? = null

  public fun toModel(): Claim.SupportingInfo.Value =
    Claim.SupportingInfo.Value?.from(
      R4bBoolean.of(
        this@ClaimSupportingInfoValueSurrogate.valueBoolean,
        this@ClaimSupportingInfoValueSurrogate._valueBoolean,
      ),
      R4bString.of(
        this@ClaimSupportingInfoValueSurrogate.valueString,
        this@ClaimSupportingInfoValueSurrogate._valueString,
      ),
      this@ClaimSupportingInfoValueSurrogate.valueQuantity,
      this@ClaimSupportingInfoValueSurrogate.valueAttachment,
      this@ClaimSupportingInfoValueSurrogate.valueReference,
    ) ?: Claim.SupportingInfo.Value.Null

  public companion object {
    public fun fromModel(model: Claim.SupportingInfo.Value): ClaimSupportingInfoValueSurrogate =
      with(model) {
        ClaimSupportingInfoValueSurrogate().apply {
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueString = this@with.asString()?.value?.value
          _valueString = this@with.asString()?.value?.toElement()
          valueQuantity = this@with.asQuantity()?.value
          valueAttachment = this@with.asAttachment()?.value
          valueReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ClaimSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var category: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var reason: CodeableConcept? = null,
  public var timing: Claim.SupportingInfo.Timing? = null,
  public var `value`: Claim.SupportingInfo.Value? = null,
) {
  public fun toModel(): Claim.SupportingInfo =
    Claim.SupportingInfo().apply {
      id = this@ClaimSupportingInfoSurrogate.id
      extension = this@ClaimSupportingInfoSurrogate.extension
      modifierExtension = this@ClaimSupportingInfoSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ClaimSupportingInfoSurrogate.sequence,
          this@ClaimSupportingInfoSurrogate._sequence,
        )
      category = this@ClaimSupportingInfoSurrogate.category
      code = this@ClaimSupportingInfoSurrogate.code
      timing = this@ClaimSupportingInfoSurrogate.timing
      `value` = this@ClaimSupportingInfoSurrogate.`value`
      reason = this@ClaimSupportingInfoSurrogate.reason
    }

  public companion object {
    public fun fromModel(model: Claim.SupportingInfo): ClaimSupportingInfoSurrogate =
      with(model) {
        ClaimSupportingInfoSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          category = this@with.category
          code = this@with.code
          timing = this@with.timing
          `value` = this@with.`value`
          reason = this@with.reason
        }
      }
  }
}

@Serializable
internal class ClaimDiagnosisDiagnosisSurrogate {
  public var diagnosisCodeableConcept: CodeableConcept? = null

  public var diagnosisReference: Reference? = null

  public fun toModel(): Claim.Diagnosis.Diagnosis =
    Claim.Diagnosis.Diagnosis?.from(
      this@ClaimDiagnosisDiagnosisSurrogate.diagnosisCodeableConcept,
      this@ClaimDiagnosisDiagnosisSurrogate.diagnosisReference,
    ) ?: Claim.Diagnosis.Diagnosis.Null

  public companion object {
    public fun fromModel(model: Claim.Diagnosis.Diagnosis): ClaimDiagnosisDiagnosisSurrogate =
      with(model) {
        ClaimDiagnosisDiagnosisSurrogate().apply {
          diagnosisCodeableConcept = this@with.asCodeableConcept()?.value
          diagnosisReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ClaimDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var onAdmission: CodeableConcept? = null,
  public var packageCode: CodeableConcept? = null,
  public var diagnosis: Claim.Diagnosis.Diagnosis? = null,
) {
  public fun toModel(): Claim.Diagnosis =
    Claim.Diagnosis().apply {
      id = this@ClaimDiagnosisSurrogate.id
      extension = this@ClaimDiagnosisSurrogate.extension
      modifierExtension = this@ClaimDiagnosisSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ClaimDiagnosisSurrogate.sequence,
          this@ClaimDiagnosisSurrogate._sequence,
        )
      diagnosis = this@ClaimDiagnosisSurrogate.diagnosis
      type = this@ClaimDiagnosisSurrogate.type
      onAdmission = this@ClaimDiagnosisSurrogate.onAdmission
      packageCode = this@ClaimDiagnosisSurrogate.packageCode
    }

  public companion object {
    public fun fromModel(model: Claim.Diagnosis): ClaimDiagnosisSurrogate =
      with(model) {
        ClaimDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          diagnosis = this@with.diagnosis
          type = this@with.type
          onAdmission = this@with.onAdmission
          packageCode = this@with.packageCode
        }
      }
  }
}

@Serializable
internal class ClaimProcedureProcedureSurrogate {
  public var procedureCodeableConcept: CodeableConcept? = null

  public var procedureReference: Reference? = null

  public fun toModel(): Claim.Procedure.Procedure =
    Claim.Procedure.Procedure?.from(
      this@ClaimProcedureProcedureSurrogate.procedureCodeableConcept,
      this@ClaimProcedureProcedureSurrogate.procedureReference,
    ) ?: Claim.Procedure.Procedure.Null

  public companion object {
    public fun fromModel(model: Claim.Procedure.Procedure): ClaimProcedureProcedureSurrogate =
      with(model) {
        ClaimProcedureProcedureSurrogate().apply {
          procedureCodeableConcept = this@with.asCodeableConcept()?.value
          procedureReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ClaimProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var udi: List<Reference?>? = null,
  public var procedure: Claim.Procedure.Procedure? = null,
) {
  public fun toModel(): Claim.Procedure =
    Claim.Procedure().apply {
      id = this@ClaimProcedureSurrogate.id
      extension = this@ClaimProcedureSurrogate.extension
      modifierExtension = this@ClaimProcedureSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ClaimProcedureSurrogate.sequence,
          this@ClaimProcedureSurrogate._sequence,
        )
      type = this@ClaimProcedureSurrogate.type
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ClaimProcedureSurrogate.date),
          this@ClaimProcedureSurrogate._date,
        )
      procedure = this@ClaimProcedureSurrogate.procedure
      udi = this@ClaimProcedureSurrogate.udi
    }

  public companion object {
    public fun fromModel(model: Claim.Procedure): ClaimProcedureSurrogate =
      with(model) {
        ClaimProcedureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          type = this@with.type
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          procedure = this@with.procedure
          udi = this@with.udi
        }
      }
  }
}

@Serializable
internal data class ClaimInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var identifier: Identifier? = null,
  public var coverage: Reference? = null,
  public var businessArrangement: KotlinString? = null,
  public var _businessArrangement: Element? = null,
  public var preAuthRef: List<KotlinString?>? = null,
  public var _preAuthRef: List<Element?>? = null,
  public var claimResponse: Reference? = null,
) {
  public fun toModel(): Claim.Insurance =
    Claim.Insurance().apply {
      id = this@ClaimInsuranceSurrogate.id
      extension = this@ClaimInsuranceSurrogate.extension
      modifierExtension = this@ClaimInsuranceSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ClaimInsuranceSurrogate.sequence,
          this@ClaimInsuranceSurrogate._sequence,
        )
      focal = R4bBoolean.of(this@ClaimInsuranceSurrogate.focal, this@ClaimInsuranceSurrogate._focal)
      identifier = this@ClaimInsuranceSurrogate.identifier
      coverage = this@ClaimInsuranceSurrogate.coverage
      businessArrangement =
        R4bString.of(
          this@ClaimInsuranceSurrogate.businessArrangement,
          this@ClaimInsuranceSurrogate._businessArrangement,
        )
      preAuthRef =
        if (
          this@ClaimInsuranceSurrogate.preAuthRef == null &&
            this@ClaimInsuranceSurrogate._preAuthRef == null
        ) {
          null
        } else {
          (this@ClaimInsuranceSurrogate.preAuthRef
              ?: List(this@ClaimInsuranceSurrogate._preAuthRef!!.size) { null })
            .zip(
              this@ClaimInsuranceSurrogate._preAuthRef
                ?: List(this@ClaimInsuranceSurrogate.preAuthRef!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      claimResponse = this@ClaimInsuranceSurrogate.claimResponse
    }

  public companion object {
    public fun fromModel(model: Claim.Insurance): ClaimInsuranceSurrogate =
      with(model) {
        ClaimInsuranceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          focal = this@with.focal?.value
          _focal = this@with.focal?.toElement()
          identifier = this@with.identifier
          coverage = this@with.coverage
          businessArrangement = this@with.businessArrangement?.value
          _businessArrangement = this@with.businessArrangement?.toElement()
          preAuthRef = this@with.preAuthRef?.map { it?.value }?.takeUnless { it.all { it == null } }
          _preAuthRef =
            this@with.preAuthRef?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          claimResponse = this@with.claimResponse
        }
      }
  }
}

@Serializable
internal class ClaimAccidentLocationSurrogate {
  public var locationAddress: Address? = null

  public var locationReference: Reference? = null

  public fun toModel(): Claim.Accident.Location =
    Claim.Accident.Location?.from(
      this@ClaimAccidentLocationSurrogate.locationAddress,
      this@ClaimAccidentLocationSurrogate.locationReference,
    ) ?: Claim.Accident.Location.Null

  public companion object {
    public fun fromModel(model: Claim.Accident.Location): ClaimAccidentLocationSurrogate =
      with(model) {
        ClaimAccidentLocationSurrogate().apply {
          locationAddress = this@with.asAddress()?.value
          locationReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ClaimAccidentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var type: CodeableConcept? = null,
  public var location: Claim.Accident.Location? = null,
) {
  public fun toModel(): Claim.Accident =
    Claim.Accident().apply {
      id = this@ClaimAccidentSurrogate.id
      extension = this@ClaimAccidentSurrogate.extension
      modifierExtension = this@ClaimAccidentSurrogate.modifierExtension
      date =
        Date.of(
          FhirDate.fromString(this@ClaimAccidentSurrogate.date),
          this@ClaimAccidentSurrogate._date,
        )
      type = this@ClaimAccidentSurrogate.type
      location = this@ClaimAccidentSurrogate.location
    }

  public companion object {
    public fun fromModel(model: Claim.Accident): ClaimAccidentSurrogate =
      with(model) {
        ClaimAccidentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          type = this@with.type
          location = this@with.location
        }
      }
  }
}

@Serializable
internal data class ClaimItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var net: Money? = null,
  public var udi: List<Reference?>? = null,
) {
  public fun toModel(): Claim.Item.Detail.SubDetail =
    Claim.Item.Detail.SubDetail().apply {
      id = this@ClaimItemDetailSubDetailSurrogate.id
      extension = this@ClaimItemDetailSubDetailSurrogate.extension
      modifierExtension = this@ClaimItemDetailSubDetailSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ClaimItemDetailSubDetailSurrogate.sequence,
          this@ClaimItemDetailSubDetailSurrogate._sequence,
        )
      revenue = this@ClaimItemDetailSubDetailSurrogate.revenue
      category = this@ClaimItemDetailSubDetailSurrogate.category
      productOrService = this@ClaimItemDetailSubDetailSurrogate.productOrService
      modifier = this@ClaimItemDetailSubDetailSurrogate.modifier
      programCode = this@ClaimItemDetailSubDetailSurrogate.programCode
      quantity = this@ClaimItemDetailSubDetailSurrogate.quantity
      unitPrice = this@ClaimItemDetailSubDetailSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ClaimItemDetailSubDetailSurrogate.factor,
          this@ClaimItemDetailSubDetailSurrogate._factor,
        )
      net = this@ClaimItemDetailSubDetailSurrogate.net
      udi = this@ClaimItemDetailSubDetailSurrogate.udi
    }

  public companion object {
    public fun fromModel(model: Claim.Item.Detail.SubDetail): ClaimItemDetailSubDetailSurrogate =
      with(model) {
        ClaimItemDetailSubDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          revenue = this@with.revenue
          category = this@with.category
          productOrService = this@with.productOrService
          modifier = this@with.modifier
          programCode = this@with.programCode
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          net = this@with.net
          udi = this@with.udi
        }
      }
  }
}

@Serializable
internal data class ClaimItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var net: Money? = null,
  public var udi: List<Reference?>? = null,
  public var subDetail: List<Claim.Item.Detail.SubDetail>? = null,
) {
  public fun toModel(): Claim.Item.Detail =
    Claim.Item.Detail().apply {
      id = this@ClaimItemDetailSurrogate.id
      extension = this@ClaimItemDetailSurrogate.extension
      modifierExtension = this@ClaimItemDetailSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@ClaimItemDetailSurrogate.sequence,
          this@ClaimItemDetailSurrogate._sequence,
        )
      revenue = this@ClaimItemDetailSurrogate.revenue
      category = this@ClaimItemDetailSurrogate.category
      productOrService = this@ClaimItemDetailSurrogate.productOrService
      modifier = this@ClaimItemDetailSurrogate.modifier
      programCode = this@ClaimItemDetailSurrogate.programCode
      quantity = this@ClaimItemDetailSurrogate.quantity
      unitPrice = this@ClaimItemDetailSurrogate.unitPrice
      factor =
        Decimal.of(this@ClaimItemDetailSurrogate.factor, this@ClaimItemDetailSurrogate._factor)
      net = this@ClaimItemDetailSurrogate.net
      udi = this@ClaimItemDetailSurrogate.udi
      subDetail = this@ClaimItemDetailSurrogate.subDetail
    }

  public companion object {
    public fun fromModel(model: Claim.Item.Detail): ClaimItemDetailSurrogate =
      with(model) {
        ClaimItemDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          revenue = this@with.revenue
          category = this@with.category
          productOrService = this@with.productOrService
          modifier = this@with.modifier
          programCode = this@with.programCode
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          net = this@with.net
          udi = this@with.udi
          subDetail = this@with.subDetail
        }
      }
  }
}

@Serializable
internal class ClaimItemServicedSurrogate {
  public var servicedDate: KotlinString? = null

  public var _servicedDate: Element? = null

  public var servicedPeriod: Period? = null

  public fun toModel(): Claim.Item.Serviced =
    Claim.Item.Serviced?.from(
      Date.of(
        FhirDate.fromString(this@ClaimItemServicedSurrogate.servicedDate),
        this@ClaimItemServicedSurrogate._servicedDate,
      ),
      this@ClaimItemServicedSurrogate.servicedPeriod,
    ) ?: Claim.Item.Serviced.Null

  public companion object {
    public fun fromModel(model: Claim.Item.Serviced): ClaimItemServicedSurrogate =
      with(model) {
        ClaimItemServicedSurrogate().apply {
          servicedDate = this@with.asDate()?.value?.value?.toString()
          _servicedDate = this@with.asDate()?.value?.toElement()
          servicedPeriod = this@with.asPeriod()?.value
        }
      }
  }
}

@Serializable
internal class ClaimItemLocationSurrogate {
  public var locationCodeableConcept: CodeableConcept? = null

  public var locationAddress: Address? = null

  public var locationReference: Reference? = null

  public fun toModel(): Claim.Item.Location =
    Claim.Item.Location?.from(
      this@ClaimItemLocationSurrogate.locationCodeableConcept,
      this@ClaimItemLocationSurrogate.locationAddress,
      this@ClaimItemLocationSurrogate.locationReference,
    ) ?: Claim.Item.Location.Null

  public companion object {
    public fun fromModel(model: Claim.Item.Location): ClaimItemLocationSurrogate =
      with(model) {
        ClaimItemLocationSurrogate().apply {
          locationCodeableConcept = this@with.asCodeableConcept()?.value
          locationAddress = this@with.asAddress()?.value
          locationReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ClaimItemSurrogate(
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
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var programCode: List<CodeableConcept?>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var net: Money? = null,
  public var udi: List<Reference?>? = null,
  public var bodySite: CodeableConcept? = null,
  public var subSite: List<CodeableConcept?>? = null,
  public var encounter: List<Reference?>? = null,
  public var detail: List<Claim.Item.Detail>? = null,
  public var serviced: Claim.Item.Serviced? = null,
  public var location: Claim.Item.Location? = null,
) {
  public fun toModel(): Claim.Item =
    Claim.Item().apply {
      id = this@ClaimItemSurrogate.id
      extension = this@ClaimItemSurrogate.extension
      modifierExtension = this@ClaimItemSurrogate.modifierExtension
      sequence = PositiveInt.of(this@ClaimItemSurrogate.sequence, this@ClaimItemSurrogate._sequence)
      careTeamSequence =
        if (
          this@ClaimItemSurrogate.careTeamSequence == null &&
            this@ClaimItemSurrogate._careTeamSequence == null
        ) {
          null
        } else {
          (this@ClaimItemSurrogate.careTeamSequence
              ?: List(this@ClaimItemSurrogate._careTeamSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._careTeamSequence
                ?: List(this@ClaimItemSurrogate.careTeamSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      diagnosisSequence =
        if (
          this@ClaimItemSurrogate.diagnosisSequence == null &&
            this@ClaimItemSurrogate._diagnosisSequence == null
        ) {
          null
        } else {
          (this@ClaimItemSurrogate.diagnosisSequence
              ?: List(this@ClaimItemSurrogate._diagnosisSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._diagnosisSequence
                ?: List(this@ClaimItemSurrogate.diagnosisSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      procedureSequence =
        if (
          this@ClaimItemSurrogate.procedureSequence == null &&
            this@ClaimItemSurrogate._procedureSequence == null
        ) {
          null
        } else {
          (this@ClaimItemSurrogate.procedureSequence
              ?: List(this@ClaimItemSurrogate._procedureSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._procedureSequence
                ?: List(this@ClaimItemSurrogate.procedureSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      informationSequence =
        if (
          this@ClaimItemSurrogate.informationSequence == null &&
            this@ClaimItemSurrogate._informationSequence == null
        ) {
          null
        } else {
          (this@ClaimItemSurrogate.informationSequence
              ?: List(this@ClaimItemSurrogate._informationSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._informationSequence
                ?: List(this@ClaimItemSurrogate.informationSequence!!.size) { null }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      revenue = this@ClaimItemSurrogate.revenue
      category = this@ClaimItemSurrogate.category
      productOrService = this@ClaimItemSurrogate.productOrService
      modifier = this@ClaimItemSurrogate.modifier
      programCode = this@ClaimItemSurrogate.programCode
      serviced = this@ClaimItemSurrogate.serviced
      location = this@ClaimItemSurrogate.location
      quantity = this@ClaimItemSurrogate.quantity
      unitPrice = this@ClaimItemSurrogate.unitPrice
      factor = Decimal.of(this@ClaimItemSurrogate.factor, this@ClaimItemSurrogate._factor)
      net = this@ClaimItemSurrogate.net
      udi = this@ClaimItemSurrogate.udi
      bodySite = this@ClaimItemSurrogate.bodySite
      subSite = this@ClaimItemSurrogate.subSite
      encounter = this@ClaimItemSurrogate.encounter
      detail = this@ClaimItemSurrogate.detail
    }

  public companion object {
    public fun fromModel(model: Claim.Item): ClaimItemSurrogate =
      with(model) {
        ClaimItemSurrogate().apply {
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
          revenue = this@with.revenue
          category = this@with.category
          productOrService = this@with.productOrService
          modifier = this@with.modifier
          programCode = this@with.programCode
          serviced = this@with.serviced
          location = this@with.location
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          net = this@with.net
          udi = this@with.udi
          bodySite = this@with.bodySite
          subSite = this@with.subSite
          encounter = this@with.encounter
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class ClaimSurrogate(
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
  public var fundsReserve: CodeableConcept? = null,
  public var related: List<Claim.Related>? = null,
  public var prescription: Reference? = null,
  public var originalPrescription: Reference? = null,
  public var payee: Claim.Payee? = null,
  public var referral: Reference? = null,
  public var facility: Reference? = null,
  public var careTeam: List<Claim.CareTeam>? = null,
  public var supportingInfo: List<Claim.SupportingInfo>? = null,
  public var diagnosis: List<Claim.Diagnosis>? = null,
  public var procedure: List<Claim.Procedure>? = null,
  public var insurance: List<Claim.Insurance>? = null,
  public var accident: Claim.Accident? = null,
  public var item: List<Claim.Item>? = null,
  public var total: Money? = null,
) {
  public fun toModel(): Claim =
    Claim().apply {
      id = this@ClaimSurrogate.id
      meta = this@ClaimSurrogate.meta
      implicitRules = Uri.of(this@ClaimSurrogate.implicitRules, this@ClaimSurrogate._implicitRules)
      language = Code.of(this@ClaimSurrogate.language, this@ClaimSurrogate._language)
      text = this@ClaimSurrogate.text
      contained = this@ClaimSurrogate.contained
      extension = this@ClaimSurrogate.extension
      modifierExtension = this@ClaimSurrogate.modifierExtension
      identifier = this@ClaimSurrogate.identifier
      status =
        Enumeration.of(
          this@ClaimSurrogate.status?.let {
            com.google.fhir.model.r4b.Claim.ClaimStatus.fromCode(it)
          },
          this@ClaimSurrogate._status,
        )
      type = this@ClaimSurrogate.type
      subType = this@ClaimSurrogate.subType
      use =
        Enumeration.of(
          this@ClaimSurrogate.use?.let { com.google.fhir.model.r4b.Claim.Use.fromCode(it) },
          this@ClaimSurrogate._use,
        )
      patient = this@ClaimSurrogate.patient
      billablePeriod = this@ClaimSurrogate.billablePeriod
      created =
        DateTime.of(
          FhirDateTime.fromString(this@ClaimSurrogate.created),
          this@ClaimSurrogate._created,
        )
      enterer = this@ClaimSurrogate.enterer
      insurer = this@ClaimSurrogate.insurer
      provider = this@ClaimSurrogate.provider
      priority = this@ClaimSurrogate.priority
      fundsReserve = this@ClaimSurrogate.fundsReserve
      related = this@ClaimSurrogate.related
      prescription = this@ClaimSurrogate.prescription
      originalPrescription = this@ClaimSurrogate.originalPrescription
      payee = this@ClaimSurrogate.payee
      referral = this@ClaimSurrogate.referral
      facility = this@ClaimSurrogate.facility
      careTeam = this@ClaimSurrogate.careTeam
      supportingInfo = this@ClaimSurrogate.supportingInfo
      diagnosis = this@ClaimSurrogate.diagnosis
      procedure = this@ClaimSurrogate.procedure
      insurance = this@ClaimSurrogate.insurance
      accident = this@ClaimSurrogate.accident
      item = this@ClaimSurrogate.item
      total = this@ClaimSurrogate.total
    }

  public companion object {
    public fun fromModel(model: Claim): ClaimSurrogate =
      with(model) {
        ClaimSurrogate().apply {
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
          fundsReserve = this@with.fundsReserve
          related = this@with.related
          prescription = this@with.prescription
          originalPrescription = this@with.originalPrescription
          payee = this@with.payee
          referral = this@with.referral
          facility = this@with.facility
          careTeam = this@with.careTeam
          supportingInfo = this@with.supportingInfo
          diagnosis = this@with.diagnosis
          procedure = this@with.procedure
          insurance = this@with.insurance
          accident = this@with.accident
          item = this@with.item
          total = this@with.total
        }
      }
  }
}
