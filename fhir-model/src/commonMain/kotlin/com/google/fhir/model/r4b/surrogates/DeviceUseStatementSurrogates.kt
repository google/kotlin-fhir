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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.DeviceUseStatement
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class DeviceUseStatementTimingSurrogate {
  public var timingTiming: Timing? = null

  public var timingPeriod: Period? = null

  public var timingDateTime: String? = null

  public var _timingDateTime: Element? = null

  public fun toModel(): DeviceUseStatement.Timing =
    DeviceUseStatement.Timing?.from(
      this@DeviceUseStatementTimingSurrogate.timingTiming,
      this@DeviceUseStatementTimingSurrogate.timingPeriod,
      DateTime.of(
        FhirDateTime.fromString(this@DeviceUseStatementTimingSurrogate.timingDateTime),
        this@DeviceUseStatementTimingSurrogate._timingDateTime,
      ),
    ) ?: DeviceUseStatement.Timing.Null

  public companion object {
    public fun fromModel(model: DeviceUseStatement.Timing): DeviceUseStatementTimingSurrogate =
      with(model) {
        DeviceUseStatementTimingSurrogate().apply {
          timingTiming = this@with.asTiming()?.value
          timingPeriod = this@with.asPeriod()?.value
          timingDateTime = this@with.asDateTime()?.value?.value?.toString()
          _timingDateTime = this@with.asDateTime()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class DeviceUseStatementSurrogate(
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
  public var subject: Reference? = null,
  public var derivedFrom: List<Reference?>? = null,
  public var recordedOn: String? = null,
  public var _recordedOn: Element? = null,
  public var source: Reference? = null,
  public var device: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var bodySite: CodeableConcept? = null,
  public var note: List<Annotation?>? = null,
  public var timing: DeviceUseStatement.Timing? = null,
) {
  public fun toModel(): DeviceUseStatement =
    DeviceUseStatement().apply {
      id = this@DeviceUseStatementSurrogate.id
      meta = this@DeviceUseStatementSurrogate.meta
      implicitRules =
        Uri.of(
          this@DeviceUseStatementSurrogate.implicitRules,
          this@DeviceUseStatementSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@DeviceUseStatementSurrogate.language,
          this@DeviceUseStatementSurrogate._language,
        )
      text = this@DeviceUseStatementSurrogate.text
      contained = this@DeviceUseStatementSurrogate.contained
      extension = this@DeviceUseStatementSurrogate.extension
      modifierExtension = this@DeviceUseStatementSurrogate.modifierExtension
      identifier = this@DeviceUseStatementSurrogate.identifier
      basedOn = this@DeviceUseStatementSurrogate.basedOn
      status =
        Enumeration.of(
          this@DeviceUseStatementSurrogate.status?.let {
            com.google.fhir.model.r4b.DeviceUseStatement.DeviceUseStatementStatus.fromCode(it)
          },
          this@DeviceUseStatementSurrogate._status,
        )
      subject = this@DeviceUseStatementSurrogate.subject
      derivedFrom = this@DeviceUseStatementSurrogate.derivedFrom
      timing = this@DeviceUseStatementSurrogate.timing
      recordedOn =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceUseStatementSurrogate.recordedOn),
          this@DeviceUseStatementSurrogate._recordedOn,
        )
      source = this@DeviceUseStatementSurrogate.source
      device = this@DeviceUseStatementSurrogate.device
      reasonCode = this@DeviceUseStatementSurrogate.reasonCode
      reasonReference = this@DeviceUseStatementSurrogate.reasonReference
      bodySite = this@DeviceUseStatementSurrogate.bodySite
      note = this@DeviceUseStatementSurrogate.note
    }

  public companion object {
    public fun fromModel(model: DeviceUseStatement): DeviceUseStatementSurrogate =
      with(model) {
        DeviceUseStatementSurrogate().apply {
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
          subject = this@with.subject
          derivedFrom = this@with.derivedFrom
          timing = this@with.timing
          recordedOn = this@with.recordedOn?.value?.toString()
          _recordedOn = this@with.recordedOn?.toElement()
          source = this@with.source
          device = this@with.device
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          bodySite = this@with.bodySite
          note = this@with.note
        }
      }
  }
}
