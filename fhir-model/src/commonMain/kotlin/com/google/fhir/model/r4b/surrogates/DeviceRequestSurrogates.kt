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
import com.google.fhir.model.r4b.DeviceRequest
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
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceRequestParameterValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
) {
  public fun toModel(): DeviceRequest.Parameter.Value =
    DeviceRequest.Parameter.Value?.from(
      this@DeviceRequestParameterValueSurrogate.valueCodeableConcept,
      this@DeviceRequestParameterValueSurrogate.valueQuantity,
      this@DeviceRequestParameterValueSurrogate.valueRange,
      R4bBoolean.of(
        this@DeviceRequestParameterValueSurrogate.valueBoolean,
        this@DeviceRequestParameterValueSurrogate._valueBoolean,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: DeviceRequest.Parameter.Value
    ): DeviceRequestParameterValueSurrogate =
      with(model) {
        DeviceRequestParameterValueSurrogate(
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueQuantity = this@with.asQuantity()?.value,
          valueRange = this@with.asRange()?.value,
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceRequestParameterSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept? = null,
  public var `value`: DeviceRequest.Parameter.Value? = null,
) {
  public fun toModel(): DeviceRequest.Parameter =
    DeviceRequest.Parameter(
      id = this@DeviceRequestParameterSurrogate.id,
      extension = this@DeviceRequestParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceRequestParameterSurrogate.modifierExtension ?: mutableListOf(),
      code = this@DeviceRequestParameterSurrogate.code,
      `value` = this@DeviceRequestParameterSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: DeviceRequest.Parameter): DeviceRequestParameterSurrogate =
      with(model) {
        DeviceRequestParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class DeviceRequestCodeSurrogate(
  public var codeReference: Reference? = null,
  public var codeCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): DeviceRequest.Code =
    DeviceRequest.Code.from(
      this@DeviceRequestCodeSurrogate.codeReference,
      this@DeviceRequestCodeSurrogate.codeCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(model: DeviceRequest.Code): DeviceRequestCodeSurrogate =
      with(model) {
        DeviceRequestCodeSurrogate(
          codeReference = this@with.asReference()?.value,
          codeCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class DeviceRequestOccurrenceSurrogate(
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
) {
  public fun toModel(): DeviceRequest.Occurrence =
    DeviceRequest.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@DeviceRequestOccurrenceSurrogate.occurrenceDateTime),
        this@DeviceRequestOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@DeviceRequestOccurrenceSurrogate.occurrencePeriod,
      this@DeviceRequestOccurrenceSurrogate.occurrenceTiming,
    )!!

  public companion object {
    public fun fromModel(model: DeviceRequest.Occurrence): DeviceRequestOccurrenceSurrogate =
      with(model) {
        DeviceRequestOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiatesCanonical: MutableList<String?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<String?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var priorRequest: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var intent: String? = null,
  public var _intent: Element? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var code: DeviceRequest.Code,
  public var parameter: MutableList<DeviceRequest.Parameter>? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var occurrence: DeviceRequest.Occurrence? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var performerType: CodeableConcept? = null,
  public var performer: Reference? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var insurance: MutableList<Reference>? = null,
  public var supportingInfo: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var relevantHistory: MutableList<Reference>? = null,
) {
  public fun toModel(): DeviceRequest =
    DeviceRequest(
      id = this@DeviceRequestSurrogate.id,
      meta = this@DeviceRequestSurrogate.meta,
      implicitRules =
        Uri.of(
          this@DeviceRequestSurrogate.implicitRules,
          this@DeviceRequestSurrogate._implicitRules,
        ),
      language =
        Code.of(this@DeviceRequestSurrogate.language, this@DeviceRequestSurrogate._language),
      text = this@DeviceRequestSurrogate.text,
      contained = this@DeviceRequestSurrogate.contained ?: mutableListOf(),
      extension = this@DeviceRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceRequestSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DeviceRequestSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@DeviceRequestSurrogate.instantiatesCanonical == null &&
            this@DeviceRequestSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@DeviceRequestSurrogate.instantiatesCanonical
              ?: List(this@DeviceRequestSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@DeviceRequestSurrogate._instantiatesCanonical
                ?: List(this@DeviceRequestSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@DeviceRequestSurrogate.instantiatesUri == null &&
            this@DeviceRequestSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@DeviceRequestSurrogate.instantiatesUri
              ?: List(this@DeviceRequestSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@DeviceRequestSurrogate._instantiatesUri
                ?: List(this@DeviceRequestSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@DeviceRequestSurrogate.basedOn ?: mutableListOf(),
      priorRequest = this@DeviceRequestSurrogate.priorRequest ?: mutableListOf(),
      groupIdentifier = this@DeviceRequestSurrogate.groupIdentifier,
      status =
        this@DeviceRequestSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.DeviceRequest.RequestStatus.fromCode(it!!),
            this@DeviceRequestSurrogate._status,
          )
        },
      intent =
        Enumeration.of(
          com.google.fhir.model.r4b.DeviceRequest.RequestIntent.fromCode(
            this@DeviceRequestSurrogate.intent!!
          ),
          this@DeviceRequestSurrogate._intent,
        ),
      priority =
        this@DeviceRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.DeviceRequest.RequestPriority.fromCode(it!!),
            this@DeviceRequestSurrogate._priority,
          )
        },
      code = this@DeviceRequestSurrogate.code,
      parameter = this@DeviceRequestSurrogate.parameter ?: mutableListOf(),
      subject = this@DeviceRequestSurrogate.subject,
      encounter = this@DeviceRequestSurrogate.encounter,
      occurrence = this@DeviceRequestSurrogate.occurrence,
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceRequestSurrogate.authoredOn),
          this@DeviceRequestSurrogate._authoredOn,
        ),
      requester = this@DeviceRequestSurrogate.requester,
      performerType = this@DeviceRequestSurrogate.performerType,
      performer = this@DeviceRequestSurrogate.performer,
      reasonCode = this@DeviceRequestSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@DeviceRequestSurrogate.reasonReference ?: mutableListOf(),
      insurance = this@DeviceRequestSurrogate.insurance ?: mutableListOf(),
      supportingInfo = this@DeviceRequestSurrogate.supportingInfo ?: mutableListOf(),
      note = this@DeviceRequestSurrogate.note ?: mutableListOf(),
      relevantHistory = this@DeviceRequestSurrogate.relevantHistory ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceRequest): DeviceRequestSurrogate =
      with(model) {
        DeviceRequestSurrogate(
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
          priorRequest = this@with.priorRequest.takeUnless { it.all { it == null } },
          groupIdentifier = this@with.groupIdentifier,
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          code = this@with.code,
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          encounter = this@with.encounter,
          occurrence = this@with.occurrence,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          performerType = this@with.performerType,
          performer = this@with.performer,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          relevantHistory = this@with.relevantHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
