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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.InventoryReport
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class InventoryReportInventoryListingItemSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var item: CodeableReference? = null,
) {
  public fun toModel(): InventoryReport.InventoryListing.Item =
    InventoryReport.InventoryListing.Item().apply {
      id = this@InventoryReportInventoryListingItemSurrogate.id
      extension = this@InventoryReportInventoryListingItemSurrogate.extension
      modifierExtension = this@InventoryReportInventoryListingItemSurrogate.modifierExtension
      category = this@InventoryReportInventoryListingItemSurrogate.category
      quantity = this@InventoryReportInventoryListingItemSurrogate.quantity
      item = this@InventoryReportInventoryListingItemSurrogate.item
    }

  public companion object {
    public fun fromModel(
      model: InventoryReport.InventoryListing.Item
    ): InventoryReportInventoryListingItemSurrogate =
      with(model) {
        InventoryReportInventoryListingItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          quantity = this@with.quantity
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class InventoryReportInventoryListingSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var location: Reference? = null,
  public var itemStatus: CodeableConcept? = null,
  public var countingDateTime: String? = null,
  public var _countingDateTime: Element? = null,
  public var item: List<InventoryReport.InventoryListing.Item>? = null,
) {
  public fun toModel(): InventoryReport.InventoryListing =
    InventoryReport.InventoryListing().apply {
      id = this@InventoryReportInventoryListingSurrogate.id
      extension = this@InventoryReportInventoryListingSurrogate.extension
      modifierExtension = this@InventoryReportInventoryListingSurrogate.modifierExtension
      location = this@InventoryReportInventoryListingSurrogate.location
      itemStatus = this@InventoryReportInventoryListingSurrogate.itemStatus
      countingDateTime =
        DateTime.of(
          FhirDateTime.fromString(this@InventoryReportInventoryListingSurrogate.countingDateTime),
          this@InventoryReportInventoryListingSurrogate._countingDateTime,
        )
      item = this@InventoryReportInventoryListingSurrogate.item
    }

  public companion object {
    public fun fromModel(
      model: InventoryReport.InventoryListing
    ): InventoryReportInventoryListingSurrogate =
      with(model) {
        InventoryReportInventoryListingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          location = this@with.location
          itemStatus = this@with.itemStatus
          countingDateTime = this@with.countingDateTime?.value?.toString()
          _countingDateTime = this@with.countingDateTime?.toElement()
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class InventoryReportSurrogate(
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
  public var status: String? = null,
  public var _status: Element? = null,
  public var countType: String? = null,
  public var _countType: Element? = null,
  public var operationType: CodeableConcept? = null,
  public var operationTypeReason: CodeableConcept? = null,
  public var reportedDateTime: String? = null,
  public var _reportedDateTime: Element? = null,
  public var reporter: Reference? = null,
  public var reportingPeriod: Period? = null,
  public var inventoryListing: List<InventoryReport.InventoryListing>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): InventoryReport =
    InventoryReport().apply {
      id = this@InventoryReportSurrogate.id
      meta = this@InventoryReportSurrogate.meta
      implicitRules =
        Uri.of(
          this@InventoryReportSurrogate.implicitRules,
          this@InventoryReportSurrogate._implicitRules,
        )
      language =
        Code.of(this@InventoryReportSurrogate.language, this@InventoryReportSurrogate._language)
      text = this@InventoryReportSurrogate.text
      contained = this@InventoryReportSurrogate.contained
      extension = this@InventoryReportSurrogate.extension
      modifierExtension = this@InventoryReportSurrogate.modifierExtension
      identifier = this@InventoryReportSurrogate.identifier
      status =
        Enumeration.of(
          this@InventoryReportSurrogate.status?.let {
            com.google.fhir.model.r5.InventoryReport.InventoryReportStatus.fromCode(it)
          },
          this@InventoryReportSurrogate._status,
        )
      countType =
        Enumeration.of(
          this@InventoryReportSurrogate.countType?.let {
            com.google.fhir.model.r5.InventoryReport.InventoryCountType.fromCode(it)
          },
          this@InventoryReportSurrogate._countType,
        )
      operationType = this@InventoryReportSurrogate.operationType
      operationTypeReason = this@InventoryReportSurrogate.operationTypeReason
      reportedDateTime =
        DateTime.of(
          FhirDateTime.fromString(this@InventoryReportSurrogate.reportedDateTime),
          this@InventoryReportSurrogate._reportedDateTime,
        )
      reporter = this@InventoryReportSurrogate.reporter
      reportingPeriod = this@InventoryReportSurrogate.reportingPeriod
      inventoryListing = this@InventoryReportSurrogate.inventoryListing
      note = this@InventoryReportSurrogate.note
    }

  public companion object {
    public fun fromModel(model: InventoryReport): InventoryReportSurrogate =
      with(model) {
        InventoryReportSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          countType = this@with.countType?.value?.getCode()
          _countType = this@with.countType?.toElement()
          operationType = this@with.operationType
          operationTypeReason = this@with.operationTypeReason
          reportedDateTime = this@with.reportedDateTime?.value?.toString()
          _reportedDateTime = this@with.reportedDateTime?.toElement()
          reporter = this@with.reporter
          reportingPeriod = this@with.reportingPeriod
          inventoryListing = this@with.inventoryListing
          note = this@with.note
        }
      }
  }
}
