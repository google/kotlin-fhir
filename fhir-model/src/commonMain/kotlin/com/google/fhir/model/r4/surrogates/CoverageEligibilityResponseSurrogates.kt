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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.CoverageEligibilityResponse
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
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
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.UnsignedInt
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CoverageEligibilityResponseInsuranceItemBenefitSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
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
    CoverageEligibilityResponse.Insurance.Item.Benefit(
      id = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.id,
      extension =
        this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.type,
      allowed =
        CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed?.from(
          UnsignedInt.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowedUnsignedInt,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._allowedUnsignedInt,
          ),
          R4String.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowedString,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._allowedString,
          ),
          this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.allowedMoney,
        ),
      used =
        CoverageEligibilityResponse.Insurance.Item.Benefit.Used?.from(
          UnsignedInt.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.usedUnsignedInt,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._usedUnsignedInt,
          ),
          R4String.of(
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.usedString,
            this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate._usedString,
          ),
          this@CoverageEligibilityResponseInsuranceItemBenefitSurrogate.usedMoney,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance.Item.Benefit
    ): CoverageEligibilityResponseInsuranceItemBenefitSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceItemBenefitSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          allowedUnsignedInt = this@with.allowed?.asUnsignedInt()?.value?.value,
          _allowedUnsignedInt = this@with.allowed?.asUnsignedInt()?.value?.toElement(),
          allowedString = this@with.allowed?.asString()?.value?.value,
          _allowedString = this@with.allowed?.asString()?.value?.toElement(),
          allowedMoney = this@with.allowed?.asMoney()?.value,
          usedUnsignedInt = this@with.used?.asUnsignedInt()?.value?.value,
          _usedUnsignedInt = this@with.used?.asUnsignedInt()?.value?.toElement(),
          usedString = this@with.used?.asString()?.value?.value,
          _usedString = this@with.used?.asString()?.value?.toElement(),
          usedMoney = this@with.used?.asMoney()?.value,
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseInsuranceItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
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
  public var benefit: MutableList<CoverageEligibilityResponse.Insurance.Item.Benefit>? = null,
  public var authorizationRequired: KotlinBoolean? = null,
  public var _authorizationRequired: Element? = null,
  public var authorizationSupporting: MutableList<CodeableConcept>? = null,
  public var authorizationUrl: KotlinString? = null,
  public var _authorizationUrl: Element? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Insurance.Item =
    CoverageEligibilityResponse.Insurance.Item(
      id = this@CoverageEligibilityResponseInsuranceItemSurrogate.id,
      extension =
        this@CoverageEligibilityResponseInsuranceItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityResponseInsuranceItemSurrogate.modifierExtension ?: mutableListOf(),
      category = this@CoverageEligibilityResponseInsuranceItemSurrogate.category,
      productOrService = this@CoverageEligibilityResponseInsuranceItemSurrogate.productOrService,
      modifier = this@CoverageEligibilityResponseInsuranceItemSurrogate.modifier ?: mutableListOf(),
      provider = this@CoverageEligibilityResponseInsuranceItemSurrogate.provider,
      excluded =
        R4Boolean.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.excluded,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._excluded,
        ),
      name =
        R4String.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.name,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._name,
        ),
      description =
        R4String.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.description,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._description,
        ),
      network = this@CoverageEligibilityResponseInsuranceItemSurrogate.network,
      unit = this@CoverageEligibilityResponseInsuranceItemSurrogate.unit,
      term = this@CoverageEligibilityResponseInsuranceItemSurrogate.term,
      benefit = this@CoverageEligibilityResponseInsuranceItemSurrogate.benefit ?: mutableListOf(),
      authorizationRequired =
        R4Boolean.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.authorizationRequired,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._authorizationRequired,
        ),
      authorizationSupporting =
        this@CoverageEligibilityResponseInsuranceItemSurrogate.authorizationSupporting
          ?: mutableListOf(),
      authorizationUrl =
        Uri.of(
          this@CoverageEligibilityResponseInsuranceItemSurrogate.authorizationUrl,
          this@CoverageEligibilityResponseInsuranceItemSurrogate._authorizationUrl,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance.Item
    ): CoverageEligibilityResponseInsuranceItemSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          productOrService = this@with.productOrService,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          provider = this@with.provider,
          excluded = this@with.excluded?.value,
          _excluded = this@with.excluded?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          network = this@with.network,
          unit = this@with.unit,
          term = this@with.term,
          benefit = this@with.benefit.takeUnless { it.all { it == null } },
          authorizationRequired = this@with.authorizationRequired?.value,
          _authorizationRequired = this@with.authorizationRequired?.toElement(),
          authorizationSupporting =
            this@with.authorizationSupporting.takeUnless { it.all { it == null } },
          authorizationUrl = this@with.authorizationUrl?.value,
          _authorizationUrl = this@with.authorizationUrl?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var coverage: Reference,
  public var inforce: KotlinBoolean? = null,
  public var _inforce: Element? = null,
  public var benefitPeriod: Period? = null,
  public var item: MutableList<CoverageEligibilityResponse.Insurance.Item>? = null,
) {
  public fun toModel(): CoverageEligibilityResponse.Insurance =
    CoverageEligibilityResponse.Insurance(
      id = this@CoverageEligibilityResponseInsuranceSurrogate.id,
      extension = this@CoverageEligibilityResponseInsuranceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityResponseInsuranceSurrogate.modifierExtension ?: mutableListOf(),
      coverage = this@CoverageEligibilityResponseInsuranceSurrogate.coverage,
      inforce =
        R4Boolean.of(
          this@CoverageEligibilityResponseInsuranceSurrogate.inforce,
          this@CoverageEligibilityResponseInsuranceSurrogate._inforce,
        ),
      benefitPeriod = this@CoverageEligibilityResponseInsuranceSurrogate.benefitPeriod,
      item = this@CoverageEligibilityResponseInsuranceSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Insurance
    ): CoverageEligibilityResponseInsuranceSurrogate =
      with(model) {
        CoverageEligibilityResponseInsuranceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          coverage = this@with.coverage,
          inforce = this@with.inforce?.value,
          _inforce = this@with.inforce?.toElement(),
          benefitPeriod = this@with.benefitPeriod,
          item = this@with.item.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CoverageEligibilityResponseErrorSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
) {
  public fun toModel(): CoverageEligibilityResponse.Error =
    CoverageEligibilityResponse.Error(
      id = this@CoverageEligibilityResponseErrorSurrogate.id,
      extension = this@CoverageEligibilityResponseErrorSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityResponseErrorSurrogate.modifierExtension ?: mutableListOf(),
      code = this@CoverageEligibilityResponseErrorSurrogate.code,
    )

  public companion object {
    public fun fromModel(
      model: CoverageEligibilityResponse.Error
    ): CoverageEligibilityResponseErrorSurrogate =
      with(model) {
        CoverageEligibilityResponseErrorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var purpose: MutableList<KotlinString?>? = null,
  public var _purpose: MutableList<Element?>? = null,
  public var patient: Reference,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var requestor: Reference? = null,
  public var request: Reference,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var insurer: Reference,
  public var insurance: MutableList<CoverageEligibilityResponse.Insurance>? = null,
  public var preAuthRef: KotlinString? = null,
  public var _preAuthRef: Element? = null,
  public var form: CodeableConcept? = null,
  public var error: MutableList<CoverageEligibilityResponse.Error>? = null,
) {
  public fun toModel(): CoverageEligibilityResponse =
    CoverageEligibilityResponse(
      id = this@CoverageEligibilityResponseSurrogate.id,
      meta = this@CoverageEligibilityResponseSurrogate.meta,
      implicitRules =
        Uri.of(
          this@CoverageEligibilityResponseSurrogate.implicitRules,
          this@CoverageEligibilityResponseSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@CoverageEligibilityResponseSurrogate.language,
          this@CoverageEligibilityResponseSurrogate._language,
        ),
      text = this@CoverageEligibilityResponseSurrogate.text,
      contained = this@CoverageEligibilityResponseSurrogate.contained ?: mutableListOf(),
      extension = this@CoverageEligibilityResponseSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageEligibilityResponseSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CoverageEligibilityResponseSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.CoverageEligibilityResponse.EligibilityResponseStatus.fromCode(
            this@CoverageEligibilityResponseSurrogate.status!!
          ),
          this@CoverageEligibilityResponseSurrogate._status,
        ),
      purpose =
        if (
          this@CoverageEligibilityResponseSurrogate.purpose == null &&
            this@CoverageEligibilityResponseSurrogate._purpose == null
        ) {
          mutableListOf()
        } else {
          (this@CoverageEligibilityResponseSurrogate.purpose
              ?: List(this@CoverageEligibilityResponseSurrogate._purpose!!.size) { null })
            .zip(
              this@CoverageEligibilityResponseSurrogate._purpose
                ?: List(this@CoverageEligibilityResponseSurrogate.purpose!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r4.CoverageEligibilityResponse.EligibilityResponsePurpose
                    .fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      patient = this@CoverageEligibilityResponseSurrogate.patient,
      serviced =
        CoverageEligibilityResponse.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@CoverageEligibilityResponseSurrogate.servicedDate),
            this@CoverageEligibilityResponseSurrogate._servicedDate,
          ),
          this@CoverageEligibilityResponseSurrogate.servicedPeriod,
        ),
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CoverageEligibilityResponseSurrogate.created),
          this@CoverageEligibilityResponseSurrogate._created,
        )!!,
      requestor = this@CoverageEligibilityResponseSurrogate.requestor,
      request = this@CoverageEligibilityResponseSurrogate.request,
      outcome =
        Enumeration.of(
          com.google.fhir.model.r4.RemittanceOutcome.fromCode(
            this@CoverageEligibilityResponseSurrogate.outcome!!
          ),
          this@CoverageEligibilityResponseSurrogate._outcome,
        ),
      disposition =
        R4String.of(
          this@CoverageEligibilityResponseSurrogate.disposition,
          this@CoverageEligibilityResponseSurrogate._disposition,
        ),
      insurer = this@CoverageEligibilityResponseSurrogate.insurer,
      insurance = this@CoverageEligibilityResponseSurrogate.insurance ?: mutableListOf(),
      preAuthRef =
        R4String.of(
          this@CoverageEligibilityResponseSurrogate.preAuthRef,
          this@CoverageEligibilityResponseSurrogate._preAuthRef,
        ),
      form = this@CoverageEligibilityResponseSurrogate.form,
      error = this@CoverageEligibilityResponseSurrogate.error ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CoverageEligibilityResponse): CoverageEligibilityResponseSurrogate =
      with(model) {
        CoverageEligibilityResponseSurrogate(
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
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString(),
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement(),
          servicedPeriod = this@with.serviced?.asPeriod()?.value,
          created = this@with.created.value?.toString(),
          _created = this@with.created.toElement(),
          requestor = this@with.requestor,
          request = this@with.request,
          outcome = this@with.outcome.value?.getCode(),
          _outcome = this@with.outcome.toElement(),
          disposition = this@with.disposition?.value,
          _disposition = this@with.disposition?.toElement(),
          insurer = this@with.insurer,
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          preAuthRef = this@with.preAuthRef?.value,
          _preAuthRef = this@with.preAuthRef?.toElement(),
          form = this@with.form,
          error = this@with.error.takeUnless { it.all { it == null } },
        )
      }
  }
}
