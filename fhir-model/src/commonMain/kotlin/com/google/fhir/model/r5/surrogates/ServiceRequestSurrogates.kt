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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.ServiceRequest
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ServiceRequestOrderDetailParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var valueQuantity: Quantity? = null,
  public var valueRatio: Ratio? = null,
  public var valueRange: Range? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valuePeriod: Period? = null,
) {
  public fun toModel(): ServiceRequest.OrderDetail.Parameter =
    ServiceRequest.OrderDetail.Parameter(
      id = this@ServiceRequestOrderDetailParameterSurrogate.id,
      extension = this@ServiceRequestOrderDetailParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ServiceRequestOrderDetailParameterSurrogate.modifierExtension ?: mutableListOf(),
      code = this@ServiceRequestOrderDetailParameterSurrogate.code,
      `value` =
        ServiceRequest.OrderDetail.Parameter.Value.from(
          this@ServiceRequestOrderDetailParameterSurrogate.valueQuantity,
          this@ServiceRequestOrderDetailParameterSurrogate.valueRatio,
          this@ServiceRequestOrderDetailParameterSurrogate.valueRange,
          R5Boolean.of(
            this@ServiceRequestOrderDetailParameterSurrogate.valueBoolean,
            this@ServiceRequestOrderDetailParameterSurrogate._valueBoolean,
          ),
          this@ServiceRequestOrderDetailParameterSurrogate.valueCodeableConcept,
          R5String.of(
            this@ServiceRequestOrderDetailParameterSurrogate.valueString,
            this@ServiceRequestOrderDetailParameterSurrogate._valueString,
          ),
          this@ServiceRequestOrderDetailParameterSurrogate.valuePeriod,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ServiceRequest.OrderDetail.Parameter
    ): ServiceRequestOrderDetailParameterSurrogate =
      with(model) {
        ServiceRequestOrderDetailParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueRatio = this@with.`value`?.asRatio()?.value,
          valueRange = this@with.`value`?.asRange()?.value,
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valuePeriod = this@with.`value`?.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class ServiceRequestOrderDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var parameterFocus: CodeableReference? = null,
  public var parameter: MutableList<ServiceRequest.OrderDetail.Parameter>? = null,
) {
  public fun toModel(): ServiceRequest.OrderDetail =
    ServiceRequest.OrderDetail(
      id = this@ServiceRequestOrderDetailSurrogate.id,
      extension = this@ServiceRequestOrderDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ServiceRequestOrderDetailSurrogate.modifierExtension ?: mutableListOf(),
      parameterFocus = this@ServiceRequestOrderDetailSurrogate.parameterFocus,
      parameter = this@ServiceRequestOrderDetailSurrogate.parameter ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ServiceRequest.OrderDetail): ServiceRequestOrderDetailSurrogate =
      with(model) {
        ServiceRequestOrderDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          parameterFocus = this@with.parameterFocus,
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ServiceRequestPatientInstructionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var instructionMarkdown: KotlinString? = null,
  public var _instructionMarkdown: Element? = null,
  public var instructionReference: Reference? = null,
) {
  public fun toModel(): ServiceRequest.PatientInstruction =
    ServiceRequest.PatientInstruction(
      id = this@ServiceRequestPatientInstructionSurrogate.id,
      extension = this@ServiceRequestPatientInstructionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ServiceRequestPatientInstructionSurrogate.modifierExtension ?: mutableListOf(),
      instruction =
        ServiceRequest.PatientInstruction.Instruction?.from(
          Markdown.of(
            this@ServiceRequestPatientInstructionSurrogate.instructionMarkdown,
            this@ServiceRequestPatientInstructionSurrogate._instructionMarkdown,
          ),
          this@ServiceRequestPatientInstructionSurrogate.instructionReference,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ServiceRequest.PatientInstruction
    ): ServiceRequestPatientInstructionSurrogate =
      with(model) {
        ServiceRequestPatientInstructionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          instructionMarkdown = this@with.instruction?.asMarkdown()?.value?.value,
          _instructionMarkdown = this@with.instruction?.asMarkdown()?.value?.toElement(),
          instructionReference = this@with.instruction?.asReference()?.value,
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
  public var code: CodeableReference? = null,
  public var orderDetail: MutableList<ServiceRequest.OrderDetail>? = null,
  public var quantityQuantity: Quantity? = null,
  public var quantityRatio: Ratio? = null,
  public var quantityRange: Range? = null,
  public var subject: Reference,
  public var focus: MutableList<Reference>? = null,
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
  public var performer: MutableList<Reference>? = null,
  public var location: MutableList<CodeableReference>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var insurance: MutableList<Reference>? = null,
  public var supportingInfo: MutableList<CodeableReference>? = null,
  public var specimen: MutableList<Reference>? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var bodyStructure: Reference? = null,
  public var note: MutableList<Annotation>? = null,
  public var patientInstruction: MutableList<ServiceRequest.PatientInstruction>? = null,
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
          com.google.fhir.model.r5.ServiceRequest.ServiceRequestStatus.fromCode(
            this@ServiceRequestSurrogate.status!!
          ),
          this@ServiceRequestSurrogate._status,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.ServiceRequest.ServiceRequestIntent.fromCode(
            this@ServiceRequestSurrogate.intent!!
          ),
          this@ServiceRequestSurrogate._intent,
        ),
      category = this@ServiceRequestSurrogate.category ?: mutableListOf(),
      priority =
        this@ServiceRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ServiceRequest.ServiceRequestPriority.fromCode(it!!),
            this@ServiceRequestSurrogate._priority,
          )
        },
      doNotPerform =
        R5Boolean.of(
          this@ServiceRequestSurrogate.doNotPerform,
          this@ServiceRequestSurrogate._doNotPerform,
        ),
      code = this@ServiceRequestSurrogate.code,
      orderDetail = this@ServiceRequestSurrogate.orderDetail ?: mutableListOf(),
      quantity =
        ServiceRequest.Quantity?.from(
          this@ServiceRequestSurrogate.quantityQuantity,
          this@ServiceRequestSurrogate.quantityRatio,
          this@ServiceRequestSurrogate.quantityRange,
        ),
      subject = this@ServiceRequestSurrogate.subject,
      focus = this@ServiceRequestSurrogate.focus ?: mutableListOf(),
      encounter = this@ServiceRequestSurrogate.encounter,
      occurrence =
        ServiceRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ServiceRequestSurrogate.occurrenceDateTime),
            this@ServiceRequestSurrogate._occurrenceDateTime,
          ),
          this@ServiceRequestSurrogate.occurrencePeriod,
          this@ServiceRequestSurrogate.occurrenceTiming,
        ),
      asNeeded =
        ServiceRequest.AsNeeded?.from(
          R5Boolean.of(
            this@ServiceRequestSurrogate.asNeededBoolean,
            this@ServiceRequestSurrogate._asNeededBoolean,
          ),
          this@ServiceRequestSurrogate.asNeededCodeableConcept,
        ),
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@ServiceRequestSurrogate.authoredOn),
          this@ServiceRequestSurrogate._authoredOn,
        ),
      requester = this@ServiceRequestSurrogate.requester,
      performerType = this@ServiceRequestSurrogate.performerType,
      performer = this@ServiceRequestSurrogate.performer ?: mutableListOf(),
      location = this@ServiceRequestSurrogate.location ?: mutableListOf(),
      reason = this@ServiceRequestSurrogate.reason ?: mutableListOf(),
      insurance = this@ServiceRequestSurrogate.insurance ?: mutableListOf(),
      supportingInfo = this@ServiceRequestSurrogate.supportingInfo ?: mutableListOf(),
      specimen = this@ServiceRequestSurrogate.specimen ?: mutableListOf(),
      bodySite = this@ServiceRequestSurrogate.bodySite ?: mutableListOf(),
      bodyStructure = this@ServiceRequestSurrogate.bodyStructure,
      note = this@ServiceRequestSurrogate.note ?: mutableListOf(),
      patientInstruction = this@ServiceRequestSurrogate.patientInstruction ?: mutableListOf(),
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
          quantityQuantity = this@with.quantity?.asQuantity()?.value,
          quantityRatio = this@with.quantity?.asRatio()?.value,
          quantityRange = this@with.quantity?.asRange()?.value,
          subject = this@with.subject,
          focus = this@with.focus.takeUnless { it.all { it == null } },
          encounter = this@with.encounter,
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value,
          occurrenceTiming = this@with.occurrence?.asTiming()?.value,
          asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.value,
          _asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.toElement(),
          asNeededCodeableConcept = this@with.asNeeded?.asCodeableConcept()?.value,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          performerType = this@with.performerType,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          location = this@with.location.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          specimen = this@with.specimen.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          bodyStructure = this@with.bodyStructure,
          note = this@with.note.takeUnless { it.all { it == null } },
          patientInstruction = this@with.patientInstruction.takeUnless { it.all { it == null } },
          relevantHistory = this@with.relevantHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
