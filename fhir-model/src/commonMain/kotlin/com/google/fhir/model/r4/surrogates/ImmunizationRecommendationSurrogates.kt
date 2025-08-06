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
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.ImmunizationRecommendation
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImmunizationRecommendationRecommendationDateCriterionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): ImmunizationRecommendation.Recommendation.DateCriterion =
    ImmunizationRecommendation.Recommendation.DateCriterion(
      id = this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.id,
      extension =
        this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.modifierExtension
          ?: mutableListOf(),
      code = this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.code,
      `value` =
        DateTime.of(
          FhirDateTime.fromString(
            this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.`value`
          ),
          this@ImmunizationRecommendationRecommendationDateCriterionSurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation.DateCriterion
    ): ImmunizationRecommendationRecommendationDateCriterionSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationDateCriterionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          `value` = this@with.`value`.value?.toString(),
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImmunizationRecommendationRecommendationDoseNumberSurrogate(
  public var doseNumberPositiveInt: Int? = null,
  public var _doseNumberPositiveInt: Element? = null,
  public var doseNumberString: KotlinString? = null,
  public var _doseNumberString: Element? = null,
) {
  public fun toModel(): ImmunizationRecommendation.Recommendation.DoseNumber =
    ImmunizationRecommendation.Recommendation.DoseNumber?.from(
      PositiveInt.of(
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate.doseNumberPositiveInt,
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate._doseNumberPositiveInt,
      ),
      R4String.of(
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate.doseNumberString,
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate._doseNumberString,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation.DoseNumber
    ): ImmunizationRecommendationRecommendationDoseNumberSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationDoseNumberSurrogate(
          doseNumberPositiveInt = this@with.asPositiveInt()?.value?.value,
          _doseNumberPositiveInt = this@with.asPositiveInt()?.value?.toElement(),
          doseNumberString = this@with.asString()?.value?.value,
          _doseNumberString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImmunizationRecommendationRecommendationSeriesDosesSurrogate(
  public var seriesDosesPositiveInt: Int? = null,
  public var _seriesDosesPositiveInt: Element? = null,
  public var seriesDosesString: KotlinString? = null,
  public var _seriesDosesString: Element? = null,
) {
  public fun toModel(): ImmunizationRecommendation.Recommendation.SeriesDoses =
    ImmunizationRecommendation.Recommendation.SeriesDoses?.from(
      PositiveInt.of(
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate.seriesDosesPositiveInt,
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate._seriesDosesPositiveInt,
      ),
      R4String.of(
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate.seriesDosesString,
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate._seriesDosesString,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation.SeriesDoses
    ): ImmunizationRecommendationRecommendationSeriesDosesSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationSeriesDosesSurrogate(
          seriesDosesPositiveInt = this@with.asPositiveInt()?.value?.value,
          _seriesDosesPositiveInt = this@with.asPositiveInt()?.value?.toElement(),
          seriesDosesString = this@with.asString()?.value?.value,
          _seriesDosesString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImmunizationRecommendationRecommendationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var vaccineCode: MutableList<CodeableConcept>? = null,
  public var targetDisease: CodeableConcept? = null,
  public var contraindicatedVaccineCode: MutableList<CodeableConcept>? = null,
  public var forecastStatus: CodeableConcept,
  public var forecastReason: MutableList<CodeableConcept>? = null,
  public var dateCriterion: MutableList<ImmunizationRecommendation.Recommendation.DateCriterion>? =
    null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var series: KotlinString? = null,
  public var _series: Element? = null,
  public var doseNumber: ImmunizationRecommendation.Recommendation.DoseNumber? = null,
  public var seriesDoses: ImmunizationRecommendation.Recommendation.SeriesDoses? = null,
  public var supportingImmunization: MutableList<Reference>? = null,
  public var supportingPatientInformation: MutableList<Reference>? = null,
) {
  public fun toModel(): ImmunizationRecommendation.Recommendation =
    ImmunizationRecommendation.Recommendation(
      id = this@ImmunizationRecommendationRecommendationSurrogate.id,
      extension =
        this@ImmunizationRecommendationRecommendationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImmunizationRecommendationRecommendationSurrogate.modifierExtension ?: mutableListOf(),
      vaccineCode =
        this@ImmunizationRecommendationRecommendationSurrogate.vaccineCode ?: mutableListOf(),
      targetDisease = this@ImmunizationRecommendationRecommendationSurrogate.targetDisease,
      contraindicatedVaccineCode =
        this@ImmunizationRecommendationRecommendationSurrogate.contraindicatedVaccineCode
          ?: mutableListOf(),
      forecastStatus = this@ImmunizationRecommendationRecommendationSurrogate.forecastStatus,
      forecastReason =
        this@ImmunizationRecommendationRecommendationSurrogate.forecastReason ?: mutableListOf(),
      dateCriterion =
        this@ImmunizationRecommendationRecommendationSurrogate.dateCriterion ?: mutableListOf(),
      description =
        R4String.of(
          this@ImmunizationRecommendationRecommendationSurrogate.description,
          this@ImmunizationRecommendationRecommendationSurrogate._description,
        ),
      series =
        R4String.of(
          this@ImmunizationRecommendationRecommendationSurrogate.series,
          this@ImmunizationRecommendationRecommendationSurrogate._series,
        ),
      doseNumber = this@ImmunizationRecommendationRecommendationSurrogate.doseNumber,
      seriesDoses = this@ImmunizationRecommendationRecommendationSurrogate.seriesDoses,
      supportingImmunization =
        this@ImmunizationRecommendationRecommendationSurrogate.supportingImmunization
          ?: mutableListOf(),
      supportingPatientInformation =
        this@ImmunizationRecommendationRecommendationSurrogate.supportingPatientInformation
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation
    ): ImmunizationRecommendationRecommendationSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          vaccineCode = this@with.vaccineCode.takeUnless { it.all { it == null } },
          targetDisease = this@with.targetDisease,
          contraindicatedVaccineCode =
            this@with.contraindicatedVaccineCode.takeUnless { it.all { it == null } },
          forecastStatus = this@with.forecastStatus,
          forecastReason = this@with.forecastReason.takeUnless { it.all { it == null } },
          dateCriterion = this@with.dateCriterion.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          series = this@with.series?.value,
          _series = this@with.series?.toElement(),
          doseNumber = this@with.doseNumber,
          seriesDoses = this@with.seriesDoses,
          supportingImmunization =
            this@with.supportingImmunization.takeUnless { it.all { it == null } },
          supportingPatientInformation =
            this@with.supportingPatientInformation.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ImmunizationRecommendationSurrogate(
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
  public var patient: Reference,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var authority: Reference? = null,
  public var recommendation: MutableList<ImmunizationRecommendation.Recommendation>? = null,
) {
  public fun toModel(): ImmunizationRecommendation =
    ImmunizationRecommendation(
      id = this@ImmunizationRecommendationSurrogate.id,
      meta = this@ImmunizationRecommendationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ImmunizationRecommendationSurrogate.implicitRules,
          this@ImmunizationRecommendationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ImmunizationRecommendationSurrogate.language,
          this@ImmunizationRecommendationSurrogate._language,
        ),
      text = this@ImmunizationRecommendationSurrogate.text,
      contained = this@ImmunizationRecommendationSurrogate.contained ?: mutableListOf(),
      extension = this@ImmunizationRecommendationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImmunizationRecommendationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ImmunizationRecommendationSurrogate.identifier ?: mutableListOf(),
      patient = this@ImmunizationRecommendationSurrogate.patient,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationRecommendationSurrogate.date),
          this@ImmunizationRecommendationSurrogate._date,
        )!!,
      authority = this@ImmunizationRecommendationSurrogate.authority,
      recommendation = this@ImmunizationRecommendationSurrogate.recommendation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ImmunizationRecommendation): ImmunizationRecommendationSurrogate =
      with(model) {
        ImmunizationRecommendationSurrogate(
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
          patient = this@with.patient,
          date = this@with.date.value?.toString(),
          _date = this@with.date.toElement(),
          authority = this@with.authority,
          recommendation = this@with.recommendation.takeUnless { it.all { it == null } },
        )
      }
  }
}
