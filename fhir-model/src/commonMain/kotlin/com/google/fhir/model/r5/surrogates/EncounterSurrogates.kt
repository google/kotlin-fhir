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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EncounterParticipantSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var period: Period? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): Encounter.Participant =
    Encounter.Participant(
      id = this@EncounterParticipantSurrogate.id,
      extension = this@EncounterParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterParticipantSurrogate.modifierExtension ?: mutableListOf(),
      type = this@EncounterParticipantSurrogate.type ?: mutableListOf(),
      period = this@EncounterParticipantSurrogate.period,
      actor = this@EncounterParticipantSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: Encounter.Participant): EncounterParticipantSurrogate =
      with(model) {
        EncounterParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.takeUnless { it.all { it == null } },
          period = this@with.period,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class EncounterReasonSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var use: MutableList<CodeableConcept>? = null,
  public var `value`: MutableList<CodeableReference>? = null,
) {
  public fun toModel(): Encounter.Reason =
    Encounter.Reason(
      id = this@EncounterReasonSurrogate.id,
      extension = this@EncounterReasonSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterReasonSurrogate.modifierExtension ?: mutableListOf(),
      use = this@EncounterReasonSurrogate.use ?: mutableListOf(),
      `value` = this@EncounterReasonSurrogate.`value` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Encounter.Reason): EncounterReasonSurrogate =
      with(model) {
        EncounterReasonSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          use = this@with.use.takeUnless { it.all { it == null } },
          `value` = this@with.`value`.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class EncounterDiagnosisSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var condition: MutableList<CodeableReference>? = null,
  public var use: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): Encounter.Diagnosis =
    Encounter.Diagnosis(
      id = this@EncounterDiagnosisSurrogate.id,
      extension = this@EncounterDiagnosisSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterDiagnosisSurrogate.modifierExtension ?: mutableListOf(),
      condition = this@EncounterDiagnosisSurrogate.condition ?: mutableListOf(),
      use = this@EncounterDiagnosisSurrogate.use ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Encounter.Diagnosis): EncounterDiagnosisSurrogate =
      with(model) {
        EncounterDiagnosisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          condition = this@with.condition.takeUnless { it.all { it == null } },
          use = this@with.use.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class EncounterAdmissionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var preAdmissionIdentifier: Identifier? = null,
  public var origin: Reference? = null,
  public var admitSource: CodeableConcept? = null,
  public var reAdmission: CodeableConcept? = null,
  public var destination: Reference? = null,
  public var dischargeDisposition: CodeableConcept? = null,
) {
  public fun toModel(): Encounter.Admission =
    Encounter.Admission(
      id = this@EncounterAdmissionSurrogate.id,
      extension = this@EncounterAdmissionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterAdmissionSurrogate.modifierExtension ?: mutableListOf(),
      preAdmissionIdentifier = this@EncounterAdmissionSurrogate.preAdmissionIdentifier,
      origin = this@EncounterAdmissionSurrogate.origin,
      admitSource = this@EncounterAdmissionSurrogate.admitSource,
      reAdmission = this@EncounterAdmissionSurrogate.reAdmission,
      destination = this@EncounterAdmissionSurrogate.destination,
      dischargeDisposition = this@EncounterAdmissionSurrogate.dischargeDisposition,
    )

  public companion object {
    public fun fromModel(model: Encounter.Admission): EncounterAdmissionSurrogate =
      with(model) {
        EncounterAdmissionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          preAdmissionIdentifier = this@with.preAdmissionIdentifier,
          origin = this@with.origin,
          admitSource = this@with.admitSource,
          reAdmission = this@with.reAdmission,
          destination = this@with.destination,
          dischargeDisposition = this@with.dischargeDisposition,
        )
      }
  }
}

