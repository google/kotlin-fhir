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
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.HumanName
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Organization
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class OrganizationContactSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var purpose: CodeableConcept? = null,
  public var name: HumanName? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var address: Address? = null,
) {
  public fun toModel(): Organization.Contact =
    Organization.Contact(
      id = this@OrganizationContactSurrogate.id,
      extension = this@OrganizationContactSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@OrganizationContactSurrogate.modifierExtension ?: mutableListOf(),
      purpose = this@OrganizationContactSurrogate.purpose,
      name = this@OrganizationContactSurrogate.name,
      telecom = this@OrganizationContactSurrogate.telecom ?: mutableListOf(),
      address = this@OrganizationContactSurrogate.address,
    )

  public companion object {
    public fun fromModel(model: Organization.Contact): OrganizationContactSurrogate =
      with(model) {
        OrganizationContactSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          purpose = this@with.purpose,
          name = this@with.name,
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          address = this@with.address,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var alias: MutableList<KotlinString?>? = null,
  public var _alias: MutableList<Element?>? = null,
  public var telecom: MutableList<ContactPoint>? = null,
  public var address: MutableList<Address>? = null,
  public var partOf: Reference? = null,
  public var contact: MutableList<Organization.Contact>? = null,
  public var endpoint: MutableList<Reference>? = null,
) {
  public fun toModel(): Organization =
    Organization(
      id = this@OrganizationSurrogate.id,
      meta = this@OrganizationSurrogate.meta,
      implicitRules =
        Uri.of(this@OrganizationSurrogate.implicitRules, this@OrganizationSurrogate._implicitRules),
      language = Code.of(this@OrganizationSurrogate.language, this@OrganizationSurrogate._language),
      text = this@OrganizationSurrogate.text,
      contained = this@OrganizationSurrogate.contained ?: mutableListOf(),
      extension = this@OrganizationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@OrganizationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@OrganizationSurrogate.identifier ?: mutableListOf(),
      active = R4bBoolean.of(this@OrganizationSurrogate.active, this@OrganizationSurrogate._active),
      type = this@OrganizationSurrogate.type ?: mutableListOf(),
      name = R4bString.of(this@OrganizationSurrogate.name, this@OrganizationSurrogate._name),
      alias =
        if (this@OrganizationSurrogate.alias == null && this@OrganizationSurrogate._alias == null) {
          mutableListOf()
        } else {
          (this@OrganizationSurrogate.alias
              ?: List(this@OrganizationSurrogate._alias!!.size) { null })
            .zip(
              this@OrganizationSurrogate._alias
                ?: List(this@OrganizationSurrogate.alias!!.size) { null }
            )
            .map { (value, element) -> R4bString.of(value, element)!! }
            .toMutableList()
        },
      telecom = this@OrganizationSurrogate.telecom ?: mutableListOf(),
      address = this@OrganizationSurrogate.address ?: mutableListOf(),
      partOf = this@OrganizationSurrogate.partOf,
      contact = this@OrganizationSurrogate.contact ?: mutableListOf(),
      endpoint = this@OrganizationSurrogate.endpoint ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Organization): OrganizationSurrogate =
      with(model) {
        OrganizationSurrogate(
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
          type = this@with.type.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          alias =
            this@with.alias.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _alias =
            this@with.alias
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          telecom = this@with.telecom.takeUnless { it.all { it == null } },
          address = this@with.address.takeUnless { it.all { it == null } },
          partOf = this@with.partOf,
          contact = this@with.contact.takeUnless { it.all { it == null } },
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
        )
      }
  }
}
