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
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.ImmunizationEvaluation
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
internal data class ImmunizationEvaluationSurrogate(
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
  public var patient: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var authority: Reference? = null,
  public var targetDisease: CodeableConcept? = null,
  public var immunizationEvent: Reference? = null,
  public var doseStatus: CodeableConcept? = null,
  public var doseStatusReason: List<CodeableConcept?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var series: KotlinString? = null,
  public var _series: Element? = null,
  public var doseNumberPositiveInt: Int? = null,
  public var _doseNumberPositiveInt: Element? = null,
  public var doseNumberString: KotlinString? = null,
  public var _doseNumberString: Element? = null,
  public var seriesDosesPositiveInt: Int? = null,
  public var _seriesDosesPositiveInt: Element? = null,
  public var seriesDosesString: KotlinString? = null,
  public var _seriesDosesString: Element? = null,
) {
  public fun toModel(): ImmunizationEvaluation =
    ImmunizationEvaluation().apply {
      id = this@ImmunizationEvaluationSurrogate.id
      meta = this@ImmunizationEvaluationSurrogate.meta
      implicitRules =
        Uri.of(
          this@ImmunizationEvaluationSurrogate.implicitRules,
          this@ImmunizationEvaluationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ImmunizationEvaluationSurrogate.language,
          this@ImmunizationEvaluationSurrogate._language,
        )
      text = this@ImmunizationEvaluationSurrogate.text
      contained = this@ImmunizationEvaluationSurrogate.contained
      extension = this@ImmunizationEvaluationSurrogate.extension
      modifierExtension = this@ImmunizationEvaluationSurrogate.modifierExtension
      identifier = this@ImmunizationEvaluationSurrogate.identifier
      status =
        Enumeration.of(
          this@ImmunizationEvaluationSurrogate.status?.let {
            com.google.fhir.model.r4b.ImmunizationEvaluation.ImmunizationEvaluationStatus.fromCode(
              it
            )
          },
          this@ImmunizationEvaluationSurrogate._status,
        )
      patient = this@ImmunizationEvaluationSurrogate.patient
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationEvaluationSurrogate.date),
          this@ImmunizationEvaluationSurrogate._date,
        )
      authority = this@ImmunizationEvaluationSurrogate.authority
      targetDisease = this@ImmunizationEvaluationSurrogate.targetDisease
      immunizationEvent = this@ImmunizationEvaluationSurrogate.immunizationEvent
      doseStatus = this@ImmunizationEvaluationSurrogate.doseStatus
      doseStatusReason = this@ImmunizationEvaluationSurrogate.doseStatusReason
      description =
        R4bString.of(
          this@ImmunizationEvaluationSurrogate.description,
          this@ImmunizationEvaluationSurrogate._description,
        )
      series =
        R4bString.of(
          this@ImmunizationEvaluationSurrogate.series,
          this@ImmunizationEvaluationSurrogate._series,
        )
      doseNumber =
        ImmunizationEvaluation.DoseNumber?.from(
          PositiveInt.of(
            this@ImmunizationEvaluationSurrogate.doseNumberPositiveInt,
            this@ImmunizationEvaluationSurrogate._doseNumberPositiveInt,
          ),
          R4bString.of(
            this@ImmunizationEvaluationSurrogate.doseNumberString,
            this@ImmunizationEvaluationSurrogate._doseNumberString,
          ),
        )
      seriesDoses =
        ImmunizationEvaluation.SeriesDoses?.from(
          PositiveInt.of(
            this@ImmunizationEvaluationSurrogate.seriesDosesPositiveInt,
            this@ImmunizationEvaluationSurrogate._seriesDosesPositiveInt,
          ),
          R4bString.of(
            this@ImmunizationEvaluationSurrogate.seriesDosesString,
            this@ImmunizationEvaluationSurrogate._seriesDosesString,
          ),
        )
    }

  public companion object {
    public fun fromModel(model: ImmunizationEvaluation): ImmunizationEvaluationSurrogate =
      with(model) {
        ImmunizationEvaluationSurrogate().apply {
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
          patient = this@with.patient
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          authority = this@with.authority
          targetDisease = this@with.targetDisease
          immunizationEvent = this@with.immunizationEvent
          doseStatus = this@with.doseStatus
          doseStatusReason = this@with.doseStatusReason
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          series = this@with.series?.value
          _series = this@with.series?.toElement()
          doseNumberPositiveInt = this@with.doseNumber?.asPositiveInt()?.value?.value
          _doseNumberPositiveInt = this@with.doseNumber?.asPositiveInt()?.value?.toElement()
          doseNumberString = this@with.doseNumber?.asString()?.value?.value
          _doseNumberString = this@with.doseNumber?.asString()?.value?.toElement()
          seriesDosesPositiveInt = this@with.seriesDoses?.asPositiveInt()?.value?.value
          _seriesDosesPositiveInt = this@with.seriesDoses?.asPositiveInt()?.value?.toElement()
          seriesDosesString = this@with.seriesDoses?.asString()?.value?.value
          _seriesDosesString = this@with.seriesDoses?.asString()?.value?.toElement()
        }
      }
  }
}
