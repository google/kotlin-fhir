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

import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.Contributor
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ContributorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var contact: List<ContactDetail?>? = null,
) {
  public fun toModel(): Contributor =
    Contributor().apply {
      id = this@ContributorSurrogate.id
      extension = this@ContributorSurrogate.extension
      type =
        Enumeration.of(
          this@ContributorSurrogate.type?.let {
            com.google.fhir.model.r4b.Contributor.ContributorType.fromCode(it)
          },
          this@ContributorSurrogate._type,
        )
      name = R4bString.of(this@ContributorSurrogate.name, this@ContributorSurrogate._name)
      contact = this@ContributorSurrogate.contact
    }

  public companion object {
    public fun fromModel(model: Contributor): ContributorSurrogate =
      with(model) {
        ContributorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          contact = this@with.contact
        }
      }
  }
}
