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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Slot
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
internal data class SlotSurrogate(
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
  public var serviceCategory: MutableList<CodeableConcept>? = null,
  public var serviceType: MutableList<CodeableReference>? = null,
  public var specialty: MutableList<CodeableConcept>? = null,
  public var appointmentType: MutableList<CodeableConcept>? = null,
  public var schedule: Reference,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var start: KotlinString? = null,
  public var _start: Element? = null,
  public var end: KotlinString? = null,
  public var _end: Element? = null,
  public var overbooked: KotlinBoolean? = null,
  public var _overbooked: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): Slot =
    Slot(
      id = this@SlotSurrogate.id,
      meta = this@SlotSurrogate.meta,
      implicitRules = Uri.of(this@SlotSurrogate.implicitRules, this@SlotSurrogate._implicitRules),
      language = Code.of(this@SlotSurrogate.language, this@SlotSurrogate._language),
      text = this@SlotSurrogate.text,
      contained = this@SlotSurrogate.contained ?: mutableListOf(),
      extension = this@SlotSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SlotSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@SlotSurrogate.identifier ?: mutableListOf(),
      serviceCategory = this@SlotSurrogate.serviceCategory ?: mutableListOf(),
      serviceType = this@SlotSurrogate.serviceType ?: mutableListOf(),
      specialty = this@SlotSurrogate.specialty ?: mutableListOf(),
      appointmentType = this@SlotSurrogate.appointmentType ?: mutableListOf(),
      schedule = this@SlotSurrogate.schedule,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Slot.SlotStatus.fromCode(this@SlotSurrogate.status!!),
          this@SlotSurrogate._status,
        ),
      start =
        Instant.of(FhirDateTime.fromString(this@SlotSurrogate.start), this@SlotSurrogate._start)!!,
      end = Instant.of(FhirDateTime.fromString(this@SlotSurrogate.end), this@SlotSurrogate._end)!!,
      overbooked = R5Boolean.of(this@SlotSurrogate.overbooked, this@SlotSurrogate._overbooked),
      comment = R5String.of(this@SlotSurrogate.comment, this@SlotSurrogate._comment),
    )

  public companion object {
    public fun fromModel(model: Slot): SlotSurrogate =
      with(model) {
        SlotSurrogate(
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
          serviceCategory = this@with.serviceCategory.takeUnless { it.all { it == null } },
          serviceType = this@with.serviceType.takeUnless { it.all { it == null } },
          specialty = this@with.specialty.takeUnless { it.all { it == null } },
          appointmentType = this@with.appointmentType.takeUnless { it.all { it == null } },
          schedule = this@with.schedule,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          start = this@with.start.value?.toString(),
          _start = this@with.start.toElement(),
          end = this@with.end.value?.toString(),
          _end = this@with.end.toElement(),
          overbooked = this@with.overbooked?.value,
          _overbooked = this@with.overbooked?.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
        )
      }
  }
}
