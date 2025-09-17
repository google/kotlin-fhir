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
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.List
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ListEntrySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var flag: CodeableConcept? = null,
  public var deleted: KotlinBoolean? = null,
  public var _deleted: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var item: Reference,
) {
  public fun toModel(): List.Entry =
    List.Entry(
      id = this@ListEntrySurrogate.id,
      extension = this@ListEntrySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ListEntrySurrogate.modifierExtension ?: mutableListOf(),
      flag = this@ListEntrySurrogate.flag,
      deleted = R4Boolean.of(this@ListEntrySurrogate.deleted, this@ListEntrySurrogate._deleted),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ListEntrySurrogate.date),
          this@ListEntrySurrogate._date,
        ),
      item = this@ListEntrySurrogate.item,
    )

  public companion object {
    public fun fromModel(model: List.Entry): ListEntrySurrogate =
      with(model) {
        ListEntrySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          flag = this@with.flag,
          deleted = this@with.deleted?.value,
          _deleted = this@with.deleted?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          item = this@with.item,
        )
      }
  }
}

@Serializable
internal data class ListSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var source: Reference? = null,
  public var orderedBy: CodeableConcept? = null,
  public var note: MutableList<Annotation>? = null,
  public var entry: MutableList<List.Entry>? = null,
  public var emptyReason: CodeableConcept? = null,
) {
  public fun toModel(): List =
    List(
      id = this@ListSurrogate.id,
      meta = this@ListSurrogate.meta,
      implicitRules = Uri.of(this@ListSurrogate.implicitRules, this@ListSurrogate._implicitRules),
      language = Code.of(this@ListSurrogate.language, this@ListSurrogate._language),
      text = this@ListSurrogate.text,
      contained = this@ListSurrogate.contained ?: mutableListOf(),
      extension = this@ListSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ListSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ListSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          List.ListStatus.fromCode(this@ListSurrogate.status!!),
          this@ListSurrogate._status,
        ),
      mode =
        Enumeration.of(List.ListMode.fromCode(this@ListSurrogate.mode!!), this@ListSurrogate._mode),
      title = R4String.of(this@ListSurrogate.title, this@ListSurrogate._title),
      code = this@ListSurrogate.code,
      subject = this@ListSurrogate.subject,
      encounter = this@ListSurrogate.encounter,
      date =
        DateTime.of(FhirDateTime.fromString(this@ListSurrogate.date), this@ListSurrogate._date),
      source = this@ListSurrogate.source,
      orderedBy = this@ListSurrogate.orderedBy,
      note = this@ListSurrogate.note ?: mutableListOf(),
      entry = this@ListSurrogate.entry ?: mutableListOf(),
      emptyReason = this@ListSurrogate.emptyReason,
    )

  public companion object {
    public fun fromModel(model: List): ListSurrogate =
      with(model) {
        ListSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          code = this@with.code,
          subject = this@with.subject,
          encounter = this@with.encounter,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          source = this@with.source,
          orderedBy = this@with.orderedBy,
          note = this@with.note.takeIf { it.isNotEmpty() },
          entry = this@with.entry.takeIf { it.isNotEmpty() },
          emptyReason = this@with.emptyReason,
        )
      }
  }
}
