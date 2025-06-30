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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.CatalogEntry
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CatalogEntryRelatedEntrySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var relationtype: String? = null,
  public var _relationtype: Element? = null,
  public var item: Reference? = null,
) {
  public fun toModel(): CatalogEntry.RelatedEntry =
    CatalogEntry.RelatedEntry().apply {
      id = this@CatalogEntryRelatedEntrySurrogate.id
      extension = this@CatalogEntryRelatedEntrySurrogate.extension
      modifierExtension = this@CatalogEntryRelatedEntrySurrogate.modifierExtension
      relationtype =
        Enumeration.of(
          this@CatalogEntryRelatedEntrySurrogate.relationtype?.let {
            com.google.fhir.model.r4b.CatalogEntry.CatalogEntryRelationType.fromCode(it)
          },
          this@CatalogEntryRelatedEntrySurrogate._relationtype,
        )
      item = this@CatalogEntryRelatedEntrySurrogate.item
    }

  public companion object {
    public fun fromModel(model: CatalogEntry.RelatedEntry): CatalogEntryRelatedEntrySurrogate =
      with(model) {
        CatalogEntryRelatedEntrySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          relationtype = this@with.relationtype?.value?.getCode()
          _relationtype = this@with.relationtype?.toElement()
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class CatalogEntrySurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: CodeableConcept? = null,
  public var orderable: KotlinBoolean? = null,
  public var _orderable: Element? = null,
  public var referencedItem: Reference? = null,
  public var additionalIdentifier: List<Identifier?>? = null,
  public var classification: List<CodeableConcept?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var validityPeriod: Period? = null,
  public var validTo: String? = null,
  public var _validTo: Element? = null,
  public var lastUpdated: String? = null,
  public var _lastUpdated: Element? = null,
  public var additionalCharacteristic: List<CodeableConcept?>? = null,
  public var additionalClassification: List<CodeableConcept?>? = null,
  public var relatedEntry: List<CatalogEntry.RelatedEntry>? = null,
) {
  public fun toModel(): CatalogEntry =
    CatalogEntry().apply {
      id = this@CatalogEntrySurrogate.id
      meta = this@CatalogEntrySurrogate.meta
      implicitRules =
        Uri.of(this@CatalogEntrySurrogate.implicitRules, this@CatalogEntrySurrogate._implicitRules)
      language = Code.of(this@CatalogEntrySurrogate.language, this@CatalogEntrySurrogate._language)
      text = this@CatalogEntrySurrogate.text
      contained = this@CatalogEntrySurrogate.contained
      extension = this@CatalogEntrySurrogate.extension
      modifierExtension = this@CatalogEntrySurrogate.modifierExtension
      identifier = this@CatalogEntrySurrogate.identifier
      type = this@CatalogEntrySurrogate.type
      orderable =
        R4bBoolean.of(this@CatalogEntrySurrogate.orderable, this@CatalogEntrySurrogate._orderable)
      referencedItem = this@CatalogEntrySurrogate.referencedItem
      additionalIdentifier = this@CatalogEntrySurrogate.additionalIdentifier
      classification = this@CatalogEntrySurrogate.classification
      status =
        Enumeration.of(
          this@CatalogEntrySurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@CatalogEntrySurrogate._status,
        )
      validityPeriod = this@CatalogEntrySurrogate.validityPeriod
      validTo =
        DateTime.of(
          FhirDateTime.fromString(this@CatalogEntrySurrogate.validTo),
          this@CatalogEntrySurrogate._validTo,
        )
      lastUpdated =
        DateTime.of(
          FhirDateTime.fromString(this@CatalogEntrySurrogate.lastUpdated),
          this@CatalogEntrySurrogate._lastUpdated,
        )
      additionalCharacteristic = this@CatalogEntrySurrogate.additionalCharacteristic
      additionalClassification = this@CatalogEntrySurrogate.additionalClassification
      relatedEntry = this@CatalogEntrySurrogate.relatedEntry
    }

  public companion object {
    public fun fromModel(model: CatalogEntry): CatalogEntrySurrogate =
      with(model) {
        CatalogEntrySurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          type = this@with.type
          orderable = this@with.orderable?.value
          _orderable = this@with.orderable?.toElement()
          referencedItem = this@with.referencedItem
          additionalIdentifier = this@with.additionalIdentifier
          classification = this@with.classification
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          validityPeriod = this@with.validityPeriod
          validTo = this@with.validTo?.value?.toString()
          _validTo = this@with.validTo?.toElement()
          lastUpdated = this@with.lastUpdated?.value?.toString()
          _lastUpdated = this@with.lastUpdated?.toElement()
          additionalCharacteristic = this@with.additionalCharacteristic
          additionalClassification = this@with.additionalClassification
          relatedEntry = this@with.relatedEntry
        }
      }
  }
}
