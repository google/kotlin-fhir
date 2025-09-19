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
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.OperationDefinition
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import com.google.fhir.model.r4.terminologies.BindingStrength
import com.google.fhir.model.r4.terminologies.FHIRAllTypes
import com.google.fhir.model.r4.terminologies.PublicationStatus
import com.google.fhir.model.r4.terminologies.ResourceType
import com.google.fhir.model.r4.terminologies.SearchParamType
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class OperationDefinitionParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
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
  public var targetProfile: MutableList<KotlinString?>? = null,
  public var _targetProfile: MutableList<Element?>? = null,
  public var searchType: KotlinString? = null,
  public var _searchType: Element? = null,
  public var binding: OperationDefinition.Parameter.Binding? = null,
  public var referencedFrom: MutableList<OperationDefinition.Parameter.ReferencedFrom>? = null,
  public var part: MutableList<OperationDefinition.Parameter>? = null,
) {
  public fun toModel(): OperationDefinition.Parameter =
    OperationDefinition.Parameter(
      id = this@OperationDefinitionParameterSurrogate.id,
      extension = this@OperationDefinitionParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@OperationDefinitionParameterSurrogate.modifierExtension ?: mutableListOf(),
      name =
        Code.of(
          this@OperationDefinitionParameterSurrogate.name,
          this@OperationDefinitionParameterSurrogate._name,
        )!!,
      use =
        Enumeration.of(
          OperationDefinition.OperationParameterUse.fromCode(
            this@OperationDefinitionParameterSurrogate.use!!
          ),
          this@OperationDefinitionParameterSurrogate._use,
        ),
      min =
        Integer.of(
          this@OperationDefinitionParameterSurrogate.min,
          this@OperationDefinitionParameterSurrogate._min,
        )!!,
      max =
        R4String.of(
          this@OperationDefinitionParameterSurrogate.max,
          this@OperationDefinitionParameterSurrogate._max,
        )!!,
      documentation =
        R4String.of(
          this@OperationDefinitionParameterSurrogate.documentation,
          this@OperationDefinitionParameterSurrogate._documentation,
        ),
      type =
        this@OperationDefinitionParameterSurrogate.type?.let {
          Enumeration.of(
            FHIRAllTypes.fromCode(it),
            this@OperationDefinitionParameterSurrogate._type,
          )
        },
      targetProfile =
        if (
          this@OperationDefinitionParameterSurrogate.targetProfile == null &&
            this@OperationDefinitionParameterSurrogate._targetProfile == null
        ) {
          mutableListOf()
        } else {
          (this@OperationDefinitionParameterSurrogate.targetProfile
              ?: List(this@OperationDefinitionParameterSurrogate._targetProfile!!.size) { null })
            .zip(
              this@OperationDefinitionParameterSurrogate._targetProfile
                ?: List(this@OperationDefinitionParameterSurrogate.targetProfile!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      searchType =
        this@OperationDefinitionParameterSurrogate.searchType?.let {
          Enumeration.of(
            SearchParamType.fromCode(it),
            this@OperationDefinitionParameterSurrogate._searchType,
          )
        },
      binding = this@OperationDefinitionParameterSurrogate.binding,
      referencedFrom = this@OperationDefinitionParameterSurrogate.referencedFrom ?: mutableListOf(),
      part = this@OperationDefinitionParameterSurrogate.part ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Parameter
    ): OperationDefinitionParameterSurrogate =
      with(model) {
        OperationDefinitionParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          use = this@with.use.value?.getCode(),
          _use = this@with.use.toElement(),
          min = this@with.min.value,
          _min = this@with.min.toElement(),
          max = this@with.max.value,
          _max = this@with.max.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          targetProfile =
            this@with.targetProfile
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _targetProfile =
            this@with.targetProfile
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          searchType = this@with.searchType?.value?.getCode(),
          _searchType = this@with.searchType?.toElement(),
          binding = this@with.binding,
          referencedFrom = this@with.referencedFrom.takeIf { it.isNotEmpty() },
          part = this@with.part.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class OperationDefinitionParameterBindingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var strength: KotlinString? = null,
  public var _strength: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
) {
  public fun toModel(): OperationDefinition.Parameter.Binding =
    OperationDefinition.Parameter.Binding(
      id = this@OperationDefinitionParameterBindingSurrogate.id,
      extension = this@OperationDefinitionParameterBindingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@OperationDefinitionParameterBindingSurrogate.modifierExtension ?: mutableListOf(),
      strength =
        Enumeration.of(
          BindingStrength.fromCode(this@OperationDefinitionParameterBindingSurrogate.strength!!),
          this@OperationDefinitionParameterBindingSurrogate._strength,
        ),
      valueSet =
        Canonical.of(
          this@OperationDefinitionParameterBindingSurrogate.valueSet,
          this@OperationDefinitionParameterBindingSurrogate._valueSet,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Parameter.Binding
    ): OperationDefinitionParameterBindingSurrogate =
      with(model) {
        OperationDefinitionParameterBindingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          strength = this@with.strength.value?.getCode(),
          _strength = this@with.strength.toElement(),
          valueSet = this@with.valueSet.value,
          _valueSet = this@with.valueSet.toElement(),
        )
      }
  }
}

@Serializable
internal data class OperationDefinitionParameterReferencedFromSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var sourceId: KotlinString? = null,
  public var _sourceId: Element? = null,
) {
  public fun toModel(): OperationDefinition.Parameter.ReferencedFrom =
    OperationDefinition.Parameter.ReferencedFrom(
      id = this@OperationDefinitionParameterReferencedFromSurrogate.id,
      extension =
        this@OperationDefinitionParameterReferencedFromSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@OperationDefinitionParameterReferencedFromSurrogate.modifierExtension
          ?: mutableListOf(),
      source =
        R4String.of(
          this@OperationDefinitionParameterReferencedFromSurrogate.source,
          this@OperationDefinitionParameterReferencedFromSurrogate._source,
        )!!,
      sourceId =
        R4String.of(
          this@OperationDefinitionParameterReferencedFromSurrogate.sourceId,
          this@OperationDefinitionParameterReferencedFromSurrogate._sourceId,
        ),
    )

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Parameter.ReferencedFrom
    ): OperationDefinitionParameterReferencedFromSurrogate =
      with(model) {
        OperationDefinitionParameterReferencedFromSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          source = this@with.source.value,
          _source = this@with.source.toElement(),
          sourceId = this@with.sourceId?.value,
          _sourceId = this@with.sourceId?.toElement(),
        )
      }
  }
}

