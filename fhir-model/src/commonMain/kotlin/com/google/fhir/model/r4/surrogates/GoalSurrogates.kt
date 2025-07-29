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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.Goal
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class GoalTargetDetailSurrogate(
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
) {
  public fun toModel(): Goal.Target.Detail? =
    Goal.Target.Detail?.from(
      this@GoalTargetDetailSurrogate.detailQuantity,
      this@GoalTargetDetailSurrogate.detailRange,
      this@GoalTargetDetailSurrogate.detailCodeableConcept,
      R4String.of(
        this@GoalTargetDetailSurrogate.detailString,
        this@GoalTargetDetailSurrogate._detailString,
      ),
      R4Boolean.of(
        this@GoalTargetDetailSurrogate.detailBoolean,
        this@GoalTargetDetailSurrogate._detailBoolean,
      ),
      Integer.of(
        this@GoalTargetDetailSurrogate.detailInteger,
        this@GoalTargetDetailSurrogate._detailInteger,
      ),
      this@GoalTargetDetailSurrogate.detailRatio,
    )

  public companion object {
    public fun fromModel(model: Goal.Target.Detail): GoalTargetDetailSurrogate =
      with(model) {
        GoalTargetDetailSurrogate(
          detailQuantity = this@with.asQuantity()?.value,
          detailRange = this@with.asRange()?.value,
          detailCodeableConcept = this@with.asCodeableConcept()?.value,
          detailString = this@with.asString()?.value?.value,
          _detailString = this@with.asString()?.value?.toElement(),
          detailBoolean = this@with.asBoolean()?.value?.value,
          _detailBoolean = this@with.asBoolean()?.value?.toElement(),
          detailInteger = this@with.asInteger()?.value?.value,
          _detailInteger = this@with.asInteger()?.value?.toElement(),
          detailRatio = this@with.asRatio()?.value,
        )
      }
  }
}

@Serializable
internal data class GoalTargetDueSurrogate(
  public var dueDate: KotlinString? = null,
  public var _dueDate: Element? = null,
  public var dueDuration: Duration? = null,
) {
  public fun toModel(): Goal.Target.Due? =
    Goal.Target.Due?.from(
      Date.of(
        FhirDate.fromString(this@GoalTargetDueSurrogate.dueDate),
        this@GoalTargetDueSurrogate._dueDate,
      ),
      this@GoalTargetDueSurrogate.dueDuration,
    )

  public companion object {
    public fun fromModel(model: Goal.Target.Due): GoalTargetDueSurrogate =
      with(model) {
        GoalTargetDueSurrogate(
          dueDate = this@with.asDate()?.value?.value?.toString(),
          _dueDate = this@with.asDate()?.value?.toElement(),
          dueDuration = this@with.asDuration()?.value,
        )
      }
  }
}

@Serializable
internal data class GoalTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var measure: CodeableConcept? = null,
  public var detail: Goal.Target.Detail? = null,
  public var due: Goal.Target.Due? = null,
) {
  public fun toModel(): Goal.Target =
    Goal.Target(
      id = this@GoalTargetSurrogate.id,
      extension = this@GoalTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GoalTargetSurrogate.modifierExtension ?: mutableListOf(),
      measure = this@GoalTargetSurrogate.measure,
      detail = this@GoalTargetSurrogate.detail,
      due = this@GoalTargetSurrogate.due,
    )

  public companion object {
    public fun fromModel(model: Goal.Target): GoalTargetSurrogate =
      with(model) {
        GoalTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          measure = this@with.measure,
          detail = this@with.detail,
          due = this@with.due,
        )
      }
  }
}

@Serializable
internal data class GoalStartSurrogate(
  public var startDate: KotlinString? = null,
  public var _startDate: Element? = null,
  public var startCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): Goal.Start? =
    Goal.Start?.from(
      Date.of(
        FhirDate.fromString(this@GoalStartSurrogate.startDate),
        this@GoalStartSurrogate._startDate,
      ),
      this@GoalStartSurrogate.startCodeableConcept,
    )

  public companion object {
    public fun fromModel(model: Goal.Start): GoalStartSurrogate =
      with(model) {
        GoalStartSurrogate(
          startDate = this@with.asDate()?.value?.value?.toString(),
          _startDate = this@with.asDate()?.value?.toElement(),
          startCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class GoalSurrogate(
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
  public var lifecycleStatus: KotlinString? = null,
  public var _lifecycleStatus: Element? = null,
  public var achievementStatus: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: CodeableConcept? = null,
  public var description: CodeableConcept,
  public var subject: Reference,
  public var target: MutableList<Goal.Target>? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var statusReason: KotlinString? = null,
  public var _statusReason: Element? = null,
  public var expressedBy: Reference? = null,
  public var addresses: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var outcomeCode: MutableList<CodeableConcept>? = null,
  public var outcomeReference: MutableList<Reference>? = null,
  public var start: Goal.Start? = null,
) {
  public fun toModel(): Goal =
    Goal(
      id = this@GoalSurrogate.id,
      meta = this@GoalSurrogate.meta,
      implicitRules = Uri.of(this@GoalSurrogate.implicitRules, this@GoalSurrogate._implicitRules),
      language = Code.of(this@GoalSurrogate.language, this@GoalSurrogate._language),
      text = this@GoalSurrogate.text,
      contained = this@GoalSurrogate.contained ?: mutableListOf(),
      extension = this@GoalSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GoalSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@GoalSurrogate.identifier ?: mutableListOf(),
      lifecycleStatus =
        Enumeration.of(
          com.google.fhir.model.r4.Goal.GoalLifecycleStatus.fromCode(
            this@GoalSurrogate.lifecycleStatus!!
          ),
          this@GoalSurrogate._lifecycleStatus,
        ),
      achievementStatus = this@GoalSurrogate.achievementStatus,
      category = this@GoalSurrogate.category ?: mutableListOf(),
      priority = this@GoalSurrogate.priority,
      description = this@GoalSurrogate.description,
      subject = this@GoalSurrogate.subject,
      start = this@GoalSurrogate.start,
      target = this@GoalSurrogate.target ?: mutableListOf(),
      statusDate =
        Date.of(FhirDate.fromString(this@GoalSurrogate.statusDate), this@GoalSurrogate._statusDate),
      statusReason = R4String.of(this@GoalSurrogate.statusReason, this@GoalSurrogate._statusReason),
      expressedBy = this@GoalSurrogate.expressedBy,
      addresses = this@GoalSurrogate.addresses ?: mutableListOf(),
      note = this@GoalSurrogate.note ?: mutableListOf(),
      outcomeCode = this@GoalSurrogate.outcomeCode ?: mutableListOf(),
      outcomeReference = this@GoalSurrogate.outcomeReference ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Goal): GoalSurrogate =
      with(model) {
        GoalSurrogate(
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
          lifecycleStatus = this@with.lifecycleStatus.value?.getCode(),
          _lifecycleStatus = this@with.lifecycleStatus.toElement(),
          achievementStatus = this@with.achievementStatus,
          category = this@with.category.takeUnless { it.all { it == null } },
          priority = this@with.priority,
          description = this@with.description,
          subject = this@with.subject,
          start = this@with.start,
          target = this@with.target.takeUnless { it.all { it == null } },
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          statusReason = this@with.statusReason?.value,
          _statusReason = this@with.statusReason?.toElement(),
          expressedBy = this@with.expressedBy,
          addresses = this@with.addresses.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          outcomeCode = this@with.outcomeCode.takeUnless { it.all { it == null } },
          outcomeReference = this@with.outcomeReference.takeUnless { it.all { it == null } },
        )
      }
  }
}
