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
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.HumanName
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Patient
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PatientContactSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var relationship: List<CodeableConcept?>? = null,
  public var name: HumanName? = null,
  public var telecom: List<ContactPoint?>? = null,
  public var address: Address? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var organization: Reference? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Patient.Contact =
    Patient.Contact().apply {
      id = this@PatientContactSurrogate.id
      extension = this@PatientContactSurrogate.extension
      modifierExtension = this@PatientContactSurrogate.modifierExtension
      relationship = this@PatientContactSurrogate.relationship
      name = this@PatientContactSurrogate.name
      telecom = this@PatientContactSurrogate.telecom
      address = this@PatientContactSurrogate.address
      gender =
        Enumeration.of(
          this@PatientContactSurrogate.gender?.let {
            com.google.fhir.model.r5.AdministrativeGender.fromCode(it)
          },
          this@PatientContactSurrogate._gender,
        )
      organization = this@PatientContactSurrogate.organization
      period = this@PatientContactSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Patient.Contact): PatientContactSurrogate =
      with(model) {
        PatientContactSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          relationship = this@with.relationship
          name = this@with.name
          telecom = this@with.telecom
          address = this@with.address
          gender = this@with.gender?.value?.getCode()
          _gender = this@with.gender?.toElement()
          organization = this@with.organization
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class PatientCommunicationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var language: CodeableConcept? = null,
  public var preferred: KotlinBoolean? = null,
  public var _preferred: Element? = null,
) {
  public fun toModel(): Patient.Communication =
    Patient.Communication().apply {
      id = this@PatientCommunicationSurrogate.id
      extension = this@PatientCommunicationSurrogate.extension
      modifierExtension = this@PatientCommunicationSurrogate.modifierExtension
      language = this@PatientCommunicationSurrogate.language
      preferred =
        R5Boolean.of(
          this@PatientCommunicationSurrogate.preferred,
          this@PatientCommunicationSurrogate._preferred,
        )
    }

  public companion object {
    public fun fromModel(model: Patient.Communication): PatientCommunicationSurrogate =
      with(model) {
        PatientCommunicationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          language = this@with.language
          preferred = this@with.preferred?.value
          _preferred = this@with.preferred?.toElement()
        }
      }
  }
}

@Serializable
internal data class PatientLinkSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var other: Reference? = null,
  public var type: String? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): Patient.Link =
    Patient.Link().apply {
      id = this@PatientLinkSurrogate.id
      extension = this@PatientLinkSurrogate.extension
      modifierExtension = this@PatientLinkSurrogate.modifierExtension
      other = this@PatientLinkSurrogate.other
      type =
        Enumeration.of(
          this@PatientLinkSurrogate.type?.let {
            com.google.fhir.model.r5.Patient.LinkType.fromCode(it)
          },
          this@PatientLinkSurrogate._type,
        )
    }

  public companion object {
    public fun fromModel(model: Patient.Link): PatientLinkSurrogate =
      with(model) {
        PatientLinkSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          other = this@with.other
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
        }
      }
  }
}

@Serializable
internal class PatientDeceasedSurrogate {
  public var deceasedBoolean: KotlinBoolean? = null

  public var _deceasedBoolean: Element? = null

  public var deceasedDateTime: String? = null

  public var _deceasedDateTime: Element? = null

