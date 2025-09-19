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

import com.google.fhir.model.r4.Address
import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactPoint
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.HumanName
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Practitioner
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import com.google.fhir.model.r4.terminologies.AdministrativeGender
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PractitionerQualificationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var code: CodeableConcept,
  public var period: Period? = null,
  public var issuer: Reference? = null,
) {
  public fun toModel(): Practitioner.Qualification =
    Practitioner.Qualification(
      id = this@PractitionerQualificationSurrogate.id,
      extension = this@PractitionerQualificationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PractitionerQualificationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PractitionerQualificationSurrogate.identifier ?: mutableListOf(),
      code = this@PractitionerQualificationSurrogate.code,
      period = this@PractitionerQualificationSurrogate.period,
      issuer = this@PractitionerQualificationSurrogate.issuer,
    )

  public companion object {
    public fun fromModel(model: Practitioner.Qualification): PractitionerQualificationSurrogate =
      with(model) {
        PractitionerQualificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          code = this@with.code,
          period = this@with.period,
          issuer = this@with.issuer,
        )
      }
  }
}

@Serializable
internal data class PractitionerSurrogate(
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
  public var name: MutableList<HumanName>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var address: MutableList<Address>? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var birthDate: String? = null,
  public var _birthDate: Element? = null,
  public var photo: MutableList<Attachment>? = null,
  public var qualification: MutableList<Practitioner.Qualification>? = null,
  public var communication: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): Practitioner =
    Practitioner(
      id = this@PractitionerSurrogate.id,
      meta = this@PractitionerSurrogate.meta,
      implicitRules =
        Uri.of(this@PractitionerSurrogate.implicitRules, this@PractitionerSurrogate._implicitRules),
      language = Code.of(this@PractitionerSurrogate.language, this@PractitionerSurrogate._language),
      text = this@PractitionerSurrogate.text,
      contained = this@PractitionerSurrogate.contained ?: mutableListOf(),
      extension = this@PractitionerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PractitionerSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PractitionerSurrogate.identifier ?: mutableListOf(),
      active = R4Boolean.of(this@PractitionerSurrogate.active, this@PractitionerSurrogate._active),
      name = this@PractitionerSurrogate.name ?: mutableListOf(),
      telecom = this@PractitionerSurrogate.telecom ?: mutableListOf(),
      address = this@PractitionerSurrogate.address ?: mutableListOf(),
      gender =
        this@PractitionerSurrogate.gender?.let {
          Enumeration.of(AdministrativeGender.fromCode(it), this@PractitionerSurrogate._gender)
        },
      birthDate =
        Date.of(
          FhirDate.fromString(this@PractitionerSurrogate.birthDate),
          this@PractitionerSurrogate._birthDate,
        ),
      photo = this@PractitionerSurrogate.photo ?: mutableListOf(),
      qualification = this@PractitionerSurrogate.qualification ?: mutableListOf(),
      communication = this@PractitionerSurrogate.communication ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Practitioner): PractitionerSurrogate =
      with(model) {
        PractitionerSurrogate(
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
          active = this@with.active?.value,
          _active = this@with.active?.toElement(),
          name = this@with.name.takeIf { it.isNotEmpty() },
          telecom = this@with.telecom.takeIf { it.isNotEmpty() },
          address = this@with.address.takeIf { it.isNotEmpty() },
          gender = this@with.gender?.value?.getCode(),
          _gender = this@with.gender?.toElement(),
          birthDate = this@with.birthDate?.value?.toString(),
          _birthDate = this@with.birthDate?.toElement(),
          photo = this@with.photo.takeIf { it.isNotEmpty() },
          qualification = this@with.qualification.takeIf { it.isNotEmpty() },
          communication = this@with.communication.takeIf { it.isNotEmpty() },
        )
      }
  }
}
