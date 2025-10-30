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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProvenanceAgentSurrogate(
  public var id: String? = null,
  public var extension: List<Extension>? = null,
  public var modifierExtension: List<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var role: List<CodeableConcept>? = null,
  public var who: Reference,
  public var onBehalfOf: Reference? = null,
) {
  public fun toModel(): Provenance.Agent =
    Provenance.Agent(
      id = this@ProvenanceAgentSurrogate.id,
      extension = this@ProvenanceAgentSurrogate.extension ?: listOf(),
      modifierExtension = this@ProvenanceAgentSurrogate.modifierExtension ?: listOf(),
      type = this@ProvenanceAgentSurrogate.type,
      role = this@ProvenanceAgentSurrogate.role ?: listOf(),
      who = this@ProvenanceAgentSurrogate.who,
      onBehalfOf = this@ProvenanceAgentSurrogate.onBehalfOf,
    )

  public companion object {
    public fun fromModel(model: Provenance.Agent): ProvenanceAgentSurrogate =
      with(model) {
        ProvenanceAgentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          type = this@with.type,
          role = this@with.role.takeIf { it.isNotEmpty() },
          who = this@with.who,
          onBehalfOf = this@with.onBehalfOf,
        )
      }
  }
}

@Serializable
internal data class ProvenanceEntitySurrogate(
  public var id: String? = null,
  public var extension: List<Extension>? = null,
  public var modifierExtension: List<Extension>? = null,
  public var role: String? = null,
  public var _role: Element? = null,
  public var what: Reference,
  public var agent: List<Provenance.Agent>? = null,
) {
  public fun toModel(): Provenance.Entity =
    Provenance.Entity(
      id = this@ProvenanceEntitySurrogate.id,
      extension = this@ProvenanceEntitySurrogate.extension ?: listOf(),
      modifierExtension = this@ProvenanceEntitySurrogate.modifierExtension ?: listOf(),
      role =
        Enumeration.of(
          Provenance.ProvenanceEntityRole.fromCode(this@ProvenanceEntitySurrogate.role!!),
          this@ProvenanceEntitySurrogate._role,
        ),
      what = this@ProvenanceEntitySurrogate.what,
      agent = this@ProvenanceEntitySurrogate.agent ?: listOf(),
    )

  public companion object {
    public fun fromModel(model: Provenance.Entity): ProvenanceEntitySurrogate =
      with(model) {
        ProvenanceEntitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          role = this@with.role.value?.getCode(),
          _role = this@with.role.toElement(),
          what = this@with.what,
          agent = this@with.agent.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class ProvenanceOccurredSurrogate(
  public var occurredPeriod: Period? = null,
  public var occurredDateTime: String? = null,
  public var _occurredDateTime: Element? = null,
) {
  public fun toModel(): Provenance.Occurred =
    Provenance.Occurred.from(
      this@ProvenanceOccurredSurrogate.occurredPeriod,
      DateTime.of(
        FhirDateTime.fromString(this@ProvenanceOccurredSurrogate.occurredDateTime),
        this@ProvenanceOccurredSurrogate._occurredDateTime,
      ),
    )!!

  public companion object {
    public fun fromModel(model: Provenance.Occurred): ProvenanceOccurredSurrogate =
      with(model) {
        ProvenanceOccurredSurrogate(
          occurredPeriod = this@with.asPeriod()?.value,
          occurredDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurredDateTime = this@with.asDateTime()?.value?.toElement(),
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
  public var contained: List<Resource>? = null,
  public var extension: List<Extension>? = null,
  public var modifierExtension: List<Extension>? = null,
  public var target: List<Reference>? = null,
  public var occurred: Provenance.Occurred? = null,
  public var recorded: String? = null,
  public var _recorded: Element? = null,
  public var policy: List<String?>? = null,
  public var _policy: List<Element?>? = null,
  public var location: Reference? = null,
  public var authorization: List<CodeableReference>? = null,
  public var activity: CodeableConcept? = null,
  public var basedOn: List<Reference>? = null,
  public var patient: Reference? = null,
  public var encounter: Reference? = null,
  public var agent: List<Provenance.Agent>? = null,
  public var entity: List<Provenance.Entity>? = null,
  public var signature: List<Signature>? = null,
) {
  public fun toModel(): Provenance =
    Provenance(
      id = this@ProvenanceSurrogate.id,
      meta = this@ProvenanceSurrogate.meta,
      implicitRules =
        Uri.of(this@ProvenanceSurrogate.implicitRules, this@ProvenanceSurrogate._implicitRules),
      language = Code.of(this@ProvenanceSurrogate.language, this@ProvenanceSurrogate._language),
      text = this@ProvenanceSurrogate.text,
      contained = this@ProvenanceSurrogate.contained ?: listOf(),
      extension = this@ProvenanceSurrogate.extension ?: listOf(),
      modifierExtension = this@ProvenanceSurrogate.modifierExtension ?: listOf(),
      target = this@ProvenanceSurrogate.target ?: listOf(),
      occurred = this@ProvenanceSurrogate.occurred,
      recorded =
        Instant.of(
          FhirDateTime.fromString(this@ProvenanceSurrogate.recorded),
          this@ProvenanceSurrogate._recorded,
        ),
      policy =
        if (this@ProvenanceSurrogate.policy == null && this@ProvenanceSurrogate._policy == null) {
          listOf()
        } else {
          (this@ProvenanceSurrogate.policy
              ?: List(this@ProvenanceSurrogate._policy!!.size) { null })
            .zip(
              this@ProvenanceSurrogate._policy
                ?: List(this@ProvenanceSurrogate.policy!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toList()
        },
      location = this@ProvenanceSurrogate.location,
      authorization = this@ProvenanceSurrogate.authorization ?: listOf(),
      activity = this@ProvenanceSurrogate.activity,
      basedOn = this@ProvenanceSurrogate.basedOn ?: listOf(),
      patient = this@ProvenanceSurrogate.patient,
      encounter = this@ProvenanceSurrogate.encounter,
      agent = this@ProvenanceSurrogate.agent ?: listOf(),
      entity = this@ProvenanceSurrogate.entity ?: listOf(),
      signature = this@ProvenanceSurrogate.signature ?: listOf(),
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
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          target = this@with.target.takeIf { it.isNotEmpty() },
          occurred = this@with.occurred,
          recorded = this@with.recorded?.value?.toString(),
          _recorded = this@with.recorded?.toElement(),
          policy = this@with.policy.map { it.value }.toList().takeUnless { it.all { it == null } },
          _policy =
            this@with.policy
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toList(),
          location = this@with.location,
          authorization = this@with.authorization.takeIf { it.isNotEmpty() },
          activity = this@with.activity,
          basedOn = this@with.basedOn.takeIf { it.isNotEmpty() },
          patient = this@with.patient,
          encounter = this@with.encounter,
          agent = this@with.agent.takeIf { it.isNotEmpty() },
          entity = this@with.entity.takeIf { it.isNotEmpty() },
          signature = this@with.signature.takeIf { it.isNotEmpty() },
        )
      }
  }
}
