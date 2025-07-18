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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AnnotationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var authorReference: Reference? = null,
  public var authorString: KotlinString? = null,
  public var _authorString: Element? = null,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Annotation =
    Annotation(
      id = this@AnnotationSurrogate.id,
      extension = this@AnnotationSurrogate.extension ?: mutableListOf(),
      author =
        Annotation.Author?.from(
          this@AnnotationSurrogate.authorReference,
          R4String.of(this@AnnotationSurrogate.authorString, this@AnnotationSurrogate._authorString),
        ),
      time =
        DateTime.of(
          FhirDateTime.fromString(this@AnnotationSurrogate.time),
          this@AnnotationSurrogate._time,
        ),
      text = Markdown.of(this@AnnotationSurrogate.text, this@AnnotationSurrogate._text)!!,
    )

  public companion object {
    public fun fromModel(model: Annotation): AnnotationSurrogate =
      with(model) {
        AnnotationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          authorReference = this@with.author?.asReference()?.value,
          authorString = this@with.author?.asString()?.value?.value,
          _authorString = this@with.author?.asString()?.value?.toElement(),
          time = this@with.time?.value?.toString(),
          _time = this@with.time?.toElement(),
          text = this@with.text.value,
          _text = this@with.text.toElement(),
        )
      }
  }
}
