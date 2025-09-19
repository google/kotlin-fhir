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
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Communication
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CommunicationPayloadSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var content: Communication.Payload.Content,
) {
  public fun toModel(): Communication.Payload =
    Communication.Payload(
      id = this@CommunicationPayloadSurrogate.id,
      extension = this@CommunicationPayloadSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CommunicationPayloadSurrogate.modifierExtension ?: mutableListOf(),
      content = this@CommunicationPayloadSurrogate.content,
    )

  public companion object {
    public fun fromModel(model: Communication.Payload): CommunicationPayloadSurrogate =
      with(model) {
        CommunicationPayloadSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          content = this@with.content,
        )
      }
  }
}

@Serializable
internal data class CommunicationPayloadContentSurrogate(
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
  public var contentCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): Communication.Payload.Content =
    Communication.Payload.Content.from(
      this@CommunicationPayloadContentSurrogate.contentAttachment,
      this@CommunicationPayloadContentSurrogate.contentReference,
      this@CommunicationPayloadContentSurrogate.contentCodeableConcept,
    )!!

  public companion object {
    public fun fromModel(
      model: Communication.Payload.Content
    ): CommunicationPayloadContentSurrogate =
      with(model) {
        CommunicationPayloadContentSurrogate(
          contentAttachment = this@with.asAttachment()?.value,
          contentReference = this@with.asReference()?.value,
          contentCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class CommunicationSurrogate(
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
  public var partOf: MutableList<Reference>? = null,
  public var inResponseTo: MutableList<Reference>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var medium: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var topic: CodeableConcept? = null,
  public var about: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var sent: String? = null,
  public var _sent: Element? = null,
  public var received: String? = null,
  public var _received: Element? = null,
  public var recipient: MutableList<Reference>? = null,
  public var sender: Reference? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var payload: MutableList<Communication.Payload>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): Communication =
    Communication(
      id = this@CommunicationSurrogate.id,
      meta = this@CommunicationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@CommunicationSurrogate.implicitRules,
          this@CommunicationSurrogate._implicitRules,
        ),
      language =
        Code.of(this@CommunicationSurrogate.language, this@CommunicationSurrogate._language),
      text = this@CommunicationSurrogate.text,
      contained = this@CommunicationSurrogate.contained ?: mutableListOf(),
      extension = this@CommunicationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CommunicationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CommunicationSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@CommunicationSurrogate.instantiatesCanonical == null &&
            this@CommunicationSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@CommunicationSurrogate.instantiatesCanonical
              ?: List(this@CommunicationSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@CommunicationSurrogate._instantiatesCanonical
                ?: List(this@CommunicationSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@CommunicationSurrogate.instantiatesUri == null &&
            this@CommunicationSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@CommunicationSurrogate.instantiatesUri
              ?: List(this@CommunicationSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@CommunicationSurrogate._instantiatesUri
                ?: List(this@CommunicationSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@CommunicationSurrogate.basedOn ?: mutableListOf(),
      partOf = this@CommunicationSurrogate.partOf ?: mutableListOf(),
      inResponseTo = this@CommunicationSurrogate.inResponseTo ?: mutableListOf(),
      status =
        Enumeration.of(
          Communication.EventStatus.fromCode(this@CommunicationSurrogate.status!!),
          this@CommunicationSurrogate._status,
        ),
      statusReason = this@CommunicationSurrogate.statusReason,
      category = this@CommunicationSurrogate.category ?: mutableListOf(),
      priority =
        this@CommunicationSurrogate.priority?.let {
          Enumeration.of(
            Communication.RequestPriority.fromCode(it),
            this@CommunicationSurrogate._priority,
          )
        },
      medium = this@CommunicationSurrogate.medium ?: mutableListOf(),
      subject = this@CommunicationSurrogate.subject,
      topic = this@CommunicationSurrogate.topic,
      about = this@CommunicationSurrogate.about ?: mutableListOf(),
      encounter = this@CommunicationSurrogate.encounter,
      sent =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationSurrogate.sent),
          this@CommunicationSurrogate._sent,
        ),
      received =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationSurrogate.received),
          this@CommunicationSurrogate._received,
        ),
      recipient = this@CommunicationSurrogate.recipient ?: mutableListOf(),
      sender = this@CommunicationSurrogate.sender,
      reason = this@CommunicationSurrogate.reason ?: mutableListOf(),
      payload = this@CommunicationSurrogate.payload ?: mutableListOf(),
      note = this@CommunicationSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Communication): CommunicationSurrogate =
      with(model) {
        CommunicationSurrogate(
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
          basedOn = this@with.basedOn.takeIf { it.isNotEmpty() },
          partOf = this@with.partOf.takeIf { it.isNotEmpty() },
          inResponseTo = this@with.inResponseTo.takeIf { it.isNotEmpty() },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          category = this@with.category.takeIf { it.isNotEmpty() },
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          medium = this@with.medium.takeIf { it.isNotEmpty() },
          subject = this@with.subject,
          topic = this@with.topic,
          about = this@with.about.takeIf { it.isNotEmpty() },
          encounter = this@with.encounter,
          sent = this@with.sent?.value?.toString(),
          _sent = this@with.sent?.toElement(),
          received = this@with.received?.value?.toString(),
          _received = this@with.received?.toElement(),
          recipient = this@with.recipient.takeIf { it.isNotEmpty() },
          sender = this@with.sender,
          reason = this@with.reason.takeIf { it.isNotEmpty() },
          payload = this@with.payload.takeIf { it.isNotEmpty() },
          note = this@with.note.takeIf { it.isNotEmpty() },
        )
      }
  }
}
