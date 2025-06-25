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

import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ReferenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var reference: KotlinString? = null,
  public var _reference: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var identifier: Identifier? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
) {
  public fun toModel(): Reference =
    Reference().apply {
      id = this@ReferenceSurrogate.id
      extension = this@ReferenceSurrogate.extension
      reference = R5String.of(this@ReferenceSurrogate.reference, this@ReferenceSurrogate._reference)
      type = Uri.of(this@ReferenceSurrogate.type, this@ReferenceSurrogate._type)
      identifier = this@ReferenceSurrogate.identifier
      display = R5String.of(this@ReferenceSurrogate.display, this@ReferenceSurrogate._display)
    }

  public companion object {
    public fun fromModel(model: Reference): ReferenceSurrogate =
      with(model) {
        ReferenceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          reference = this@with.reference?.value
          _reference = this@with.reference?.toElement()
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          identifier = this@with.identifier
          display = this@with.display?.value
          _display = this@with.display?.toElement()
        }
      }
  }
}
