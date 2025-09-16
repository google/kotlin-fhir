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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.MedicinalProductPharmaceutical
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductPharmaceuticalCharacteristicsSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var status: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductPharmaceutical.Characteristics =
    MedicinalProductPharmaceutical.Characteristics(
      id = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.id,
      extension =
        this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.modifierExtension
          ?: mutableListOf(),
      code = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.code,
      status = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.status,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.Characteristics
    ): MedicinalProductPharmaceuticalCharacteristicsSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalCharacteristicsSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          status = this@with.status,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var firstDose: Quantity? = null,
  public var maxSingleDose: Quantity? = null,
  public var maxDosePerDay: Quantity? = null,
  public var maxDosePerTreatmentPeriod: Ratio? = null,
  public var maxTreatmentPeriod: Duration? = null,
  public var targetSpecies:
    MutableList<MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies>? =
    null,
) {
  public fun toModel(): MedicinalProductPharmaceutical.RouteOfAdministration =
    MedicinalProductPharmaceutical.RouteOfAdministration(
      id = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.id,
      extension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.modifierExtension
          ?: mutableListOf(),
      code = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.code,
      firstDose = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.firstDose,
      maxSingleDose =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxSingleDose,
      maxDosePerDay =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxDosePerDay,
      maxDosePerTreatmentPeriod =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxDosePerTreatmentPeriod,
      maxTreatmentPeriod =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxTreatmentPeriod,
      targetSpecies =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.targetSpecies
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.RouteOfAdministration
    ): MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          firstDose = this@with.firstDose,
          maxSingleDose = this@with.maxSingleDose,
          maxDosePerDay = this@with.maxDosePerDay,
          maxDosePerTreatmentPeriod = this@with.maxDosePerTreatmentPeriod,
          maxTreatmentPeriod = this@with.maxTreatmentPeriod,
          targetSpecies = this@with.targetSpecies.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var withdrawalPeriod:
    MutableList<
      MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
    >? =
    null,
) {
  public fun toModel(): MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies =
    MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies(
      id = this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate.id,
      extension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate
          .modifierExtension ?: mutableListOf(),
      code = this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate.code,
      withdrawalPeriod =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate
          .withdrawalPeriod ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies
    ): MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          withdrawalPeriod = this@with.withdrawalPeriod.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var tissue: CodeableConcept,
  public var `value`: Quantity,
  public var supportingInformation: KotlinString? = null,
  public var _supportingInformation: Element? = null,
) {
  public fun toModel():
    MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod =
    MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod(
      id =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .id,
      extension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .modifierExtension ?: mutableListOf(),
      tissue =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .tissue,
      `value` =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .`value`,
      supportingInformation =
        R4String.of(
          this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            .supportingInformation,
          this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            ._supportingInformation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
    ): MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          tissue = this@with.tissue,
          `value` = this@with.`value`,
          supportingInformation = this@with.supportingInformation?.value,
          _supportingInformation = this@with.supportingInformation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalSurrogate(
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
  public var administrableDoseForm: CodeableConcept,
  public var unitOfPresentation: CodeableConcept? = null,
  public var ingredient: MutableList<Reference>? = null,
  public var device: MutableList<Reference>? = null,
  public var characteristics: MutableList<MedicinalProductPharmaceutical.Characteristics>? = null,
  public var routeOfAdministration:
    MutableList<MedicinalProductPharmaceutical.RouteOfAdministration>? =
    null,
) {
  public fun toModel(): MedicinalProductPharmaceutical =
    MedicinalProductPharmaceutical(
      id = this@MedicinalProductPharmaceuticalSurrogate.id,
      meta = this@MedicinalProductPharmaceuticalSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicinalProductPharmaceuticalSurrogate.implicitRules,
          this@MedicinalProductPharmaceuticalSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicinalProductPharmaceuticalSurrogate.language,
          this@MedicinalProductPharmaceuticalSurrogate._language,
        ),
      text = this@MedicinalProductPharmaceuticalSurrogate.text,
      contained = this@MedicinalProductPharmaceuticalSurrogate.contained ?: mutableListOf(),
      extension = this@MedicinalProductPharmaceuticalSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPharmaceuticalSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductPharmaceuticalSurrogate.identifier ?: mutableListOf(),
      administrableDoseForm = this@MedicinalProductPharmaceuticalSurrogate.administrableDoseForm,
      unitOfPresentation = this@MedicinalProductPharmaceuticalSurrogate.unitOfPresentation,
      ingredient = this@MedicinalProductPharmaceuticalSurrogate.ingredient ?: mutableListOf(),
      device = this@MedicinalProductPharmaceuticalSurrogate.device ?: mutableListOf(),
      characteristics =
        this@MedicinalProductPharmaceuticalSurrogate.characteristics ?: mutableListOf(),
      routeOfAdministration =
        this@MedicinalProductPharmaceuticalSurrogate.routeOfAdministration ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical
    ): MedicinalProductPharmaceuticalSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalSurrogate(
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
          administrableDoseForm = this@with.administrableDoseForm,
          unitOfPresentation = this@with.unitOfPresentation,
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          device = this@with.device.takeUnless { it.all { it == null } },
          characteristics = this@with.characteristics.takeUnless { it.all { it == null } },
          routeOfAdministration =
            this@with.routeOfAdministration.takeUnless { it.all { it == null } },
        )
      }
  }
}
