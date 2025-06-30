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

import com.google.fhir.model.r5.AdverseEvent
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
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
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AdverseEventParticipantSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): AdverseEvent.Participant =
    AdverseEvent.Participant().apply {
      id = this@AdverseEventParticipantSurrogate.id
      extension = this@AdverseEventParticipantSurrogate.extension
      modifierExtension = this@AdverseEventParticipantSurrogate.modifierExtension
      function = this@AdverseEventParticipantSurrogate.function
      actor = this@AdverseEventParticipantSurrogate.actor
    }

  public companion object {
    public fun fromModel(model: AdverseEvent.Participant): AdverseEventParticipantSurrogate =
      with(model) {
        AdverseEventParticipantSurrogate().apply {
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
internal data class AdverseEventSuspectEntityCausalitySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var assessmentMethod: CodeableConcept? = null,
  public var entityRelatedness: CodeableConcept? = null,
  public var author: Reference? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity.Causality =
    AdverseEvent.SuspectEntity.Causality().apply {
      id = this@AdverseEventSuspectEntityCausalitySurrogate.id
      extension = this@AdverseEventSuspectEntityCausalitySurrogate.extension
      modifierExtension = this@AdverseEventSuspectEntityCausalitySurrogate.modifierExtension
      assessmentMethod = this@AdverseEventSuspectEntityCausalitySurrogate.assessmentMethod
      entityRelatedness = this@AdverseEventSuspectEntityCausalitySurrogate.entityRelatedness
      author = this@AdverseEventSuspectEntityCausalitySurrogate.author
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
          assessmentMethod = this@with.assessmentMethod
          entityRelatedness = this@with.entityRelatedness
          author = this@with.author
        }
      }
  }
}

@Serializable
internal data class AdverseEventSuspectEntitySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var instanceCodeableConcept: CodeableConcept? = null,
  public var instanceReference: Reference? = null,
  public var causality: AdverseEvent.SuspectEntity.Causality? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity =
    AdverseEvent.SuspectEntity().apply {
      id = this@AdverseEventSuspectEntitySurrogate.id
      extension = this@AdverseEventSuspectEntitySurrogate.extension
      modifierExtension = this@AdverseEventSuspectEntitySurrogate.modifierExtension
      instance =
        AdverseEvent.SuspectEntity.Instance?.from(
          this@AdverseEventSuspectEntitySurrogate.instanceCodeableConcept,
          this@AdverseEventSuspectEntitySurrogate.instanceReference,
        )
      causality = this@AdverseEventSuspectEntitySurrogate.causality
    }

  public companion object {
    public fun fromModel(model: AdverseEvent.SuspectEntity): AdverseEventSuspectEntitySurrogate =
      with(model) {
        AdverseEventSuspectEntitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          instanceCodeableConcept = this@with.instance?.asCodeableConcept()?.value
          instanceReference = this@with.instance?.asReference()?.value
          causality = this@with.causality
        }
      }
  }
}

