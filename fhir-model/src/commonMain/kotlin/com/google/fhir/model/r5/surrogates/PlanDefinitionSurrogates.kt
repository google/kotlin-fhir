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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.DataRequirement
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PlanDefinition
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.TriggerDefinition
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PlanDefinitionGoalTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var measure: CodeableConcept? = null,
  public var detailQuantity: Quantity? = null,
  public var detailRange: Range? = null,
  public var detailCodeableConcept: CodeableConcept? = null,
  public var detailString: KotlinString? = null,
  public var _detailString: Element? = null,
  public var detailBoolean: KotlinBoolean? = null,
  public var _detailBoolean: Element? = null,
  public var detailInteger: Int? = null,
  public var _detailInteger: Element? = null,
  public var detailRatio: Ratio? = null,
  public var due: Duration? = null,
) {
  public fun toModel(): PlanDefinition.Goal.Target =
    PlanDefinition.Goal.Target(
      id = this@PlanDefinitionGoalTargetSurrogate.id,
      extension = this@PlanDefinitionGoalTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionGoalTargetSurrogate.modifierExtension ?: mutableListOf(),
      measure = this@PlanDefinitionGoalTargetSurrogate.measure,
      detail =
        PlanDefinition.Goal.Target.Detail?.from(
          this@PlanDefinitionGoalTargetSurrogate.detailQuantity,
          this@PlanDefinitionGoalTargetSurrogate.detailRange,
          this@PlanDefinitionGoalTargetSurrogate.detailCodeableConcept,
          R5String.of(
            this@PlanDefinitionGoalTargetSurrogate.detailString,
            this@PlanDefinitionGoalTargetSurrogate._detailString,
          ),
          R5Boolean.of(
            this@PlanDefinitionGoalTargetSurrogate.detailBoolean,
            this@PlanDefinitionGoalTargetSurrogate._detailBoolean,
          ),
          Integer.of(
            this@PlanDefinitionGoalTargetSurrogate.detailInteger,
            this@PlanDefinitionGoalTargetSurrogate._detailInteger,
          ),
          this@PlanDefinitionGoalTargetSurrogate.detailRatio,
        ),
      due = this@PlanDefinitionGoalTargetSurrogate.due,
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Goal.Target): PlanDefinitionGoalTargetSurrogate =
      with(model) {
        PlanDefinitionGoalTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          measure = this@with.measure,
          detailQuantity = this@with.detail?.asQuantity()?.value,
          detailRange = this@with.detail?.asRange()?.value,
          detailCodeableConcept = this@with.detail?.asCodeableConcept()?.value,
          detailString = this@with.detail?.asString()?.value?.value,
          _detailString = this@with.detail?.asString()?.value?.toElement(),
          detailBoolean = this@with.detail?.asBoolean()?.value?.value,
          _detailBoolean = this@with.detail?.asBoolean()?.value?.toElement(),
          detailInteger = this@with.detail?.asInteger()?.value?.value,
          _detailInteger = this@with.detail?.asInteger()?.value?.toElement(),
          detailRatio = this@with.detail?.asRatio()?.value,
          due = this@with.due,
        )
      }
  }
}

