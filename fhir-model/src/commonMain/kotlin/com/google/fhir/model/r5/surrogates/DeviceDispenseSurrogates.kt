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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.DeviceDispense
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceDispensePerformerSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): DeviceDispense.Performer =
    DeviceDispense.Performer().apply {
      id = this@DeviceDispensePerformerSurrogate.id
      extension = this@DeviceDispensePerformerSurrogate.extension
      modifierExtension = this@DeviceDispensePerformerSurrogate.modifierExtension
      function = this@DeviceDispensePerformerSurrogate.function
      actor = this@DeviceDispensePerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(model: DeviceDispense.Performer): DeviceDispensePerformerSurrogate =
      with(model) {
        DeviceDispensePerformerSurrogate().apply {
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
internal data class DeviceDispenseSurrogate(
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
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableReference? = null,
  public var category: List<CodeableConcept?>? = null,
  public var device: CodeableReference? = null,
  public var subject: Reference? = null,
  public var `receiver`: Reference? = null,
  public var encounter: Reference? = null,
  public var supportingInformation: List<Reference?>? = null,
  public var performer: List<DeviceDispense.Performer>? = null,
  public var location: Reference? = null,
  public var type: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var preparedDate: String? = null,
  public var _preparedDate: Element? = null,
  public var whenHandedOver: String? = null,
  public var _whenHandedOver: Element? = null,
  public var destination: Reference? = null,
  public var note: List<Annotation?>? = null,
  public var usageInstruction: String? = null,
  public var _usageInstruction: Element? = null,
  public var eventHistory: List<Reference?>? = null,
) {
  public fun toModel(): DeviceDispense =
    DeviceDispense().apply {
      id = this@DeviceDispenseSurrogate.id
      meta = this@DeviceDispenseSurrogate.meta
      implicitRules =
        Uri.of(
          this@DeviceDispenseSurrogate.implicitRules,
          this@DeviceDispenseSurrogate._implicitRules,
        )
      language =
        Code.of(this@DeviceDispenseSurrogate.language, this@DeviceDispenseSurrogate._language)
      text = this@DeviceDispenseSurrogate.text
      contained = this@DeviceDispenseSurrogate.contained
      extension = this@DeviceDispenseSurrogate.extension
      modifierExtension = this@DeviceDispenseSurrogate.modifierExtension
      identifier = this@DeviceDispenseSurrogate.identifier
      basedOn = this@DeviceDispenseSurrogate.basedOn
      partOf = this@DeviceDispenseSurrogate.partOf
      status =
        Enumeration.of(
          this@DeviceDispenseSurrogate.status?.let {
            com.google.fhir.model.r5.DeviceDispense.DeviceDispenseStatus.fromCode(it)
          },
          this@DeviceDispenseSurrogate._status,
        )
      statusReason = this@DeviceDispenseSurrogate.statusReason
      category = this@DeviceDispenseSurrogate.category
      device = this@DeviceDispenseSurrogate.device
      subject = this@DeviceDispenseSurrogate.subject
      `receiver` = this@DeviceDispenseSurrogate.`receiver`
      encounter = this@DeviceDispenseSurrogate.encounter
      supportingInformation = this@DeviceDispenseSurrogate.supportingInformation
      performer = this@DeviceDispenseSurrogate.performer
      location = this@DeviceDispenseSurrogate.location
      type = this@DeviceDispenseSurrogate.type
      quantity = this@DeviceDispenseSurrogate.quantity
      preparedDate =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceDispenseSurrogate.preparedDate),
          this@DeviceDispenseSurrogate._preparedDate,
        )
      whenHandedOver =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceDispenseSurrogate.whenHandedOver),
          this@DeviceDispenseSurrogate._whenHandedOver,
        )
      destination = this@DeviceDispenseSurrogate.destination
      note = this@DeviceDispenseSurrogate.note
      usageInstruction =
        Markdown.of(
          this@DeviceDispenseSurrogate.usageInstruction,
          this@DeviceDispenseSurrogate._usageInstruction,
        )
      eventHistory = this@DeviceDispenseSurrogate.eventHistory
    }

  public companion object {
    public fun fromModel(model: DeviceDispense): DeviceDispenseSurrogate =
      with(model) {
        DeviceDispenseSurrogate().apply {
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
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          device = this@with.device
          subject = this@with.subject
          `receiver` = this@with.`receiver`
          encounter = this@with.encounter
          supportingInformation = this@with.supportingInformation
          performer = this@with.performer
          location = this@with.location
          type = this@with.type
          quantity = this@with.quantity
          preparedDate = this@with.preparedDate?.value?.toString()
          _preparedDate = this@with.preparedDate?.toElement()
          whenHandedOver = this@with.whenHandedOver?.value?.toString()
          _whenHandedOver = this@with.whenHandedOver?.toElement()
          destination = this@with.destination
          note = this@with.note
          usageInstruction = this@with.usageInstruction?.value
          _usageInstruction = this@with.usageInstruction?.toElement()
          eventHistory = this@with.eventHistory
        }
      }
  }
}
