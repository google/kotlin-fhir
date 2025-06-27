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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.HumanName
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.InsurancePlan
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
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class InsurancePlanContactSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var purpose: CodeableConcept? = null,
  public var name: HumanName? = null,
  public var telecom: List<ContactPoint?>? = null,
  public var address: Address? = null,
) {
  public fun toModel(): InsurancePlan.Contact =
    InsurancePlan.Contact().apply {
      id = this@InsurancePlanContactSurrogate.id
      extension = this@InsurancePlanContactSurrogate.extension
      modifierExtension = this@InsurancePlanContactSurrogate.modifierExtension
      purpose = this@InsurancePlanContactSurrogate.purpose
      name = this@InsurancePlanContactSurrogate.name
      telecom = this@InsurancePlanContactSurrogate.telecom
      address = this@InsurancePlanContactSurrogate.address
    }

  public companion object {
    public fun fromModel(model: InsurancePlan.Contact): InsurancePlanContactSurrogate =
      with(model) {
        InsurancePlanContactSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          purpose = this@with.purpose
          name = this@with.name
          telecom = this@with.telecom
          address = this@with.address
        }
      }
  }
}

@Serializable
internal data class InsurancePlanCoverageBenefitLimitSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `value`: Quantity? = null,
  public var code: CodeableConcept? = null,
) {
  public fun toModel(): InsurancePlan.Coverage.Benefit.Limit =
    InsurancePlan.Coverage.Benefit.Limit().apply {
      id = this@InsurancePlanCoverageBenefitLimitSurrogate.id
      extension = this@InsurancePlanCoverageBenefitLimitSurrogate.extension
      modifierExtension = this@InsurancePlanCoverageBenefitLimitSurrogate.modifierExtension
      `value` = this@InsurancePlanCoverageBenefitLimitSurrogate.`value`
      code = this@InsurancePlanCoverageBenefitLimitSurrogate.code
    }

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Coverage.Benefit.Limit
    ): InsurancePlanCoverageBenefitLimitSurrogate =
      with(model) {
        InsurancePlanCoverageBenefitLimitSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `value` = this@with.`value`
          code = this@with.code
        }
      }
  }
}

@Serializable
internal data class InsurancePlanCoverageBenefitSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var requirement: KotlinString? = null,
  public var _requirement: Element? = null,
  public var limit: List<InsurancePlan.Coverage.Benefit.Limit>? = null,
) {
  public fun toModel(): InsurancePlan.Coverage.Benefit =
    InsurancePlan.Coverage.Benefit().apply {
      id = this@InsurancePlanCoverageBenefitSurrogate.id
      extension = this@InsurancePlanCoverageBenefitSurrogate.extension
      modifierExtension = this@InsurancePlanCoverageBenefitSurrogate.modifierExtension
      type = this@InsurancePlanCoverageBenefitSurrogate.type
      requirement =
        R4bString.of(
          this@InsurancePlanCoverageBenefitSurrogate.requirement,
          this@InsurancePlanCoverageBenefitSurrogate._requirement,
        )
      limit = this@InsurancePlanCoverageBenefitSurrogate.limit
    }

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Coverage.Benefit
    ): InsurancePlanCoverageBenefitSurrogate =
      with(model) {
        InsurancePlanCoverageBenefitSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          requirement = this@with.requirement?.value
          _requirement = this@with.requirement?.toElement()
          limit = this@with.limit
        }
      }
  }
}

@Serializable
internal data class InsurancePlanCoverageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var network: List<Reference?>? = null,
  public var benefit: List<InsurancePlan.Coverage.Benefit>? = null,
) {
  public fun toModel(): InsurancePlan.Coverage =
    InsurancePlan.Coverage().apply {
      id = this@InsurancePlanCoverageSurrogate.id
      extension = this@InsurancePlanCoverageSurrogate.extension
      modifierExtension = this@InsurancePlanCoverageSurrogate.modifierExtension
      type = this@InsurancePlanCoverageSurrogate.type
      network = this@InsurancePlanCoverageSurrogate.network
      benefit = this@InsurancePlanCoverageSurrogate.benefit
    }

  public companion object {
    public fun fromModel(model: InsurancePlan.Coverage): InsurancePlanCoverageSurrogate =
      with(model) {
        InsurancePlanCoverageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          network = this@with.network
          benefit = this@with.benefit
        }
      }
  }
}

