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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class PlanDefinitionGoalTargetDetailSurrogate {
  public var detailQuantity: Quantity? = null

  public var detailRange: Range? = null

  public var detailCodeableConcept: CodeableConcept? = null

  public var detailString: KotlinString? = null

  public var _detailString: Element? = null

  public var detailBoolean: KotlinBoolean? = null

  public var _detailBoolean: Element? = null

  public var detailInteger: Int? = null

  public var _detailInteger: Element? = null

  public var detailRatio: Ratio? = null

  public fun toModel(): PlanDefinition.Goal.Target.Detail =
    PlanDefinition.Goal.Target.Detail?.from(
      this@PlanDefinitionGoalTargetDetailSurrogate.detailQuantity,
      this@PlanDefinitionGoalTargetDetailSurrogate.detailRange,
      this@PlanDefinitionGoalTargetDetailSurrogate.detailCodeableConcept,
      R5String.of(
        this@PlanDefinitionGoalTargetDetailSurrogate.detailString,
        this@PlanDefinitionGoalTargetDetailSurrogate._detailString,
      ),
      R5Boolean.of(
        this@PlanDefinitionGoalTargetDetailSurrogate.detailBoolean,
        this@PlanDefinitionGoalTargetDetailSurrogate._detailBoolean,
      ),
      Integer.of(
        this@PlanDefinitionGoalTargetDetailSurrogate.detailInteger,
        this@PlanDefinitionGoalTargetDetailSurrogate._detailInteger,
      ),
      this@PlanDefinitionGoalTargetDetailSurrogate.detailRatio,
    ) ?: PlanDefinition.Goal.Target.Detail.Null

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Goal.Target.Detail
    ): PlanDefinitionGoalTargetDetailSurrogate =
      with(model) {
        PlanDefinitionGoalTargetDetailSurrogate().apply {
          detailQuantity = this@with.asQuantity()?.value
          detailRange = this@with.asRange()?.value
          detailCodeableConcept = this@with.asCodeableConcept()?.value
          detailString = this@with.asString()?.value?.value
          _detailString = this@with.asString()?.value?.toElement()
          detailBoolean = this@with.asBoolean()?.value?.value
          _detailBoolean = this@with.asBoolean()?.value?.toElement()
          detailInteger = this@with.asInteger()?.value?.value
          _detailInteger = this@with.asInteger()?.value?.toElement()
          detailRatio = this@with.asRatio()?.value
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionGoalTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var measure: CodeableConcept? = null,
  public var due: Duration? = null,
  public var detail: PlanDefinition.Goal.Target.Detail? = null,
) {
  public fun toModel(): PlanDefinition.Goal.Target =
    PlanDefinition.Goal.Target().apply {
      id = this@PlanDefinitionGoalTargetSurrogate.id
      extension = this@PlanDefinitionGoalTargetSurrogate.extension
      modifierExtension = this@PlanDefinitionGoalTargetSurrogate.modifierExtension
      measure = this@PlanDefinitionGoalTargetSurrogate.measure
      detail = this@PlanDefinitionGoalTargetSurrogate.detail
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
          detail = this@with.detail
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
internal data class PlanDefinitionActorOptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var typeCanonical: KotlinString? = null,
  public var _typeCanonical: Element? = null,
  public var typeReference: Reference? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): PlanDefinition.Actor.Option =
    PlanDefinition.Actor.Option().apply {
      id = this@PlanDefinitionActorOptionSurrogate.id
      extension = this@PlanDefinitionActorOptionSurrogate.extension
      modifierExtension = this@PlanDefinitionActorOptionSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@PlanDefinitionActorOptionSurrogate.type?.let {
            com.google.fhir.model.r5.PlanDefinition.ActivityParticipantType.fromCode(it)
          },
          this@PlanDefinitionActorOptionSurrogate._type,
        )
      typeCanonical =
        Canonical.of(
          this@PlanDefinitionActorOptionSurrogate.typeCanonical,
          this@PlanDefinitionActorOptionSurrogate._typeCanonical,
        )
      typeReference = this@PlanDefinitionActorOptionSurrogate.typeReference
      role = this@PlanDefinitionActorOptionSurrogate.role
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Actor.Option): PlanDefinitionActorOptionSurrogate =
      with(model) {
        PlanDefinitionActorOptionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          typeCanonical = this@with.typeCanonical?.value
          _typeCanonical = this@with.typeCanonical?.toElement()
          typeReference = this@with.typeReference
          role = this@with.role
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var option: List<PlanDefinition.Actor.Option>? = null,
) {
  public fun toModel(): PlanDefinition.Actor =
    PlanDefinition.Actor().apply {
      id = this@PlanDefinitionActorSurrogate.id
      extension = this@PlanDefinitionActorSurrogate.extension
      modifierExtension = this@PlanDefinitionActorSurrogate.modifierExtension
      title =
        R5String.of(
          this@PlanDefinitionActorSurrogate.title,
          this@PlanDefinitionActorSurrogate._title,
        )
      description =
        Markdown.of(
          this@PlanDefinitionActorSurrogate.description,
          this@PlanDefinitionActorSurrogate._description,
        )
      option = this@PlanDefinitionActorSurrogate.option
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Actor): PlanDefinitionActorSurrogate =
      with(model) {
        PlanDefinitionActorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          option = this@with.option
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
            com.google.fhir.model.r5.PlanDefinition.ActionConditionKind.fromCode(it)
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
internal data class PlanDefinitionActionInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var requirement: DataRequirement? = null,
  public var relatedData: KotlinString? = null,
  public var _relatedData: Element? = null,
) {
  public fun toModel(): PlanDefinition.Action.Input =
    PlanDefinition.Action.Input().apply {
      id = this@PlanDefinitionActionInputSurrogate.id
      extension = this@PlanDefinitionActionInputSurrogate.extension
      modifierExtension = this@PlanDefinitionActionInputSurrogate.modifierExtension
      title =
        R5String.of(
          this@PlanDefinitionActionInputSurrogate.title,
          this@PlanDefinitionActionInputSurrogate._title,
        )
      requirement = this@PlanDefinitionActionInputSurrogate.requirement
      relatedData =
        Id.of(
          this@PlanDefinitionActionInputSurrogate.relatedData,
          this@PlanDefinitionActionInputSurrogate._relatedData,
        )
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Action.Input): PlanDefinitionActionInputSurrogate =
      with(model) {
        PlanDefinitionActionInputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          requirement = this@with.requirement
          relatedData = this@with.relatedData?.value
          _relatedData = this@with.relatedData?.toElement()
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var requirement: DataRequirement? = null,
  public var relatedData: KotlinString? = null,
  public var _relatedData: Element? = null,
) {
  public fun toModel(): PlanDefinition.Action.Output =
    PlanDefinition.Action.Output().apply {
      id = this@PlanDefinitionActionOutputSurrogate.id
      extension = this@PlanDefinitionActionOutputSurrogate.extension
      modifierExtension = this@PlanDefinitionActionOutputSurrogate.modifierExtension
      title =
        R5String.of(
          this@PlanDefinitionActionOutputSurrogate.title,
          this@PlanDefinitionActionOutputSurrogate._title,
        )
      requirement = this@PlanDefinitionActionOutputSurrogate.requirement
      relatedData =
        R5String.of(
          this@PlanDefinitionActionOutputSurrogate.relatedData,
          this@PlanDefinitionActionOutputSurrogate._relatedData,
        )
    }

  public companion object {
    public fun fromModel(model: PlanDefinition.Action.Output): PlanDefinitionActionOutputSurrogate =
      with(model) {
        PlanDefinitionActionOutputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          requirement = this@with.requirement
          relatedData = this@with.relatedData?.value
          _relatedData = this@with.relatedData?.toElement()
        }
      }
  }
}

@Serializable
internal class PlanDefinitionActionRelatedActionOffsetSurrogate {
  public var offsetDuration: Duration? = null

  public var offsetRange: Range? = null

  public fun toModel(): PlanDefinition.Action.RelatedAction.Offset =
    PlanDefinition.Action.RelatedAction.Offset?.from(
      this@PlanDefinitionActionRelatedActionOffsetSurrogate.offsetDuration,
      this@PlanDefinitionActionRelatedActionOffsetSurrogate.offsetRange,
    ) ?: PlanDefinition.Action.RelatedAction.Offset.Null

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.RelatedAction.Offset
    ): PlanDefinitionActionRelatedActionOffsetSurrogate =
      with(model) {
        PlanDefinitionActionRelatedActionOffsetSurrogate().apply {
          offsetDuration = this@with.asDuration()?.value
          offsetRange = this@with.asRange()?.value
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionRelatedActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var targetId: KotlinString? = null,
  public var _targetId: Element? = null,
  public var relationship: KotlinString? = null,
  public var _relationship: Element? = null,
  public var endRelationship: KotlinString? = null,
  public var _endRelationship: Element? = null,
  public var offset: PlanDefinition.Action.RelatedAction.Offset? = null,
) {
  public fun toModel(): PlanDefinition.Action.RelatedAction =
    PlanDefinition.Action.RelatedAction().apply {
      id = this@PlanDefinitionActionRelatedActionSurrogate.id
      extension = this@PlanDefinitionActionRelatedActionSurrogate.extension
      modifierExtension = this@PlanDefinitionActionRelatedActionSurrogate.modifierExtension
      targetId =
        Id.of(
          this@PlanDefinitionActionRelatedActionSurrogate.targetId,
          this@PlanDefinitionActionRelatedActionSurrogate._targetId,
        )
      relationship =
        Enumeration.of(
          this@PlanDefinitionActionRelatedActionSurrogate.relationship?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionRelationshipType.fromCode(it)
          },
          this@PlanDefinitionActionRelatedActionSurrogate._relationship,
        )
      endRelationship =
        Enumeration.of(
          this@PlanDefinitionActionRelatedActionSurrogate.endRelationship?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionRelationshipType.fromCode(it)
          },
          this@PlanDefinitionActionRelatedActionSurrogate._endRelationship,
        )
      offset = this@PlanDefinitionActionRelatedActionSurrogate.offset
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
          targetId = this@with.targetId?.value
          _targetId = this@with.targetId?.toElement()
          relationship = this@with.relationship?.value?.getCode()
          _relationship = this@with.relationship?.toElement()
          endRelationship = this@with.endRelationship?.value?.getCode()
          _endRelationship = this@with.endRelationship?.toElement()
          offset = this@with.offset
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
    PlanDefinition.Action.Participant().apply {
      id = this@PlanDefinitionActionParticipantSurrogate.id
      extension = this@PlanDefinitionActionParticipantSurrogate.extension
      modifierExtension = this@PlanDefinitionActionParticipantSurrogate.modifierExtension
      actorId =
        R5String.of(
          this@PlanDefinitionActionParticipantSurrogate.actorId,
          this@PlanDefinitionActionParticipantSurrogate._actorId,
        )
      type =
        Enumeration.of(
          this@PlanDefinitionActionParticipantSurrogate.type?.let {
            com.google.fhir.model.r5.PlanDefinition.ActivityParticipantType.fromCode(it)
          },
          this@PlanDefinitionActionParticipantSurrogate._type,
        )
      typeCanonical =
        Canonical.of(
          this@PlanDefinitionActionParticipantSurrogate.typeCanonical,
          this@PlanDefinitionActionParticipantSurrogate._typeCanonical,
        )
      typeReference = this@PlanDefinitionActionParticipantSurrogate.typeReference
      role = this@PlanDefinitionActionParticipantSurrogate.role
      function = this@PlanDefinitionActionParticipantSurrogate.function
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
          actorId = this@with.actorId?.value
          _actorId = this@with.actorId?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          typeCanonical = this@with.typeCanonical?.value
          _typeCanonical = this@with.typeCanonical?.toElement()
          typeReference = this@with.typeReference
          role = this@with.role
          function = this@with.function
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
        R5String.of(
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
internal class PlanDefinitionActionSubjectSurrogate {
  public var subjectCodeableConcept: CodeableConcept? = null

  public var subjectReference: Reference? = null

  public var subjectCanonical: KotlinString? = null

  public var _subjectCanonical: Element? = null

  public fun toModel(): PlanDefinition.Action.Subject =
    PlanDefinition.Action.Subject?.from(
      this@PlanDefinitionActionSubjectSurrogate.subjectCodeableConcept,
      this@PlanDefinitionActionSubjectSurrogate.subjectReference,
      Canonical.of(
        this@PlanDefinitionActionSubjectSurrogate.subjectCanonical,
        this@PlanDefinitionActionSubjectSurrogate._subjectCanonical,
      ),
    ) ?: PlanDefinition.Action.Subject.Null

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.Subject
    ): PlanDefinitionActionSubjectSurrogate =
      with(model) {
        PlanDefinitionActionSubjectSurrogate().apply {
          subjectCodeableConcept = this@with.asCodeableConcept()?.value
          subjectReference = this@with.asReference()?.value
          subjectCanonical = this@with.asCanonical()?.value?.value
          _subjectCanonical = this@with.asCanonical()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal class PlanDefinitionActionTimingSurrogate {
  public var timingAge: Age? = null

  public var timingDuration: Duration? = null

  public var timingRange: Range? = null

  public var timingTiming: Timing? = null

  public fun toModel(): PlanDefinition.Action.Timing =
    PlanDefinition.Action.Timing?.from(
      this@PlanDefinitionActionTimingSurrogate.timingAge,
      this@PlanDefinitionActionTimingSurrogate.timingDuration,
      this@PlanDefinitionActionTimingSurrogate.timingRange,
      this@PlanDefinitionActionTimingSurrogate.timingTiming,
    ) ?: PlanDefinition.Action.Timing.Null

  public companion object {
    public fun fromModel(model: PlanDefinition.Action.Timing): PlanDefinitionActionTimingSurrogate =
      with(model) {
        PlanDefinitionActionTimingSurrogate().apply {
          timingAge = this@with.asAge()?.value
          timingDuration = this@with.asDuration()?.value
          timingRange = this@with.asRange()?.value
          timingTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal class PlanDefinitionActionDefinitionSurrogate {
  public var definitionCanonical: KotlinString? = null

  public var _definitionCanonical: Element? = null

  public var definitionUri: KotlinString? = null

  public var _definitionUri: Element? = null

  public fun toModel(): PlanDefinition.Action.Definition =
    PlanDefinition.Action.Definition?.from(
      Canonical.of(
        this@PlanDefinitionActionDefinitionSurrogate.definitionCanonical,
        this@PlanDefinitionActionDefinitionSurrogate._definitionCanonical,
      ),
      Uri.of(
        this@PlanDefinitionActionDefinitionSurrogate.definitionUri,
        this@PlanDefinitionActionDefinitionSurrogate._definitionUri,
      ),
    ) ?: PlanDefinition.Action.Definition.Null

  public companion object {
    public fun fromModel(
      model: PlanDefinition.Action.Definition
    ): PlanDefinitionActionDefinitionSurrogate =
      with(model) {
        PlanDefinitionActionDefinitionSurrogate().apply {
          definitionCanonical = this@with.asCanonical()?.value?.value
          _definitionCanonical = this@with.asCanonical()?.value?.toElement()
          definitionUri = this@with.asUri()?.value?.value
          _definitionUri = this@with.asUri()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class PlanDefinitionActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
  public var reason: List<CodeableConcept?>? = null,
  public var documentation: List<RelatedArtifact?>? = null,
  public var goalId: List<KotlinString?>? = null,
  public var _goalId: List<Element?>? = null,
  public var trigger: List<TriggerDefinition?>? = null,
  public var condition: List<PlanDefinition.Action.Condition>? = null,
  public var input: List<PlanDefinition.Action.Input>? = null,
  public var output: List<PlanDefinition.Action.Output>? = null,
  public var relatedAction: List<PlanDefinition.Action.RelatedAction>? = null,
  public var location: CodeableReference? = null,
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
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var dynamicValue: List<PlanDefinition.Action.DynamicValue>? = null,
  public var action: List<PlanDefinition.Action?>? = null,
  public var subject: PlanDefinition.Action.Subject? = null,
  public var timing: PlanDefinition.Action.Timing? = null,
  public var definition: PlanDefinition.Action.Definition? = null,
) {
  public fun toModel(): PlanDefinition.Action =
    PlanDefinition.Action().apply {
      id = this@PlanDefinitionActionSurrogate.id
      extension = this@PlanDefinitionActionSurrogate.extension
      modifierExtension = this@PlanDefinitionActionSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@PlanDefinitionActionSurrogate.linkId,
          this@PlanDefinitionActionSurrogate._linkId,
        )
      prefix =
        R5String.of(
          this@PlanDefinitionActionSurrogate.prefix,
          this@PlanDefinitionActionSurrogate._prefix,
        )
      title =
        R5String.of(
          this@PlanDefinitionActionSurrogate.title,
          this@PlanDefinitionActionSurrogate._title,
        )
      description =
        Markdown.of(
          this@PlanDefinitionActionSurrogate.description,
          this@PlanDefinitionActionSurrogate._description,
        )
      textEquivalent =
        Markdown.of(
          this@PlanDefinitionActionSurrogate.textEquivalent,
          this@PlanDefinitionActionSurrogate._textEquivalent,
        )
      priority =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.priority?.let {
            com.google.fhir.model.r5.PlanDefinition.RequestPriority.fromCode(it)
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
      subject = this@PlanDefinitionActionSurrogate.subject
      trigger = this@PlanDefinitionActionSurrogate.trigger
      condition = this@PlanDefinitionActionSurrogate.condition
      input = this@PlanDefinitionActionSurrogate.input
      output = this@PlanDefinitionActionSurrogate.output
      relatedAction = this@PlanDefinitionActionSurrogate.relatedAction
      timing = this@PlanDefinitionActionSurrogate.timing
      location = this@PlanDefinitionActionSurrogate.location
      participant = this@PlanDefinitionActionSurrogate.participant
      type = this@PlanDefinitionActionSurrogate.type
      groupingBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.groupingBehavior?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionGroupingBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._groupingBehavior,
        )
      selectionBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.selectionBehavior?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionSelectionBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._selectionBehavior,
        )
      requiredBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.requiredBehavior?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionRequiredBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._requiredBehavior,
        )
      precheckBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.precheckBehavior?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionPrecheckBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._precheckBehavior,
        )
      cardinalityBehavior =
        Enumeration.of(
          this@PlanDefinitionActionSurrogate.cardinalityBehavior?.let {
            com.google.fhir.model.r5.PlanDefinition.ActionCardinalityBehavior.fromCode(it)
          },
          this@PlanDefinitionActionSurrogate._cardinalityBehavior,
        )
      definition = this@PlanDefinitionActionSurrogate.definition
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
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
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
          subject = this@with.subject
          trigger = this@with.trigger
          condition = this@with.condition
          input = this@with.input
          output = this@with.output
          relatedAction = this@with.relatedAction
          timing = this@with.timing
          location = this@with.location
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
          definition = this@with.definition
          transform = this@with.transform?.value
          _transform = this@with.transform?.toElement()
          dynamicValue = this@with.dynamicValue
          action = this@with.action
        }
      }
  }
}

@Serializable
internal class PlanDefinitionVersionAlgorithmSurrogate {
  public var versionAlgorithmString: KotlinString? = null

  public var _versionAlgorithmString: Element? = null

  public var versionAlgorithmCoding: Coding? = null

  public fun toModel(): PlanDefinition.VersionAlgorithm =
    PlanDefinition.VersionAlgorithm?.from(
      R5String.of(
        this@PlanDefinitionVersionAlgorithmSurrogate.versionAlgorithmString,
        this@PlanDefinitionVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@PlanDefinitionVersionAlgorithmSurrogate.versionAlgorithmCoding,
    ) ?: PlanDefinition.VersionAlgorithm.Null

  public companion object {
    public fun fromModel(
      model: PlanDefinition.VersionAlgorithm
    ): PlanDefinitionVersionAlgorithmSurrogate =
      with(model) {
        PlanDefinitionVersionAlgorithmSurrogate().apply {
          versionAlgorithmString = this@with.asString()?.value?.value
          _versionAlgorithmString = this@with.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.asCoding()?.value
        }
      }
  }
}

@Serializable
internal class PlanDefinitionSubjectSurrogate {
  public var subjectCodeableConcept: CodeableConcept? = null

  public var subjectReference: Reference? = null

  public var subjectCanonical: KotlinString? = null

  public var _subjectCanonical: Element? = null

  public fun toModel(): PlanDefinition.Subject =
    PlanDefinition.Subject?.from(
      this@PlanDefinitionSubjectSurrogate.subjectCodeableConcept,
      this@PlanDefinitionSubjectSurrogate.subjectReference,
      Canonical.of(
        this@PlanDefinitionSubjectSurrogate.subjectCanonical,
        this@PlanDefinitionSubjectSurrogate._subjectCanonical,
      ),
    ) ?: PlanDefinition.Subject.Null

  public companion object {
    public fun fromModel(model: PlanDefinition.Subject): PlanDefinitionSubjectSurrogate =
      with(model) {
        PlanDefinitionSubjectSurrogate().apply {
          subjectCodeableConcept = this@with.asCodeableConcept()?.value
          subjectReference = this@with.asReference()?.value
          subjectCanonical = this@with.asCanonical()?.value?.value
          _subjectCanonical = this@with.asCanonical()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal class PlanDefinitionAsNeededSurrogate {
  public var asNeededBoolean: KotlinBoolean? = null

  public var _asNeededBoolean: Element? = null

  public var asNeededCodeableConcept: CodeableConcept? = null

  public fun toModel(): PlanDefinition.AsNeeded =
    PlanDefinition.AsNeeded?.from(
      R5Boolean.of(
        this@PlanDefinitionAsNeededSurrogate.asNeededBoolean,
        this@PlanDefinitionAsNeededSurrogate._asNeededBoolean,
      ),
      this@PlanDefinitionAsNeededSurrogate.asNeededCodeableConcept,
    ) ?: PlanDefinition.AsNeeded.Null

  public companion object {
    public fun fromModel(model: PlanDefinition.AsNeeded): PlanDefinitionAsNeededSurrogate =
      with(model) {
        PlanDefinitionAsNeededSurrogate().apply {
          asNeededBoolean = this@with.asBoolean()?.value?.value
          _asNeededBoolean = this@with.asBoolean()?.value?.toElement()
          asNeededCodeableConcept = this@with.asCodeableConcept()?.value
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
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
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
  public var actor: List<PlanDefinition.Actor>? = null,
  public var action: List<PlanDefinition.Action>? = null,
  public var versionAlgorithm: PlanDefinition.VersionAlgorithm? = null,
  public var subject: PlanDefinition.Subject? = null,
  public var asNeeded: PlanDefinition.AsNeeded? = null,
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
        R5String.of(this@PlanDefinitionSurrogate.version, this@PlanDefinitionSurrogate._version)
      versionAlgorithm = this@PlanDefinitionSurrogate.versionAlgorithm
      name = R5String.of(this@PlanDefinitionSurrogate.name, this@PlanDefinitionSurrogate._name)
      title = R5String.of(this@PlanDefinitionSurrogate.title, this@PlanDefinitionSurrogate._title)
      subtitle =
        R5String.of(this@PlanDefinitionSurrogate.subtitle, this@PlanDefinitionSurrogate._subtitle)
      type = this@PlanDefinitionSurrogate.type
      status =
        Enumeration.of(
          this@PlanDefinitionSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@PlanDefinitionSurrogate._status,
        )
      experimental =
        R5Boolean.of(
          this@PlanDefinitionSurrogate.experimental,
          this@PlanDefinitionSurrogate._experimental,
        )
      subject = this@PlanDefinitionSurrogate.subject
      date =
        DateTime.of(
          FhirDateTime.fromString(this@PlanDefinitionSurrogate.date),
          this@PlanDefinitionSurrogate._date,
        )
      publisher =
        R5String.of(this@PlanDefinitionSurrogate.publisher, this@PlanDefinitionSurrogate._publisher)
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
      usage = Markdown.of(this@PlanDefinitionSurrogate.usage, this@PlanDefinitionSurrogate._usage)
      copyright =
        Markdown.of(this@PlanDefinitionSurrogate.copyright, this@PlanDefinitionSurrogate._copyright)
      copyrightLabel =
        R5String.of(
          this@PlanDefinitionSurrogate.copyrightLabel,
          this@PlanDefinitionSurrogate._copyrightLabel,
        )
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
      actor = this@PlanDefinitionSurrogate.actor
      action = this@PlanDefinitionSurrogate.action
      asNeeded = this@PlanDefinitionSurrogate.asNeeded
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
          versionAlgorithm = this@with.versionAlgorithm
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
          subject = this@with.subject
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
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
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
          actor = this@with.actor
          action = this@with.action
          asNeeded = this@with.asNeeded
        }
      }
  }
}
