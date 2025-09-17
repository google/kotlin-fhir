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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.CommunicationRequest
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CommunicationRequestPayloadSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var content: CommunicationRequest.Payload.Content,
) {
  public fun toModel(): CommunicationRequest.Payload =
    CommunicationRequest.Payload(
      id = this@CommunicationRequestPayloadSurrogate.id,
      extension = this@CommunicationRequestPayloadSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CommunicationRequestPayloadSurrogate.modifierExtension ?: mutableListOf(),
      content = this@CommunicationRequestPayloadSurrogate.content,
    )

  public companion object {
    public fun fromModel(
      model: CommunicationRequest.Payload
    ): CommunicationRequestPayloadSurrogate =
      with(model) {
        CommunicationRequestPayloadSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          content = this@with.content,
        )
      }
  }
}

@Serializable
internal data class CommunicationRequestPayloadContentSurrogate(
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
  public var contentCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): CommunicationRequest.Payload.Content =
    CommunicationRequest.Payload.Content.from(
      this@CommunicationRequestPayloadContentSurrogate.contentAttachment,
      this@CommunicationRequestPayloadContentSurrogate.contentReference,
      this@CommunicationRequestPayloadContentSurrogate.contentCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: CommunicationRequest.Payload.Content
    ): CommunicationRequestPayloadContentSurrogate =
      with(model) {
        CommunicationRequestPayloadContentSurrogate(
          contentAttachment = this@with.asAttachment()?.value,
          contentReference = this@with.asReference()?.value,
          contentCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class CommunicationRequestOccurrenceSurrogate(
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
) {
  public fun toModel(): CommunicationRequest.Occurrence =
    CommunicationRequest.Occurrence.from(
      DateTime.of(
        FhirDateTime.fromString(this@CommunicationRequestOccurrenceSurrogate.occurrenceDateTime),
        this@CommunicationRequestOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@CommunicationRequestOccurrenceSurrogate.occurrencePeriod,
    )!!

  public companion object {
    public fun fromModel(
      model: CommunicationRequest.Occurrence
    ): CommunicationRequestOccurrenceSurrogate =
      with(model) {
        CommunicationRequestOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class CommunicationRequestSurrogate(
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
  public var basedOn: MutableList<Reference>? = null,
  public var replaces: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var intent: String? = null,
  public var _intent: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var medium: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var about: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var payload: MutableList<CommunicationRequest.Payload>? = null,
  public var occurrence: CommunicationRequest.Occurrence? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var recipient: MutableList<Reference>? = null,
  public var informationProvider: MutableList<Reference>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): CommunicationRequest =
    CommunicationRequest(
      id = this@CommunicationRequestSurrogate.id,
      meta = this@CommunicationRequestSurrogate.meta,
      implicitRules =
        Uri.of(
          this@CommunicationRequestSurrogate.implicitRules,
          this@CommunicationRequestSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@CommunicationRequestSurrogate.language,
          this@CommunicationRequestSurrogate._language,
        ),
      text = this@CommunicationRequestSurrogate.text,
      contained = this@CommunicationRequestSurrogate.contained ?: mutableListOf(),
      extension = this@CommunicationRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CommunicationRequestSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CommunicationRequestSurrogate.identifier ?: mutableListOf(),
      basedOn = this@CommunicationRequestSurrogate.basedOn ?: mutableListOf(),
      replaces = this@CommunicationRequestSurrogate.replaces ?: mutableListOf(),
      groupIdentifier = this@CommunicationRequestSurrogate.groupIdentifier,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.CommunicationRequest.RequestStatus.fromCode(
            this@CommunicationRequestSurrogate.status!!
          ),
          this@CommunicationRequestSurrogate._status,
        ),
      statusReason = this@CommunicationRequestSurrogate.statusReason,
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.CommunicationRequest.RequestIntent.fromCode(
            this@CommunicationRequestSurrogate.intent!!
          ),
          this@CommunicationRequestSurrogate._intent,
        ),
      category = this@CommunicationRequestSurrogate.category ?: mutableListOf(),
      priority =
        this@CommunicationRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.CommunicationRequest.RequestPriority.fromCode(it!!),
            this@CommunicationRequestSurrogate._priority,
          )
        },
      doNotPerform =
        R5Boolean.of(
          this@CommunicationRequestSurrogate.doNotPerform,
          this@CommunicationRequestSurrogate._doNotPerform,
        ),
      medium = this@CommunicationRequestSurrogate.medium ?: mutableListOf(),
      subject = this@CommunicationRequestSurrogate.subject,
      about = this@CommunicationRequestSurrogate.about ?: mutableListOf(),
      encounter = this@CommunicationRequestSurrogate.encounter,
      payload = this@CommunicationRequestSurrogate.payload ?: mutableListOf(),
      occurrence = this@CommunicationRequestSurrogate.occurrence,
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationRequestSurrogate.authoredOn),
          this@CommunicationRequestSurrogate._authoredOn,
        ),
      requester = this@CommunicationRequestSurrogate.requester,
      recipient = this@CommunicationRequestSurrogate.recipient ?: mutableListOf(),
      informationProvider =
        this@CommunicationRequestSurrogate.informationProvider ?: mutableListOf(),
      reason = this@CommunicationRequestSurrogate.reason ?: mutableListOf(),
      note = this@CommunicationRequestSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CommunicationRequest): CommunicationRequestSurrogate =
      with(model) {
        CommunicationRequestSurrogate(
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          replaces = this@with.replaces.takeUnless { it.all { it == null } },
          groupIdentifier = this@with.groupIdentifier,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          medium = this@with.medium.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          about = this@with.about.takeUnless { it.all { it == null } },
          encounter = this@with.encounter,
          payload = this@with.payload.takeUnless { it.all { it == null } },
          occurrence = this@with.occurrence,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          recipient = this@with.recipient.takeUnless { it.all { it == null } },
          informationProvider = this@with.informationProvider.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
