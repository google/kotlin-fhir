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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductPharmaceuticalCharacteristicsSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductPharmaceutical.Characteristics =
    MedicinalProductPharmaceutical.Characteristics().apply {
      id = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.id
      extension = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.extension
      modifierExtension =
        this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.modifierExtension
      code = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.code
      status = this@MedicinalProductPharmaceuticalCharacteristicsSurrogate.status
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.Characteristics
    ): MedicinalProductPharmaceuticalCharacteristicsSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalCharacteristicsSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          status = this@with.status
        }
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var tissue: CodeableConcept? = null,
  public var `value`: Quantity? = null,
  public var supportingInformation: KotlinString? = null,
  public var _supportingInformation: Element? = null,
) {
  public fun toModel():
    MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod =
    MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod().apply {
      id =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .id
      extension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .extension
      modifierExtension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .modifierExtension
      tissue =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .tissue
      `value` =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .`value`
      supportingInformation =
        R4String.of(
          this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            .supportingInformation,
          this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            ._supportingInformation,
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
    ): MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate()
          .apply {
            id = this@with.id
            extension = this@with.extension
            modifierExtension = this@with.modifierExtension
            tissue = this@with.tissue
            `value` = this@with.`value`
            supportingInformation = this@with.supportingInformation?.value
            _supportingInformation = this@with.supportingInformation?.toElement()
          }
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var withdrawalPeriod:
    List<MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod>? =
    null,
) {
  public fun toModel(): MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies =
    MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies().apply {
      id = this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate.id
      extension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate.extension
      modifierExtension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate
          .modifierExtension
      code = this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate.code
      withdrawalPeriod =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate
          .withdrawalPeriod
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies
    ): MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          withdrawalPeriod = this@with.withdrawalPeriod
        }
      }
  }
}

@Serializable
internal data class MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var firstDose: Quantity? = null,
  public var maxSingleDose: Quantity? = null,
  public var maxDosePerDay: Quantity? = null,
  public var maxDosePerTreatmentPeriod: Ratio? = null,
  public var maxTreatmentPeriod: Duration? = null,
  public var targetSpecies:
    List<MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies>? =
    null,
) {
  public fun toModel(): MedicinalProductPharmaceutical.RouteOfAdministration =
    MedicinalProductPharmaceutical.RouteOfAdministration().apply {
      id = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.id
      extension = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.extension
      modifierExtension =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.modifierExtension
      code = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.code
      firstDose = this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.firstDose
      maxSingleDose =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxSingleDose
      maxDosePerDay =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxDosePerDay
      maxDosePerTreatmentPeriod =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxDosePerTreatmentPeriod
      maxTreatmentPeriod =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.maxTreatmentPeriod
      targetSpecies =
        this@MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate.targetSpecies
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical.RouteOfAdministration
    ): MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalRouteOfAdministrationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          firstDose = this@with.firstDose
          maxSingleDose = this@with.maxSingleDose
          maxDosePerDay = this@with.maxDosePerDay
          maxDosePerTreatmentPeriod = this@with.maxDosePerTreatmentPeriod
          maxTreatmentPeriod = this@with.maxTreatmentPeriod
          targetSpecies = this@with.targetSpecies
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var administrableDoseForm: CodeableConcept? = null,
  public var unitOfPresentation: CodeableConcept? = null,
  public var ingredient: List<Reference?>? = null,
  public var device: List<Reference?>? = null,
  public var characteristics: List<MedicinalProductPharmaceutical.Characteristics>? = null,
  public var routeOfAdministration: List<MedicinalProductPharmaceutical.RouteOfAdministration>? =
    null,
) {
  public fun toModel(): MedicinalProductPharmaceutical =
    MedicinalProductPharmaceutical().apply {
      id = this@MedicinalProductPharmaceuticalSurrogate.id
      meta = this@MedicinalProductPharmaceuticalSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicinalProductPharmaceuticalSurrogate.implicitRules,
          this@MedicinalProductPharmaceuticalSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicinalProductPharmaceuticalSurrogate.language,
          this@MedicinalProductPharmaceuticalSurrogate._language,
        )
      text = this@MedicinalProductPharmaceuticalSurrogate.text
      contained = this@MedicinalProductPharmaceuticalSurrogate.contained
      extension = this@MedicinalProductPharmaceuticalSurrogate.extension
      modifierExtension = this@MedicinalProductPharmaceuticalSurrogate.modifierExtension
      identifier = this@MedicinalProductPharmaceuticalSurrogate.identifier
      administrableDoseForm = this@MedicinalProductPharmaceuticalSurrogate.administrableDoseForm
      unitOfPresentation = this@MedicinalProductPharmaceuticalSurrogate.unitOfPresentation
      ingredient = this@MedicinalProductPharmaceuticalSurrogate.ingredient
      device = this@MedicinalProductPharmaceuticalSurrogate.device
      characteristics = this@MedicinalProductPharmaceuticalSurrogate.characteristics
      routeOfAdministration = this@MedicinalProductPharmaceuticalSurrogate.routeOfAdministration
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductPharmaceutical
    ): MedicinalProductPharmaceuticalSurrogate =
      with(model) {
        MedicinalProductPharmaceuticalSurrogate().apply {
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
          administrableDoseForm = this@with.administrableDoseForm
          unitOfPresentation = this@with.unitOfPresentation
          ingredient = this@with.ingredient
          device = this@with.device
          characteristics = this@with.characteristics
          routeOfAdministration = this@with.routeOfAdministration
        }
      }
  }
}
