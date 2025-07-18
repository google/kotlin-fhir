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

import com.google.fhir.model.r4.Address
import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Claim
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Money
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ClaimRelatedSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var claim: Reference? = null,
  public var relationship: CodeableConcept? = null,
  public var reference: Identifier? = null,
) {
  public fun toModel(): Claim.Related =
    Claim.Related(
      id = this@ClaimRelatedSurrogate.id,
      extension = this@ClaimRelatedSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimRelatedSurrogate.modifierExtension ?: mutableListOf(),
      claim = this@ClaimRelatedSurrogate.claim,
      relationship = this@ClaimRelatedSurrogate.relationship,
      reference = this@ClaimRelatedSurrogate.reference,
    )

  public companion object {
    public fun fromModel(model: Claim.Related): ClaimRelatedSurrogate =
      with(model) {
        ClaimRelatedSurrogate(
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
internal data class ClaimPayeeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var party: Reference? = null,
) {
  public fun toModel(): Claim.Payee =
    Claim.Payee(
      id = this@ClaimPayeeSurrogate.id,
      extension = this@ClaimPayeeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimPayeeSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ClaimPayeeSurrogate.type,
      party = this@ClaimPayeeSurrogate.party,
    )

  public companion object {
    public fun fromModel(model: Claim.Payee): ClaimPayeeSurrogate =
      with(model) {
        ClaimPayeeSurrogate(
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
internal data class ClaimCareTeamSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var provider: Reference,
  public var responsible: KotlinBoolean? = null,
  public var _responsible: Element? = null,
  public var role: CodeableConcept? = null,
  public var qualification: CodeableConcept? = null,
) {
  public fun toModel(): Claim.CareTeam =
    Claim.CareTeam(
      id = this@ClaimCareTeamSurrogate.id,
      extension = this@ClaimCareTeamSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimCareTeamSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimCareTeamSurrogate.sequence,
          this@ClaimCareTeamSurrogate._sequence,
        )!!,
      provider = this@ClaimCareTeamSurrogate.provider,
      responsible =
        R4Boolean.of(
          this@ClaimCareTeamSurrogate.responsible,
          this@ClaimCareTeamSurrogate._responsible,
        ),
      role = this@ClaimCareTeamSurrogate.role,
      qualification = this@ClaimCareTeamSurrogate.qualification,
    )

  public companion object {
    public fun fromModel(model: Claim.CareTeam): ClaimCareTeamSurrogate =
      with(model) {
        ClaimCareTeamSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          provider = this@with.provider,
          responsible = this@with.responsible?.value,
          _responsible = this@with.responsible?.toElement(),
          role = this@with.role,
          qualification = this@with.qualification,
        )
      }
  }
}

@Serializable
internal data class ClaimSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var category: CodeableConcept,
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
  public var reason: CodeableConcept? = null,
) {
  public fun toModel(): Claim.SupportingInfo =
    Claim.SupportingInfo(
      id = this@ClaimSupportingInfoSurrogate.id,
      extension = this@ClaimSupportingInfoSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimSupportingInfoSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimSupportingInfoSurrogate.sequence,
          this@ClaimSupportingInfoSurrogate._sequence,
        )!!,
      category = this@ClaimSupportingInfoSurrogate.category,
      code = this@ClaimSupportingInfoSurrogate.code,
      timing =
        Claim.SupportingInfo.Timing?.from(
          Date.of(
            FhirDate.fromString(this@ClaimSupportingInfoSurrogate.timingDate),
            this@ClaimSupportingInfoSurrogate._timingDate,
          ),
          this@ClaimSupportingInfoSurrogate.timingPeriod,
        ),
      `value` =
        Claim.SupportingInfo.Value?.from(
          R4Boolean.of(
            this@ClaimSupportingInfoSurrogate.valueBoolean,
            this@ClaimSupportingInfoSurrogate._valueBoolean,
          ),
          R4String.of(
            this@ClaimSupportingInfoSurrogate.valueString,
            this@ClaimSupportingInfoSurrogate._valueString,
          ),
          this@ClaimSupportingInfoSurrogate.valueQuantity,
          this@ClaimSupportingInfoSurrogate.valueAttachment,
          this@ClaimSupportingInfoSurrogate.valueReference,
        ),
      reason = this@ClaimSupportingInfoSurrogate.reason,
    )

  public companion object {
    public fun fromModel(model: Claim.SupportingInfo): ClaimSupportingInfoSurrogate =
      with(model) {
        ClaimSupportingInfoSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          category = this@with.category,
          code = this@with.code,
          timingDate = this@with.timing?.asDate()?.value?.value?.toString(),
          _timingDate = this@with.timing?.asDate()?.value?.toElement(),
          timingPeriod = this@with.timing?.asPeriod()?.value,
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueAttachment = this@with.`value`?.asAttachment()?.value,
          valueReference = this@with.`value`?.asReference()?.value,
          reason = this@with.reason,
        )
      }
  }
}

@Serializable
internal data class ClaimDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var diagnosisCodeableConcept: CodeableConcept? = null,
  public var diagnosisReference: Reference? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var onAdmission: CodeableConcept? = null,
  public var packageCode: CodeableConcept? = null,
) {
  public fun toModel(): Claim.Diagnosis =
    Claim.Diagnosis(
      id = this@ClaimDiagnosisSurrogate.id,
      extension = this@ClaimDiagnosisSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimDiagnosisSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimDiagnosisSurrogate.sequence,
          this@ClaimDiagnosisSurrogate._sequence,
        )!!,
      diagnosis =
        Claim.Diagnosis.Diagnosis.from(
          this@ClaimDiagnosisSurrogate.diagnosisCodeableConcept,
          this@ClaimDiagnosisSurrogate.diagnosisReference,
        )!!,
      type = this@ClaimDiagnosisSurrogate.type ?: mutableListOf(),
      onAdmission = this@ClaimDiagnosisSurrogate.onAdmission,
      packageCode = this@ClaimDiagnosisSurrogate.packageCode,
    )

  public companion object {
    public fun fromModel(model: Claim.Diagnosis): ClaimDiagnosisSurrogate =
      with(model) {
        ClaimDiagnosisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          diagnosisCodeableConcept = this@with.diagnosis?.asCodeableConcept()?.value,
          diagnosisReference = this@with.diagnosis?.asReference()?.value,
          type = this@with.type.takeUnless { it.all { it == null } },
          onAdmission = this@with.onAdmission,
          packageCode = this@with.packageCode,
        )
      }
  }
}