@Serializable
internal data class PlanDefinitionGoalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept? = null,
  public var description: CodeableConcept,
  public var priority: CodeableConcept? = null,
  public var start: CodeableConcept? = null,
  public var addresses: MutableList<CodeableConcept>? = null,
  public var documentation: MutableList<RelatedArtifact>? = null,
  public var target: MutableList<PlanDefinition.Goal.Target>? = null,
) {
  public fun toModel(): PlanDefinition.Goal =
    PlanDefinition.Goal(
      id = this@PlanDefinitionGoalSurrogate.id,
      extension = this@PlanDefinitionGoalSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PlanDefinitionGoalSurrogate.modifierExtension ?: mutableListOf(),
      category = this@PlanDefinitionGoalSurrogate.category,
      description = this@PlanDefinitionGoalSurrogate.description,
      priority = this@PlanDefinitionGoalSurrogate.priority,
      start = this@PlanDefinitionGoalSurrogate.start,
      addresses = this@PlanDefinitionGoalSurrogate.addresses ?: mutableListOf(),
      documentation = this@PlanDefinitionGoalSurrogate.documentation ?: mutableListOf(),
      target = this@PlanDefinitionGoalSurrogate.target ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Goal): PlanDefinitionGoalSurrogate =
      with(model) {
        PlanDefinitionGoalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          description = this@with.description,
          priority = this@with.priority,
          start = this@with.start,
          addresses = this@with.addresses.takeUnless { it.all { it == null } },
          documentation = this@with.documentation.takeUnless { it.all { it == null } },
          target = this@with.target.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class PlanDefinitionActorOptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var typeCanonical: KotlinString? = null,
  public var _typeCanonical: Element? = null,
  public var typeReference: Reference? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): PlanDefinition.Actor.Option =
    PlanDefinition.Actor.Option(
      id = this@PlanDefinitionActorOptionSurrogate.id,
      extension = this@PlanDefinitionActorOptionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActorOptionSurrogate.modifierExtension ?: mutableListOf(),
      type =
        this@PlanDefinitionActorOptionSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActivityParticipantType.fromCode(it!!),
            this@PlanDefinitionActorOptionSurrogate._type,
          )
        },
      typeCanonical =
        Canonical.of(
          this@PlanDefinitionActorOptionSurrogate.typeCanonical,
          this@PlanDefinitionActorOptionSurrogate._typeCanonical,
        ),
      typeReference = this@PlanDefinitionActorOptionSurrogate.typeReference,
      role = this@PlanDefinitionActorOptionSurrogate.role,
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Actor.Option): PlanDefinitionActorOptionSurrogate =
      with(model) {
        PlanDefinitionActorOptionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          typeCanonical = this@with.typeCanonical?.value,
          _typeCanonical = this@with.typeCanonical?.toElement(),
          typeReference = this@with.typeReference,
          role = this@with.role,
        )
      }
  }
}

