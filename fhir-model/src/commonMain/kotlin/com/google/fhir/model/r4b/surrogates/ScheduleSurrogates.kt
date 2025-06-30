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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Schedule
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var serviceCategory: List<CodeableConcept?>? = null,
  public var serviceType: List<CodeableConcept?>? = null,
  public var specialty: List<CodeableConcept?>? = null,
  public var actor: List<Reference?>? = null,
  public var planningHorizon: Period? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): Schedule =
    Schedule().apply {
      id = this@ScheduleSurrogate.id
      meta = this@ScheduleSurrogate.meta
      implicitRules =
        Uri.of(this@ScheduleSurrogate.implicitRules, this@ScheduleSurrogate._implicitRules)
      language = Code.of(this@ScheduleSurrogate.language, this@ScheduleSurrogate._language)
      text = this@ScheduleSurrogate.text
      contained = this@ScheduleSurrogate.contained
      extension = this@ScheduleSurrogate.extension
      modifierExtension = this@ScheduleSurrogate.modifierExtension
      identifier = this@ScheduleSurrogate.identifier
      active = R4bBoolean.of(this@ScheduleSurrogate.active, this@ScheduleSurrogate._active)
      serviceCategory = this@ScheduleSurrogate.serviceCategory
      serviceType = this@ScheduleSurrogate.serviceType
      specialty = this@ScheduleSurrogate.specialty
      actor = this@ScheduleSurrogate.actor
      planningHorizon = this@ScheduleSurrogate.planningHorizon
      comment = R4bString.of(this@ScheduleSurrogate.comment, this@ScheduleSurrogate._comment)
    }

  public companion object {
    public fun fromModel(model: Schedule): ScheduleSurrogate =
      with(model) {
        ScheduleSurrogate().apply {
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
          active = this@with.active?.value
          _active = this@with.active?.toElement()
          serviceCategory = this@with.serviceCategory
          serviceType = this@with.serviceType
          specialty = this@with.specialty
          actor = this@with.actor
          planningHorizon = this@with.planningHorizon
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
        }
      }
  }
}
