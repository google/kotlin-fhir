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
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.GraphDefinition
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class GraphDefinitionLinkTargetCompartmentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var use: KotlinString?,
  public var _use: Element? = null,
  public var code: KotlinString?,
  public var _code: Element? = null,
  public var rule: KotlinString?,
  public var _rule: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): GraphDefinition.Link.Target.Compartment =
    GraphDefinition.Link.Target.Compartment(
      id = this@GraphDefinitionLinkTargetCompartmentSurrogate.id,
      extension = this@GraphDefinitionLinkTargetCompartmentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@GraphDefinitionLinkTargetCompartmentSurrogate.modifierExtension ?: mutableListOf(),
      use =
        Enumeration.of(
          com.google.fhir.model.r4.GraphDefinition.GraphCompartmentUse.fromCode(
            this@GraphDefinitionLinkTargetCompartmentSurrogate.use!!
          ),
          this@GraphDefinitionLinkTargetCompartmentSurrogate._use,
        ),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.GraphDefinition.CompartmentCode.fromCode(
            this@GraphDefinitionLinkTargetCompartmentSurrogate.code!!
          ),
          this@GraphDefinitionLinkTargetCompartmentSurrogate._code,
        ),
      rule =
        Enumeration.of(
          com.google.fhir.model.r4.GraphDefinition.GraphCompartmentRule.fromCode(
            this@GraphDefinitionLinkTargetCompartmentSurrogate.rule!!
          ),
          this@GraphDefinitionLinkTargetCompartmentSurrogate._rule,
        ),
      expression =
        R4String.ofNullable(
          this@GraphDefinitionLinkTargetCompartmentSurrogate.expression,
          this@GraphDefinitionLinkTargetCompartmentSurrogate._expression,
        ),
      description =
        R4String.ofNullable(
          this@GraphDefinitionLinkTargetCompartmentSurrogate.description,
          this@GraphDefinitionLinkTargetCompartmentSurrogate._description,
        ),
    )

  public companion object {
    public fun fromModel(
      model: GraphDefinition.Link.Target.Compartment
    ): GraphDefinitionLinkTargetCompartmentSurrogate =
      with(model) {
        GraphDefinitionLinkTargetCompartmentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.isEmpty() },
          modifierExtension = this@with.modifierExtension.takeUnless { it.isEmpty() },
          use = this@with.use.value.getCode(),
          _use = this@with.use.toElement(),
          code = this@with.code.value.getCode(),
          _code = this@with.code.toElement(),
          rule = this@with.rule.value.getCode(),
          _rule = this@with.rule.toElement(),
          expression = this@with.expression?.value,
          _expression = this@with.expression?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
        )
      }
  }
}

@Serializable
internal data class GraphDefinitionLinkTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString?,
  public var _type: Element? = null,
  public var params: KotlinString? = null,
  public var _params: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
  public var compartment: MutableList<GraphDefinition.Link.Target.Compartment>? = null,
  public var link: MutableList<GraphDefinition.Link>? = null,
) {
  public fun toModel(): GraphDefinition.Link.Target =
    GraphDefinition.Link.Target(
      id = this@GraphDefinitionLinkTargetSurrogate.id,
      extension = this@GraphDefinitionLinkTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@GraphDefinitionLinkTargetSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4.ResourceType.fromCode(
            this@GraphDefinitionLinkTargetSurrogate.type!!
          ),
          this@GraphDefinitionLinkTargetSurrogate._type,
        ),
      params =
        R4String.ofNullable(
          this@GraphDefinitionLinkTargetSurrogate.params,
          this@GraphDefinitionLinkTargetSurrogate._params,
        ),
      profile =
        Canonical.ofNullable(
          this@GraphDefinitionLinkTargetSurrogate.profile,
          this@GraphDefinitionLinkTargetSurrogate._profile,
        ),
      compartment = this@GraphDefinitionLinkTargetSurrogate.compartment ?: mutableListOf(),
      link = this@GraphDefinitionLinkTargetSurrogate.link ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: GraphDefinition.Link.Target): GraphDefinitionLinkTargetSurrogate =
      with(model) {
        GraphDefinitionLinkTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.isEmpty() },
          modifierExtension = this@with.modifierExtension.takeUnless { it.isEmpty() },
          type = this@with.type.value.getCode(),
          _type = this@with.type.toElement(),
          params = this@with.params?.value,
          _params = this@with.params?.toElement(),
          profile = this@with.profile?.value,
          _profile = this@with.profile?.toElement(),
          compartment = this@with.compartment.takeUnless { it.isEmpty() },
          link = this@with.link.takeUnless { it.isEmpty() },
        )
      }
  }
}

