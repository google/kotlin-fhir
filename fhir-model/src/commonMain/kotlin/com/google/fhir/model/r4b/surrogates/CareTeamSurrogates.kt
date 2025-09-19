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
import com.google.fhir.model.r4b.CareTeam
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
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
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CareTeamParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: MutableList<CodeableConcept>? = null,
  public var member: Reference? = null,
  public var onBehalfOf: Reference? = null,
  public var period: Period? = null,
) {
  public fun toModel(): CareTeam.Participant =
    CareTeam.Participant(
      id = this@CareTeamParticipantSurrogate.id,
      extension = this@CareTeamParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CareTeamParticipantSurrogate.modifierExtension ?: mutableListOf(),
      role = this@CareTeamParticipantSurrogate.role ?: mutableListOf(),
      member = this@CareTeamParticipantSurrogate.member,
      onBehalfOf = this@CareTeamParticipantSurrogate.onBehalfOf,
      period = this@CareTeamParticipantSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: CareTeam.Participant): CareTeamParticipantSurrogate =
      with(model) {
        CareTeamParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          role = this@with.role.takeIf { it.isNotEmpty() },
          member = this@with.member,
          onBehalfOf = this@with.onBehalfOf,
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class CareTeamSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var period: Period? = null,
  public var participant: MutableList<CareTeam.Participant>? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var managingOrganization: MutableList<Reference>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): CareTeam =
    CareTeam(
      id = this@CareTeamSurrogate.id,
      meta = this@CareTeamSurrogate.meta,
      implicitRules =
        Uri.of(this@CareTeamSurrogate.implicitRules, this@CareTeamSurrogate._implicitRules),
      language = Code.of(this@CareTeamSurrogate.language, this@CareTeamSurrogate._language),
      text = this@CareTeamSurrogate.text,
      contained = this@CareTeamSurrogate.contained ?: mutableListOf(),
      extension = this@CareTeamSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CareTeamSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CareTeamSurrogate.identifier ?: mutableListOf(),
      status =
        this@CareTeamSurrogate.status?.let {
          Enumeration.of(CareTeam.CareTeamStatus.fromCode(it), this@CareTeamSurrogate._status)
        },
      category = this@CareTeamSurrogate.category ?: mutableListOf(),
      name = R4bString.of(this@CareTeamSurrogate.name, this@CareTeamSurrogate._name),
      subject = this@CareTeamSurrogate.subject,
      encounter = this@CareTeamSurrogate.encounter,
      period = this@CareTeamSurrogate.period,
      participant = this@CareTeamSurrogate.participant ?: mutableListOf(),
      reasonCode = this@CareTeamSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@CareTeamSurrogate.reasonReference ?: mutableListOf(),
      managingOrganization = this@CareTeamSurrogate.managingOrganization ?: mutableListOf(),
      telecom = this@CareTeamSurrogate.telecom ?: mutableListOf(),
      note = this@CareTeamSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CareTeam): CareTeamSurrogate =
      with(model) {
        CareTeamSurrogate(
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
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          category = this@with.category.takeIf { it.isNotEmpty() },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          period = this@with.period,
          participant = this@with.participant.takeIf { it.isNotEmpty() },
          reasonCode = this@with.reasonCode.takeIf { it.isNotEmpty() },
          reasonReference = this@with.reasonReference.takeIf { it.isNotEmpty() },
          managingOrganization = this@with.managingOrganization.takeIf { it.isNotEmpty() },
          telecom = this@with.telecom.takeIf { it.isNotEmpty() },
          note = this@with.note.takeIf { it.isNotEmpty() },
        )
      }
  }
}
