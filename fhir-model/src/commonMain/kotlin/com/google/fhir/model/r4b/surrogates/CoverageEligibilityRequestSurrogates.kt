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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.CoverageEligibilityRequest
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
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
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CoverageEligibilityRequestSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var information: Reference? = null,
  public var appliesToAll: KotlinBoolean? = null,
  public var _appliesToAll: Element? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.SupportingInfo =
    CoverageEligibilityRequest.SupportingInfo().apply {
      id = this@CoverageEligibilityRequestSupportingInfoSurrogate.id
      extension = this@CoverageEligibilityRequestSupportingInfoSurrogate.extension
      modifierExtension = this@CoverageEligibilityRequestSupportingInfoSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@CoverageEligibilityRequestSupportingInfoSurrogate.sequence,
          this@CoverageEligibilityRequestSupportingInfoSurrogate._sequence,
        )
      information = this@CoverageEligibilityRequestSupportingInfoSurrogate.information
      appliesToAll =
        R4bBoolean.of(
          this@CoverageEligibilityRequestSupportingInfoSurrogate.appliesToAll,
          this@CoverageEligibilityRequestSupportingInfoSurrogate._appliesToAll,
        )
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.SupportingInfo
    ): CoverageEligibilityRequestSupportingInfoSurrogate =
      with(model) {
        CoverageEligibilityRequestSupportingInfoSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          information = this@with.information
          appliesToAll = this@with.appliesToAll?.value
          _appliesToAll = this@with.appliesToAll?.toElement()
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var coverage: Reference? = null,
  public var businessArrangement: KotlinString? = null,
  public var _businessArrangement: Element? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Insurance =
    CoverageEligibilityRequest.Insurance().apply {
      id = this@CoverageEligibilityRequestInsuranceSurrogate.id
      extension = this@CoverageEligibilityRequestInsuranceSurrogate.extension
      modifierExtension = this@CoverageEligibilityRequestInsuranceSurrogate.modifierExtension
      focal =
        R4bBoolean.of(
          this@CoverageEligibilityRequestInsuranceSurrogate.focal,
          this@CoverageEligibilityRequestInsuranceSurrogate._focal,
        )
      coverage = this@CoverageEligibilityRequestInsuranceSurrogate.coverage
      businessArrangement =
        R4bString.of(
          this@CoverageEligibilityRequestInsuranceSurrogate.businessArrangement,
          this@CoverageEligibilityRequestInsuranceSurrogate._businessArrangement,
        )
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Insurance
    ): CoverageEligibilityRequestInsuranceSurrogate =
      with(model) {
        CoverageEligibilityRequestInsuranceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          focal = this@with.focal?.value
          _focal = this@with.focal?.toElement()
          coverage = this@with.coverage
          businessArrangement = this@with.businessArrangement?.value
          _businessArrangement = this@with.businessArrangement?.toElement()
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestItemDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var diagnosisCodeableConcept: CodeableConcept? = null,
  public var diagnosisReference: Reference? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Item.Diagnosis =
    CoverageEligibilityRequest.Item.Diagnosis().apply {
      id = this@CoverageEligibilityRequestItemDiagnosisSurrogate.id
      extension = this@CoverageEligibilityRequestItemDiagnosisSurrogate.extension
      modifierExtension = this@CoverageEligibilityRequestItemDiagnosisSurrogate.modifierExtension
      diagnosis =
        CoverageEligibilityRequest.Item.Diagnosis.Diagnosis?.from(
          this@CoverageEligibilityRequestItemDiagnosisSurrogate.diagnosisCodeableConcept,
          this@CoverageEligibilityRequestItemDiagnosisSurrogate.diagnosisReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Item.Diagnosis
    ): CoverageEligibilityRequestItemDiagnosisSurrogate =
      with(model) {
        CoverageEligibilityRequestItemDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          diagnosisCodeableConcept = this@with.diagnosis?.asCodeableConcept()?.value
          diagnosisReference = this@with.diagnosis?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var supportingInfoSequence: List<Int?>? = null,
  public var _supportingInfoSequence: List<Element?>? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var provider: Reference? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var facility: Reference? = null,
  public var diagnosis: List<CoverageEligibilityRequest.Item.Diagnosis>? = null,
  public var detail: List<Reference?>? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Item =
    CoverageEligibilityRequest.Item().apply {
      id = this@CoverageEligibilityRequestItemSurrogate.id
      extension = this@CoverageEligibilityRequestItemSurrogate.extension
      modifierExtension = this@CoverageEligibilityRequestItemSurrogate.modifierExtension
      supportingInfoSequence =
        if (
          this@CoverageEligibilityRequestItemSurrogate.supportingInfoSequence == null &&
            this@CoverageEligibilityRequestItemSurrogate._supportingInfoSequence == null
        ) {
          null
        } else {
          (this@CoverageEligibilityRequestItemSurrogate.supportingInfoSequence
              ?: List(this@CoverageEligibilityRequestItemSurrogate._supportingInfoSequence!!.size) {
                null
              })
            .zip(
              this@CoverageEligibilityRequestItemSurrogate._supportingInfoSequence
                ?: List(
                  this@CoverageEligibilityRequestItemSurrogate.supportingInfoSequence!!.size
                ) {
                  null
                }
            )
            .mapNotNull { (value, element) -> PositiveInt.of(value, element) }
        }
      category = this@CoverageEligibilityRequestItemSurrogate.category
      productOrService = this@CoverageEligibilityRequestItemSurrogate.productOrService
      modifier = this@CoverageEligibilityRequestItemSurrogate.modifier
      provider = this@CoverageEligibilityRequestItemSurrogate.provider
      quantity = this@CoverageEligibilityRequestItemSurrogate.quantity
      unitPrice = this@CoverageEligibilityRequestItemSurrogate.unitPrice
      facility = this@CoverageEligibilityRequestItemSurrogate.facility
      diagnosis = this@CoverageEligibilityRequestItemSurrogate.diagnosis
      detail = this@CoverageEligibilityRequestItemSurrogate.detail
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Item
    ): CoverageEligibilityRequestItemSurrogate =
      with(model) {
        CoverageEligibilityRequestItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          supportingInfoSequence =
            this@with.supportingInfoSequence
              ?.map { it?.value }
              ?.takeUnless { it.all { it == null } }
          _supportingInfoSequence =
            this@with.supportingInfoSequence
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          category = this@with.category
          productOrService = this@with.productOrService
          modifier = this@with.modifier
          provider = this@with.provider
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          facility = this@with.facility
          diagnosis = this@with.diagnosis
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestSurrogate(
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
  public var priority: CodeableConcept? = null,
  public var purpose: List<KotlinString?>? = null,
  public var _purpose: List<Element?>? = null,
  public var patient: Reference? = null,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var enterer: Reference? = null,
  public var provider: Reference? = null,
  public var insurer: Reference? = null,
  public var facility: Reference? = null,
  public var supportingInfo: List<CoverageEligibilityRequest.SupportingInfo>? = null,
  public var insurance: List<CoverageEligibilityRequest.Insurance>? = null,
  public var item: List<CoverageEligibilityRequest.Item>? = null,
) {
  public fun toModel(): CoverageEligibilityRequest =
    CoverageEligibilityRequest().apply {
      id = this@CoverageEligibilityRequestSurrogate.id
      meta = this@CoverageEligibilityRequestSurrogate.meta
      implicitRules =
        Uri.of(
          this@CoverageEligibilityRequestSurrogate.implicitRules,
          this@CoverageEligibilityRequestSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@CoverageEligibilityRequestSurrogate.language,
          this@CoverageEligibilityRequestSurrogate._language,
        )
      text = this@CoverageEligibilityRequestSurrogate.text
      contained = this@CoverageEligibilityRequestSurrogate.contained
      extension = this@CoverageEligibilityRequestSurrogate.extension
      modifierExtension = this@CoverageEligibilityRequestSurrogate.modifierExtension
      identifier = this@CoverageEligibilityRequestSurrogate.identifier
      status =
        Enumeration.of(
          this@CoverageEligibilityRequestSurrogate.status?.let {
            com.google.fhir.model.r4b.CoverageEligibilityRequest.EligibilityRequestStatus.fromCode(
              it
            )
          },
          this@CoverageEligibilityRequestSurrogate._status,
        )
      priority = this@CoverageEligibilityRequestSurrogate.priority
      purpose =
        if (
          this@CoverageEligibilityRequestSurrogate.purpose == null &&
            this@CoverageEligibilityRequestSurrogate._purpose == null
        ) {
          null
        } else {
          (this@CoverageEligibilityRequestSurrogate.purpose
              ?: List(this@CoverageEligibilityRequestSurrogate._purpose!!.size) { null })
            .zip(
              this@CoverageEligibilityRequestSurrogate._purpose
                ?: List(this@CoverageEligibilityRequestSurrogate.purpose!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let {
                  com.google.fhir.model.r4b.CoverageEligibilityRequest.EligibilityRequestPurpose
                    .fromCode(it)
                },
                element,
              )
            }
        }
      patient = this@CoverageEligibilityRequestSurrogate.patient
      serviced =
        CoverageEligibilityRequest.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@CoverageEligibilityRequestSurrogate.servicedDate),
            this@CoverageEligibilityRequestSurrogate._servicedDate,
          ),
          this@CoverageEligibilityRequestSurrogate.servicedPeriod,
        )
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CoverageEligibilityRequestSurrogate.created),
          this@CoverageEligibilityRequestSurrogate._created,
        )
      enterer = this@CoverageEligibilityRequestSurrogate.enterer
      provider = this@CoverageEligibilityRequestSurrogate.provider
      insurer = this@CoverageEligibilityRequestSurrogate.insurer
      facility = this@CoverageEligibilityRequestSurrogate.facility
      supportingInfo = this@CoverageEligibilityRequestSurrogate.supportingInfo
      insurance = this@CoverageEligibilityRequestSurrogate.insurance
      item = this@CoverageEligibilityRequestSurrogate.item
    }

  public companion object {
    public fun fromModel(model: CoverageEligibilityRequest): CoverageEligibilityRequestSurrogate =
      with(model) {
        CoverageEligibilityRequestSurrogate().apply {
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
          priority = this@with.priority
          purpose =
            this@with.purpose?.map { it?.value?.getCode() }?.takeUnless { it.all { it == null } }
          _purpose =
            this@with.purpose?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          patient = this@with.patient
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString()
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement()
          servicedPeriod = this@with.serviced?.asPeriod()?.value
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          enterer = this@with.enterer
          provider = this@with.provider
          insurer = this@with.insurer
          facility = this@with.facility
          supportingInfo = this@with.supportingInfo
          insurance = this@with.insurance
          item = this@with.item
        }
      }
  }
}
