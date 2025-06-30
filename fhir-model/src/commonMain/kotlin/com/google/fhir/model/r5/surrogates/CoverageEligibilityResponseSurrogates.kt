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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CoverageEligibilityResponse
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
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
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CoverageEligibilityResponseEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var whenDateTime: KotlinString? = null,
  public var _whenDateTime: Element? = null,
  public var whenPeriod: Period? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Event =
    CoverageEligibilityResponse.Event().apply {
      id = this@CoverageEligibilityResponseEventSurrogate.id
      extension = this@CoverageEligibilityResponseEventSurrogate.extension
      modifierExtension = this@CoverageEligibilityResponseEventSurrogate.modifierExtension
      type = this@CoverageEligibilityResponseEventSurrogate.type
      `when` =
        CoverageEligibilityResponse.Event.When?.from(
          DateTime.of(
            FhirDateTime.fromString(this@CoverageEligibilityResponseEventSurrogate.whenDateTime),
            this@CoverageEligibilityResponseEventSurrogate._whenDateTime,
          ),
          this@CoverageEligibilityResponseEventSurrogate.whenPeriod,
        )
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Event
    ): CoverageEligibilityResponseEventSurrogate =
      with(model) {
        CoverageEligibilityResponseEventSurrogate().apply {
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
internal data class CoverageEligibilityResponseInsuranceItemBenefitSurrogate(
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
  public var usedString: KotlinString? = null,
  public var _usedString: Element? = null,
  public var usedMoney: Money? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Insurance.Item.Benefit =
    CoverageEligibilityResponse.Insurance.Item.Benefit().apply {
      id = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.id
      extension = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.extension
      modifierExtension =
        this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.modifierExtension
      type = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.type
      allowed =
        CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed?.from(
          UnsignedInt.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowedUnsignedInt,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._allowedUnsignedInt,
          ),
          R5String.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowedString,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._allowedString,
          ),
          this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowedMoney,
        )
      used =
        CoverageEligibilityResponse.Insurance.Item.Benefit.Used?.from(
          UnsignedInt.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.usedUnsignedInt,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._usedUnsignedInt,
          ),
          R5String.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.usedString,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._usedString,
          ),
          this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.usedMoney,
        )
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance.Item.Benefit
    ): CoverageEligibilityResponseInsuranceItemBenefitSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceItemBenefitSurrogate().apply {
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
          usedString = this@with.used?.asString()?.value?.value
          _usedString = this@with.used?.asString()?.value?.toElement()
          usedMoney = this@with.used?.asMoney()?.value
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseInsuranceItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: List<CodeableConcept?>? = null,
  public var provider: Reference? = null,
  public var excluded: KotlinBoolean? = null,
  public var _excluded: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var network: CodeableConcept? = null,
  public var unit: CodeableConcept? = null,
  public var term: CodeableConcept? = null,
  public var benefit: List<CoverageEligibilityResponse.Insurance.Item.Benefit>? = null,
  public var authorizationRequired: KotlinBoolean? = null,
  public var _authorizationRequired: Element? = null,
  public var authorizationSupporting: List<CodeableConcept?>? = null,
  public var authorizationUrl: KotlinString? = null,
  public var _authorizationUrl: Element? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Insurance.Item =
    CoverageEligibilityResponse.Insurance.Item().apply {
      id = this@CoverageEligibilityResponseInsuranceItemSurrogate.id
      extension = this@CoverageEligibilityResponseInsuranceItemSurrogate.extension
      modifierExtension = this@CoverageEligibilityResponseInsuranceItemSurrogate.modifierExtension
      category = this@CoverageEligibilityResponseInsuranceItemSurrogate.category
      productOrService = this@CoverageEligibilityResponseInsuranceItemSurrogate.productOrService
      modifier = this@CoverageEligibilityResponseInsuranceItemSurrogate.modifier
      provider = this@CoverageEligibilityResponseInsuranceItemSurrogate.provider
      excluded =
        R5Boolean.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.excluded,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._excluded,
        )
      name =
        R5String.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.name,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._name,
        )
      description =
        R5String.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.description,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._description,
        )
      network = this@CoverageEligibilityResponseInsuranceItemSurrogate.network
      unit = this@CoverageEligibilityResponseInsuranceItemSurrogate.unit
      term = this@CoverageEligibilityResponseInsuranceItemSurrogate.term
      benefit = this@CoverageEligibilityResponseInsuranceItemSurrogate.benefit
      authorizationRequired =
        R5Boolean.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.authorizationRequired,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._authorizationRequired,
        )
      authorizationSupporting =
        this@CoverageEligibilityResponseInsuranceItemSurrogate.authorizationSupporting
      authorizationUrl =
        Uri.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.authorizationUrl,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._authorizationUrl,
        )
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance.Item
    ): CoverageEligibilityResponseInsuranceItemSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          productOrService = this@with.productOrService
          modifier = this@with.modifier
          provider = this@with.provider
          excluded = this@with.excluded?.value
          _excluded = this@with.excluded?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          network = this@with.network
          unit = this@with.unit
          term = this@with.term
          benefit = this@with.benefit
          authorizationRequired = this@with.authorizationRequired?.value
          _authorizationRequired = this@with.authorizationRequired?.toElement()
          authorizationSupporting = this@with.authorizationSupporting
          authorizationUrl = this@with.authorizationUrl?.value
          _authorizationUrl = this@with.authorizationUrl?.toElement()
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var coverage: Reference? = null,
  public var inforce: KotlinBoolean? = null,
  public var _inforce: Element? = null,
  public var benefitPeriod: Period? = null,
  public var item: List<CoverageEligibilityResponse.Insurance.Item>? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Insurance =
    CoverageEligibilityResponse.Insurance().apply {
      id = this@CoverageEligibilityResponseInsuranceSurrogate.id
      extension = this@CoverageEligibilityResponseInsuranceSurrogate.extension
      modifierExtension = this@CoverageEligibilityResponseInsuranceSurrogate.modifierExtension
      coverage = this@CoverageEligibilityResponseInsuranceSurrogate.coverage
      inforce =
        R5Boolean.of(
          this@CoverageEligibilityResponseInsuranceSurrogate.inforce,
          this@CoverageEligibilityResponseInsuranceSurrogate._inforce,
        )
      benefitPeriod = this@CoverageEligibilityResponseInsuranceSurrogate.benefitPeriod
      item = this@CoverageEligibilityResponseInsuranceSurrogate.item
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance
    ): CoverageEligibilityResponseInsuranceSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          coverage = this@with.coverage
          inforce = this@with.inforce?.value
          _inforce = this@with.inforce?.toElement()
          benefitPeriod = this@with.benefitPeriod
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseErrorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var expression: List<KotlinString?>? = null,
  public var _expression: List<Element?>? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Error =
    CoverageEligibilityResponse.Error().apply {
      id = this@CoverageEligibilityResponseErrorSurrogate.id
      extension = this@CoverageEligibilityResponseErrorSurrogate.extension
      modifierExtension = this@CoverageEligibilityResponseErrorSurrogate.modifierExtension
      code = this@CoverageEligibilityResponseErrorSurrogate.code
      expression =
        if (
          this@CoverageEligibilityResponseErrorSurrogate.expression == null &&
            this@CoverageEligibilityResponseErrorSurrogate._expression == null
        ) {
          null
        } else {
          (this@CoverageEligibilityResponseErrorSurrogate.expression
              ?: List(this@CoverageEligibilityResponseErrorSurrogate._expression!!.size) { null })
            .zip(
              this@CoverageEligibilityResponseErrorSurrogate._expression
                ?: List(this@CoverageEligibilityResponseErrorSurrogate.expression!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Error
    ): CoverageEligibilityResponseErrorSurrogate =
      with(model) {
        CoverageEligibilityResponseErrorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          expression = this@with.expression?.map { it?.value }?.takeUnless { it.all { it == null } }
          _expression =
            this@with.expression?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseSurrogate(
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
  public var purpose: List<KotlinString?>? = null,
  public var _purpose: List<Element?>? = null,
  public var patient: Reference? = null,
  public var event: List<CoverageEligibilityResponse.Event>? = null,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var requestor: Reference? = null,
  public var request: Reference? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var insurer: Reference? = null,
  public var insurance: List<CoverageEligibilityResponse.Insurance>? = null,
  public var preAuthRef: KotlinString? = null,
  public var _preAuthRef: Element? = null,
  public var form: CodeableConcept? = null,
  public var error: List<CoverageEligibilityResponse.Error>? = null,
) {
  public fun toModel(): CoverageEligibilityResponse =
    CoverageEligibilityResponse().apply {
      id = this@CoverageEligibilityResponseSurrogate.id
      meta = this@CoverageEligibilityResponseSurrogate.meta
      implicitRules =
        Uri.of(
          this@CoverageEligibilityResponseSurrogate.implicitRules,
          this@CoverageEligibilityResponseSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@CoverageEligibilityResponseSurrogate.language,
          this@CoverageEligibilityResponseSurrogate._language,
        )
      text = this@CoverageEligibilityResponseSurrogate.text
      contained = this@CoverageEligibilityResponseSurrogate.contained
      extension = this@CoverageEligibilityResponseSurrogate.extension
      modifierExtension = this@CoverageEligibilityResponseSurrogate.modifierExtension
      identifier = this@CoverageEligibilityResponseSurrogate.identifier
      status =
        Enumeration.of(
          this@CoverageEligibilityResponseSurrogate.status?.let {
            com.google.fhir.model.r5.CoverageEligibilityResponse.EligibilityResponseStatus.fromCode(
              it
            )
          },
          this@CoverageEligibilityResponseSurrogate._status,
        )
      purpose =
        if (
          this@CoverageEligibilityResponseSurrogate.purpose == null &&
            this@CoverageEligibilityResponseSurrogate._purpose == null
        ) {
          null
        } else {
          (this@CoverageEligibilityResponseSurrogate.purpose
              ?: List(this@CoverageEligibilityResponseSurrogate._purpose!!.size) { null })
            .zip(
              this@CoverageEligibilityResponseSurrogate._purpose
                ?: List(this@CoverageEligibilityResponseSurrogate.purpose!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let {
                  com.google.fhir.model.r5.CoverageEligibilityResponse.EligibilityResponsePurpose
                    .fromCode(it)
                },
                element,
              )
            }
        }
      patient = this@CoverageEligibilityResponseSurrogate.patient
      event = this@CoverageEligibilityResponseSurrogate.event
      serviced =
        CoverageEligibilityResponse.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@CoverageEligibilityResponseSurrogate.servicedDate),
            this@CoverageEligibilityResponseSurrogate._servicedDate,
          ),
          this@CoverageEligibilityResponseSurrogate.servicedPeriod,
        )
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CoverageEligibilityResponseSurrogate.created),
          this@CoverageEligibilityResponseSurrogate._created,
        )
      requestor = this@CoverageEligibilityResponseSurrogate.requestor
      request = this@CoverageEligibilityResponseSurrogate.request
      outcome =
        Enumeration.of(
          this@CoverageEligibilityResponseSurrogate.outcome?.let {
            com.google.fhir.model.r5.CoverageEligibilityResponse.EligibilityOutcome.fromCode(it)
          },
          this@CoverageEligibilityResponseSurrogate._outcome,
        )
      disposition =
        R5String.of(
          this@CoverageEligibilityResponseSurrogate.disposition,
          this@CoverageEligibilityResponseSurrogate._disposition,
        )
      insurer = this@CoverageEligibilityResponseSurrogate.insurer
      insurance = this@CoverageEligibilityResponseSurrogate.insurance
      preAuthRef =
        R5String.of(
          this@CoverageEligibilityResponseSurrogate.preAuthRef,
          this@CoverageEligibilityResponseSurrogate._preAuthRef,
        )
      form = this@CoverageEligibilityResponseSurrogate.form
      error = this@CoverageEligibilityResponseSurrogate.error
    }

  public companion object {
    public fun fromModel(model: CoverageEligibilityResponse): CoverageEligibilityResponseSurrogate =
      with(model) {
        CoverageEligibilityResponseSurrogate().apply {
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
          purpose =
            this@with.purpose?.map { it?.value?.getCode() }?.takeUnless { it.all { it == null } }
          _purpose =
            this@with.purpose?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          patient = this@with.patient
          event = this@with.event
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString()
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement()
          servicedPeriod = this@with.serviced?.asPeriod()?.value
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          requestor = this@with.requestor
          request = this@with.request
          outcome = this@with.outcome?.value?.getCode()
          _outcome = this@with.outcome?.toElement()
          disposition = this@with.disposition?.value
          _disposition = this@with.disposition?.toElement()
          insurer = this@with.insurer
          insurance = this@with.insurance
          preAuthRef = this@with.preAuthRef?.value
          _preAuthRef = this@with.preAuthRef?.toElement()
          form = this@with.form
          error = this@with.error
        }
      }
  }
}
