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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AdverseEventSuspectEntitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var instance: Reference,
  public var causality: MutableList<AdverseEvent.SuspectEntity.Causality>? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity =
    AdverseEvent.SuspectEntity(
      id = this@AdverseEventSuspectEntitySurrogate.id,
      extension = this@AdverseEventSuspectEntitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventSuspectEntitySurrogate.modifierExtension ?: mutableListOf(),
      instance = this@AdverseEventSuspectEntitySurrogate.instance,
      causality = this@AdverseEventSuspectEntitySurrogate.causality ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AdverseEvent.SuspectEntity): AdverseEventSuspectEntitySurrogate =
      with(model) {
        AdverseEventSuspectEntitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          instance = this@with.instance,
          causality = this@with.causality.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class AdverseEventSuspectEntityCausalitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var assessment: CodeableConcept? = null,
  public var productRelatedness: KotlinString? = null,
  public var _productRelatedness: Element? = null,
  public var author: Reference? = null,
  public var method: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity.Causality =
    AdverseEvent.SuspectEntity.Causality(
      id = this@AdverseEventSuspectEntityCausalitySurrogate.id,
      extension = this@AdverseEventSuspectEntityCausalitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventSuspectEntityCausalitySurrogate.modifierExtension ?: mutableListOf(),
      assessment = this@AdverseEventSuspectEntityCausalitySurrogate.assessment,
      productRelatedness =
        R4bString.of(
          this@AdverseEventSuspectEntityCausalitySurrogate.productRelatedness,
          this@AdverseEventSuspectEntityCausalitySurrogate._productRelatedness,
        ),
      author = this@AdverseEventSuspectEntityCausalitySurrogate.author,
      method = this@AdverseEventSuspectEntityCausalitySurrogate.method,
    )

  public companion object {
    public fun fromModel(
      model: AdverseEvent.SuspectEntity.Causality
    ): AdverseEventSuspectEntityCausalitySurrogate =
      with(model) {
        AdverseEventSuspectEntityCausalitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          assessment = this@with.assessment,
          productRelatedness = this@with.productRelatedness?.value,
          _productRelatedness = this@with.productRelatedness?.toElement(),
          author = this@with.author,
          method = this@with.method,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var actuality: KotlinString? = null,
  public var _actuality: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var event: CodeableConcept? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var detected: KotlinString? = null,
  public var _detected: Element? = null,
  public var recordedDate: KotlinString? = null,
  public var _recordedDate: Element? = null,
  public var resultingCondition: MutableList<Reference>? = null,
  public var location: Reference? = null,
  public var seriousness: CodeableConcept? = null,
  public var severity: CodeableConcept? = null,
  public var outcome: CodeableConcept? = null,
  public var recorder: Reference? = null,
  public var contributor: MutableList<Reference>? = null,
  public var suspectEntity: MutableList<AdverseEvent.SuspectEntity>? = null,
  public var subjectMedicalHistory: MutableList<Reference>? = null,
  public var referenceDocument: MutableList<Reference>? = null,
  public var study: MutableList<Reference>? = null,
) {
  public fun toModel(): AdverseEvent =
    AdverseEvent(
      id = this@AdverseEventSurrogate.id,
      meta = this@AdverseEventSurrogate.meta,
      implicitRules =
        Uri.of(this@AdverseEventSurrogate.implicitRules, this@AdverseEventSurrogate._implicitRules),
      language = Code.of(this@AdverseEventSurrogate.language, this@AdverseEventSurrogate._language),
      text = this@AdverseEventSurrogate.text,
      contained = this@AdverseEventSurrogate.contained ?: mutableListOf(),
      extension = this@AdverseEventSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AdverseEventSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@AdverseEventSurrogate.identifier,
      actuality =
        Enumeration.of(
          com.google.fhir.model.r4b.AdverseEvent.AdverseEventActuality.fromCode(
            this@AdverseEventSurrogate.actuality!!
          ),
          this@AdverseEventSurrogate._actuality,
        ),
      category = this@AdverseEventSurrogate.category ?: mutableListOf(),
      event = this@AdverseEventSurrogate.event,
      subject = this@AdverseEventSurrogate.subject,
      encounter = this@AdverseEventSurrogate.encounter,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@AdverseEventSurrogate.date),
          this@AdverseEventSurrogate._date,
        ),
      detected =
        DateTime.of(
          FhirDateTime.fromString(this@AdverseEventSurrogate.detected),
          this@AdverseEventSurrogate._detected,
        ),
      recordedDate =
        DateTime.of(
          FhirDateTime.fromString(this@AdverseEventSurrogate.recordedDate),
          this@AdverseEventSurrogate._recordedDate,
        ),
      resultingCondition = this@AdverseEventSurrogate.resultingCondition ?: mutableListOf(),
      location = this@AdverseEventSurrogate.location,
      seriousness = this@AdverseEventSurrogate.seriousness,
      severity = this@AdverseEventSurrogate.severity,
      outcome = this@AdverseEventSurrogate.outcome,
      recorder = this@AdverseEventSurrogate.recorder,
      contributor = this@AdverseEventSurrogate.contributor ?: mutableListOf(),
      suspectEntity = this@AdverseEventSurrogate.suspectEntity ?: mutableListOf(),
      subjectMedicalHistory = this@AdverseEventSurrogate.subjectMedicalHistory ?: mutableListOf(),
      referenceDocument = this@AdverseEventSurrogate.referenceDocument ?: mutableListOf(),
      study = this@AdverseEventSurrogate.study ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AdverseEvent): AdverseEventSurrogate =
      with(model) {
        AdverseEventSurrogate(
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
          identifier = this@with.identifier,
          actuality = this@with.actuality.value?.getCode(),
          _actuality = this@with.actuality.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          event = this@with.event,
          subject = this@with.subject,
          encounter = this@with.encounter,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          detected = this@with.detected?.value?.toString(),
          _detected = this@with.detected?.toElement(),
          recordedDate = this@with.recordedDate?.value?.toString(),
          _recordedDate = this@with.recordedDate?.toElement(),
          resultingCondition = this@with.resultingCondition.takeUnless { it.all { it == null } },
          location = this@with.location,
          seriousness = this@with.seriousness,
          severity = this@with.severity,
          outcome = this@with.outcome,
          recorder = this@with.recorder,
          contributor = this@with.contributor.takeUnless { it.all { it == null } },
          suspectEntity = this@with.suspectEntity.takeUnless { it.all { it == null } },
          subjectMedicalHistory =
            this@with.subjectMedicalHistory.takeUnless { it.all { it == null } },
          referenceDocument = this@with.referenceDocument.takeUnless { it.all { it == null } },
          study = this@with.study.takeUnless { it.all { it == null } },
        )
      }
  }
}
