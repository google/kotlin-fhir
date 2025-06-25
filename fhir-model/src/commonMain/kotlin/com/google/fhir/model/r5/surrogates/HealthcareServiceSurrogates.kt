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

import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Availability
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.HealthcareService
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class HealthcareServiceEligibilitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): HealthcareService.Eligibility =
    HealthcareService.Eligibility().apply {
      id = this@HealthcareServiceEligibilitySurrogate.id
      extension = this@HealthcareServiceEligibilitySurrogate.extension
      modifierExtension = this@HealthcareServiceEligibilitySurrogate.modifierExtension
      code = this@HealthcareServiceEligibilitySurrogate.code
      comment =
        Markdown.of(
          this@HealthcareServiceEligibilitySurrogate.comment,
          this@HealthcareServiceEligibilitySurrogate._comment,
        )
    }

  public companion object {
    public fun fromModel(
      model: HealthcareService.Eligibility
    ): HealthcareServiceEligibilitySurrogate =
      with(model) {
        HealthcareServiceEligibilitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
        }
      }
  }
}

@Serializable
internal data class HealthcareServiceSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var providedBy: Reference? = null,
  public var offeredIn: List<Reference?>? = null,
  public var category: List<CodeableConcept?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var specialty: List<CodeableConcept?>? = null,
  public var location: List<Reference?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var extraDetails: KotlinString? = null,
  public var _extraDetails: Element? = null,
  public var photo: Attachment? = null,
  public var contact: List<ExtendedContactDetail?>? = null,
  public var coverageArea: List<Reference?>? = null,
  public var serviceProvisionCode: List<CodeableConcept?>? = null,
  public var eligibility: List<HealthcareService.Eligibility>? = null,
  public var program: List<CodeableConcept?>? = null,
  public var characteristic: List<CodeableConcept?>? = null,
  public var communication: List<CodeableConcept?>? = null,
  public var referralMethod: List<CodeableConcept?>? = null,
  public var appointmentRequired: KotlinBoolean? = null,
  public var _appointmentRequired: Element? = null,
  public var availability: List<Availability?>? = null,
  public var endpoint: List<Reference?>? = null,
) {
  public fun toModel(): HealthcareService =
    HealthcareService().apply {
      id = this@HealthcareServiceSurrogate.id
      meta = this@HealthcareServiceSurrogate.meta
      implicitRules =
        Uri.of(
          this@HealthcareServiceSurrogate.implicitRules,
          this@HealthcareServiceSurrogate._implicitRules,
        )
      language =
        Code.of(this@HealthcareServiceSurrogate.language, this@HealthcareServiceSurrogate._language)
      text = this@HealthcareServiceSurrogate.text
      contained = this@HealthcareServiceSurrogate.contained
      extension = this@HealthcareServiceSurrogate.extension
      modifierExtension = this@HealthcareServiceSurrogate.modifierExtension
      identifier = this@HealthcareServiceSurrogate.identifier
      active =
        R5Boolean.of(
          this@HealthcareServiceSurrogate.active,
          this@HealthcareServiceSurrogate._active,
        )
      providedBy = this@HealthcareServiceSurrogate.providedBy
      offeredIn = this@HealthcareServiceSurrogate.offeredIn
      category = this@HealthcareServiceSurrogate.category
      type = this@HealthcareServiceSurrogate.type
      specialty = this@HealthcareServiceSurrogate.specialty
      location = this@HealthcareServiceSurrogate.location
      name =
        R5String.of(this@HealthcareServiceSurrogate.name, this@HealthcareServiceSurrogate._name)
      comment =
        Markdown.of(
          this@HealthcareServiceSurrogate.comment,
          this@HealthcareServiceSurrogate._comment,
        )
      extraDetails =
        Markdown.of(
          this@HealthcareServiceSurrogate.extraDetails,
          this@HealthcareServiceSurrogate._extraDetails,
        )
      photo = this@HealthcareServiceSurrogate.photo
      contact = this@HealthcareServiceSurrogate.contact
      coverageArea = this@HealthcareServiceSurrogate.coverageArea
      serviceProvisionCode = this@HealthcareServiceSurrogate.serviceProvisionCode
      eligibility = this@HealthcareServiceSurrogate.eligibility
      program = this@HealthcareServiceSurrogate.program
      characteristic = this@HealthcareServiceSurrogate.characteristic
      communication = this@HealthcareServiceSurrogate.communication
      referralMethod = this@HealthcareServiceSurrogate.referralMethod
      appointmentRequired =
        R5Boolean.of(
          this@HealthcareServiceSurrogate.appointmentRequired,
          this@HealthcareServiceSurrogate._appointmentRequired,
        )
      availability = this@HealthcareServiceSurrogate.availability
      endpoint = this@HealthcareServiceSurrogate.endpoint
    }

  public companion object {
    public fun fromModel(model: HealthcareService): HealthcareServiceSurrogate =
      with(model) {
        HealthcareServiceSurrogate().apply {
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
          providedBy = this@with.providedBy
          offeredIn = this@with.offeredIn
          category = this@with.category
          type = this@with.type
          specialty = this@with.specialty
          location = this@with.location
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          extraDetails = this@with.extraDetails?.value
          _extraDetails = this@with.extraDetails?.toElement()
          photo = this@with.photo
          contact = this@with.contact
          coverageArea = this@with.coverageArea
          serviceProvisionCode = this@with.serviceProvisionCode
          eligibility = this@with.eligibility
          program = this@with.program
          characteristic = this@with.characteristic
          communication = this@with.communication
          referralMethod = this@with.referralMethod
          appointmentRequired = this@with.appointmentRequired?.value
          _appointmentRequired = this@with.appointmentRequired?.toElement()
          availability = this@with.availability
          endpoint = this@with.endpoint
        }
      }
  }
}
