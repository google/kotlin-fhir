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
import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Communication
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CommunicationPayloadContentSurrogate(
  public var contentString: KotlinString? = null,
  public var _contentString: Element? = null,
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): Communication.Payload.Content =
    Communication.Payload.Content.from(
      R4String.of(
        this@CommunicationPayloadContentSurrogate.contentString,
        this@CommunicationPayloadContentSurrogate._contentString,
      ),
      this@CommunicationPayloadContentSurrogate.contentAttachment,
      this@CommunicationPayloadContentSurrogate.contentReference,
    )!!

  public companion object {
    public fun fromModel(
      model: Communication.Payload.Content
    ): CommunicationPayloadContentSurrogate =
      with(model) {
        CommunicationPayloadContentSurrogate(
          contentString = this@with.asString()?.value?.value,
          _contentString = this@with.asString()?.value?.toElement(),
          contentAttachment = this@with.asAttachment()?.value,
          contentReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class CommunicationPayloadSurrogate(
  public var id: KotlinString? = null,
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
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          content = this@with.content,
        )
      }
  }
}

@Serializable
internal data class CommunicationSurrogate(
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
  public var partOf: MutableList<Reference>? = null,
  public var inResponseTo: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var medium: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var topic: CodeableConcept? = null,
  public var about: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var sent: KotlinString? = null,
  public var _sent: Element? = null,
  public var received: KotlinString? = null,
  public var _received: Element? = null,
  public var recipient: MutableList<Reference>? = null,
  public var sender: Reference? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
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
          com.google.fhir.model.r4.Communication.CommunicationStatus.fromCode(
            this@CommunicationSurrogate.status!!
          ),
          this@CommunicationSurrogate._status,
        ),
      statusReason = this@CommunicationSurrogate.statusReason,
      category = this@CommunicationSurrogate.category ?: mutableListOf(),
      priority =
        this@CommunicationSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4.Communication.CommunicationPriority.fromCode(it!!),
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
      reasonCode = this@CommunicationSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@CommunicationSurrogate.reasonReference ?: mutableListOf(),
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
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          inResponseTo = this@with.inResponseTo.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          category = this@with.category.takeUnless { it.all { it == null } },
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          medium = this@with.medium.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          topic = this@with.topic,
          about = this@with.about.takeUnless { it.all { it == null } },
          encounter = this@with.encounter,
          sent = this@with.sent?.value?.toString(),
          _sent = this@with.sent?.toElement(),
          received = this@with.received?.value?.toString(),
          _received = this@with.received?.toElement(),
          recipient = this@with.recipient.takeUnless { it.all { it == null } },
          sender = this@with.sender,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          payload = this@with.payload.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
