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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.OperationDefinition
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.UsageContext
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class OperationDefinitionParameterBindingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var strength: KotlinString? = null,
  public var _strength: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
) {
  public fun toModel(): OperationDefinition.Parameter.Binding =
    OperationDefinition.Parameter.Binding().apply {
      id = this@OperationDefinitionParameterBindingSurrogate.id
      extension = this@OperationDefinitionParameterBindingSurrogate.extension
      modifierExtension = this@OperationDefinitionParameterBindingSurrogate.modifierExtension
      strength =
        Enumeration.of(
          this@OperationDefinitionParameterBindingSurrogate.strength?.let {
            com.google.fhir.model.r4b.BindingStrength.fromCode(it)
          },
          this@OperationDefinitionParameterBindingSurrogate._strength,
        )
      valueSet =
        Canonical.of(
          this@OperationDefinitionParameterBindingSurrogate.valueSet,
          this@OperationDefinitionParameterBindingSurrogate._valueSet,
        )
    }

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Parameter.Binding
    ): OperationDefinitionParameterBindingSurrogate =
      with(model) {
        OperationDefinitionParameterBindingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          strength = this@with.strength?.value?.getCode()
          _strength = this@with.strength?.toElement()
          valueSet = this@with.valueSet?.value
          _valueSet = this@with.valueSet?.toElement()
        }
      }
  }
}

@Serializable
internal data class OperationDefinitionParameterReferencedFromSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var sourceId: KotlinString? = null,
  public var _sourceId: Element? = null,
) {
  public fun toModel(): OperationDefinition.Parameter.ReferencedFrom =
    OperationDefinition.Parameter.ReferencedFrom().apply {
      id = this@OperationDefinitionParameterReferencedFromSurrogate.id
      extension = this@OperationDefinitionParameterReferencedFromSurrogate.extension
      modifierExtension = this@OperationDefinitionParameterReferencedFromSurrogate.modifierExtension
      source =
        R4bString.of(
          this@OperationDefinitionParameterReferencedFromSurrogate.source,
          this@OperationDefinitionParameterReferencedFromSurrogate._source,
        )
      sourceId =
        R4bString.of(
          this@OperationDefinitionParameterReferencedFromSurrogate.sourceId,
          this@OperationDefinitionParameterReferencedFromSurrogate._sourceId,
        )
    }

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Parameter.ReferencedFrom
    ): OperationDefinitionParameterReferencedFromSurrogate =
      with(model) {
        OperationDefinitionParameterReferencedFromSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          source = this@with.source?.value
          _source = this@with.source?.toElement()
          sourceId = this@with.sourceId?.value
          _sourceId = this@with.sourceId?.toElement()
        }
      }
  }
}

@Serializable
internal data class OperationDefinitionParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var use: KotlinString? = null,
  public var _use: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var targetProfile: List<KotlinString?>? = null,
  public var _targetProfile: List<Element?>? = null,
  public var searchType: KotlinString? = null,
  public var _searchType: Element? = null,
  public var binding: OperationDefinition.Parameter.Binding? = null,
  public var referencedFrom: List<OperationDefinition.Parameter.ReferencedFrom>? = null,
  public var part: List<OperationDefinition.Parameter?>? = null,
) {
  public fun toModel(): OperationDefinition.Parameter =
    OperationDefinition.Parameter().apply {
      id = this@OperationDefinitionParameterSurrogate.id
      extension = this@OperationDefinitionParameterSurrogate.extension
      modifierExtension = this@OperationDefinitionParameterSurrogate.modifierExtension
      name =
        Code.of(
          this@OperationDefinitionParameterSurrogate.name,
          this@OperationDefinitionParameterSurrogate._name,
        )
      use =
        Enumeration.of(
          this@OperationDefinitionParameterSurrogate.use?.let {
            com.google.fhir.model.r4b.OperationDefinition.OperationParameterUse.fromCode(it)
          },
          this@OperationDefinitionParameterSurrogate._use,
        )
      min =
        Integer.of(
          this@OperationDefinitionParameterSurrogate.min,
          this@OperationDefinitionParameterSurrogate._min,
        )
      max =
        R4bString.of(
          this@OperationDefinitionParameterSurrogate.max,
          this@OperationDefinitionParameterSurrogate._max,
        )
      documentation =
        R4bString.of(
          this@OperationDefinitionParameterSurrogate.documentation,
          this@OperationDefinitionParameterSurrogate._documentation,
        )
      type =
        Enumeration.of(
          this@OperationDefinitionParameterSurrogate.type?.let {
            com.google.fhir.model.r4b.FHIRAllTypes.fromCode(it)
          },
          this@OperationDefinitionParameterSurrogate._type,
        )
      targetProfile =
        if (
          this@OperationDefinitionParameterSurrogate.targetProfile == null &&
            this@OperationDefinitionParameterSurrogate._targetProfile == null
        ) {
          null
        } else {
          (this@OperationDefinitionParameterSurrogate.targetProfile
              ?: List(this@OperationDefinitionParameterSurrogate._targetProfile!!.size) { null })
            .zip(
              this@OperationDefinitionParameterSurrogate._targetProfile
                ?: List(this@OperationDefinitionParameterSurrogate.targetProfile!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      searchType =
        Enumeration.of(
          this@OperationDefinitionParameterSurrogate.searchType?.let {
            com.google.fhir.model.r4b.SearchParamType.fromCode(it)
          },
          this@OperationDefinitionParameterSurrogate._searchType,
        )
      binding = this@OperationDefinitionParameterSurrogate.binding
      referencedFrom = this@OperationDefinitionParameterSurrogate.referencedFrom
      part = this@OperationDefinitionParameterSurrogate.part
    }

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Parameter
    ): OperationDefinitionParameterSurrogate =
      with(model) {
        OperationDefinitionParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          use = this@with.use?.value?.getCode()
          _use = this@with.use?.toElement()
          min = this@with.min?.value
          _min = this@with.min?.toElement()
          max = this@with.max?.value
          _max = this@with.max?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          targetProfile =
            this@with.targetProfile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _targetProfile =
            this@with.targetProfile?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          searchType = this@with.searchType?.value?.getCode()
          _searchType = this@with.searchType?.toElement()
          binding = this@with.binding
          referencedFrom = this@with.referencedFrom
          part = this@with.part
        }
      }
  }
}

