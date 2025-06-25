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
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.HumanName
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Practitioner
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
internal data class PractitionerQualificationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var code: CodeableConcept? = null,
  public var period: Period? = null,
  public var issuer: Reference? = null,
) {
  public fun toModel(): Practitioner.Qualification =
    Practitioner.Qualification().apply {
      id = this@PractitionerQualificationSurrogate.id
      extension = this@PractitionerQualificationSurrogate.extension
      modifierExtension = this@PractitionerQualificationSurrogate.modifierExtension
      identifier = this@PractitionerQualificationSurrogate.identifier
      code = this@PractitionerQualificationSurrogate.code
      period = this@PractitionerQualificationSurrogate.period
      issuer = this@PractitionerQualificationSurrogate.issuer
    }

  public companion object {
    public fun fromModel(model: Practitioner.Qualification): PractitionerQualificationSurrogate =
      with(model) {
        PractitionerQualificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          code = this@with.code
          period = this@with.period
          issuer = this@with.issuer
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var name: List<HumanName?>? = null,
  public var telecom: List<ContactPoint?>? = null,
  public var address: List<Address?>? = null,
  public var gender: String? = null,
  public var _gender: Element? = null,
  public var birthDate: String? = null,
  public var _birthDate: Element? = null,
  public var photo: List<Attachment?>? = null,
  public var qualification: List<Practitioner.Qualification>? = null,
  public var communication: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Practitioner =
    Practitioner().apply {
      id = this@PractitionerSurrogate.id
      meta = this@PractitionerSurrogate.meta
      implicitRules =
        Uri.of(this@PractitionerSurrogate.implicitRules, this@PractitionerSurrogate._implicitRules)
      language = Code.of(this@PractitionerSurrogate.language, this@PractitionerSurrogate._language)
      text = this@PractitionerSurrogate.text
      contained = this@PractitionerSurrogate.contained
      extension = this@PractitionerSurrogate.extension
      modifierExtension = this@PractitionerSurrogate.modifierExtension
      identifier = this@PractitionerSurrogate.identifier
      active = R4bBoolean.of(this@PractitionerSurrogate.active, this@PractitionerSurrogate._active)
      name = this@PractitionerSurrogate.name
      telecom = this@PractitionerSurrogate.telecom
      address = this@PractitionerSurrogate.address
      gender =
        Enumeration.of(
          this@PractitionerSurrogate.gender?.let {
            com.google.fhir.model.r4b.AdministrativeGender.fromCode(it)
          },
          this@PractitionerSurrogate._gender,
        )
      birthDate =
        Date.of(
          FhirDate.fromString(this@PractitionerSurrogate.birthDate),
          this@PractitionerSurrogate._birthDate,
        )
      photo = this@PractitionerSurrogate.photo
      qualification = this@PractitionerSurrogate.qualification
      communication = this@PractitionerSurrogate.communication
    }

  public companion object {
    public fun fromModel(model: Practitioner): PractitionerSurrogate =
      with(model) {
        PractitionerSurrogate().apply {
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
          address = this@with.address
          gender = this@with.gender?.value?.getCode()
          _gender = this@with.gender?.toElement()
          birthDate = this@with.birthDate?.value?.toString()
          _birthDate = this@with.birthDate?.toElement()
          photo = this@with.photo
          qualification = this@with.qualification
          communication = this@with.communication
        }
      }
  }
}
