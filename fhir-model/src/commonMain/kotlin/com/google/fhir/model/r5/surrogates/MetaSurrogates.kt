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

import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MetaSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var versionId: String? = null,
  public var _versionId: Element? = null,
  public var lastUpdated: String? = null,
  public var _lastUpdated: Element? = null,
  public var source: String? = null,
  public var _source: Element? = null,
  public var profile: List<String?>? = null,
  public var _profile: List<Element?>? = null,
  public var security: List<Coding?>? = null,
  public var tag: List<Coding?>? = null,
) {
  public fun toModel(): Meta =
    Meta().apply {
      id = this@MetaSurrogate.id
      extension = this@MetaSurrogate.extension
      versionId = Id.of(this@MetaSurrogate.versionId, this@MetaSurrogate._versionId)
      lastUpdated =
        Instant.of(
          FhirDateTime.fromString(this@MetaSurrogate.lastUpdated),
          this@MetaSurrogate._lastUpdated,
        )
      source = Uri.of(this@MetaSurrogate.source, this@MetaSurrogate._source)
      profile =
        if (this@MetaSurrogate.profile == null && this@MetaSurrogate._profile == null) {
          null
        } else {
          (this@MetaSurrogate.profile ?: List(this@MetaSurrogate._profile!!.size) { null })
            .zip(this@MetaSurrogate._profile ?: List(this@MetaSurrogate.profile!!.size) { null })
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      security = this@MetaSurrogate.security
      tag = this@MetaSurrogate.tag
    }

  public companion object {
    public fun fromModel(model: Meta): MetaSurrogate =
      with(model) {
        MetaSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          versionId = this@with.versionId?.value
          _versionId = this@with.versionId?.toElement()
          lastUpdated = this@with.lastUpdated?.value?.toString()
          _lastUpdated = this@with.lastUpdated?.toElement()
          source = this@with.source?.value
          _source = this@with.source?.toElement()
          profile = this@with.profile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _profile =
            this@with.profile?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          security = this@with.security
          tag = this@with.tag
        }
      }
  }
}
