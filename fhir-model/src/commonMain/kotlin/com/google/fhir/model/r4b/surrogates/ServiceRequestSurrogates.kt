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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
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
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.ServiceRequest
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ServiceRequestQuantitySurrogate(
  public var quantityQuantity: Quantity? = null,
  public var quantityRatio: Ratio? = null,
  public var quantityRange: Range? = null,
) {
  public fun toModel(): ServiceRequest.Quantity =
    ServiceRequest.Quantity?.from(
      this@ServiceRequestQuantitySurrogate.quantityQuantity,
      this@ServiceRequestQuantitySurrogate.quantityRatio,
      this@ServiceRequestQuantitySurrogate.quantityRange,
    )!!

  public companion object {
    public fun fromModel(model: ServiceRequest.Quantity): ServiceRequestQuantitySurrogate =
      with(model) {
        ServiceRequestQuantitySurrogate(
          quantityQuantity = this@with.asQuantity()?.value,
          quantityRatio = this@with.asRatio()?.value,
          quantityRange = this@with.asRange()?.value,
        )
      }
  }
}

@Serializable
internal data class ServiceRequestOccurrenceSurrogate(
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
) {
  public fun toModel(): ServiceRequest.Occurrence =
    ServiceRequest.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ServiceRequestOccurrenceSurrogate.occurrenceDateTime),
        this@ServiceRequestOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@ServiceRequestOccurrenceSurrogate.occurrencePeriod,
      this@ServiceRequestOccurrenceSurrogate.occurrenceTiming,
    )!!

  public companion object {
    public fun fromModel(model: ServiceRequest.Occurrence): ServiceRequestOccurrenceSurrogate =
      with(model) {
        ServiceRequestOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class ServiceRequestAsNeededSurrogate(
  public var asNeededBoolean: KotlinBoolean? = null,
  public var _asNeededBoolean: Element? = null,
  public var asNeededCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): ServiceRequest.AsNeeded =
    ServiceRequest.AsNeeded?.from(
      R4bBoolean.of(
        this@ServiceRequestAsNeededSurrogate.asNeededBoolean,
        this@ServiceRequestAsNeededSurrogate._asNeededBoolean,
      ),
      this@ServiceRequestAsNeededSurrogate.asNeededCodeableConcept,
    )!!

  public companion object {
    public fun fromModel(model: ServiceRequest.AsNeeded): ServiceRequestAsNeededSurrogate =
      with(model) {
        ServiceRequestAsNeededSurrogate(
          asNeededBoolean = this@with.asBoolean()?.value?.value,
          _asNeededBoolean = this@with.asBoolean()?.value?.toElement(),
          asNeededCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class ServiceRequestSurrogate(
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
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var replaces: MutableList<Reference>? = null,
  public var requisition: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var code: CodeableConcept? = null,
  public var orderDetail: MutableList<CodeableConcept>? = null,
  public var quantity: ServiceRequest.Quantity? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var occurrence: ServiceRequest.Occurrence? = null,
  public var asNeeded: ServiceRequest.AsNeeded? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var performerType: CodeableConcept? = null,
  public var performer: MutableList<Reference>? = null,
  public var locationCode: MutableList<CodeableConcept>? = null,
  public var locationReference: MutableList<Reference>? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var insurance: MutableList<Reference>? = null,
  public var supportingInfo: MutableList<Reference>? = null,
  public var specimen: MutableList<Reference>? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var note: MutableList<Annotation>? = null,
  public var patientInstruction: KotlinString? = null,
  public var _patientInstruction: Element? = null,
  public var relevantHistory: MutableList<Reference>? = null,
) {
  public fun toModel(): ServiceRequest =
    ServiceRequest(
      id = this@ServiceRequestSurrogate.id,
      meta = this@ServiceRequestSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ServiceRequestSurrogate.implicitRules,
          this@ServiceRequestSurrogate._implicitRules,
        ),
      language =
        Code.of(this@ServiceRequestSurrogate.language, this@ServiceRequestSurrogate._language),
      text = this@ServiceRequestSurrogate.text,
      contained = this@ServiceRequestSurrogate.contained ?: mutableListOf(),
      extension = this@ServiceRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ServiceRequestSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ServiceRequestSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@ServiceRequestSurrogate.instantiatesCanonical == null &&
            this@ServiceRequestSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@ServiceRequestSurrogate.instantiatesCanonical
              ?: List(this@ServiceRequestSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@ServiceRequestSurrogate._instantiatesCanonical
                ?: List(this@ServiceRequestSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@ServiceRequestSurrogate.instantiatesUri == null &&
            this@ServiceRequestSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@ServiceRequestSurrogate.instantiatesUri
              ?: List(this@ServiceRequestSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@ServiceRequestSurrogate._instantiatesUri
                ?: List(this@ServiceRequestSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@ServiceRequestSurrogate.basedOn ?: mutableListOf(),
      replaces = this@ServiceRequestSurrogate.replaces ?: mutableListOf(),
      requisition = this@ServiceRequestSurrogate.requisition,
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.ServiceRequest.ServiceRequestStatus.fromCode(
            this@ServiceRequestSurrogate.status!!
          ),
          this@ServiceRequestSurrogate._status,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r4b.ServiceRequest.ServiceRequestIntent.fromCode(
            this@ServiceRequestSurrogate.intent!!
          ),
          this@ServiceRequestSurrogate._intent,
        ),
      category = this@ServiceRequestSurrogate.category ?: mutableListOf(),
      priority =
        this@ServiceRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.ServiceRequest.ServiceRequestPriority.fromCode(it!!),
            this@ServiceRequestSurrogate._priority,
          )
        },
      doNotPerform =
        R4bBoolean.of(
          this@ServiceRequestSurrogate.doNotPerform,
          this@ServiceRequestSurrogate._doNotPerform,
        ),
      code = this@ServiceRequestSurrogate.code,
      orderDetail = this@ServiceRequestSurrogate.orderDetail ?: mutableListOf(),
      quantity = this@ServiceRequestSurrogate.quantity,
      subject = this@ServiceRequestSurrogate.subject,
      encounter = this@ServiceRequestSurrogate.encounter,
      occurrence = this@ServiceRequestSurrogate.occurrence,
      asNeeded = this@ServiceRequestSurrogate.asNeeded,
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@ServiceRequestSurrogate.authoredOn),
          this@ServiceRequestSurrogate._authoredOn,
        ),
      requester = this@ServiceRequestSurrogate.requester,
      performerType = this@ServiceRequestSurrogate.performerType,
      performer = this@ServiceRequestSurrogate.performer ?: mutableListOf(),
      locationCode = this@ServiceRequestSurrogate.locationCode ?: mutableListOf(),
      locationReference = this@ServiceRequestSurrogate.locationReference ?: mutableListOf(),
      reasonCode = this@ServiceRequestSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@ServiceRequestSurrogate.reasonReference ?: mutableListOf(),
      insurance = this@ServiceRequestSurrogate.insurance ?: mutableListOf(),
      supportingInfo = this@ServiceRequestSurrogate.supportingInfo ?: mutableListOf(),
      specimen = this@ServiceRequestSurrogate.specimen ?: mutableListOf(),
      bodySite = this@ServiceRequestSurrogate.bodySite ?: mutableListOf(),
      note = this@ServiceRequestSurrogate.note ?: mutableListOf(),
      patientInstruction =
        R4bString.of(
          this@ServiceRequestSurrogate.patientInstruction,
          this@ServiceRequestSurrogate._patientInstruction,
        ),
      relevantHistory = this@ServiceRequestSurrogate.relevantHistory ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ServiceRequest): ServiceRequestSurrogate =
      with(model) {
        ServiceRequestSurrogate(
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
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          replaces = this@with.replaces.takeUnless { it.all { it == null } },
          requisition = this@with.requisition,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          code = this@with.code,
          orderDetail = this@with.orderDetail.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          subject = this@with.subject,
          encounter = this@with.encounter,
          occurrence = this@with.occurrence,
          asNeeded = this@with.asNeeded,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          performerType = this@with.performerType,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          locationCode = this@with.locationCode.takeUnless { it.all { it == null } },
          locationReference = this@with.locationReference.takeUnless { it.all { it == null } },
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          specimen = this@with.specimen.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          patientInstruction = this@with.patientInstruction?.value,
          _patientInstruction = this@with.patientInstruction?.toElement(),
          relevantHistory = this@with.relevantHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
