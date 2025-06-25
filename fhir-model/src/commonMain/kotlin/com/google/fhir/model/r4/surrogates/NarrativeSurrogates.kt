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

import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Xhtml
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class NarrativeSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var div: String? = null,
  public var _div: Element? = null,
) {
  public fun toModel(): Narrative =
    Narrative().apply {
      id = this@NarrativeSurrogate.id
      extension = this@NarrativeSurrogate.extension
      status =
        Enumeration.of(
          this@NarrativeSurrogate.status?.let {
            com.google.fhir.model.r4.Narrative.NarrativeStatus.fromCode(it)
          },
          this@NarrativeSurrogate._status,
        )
      div = Xhtml.of(this@NarrativeSurrogate.div, this@NarrativeSurrogate._div)
    }

  public companion object {
    public fun fromModel(model: Narrative): NarrativeSurrogate =
      with(model) {
        NarrativeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          div = this@with.div?.value
          _div = this@with.div?.toElement()
        }
      }
  }
}
