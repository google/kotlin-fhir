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

import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Population
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PopulationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var ageRange: Range? = null,
  public var ageCodeableConcept: CodeableConcept? = null,
  public var gender: CodeableConcept? = null,
  public var race: CodeableConcept? = null,
  public var physiologicalCondition: CodeableConcept? = null,
) {
  public fun toModel(): Population =
    Population(
      id = this@PopulationSurrogate.id,
      extension = this@PopulationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PopulationSurrogate.modifierExtension ?: mutableListOf(),
      age =
        Population.Age?.from(
          this@PopulationSurrogate.ageRange,
          this@PopulationSurrogate.ageCodeableConcept,
        ),
      gender = this@PopulationSurrogate.gender,
      race = this@PopulationSurrogate.race,
      physiologicalCondition = this@PopulationSurrogate.physiologicalCondition,
    )

  public companion object {
    public fun fromModel(model: Population): PopulationSurrogate =
      with(model) {
        PopulationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          ageRange = this@with.age?.asRange()?.value,
          ageCodeableConcept = this@with.age?.asCodeableConcept()?.value,
          gender = this@with.gender,
          race = this@with.race,
          physiologicalCondition = this@with.physiologicalCondition,
        )
      }
  }
}
