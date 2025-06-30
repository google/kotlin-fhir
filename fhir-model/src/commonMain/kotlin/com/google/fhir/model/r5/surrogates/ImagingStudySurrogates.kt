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
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.ImagingStudy
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImagingStudySeriesPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): ImagingStudy.Series.Performer =
    ImagingStudy.Series.Performer().apply {
      id = this@ImagingStudySeriesPerformerSurrogate.id
      extension = this@ImagingStudySeriesPerformerSurrogate.extension
      modifierExtension = this@ImagingStudySeriesPerformerSurrogate.modifierExtension
      function = this@ImagingStudySeriesPerformerSurrogate.function
      actor = this@ImagingStudySeriesPerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(
      model: ImagingStudy.Series.Performer
    ): ImagingStudySeriesPerformerSurrogate =
      with(model) {
        ImagingStudySeriesPerformerSurrogate().apply {
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
internal data class ImagingStudySeriesInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var uid: KotlinString? = null,
  public var _uid: Element? = null,
  public var sopClass: Coding? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
) {
  public fun toModel(): ImagingStudy.Series.Instance =
    ImagingStudy.Series.Instance().apply {
      id = this@ImagingStudySeriesInstanceSurrogate.id
      extension = this@ImagingStudySeriesInstanceSurrogate.extension
      modifierExtension = this@ImagingStudySeriesInstanceSurrogate.modifierExtension
      uid =
        Id.of(
          this@ImagingStudySeriesInstanceSurrogate.uid,
          this@ImagingStudySeriesInstanceSurrogate._uid,
        )
      sopClass = this@ImagingStudySeriesInstanceSurrogate.sopClass
      number =
        UnsignedInt.of(
          this@ImagingStudySeriesInstanceSurrogate.number,
          this@ImagingStudySeriesInstanceSurrogate._number,
        )
      title =
        R5String.of(
          this@ImagingStudySeriesInstanceSurrogate.title,
          this@ImagingStudySeriesInstanceSurrogate._title,
        )
    }

  public companion object {
    public fun fromModel(model: ImagingStudy.Series.Instance): ImagingStudySeriesInstanceSurrogate =
      with(model) {
        ImagingStudySeriesInstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          uid = this@with.uid?.value
          _uid = this@with.uid?.toElement()
          sopClass = this@with.sopClass
          number = this@with.number?.value
          _number = this@with.number?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImagingStudySeriesSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var uid: KotlinString? = null,
  public var _uid: Element? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var modality: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var numberOfInstances: Int? = null,
  public var _numberOfInstances: Element? = null,
  public var endpoint: List<Reference?>? = null,
  public var bodySite: CodeableReference? = null,
  public var laterality: CodeableConcept? = null,
  public var specimen: List<Reference?>? = null,
  public var started: KotlinString? = null,
  public var _started: Element? = null,
  public var performer: List<ImagingStudy.Series.Performer>? = null,
  public var instance: List<ImagingStudy.Series.Instance>? = null,
) {
  public fun toModel(): ImagingStudy.Series =
    ImagingStudy.Series().apply {
      id = this@ImagingStudySeriesSurrogate.id
      extension = this@ImagingStudySeriesSurrogate.extension
      modifierExtension = this@ImagingStudySeriesSurrogate.modifierExtension
      uid = Id.of(this@ImagingStudySeriesSurrogate.uid, this@ImagingStudySeriesSurrogate._uid)
      number =
        UnsignedInt.of(
          this@ImagingStudySeriesSurrogate.number,
          this@ImagingStudySeriesSurrogate._number,
        )
      modality = this@ImagingStudySeriesSurrogate.modality
      description =
        R5String.of(
          this@ImagingStudySeriesSurrogate.description,
          this@ImagingStudySeriesSurrogate._description,
        )
      numberOfInstances =
        UnsignedInt.of(
          this@ImagingStudySeriesSurrogate.numberOfInstances,
          this@ImagingStudySeriesSurrogate._numberOfInstances,
        )
      endpoint = this@ImagingStudySeriesSurrogate.endpoint
      bodySite = this@ImagingStudySeriesSurrogate.bodySite
      laterality = this@ImagingStudySeriesSurrogate.laterality
      specimen = this@ImagingStudySeriesSurrogate.specimen
      started =
        DateTime.of(
          FhirDateTime.fromString(this@ImagingStudySeriesSurrogate.started),
          this@ImagingStudySeriesSurrogate._started,
        )
      performer = this@ImagingStudySeriesSurrogate.performer
      instance = this@ImagingStudySeriesSurrogate.instance
    }

  public companion object {
    public fun fromModel(model: ImagingStudy.Series): ImagingStudySeriesSurrogate =
      with(model) {
        ImagingStudySeriesSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          uid = this@with.uid?.value
          _uid = this@with.uid?.toElement()
          number = this@with.number?.value
          _number = this@with.number?.toElement()
          modality = this@with.modality
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          numberOfInstances = this@with.numberOfInstances?.value
          _numberOfInstances = this@with.numberOfInstances?.toElement()
          endpoint = this@with.endpoint
          bodySite = this@with.bodySite
          laterality = this@with.laterality
          specimen = this@with.specimen
          started = this@with.started?.value?.toString()
          _started = this@with.started?.toElement()
          performer = this@with.performer
          instance = this@with.instance
        }
      }
  }
}

@Serializable
internal data class ImagingStudySurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var modality: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var started: KotlinString? = null,
  public var _started: Element? = null,
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var referrer: Reference? = null,
  public var endpoint: List<Reference?>? = null,
  public var numberOfSeries: Int? = null,
  public var _numberOfSeries: Element? = null,
  public var numberOfInstances: Int? = null,
  public var _numberOfInstances: Element? = null,
  public var procedure: List<CodeableReference?>? = null,
  public var location: Reference? = null,
  public var reason: List<CodeableReference?>? = null,
  public var note: List<Annotation?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var series: List<ImagingStudy.Series>? = null,
) {
  public fun toModel(): ImagingStudy =
    ImagingStudy().apply {
      id = this@ImagingStudySurrogate.id
      meta = this@ImagingStudySurrogate.meta
      implicitRules =
        Uri.of(this@ImagingStudySurrogate.implicitRules, this@ImagingStudySurrogate._implicitRules)
      language = Code.of(this@ImagingStudySurrogate.language, this@ImagingStudySurrogate._language)
      text = this@ImagingStudySurrogate.text
      contained = this@ImagingStudySurrogate.contained
      extension = this@ImagingStudySurrogate.extension
      modifierExtension = this@ImagingStudySurrogate.modifierExtension
      identifier = this@ImagingStudySurrogate.identifier
      status =
        Enumeration.of(
          this@ImagingStudySurrogate.status?.let {
            com.google.fhir.model.r5.ImagingStudy.ImagingStudyStatus.fromCode(it)
          },
          this@ImagingStudySurrogate._status,
        )
      modality = this@ImagingStudySurrogate.modality
      subject = this@ImagingStudySurrogate.subject
      encounter = this@ImagingStudySurrogate.encounter
      started =
        DateTime.of(
          FhirDateTime.fromString(this@ImagingStudySurrogate.started),
          this@ImagingStudySurrogate._started,
        )
      basedOn = this@ImagingStudySurrogate.basedOn
      partOf = this@ImagingStudySurrogate.partOf
      referrer = this@ImagingStudySurrogate.referrer
      endpoint = this@ImagingStudySurrogate.endpoint
      numberOfSeries =
        UnsignedInt.of(
          this@ImagingStudySurrogate.numberOfSeries,
          this@ImagingStudySurrogate._numberOfSeries,
        )
      numberOfInstances =
        UnsignedInt.of(
          this@ImagingStudySurrogate.numberOfInstances,
          this@ImagingStudySurrogate._numberOfInstances,
        )
      procedure = this@ImagingStudySurrogate.procedure
      location = this@ImagingStudySurrogate.location
      reason = this@ImagingStudySurrogate.reason
      note = this@ImagingStudySurrogate.note
      description =
        R5String.of(this@ImagingStudySurrogate.description, this@ImagingStudySurrogate._description)
      series = this@ImagingStudySurrogate.series
    }

  public companion object {
    public fun fromModel(model: ImagingStudy): ImagingStudySurrogate =
      with(model) {
        ImagingStudySurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          modality = this@with.modality
          subject = this@with.subject
          encounter = this@with.encounter
          started = this@with.started?.value?.toString()
          _started = this@with.started?.toElement()
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          referrer = this@with.referrer
          endpoint = this@with.endpoint
          numberOfSeries = this@with.numberOfSeries?.value
          _numberOfSeries = this@with.numberOfSeries?.toElement()
          numberOfInstances = this@with.numberOfInstances?.value
          _numberOfInstances = this@with.numberOfInstances?.toElement()
          procedure = this@with.procedure
          location = this@with.location
          reason = this@with.reason
          note = this@with.note
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          series = this@with.series
        }
      }
  }
}
