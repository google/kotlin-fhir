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
import kotlin.collections.MutableList
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var period: Period? = null,
  public var organization: Reference? = null,
  public var participatingOrganization: Reference? = null,
  public var network: MutableList<Reference>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var specialty: MutableList<CodeableConcept>? = null,
  public var location: MutableList<Reference>? = null,
  public var healthcareService: MutableList<Reference>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var endpoint: MutableList<Reference>? = null,
) {
  public fun toModel(): OrganizationAffiliation =
    OrganizationAffiliation(
      id = this@OrganizationAffiliationSurrogate.id,
      meta = this@OrganizationAffiliationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@OrganizationAffiliationSurrogate.implicitRules,
          this@OrganizationAffiliationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@OrganizationAffiliationSurrogate.language,
          this@OrganizationAffiliationSurrogate._language,
        ),
      text = this@OrganizationAffiliationSurrogate.text,
      contained = this@OrganizationAffiliationSurrogate.contained ?: mutableListOf(),
      extension = this@OrganizationAffiliationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@OrganizationAffiliationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@OrganizationAffiliationSurrogate.identifier ?: mutableListOf(),
      active =
        R4Boolean.of(
          this@OrganizationAffiliationSurrogate.active,
          this@OrganizationAffiliationSurrogate._active,
        ),
      period = this@OrganizationAffiliationSurrogate.period,
      organization = this@OrganizationAffiliationSurrogate.organization,
      participatingOrganization = this@OrganizationAffiliationSurrogate.participatingOrganization,
      network = this@OrganizationAffiliationSurrogate.network ?: mutableListOf(),
      code = this@OrganizationAffiliationSurrogate.code ?: mutableListOf(),
      specialty = this@OrganizationAffiliationSurrogate.specialty ?: mutableListOf(),
      location = this@OrganizationAffiliationSurrogate.location ?: mutableListOf(),
      healthcareService =
        this@OrganizationAffiliationSurrogate.healthcareService ?: mutableListOf(),
      telecom = this@OrganizationAffiliationSurrogate.telecom ?: mutableListOf(),
      endpoint = this@OrganizationAffiliationSurrogate.endpoint ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: OrganizationAffiliation): OrganizationAffiliationSurrogate =
      with(model) {
        OrganizationAffiliationSurrogate(
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
          period = this@with.period,
          organization = this@with.organization,
          participatingOrganization = this@with.participatingOrganization,
          network = this@with.network.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          specialty = this@with.specialty.takeUnless { it.all { it == null } },
          location = this@with.location.takeUnless { it.all { it == null } },
          healthcareService = this@with.healthcareService.takeUnless { it.all { it == null } },
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
        )
      }
  }
}
