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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.CatalogEntry
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CatalogEntryRelatedEntrySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var relationtype: String? = null,
  public var _relationtype: Element? = null,
  public var item: Reference,
) {
  public fun toModel(): CatalogEntry.RelatedEntry =
    CatalogEntry.RelatedEntry(
      id = this@CatalogEntryRelatedEntrySurrogate.id,
      extension = this@CatalogEntryRelatedEntrySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CatalogEntryRelatedEntrySurrogate.modifierExtension ?: mutableListOf(),
      relationtype =
        Enumeration.of(
          com.google.fhir.model.r4.CatalogEntry.CatalogEntryRelationType.fromCode(
            this@CatalogEntryRelatedEntrySurrogate.relationtype!!
          ),
          this@CatalogEntryRelatedEntrySurrogate._relationtype,
        ),
      item = this@CatalogEntryRelatedEntrySurrogate.item,
    )

  public companion object {
    public fun fromModel(model: CatalogEntry.RelatedEntry): CatalogEntryRelatedEntrySurrogate =
      with(model) {
        CatalogEntryRelatedEntrySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          relationtype = this@with.relationtype.value?.getCode(),
          _relationtype = this@with.relationtype.toElement(),
          item = this@with.item,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var orderable: KotlinBoolean? = null,
  public var _orderable: Element? = null,
  public var referencedItem: Reference,
  public var additionalIdentifier: MutableList<Identifier>? = null,
  public var classification: MutableList<CodeableConcept>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var validityPeriod: Period? = null,
  public var validTo: String? = null,
  public var _validTo: Element? = null,
  public var lastUpdated: String? = null,
  public var _lastUpdated: Element? = null,
  public var additionalCharacteristic: MutableList<CodeableConcept>? = null,
  public var additionalClassification: MutableList<CodeableConcept>? = null,
  public var relatedEntry: MutableList<CatalogEntry.RelatedEntry>? = null,
) {
  public fun toModel(): CatalogEntry =
    CatalogEntry(
      id = this@CatalogEntrySurrogate.id,
      meta = this@CatalogEntrySurrogate.meta,
      implicitRules =
        Uri.of(this@CatalogEntrySurrogate.implicitRules, this@CatalogEntrySurrogate._implicitRules),
      language = Code.of(this@CatalogEntrySurrogate.language, this@CatalogEntrySurrogate._language),
      text = this@CatalogEntrySurrogate.text,
      contained = this@CatalogEntrySurrogate.contained ?: mutableListOf(),
      extension = this@CatalogEntrySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CatalogEntrySurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CatalogEntrySurrogate.identifier ?: mutableListOf(),
      type = this@CatalogEntrySurrogate.type,
      orderable =
        R4Boolean.of(this@CatalogEntrySurrogate.orderable, this@CatalogEntrySurrogate._orderable)!!,
      referencedItem = this@CatalogEntrySurrogate.referencedItem,
      additionalIdentifier = this@CatalogEntrySurrogate.additionalIdentifier ?: mutableListOf(),
      classification = this@CatalogEntrySurrogate.classification ?: mutableListOf(),
      status =
        this@CatalogEntrySurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r4.PublicationStatus.fromCode(it!!),
            this@CatalogEntrySurrogate._status,
          )
        },
      validityPeriod = this@CatalogEntrySurrogate.validityPeriod,
      validTo =
        DateTime.of(
          FhirDateTime.fromString(this@CatalogEntrySurrogate.validTo),
          this@CatalogEntrySurrogate._validTo,
        ),
      lastUpdated =
        DateTime.of(
          FhirDateTime.fromString(this@CatalogEntrySurrogate.lastUpdated),
          this@CatalogEntrySurrogate._lastUpdated,
        ),
      additionalCharacteristic =
        this@CatalogEntrySurrogate.additionalCharacteristic ?: mutableListOf(),
      additionalClassification =
        this@CatalogEntrySurrogate.additionalClassification ?: mutableListOf(),
      relatedEntry = this@CatalogEntrySurrogate.relatedEntry ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CatalogEntry): CatalogEntrySurrogate =
      with(model) {
        CatalogEntrySurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          type = this@with.type,
          orderable = this@with.orderable.value,
          _orderable = this@with.orderable.toElement(),
          referencedItem = this@with.referencedItem,
          additionalIdentifier =
            this@with.additionalIdentifier.takeUnless { it.all { it == null } },
          classification = this@with.classification.takeUnless { it.all { it == null } },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          validityPeriod = this@with.validityPeriod,
          validTo = this@with.validTo?.value?.toString(),
          _validTo = this@with.validTo?.toElement(),
          lastUpdated = this@with.lastUpdated?.value?.toString(),
          _lastUpdated = this@with.lastUpdated?.toElement(),
          additionalCharacteristic =
            this@with.additionalCharacteristic.takeUnless { it.all { it == null } },
          additionalClassification =
            this@with.additionalClassification.takeUnless { it.all { it == null } },
          relatedEntry = this@with.relatedEntry.takeUnless { it.all { it == null } },
        )
      }
  }
}
