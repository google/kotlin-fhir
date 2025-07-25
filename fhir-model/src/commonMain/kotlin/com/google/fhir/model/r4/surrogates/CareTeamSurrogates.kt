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
import com.google.fhir.model.r4.CareTeam
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactPoint
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
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
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role.takeUnless { it.all { it == null } },
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
          Enumeration.of(
            com.google.fhir.model.r4.CareTeam.CareTeamStatus.fromCode(it!!),
            this@CareTeamSurrogate._status,
          )
        },
      category = this@CareTeamSurrogate.category ?: mutableListOf(),
      name = R4String.of(this@CareTeamSurrogate.name, this@CareTeamSurrogate._name),
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
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          period = this@with.period,
          participant = this@with.participant.takeUnless { it.all { it == null } },
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          managingOrganization =
            this@with.managingOrganization.takeUnless { it.all { it == null } },
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
