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
import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Media
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MediaSurrogate(
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
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept? = null,
  public var modality: CodeableConcept? = null,
  public var view: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var createdDateTime: KotlinString? = null,
  public var _createdDateTime: Element? = null,
  public var createdPeriod: Period? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var `operator`: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var bodySite: CodeableConcept? = null,
  public var deviceName: KotlinString? = null,
  public var _deviceName: Element? = null,
  public var device: Reference? = null,
  public var height: Int? = null,
  public var _height: Element? = null,
  public var width: Int? = null,
  public var _width: Element? = null,
  public var frames: Int? = null,
  public var _frames: Element? = null,
  public var duration: Double? = null,
  public var _duration: Element? = null,
  public var content: Attachment? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): Media =
    Media().apply {
      id = this@MediaSurrogate.id
      meta = this@MediaSurrogate.meta
      implicitRules = Uri.of(this@MediaSurrogate.implicitRules, this@MediaSurrogate._implicitRules)
      language = Code.of(this@MediaSurrogate.language, this@MediaSurrogate._language)
      text = this@MediaSurrogate.text
      contained = this@MediaSurrogate.contained
      extension = this@MediaSurrogate.extension
      modifierExtension = this@MediaSurrogate.modifierExtension
      identifier = this@MediaSurrogate.identifier
      basedOn = this@MediaSurrogate.basedOn
      partOf = this@MediaSurrogate.partOf
      status =
        Enumeration.of(
          this@MediaSurrogate.status?.let {
            com.google.fhir.model.r4.Media.MediaStatus.fromCode(it)
          },
          this@MediaSurrogate._status,
        )
      type = this@MediaSurrogate.type
      modality = this@MediaSurrogate.modality
      view = this@MediaSurrogate.view
      subject = this@MediaSurrogate.subject
      encounter = this@MediaSurrogate.encounter
      created =
        Media.Created?.from(
          DateTime.of(
            FhirDateTime.fromString(this@MediaSurrogate.createdDateTime),
            this@MediaSurrogate._createdDateTime,
          ),
          this@MediaSurrogate.createdPeriod,
        )
      issued =
        Instant.of(FhirDateTime.fromString(this@MediaSurrogate.issued), this@MediaSurrogate._issued)
      `operator` = this@MediaSurrogate.`operator`
      reasonCode = this@MediaSurrogate.reasonCode
      bodySite = this@MediaSurrogate.bodySite
      deviceName = R4String.of(this@MediaSurrogate.deviceName, this@MediaSurrogate._deviceName)
      device = this@MediaSurrogate.device
      height = PositiveInt.of(this@MediaSurrogate.height, this@MediaSurrogate._height)
      width = PositiveInt.of(this@MediaSurrogate.width, this@MediaSurrogate._width)
      frames = PositiveInt.of(this@MediaSurrogate.frames, this@MediaSurrogate._frames)
      duration = Decimal.of(this@MediaSurrogate.duration, this@MediaSurrogate._duration)
      content = this@MediaSurrogate.content
      note = this@MediaSurrogate.note
    }

  public companion object {
    public fun fromModel(model: Media): MediaSurrogate =
      with(model) {
        MediaSurrogate().apply {
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
          type = this@with.type
          modality = this@with.modality
          view = this@with.view
          subject = this@with.subject
          encounter = this@with.encounter
          createdDateTime = this@with.created?.asDateTime()?.value?.value?.toString()
          _createdDateTime = this@with.created?.asDateTime()?.value?.toElement()
          createdPeriod = this@with.created?.asPeriod()?.value
          issued = this@with.issued?.value?.toString()
          _issued = this@with.issued?.toElement()
          `operator` = this@with.`operator`
          reasonCode = this@with.reasonCode
          bodySite = this@with.bodySite
          deviceName = this@with.deviceName?.value
          _deviceName = this@with.deviceName?.toElement()
          device = this@with.device
          height = this@with.height?.value
          _height = this@with.height?.toElement()
          width = this@with.width?.value
          _width = this@with.width?.toElement()
          frames = this@with.frames?.value
          _frames = this@with.frames?.toElement()
          duration = this@with.duration?.value
          _duration = this@with.duration?.toElement()
          content = this@with.content
          note = this@with.note
        }
      }
  }
}
