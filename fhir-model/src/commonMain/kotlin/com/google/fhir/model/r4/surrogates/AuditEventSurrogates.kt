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

import com.google.fhir.model.r4.AuditEvent
import com.google.fhir.model.r4.Base64Binary
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Instant
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
internal data class AuditEventAgentNetworkSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var address: KotlinString? = null,
  public var _address: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): AuditEvent.Agent.Network =
    AuditEvent.Agent.Network(
      id = this@AuditEventAgentNetworkSurrogate.id,
      extension = this@AuditEventAgentNetworkSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AuditEventAgentNetworkSurrogate.modifierExtension ?: mutableListOf(),
      address =
        R4String.of(
          this@AuditEventAgentNetworkSurrogate.address,
          this@AuditEventAgentNetworkSurrogate._address,
        ),
      type =
        this@AuditEventAgentNetworkSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r4.AuditEvent.AuditEventAgentNetworkType.fromCode(it!!),
            this@AuditEventAgentNetworkSurrogate._type,
          )
        },
    )

  public companion object {
    public fun fromModel(model: AuditEvent.Agent.Network): AuditEventAgentNetworkSurrogate =
      with(model) {
        AuditEventAgentNetworkSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          address = this@with.address?.value,
          _address = this@with.address?.toElement(),
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
        )
      }
  }
}

