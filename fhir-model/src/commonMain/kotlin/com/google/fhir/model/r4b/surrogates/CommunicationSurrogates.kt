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
import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Communication
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CommunicationPayloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var contentString: KotlinString? = null,
  public var _contentString: Element? = null,
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): Communication.Payload =
    Communication.Payload().apply {
      id = this@CommunicationPayloadSurrogate.id
      extension = this@CommunicationPayloadSurrogate.extension
      modifierExtension = this@CommunicationPayloadSurrogate.modifierExtension
      content =
        Communication.Payload.Content?.from(
          R4bString.of(
            this@CommunicationPayloadSurrogate.contentString,
            this@CommunicationPayloadSurrogate._contentString,
          ),
          this@CommunicationPayloadSurrogate.contentAttachment,
          this@CommunicationPayloadSurrogate.contentReference,
        )
    }

  public companion object {
    public fun fromModel(model: Communication.Payload): CommunicationPayloadSurrogate =
      with(model) {
        CommunicationPayloadSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          contentString = this@with.content?.asString()?.value?.value
          _contentString = this@with.content?.asString()?.value?.toElement()
          contentAttachment = this@with.content?.asAttachment()?.value
          contentReference = this@with.content?.asReference()?.value
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var inResponseTo: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var medium: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var topic: CodeableConcept? = null,
  public var about: List<Reference?>? = null,
  public var encounter: Reference? = null,
  public var sent: KotlinString? = null,
  public var _sent: Element? = null,
  public var received: KotlinString? = null,
  public var _received: Element? = null,
  public var recipient: List<Reference?>? = null,
  public var sender: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var payload: List<Communication.Payload>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): Communication =
    Communication().apply {
      id = this@CommunicationSurrogate.id
      meta = this@CommunicationSurrogate.meta
      implicitRules =
        Uri.of(
          this@CommunicationSurrogate.implicitRules,
          this@CommunicationSurrogate._implicitRules,
        )
      language =
        Code.of(this@CommunicationSurrogate.language, this@CommunicationSurrogate._language)
      text = this@CommunicationSurrogate.text
      contained = this@CommunicationSurrogate.contained
      extension = this@CommunicationSurrogate.extension
      modifierExtension = this@CommunicationSurrogate.modifierExtension
      identifier = this@CommunicationSurrogate.identifier
      instantiatesCanonical =
        if (
          this@CommunicationSurrogate.instantiatesCanonical == null &&
            this@CommunicationSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@CommunicationSurrogate.instantiatesCanonical
              ?: List(this@CommunicationSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@CommunicationSurrogate._instantiatesCanonical
                ?: List(this@CommunicationSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@CommunicationSurrogate.instantiatesUri == null &&
            this@CommunicationSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@CommunicationSurrogate.instantiatesUri
              ?: List(this@CommunicationSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@CommunicationSurrogate._instantiatesUri
                ?: List(this@CommunicationSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@CommunicationSurrogate.basedOn
      partOf = this@CommunicationSurrogate.partOf
      inResponseTo = this@CommunicationSurrogate.inResponseTo
      status =
        Enumeration.of(
          this@CommunicationSurrogate.status?.let {
            com.google.fhir.model.r4b.Communication.CommunicationStatus.fromCode(it)
          },
          this@CommunicationSurrogate._status,
        )
      statusReason = this@CommunicationSurrogate.statusReason
      category = this@CommunicationSurrogate.category
      priority =
        Enumeration.of(
          this@CommunicationSurrogate.priority?.let {
            com.google.fhir.model.r4b.Communication.CommunicationPriority.fromCode(it)
          },
          this@CommunicationSurrogate._priority,
        )
      medium = this@CommunicationSurrogate.medium
      subject = this@CommunicationSurrogate.subject
      topic = this@CommunicationSurrogate.topic
      about = this@CommunicationSurrogate.about
      encounter = this@CommunicationSurrogate.encounter
      sent =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationSurrogate.sent),
          this@CommunicationSurrogate._sent,
        )
      received =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationSurrogate.received),
          this@CommunicationSurrogate._received,
        )
      recipient = this@CommunicationSurrogate.recipient
      sender = this@CommunicationSurrogate.sender
      reasonCode = this@CommunicationSurrogate.reasonCode
      reasonReference = this@CommunicationSurrogate.reasonReference
      payload = this@CommunicationSurrogate.payload
      note = this@CommunicationSurrogate.note
    }

  public companion object {
    public fun fromModel(model: Communication): CommunicationSurrogate =
      with(model) {
        CommunicationSurrogate().apply {
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
          partOf = this@with.partOf
          inResponseTo = this@with.inResponseTo
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          medium = this@with.medium
          subject = this@with.subject
          topic = this@with.topic
          about = this@with.about
          encounter = this@with.encounter
          sent = this@with.sent?.value?.toString()
          _sent = this@with.sent?.toElement()
          received = this@with.received?.value?.toString()
          _received = this@with.received?.toElement()
          recipient = this@with.recipient
          sender = this@with.sender
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          payload = this@with.payload
          note = this@with.note
        }
      }
  }
}
