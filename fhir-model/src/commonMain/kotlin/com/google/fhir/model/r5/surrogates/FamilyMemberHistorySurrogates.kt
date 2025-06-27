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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class FamilyMemberHistoryParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): FamilyMemberHistory.Participant =
    FamilyMemberHistory.Participant().apply {
      id = this@FamilyMemberHistoryParticipantSurrogate.id
      extension = this@FamilyMemberHistoryParticipantSurrogate.extension
      modifierExtension = this@FamilyMemberHistoryParticipantSurrogate.modifierExtension
      function = this@FamilyMemberHistoryParticipantSurrogate.function
      actor = this@FamilyMemberHistoryParticipantSurrogate.actor
    }

  public companion object {
    public fun fromModel(
      model: FamilyMemberHistory.Participant
    ): FamilyMemberHistoryParticipantSurrogate =
      with(model) {
        FamilyMemberHistoryParticipantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class FamilyMemberHistoryConditionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var outcome: CodeableConcept? = null,
  public var contributedToDeath: KotlinBoolean? = null,
  public var _contributedToDeath: Element? = null,
  public var onsetAge: Age? = null,
  public var onsetRange: Range? = null,
  public var onsetPeriod: Period? = null,
  public var onsetString: KotlinString? = null,
  public var _onsetString: Element? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): FamilyMemberHistory.Condition =
    FamilyMemberHistory.Condition().apply {
      id = this@FamilyMemberHistoryConditionSurrogate.id
      extension = this@FamilyMemberHistoryConditionSurrogate.extension
      modifierExtension = this@FamilyMemberHistoryConditionSurrogate.modifierExtension
      code = this@FamilyMemberHistoryConditionSurrogate.code
      outcome = this@FamilyMemberHistoryConditionSurrogate.outcome
      contributedToDeath =
        R5Boolean.of(
          this@FamilyMemberHistoryConditionSurrogate.contributedToDeath,
          this@FamilyMemberHistoryConditionSurrogate._contributedToDeath,
        )
      onset =
        FamilyMemberHistory.Condition.Onset?.from(
          this@FamilyMemberHistoryConditionSurrogate.onsetAge,
          this@FamilyMemberHistoryConditionSurrogate.onsetRange,
          this@FamilyMemberHistoryConditionSurrogate.onsetPeriod,
          R5String.of(
            this@FamilyMemberHistoryConditionSurrogate.onsetString,
            this@FamilyMemberHistoryConditionSurrogate._onsetString,
          ),
        )
      note = this@FamilyMemberHistoryConditionSurrogate.note
    }

  public companion object {
    public fun fromModel(
      model: FamilyMemberHistory.Condition
    ): FamilyMemberHistoryConditionSurrogate =
      with(model) {
        FamilyMemberHistoryConditionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          outcome = this@with.outcome
          contributedToDeath = this@with.contributedToDeath?.value
          _contributedToDeath = this@with.contributedToDeath?.toElement()
          onsetAge = this@with.onset?.asAge()?.value
          onsetRange = this@with.onset?.asRange()?.value
          onsetPeriod = this@with.onset?.asPeriod()?.value
          onsetString = this@with.onset?.asString()?.value?.value
          _onsetString = this@with.onset?.asString()?.value?.toElement()
          note = this@with.note
        }
      }
  }
}

