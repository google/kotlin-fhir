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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AdverseEventParticipantSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): AdverseEvent.Participant =
    AdverseEvent.Participant(
      id = this@AdverseEventParticipantSurrogate.id,
      extension = this@AdverseEventParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventParticipantSurrogate.modifierExtension ?: mutableListOf(),
      function = this@AdverseEventParticipantSurrogate.function,
      actor = this@AdverseEventParticipantSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: AdverseEvent.Participant): AdverseEventParticipantSurrogate =
      with(model) {
        AdverseEventParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class AdverseEventSuspectEntityCausalitySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var assessmentMethod: CodeableConcept? = null,
  public var entityRelatedness: CodeableConcept? = null,
  public var author: Reference? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity.Causality =
    AdverseEvent.SuspectEntity.Causality(
      id = this@AdverseEventSuspectEntityCausalitySurrogate.id,
      extension = this@AdverseEventSuspectEntityCausalitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventSuspectEntityCausalitySurrogate.modifierExtension ?: mutableListOf(),
      assessmentMethod = this@AdverseEventSuspectEntityCausalitySurrogate.assessmentMethod,
      entityRelatedness = this@AdverseEventSuspectEntityCausalitySurrogate.entityRelatedness,
      author = this@AdverseEventSuspectEntityCausalitySurrogate.author,
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
          assessmentMethod = this@with.assessmentMethod,
          entityRelatedness = this@with.entityRelatedness,
          author = this@with.author,
        )
      }
  }
}

