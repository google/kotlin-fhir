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

import com.google.fhir.model.r4b.AuditEvent
import com.google.fhir.model.r4b.Base64Binary
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Instant
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
internal data class AuditEventAgentNetworkSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var address: KotlinString? = null,
  public var _address: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): AuditEvent.Agent.Network =
    AuditEvent.Agent.Network().apply {
      id = this@AuditEventAgentNetworkSurrogate.id
      extension = this@AuditEventAgentNetworkSurrogate.extension
      modifierExtension = this@AuditEventAgentNetworkSurrogate.modifierExtension
      address =
        R4bString.of(
          this@AuditEventAgentNetworkSurrogate.address,
          this@AuditEventAgentNetworkSurrogate._address,
        )
      type =
        Enumeration.of(
          this@AuditEventAgentNetworkSurrogate.type?.let {
            com.google.fhir.model.r4b.AuditEvent.AuditEventAgentNetworkType.fromCode(it)
          },
          this@AuditEventAgentNetworkSurrogate._type,
        )
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Agent.Network): AuditEventAgentNetworkSurrogate =
      with(model) {
        AuditEventAgentNetworkSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          address = this@with.address?.value
          _address = this@with.address?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
        }
      }
  }
}

@Serializable
internal data class AuditEventAgentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var role: List<CodeableConcept?>? = null,
  public var who: Reference? = null,
  public var altId: KotlinString? = null,
  public var _altId: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var requestor: KotlinBoolean? = null,
  public var _requestor: Element? = null,
  public var location: Reference? = null,
  public var policy: List<KotlinString?>? = null,
  public var _policy: List<Element?>? = null,
  public var media: Coding? = null,
  public var network: AuditEvent.Agent.Network? = null,
  public var purposeOfUse: List<CodeableConcept?>? = null,
) {
  public fun toModel(): AuditEvent.Agent =
    AuditEvent.Agent().apply {
      id = this@AuditEventAgentSurrogate.id
      extension = this@AuditEventAgentSurrogate.extension
      modifierExtension = this@AuditEventAgentSurrogate.modifierExtension
      type = this@AuditEventAgentSurrogate.type
      role = this@AuditEventAgentSurrogate.role
      who = this@AuditEventAgentSurrogate.who
      altId =
        R4bString.of(this@AuditEventAgentSurrogate.altId, this@AuditEventAgentSurrogate._altId)
      name = R4bString.of(this@AuditEventAgentSurrogate.name, this@AuditEventAgentSurrogate._name)
      requestor =
        R4bBoolean.of(
          this@AuditEventAgentSurrogate.requestor,
          this@AuditEventAgentSurrogate._requestor,
        )
      location = this@AuditEventAgentSurrogate.location
      policy =
        if (
          this@AuditEventAgentSurrogate.policy == null &&
            this@AuditEventAgentSurrogate._policy == null
        ) {
          null
        } else {
          (this@AuditEventAgentSurrogate.policy
              ?: List(this@AuditEventAgentSurrogate._policy!!.size) { null })
            .zip(
              this@AuditEventAgentSurrogate._policy
                ?: List(this@AuditEventAgentSurrogate.policy!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      media = this@AuditEventAgentSurrogate.media
      network = this@AuditEventAgentSurrogate.network
      purposeOfUse = this@AuditEventAgentSurrogate.purposeOfUse
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Agent): AuditEventAgentSurrogate =
      with(model) {
        AuditEventAgentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          role = this@with.role
          who = this@with.who
          altId = this@with.altId?.value
          _altId = this@with.altId?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          requestor = this@with.requestor?.value
          _requestor = this@with.requestor?.toElement()
          location = this@with.location
          policy = this@with.policy?.map { it?.value }?.takeUnless { it.all { it == null } }
          _policy = this@with.policy?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          media = this@with.media
          network = this@with.network
          purposeOfUse = this@with.purposeOfUse
        }
      }
  }
}

@Serializable
internal data class AuditEventSourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var site: KotlinString? = null,
  public var _site: Element? = null,
  public var observer: Reference? = null,
  public var type: List<Coding?>? = null,
) {
  public fun toModel(): AuditEvent.Source =
    AuditEvent.Source().apply {
      id = this@AuditEventSourceSurrogate.id
      extension = this@AuditEventSourceSurrogate.extension
      modifierExtension = this@AuditEventSourceSurrogate.modifierExtension
      site = R4bString.of(this@AuditEventSourceSurrogate.site, this@AuditEventSourceSurrogate._site)
      observer = this@AuditEventSourceSurrogate.observer
      type = this@AuditEventSourceSurrogate.type
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Source): AuditEventSourceSurrogate =
      with(model) {
        AuditEventSourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          site = this@with.site?.value
          _site = this@with.site?.toElement()
          observer = this@with.observer
          type = this@with.type
        }
      }
  }
}