  public fun toModel(): Patient.Deceased =
    Patient.Deceased?.from(
      R5Boolean.of(
        this@PatientDeceasedSurrogate.deceasedBoolean,
        this@PatientDeceasedSurrogate._deceasedBoolean,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@PatientDeceasedSurrogate.deceasedDateTime),
        this@PatientDeceasedSurrogate._deceasedDateTime,
      ),
    ) ?: Patient.Deceased.Null

  public companion object {
    public fun fromModel(model: Patient.Deceased): PatientDeceasedSurrogate =
      with(model) {
        PatientDeceasedSurrogate().apply {
          deceasedBoolean = this@with.asBoolean()?.value?.value
          _deceasedBoolean = this@with.asBoolean()?.value?.toElement()
          deceasedDateTime = this@with.asDateTime()?.value?.value?.toString()
          _deceasedDateTime = this@with.asDateTime()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal class PatientMultipleBirthSurrogate {
  public var multipleBirthBoolean: KotlinBoolean? = null

  public var _multipleBirthBoolean: Element? = null

  public var multipleBirthInteger: Int? = null

  public var _multipleBirthInteger: Element? = null

  public fun toModel(): Patient.MultipleBirth =
    Patient.MultipleBirth?.from(
      R5Boolean.of(
        this@PatientMultipleBirthSurrogate.multipleBirthBoolean,
        this@PatientMultipleBirthSurrogate._multipleBirthBoolean,
      ),
      Integer.of(
        this@PatientMultipleBirthSurrogate.multipleBirthInteger,
        this@PatientMultipleBirthSurrogate._multipleBirthInteger,
      ),
    ) ?: Patient.MultipleBirth.Null

  public companion object {
    public fun fromModel(model: Patient.MultipleBirth): PatientMultipleBirthSurrogate =
      with(model) {
        PatientMultipleBirthSurrogate().apply {
          multipleBirthBoolean = this@with.asBoolean()?.value?.value
          _multipleBirthBoolean = this@with.asBoolean()?.value?.toElement()
          multipleBirthInteger = this@with.asInteger()?.value?.value
          _multipleBirthInteger = this@with.asInteger()?.value?.toElement()
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var name: List<HumanName?>? = null,
  public var telecom: List<ContactPoint?>? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var birthDate: String? = null,
  public var _birthDate: Element? = null,
  public var address: List<Address?>? = null,
  public var maritalStatus: CodeableConcept? = null,
  public var photo: List<Attachment?>? = null,
  public var contact: List<Patient.Contact>? = null,
  public var communication: List<Patient.Communication>? = null,
  public var generalPractitioner: List<Reference?>? = null,
  public var managingOrganization: Reference? = null,
  public var link: List<Patient.Link>? = null,
  public var deceased: Patient.Deceased? = null,
  public var multipleBirth: Patient.MultipleBirth? = null,
) {
  public fun toModel(): Patient =
    Patient().apply {
      id = this@PatientSurrogate.id
      meta = this@PatientSurrogate.meta
      implicitRules =
        Uri.of(this@PatientSurrogate.implicitRules, this@PatientSurrogate._implicitRules)
      language = Code.of(this@PatientSurrogate.language, this@PatientSurrogate._language)
      text = this@PatientSurrogate.text
      contained = this@PatientSurrogate.contained
      extension = this@PatientSurrogate.extension
      modifierExtension = this@PatientSurrogate.modifierExtension
      identifier = this@PatientSurrogate.identifier
      active = R5Boolean.of(this@PatientSurrogate.active, this@PatientSurrogate._active)
      name = this@PatientSurrogate.name
      telecom = this@PatientSurrogate.telecom
      gender =
        Enumeration.of(
          this@PatientSurrogate.gender?.let {
            com.google.fhir.model.r5.AdministrativeGender.fromCode(it)
          },
          this@PatientSurrogate._gender,
        )
      birthDate =
        Date.of(
          FhirDate.fromString(this@PatientSurrogate.birthDate),
          this@PatientSurrogate._birthDate,
        )
      deceased = this@PatientSurrogate.deceased
      address = this@PatientSurrogate.address
      maritalStatus = this@PatientSurrogate.maritalStatus
      multipleBirth = this@PatientSurrogate.multipleBirth
      photo = this@PatientSurrogate.photo
      contact = this@PatientSurrogate.contact
      communication = this@PatientSurrogate.communication
      generalPractitioner = this@PatientSurrogate.generalPractitioner
      managingOrganization = this@PatientSurrogate.managingOrganization
      link = this@PatientSurrogate.link
    }

  public companion object {
    public fun fromModel(model: Patient): PatientSurrogate =
      with(model) {
        PatientSurrogate().apply {
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
          identifier = this@with.identifier
          active = this@with.active?.value
          _active = this@with.active?.toElement()
          name = this@with.name
          telecom = this@with.telecom
          gender = this@with.gender?.value?.getCode()
          _gender = this@with.gender?.toElement()
          birthDate = this@with.birthDate?.value?.toString()
          _birthDate = this@with.birthDate?.toElement()
          deceased = this@with.deceased
          address = this@with.address
          maritalStatus = this@with.maritalStatus
          multipleBirth = this@with.multipleBirth
          photo = this@with.photo
          contact = this@with.contact
          communication = this@with.communication
          generalPractitioner = this@with.generalPractitioner
          managingOrganization = this@with.managingOrganization
          link = this@with.link
        }
      }
  }
}
