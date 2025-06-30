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
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.HumanName
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Person
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PersonLinkSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var target: Reference? = null,
  public var assurance: String? = null,
  public var _assurance: Element? = null,
) {
  public fun toModel(): Person.Link =
    Person.Link().apply {
      id = this@PersonLinkSurrogate.id
      extension = this@PersonLinkSurrogate.extension
      modifierExtension = this@PersonLinkSurrogate.modifierExtension
      target = this@PersonLinkSurrogate.target
      assurance =
        Enumeration.of(
          this@PersonLinkSurrogate.assurance?.let {
            com.google.fhir.model.r4b.Person.IdentityAssuranceLevel.fromCode(it)
          },
          this@PersonLinkSurrogate._assurance,
        )
    }

  public companion object {
    public fun fromModel(model: Person.Link): PersonLinkSurrogate =
      with(model) {
        PersonLinkSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          target = this@with.target
          assurance = this@with.assurance?.value?.getCode()
          _assurance = this@with.assurance?.toElement()
        }
      }
  }
}

@Serializable
internal data class PersonSurrogate(
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
  public var name: List<HumanName?>? = null,
  public var telecom: List<ContactPoint?>? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var birthDate: String? = null,
  public var _birthDate: Element? = null,
  public var address: List<Address?>? = null,
  public var photo: Attachment? = null,
  public var managingOrganization: Reference? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var link: List<Person.Link>? = null,
) {
  public fun toModel(): Person =
    Person().apply {
      id = this@PersonSurrogate.id
      meta = this@PersonSurrogate.meta
      implicitRules =
        Uri.of(this@PersonSurrogate.implicitRules, this@PersonSurrogate._implicitRules)
      language = Code.of(this@PersonSurrogate.language, this@PersonSurrogate._language)
      text = this@PersonSurrogate.text
      contained = this@PersonSurrogate.contained
      extension = this@PersonSurrogate.extension
      modifierExtension = this@PersonSurrogate.modifierExtension
      identifier = this@PersonSurrogate.identifier
      name = this@PersonSurrogate.name
      telecom = this@PersonSurrogate.telecom
      gender =
        Enumeration.of(
          this@PersonSurrogate.gender?.let {
            com.google.fhir.model.r4b.AdministrativeGender.fromCode(it)
          },
          this@PersonSurrogate._gender,
        )
      birthDate =
        Date.of(
          FhirDate.fromString(this@PersonSurrogate.birthDate),
          this@PersonSurrogate._birthDate,
        )
      address = this@PersonSurrogate.address
      photo = this@PersonSurrogate.photo
      managingOrganization = this@PersonSurrogate.managingOrganization
      active = R4bBoolean.of(this@PersonSurrogate.active, this@PersonSurrogate._active)
      link = this@PersonSurrogate.link
    }

  public companion object {
    public fun fromModel(model: Person): PersonSurrogate =
      with(model) {
        PersonSurrogate().apply {
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
          name = this@with.name
          telecom = this@with.telecom
          gender = this@with.gender?.value?.getCode()
          _gender = this@with.gender?.toElement()
          birthDate = this@with.birthDate?.value?.toString()
          _birthDate = this@with.birthDate?.toElement()
          address = this@with.address
          photo = this@with.photo
          managingOrganization = this@with.managingOrganization
          active = this@with.active?.value
          _active = this@with.active?.toElement()
          link = this@with.link
        }
      }
  }
}
