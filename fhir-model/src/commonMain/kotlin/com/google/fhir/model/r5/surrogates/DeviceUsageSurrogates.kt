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
import com.google.fhir.model.r5.DeviceUsage
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceUsageAdherenceSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var reason: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): DeviceUsage.Adherence =
    DeviceUsage.Adherence(
      id = this@DeviceUsageAdherenceSurrogate.id,
      extension = this@DeviceUsageAdherenceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceUsageAdherenceSurrogate.modifierExtension ?: mutableListOf(),
      code = this@DeviceUsageAdherenceSurrogate.code,
      reason = this@DeviceUsageAdherenceSurrogate.reason ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceUsage.Adherence): DeviceUsageAdherenceSurrogate =
      with(model) {
        DeviceUsageAdherenceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          reason = this@with.reason.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceUsageSurrogate(
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
  public var basedOn: MutableList<Reference>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var patient: Reference,
  public var derivedFrom: MutableList<Reference>? = null,
  public var context: Reference? = null,
  public var timingTiming: Timing? = null,
  public var timingPeriod: Period? = null,
  public var timingDateTime: String? = null,
  public var _timingDateTime: Element? = null,
  public var dateAsserted: String? = null,
  public var _dateAsserted: Element? = null,
  public var usageStatus: CodeableConcept? = null,
  public var usageReason: MutableList<CodeableConcept>? = null,
  public var adherence: DeviceUsage.Adherence? = null,
  public var informationSource: Reference? = null,
  public var device: CodeableReference,
  public var reason: MutableList<CodeableReference>? = null,
  public var bodySite: CodeableReference? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): DeviceUsage =
    DeviceUsage(
      id = this@DeviceUsageSurrogate.id,
      meta = this@DeviceUsageSurrogate.meta,
      implicitRules =
        Uri.of(this@DeviceUsageSurrogate.implicitRules, this@DeviceUsageSurrogate._implicitRules),
      language = Code.of(this@DeviceUsageSurrogate.language, this@DeviceUsageSurrogate._language),
      text = this@DeviceUsageSurrogate.text,
      contained = this@DeviceUsageSurrogate.contained ?: mutableListOf(),
      extension = this@DeviceUsageSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceUsageSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DeviceUsageSurrogate.identifier ?: mutableListOf(),
      basedOn = this@DeviceUsageSurrogate.basedOn ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.DeviceUsage.DeviceUsageStatus.fromCode(
            this@DeviceUsageSurrogate.status!!
          ),
          this@DeviceUsageSurrogate._status,
        ),
      category = this@DeviceUsageSurrogate.category ?: mutableListOf(),
      patient = this@DeviceUsageSurrogate.patient,
      derivedFrom = this@DeviceUsageSurrogate.derivedFrom ?: mutableListOf(),
      context = this@DeviceUsageSurrogate.context,
      timing =
        DeviceUsage.Timing?.from(
          this@DeviceUsageSurrogate.timingTiming,
          this@DeviceUsageSurrogate.timingPeriod,
          DateTime.of(
            FhirDateTime.fromString(this@DeviceUsageSurrogate.timingDateTime),
            this@DeviceUsageSurrogate._timingDateTime,
          ),
        ),
      dateAsserted =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceUsageSurrogate.dateAsserted),
          this@DeviceUsageSurrogate._dateAsserted,
        ),
      usageStatus = this@DeviceUsageSurrogate.usageStatus,
      usageReason = this@DeviceUsageSurrogate.usageReason ?: mutableListOf(),
      adherence = this@DeviceUsageSurrogate.adherence,
      informationSource = this@DeviceUsageSurrogate.informationSource,
      device = this@DeviceUsageSurrogate.device,
      reason = this@DeviceUsageSurrogate.reason ?: mutableListOf(),
      bodySite = this@DeviceUsageSurrogate.bodySite,
      note = this@DeviceUsageSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceUsage): DeviceUsageSurrogate =
      with(model) {
        DeviceUsageSurrogate(
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          patient = this@with.patient,
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          context = this@with.context,
          timingTiming = this@with.timing?.asTiming()?.value,
          timingPeriod = this@with.timing?.asPeriod()?.value,
          timingDateTime = this@with.timing?.asDateTime()?.value?.value?.toString(),
          _timingDateTime = this@with.timing?.asDateTime()?.value?.toElement(),
          dateAsserted = this@with.dateAsserted?.value?.toString(),
          _dateAsserted = this@with.dateAsserted?.toElement(),
          usageStatus = this@with.usageStatus,
          usageReason = this@with.usageReason.takeUnless { it.all { it == null } },
          adherence = this@with.adherence,
          informationSource = this@with.informationSource,
          device = this@with.device,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite,
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