@Serializable
internal data class AdverseEventSuspectEntityInstanceSurrogate(
  public var instanceCodeableConcept: CodeableConcept? = null,
  public var instanceReference: Reference? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity.Instance =
    AdverseEvent.SuspectEntity.Instance.from(
      this@AdverseEventSuspectEntityInstanceSurrogate.instanceCodeableConcept,
      this@AdverseEventSuspectEntityInstanceSurrogate.instanceReference,
    )!! !!

  public companion object {
    public fun fromModel(
      model: AdverseEvent.SuspectEntity.Instance
    ): AdverseEventSuspectEntityInstanceSurrogate =
      with(model) {
        AdverseEventSuspectEntityInstanceSurrogate(
          instanceCodeableConcept = this@with.asCodeableConcept()?.value,
          instanceReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class AdverseEventSuspectEntitySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var instance: AdverseEvent.SuspectEntity.Instance,
  public var causality: AdverseEvent.SuspectEntity.Causality? = null,
) {
  public fun toModel(): AdverseEvent.SuspectEntity =
    AdverseEvent.SuspectEntity(
      id = this@AdverseEventSuspectEntitySurrogate.id,
      extension = this@AdverseEventSuspectEntitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventSuspectEntitySurrogate.modifierExtension ?: mutableListOf(),
      instance = this@AdverseEventSuspectEntitySurrogate.instance,
      causality = this@AdverseEventSuspectEntitySurrogate.causality,
    )

  public companion object {
    public fun fromModel(model: AdverseEvent.SuspectEntity): AdverseEventSuspectEntitySurrogate =
      with(model) {
        AdverseEventSuspectEntitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          instance = this@with.instance,
          causality = this@with.causality,
        )
      }
  }
}

@Serializable
internal data class AdverseEventContributingFactorItemSurrogate(
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.ContributingFactor.Item =
    AdverseEvent.ContributingFactor.Item.from(
      this@AdverseEventContributingFactorItemSurrogate.itemReference,
      this@AdverseEventContributingFactorItemSurrogate.itemCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: AdverseEvent.ContributingFactor.Item
    ): AdverseEventContributingFactorItemSurrogate =
      with(model) {
        AdverseEventContributingFactorItemSurrogate(
          itemReference = this@with.asReference()?.value,
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class AdverseEventContributingFactorSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: AdverseEvent.ContributingFactor.Item,
) {
  public fun toModel(): AdverseEvent.ContributingFactor =
    AdverseEvent.ContributingFactor(
      id = this@AdverseEventContributingFactorSurrogate.id,
      extension = this@AdverseEventContributingFactorSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventContributingFactorSurrogate.modifierExtension ?: mutableListOf(),
      item = this@AdverseEventContributingFactorSurrogate.item,
    )

  public companion object {
    public fun fromModel(
      model: AdverseEvent.ContributingFactor
    ): AdverseEventContributingFactorSurrogate =
      with(model) {
        AdverseEventContributingFactorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
        )
      }
  }
}

@Serializable
internal data class AdverseEventPreventiveActionItemSurrogate(
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.PreventiveAction.Item =
    AdverseEvent.PreventiveAction.Item.from(
      this@AdverseEventPreventiveActionItemSurrogate.itemReference,
      this@AdverseEventPreventiveActionItemSurrogate.itemCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: AdverseEvent.PreventiveAction.Item
    ): AdverseEventPreventiveActionItemSurrogate =
      with(model) {
        AdverseEventPreventiveActionItemSurrogate(
          itemReference = this@with.asReference()?.value,
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class AdverseEventPreventiveActionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: AdverseEvent.PreventiveAction.Item,
) {
  public fun toModel(): AdverseEvent.PreventiveAction =
    AdverseEvent.PreventiveAction(
      id = this@AdverseEventPreventiveActionSurrogate.id,
      extension = this@AdverseEventPreventiveActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventPreventiveActionSurrogate.modifierExtension ?: mutableListOf(),
      item = this@AdverseEventPreventiveActionSurrogate.item,
    )

  public companion object {
    public fun fromModel(
      model: AdverseEvent.PreventiveAction
    ): AdverseEventPreventiveActionSurrogate =
      with(model) {
        AdverseEventPreventiveActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
        )
      }
  }
}

@Serializable
internal data class AdverseEventMitigatingActionItemSurrogate(
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.MitigatingAction.Item =
    AdverseEvent.MitigatingAction.Item.from(
      this@AdverseEventMitigatingActionItemSurrogate.itemReference,
      this@AdverseEventMitigatingActionItemSurrogate.itemCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: AdverseEvent.MitigatingAction.Item
    ): AdverseEventMitigatingActionItemSurrogate =
      with(model) {
        AdverseEventMitigatingActionItemSurrogate(
          itemReference = this@with.asReference()?.value,
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class AdverseEventMitigatingActionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: AdverseEvent.MitigatingAction.Item,
) {
  public fun toModel(): AdverseEvent.MitigatingAction =
    AdverseEvent.MitigatingAction(
      id = this@AdverseEventMitigatingActionSurrogate.id,
      extension = this@AdverseEventMitigatingActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventMitigatingActionSurrogate.modifierExtension ?: mutableListOf(),
      item = this@AdverseEventMitigatingActionSurrogate.item,
    )

  public companion object {
    public fun fromModel(
      model: AdverseEvent.MitigatingAction
    ): AdverseEventMitigatingActionSurrogate =
      with(model) {
        AdverseEventMitigatingActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
        )
      }
  }
}

@Serializable
internal data class AdverseEventSupportingInfoItemSurrogate(
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): AdverseEvent.SupportingInfo.Item =
    AdverseEvent.SupportingInfo.Item.from(
      this@AdverseEventSupportingInfoItemSurrogate.itemReference,
      this@AdverseEventSupportingInfoItemSurrogate.itemCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: AdverseEvent.SupportingInfo.Item
    ): AdverseEventSupportingInfoItemSurrogate =
      with(model) {
        AdverseEventSupportingInfoItemSurrogate(
          itemReference = this@with.asReference()?.value,
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class AdverseEventSupportingInfoSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: AdverseEvent.SupportingInfo.Item,
) {
  public fun toModel(): AdverseEvent.SupportingInfo =
    AdverseEvent.SupportingInfo(
      id = this@AdverseEventSupportingInfoSurrogate.id,
      extension = this@AdverseEventSupportingInfoSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@AdverseEventSupportingInfoSurrogate.modifierExtension ?: mutableListOf(),
      item = this@AdverseEventSupportingInfoSurrogate.item,
    )

  public companion object {
    public fun fromModel(model: AdverseEvent.SupportingInfo): AdverseEventSupportingInfoSurrogate =
      with(model) {
        AdverseEventSupportingInfoSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
        )
      }
  }
}

@Serializable
internal data class AdverseEventOccurrenceSurrogate(
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
) {
  public fun toModel(): AdverseEvent.Occurrence =
    AdverseEvent.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@AdverseEventOccurrenceSurrogate.occurrenceDateTime),
        this@AdverseEventOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@AdverseEventOccurrenceSurrogate.occurrencePeriod,
      this@AdverseEventOccurrenceSurrogate.occurrenceTiming,
    )!!

  public companion object {
    public fun fromModel(model: AdverseEvent.Occurrence): AdverseEventOccurrenceSurrogate =
      with(model) {
        AdverseEventOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var actuality: String? = null,
  public var _actuality: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var occurrence: AdverseEvent.Occurrence? = null,
  public var detected: String? = null,
  public var _detected: Element? = null,
  public var recordedDate: String? = null,
  public var _recordedDate: Element? = null,
  public var resultingEffect: MutableList<Reference>? = null,
  public var location: Reference? = null,
  public var seriousness: CodeableConcept? = null,
  public var outcome: MutableList<CodeableConcept>? = null,
  public var recorder: Reference? = null,
  public var participant: MutableList<AdverseEvent.Participant>? = null,
  public var study: MutableList<Reference>? = null,
  public var expectedInResearchStudy: KotlinBoolean? = null,
  public var _expectedInResearchStudy: Element? = null,
  public var suspectEntity: MutableList<AdverseEvent.SuspectEntity>? = null,
  public var contributingFactor: MutableList<AdverseEvent.ContributingFactor>? = null,
  public var preventiveAction: MutableList<AdverseEvent.PreventiveAction>? = null,
  public var mitigatingAction: MutableList<AdverseEvent.MitigatingAction>? = null,
  public var supportingInfo: MutableList<AdverseEvent.SupportingInfo>? = null,
  public var note: MutableList<Annotation>? = null,
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
      identifier = this@AdverseEventSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.AdverseEvent.AdverseEventStatus.fromCode(
            this@AdverseEventSurrogate.status!!
          ),
          this@AdverseEventSurrogate._status,
        ),
      actuality =
        Enumeration.of(
          com.google.fhir.model.r5.AdverseEvent.AdverseEventActuality.fromCode(
            this@AdverseEventSurrogate.actuality!!
          ),
          this@AdverseEventSurrogate._actuality,
        ),
      category = this@AdverseEventSurrogate.category ?: mutableListOf(),
      code = this@AdverseEventSurrogate.code,
      subject = this@AdverseEventSurrogate.subject,
      encounter = this@AdverseEventSurrogate.encounter,
      occurrence = this@AdverseEventSurrogate.occurrence,
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
      resultingEffect = this@AdverseEventSurrogate.resultingEffect ?: mutableListOf(),
      location = this@AdverseEventSurrogate.location,
      seriousness = this@AdverseEventSurrogate.seriousness,
      outcome = this@AdverseEventSurrogate.outcome ?: mutableListOf(),
      recorder = this@AdverseEventSurrogate.recorder,
      participant = this@AdverseEventSurrogate.participant ?: mutableListOf(),
      study = this@AdverseEventSurrogate.study ?: mutableListOf(),
      expectedInResearchStudy =
        R5Boolean.of(
          this@AdverseEventSurrogate.expectedInResearchStudy,
          this@AdverseEventSurrogate._expectedInResearchStudy,
        ),
      suspectEntity = this@AdverseEventSurrogate.suspectEntity ?: mutableListOf(),
      contributingFactor = this@AdverseEventSurrogate.contributingFactor ?: mutableListOf(),
      preventiveAction = this@AdverseEventSurrogate.preventiveAction ?: mutableListOf(),
      mitigatingAction = this@AdverseEventSurrogate.mitigatingAction ?: mutableListOf(),
      supportingInfo = this@AdverseEventSurrogate.supportingInfo ?: mutableListOf(),
      note = this@AdverseEventSurrogate.note ?: mutableListOf(),
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          actuality = this@with.actuality.value?.getCode(),
          _actuality = this@with.actuality.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          encounter = this@with.encounter,
          occurrence = this@with.occurrence,
          detected = this@with.detected?.value?.toString(),
          _detected = this@with.detected?.toElement(),
          recordedDate = this@with.recordedDate?.value?.toString(),
          _recordedDate = this@with.recordedDate?.toElement(),
          resultingEffect = this@with.resultingEffect.takeUnless { it.all { it == null } },
          location = this@with.location,
          seriousness = this@with.seriousness,
          outcome = this@with.outcome.takeUnless { it.all { it == null } },
          recorder = this@with.recorder,
          participant = this@with.participant.takeUnless { it.all { it == null } },
          study = this@with.study.takeUnless { it.all { it == null } },
          expectedInResearchStudy = this@with.expectedInResearchStudy?.value,
          _expectedInResearchStudy = this@with.expectedInResearchStudy?.toElement(),
          suspectEntity = this@with.suspectEntity.takeUnless { it.all { it == null } },
          contributingFactor = this@with.contributingFactor.takeUnless { it.all { it == null } },
          preventiveAction = this@with.preventiveAction.takeUnless { it.all { it == null } },
          mitigatingAction = this@with.mitigatingAction.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
