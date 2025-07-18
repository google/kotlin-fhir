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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.InsurancePlan
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
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class InsurancePlanCoverageBenefitLimitSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `value`: Quantity? = null,
  public var code: CodeableConcept? = null,
) {
  public fun toModel(): InsurancePlan.Coverage.Benefit.Limit =
    InsurancePlan.Coverage.Benefit.Limit(
      id = this@InsurancePlanCoverageBenefitLimitSurrogate.id,
      extension = this@InsurancePlanCoverageBenefitLimitSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InsurancePlanCoverageBenefitLimitSurrogate.modifierExtension ?: mutableListOf(),
      `value` = this@InsurancePlanCoverageBenefitLimitSurrogate.`value`,
      code = this@InsurancePlanCoverageBenefitLimitSurrogate.code,
    )

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Coverage.Benefit.Limit
    ): InsurancePlanCoverageBenefitLimitSurrogate =
      with(model) {
        InsurancePlanCoverageBenefitLimitSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
          code = this@with.code,
        )
      }
  }
}

@Serializable
internal data class InsurancePlanCoverageBenefitSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var requirement: KotlinString? = null,
  public var _requirement: Element? = null,
  public var limit: MutableList<InsurancePlan.Coverage.Benefit.Limit>? = null,
) {
  public fun toModel(): InsurancePlan.Coverage.Benefit =
    InsurancePlan.Coverage.Benefit(
      id = this@InsurancePlanCoverageBenefitSurrogate.id,
      extension = this@InsurancePlanCoverageBenefitSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InsurancePlanCoverageBenefitSurrogate.modifierExtension ?: mutableListOf(),
      type = this@InsurancePlanCoverageBenefitSurrogate.type,
      requirement =
        R5String.of(
          this@InsurancePlanCoverageBenefitSurrogate.requirement,
          this@InsurancePlanCoverageBenefitSurrogate._requirement,
        ),
      limit = this@InsurancePlanCoverageBenefitSurrogate.limit ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Coverage.Benefit
    ): InsurancePlanCoverageBenefitSurrogate =
      with(model) {
        InsurancePlanCoverageBenefitSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          requirement = this@with.requirement?.value,
          _requirement = this@with.requirement?.toElement(),
          limit = this@with.limit.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class InsurancePlanCoverageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var network: MutableList<Reference>? = null,
  public var benefit: MutableList<InsurancePlan.Coverage.Benefit>? = null,
) {
  public fun toModel(): InsurancePlan.Coverage =
    InsurancePlan.Coverage(
      id = this@InsurancePlanCoverageSurrogate.id,
      extension = this@InsurancePlanCoverageSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InsurancePlanCoverageSurrogate.modifierExtension ?: mutableListOf(),
      type = this@InsurancePlanCoverageSurrogate.type,
      network = this@InsurancePlanCoverageSurrogate.network ?: mutableListOf(),
      benefit = this@InsurancePlanCoverageSurrogate.benefit ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: InsurancePlan.Coverage): InsurancePlanCoverageSurrogate =
      with(model) {
        InsurancePlanCoverageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          network = this@with.network.takeUnless { it.all { it == null } },
          benefit = this@with.benefit.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class InsurancePlanPlanGeneralCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var groupSize: Int? = null,
  public var _groupSize: Element? = null,
  public var cost: Money? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): InsurancePlan.Plan.GeneralCost =
    InsurancePlan.Plan.GeneralCost(
      id = this@InsurancePlanPlanGeneralCostSurrogate.id,
      extension = this@InsurancePlanPlanGeneralCostSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InsurancePlanPlanGeneralCostSurrogate.modifierExtension ?: mutableListOf(),
      type = this@InsurancePlanPlanGeneralCostSurrogate.type,
      groupSize =
        PositiveInt.of(
          this@InsurancePlanPlanGeneralCostSurrogate.groupSize,
          this@InsurancePlanPlanGeneralCostSurrogate._groupSize,
        ),
      cost = this@InsurancePlanPlanGeneralCostSurrogate.cost,
      comment =
        R5String.of(
          this@InsurancePlanPlanGeneralCostSurrogate.comment,
          this@InsurancePlanPlanGeneralCostSurrogate._comment,
        ),
    )

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.GeneralCost
    ): InsurancePlanPlanGeneralCostSurrogate =
      with(model) {
        InsurancePlanPlanGeneralCostSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          groupSize = this@with.groupSize?.value,
          _groupSize = this@with.groupSize?.toElement(),
          cost = this@with.cost,
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
        )
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSpecificCostBenefitCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var applicability: CodeableConcept? = null,
  public var qualifiers: MutableList<CodeableConcept>? = null,
  public var `value`: Quantity? = null,
) {
  public fun toModel(): InsurancePlan.Plan.SpecificCost.Benefit.Cost =
    InsurancePlan.Plan.SpecificCost.Benefit.Cost(
      id = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.id,
      extension =
        this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.modifierExtension ?: mutableListOf(),
      type = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.type,
      applicability = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.applicability,
      qualifiers =
        this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.qualifiers ?: mutableListOf(),
      `value` = this@InsurancePlanPlanSpecificCostBenefitCostSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.SpecificCost.Benefit.Cost
    ): InsurancePlanPlanSpecificCostBenefitCostSurrogate =
      with(model) {
        InsurancePlanPlanSpecificCostBenefitCostSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          applicability = this@with.applicability,
          qualifiers = this@with.qualifiers.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSpecificCostBenefitSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var cost: MutableList<InsurancePlan.Plan.SpecificCost.Benefit.Cost>? = null,
) {
  public fun toModel(): InsurancePlan.Plan.SpecificCost.Benefit =
    InsurancePlan.Plan.SpecificCost.Benefit(
      id = this@InsurancePlanPlanSpecificCostBenefitSurrogate.id,
      extension = this@InsurancePlanPlanSpecificCostBenefitSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InsurancePlanPlanSpecificCostBenefitSurrogate.modifierExtension ?: mutableListOf(),
      type = this@InsurancePlanPlanSpecificCostBenefitSurrogate.type,
      cost = this@InsurancePlanPlanSpecificCostBenefitSurrogate.cost ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.SpecificCost.Benefit
    ): InsurancePlanPlanSpecificCostBenefitSurrogate =
      with(model) {
        InsurancePlanPlanSpecificCostBenefitSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          cost = this@with.cost.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSpecificCostSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept,
  public var benefit: MutableList<InsurancePlan.Plan.SpecificCost.Benefit>? = null,
) {
  public fun toModel(): InsurancePlan.Plan.SpecificCost =
    InsurancePlan.Plan.SpecificCost(
      id = this@InsurancePlanPlanSpecificCostSurrogate.id,
      extension = this@InsurancePlanPlanSpecificCostSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InsurancePlanPlanSpecificCostSurrogate.modifierExtension ?: mutableListOf(),
      category = this@InsurancePlanPlanSpecificCostSurrogate.category,
      benefit = this@InsurancePlanPlanSpecificCostSurrogate.benefit ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: InsurancePlan.Plan.SpecificCost
    ): InsurancePlanPlanSpecificCostSurrogate =
      with(model) {
        InsurancePlanPlanSpecificCostSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          benefit = this@with.benefit.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class InsurancePlanPlanSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var coverageArea: MutableList<Reference>? = null,
  public var network: MutableList<Reference>? = null,
  public var generalCost: MutableList<InsurancePlan.Plan.GeneralCost>? = null,
  public var specificCost: MutableList<InsurancePlan.Plan.SpecificCost>? = null,
) {
  public fun toModel(): InsurancePlan.Plan =
    InsurancePlan.Plan(
      id = this@InsurancePlanPlanSurrogate.id,
      extension = this@InsurancePlanPlanSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InsurancePlanPlanSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@InsurancePlanPlanSurrogate.identifier ?: mutableListOf(),
      type = this@InsurancePlanPlanSurrogate.type,
      coverageArea = this@InsurancePlanPlanSurrogate.coverageArea ?: mutableListOf(),
      network = this@InsurancePlanPlanSurrogate.network ?: mutableListOf(),
      generalCost = this@InsurancePlanPlanSurrogate.generalCost ?: mutableListOf(),
      specificCost = this@InsurancePlanPlanSurrogate.specificCost ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: InsurancePlan.Plan): InsurancePlanPlanSurrogate =
      with(model) {
        InsurancePlanPlanSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          type = this@with.type,
          coverageArea = this@with.coverageArea.takeUnless { it.all { it == null } },
          network = this@with.network.takeUnless { it.all { it == null } },
          generalCost = this@with.generalCost.takeUnless { it.all { it == null } },
          specificCost = this@with.specificCost.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var alias: MutableList<KotlinString?>? = null,
  public var _alias: MutableList<Element?>? = null,
  public var period: Period? = null,
  public var ownedBy: Reference? = null,
  public var administeredBy: Reference? = null,
  public var coverageArea: MutableList<Reference>? = null,
  public var contact: MutableList<ExtendedContactDetail>? = null,
  public var endpoint: MutableList<Reference>? = null,
  public var network: MutableList<Reference>? = null,
  public var coverage: MutableList<InsurancePlan.Coverage>? = null,
  public var plan: MutableList<InsurancePlan.Plan>? = null,
) {
  public fun toModel(): InsurancePlan =
    InsurancePlan(
      id = this@InsurancePlanSurrogate.id,
      meta = this@InsurancePlanSurrogate.meta,
      implicitRules =
        Uri.of(
          this@InsurancePlanSurrogate.implicitRules,
          this@InsurancePlanSurrogate._implicitRules,
        ),
      language =
        Code.of(this@InsurancePlanSurrogate.language, this@InsurancePlanSurrogate._language),
      text = this@InsurancePlanSurrogate.text,
      contained = this@InsurancePlanSurrogate.contained ?: mutableListOf(),
      extension = this@InsurancePlanSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InsurancePlanSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@InsurancePlanSurrogate.identifier ?: mutableListOf(),
      status =
        this@InsurancePlanSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PublicationStatus.fromCode(it!!),
            this@InsurancePlanSurrogate._status,
          )
        },
      type = this@InsurancePlanSurrogate.type ?: mutableListOf(),
      name = R5String.of(this@InsurancePlanSurrogate.name, this@InsurancePlanSurrogate._name),
      alias =
        if (
          this@InsurancePlanSurrogate.alias == null && this@InsurancePlanSurrogate._alias == null
        ) {
          mutableListOf()
        } else {
          (this@InsurancePlanSurrogate.alias
              ?: List(this@InsurancePlanSurrogate._alias!!.size) { null })
            .zip(
              this@InsurancePlanSurrogate._alias
                ?: List(this@InsurancePlanSurrogate.alias!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      period = this@InsurancePlanSurrogate.period,
      ownedBy = this@InsurancePlanSurrogate.ownedBy,
      administeredBy = this@InsurancePlanSurrogate.administeredBy,
      coverageArea = this@InsurancePlanSurrogate.coverageArea ?: mutableListOf(),
      contact = this@InsurancePlanSurrogate.contact ?: mutableListOf(),
      endpoint = this@InsurancePlanSurrogate.endpoint ?: mutableListOf(),
      network = this@InsurancePlanSurrogate.network ?: mutableListOf(),
      coverage = this@InsurancePlanSurrogate.coverage ?: mutableListOf(),
      plan = this@InsurancePlanSurrogate.plan ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: InsurancePlan): InsurancePlanSurrogate =
      with(model) {
        InsurancePlanSurrogate(
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
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          type = this@with.type.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          alias =
            this@with.alias.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _alias =
            this@with.alias
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          period = this@with.period,
          ownedBy = this@with.ownedBy,
          administeredBy = this@with.administeredBy,
          coverageArea = this@with.coverageArea.takeUnless { it.all { it == null } },
          contact = this@with.contact.takeUnless { it.all { it == null } },
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
          network = this@with.network.takeUnless { it.all { it == null } },
          coverage = this@with.coverage.takeUnless { it.all { it == null } },
          plan = this@with.plan.takeUnless { it.all { it == null } },
        )
      }
  }
}
