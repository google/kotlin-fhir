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

import com.google.fhir.model.r5.AdministrableProductDefinition
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class AdministrableProductDefinitionPropertyValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueQuantity: Quantity? = null

  public var valueDate: KotlinString? = null

  public var _valueDate: Element? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueMarkdown: KotlinString? = null

  public var _valueMarkdown: Element? = null

  public var valueAttachment: Attachment? = null

  public var valueReference: Reference? = null

  public fun toModel(): AdministrableProductDefinition.Property.Value =
    AdministrableProductDefinition.Property.Value?.from(
      this@AdministrableProductDefinitionPropertyValueSurrogate.valueCodeableConcept,
      this@AdministrableProductDefinitionPropertyValueSurrogate.valueQuantity,
      Date.of(
        FhirDate.fromString(this@AdministrableProductDefinitionPropertyValueSurrogate.valueDate),
        this@AdministrableProductDefinitionPropertyValueSurrogate._valueDate,
      ),
      R5Boolean.of(
        this@AdministrableProductDefinitionPropertyValueSurrogate.valueBoolean,
        this@AdministrableProductDefinitionPropertyValueSurrogate._valueBoolean,
      ),
      Markdown.of(
        this@AdministrableProductDefinitionPropertyValueSurrogate.valueMarkdown,
        this@AdministrableProductDefinitionPropertyValueSurrogate._valueMarkdown,
      ),
      this@AdministrableProductDefinitionPropertyValueSurrogate.valueAttachment,
      this@AdministrableProductDefinitionPropertyValueSurrogate.valueReference,
    ) ?: AdministrableProductDefinition.Property.Value.Null

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.Property.Value
    ): AdministrableProductDefinitionPropertyValueSurrogate =
      with(model) {
        AdministrableProductDefinitionPropertyValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueQuantity = this@with.asQuantity()?.value
          valueDate = this@with.asDate()?.value?.value?.toString()
          _valueDate = this@with.asDate()?.value?.toElement()
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueMarkdown = this@with.asMarkdown()?.value?.value
          _valueMarkdown = this@with.asMarkdown()?.value?.toElement()
          valueAttachment = this@with.asAttachment()?.value
          valueReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class AdministrableProductDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var `value`: AdministrableProductDefinition.Property.Value? = null,
) {
  public fun toModel(): AdministrableProductDefinition.Property =
    AdministrableProductDefinition.Property().apply {
      id = this@AdministrableProductDefinitionPropertySurrogate.id
      extension = this@AdministrableProductDefinitionPropertySurrogate.extension
      modifierExtension = this@AdministrableProductDefinitionPropertySurrogate.modifierExtension
      type = this@AdministrableProductDefinitionPropertySurrogate.type
      `value` = this@AdministrableProductDefinitionPropertySurrogate.`value`
      status = this@AdministrableProductDefinitionPropertySurrogate.status
    }

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.Property
    ): AdministrableProductDefinitionPropertySurrogate =
      with(model) {
        AdministrableProductDefinitionPropertySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`
          status = this@with.status
        }
      }
  }
}

@Serializable
internal data class AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var tissue: CodeableConcept? = null,
  public var `value`: Quantity? = null,
  public var supportingInformation: KotlinString? = null,
  public var _supportingInformation: Element? = null,
) {
  public fun toModel():
    AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod =
    AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod().apply {
      id =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .id
      extension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .extension
      modifierExtension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .modifierExtension
      tissue =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .tissue
      `value` =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .`value`
      supportingInformation =
        R5String.of(
          this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            .supportingInformation,
          this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            ._supportingInformation,
        )
    }

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
    ): AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate =
      with(model) {
        AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate()
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
internal data class AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var withdrawalPeriod:
    List<AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod>? =
    null,
) {
  public fun toModel(): AdministrableProductDefinition.RouteOfAdministration.TargetSpecies =
    AdministrableProductDefinition.RouteOfAdministration.TargetSpecies().apply {
      id = this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.id
      extension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.extension
      modifierExtension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate
          .modifierExtension
      code = this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.code
      withdrawalPeriod =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate
          .withdrawalPeriod
    }

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.RouteOfAdministration.TargetSpecies
    ): AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate =
      with(model) {
        AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate().apply {
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
internal data class AdministrableProductDefinitionRouteOfAdministrationSurrogate(
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
    List<AdministrableProductDefinition.RouteOfAdministration.TargetSpecies>? =
    null,
) {
  public fun toModel(): AdministrableProductDefinition.RouteOfAdministration =
    AdministrableProductDefinition.RouteOfAdministration().apply {
      id = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.id
      extension = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.extension
      modifierExtension =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.modifierExtension
      code = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.code
      firstDose = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.firstDose
      maxSingleDose =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxSingleDose
      maxDosePerDay =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxDosePerDay
      maxDosePerTreatmentPeriod =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxDosePerTreatmentPeriod
      maxTreatmentPeriod =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxTreatmentPeriod
      targetSpecies =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.targetSpecies
    }

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.RouteOfAdministration
    ): AdministrableProductDefinitionRouteOfAdministrationSurrogate =
      with(model) {
        AdministrableProductDefinitionRouteOfAdministrationSurrogate().apply {
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
internal data class AdministrableProductDefinitionSurrogate(
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
  public var formOf: List<Reference?>? = null,
  public var administrableDoseForm: CodeableConcept? = null,
  public var unitOfPresentation: CodeableConcept? = null,
  public var producedFrom: List<Reference?>? = null,
  public var ingredient: List<CodeableConcept?>? = null,
  public var device: Reference? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var `property`: List<AdministrableProductDefinition.Property>? = null,
  public var routeOfAdministration: List<AdministrableProductDefinition.RouteOfAdministration>? =
    null,
) {
  public fun toModel(): AdministrableProductDefinition =
    AdministrableProductDefinition().apply {
      id = this@AdministrableProductDefinitionSurrogate.id
      meta = this@AdministrableProductDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@AdministrableProductDefinitionSurrogate.implicitRules,
          this@AdministrableProductDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@AdministrableProductDefinitionSurrogate.language,
          this@AdministrableProductDefinitionSurrogate._language,
        )
      text = this@AdministrableProductDefinitionSurrogate.text
      contained = this@AdministrableProductDefinitionSurrogate.contained
      extension = this@AdministrableProductDefinitionSurrogate.extension
      modifierExtension = this@AdministrableProductDefinitionSurrogate.modifierExtension
      identifier = this@AdministrableProductDefinitionSurrogate.identifier
      status =
        Enumeration.of(
          this@AdministrableProductDefinitionSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@AdministrableProductDefinitionSurrogate._status,
        )
      formOf = this@AdministrableProductDefinitionSurrogate.formOf
      administrableDoseForm = this@AdministrableProductDefinitionSurrogate.administrableDoseForm
      unitOfPresentation = this@AdministrableProductDefinitionSurrogate.unitOfPresentation
      producedFrom = this@AdministrableProductDefinitionSurrogate.producedFrom
      ingredient = this@AdministrableProductDefinitionSurrogate.ingredient
      device = this@AdministrableProductDefinitionSurrogate.device
      description =
        Markdown.of(
          this@AdministrableProductDefinitionSurrogate.description,
          this@AdministrableProductDefinitionSurrogate._description,
        )
      `property` = this@AdministrableProductDefinitionSurrogate.`property`
      routeOfAdministration = this@AdministrableProductDefinitionSurrogate.routeOfAdministration
    }

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition
    ): AdministrableProductDefinitionSurrogate =
      with(model) {
        AdministrableProductDefinitionSurrogate().apply {
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
          formOf = this@with.formOf
          administrableDoseForm = this@with.administrableDoseForm
          unitOfPresentation = this@with.unitOfPresentation
          producedFrom = this@with.producedFrom
          ingredient = this@with.ingredient
          device = this@with.device
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          `property` = this@with.`property`
          routeOfAdministration = this@with.routeOfAdministration
        }
      }
  }
}
