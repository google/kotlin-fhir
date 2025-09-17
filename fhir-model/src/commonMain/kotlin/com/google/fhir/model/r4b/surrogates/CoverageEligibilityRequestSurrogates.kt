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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CoverageEligibilityRequestSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var information: Reference,
  public var appliesToAll: KotlinBoolean? = null,
  public var _appliesToAll: Element? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.SupportingInfo =
    CoverageEligibilityRequest.SupportingInfo(
      id = this@CoverageEligibilityRequestSupportingInfoSurrogate.id,
      extension =
        this@CoverageEligibilityRequestSupportingInfoSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityRequestSupportingInfoSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@CoverageEligibilityRequestSupportingInfoSurrogate.sequence,
          this@CoverageEligibilityRequestSupportingInfoSurrogate._sequence,
        )!!,
      information = this@CoverageEligibilityRequestSupportingInfoSurrogate.information,
      appliesToAll =
        R4bBoolean.of(
          this@CoverageEligibilityRequestSupportingInfoSurrogate.appliesToAll,
          this@CoverageEligibilityRequestSupportingInfoSurrogate._appliesToAll,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.SupportingInfo
    ): CoverageEligibilityRequestSupportingInfoSurrogate =
      with(model) {
        CoverageEligibilityRequestSupportingInfoSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          information = this@with.information,
          appliesToAll = this@with.appliesToAll?.value,
          _appliesToAll = this@with.appliesToAll?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var coverage: Reference,
  public var businessArrangement: KotlinString? = null,
  public var _businessArrangement: Element? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Insurance =
    CoverageEligibilityRequest.Insurance(
      id = this@CoverageEligibilityRequestInsuranceSurrogate.id,
      extension = this@CoverageEligibilityRequestInsuranceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityRequestInsuranceSurrogate.modifierExtension ?: mutableListOf(),
      focal =
        R4bBoolean.of(
          this@CoverageEligibilityRequestInsuranceSurrogate.focal,
          this@CoverageEligibilityRequestInsuranceSurrogate._focal,
        ),
      coverage = this@CoverageEligibilityRequestInsuranceSurrogate.coverage,
      businessArrangement =
        R4bString.of(
          this@CoverageEligibilityRequestInsuranceSurrogate.businessArrangement,
          this@CoverageEligibilityRequestInsuranceSurrogate._businessArrangement,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Insurance
    ): CoverageEligibilityRequestInsuranceSurrogate =
      with(model) {
        CoverageEligibilityRequestInsuranceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          focal = this@with.focal?.value,
          _focal = this@with.focal?.toElement(),
          coverage = this@with.coverage,
          businessArrangement = this@with.businessArrangement?.value,
          _businessArrangement = this@with.businessArrangement?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var supportingInfoSequence: MutableList<Int?>? = null,
  public var _supportingInfoSequence: MutableList<Element?>? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var provider: Reference? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var facility: Reference? = null,
  public var diagnosis: MutableList<CoverageEligibilityRequest.Item.Diagnosis>? = null,
  public var detail: MutableList<Reference>? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Item =
    CoverageEligibilityRequest.Item(
      id = this@CoverageEligibilityRequestItemSurrogate.id,
      extension = this@CoverageEligibilityRequestItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityRequestItemSurrogate.modifierExtension ?: mutableListOf(),
      supportingInfoSequence =
        if (
          this@CoverageEligibilityRequestItemSurrogate.supportingInfoSequence == null &&
            this@CoverageEligibilityRequestItemSurrogate._supportingInfoSequence == null
        ) {
          mutableListOf()
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
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      category = this@CoverageEligibilityRequestItemSurrogate.category,
      productOrService = this@CoverageEligibilityRequestItemSurrogate.productOrService,
      modifier = this@CoverageEligibilityRequestItemSurrogate.modifier ?: mutableListOf(),
      provider = this@CoverageEligibilityRequestItemSurrogate.provider,
      quantity = this@CoverageEligibilityRequestItemSurrogate.quantity,
      unitPrice = this@CoverageEligibilityRequestItemSurrogate.unitPrice,
      facility = this@CoverageEligibilityRequestItemSurrogate.facility,
      diagnosis = this@CoverageEligibilityRequestItemSurrogate.diagnosis ?: mutableListOf(),
      detail = this@CoverageEligibilityRequestItemSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Item
    ): CoverageEligibilityRequestItemSurrogate =
      with(model) {
        CoverageEligibilityRequestItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          supportingInfoSequence =
            this@with.supportingInfoSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _supportingInfoSequence =
            this@with.supportingInfoSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          category = this@with.category,
          productOrService = this@with.productOrService,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          provider = this@with.provider,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          facility = this@with.facility,
          diagnosis = this@with.diagnosis.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestItemDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var diagnosis: CoverageEligibilityRequest.Item.Diagnosis.Diagnosis? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Item.Diagnosis =
    CoverageEligibilityRequest.Item.Diagnosis(
      id = this@CoverageEligibilityRequestItemDiagnosisSurrogate.id,
      extension =
        this@CoverageEligibilityRequestItemDiagnosisSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityRequestItemDiagnosisSurrogate.modifierExtension ?: mutableListOf(),
      diagnosis = this@CoverageEligibilityRequestItemDiagnosisSurrogate.diagnosis,
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Item.Diagnosis
    ): CoverageEligibilityRequestItemDiagnosisSurrogate =
      with(model) {
        CoverageEligibilityRequestItemDiagnosisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          diagnosis = this@with.diagnosis,
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestServicedSurrogate(
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Serviced =
    CoverageEligibilityRequest.Serviced.from(
      Date.of(
        FhirDate.fromString(this@CoverageEligibilityRequestServicedSurrogate.servicedDate),
        this@CoverageEligibilityRequestServicedSurrogate._servicedDate,
      ),
      this@CoverageEligibilityRequestServicedSurrogate.servicedPeriod,
    )!!

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Serviced
    ): CoverageEligibilityRequestServicedSurrogate =
      with(model) {
        CoverageEligibilityRequestServicedSurrogate(
          servicedDate = this@with.asDate()?.value?.value?.toString(),
          _servicedDate = this@with.asDate()?.value?.toElement(),
          servicedPeriod = this@with.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityRequestItemDiagnosisDiagnosisSurrogate(
  public var diagnosisCodeableConcept: CodeableConcept? = null,
  public var diagnosisReference: Reference? = null,
) {
  public fun toModel(): CoverageEligibilityRequest.Item.Diagnosis.Diagnosis =
    CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.from(
      this@CoverageEligibilityRequestItemDiagnosisDiagnosisSurrogate.diagnosisCodeableConcept,
      this@CoverageEligibilityRequestItemDiagnosisDiagnosisSurrogate.diagnosisReference,
    )!!

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityRequest.Item.Diagnosis.Diagnosis
    ): CoverageEligibilityRequestItemDiagnosisDiagnosisSurrogate =
      with(model) {
        CoverageEligibilityRequestItemDiagnosisDiagnosisSurrogate(
          diagnosisCodeableConcept = this@with.asCodeableConcept()?.value,
          diagnosisReference = this@with.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var priority: CodeableConcept? = null,
  public var purpose: MutableList<KotlinString?>? = null,
  public var _purpose: MutableList<Element?>? = null,
  public var patient: Reference,
  public var serviced: CoverageEligibilityRequest.Serviced? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var enterer: Reference? = null,
  public var provider: Reference? = null,
  public var insurer: Reference,
  public var facility: Reference? = null,
  public var supportingInfo: MutableList<CoverageEligibilityRequest.SupportingInfo>? = null,
  public var insurance: MutableList<CoverageEligibilityRequest.Insurance>? = null,
  public var item: MutableList<CoverageEligibilityRequest.Item>? = null,
) {
  public fun toModel(): CoverageEligibilityRequest =
    CoverageEligibilityRequest(
      id = this@CoverageEligibilityRequestSurrogate.id,
      meta = this@CoverageEligibilityRequestSurrogate.meta,
      implicitRules =
        Uri.of(
          this@CoverageEligibilityRequestSurrogate.implicitRules,
          this@CoverageEligibilityRequestSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@CoverageEligibilityRequestSurrogate.language,
          this@CoverageEligibilityRequestSurrogate._language,
        ),
      text = this@CoverageEligibilityRequestSurrogate.text,
      contained = this@CoverageEligibilityRequestSurrogate.contained ?: mutableListOf(),
      extension = this@CoverageEligibilityRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityRequestSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CoverageEligibilityRequestSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.CoverageEligibilityRequest.FinancialResourceStatusCodes
            .fromCode(this@CoverageEligibilityRequestSurrogate.status!!),
          this@CoverageEligibilityRequestSurrogate._status,
        ),
      priority = this@CoverageEligibilityRequestSurrogate.priority,
      purpose =
        if (
          this@CoverageEligibilityRequestSurrogate.purpose == null &&
            this@CoverageEligibilityRequestSurrogate._purpose == null
        ) {
          mutableListOf()
        } else {
          (this@CoverageEligibilityRequestSurrogate.purpose
              ?: List(this@CoverageEligibilityRequestSurrogate._purpose!!.size) { null })
            .zip(
              this@CoverageEligibilityRequestSurrogate._purpose
                ?: List(this@CoverageEligibilityRequestSurrogate.purpose!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r4b.CoverageEligibilityRequest.EligibilityRequestPurpose
                    .fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      patient = this@CoverageEligibilityRequestSurrogate.patient,
      serviced = this@CoverageEligibilityRequestSurrogate.serviced,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CoverageEligibilityRequestSurrogate.created),
          this@CoverageEligibilityRequestSurrogate._created,
        )!!,
      enterer = this@CoverageEligibilityRequestSurrogate.enterer,
      provider = this@CoverageEligibilityRequestSurrogate.provider,
      insurer = this@CoverageEligibilityRequestSurrogate.insurer,
      facility = this@CoverageEligibilityRequestSurrogate.facility,
      supportingInfo = this@CoverageEligibilityRequestSurrogate.supportingInfo ?: mutableListOf(),
      insurance = this@CoverageEligibilityRequestSurrogate.insurance ?: mutableListOf(),
      item = this@CoverageEligibilityRequestSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CoverageEligibilityRequest): CoverageEligibilityRequestSurrogate =
      with(model) {
        CoverageEligibilityRequestSurrogate(
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
          priority = this@with.priority,
          purpose =
            this@with.purpose
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _purpose =
            this@with.purpose
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          patient = this@with.patient,
          serviced = this@with.serviced,
          created = this@with.created.value?.toString(),
          _created = this@with.created.toElement(),
          enterer = this@with.enterer,
          provider = this@with.provider,
          insurer = this@with.insurer,
          facility = this@with.facility,
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          item = this@with.item.takeUnless { it.all { it == null } },
        )
      }
  }
}
