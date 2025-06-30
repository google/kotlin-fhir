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
import com.google.fhir.model.r4b.CoverageEligibilityResponse
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
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.UnsignedInt
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
internal class CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate {
  public var allowedUnsignedInt: Int? = null

  public var _allowedUnsignedInt: Element? = null

  public var allowedString: KotlinString? = null

  public var _allowedString: Element? = null

  public var allowedMoney: Money? = null

  public fun toModel(): CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed =
    CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed?.from(
      UnsignedInt.of(
        this@CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate.allowedUnsignedInt,
        this@CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate._allowedUnsignedInt,
      ),
      R4bString.of(
        this@CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate.allowedString,
        this@CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate._allowedString,
      ),
      this@CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate.allowedMoney,
    ) ?: CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.Null

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed
    ): CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceItemBenefitAllowedSurrogate().apply {
          allowedUnsignedInt = this@with.asUnsignedInt()?.value?.value
          _allowedUnsignedInt = this@with.asUnsignedInt()?.value?.toElement()
          allowedString = this@with.asString()?.value?.value
          _allowedString = this@with.asString()?.value?.toElement()
          allowedMoney = this@with.asMoney()?.value
        }
      }
  }
}

@Serializable
internal class CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate {
  public var usedUnsignedInt: Int? = null

  public var _usedUnsignedInt: Element? = null

  public var usedString: KotlinString? = null

  public var _usedString: Element? = null

  public var usedMoney: Money? = null

  public fun toModel(): CoverageEligibilityResponse.Insurance.Item.Benefit.Used =
    CoverageEligibilityResponse.Insurance.Item.Benefit.Used?.from(
      UnsignedInt.of(
        this@CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate.usedUnsignedInt,
        this@CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate._usedUnsignedInt,
      ),
      R4bString.of(
        this@CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate.usedString,
        this@CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate._usedString,
      ),
      this@CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate.usedMoney,
    ) ?: CoverageEligibilityResponse.Insurance.Item.Benefit.Used.Null

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance.Item.Benefit.Used
    ): CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceItemBenefitUsedSurrogate().apply {
          usedUnsignedInt = this@with.asUnsignedInt()?.value?.value
          _usedUnsignedInt = this@with.asUnsignedInt()?.value?.toElement()
          usedString = this@with.asString()?.value?.value
          _usedString = this@with.asString()?.value?.toElement()
          usedMoney = this@with.asMoney()?.value
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
  public var allowed: CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed? = null,
  public var used: CoverageEligibilityResponse.Insurance.Item.Benefit.Used? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Insurance.Item.Benefit =
    CoverageEligibilityResponse.Insurance.Item.Benefit().apply {
      id = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.id
      extension = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.extension
      modifierExtension =
        this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.modifierExtension
      type = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.type
      allowed = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowed
      used = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.used
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
          allowed = this@with.allowed
          used = this@with.used
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
        R4bBoolean.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.excluded,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._excluded,
        )
      name =
        R4bString.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.name,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._name,
        )
      description =
        R4bString.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.description,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._description,
        )
      network = this@CoverageEligibilityResponseInsuranceItemSurrogate.network
      unit = this@CoverageEligibilityResponseInsuranceItemSurrogate.unit
      term = this@CoverageEligibilityResponseInsuranceItemSurrogate.term
      benefit = this@CoverageEligibilityResponseInsuranceItemSurrogate.benefit
      authorizationRequired =
        R4bBoolean.of(
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
        R4bBoolean.of(
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
) {
  public fun toModel(): CoverageEligibilityResponse.Error =
    CoverageEligibilityResponse.Error().apply {
      id = this@CoverageEligibilityResponseErrorSurrogate.id
      extension = this@CoverageEligibilityResponseErrorSurrogate.extension
      modifierExtension = this@CoverageEligibilityResponseErrorSurrogate.modifierExtension
      code = this@CoverageEligibilityResponseErrorSurrogate.code
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
        }
      }
  }
}

@Serializable
internal class CoverageEligibilityResponseServicedSurrogate {
  public var servicedDate: KotlinString? = null

  public var _servicedDate: Element? = null

  public var servicedPeriod: Period? = null

  public fun toModel(): CoverageEligibilityResponse.Serviced =
    CoverageEligibilityResponse.Serviced?.from(
      Date.of(
        FhirDate.fromString(this@CoverageEligibilityResponseServicedSurrogate.servicedDate),
        this@CoverageEligibilityResponseServicedSurrogate._servicedDate,
      ),
      this@CoverageEligibilityResponseServicedSurrogate.servicedPeriod,
    ) ?: CoverageEligibilityResponse.Serviced.Null

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Serviced
    ): CoverageEligibilityResponseServicedSurrogate =
      with(model) {
        CoverageEligibilityResponseServicedSurrogate().apply {
          servicedDate = this@with.asDate()?.value?.value?.toString()
          _servicedDate = this@with.asDate()?.value?.toElement()
          servicedPeriod = this@with.asPeriod()?.value
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
  public var serviced: CoverageEligibilityResponse.Serviced? = null,
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
            com.google.fhir.model.r4b.CoverageEligibilityResponse.EligibilityResponseStatus
              .fromCode(it)
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
                  com.google.fhir.model.r4b.CoverageEligibilityResponse.EligibilityResponsePurpose
                    .fromCode(it)
                },
                element,
              )
            }
        }
      patient = this@CoverageEligibilityResponseSurrogate.patient
      serviced = this@CoverageEligibilityResponseSurrogate.serviced
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
            com.google.fhir.model.r4b.RemittanceOutcome.fromCode(it)
          },
          this@CoverageEligibilityResponseSurrogate._outcome,
        )
      disposition =
        R4bString.of(
          this@CoverageEligibilityResponseSurrogate.disposition,
          this@CoverageEligibilityResponseSurrogate._disposition,
        )
      insurer = this@CoverageEligibilityResponseSurrogate.insurer
      insurance = this@CoverageEligibilityResponseSurrogate.insurance
      preAuthRef =
        R4bString.of(
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
          serviced = this@with.serviced
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
