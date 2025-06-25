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

import com.google.fhir.model.r4.Age
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Expression
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Id
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PlanDefinition
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.TriggerDefinition
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PlanDefinitionGoalTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var measure: CodeableConcept? = null,
  public var detailQuantity: Quantity? = null,
  public var detailRange: Range? = null,
  public var detailCodeableConcept: CodeableConcept? = null,
  public var due: Duration? = null,
) {
  public fun toModel(): PlanDefinition.Goal.Target =
    PlanDefinition.Goal.Target().apply {
      id = this@PlanDefinitionGoalTargetSurrogate.id
      extension = this@PlanDefinitionGoalTargetSurrogate.extension
      modifierExtension = this@PlanDefinitionGoalTargetSurrogate.modifierExtension
      measure = this@PlanDefinitionGoalTargetSurrogate.measure
      detail =
        PlanDefinition.Goal.Target.Detail?.from(
          this@PlanDefinitionGoalTargetSurrogate.detailQuantity,
          this@PlanDefinitionGoalTargetSurrogate.detailRange,
          this@PlanDefinitionGoalTargetSurrogate.detailCodeableConcept,
        )
      due = this@PlanDefinitionGoalTargetSurrogate.due
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Goal.Target): PlanDefinitionGoalTargetSurrogate =
      with(model) {
        PlanDefinitionGoalTargetSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          measure = this@with.measure
          detailQuantity = this@with.detail?.asQuantity()?.value
          detailRange = this@with.detail?.asRange()?.value
          detailCodeableConcept = this@with.detail?.asCodeableConcept()?.value
          due = this@with.due
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionGoalSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var description: CodeableConcept? = null,
  public var priority: CodeableConcept? = null,
  public var start: CodeableConcept? = null,
  public var addresses: List<CodeableConcept?>? = null,
  public var documentation: List<RelatedArtifact?>? = null,
  public var target: List<PlanDefinition.Goal.Target>? = null,
) {
  public fun toModel(): PlanDefinition.Goal =
    PlanDefinition.Goal().apply {
      id = this@PlanDefinitionGoalSurrogate.id
      extension = this@PlanDefinitionGoalSurrogate.extension
      modifierExtension = this@PlanDefinitionGoalSurrogate.modifierExtension
      category = this@PlanDefinitionGoalSurrogate.category
      description = this@PlanDefinitionGoalSurrogate.description
      priority = this@PlanDefinitionGoalSurrogate.priority
      start = this@PlanDefinitionGoalSurrogate.start
      addresses = this@PlanDefinitionGoalSurrogate.addresses
      documentation = this@PlanDefinitionGoalSurrogate.documentation
      target = this@PlanDefinitionGoalSurrogate.target
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Goal): PlanDefinitionGoalSurrogate =
      with(model) {
        PlanDefinitionGoalSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          description = this@with.description
          priority = this@with.priority
          start = this@with.start
          addresses = this@with.addresses
          documentation = this@with.documentation
          target = this@with.target
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionConditionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): PlanDefinition.Action.Condition =
    PlanDefinition.Action.Condition().apply {
      id = this@PlanDefinitionActionConditionSurrogate.id
      extension = this@PlanDefinitionActionConditionSurrogate.extension
      modifierExtension = this@PlanDefinitionActionConditionSurrogate.modifierExtension
      kind =
        Enumeration.of(
          this@PlanDefinitionActionConditionSurrogate.kind?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionConditionKind.fromCode(it)
          },
          this@PlanDefinitionActionConditionSurrogate._kind,
        )
      expression = this@PlanDefinitionActionConditionSurrogate.expression
    }

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.Condition
    ): PlanDefinitionActionConditionSurrogate =
      with(model) {
        PlanDefinitionActionConditionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          expression = this@with.expression
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionRelatedActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var actionId: KotlinString? = null,
  public var _actionId: Element? = null,
  public var relationship: KotlinString? = null,
  public var _relationship: Element? = null,
  public var offsetDuration: Duration? = null,
  public var offsetRange: Range? = null,
) {
  public fun toModel(): PlanDefinition.Action.RelatedAction =
    PlanDefinition.Action.RelatedAction().apply {
      id = this@PlanDefinitionActionRelatedActionSurrogate.id
      extension = this@PlanDefinitionActionRelatedActionSurrogate.extension
      modifierExtension = this@PlanDefinitionActionRelatedActionSurrogate.modifierExtension
      actionId =
        Id.of(
          this@PlanDefinitionActionRelatedActionSurrogate.actionId,
          this@PlanDefinitionActionRelatedActionSurrogate._actionId,
        )
      relationship =
        Enumeration.of(
          this@PlanDefinitionActionRelatedActionSurrogate.relationship?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionRelationshipType.fromCode(it)
          },
          this@PlanDefinitionActionRelatedActionSurrogate._relationship,
        )
      offset =
        PlanDefinition.Action.RelatedAction.Offset?.from(
          this@PlanDefinitionActionRelatedActionSurrogate.offsetDuration,
          this@PlanDefinitionActionRelatedActionSurrogate.offsetRange,
        )
    }

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.RelatedAction
    ): PlanDefinitionActionRelatedActionSurrogate =
      with(model) {
        PlanDefinitionActionRelatedActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          actionId = this@with.actionId?.value
          _actionId = this@with.actionId?.toElement()
          relationship = this@with.relationship?.value?.getCode()
          _relationship = this@with.relationship?.toElement()
          offsetDuration = this@with.offset?.asDuration()?.value
          offsetRange = this@with.offset?.asRange()?.value
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): PlanDefinition.Action.Participant =
    PlanDefinition.Action.Participant().apply {
      id = this@PlanDefinitionActionParticipantSurrogate.id
      extension = this@PlanDefinitionActionParticipantSurrogate.extension
      modifierExtension = this@PlanDefinitionActionParticipantSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@PlanDefinitionActionParticipantSurrogate.type?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionParticipantType.fromCode(it)
          },
          this@PlanDefinitionActionParticipantSurrogate._type,
        )
      role = this@PlanDefinitionActionParticipantSurrogate.role
    }

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.Participant
    ): PlanDefinitionActionParticipantSurrogate =
      with(model) {
        PlanDefinitionActionParticipantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          role = this@with.role
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionDynamicValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): PlanDefinition.Action.DynamicValue =
    PlanDefinition.Action.DynamicValue().apply {
      id = this@PlanDefinitionActionDynamicValueSurrogate.id
      extension = this@PlanDefinitionActionDynamicValueSurrogate.extension
      modifierExtension = this@PlanDefinitionActionDynamicValueSurrogate.modifierExtension
      path =
        R4String.of(
          this@PlanDefinitionActionDynamicValueSurrogate.path,
          this@PlanDefinitionActionDynamicValueSurrogate._path,
        )
      expression = this@PlanDefinitionActionDynamicValueSurrogate.expression
    }

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.DynamicValue
    ): PlanDefinitionActionDynamicValueSurrogate =
      with(model) {
        PlanDefinitionActionDynamicValueSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          expression = this@with.expression
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var prefix: KotlinString? = null,
  public var _prefix: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var textEquivalent: KotlinString? = null,
  public var _textEquivalent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var code: List<CodeableConcept?>? = null,
  public var reason: List<CodeableConcept?>? = null,
  public var documentation: List<RelatedArtifact?>? = null,
  public var goalId: List<KotlinString?>? = null,
  public var _goalId: List<Element?>? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var trigger: List<TriggerDefinition?>? = null,
  public var condition: List<PlanDefinition.Action.Condition>? = null,
  public var input: List<DataRequirement?>? = null,
  public var output: List<DataRequirement?>? = null,
  public var relatedAction: List<PlanDefinition.Action.RelatedAction>? = null,
  public var timingDateTime: KotlinString? = null,
  public var _timingDateTime: Element? = null,
  public var timingAge: Age? = null,
  public var timingPeriod: Period? = null,
  public var timingDuration: Duration? = null,
  public var timingRange: Range? = null,
  public var timingTiming: Timing? = null,
  public var participant: List<PlanDefinition.Action.Participant>? = null,
  public var type: CodeableConcept? = null,
  public var groupingBehavior: KotlinString? = null,
  public var _groupingBehavior: Element? = null,
  public var selectionBehavior: KotlinString? = null,
  public var _selectionBehavior: Element? = null,
  public var requiredBehavior: KotlinString? = null,
  public var _requiredBehavior: Element? = null,
  public var precheckBehavior: KotlinString? = null,
  public var _precheckBehavior: Element? = null,
  public var cardinalityBehavior: KotlinString? = null,
  public var _cardinalityBehavior: Element? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionUri: KotlinString? = null,
  public var _definitionUri: Element? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var dynamicValue: List<PlanDefinition.Action.DynamicValue>? = null,
  public var action: List<PlanDefinition.Action?>? = null,
) {
  public fun toModel(): PlanDefinition.Action =
    PlanDefinition.Action().apply {
      id = this@PlanDefinitionActionSurrogate.id
      extension = this@PlanDefinitionActionSurrogate.extension
      modifierExtension = this@PlanDefinitionActionSurrogate.modifierExtension
      prefix =
        R4String.of(
          this@PlanDefinitionActionSurrogate.prefix,
          this@PlanDefinitionActionSurrogate._prefix,
        )
      title =
        R4String.of(
          this@PlanDefinitionActionSurrogate.title,
          this@PlanDefinitionActionSurrogate._title,
        )
      description =
        R4String.of(
          this@PlanDefinitionActionSurrogate.description,
          this@PlanDefinitionActionSurrogate._description,
        )
      textEquivalent =
        R4String.of(
          this@PlanDefinitionActionSurrogate.textEquivalent,
          this@PlanDefinitionActionSurrogate._textEquivalent,
        )
      priority =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.priority?.let {
            com.google.fhir.model.r4.PlanDefinition.RequestPriority.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._priority,
        )
      code = this@PlanDefinitionActionSurrogate.code
      reason = this@PlanDefinitionActionSurrogate.reason
      documentation = this@PlanDefinitionActionSurrogate.documentation
      goalId =
        if (
          this@PlanDefinitionActionSurrogate.goalId == null &&
            this@PlanDefinitionActionSurrogate._goalId == null
        ) {
          null
        } else {
          (this@PlanDefinitionActionSurrogate.goalId
              ?: List(this@PlanDefinitionActionSurrogate._goalId!!.size) { null })
            .zip(
              this@PlanDefinitionActionSurrogate._goalId
                ?: List(this@PlanDefinitionActionSurrogate.goalId!!.size) { null }
            )
            .mapNotNull { (value, element) -> Id.of(value, element) }
        }
      subject =
        PlanDefinition.Action.Subject?.from(
          this@PlanDefinitionActionSurrogate.subjectCodeableConcept,
          this@PlanDefinitionActionSurrogate.subjectReference,
        )
      trigger = this@PlanDefinitionActionSurrogate.trigger
      condition = this@PlanDefinitionActionSurrogate.condition
      input = this@PlanDefinitionActionSurrogate.input
      output = this@PlanDefinitionActionSurrogate.output
      relatedAction = this@PlanDefinitionActionSurrogate.relatedAction
      timing =
        PlanDefinition.Action.Timing?.from(
          DateTime.of(
            FhirDateTime.fromString(this@PlanDefinitionActionSurrogate.timingDateTime),
            this@PlanDefinitionActionSurrogate._timingDateTime,
          ),
          this@PlanDefinitionActionSurrogate.timingAge,
          this@PlanDefinitionActionSurrogate.timingPeriod,
          this@PlanDefinitionActionSurrogate.timingDuration,
          this@PlanDefinitionActionSurrogate.timingRange,
          this@PlanDefinitionActionSurrogate.timingTiming,
        )
      participant = this@PlanDefinitionActionSurrogate.participant
      type = this@PlanDefinitionActionSurrogate.type
      groupingBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.groupingBehavior?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionGroupingBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._groupingBehavior,
        )
      selectionBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.selectionBehavior?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionSelectionBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._selectionBehavior,
        )
      requiredBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.requiredBehavior?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionRequiredBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._requiredBehavior,
        )
      precheckBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.precheckBehavior?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionPrecheckBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._precheckBehavior,
        )
      cardinalityBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.cardinalityBehavior?.let {
            com.google.fhir.model.r4.PlanDefinition.ActionCardinalityBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._cardinalityBehavior,
        )
      definition =
        PlanDefinition.Action.Definition?.from(
          Canonical.of(
            this@PlanDefinitionActionSurrogate.definitionCanonical,
            this@PlanDefinitionActionSurrogate._definitionCanonical,
          ),
          Uri.of(
            this@PlanDefinitionActionSurrogate.definitionUri,
            this@PlanDefinitionActionSurrogate._definitionUri,
          ),
        )
      transform =
        Canonical.of(
          this@PlanDefinitionActionSurrogate.transform,
          this@PlanDefinitionActionSurrogate._transform,
        )
      dynamicValue = this@PlanDefinitionActionSurrogate.dynamicValue
      action = this@PlanDefinitionActionSurrogate.action
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Action): PlanDefinitionActionSurrogate =
      with(model) {
        PlanDefinitionActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          prefix = this@with.prefix?.value
          _prefix = this@with.prefix?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          textEquivalent = this@with.textEquivalent?.value
          _textEquivalent = this@with.textEquivalent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          code = this@with.code
          reason = this@with.reason
          documentation = this@with.documentation
          goalId = this@with.goalId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _goalId = this@with.goalId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          trigger = this@with.trigger
          condition = this@with.condition
          input = this@with.input
          output = this@with.output
          relatedAction = this@with.relatedAction
          timingDateTime = this@with.timing?.asDateTime()?.value?.value?.toString()
          _timingDateTime = this@with.timing?.asDateTime()?.value?.toElement()
          timingAge = this@with.timing?.asAge()?.value
          timingPeriod = this@with.timing?.asPeriod()?.value
          timingDuration = this@with.timing?.asDuration()?.value
          timingRange = this@with.timing?.asRange()?.value
          timingTiming = this@with.timing?.asTiming()?.value
          participant = this@with.participant
          type = this@with.type
          groupingBehavior = this@with.groupingBehavior?.value?.getCode()
          _groupingBehavior = this@with.groupingBehavior?.toElement()
          selectionBehavior = this@with.selectionBehavior?.value?.getCode()
          _selectionBehavior = this@with.selectionBehavior?.toElement()
          requiredBehavior = this@with.requiredBehavior?.value?.getCode()
          _requiredBehavior = this@with.requiredBehavior?.toElement()
          precheckBehavior = this@with.precheckBehavior?.value?.getCode()
          _precheckBehavior = this@with.precheckBehavior?.toElement()
          cardinalityBehavior = this@with.cardinalityBehavior?.value?.getCode()
          _cardinalityBehavior = this@with.cardinalityBehavior?.toElement()
          definitionCanonical = this@with.definition?.asCanonical()?.value?.value
          _definitionCanonical = this@with.definition?.asCanonical()?.value?.toElement()
          definitionUri = this@with.definition?.asUri()?.value?.value
          _definitionUri = this@with.definition?.asUri()?.value?.toElement()
          transform = this@with.transform?.value
          _transform = this@with.transform?.toElement()
          dynamicValue = this@with.dynamicValue
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var type: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: List<CodeableConcept?>? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var library: List<KotlinString?>? = null,
  public var _library: List<Element?>? = null,
  public var goal: List<PlanDefinition.Goal>? = null,
  public var action: List<PlanDefinition.Action>? = null,
) {
  public fun toModel(): PlanDefinition =
    PlanDefinition().apply {
      id = this@PlanDefinitionSurrogate.id
      meta = this@PlanDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@PlanDefinitionSurrogate.implicitRules,
          this@PlanDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(this@PlanDefinitionSurrogate.language, this@PlanDefinitionSurrogate._language)
      text = this@PlanDefinitionSurrogate.text
      contained = this@PlanDefinitionSurrogate.contained
      extension = this@PlanDefinitionSurrogate.extension
      modifierExtension = this@PlanDefinitionSurrogate.modifierExtension
      url = Uri.of(this@PlanDefinitionSurrogate.url, this@PlanDefinitionSurrogate._url)
      identifier = this@PlanDefinitionSurrogate.identifier
      version =
        R4String.of(this@PlanDefinitionSurrogate.version, this@PlanDefinitionSurrogate._version)
      name = R4String.of(this@PlanDefinitionSurrogate.name, this@PlanDefinitionSurrogate._name)
      title = R4String.of(this@PlanDefinitionSurrogate.title, this@PlanDefinitionSurrogate._title)
      subtitle =
        R4String.of(this@PlanDefinitionSurrogate.subtitle, this@PlanDefinitionSurrogate._subtitle)
      type = this@PlanDefinitionSurrogate.type
      status =
        Enumeration.of(
          this@PlanDefinitionSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@PlanDefinitionSurrogate._status,
        )
      experimental =
        R4Boolean.of(
          this@PlanDefinitionSurrogate.experimental,
          this@PlanDefinitionSurrogate._experimental,
        )
      subject =
        PlanDefinition.Subject?.from(
          this@PlanDefinitionSurrogate.subjectCodeableConcept,
          this@PlanDefinitionSurrogate.subjectReference,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@PlanDefinitionSurrogate.date),
          this@PlanDefinitionSurrogate._date,
        )
      publisher =
        R4String.of(this@PlanDefinitionSurrogate.publisher, this@PlanDefinitionSurrogate._publisher)
      contact = this@PlanDefinitionSurrogate.contact
      description =
        Markdown.of(
          this@PlanDefinitionSurrogate.description,
          this@PlanDefinitionSurrogate._description,
        )
      useContext = this@PlanDefinitionSurrogate.useContext
      jurisdiction = this@PlanDefinitionSurrogate.jurisdiction
      purpose =
        Markdown.of(this@PlanDefinitionSurrogate.purpose, this@PlanDefinitionSurrogate._purpose)
      usage = R4String.of(this@PlanDefinitionSurrogate.usage, this@PlanDefinitionSurrogate._usage)
      copyright =
        Markdown.of(this@PlanDefinitionSurrogate.copyright, this@PlanDefinitionSurrogate._copyright)
      approvalDate =
        Date.of(
          FhirDate.fromString(this@PlanDefinitionSurrogate.approvalDate),
          this@PlanDefinitionSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@PlanDefinitionSurrogate.lastReviewDate),
          this@PlanDefinitionSurrogate._lastReviewDate,
        )
      effectivePeriod = this@PlanDefinitionSurrogate.effectivePeriod
      topic = this@PlanDefinitionSurrogate.topic
      author = this@PlanDefinitionSurrogate.author
      editor = this@PlanDefinitionSurrogate.editor
      reviewer = this@PlanDefinitionSurrogate.reviewer
      endorser = this@PlanDefinitionSurrogate.endorser
      relatedArtifact = this@PlanDefinitionSurrogate.relatedArtifact
      library =
        if (
          this@PlanDefinitionSurrogate.library == null &&
            this@PlanDefinitionSurrogate._library == null
        ) {
          null
        } else {
          (this@PlanDefinitionSurrogate.library
              ?: List(this@PlanDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@PlanDefinitionSurrogate._library
                ?: List(this@PlanDefinitionSurrogate.library!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      goal = this@PlanDefinitionSurrogate.goal
      action = this@PlanDefinitionSurrogate.action
    }

  public companion object {
    public fun fromModel(model: PlanDefinition): PlanDefinitionSurrogate =
      with(model) {
        PlanDefinitionSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          subtitle = this@with.subtitle?.value
          _subtitle = this@with.subtitle?.toElement()
          type = this@with.type
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          usage = this@with.usage?.value
          _usage = this@with.usage?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          effectivePeriod = this@with.effectivePeriod
          topic = this@with.topic
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          relatedArtifact = this@with.relatedArtifact
          library = this@with.library?.map { it?.value }?.takeUnless { it.all { it == null } }
          _library =
            this@with.library?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          goal = this@with.goal
          action = this@with.action
        }
      }
  }
}
