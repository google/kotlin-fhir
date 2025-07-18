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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FamilyMemberHistory
import com.google.fhir.model.r5.FhirDate
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
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class FamilyMemberHistoryParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): FamilyMemberHistory.Participant =
    FamilyMemberHistory.Participant(
      id = this@FamilyMemberHistoryParticipantSurrogate.id,
      extension = this@FamilyMemberHistoryParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@FamilyMemberHistoryParticipantSurrogate.modifierExtension ?: mutableListOf(),
      function = this@FamilyMemberHistoryParticipantSurrogate.function,
      actor = this@FamilyMemberHistoryParticipantSurrogate.actor,
    )

  public companion object {
    public fun fromModel(
      model: FamilyMemberHistory.Participant
    ): FamilyMemberHistoryParticipantSurrogate =
      with(model) {
        FamilyMemberHistoryParticipantSurrogate(
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
internal data class FamilyMemberHistoryConditionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var outcome: CodeableConcept? = null,
  public var contributedToDeath: KotlinBoolean? = null,
  public var _contributedToDeath: Element? = null,
  public var onsetAge: Age? = null,
  public var onsetRange: Range? = null,
  public var onsetPeriod: Period? = null,
  public var onsetString: KotlinString? = null,
  public var _onsetString: Element? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): FamilyMemberHistory.Condition =
    FamilyMemberHistory.Condition(
      id = this@FamilyMemberHistoryConditionSurrogate.id,
      extension = this@FamilyMemberHistoryConditionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@FamilyMemberHistoryConditionSurrogate.modifierExtension ?: mutableListOf(),
      code = this@FamilyMemberHistoryConditionSurrogate.code,
      outcome = this@FamilyMemberHistoryConditionSurrogate.outcome,
      contributedToDeath =
        R5Boolean.of(
          this@FamilyMemberHistoryConditionSurrogate.contributedToDeath,
          this@FamilyMemberHistoryConditionSurrogate._contributedToDeath,
        ),
      onset =
        FamilyMemberHistory.Condition.Onset?.from(
          this@FamilyMemberHistoryConditionSurrogate.onsetAge,
          this@FamilyMemberHistoryConditionSurrogate.onsetRange,
          this@FamilyMemberHistoryConditionSurrogate.onsetPeriod,
          R5String.of(
            this@FamilyMemberHistoryConditionSurrogate.onsetString,
            this@FamilyMemberHistoryConditionSurrogate._onsetString,
          ),
        ),
      note = this@FamilyMemberHistoryConditionSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: FamilyMemberHistory.Condition
    ): FamilyMemberHistoryConditionSurrogate =
      with(model) {
        FamilyMemberHistoryConditionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          outcome = this@with.outcome,
          contributedToDeath = this@with.contributedToDeath?.value,
          _contributedToDeath = this@with.contributedToDeath?.toElement(),
          onsetAge = this@with.onset?.asAge()?.value,
          onsetRange = this@with.onset?.asRange()?.value,
          onsetPeriod = this@with.onset?.asPeriod()?.value,
          onsetString = this@with.onset?.asString()?.value?.value,
          _onsetString = this@with.onset?.asString()?.value?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class FamilyMemberHistoryProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var outcome: CodeableConcept? = null,
  public var contributedToDeath: KotlinBoolean? = null,
  public var _contributedToDeath: Element? = null,
  public var performedAge: Age? = null,
  public var performedRange: Range? = null,
  public var performedPeriod: Period? = null,
  public var performedString: KotlinString? = null,
  public var _performedString: Element? = null,
  public var performedDateTime: KotlinString? = null,
  public var _performedDateTime: Element? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): FamilyMemberHistory.Procedure =
    FamilyMemberHistory.Procedure(
      id = this@FamilyMemberHistoryProcedureSurrogate.id,
      extension = this@FamilyMemberHistoryProcedureSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@FamilyMemberHistoryProcedureSurrogate.modifierExtension ?: mutableListOf(),
      code = this@FamilyMemberHistoryProcedureSurrogate.code,
      outcome = this@FamilyMemberHistoryProcedureSurrogate.outcome,
      contributedToDeath =
        R5Boolean.of(
          this@FamilyMemberHistoryProcedureSurrogate.contributedToDeath,
          this@FamilyMemberHistoryProcedureSurrogate._contributedToDeath,
        ),
      performed =
        FamilyMemberHistory.Procedure.Performed?.from(
          this@FamilyMemberHistoryProcedureSurrogate.performedAge,
          this@FamilyMemberHistoryProcedureSurrogate.performedRange,
          this@FamilyMemberHistoryProcedureSurrogate.performedPeriod,
          R5String.of(
            this@FamilyMemberHistoryProcedureSurrogate.performedString,
            this@FamilyMemberHistoryProcedureSurrogate._performedString,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@FamilyMemberHistoryProcedureSurrogate.performedDateTime),
            this@FamilyMemberHistoryProcedureSurrogate._performedDateTime,
          ),
        ),
      note = this@FamilyMemberHistoryProcedureSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: FamilyMemberHistory.Procedure
    ): FamilyMemberHistoryProcedureSurrogate =
      with(model) {
        FamilyMemberHistoryProcedureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          outcome = this@with.outcome,
          contributedToDeath = this@with.contributedToDeath?.value,
          _contributedToDeath = this@with.contributedToDeath?.toElement(),
          performedAge = this@with.performed?.asAge()?.value,
          performedRange = this@with.performed?.asRange()?.value,
          performedPeriod = this@with.performed?.asPeriod()?.value,
          performedString = this@with.performed?.asString()?.value?.value,
          _performedString = this@with.performed?.asString()?.value?.toElement(),
          performedDateTime = this@with.performed?.asDateTime()?.value?.value?.toString(),
          _performedDateTime = this@with.performed?.asDateTime()?.value?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class FamilyMemberHistorySurrogate(
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
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var dataAbsentReason: CodeableConcept? = null,
  public var patient: Reference,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var participant: MutableList<FamilyMemberHistory.Participant>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var relationship: CodeableConcept,
  public var sex: CodeableConcept? = null,
  public var bornPeriod: Period? = null,
  public var bornDate: KotlinString? = null,
  public var _bornDate: Element? = null,
  public var bornString: KotlinString? = null,
  public var _bornString: Element? = null,
  public var ageAge: Age? = null,
  public var ageRange: Range? = null,
  public var ageString: KotlinString? = null,
  public var _ageString: Element? = null,
  public var estimatedAge: KotlinBoolean? = null,
  public var _estimatedAge: Element? = null,
  public var deceasedBoolean: KotlinBoolean? = null,
  public var _deceasedBoolean: Element? = null,
  public var deceasedAge: Age? = null,
  public var deceasedRange: Range? = null,
  public var deceasedDate: KotlinString? = null,
  public var _deceasedDate: Element? = null,
  public var deceasedString: KotlinString? = null,
  public var _deceasedString: Element? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var condition: MutableList<FamilyMemberHistory.Condition>? = null,
  public var procedure: MutableList<FamilyMemberHistory.Procedure>? = null,
) {
  public fun toModel(): FamilyMemberHistory =
    FamilyMemberHistory(
      id = this@FamilyMemberHistorySurrogate.id,
      meta = this@FamilyMemberHistorySurrogate.meta,
      implicitRules =
        Uri.of(
          this@FamilyMemberHistorySurrogate.implicitRules,
          this@FamilyMemberHistorySurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@FamilyMemberHistorySurrogate.language,
          this@FamilyMemberHistorySurrogate._language,
        ),
      text = this@FamilyMemberHistorySurrogate.text,
      contained = this@FamilyMemberHistorySurrogate.contained ?: mutableListOf(),
      extension = this@FamilyMemberHistorySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@FamilyMemberHistorySurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@FamilyMemberHistorySurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@FamilyMemberHistorySurrogate.instantiatesCanonical == null &&
            this@FamilyMemberHistorySurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@FamilyMemberHistorySurrogate.instantiatesCanonical
              ?: List(this@FamilyMemberHistorySurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@FamilyMemberHistorySurrogate._instantiatesCanonical
                ?: List(this@FamilyMemberHistorySurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@FamilyMemberHistorySurrogate.instantiatesUri == null &&
            this@FamilyMemberHistorySurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@FamilyMemberHistorySurrogate.instantiatesUri
              ?: List(this@FamilyMemberHistorySurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@FamilyMemberHistorySurrogate._instantiatesUri
                ?: List(this@FamilyMemberHistorySurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r5.FamilyMemberHistory.FamilyHistoryStatus.fromCode(
            this@FamilyMemberHistorySurrogate.status!!
          ),
          this@FamilyMemberHistorySurrogate._status,
        ),
      dataAbsentReason = this@FamilyMemberHistorySurrogate.dataAbsentReason,
      patient = this@FamilyMemberHistorySurrogate.patient,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@FamilyMemberHistorySurrogate.date),
          this@FamilyMemberHistorySurrogate._date,
        ),
      participant = this@FamilyMemberHistorySurrogate.participant ?: mutableListOf(),
      name =
        R5String.of(
          this@FamilyMemberHistorySurrogate.name,
          this@FamilyMemberHistorySurrogate._name,
        ),
      relationship = this@FamilyMemberHistorySurrogate.relationship,
      sex = this@FamilyMemberHistorySurrogate.sex,
      born =
        FamilyMemberHistory.Born?.from(
          this@FamilyMemberHistorySurrogate.bornPeriod,
          Date.of(
            FhirDate.fromString(this@FamilyMemberHistorySurrogate.bornDate),
            this@FamilyMemberHistorySurrogate._bornDate,
          ),
          R5String.of(
            this@FamilyMemberHistorySurrogate.bornString,
            this@FamilyMemberHistorySurrogate._bornString,
          ),
        ),
      age =
        FamilyMemberHistory.Age?.from(
          this@FamilyMemberHistorySurrogate.ageAge,
          this@FamilyMemberHistorySurrogate.ageRange,
          R5String.of(
            this@FamilyMemberHistorySurrogate.ageString,
            this@FamilyMemberHistorySurrogate._ageString,
          ),
        ),
      estimatedAge =
        R5Boolean.of(
          this@FamilyMemberHistorySurrogate.estimatedAge,
          this@FamilyMemberHistorySurrogate._estimatedAge,
        ),
      deceased =
        FamilyMemberHistory.Deceased?.from(
          R5Boolean.of(
            this@FamilyMemberHistorySurrogate.deceasedBoolean,
            this@FamilyMemberHistorySurrogate._deceasedBoolean,
          ),
          this@FamilyMemberHistorySurrogate.deceasedAge,
          this@FamilyMemberHistorySurrogate.deceasedRange,
          Date.of(
            FhirDate.fromString(this@FamilyMemberHistorySurrogate.deceasedDate),
            this@FamilyMemberHistorySurrogate._deceasedDate,
          ),
          R5String.of(
            this@FamilyMemberHistorySurrogate.deceasedString,
            this@FamilyMemberHistorySurrogate._deceasedString,
          ),
        ),
      reason = this@FamilyMemberHistorySurrogate.reason ?: mutableListOf(),
      note = this@FamilyMemberHistorySurrogate.note ?: mutableListOf(),
      condition = this@FamilyMemberHistorySurrogate.condition ?: mutableListOf(),
      procedure = this@FamilyMemberHistorySurrogate.procedure ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: FamilyMemberHistory): FamilyMemberHistorySurrogate =
      with(model) {
        FamilyMemberHistorySurrogate(
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
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          dataAbsentReason = this@with.dataAbsentReason,
          patient = this@with.patient,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          participant = this@with.participant.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          relationship = this@with.relationship,
          sex = this@with.sex,
          bornPeriod = this@with.born?.asPeriod()?.value,
          bornDate = this@with.born?.asDate()?.value?.value?.toString(),
          _bornDate = this@with.born?.asDate()?.value?.toElement(),
          bornString = this@with.born?.asString()?.value?.value,
          _bornString = this@with.born?.asString()?.value?.toElement(),
          ageAge = this@with.age?.asAge()?.value,
          ageRange = this@with.age?.asRange()?.value,
          ageString = this@with.age?.asString()?.value?.value,
          _ageString = this@with.age?.asString()?.value?.toElement(),
          estimatedAge = this@with.estimatedAge?.value,
          _estimatedAge = this@with.estimatedAge?.toElement(),
          deceasedBoolean = this@with.deceased?.asBoolean()?.value?.value,
          _deceasedBoolean = this@with.deceased?.asBoolean()?.value?.toElement(),
          deceasedAge = this@with.deceased?.asAge()?.value,
          deceasedRange = this@with.deceased?.asRange()?.value,
          deceasedDate = this@with.deceased?.asDate()?.value?.value?.toString(),
          _deceasedDate = this@with.deceased?.asDate()?.value?.toElement(),
          deceasedString = this@with.deceased?.asString()?.value?.value,
          _deceasedString = this@with.deceased?.asString()?.value?.toElement(),
          reason = this@with.reason.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          condition = this@with.condition.takeUnless { it.all { it == null } },
          procedure = this@with.procedure.takeUnless { it.all { it == null } },
        )
      }
  }
}
