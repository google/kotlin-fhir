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

import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.ImmunizationRecommendation
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.PositiveInt
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
internal data class ImmunizationRecommendationRecommendationDateCriterionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): ImmunizationRecommendation.Recommendation.DateCriterion =
    ImmunizationRecommendation.Recommendation.DateCriterion().apply {
      id = this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.id
      extension = this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.extension
      modifierExtension =
        this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.modifierExtension
      code = this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.code
      `value` =
        DateTime.of(
          FhirDateTime.fromString(
            this@ImmunizationRecommendationRecommendationDateCriterionSurrogate.`value`
          ),
          this@ImmunizationRecommendationRecommendationDateCriterionSurrogate._value,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation.DateCriterion
    ): ImmunizationRecommendationRecommendationDateCriterionSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationDateCriterionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          `value` = this@with.`value`?.value?.toString()
          _value = this@with.`value`?.toElement()
        }
      }
  }
}

@Serializable
internal class ImmunizationRecommendationRecommendationDoseNumberSurrogate {
  public var doseNumberPositiveInt: Int? = null

  public var _doseNumberPositiveInt: Element? = null

  public var doseNumberString: KotlinString? = null

  public var _doseNumberString: Element? = null

  public fun toModel(): ImmunizationRecommendation.Recommendation.DoseNumber =
    ImmunizationRecommendation.Recommendation.DoseNumber?.from(
      PositiveInt.of(
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate.doseNumberPositiveInt,
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate._doseNumberPositiveInt,
      ),
      R4bString.of(
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate.doseNumberString,
        this@ImmunizationRecommendationRecommendationDoseNumberSurrogate._doseNumberString,
      ),
    ) ?: ImmunizationRecommendation.Recommendation.DoseNumber.Null

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation.DoseNumber
    ): ImmunizationRecommendationRecommendationDoseNumberSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationDoseNumberSurrogate().apply {
          doseNumberPositiveInt = this@with.asPositiveInt()?.value?.value
          _doseNumberPositiveInt = this@with.asPositiveInt()?.value?.toElement()
          doseNumberString = this@with.asString()?.value?.value
          _doseNumberString = this@with.asString()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal class ImmunizationRecommendationRecommendationSeriesDosesSurrogate {
  public var seriesDosesPositiveInt: Int? = null

  public var _seriesDosesPositiveInt: Element? = null

  public var seriesDosesString: KotlinString? = null

  public var _seriesDosesString: Element? = null

  public fun toModel(): ImmunizationRecommendation.Recommendation.SeriesDoses =
    ImmunizationRecommendation.Recommendation.SeriesDoses?.from(
      PositiveInt.of(
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate.seriesDosesPositiveInt,
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate._seriesDosesPositiveInt,
      ),
      R4bString.of(
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate.seriesDosesString,
        this@ImmunizationRecommendationRecommendationSeriesDosesSurrogate._seriesDosesString,
      ),
    ) ?: ImmunizationRecommendation.Recommendation.SeriesDoses.Null

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation.SeriesDoses
    ): ImmunizationRecommendationRecommendationSeriesDosesSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationSeriesDosesSurrogate().apply {
          seriesDosesPositiveInt = this@with.asPositiveInt()?.value?.value
          _seriesDosesPositiveInt = this@with.asPositiveInt()?.value?.toElement()
          seriesDosesString = this@with.asString()?.value?.value
          _seriesDosesString = this@with.asString()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImmunizationRecommendationRecommendationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var vaccineCode: List<CodeableConcept?>? = null,
  public var targetDisease: CodeableConcept? = null,
  public var contraindicatedVaccineCode: List<CodeableConcept?>? = null,
  public var forecastStatus: CodeableConcept? = null,
  public var forecastReason: List<CodeableConcept?>? = null,
  public var dateCriterion: List<ImmunizationRecommendation.Recommendation.DateCriterion>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var series: KotlinString? = null,
  public var _series: Element? = null,
  public var supportingImmunization: List<Reference?>? = null,
  public var supportingPatientInformation: List<Reference?>? = null,
  public var doseNumber: ImmunizationRecommendation.Recommendation.DoseNumber? = null,
  public var seriesDoses: ImmunizationRecommendation.Recommendation.SeriesDoses? = null,
) {
  public fun toModel(): ImmunizationRecommendation.Recommendation =
    ImmunizationRecommendation.Recommendation().apply {
      id = this@ImmunizationRecommendationRecommendationSurrogate.id
      extension = this@ImmunizationRecommendationRecommendationSurrogate.extension
      modifierExtension = this@ImmunizationRecommendationRecommendationSurrogate.modifierExtension
      vaccineCode = this@ImmunizationRecommendationRecommendationSurrogate.vaccineCode
      targetDisease = this@ImmunizationRecommendationRecommendationSurrogate.targetDisease
      contraindicatedVaccineCode =
        this@ImmunizationRecommendationRecommendationSurrogate.contraindicatedVaccineCode
      forecastStatus = this@ImmunizationRecommendationRecommendationSurrogate.forecastStatus
      forecastReason = this@ImmunizationRecommendationRecommendationSurrogate.forecastReason
      dateCriterion = this@ImmunizationRecommendationRecommendationSurrogate.dateCriterion
      description =
        R4bString.of(
          this@ImmunizationRecommendationRecommendationSurrogate.description,
          this@ImmunizationRecommendationRecommendationSurrogate._description,
        )
      series =
        R4bString.of(
          this@ImmunizationRecommendationRecommendationSurrogate.series,
          this@ImmunizationRecommendationRecommendationSurrogate._series,
        )
      doseNumber = this@ImmunizationRecommendationRecommendationSurrogate.doseNumber
      seriesDoses = this@ImmunizationRecommendationRecommendationSurrogate.seriesDoses
      supportingImmunization =
        this@ImmunizationRecommendationRecommendationSurrogate.supportingImmunization
      supportingPatientInformation =
        this@ImmunizationRecommendationRecommendationSurrogate.supportingPatientInformation
    }

  public companion object {
    public fun fromModel(
      model: ImmunizationRecommendation.Recommendation
    ): ImmunizationRecommendationRecommendationSurrogate =
      with(model) {
        ImmunizationRecommendationRecommendationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          vaccineCode = this@with.vaccineCode
          targetDisease = this@with.targetDisease
          contraindicatedVaccineCode = this@with.contraindicatedVaccineCode
          forecastStatus = this@with.forecastStatus
          forecastReason = this@with.forecastReason
          dateCriterion = this@with.dateCriterion
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          series = this@with.series?.value
          _series = this@with.series?.toElement()
          doseNumber = this@with.doseNumber
          seriesDoses = this@with.seriesDoses
          supportingImmunization = this@with.supportingImmunization
          supportingPatientInformation = this@with.supportingPatientInformation
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var patient: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var authority: Reference? = null,
  public var recommendation: List<ImmunizationRecommendation.Recommendation>? = null,
) {
  public fun toModel(): ImmunizationRecommendation =
    ImmunizationRecommendation().apply {
      id = this@ImmunizationRecommendationSurrogate.id
      meta = this@ImmunizationRecommendationSurrogate.meta
      implicitRules =
        Uri.of(
          this@ImmunizationRecommendationSurrogate.implicitRules,
          this@ImmunizationRecommendationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ImmunizationRecommendationSurrogate.language,
          this@ImmunizationRecommendationSurrogate._language,
        )
      text = this@ImmunizationRecommendationSurrogate.text
      contained = this@ImmunizationRecommendationSurrogate.contained
      extension = this@ImmunizationRecommendationSurrogate.extension
      modifierExtension = this@ImmunizationRecommendationSurrogate.modifierExtension
      identifier = this@ImmunizationRecommendationSurrogate.identifier
      patient = this@ImmunizationRecommendationSurrogate.patient
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationRecommendationSurrogate.date),
          this@ImmunizationRecommendationSurrogate._date,
        )
      authority = this@ImmunizationRecommendationSurrogate.authority
      recommendation = this@ImmunizationRecommendationSurrogate.recommendation
    }

  public companion object {
    public fun fromModel(model: ImmunizationRecommendation): ImmunizationRecommendationSurrogate =
      with(model) {
        ImmunizationRecommendationSurrogate().apply {
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
          patient = this@with.patient
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          authority = this@with.authority
          recommendation = this@with.recommendation
        }
      }
  }
}
