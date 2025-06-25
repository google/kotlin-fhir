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

import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.ContactPoint
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ContactDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var telecom: List<ContactPoint?>? = null,
) {
  public fun toModel(): ContactDetail =
    ContactDetail().apply {
      id = this@ContactDetailSurrogate.id
      extension = this@ContactDetailSurrogate.extension
      name = R4String.of(this@ContactDetailSurrogate.name, this@ContactDetailSurrogate._name)
      telecom = this@ContactDetailSurrogate.telecom
    }

  public companion object {
    public fun fromModel(model: ContactDetail): ContactDetailSurrogate =
      with(model) {
        ContactDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          telecom = this@with.telecom
        }
      }
  }
}
