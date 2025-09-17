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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PractitionerRole
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Time
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PractitionerRoleAvailableTimeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var daysOfWeek: MutableList<KotlinString?>? = null,
  public var _daysOfWeek: MutableList<Element?>? = null,
  public var allDay: KotlinBoolean? = null,
  public var _allDay: Element? = null,
  public var availableStartTime: LocalTime? = null,
  public var _availableStartTime: Element? = null,
  public var availableEndTime: LocalTime? = null,
  public var _availableEndTime: Element? = null,
) {
  public fun toModel(): PractitionerRole.AvailableTime =
    PractitionerRole.AvailableTime(
      id = this@PractitionerRoleAvailableTimeSurrogate.id,
      extension = this@PractitionerRoleAvailableTimeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PractitionerRoleAvailableTimeSurrogate.modifierExtension ?: mutableListOf(),
      daysOfWeek =
        if (
          this@PractitionerRoleAvailableTimeSurrogate.daysOfWeek == null &&
            this@PractitionerRoleAvailableTimeSurrogate._daysOfWeek == null
        ) {
          mutableListOf()
        } else {
          (this@PractitionerRoleAvailableTimeSurrogate.daysOfWeek
              ?: List(this@PractitionerRoleAvailableTimeSurrogate._daysOfWeek!!.size) { null })
            .zip(
              this@PractitionerRoleAvailableTimeSurrogate._daysOfWeek
                ?: List(this@PractitionerRoleAvailableTimeSurrogate.daysOfWeek!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(value.let { PractitionerRole.DaysOfWeek.fromCode(it!!) }, element)
            }
            .toMutableList()
        },
      allDay =
        R4bBoolean.of(
          this@PractitionerRoleAvailableTimeSurrogate.allDay,
          this@PractitionerRoleAvailableTimeSurrogate._allDay,
        ),
      availableStartTime =
        Time.of(
          this@PractitionerRoleAvailableTimeSurrogate.availableStartTime,
          this@PractitionerRoleAvailableTimeSurrogate._availableStartTime,
        ),
      availableEndTime =
        Time.of(
          this@PractitionerRoleAvailableTimeSurrogate.availableEndTime,
          this@PractitionerRoleAvailableTimeSurrogate._availableEndTime,
        ),
    )

  public companion object {
    public fun fromModel(
      model: PractitionerRole.AvailableTime
    ): PractitionerRoleAvailableTimeSurrogate =
      with(model) {
        PractitionerRoleAvailableTimeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          daysOfWeek =
            this@with.daysOfWeek
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _daysOfWeek =
            this@with.daysOfWeek
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          allDay = this@with.allDay?.value,
          _allDay = this@with.allDay?.toElement(),
          availableStartTime = this@with.availableStartTime?.value,
          _availableStartTime = this@with.availableStartTime?.toElement(),
          availableEndTime = this@with.availableEndTime?.value,
          _availableEndTime = this@with.availableEndTime?.toElement(),
        )
      }
  }
}

@Serializable
internal data class PractitionerRoleNotAvailableSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var during: Period? = null,
) {
  public fun toModel(): PractitionerRole.NotAvailable =
    PractitionerRole.NotAvailable(
      id = this@PractitionerRoleNotAvailableSurrogate.id,
      extension = this@PractitionerRoleNotAvailableSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PractitionerRoleNotAvailableSurrogate.modifierExtension ?: mutableListOf(),
      description =
        R4bString.of(
          this@PractitionerRoleNotAvailableSurrogate.description,
          this@PractitionerRoleNotAvailableSurrogate._description,
        )!!,
      during = this@PractitionerRoleNotAvailableSurrogate.during,
    )

  public companion object {
    public fun fromModel(
      model: PractitionerRole.NotAvailable
    ): PractitionerRoleNotAvailableSurrogate =
      with(model) {
        PractitionerRoleNotAvailableSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          description = this@with.description.value,
          _description = this@with.description.toElement(),
          during = this@with.during,
        )
      }
  }
}

@Serializable
internal data class PractitionerRoleSurrogate(
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
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var period: Period? = null,
  public var practitioner: Reference? = null,
  public var organization: Reference? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var specialty: MutableList<CodeableConcept>? = null,
  public var location: MutableList<Reference>? = null,
  public var healthcareService: MutableList<Reference>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var availableTime: MutableList<PractitionerRole.AvailableTime>? = null,
  public var notAvailable: MutableList<PractitionerRole.NotAvailable>? = null,
  public var availabilityExceptions: KotlinString? = null,
  public var _availabilityExceptions: Element? = null,
  public var endpoint: MutableList<Reference>? = null,
) {
  public fun toModel(): PractitionerRole =
    PractitionerRole(
      id = this@PractitionerRoleSurrogate.id,
      meta = this@PractitionerRoleSurrogate.meta,
      implicitRules =
        Uri.of(
          this@PractitionerRoleSurrogate.implicitRules,
          this@PractitionerRoleSurrogate._implicitRules,
        ),
      language =
        Code.of(this@PractitionerRoleSurrogate.language, this@PractitionerRoleSurrogate._language),
      text = this@PractitionerRoleSurrogate.text,
      contained = this@PractitionerRoleSurrogate.contained ?: mutableListOf(),
      extension = this@PractitionerRoleSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PractitionerRoleSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PractitionerRoleSurrogate.identifier ?: mutableListOf(),
      active =
        R4bBoolean.of(
          this@PractitionerRoleSurrogate.active,
          this@PractitionerRoleSurrogate._active,
        ),
      period = this@PractitionerRoleSurrogate.period,
      practitioner = this@PractitionerRoleSurrogate.practitioner,
      organization = this@PractitionerRoleSurrogate.organization,
      code = this@PractitionerRoleSurrogate.code ?: mutableListOf(),
      specialty = this@PractitionerRoleSurrogate.specialty ?: mutableListOf(),
      location = this@PractitionerRoleSurrogate.location ?: mutableListOf(),
      healthcareService = this@PractitionerRoleSurrogate.healthcareService ?: mutableListOf(),
      telecom = this@PractitionerRoleSurrogate.telecom ?: mutableListOf(),
      availableTime = this@PractitionerRoleSurrogate.availableTime ?: mutableListOf(),
      notAvailable = this@PractitionerRoleSurrogate.notAvailable ?: mutableListOf(),
      availabilityExceptions =
        R4bString.of(
          this@PractitionerRoleSurrogate.availabilityExceptions,
          this@PractitionerRoleSurrogate._availabilityExceptions,
        ),
      endpoint = this@PractitionerRoleSurrogate.endpoint ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: PractitionerRole): PractitionerRoleSurrogate =
      with(model) {
        PractitionerRoleSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          active = this@with.active?.value,
          _active = this@with.active?.toElement(),
          period = this@with.period,
          practitioner = this@with.practitioner,
          organization = this@with.organization,
          code = this@with.code.takeIf { it.isNotEmpty() },
          specialty = this@with.specialty.takeIf { it.isNotEmpty() },
          location = this@with.location.takeIf { it.isNotEmpty() },
          healthcareService = this@with.healthcareService.takeIf { it.isNotEmpty() },
          telecom = this@with.telecom.takeIf { it.isNotEmpty() },
          availableTime = this@with.availableTime.takeIf { it.isNotEmpty() },
          notAvailable = this@with.notAvailable.takeIf { it.isNotEmpty() },
          availabilityExceptions = this@with.availabilityExceptions?.value,
          _availabilityExceptions = this@with.availabilityExceptions?.toElement(),
          endpoint = this@with.endpoint.takeIf { it.isNotEmpty() },
        )
      }
  }
}