@Serializable
internal data class OperationDefinitionOverloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var parameterName: List<KotlinString?>? = null,
  public var _parameterName: List<Element?>? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): OperationDefinition.Overload =
    OperationDefinition.Overload().apply {
      id = this@OperationDefinitionOverloadSurrogate.id
      extension = this@OperationDefinitionOverloadSurrogate.extension
      modifierExtension = this@OperationDefinitionOverloadSurrogate.modifierExtension
      parameterName =
        if (
          this@OperationDefinitionOverloadSurrogate.parameterName == null &&
            this@OperationDefinitionOverloadSurrogate._parameterName == null
        ) {
          null
        } else {
          (this@OperationDefinitionOverloadSurrogate.parameterName
              ?: List(this@OperationDefinitionOverloadSurrogate._parameterName!!.size) { null })
            .zip(
              this@OperationDefinitionOverloadSurrogate._parameterName
                ?: List(this@OperationDefinitionOverloadSurrogate.parameterName!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      comment =
        R4bString.of(
          this@OperationDefinitionOverloadSurrogate.comment,
          this@OperationDefinitionOverloadSurrogate._comment,
        )
    }

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Overload
    ): OperationDefinitionOverloadSurrogate =
      with(model) {
        OperationDefinitionOverloadSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          parameterName =
            this@with.parameterName?.map { it?.value }?.takeUnless { it.all { it == null } }
          _parameterName =
            this@with.parameterName?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
        }
      }
  }
}

