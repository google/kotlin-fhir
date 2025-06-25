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
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.ImmunizationEvaluation
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
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
  public var doseNumber: KotlinString? = null,
  public var _doseNumber: Element? = null,
  public var seriesDoses: KotlinString? = null,
  public var _seriesDoses: Element? = null,
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
            com.google.fhir.model.r5.ImmunizationEvaluation.ImmunizationEvaluationStatus.fromCode(
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
        Markdown.of(
          this@ImmunizationEvaluationSurrogate.description,
          this@ImmunizationEvaluationSurrogate._description,
        )
      series =
        R5String.of(
          this@ImmunizationEvaluationSurrogate.series,
          this@ImmunizationEvaluationSurrogate._series,
        )
      doseNumber =
        R5String.of(
          this@ImmunizationEvaluationSurrogate.doseNumber,
          this@ImmunizationEvaluationSurrogate._doseNumber,
        )
      seriesDoses =
        R5String.of(
          this@ImmunizationEvaluationSurrogate.seriesDoses,
          this@ImmunizationEvaluationSurrogate._seriesDoses,
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
          doseNumber = this@with.doseNumber?.value
          _doseNumber = this@with.doseNumber?.toElement()
          seriesDoses = this@with.seriesDoses?.value
          _seriesDoses = this@with.seriesDoses?.toElement()
        }
      }
  }
}
