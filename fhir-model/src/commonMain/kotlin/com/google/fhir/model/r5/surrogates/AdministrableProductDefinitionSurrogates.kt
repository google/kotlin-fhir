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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AdministrableProductDefinitionPropertyValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueMarkdown: KotlinString? = null,
  public var _valueMarkdown: Element? = null,
  public var valueAttachment: Attachment? = null,
  public var valueReference: Reference? = null,
) {
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
    )!!

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.Property.Value
    ): AdministrableProductDefinitionPropertyValueSurrogate =
      with(model) {
        AdministrableProductDefinitionPropertyValueSurrogate(
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueQuantity = this@with.asQuantity()?.value,
          valueDate = this@with.asDate()?.value?.value?.toString(),
          _valueDate = this@with.asDate()?.value?.toElement(),
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
          valueMarkdown = this@with.asMarkdown()?.value?.value,
          _valueMarkdown = this@with.asMarkdown()?.value?.toElement(),
          valueAttachment = this@with.asAttachment()?.value,
          valueReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class AdministrableProductDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: AdministrableProductDefinition.Property.Value? = null,
  public var status: CodeableConcept? = null,
) {
  public fun toModel(): AdministrableProductDefinition.Property =
    AdministrableProductDefinition.Property(
      id = this@AdministrableProductDefinitionPropertySurrogate.id,
      extension = this@AdministrableProductDefinitionPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdministrableProductDefinitionPropertySurrogate.modifierExtension ?: mutableListOf(),
      type = this@AdministrableProductDefinitionPropertySurrogate.type,
      `value` = this@AdministrableProductDefinitionPropertySurrogate.`value`,
      status = this@AdministrableProductDefinitionPropertySurrogate.status,
    )

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.Property
    ): AdministrableProductDefinitionPropertySurrogate =
      with(model) {
        AdministrableProductDefinitionPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
          status = this@with.status,
        )
      }
  }
}

@Serializable
internal data class AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var tissue: CodeableConcept,
  public var `value`: Quantity,
  public var supportingInformation: KotlinString? = null,
  public var _supportingInformation: Element? = null,
) {
  public fun toModel():
    AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod =
    AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod(
      id =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .id,
      extension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .extension ?: mutableListOf(),
      modifierExtension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .modifierExtension ?: mutableListOf(),
      tissue =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .tissue,
      `value` =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
          .`value`,
      supportingInformation =
        R5String.of(
          this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            .supportingInformation,
          this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate
            ._supportingInformation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
    ): AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate =
      with(model) {
        AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriodSurrogate(
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
internal data class AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var withdrawalPeriod:
    MutableList<
      AdministrableProductDefinition.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
    >? =
    null,
) {
  public fun toModel(): AdministrableProductDefinition.RouteOfAdministration.TargetSpecies =
    AdministrableProductDefinition.RouteOfAdministration.TargetSpecies(
      id = this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.id,
      extension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate
          .modifierExtension ?: mutableListOf(),
      code = this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate.code,
      withdrawalPeriod =
        this@AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate
          .withdrawalPeriod ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.RouteOfAdministration.TargetSpecies
    ): AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate =
      with(model) {
        AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesSurrogate(
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
internal data class AdministrableProductDefinitionRouteOfAdministrationSurrogate(
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
    MutableList<AdministrableProductDefinition.RouteOfAdministration.TargetSpecies>? =
    null,
) {
  public fun toModel(): AdministrableProductDefinition.RouteOfAdministration =
    AdministrableProductDefinition.RouteOfAdministration(
      id = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.id,
      extension =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.modifierExtension
          ?: mutableListOf(),
      code = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.code,
      firstDose = this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.firstDose,
      maxSingleDose =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxSingleDose,
      maxDosePerDay =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxDosePerDay,
      maxDosePerTreatmentPeriod =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxDosePerTreatmentPeriod,
      maxTreatmentPeriod =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.maxTreatmentPeriod,
      targetSpecies =
        this@AdministrableProductDefinitionRouteOfAdministrationSurrogate.targetSpecies
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition.RouteOfAdministration
    ): AdministrableProductDefinitionRouteOfAdministrationSurrogate =
      with(model) {
        AdministrableProductDefinitionRouteOfAdministrationSurrogate(
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
internal data class AdministrableProductDefinitionSurrogate(
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
  public var formOf: MutableList<Reference>? = null,
  public var administrableDoseForm: CodeableConcept? = null,
  public var unitOfPresentation: CodeableConcept? = null,
  public var producedFrom: MutableList<Reference>? = null,
  public var ingredient: MutableList<CodeableConcept>? = null,
  public var device: Reference? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var `property`: MutableList<AdministrableProductDefinition.Property>? = null,
  public var routeOfAdministration:
    MutableList<AdministrableProductDefinition.RouteOfAdministration>? =
    null,
) {
  public fun toModel(): AdministrableProductDefinition =
    AdministrableProductDefinition(
      id = this@AdministrableProductDefinitionSurrogate.id,
      meta = this@AdministrableProductDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@AdministrableProductDefinitionSurrogate.implicitRules,
          this@AdministrableProductDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@AdministrableProductDefinitionSurrogate.language,
          this@AdministrableProductDefinitionSurrogate._language,
        ),
      text = this@AdministrableProductDefinitionSurrogate.text,
      contained = this@AdministrableProductDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@AdministrableProductDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdministrableProductDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@AdministrableProductDefinitionSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@AdministrableProductDefinitionSurrogate.status!!
          ),
          this@AdministrableProductDefinitionSurrogate._status,
        ),
      formOf = this@AdministrableProductDefinitionSurrogate.formOf ?: mutableListOf(),
      administrableDoseForm = this@AdministrableProductDefinitionSurrogate.administrableDoseForm,
      unitOfPresentation = this@AdministrableProductDefinitionSurrogate.unitOfPresentation,
      producedFrom = this@AdministrableProductDefinitionSurrogate.producedFrom ?: mutableListOf(),
      ingredient = this@AdministrableProductDefinitionSurrogate.ingredient ?: mutableListOf(),
      device = this@AdministrableProductDefinitionSurrogate.device,
      description =
        Markdown.of(
          this@AdministrableProductDefinitionSurrogate.description,
          this@AdministrableProductDefinitionSurrogate._description,
        ),
      `property` = this@AdministrableProductDefinitionSurrogate.`property` ?: mutableListOf(),
      routeOfAdministration =
        this@AdministrableProductDefinitionSurrogate.routeOfAdministration ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: AdministrableProductDefinition
    ): AdministrableProductDefinitionSurrogate =
      with(model) {
        AdministrableProductDefinitionSurrogate(
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
          formOf = this@with.formOf.takeUnless { it.all { it == null } },
          administrableDoseForm = this@with.administrableDoseForm,
          unitOfPresentation = this@with.unitOfPresentation,
          producedFrom = this@with.producedFrom.takeUnless { it.all { it == null } },
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          device = this@with.device,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          routeOfAdministration =
            this@with.routeOfAdministration.takeUnless { it.all { it == null } },
        )
      }
  }
}
