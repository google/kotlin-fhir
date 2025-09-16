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
import com.google.fhir.model.r4.Coverage
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
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
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CoverageClassSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
) {
  public fun toModel(): Coverage.Class =
    Coverage.Class(
      id = this@CoverageClassSurrogate.id,
      extension = this@CoverageClassSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CoverageClassSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CoverageClassSurrogate.type,
      `value` =
        R4String.of(this@CoverageClassSurrogate.`value`, this@CoverageClassSurrogate._value)!!,
      name = R4String.of(this@CoverageClassSurrogate.name, this@CoverageClassSurrogate._name),
    )

  public companion object {
    public fun fromModel(model: Coverage.Class): CoverageClassSurrogate =
      with(model) {
        CoverageClassSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CoverageCostToBeneficiarySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: Coverage.CostToBeneficiary.Value,
  public var exception: MutableList<Coverage.CostToBeneficiary.Exception>? = null,
) {
  public fun toModel(): Coverage.CostToBeneficiary =
    Coverage.CostToBeneficiary(
      id = this@CoverageCostToBeneficiarySurrogate.id,
      extension = this@CoverageCostToBeneficiarySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageCostToBeneficiarySurrogate.modifierExtension ?: mutableListOf(),
      type = this@CoverageCostToBeneficiarySurrogate.type,
      `value` = this@CoverageCostToBeneficiarySurrogate.`value`,
      exception = this@CoverageCostToBeneficiarySurrogate.exception ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Coverage.CostToBeneficiary): CoverageCostToBeneficiarySurrogate =
      with(model) {
        CoverageCostToBeneficiarySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
          exception = this@with.exception.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CoverageCostToBeneficiaryExceptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var period: Period? = null,
) {
  public fun toModel(): Coverage.CostToBeneficiary.Exception =
    Coverage.CostToBeneficiary.Exception(
      id = this@CoverageCostToBeneficiaryExceptionSurrogate.id,
      extension = this@CoverageCostToBeneficiaryExceptionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CoverageCostToBeneficiaryExceptionSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CoverageCostToBeneficiaryExceptionSurrogate.type,
      period = this@CoverageCostToBeneficiaryExceptionSurrogate.period,
    )

  public companion object {
    public fun fromModel(
      model: Coverage.CostToBeneficiary.Exception
    ): CoverageCostToBeneficiaryExceptionSurrogate =
      with(model) {
        CoverageCostToBeneficiaryExceptionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class CoverageCostToBeneficiaryValueSurrogate(
  public var valueQuantity: Quantity? = null,
  public var valueMoney: Money? = null,
) {
  public fun toModel(): Coverage.CostToBeneficiary.Value =
    Coverage.CostToBeneficiary.Value.from(
      this@CoverageCostToBeneficiaryValueSurrogate.valueQuantity,
      this@CoverageCostToBeneficiaryValueSurrogate.valueMoney,
    )!! !!

  public companion object {
    public fun fromModel(
      model: Coverage.CostToBeneficiary.Value
    ): CoverageCostToBeneficiaryValueSurrogate =
      with(model) {
        CoverageCostToBeneficiaryValueSurrogate(
          valueQuantity = this@with.asQuantity()?.value,
          valueMoney = this@with.asMoney()?.value,
        )
      }
  }
}

@Serializable
internal data class CoverageSurrogate(
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
  public var type: CodeableConcept? = null,
  public var policyHolder: Reference? = null,
  public var subscriber: Reference? = null,
  public var subscriberId: KotlinString? = null,
  public var _subscriberId: Element? = null,
  public var beneficiary: Reference,
  public var dependent: KotlinString? = null,
  public var _dependent: Element? = null,
  public var relationship: CodeableConcept? = null,
  public var period: Period? = null,
  public var payor: MutableList<Reference>? = null,
  public var `class`: MutableList<Coverage.Class>? = null,
  public var order: Int? = null,
  public var _order: Element? = null,
  public var network: KotlinString? = null,
  public var _network: Element? = null,
  public var costToBeneficiary: MutableList<Coverage.CostToBeneficiary>? = null,
  public var subrogation: KotlinBoolean? = null,
  public var _subrogation: Element? = null,
  public var contract: MutableList<Reference>? = null,
) {
  public fun toModel(): Coverage =
    Coverage(
      id = this@CoverageSurrogate.id,
      meta = this@CoverageSurrogate.meta,
      implicitRules =
        Uri.of(this@CoverageSurrogate.implicitRules, this@CoverageSurrogate._implicitRules),
      language = Code.of(this@CoverageSurrogate.language, this@CoverageSurrogate._language),
      text = this@CoverageSurrogate.text,
      contained = this@CoverageSurrogate.contained ?: mutableListOf(),
      extension = this@CoverageSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CoverageSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CoverageSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.Coverage.FinancialResourceStatusCodes.fromCode(
            this@CoverageSurrogate.status!!
          ),
          this@CoverageSurrogate._status,
        ),
      type = this@CoverageSurrogate.type,
      policyHolder = this@CoverageSurrogate.policyHolder,
      subscriber = this@CoverageSurrogate.subscriber,
      subscriberId =
        R4String.of(this@CoverageSurrogate.subscriberId, this@CoverageSurrogate._subscriberId),
      beneficiary = this@CoverageSurrogate.beneficiary,
      dependent = R4String.of(this@CoverageSurrogate.dependent, this@CoverageSurrogate._dependent),
      relationship = this@CoverageSurrogate.relationship,
      period = this@CoverageSurrogate.period,
      payor = this@CoverageSurrogate.payor ?: mutableListOf(),
      `class` = this@CoverageSurrogate.`class` ?: mutableListOf(),
      order = PositiveInt.of(this@CoverageSurrogate.order, this@CoverageSurrogate._order),
      network = R4String.of(this@CoverageSurrogate.network, this@CoverageSurrogate._network),
      costToBeneficiary = this@CoverageSurrogate.costToBeneficiary ?: mutableListOf(),
      subrogation =
        R4Boolean.of(this@CoverageSurrogate.subrogation, this@CoverageSurrogate._subrogation),
      contract = this@CoverageSurrogate.contract ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Coverage): CoverageSurrogate =
      with(model) {
        CoverageSurrogate(
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
          policyHolder = this@with.policyHolder,
          subscriber = this@with.subscriber,
          subscriberId = this@with.subscriberId?.value,
          _subscriberId = this@with.subscriberId?.toElement(),
          beneficiary = this@with.beneficiary,
          dependent = this@with.dependent?.value,
          _dependent = this@with.dependent?.toElement(),
          relationship = this@with.relationship,
          period = this@with.period,
          payor = this@with.payor.takeUnless { it.all { it == null } },
          `class` = this@with.`class`.takeUnless { it.all { it == null } },
          order = this@with.order?.value,
          _order = this@with.order?.toElement(),
          network = this@with.network?.value,
          _network = this@with.network?.toElement(),
          costToBeneficiary = this@with.costToBeneficiary.takeUnless { it.all { it == null } },
          subrogation = this@with.subrogation?.value,
          _subrogation = this@with.subrogation?.toElement(),
          contract = this@with.contract.takeUnless { it.all { it == null } },
        )
      }
  }
}
