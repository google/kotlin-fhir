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

import com.google.fhir.model.r4b.Address
import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.HumanName
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Patient
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
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
            com.google.fhir.model.r4b.AdministrativeGender.fromCode(it)
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
        R4bBoolean.of(
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
            com.google.fhir.model.r4b.Patient.LinkType.fromCode(it)
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
  public var deceasedBoolean: KotlinBoolean? = null,
  public var _deceasedBoolean: Element? = null,
  public var deceasedDateTime: String? = null,
  public var _deceasedDateTime: Element? = null,
  public var address: List<Address?>? = null,
  public var maritalStatus: CodeableConcept? = null,
  public var multipleBirthBoolean: KotlinBoolean? = null,
  public var _multipleBirthBoolean: Element? = null,
  public var multipleBirthInteger: Int? = null,
  public var _multipleBirthInteger: Element? = null,
  public var photo: List<Attachment?>? = null,
  public var contact: List<Patient.Contact>? = null,
  public var communication: List<Patient.Communication>? = null,
  public var generalPractitioner: List<Reference?>? = null,
  public var managingOrganization: Reference? = null,
  public var link: List<Patient.Link>? = null,
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
      active = R4bBoolean.of(this@PatientSurrogate.active, this@PatientSurrogate._active)
      name = this@PatientSurrogate.name
      telecom = this@PatientSurrogate.telecom
      gender =
        Enumeration.of(
          this@PatientSurrogate.gender?.let {
            com.google.fhir.model.r4b.AdministrativeGender.fromCode(it)
          },
          this@PatientSurrogate._gender,
        )
      birthDate =
        Date.of(
          FhirDate.fromString(this@PatientSurrogate.birthDate),
          this@PatientSurrogate._birthDate,
        )
      deceased =
        Patient.Deceased?.from(
          R4bBoolean.of(
            this@PatientSurrogate.deceasedBoolean,
            this@PatientSurrogate._deceasedBoolean,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@PatientSurrogate.deceasedDateTime),
            this@PatientSurrogate._deceasedDateTime,
          ),
        )
      address = this@PatientSurrogate.address
      maritalStatus = this@PatientSurrogate.maritalStatus
      multipleBirth =
        Patient.MultipleBirth?.from(
          R4bBoolean.of(
            this@PatientSurrogate.multipleBirthBoolean,
            this@PatientSurrogate._multipleBirthBoolean,
          ),
          Integer.of(
            this@PatientSurrogate.multipleBirthInteger,
            this@PatientSurrogate._multipleBirthInteger,
          ),
        )
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
          deceasedBoolean = this@with.deceased?.asBoolean()?.value?.value
          _deceasedBoolean = this@with.deceased?.asBoolean()?.value?.toElement()
          deceasedDateTime = this@with.deceased?.asDateTime()?.value?.value?.toString()
          _deceasedDateTime = this@with.deceased?.asDateTime()?.value?.toElement()
          address = this@with.address
          maritalStatus = this@with.maritalStatus
          multipleBirthBoolean = this@with.multipleBirth?.asBoolean()?.value?.value
          _multipleBirthBoolean = this@with.multipleBirth?.asBoolean()?.value?.toElement()
          multipleBirthInteger = this@with.multipleBirth?.asInteger()?.value?.value
          _multipleBirthInteger = this@with.multipleBirth?.asInteger()?.value?.toElement()
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
