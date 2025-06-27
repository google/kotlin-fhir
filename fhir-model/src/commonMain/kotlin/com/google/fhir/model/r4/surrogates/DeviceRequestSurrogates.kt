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
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.DeviceRequest
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceRequestParameterSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
) {
  public fun toModel(): DeviceRequest.Parameter =
    DeviceRequest.Parameter().apply {
      id = this@DeviceRequestParameterSurrogate.id
      extension = this@DeviceRequestParameterSurrogate.extension
      modifierExtension = this@DeviceRequestParameterSurrogate.modifierExtension
      code = this@DeviceRequestParameterSurrogate.code
      `value` =
        DeviceRequest.Parameter.Value?.from(
          this@DeviceRequestParameterSurrogate.valueCodeableConcept,
          this@DeviceRequestParameterSurrogate.valueQuantity,
          this@DeviceRequestParameterSurrogate.valueRange,
          R4Boolean.of(
            this@DeviceRequestParameterSurrogate.valueBoolean,
            this@DeviceRequestParameterSurrogate._valueBoolean,
          ),
        )
    }

  public companion object {
    public fun fromModel(model: DeviceRequest.Parameter): DeviceRequestParameterSurrogate =
      with(model) {
        DeviceRequestParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class DeviceRequestSurrogate(
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
  public var instantiatesCanonical: List<String?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<String?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var priorRequest: List<Reference?>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var intent: String? = null,
  public var _intent: Element? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var codeReference: Reference? = null,
  public var codeCodeableConcept: CodeableConcept? = null,
  public var parameter: List<DeviceRequest.Parameter>? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var performerType: CodeableConcept? = null,
  public var performer: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var insurance: List<Reference?>? = null,
  public var supportingInfo: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var relevantHistory: List<Reference?>? = null,
) {
  public fun toModel(): DeviceRequest =
    DeviceRequest().apply {
      id = this@DeviceRequestSurrogate.id
      meta = this@DeviceRequestSurrogate.meta
      implicitRules =
        Uri.of(
          this@DeviceRequestSurrogate.implicitRules,
          this@DeviceRequestSurrogate._implicitRules,
        )
      language =
        Code.of(this@DeviceRequestSurrogate.language, this@DeviceRequestSurrogate._language)
      text = this@DeviceRequestSurrogate.text
      contained = this@DeviceRequestSurrogate.contained
      extension = this@DeviceRequestSurrogate.extension
      modifierExtension = this@DeviceRequestSurrogate.modifierExtension
      identifier = this@DeviceRequestSurrogate.identifier
      instantiatesCanonical =
        if (
          this@DeviceRequestSurrogate.instantiatesCanonical == null &&
            this@DeviceRequestSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@DeviceRequestSurrogate.instantiatesCanonical
              ?: List(this@DeviceRequestSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@DeviceRequestSurrogate._instantiatesCanonical
                ?: List(this@DeviceRequestSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@DeviceRequestSurrogate.instantiatesUri == null &&
            this@DeviceRequestSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@DeviceRequestSurrogate.instantiatesUri
              ?: List(this@DeviceRequestSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@DeviceRequestSurrogate._instantiatesUri
                ?: List(this@DeviceRequestSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@DeviceRequestSurrogate.basedOn
      priorRequest = this@DeviceRequestSurrogate.priorRequest
      groupIdentifier = this@DeviceRequestSurrogate.groupIdentifier
      status =
        Enumeration.of(
          this@DeviceRequestSurrogate.status?.let {
            com.google.fhir.model.r4.DeviceRequest.DeviceRequestStatus.fromCode(it)
          },
          this@DeviceRequestSurrogate._status,
        )
      intent =
        Enumeration.of(
          this@DeviceRequestSurrogate.intent?.let {
            com.google.fhir.model.r4.DeviceRequest.RequestIntent.fromCode(it)
          },
          this@DeviceRequestSurrogate._intent,
        )
      priority =
        Enumeration.of(
          this@DeviceRequestSurrogate.priority?.let {
            com.google.fhir.model.r4.DeviceRequest.RequestPriority.fromCode(it)
          },
          this@DeviceRequestSurrogate._priority,
        )
      code =
        DeviceRequest.Code?.from(
          this@DeviceRequestSurrogate.codeReference,
          this@DeviceRequestSurrogate.codeCodeableConcept,
        )
      parameter = this@DeviceRequestSurrogate.parameter
      subject = this@DeviceRequestSurrogate.subject
      encounter = this@DeviceRequestSurrogate.encounter
      occurrence =
        DeviceRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@DeviceRequestSurrogate.occurrenceDateTime),
            this@DeviceRequestSurrogate._occurrenceDateTime,
          ),
          this@DeviceRequestSurrogate.occurrencePeriod,
          this@DeviceRequestSurrogate.occurrenceTiming,
        )
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceRequestSurrogate.authoredOn),
          this@DeviceRequestSurrogate._authoredOn,
        )
      requester = this@DeviceRequestSurrogate.requester
      performerType = this@DeviceRequestSurrogate.performerType
      performer = this@DeviceRequestSurrogate.performer
      reasonCode = this@DeviceRequestSurrogate.reasonCode
      reasonReference = this@DeviceRequestSurrogate.reasonReference
      insurance = this@DeviceRequestSurrogate.insurance
      supportingInfo = this@DeviceRequestSurrogate.supportingInfo
      note = this@DeviceRequestSurrogate.note
      relevantHistory = this@DeviceRequestSurrogate.relevantHistory
    }

  public companion object {
    public fun fromModel(model: DeviceRequest): DeviceRequestSurrogate =
      with(model) {
        DeviceRequestSurrogate().apply {
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
          priorRequest = this@with.priorRequest
          groupIdentifier = this@with.groupIdentifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          codeReference = this@with.code?.asReference()?.value
          codeCodeableConcept = this@with.code?.asCodeableConcept()?.value
          parameter = this@with.parameter
          subject = this@with.subject
          encounter = this@with.encounter
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          occurrenceTiming = this@with.occurrence?.asTiming()?.value
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          requester = this@with.requester
          performerType = this@with.performerType
          performer = this@with.performer
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          insurance = this@with.insurance
          supportingInfo = this@with.supportingInfo
          note = this@with.note
          relevantHistory = this@with.relevantHistory
        }
      }
  }
}
