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
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.CommunicationRequest
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CommunicationRequestPayloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var contentString: KotlinString? = null,
  public var _contentString: Element? = null,
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): CommunicationRequest.Payload =
    CommunicationRequest.Payload(
      id = this@CommunicationRequestPayloadSurrogate.id,
      extension = this@CommunicationRequestPayloadSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CommunicationRequestPayloadSurrogate.modifierExtension ?: mutableListOf(),
      content =
        CommunicationRequest.Payload.Content.from(
          R4String.of(
            this@CommunicationRequestPayloadSurrogate.contentString,
            this@CommunicationRequestPayloadSurrogate._contentString,
          ),
          this@CommunicationRequestPayloadSurrogate.contentAttachment,
          this@CommunicationRequestPayloadSurrogate.contentReference,
        )!!,
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
          contentString = this@with.content?.asString()?.value?.value,
          _contentString = this@with.content?.asString()?.value?.toElement(),
          contentAttachment = this@with.content?.asAttachment()?.value,
          contentReference = this@with.content?.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var replaces: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var medium: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var about: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var payload: MutableList<CommunicationRequest.Payload>? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var recipient: MutableList<Reference>? = null,
  public var sender: Reference? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
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
          com.google.fhir.model.r4.CommunicationRequest.CommunicationRequestStatus.fromCode(
            this@CommunicationRequestSurrogate.status!!
          ),
          this@CommunicationRequestSurrogate._status,
        ),
      statusReason = this@CommunicationRequestSurrogate.statusReason,
      category = this@CommunicationRequestSurrogate.category ?: mutableListOf(),
      priority =
        this@CommunicationRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4.CommunicationRequest.CommunicationPriority.fromCode(it!!),
            this@CommunicationRequestSurrogate._priority,
          )
        },
      doNotPerform =
        R4Boolean.of(
          this@CommunicationRequestSurrogate.doNotPerform,
          this@CommunicationRequestSurrogate._doNotPerform,
        ),
      medium = this@CommunicationRequestSurrogate.medium ?: mutableListOf(),
      subject = this@CommunicationRequestSurrogate.subject,
      about = this@CommunicationRequestSurrogate.about ?: mutableListOf(),
      encounter = this@CommunicationRequestSurrogate.encounter,
      payload = this@CommunicationRequestSurrogate.payload ?: mutableListOf(),
      occurrence =
        CommunicationRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@CommunicationRequestSurrogate.occurrenceDateTime),
            this@CommunicationRequestSurrogate._occurrenceDateTime,
          ),
          this@CommunicationRequestSurrogate.occurrencePeriod,
        ),
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@CommunicationRequestSurrogate.authoredOn),
          this@CommunicationRequestSurrogate._authoredOn,
        ),
      requester = this@CommunicationRequestSurrogate.requester,
      recipient = this@CommunicationRequestSurrogate.recipient ?: mutableListOf(),
      sender = this@CommunicationRequestSurrogate.sender,
      reasonCode = this@CommunicationRequestSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@CommunicationRequestSurrogate.reasonReference ?: mutableListOf(),
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
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          recipient = this@with.recipient.takeUnless { it.all { it == null } },
          sender = this@with.sender,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
