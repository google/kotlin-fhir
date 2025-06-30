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

import com.google.fhir.model.r4.AppointmentResponse
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AppointmentResponseSurrogate(
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
  public var appointment: Reference? = null,
  public var start: KotlinString? = null,
  public var _start: Element? = null,
  public var end: KotlinString? = null,
  public var _end: Element? = null,
  public var participantType: List<CodeableConcept?>? = null,
  public var actor: Reference? = null,
  public var participantStatus: KotlinString? = null,
  public var _participantStatus: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): AppointmentResponse =
    AppointmentResponse().apply {
      id = this@AppointmentResponseSurrogate.id
      meta = this@AppointmentResponseSurrogate.meta
      implicitRules =
        Uri.of(
          this@AppointmentResponseSurrogate.implicitRules,
          this@AppointmentResponseSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@AppointmentResponseSurrogate.language,
          this@AppointmentResponseSurrogate._language,
        )
      text = this@AppointmentResponseSurrogate.text
      contained = this@AppointmentResponseSurrogate.contained
      extension = this@AppointmentResponseSurrogate.extension
      modifierExtension = this@AppointmentResponseSurrogate.modifierExtension
      identifier = this@AppointmentResponseSurrogate.identifier
      appointment = this@AppointmentResponseSurrogate.appointment
      start =
        Instant.of(
          FhirDateTime.fromString(this@AppointmentResponseSurrogate.start),
          this@AppointmentResponseSurrogate._start,
        )
      end =
        Instant.of(
          FhirDateTime.fromString(this@AppointmentResponseSurrogate.end),
          this@AppointmentResponseSurrogate._end,
        )
      participantType = this@AppointmentResponseSurrogate.participantType
      actor = this@AppointmentResponseSurrogate.actor
      participantStatus =
        Enumeration.of(
          this@AppointmentResponseSurrogate.participantStatus?.let {
            com.google.fhir.model.r4.AppointmentResponse.ParticipantStatus.fromCode(it)
          },
          this@AppointmentResponseSurrogate._participantStatus,
        )
      comment =
        R4String.of(
          this@AppointmentResponseSurrogate.comment,
          this@AppointmentResponseSurrogate._comment,
        )
    }

  public companion object {
    public fun fromModel(model: AppointmentResponse): AppointmentResponseSurrogate =
      with(model) {
        AppointmentResponseSurrogate().apply {
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
          appointment = this@with.appointment
          start = this@with.start?.value?.toString()
          _start = this@with.start?.toElement()
          end = this@with.end?.value?.toString()
          _end = this@with.end?.toElement()
          participantType = this@with.participantType
          actor = this@with.actor
          participantStatus = this@with.participantStatus?.value?.getCode()
          _participantStatus = this@with.participantStatus?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
        }
      }
  }
}
