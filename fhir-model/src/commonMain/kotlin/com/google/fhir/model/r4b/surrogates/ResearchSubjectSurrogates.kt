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

import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.ResearchSubject
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ResearchSubjectSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var period: Period? = null,
  public var study: Reference? = null,
  public var individual: Reference? = null,
  public var assignedArm: KotlinString? = null,
  public var _assignedArm: Element? = null,
  public var actualArm: KotlinString? = null,
  public var _actualArm: Element? = null,
  public var consent: Reference? = null,
) {
  public fun toModel(): ResearchSubject =
    ResearchSubject().apply {
      id = this@ResearchSubjectSurrogate.id
      meta = this@ResearchSubjectSurrogate.meta
      implicitRules =
        Uri.of(
          this@ResearchSubjectSurrogate.implicitRules,
          this@ResearchSubjectSurrogate._implicitRules,
        )
      language =
        Code.of(this@ResearchSubjectSurrogate.language, this@ResearchSubjectSurrogate._language)
      text = this@ResearchSubjectSurrogate.text
      contained = this@ResearchSubjectSurrogate.contained
      extension = this@ResearchSubjectSurrogate.extension
      modifierExtension = this@ResearchSubjectSurrogate.modifierExtension
      identifier = this@ResearchSubjectSurrogate.identifier
      status =
        Enumeration.of(
          this@ResearchSubjectSurrogate.status?.let {
            com.google.fhir.model.r4b.ResearchSubject.ResearchSubjectStatus.fromCode(it)
          },
          this@ResearchSubjectSurrogate._status,
        )
      period = this@ResearchSubjectSurrogate.period
      study = this@ResearchSubjectSurrogate.study
      individual = this@ResearchSubjectSurrogate.individual
      assignedArm =
        R4bString.of(
          this@ResearchSubjectSurrogate.assignedArm,
          this@ResearchSubjectSurrogate._assignedArm,
        )
      actualArm =
        R4bString.of(
          this@ResearchSubjectSurrogate.actualArm,
          this@ResearchSubjectSurrogate._actualArm,
        )
      consent = this@ResearchSubjectSurrogate.consent
    }

  public companion object {
    public fun fromModel(model: ResearchSubject): ResearchSubjectSurrogate =
      with(model) {
        ResearchSubjectSurrogate().apply {
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
          period = this@with.period
          study = this@with.study
          individual = this@with.individual
          assignedArm = this@with.assignedArm?.value
          _assignedArm = this@with.assignedArm?.toElement()
          actualArm = this@with.actualArm?.value
          _actualArm = this@with.actualArm?.toElement()
          consent = this@with.consent
        }
      }
  }
}
