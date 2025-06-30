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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ServiceRequestSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var replaces: List<Reference?>? = null,
  public var requisition: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var code: CodeableConcept? = null,
  public var orderDetail: List<CodeableConcept?>? = null,
  public var quantityQuantity: Quantity? = null,
  public var quantityRatio: Ratio? = null,
  public var quantityRange: Range? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var asNeededBoolean: KotlinBoolean? = null,
  public var _asNeededBoolean: Element? = null,
  public var asNeededCodeableConcept: CodeableConcept? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var performerType: CodeableConcept? = null,
  public var performer: List<Reference?>? = null,
  public var locationCode: List<CodeableConcept?>? = null,
  public var locationReference: List<Reference?>? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var insurance: List<Reference?>? = null,
  public var supportingInfo: List<Reference?>? = null,
  public var specimen: List<Reference?>? = null,
  public var bodySite: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
  public var patientInstruction: KotlinString? = null,
  public var _patientInstruction: Element? = null,
  public var relevantHistory: List<Reference?>? = null,
) {
  public fun toModel(): ServiceRequest =
    ServiceRequest().apply {
      id = this@ServiceRequestSurrogate.id
      meta = this@ServiceRequestSurrogate.meta
      implicitRules =
        Uri.of(
          this@ServiceRequestSurrogate.implicitRules,
          this@ServiceRequestSurrogate._implicitRules,
        )
      language =
        Code.of(this@ServiceRequestSurrogate.language, this@ServiceRequestSurrogate._language)
      text = this@ServiceRequestSurrogate.text
      contained = this@ServiceRequestSurrogate.contained
      extension = this@ServiceRequestSurrogate.extension
      modifierExtension = this@ServiceRequestSurrogate.modifierExtension
      identifier = this@ServiceRequestSurrogate.identifier
      instantiatesCanonical =
        if (
          this@ServiceRequestSurrogate.instantiatesCanonical == null &&
            this@ServiceRequestSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@ServiceRequestSurrogate.instantiatesCanonical
              ?: List(this@ServiceRequestSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@ServiceRequestSurrogate._instantiatesCanonical
                ?: List(this@ServiceRequestSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@ServiceRequestSurrogate.instantiatesUri == null &&
            this@ServiceRequestSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@ServiceRequestSurrogate.instantiatesUri
              ?: List(this@ServiceRequestSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@ServiceRequestSurrogate._instantiatesUri
                ?: List(this@ServiceRequestSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@ServiceRequestSurrogate.basedOn
      replaces = this@ServiceRequestSurrogate.replaces
      requisition = this@ServiceRequestSurrogate.requisition
      status =
        Enumeration.of(
          this@ServiceRequestSurrogate.status?.let {
            com.google.fhir.model.r4b.ServiceRequest.ServiceRequestStatus.fromCode(it)
          },
          this@ServiceRequestSurrogate._status,
        )
      intent =
        Enumeration.of(
          this@ServiceRequestSurrogate.intent?.let {
            com.google.fhir.model.r4b.ServiceRequest.ServiceRequestIntent.fromCode(it)
          },
          this@ServiceRequestSurrogate._intent,
        )
      category = this@ServiceRequestSurrogate.category
      priority =
        Enumeration.of(
          this@ServiceRequestSurrogate.priority?.let {
            com.google.fhir.model.r4b.ServiceRequest.ServiceRequestPriority.fromCode(it)
          },
          this@ServiceRequestSurrogate._priority,
        )
      doNotPerform =
        R4bBoolean.of(
          this@ServiceRequestSurrogate.doNotPerform,
          this@ServiceRequestSurrogate._doNotPerform,
        )
      code = this@ServiceRequestSurrogate.code
      orderDetail = this@ServiceRequestSurrogate.orderDetail
      quantity =
        ServiceRequest.Quantity?.from(
          this@ServiceRequestSurrogate.quantityQuantity,
          this@ServiceRequestSurrogate.quantityRatio,
          this@ServiceRequestSurrogate.quantityRange,
        )
      subject = this@ServiceRequestSurrogate.subject
      encounter = this@ServiceRequestSurrogate.encounter
      occurrence =
        ServiceRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ServiceRequestSurrogate.occurrenceDateTime),
            this@ServiceRequestSurrogate._occurrenceDateTime,
          ),
          this@ServiceRequestSurrogate.occurrencePeriod,
          this@ServiceRequestSurrogate.occurrenceTiming,
        )
      asNeeded =
        ServiceRequest.AsNeeded?.from(
          R4bBoolean.of(
            this@ServiceRequestSurrogate.asNeededBoolean,
            this@ServiceRequestSurrogate._asNeededBoolean,
          ),
          this@ServiceRequestSurrogate.asNeededCodeableConcept,
        )
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@ServiceRequestSurrogate.authoredOn),
          this@ServiceRequestSurrogate._authoredOn,
        )
      requester = this@ServiceRequestSurrogate.requester
      performerType = this@ServiceRequestSurrogate.performerType
      performer = this@ServiceRequestSurrogate.performer
      locationCode = this@ServiceRequestSurrogate.locationCode
      locationReference = this@ServiceRequestSurrogate.locationReference
      reasonCode = this@ServiceRequestSurrogate.reasonCode
      reasonReference = this@ServiceRequestSurrogate.reasonReference
      insurance = this@ServiceRequestSurrogate.insurance
      supportingInfo = this@ServiceRequestSurrogate.supportingInfo
      specimen = this@ServiceRequestSurrogate.specimen
      bodySite = this@ServiceRequestSurrogate.bodySite
      note = this@ServiceRequestSurrogate.note
      patientInstruction =
        R4bString.of(
          this@ServiceRequestSurrogate.patientInstruction,
          this@ServiceRequestSurrogate._patientInstruction,
        )
      relevantHistory = this@ServiceRequestSurrogate.relevantHistory
    }

  public companion object {
    public fun fromModel(model: ServiceRequest): ServiceRequestSurrogate =
      with(model) {
        ServiceRequestSurrogate().apply {
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
          instantiatesCanonical =
            this@with.instantiatesCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          instantiatesUri =
            this@with.instantiatesUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesUri =
            this@with.instantiatesUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          basedOn = this@with.basedOn
          replaces = this@with.replaces
          requisition = this@with.requisition
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          category = this@with.category
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          doNotPerform = this@with.doNotPerform?.value
          _doNotPerform = this@with.doNotPerform?.toElement()
          code = this@with.code
          orderDetail = this@with.orderDetail
          quantityQuantity = this@with.quantity?.asQuantity()?.value
          quantityRatio = this@with.quantity?.asRatio()?.value
          quantityRange = this@with.quantity?.asRange()?.value
          subject = this@with.subject
          encounter = this@with.encounter
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          occurrenceTiming = this@with.occurrence?.asTiming()?.value
          asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.value
          _asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.toElement()
          asNeededCodeableConcept = this@with.asNeeded?.asCodeableConcept()?.value
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          requester = this@with.requester
          performerType = this@with.performerType
          performer = this@with.performer
          locationCode = this@with.locationCode
          locationReference = this@with.locationReference
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          insurance = this@with.insurance
          supportingInfo = this@with.supportingInfo
          specimen = this@with.specimen
          bodySite = this@with.bodySite
          note = this@with.note
          patientInstruction = this@with.patientInstruction?.value
          _patientInstruction = this@with.patientInstruction?.toElement()
          relevantHistory = this@with.relevantHistory
        }
      }
  }
}