@Serializable
internal data class AuditEventAgentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var role: MutableList<CodeableConcept>? = null,
  public var who: Reference? = null,
  public var altId: KotlinString? = null,
  public var _altId: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var requestor: KotlinBoolean? = null,
  public var _requestor: Element? = null,
  public var location: Reference? = null,
  public var policy: MutableList<KotlinString?>? = null,
  public var _policy: MutableList<Element?>? = null,
  public var media: Coding? = null,
  public var network: AuditEvent.Agent.Network? = null,
  public var purposeOfUse: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): AuditEvent.Agent =
    AuditEvent.Agent(
      id = this@AuditEventAgentSurrogate.id,
      extension = this@AuditEventAgentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AuditEventAgentSurrogate.modifierExtension ?: mutableListOf(),
      type = this@AuditEventAgentSurrogate.type,
      role = this@AuditEventAgentSurrogate.role ?: mutableListOf(),
      who = this@AuditEventAgentSurrogate.who,
      altId =
        R4String.of(this@AuditEventAgentSurrogate.altId, this@AuditEventAgentSurrogate._altId),
      name = R4String.of(this@AuditEventAgentSurrogate.name, this@AuditEventAgentSurrogate._name),
      requestor =
        R4Boolean.of(
          this@AuditEventAgentSurrogate.requestor,
          this@AuditEventAgentSurrogate._requestor,
        )!!,
      location = this@AuditEventAgentSurrogate.location,
      policy =
        if (
          this@AuditEventAgentSurrogate.policy == null &&
            this@AuditEventAgentSurrogate._policy == null
        ) {
          mutableListOf()
        } else {
          (this@AuditEventAgentSurrogate.policy
              ?: List(this@AuditEventAgentSurrogate._policy!!.size) { null })
            .zip(
              this@AuditEventAgentSurrogate._policy
                ?: List(this@AuditEventAgentSurrogate.policy!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      media = this@AuditEventAgentSurrogate.media,
      network = this@AuditEventAgentSurrogate.network,
      purposeOfUse = this@AuditEventAgentSurrogate.purposeOfUse ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AuditEvent.Agent): AuditEventAgentSurrogate =
      with(model) {
        AuditEventAgentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          role = this@with.role.takeUnless { it.all { it == null } },
          who = this@with.who,
          altId = this@with.altId?.value,
          _altId = this@with.altId?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          requestor = this@with.requestor.value,
          _requestor = this@with.requestor.toElement(),
          location = this@with.location,
          policy =
            this@with.policy.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _policy =
            this@with.policy
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          media = this@with.media,
          network = this@with.network,
          purposeOfUse = this@with.purposeOfUse.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class AuditEventSourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var site: KotlinString? = null,
  public var _site: Element? = null,
  public var observer: Reference,
  public var type: MutableList<Coding>? = null,
) {
  public fun toModel(): AuditEvent.Source =
    AuditEvent.Source(
      id = this@AuditEventSourceSurrogate.id,
      extension = this@AuditEventSourceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AuditEventSourceSurrogate.modifierExtension ?: mutableListOf(),
      site = R4String.of(this@AuditEventSourceSurrogate.site, this@AuditEventSourceSurrogate._site),
      observer = this@AuditEventSourceSurrogate.observer,
      type = this@AuditEventSourceSurrogate.type ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AuditEvent.Source): AuditEventSourceSurrogate =
      with(model) {
        AuditEventSourceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          site = this@with.site?.value,
          _site = this@with.site?.toElement(),
          observer = this@with.observer,
          type = this@with.type.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class AuditEventEntityDetailValueSurrogate(
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBase64Binary: KotlinString? = null,
  public var _valueBase64Binary: Element? = null,
) {
  public fun toModel(): AuditEvent.Entity.Detail.Value =
    AuditEvent.Entity.Detail.Value.from(
      R4String.of(
        this@AuditEventEntityDetailValueSurrogate.valueString,
        this@AuditEventEntityDetailValueSurrogate._valueString,
      ),
      Base64Binary.of(
        this@AuditEventEntityDetailValueSurrogate.valueBase64Binary,
        this@AuditEventEntityDetailValueSurrogate._valueBase64Binary,
      ),
    )!! !!

  public companion object {
    public fun fromModel(
      model: AuditEvent.Entity.Detail.Value
    ): AuditEventEntityDetailValueSurrogate =
      with(model) {
        AuditEventEntityDetailValueSurrogate(
          valueString = this@with.asString()?.value?.value,
          _valueString = this@with.asString()?.value?.toElement(),
          valueBase64Binary = this@with.asBase64Binary()?.value?.value,
          _valueBase64Binary = this@with.asBase64Binary()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class AuditEventEntityDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var `value`: AuditEvent.Entity.Detail.Value,
) {
  public fun toModel(): AuditEvent.Entity.Detail =
    AuditEvent.Entity.Detail(
      id = this@AuditEventEntityDetailSurrogate.id,
      extension = this@AuditEventEntityDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AuditEventEntityDetailSurrogate.modifierExtension ?: mutableListOf(),
      type =
        R4String.of(
          this@AuditEventEntityDetailSurrogate.type,
          this@AuditEventEntityDetailSurrogate._type,
        )!!,
      `value` = this@AuditEventEntityDetailSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: AuditEvent.Entity.Detail): AuditEventEntityDetailSurrogate =
      with(model) {
        AuditEventEntityDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value,
          _type = this@with.type.toElement(),
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class AuditEventEntitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var what: Reference? = null,
  public var type: Coding? = null,
  public var role: Coding? = null,
  public var lifecycle: Coding? = null,
  public var securityLabel: MutableList<Coding>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var query: KotlinString? = null,
  public var _query: Element? = null,
  public var detail: MutableList<AuditEvent.Entity.Detail>? = null,
) {
  public fun toModel(): AuditEvent.Entity =
    AuditEvent.Entity(
      id = this@AuditEventEntitySurrogate.id,
      extension = this@AuditEventEntitySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AuditEventEntitySurrogate.modifierExtension ?: mutableListOf(),
      what = this@AuditEventEntitySurrogate.what,
      type = this@AuditEventEntitySurrogate.type,
      role = this@AuditEventEntitySurrogate.role,
      lifecycle = this@AuditEventEntitySurrogate.lifecycle,
      securityLabel = this@AuditEventEntitySurrogate.securityLabel ?: mutableListOf(),
      name = R4String.of(this@AuditEventEntitySurrogate.name, this@AuditEventEntitySurrogate._name),
      description =
        R4String.of(
          this@AuditEventEntitySurrogate.description,
          this@AuditEventEntitySurrogate._description,
        ),
      query =
        Base64Binary.of(
          this@AuditEventEntitySurrogate.query,
          this@AuditEventEntitySurrogate._query,
        ),
      detail = this@AuditEventEntitySurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AuditEvent.Entity): AuditEventEntitySurrogate =
      with(model) {
        AuditEventEntitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          what = this@with.what,
          type = this@with.type,
          role = this@with.role,
          lifecycle = this@with.lifecycle,
          securityLabel = this@with.securityLabel.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          query = this@with.query?.value,
          _query = this@with.query?.toElement(),
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: Coding,
  public var subtype: MutableList<Coding>? = null,
  public var action: KotlinString? = null,
  public var _action: Element? = null,
  public var period: Period? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var outcomeDesc: KotlinString? = null,
  public var _outcomeDesc: Element? = null,
  public var purposeOfEvent: MutableList<CodeableConcept>? = null,
  public var agent: MutableList<AuditEvent.Agent>? = null,
  public var source: AuditEvent.Source,
  public var entity: MutableList<AuditEvent.Entity>? = null,
) {
  public fun toModel(): AuditEvent =
    AuditEvent(
      id = this@AuditEventSurrogate.id,
      meta = this@AuditEventSurrogate.meta,
      implicitRules =
        Uri.of(this@AuditEventSurrogate.implicitRules, this@AuditEventSurrogate._implicitRules),
      language = Code.of(this@AuditEventSurrogate.language, this@AuditEventSurrogate._language),
      text = this@AuditEventSurrogate.text,
      contained = this@AuditEventSurrogate.contained ?: mutableListOf(),
      extension = this@AuditEventSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@AuditEventSurrogate.modifierExtension ?: mutableListOf(),
      type = this@AuditEventSurrogate.type,
      subtype = this@AuditEventSurrogate.subtype ?: mutableListOf(),
      action =
        this@AuditEventSurrogate.action?.let {
          Enumeration.of(
            com.google.fhir.model.r4.AuditEvent.AuditEventAction.fromCode(it!!),
            this@AuditEventSurrogate._action,
          )
        },
      period = this@AuditEventSurrogate.period,
      recorded =
        Instant.of(
          FhirDateTime.fromString(this@AuditEventSurrogate.recorded),
          this@AuditEventSurrogate._recorded,
        )!!,
      outcome =
        this@AuditEventSurrogate.outcome?.let {
          Enumeration.of(
            com.google.fhir.model.r4.AuditEvent.AuditEventOutcome.fromCode(it!!),
            this@AuditEventSurrogate._outcome,
          )
        },
      outcomeDesc =
        R4String.of(this@AuditEventSurrogate.outcomeDesc, this@AuditEventSurrogate._outcomeDesc),
      purposeOfEvent = this@AuditEventSurrogate.purposeOfEvent ?: mutableListOf(),
      agent = this@AuditEventSurrogate.agent ?: mutableListOf(),
      source = this@AuditEventSurrogate.source,
      entity = this@AuditEventSurrogate.entity ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: AuditEvent): AuditEventSurrogate =
      with(model) {
        AuditEventSurrogate(
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
          type = this@with.type,
          subtype = this@with.subtype.takeUnless { it.all { it == null } },
          action = this@with.action?.value?.getCode(),
          _action = this@with.action?.toElement(),
          period = this@with.period,
          recorded = this@with.recorded.value?.toString(),
          _recorded = this@with.recorded.toElement(),
          outcome = this@with.outcome?.value?.getCode(),
          _outcome = this@with.outcome?.toElement(),
          outcomeDesc = this@with.outcomeDesc?.value,
          _outcomeDesc = this@with.outcomeDesc?.toElement(),
          purposeOfEvent = this@with.purposeOfEvent.takeUnless { it.all { it == null } },
          agent = this@with.agent.takeUnless { it.all { it == null } },
          source = this@with.source,
          entity = this@with.entity.takeUnless { it.all { it == null } },
        )
      }
  }
}
