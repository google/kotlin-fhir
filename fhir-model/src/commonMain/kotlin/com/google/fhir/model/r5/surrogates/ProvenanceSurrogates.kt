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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Provenance
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Signature
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProvenanceAgentSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var role: MutableList<CodeableConcept>? = null,
  public var who: Reference,
  public var onBehalfOf: Reference? = null,
) {
  public fun toModel(): Provenance.Agent =
    Provenance.Agent(
      id = this@ProvenanceAgentSurrogate.id,
      extension = this@ProvenanceAgentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProvenanceAgentSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ProvenanceAgentSurrogate.type,
      role = this@ProvenanceAgentSurrogate.role ?: mutableListOf(),
      who = this@ProvenanceAgentSurrogate.who,
      onBehalfOf = this@ProvenanceAgentSurrogate.onBehalfOf,
    )

  public companion object {
    public fun fromModel(model: Provenance.Agent): ProvenanceAgentSurrogate =
      with(model) {
        ProvenanceAgentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          role = this@with.role.takeUnless { it.all { it == null } },
          who = this@with.who,
          onBehalfOf = this@with.onBehalfOf,
        )
      }
  }
}

@Serializable
internal data class ProvenanceEntitySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: String? = null,
  public var _role: Element? = null,
  public var what: Reference,
  public var agent: MutableList<Provenance.Agent>? = null,
) {
  public fun toModel(): Provenance.Entity =
    Provenance.Entity(
      id = this@ProvenanceEntitySurrogate.id,
      extension = this@ProvenanceEntitySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProvenanceEntitySurrogate.modifierExtension ?: mutableListOf(),
      role =
        Enumeration.of(
          com.google.fhir.model.r5.Provenance.ProvenanceEntityRole.fromCode(
            this@ProvenanceEntitySurrogate.role!!
          ),
          this@ProvenanceEntitySurrogate._role,
        ),
      what = this@ProvenanceEntitySurrogate.what,
      agent = this@ProvenanceEntitySurrogate.agent ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Provenance.Entity): ProvenanceEntitySurrogate =
      with(model) {
        ProvenanceEntitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role.value?.getCode(),
          _role = this@with.role.toElement(),
          what = this@with.what,
          agent = this@with.agent.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var target: MutableList<Reference>? = null,
  public var occurredPeriod: Period? = null,
  public var occurredDateTime: String? = null,
  public var _occurredDateTime: Element? = null,
  public var recorded: String? = null,
  public var _recorded: Element? = null,
  public var policy: MutableList<String?>? = null,
  public var _policy: MutableList<Element?>? = null,
  public var location: Reference? = null,
  public var authorization: MutableList<CodeableReference>? = null,
  public var activity: CodeableConcept? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var patient: Reference? = null,
  public var encounter: Reference? = null,
  public var agent: MutableList<Provenance.Agent>? = null,
  public var entity: MutableList<Provenance.Entity>? = null,
  public var signature: MutableList<Signature>? = null,
) {
  public fun toModel(): Provenance =
    Provenance(
      id = this@ProvenanceSurrogate.id,
      meta = this@ProvenanceSurrogate.meta,
      implicitRules =
        Uri.of(this@ProvenanceSurrogate.implicitRules, this@ProvenanceSurrogate._implicitRules),
      language = Code.of(this@ProvenanceSurrogate.language, this@ProvenanceSurrogate._language),
      text = this@ProvenanceSurrogate.text,
      contained = this@ProvenanceSurrogate.contained ?: mutableListOf(),
      extension = this@ProvenanceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProvenanceSurrogate.modifierExtension ?: mutableListOf(),
      target = this@ProvenanceSurrogate.target ?: mutableListOf(),
      occurred =
        Provenance.Occurred?.from(
          this@ProvenanceSurrogate.occurredPeriod,
          DateTime.of(
            FhirDateTime.fromString(this@ProvenanceSurrogate.occurredDateTime),
            this@ProvenanceSurrogate._occurredDateTime,
          ),
        ),
      recorded =
        Instant.of(
          FhirDateTime.fromString(this@ProvenanceSurrogate.recorded),
          this@ProvenanceSurrogate._recorded,
        ),
      policy =
        if (this@ProvenanceSurrogate.policy == null && this@ProvenanceSurrogate._policy == null) {
          mutableListOf()
        } else {
          (this@ProvenanceSurrogate.policy
              ?: List(this@ProvenanceSurrogate._policy!!.size) { null })
            .zip(
              this@ProvenanceSurrogate._policy
                ?: List(this@ProvenanceSurrogate.policy!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      location = this@ProvenanceSurrogate.location,
      authorization = this@ProvenanceSurrogate.authorization ?: mutableListOf(),
      activity = this@ProvenanceSurrogate.activity,
      basedOn = this@ProvenanceSurrogate.basedOn ?: mutableListOf(),
      patient = this@ProvenanceSurrogate.patient,
      encounter = this@ProvenanceSurrogate.encounter,
      agent = this@ProvenanceSurrogate.agent ?: mutableListOf(),
      entity = this@ProvenanceSurrogate.entity ?: mutableListOf(),
      signature = this@ProvenanceSurrogate.signature ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Provenance): ProvenanceSurrogate =
      with(model) {
        ProvenanceSurrogate(
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
          target = this@with.target.takeUnless { it.all { it == null } },
          occurredPeriod = this@with.occurred?.asPeriod()?.value,
          occurredDateTime = this@with.occurred?.asDateTime()?.value?.value?.toString(),
          _occurredDateTime = this@with.occurred?.asDateTime()?.value?.toElement(),
          recorded = this@with.recorded?.value?.toString(),
          _recorded = this@with.recorded?.toElement(),
          policy =
            this@with.policy.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _policy =
            this@with.policy
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          location = this@with.location,
          authorization = this@with.authorization.takeUnless { it.all { it == null } },
          activity = this@with.activity,
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          patient = this@with.patient,
          encounter = this@with.encounter,
          agent = this@with.agent.takeUnless { it.all { it == null } },
          entity = this@with.entity.takeUnless { it.all { it == null } },
          signature = this@with.signature.takeUnless { it.all { it == null } },
        )
      }
  }
}
