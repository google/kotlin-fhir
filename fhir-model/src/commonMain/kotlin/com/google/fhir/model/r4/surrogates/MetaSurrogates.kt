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

import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Id
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MetaSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var versionId: String? = null,
  public var _versionId: Element? = null,
  public var lastUpdated: String? = null,
  public var _lastUpdated: Element? = null,
  public var source: String? = null,
  public var _source: Element? = null,
  public var profile: MutableList<String?>? = null,
  public var _profile: MutableList<Element?>? = null,
  public var security: MutableList<Coding>? = null,
  public var tag: MutableList<Coding>? = null,
) {
  public fun toModel(): Meta =
    Meta(
      id = this@MetaSurrogate.id,
      extension = this@MetaSurrogate.extension ?: mutableListOf(),
      versionId = Id.of(this@MetaSurrogate.versionId, this@MetaSurrogate._versionId),
      lastUpdated =
        Instant.of(
          FhirDateTime.fromString(this@MetaSurrogate.lastUpdated),
          this@MetaSurrogate._lastUpdated,
        ),
      source = Uri.of(this@MetaSurrogate.source, this@MetaSurrogate._source),
      profile =
        if (this@MetaSurrogate.profile == null && this@MetaSurrogate._profile == null) {
          mutableListOf()
        } else {
          (this@MetaSurrogate.profile ?: List(this@MetaSurrogate._profile!!.size) { null })
            .zip(this@MetaSurrogate._profile ?: List(this@MetaSurrogate.profile!!.size) { null })
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      security = this@MetaSurrogate.security ?: mutableListOf(),
      tag = this@MetaSurrogate.tag ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Meta): MetaSurrogate =
      with(model) {
        MetaSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          versionId = this@with.versionId?.value,
          _versionId = this@with.versionId?.toElement(),
          lastUpdated = this@with.lastUpdated?.value?.toString(),
          _lastUpdated = this@with.lastUpdated?.toElement(),
          source = this@with.source?.value,
          _source = this@with.source?.toElement(),
          profile =
            this@with.profile.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _profile =
            this@with.profile
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          security = this@with.security.takeUnless { it.all { it == null } },
          tag = this@with.tag.takeUnless { it.all { it == null } },
        )
      }
  }
}
