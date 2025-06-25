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
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.ParameterDefinition
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ParameterDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var use: KotlinString? = null,
  public var _use: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
) {
  public fun toModel(): ParameterDefinition =
    ParameterDefinition().apply {
      id = this@ParameterDefinitionSurrogate.id
      extension = this@ParameterDefinitionSurrogate.extension
      name =
        Code.of(this@ParameterDefinitionSurrogate.name, this@ParameterDefinitionSurrogate._name)
      use =
        Enumeration.of(
          this@ParameterDefinitionSurrogate.use?.let {
            com.google.fhir.model.r4.ParameterDefinition.ParameterUse.fromCode(it)
          },
          this@ParameterDefinitionSurrogate._use,
        )
      min =
        Integer.of(this@ParameterDefinitionSurrogate.min, this@ParameterDefinitionSurrogate._min)
      max =
        R4String.of(this@ParameterDefinitionSurrogate.max, this@ParameterDefinitionSurrogate._max)
      documentation =
        R4String.of(
          this@ParameterDefinitionSurrogate.documentation,
          this@ParameterDefinitionSurrogate._documentation,
        )
      type =
        Enumeration.of(
          this@ParameterDefinitionSurrogate.type?.let {
            com.google.fhir.model.r4.FHIRAllTypes.fromCode(it)
          },
          this@ParameterDefinitionSurrogate._type,
        )
      profile =
        Canonical.of(
          this@ParameterDefinitionSurrogate.profile,
          this@ParameterDefinitionSurrogate._profile,
        )
    }

  public companion object {
    public fun fromModel(model: ParameterDefinition): ParameterDefinitionSurrogate =
      with(model) {
        ParameterDefinitionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          use = this@with.use?.value?.getCode()
          _use = this@with.use?.toElement()
          min = this@with.min?.value
          _min = this@with.min?.toElement()
          max = this@with.max?.value
          _max = this@with.max?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          profile = this@with.profile?.value
          _profile = this@with.profile?.toElement()
        }
      }
  }
}
