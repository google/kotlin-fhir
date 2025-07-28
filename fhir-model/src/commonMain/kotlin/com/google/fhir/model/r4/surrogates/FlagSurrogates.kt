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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Flag
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept,
  public var subject: Reference,
  public var period: Period? = null,
  public var encounter: Reference? = null,
  public var author: Reference? = null,
) {
  public fun toModel(): Flag =
    Flag(
      id = this@FlagSurrogate.id,
      meta = this@FlagSurrogate.meta,
      implicitRules = Uri.of(this@FlagSurrogate.implicitRules, this@FlagSurrogate._implicitRules),
      language = Code.of(this@FlagSurrogate.language, this@FlagSurrogate._language),
      text = this@FlagSurrogate.text,
      contained = this@FlagSurrogate.contained ?: mutableListOf(),
      extension = this@FlagSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@FlagSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@FlagSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.Flag.FlagStatus.fromCode(this@FlagSurrogate.status!!),
          this@FlagSurrogate._status,
        ),
      category = this@FlagSurrogate.category ?: mutableListOf(),
      code = this@FlagSurrogate.code,
      subject = this@FlagSurrogate.subject,
      period = this@FlagSurrogate.period,
      encounter = this@FlagSurrogate.encounter,
      author = this@FlagSurrogate.author,
    )

  public companion object {
    public fun fromModel(model: Flag): FlagSurrogate =
      with(model) {
        FlagSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          period = this@with.period,
          encounter = this@with.encounter,
          author = this@with.author,
        )
      }
  }
}