@Serializable
internal data class InsurancePlanPlanGeneralCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var groupSize: Int? = null,
  public var _groupSize: Element? = null,
  public var cost: Money? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): InsurancePlan.Plan.GeneralCost =
    InsurancePlan.Plan.GeneralCost().apply {
      id = this@InsurancePlanPlanGeneralCostSurrogate.id
      extension = this@InsurancePlanPlanGeneralCostSurrogate.extension
      modifierExtension = this@InsurancePlanPlanGeneralCostSurrogate.modifierExtension
      type = this@InsurancePlanPlanGeneralCostSurrogate.type
      groupSize =
        PositiveInt.of(
          this@InsurancePlanPlanGeneralCostSurrogate.groupSize,
          this@InsurancePlanPlanGeneralCostSurrogate._groupSize,
        )
      cost = this@InsurancePlanPlanGeneralCostSurrogate.cost
      comment =
        R4bString.of(
          this@InsurancePlanPlanGeneralCostSurrogate.comment,
          this@InsurancePlanPlanGeneralCostSurrogate._comment,
        )
    }

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.GeneralCost
    ): InsurancePlanPlanGeneralCostSurrogate =
      with(model) {
        InsurancePlanPlanGeneralCostSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          groupSize = this@with.groupSize?.value
          _groupSize = this@with.groupSize?.toElement()
          cost = this@with.cost
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
        }
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSpecificCostBenefitCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var applicability: CodeableConcept? = null,
  public var qualifiers: List<CodeableConcept?>? = null,
  public var `value`: Quantity? = null,
) {
  public fun toModel(): InsurancePlan.Plan.SpecificCost.Benefit.Cost =
    InsurancePlan.Plan.SpecificCost.Benefit.Cost().apply {
      id = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.id
      extension = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.extension
      modifierExtension = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.modifierExtension
      type = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.type
      applicability = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.applicability
      qualifiers = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.qualifiers
      `value` = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.SpecificCost.Benefit.Cost
    ): InsurancePlanPlanSpecificCostBenefitCostSurrogate =
      with(model) {
        InsurancePlanPlanSpecificCostBenefitCostSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          applicability = this@with.applicability
          qualifiers = this@with.qualifiers
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSpecificCostBenefitSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var cost: List<InsurancePlan.Plan.SpecificCost.Benefit.Cost>? = null,
) {
  public fun toModel(): InsurancePlan.Plan.SpecificCost.Benefit =
    InsurancePlan.Plan.SpecificCost.Benefit().apply {
      id = this@InsurancePlanPlanSpecificCostBenefitSurrogate.id
      extension = this@InsurancePlanPlanSpecificCostBenefitSurrogate.extension
      modifierExtension = this@InsurancePlanPlanSpecificCostBenefitSurrogate.modifierExtension
      type = this@InsurancePlanPlanSpecificCostBenefitSurrogate.type
      cost = this@InsurancePlanPlanSpecificCostBenefitSurrogate.cost
    }

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.SpecificCost.Benefit
    ): InsurancePlanPlanSpecificCostBenefitSurrogate =
      with(model) {
        InsurancePlanPlanSpecificCostBenefitSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          cost = this@with.cost
        }
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSpecificCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var benefit: List<InsurancePlan.Plan.SpecificCost.Benefit>? = null,
) {
  public fun toModel(): InsurancePlan.Plan.SpecificCost =
    InsurancePlan.Plan.SpecificCost().apply {
      id = this@InsurancePlanPlanSpecificCostSurrogate.id
      extension = this@InsurancePlanPlanSpecificCostSurrogate.extension
      modifierExtension = this@InsurancePlanPlanSpecificCostSurrogate.modifierExtension
      category = this@InsurancePlanPlanSpecificCostSurrogate.category
      benefit = this@InsurancePlanPlanSpecificCostSurrogate.benefit
    }

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.SpecificCost
    ): InsurancePlanPlanSpecificCostSurrogate =
      with(model) {
        InsurancePlanPlanSpecificCostSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          benefit = this@with.benefit
        }
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: CodeableConcept? = null,
  public var coverageArea: List<Reference?>? = null,
  public var network: List<Reference?>? = null,
  public var generalCost: List<InsurancePlan.Plan.GeneralCost>? = null,
  public var specificCost: List<InsurancePlan.Plan.SpecificCost>? = null,
) {
  public fun toModel(): InsurancePlan.Plan =
    InsurancePlan.Plan().apply {
      id = this@InsurancePlanPlanSurrogate.id
      extension = this@InsurancePlanPlanSurrogate.extension
      modifierExtension = this@InsurancePlanPlanSurrogate.modifierExtension
      identifier = this@InsurancePlanPlanSurrogate.identifier
      type = this@InsurancePlanPlanSurrogate.type
      coverageArea = this@InsurancePlanPlanSurrogate.coverageArea
      network = this@InsurancePlanPlanSurrogate.network
      generalCost = this@InsurancePlanPlanSurrogate.generalCost
      specificCost = this@InsurancePlanPlanSurrogate.specificCost
    }

  public companion object {
    public fun fromModel(model: InsurancePlan.Plan): InsurancePlanPlanSurrogate =
      with(model) {
        InsurancePlanPlanSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          type = this@with.type
          coverageArea = this@with.coverageArea
          network = this@with.network
          generalCost = this@with.generalCost
          specificCost = this@with.specificCost
        }
      }
  }
}

