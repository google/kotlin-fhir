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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceUsageAdherenceSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var reason: List<CodeableConcept?>? = null,
) {
  public fun toModel(): DeviceUsage.Adherence =
    DeviceUsage.Adherence().apply {
      id = this@DeviceUsageAdherenceSurrogate.id
      extension = this@DeviceUsageAdherenceSurrogate.extension
      modifierExtension = this@DeviceUsageAdherenceSurrogate.modifierExtension
      code = this@DeviceUsageAdherenceSurrogate.code
      reason = this@DeviceUsageAdherenceSurrogate.reason
    }

  public companion object {
    public fun fromModel(model: DeviceUsage.Adherence): DeviceUsageAdherenceSurrogate =
      with(model) {
        DeviceUsageAdherenceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          reason = this@with.reason
        }
      }
  }
}

@Serializable
internal class DeviceUsageTimingSurrogate {
  public var timingTiming: Timing? = null

  public var timingPeriod: Period? = null

  public var timingDateTime: String? = null

  public var _timingDateTime: Element? = null

  public fun toModel(): DeviceUsage.Timing =
    DeviceUsage.Timing?.from(
      this@DeviceUsageTimingSurrogate.timingTiming,
      this@DeviceUsageTimingSurrogate.timingPeriod,
      DateTime.of(
        FhirDateTime.fromString(this@DeviceUsageTimingSurrogate.timingDateTime),
        this@DeviceUsageTimingSurrogate._timingDateTime,
      ),
    ) ?: DeviceUsage.Timing.Null

  public companion object {
    public fun fromModel(model: DeviceUsage.Timing): DeviceUsageTimingSurrogate =
      with(model) {
        DeviceUsageTimingSurrogate().apply {
          timingTiming = this@with.asTiming()?.value
          timingPeriod = this@with.asPeriod()?.value
          timingDateTime = this@with.asDateTime()?.value?.value?.toString()
          _timingDateTime = this@with.asDateTime()?.value?.toElement()
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var patient: Reference? = null,
  public var derivedFrom: List<Reference?>? = null,
  public var context: Reference? = null,
  public var dateAsserted: String? = null,
  public var _dateAsserted: Element? = null,
  public var usageStatus: CodeableConcept? = null,
  public var usageReason: List<CodeableConcept?>? = null,
  public var adherence: DeviceUsage.Adherence? = null,
  public var informationSource: Reference? = null,
  public var device: CodeableReference? = null,
  public var reason: List<CodeableReference?>? = null,
  public var bodySite: CodeableReference? = null,
  public var note: List<Annotation?>? = null,
  public var timing: DeviceUsage.Timing? = null,
) {
  public fun toModel(): DeviceUsage =
    DeviceUsage().apply {
      id = this@DeviceUsageSurrogate.id
      meta = this@DeviceUsageSurrogate.meta
      implicitRules =
        Uri.of(this@DeviceUsageSurrogate.implicitRules, this@DeviceUsageSurrogate._implicitRules)
      language = Code.of(this@DeviceUsageSurrogate.language, this@DeviceUsageSurrogate._language)
      text = this@DeviceUsageSurrogate.text
      contained = this@DeviceUsageSurrogate.contained
      extension = this@DeviceUsageSurrogate.extension
      modifierExtension = this@DeviceUsageSurrogate.modifierExtension
      identifier = this@DeviceUsageSurrogate.identifier
      basedOn = this@DeviceUsageSurrogate.basedOn
      status =
        Enumeration.of(
          this@DeviceUsageSurrogate.status?.let {
            com.google.fhir.model.r5.DeviceUsage.DeviceUsageStatus.fromCode(it)
          },
          this@DeviceUsageSurrogate._status,
        )
      category = this@DeviceUsageSurrogate.category
      patient = this@DeviceUsageSurrogate.patient
      derivedFrom = this@DeviceUsageSurrogate.derivedFrom
      context = this@DeviceUsageSurrogate.context
      timing = this@DeviceUsageSurrogate.timing
      dateAsserted =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceUsageSurrogate.dateAsserted),
          this@DeviceUsageSurrogate._dateAsserted,
        )
      usageStatus = this@DeviceUsageSurrogate.usageStatus
      usageReason = this@DeviceUsageSurrogate.usageReason
      adherence = this@DeviceUsageSurrogate.adherence
      informationSource = this@DeviceUsageSurrogate.informationSource
      device = this@DeviceUsageSurrogate.device
      reason = this@DeviceUsageSurrogate.reason
      bodySite = this@DeviceUsageSurrogate.bodySite
      note = this@DeviceUsageSurrogate.note
    }

  public companion object {
    public fun fromModel(model: DeviceUsage): DeviceUsageSurrogate =
      with(model) {
        DeviceUsageSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          category = this@with.category
          patient = this@with.patient
          derivedFrom = this@with.derivedFrom
          context = this@with.context
          timing = this@with.timing
          dateAsserted = this@with.dateAsserted?.value?.toString()
          _dateAsserted = this@with.dateAsserted?.toElement()
          usageStatus = this@with.usageStatus
          usageReason = this@with.usageReason
          adherence = this@with.adherence
          informationSource = this@with.informationSource
          device = this@with.device
          reason = this@with.reason
          bodySite = this@with.bodySite
          note = this@with.note
        }
      }
  }
}