@Serializable
internal data class AuditEventEntityDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBase64Binary: KotlinString? = null,
  public var _valueBase64Binary: Element? = null,
) {
  public fun toModel(): AuditEvent.Entity.Detail =
    AuditEvent.Entity.Detail().apply {
      id = this@AuditEventEntityDetailSurrogate.id
      extension = this@AuditEventEntityDetailSurrogate.extension
      modifierExtension = this@AuditEventEntityDetailSurrogate.modifierExtension
      type =
        R4bString.of(
          this@AuditEventEntityDetailSurrogate.type,
          this@AuditEventEntityDetailSurrogate._type,
        )
      `value` =
        AuditEvent.Entity.Detail.Value?.from(
          R4bString.of(
            this@AuditEventEntityDetailSurrogate.valueString,
            this@AuditEventEntityDetailSurrogate._valueString,
          ),
          Base64Binary.of(
            this@AuditEventEntityDetailSurrogate.valueBase64Binary,
            this@AuditEventEntityDetailSurrogate._valueBase64Binary,
          ),
        )
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Entity.Detail): AuditEventEntityDetailSurrogate =
      with(model) {
        AuditEventEntityDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class AuditEventEntitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var what: Reference? = null,
  public var type: Coding? = null,
  public var role: Coding? = null,
  public var lifecycle: Coding? = null,
  public var securityLabel: List<Coding?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var query: KotlinString? = null,
  public var _query: Element? = null,
  public var detail: List<AuditEvent.Entity.Detail>? = null,
) {
  public fun toModel(): AuditEvent.Entity =
    AuditEvent.Entity().apply {
      id = this@AuditEventEntitySurrogate.id
      extension = this@AuditEventEntitySurrogate.extension
      modifierExtension = this@AuditEventEntitySurrogate.modifierExtension
      what = this@AuditEventEntitySurrogate.what
      type = this@AuditEventEntitySurrogate.type
      role = this@AuditEventEntitySurrogate.role
      lifecycle = this@AuditEventEntitySurrogate.lifecycle
      securityLabel = this@AuditEventEntitySurrogate.securityLabel
      name = R4bString.of(this@AuditEventEntitySurrogate.name, this@AuditEventEntitySurrogate._name)
      description =
        R4bString.of(
          this@AuditEventEntitySurrogate.description,
          this@AuditEventEntitySurrogate._description,
        )
      query =
        Base64Binary.of(this@AuditEventEntitySurrogate.query, this@AuditEventEntitySurrogate._query)
      detail = this@AuditEventEntitySurrogate.detail
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Entity): AuditEventEntitySurrogate =
      with(model) {
        AuditEventEntitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          what = this@with.what
          type = this@with.type
          role = this@with.role
          lifecycle = this@with.lifecycle
          securityLabel = this@with.securityLabel
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          query = this@with.query?.value
          _query = this@with.query?.toElement()
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class AuditEventSurrogate(
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
  public var type: Coding? = null,
  public var subtype: List<Coding?>? = null,
  public var action: KotlinString? = null,
  public var _action: Element? = null,
  public var period: Period? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var outcomeDesc: KotlinString? = null,
  public var _outcomeDesc: Element? = null,
  public var purposeOfEvent: List<CodeableConcept?>? = null,
  public var agent: List<AuditEvent.Agent>? = null,
  public var source: AuditEvent.Source? = null,
  public var entity: List<AuditEvent.Entity>? = null,
) {
  public fun toModel(): AuditEvent =
    AuditEvent().apply {
      id = this@AuditEventSurrogate.id
      meta = this@AuditEventSurrogate.meta
      implicitRules =
        Uri.of(this@AuditEventSurrogate.implicitRules, this@AuditEventSurrogate._implicitRules)
      language = Code.of(this@AuditEventSurrogate.language, this@AuditEventSurrogate._language)
      text = this@AuditEventSurrogate.text
      contained = this@AuditEventSurrogate.contained
      extension = this@AuditEventSurrogate.extension
      modifierExtension = this@AuditEventSurrogate.modifierExtension
      type = this@AuditEventSurrogate.type
      subtype = this@AuditEventSurrogate.subtype
      action =
        Enumeration.of(
          this@AuditEventSurrogate.action?.let {
            com.google.fhir.model.r4b.AuditEvent.AuditEventAction.fromCode(it)
          },
          this@AuditEventSurrogate._action,
        )
      period = this@AuditEventSurrogate.period
      recorded =
        Instant.of(
          FhirDateTime.fromString(this@AuditEventSurrogate.recorded),
          this@AuditEventSurrogate._recorded,
        )
      outcome =
        Enumeration.of(
          this@AuditEventSurrogate.outcome?.let {
            com.google.fhir.model.r4b.AuditEvent.AuditEventOutcome.fromCode(it)
          },
          this@AuditEventSurrogate._outcome,
        )
      outcomeDesc =
        R4bString.of(this@AuditEventSurrogate.outcomeDesc, this@AuditEventSurrogate._outcomeDesc)
      purposeOfEvent = this@AuditEventSurrogate.purposeOfEvent
      agent = this@AuditEventSurrogate.agent
      source = this@AuditEventSurrogate.source
      entity = this@AuditEventSurrogate.entity
    }

  public companion object {
    public fun fromModel(model: AuditEvent): AuditEventSurrogate =
      with(model) {
        AuditEventSurrogate().apply {
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
          type = this@with.type
          subtype = this@with.subtype
          action = this@with.action?.value?.getCode()
          _action = this@with.action?.toElement()
          period = this@with.period
          recorded = this@with.recorded?.value?.toString()
          _recorded = this@with.recorded?.toElement()
          outcome = this@with.outcome?.value?.getCode()
          _outcome = this@with.outcome?.toElement()
          outcomeDesc = this@with.outcomeDesc?.value
          _outcomeDesc = this@with.outcomeDesc?.toElement()
          purposeOfEvent = this@with.purposeOfEvent
          agent = this@with.agent
          source = this@with.source
          entity = this@with.entity
        }
      }
  }
}