@Serializable
internal data class OperationDefinitionOverloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var parameterName: MutableList<KotlinString?>? = null,
  public var _parameterName: MutableList<Element?>? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): OperationDefinition.Overload =
    OperationDefinition.Overload(
      id = this@OperationDefinitionOverloadSurrogate.id,
      extension = this@OperationDefinitionOverloadSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@OperationDefinitionOverloadSurrogate.modifierExtension ?: mutableListOf(),
      parameterName =
        if (
          this@OperationDefinitionOverloadSurrogate.parameterName == null &&
            this@OperationDefinitionOverloadSurrogate._parameterName == null
        ) {
          mutableListOf()
        } else {
          (this@OperationDefinitionOverloadSurrogate.parameterName
              ?: List(this@OperationDefinitionOverloadSurrogate._parameterName!!.size) { null })
            .zip(
              this@OperationDefinitionOverloadSurrogate._parameterName
                ?: List(this@OperationDefinitionOverloadSurrogate.parameterName!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      comment =
        R4String.of(
          this@OperationDefinitionOverloadSurrogate.comment,
          this@OperationDefinitionOverloadSurrogate._comment,
        ),
    )

  public companion object {
    public fun fromModel(
      model: OperationDefinition.Overload
    ): OperationDefinitionOverloadSurrogate =
      with(model) {
        OperationDefinitionOverloadSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          parameterName =
            this@with.parameterName
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _parameterName =
            this@with.parameterName
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
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
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
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
  public var resource: MutableList<KotlinString?>? = null,
  public var _resource: MutableList<Element?>? = null,
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
  public var parameter: MutableList<OperationDefinition.Parameter>? = null,
  public var overload: MutableList<OperationDefinition.Overload>? = null,
) {
  public fun toModel(): OperationDefinition =
    OperationDefinition(
      id = this@OperationDefinitionSurrogate.id,
      meta = this@OperationDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@OperationDefinitionSurrogate.implicitRules,
          this@OperationDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@OperationDefinitionSurrogate.language,
          this@OperationDefinitionSurrogate._language,
        ),
      text = this@OperationDefinitionSurrogate.text,
      contained = this@OperationDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@OperationDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@OperationDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@OperationDefinitionSurrogate.url, this@OperationDefinitionSurrogate._url),
      version =
        R4String.of(
          this@OperationDefinitionSurrogate.version,
          this@OperationDefinitionSurrogate._version,
        ),
      name =
        R4String.of(
          this@OperationDefinitionSurrogate.name,
          this@OperationDefinitionSurrogate._name,
        )!!,
      title =
        R4String.of(
          this@OperationDefinitionSurrogate.title,
          this@OperationDefinitionSurrogate._title,
        ),
      status =
        Enumeration.of(
          PublicationStatus.fromCode(this@OperationDefinitionSurrogate.status!!),
          this@OperationDefinitionSurrogate._status,
        ),
      kind =
        Enumeration.of(
          OperationDefinition.OperationKind.fromCode(this@OperationDefinitionSurrogate.kind!!),
          this@OperationDefinitionSurrogate._kind,
        ),
      experimental =
        R4Boolean.of(
          this@OperationDefinitionSurrogate.experimental,
          this@OperationDefinitionSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@OperationDefinitionSurrogate.date),
          this@OperationDefinitionSurrogate._date,
        ),
      publisher =
        R4String.of(
          this@OperationDefinitionSurrogate.publisher,
          this@OperationDefinitionSurrogate._publisher,
        ),
      contact = this@OperationDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@OperationDefinitionSurrogate.description,
          this@OperationDefinitionSurrogate._description,
        ),
      useContext = this@OperationDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@OperationDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@OperationDefinitionSurrogate.purpose,
          this@OperationDefinitionSurrogate._purpose,
        ),
      affectsState =
        R4Boolean.of(
          this@OperationDefinitionSurrogate.affectsState,
          this@OperationDefinitionSurrogate._affectsState,
        ),
      code =
        Code.of(this@OperationDefinitionSurrogate.code, this@OperationDefinitionSurrogate._code)!!,
      comment =
        Markdown.of(
          this@OperationDefinitionSurrogate.comment,
          this@OperationDefinitionSurrogate._comment,
        ),
      base =
        Canonical.of(
          this@OperationDefinitionSurrogate.base,
          this@OperationDefinitionSurrogate._base,
        ),
      resource =
        if (
          this@OperationDefinitionSurrogate.resource == null &&
            this@OperationDefinitionSurrogate._resource == null
        ) {
          mutableListOf()
        } else {
          (this@OperationDefinitionSurrogate.resource
              ?: List(this@OperationDefinitionSurrogate._resource!!.size) { null })
            .zip(
              this@OperationDefinitionSurrogate._resource
                ?: List(this@OperationDefinitionSurrogate.resource!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(value.let { ResourceType.fromCode(it!!) }, element)
            }
            .toMutableList()
        },
      system =
        R4Boolean.of(
          this@OperationDefinitionSurrogate.system,
          this@OperationDefinitionSurrogate._system,
        )!!,
      type =
        R4Boolean.of(
          this@OperationDefinitionSurrogate.type,
          this@OperationDefinitionSurrogate._type,
        )!!,
      instance =
        R4Boolean.of(
          this@OperationDefinitionSurrogate.instance,
          this@OperationDefinitionSurrogate._instance,
        )!!,
      inputProfile =
        Canonical.of(
          this@OperationDefinitionSurrogate.inputProfile,
          this@OperationDefinitionSurrogate._inputProfile,
        ),
      outputProfile =
        Canonical.of(
          this@OperationDefinitionSurrogate.outputProfile,
          this@OperationDefinitionSurrogate._outputProfile,
        ),
      parameter = this@OperationDefinitionSurrogate.parameter ?: mutableListOf(),
      overload = this@OperationDefinitionSurrogate.overload ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: OperationDefinition): OperationDefinitionSurrogate =
      with(model) {
        OperationDefinitionSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          kind = this@with.kind.value?.getCode(),
          _kind = this@with.kind.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeIf { it.isNotEmpty() },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeIf { it.isNotEmpty() },
          jurisdiction = this@with.jurisdiction.takeIf { it.isNotEmpty() },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          affectsState = this@with.affectsState?.value,
          _affectsState = this@with.affectsState?.toElement(),
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          base = this@with.base?.value,
          _base = this@with.base?.toElement(),
          resource =
            this@with.resource
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _resource =
            this@with.resource
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          system = this@with.system.value,
          _system = this@with.system.toElement(),
          type = this@with.type.value,
          _type = this@with.type.toElement(),
          instance = this@with.instance.value,
          _instance = this@with.instance.toElement(),
          inputProfile = this@with.inputProfile?.value,
          _inputProfile = this@with.inputProfile?.toElement(),
          outputProfile = this@with.outputProfile?.value,
          _outputProfile = this@with.outputProfile?.toElement(),
          parameter = this@with.parameter.takeIf { it.isNotEmpty() },
          overload = this@with.overload.takeIf { it.isNotEmpty() },
        )
      }
  }
}
