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
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Encounter
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.VirtualServiceDetail
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EncounterParticipantSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var period: Period? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): Encounter.Participant =
    Encounter.Participant().apply {
      id = this@EncounterParticipantSurrogate.id
      extension = this@EncounterParticipantSurrogate.extension
      modifierExtension = this@EncounterParticipantSurrogate.modifierExtension
      type = this@EncounterParticipantSurrogate.type
      period = this@EncounterParticipantSurrogate.period
      actor = this@EncounterParticipantSurrogate.actor
    }

  public companion object {
    public fun fromModel(model: Encounter.Participant): EncounterParticipantSurrogate =
      with(model) {
        EncounterParticipantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          period = this@with.period
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class EncounterReasonSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var use: List<CodeableConcept?>? = null,
  public var `value`: List<CodeableReference?>? = null,
) {
  public fun toModel(): Encounter.Reason =
    Encounter.Reason().apply {
      id = this@EncounterReasonSurrogate.id
      extension = this@EncounterReasonSurrogate.extension
      modifierExtension = this@EncounterReasonSurrogate.modifierExtension
      use = this@EncounterReasonSurrogate.use
      `value` = this@EncounterReasonSurrogate.`value`
    }

  public companion object {
    public fun fromModel(model: Encounter.Reason): EncounterReasonSurrogate =
      with(model) {
        EncounterReasonSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          use = this@with.use
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class EncounterDiagnosisSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var condition: List<CodeableReference?>? = null,
  public var use: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Encounter.Diagnosis =
    Encounter.Diagnosis().apply {
      id = this@EncounterDiagnosisSurrogate.id
      extension = this@EncounterDiagnosisSurrogate.extension
      modifierExtension = this@EncounterDiagnosisSurrogate.modifierExtension
      condition = this@EncounterDiagnosisSurrogate.condition
      use = this@EncounterDiagnosisSurrogate.use
    }

  public companion object {
    public fun fromModel(model: Encounter.Diagnosis): EncounterDiagnosisSurrogate =
      with(model) {
        EncounterDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          condition = this@with.condition
          use = this@with.use
        }
      }
  }
}

@Serializable
internal data class EncounterAdmissionSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var preAdmissionIdentifier: Identifier? = null,
  public var origin: Reference? = null,
  public var admitSource: CodeableConcept? = null,
  public var reAdmission: CodeableConcept? = null,
  public var destination: Reference? = null,
  public var dischargeDisposition: CodeableConcept? = null,
) {
  public fun toModel(): Encounter.Admission =
    Encounter.Admission().apply {
      id = this@EncounterAdmissionSurrogate.id
      extension = this@EncounterAdmissionSurrogate.extension
      modifierExtension = this@EncounterAdmissionSurrogate.modifierExtension
      preAdmissionIdentifier = this@EncounterAdmissionSurrogate.preAdmissionIdentifier
      origin = this@EncounterAdmissionSurrogate.origin
      admitSource = this@EncounterAdmissionSurrogate.admitSource
      reAdmission = this@EncounterAdmissionSurrogate.reAdmission
      destination = this@EncounterAdmissionSurrogate.destination
      dischargeDisposition = this@EncounterAdmissionSurrogate.dischargeDisposition
    }

  public companion object {
    public fun fromModel(model: Encounter.Admission): EncounterAdmissionSurrogate =
      with(model) {
        EncounterAdmissionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          preAdmissionIdentifier = this@with.preAdmissionIdentifier
          origin = this@with.origin
          admitSource = this@with.admitSource
          reAdmission = this@with.reAdmission
          destination = this@with.destination
          dischargeDisposition = this@with.dischargeDisposition
        }
      }
  }
}

