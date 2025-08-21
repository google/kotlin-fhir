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

import com.google.fhir.model.r5.Address
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.ContactPoint
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.HumanName
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedPerson
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
internal data class RelatedPersonCommunicationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var language: CodeableConcept,
  public var preferred: KotlinBoolean? = null,
  public var _preferred: Element? = null,
) {
  public fun toModel(): RelatedPerson.Communication =
    RelatedPerson.Communication(
      id = this@RelatedPersonCommunicationSurrogate.id,
      extension = this@RelatedPersonCommunicationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RelatedPersonCommunicationSurrogate.modifierExtension ?: mutableListOf(),
      language = this@RelatedPersonCommunicationSurrogate.language,
      preferred =
        R5Boolean.of(
          this@RelatedPersonCommunicationSurrogate.preferred,
          this@RelatedPersonCommunicationSurrogate._preferred,
        ),
    )

  public companion object {
    public fun fromModel(model: RelatedPerson.Communication): RelatedPersonCommunicationSurrogate =
      with(model) {
        RelatedPersonCommunicationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          language = this@with.language,
          preferred = this@with.preferred?.value,
          _preferred = this@with.preferred?.toElement(),
        )
      }
  }
}

@Serializable
internal data class RelatedPersonSurrogate(
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
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var patient: Reference,
  public var relationship: MutableList<CodeableConcept>? = null,
  public var name: MutableList<HumanName>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var birthDate: String? = null,
  public var _birthDate: Element? = null,
  public var address: MutableList<Address>? = null,
  public var photo: MutableList<Attachment>? = null,
  public var period: Period? = null,
  public var communication: MutableList<RelatedPerson.Communication>? = null,
) {
  public fun toModel(): RelatedPerson =
    RelatedPerson(
      id = this@RelatedPersonSurrogate.id,
      meta = this@RelatedPersonSurrogate.meta,
      implicitRules =
        Uri.of(
          this@RelatedPersonSurrogate.implicitRules,
          this@RelatedPersonSurrogate._implicitRules,
        ),
      language =
        Code.of(this@RelatedPersonSurrogate.language, this@RelatedPersonSurrogate._language),
      text = this@RelatedPersonSurrogate.text,
      contained = this@RelatedPersonSurrogate.contained ?: mutableListOf(),
      extension = this@RelatedPersonSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@RelatedPersonSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@RelatedPersonSurrogate.identifier ?: mutableListOf(),
      active =
        R5Boolean.of(this@RelatedPersonSurrogate.active, this@RelatedPersonSurrogate._active),
      patient = this@RelatedPersonSurrogate.patient,
      relationship = this@RelatedPersonSurrogate.relationship ?: mutableListOf(),
      name = this@RelatedPersonSurrogate.name ?: mutableListOf(),
      telecom = this@RelatedPersonSurrogate.telecom ?: mutableListOf(),
      gender =
        this@RelatedPersonSurrogate.gender?.let {
          Enumeration.of(
            com.google.fhir.model.r5.terminologies.AdministrativeGender.fromCode(it!!),
            this@RelatedPersonSurrogate._gender,
          )
        },
      birthDate =
        Date.of(
          FhirDate.fromString(this@RelatedPersonSurrogate.birthDate),
          this@RelatedPersonSurrogate._birthDate,
        ),
      address = this@RelatedPersonSurrogate.address ?: mutableListOf(),
      photo = this@RelatedPersonSurrogate.photo ?: mutableListOf(),
      period = this@RelatedPersonSurrogate.period,
      communication = this@RelatedPersonSurrogate.communication ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: RelatedPerson): RelatedPersonSurrogate =
      with(model) {
        RelatedPersonSurrogate(
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
          active = this@with.active?.value,
          _active = this@with.active?.toElement(),
          patient = this@with.patient,
          relationship = this@with.relationship.takeUnless { it.all { it == null } },
          name = this@with.name.takeUnless { it.all { it == null } },
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          gender = this@with.gender?.value?.getCode(),
          _gender = this@with.gender?.toElement(),
          birthDate = this@with.birthDate?.value?.toString(),
          _birthDate = this@with.birthDate?.toElement(),
          address = this@with.address.takeUnless { it.all { it == null } },
          photo = this@with.photo.takeUnless { it.all { it == null } },
          period = this@with.period,
          communication = this@with.communication.takeUnless { it.all { it == null } },
        )
      }
  }
}
