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

import com.google.fhir.model.r4b.DataRequirement
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Expression
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.TriggerDefinition
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TriggerDefinitionTimingSurrogate(
  public var timingTiming: Timing? = null,
  public var timingReference: Reference? = null,
  public var timingDate: KotlinString? = null,
  public var _timingDate: Element? = null,
  public var timingDateTime: KotlinString? = null,
  public var _timingDateTime: Element? = null,
) {
  public fun toModel(): TriggerDefinition.Timing =
    TriggerDefinition.Timing?.from(
      this@TriggerDefinitionTimingSurrogate.timingTiming,
      this@TriggerDefinitionTimingSurrogate.timingReference,
      Date.of(
        FhirDate.fromString(this@TriggerDefinitionTimingSurrogate.timingDate),
        this@TriggerDefinitionTimingSurrogate._timingDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@TriggerDefinitionTimingSurrogate.timingDateTime),
        this@TriggerDefinitionTimingSurrogate._timingDateTime,
      ),
    )!!

  public companion object {
    public fun fromModel(model: TriggerDefinition.Timing): TriggerDefinitionTimingSurrogate =
      with(model) {
        TriggerDefinitionTimingSurrogate(
          timingTiming = this@with.asTiming()?.value,
          timingReference = this@with.asReference()?.value,
          timingDate = this@with.asDate()?.value?.value?.toString(),
          _timingDate = this@with.asDate()?.value?.toElement(),
          timingDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _timingDateTime = this@with.asDateTime()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class TriggerDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var timing: TriggerDefinition.Timing? = null,
  public var `data`: MutableList<DataRequirement>? = null,
  public var condition: Expression? = null,
) {
  public fun toModel(): TriggerDefinition =
    TriggerDefinition(
      id = this@TriggerDefinitionSurrogate.id,
      extension = this@TriggerDefinitionSurrogate.extension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.TriggerDefinition.TriggerType.fromCode(
            this@TriggerDefinitionSurrogate.type!!
          ),
          this@TriggerDefinitionSurrogate._type,
        ),
      name =
        R4bString.of(this@TriggerDefinitionSurrogate.name, this@TriggerDefinitionSurrogate._name),
      timing = this@TriggerDefinitionSurrogate.timing,
      `data` = this@TriggerDefinitionSurrogate.`data` ?: mutableListOf(),
      condition = this@TriggerDefinitionSurrogate.condition,
    )

  public companion object {
    public fun fromModel(model: TriggerDefinition): TriggerDefinitionSurrogate =
      with(model) {
        TriggerDefinitionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          timing = this@with.timing,
          `data` = this@with.`data`.takeUnless { it.all { it == null } },
          condition = this@with.condition,
        )
      }
  }
}