@Serializable
internal data class GraphDefinitionLinkSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var sliceName: KotlinString? = null,
  public var _sliceName: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var target: MutableList<GraphDefinition.Link.Target>? = null,
) {
  public fun toModel(): GraphDefinition.Link =
    GraphDefinition.Link(
      id = this@GraphDefinitionLinkSurrogate.id,
      extension = this@GraphDefinitionLinkSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GraphDefinitionLinkSurrogate.modifierExtension ?: mutableListOf(),
      path =
        R4String.ofNullable(
          this@GraphDefinitionLinkSurrogate.path,
          this@GraphDefinitionLinkSurrogate._path,
        ),
      sliceName =
        R4String.ofNullable(
          this@GraphDefinitionLinkSurrogate.sliceName,
          this@GraphDefinitionLinkSurrogate._sliceName,
        ),
      min =
        Integer.ofNullable(
          this@GraphDefinitionLinkSurrogate.min,
          this@GraphDefinitionLinkSurrogate._min,
        ),
      max =
        R4String.ofNullable(
          this@GraphDefinitionLinkSurrogate.max,
          this@GraphDefinitionLinkSurrogate._max,
        ),
      description =
        R4String.ofNullable(
          this@GraphDefinitionLinkSurrogate.description,
          this@GraphDefinitionLinkSurrogate._description,
        ),
      target = this@GraphDefinitionLinkSurrogate.target ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: GraphDefinition.Link): GraphDefinitionLinkSurrogate =
      with(model) {
        GraphDefinitionLinkSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.isEmpty() },
          modifierExtension = this@with.modifierExtension.takeUnless { it.isEmpty() },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          sliceName = this@with.sliceName?.value,
          _sliceName = this@with.sliceName?.toElement(),
          min = this@with.min?.value,
          _min = this@with.min?.toElement(),
          max = this@with.max?.value,
          _max = this@with.max?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          target = this@with.target.takeUnless { it.isEmpty() },
        )
      }
  }
}

@Serializable
internal data class GraphDefinitionSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString?,
  public var _name: Element? = null,
  public var status: KotlinString?,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var start: KotlinString?,
  public var _start: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
  public var link: MutableList<GraphDefinition.Link>? = null,
) {
  public fun toModel(): GraphDefinition =
    GraphDefinition(
      id = this@GraphDefinitionSurrogate.id,
      meta = this@GraphDefinitionSurrogate.meta,
      implicitRules =
        Uri.ofNullable(
          this@GraphDefinitionSurrogate.implicitRules,
          this@GraphDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.ofNullable(
          this@GraphDefinitionSurrogate.language,
          this@GraphDefinitionSurrogate._language,
        ),
      text = this@GraphDefinitionSurrogate.text,
      contained = this@GraphDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@GraphDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GraphDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.ofNullable(this@GraphDefinitionSurrogate.url, this@GraphDefinitionSurrogate._url),
      version =
        R4String.ofNullable(
          this@GraphDefinitionSurrogate.version,
          this@GraphDefinitionSurrogate._version,
        ),
      name = R4String.of(this@GraphDefinitionSurrogate.name!!, this@GraphDefinitionSurrogate._name),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PublicationStatus.fromCode(
            this@GraphDefinitionSurrogate.status!!
          ),
          this@GraphDefinitionSurrogate._status,
        ),
      experimental =
        R4Boolean.ofNullable(
          this@GraphDefinitionSurrogate.experimental,
          this@GraphDefinitionSurrogate._experimental,
        ),
      date =
        DateTime.ofNullable(
          FhirDateTime.fromString(this@GraphDefinitionSurrogate.date),
          this@GraphDefinitionSurrogate._date,
        ),
      publisher =
        R4String.ofNullable(
          this@GraphDefinitionSurrogate.publisher,
          this@GraphDefinitionSurrogate._publisher,
        ),
      contact = this@GraphDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.ofNullable(
          this@GraphDefinitionSurrogate.description,
          this@GraphDefinitionSurrogate._description,
        ),
      useContext = this@GraphDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@GraphDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.ofNullable(
          this@GraphDefinitionSurrogate.purpose,
          this@GraphDefinitionSurrogate._purpose,
        ),
      start =
        Enumeration.of(
          com.google.fhir.model.r4.ResourceType.fromCode(this@GraphDefinitionSurrogate.start!!),
          this@GraphDefinitionSurrogate._start,
        ),
      profile =
        Canonical.ofNullable(
          this@GraphDefinitionSurrogate.profile,
          this@GraphDefinitionSurrogate._profile,
        ),
      link = this@GraphDefinitionSurrogate.link ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: GraphDefinition): GraphDefinitionSurrogate =
      with(model) {
        GraphDefinitionSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.isEmpty() },
          extension = this@with.extension.takeUnless { it.isEmpty() },
          modifierExtension = this@with.modifierExtension.takeUnless { it.isEmpty() },
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name.value!!,
          _name = this@with.name.toElement(),
          status = this@with.status.value.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.isEmpty() },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.isEmpty() },
          jurisdiction = this@with.jurisdiction.takeUnless { it.isEmpty() },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          start = this@with.start.value.getCode(),
          _start = this@with.start.toElement(),
          profile = this@with.profile?.value,
          _profile = this@with.profile?.toElement(),
          link = this@with.link.takeUnless { it.isEmpty() },
        )
      }
  }
}
