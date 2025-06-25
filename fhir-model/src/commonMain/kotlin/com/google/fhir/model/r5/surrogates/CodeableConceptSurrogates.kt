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
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CodeableConceptSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var coding: List<Coding?>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): CodeableConcept =
    CodeableConcept().apply {
      id = this@CodeableConceptSurrogate.id
      extension = this@CodeableConceptSurrogate.extension
      coding = this@CodeableConceptSurrogate.coding
      text = R5String.of(this@CodeableConceptSurrogate.text, this@CodeableConceptSurrogate._text)
    }

  public companion object {
    public fun fromModel(model: CodeableConcept): CodeableConceptSurrogate =
      with(model) {
        CodeableConceptSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          coding = this@with.coding
          text = this@with.text?.value
          _text = this@with.text?.toElement()
        }
      }
  }
}