@Serializable
internal data class FamilyMemberHistoryProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
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
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): FamilyMemberHistory.Procedure =
    FamilyMemberHistory.Procedure().apply {
      id = this@FamilyMemberHistoryProcedureSurrogate.id
      extension = this@FamilyMemberHistoryProcedureSurrogate.extension
      modifierExtension = this@FamilyMemberHistoryProcedureSurrogate.modifierExtension
      code = this@FamilyMemberHistoryProcedureSurrogate.code
      outcome = this@FamilyMemberHistoryProcedureSurrogate.outcome
      contributedToDeath =
        R5Boolean.of(
          this@FamilyMemberHistoryProcedureSurrogate.contributedToDeath,
          this@FamilyMemberHistoryProcedureSurrogate._contributedToDeath,
        )
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
        )
      note = this@FamilyMemberHistoryProcedureSurrogate.note
    }

  public companion object {
    public fun fromModel(
      model: FamilyMemberHistory.Procedure
    ): FamilyMemberHistoryProcedureSurrogate =
      with(model) {
        FamilyMemberHistoryProcedureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          outcome = this@with.outcome
          contributedToDeath = this@with.contributedToDeath?.value
          _contributedToDeath = this@with.contributedToDeath?.toElement()
          performedAge = this@with.performed?.asAge()?.value
          performedRange = this@with.performed?.asRange()?.value
          performedPeriod = this@with.performed?.asPeriod()?.value
          performedString = this@with.performed?.asString()?.value?.value
          _performedString = this@with.performed?.asString()?.value?.toElement()
          performedDateTime = this@with.performed?.asDateTime()?.value?.value?.toString()
          _performedDateTime = this@with.performed?.asDateTime()?.value?.toElement()
          note = this@with.note
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var dataAbsentReason: CodeableConcept? = null,
  public var patient: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var participant: List<FamilyMemberHistory.Participant>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var relationship: CodeableConcept? = null,
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
  public var reason: List<CodeableReference?>? = null,
  public var note: List<Annotation?>? = null,
  public var condition: List<FamilyMemberHistory.Condition>? = null,
  public var procedure: List<FamilyMemberHistory.Procedure>? = null,
) {
  public fun toModel(): FamilyMemberHistory =
    FamilyMemberHistory().apply {
      id = this@FamilyMemberHistorySurrogate.id
      meta = this@FamilyMemberHistorySurrogate.meta
      implicitRules =
        Uri.of(
          this@FamilyMemberHistorySurrogate.implicitRules,
          this@FamilyMemberHistorySurrogate._implicitRules,
        )
      language =
        Code.of(
          this@FamilyMemberHistorySurrogate.language,
          this@FamilyMemberHistorySurrogate._language,
        )
      text = this@FamilyMemberHistorySurrogate.text
      contained = this@FamilyMemberHistorySurrogate.contained
      extension = this@FamilyMemberHistorySurrogate.extension
      modifierExtension = this@FamilyMemberHistorySurrogate.modifierExtension
      identifier = this@FamilyMemberHistorySurrogate.identifier
      instantiatesCanonical =
        if (
          this@FamilyMemberHistorySurrogate.instantiatesCanonical == null &&
            this@FamilyMemberHistorySurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@FamilyMemberHistorySurrogate.instantiatesCanonical
              ?: List(this@FamilyMemberHistorySurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@FamilyMemberHistorySurrogate._instantiatesCanonical
                ?: List(this@FamilyMemberHistorySurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@FamilyMemberHistorySurrogate.instantiatesUri == null &&
            this@FamilyMemberHistorySurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@FamilyMemberHistorySurrogate.instantiatesUri
              ?: List(this@FamilyMemberHistorySurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@FamilyMemberHistorySurrogate._instantiatesUri
                ?: List(this@FamilyMemberHistorySurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      status =
        Enumeration.of(
          this@FamilyMemberHistorySurrogate.status?.let {
            com.google.fhir.model.r5.FamilyMemberHistory.FamilyHistoryStatus.fromCode(it)
          },
          this@FamilyMemberHistorySurrogate._status,
        )
      dataAbsentReason = this@FamilyMemberHistorySurrogate.dataAbsentReason
      patient = this@FamilyMemberHistorySurrogate.patient
      date =
        DateTime.of(
          FhirDateTime.fromString(this@FamilyMemberHistorySurrogate.date),
          this@FamilyMemberHistorySurrogate._date,
        )
      participant = this@FamilyMemberHistorySurrogate.participant
      name =
        R5String.of(this@FamilyMemberHistorySurrogate.name, this@FamilyMemberHistorySurrogate._name)
      relationship = this@FamilyMemberHistorySurrogate.relationship
      sex = this@FamilyMemberHistorySurrogate.sex
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
        )
      age =
        FamilyMemberHistory.Age?.from(
          this@FamilyMemberHistorySurrogate.ageAge,
          this@FamilyMemberHistorySurrogate.ageRange,
          R5String.of(
            this@FamilyMemberHistorySurrogate.ageString,
            this@FamilyMemberHistorySurrogate._ageString,
          ),
        )
      estimatedAge =
        R5Boolean.of(
          this@FamilyMemberHistorySurrogate.estimatedAge,
          this@FamilyMemberHistorySurrogate._estimatedAge,
        )
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
        )
      reason = this@FamilyMemberHistorySurrogate.reason
      note = this@FamilyMemberHistorySurrogate.note
      condition = this@FamilyMemberHistorySurrogate.condition
      procedure = this@FamilyMemberHistorySurrogate.procedure
    }

  public companion object {
    public fun fromModel(model: FamilyMemberHistory): FamilyMemberHistorySurrogate =
      with(model) {
        FamilyMemberHistorySurrogate().apply {
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
          instantiatesCanonical =
            this@with.instantiatesCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          instantiatesUri =
            this@with.instantiatesUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesUri =
            this@with.instantiatesUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          dataAbsentReason = this@with.dataAbsentReason
          patient = this@with.patient
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          participant = this@with.participant
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          relationship = this@with.relationship
          sex = this@with.sex
          bornPeriod = this@with.born?.asPeriod()?.value
          bornDate = this@with.born?.asDate()?.value?.value?.toString()
          _bornDate = this@with.born?.asDate()?.value?.toElement()
          bornString = this@with.born?.asString()?.value?.value
          _bornString = this@with.born?.asString()?.value?.toElement()
          ageAge = this@with.age?.asAge()?.value
          ageRange = this@with.age?.asRange()?.value
          ageString = this@with.age?.asString()?.value?.value
          _ageString = this@with.age?.asString()?.value?.toElement()
          estimatedAge = this@with.estimatedAge?.value
          _estimatedAge = this@with.estimatedAge?.toElement()
          deceasedBoolean = this@with.deceased?.asBoolean()?.value?.value
          _deceasedBoolean = this@with.deceased?.asBoolean()?.value?.toElement()
          deceasedAge = this@with.deceased?.asAge()?.value
          deceasedRange = this@with.deceased?.asRange()?.value
          deceasedDate = this@with.deceased?.asDate()?.value?.value?.toString()
          _deceasedDate = this@with.deceased?.asDate()?.value?.toElement()
          deceasedString = this@with.deceased?.asString()?.value?.value
          _deceasedString = this@with.deceased?.asString()?.value?.toElement()
          reason = this@with.reason
          note = this@with.note
          condition = this@with.condition
          procedure = this@with.procedure
        }
      }
  }
}
