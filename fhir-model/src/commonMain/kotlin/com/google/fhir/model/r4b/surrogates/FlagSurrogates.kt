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
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Flag
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class FlagSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var period: Period? = null,
  public var encounter: Reference? = null,
  public var author: Reference? = null,
) {
  public fun toModel(): Flag =
    Flag().apply {
      id = this@FlagSurrogate.id
      meta = this@FlagSurrogate.meta
      implicitRules = Uri.of(this@FlagSurrogate.implicitRules, this@FlagSurrogate._implicitRules)
      language = Code.of(this@FlagSurrogate.language, this@FlagSurrogate._language)
      text = this@FlagSurrogate.text
      contained = this@FlagSurrogate.contained
      extension = this@FlagSurrogate.extension
      modifierExtension = this@FlagSurrogate.modifierExtension
      identifier = this@FlagSurrogate.identifier
      status =
        Enumeration.of(
          this@FlagSurrogate.status?.let { com.google.fhir.model.r4b.Flag.FlagStatus.fromCode(it) },
          this@FlagSurrogate._status,
        )
      category = this@FlagSurrogate.category
      code = this@FlagSurrogate.code
      subject = this@FlagSurrogate.subject
      period = this@FlagSurrogate.period
      encounter = this@FlagSurrogate.encounter
      author = this@FlagSurrogate.author
    }

  public companion object {
    public fun fromModel(model: Flag): FlagSurrogate =
      with(model) {
        FlagSurrogate().apply {
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
          category = this@with.category
          code = this@with.code
          subject = this@with.subject
          period = this@with.period
          encounter = this@with.encounter
          author = this@with.author
        }
      }
  }
}
