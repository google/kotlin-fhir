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

import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ReferenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var reference: KotlinString? = null,
  public var _reference: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var identifier: Identifier? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
) {
  public fun toModel(): Reference =
    Reference(
      id = this@ReferenceSurrogate.id,
      extension = this@ReferenceSurrogate.extension ?: mutableListOf(),
      reference =
        R4bString.of(this@ReferenceSurrogate.reference, this@ReferenceSurrogate._reference),
      type = Uri.of(this@ReferenceSurrogate.type, this@ReferenceSurrogate._type),
      identifier = this@ReferenceSurrogate.identifier,
      display = R4bString.of(this@ReferenceSurrogate.display, this@ReferenceSurrogate._display),
    )

  public companion object {
    public fun fromModel(model: Reference): ReferenceSurrogate =
      with(model) {
        ReferenceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          reference = this@with.reference?.value,
          _reference = this@with.reference?.toElement(),
          type = this@with.type?.value,
          _type = this@with.type?.toElement(),
          identifier = this@with.identifier,
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
        )
      }
  }
}
