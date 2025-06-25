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
import com.google.fhir.model.r5.Claim
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
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
internal data class ClaimEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var whenDateTime: KotlinString? = null,
  public var _whenDateTime: Element? = null,
  public var whenPeriod: Period? = null,
) {
  public fun toModel(): Claim.Event =
    Claim.Event().apply {
      id = this@ClaimEventSurrogate.id
      extension = this@ClaimEventSurrogate.extension
      modifierExtension = this@ClaimEventSurrogate.modifierExtension
      type = this@ClaimEventSurrogate.type
      `when` =
        Claim.Event.When?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ClaimEventSurrogate.whenDateTime),
            this@ClaimEventSurrogate._whenDateTime,
          ),
          this@ClaimEventSurrogate.whenPeriod,
        )
    }

  public companion object {
    public fun fromModel(model: Claim.Event): ClaimEventSurrogate =
      with(model) {
        ClaimEventSurrogate().apply {
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
  public var specialty: CodeableConcept? = null,
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
        R5Boolean.of(
          this@ClaimCareTeamSurrogate.responsible,
          this@ClaimCareTeamSurrogate._responsible,
        )
      role = this@ClaimCareTeamSurrogate.role
      specialty = this@ClaimCareTeamSurrogate.specialty
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
          specialty = this@with.specialty
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
  public var reason: CodeableConcept? = null,
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
      timing =
        Claim.SupportingInfo.Timing?.from(
          Date.of(
            FhirDate.fromString(this@ClaimSupportingInfoSurrogate.timingDate),
            this@ClaimSupportingInfoSurrogate._timingDate,
          ),
          this@ClaimSupportingInfoSurrogate.timingPeriod,
        )
      `value` =
        Claim.SupportingInfo.Value?.from(
          R5Boolean.of(
            this@ClaimSupportingInfoSurrogate.valueBoolean,
            this@ClaimSupportingInfoSurrogate._valueBoolean,
          ),
          R5String.of(
            this@ClaimSupportingInfoSurrogate.valueString,
            this@ClaimSupportingInfoSurrogate._valueString,
          ),
          this@ClaimSupportingInfoSurrogate.valueQuantity,
          this@ClaimSupportingInfoSurrogate.valueAttachment,
          this@ClaimSupportingInfoSurrogate.valueReference,
          this@ClaimSupportingInfoSurrogate.valueIdentifier,
        )
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
internal data class ClaimDiagnosisSurrogate(
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
      diagnosis =
        Claim.Diagnosis.Diagnosis?.from(
          this@ClaimDiagnosisSurrogate.diagnosisCodeableConcept,
          this@ClaimDiagnosisSurrogate.diagnosisReference,
        )
      type = this@ClaimDiagnosisSurrogate.type
      onAdmission = this@ClaimDiagnosisSurrogate.onAdmission
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
          diagnosisCodeableConcept = this@with.diagnosis?.asCodeableConcept()?.value
          diagnosisReference = this@with.diagnosis?.asReference()?.value
          type = this@with.type
          onAdmission = this@with.onAdmission
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
  public var procedureCodeableConcept: CodeableConcept? = null,
  public var procedureReference: Reference? = null,
  public var udi: List<Reference?>? = null,
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
      procedure =
        Claim.Procedure.Procedure?.from(
          this@ClaimProcedureSurrogate.procedureCodeableConcept,
          this@ClaimProcedureSurrogate.procedureReference,
        )
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
          procedureCodeableConcept = this@with.procedure?.asCodeableConcept()?.value
          procedureReference = this@with.procedure?.asReference()?.value
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
      focal = R5Boolean.of(this@ClaimInsuranceSurrogate.focal, this@ClaimInsuranceSurrogate._focal)
      identifier = this@ClaimInsuranceSurrogate.identifier
      coverage = this@ClaimInsuranceSurrogate.coverage
      businessArrangement =
        R5String.of(
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
            .mapNotNull { (value, element) -> R5String.of(value, element) }
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
internal data class ClaimAccidentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var type: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
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
      location =
        Claim.Accident.Location?.from(
          this@ClaimAccidentSurrogate.locationAddress,
          this@ClaimAccidentSurrogate.locationReference,
        )
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
          locationAddress = this@with.location?.asAddress()?.value
          locationReference = this@with.location?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ClaimItemBodySiteSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var site: List<CodeableReference?>? = null,
  public var subSite: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Claim.Item.BodySite =
    Claim.Item.BodySite().apply {
      id = this@ClaimItemBodySiteSurrogate.id
      extension = this@ClaimItemBodySiteSurrogate.extension
      modifierExtension = this@ClaimItemBodySiteSurrogate.modifierExtension
      site = this@ClaimItemBodySiteSurrogate.site
      subSite = this@ClaimItemBodySiteSurrogate.subSite
    }

  public companion object {
    public fun fromModel(model: Claim.Item.BodySite): ClaimItemBodySiteSurrogate =
      with(model) {
        ClaimItemBodySiteSurrogate().apply {
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
internal data class ClaimItemDetailSubDetailSurrogate(
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
      traceNumber = this@ClaimItemDetailSubDetailSurrogate.traceNumber
      revenue = this@ClaimItemDetailSubDetailSurrogate.revenue
      category = this@ClaimItemDetailSubDetailSurrogate.category
      productOrService = this@ClaimItemDetailSubDetailSurrogate.productOrService
      productOrServiceEnd = this@ClaimItemDetailSubDetailSurrogate.productOrServiceEnd
      modifier = this@ClaimItemDetailSubDetailSurrogate.modifier
      programCode = this@ClaimItemDetailSubDetailSurrogate.programCode
      patientPaid = this@ClaimItemDetailSubDetailSurrogate.patientPaid
      quantity = this@ClaimItemDetailSubDetailSurrogate.quantity
      unitPrice = this@ClaimItemDetailSubDetailSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ClaimItemDetailSubDetailSurrogate.factor,
          this@ClaimItemDetailSubDetailSurrogate._factor,
        )
      tax = this@ClaimItemDetailSubDetailSurrogate.tax
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
      traceNumber = this@ClaimItemDetailSurrogate.traceNumber
      revenue = this@ClaimItemDetailSurrogate.revenue
      category = this@ClaimItemDetailSurrogate.category
      productOrService = this@ClaimItemDetailSurrogate.productOrService
      productOrServiceEnd = this@ClaimItemDetailSurrogate.productOrServiceEnd
      modifier = this@ClaimItemDetailSurrogate.modifier
      programCode = this@ClaimItemDetailSurrogate.programCode
      patientPaid = this@ClaimItemDetailSurrogate.patientPaid
      quantity = this@ClaimItemDetailSurrogate.quantity
      unitPrice = this@ClaimItemDetailSurrogate.unitPrice
      factor =
        Decimal.of(this@ClaimItemDetailSurrogate.factor, this@ClaimItemDetailSurrogate._factor)
      tax = this@ClaimItemDetailSurrogate.tax
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
          subDetail = this@with.subDetail
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
  public var traceNumber: List<Identifier?>? = null,
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
  public var bodySite: List<Claim.Item.BodySite>? = null,
  public var encounter: List<Reference?>? = null,
  public var detail: List<Claim.Item.Detail>? = null,
) {
  public fun toModel(): Claim.Item =
    Claim.Item().apply {
      id = this@ClaimItemSurrogate.id
      extension = this@ClaimItemSurrogate.extension
      modifierExtension = this@ClaimItemSurrogate.modifierExtension
      sequence = PositiveInt.of(this@ClaimItemSurrogate.sequence, this@ClaimItemSurrogate._sequence)
      traceNumber = this@ClaimItemSurrogate.traceNumber
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
      productOrServiceEnd = this@ClaimItemSurrogate.productOrServiceEnd
      request = this@ClaimItemSurrogate.request
      modifier = this@ClaimItemSurrogate.modifier
      programCode = this@ClaimItemSurrogate.programCode
      serviced =
        Claim.Item.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@ClaimItemSurrogate.servicedDate),
            this@ClaimItemSurrogate._servicedDate,
          ),
          this@ClaimItemSurrogate.servicedPeriod,
        )
      location =
        Claim.Item.Location?.from(
          this@ClaimItemSurrogate.locationCodeableConcept,
          this@ClaimItemSurrogate.locationAddress,
          this@ClaimItemSurrogate.locationReference,
        )
      patientPaid = this@ClaimItemSurrogate.patientPaid
      quantity = this@ClaimItemSurrogate.quantity
      unitPrice = this@ClaimItemSurrogate.unitPrice
      factor = Decimal.of(this@ClaimItemSurrogate.factor, this@ClaimItemSurrogate._factor)
      tax = this@ClaimItemSurrogate.tax
      net = this@ClaimItemSurrogate.net
      udi = this@ClaimItemSurrogate.udi
      bodySite = this@ClaimItemSurrogate.bodySite
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
          traceNumber = this@with.traceNumber
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
  public var fundsReserve: CodeableConcept? = null,
  public var related: List<Claim.Related>? = null,
  public var prescription: Reference? = null,
  public var originalPrescription: Reference? = null,
  public var payee: Claim.Payee? = null,
  public var referral: Reference? = null,
  public var encounter: List<Reference?>? = null,
  public var facility: Reference? = null,
  public var diagnosisRelatedGroup: CodeableConcept? = null,
  public var event: List<Claim.Event>? = null,
  public var careTeam: List<Claim.CareTeam>? = null,
  public var supportingInfo: List<Claim.SupportingInfo>? = null,
  public var diagnosis: List<Claim.Diagnosis>? = null,
  public var procedure: List<Claim.Procedure>? = null,
  public var insurance: List<Claim.Insurance>? = null,
  public var accident: Claim.Accident? = null,
  public var patientPaid: Money? = null,
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
      traceNumber = this@ClaimSurrogate.traceNumber
      status =
        Enumeration.of(
          this@ClaimSurrogate.status?.let {
            com.google.fhir.model.r5.Claim.ClaimStatus.fromCode(it)
          },
          this@ClaimSurrogate._status,
        )
      type = this@ClaimSurrogate.type
      subType = this@ClaimSurrogate.subType
      use =
        Enumeration.of(
          this@ClaimSurrogate.use?.let { com.google.fhir.model.r5.Claim.Use.fromCode(it) },
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
      encounter = this@ClaimSurrogate.encounter
      facility = this@ClaimSurrogate.facility
      diagnosisRelatedGroup = this@ClaimSurrogate.diagnosisRelatedGroup
      event = this@ClaimSurrogate.event
      careTeam = this@ClaimSurrogate.careTeam
      supportingInfo = this@ClaimSurrogate.supportingInfo
      diagnosis = this@ClaimSurrogate.diagnosis
      procedure = this@ClaimSurrogate.procedure
      insurance = this@ClaimSurrogate.insurance
      accident = this@ClaimSurrogate.accident
      patientPaid = this@ClaimSurrogate.patientPaid
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
          fundsReserve = this@with.fundsReserve
          related = this@with.related
          prescription = this@with.prescription
          originalPrescription = this@with.originalPrescription
          payee = this@with.payee
          referral = this@with.referral
          encounter = this@with.encounter
          facility = this@with.facility
          diagnosisRelatedGroup = this@with.diagnosisRelatedGroup
          event = this@with.event
          careTeam = this@with.careTeam
          supportingInfo = this@with.supportingInfo
          diagnosis = this@with.diagnosis
          procedure = this@with.procedure
          insurance = this@with.insurance
          accident = this@with.accident
          patientPaid = this@with.patientPaid
          item = this@with.item
          total = this@with.total
        }
      }
  }
}
