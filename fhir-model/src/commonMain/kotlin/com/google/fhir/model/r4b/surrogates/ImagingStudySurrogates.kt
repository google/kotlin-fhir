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
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Id
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.ImagingStudy
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.UnsignedInt
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImagingStudySeriesSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var uid: KotlinString? = null,
  public var _uid: Element? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var modality: Coding,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var numberOfInstances: Int? = null,
  public var _numberOfInstances: Element? = null,
  public var endpoint: MutableList<Reference>? = null,
  public var bodySite: Coding? = null,
  public var laterality: Coding? = null,
  public var specimen: MutableList<Reference>? = null,
  public var started: KotlinString? = null,
  public var _started: Element? = null,
  public var performer: MutableList<ImagingStudy.Series.Performer>? = null,
  public var instance: MutableList<ImagingStudy.Series.Instance>? = null,
) {
  public fun toModel(): ImagingStudy.Series =
    ImagingStudy.Series(
      id = this@ImagingStudySeriesSurrogate.id,
      extension = this@ImagingStudySeriesSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImagingStudySeriesSurrogate.modifierExtension ?: mutableListOf(),
      uid = Id.of(this@ImagingStudySeriesSurrogate.uid, this@ImagingStudySeriesSurrogate._uid)!!,
      number =
        UnsignedInt.of(
          this@ImagingStudySeriesSurrogate.number,
          this@ImagingStudySeriesSurrogate._number,
        ),
      modality = this@ImagingStudySeriesSurrogate.modality,
      description =
        R4bString.of(
          this@ImagingStudySeriesSurrogate.description,
          this@ImagingStudySeriesSurrogate._description,
        ),
      numberOfInstances =
        UnsignedInt.of(
          this@ImagingStudySeriesSurrogate.numberOfInstances,
          this@ImagingStudySeriesSurrogate._numberOfInstances,
        ),
      endpoint = this@ImagingStudySeriesSurrogate.endpoint ?: mutableListOf(),
      bodySite = this@ImagingStudySeriesSurrogate.bodySite,
      laterality = this@ImagingStudySeriesSurrogate.laterality,
      specimen = this@ImagingStudySeriesSurrogate.specimen ?: mutableListOf(),
      started =
        DateTime.of(
          FhirDateTime.fromString(this@ImagingStudySeriesSurrogate.started),
          this@ImagingStudySeriesSurrogate._started,
        ),
      performer = this@ImagingStudySeriesSurrogate.performer ?: mutableListOf(),
      instance = this@ImagingStudySeriesSurrogate.instance ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ImagingStudy.Series): ImagingStudySeriesSurrogate =
      with(model) {
        ImagingStudySeriesSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          uid = this@with.uid.value,
          _uid = this@with.uid.toElement(),
          number = this@with.number?.value,
          _number = this@with.number?.toElement(),
          modality = this@with.modality,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          numberOfInstances = this@with.numberOfInstances?.value,
          _numberOfInstances = this@with.numberOfInstances?.toElement(),
          endpoint = this@with.endpoint.takeIf { it.isNotEmpty() },
          bodySite = this@with.bodySite,
          laterality = this@with.laterality,
          specimen = this@with.specimen.takeIf { it.isNotEmpty() },
          started = this@with.started?.value?.toString(),
          _started = this@with.started?.toElement(),
          performer = this@with.performer.takeIf { it.isNotEmpty() },
          instance = this@with.instance.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class ImagingStudySeriesPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): ImagingStudy.Series.Performer =
    ImagingStudy.Series.Performer(
      id = this@ImagingStudySeriesPerformerSurrogate.id,
      extension = this@ImagingStudySeriesPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImagingStudySeriesPerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ImagingStudySeriesPerformerSurrogate.function,
      actor = this@ImagingStudySeriesPerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(
      model: ImagingStudy.Series.Performer
    ): ImagingStudySeriesPerformerSurrogate =
      with(model) {
        ImagingStudySeriesPerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class ImagingStudySeriesInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var uid: KotlinString? = null,
  public var _uid: Element? = null,
  public var sopClass: Coding,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
) {
  public fun toModel(): ImagingStudy.Series.Instance =
    ImagingStudy.Series.Instance(
      id = this@ImagingStudySeriesInstanceSurrogate.id,
      extension = this@ImagingStudySeriesInstanceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImagingStudySeriesInstanceSurrogate.modifierExtension ?: mutableListOf(),
      uid =
        Id.of(
          this@ImagingStudySeriesInstanceSurrogate.uid,
          this@ImagingStudySeriesInstanceSurrogate._uid,
        )!!,
      sopClass = this@ImagingStudySeriesInstanceSurrogate.sopClass,
      number =
        UnsignedInt.of(
          this@ImagingStudySeriesInstanceSurrogate.number,
          this@ImagingStudySeriesInstanceSurrogate._number,
        ),
      title =
        R4bString.of(
          this@ImagingStudySeriesInstanceSurrogate.title,
          this@ImagingStudySeriesInstanceSurrogate._title,
        ),
    )

  public companion object {
    public fun fromModel(model: ImagingStudy.Series.Instance): ImagingStudySeriesInstanceSurrogate =
      with(model) {
        ImagingStudySeriesInstanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          uid = this@with.uid.value,
          _uid = this@with.uid.toElement(),
          sopClass = this@with.sopClass,
          number = this@with.number?.value,
          _number = this@with.number?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var modality: MutableList<Coding>? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var started: KotlinString? = null,
  public var _started: Element? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var referrer: Reference? = null,
  public var interpreter: MutableList<Reference>? = null,
  public var endpoint: MutableList<Reference>? = null,
  public var numberOfSeries: Int? = null,
  public var _numberOfSeries: Element? = null,
  public var numberOfInstances: Int? = null,
  public var _numberOfInstances: Element? = null,
  public var procedureReference: Reference? = null,
  public var procedureCode: MutableList<CodeableConcept>? = null,
  public var location: Reference? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var series: MutableList<ImagingStudy.Series>? = null,
) {
  public fun toModel(): ImagingStudy =
    ImagingStudy(
      id = this@ImagingStudySurrogate.id,
      meta = this@ImagingStudySurrogate.meta,
      implicitRules =
        Uri.of(this@ImagingStudySurrogate.implicitRules, this@ImagingStudySurrogate._implicitRules),
      language = Code.of(this@ImagingStudySurrogate.language, this@ImagingStudySurrogate._language),
      text = this@ImagingStudySurrogate.text,
      contained = this@ImagingStudySurrogate.contained ?: mutableListOf(),
      extension = this@ImagingStudySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImagingStudySurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ImagingStudySurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          ImagingStudy.ImagingStudyStatus.fromCode(this@ImagingStudySurrogate.status!!),
          this@ImagingStudySurrogate._status,
        ),
      modality = this@ImagingStudySurrogate.modality ?: mutableListOf(),
      subject = this@ImagingStudySurrogate.subject,
      encounter = this@ImagingStudySurrogate.encounter,
      started =
        DateTime.of(
          FhirDateTime.fromString(this@ImagingStudySurrogate.started),
          this@ImagingStudySurrogate._started,
        ),
      basedOn = this@ImagingStudySurrogate.basedOn ?: mutableListOf(),
      referrer = this@ImagingStudySurrogate.referrer,
      interpreter = this@ImagingStudySurrogate.interpreter ?: mutableListOf(),
      endpoint = this@ImagingStudySurrogate.endpoint ?: mutableListOf(),
      numberOfSeries =
        UnsignedInt.of(
          this@ImagingStudySurrogate.numberOfSeries,
          this@ImagingStudySurrogate._numberOfSeries,
        ),
      numberOfInstances =
        UnsignedInt.of(
          this@ImagingStudySurrogate.numberOfInstances,
          this@ImagingStudySurrogate._numberOfInstances,
        ),
      procedureReference = this@ImagingStudySurrogate.procedureReference,
      procedureCode = this@ImagingStudySurrogate.procedureCode ?: mutableListOf(),
      location = this@ImagingStudySurrogate.location,
      reasonCode = this@ImagingStudySurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@ImagingStudySurrogate.reasonReference ?: mutableListOf(),
      note = this@ImagingStudySurrogate.note ?: mutableListOf(),
      description =
        R4bString.of(
          this@ImagingStudySurrogate.description,
          this@ImagingStudySurrogate._description,
        ),
      series = this@ImagingStudySurrogate.series ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ImagingStudy): ImagingStudySurrogate =
      with(model) {
        ImagingStudySurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          modality = this@with.modality.takeIf { it.isNotEmpty() },
          subject = this@with.subject,
          encounter = this@with.encounter,
          started = this@with.started?.value?.toString(),
          _started = this@with.started?.toElement(),
          basedOn = this@with.basedOn.takeIf { it.isNotEmpty() },
          referrer = this@with.referrer,
          interpreter = this@with.interpreter.takeIf { it.isNotEmpty() },
          endpoint = this@with.endpoint.takeIf { it.isNotEmpty() },
          numberOfSeries = this@with.numberOfSeries?.value,
          _numberOfSeries = this@with.numberOfSeries?.toElement(),
          numberOfInstances = this@with.numberOfInstances?.value,
          _numberOfInstances = this@with.numberOfInstances?.toElement(),
          procedureReference = this@with.procedureReference,
          procedureCode = this@with.procedureCode.takeIf { it.isNotEmpty() },
          location = this@with.location,
          reasonCode = this@with.reasonCode.takeIf { it.isNotEmpty() },
          reasonReference = this@with.reasonReference.takeIf { it.isNotEmpty() },
          note = this@with.note.takeIf { it.isNotEmpty() },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          series = this@with.series.takeIf { it.isNotEmpty() },
        )
      }
  }
}