@Serializable
internal data class EncounterLocationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var location: Reference? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var form: CodeableConcept? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Encounter.Location =
    Encounter.Location().apply {
      id = this@EncounterLocationSurrogate.id
      extension = this@EncounterLocationSurrogate.extension
      modifierExtension = this@EncounterLocationSurrogate.modifierExtension
      location = this@EncounterLocationSurrogate.location
      status =
        Enumeration.of(
          this@EncounterLocationSurrogate.status?.let {
            com.google.fhir.model.r5.Encounter.EncounterLocationStatus.fromCode(it)
          },
          this@EncounterLocationSurrogate._status,
        )
      form = this@EncounterLocationSurrogate.form
      period = this@EncounterLocationSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Encounter.Location): EncounterLocationSurrogate =
      with(model) {
        EncounterLocationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          location = this@with.location
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          form = this@with.form
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class EncounterSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var `class`: List<CodeableConcept?>? = null,
  public var priority: CodeableConcept? = null,
  public var type: List<CodeableConcept?>? = null,
  public var serviceType: List<CodeableReference?>? = null,
  public var subject: Reference? = null,
  public var subjectStatus: CodeableConcept? = null,
  public var episodeOfCare: List<Reference?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var careTeam: List<Reference?>? = null,
  public var partOf: Reference? = null,
  public var serviceProvider: Reference? = null,
  public var participant: List<Encounter.Participant>? = null,
  public var appointment: List<Reference?>? = null,
  public var virtualService: List<VirtualServiceDetail?>? = null,
  public var actualPeriod: Period? = null,
  public var plannedStartDate: String? = null,
  public var _plannedStartDate: Element? = null,
  public var plannedEndDate: String? = null,
  public var _plannedEndDate: Element? = null,
  public var length: Duration? = null,
  public var reason: List<Encounter.Reason>? = null,
  public var diagnosis: List<Encounter.Diagnosis>? = null,
  public var account: List<Reference?>? = null,
  public var dietPreference: List<CodeableConcept?>? = null,
  public var specialArrangement: List<CodeableConcept?>? = null,
  public var specialCourtesy: List<CodeableConcept?>? = null,
  public var admission: Encounter.Admission? = null,
  public var location: List<Encounter.Location>? = null,
) {
  public fun toModel(): Encounter =
    Encounter().apply {
      id = this@EncounterSurrogate.id
      meta = this@EncounterSurrogate.meta
      implicitRules =
        Uri.of(this@EncounterSurrogate.implicitRules, this@EncounterSurrogate._implicitRules)
      language = Code.of(this@EncounterSurrogate.language, this@EncounterSurrogate._language)
      text = this@EncounterSurrogate.text
      contained = this@EncounterSurrogate.contained
      extension = this@EncounterSurrogate.extension
      modifierExtension = this@EncounterSurrogate.modifierExtension
      identifier = this@EncounterSurrogate.identifier
      status =
        Enumeration.of(
          this@EncounterSurrogate.status?.let {
            com.google.fhir.model.r5.Encounter.EncounterStatus.fromCode(it)
          },
          this@EncounterSurrogate._status,
        )
      `class` = this@EncounterSurrogate.`class`
      priority = this@EncounterSurrogate.priority
      type = this@EncounterSurrogate.type
      serviceType = this@EncounterSurrogate.serviceType
      subject = this@EncounterSurrogate.subject
      subjectStatus = this@EncounterSurrogate.subjectStatus
      episodeOfCare = this@EncounterSurrogate.episodeOfCare
      basedOn = this@EncounterSurrogate.basedOn
      careTeam = this@EncounterSurrogate.careTeam
      partOf = this@EncounterSurrogate.partOf
      serviceProvider = this@EncounterSurrogate.serviceProvider
      participant = this@EncounterSurrogate.participant
      appointment = this@EncounterSurrogate.appointment
      virtualService = this@EncounterSurrogate.virtualService
      actualPeriod = this@EncounterSurrogate.actualPeriod
      plannedStartDate =
        DateTime.of(
          FhirDateTime.fromString(this@EncounterSurrogate.plannedStartDate),
          this@EncounterSurrogate._plannedStartDate,
        )
      plannedEndDate =
        DateTime.of(
          FhirDateTime.fromString(this@EncounterSurrogate.plannedEndDate),
          this@EncounterSurrogate._plannedEndDate,
        )
      length = this@EncounterSurrogate.length
      reason = this@EncounterSurrogate.reason
      diagnosis = this@EncounterSurrogate.diagnosis
      account = this@EncounterSurrogate.account
      dietPreference = this@EncounterSurrogate.dietPreference
      specialArrangement = this@EncounterSurrogate.specialArrangement
      specialCourtesy = this@EncounterSurrogate.specialCourtesy
      admission = this@EncounterSurrogate.admission
      location = this@EncounterSurrogate.location
    }

  public companion object {
    public fun fromModel(model: Encounter): EncounterSurrogate =
      with(model) {
        EncounterSurrogate().apply {
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
          `class` = this@with.`class`
          priority = this@with.priority
          type = this@with.type
          serviceType = this@with.serviceType
          subject = this@with.subject
          subjectStatus = this@with.subjectStatus
          episodeOfCare = this@with.episodeOfCare
          basedOn = this@with.basedOn
          careTeam = this@with.careTeam
          partOf = this@with.partOf
          serviceProvider = this@with.serviceProvider
          participant = this@with.participant
          appointment = this@with.appointment
          virtualService = this@with.virtualService
          actualPeriod = this@with.actualPeriod
          plannedStartDate = this@with.plannedStartDate?.value?.toString()
          _plannedStartDate = this@with.plannedStartDate?.toElement()
          plannedEndDate = this@with.plannedEndDate?.value?.toString()
          _plannedEndDate = this@with.plannedEndDate?.toElement()
          length = this@with.length
          reason = this@with.reason
          diagnosis = this@with.diagnosis
          account = this@with.account
          dietPreference = this@with.dietPreference
          specialArrangement = this@with.specialArrangement
          specialCourtesy = this@with.specialCourtesy
          admission = this@with.admission
          location = this@with.location
        }
      }
  }
}
