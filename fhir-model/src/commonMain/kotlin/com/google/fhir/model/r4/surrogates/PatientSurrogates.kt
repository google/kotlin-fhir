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
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.HumanName
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Patient
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PatientContactSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var relationship: MutableList<CodeableConcept>? = null,
  public var name: HumanName? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var address: Address? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var organization: Reference? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Patient.Contact =
    Patient.Contact(
      id = this@PatientContactSurrogate.id,
      extension = this@PatientContactSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PatientContactSurrogate.modifierExtension ?: mutableListOf(),
      relationship = this@PatientContactSurrogate.relationship ?: mutableListOf(),
      name = this@PatientContactSurrogate.name,
      telecom = this@PatientContactSurrogate.telecom ?: mutableListOf(),
      address = this@PatientContactSurrogate.address,
      gender =
        this@PatientContactSurrogate.gender?.let {
          Enumeration.of(
            com.google.fhir.model.r4.terminologies.AdministrativeGender.fromCode(it!!),
            this@PatientContactSurrogate._gender,
          )
        },
      organization = this@PatientContactSurrogate.organization,
      period = this@PatientContactSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: Patient.Contact): PatientContactSurrogate =
      with(model) {
        PatientContactSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          relationship = this@with.relationship.takeUnless { it.all { it == null } },
          name = this@with.name,
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          address = this@with.address,
          gender = this@with.gender?.value?.getCode(),
          _gender = this@with.gender?.toElement(),
          organization = this@with.organization,
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class PatientCommunicationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var language: CodeableConcept,
  public var preferred: KotlinBoolean? = null,
  public var _preferred: Element? = null,
) {
  public fun toModel(): Patient.Communication =
    Patient.Communication(
      id = this@PatientCommunicationSurrogate.id,
      extension = this@PatientCommunicationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PatientCommunicationSurrogate.modifierExtension ?: mutableListOf(),
      language = this@PatientCommunicationSurrogate.language,
      preferred =
        R4Boolean.of(
          this@PatientCommunicationSurrogate.preferred,
          this@PatientCommunicationSurrogate._preferred,
        ),
    )

  public companion object {
    public fun fromModel(model: Patient.Communication): PatientCommunicationSurrogate =
      with(model) {
        PatientCommunicationSurrogate(
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
internal data class PatientLinkSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var other: Reference,
  public var type: String? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): Patient.Link =
    Patient.Link(
      id = this@PatientLinkSurrogate.id,
      extension = this@PatientLinkSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PatientLinkSurrogate.modifierExtension ?: mutableListOf(),
      other = this@PatientLinkSurrogate.other,
      type =
        Enumeration.of(
          com.google.fhir.model.r4.Patient.LinkType.fromCode(this@PatientLinkSurrogate.type!!),
          this@PatientLinkSurrogate._type,
        ),
    )

  public companion object {
    public fun fromModel(model: Patient.Link): PatientLinkSurrogate =
      with(model) {
        PatientLinkSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          other = this@with.other,
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
        )
      }
  }
}

@Serializable
internal data class PatientDeceasedSurrogate(
  public var deceasedBoolean: KotlinBoolean? = null,
  public var _deceasedBoolean: Element? = null,
  public var deceasedDateTime: String? = null,
  public var _deceasedDateTime: Element? = null,
) {
  public fun toModel(): Patient.Deceased =
    Patient.Deceased?.from(
      R4Boolean.of(
        this@PatientDeceasedSurrogate.deceasedBoolean,
        this@PatientDeceasedSurrogate._deceasedBoolean,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@PatientDeceasedSurrogate.deceasedDateTime),
        this@PatientDeceasedSurrogate._deceasedDateTime,
      ),
    )!!

  public companion object {
    public fun fromModel(model: Patient.Deceased): PatientDeceasedSurrogate =
      with(model) {
        PatientDeceasedSurrogate(
          deceasedBoolean = this@with.asBoolean()?.value?.value,
          _deceasedBoolean = this@with.asBoolean()?.value?.toElement(),
          deceasedDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _deceasedDateTime = this@with.asDateTime()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class PatientMultipleBirthSurrogate(
  public var multipleBirthBoolean: KotlinBoolean? = null,
  public var _multipleBirthBoolean: Element? = null,
  public var multipleBirthInteger: Int? = null,
  public var _multipleBirthInteger: Element? = null,
) {
  public fun toModel(): Patient.MultipleBirth =
    Patient.MultipleBirth?.from(
      R4Boolean.of(
        this@PatientMultipleBirthSurrogate.multipleBirthBoolean,
        this@PatientMultipleBirthSurrogate._multipleBirthBoolean,
      ),
      Integer.of(
        this@PatientMultipleBirthSurrogate.multipleBirthInteger,
        this@PatientMultipleBirthSurrogate._multipleBirthInteger,
      ),
    )!!

  public companion object {
    public fun fromModel(model: Patient.MultipleBirth): PatientMultipleBirthSurrogate =
      with(model) {
        PatientMultipleBirthSurrogate(
          multipleBirthBoolean = this@with.asBoolean()?.value?.value,
          _multipleBirthBoolean = this@with.asBoolean()?.value?.toElement(),
          multipleBirthInteger = this@with.asInteger()?.value?.value,
          _multipleBirthInteger = this@with.asInteger()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class PatientSurrogate(
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
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var birthDate: String? = null,
  public var _birthDate: Element? = null,
  public var deceased: Patient.Deceased? = null,
  public var address: MutableList<Address>? = null,
  public var maritalStatus: CodeableConcept? = null,
  public var multipleBirth: Patient.MultipleBirth? = null,
  public var photo: MutableList<Attachment>? = null,
  public var contact: MutableList<Patient.Contact>? = null,
  public var communication: MutableList<Patient.Communication>? = null,
  public var generalPractitioner: MutableList<Reference>? = null,
  public var managingOrganization: Reference? = null,
  public var link: MutableList<Patient.Link>? = null,
) {
  public fun toModel(): Patient =
    Patient(
      id = this@PatientSurrogate.id,
      meta = this@PatientSurrogate.meta,
      implicitRules =
        Uri.of(this@PatientSurrogate.implicitRules, this@PatientSurrogate._implicitRules),
      language = Code.of(this@PatientSurrogate.language, this@PatientSurrogate._language),
      text = this@PatientSurrogate.text,
      contained = this@PatientSurrogate.contained ?: mutableListOf(),
      extension = this@PatientSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PatientSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PatientSurrogate.identifier ?: mutableListOf(),
      active = R4Boolean.of(this@PatientSurrogate.active, this@PatientSurrogate._active),
      name = this@PatientSurrogate.name ?: mutableListOf(),
      telecom = this@PatientSurrogate.telecom ?: mutableListOf(),
      gender =
        this@PatientSurrogate.gender?.let {
          Enumeration.of(
            com.google.fhir.model.r4.terminologies.AdministrativeGender.fromCode(it!!),
            this@PatientSurrogate._gender,
          )
        },
      birthDate =
        Date.of(
          FhirDate.fromString(this@PatientSurrogate.birthDate),
          this@PatientSurrogate._birthDate,
        ),
      deceased = this@PatientSurrogate.deceased,
      address = this@PatientSurrogate.address ?: mutableListOf(),
      maritalStatus = this@PatientSurrogate.maritalStatus,
      multipleBirth = this@PatientSurrogate.multipleBirth,
      photo = this@PatientSurrogate.photo ?: mutableListOf(),
      contact = this@PatientSurrogate.contact ?: mutableListOf(),
      communication = this@PatientSurrogate.communication ?: mutableListOf(),
      generalPractitioner = this@PatientSurrogate.generalPractitioner ?: mutableListOf(),
      managingOrganization = this@PatientSurrogate.managingOrganization,
      link = this@PatientSurrogate.link ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Patient): PatientSurrogate =
      with(model) {
        PatientSurrogate(
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
          name = this@with.name.takeUnless { it.all { it == null } },
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          gender = this@with.gender?.value?.getCode(),
          _gender = this@with.gender?.toElement(),
          birthDate = this@with.birthDate?.value?.toString(),
          _birthDate = this@with.birthDate?.toElement(),
          deceased = this@with.deceased,
          address = this@with.address.takeUnless { it.all { it == null } },
          maritalStatus = this@with.maritalStatus,
          multipleBirth = this@with.multipleBirth,
          photo = this@with.photo.takeUnless { it.all { it == null } },
          contact = this@with.contact.takeUnless { it.all { it == null } },
          communication = this@with.communication.takeUnless { it.all { it == null } },
          generalPractitioner = this@with.generalPractitioner.takeUnless { it.all { it == null } },
          managingOrganization = this@with.managingOrganization,
          link = this@with.link.takeUnless { it.all { it == null } },
        )
      }
  }
}
