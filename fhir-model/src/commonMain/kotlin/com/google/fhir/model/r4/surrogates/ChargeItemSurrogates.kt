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
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.ChargeItem
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Money
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ChargeItemPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): ChargeItem.Performer =
    ChargeItem.Performer(
      id = this@ChargeItemPerformerSurrogate.id,
      extension = this@ChargeItemPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ChargeItemPerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ChargeItemPerformerSurrogate.function,
      actor = this@ChargeItemPerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: ChargeItem.Performer): ChargeItemPerformerSurrogate =
      with(model) {
        ChargeItemPerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class ChargeItemOccurrenceSurrogate(
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
) {
  public fun toModel(): ChargeItem.Occurrence? =
    ChargeItem.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ChargeItemOccurrenceSurrogate.occurrenceDateTime),
        this@ChargeItemOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@ChargeItemOccurrenceSurrogate.occurrencePeriod,
      this@ChargeItemOccurrenceSurrogate.occurrenceTiming,
    )

  public companion object {
    public fun fromModel(model: ChargeItem.Occurrence): ChargeItemOccurrenceSurrogate =
      with(model) {
        ChargeItemOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class ChargeItemProductSurrogate(
  public var productReference: Reference? = null,
  public var productCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): ChargeItem.Product? =
    ChargeItem.Product?.from(
      this@ChargeItemProductSurrogate.productReference,
      this@ChargeItemProductSurrogate.productCodeableConcept,
    )

  public companion object {
    public fun fromModel(model: ChargeItem.Product): ChargeItemProductSurrogate =
      with(model) {
        ChargeItemProductSurrogate(
          productReference = this@with.asReference()?.value,
          productCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class ChargeItemSurrogate(
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
  public var definitionUri: MutableList<KotlinString?>? = null,
  public var _definitionUri: MutableList<Element?>? = null,
  public var definitionCanonical: MutableList<KotlinString?>? = null,
  public var _definitionCanonical: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var partOf: MutableList<Reference>? = null,
  public var code: CodeableConcept,
  public var subject: Reference,
  public var context: Reference? = null,
  public var performer: MutableList<ChargeItem.Performer>? = null,
  public var performingOrganization: Reference? = null,
  public var requestingOrganization: Reference? = null,
  public var costCenter: Reference? = null,
  public var quantity: Quantity? = null,
  public var bodysite: MutableList<CodeableConcept>? = null,
  public var factorOverride: Double? = null,
  public var _factorOverride: Element? = null,
  public var priceOverride: Money? = null,
  public var overrideReason: KotlinString? = null,
  public var _overrideReason: Element? = null,
  public var enterer: Reference? = null,
  public var enteredDate: KotlinString? = null,
  public var _enteredDate: Element? = null,
  public var reason: MutableList<CodeableConcept>? = null,
  public var service: MutableList<Reference>? = null,
  public var account: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var occurrence: ChargeItem.Occurrence? = null,
  public var product: ChargeItem.Product? = null,
) {
  public fun toModel(): ChargeItem =
    ChargeItem(
      id = this@ChargeItemSurrogate.id,
      meta = this@ChargeItemSurrogate.meta,
      implicitRules =
        Uri.of(this@ChargeItemSurrogate.implicitRules, this@ChargeItemSurrogate._implicitRules),
      language = Code.of(this@ChargeItemSurrogate.language, this@ChargeItemSurrogate._language),
      text = this@ChargeItemSurrogate.text,
      contained = this@ChargeItemSurrogate.contained ?: mutableListOf(),
      extension = this@ChargeItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ChargeItemSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ChargeItemSurrogate.identifier ?: mutableListOf(),
      definitionUri =
        if (
          this@ChargeItemSurrogate.definitionUri == null &&
            this@ChargeItemSurrogate._definitionUri == null
        ) {
          mutableListOf()
        } else {
          (this@ChargeItemSurrogate.definitionUri
              ?: List(this@ChargeItemSurrogate._definitionUri!!.size) { null })
            .zip(
              this@ChargeItemSurrogate._definitionUri
                ?: List(this@ChargeItemSurrogate.definitionUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      definitionCanonical =
        if (
          this@ChargeItemSurrogate.definitionCanonical == null &&
            this@ChargeItemSurrogate._definitionCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@ChargeItemSurrogate.definitionCanonical
              ?: List(this@ChargeItemSurrogate._definitionCanonical!!.size) { null })
            .zip(
              this@ChargeItemSurrogate._definitionCanonical
                ?: List(this@ChargeItemSurrogate.definitionCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r4.ChargeItem.ChargeItemStatus.fromCode(
            this@ChargeItemSurrogate.status!!
          ),
          this@ChargeItemSurrogate._status,
        ),
      partOf = this@ChargeItemSurrogate.partOf ?: mutableListOf(),
      code = this@ChargeItemSurrogate.code,
      subject = this@ChargeItemSurrogate.subject,
      context = this@ChargeItemSurrogate.context,
      occurrence = this@ChargeItemSurrogate.occurrence,
      performer = this@ChargeItemSurrogate.performer ?: mutableListOf(),
      performingOrganization = this@ChargeItemSurrogate.performingOrganization,
      requestingOrganization = this@ChargeItemSurrogate.requestingOrganization,
      costCenter = this@ChargeItemSurrogate.costCenter,
      quantity = this@ChargeItemSurrogate.quantity,
      bodysite = this@ChargeItemSurrogate.bodysite ?: mutableListOf(),
      factorOverride =
        Decimal.of(
          this@ChargeItemSurrogate.factorOverride,
          this@ChargeItemSurrogate._factorOverride,
        ),
      priceOverride = this@ChargeItemSurrogate.priceOverride,
      overrideReason =
        R4String.of(
          this@ChargeItemSurrogate.overrideReason,
          this@ChargeItemSurrogate._overrideReason,
        ),
      enterer = this@ChargeItemSurrogate.enterer,
      enteredDate =
        DateTime.of(
          FhirDateTime.fromString(this@ChargeItemSurrogate.enteredDate),
          this@ChargeItemSurrogate._enteredDate,
        ),
      reason = this@ChargeItemSurrogate.reason ?: mutableListOf(),
      service = this@ChargeItemSurrogate.service ?: mutableListOf(),
      product = this@ChargeItemSurrogate.product,
      account = this@ChargeItemSurrogate.account ?: mutableListOf(),
      note = this@ChargeItemSurrogate.note ?: mutableListOf(),
      supportingInformation = this@ChargeItemSurrogate.supportingInformation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ChargeItem): ChargeItemSurrogate =
      with(model) {
        ChargeItemSurrogate(
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
          definitionUri =
            this@with.definitionUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _definitionUri =
            this@with.definitionUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          definitionCanonical =
            this@with.definitionCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _definitionCanonical =
            this@with.definitionCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          context = this@with.context,
          occurrence = this@with.occurrence,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          performingOrganization = this@with.performingOrganization,
          requestingOrganization = this@with.requestingOrganization,
          costCenter = this@with.costCenter,
          quantity = this@with.quantity,
          bodysite = this@with.bodysite.takeUnless { it.all { it == null } },
          factorOverride = this@with.factorOverride?.value,
          _factorOverride = this@with.factorOverride?.toElement(),
          priceOverride = this@with.priceOverride,
          overrideReason = this@with.overrideReason?.value,
          _overrideReason = this@with.overrideReason?.toElement(),
          enterer = this@with.enterer,
          enteredDate = this@with.enteredDate?.value?.toString(),
          _enteredDate = this@with.enteredDate?.toElement(),
          reason = this@with.reason.takeUnless { it.all { it == null } },
          service = this@with.service.takeUnless { it.all { it == null } },
          product = this@with.product,
          account = this@with.account.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
        )
      }
  }
}
