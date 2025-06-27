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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.RiskAssessment
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class RiskAssessmentPredictionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var outcome: CodeableConcept? = null,
  public var probabilityDecimal: Double? = null,
  public var _probabilityDecimal: Element? = null,
  public var probabilityRange: Range? = null,
  public var qualitativeRisk: CodeableConcept? = null,
  public var relativeRisk: Double? = null,
  public var _relativeRisk: Element? = null,
  public var whenPeriod: Period? = null,
  public var whenRange: Range? = null,
  public var rationale: KotlinString? = null,
  public var _rationale: Element? = null,
) {
  public fun toModel(): RiskAssessment.Prediction =
    RiskAssessment.Prediction().apply {
      id = this@RiskAssessmentPredictionSurrogate.id
      extension = this@RiskAssessmentPredictionSurrogate.extension
      modifierExtension = this@RiskAssessmentPredictionSurrogate.modifierExtension
      outcome = this@RiskAssessmentPredictionSurrogate.outcome
      probability =
        RiskAssessment.Prediction.Probability?.from(
          Decimal.of(
            this@RiskAssessmentPredictionSurrogate.probabilityDecimal,
            this@RiskAssessmentPredictionSurrogate._probabilityDecimal,
          ),
          this@RiskAssessmentPredictionSurrogate.probabilityRange,
        )
      qualitativeRisk = this@RiskAssessmentPredictionSurrogate.qualitativeRisk
      relativeRisk =
        Decimal.of(
          this@RiskAssessmentPredictionSurrogate.relativeRisk,
          this@RiskAssessmentPredictionSurrogate._relativeRisk,
        )
      `when` =
        RiskAssessment.Prediction.When?.from(
          this@RiskAssessmentPredictionSurrogate.whenPeriod,
          this@RiskAssessmentPredictionSurrogate.whenRange,
        )
      rationale =
        R4bString.of(
          this@RiskAssessmentPredictionSurrogate.rationale,
          this@RiskAssessmentPredictionSurrogate._rationale,
        )
    }

  public companion object {
    public fun fromModel(model: RiskAssessment.Prediction): RiskAssessmentPredictionSurrogate =
      with(model) {
        RiskAssessmentPredictionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          outcome = this@with.outcome
          probabilityDecimal = this@with.probability?.asDecimal()?.value?.value
          _probabilityDecimal = this@with.probability?.asDecimal()?.value?.toElement()
          probabilityRange = this@with.probability?.asRange()?.value
          qualitativeRisk = this@with.qualitativeRisk
          relativeRisk = this@with.relativeRisk?.value
          _relativeRisk = this@with.relativeRisk?.toElement()
          whenPeriod = this@with.`when`?.asPeriod()?.value
          whenRange = this@with.`when`?.asRange()?.value
          rationale = this@with.rationale?.value
          _rationale = this@with.rationale?.toElement()
        }
      }
  }
}

@Serializable
internal data class RiskAssessmentSurrogate(
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
  public var basedOn: Reference? = null,
  public var parent: Reference? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var method: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var condition: Reference? = null,
  public var performer: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var basis: List<Reference?>? = null,
  public var prediction: List<RiskAssessment.Prediction>? = null,
  public var mitigation: KotlinString? = null,
  public var _mitigation: Element? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): RiskAssessment =
    RiskAssessment().apply {
      id = this@RiskAssessmentSurrogate.id
      meta = this@RiskAssessmentSurrogate.meta
      implicitRules =
        Uri.of(
          this@RiskAssessmentSurrogate.implicitRules,
          this@RiskAssessmentSurrogate._implicitRules,
        )
      language =
        Code.of(this@RiskAssessmentSurrogate.language, this@RiskAssessmentSurrogate._language)
      text = this@RiskAssessmentSurrogate.text
      contained = this@RiskAssessmentSurrogate.contained
      extension = this@RiskAssessmentSurrogate.extension
      modifierExtension = this@RiskAssessmentSurrogate.modifierExtension
      identifier = this@RiskAssessmentSurrogate.identifier
      basedOn = this@RiskAssessmentSurrogate.basedOn
      parent = this@RiskAssessmentSurrogate.parent
      status =
        Enumeration.of(
          this@RiskAssessmentSurrogate.status?.let {
            com.google.fhir.model.r4b.RiskAssessment.RiskAssessmentStatus.fromCode(it)
          },
          this@RiskAssessmentSurrogate._status,
        )
      method = this@RiskAssessmentSurrogate.method
      code = this@RiskAssessmentSurrogate.code
      subject = this@RiskAssessmentSurrogate.subject
      encounter = this@RiskAssessmentSurrogate.encounter
      occurrence =
        RiskAssessment.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@RiskAssessmentSurrogate.occurrenceDateTime),
            this@RiskAssessmentSurrogate._occurrenceDateTime,
          ),
          this@RiskAssessmentSurrogate.occurrencePeriod,
        )
      condition = this@RiskAssessmentSurrogate.condition
      performer = this@RiskAssessmentSurrogate.performer
      reasonCode = this@RiskAssessmentSurrogate.reasonCode
      reasonReference = this@RiskAssessmentSurrogate.reasonReference
      basis = this@RiskAssessmentSurrogate.basis
      prediction = this@RiskAssessmentSurrogate.prediction
      mitigation =
        R4bString.of(
          this@RiskAssessmentSurrogate.mitigation,
          this@RiskAssessmentSurrogate._mitigation,
        )
      note = this@RiskAssessmentSurrogate.note
    }

  public companion object {
    public fun fromModel(model: RiskAssessment): RiskAssessmentSurrogate =
      with(model) {
        RiskAssessmentSurrogate().apply {
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
          basedOn = this@with.basedOn
          parent = this@with.parent
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          method = this@with.method
          code = this@with.code
          subject = this@with.subject
          encounter = this@with.encounter
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          condition = this@with.condition
          performer = this@with.performer
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          basis = this@with.basis
          prediction = this@with.prediction
          mitigation = this@with.mitigation?.value
          _mitigation = this@with.mitigation?.toElement()
          note = this@with.note
        }
      }
  }
}
