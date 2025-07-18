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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.DeviceUseStatement
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceUseStatementSurrogate(
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
  public var subject: Reference,
  public var derivedFrom: MutableList<Reference>? = null,
  public var timingTiming: Timing? = null,
  public var timingPeriod: Period? = null,
  public var timingDateTime: String? = null,
  public var _timingDateTime: Element? = null,
  public var recordedOn: String? = null,
  public var _recordedOn: Element? = null,
  public var source: Reference? = null,
  public var device: Reference,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var bodySite: CodeableConcept? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): DeviceUseStatement =
    DeviceUseStatement(
      id = this@DeviceUseStatementSurrogate.id,
      meta = this@DeviceUseStatementSurrogate.meta,
      implicitRules =
        Uri.of(
          this@DeviceUseStatementSurrogate.implicitRules,
          this@DeviceUseStatementSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@DeviceUseStatementSurrogate.language,
          this@DeviceUseStatementSurrogate._language,
        ),
      text = this@DeviceUseStatementSurrogate.text,
      contained = this@DeviceUseStatementSurrogate.contained ?: mutableListOf(),
      extension = this@DeviceUseStatementSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceUseStatementSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DeviceUseStatementSurrogate.identifier ?: mutableListOf(),
      basedOn = this@DeviceUseStatementSurrogate.basedOn ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.DeviceUseStatement.DeviceUseStatementStatus.fromCode(
            this@DeviceUseStatementSurrogate.status!!
          ),
          this@DeviceUseStatementSurrogate._status,
        ),
      subject = this@DeviceUseStatementSurrogate.subject,
      derivedFrom = this@DeviceUseStatementSurrogate.derivedFrom ?: mutableListOf(),
      timing =
        DeviceUseStatement.Timing?.from(
          this@DeviceUseStatementSurrogate.timingTiming,
          this@DeviceUseStatementSurrogate.timingPeriod,
          DateTime.of(
            FhirDateTime.fromString(this@DeviceUseStatementSurrogate.timingDateTime),
            this@DeviceUseStatementSurrogate._timingDateTime,
          ),
        ),
      recordedOn =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceUseStatementSurrogate.recordedOn),
          this@DeviceUseStatementSurrogate._recordedOn,
        ),
      source = this@DeviceUseStatementSurrogate.source,
      device = this@DeviceUseStatementSurrogate.device,
      reasonCode = this@DeviceUseStatementSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@DeviceUseStatementSurrogate.reasonReference ?: mutableListOf(),
      bodySite = this@DeviceUseStatementSurrogate.bodySite,
      note = this@DeviceUseStatementSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceUseStatement): DeviceUseStatementSurrogate =
      with(model) {
        DeviceUseStatementSurrogate(
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
          subject = this@with.subject,
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          timingTiming = this@with.timing?.asTiming()?.value,
          timingPeriod = this@with.timing?.asPeriod()?.value,
          timingDateTime = this@with.timing?.asDateTime()?.value?.value?.toString(),
          _timingDateTime = this@with.timing?.asDateTime()?.value?.toElement(),
          recordedOn = this@with.recordedOn?.value?.toString(),
          _recordedOn = this@with.recordedOn?.toElement(),
          source = this@with.source,
          device = this@with.device,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite,
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
