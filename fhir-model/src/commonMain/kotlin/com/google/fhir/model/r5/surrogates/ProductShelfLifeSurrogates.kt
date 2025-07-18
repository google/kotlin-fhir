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

import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.ProductShelfLife
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProductShelfLifeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var periodDuration: Duration? = null,
  public var periodString: KotlinString? = null,
  public var _periodString: Element? = null,
  public var specialPrecautionsForStorage: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): ProductShelfLife =
    ProductShelfLife(
      id = this@ProductShelfLifeSurrogate.id,
      extension = this@ProductShelfLifeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProductShelfLifeSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ProductShelfLifeSurrogate.type,
      period =
        ProductShelfLife.Period?.from(
          this@ProductShelfLifeSurrogate.periodDuration,
          R5String.of(
            this@ProductShelfLifeSurrogate.periodString,
            this@ProductShelfLifeSurrogate._periodString,
          ),
        ),
      specialPrecautionsForStorage =
        this@ProductShelfLifeSurrogate.specialPrecautionsForStorage ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ProductShelfLife): ProductShelfLifeSurrogate =
      with(model) {
        ProductShelfLifeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          periodDuration = this@with.period?.asDuration()?.value,
          periodString = this@with.period?.asString()?.value?.value,
          _periodString = this@with.period?.asString()?.value?.toElement(),
          specialPrecautionsForStorage =
            this@with.specialPrecautionsForStorage.takeUnless { it.all { it == null } },
        )
      }
  }
}
