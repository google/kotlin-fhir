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

import com.google.fhir.model.r5.Basic
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class BasicSurrogate(
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
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var created: String? = null,
  public var _created: Element? = null,
  public var author: Reference? = null,
) {
  public fun toModel(): Basic =
    Basic().apply {
      id = this@BasicSurrogate.id
      meta = this@BasicSurrogate.meta
      implicitRules = Uri.of(this@BasicSurrogate.implicitRules, this@BasicSurrogate._implicitRules)
      language = Code.of(this@BasicSurrogate.language, this@BasicSurrogate._language)
      text = this@BasicSurrogate.text
      contained = this@BasicSurrogate.contained
      extension = this@BasicSurrogate.extension
      modifierExtension = this@BasicSurrogate.modifierExtension
      identifier = this@BasicSurrogate.identifier
      code = this@BasicSurrogate.code
      subject = this@BasicSurrogate.subject
      created =
        DateTime.of(
          FhirDateTime.fromString(this@BasicSurrogate.created),
          this@BasicSurrogate._created,
        )
      author = this@BasicSurrogate.author
    }

  public companion object {
    public fun fromModel(model: Basic): BasicSurrogate =
      with(model) {
        BasicSurrogate().apply {
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
          code = this@with.code
          subject = this@with.subject
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          author = this@with.author
        }
      }
  }
}