@Serializable
internal data class EncounterLocationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var location: Reference,
  public var status: String? = null,
  public var _status: Element? = null,
  public var form: CodeableConcept? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Encounter.Location =
    Encounter.Location(
      id = this@EncounterLocationSurrogate.id,
      extension = this@EncounterLocationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterLocationSurrogate.modifierExtension ?: mutableListOf(),
      location = this@EncounterLocationSurrogate.location,
      status =
        this@EncounterLocationSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Encounter.EncounterLocationStatus.fromCode(it!!),
            this@EncounterLocationSurrogate._status,
          )
        },
      form = this@EncounterLocationSurrogate.form,
      period = this@EncounterLocationSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: Encounter.Location): EncounterLocationSurrogate =
      with(model) {
        EncounterLocationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          location = this@with.location,
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          form = this@with.form,
          period = this@with.period,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var `class`: MutableList<CodeableConcept>? = null,
  public var priority: CodeableConcept? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var serviceType: MutableList<CodeableReference>? = null,
  public var subject: Reference? = null,
  public var subjectStatus: CodeableConcept? = null,
  public var episodeOfCare: MutableList<Reference>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var careTeam: MutableList<Reference>? = null,
  public var partOf: Reference? = null,
  public var serviceProvider: Reference? = null,
  public var participant: MutableList<Encounter.Participant>? = null,
  public var appointment: MutableList<Reference>? = null,
  public var virtualService: MutableList<VirtualServiceDetail>? = null,
  public var actualPeriod: Period? = null,
  public var plannedStartDate: String? = null,
  public var _plannedStartDate: Element? = null,
  public var plannedEndDate: String? = null,
  public var _plannedEndDate: Element? = null,
  public var length: Duration? = null,
  public var reason: MutableList<Encounter.Reason>? = null,
  public var diagnosis: MutableList<Encounter.Diagnosis>? = null,
  public var account: MutableList<Reference>? = null,
  public var dietPreference: MutableList<CodeableConcept>? = null,
  public var specialArrangement: MutableList<CodeableConcept>? = null,
  public var specialCourtesy: MutableList<CodeableConcept>? = null,
  public var admission: Encounter.Admission? = null,
  public var location: MutableList<Encounter.Location>? = null,
) {
  public fun toModel(): Encounter =
    Encounter(
      id = this@EncounterSurrogate.id,
      meta = this@EncounterSurrogate.meta,
      implicitRules =
        Uri.of(this@EncounterSurrogate.implicitRules, this@EncounterSurrogate._implicitRules),
      language = Code.of(this@EncounterSurrogate.language, this@EncounterSurrogate._language),
      text = this@EncounterSurrogate.text,
      contained = this@EncounterSurrogate.contained ?: mutableListOf(),
      extension = this@EncounterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@EncounterSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Encounter.EncounterStatus.fromCode(
            this@EncounterSurrogate.status!!
          ),
          this@EncounterSurrogate._status,
        ),
      `class` = this@EncounterSurrogate.`class` ?: mutableListOf(),
      priority = this@EncounterSurrogate.priority,
      type = this@EncounterSurrogate.type ?: mutableListOf(),
      serviceType = this@EncounterSurrogate.serviceType ?: mutableListOf(),
      subject = this@EncounterSurrogate.subject,
      subjectStatus = this@EncounterSurrogate.subjectStatus,
      episodeOfCare = this@EncounterSurrogate.episodeOfCare ?: mutableListOf(),
      basedOn = this@EncounterSurrogate.basedOn ?: mutableListOf(),
      careTeam = this@EncounterSurrogate.careTeam ?: mutableListOf(),
      partOf = this@EncounterSurrogate.partOf,
      serviceProvider = this@EncounterSurrogate.serviceProvider,
      participant = this@EncounterSurrogate.participant ?: mutableListOf(),
      appointment = this@EncounterSurrogate.appointment ?: mutableListOf(),
      virtualService = this@EncounterSurrogate.virtualService ?: mutableListOf(),
      actualPeriod = this@EncounterSurrogate.actualPeriod,
      plannedStartDate =
        DateTime.of(
          FhirDateTime.fromString(this@EncounterSurrogate.plannedStartDate),
          this@EncounterSurrogate._plannedStartDate,
        ),
      plannedEndDate =
        DateTime.of(
          FhirDateTime.fromString(this@EncounterSurrogate.plannedEndDate),
          this@EncounterSurrogate._plannedEndDate,
        ),
      length = this@EncounterSurrogate.length,
      reason = this@EncounterSurrogate.reason ?: mutableListOf(),
      diagnosis = this@EncounterSurrogate.diagnosis ?: mutableListOf(),
      account = this@EncounterSurrogate.account ?: mutableListOf(),
      dietPreference = this@EncounterSurrogate.dietPreference ?: mutableListOf(),
      specialArrangement = this@EncounterSurrogate.specialArrangement ?: mutableListOf(),
      specialCourtesy = this@EncounterSurrogate.specialCourtesy ?: mutableListOf(),
      admission = this@EncounterSurrogate.admission,
      location = this@EncounterSurrogate.location ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Encounter): EncounterSurrogate =
      with(model) {
        EncounterSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          `class` = this@with.`class`.takeUnless { it.all { it == null } },
          priority = this@with.priority,
          type = this@with.type.takeUnless { it.all { it == null } },
          serviceType = this@with.serviceType.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          subjectStatus = this@with.subjectStatus,
          episodeOfCare = this@with.episodeOfCare.takeUnless { it.all { it == null } },
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          careTeam = this@with.careTeam.takeUnless { it.all { it == null } },
          partOf = this@with.partOf,
          serviceProvider = this@with.serviceProvider,
          participant = this@with.participant.takeUnless { it.all { it == null } },
          appointment = this@with.appointment.takeUnless { it.all { it == null } },
          virtualService = this@with.virtualService.takeUnless { it.all { it == null } },
          actualPeriod = this@with.actualPeriod,
          plannedStartDate = this@with.plannedStartDate?.value?.toString(),
          _plannedStartDate = this@with.plannedStartDate?.toElement(),
          plannedEndDate = this@with.plannedEndDate?.value?.toString(),
          _plannedEndDate = this@with.plannedEndDate?.toElement(),
          length = this@with.length,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          diagnosis = this@with.diagnosis.takeUnless { it.all { it == null } },
          account = this@with.account.takeUnless { it.all { it == null } },
          dietPreference = this@with.dietPreference.takeUnless { it.all { it == null } },
          specialArrangement = this@with.specialArrangement.takeUnless { it.all { it == null } },
          specialCourtesy = this@with.specialCourtesy.takeUnless { it.all { it == null } },
          admission = this@with.admission,
          location = this@with.location.takeUnless { it.all { it == null } },
        )
      }
  }
}
