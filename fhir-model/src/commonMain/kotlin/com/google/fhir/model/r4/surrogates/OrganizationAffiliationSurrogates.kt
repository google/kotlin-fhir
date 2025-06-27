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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactPoint
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.OrganizationAffiliation
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class OrganizationAffiliationSurrogate(
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
  public var organization: Reference? = null,
  public var participatingOrganization: Reference? = null,
  public var network: List<Reference?>? = null,
  public var code: List<CodeableConcept?>? = null,
  public var specialty: List<CodeableConcept?>? = null,
  public var location: List<Reference?>? = null,
  public var healthcareService: List<Reference?>? = null,
  public var telecom: List<ContactPoint?>? = null,
  public var endpoint: List<Reference?>? = null,
) {
  public fun toModel(): OrganizationAffiliation =
    OrganizationAffiliation().apply {
      id = this@OrganizationAffiliationSurrogate.id
      meta = this@OrganizationAffiliationSurrogate.meta
      implicitRules =
        Uri.of(
          this@OrganizationAffiliationSurrogate.implicitRules,
          this@OrganizationAffiliationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@OrganizationAffiliationSurrogate.language,
          this@OrganizationAffiliationSurrogate._language,
        )
      text = this@OrganizationAffiliationSurrogate.text
      contained = this@OrganizationAffiliationSurrogate.contained
      extension = this@OrganizationAffiliationSurrogate.extension
      modifierExtension = this@OrganizationAffiliationSurrogate.modifierExtension
      identifier = this@OrganizationAffiliationSurrogate.identifier
      active =
        R4Boolean.of(
          this@OrganizationAffiliationSurrogate.active,
          this@OrganizationAffiliationSurrogate._active,
        )
      period = this@OrganizationAffiliationSurrogate.period
      organization = this@OrganizationAffiliationSurrogate.organization
      participatingOrganization = this@OrganizationAffiliationSurrogate.participatingOrganization
      network = this@OrganizationAffiliationSurrogate.network
      code = this@OrganizationAffiliationSurrogate.code
      specialty = this@OrganizationAffiliationSurrogate.specialty
      location = this@OrganizationAffiliationSurrogate.location
      healthcareService = this@OrganizationAffiliationSurrogate.healthcareService
      telecom = this@OrganizationAffiliationSurrogate.telecom
      endpoint = this@OrganizationAffiliationSurrogate.endpoint
    }

  public companion object {
    public fun fromModel(model: OrganizationAffiliation): OrganizationAffiliationSurrogate =
      with(model) {
        OrganizationAffiliationSurrogate().apply {
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
          organization = this@with.organization
          participatingOrganization = this@with.participatingOrganization
          network = this@with.network
          code = this@with.code
          specialty = this@with.specialty
          location = this@with.location
          healthcareService = this@with.healthcareService
          telecom = this@with.telecom
          endpoint = this@with.endpoint
        }
      }
  }
}
