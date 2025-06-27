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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Organization
import com.google.fhir.model.r5.Period
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
internal data class OrganizationQualificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var code: CodeableConcept? = null,
  public var period: Period? = null,
  public var issuer: Reference? = null,
) {
  public fun toModel(): Organization.Qualification =
    Organization.Qualification().apply {
      id = this@OrganizationQualificationSurrogate.id
      extension = this@OrganizationQualificationSurrogate.extension
      modifierExtension = this@OrganizationQualificationSurrogate.modifierExtension
      identifier = this@OrganizationQualificationSurrogate.identifier
      code = this@OrganizationQualificationSurrogate.code
      period = this@OrganizationQualificationSurrogate.period
      issuer = this@OrganizationQualificationSurrogate.issuer
    }

  public companion object {
    public fun fromModel(model: Organization.Qualification): OrganizationQualificationSurrogate =
      with(model) {
        OrganizationQualificationSurrogate().apply {
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
internal data class OrganizationSurrogate(
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
  public var type: List<CodeableConcept?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var alias: List<KotlinString?>? = null,
  public var _alias: List<Element?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var contact: List<ExtendedContactDetail?>? = null,
  public var partOf: Reference? = null,
  public var endpoint: List<Reference?>? = null,
  public var qualification: List<Organization.Qualification>? = null,
) {
  public fun toModel(): Organization =
    Organization().apply {
      id = this@OrganizationSurrogate.id
      meta = this@OrganizationSurrogate.meta
      implicitRules =
        Uri.of(this@OrganizationSurrogate.implicitRules, this@OrganizationSurrogate._implicitRules)
      language = Code.of(this@OrganizationSurrogate.language, this@OrganizationSurrogate._language)
      text = this@OrganizationSurrogate.text
      contained = this@OrganizationSurrogate.contained
      extension = this@OrganizationSurrogate.extension
      modifierExtension = this@OrganizationSurrogate.modifierExtension
      identifier = this@OrganizationSurrogate.identifier
      active = R5Boolean.of(this@OrganizationSurrogate.active, this@OrganizationSurrogate._active)
      type = this@OrganizationSurrogate.type
      name = R5String.of(this@OrganizationSurrogate.name, this@OrganizationSurrogate._name)
      alias =
        if (this@OrganizationSurrogate.alias == null && this@OrganizationSurrogate._alias == null) {
          null
        } else {
          (this@OrganizationSurrogate.alias
              ?: List(this@OrganizationSurrogate._alias!!.size) { null })
            .zip(
              this@OrganizationSurrogate._alias
                ?: List(this@OrganizationSurrogate.alias!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      description =
        Markdown.of(this@OrganizationSurrogate.description, this@OrganizationSurrogate._description)
      contact = this@OrganizationSurrogate.contact
      partOf = this@OrganizationSurrogate.partOf
      endpoint = this@OrganizationSurrogate.endpoint
      qualification = this@OrganizationSurrogate.qualification
    }

  public companion object {
    public fun fromModel(model: Organization): OrganizationSurrogate =
      with(model) {
        OrganizationSurrogate().apply {
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
          type = this@with.type
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          alias = this@with.alias?.map { it?.value }?.takeUnless { it.all { it == null } }
          _alias = this@with.alias?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          contact = this@with.contact
          partOf = this@with.partOf
          endpoint = this@with.endpoint
          qualification = this@with.qualification
        }
      }
  }
}
