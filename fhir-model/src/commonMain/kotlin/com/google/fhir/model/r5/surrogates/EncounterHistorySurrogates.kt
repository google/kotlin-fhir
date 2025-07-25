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
import com.google.fhir.model.r5.EncounterHistory
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
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EncounterHistoryLocationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var location: Reference,
  public var form: CodeableConcept? = null,
) {
  public fun toModel(): EncounterHistory.Location =
    EncounterHistory.Location(
      id = this@EncounterHistoryLocationSurrogate.id,
      extension = this@EncounterHistoryLocationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EncounterHistoryLocationSurrogate.modifierExtension ?: mutableListOf(),
      location = this@EncounterHistoryLocationSurrogate.location,
      form = this@EncounterHistoryLocationSurrogate.form,
    )

  public companion object {
    public fun fromModel(model: EncounterHistory.Location): EncounterHistoryLocationSurrogate =
      with(model) {
        EncounterHistoryLocationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          location = this@with.location,
          form = this@with.form,
        )
      }
  }
}

@Serializable
internal data class EncounterHistorySurrogate(
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
  public var encounter: Reference? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var `class`: CodeableConcept,
  public var type: MutableList<CodeableConcept>? = null,
  public var serviceType: MutableList<CodeableReference>? = null,
  public var subject: Reference? = null,
  public var subjectStatus: CodeableConcept? = null,
  public var actualPeriod: Period? = null,
  public var plannedStartDate: String? = null,
  public var _plannedStartDate: Element? = null,
  public var plannedEndDate: String? = null,
  public var _plannedEndDate: Element? = null,
  public var length: Duration? = null,
  public var location: MutableList<EncounterHistory.Location>? = null,
) {
  public fun toModel(): EncounterHistory =
    EncounterHistory(
      id = this@EncounterHistorySurrogate.id,
      meta = this@EncounterHistorySurrogate.meta,
      implicitRules =
        Uri.of(
          this@EncounterHistorySurrogate.implicitRules,
          this@EncounterHistorySurrogate._implicitRules,
        ),
      language =
        Code.of(this@EncounterHistorySurrogate.language, this@EncounterHistorySurrogate._language),
      text = this@EncounterHistorySurrogate.text,
      contained = this@EncounterHistorySurrogate.contained ?: mutableListOf(),
      extension = this@EncounterHistorySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EncounterHistorySurrogate.modifierExtension ?: mutableListOf(),
      encounter = this@EncounterHistorySurrogate.encounter,
      identifier = this@EncounterHistorySurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.EncounterHistory.EncounterStatus.fromCode(
            this@EncounterHistorySurrogate.status!!
          ),
          this@EncounterHistorySurrogate._status,
        ),
      `class` = this@EncounterHistorySurrogate.`class`,
      type = this@EncounterHistorySurrogate.type ?: mutableListOf(),
      serviceType = this@EncounterHistorySurrogate.serviceType ?: mutableListOf(),
      subject = this@EncounterHistorySurrogate.subject,
      subjectStatus = this@EncounterHistorySurrogate.subjectStatus,
      actualPeriod = this@EncounterHistorySurrogate.actualPeriod,
      plannedStartDate =
        DateTime.of(
          FhirDateTime.fromString(this@EncounterHistorySurrogate.plannedStartDate),
          this@EncounterHistorySurrogate._plannedStartDate,
        ),
      plannedEndDate =
        DateTime.of(
          FhirDateTime.fromString(this@EncounterHistorySurrogate.plannedEndDate),
          this@EncounterHistorySurrogate._plannedEndDate,
        ),
      length = this@EncounterHistorySurrogate.length,
      location = this@EncounterHistorySurrogate.location ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EncounterHistory): EncounterHistorySurrogate =
      with(model) {
        EncounterHistorySurrogate(
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
          encounter = this@with.encounter,
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          `class` = this@with.`class`,
          type = this@with.type.takeUnless { it.all { it == null } },
          serviceType = this@with.serviceType.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          subjectStatus = this@with.subjectStatus,
          actualPeriod = this@with.actualPeriod,
          plannedStartDate = this@with.plannedStartDate?.value?.toString(),
          _plannedStartDate = this@with.plannedStartDate?.toElement(),
          plannedEndDate = this@with.plannedEndDate?.value?.toString(),
          _plannedEndDate = this@with.plannedEndDate?.toElement(),
          length = this@with.length,
          location = this@with.location.takeUnless { it.all { it == null } },
        )
      }
  }
}
