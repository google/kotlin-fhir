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

import com.google.fhir.model.r5.Address
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.ContactPoint
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.HumanName
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ExtendedContactDetailSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var purpose: CodeableConcept? = null,
  public var name: MutableList<HumanName>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var address: Address? = null,
  public var organization: Reference? = null,
  public var period: Period? = null,
) {
  public fun toModel(): ExtendedContactDetail =
    ExtendedContactDetail(
      id = this@ExtendedContactDetailSurrogate.id,
      extension = this@ExtendedContactDetailSurrogate.extension ?: mutableListOf(),
      purpose = this@ExtendedContactDetailSurrogate.purpose,
      name = this@ExtendedContactDetailSurrogate.name ?: mutableListOf(),
      telecom = this@ExtendedContactDetailSurrogate.telecom ?: mutableListOf(),
      address = this@ExtendedContactDetailSurrogate.address,
      organization = this@ExtendedContactDetailSurrogate.organization,
      period = this@ExtendedContactDetailSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: ExtendedContactDetail): ExtendedContactDetailSurrogate =
      with(model) {
        ExtendedContactDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          purpose = this@with.purpose,
          name = this@with.name.takeUnless { it.all { it == null } },
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          address = this@with.address,
          organization = this@with.organization,
          period = this@with.period,
        )
      }
  }
}