@Serializable
internal data class ClaimProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var procedureCodeableConcept: CodeableConcept? = null,
  public var procedureReference: Reference? = null,
  public var udi: MutableList<Reference>? = null,
) {
  public fun toModel(): Claim.Procedure =
    Claim.Procedure(
      id = this@ClaimProcedureSurrogate.id,
      extension = this@ClaimProcedureSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimProcedureSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimProcedureSurrogate.sequence,
          this@ClaimProcedureSurrogate._sequence,
        )!!,
      type = this@ClaimProcedureSurrogate.type ?: mutableListOf(),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ClaimProcedureSurrogate.date),
          this@ClaimProcedureSurrogate._date,
        ),
      procedure =
        Claim.Procedure.Procedure.from(
          this@ClaimProcedureSurrogate.procedureCodeableConcept,
          this@ClaimProcedureSurrogate.procedureReference,
        )!!,
      udi = this@ClaimProcedureSurrogate.udi ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Claim.Procedure): ClaimProcedureSurrogate =
      with(model) {
        ClaimProcedureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          type = this@with.type.takeUnless { it.all { it == null } },
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          procedureCodeableConcept = this@with.procedure?.asCodeableConcept()?.value,
          procedureReference = this@with.procedure?.asReference()?.value,
          udi = this@with.udi.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var identifier: Identifier? = null,
  public var coverage: Reference,
  public var businessArrangement: KotlinString? = null,
  public var _businessArrangement: Element? = null,
  public var preAuthRef: MutableList<KotlinString?>? = null,
  public var _preAuthRef: MutableList<Element?>? = null,
  public var claimResponse: Reference? = null,
) {
  public fun toModel(): Claim.Insurance =
    Claim.Insurance(
      id = this@ClaimInsuranceSurrogate.id,
      extension = this@ClaimInsuranceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimInsuranceSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimInsuranceSurrogate.sequence,
          this@ClaimInsuranceSurrogate._sequence,
        )!!,
      focal =
        R4Boolean.of(this@ClaimInsuranceSurrogate.focal, this@ClaimInsuranceSurrogate._focal)!!,
      identifier = this@ClaimInsuranceSurrogate.identifier,
      coverage = this@ClaimInsuranceSurrogate.coverage,
      businessArrangement =
        R4String.of(
          this@ClaimInsuranceSurrogate.businessArrangement,
          this@ClaimInsuranceSurrogate._businessArrangement,
        ),
      preAuthRef =
        if (
          this@ClaimInsuranceSurrogate.preAuthRef == null &&
            this@ClaimInsuranceSurrogate._preAuthRef == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimInsuranceSurrogate.preAuthRef
              ?: List(this@ClaimInsuranceSurrogate._preAuthRef!!.size) { null })
            .zip(
              this@ClaimInsuranceSurrogate._preAuthRef
                ?: List(this@ClaimInsuranceSurrogate.preAuthRef!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      claimResponse = this@ClaimInsuranceSurrogate.claimResponse,
    )

  public companion object {
    public fun fromModel(model: Claim.Insurance): ClaimInsuranceSurrogate =
      with(model) {
        ClaimInsuranceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          focal = this@with.focal.value,
          _focal = this@with.focal.toElement(),
          identifier = this@with.identifier,
          coverage = this@with.coverage,
          businessArrangement = this@with.businessArrangement?.value,
          _businessArrangement = this@with.businessArrangement?.toElement(),
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
          claimResponse = this@with.claimResponse,
        )
      }
  }
}