@Serializable
internal data class InsurancePlanSurrogate(
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
  public var type: List<CodeableConcept?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var alias: List<KotlinString?>? = null,
  public var _alias: List<Element?>? = null,
  public var period: Period? = null,
  public var ownedBy: Reference? = null,
  public var administeredBy: Reference? = null,
  public var coverageArea: List<Reference?>? = null,
  public var contact: List<InsurancePlan.Contact>? = null,
  public var endpoint: List<Reference?>? = null,
  public var network: List<Reference?>? = null,
  public var coverage: List<InsurancePlan.Coverage>? = null,
  public var plan: List<InsurancePlan.Plan>? = null,
) {
  public fun toModel(): InsurancePlan =
    InsurancePlan().apply {
      id = this@InsurancePlanSurrogate.id
      meta = this@InsurancePlanSurrogate.meta
      implicitRules =
        Uri.of(
          this@InsurancePlanSurrogate.implicitRules,
          this@InsurancePlanSurrogate._implicitRules,
        )
      language =
        Code.of(this@InsurancePlanSurrogate.language, this@InsurancePlanSurrogate._language)
      text = this@InsurancePlanSurrogate.text
      contained = this@InsurancePlanSurrogate.contained
      extension = this@InsurancePlanSurrogate.extension
      modifierExtension = this@InsurancePlanSurrogate.modifierExtension
      identifier = this@InsurancePlanSurrogate.identifier
      status =
        Enumeration.of(
          this@InsurancePlanSurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@InsurancePlanSurrogate._status,
        )
      type = this@InsurancePlanSurrogate.type
      name = R4bString.of(this@InsurancePlanSurrogate.name, this@InsurancePlanSurrogate._name)
      alias =
        if (
          this@InsurancePlanSurrogate.alias == null && this@InsurancePlanSurrogate._alias == null
        ) {
          null
        } else {
          (this@InsurancePlanSurrogate.alias
              ?: List(this@InsurancePlanSurrogate._alias!!.size) { null })
            .zip(
              this@InsurancePlanSurrogate._alias
                ?: List(this@InsurancePlanSurrogate.alias!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      period = this@InsurancePlanSurrogate.period
      ownedBy = this@InsurancePlanSurrogate.ownedBy
      administeredBy = this@InsurancePlanSurrogate.administeredBy
      coverageArea = this@InsurancePlanSurrogate.coverageArea
      contact = this@InsurancePlanSurrogate.contact
      endpoint = this@InsurancePlanSurrogate.endpoint
      network = this@InsurancePlanSurrogate.network
      coverage = this@InsurancePlanSurrogate.coverage
      plan = this@InsurancePlanSurrogate.plan
    }

  public companion object {
    public fun fromModel(model: InsurancePlan): InsurancePlanSurrogate =
      with(model) {
        InsurancePlanSurrogate().apply {
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
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          alias = this@with.alias?.map { it?.value }?.takeUnless { it.all { it == null } }
          _alias = this@with.alias?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          period = this@with.period
          ownedBy = this@with.ownedBy
          administeredBy = this@with.administeredBy
          coverageArea = this@with.coverageArea
          contact = this@with.contact
          endpoint = this@with.endpoint
          network = this@with.network
          coverage = this@with.coverage
          plan = this@with.plan
        }
      }
  }
}