@Serializable
internal data class AdverseEventContributingFactorSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.ContributingFactor =
    AdverseEvent.ContributingFactor().apply {
      id = this@AdverseEventContributingFactorSurrogate.id
      extension = this@AdverseEventContributingFactorSurrogate.extension
      modifierExtension = this@AdverseEventContributingFactorSurrogate.modifierExtension
      item =
        AdverseEvent.ContributingFactor.Item?.from(
          this@AdverseEventContributingFactorSurrogate.itemReference,
          this@AdverseEventContributingFactorSurrogate.itemCodeableConcept,
        )
    }

  public companion object {
    public fun fromModel(
      model: AdverseEvent.ContributingFactor
    ): AdverseEventContributingFactorSurrogate =
      with(model) {
        AdverseEventContributingFactorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemReference = this@with.item?.asReference()?.value
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class AdverseEventPreventiveActionSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.PreventiveAction =
    AdverseEvent.PreventiveAction().apply {
      id = this@AdverseEventPreventiveActionSurrogate.id
      extension = this@AdverseEventPreventiveActionSurrogate.extension
      modifierExtension = this@AdverseEventPreventiveActionSurrogate.modifierExtension
      item =
        AdverseEvent.PreventiveAction.Item?.from(
          this@AdverseEventPreventiveActionSurrogate.itemReference,
          this@AdverseEventPreventiveActionSurrogate.itemCodeableConcept,
        )
    }

  public companion object {
    public fun fromModel(
      model: AdverseEvent.PreventiveAction
    ): AdverseEventPreventiveActionSurrogate =
      with(model) {
        AdverseEventPreventiveActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemReference = this@with.item?.asReference()?.value
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class AdverseEventMitigatingActionSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.MitigatingAction =
    AdverseEvent.MitigatingAction().apply {
      id = this@AdverseEventMitigatingActionSurrogate.id
      extension = this@AdverseEventMitigatingActionSurrogate.extension
      modifierExtension = this@AdverseEventMitigatingActionSurrogate.modifierExtension
      item =
        AdverseEvent.MitigatingAction.Item?.from(
          this@AdverseEventMitigatingActionSurrogate.itemReference,
          this@AdverseEventMitigatingActionSurrogate.itemCodeableConcept,
        )
    }

  public companion object {
    public fun fromModel(
      model: AdverseEvent.MitigatingAction
    ): AdverseEventMitigatingActionSurrogate =
      with(model) {
        AdverseEventMitigatingActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemReference = this@with.item?.asReference()?.value
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class AdverseEventSupportingInfoSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.SupportingInfo =
    AdverseEvent.SupportingInfo().apply {
      id = this@AdverseEventSupportingInfoSurrogate.id
      extension = this@AdverseEventSupportingInfoSurrogate.extension
      modifierExtension = this@AdverseEventSupportingInfoSurrogate.modifierExtension
      item =
        AdverseEvent.SupportingInfo.Item?.from(
          this@AdverseEventSupportingInfoSurrogate.itemReference,
          this@AdverseEventSupportingInfoSurrogate.itemCodeableConcept,
        )
    }

  public companion object {
    public fun fromModel(model: AdverseEvent.SupportingInfo): AdverseEventSupportingInfoSurrogate =
      with(model) {
        AdverseEventSupportingInfoSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemReference = this@with.item?.asReference()?.value
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class AdverseEventSurrogate(
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
  public var status: String? = null,
  public var _status: Element? = null,
  public var actuality: String? = null,
  public var _actuality: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var detected: String? = null,
  public var _detected: Element? = null,
  public var recordedDate: String? = null,
  public var _recordedDate: Element? = null,
  public var resultingEffect: List<Reference?>? = null,
  public var location: Reference? = null,
  public var seriousness: CodeableConcept? = null,
  public var outcome: List<CodeableConcept?>? = null,
  public var recorder: Reference? = null,
  public var participant: List<AdverseEvent.Participant>? = null,
  public var study: List<Reference?>? = null,
  public var expectedInResearchStudy: KotlinBoolean? = null,
  public var _expectedInResearchStudy: Element? = null,
  public var suspectEntity: List<AdverseEvent.SuspectEntity>? = null,
  public var contributingFactor: List<AdverseEvent.ContributingFactor>? = null,
  public var preventiveAction: List<AdverseEvent.PreventiveAction>? = null,
  public var mitigatingAction: List<AdverseEvent.MitigatingAction>? = null,
  public var supportingInfo: List<AdverseEvent.SupportingInfo>? = null,
  public var note: List<Annotation?>? = null,
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
      status =
        Enumeration.of(
          this@AdverseEventSurrogate.status?.let {
            com.google.fhir.model.r5.AdverseEvent.AdverseEventStatus.fromCode(it)
          },
          this@AdverseEventSurrogate._status,
        )
      actuality =
        Enumeration.of(
          this@AdverseEventSurrogate.actuality?.let {
            com.google.fhir.model.r5.AdverseEvent.AdverseEventActuality.fromCode(it)
          },
          this@AdverseEventSurrogate._actuality,
        )
      category = this@AdverseEventSurrogate.category
      code = this@AdverseEventSurrogate.code
      subject = this@AdverseEventSurrogate.subject
      encounter = this@AdverseEventSurrogate.encounter
      occurrence =
        AdverseEvent.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@AdverseEventSurrogate.occurrenceDateTime),
            this@AdverseEventSurrogate._occurrenceDateTime,
          ),
          this@AdverseEventSurrogate.occurrencePeriod,
          this@AdverseEventSurrogate.occurrenceTiming,
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
      resultingEffect = this@AdverseEventSurrogate.resultingEffect
      location = this@AdverseEventSurrogate.location
      seriousness = this@AdverseEventSurrogate.seriousness
      outcome = this@AdverseEventSurrogate.outcome
      recorder = this@AdverseEventSurrogate.recorder
      participant = this@AdverseEventSurrogate.participant
      study = this@AdverseEventSurrogate.study
      expectedInResearchStudy =
        R5Boolean.of(
          this@AdverseEventSurrogate.expectedInResearchStudy,
          this@AdverseEventSurrogate._expectedInResearchStudy,
        )
      suspectEntity = this@AdverseEventSurrogate.suspectEntity
      contributingFactor = this@AdverseEventSurrogate.contributingFactor
      preventiveAction = this@AdverseEventSurrogate.preventiveAction
      mitigatingAction = this@AdverseEventSurrogate.mitigatingAction
      supportingInfo = this@AdverseEventSurrogate.supportingInfo
      note = this@AdverseEventSurrogate.note
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          actuality = this@with.actuality?.value?.getCode()
          _actuality = this@with.actuality?.toElement()
          category = this@with.category
          code = this@with.code
          subject = this@with.subject
          encounter = this@with.encounter
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          occurrenceTiming = this@with.occurrence?.asTiming()?.value
          detected = this@with.detected?.value?.toString()
          _detected = this@with.detected?.toElement()
          recordedDate = this@with.recordedDate?.value?.toString()
          _recordedDate = this@with.recordedDate?.toElement()
          resultingEffect = this@with.resultingEffect
          location = this@with.location
          seriousness = this@with.seriousness
          outcome = this@with.outcome
          recorder = this@with.recorder
          participant = this@with.participant
          study = this@with.study
          expectedInResearchStudy = this@with.expectedInResearchStudy?.value
          _expectedInResearchStudy = this@with.expectedInResearchStudy?.toElement()
          suspectEntity = this@with.suspectEntity
          contributingFactor = this@with.contributingFactor
          preventiveAction = this@with.preventiveAction
          mitigatingAction = this@with.mitigatingAction
          supportingInfo = this@with.supportingInfo
          note = this@with.note
        }
      }
  }
}
