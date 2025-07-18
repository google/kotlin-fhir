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

import com.google.fhir.model.r4.Age
import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Condition
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Range
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
internal data class ConditionStageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var summary: CodeableConcept? = null,
  public var assessment: MutableList<Reference>? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): Condition.Stage =
    Condition.Stage(
      id = this@ConditionStageSurrogate.id,
      extension = this@ConditionStageSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConditionStageSurrogate.modifierExtension ?: mutableListOf(),
      summary = this@ConditionStageSurrogate.summary,
      assessment = this@ConditionStageSurrogate.assessment ?: mutableListOf(),
      type = this@ConditionStageSurrogate.type,
    )

  public companion object {
    public fun fromModel(model: Condition.Stage): ConditionStageSurrogate =
      with(model) {
        ConditionStageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          summary = this@with.summary,
          assessment = this@with.assessment.takeUnless { it.all { it == null } },
          type = this@with.type,
        )
      }
  }
}

@Serializable
internal data class ConditionEvidenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var detail: MutableList<Reference>? = null,
) {
  public fun toModel(): Condition.Evidence =
    Condition.Evidence(
      id = this@ConditionEvidenceSurrogate.id,
      extension = this@ConditionEvidenceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConditionEvidenceSurrogate.modifierExtension ?: mutableListOf(),
      code = this@ConditionEvidenceSurrogate.code ?: mutableListOf(),
      detail = this@ConditionEvidenceSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Condition.Evidence): ConditionEvidenceSurrogate =
      with(model) {
        ConditionEvidenceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var clinicalStatus: CodeableConcept? = null,
  public var verificationStatus: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var severity: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var subject: Reference,
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
  public var stage: MutableList<Condition.Stage>? = null,
  public var evidence: MutableList<Condition.Evidence>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): Condition =
    Condition(
      id = this@ConditionSurrogate.id,
      meta = this@ConditionSurrogate.meta,
      implicitRules =
        Uri.of(this@ConditionSurrogate.implicitRules, this@ConditionSurrogate._implicitRules),
      language = Code.of(this@ConditionSurrogate.language, this@ConditionSurrogate._language),
      text = this@ConditionSurrogate.text,
      contained = this@ConditionSurrogate.contained ?: mutableListOf(),
      extension = this@ConditionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConditionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ConditionSurrogate.identifier ?: mutableListOf(),
      clinicalStatus = this@ConditionSurrogate.clinicalStatus,
      verificationStatus = this@ConditionSurrogate.verificationStatus,
      category = this@ConditionSurrogate.category ?: mutableListOf(),
      severity = this@ConditionSurrogate.severity,
      code = this@ConditionSurrogate.code,
      bodySite = this@ConditionSurrogate.bodySite ?: mutableListOf(),
      subject = this@ConditionSurrogate.subject,
      encounter = this@ConditionSurrogate.encounter,
      onset =
        Condition.Onset?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ConditionSurrogate.onsetDateTime),
            this@ConditionSurrogate._onsetDateTime,
          ),
          this@ConditionSurrogate.onsetAge,
          this@ConditionSurrogate.onsetPeriod,
          this@ConditionSurrogate.onsetRange,
          R4String.of(this@ConditionSurrogate.onsetString, this@ConditionSurrogate._onsetString),
        ),
      abatement =
        Condition.Abatement?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ConditionSurrogate.abatementDateTime),
            this@ConditionSurrogate._abatementDateTime,
          ),
          this@ConditionSurrogate.abatementAge,
          this@ConditionSurrogate.abatementPeriod,
          this@ConditionSurrogate.abatementRange,
          R4String.of(
            this@ConditionSurrogate.abatementString,
            this@ConditionSurrogate._abatementString,
          ),
        ),
      recordedDate =
        DateTime.of(
          FhirDateTime.fromString(this@ConditionSurrogate.recordedDate),
          this@ConditionSurrogate._recordedDate,
        ),
      recorder = this@ConditionSurrogate.recorder,
      asserter = this@ConditionSurrogate.asserter,
      stage = this@ConditionSurrogate.stage ?: mutableListOf(),
      evidence = this@ConditionSurrogate.evidence ?: mutableListOf(),
      note = this@ConditionSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Condition): ConditionSurrogate =
      with(model) {
        ConditionSurrogate(
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
          clinicalStatus = this@with.clinicalStatus,
          verificationStatus = this@with.verificationStatus,
          category = this@with.category.takeUnless { it.all { it == null } },
          severity = this@with.severity,
          code = this@with.code,
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          encounter = this@with.encounter,
          onsetDateTime = this@with.onset?.asDateTime()?.value?.value?.toString(),
          _onsetDateTime = this@with.onset?.asDateTime()?.value?.toElement(),
          onsetAge = this@with.onset?.asAge()?.value,
          onsetPeriod = this@with.onset?.asPeriod()?.value,
          onsetRange = this@with.onset?.asRange()?.value,
          onsetString = this@with.onset?.asString()?.value?.value,
          _onsetString = this@with.onset?.asString()?.value?.toElement(),
          abatementDateTime = this@with.abatement?.asDateTime()?.value?.value?.toString(),
          _abatementDateTime = this@with.abatement?.asDateTime()?.value?.toElement(),
          abatementAge = this@with.abatement?.asAge()?.value,
          abatementPeriod = this@with.abatement?.asPeriod()?.value,
          abatementRange = this@with.abatement?.asRange()?.value,
          abatementString = this@with.abatement?.asString()?.value?.value,
          _abatementString = this@with.abatement?.asString()?.value?.toElement(),
          recordedDate = this@with.recordedDate?.value?.toString(),
          _recordedDate = this@with.recordedDate?.toElement(),
          recorder = this@with.recorder,
          asserter = this@with.asserter,
          stage = this@with.stage.takeUnless { it.all { it == null } },
          evidence = this@with.evidence.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
