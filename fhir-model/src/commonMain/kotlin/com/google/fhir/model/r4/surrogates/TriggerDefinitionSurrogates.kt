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

import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Expression
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.TriggerDefinition
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TriggerDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var timingTiming: Timing? = null,
  public var timingReference: Reference? = null,
  public var timingDate: KotlinString? = null,
  public var _timingDate: Element? = null,
  public var timingDateTime: KotlinString? = null,
  public var _timingDateTime: Element? = null,
  public var `data`: MutableList<DataRequirement>? = null,
  public var condition: Expression? = null,
) {
  public fun toModel(): TriggerDefinition =
    TriggerDefinition(
      id = this@TriggerDefinitionSurrogate.id,
      extension = this@TriggerDefinitionSurrogate.extension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4.TriggerDefinition.TriggerType.fromCode(
            this@TriggerDefinitionSurrogate.type!!
          ),
          this@TriggerDefinitionSurrogate._type,
        ),
      name =
        R4String.of(this@TriggerDefinitionSurrogate.name, this@TriggerDefinitionSurrogate._name),
      timing =
        TriggerDefinition.Timing?.from(
          this@TriggerDefinitionSurrogate.timingTiming,
          this@TriggerDefinitionSurrogate.timingReference,
          Date.of(
            FhirDate.fromString(this@TriggerDefinitionSurrogate.timingDate),
            this@TriggerDefinitionSurrogate._timingDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@TriggerDefinitionSurrogate.timingDateTime),
            this@TriggerDefinitionSurrogate._timingDateTime,
          ),
        ),
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
          timingTiming = this@with.timing?.asTiming()?.value,
          timingReference = this@with.timing?.asReference()?.value,
          timingDate = this@with.timing?.asDate()?.value?.value?.toString(),
          _timingDate = this@with.timing?.asDate()?.value?.toElement(),
          timingDateTime = this@with.timing?.asDateTime()?.value?.value?.toString(),
          _timingDateTime = this@with.timing?.asDateTime()?.value?.toElement(),
          `data` = this@with.`data`.takeUnless { it.all { it == null } },
          condition = this@with.condition,
        )
      }
  }
}
