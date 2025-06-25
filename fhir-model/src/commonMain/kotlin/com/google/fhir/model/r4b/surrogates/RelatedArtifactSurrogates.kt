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

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Url
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class RelatedArtifactSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var citation: KotlinString? = null,
  public var _citation: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var document: Attachment? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
) {
  public fun toModel(): RelatedArtifact =
    RelatedArtifact().apply {
      id = this@RelatedArtifactSurrogate.id
      extension = this@RelatedArtifactSurrogate.extension
      type =
        Enumeration.of(
          this@RelatedArtifactSurrogate.type?.let {
            com.google.fhir.model.r4b.RelatedArtifact.RelatedArtifactType.fromCode(it)
          },
          this@RelatedArtifactSurrogate._type,
        )
      label =
        R4bString.of(this@RelatedArtifactSurrogate.label, this@RelatedArtifactSurrogate._label)
      display =
        R4bString.of(this@RelatedArtifactSurrogate.display, this@RelatedArtifactSurrogate._display)
      citation =
        Markdown.of(this@RelatedArtifactSurrogate.citation, this@RelatedArtifactSurrogate._citation)
      url = Url.of(this@RelatedArtifactSurrogate.url, this@RelatedArtifactSurrogate._url)
      document = this@RelatedArtifactSurrogate.document
      resource =
        Canonical.of(
          this@RelatedArtifactSurrogate.resource,
          this@RelatedArtifactSurrogate._resource,
        )
    }

  public companion object {
    public fun fromModel(model: RelatedArtifact): RelatedArtifactSurrogate =
      with(model) {
        RelatedArtifactSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          label = this@with.label?.value
          _label = this@with.label?.toElement()
          display = this@with.display?.value
          _display = this@with.display?.toElement()
          citation = this@with.citation?.value
          _citation = this@with.citation?.toElement()
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          document = this@with.document
          resource = this@with.resource?.value
          _resource = this@with.resource?.toElement()
        }
      }
  }
}
