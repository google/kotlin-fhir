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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.Goal
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
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
internal data class GoalTargetSurrogate(
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
  public var dueDate: KotlinString? = null,
  public var _dueDate: Element? = null,
  public var dueDuration: Duration? = null,
) {
  public fun toModel(): Goal.Target =
    Goal.Target(
      id = this@GoalTargetSurrogate.id,
      extension = this@GoalTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GoalTargetSurrogate.modifierExtension ?: mutableListOf(),
      measure = this@GoalTargetSurrogate.measure,
      detail =
        Goal.Target.Detail?.from(
          this@GoalTargetSurrogate.detailQuantity,
          this@GoalTargetSurrogate.detailRange,
          this@GoalTargetSurrogate.detailCodeableConcept,
          R5String.of(
            this@GoalTargetSurrogate.detailString,
            this@GoalTargetSurrogate._detailString,
          ),
          R5Boolean.of(
            this@GoalTargetSurrogate.detailBoolean,
            this@GoalTargetSurrogate._detailBoolean,
          ),
          Integer.of(
            this@GoalTargetSurrogate.detailInteger,
            this@GoalTargetSurrogate._detailInteger,
          ),
          this@GoalTargetSurrogate.detailRatio,
        ),
      due =
        Goal.Target.Due?.from(
          Date.of(
            FhirDate.fromString(this@GoalTargetSurrogate.dueDate),
            this@GoalTargetSurrogate._dueDate,
          ),
          this@GoalTargetSurrogate.dueDuration,
        ),
    )

  public companion object {
    public fun fromModel(model: Goal.Target): GoalTargetSurrogate =
      with(model) {
        GoalTargetSurrogate(
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
          dueDate = this@with.due?.asDate()?.value?.value?.toString(),
          _dueDate = this@with.due?.asDate()?.value?.toElement(),
          dueDuration = this@with.due?.asDuration()?.value,
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
  public var continuous: KotlinBoolean? = null,
  public var _continuous: Element? = null,
  public var priority: CodeableConcept? = null,
  public var description: CodeableConcept,
  public var subject: Reference,
  public var startDate: KotlinString? = null,
  public var _startDate: Element? = null,
  public var startCodeableConcept: CodeableConcept? = null,
  public var target: MutableList<Goal.Target>? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var statusReason: KotlinString? = null,
  public var _statusReason: Element? = null,
  public var source: Reference? = null,
  public var addresses: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var outcome: MutableList<CodeableReference>? = null,
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
          com.google.fhir.model.r5.Goal.GoalLifecycleStatus.fromCode(
            this@GoalSurrogate.lifecycleStatus!!
          ),
          this@GoalSurrogate._lifecycleStatus,
        ),
      achievementStatus = this@GoalSurrogate.achievementStatus,
      category = this@GoalSurrogate.category ?: mutableListOf(),
      continuous = R5Boolean.of(this@GoalSurrogate.continuous, this@GoalSurrogate._continuous),
      priority = this@GoalSurrogate.priority,
      description = this@GoalSurrogate.description,
      subject = this@GoalSurrogate.subject,
      start =
        Goal.Start?.from(
          Date.of(FhirDate.fromString(this@GoalSurrogate.startDate), this@GoalSurrogate._startDate),
          this@GoalSurrogate.startCodeableConcept,
        ),
      target = this@GoalSurrogate.target ?: mutableListOf(),
      statusDate =
        Date.of(FhirDate.fromString(this@GoalSurrogate.statusDate), this@GoalSurrogate._statusDate),
      statusReason = R5String.of(this@GoalSurrogate.statusReason, this@GoalSurrogate._statusReason),
      source = this@GoalSurrogate.source,
      addresses = this@GoalSurrogate.addresses ?: mutableListOf(),
      note = this@GoalSurrogate.note ?: mutableListOf(),
      outcome = this@GoalSurrogate.outcome ?: mutableListOf(),
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
          continuous = this@with.continuous?.value,
          _continuous = this@with.continuous?.toElement(),
          priority = this@with.priority,
          description = this@with.description,
          subject = this@with.subject,
          startDate = this@with.start?.asDate()?.value?.value?.toString(),
          _startDate = this@with.start?.asDate()?.value?.toElement(),
          startCodeableConcept = this@with.start?.asCodeableConcept()?.value,
          target = this@with.target.takeUnless { it.all { it == null } },
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          statusReason = this@with.statusReason?.value,
          _statusReason = this@with.statusReason?.toElement(),
          source = this@with.source,
          addresses = this@with.addresses.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          outcome = this@with.outcome.takeUnless { it.all { it == null } },
        )
      }
  }
}
