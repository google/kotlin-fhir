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

import com.google.fhir.model.r5.Age
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Condition
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ConditionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): Condition.Participant =
    Condition.Participant(
      id = this@ConditionParticipantSurrogate.id,
      extension = this@ConditionParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConditionParticipantSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ConditionParticipantSurrogate.function,
      actor = this@ConditionParticipantSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: Condition.Participant): ConditionParticipantSurrogate =
      with(model) {
        ConditionParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

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
internal data class ConditionOnsetSurrogate(
  public var onsetDateTime: KotlinString? = null,
  public var _onsetDateTime: Element? = null,
  public var onsetAge: Age? = null,
  public var onsetPeriod: Period? = null,
  public var onsetRange: Range? = null,
  public var onsetString: KotlinString? = null,
  public var _onsetString: Element? = null,
) {
  public fun toModel(): Condition.Onset? =
    Condition.Onset?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ConditionOnsetSurrogate.onsetDateTime),
        this@ConditionOnsetSurrogate._onsetDateTime,
      ),
      this@ConditionOnsetSurrogate.onsetAge,
      this@ConditionOnsetSurrogate.onsetPeriod,
      this@ConditionOnsetSurrogate.onsetRange,
      R5String.of(
        this@ConditionOnsetSurrogate.onsetString,
        this@ConditionOnsetSurrogate._onsetString,
      ),
    )

  public companion object {
    public fun fromModel(model: Condition.Onset): ConditionOnsetSurrogate =
      with(model) {
        ConditionOnsetSurrogate().apply {
          Condition.Onset?.from(
            DateTime.of(
              FhirDateTime.fromString(this@ConditionOnsetSurrogate.onsetDateTime),
              this@ConditionOnsetSurrogate._onsetDateTime,
            ),
            this@ConditionOnsetSurrogate.onsetAge,
            this@ConditionOnsetSurrogate.onsetPeriod,
            this@ConditionOnsetSurrogate.onsetRange,
            R5String.of(
              this@ConditionOnsetSurrogate.onsetString,
              this@ConditionOnsetSurrogate._onsetString,
            ),
          )
        }
      }
  }
}

@Serializable
internal data class ConditionAbatementSurrogate(
  public var abatementDateTime: KotlinString? = null,
  public var _abatementDateTime: Element? = null,
  public var abatementAge: Age? = null,
  public var abatementPeriod: Period? = null,
  public var abatementRange: Range? = null,
  public var abatementString: KotlinString? = null,
  public var _abatementString: Element? = null,
) {
  public fun toModel(): Condition.Abatement? =
    Condition.Abatement?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ConditionAbatementSurrogate.abatementDateTime),
        this@ConditionAbatementSurrogate._abatementDateTime,
      ),
      this@ConditionAbatementSurrogate.abatementAge,
      this@ConditionAbatementSurrogate.abatementPeriod,
      this@ConditionAbatementSurrogate.abatementRange,
      R5String.of(
        this@ConditionAbatementSurrogate.abatementString,
        this@ConditionAbatementSurrogate._abatementString,
      ),
    )

  public companion object {
    public fun fromModel(model: Condition.Abatement): ConditionAbatementSurrogate =
      with(model) {
        ConditionAbatementSurrogate().apply {
          Condition.Abatement?.from(
            DateTime.of(
              FhirDateTime.fromString(this@ConditionAbatementSurrogate.abatementDateTime),
              this@ConditionAbatementSurrogate._abatementDateTime,
            ),
            this@ConditionAbatementSurrogate.abatementAge,
            this@ConditionAbatementSurrogate.abatementPeriod,
            this@ConditionAbatementSurrogate.abatementRange,
            R5String.of(
              this@ConditionAbatementSurrogate.abatementString,
              this@ConditionAbatementSurrogate._abatementString,
            ),
          )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var clinicalStatus: CodeableConcept,
  public var verificationStatus: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var severity: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var recordedDate: KotlinString? = null,
  public var _recordedDate: Element? = null,
  public var participant: MutableList<Condition.Participant>? = null,
  public var stage: MutableList<Condition.Stage>? = null,
  public var evidence: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var onset: Condition.Onset? = null,
  public var abatement: Condition.Abatement? = null,
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
      onset = this@ConditionSurrogate.onset,
      abatement = this@ConditionSurrogate.abatement,
      recordedDate =
        DateTime.of(
          FhirDateTime.fromString(this@ConditionSurrogate.recordedDate),
          this@ConditionSurrogate._recordedDate,
        ),
      participant = this@ConditionSurrogate.participant ?: mutableListOf(),
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
          onset = this@with.onset,
          abatement = this@with.abatement,
          recordedDate = this@with.recordedDate?.value?.toString(),
          _recordedDate = this@with.recordedDate?.toElement(),
          participant = this@with.participant.takeUnless { it.all { it == null } },
          stage = this@with.stage.takeUnless { it.all { it == null } },
          evidence = this@with.evidence.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
