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

import com.google.fhir.model.r5.AuditEvent
import com.google.fhir.model.r5.Base64Binary
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AuditEventOutcomeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: Coding? = null,
  public var detail: List<CodeableConcept?>? = null,
) {
  public fun toModel(): AuditEvent.Outcome =
    AuditEvent.Outcome().apply {
      id = this@AuditEventOutcomeSurrogate.id
      extension = this@AuditEventOutcomeSurrogate.extension
      modifierExtension = this@AuditEventOutcomeSurrogate.modifierExtension
      code = this@AuditEventOutcomeSurrogate.code
      detail = this@AuditEventOutcomeSurrogate.detail
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Outcome): AuditEventOutcomeSurrogate =
      with(model) {
        AuditEventOutcomeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal class AuditEventAgentNetworkSurrogate {
  public var networkReference: Reference? = null

  public var networkUri: KotlinString? = null

  public var _networkUri: Element? = null

  public var networkString: KotlinString? = null

  public var _networkString: Element? = null

  public fun toModel(): AuditEvent.Agent.Network =
    AuditEvent.Agent.Network?.from(
      this@AuditEventAgentNetworkSurrogate.networkReference,
      Uri.of(
        this@AuditEventAgentNetworkSurrogate.networkUri,
        this@AuditEventAgentNetworkSurrogate._networkUri,
      ),
      R5String.of(
        this@AuditEventAgentNetworkSurrogate.networkString,
        this@AuditEventAgentNetworkSurrogate._networkString,
      ),
    ) ?: AuditEvent.Agent.Network.Null

  public companion object {
    public fun fromModel(model: AuditEvent.Agent.Network): AuditEventAgentNetworkSurrogate =
      with(model) {
        AuditEventAgentNetworkSurrogate().apply {
          networkReference = this@with.asReference()?.value
          networkUri = this@with.asUri()?.value?.value
          _networkUri = this@with.asUri()?.value?.toElement()
          networkString = this@with.asString()?.value?.value
          _networkString = this@with.asString()?.value?.toElement()
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
  public var requestor: KotlinBoolean? = null,
  public var _requestor: Element? = null,
  public var location: Reference? = null,
  public var policy: List<KotlinString?>? = null,
  public var _policy: List<Element?>? = null,
  public var authorization: List<CodeableConcept?>? = null,
  public var network: AuditEvent.Agent.Network? = null,
) {
  public fun toModel(): AuditEvent.Agent =
    AuditEvent.Agent().apply {
      id = this@AuditEventAgentSurrogate.id
      extension = this@AuditEventAgentSurrogate.extension
      modifierExtension = this@AuditEventAgentSurrogate.modifierExtension
      type = this@AuditEventAgentSurrogate.type
      role = this@AuditEventAgentSurrogate.role
      who = this@AuditEventAgentSurrogate.who
      requestor =
        R5Boolean.of(
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
      network = this@AuditEventAgentSurrogate.network
      authorization = this@AuditEventAgentSurrogate.authorization
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
          requestor = this@with.requestor?.value
          _requestor = this@with.requestor?.toElement()
          location = this@with.location
          policy = this@with.policy?.map { it?.value }?.takeUnless { it.all { it == null } }
          _policy = this@with.policy?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          network = this@with.network
          authorization = this@with.authorization
        }
      }
  }
}

@Serializable
internal data class AuditEventSourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var site: Reference? = null,
  public var observer: Reference? = null,
  public var type: List<CodeableConcept?>? = null,
) {
  public fun toModel(): AuditEvent.Source =
    AuditEvent.Source().apply {
      id = this@AuditEventSourceSurrogate.id
      extension = this@AuditEventSourceSurrogate.extension
      modifierExtension = this@AuditEventSourceSurrogate.modifierExtension
      site = this@AuditEventSourceSurrogate.site
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
          site = this@with.site
          observer = this@with.observer
          type = this@with.type
        }
      }
  }
}

@Serializable
internal class AuditEventEntityDetailValueSurrogate {
  public var valueQuantity: Quantity? = null

  public var valueCodeableConcept: CodeableConcept? = null

  public var valueString: KotlinString? = null

  public var _valueString: Element? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueInteger: Int? = null

  public var _valueInteger: Element? = null

  public var valueRange: Range? = null

  public var valueRatio: Ratio? = null

  public var valueTime: LocalTime? = null

  public var _valueTime: Element? = null

  public var valueDateTime: KotlinString? = null

  public var _valueDateTime: Element? = null

  public var valuePeriod: Period? = null

  public var valueBase64Binary: KotlinString? = null

  public var _valueBase64Binary: Element? = null

  public fun toModel(): AuditEvent.Entity.Detail.Value =
    AuditEvent.Entity.Detail.Value?.from(
      this@AuditEventEntityDetailValueSurrogate.valueQuantity,
      this@AuditEventEntityDetailValueSurrogate.valueCodeableConcept,
      R5String.of(
        this@AuditEventEntityDetailValueSurrogate.valueString,
        this@AuditEventEntityDetailValueSurrogate._valueString,
      ),
      R5Boolean.of(
        this@AuditEventEntityDetailValueSurrogate.valueBoolean,
        this@AuditEventEntityDetailValueSurrogate._valueBoolean,
      ),
      Integer.of(
        this@AuditEventEntityDetailValueSurrogate.valueInteger,
        this@AuditEventEntityDetailValueSurrogate._valueInteger,
      ),
      this@AuditEventEntityDetailValueSurrogate.valueRange,
      this@AuditEventEntityDetailValueSurrogate.valueRatio,
      Time.of(
        this@AuditEventEntityDetailValueSurrogate.valueTime,
        this@AuditEventEntityDetailValueSurrogate._valueTime,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@AuditEventEntityDetailValueSurrogate.valueDateTime),
        this@AuditEventEntityDetailValueSurrogate._valueDateTime,
      ),
      this@AuditEventEntityDetailValueSurrogate.valuePeriod,
      Base64Binary.of(
        this@AuditEventEntityDetailValueSurrogate.valueBase64Binary,
        this@AuditEventEntityDetailValueSurrogate._valueBase64Binary,
      ),
    ) ?: AuditEvent.Entity.Detail.Value.Null

  public companion object {
    public fun fromModel(
      model: AuditEvent.Entity.Detail.Value
    ): AuditEventEntityDetailValueSurrogate =
      with(model) {
        AuditEventEntityDetailValueSurrogate().apply {
          valueQuantity = this@with.asQuantity()?.value
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueString = this@with.asString()?.value?.value
          _valueString = this@with.asString()?.value?.toElement()
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueInteger = this@with.asInteger()?.value?.value
          _valueInteger = this@with.asInteger()?.value?.toElement()
          valueRange = this@with.asRange()?.value
          valueRatio = this@with.asRatio()?.value
          valueTime = this@with.asTime()?.value?.value
          _valueTime = this@with.asTime()?.value?.toElement()
          valueDateTime = this@with.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.asDateTime()?.value?.toElement()
          valuePeriod = this@with.asPeriod()?.value
          valueBase64Binary = this@with.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.asBase64Binary()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class AuditEventEntityDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: AuditEvent.Entity.Detail.Value? = null,
) {
  public fun toModel(): AuditEvent.Entity.Detail =
    AuditEvent.Entity.Detail().apply {
      id = this@AuditEventEntityDetailSurrogate.id
      extension = this@AuditEventEntityDetailSurrogate.extension
      modifierExtension = this@AuditEventEntityDetailSurrogate.modifierExtension
      type = this@AuditEventEntityDetailSurrogate.type
      `value` = this@AuditEventEntityDetailSurrogate.`value`
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Entity.Detail): AuditEventEntityDetailSurrogate =
      with(model) {
        AuditEventEntityDetailSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`
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
  public var role: CodeableConcept? = null,
  public var securityLabel: List<CodeableConcept?>? = null,
  public var query: KotlinString? = null,
  public var _query: Element? = null,
  public var detail: List<AuditEvent.Entity.Detail>? = null,
  public var agent: List<AuditEvent.Agent?>? = null,
) {
  public fun toModel(): AuditEvent.Entity =
    AuditEvent.Entity().apply {
      id = this@AuditEventEntitySurrogate.id
      extension = this@AuditEventEntitySurrogate.extension
      modifierExtension = this@AuditEventEntitySurrogate.modifierExtension
      what = this@AuditEventEntitySurrogate.what
      role = this@AuditEventEntitySurrogate.role
      securityLabel = this@AuditEventEntitySurrogate.securityLabel
      query =
        Base64Binary.of(this@AuditEventEntitySurrogate.query, this@AuditEventEntitySurrogate._query)
      detail = this@AuditEventEntitySurrogate.detail
      agent = this@AuditEventEntitySurrogate.agent
    }

  public companion object {
    public fun fromModel(model: AuditEvent.Entity): AuditEventEntitySurrogate =
      with(model) {
        AuditEventEntitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          what = this@with.what
          role = this@with.role
          securityLabel = this@with.securityLabel
          query = this@with.query?.value
          _query = this@with.query?.toElement()
          detail = this@with.detail
          agent = this@with.agent
        }
      }
  }
}

@Serializable
internal class AuditEventOccurredSurrogate {
  public var occurredPeriod: Period? = null

  public var occurredDateTime: KotlinString? = null

  public var _occurredDateTime: Element? = null

  public fun toModel(): AuditEvent.Occurred =
    AuditEvent.Occurred?.from(
      this@AuditEventOccurredSurrogate.occurredPeriod,
      DateTime.of(
        FhirDateTime.fromString(this@AuditEventOccurredSurrogate.occurredDateTime),
        this@AuditEventOccurredSurrogate._occurredDateTime,
      ),
    ) ?: AuditEvent.Occurred.Null

  public companion object {
    public fun fromModel(model: AuditEvent.Occurred): AuditEventOccurredSurrogate =
      with(model) {
        AuditEventOccurredSurrogate().apply {
          occurredPeriod = this@with.asPeriod()?.value
          occurredDateTime = this@with.asDateTime()?.value?.value?.toString()
          _occurredDateTime = this@with.asDateTime()?.value?.toElement()
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
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var action: KotlinString? = null,
  public var _action: Element? = null,
  public var severity: KotlinString? = null,
  public var _severity: Element? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var outcome: AuditEvent.Outcome? = null,
  public var authorization: List<CodeableConcept?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var patient: Reference? = null,
  public var encounter: Reference? = null,
  public var agent: List<AuditEvent.Agent>? = null,
  public var source: AuditEvent.Source? = null,
  public var entity: List<AuditEvent.Entity>? = null,
  public var occurred: AuditEvent.Occurred? = null,
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
      category = this@AuditEventSurrogate.category
      code = this@AuditEventSurrogate.code
      action =
        Enumeration.of(
          this@AuditEventSurrogate.action?.let {
            com.google.fhir.model.r5.AuditEvent.AuditEventAction.fromCode(it)
          },
          this@AuditEventSurrogate._action,
        )
      severity =
        Enumeration.of(
          this@AuditEventSurrogate.severity?.let {
            com.google.fhir.model.r5.AuditEvent.AuditEventSeverity.fromCode(it)
          },
          this@AuditEventSurrogate._severity,
        )
      occurred = this@AuditEventSurrogate.occurred
      recorded =
        Instant.of(
          FhirDateTime.fromString(this@AuditEventSurrogate.recorded),
          this@AuditEventSurrogate._recorded,
        )
      outcome = this@AuditEventSurrogate.outcome
      authorization = this@AuditEventSurrogate.authorization
      basedOn = this@AuditEventSurrogate.basedOn
      patient = this@AuditEventSurrogate.patient
      encounter = this@AuditEventSurrogate.encounter
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
          category = this@with.category
          code = this@with.code
          action = this@with.action?.value?.getCode()
          _action = this@with.action?.toElement()
          severity = this@with.severity?.value?.getCode()
          _severity = this@with.severity?.toElement()
          occurred = this@with.occurred
          recorded = this@with.recorded?.value?.toString()
          _recorded = this@with.recorded?.toElement()
          outcome = this@with.outcome
          authorization = this@with.authorization
          basedOn = this@with.basedOn
          patient = this@with.patient
          encounter = this@with.encounter
          agent = this@with.agent
          source = this@with.source
          entity = this@with.entity
        }
      }
  }
}
