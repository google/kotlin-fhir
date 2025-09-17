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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Schedule
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ScheduleSurrogate(
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
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var serviceCategory: MutableList<CodeableConcept>? = null,
  public var serviceType: MutableList<CodeableConcept>? = null,
  public var specialty: MutableList<CodeableConcept>? = null,
  public var actor: MutableList<Reference>? = null,
  public var planningHorizon: Period? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): Schedule =
    Schedule(
      id = this@ScheduleSurrogate.id,
      meta = this@ScheduleSurrogate.meta,
      implicitRules =
        Uri.of(this@ScheduleSurrogate.implicitRules, this@ScheduleSurrogate._implicitRules),
      language = Code.of(this@ScheduleSurrogate.language, this@ScheduleSurrogate._language),
      text = this@ScheduleSurrogate.text,
      contained = this@ScheduleSurrogate.contained ?: mutableListOf(),
      extension = this@ScheduleSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ScheduleSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ScheduleSurrogate.identifier ?: mutableListOf(),
      active = R4Boolean.of(this@ScheduleSurrogate.active, this@ScheduleSurrogate._active),
      serviceCategory = this@ScheduleSurrogate.serviceCategory ?: mutableListOf(),
      serviceType = this@ScheduleSurrogate.serviceType ?: mutableListOf(),
      specialty = this@ScheduleSurrogate.specialty ?: mutableListOf(),
      actor = this@ScheduleSurrogate.actor ?: mutableListOf(),
      planningHorizon = this@ScheduleSurrogate.planningHorizon,
      comment = R4String.of(this@ScheduleSurrogate.comment, this@ScheduleSurrogate._comment),
    )

  public companion object {
    public fun fromModel(model: Schedule): ScheduleSurrogate =
      with(model) {
        ScheduleSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          active = this@with.active?.value,
          _active = this@with.active?.toElement(),
          serviceCategory = this@with.serviceCategory.takeIf { it.isNotEmpty() },
          serviceType = this@with.serviceType.takeIf { it.isNotEmpty() },
          specialty = this@with.specialty.takeIf { it.isNotEmpty() },
          actor = this@with.actor.takeIf { it.isNotEmpty() },
          planningHorizon = this@with.planningHorizon,
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
        )
      }
  }
}
