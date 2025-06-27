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

import com.google.fhir.model.r4b.AdverseEvent
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AdverseEventSuspectEntityCausalitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var assessment: CodeableConcept? = null,
  public var productRelatedness: KotlinString? = null,
  public var _productRelatedness: Element? = null,
  public var author: Reference? = null,
  public var method: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity.Causality =
    AdverseEvent.SuspectEntity.Causality().apply {
      id = this@AdverseEventSuspectEntityCausalitySurrogate.id
      extension = this@AdverseEventSuspectEntityCausalitySurrogate.extension
      modifierExtension = this@AdverseEventSuspectEntityCausalitySurrogate.modifierExtension
      assessment = this@AdverseEventSuspectEntityCausalitySurrogate.assessment
      productRelatedness =
        R4bString.of(
          this@AdverseEventSuspectEntityCausalitySurrogate.productRelatedness,
          this@AdverseEventSuspectEntityCausalitySurrogate._productRelatedness,
        )
      author = this@AdverseEventSuspectEntityCausalitySurrogate.author
      method = this@AdverseEventSuspectEntityCausalitySurrogate.method
    }

  public companion object {
    public fun fromModel(
      model: AdverseEvent.SuspectEntity.Causality
    ): AdverseEventSuspectEntityCausalitySurrogate =
      with(model) {
        AdverseEventSuspectEntityCausalitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          assessment = this@with.assessment
          productRelatedness = this@with.productRelatedness?.value
          _productRelatedness = this@with.productRelatedness?.toElement()
          author = this@with.author
          method = this@with.method
        }
      }
  }
}

@Serializable
internal data class AdverseEventSuspectEntitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var instance: Reference? = null,
  public var causality: List<AdverseEvent.SuspectEntity.Causality>? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity =
    AdverseEvent.SuspectEntity().apply {
      id = this@AdverseEventSuspectEntitySurrogate.id
      extension = this@AdverseEventSuspectEntitySurrogate.extension
      modifierExtension = this@AdverseEventSuspectEntitySurrogate.modifierExtension
      instance = this@AdverseEventSuspectEntitySurrogate.instance
      causality = this@AdverseEventSuspectEntitySurrogate.causality
    }

  public companion object {
    public fun fromModel(model: AdverseEvent.SuspectEntity): AdverseEventSuspectEntitySurrogate =
      with(model) {
        AdverseEventSuspectEntitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          instance = this@with.instance
          causality = this@with.causality
        }
      }
  }
}

@Serializable
internal data class AdverseEventSurrogate(
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
  public var identifier: Identifier? = null,
  public var actuality: KotlinString? = null,
  public var _actuality: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var event: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var detected: KotlinString? = null,
  public var _detected: Element? = null,
  public var recordedDate: KotlinString? = null,
  public var _recordedDate: Element? = null,
  public var resultingCondition: List<Reference?>? = null,
  public var location: Reference? = null,
  public var seriousness: CodeableConcept? = null,
  public var severity: CodeableConcept? = null,
  public var outcome: CodeableConcept? = null,
  public var recorder: Reference? = null,
  public var contributor: List<Reference?>? = null,
  public var suspectEntity: List<AdverseEvent.SuspectEntity>? = null,
  public var subjectMedicalHistory: List<Reference?>? = null,
  public var referenceDocument: List<Reference?>? = null,
  public var study: List<Reference?>? = null,
) {
  public fun toModel(): AdverseEvent =
    AdverseEvent().apply {
      id = this@AdverseEventSurrogate.id
      meta = this@AdverseEventSurrogate.meta
      implicitRules =
        Uri.of(this@AdverseEventSurrogate.implicitRules, this@AdverseEventSurrogate._implicitRules)
      language = Code.of(this@AdverseEventSurrogate.language, this@AdverseEventSurrogate._language)
      text = this@AdverseEventSurrogate.text
      contained = this@AdverseEventSurrogate.contained
      extension = this@AdverseEventSurrogate.extension
      modifierExtension = this@AdverseEventSurrogate.modifierExtension
      identifier = this@AdverseEventSurrogate.identifier
      actuality =
        Enumeration.of(
          this@AdverseEventSurrogate.actuality?.let {
            com.google.fhir.model.r4b.AdverseEvent.AdverseEventActuality.fromCode(it)
          },
          this@AdverseEventSurrogate._actuality,
        )
      category = this@AdverseEventSurrogate.category
      event = this@AdverseEventSurrogate.event
      subject = this@AdverseEventSurrogate.subject
      encounter = this@AdverseEventSurrogate.encounter
      date =
        DateTime.of(
          FhirDateTime.fromString(this@AdverseEventSurrogate.date),
          this@AdverseEventSurrogate._date,
        )
      detected =
        DateTime.of(
          FhirDateTime.fromString(this@AdverseEventSurrogate.detected),
          this@AdverseEventSurrogate._detected,
        )
      recordedDate =
        DateTime.of(
          FhirDateTime.fromString(this@AdverseEventSurrogate.recordedDate),
          this@AdverseEventSurrogate._recordedDate,
        )
      resultingCondition = this@AdverseEventSurrogate.resultingCondition
      location = this@AdverseEventSurrogate.location
      seriousness = this@AdverseEventSurrogate.seriousness
      severity = this@AdverseEventSurrogate.severity
      outcome = this@AdverseEventSurrogate.outcome
      recorder = this@AdverseEventSurrogate.recorder
      contributor = this@AdverseEventSurrogate.contributor
      suspectEntity = this@AdverseEventSurrogate.suspectEntity
      subjectMedicalHistory = this@AdverseEventSurrogate.subjectMedicalHistory
      referenceDocument = this@AdverseEventSurrogate.referenceDocument
      study = this@AdverseEventSurrogate.study
    }

  public companion object {
    public fun fromModel(model: AdverseEvent): AdverseEventSurrogate =
      with(model) {
        AdverseEventSurrogate().apply {
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
          actuality = this@with.actuality?.value?.getCode()
          _actuality = this@with.actuality?.toElement()
          category = this@with.category
          event = this@with.event
          subject = this@with.subject
          encounter = this@with.encounter
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          detected = this@with.detected?.value?.toString()
          _detected = this@with.detected?.toElement()
          recordedDate = this@with.recordedDate?.value?.toString()
          _recordedDate = this@with.recordedDate?.toElement()
          resultingCondition = this@with.resultingCondition
          location = this@with.location
          seriousness = this@with.seriousness
          severity = this@with.severity
          outcome = this@with.outcome
          recorder = this@with.recorder
          contributor = this@with.contributor
          suspectEntity = this@with.suspectEntity
          subjectMedicalHistory = this@with.subjectMedicalHistory
          referenceDocument = this@with.referenceDocument
          study = this@with.study
        }
      }
  }
}
