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
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.ProductShelfLife
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProductShelfLifeSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var type: CodeableConcept,
  public var period: Quantity,
  public var specialPrecautionsForStorage: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): ProductShelfLife =
    ProductShelfLife(
      id = this@ProductShelfLifeSurrogate.id,
      extension = this@ProductShelfLifeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProductShelfLifeSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ProductShelfLifeSurrogate.identifier,
      type = this@ProductShelfLifeSurrogate.type,
      period = this@ProductShelfLifeSurrogate.period,
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
          identifier = this@with.identifier,
          type = this@with.type,
          period = this@with.period,
          specialPrecautionsForStorage =
            this@with.specialPrecautionsForStorage.takeUnless { it.all { it == null } },
        )
      }
  }
}