@Serializable
internal data class ClaimAccidentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var type: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
) {
  public fun toModel(): Claim.Accident =
    Claim.Accident(
      id = this@ClaimAccidentSurrogate.id,
      extension = this@ClaimAccidentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimAccidentSurrogate.modifierExtension ?: mutableListOf(),
      date =
        Date.of(
          FhirDate.fromString(this@ClaimAccidentSurrogate.date),
          this@ClaimAccidentSurrogate._date,
        )!!,
      type = this@ClaimAccidentSurrogate.type,
      location =
        Claim.Accident.Location?.from(
          this@ClaimAccidentSurrogate.locationAddress,
          this@ClaimAccidentSurrogate.locationReference,
        ),
    )

  public companion object {
    public fun fromModel(model: Claim.Accident): ClaimAccidentSurrogate =
      with(model) {
        ClaimAccidentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          date = this@with.date.value?.toString(),
          _date = this@with.date.toElement(),
          type = this@with.type,
          locationAddress = this@with.location?.asAddress()?.value,
          locationReference = this@with.location?.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ClaimItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var net: Money? = null,
  public var udi: MutableList<Reference>? = null,
) {
  public fun toModel(): Claim.Item.Detail.SubDetail =
    Claim.Item.Detail.SubDetail(
      id = this@ClaimItemDetailSubDetailSurrogate.id,
      extension = this@ClaimItemDetailSubDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimItemDetailSubDetailSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimItemDetailSubDetailSurrogate.sequence,
          this@ClaimItemDetailSubDetailSurrogate._sequence,
        )!!,
      revenue = this@ClaimItemDetailSubDetailSurrogate.revenue,
      category = this@ClaimItemDetailSubDetailSurrogate.category,
      productOrService = this@ClaimItemDetailSubDetailSurrogate.productOrService,
      modifier = this@ClaimItemDetailSubDetailSurrogate.modifier ?: mutableListOf(),
      programCode = this@ClaimItemDetailSubDetailSurrogate.programCode ?: mutableListOf(),
      quantity = this@ClaimItemDetailSubDetailSurrogate.quantity,
      unitPrice = this@ClaimItemDetailSubDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ClaimItemDetailSubDetailSurrogate.factor,
          this@ClaimItemDetailSubDetailSurrogate._factor,
        ),
      net = this@ClaimItemDetailSubDetailSurrogate.net,
      udi = this@ClaimItemDetailSubDetailSurrogate.udi ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Claim.Item.Detail.SubDetail): ClaimItemDetailSubDetailSurrogate =
      with(model) {
        ClaimItemDetailSubDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          revenue = this@with.revenue,
          category = this@with.category,
          productOrService = this@with.productOrService,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          net = this@with.net,
          udi = this@with.udi.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var net: Money? = null,
  public var udi: MutableList<Reference>? = null,
  public var subDetail: MutableList<Claim.Item.Detail.SubDetail>? = null,
) {
  public fun toModel(): Claim.Item.Detail =
    Claim.Item.Detail(
      id = this@ClaimItemDetailSurrogate.id,
      extension = this@ClaimItemDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimItemDetailSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimItemDetailSurrogate.sequence,
          this@ClaimItemDetailSurrogate._sequence,
        )!!,
      revenue = this@ClaimItemDetailSurrogate.revenue,
      category = this@ClaimItemDetailSurrogate.category,
      productOrService = this@ClaimItemDetailSurrogate.productOrService,
      modifier = this@ClaimItemDetailSurrogate.modifier ?: mutableListOf(),
      programCode = this@ClaimItemDetailSurrogate.programCode ?: mutableListOf(),
      quantity = this@ClaimItemDetailSurrogate.quantity,
      unitPrice = this@ClaimItemDetailSurrogate.unitPrice,
      factor =
        Decimal.of(this@ClaimItemDetailSurrogate.factor, this@ClaimItemDetailSurrogate._factor),
      net = this@ClaimItemDetailSurrogate.net,
      udi = this@ClaimItemDetailSurrogate.udi ?: mutableListOf(),
      subDetail = this@ClaimItemDetailSurrogate.subDetail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Claim.Item.Detail): ClaimItemDetailSurrogate =
      with(model) {
        ClaimItemDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          revenue = this@with.revenue,
          category = this@with.category,
          productOrService = this@with.productOrService,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          net = this@with.net,
          udi = this@with.udi.takeUnless { it.all { it == null } },
          subDetail = this@with.subDetail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimItemSurrogate(
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
  public var revenue: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var locationCodeableConcept: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var net: Money? = null,
  public var udi: MutableList<Reference>? = null,
  public var bodySite: CodeableConcept? = null,
  public var subSite: MutableList<CodeableConcept>? = null,
  public var encounter: MutableList<Reference>? = null,
  public var detail: MutableList<Claim.Item.Detail>? = null,
) {
  public fun toModel(): Claim.Item =
    Claim.Item(
      id = this@ClaimItemSurrogate.id,
      extension = this@ClaimItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimItemSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(this@ClaimItemSurrogate.sequence, this@ClaimItemSurrogate._sequence)!!,
      careTeamSequence =
        if (
          this@ClaimItemSurrogate.careTeamSequence == null &&
            this@ClaimItemSurrogate._careTeamSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimItemSurrogate.careTeamSequence
              ?: List(this@ClaimItemSurrogate._careTeamSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._careTeamSequence
                ?: List(this@ClaimItemSurrogate.careTeamSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      diagnosisSequence =
        if (
          this@ClaimItemSurrogate.diagnosisSequence == null &&
            this@ClaimItemSurrogate._diagnosisSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimItemSurrogate.diagnosisSequence
              ?: List(this@ClaimItemSurrogate._diagnosisSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._diagnosisSequence
                ?: List(this@ClaimItemSurrogate.diagnosisSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      procedureSequence =
        if (
          this@ClaimItemSurrogate.procedureSequence == null &&
            this@ClaimItemSurrogate._procedureSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimItemSurrogate.procedureSequence
              ?: List(this@ClaimItemSurrogate._procedureSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._procedureSequence
                ?: List(this@ClaimItemSurrogate.procedureSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      informationSequence =
        if (
          this@ClaimItemSurrogate.informationSequence == null &&
            this@ClaimItemSurrogate._informationSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimItemSurrogate.informationSequence
              ?: List(this@ClaimItemSurrogate._informationSequence!!.size) { null })
            .zip(
              this@ClaimItemSurrogate._informationSequence
                ?: List(this@ClaimItemSurrogate.informationSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      revenue = this@ClaimItemSurrogate.revenue,
      category = this@ClaimItemSurrogate.category,
      productOrService = this@ClaimItemSurrogate.productOrService,
      modifier = this@ClaimItemSurrogate.modifier ?: mutableListOf(),
      programCode = this@ClaimItemSurrogate.programCode ?: mutableListOf(),
      serviced =
        Claim.Item.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@ClaimItemSurrogate.servicedDate),
            this@ClaimItemSurrogate._servicedDate,
          ),
          this@ClaimItemSurrogate.servicedPeriod,
        ),
      location =
        Claim.Item.Location?.from(
          this@ClaimItemSurrogate.locationCodeableConcept,
          this@ClaimItemSurrogate.locationAddress,
          this@ClaimItemSurrogate.locationReference,
        ),
      quantity = this@ClaimItemSurrogate.quantity,
      unitPrice = this@ClaimItemSurrogate.unitPrice,
      factor = Decimal.of(this@ClaimItemSurrogate.factor, this@ClaimItemSurrogate._factor),
      net = this@ClaimItemSurrogate.net,
      udi = this@ClaimItemSurrogate.udi ?: mutableListOf(),
      bodySite = this@ClaimItemSurrogate.bodySite,
      subSite = this@ClaimItemSurrogate.subSite ?: mutableListOf(),
      encounter = this@ClaimItemSurrogate.encounter ?: mutableListOf(),
      detail = this@ClaimItemSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Claim.Item): ClaimItemSurrogate =
      with(model) {
        ClaimItemSurrogate(
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
          revenue = this@with.revenue,
          category = this@with.category,
          productOrService = this@with.productOrService,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString(),
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement(),
          servicedPeriod = this@with.serviced?.asPeriod()?.value,
          locationCodeableConcept = this@with.location?.asCodeableConcept()?.value,
          locationAddress = this@with.location?.asAddress()?.value,
          locationReference = this@with.location?.asReference()?.value,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          net = this@with.net,
          udi = this@with.udi.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite,
          subSite = this@with.subSite.takeUnless { it.all { it == null } },
          encounter = this@with.encounter.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
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
  public var provider: Reference,
  public var priority: CodeableConcept,
  public var fundsReserve: CodeableConcept? = null,
  public var related: MutableList<Claim.Related>? = null,
  public var prescription: Reference? = null,
  public var originalPrescription: Reference? = null,
  public var payee: Claim.Payee? = null,
  public var referral: Reference? = null,
  public var facility: Reference? = null,
  public var careTeam: MutableList<Claim.CareTeam>? = null,
  public var supportingInfo: MutableList<Claim.SupportingInfo>? = null,
  public var diagnosis: MutableList<Claim.Diagnosis>? = null,
  public var procedure: MutableList<Claim.Procedure>? = null,
  public var insurance: MutableList<Claim.Insurance>? = null,
  public var accident: Claim.Accident? = null,
  public var item: MutableList<Claim.Item>? = null,
  public var total: Money? = null,
) {
  public fun toModel(): Claim =
    Claim(
      id = this@ClaimSurrogate.id,
      meta = this@ClaimSurrogate.meta,
      implicitRules = Uri.of(this@ClaimSurrogate.implicitRules, this@ClaimSurrogate._implicitRules),
      language = Code.of(this@ClaimSurrogate.language, this@ClaimSurrogate._language),
      text = this@ClaimSurrogate.text,
      contained = this@ClaimSurrogate.contained ?: mutableListOf(),
      extension = this@ClaimSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ClaimSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.Claim.ClaimStatus.fromCode(this@ClaimSurrogate.status!!),
          this@ClaimSurrogate._status,
        ),
      type = this@ClaimSurrogate.type,
      subType = this@ClaimSurrogate.subType,
      use =
        Enumeration.of(
          com.google.fhir.model.r4.Claim.Use.fromCode(this@ClaimSurrogate.use!!),
          this@ClaimSurrogate._use,
        ),
      patient = this@ClaimSurrogate.patient,
      billablePeriod = this@ClaimSurrogate.billablePeriod,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@ClaimSurrogate.created),
          this@ClaimSurrogate._created,
        )!!,
      enterer = this@ClaimSurrogate.enterer,
      insurer = this@ClaimSurrogate.insurer,
      provider = this@ClaimSurrogate.provider,
      priority = this@ClaimSurrogate.priority,
      fundsReserve = this@ClaimSurrogate.fundsReserve,
      related = this@ClaimSurrogate.related ?: mutableListOf(),
      prescription = this@ClaimSurrogate.prescription,
      originalPrescription = this@ClaimSurrogate.originalPrescription,
      payee = this@ClaimSurrogate.payee,
      referral = this@ClaimSurrogate.referral,
      facility = this@ClaimSurrogate.facility,
      careTeam = this@ClaimSurrogate.careTeam ?: mutableListOf(),
      supportingInfo = this@ClaimSurrogate.supportingInfo ?: mutableListOf(),
      diagnosis = this@ClaimSurrogate.diagnosis ?: mutableListOf(),
      procedure = this@ClaimSurrogate.procedure ?: mutableListOf(),
      insurance = this@ClaimSurrogate.insurance ?: mutableListOf(),
      accident = this@ClaimSurrogate.accident,
      item = this@ClaimSurrogate.item ?: mutableListOf(),
      total = this@ClaimSurrogate.total,
    )

  public companion object {
    public fun fromModel(model: Claim): ClaimSurrogate =
      with(model) {
        ClaimSurrogate(
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
          fundsReserve = this@with.fundsReserve,
          related = this@with.related.takeUnless { it.all { it == null } },
          prescription = this@with.prescription,
          originalPrescription = this@with.originalPrescription,
          payee = this@with.payee,
          referral = this@with.referral,
          facility = this@with.facility,
          careTeam = this@with.careTeam.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          diagnosis = this@with.diagnosis.takeUnless { it.all { it == null } },
          procedure = this@with.procedure.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          accident = this@with.accident,
          item = this@with.item.takeUnless { it.all { it == null } },
          total = this@with.total,
        )
      }
  }
}
