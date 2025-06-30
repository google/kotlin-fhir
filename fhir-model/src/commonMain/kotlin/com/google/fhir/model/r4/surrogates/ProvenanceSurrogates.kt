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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Provenance
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Signature
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProvenanceAgentSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var role: List<CodeableConcept?>? = null,
  public var who: Reference? = null,
  public var onBehalfOf: Reference? = null,
) {
  public fun toModel(): Provenance.Agent =
    Provenance.Agent().apply {
      id = this@ProvenanceAgentSurrogate.id
      extension = this@ProvenanceAgentSurrogate.extension
      modifierExtension = this@ProvenanceAgentSurrogate.modifierExtension
      type = this@ProvenanceAgentSurrogate.type
      role = this@ProvenanceAgentSurrogate.role
      who = this@ProvenanceAgentSurrogate.who
      onBehalfOf = this@ProvenanceAgentSurrogate.onBehalfOf
    }

  public companion object {
    public fun fromModel(model: Provenance.Agent): ProvenanceAgentSurrogate =
      with(model) {
        ProvenanceAgentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          role = this@with.role
          who = this@with.who
          onBehalfOf = this@with.onBehalfOf
        }
      }
  }
}

@Serializable
internal data class ProvenanceEntitySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var role: String? = null,
  public var _role: Element? = null,
  public var what: Reference? = null,
  public var agent: List<Provenance.Agent?>? = null,
) {
  public fun toModel(): Provenance.Entity =
    Provenance.Entity().apply {
      id = this@ProvenanceEntitySurrogate.id
      extension = this@ProvenanceEntitySurrogate.extension
      modifierExtension = this@ProvenanceEntitySurrogate.modifierExtension
      role =
        Enumeration.of(
          this@ProvenanceEntitySurrogate.role?.let {
            com.google.fhir.model.r4.Provenance.ProvenanceEntityRole.fromCode(it)
          },
          this@ProvenanceEntitySurrogate._role,
        )
      what = this@ProvenanceEntitySurrogate.what
      agent = this@ProvenanceEntitySurrogate.agent
    }

  public companion object {
    public fun fromModel(model: Provenance.Entity): ProvenanceEntitySurrogate =
      with(model) {
        ProvenanceEntitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          role = this@with.role?.value?.getCode()
          _role = this@with.role?.toElement()
          what = this@with.what
          agent = this@with.agent
        }
      }
  }
}

@Serializable
internal data class ProvenanceSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var target: List<Reference?>? = null,
  public var occurredPeriod: Period? = null,
  public var occurredDateTime: String? = null,
  public var _occurredDateTime: Element? = null,
  public var recorded: String? = null,
  public var _recorded: Element? = null,
  public var policy: List<String?>? = null,
  public var _policy: List<Element?>? = null,
  public var location: Reference? = null,
  public var reason: List<CodeableConcept?>? = null,
  public var activity: CodeableConcept? = null,
  public var agent: List<Provenance.Agent>? = null,
  public var entity: List<Provenance.Entity>? = null,
  public var signature: List<Signature?>? = null,
) {
  public fun toModel(): Provenance =
    Provenance().apply {
      id = this@ProvenanceSurrogate.id
      meta = this@ProvenanceSurrogate.meta
      implicitRules =
        Uri.of(this@ProvenanceSurrogate.implicitRules, this@ProvenanceSurrogate._implicitRules)
      language = Code.of(this@ProvenanceSurrogate.language, this@ProvenanceSurrogate._language)
      text = this@ProvenanceSurrogate.text
      contained = this@ProvenanceSurrogate.contained
      extension = this@ProvenanceSurrogate.extension
      modifierExtension = this@ProvenanceSurrogate.modifierExtension
      target = this@ProvenanceSurrogate.target
      occurred =
        Provenance.Occurred?.from(
          this@ProvenanceSurrogate.occurredPeriod,
          DateTime.of(
            FhirDateTime.fromString(this@ProvenanceSurrogate.occurredDateTime),
            this@ProvenanceSurrogate._occurredDateTime,
          ),
        )
      recorded =
        Instant.of(
          FhirDateTime.fromString(this@ProvenanceSurrogate.recorded),
          this@ProvenanceSurrogate._recorded,
        )
      policy =
        if (this@ProvenanceSurrogate.policy == null && this@ProvenanceSurrogate._policy == null) {
          null
        } else {
          (this@ProvenanceSurrogate.policy
              ?: List(this@ProvenanceSurrogate._policy!!.size) { null })
            .zip(
              this@ProvenanceSurrogate._policy
                ?: List(this@ProvenanceSurrogate.policy!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      location = this@ProvenanceSurrogate.location
      reason = this@ProvenanceSurrogate.reason
      activity = this@ProvenanceSurrogate.activity
      agent = this@ProvenanceSurrogate.agent
      entity = this@ProvenanceSurrogate.entity
      signature = this@ProvenanceSurrogate.signature
    }

  public companion object {
    public fun fromModel(model: Provenance): ProvenanceSurrogate =
      with(model) {
        ProvenanceSurrogate().apply {
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
          target = this@with.target
          occurredPeriod = this@with.occurred?.asPeriod()?.value
          occurredDateTime = this@with.occurred?.asDateTime()?.value?.value?.toString()
          _occurredDateTime = this@with.occurred?.asDateTime()?.value?.toElement()
          recorded = this@with.recorded?.value?.toString()
          _recorded = this@with.recorded?.toElement()
          policy = this@with.policy?.map { it?.value }?.takeUnless { it.all { it == null } }
          _policy = this@with.policy?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          location = this@with.location
          reason = this@with.reason
          activity = this@with.activity
          agent = this@with.agent
          entity = this@with.entity
          signature = this@with.signature
        }
      }
  }
}
