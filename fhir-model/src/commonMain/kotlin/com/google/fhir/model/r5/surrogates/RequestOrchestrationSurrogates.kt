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

import com.google.fhir.model.r5.Age
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DataRequirement
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.RequestOrchestration
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class RequestOrchestrationActionConditionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): RequestOrchestration.Action.Condition =
    RequestOrchestration.Action.Condition(
      id = this@RequestOrchestrationActionConditionSurrogate.id,
      extension = this@RequestOrchestrationActionConditionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionConditionSurrogate.modifierExtension ?: mutableListOf(),
      kind =
        Enumeration.of(
          com.google.fhir.model.r5.RequestOrchestration.ActionConditionKind.fromCode(
            this@RequestOrchestrationActionConditionSurrogate.kind!!
          ),
          this@RequestOrchestrationActionConditionSurrogate._kind,
        ),
      expression = this@RequestOrchestrationActionConditionSurrogate.expression,
    )

  public companion object {
    public fun fromModel(
      model: RequestOrchestration.Action.Condition
    ): RequestOrchestrationActionConditionSurrogate =
      with(model) {
        RequestOrchestrationActionConditionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          kind = this@with.kind.value?.getCode(),
          _kind = this@with.kind.toElement(),
          expression = this@with.expression,
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationActionInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var requirement: DataRequirement? = null,
  public var relatedData: KotlinString? = null,
  public var _relatedData: Element? = null,
) {
  public fun toModel(): RequestOrchestration.Action.Input =
    RequestOrchestration.Action.Input(
      id = this@RequestOrchestrationActionInputSurrogate.id,
      extension = this@RequestOrchestrationActionInputSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionInputSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@RequestOrchestrationActionInputSurrogate.title,
          this@RequestOrchestrationActionInputSurrogate._title,
        ),
      requirement = this@RequestOrchestrationActionInputSurrogate.requirement,
      relatedData =
        Id.of(
          this@RequestOrchestrationActionInputSurrogate.relatedData,
          this@RequestOrchestrationActionInputSurrogate._relatedData,
        ),
    )

  public companion object {
    public fun fromModel(
      model: RequestOrchestration.Action.Input
    ): RequestOrchestrationActionInputSurrogate =
      with(model) {
        RequestOrchestrationActionInputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          requirement = this@with.requirement,
          relatedData = this@with.relatedData?.value,
          _relatedData = this@with.relatedData?.toElement(),
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationActionOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var requirement: DataRequirement? = null,
  public var relatedData: KotlinString? = null,
  public var _relatedData: Element? = null,
) {
  public fun toModel(): RequestOrchestration.Action.Output =
    RequestOrchestration.Action.Output(
      id = this@RequestOrchestrationActionOutputSurrogate.id,
      extension = this@RequestOrchestrationActionOutputSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionOutputSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@RequestOrchestrationActionOutputSurrogate.title,
          this@RequestOrchestrationActionOutputSurrogate._title,
        ),
      requirement = this@RequestOrchestrationActionOutputSurrogate.requirement,
      relatedData =
        R5String.of(
          this@RequestOrchestrationActionOutputSurrogate.relatedData,
          this@RequestOrchestrationActionOutputSurrogate._relatedData,
        ),
    )

  public companion object {
    public fun fromModel(
      model: RequestOrchestration.Action.Output
    ): RequestOrchestrationActionOutputSurrogate =
      with(model) {
        RequestOrchestrationActionOutputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          requirement = this@with.requirement,
          relatedData = this@with.relatedData?.value,
          _relatedData = this@with.relatedData?.toElement(),
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationActionRelatedActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var targetId: KotlinString? = null,
  public var _targetId: Element? = null,
  public var relationship: KotlinString? = null,
  public var _relationship: Element? = null,
  public var endRelationship: KotlinString? = null,
  public var _endRelationship: Element? = null,
  public var offsetDuration: Duration? = null,
  public var offsetRange: Range? = null,
) {
  public fun toModel(): RequestOrchestration.Action.RelatedAction =
    RequestOrchestration.Action.RelatedAction(
      id = this@RequestOrchestrationActionRelatedActionSurrogate.id,
      extension =
        this@RequestOrchestrationActionRelatedActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionRelatedActionSurrogate.modifierExtension ?: mutableListOf(),
      targetId =
        Id.of(
          this@RequestOrchestrationActionRelatedActionSurrogate.targetId,
          this@RequestOrchestrationActionRelatedActionSurrogate._targetId,
        )!!,
      relationship =
        Enumeration.of(
          com.google.fhir.model.r5.RequestOrchestration.ActionRelationshipType.fromCode(
            this@RequestOrchestrationActionRelatedActionSurrogate.relationship!!
          ),
          this@RequestOrchestrationActionRelatedActionSurrogate._relationship,
        ),
      endRelationship =
        this@RequestOrchestrationActionRelatedActionSurrogate.endRelationship?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActionRelationshipType.fromCode(it!!),
            this@RequestOrchestrationActionRelatedActionSurrogate._endRelationship,
          )
        },
      offset =
        RequestOrchestration.Action.RelatedAction.Offset?.from(
          this@RequestOrchestrationActionRelatedActionSurrogate.offsetDuration,
          this@RequestOrchestrationActionRelatedActionSurrogate.offsetRange,
        ),
    )

  public companion object {
    public fun fromModel(
      model: RequestOrchestration.Action.RelatedAction
    ): RequestOrchestrationActionRelatedActionSurrogate =
      with(model) {
        RequestOrchestrationActionRelatedActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          targetId = this@with.targetId.value,
          _targetId = this@with.targetId.toElement(),
          relationship = this@with.relationship.value?.getCode(),
          _relationship = this@with.relationship.toElement(),
          endRelationship = this@with.endRelationship?.value?.getCode(),
          _endRelationship = this@with.endRelationship?.toElement(),
          offsetDuration = this@with.offset?.asDuration()?.value,
          offsetRange = this@with.offset?.asRange()?.value,
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationActionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var typeCanonical: KotlinString? = null,
  public var _typeCanonical: Element? = null,
  public var typeReference: Reference? = null,
  public var role: CodeableConcept? = null,
  public var function: CodeableConcept? = null,
  public var actorCanonical: KotlinString? = null,
  public var _actorCanonical: Element? = null,
  public var actorReference: Reference? = null,
) {
  public fun toModel(): RequestOrchestration.Action.Participant =
    RequestOrchestration.Action.Participant(
      id = this@RequestOrchestrationActionParticipantSurrogate.id,
      extension = this@RequestOrchestrationActionParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionParticipantSurrogate.modifierExtension ?: mutableListOf(),
      type =
        this@RequestOrchestrationActionParticipantSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActivityParticipantType.fromCode(it!!),
            this@RequestOrchestrationActionParticipantSurrogate._type,
          )
        },
      typeCanonical =
        Canonical.of(
          this@RequestOrchestrationActionParticipantSurrogate.typeCanonical,
          this@RequestOrchestrationActionParticipantSurrogate._typeCanonical,
        ),
      typeReference = this@RequestOrchestrationActionParticipantSurrogate.typeReference,
      role = this@RequestOrchestrationActionParticipantSurrogate.role,
      function = this@RequestOrchestrationActionParticipantSurrogate.function,
      actor =
        RequestOrchestration.Action.Participant.Actor?.from(
          Canonical.of(
            this@RequestOrchestrationActionParticipantSurrogate.actorCanonical,
            this@RequestOrchestrationActionParticipantSurrogate._actorCanonical,
          ),
          this@RequestOrchestrationActionParticipantSurrogate.actorReference,
        ),
    )

  public companion object {
    public fun fromModel(
      model: RequestOrchestration.Action.Participant
    ): RequestOrchestrationActionParticipantSurrogate =
      with(model) {
        RequestOrchestrationActionParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          typeCanonical = this@with.typeCanonical?.value,
          _typeCanonical = this@with.typeCanonical?.toElement(),
          typeReference = this@with.typeReference,
          role = this@with.role,
          function = this@with.function,
          actorCanonical = this@with.actor?.asCanonical()?.value?.value,
          _actorCanonical = this@with.actor?.asCanonical()?.value?.toElement(),
          actorReference = this@with.actor?.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationActionDynamicValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): RequestOrchestration.Action.DynamicValue =
    RequestOrchestration.Action.DynamicValue(
      id = this@RequestOrchestrationActionDynamicValueSurrogate.id,
      extension = this@RequestOrchestrationActionDynamicValueSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionDynamicValueSurrogate.modifierExtension ?: mutableListOf(),
      path =
        R5String.of(
          this@RequestOrchestrationActionDynamicValueSurrogate.path,
          this@RequestOrchestrationActionDynamicValueSurrogate._path,
        ),
      expression = this@RequestOrchestrationActionDynamicValueSurrogate.expression,
    )

  public companion object {
    public fun fromModel(
      model: RequestOrchestration.Action.DynamicValue
    ): RequestOrchestrationActionDynamicValueSurrogate =
      with(model) {
        RequestOrchestrationActionDynamicValueSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          expression = this@with.expression,
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
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
  public var code: MutableList<CodeableConcept>? = null,
  public var documentation: MutableList<RelatedArtifact>? = null,
  public var goal: MutableList<Reference>? = null,
  public var condition: MutableList<RequestOrchestration.Action.Condition>? = null,
  public var input: MutableList<RequestOrchestration.Action.Input>? = null,
  public var output: MutableList<RequestOrchestration.Action.Output>? = null,
  public var relatedAction: MutableList<RequestOrchestration.Action.RelatedAction>? = null,
  public var timingDateTime: KotlinString? = null,
  public var _timingDateTime: Element? = null,
  public var timingAge: Age? = null,
  public var timingPeriod: Period? = null,
  public var timingDuration: Duration? = null,
  public var timingRange: Range? = null,
  public var timingTiming: Timing? = null,
  public var location: CodeableReference? = null,
  public var participant: MutableList<RequestOrchestration.Action.Participant>? = null,
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
  public var resource: Reference? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionUri: KotlinString? = null,
  public var _definitionUri: Element? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var dynamicValue: MutableList<RequestOrchestration.Action.DynamicValue>? = null,
  public var action: MutableList<RequestOrchestration.Action>? = null,
) {
  public fun toModel(): RequestOrchestration.Action =
    RequestOrchestration.Action(
      id = this@RequestOrchestrationActionSurrogate.id,
      extension = this@RequestOrchestrationActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RequestOrchestrationActionSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@RequestOrchestrationActionSurrogate.linkId,
          this@RequestOrchestrationActionSurrogate._linkId,
        ),
      prefix =
        R5String.of(
          this@RequestOrchestrationActionSurrogate.prefix,
          this@RequestOrchestrationActionSurrogate._prefix,
        ),
      title =
        R5String.of(
          this@RequestOrchestrationActionSurrogate.title,
          this@RequestOrchestrationActionSurrogate._title,
        ),
      description =
        Markdown.of(
          this@RequestOrchestrationActionSurrogate.description,
          this@RequestOrchestrationActionSurrogate._description,
        ),
      textEquivalent =
        Markdown.of(
          this@RequestOrchestrationActionSurrogate.textEquivalent,
          this@RequestOrchestrationActionSurrogate._textEquivalent,
        ),
      priority =
        this@RequestOrchestrationActionSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.RequestPriority.fromCode(it!!),
            this@RequestOrchestrationActionSurrogate._priority,
          )
        },
      code = this@RequestOrchestrationActionSurrogate.code ?: mutableListOf(),
      documentation = this@RequestOrchestrationActionSurrogate.documentation ?: mutableListOf(),
      goal = this@RequestOrchestrationActionSurrogate.goal ?: mutableListOf(),
      condition = this@RequestOrchestrationActionSurrogate.condition ?: mutableListOf(),
      input = this@RequestOrchestrationActionSurrogate.input ?: mutableListOf(),
      output = this@RequestOrchestrationActionSurrogate.output ?: mutableListOf(),
      relatedAction = this@RequestOrchestrationActionSurrogate.relatedAction ?: mutableListOf(),
      timing =
        RequestOrchestration.Action.Timing?.from(
          DateTime.of(
            FhirDateTime.fromString(this@RequestOrchestrationActionSurrogate.timingDateTime),
            this@RequestOrchestrationActionSurrogate._timingDateTime,
          ),
          this@RequestOrchestrationActionSurrogate.timingAge,
          this@RequestOrchestrationActionSurrogate.timingPeriod,
          this@RequestOrchestrationActionSurrogate.timingDuration,
          this@RequestOrchestrationActionSurrogate.timingRange,
          this@RequestOrchestrationActionSurrogate.timingTiming,
        ),
      location = this@RequestOrchestrationActionSurrogate.location,
      participant = this@RequestOrchestrationActionSurrogate.participant ?: mutableListOf(),
      type = this@RequestOrchestrationActionSurrogate.type,
      groupingBehavior =
        this@RequestOrchestrationActionSurrogate.groupingBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActionGroupingBehavior.fromCode(it!!),
            this@RequestOrchestrationActionSurrogate._groupingBehavior,
          )
        },
      selectionBehavior =
        this@RequestOrchestrationActionSurrogate.selectionBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActionSelectionBehavior.fromCode(it!!),
            this@RequestOrchestrationActionSurrogate._selectionBehavior,
          )
        },
      requiredBehavior =
        this@RequestOrchestrationActionSurrogate.requiredBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActionRequiredBehavior.fromCode(it!!),
            this@RequestOrchestrationActionSurrogate._requiredBehavior,
          )
        },
      precheckBehavior =
        this@RequestOrchestrationActionSurrogate.precheckBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActionPrecheckBehavior.fromCode(it!!),
            this@RequestOrchestrationActionSurrogate._precheckBehavior,
          )
        },
      cardinalityBehavior =
        this@RequestOrchestrationActionSurrogate.cardinalityBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.ActionCardinalityBehavior.fromCode(it!!),
            this@RequestOrchestrationActionSurrogate._cardinalityBehavior,
          )
        },
      resource = this@RequestOrchestrationActionSurrogate.resource,
      definition =
        RequestOrchestration.Action.Definition?.from(
          Canonical.of(
            this@RequestOrchestrationActionSurrogate.definitionCanonical,
            this@RequestOrchestrationActionSurrogate._definitionCanonical,
          ),
          Uri.of(
            this@RequestOrchestrationActionSurrogate.definitionUri,
            this@RequestOrchestrationActionSurrogate._definitionUri,
          ),
        ),
      transform =
        Canonical.of(
          this@RequestOrchestrationActionSurrogate.transform,
          this@RequestOrchestrationActionSurrogate._transform,
        ),
      dynamicValue = this@RequestOrchestrationActionSurrogate.dynamicValue ?: mutableListOf(),
      action = this@RequestOrchestrationActionSurrogate.action ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: RequestOrchestration.Action): RequestOrchestrationActionSurrogate =
      with(model) {
        RequestOrchestrationActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          prefix = this@with.prefix?.value,
          _prefix = this@with.prefix?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          textEquivalent = this@with.textEquivalent?.value,
          _textEquivalent = this@with.textEquivalent?.toElement(),
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          code = this@with.code.takeUnless { it.all { it == null } },
          documentation = this@with.documentation.takeUnless { it.all { it == null } },
          goal = this@with.goal.takeUnless { it.all { it == null } },
          condition = this@with.condition.takeUnless { it.all { it == null } },
          input = this@with.input.takeUnless { it.all { it == null } },
          output = this@with.output.takeUnless { it.all { it == null } },
          relatedAction = this@with.relatedAction.takeUnless { it.all { it == null } },
          timingDateTime = this@with.timing?.asDateTime()?.value?.value?.toString(),
          _timingDateTime = this@with.timing?.asDateTime()?.value?.toElement(),
          timingAge = this@with.timing?.asAge()?.value,
          timingPeriod = this@with.timing?.asPeriod()?.value,
          timingDuration = this@with.timing?.asDuration()?.value,
          timingRange = this@with.timing?.asRange()?.value,
          timingTiming = this@with.timing?.asTiming()?.value,
          location = this@with.location,
          participant = this@with.participant.takeUnless { it.all { it == null } },
          type = this@with.type,
          groupingBehavior = this@with.groupingBehavior?.value?.getCode(),
          _groupingBehavior = this@with.groupingBehavior?.toElement(),
          selectionBehavior = this@with.selectionBehavior?.value?.getCode(),
          _selectionBehavior = this@with.selectionBehavior?.toElement(),
          requiredBehavior = this@with.requiredBehavior?.value?.getCode(),
          _requiredBehavior = this@with.requiredBehavior?.toElement(),
          precheckBehavior = this@with.precheckBehavior?.value?.getCode(),
          _precheckBehavior = this@with.precheckBehavior?.toElement(),
          cardinalityBehavior = this@with.cardinalityBehavior?.value?.getCode(),
          _cardinalityBehavior = this@with.cardinalityBehavior?.toElement(),
          resource = this@with.resource,
          definitionCanonical = this@with.definition?.asCanonical()?.value?.value,
          _definitionCanonical = this@with.definition?.asCanonical()?.value?.toElement(),
          definitionUri = this@with.definition?.asUri()?.value?.value,
          _definitionUri = this@with.definition?.asUri()?.value?.toElement(),
          transform = this@with.transform?.value,
          _transform = this@with.transform?.toElement(),
          dynamicValue = this@with.dynamicValue.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class RequestOrchestrationSurrogate(
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
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var replaces: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var author: Reference? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var goal: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var action: MutableList<RequestOrchestration.Action>? = null,
) {
  public fun toModel(): RequestOrchestration =
    RequestOrchestration(
      id = this@RequestOrchestrationSurrogate.id,
      meta = this@RequestOrchestrationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@RequestOrchestrationSurrogate.implicitRules,
          this@RequestOrchestrationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@RequestOrchestrationSurrogate.language,
          this@RequestOrchestrationSurrogate._language,
        ),
      text = this@RequestOrchestrationSurrogate.text,
      contained = this@RequestOrchestrationSurrogate.contained ?: mutableListOf(),
      extension = this@RequestOrchestrationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@RequestOrchestrationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@RequestOrchestrationSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@RequestOrchestrationSurrogate.instantiatesCanonical == null &&
            this@RequestOrchestrationSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@RequestOrchestrationSurrogate.instantiatesCanonical
              ?: List(this@RequestOrchestrationSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@RequestOrchestrationSurrogate._instantiatesCanonical
                ?: List(this@RequestOrchestrationSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@RequestOrchestrationSurrogate.instantiatesUri == null &&
            this@RequestOrchestrationSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@RequestOrchestrationSurrogate.instantiatesUri
              ?: List(this@RequestOrchestrationSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@RequestOrchestrationSurrogate._instantiatesUri
                ?: List(this@RequestOrchestrationSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@RequestOrchestrationSurrogate.basedOn ?: mutableListOf(),
      replaces = this@RequestOrchestrationSurrogate.replaces ?: mutableListOf(),
      groupIdentifier = this@RequestOrchestrationSurrogate.groupIdentifier,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.RequestOrchestration.RequestStatus.fromCode(
            this@RequestOrchestrationSurrogate.status!!
          ),
          this@RequestOrchestrationSurrogate._status,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.RequestOrchestration.RequestIntent.fromCode(
            this@RequestOrchestrationSurrogate.intent!!
          ),
          this@RequestOrchestrationSurrogate._intent,
        ),
      priority =
        this@RequestOrchestrationSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.RequestOrchestration.RequestPriority.fromCode(it!!),
            this@RequestOrchestrationSurrogate._priority,
          )
        },
      code = this@RequestOrchestrationSurrogate.code,
      subject = this@RequestOrchestrationSurrogate.subject,
      encounter = this@RequestOrchestrationSurrogate.encounter,
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@RequestOrchestrationSurrogate.authoredOn),
          this@RequestOrchestrationSurrogate._authoredOn,
        ),
      author = this@RequestOrchestrationSurrogate.author,
      reason = this@RequestOrchestrationSurrogate.reason ?: mutableListOf(),
      goal = this@RequestOrchestrationSurrogate.goal ?: mutableListOf(),
      note = this@RequestOrchestrationSurrogate.note ?: mutableListOf(),
      action = this@RequestOrchestrationSurrogate.action ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: RequestOrchestration): RequestOrchestrationSurrogate =
      with(model) {
        RequestOrchestrationSurrogate(
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
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          replaces = this@with.replaces.takeUnless { it.all { it == null } },
          groupIdentifier = this@with.groupIdentifier,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          code = this@with.code,
          subject = this@with.subject,
          encounter = this@with.encounter,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          author = this@with.author,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          goal = this@with.goal.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
        )
      }
  }
}