@Serializable
internal data class OperationDefinitionSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var affectsState: KotlinBoolean? = null,
  public var _affectsState: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var base: KotlinString? = null,
  public var _base: Element? = null,
  public var resource: List<KotlinString?>? = null,
  public var _resource: List<Element?>? = null,
  public var system: KotlinBoolean? = null,
  public var _system: Element? = null,
  public var type: KotlinBoolean? = null,
  public var _type: Element? = null,
  public var instance: KotlinBoolean? = null,
  public var _instance: Element? = null,
  public var inputProfile: KotlinString? = null,
  public var _inputProfile: Element? = null,
  public var outputProfile: KotlinString? = null,
  public var _outputProfile: Element? = null,
  public var parameter: List<OperationDefinition.Parameter>? = null,
  public var overload: List<OperationDefinition.Overload>? = null,
) {
  public fun toModel(): OperationDefinition =
    OperationDefinition().apply {
      id = this@OperationDefinitionSurrogate.id
      meta = this@OperationDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@OperationDefinitionSurrogate.implicitRules,
          this@OperationDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@OperationDefinitionSurrogate.language,
          this@OperationDefinitionSurrogate._language,
        )
      text = this@OperationDefinitionSurrogate.text
      contained = this@OperationDefinitionSurrogate.contained
      extension = this@OperationDefinitionSurrogate.extension
      modifierExtension = this@OperationDefinitionSurrogate.modifierExtension
      url = Uri.of(this@OperationDefinitionSurrogate.url, this@OperationDefinitionSurrogate._url)
      version =
        R4bString.of(
          this@OperationDefinitionSurrogate.version,
          this@OperationDefinitionSurrogate._version,
        )
      name =
        R4bString.of(
          this@OperationDefinitionSurrogate.name,
          this@OperationDefinitionSurrogate._name,
        )
      title =
        R4bString.of(
          this@OperationDefinitionSurrogate.title,
          this@OperationDefinitionSurrogate._title,
        )
      status =
        Enumeration.of(
          this@OperationDefinitionSurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@OperationDefinitionSurrogate._status,
        )
      kind =
        Enumeration.of(
          this@OperationDefinitionSurrogate.kind?.let {
            com.google.fhir.model.r4b.OperationDefinition.OperationKind.fromCode(it)
          },
          this@OperationDefinitionSurrogate._kind,
        )
      experimental =
        R4bBoolean.of(
          this@OperationDefinitionSurrogate.experimental,
          this@OperationDefinitionSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@OperationDefinitionSurrogate.date),
          this@OperationDefinitionSurrogate._date,
        )
      publisher =
        R4bString.of(
          this@OperationDefinitionSurrogate.publisher,
          this@OperationDefinitionSurrogate._publisher,
        )
      contact = this@OperationDefinitionSurrogate.contact
      description =
        Markdown.of(
          this@OperationDefinitionSurrogate.description,
          this@OperationDefinitionSurrogate._description,
        )
      useContext = this@OperationDefinitionSurrogate.useContext
      jurisdiction = this@OperationDefinitionSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@OperationDefinitionSurrogate.purpose,
          this@OperationDefinitionSurrogate._purpose,
        )
      affectsState =
        R4bBoolean.of(
          this@OperationDefinitionSurrogate.affectsState,
          this@OperationDefinitionSurrogate._affectsState,
        )
      code =
        Code.of(this@OperationDefinitionSurrogate.code, this@OperationDefinitionSurrogate._code)
      comment =
        Markdown.of(
          this@OperationDefinitionSurrogate.comment,
          this@OperationDefinitionSurrogate._comment,
        )
      base =
        Canonical.of(
          this@OperationDefinitionSurrogate.base,
          this@OperationDefinitionSurrogate._base,
        )
      resource =
        if (
          this@OperationDefinitionSurrogate.resource == null &&
            this@OperationDefinitionSurrogate._resource == null
        ) {
          null
        } else {
          (this@OperationDefinitionSurrogate.resource
              ?: List(this@OperationDefinitionSurrogate._resource!!.size) { null })
            .zip(
              this@OperationDefinitionSurrogate._resource
                ?: List(this@OperationDefinitionSurrogate.resource!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let { com.google.fhir.model.r4b.ResourceType.fromCode(it) },
                element,
              )
            }
        }
      system =
        R4bBoolean.of(
          this@OperationDefinitionSurrogate.system,
          this@OperationDefinitionSurrogate._system,
        )
      type =
        R4bBoolean.of(
          this@OperationDefinitionSurrogate.type,
          this@OperationDefinitionSurrogate._type,
        )
      instance =
        R4bBoolean.of(
          this@OperationDefinitionSurrogate.instance,
          this@OperationDefinitionSurrogate._instance,
        )
      inputProfile =
        Canonical.of(
          this@OperationDefinitionSurrogate.inputProfile,
          this@OperationDefinitionSurrogate._inputProfile,
        )
      outputProfile =
        Canonical.of(
          this@OperationDefinitionSurrogate.outputProfile,
          this@OperationDefinitionSurrogate._outputProfile,
        )
      parameter = this@OperationDefinitionSurrogate.parameter
      overload = this@OperationDefinitionSurrogate.overload
    }

  public companion object {
    public fun fromModel(model: OperationDefinition): OperationDefinitionSurrogate =
      with(model) {
        OperationDefinitionSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          affectsState = this@with.affectsState?.value
          _affectsState = this@with.affectsState?.toElement()
          code = this@with.code?.value
          _code = this@with.code?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          base = this@with.base?.value
          _base = this@with.base?.toElement()
          resource =
            this@with.resource?.map { it?.value?.getCode() }?.takeUnless { it.all { it == null } }
          _resource =
            this@with.resource?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          system = this@with.system?.value
          _system = this@with.system?.toElement()
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          instance = this@with.instance?.value
          _instance = this@with.instance?.toElement()
          inputProfile = this@with.inputProfile?.value
          _inputProfile = this@with.inputProfile?.toElement()
          outputProfile = this@with.outputProfile?.value
          _outputProfile = this@with.outputProfile?.toElement()
          parameter = this@with.parameter
          overload = this@with.overload
        }
      }
  }
}
