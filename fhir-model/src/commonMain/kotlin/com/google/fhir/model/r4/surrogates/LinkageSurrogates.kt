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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Linkage
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class LinkageItemSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: String? = null,
  public var _type: Element? = null,
  public var resource: Reference,
) {
  public fun toModel(): Linkage.Item =
    Linkage.Item(
      id = this@LinkageItemSurrogate.id,
      extension = this@LinkageItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@LinkageItemSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4.Linkage.LinkageType.fromCode(this@LinkageItemSurrogate.type!!),
          this@LinkageItemSurrogate._type,
        ),
      resource = this@LinkageItemSurrogate.resource,
    )

  public companion object {
    public fun fromModel(model: Linkage.Item): LinkageItemSurrogate =
      with(model) {
        LinkageItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          resource = this@with.resource,
        )
      }
  }
}

@Serializable
internal data class LinkageSurrogate(
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
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var author: Reference? = null,
  public var item: MutableList<Linkage.Item>? = null,
) {
  public fun toModel(): Linkage =
    Linkage(
      id = this@LinkageSurrogate.id,
      meta = this@LinkageSurrogate.meta,
      implicitRules =
        Uri.of(this@LinkageSurrogate.implicitRules, this@LinkageSurrogate._implicitRules),
      language = Code.of(this@LinkageSurrogate.language, this@LinkageSurrogate._language),
      text = this@LinkageSurrogate.text,
      contained = this@LinkageSurrogate.contained ?: mutableListOf(),
      extension = this@LinkageSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@LinkageSurrogate.modifierExtension ?: mutableListOf(),
      active = R4Boolean.of(this@LinkageSurrogate.active, this@LinkageSurrogate._active),
      author = this@LinkageSurrogate.author,
      item = this@LinkageSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Linkage): LinkageSurrogate =
      with(model) {
        LinkageSurrogate(
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
          active = this@with.active?.value,
          _active = this@with.active?.toElement(),
          author = this@with.author,
          item = this@with.item.takeUnless { it.all { it == null } },
        )
      }
  }
}
