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

import com.google.fhir.model.r5.Availability
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PractitionerRole
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PractitionerRoleSurrogate(
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
  public var period: Period? = null,
  public var practitioner: Reference? = null,
  public var organization: Reference? = null,
  public var code: List<CodeableConcept?>? = null,
  public var specialty: List<CodeableConcept?>? = null,
  public var location: List<Reference?>? = null,
  public var healthcareService: List<Reference?>? = null,
  public var contact: List<ExtendedContactDetail?>? = null,
  public var characteristic: List<CodeableConcept?>? = null,
  public var communication: List<CodeableConcept?>? = null,
  public var availability: List<Availability?>? = null,
  public var endpoint: List<Reference?>? = null,
) {
  public fun toModel(): PractitionerRole =
    PractitionerRole().apply {
      id = this@PractitionerRoleSurrogate.id
      meta = this@PractitionerRoleSurrogate.meta
      implicitRules =
        Uri.of(
          this@PractitionerRoleSurrogate.implicitRules,
          this@PractitionerRoleSurrogate._implicitRules,
        )
      language =
        Code.of(this@PractitionerRoleSurrogate.language, this@PractitionerRoleSurrogate._language)
      text = this@PractitionerRoleSurrogate.text
      contained = this@PractitionerRoleSurrogate.contained
      extension = this@PractitionerRoleSurrogate.extension
      modifierExtension = this@PractitionerRoleSurrogate.modifierExtension
      identifier = this@PractitionerRoleSurrogate.identifier
      active =
        R5Boolean.of(this@PractitionerRoleSurrogate.active, this@PractitionerRoleSurrogate._active)
      period = this@PractitionerRoleSurrogate.period
      practitioner = this@PractitionerRoleSurrogate.practitioner
      organization = this@PractitionerRoleSurrogate.organization
      code = this@PractitionerRoleSurrogate.code
      specialty = this@PractitionerRoleSurrogate.specialty
      location = this@PractitionerRoleSurrogate.location
      healthcareService = this@PractitionerRoleSurrogate.healthcareService
      contact = this@PractitionerRoleSurrogate.contact
      characteristic = this@PractitionerRoleSurrogate.characteristic
      communication = this@PractitionerRoleSurrogate.communication
      availability = this@PractitionerRoleSurrogate.availability
      endpoint = this@PractitionerRoleSurrogate.endpoint
    }

  public companion object {
    public fun fromModel(model: PractitionerRole): PractitionerRoleSurrogate =
      with(model) {
        PractitionerRoleSurrogate().apply {
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
          period = this@with.period
          practitioner = this@with.practitioner
          organization = this@with.organization
          code = this@with.code
          specialty = this@with.specialty
          location = this@with.location
          healthcareService = this@with.healthcareService
          contact = this@with.contact
          characteristic = this@with.characteristic
          communication = this@with.communication
          availability = this@with.availability
          endpoint = this@with.endpoint
        }
      }
  }
}
