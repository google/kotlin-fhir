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
import com.google.fhir.model.r5.AllergyIntolerance
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
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
internal data class AllergyIntoleranceParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): AllergyIntolerance.Participant =
    AllergyIntolerance.Participant(
      id = this@AllergyIntoleranceParticipantSurrogate.id,
      extension = this@AllergyIntoleranceParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AllergyIntoleranceParticipantSurrogate.modifierExtension ?: mutableListOf(),
      function = this@AllergyIntoleranceParticipantSurrogate.function,
      actor = this@AllergyIntoleranceParticipantSurrogate.actor,
    )

  public companion object {
    public fun fromModel(
      model: AllergyIntolerance.Participant
    ): AllergyIntoleranceParticipantSurrogate =
      with(model) {
        AllergyIntoleranceParticipantSurrogate(
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
internal data class AllergyIntoleranceReactionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var substance: CodeableConcept? = null,
  public var manifestation: MutableList<CodeableReference>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var onset: KotlinString? = null,
  public var _onset: Element? = null,
  public var severity: KotlinString? = null,
  public var _severity: Element? = null,
  public var exposureRoute: CodeableConcept? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): AllergyIntolerance.Reaction =
    AllergyIntolerance.Reaction(
      id = this@AllergyIntoleranceReactionSurrogate.id,
      extension = this@AllergyIntoleranceReactionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AllergyIntoleranceReactionSurrogate.modifierExtension ?: mutableListOf(),
      substance = this@AllergyIntoleranceReactionSurrogate.substance,
      manifestation = this@AllergyIntoleranceReactionSurrogate.manifestation ?: mutableListOf(),
      description =
        R5String.of(
          this@AllergyIntoleranceReactionSurrogate.description,
          this@AllergyIntoleranceReactionSurrogate._description,
        ),
      onset =
        DateTime.of(
          FhirDateTime.fromString(this@AllergyIntoleranceReactionSurrogate.onset),
          this@AllergyIntoleranceReactionSurrogate._onset,
        ),
      severity =
        this@AllergyIntoleranceReactionSurrogate.severity?.let {
          Enumeration.of(
            com.google.fhir.model.r5.AllergyIntolerance.AllergyIntoleranceSeverity.fromCode(it!!),
            this@AllergyIntoleranceReactionSurrogate._severity,
          )
        },
      exposureRoute = this@AllergyIntoleranceReactionSurrogate.exposureRoute,
      note = this@AllergyIntoleranceReactionSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AllergyIntolerance.Reaction): AllergyIntoleranceReactionSurrogate =
      with(model) {
        AllergyIntoleranceReactionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          substance = this@with.substance,
          manifestation = this@with.manifestation.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          onset = this@with.onset?.value?.toString(),
          _onset = this@with.onset?.toElement(),
          severity = this@with.severity?.value?.getCode(),
          _severity = this@with.severity?.toElement(),
          exposureRoute = this@with.exposureRoute,
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class AllergyIntoleranceOnsetSurrogate(
  public var onsetDateTime: KotlinString? = null,
  public var _onsetDateTime: Element? = null,
  public var onsetAge: Age? = null,
  public var onsetPeriod: Period? = null,
  public var onsetRange: Range? = null,
  public var onsetString: KotlinString? = null,
  public var _onsetString: Element? = null,
) {
  public fun toModel(): AllergyIntolerance.Onset =
    AllergyIntolerance.Onset.from(
      DateTime.of(
        FhirDateTime.fromString(this@AllergyIntoleranceOnsetSurrogate.onsetDateTime),
        this@AllergyIntoleranceOnsetSurrogate._onsetDateTime,
      ),
      this@AllergyIntoleranceOnsetSurrogate.onsetAge,
      this@AllergyIntoleranceOnsetSurrogate.onsetPeriod,
      this@AllergyIntoleranceOnsetSurrogate.onsetRange,
      R5String.of(
        this@AllergyIntoleranceOnsetSurrogate.onsetString,
        this@AllergyIntoleranceOnsetSurrogate._onsetString,
      ),
    )!!

  public companion object {
    public fun fromModel(model: AllergyIntolerance.Onset): AllergyIntoleranceOnsetSurrogate =
      with(model) {
        AllergyIntoleranceOnsetSurrogate(
          onsetDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _onsetDateTime = this@with.asDateTime()?.value?.toElement(),
          onsetAge = this@with.asAge()?.value,
          onsetPeriod = this@with.asPeriod()?.value,
          onsetRange = this@with.asRange()?.value,
          onsetString = this@with.asString()?.value?.value,
          _onsetString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class AllergyIntoleranceSurrogate(
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
  public var type: CodeableConcept? = null,
  public var category: MutableList<KotlinString?>? = null,
  public var _category: MutableList<Element?>? = null,
  public var criticality: KotlinString? = null,
  public var _criticality: Element? = null,
  public var code: CodeableConcept? = null,
  public var patient: Reference,
  public var encounter: Reference? = null,
  public var onset: AllergyIntolerance.Onset? = null,
  public var recordedDate: KotlinString? = null,
  public var _recordedDate: Element? = null,
  public var participant: MutableList<AllergyIntolerance.Participant>? = null,
  public var lastOccurrence: KotlinString? = null,
  public var _lastOccurrence: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var reaction: MutableList<AllergyIntolerance.Reaction>? = null,
) {
  public fun toModel(): AllergyIntolerance =
    AllergyIntolerance(
      id = this@AllergyIntoleranceSurrogate.id,
      meta = this@AllergyIntoleranceSurrogate.meta,
      implicitRules =
        Uri.of(
          this@AllergyIntoleranceSurrogate.implicitRules,
          this@AllergyIntoleranceSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@AllergyIntoleranceSurrogate.language,
          this@AllergyIntoleranceSurrogate._language,
        ),
      text = this@AllergyIntoleranceSurrogate.text,
      contained = this@AllergyIntoleranceSurrogate.contained ?: mutableListOf(),
      extension = this@AllergyIntoleranceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AllergyIntoleranceSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@AllergyIntoleranceSurrogate.identifier ?: mutableListOf(),
      clinicalStatus = this@AllergyIntoleranceSurrogate.clinicalStatus,
      verificationStatus = this@AllergyIntoleranceSurrogate.verificationStatus,
      type = this@AllergyIntoleranceSurrogate.type,
      category =
        if (
          this@AllergyIntoleranceSurrogate.category == null &&
            this@AllergyIntoleranceSurrogate._category == null
        ) {
          mutableListOf()
        } else {
          (this@AllergyIntoleranceSurrogate.category
              ?: List(this@AllergyIntoleranceSurrogate._category!!.size) { null })
            .zip(
              this@AllergyIntoleranceSurrogate._category
                ?: List(this@AllergyIntoleranceSurrogate.category!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.AllergyIntolerance.AllergyIntoleranceCategory.fromCode(
                    it!!
                  )!!
                },
                element,
              )
            }
            .toMutableList()
        },
      criticality =
        this@AllergyIntoleranceSurrogate.criticality?.let {
          Enumeration.of(
            com.google.fhir.model.r5.AllergyIntolerance.AllergyIntoleranceCriticality.fromCode(
              it!!
            ),
            this@AllergyIntoleranceSurrogate._criticality,
          )
        },
      code = this@AllergyIntoleranceSurrogate.code,
      patient = this@AllergyIntoleranceSurrogate.patient,
      encounter = this@AllergyIntoleranceSurrogate.encounter,
      onset = this@AllergyIntoleranceSurrogate.onset,
      recordedDate =
        DateTime.of(
          FhirDateTime.fromString(this@AllergyIntoleranceSurrogate.recordedDate),
          this@AllergyIntoleranceSurrogate._recordedDate,
        ),
      participant = this@AllergyIntoleranceSurrogate.participant ?: mutableListOf(),
      lastOccurrence =
        DateTime.of(
          FhirDateTime.fromString(this@AllergyIntoleranceSurrogate.lastOccurrence),
          this@AllergyIntoleranceSurrogate._lastOccurrence,
        ),
      note = this@AllergyIntoleranceSurrogate.note ?: mutableListOf(),
      reaction = this@AllergyIntoleranceSurrogate.reaction ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AllergyIntolerance): AllergyIntoleranceSurrogate =
      with(model) {
        AllergyIntoleranceSurrogate(
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
          type = this@with.type,
          category =
            this@with.category
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _category =
            this@with.category
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          criticality = this@with.criticality?.value?.getCode(),
          _criticality = this@with.criticality?.toElement(),
          code = this@with.code,
          patient = this@with.patient,
          encounter = this@with.encounter,
          onset = this@with.onset,
          recordedDate = this@with.recordedDate?.value?.toString(),
          _recordedDate = this@with.recordedDate?.toElement(),
          participant = this@with.participant.takeUnless { it.all { it == null } },
          lastOccurrence = this@with.lastOccurrence?.value?.toString(),
          _lastOccurrence = this@with.lastOccurrence?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          reaction = this@with.reaction.takeUnless { it.all { it == null } },
        )
      }
  }
}
