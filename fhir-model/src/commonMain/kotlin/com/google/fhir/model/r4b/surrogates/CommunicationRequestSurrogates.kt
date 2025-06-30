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
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.CommunicationRequest
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
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
internal data class CommunicationRequestPayloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var contentString: KotlinString? = null,
  public var _contentString: Element? = null,
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): CommunicationRequest.Payload =
    CommunicationRequest.Payload().apply {
      id = this@CommunicationRequestPayloadSurrogate.id
      extension = this@CommunicationRequestPayloadSurrogate.extension
      modifierExtension = this@CommunicationRequestPayloadSurrogate.modifierExtension
      content =
        CommunicationRequest.Payload.Content?.from(
          R4bString.of(
            this@CommunicationRequestPayloadSurrogate.contentString,
            this@CommunicationRequestPayloadSurrogate._contentString,
          ),
          this@CommunicationRequestPayloadSurrogate.contentAttachment,
          this@CommunicationRequestPayloadSurrogate.contentReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: CommunicationRequest.Payload
    ): CommunicationRequestPayloadSurrogate =
      with(model) {
        CommunicationRequestPayloadSurrogate().apply {
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
internal data class CommunicationRequestSurrogate(
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
  public var basedOn: List<Reference?>? = null,
  public var replaces: List<Reference?>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var medium: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var about: List<Reference?>? = null,
  public var encounter: Reference? = null,
  public var payload: List<CommunicationRequest.Payload>? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var recipient: List<Reference?>? = null,
  public var sender: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): CommunicationRequest =
    CommunicationRequest().apply {
      id = this@CommunicationRequestSurrogate.id
      meta = this@CommunicationRequestSurrogate.meta
      implicitRules =
        Uri.of(
          this@CommunicationRequestSurrogate.implicitRules,
          this@CommunicationRequestSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@CommunicationRequestSurrogate.language,
          this@CommunicationRequestSurrogate._language,
        )
      text = this@CommunicationRequestSurrogate.text
      contained = this@CommunicationRequestSurrogate.contained
      extension = this@CommunicationRequestSurrogate.extension
      modifierExtension = this@CommunicationRequestSurrogate.modifierExtension
      identifier = this@CommunicationRequestSurrogate.identifier
      basedOn = this@CommunicationRequestSurrogate.basedOn
      replaces = this@CommunicationRequestSurrogate.replaces
      groupIdentifier = this@CommunicationRequestSurrogate.groupIdentifier
      status =
        Enumeration.of(
          this@CommunicationRequestSurrogate.status?.let {
            com.google.fhir.model.r4b.CommunicationRequest.CommunicationRequestStatus.fromCode(it)
          },
          this@CommunicationRequestSurrogate._status,
        )
      statusReason = this@CommunicationRequestSurrogate.statusReason
      category = this@CommunicationRequestSurrogate.category
      priority =
        Enumeration.of(
          this@CommunicationRequestSurrogate.priority?.let {
            com.google.fhir.model.r4b.CommunicationRequest.CommunicationPriority.fromCode(it)
          },
          this@CommunicationRequestSurrogate._priority,
        )
      doNotPerform =
        R4bBoolean.of(
          this@CommunicationRequestSurrogate.doNotPerform,
          this@CommunicationRequestSurrogate._doNotPerform,
        )
      medium = this@CommunicationRequestSurrogate.medium
      subject = this@CommunicationRequestSurrogate.subject
      about = this@CommunicationRequestSurrogate.about
      encounter = this@CommunicationRequestSurrogate.encounter
      payload = this@CommunicationRequestSurrogate.payload
      occurrence =
        CommunicationRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@CommunicationRequestSurrogate.occurrenceDateTime),
            this@CommunicationRequestSurrogate._occurrenceDateTime,
          ),
          this@CommunicationRequestSurrogate.occurrencePeriod,
        )
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationRequestSurrogate.authoredOn),
          this@CommunicationRequestSurrogate._authoredOn,
        )
      requester = this@CommunicationRequestSurrogate.requester
      recipient = this@CommunicationRequestSurrogate.recipient
      sender = this@CommunicationRequestSurrogate.sender
      reasonCode = this@CommunicationRequestSurrogate.reasonCode
      reasonReference = this@CommunicationRequestSurrogate.reasonReference
      note = this@CommunicationRequestSurrogate.note
    }

  public companion object {
    public fun fromModel(model: CommunicationRequest): CommunicationRequestSurrogate =
      with(model) {
        CommunicationRequestSurrogate().apply {
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
          basedOn = this@with.basedOn
          replaces = this@with.replaces
          groupIdentifier = this@with.groupIdentifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          doNotPerform = this@with.doNotPerform?.value
          _doNotPerform = this@with.doNotPerform?.toElement()
          medium = this@with.medium
          subject = this@with.subject
          about = this@with.about
          encounter = this@with.encounter
          payload = this@with.payload
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          requester = this@with.requester
          recipient = this@with.recipient
          sender = this@with.sender
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          note = this@with.note
        }
      }
  }
}