@Serializable
internal data class PlanDefinitionActorSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var option: MutableList<PlanDefinition.Actor.Option>? = null,
) {
  public fun toModel(): PlanDefinition.Actor =
    PlanDefinition.Actor(
      id = this@PlanDefinitionActorSurrogate.id,
      extension = this@PlanDefinitionActorSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PlanDefinitionActorSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@PlanDefinitionActorSurrogate.title,
          this@PlanDefinitionActorSurrogate._title,
        ),
      description =
        Markdown.of(
          this@PlanDefinitionActorSurrogate.description,
          this@PlanDefinitionActorSurrogate._description,
        ),
      option = this@PlanDefinitionActorSurrogate.option ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Actor): PlanDefinitionActorSurrogate =
      with(model) {
        PlanDefinitionActorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          option = this@with.option.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class PlanDefinitionActionConditionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): PlanDefinition.Action.Condition =
    PlanDefinition.Action.Condition(
      id = this@PlanDefinitionActionConditionSurrogate.id,
      extension = this@PlanDefinitionActionConditionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActionConditionSurrogate.modifierExtension ?: mutableListOf(),
      kind =
        Enumeration.of(
          com.google.fhir.model.r5.PlanDefinition.ActionConditionKind.fromCode(
            this@PlanDefinitionActionConditionSurrogate.kind!!
          ),
          this@PlanDefinitionActionConditionSurrogate._kind,
        ),
      expression = this@PlanDefinitionActionConditionSurrogate.expression,
    )

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.Condition
    ): PlanDefinitionActionConditionSurrogate =
      with(model) {
        PlanDefinitionActionConditionSurrogate(
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
internal data class PlanDefinitionActionInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var requirement: DataRequirement? = null,
  public var relatedData: KotlinString? = null,
  public var _relatedData: Element? = null,
) {
  public fun toModel(): PlanDefinition.Action.Input =
    PlanDefinition.Action.Input(
      id = this@PlanDefinitionActionInputSurrogate.id,
      extension = this@PlanDefinitionActionInputSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActionInputSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@PlanDefinitionActionInputSurrogate.title,
          this@PlanDefinitionActionInputSurrogate._title,
        ),
      requirement = this@PlanDefinitionActionInputSurrogate.requirement,
      relatedData =
        Id.of(
          this@PlanDefinitionActionInputSurrogate.relatedData,
          this@PlanDefinitionActionInputSurrogate._relatedData,
        ),
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Action.Input): PlanDefinitionActionInputSurrogate =
      with(model) {
        PlanDefinitionActionInputSurrogate(
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
internal data class PlanDefinitionActionOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var requirement: DataRequirement? = null,
  public var relatedData: KotlinString? = null,
  public var _relatedData: Element? = null,
) {
  public fun toModel(): PlanDefinition.Action.Output =
    PlanDefinition.Action.Output(
      id = this@PlanDefinitionActionOutputSurrogate.id,
      extension = this@PlanDefinitionActionOutputSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActionOutputSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@PlanDefinitionActionOutputSurrogate.title,
          this@PlanDefinitionActionOutputSurrogate._title,
        ),
      requirement = this@PlanDefinitionActionOutputSurrogate.requirement,
      relatedData =
        R5String.of(
          this@PlanDefinitionActionOutputSurrogate.relatedData,
          this@PlanDefinitionActionOutputSurrogate._relatedData,
        ),
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Action.Output): PlanDefinitionActionOutputSurrogate =
      with(model) {
        PlanDefinitionActionOutputSurrogate(
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
internal data class PlanDefinitionActionRelatedActionSurrogate(
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
  public fun toModel(): PlanDefinition.Action.RelatedAction =
    PlanDefinition.Action.RelatedAction(
      id = this@PlanDefinitionActionRelatedActionSurrogate.id,
      extension = this@PlanDefinitionActionRelatedActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActionRelatedActionSurrogate.modifierExtension ?: mutableListOf(),
      targetId =
        Id.of(
          this@PlanDefinitionActionRelatedActionSurrogate.targetId,
          this@PlanDefinitionActionRelatedActionSurrogate._targetId,
        )!!,
      relationship =
        Enumeration.of(
          com.google.fhir.model.r5.PlanDefinition.ActionRelationshipType.fromCode(
            this@PlanDefinitionActionRelatedActionSurrogate.relationship!!
          ),
          this@PlanDefinitionActionRelatedActionSurrogate._relationship,
        ),
      endRelationship =
        this@PlanDefinitionActionRelatedActionSurrogate.endRelationship?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActionRelationshipType.fromCode(it!!),
            this@PlanDefinitionActionRelatedActionSurrogate._endRelationship,
          )
        },
      offset =
        PlanDefinition.Action.RelatedAction.Offset?.from(
          this@PlanDefinitionActionRelatedActionSurrogate.offsetDuration,
          this@PlanDefinitionActionRelatedActionSurrogate.offsetRange,
        ),
    )

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.RelatedAction
    ): PlanDefinitionActionRelatedActionSurrogate =
      with(model) {
        PlanDefinitionActionRelatedActionSurrogate(
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
internal data class PlanDefinitionActionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var actorId: KotlinString? = null,
  public var _actorId: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var typeCanonical: KotlinString? = null,
  public var _typeCanonical: Element? = null,
  public var typeReference: Reference? = null,
  public var role: CodeableConcept? = null,
  public var function: CodeableConcept? = null,
) {
  public fun toModel(): PlanDefinition.Action.Participant =
    PlanDefinition.Action.Participant(
      id = this@PlanDefinitionActionParticipantSurrogate.id,
      extension = this@PlanDefinitionActionParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActionParticipantSurrogate.modifierExtension ?: mutableListOf(),
      actorId =
        R5String.of(
          this@PlanDefinitionActionParticipantSurrogate.actorId,
          this@PlanDefinitionActionParticipantSurrogate._actorId,
        ),
      type =
        this@PlanDefinitionActionParticipantSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActivityParticipantType.fromCode(it!!),
            this@PlanDefinitionActionParticipantSurrogate._type,
          )
        },
      typeCanonical =
        Canonical.of(
          this@PlanDefinitionActionParticipantSurrogate.typeCanonical,
          this@PlanDefinitionActionParticipantSurrogate._typeCanonical,
        ),
      typeReference = this@PlanDefinitionActionParticipantSurrogate.typeReference,
      role = this@PlanDefinitionActionParticipantSurrogate.role,
      function = this@PlanDefinitionActionParticipantSurrogate.function,
    )

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.Participant
    ): PlanDefinitionActionParticipantSurrogate =
      with(model) {
        PlanDefinitionActionParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          actorId = this@with.actorId?.value,
          _actorId = this@with.actorId?.toElement(),
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          typeCanonical = this@with.typeCanonical?.value,
          _typeCanonical = this@with.typeCanonical?.toElement(),
          typeReference = this@with.typeReference,
          role = this@with.role,
          function = this@with.function,
        )
      }
  }
}

