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

import com.google.fhir.model.r4b.Appointment
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Instant
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.UnsignedInt
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AppointmentParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var actor: Reference? = null,
  public var required: KotlinString? = null,
  public var _required: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Appointment.Participant =
    Appointment.Participant(
      id = this@AppointmentParticipantSurrogate.id,
      extension = this@AppointmentParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AppointmentParticipantSurrogate.modifierExtension ?: mutableListOf(),
      type = this@AppointmentParticipantSurrogate.type ?: mutableListOf(),
      actor = this@AppointmentParticipantSurrogate.actor,
      required =
        this@AppointmentParticipantSurrogate.required?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.Appointment.ParticipantRequired.fromCode(it!!),
            this@AppointmentParticipantSurrogate._required,
          )
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.Appointment.ParticipationStatus.fromCode(
            this@AppointmentParticipantSurrogate.status!!
          ),
          this@AppointmentParticipantSurrogate._status,
        ),
      period = this@AppointmentParticipantSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: Appointment.Participant): AppointmentParticipantSurrogate =
      with(model) {
        AppointmentParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.takeUnless { it.all { it == null } },
          actor = this@with.actor,
          required = this@with.required?.value?.getCode(),
          _required = this@with.required?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class AppointmentSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var cancelationReason: CodeableConcept? = null,
  public var serviceCategory: MutableList<CodeableConcept>? = null,
  public var serviceType: MutableList<CodeableConcept>? = null,
  public var specialty: MutableList<CodeableConcept>? = null,
  public var appointmentType: CodeableConcept? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var priority: Int? = null,
  public var _priority: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var start: KotlinString? = null,
  public var _start: Element? = null,
  public var end: KotlinString? = null,
  public var _end: Element? = null,
  public var minutesDuration: Int? = null,
  public var _minutesDuration: Element? = null,
  public var slot: MutableList<Reference>? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var patientInstruction: KotlinString? = null,
  public var _patientInstruction: Element? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var participant: MutableList<Appointment.Participant>? = null,
  public var requestedPeriod: MutableList<Period>? = null,
) {
  public fun toModel(): Appointment =
    Appointment(
      id = this@AppointmentSurrogate.id,
      meta = this@AppointmentSurrogate.meta,
      implicitRules =
        Uri.of(this@AppointmentSurrogate.implicitRules, this@AppointmentSurrogate._implicitRules),
      language = Code.of(this@AppointmentSurrogate.language, this@AppointmentSurrogate._language),
      text = this@AppointmentSurrogate.text,
      contained = this@AppointmentSurrogate.contained ?: mutableListOf(),
      extension = this@AppointmentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AppointmentSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@AppointmentSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.Appointment.AppointmentStatus.fromCode(
            this@AppointmentSurrogate.status!!
          ),
          this@AppointmentSurrogate._status,
        ),
      cancelationReason = this@AppointmentSurrogate.cancelationReason,
      serviceCategory = this@AppointmentSurrogate.serviceCategory ?: mutableListOf(),
      serviceType = this@AppointmentSurrogate.serviceType ?: mutableListOf(),
      specialty = this@AppointmentSurrogate.specialty ?: mutableListOf(),
      appointmentType = this@AppointmentSurrogate.appointmentType,
      reasonCode = this@AppointmentSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@AppointmentSurrogate.reasonReference ?: mutableListOf(),
      priority =
        UnsignedInt.of(this@AppointmentSurrogate.priority, this@AppointmentSurrogate._priority),
      description =
        R4bString.of(this@AppointmentSurrogate.description, this@AppointmentSurrogate._description),
      supportingInformation = this@AppointmentSurrogate.supportingInformation ?: mutableListOf(),
      start =
        Instant.of(
          FhirDateTime.fromString(this@AppointmentSurrogate.start),
          this@AppointmentSurrogate._start,
        ),
      end =
        Instant.of(
          FhirDateTime.fromString(this@AppointmentSurrogate.end),
          this@AppointmentSurrogate._end,
        ),
      minutesDuration =
        PositiveInt.of(
          this@AppointmentSurrogate.minutesDuration,
          this@AppointmentSurrogate._minutesDuration,
        ),
      slot = this@AppointmentSurrogate.slot ?: mutableListOf(),
      created =
        DateTime.of(
          FhirDateTime.fromString(this@AppointmentSurrogate.created),
          this@AppointmentSurrogate._created,
        ),
      comment = R4bString.of(this@AppointmentSurrogate.comment, this@AppointmentSurrogate._comment),
      patientInstruction =
        R4bString.of(
          this@AppointmentSurrogate.patientInstruction,
          this@AppointmentSurrogate._patientInstruction,
        ),
      basedOn = this@AppointmentSurrogate.basedOn ?: mutableListOf(),
      participant = this@AppointmentSurrogate.participant ?: mutableListOf(),
      requestedPeriod = this@AppointmentSurrogate.requestedPeriod ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Appointment): AppointmentSurrogate =
      with(model) {
        AppointmentSurrogate(
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
          cancelationReason = this@with.cancelationReason,
          serviceCategory = this@with.serviceCategory.takeUnless { it.all { it == null } },
          serviceType = this@with.serviceType.takeUnless { it.all { it == null } },
          specialty = this@with.specialty.takeUnless { it.all { it == null } },
          appointmentType = this@with.appointmentType,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          priority = this@with.priority?.value,
          _priority = this@with.priority?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          start = this@with.start?.value?.toString(),
          _start = this@with.start?.toElement(),
          end = this@with.end?.value?.toString(),
          _end = this@with.end?.toElement(),
          minutesDuration = this@with.minutesDuration?.value,
          _minutesDuration = this@with.minutesDuration?.toElement(),
          slot = this@with.slot.takeUnless { it.all { it == null } },
          created = this@with.created?.value?.toString(),
          _created = this@with.created?.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          patientInstruction = this@with.patientInstruction?.value,
          _patientInstruction = this@with.patientInstruction?.toElement(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          participant = this@with.participant.takeUnless { it.all { it == null } },
          requestedPeriod = this@with.requestedPeriod.takeUnless { it.all { it == null } },
        )
      }
  }
}
