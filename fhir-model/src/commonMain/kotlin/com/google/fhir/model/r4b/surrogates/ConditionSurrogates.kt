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

import com.google.fhir.model.r4b.Age
import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Condition
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ConditionStageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var summary: CodeableConcept? = null,
  public var assessment: List<Reference?>? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): Condition.Stage =
    Condition.Stage().apply {
      id = this@ConditionStageSurrogate.id
      extension = this@ConditionStageSurrogate.extension
      modifierExtension = this@ConditionStageSurrogate.modifierExtension
      summary = this@ConditionStageSurrogate.summary
      assessment = this@ConditionStageSurrogate.assessment
      type = this@ConditionStageSurrogate.type
    }

  public companion object {
    public fun fromModel(model: Condition.Stage): ConditionStageSurrogate =
      with(model) {
        ConditionStageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          summary = this@with.summary
          assessment = this@with.assessment
          type = this@with.type
        }
      }
  }
}

@Serializable
internal data class ConditionEvidenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: List<CodeableConcept?>? = null,
  public var detail: List<Reference?>? = null,
) {
  public fun toModel(): Condition.Evidence =
    Condition.Evidence().apply {
      id = this@ConditionEvidenceSurrogate.id
      extension = this@ConditionEvidenceSurrogate.extension
      modifierExtension = this@ConditionEvidenceSurrogate.modifierExtension
      code = this@ConditionEvidenceSurrogate.code
      detail = this@ConditionEvidenceSurrogate.detail
    }

  public companion object {
    public fun fromModel(model: Condition.Evidence): ConditionEvidenceSurrogate =
      with(model) {
        ConditionEvidenceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class ConditionSurrogate(
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
  public var clinicalStatus: CodeableConcept? = null,
  public var verificationStatus: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var severity: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var bodySite: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var onsetDateTime: KotlinString? = null,
  public var _onsetDateTime: Element? = null,
  public var onsetAge: Age? = null,
  public var onsetPeriod: Period? = null,
  public var onsetRange: Range? = null,
  public var onsetString: KotlinString? = null,
  public var _onsetString: Element? = null,
  public var abatementDateTime: KotlinString? = null,
  public var _abatementDateTime: Element? = null,
  public var abatementAge: Age? = null,
  public var abatementPeriod: Period? = null,
  public var abatementRange: Range? = null,
  public var abatementString: KotlinString? = null,
  public var _abatementString: Element? = null,
  public var recordedDate: KotlinString? = null,
  public var _recordedDate: Element? = null,
  public var recorder: Reference? = null,
  public var asserter: Reference? = null,
  public var stage: List<Condition.Stage>? = null,
  public var evidence: List<Condition.Evidence>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): Condition =
    Condition().apply {
      id = this@ConditionSurrogate.id
      meta = this@ConditionSurrogate.meta
      implicitRules =
        Uri.of(this@ConditionSurrogate.implicitRules, this@ConditionSurrogate._implicitRules)
      language = Code.of(this@ConditionSurrogate.language, this@ConditionSurrogate._language)
      text = this@ConditionSurrogate.text
      contained = this@ConditionSurrogate.contained
      extension = this@ConditionSurrogate.extension
      modifierExtension = this@ConditionSurrogate.modifierExtension
      identifier = this@ConditionSurrogate.identifier
      clinicalStatus = this@ConditionSurrogate.clinicalStatus
      verificationStatus = this@ConditionSurrogate.verificationStatus
      category = this@ConditionSurrogate.category
      severity = this@ConditionSurrogate.severity
      code = this@ConditionSurrogate.code
      bodySite = this@ConditionSurrogate.bodySite
      subject = this@ConditionSurrogate.subject
      encounter = this@ConditionSurrogate.encounter
      onset =
        Condition.Onset?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ConditionSurrogate.onsetDateTime),
            this@ConditionSurrogate._onsetDateTime,
          ),
          this@ConditionSurrogate.onsetAge,
          this@ConditionSurrogate.onsetPeriod,
          this@ConditionSurrogate.onsetRange,
          R4bString.of(this@ConditionSurrogate.onsetString, this@ConditionSurrogate._onsetString),
        )
      abatement =
        Condition.Abatement?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ConditionSurrogate.abatementDateTime),
            this@ConditionSurrogate._abatementDateTime,
          ),
          this@ConditionSurrogate.abatementAge,
          this@ConditionSurrogate.abatementPeriod,
          this@ConditionSurrogate.abatementRange,
          R4bString.of(
            this@ConditionSurrogate.abatementString,
            this@ConditionSurrogate._abatementString,
          ),
        )
      recordedDate =
        DateTime.of(
          FhirDateTime.fromString(this@ConditionSurrogate.recordedDate),
          this@ConditionSurrogate._recordedDate,
        )
      recorder = this@ConditionSurrogate.recorder
      asserter = this@ConditionSurrogate.asserter
      stage = this@ConditionSurrogate.stage
      evidence = this@ConditionSurrogate.evidence
      note = this@ConditionSurrogate.note
    }

  public companion object {
    public fun fromModel(model: Condition): ConditionSurrogate =
      with(model) {
        ConditionSurrogate().apply {
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
          clinicalStatus = this@with.clinicalStatus
          verificationStatus = this@with.verificationStatus
          category = this@with.category
          severity = this@with.severity
          code = this@with.code
          bodySite = this@with.bodySite
          subject = this@with.subject
          encounter = this@with.encounter
          onsetDateTime = this@with.onset?.asDateTime()?.value?.value?.toString()
          _onsetDateTime = this@with.onset?.asDateTime()?.value?.toElement()
          onsetAge = this@with.onset?.asAge()?.value
          onsetPeriod = this@with.onset?.asPeriod()?.value
          onsetRange = this@with.onset?.asRange()?.value
          onsetString = this@with.onset?.asString()?.value?.value
          _onsetString = this@with.onset?.asString()?.value?.toElement()
          abatementDateTime = this@with.abatement?.asDateTime()?.value?.value?.toString()
          _abatementDateTime = this@with.abatement?.asDateTime()?.value?.toElement()
          abatementAge = this@with.abatement?.asAge()?.value
          abatementPeriod = this@with.abatement?.asPeriod()?.value
          abatementRange = this@with.abatement?.asRange()?.value
          abatementString = this@with.abatement?.asString()?.value?.value
          _abatementString = this@with.abatement?.asString()?.value?.toElement()
          recordedDate = this@with.recordedDate?.value?.toString()
          _recordedDate = this@with.recordedDate?.toElement()
          recorder = this@with.recorder
          asserter = this@with.asserter
          stage = this@with.stage
          evidence = this@with.evidence
          note = this@with.note
        }
      }
  }
}