@Serializable
internal data class PlanDefinitionActionDynamicValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): PlanDefinition.Action.DynamicValue =
    PlanDefinition.Action.DynamicValue(
      id = this@PlanDefinitionActionDynamicValueSurrogate.id,
      extension = this@PlanDefinitionActionDynamicValueSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PlanDefinitionActionDynamicValueSurrogate.modifierExtension ?: mutableListOf(),
      path =
        R5String.of(
          this@PlanDefinitionActionDynamicValueSurrogate.path,
          this@PlanDefinitionActionDynamicValueSurrogate._path,
        ),
      expression = this@PlanDefinitionActionDynamicValueSurrogate.expression,
    )

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.DynamicValue
    ): PlanDefinitionActionDynamicValueSurrogate =
      with(model) {
        PlanDefinitionActionDynamicValueSurrogate(
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
internal data class PlanDefinitionActionSurrogate(
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
  public var code: CodeableConcept? = null,
  public var reason: MutableList<CodeableConcept>? = null,
  public var documentation: MutableList<RelatedArtifact>? = null,
  public var goalId: MutableList<KotlinString?>? = null,
  public var _goalId: MutableList<Element?>? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var subjectCanonical: KotlinString? = null,
  public var _subjectCanonical: Element? = null,
  public var trigger: MutableList<TriggerDefinition>? = null,
  public var condition: MutableList<PlanDefinition.Action.Condition>? = null,
  public var input: MutableList<PlanDefinition.Action.Input>? = null,
  public var output: MutableList<PlanDefinition.Action.Output>? = null,
  public var relatedAction: MutableList<PlanDefinition.Action.RelatedAction>? = null,
  public var timingAge: Age? = null,
  public var timingDuration: Duration? = null,
  public var timingRange: Range? = null,
  public var timingTiming: Timing? = null,
  public var location: CodeableReference? = null,
  public var participant: MutableList<PlanDefinition.Action.Participant>? = null,
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
  public var dynamicValue: MutableList<PlanDefinition.Action.DynamicValue>? = null,
  public var action: MutableList<PlanDefinition.Action>? = null,
) {
  public fun toModel(): PlanDefinition.Action =
    PlanDefinition.Action(
      id = this@PlanDefinitionActionSurrogate.id,
      extension = this@PlanDefinitionActionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PlanDefinitionActionSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@PlanDefinitionActionSurrogate.linkId,
          this@PlanDefinitionActionSurrogate._linkId,
        ),
      prefix =
        R5String.of(
          this@PlanDefinitionActionSurrogate.prefix,
          this@PlanDefinitionActionSurrogate._prefix,
        ),
      title =
        R5String.of(
          this@PlanDefinitionActionSurrogate.title,
          this@PlanDefinitionActionSurrogate._title,
        ),
      description =
        Markdown.of(
          this@PlanDefinitionActionSurrogate.description,
          this@PlanDefinitionActionSurrogate._description,
        ),
      textEquivalent =
        Markdown.of(
          this@PlanDefinitionActionSurrogate.textEquivalent,
          this@PlanDefinitionActionSurrogate._textEquivalent,
        ),
      priority =
        this@PlanDefinitionActionSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.RequestPriority.fromCode(it!!),
            this@PlanDefinitionActionSurrogate._priority,
          )
        },
      code = this@PlanDefinitionActionSurrogate.code,
      reason = this@PlanDefinitionActionSurrogate.reason ?: mutableListOf(),
      documentation = this@PlanDefinitionActionSurrogate.documentation ?: mutableListOf(),
      goalId =
        if (
          this@PlanDefinitionActionSurrogate.goalId == null &&
            this@PlanDefinitionActionSurrogate._goalId == null
        ) {
          mutableListOf()
        } else {
          (this@PlanDefinitionActionSurrogate.goalId
              ?: List(this@PlanDefinitionActionSurrogate._goalId!!.size) { null })
            .zip(
              this@PlanDefinitionActionSurrogate._goalId
                ?: List(this@PlanDefinitionActionSurrogate.goalId!!.size) { null }
            )
            .map { (value, element) -> Id.of(value, element)!! }
            .toMutableList()
        },
      subject =
        PlanDefinition.Action.Subject?.from(
          this@PlanDefinitionActionSurrogate.subjectCodeableConcept,
          this@PlanDefinitionActionSurrogate.subjectReference,
          Canonical.of(
            this@PlanDefinitionActionSurrogate.subjectCanonical,
            this@PlanDefinitionActionSurrogate._subjectCanonical,
          ),
        ),
      trigger = this@PlanDefinitionActionSurrogate.trigger ?: mutableListOf(),
      condition = this@PlanDefinitionActionSurrogate.condition ?: mutableListOf(),
      input = this@PlanDefinitionActionSurrogate.input ?: mutableListOf(),
      output = this@PlanDefinitionActionSurrogate.output ?: mutableListOf(),
      relatedAction = this@PlanDefinitionActionSurrogate.relatedAction ?: mutableListOf(),
      timing =
        PlanDefinition.Action.Timing?.from(
          this@PlanDefinitionActionSurrogate.timingAge,
          this@PlanDefinitionActionSurrogate.timingDuration,
          this@PlanDefinitionActionSurrogate.timingRange,
          this@PlanDefinitionActionSurrogate.timingTiming,
        ),
      location = this@PlanDefinitionActionSurrogate.location,
      participant = this@PlanDefinitionActionSurrogate.participant ?: mutableListOf(),
      type = this@PlanDefinitionActionSurrogate.type,
      groupingBehavior =
        this@PlanDefinitionActionSurrogate.groupingBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActionGroupingBehavior.fromCode(it!!),
            this@PlanDefinitionActionSurrogate._groupingBehavior,
          )
        },
      selectionBehavior =
        this@PlanDefinitionActionSurrogate.selectionBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActionSelectionBehavior.fromCode(it!!),
            this@PlanDefinitionActionSurrogate._selectionBehavior,
          )
        },
      requiredBehavior =
        this@PlanDefinitionActionSurrogate.requiredBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActionRequiredBehavior.fromCode(it!!),
            this@PlanDefinitionActionSurrogate._requiredBehavior,
          )
        },
      precheckBehavior =
        this@PlanDefinitionActionSurrogate.precheckBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActionPrecheckBehavior.fromCode(it!!),
            this@PlanDefinitionActionSurrogate._precheckBehavior,
          )
        },
      cardinalityBehavior =
        this@PlanDefinitionActionSurrogate.cardinalityBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r5.PlanDefinition.ActionCardinalityBehavior.fromCode(it!!),
            this@PlanDefinitionActionSurrogate._cardinalityBehavior,
          )
        },
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
        ),
      transform =
        Canonical.of(
          this@PlanDefinitionActionSurrogate.transform,
          this@PlanDefinitionActionSurrogate._transform,
        ),
      dynamicValue = this@PlanDefinitionActionSurrogate.dynamicValue ?: mutableListOf(),
      action = this@PlanDefinitionActionSurrogate.action ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: PlanDefinition.Action): PlanDefinitionActionSurrogate =
      with(model) {
        PlanDefinitionActionSurrogate(
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
          code = this@with.code,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          documentation = this@with.documentation.takeUnless { it.all { it == null } },
          goalId =
            this@with.goalId.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _goalId =
            this@with.goalId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value,
          subjectReference = this@with.subject?.asReference()?.value,
          subjectCanonical = this@with.subject?.asCanonical()?.value?.value,
          _subjectCanonical = this@with.subject?.asCanonical()?.value?.toElement(),
          trigger = this@with.trigger.takeUnless { it.all { it == null } },
          condition = this@with.condition.takeUnless { it.all { it == null } },
          input = this@with.input.takeUnless { it.all { it == null } },
          output = this@with.output.takeUnless { it.all { it == null } },
          relatedAction = this@with.relatedAction.takeUnless { it.all { it == null } },
          timingAge = this@with.timing?.asAge()?.value,
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
internal data class PlanDefinitionSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
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
  public var subjectCanonical: KotlinString? = null,
  public var _subjectCanonical: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: MutableList<CodeableConcept>? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var library: MutableList<KotlinString?>? = null,
  public var _library: MutableList<Element?>? = null,
  public var goal: MutableList<PlanDefinition.Goal>? = null,
  public var actor: MutableList<PlanDefinition.Actor>? = null,
  public var action: MutableList<PlanDefinition.Action>? = null,
  public var asNeededBoolean: KotlinBoolean? = null,
  public var _asNeededBoolean: Element? = null,
  public var asNeededCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): PlanDefinition =
    PlanDefinition(
      id = this@PlanDefinitionSurrogate.id,
      meta = this@PlanDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@PlanDefinitionSurrogate.implicitRules,
          this@PlanDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(this@PlanDefinitionSurrogate.language, this@PlanDefinitionSurrogate._language),
      text = this@PlanDefinitionSurrogate.text,
      contained = this@PlanDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@PlanDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PlanDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@PlanDefinitionSurrogate.url, this@PlanDefinitionSurrogate._url),
      identifier = this@PlanDefinitionSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(this@PlanDefinitionSurrogate.version, this@PlanDefinitionSurrogate._version),
      versionAlgorithm =
        PlanDefinition.VersionAlgorithm?.from(
          R5String.of(
            this@PlanDefinitionSurrogate.versionAlgorithmString,
            this@PlanDefinitionSurrogate._versionAlgorithmString,
          ),
          this@PlanDefinitionSurrogate.versionAlgorithmCoding,
        ),
      name = R5String.of(this@PlanDefinitionSurrogate.name, this@PlanDefinitionSurrogate._name),
      title = R5String.of(this@PlanDefinitionSurrogate.title, this@PlanDefinitionSurrogate._title),
      subtitle =
        R5String.of(this@PlanDefinitionSurrogate.subtitle, this@PlanDefinitionSurrogate._subtitle),
      type = this@PlanDefinitionSurrogate.type,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@PlanDefinitionSurrogate.status!!
          ),
          this@PlanDefinitionSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@PlanDefinitionSurrogate.experimental,
          this@PlanDefinitionSurrogate._experimental,
        ),
      subject =
        PlanDefinition.Subject?.from(
          this@PlanDefinitionSurrogate.subjectCodeableConcept,
          this@PlanDefinitionSurrogate.subjectReference,
          Canonical.of(
            this@PlanDefinitionSurrogate.subjectCanonical,
            this@PlanDefinitionSurrogate._subjectCanonical,
          ),
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@PlanDefinitionSurrogate.date),
          this@PlanDefinitionSurrogate._date,
        ),
      publisher =
        R5String.of(
          this@PlanDefinitionSurrogate.publisher,
          this@PlanDefinitionSurrogate._publisher,
        ),
      contact = this@PlanDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@PlanDefinitionSurrogate.description,
          this@PlanDefinitionSurrogate._description,
        ),
      useContext = this@PlanDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@PlanDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(this@PlanDefinitionSurrogate.purpose, this@PlanDefinitionSurrogate._purpose),
      usage = Markdown.of(this@PlanDefinitionSurrogate.usage, this@PlanDefinitionSurrogate._usage),
      copyright =
        Markdown.of(
          this@PlanDefinitionSurrogate.copyright,
          this@PlanDefinitionSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@PlanDefinitionSurrogate.copyrightLabel,
          this@PlanDefinitionSurrogate._copyrightLabel,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@PlanDefinitionSurrogate.approvalDate),
          this@PlanDefinitionSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@PlanDefinitionSurrogate.lastReviewDate),
          this@PlanDefinitionSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@PlanDefinitionSurrogate.effectivePeriod,
      topic = this@PlanDefinitionSurrogate.topic ?: mutableListOf(),
      author = this@PlanDefinitionSurrogate.author ?: mutableListOf(),
      editor = this@PlanDefinitionSurrogate.editor ?: mutableListOf(),
      reviewer = this@PlanDefinitionSurrogate.reviewer ?: mutableListOf(),
      endorser = this@PlanDefinitionSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@PlanDefinitionSurrogate.relatedArtifact ?: mutableListOf(),
      library =
        if (
          this@PlanDefinitionSurrogate.library == null &&
            this@PlanDefinitionSurrogate._library == null
        ) {
          mutableListOf()
        } else {
          (this@PlanDefinitionSurrogate.library
              ?: List(this@PlanDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@PlanDefinitionSurrogate._library
                ?: List(this@PlanDefinitionSurrogate.library!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      goal = this@PlanDefinitionSurrogate.goal ?: mutableListOf(),
      actor = this@PlanDefinitionSurrogate.actor ?: mutableListOf(),
      action = this@PlanDefinitionSurrogate.action ?: mutableListOf(),
      asNeeded =
        PlanDefinition.AsNeeded?.from(
          R5Boolean.of(
            this@PlanDefinitionSurrogate.asNeededBoolean,
            this@PlanDefinitionSurrogate._asNeededBoolean,
          ),
          this@PlanDefinitionSurrogate.asNeededCodeableConcept,
        ),
    )

  public companion object {
    public fun fromModel(model: PlanDefinition): PlanDefinitionSurrogate =
      with(model) {
        PlanDefinitionSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          type = this@with.type,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value,
          subjectReference = this@with.subject?.asReference()?.value,
          subjectCanonical = this@with.subject?.asCanonical()?.value?.value,
          _subjectCanonical = this@with.subject?.asCanonical()?.value?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          usage = this@with.usage?.value,
          _usage = this@with.usage?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          effectivePeriod = this@with.effectivePeriod,
          topic = this@with.topic.takeUnless { it.all { it == null } },
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          library =
            this@with.library.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _library =
            this@with.library
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          goal = this@with.goal.takeUnless { it.all { it == null } },
          actor = this@with.actor.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
          asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.value,
          _asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.toElement(),
          asNeededCodeableConcept = this@with.asNeeded?.asCodeableConcept()?.value,
        )
      }
  }
}
