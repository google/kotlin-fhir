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
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.SearchParameter
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SearchParameterComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
) {
  public fun toModel(): SearchParameter.Component =
    SearchParameter.Component(
      id = this@SearchParameterComponentSurrogate.id,
      extension = this@SearchParameterComponentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SearchParameterComponentSurrogate.modifierExtension ?: mutableListOf(),
      definition =
        Canonical.of(
          this@SearchParameterComponentSurrogate.definition,
          this@SearchParameterComponentSurrogate._definition,
        )!!,
      expression =
        R5String.of(
          this@SearchParameterComponentSurrogate.expression,
          this@SearchParameterComponentSurrogate._expression,
        )!!,
    )

  public companion object {
    public fun fromModel(model: SearchParameter.Component): SearchParameterComponentSurrogate =
      with(model) {
        SearchParameterComponentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          definition = this@with.definition.value,
          _definition = this@with.definition.toElement(),
          expression = this@with.expression.value,
          _expression = this@with.expression.toElement(),
        )
      }
  }
}

@Serializable
internal data class SearchParameterSurrogate(
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
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var derivedFrom: KotlinString? = null,
  public var _derivedFrom: Element? = null,
  public var status: KotlinString? = null,
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
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var base: MutableList<KotlinString?>? = null,
  public var _base: MutableList<Element?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
  public var processingMode: KotlinString? = null,
  public var _processingMode: Element? = null,
  public var constraint: KotlinString? = null,
  public var _constraint: Element? = null,
  public var target: MutableList<KotlinString?>? = null,
  public var _target: MutableList<Element?>? = null,
  public var multipleOr: KotlinBoolean? = null,
  public var _multipleOr: Element? = null,
  public var multipleAnd: KotlinBoolean? = null,
  public var _multipleAnd: Element? = null,
  public var comparator: MutableList<KotlinString?>? = null,
  public var _comparator: MutableList<Element?>? = null,
  public var modifier: MutableList<KotlinString?>? = null,
  public var _modifier: MutableList<Element?>? = null,
  public var chain: MutableList<KotlinString?>? = null,
  public var _chain: MutableList<Element?>? = null,
  public var component: MutableList<SearchParameter.Component>? = null,
) {
  public fun toModel(): SearchParameter =
    SearchParameter(
      id = this@SearchParameterSurrogate.id,
      meta = this@SearchParameterSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SearchParameterSurrogate.implicitRules,
          this@SearchParameterSurrogate._implicitRules,
        ),
      language =
        Code.of(this@SearchParameterSurrogate.language, this@SearchParameterSurrogate._language),
      text = this@SearchParameterSurrogate.text,
      contained = this@SearchParameterSurrogate.contained ?: mutableListOf(),
      extension = this@SearchParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SearchParameterSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@SearchParameterSurrogate.url, this@SearchParameterSurrogate._url)!!,
      identifier = this@SearchParameterSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(this@SearchParameterSurrogate.version, this@SearchParameterSurrogate._version),
      versionAlgorithm =
        SearchParameter.VersionAlgorithm?.from(
          R5String.of(
            this@SearchParameterSurrogate.versionAlgorithmString,
            this@SearchParameterSurrogate._versionAlgorithmString,
          ),
          this@SearchParameterSurrogate.versionAlgorithmCoding,
        ),
      name = R5String.of(this@SearchParameterSurrogate.name, this@SearchParameterSurrogate._name)!!,
      title =
        R5String.of(this@SearchParameterSurrogate.title, this@SearchParameterSurrogate._title),
      derivedFrom =
        Canonical.of(
          this@SearchParameterSurrogate.derivedFrom,
          this@SearchParameterSurrogate._derivedFrom,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@SearchParameterSurrogate.status!!
          ),
          this@SearchParameterSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@SearchParameterSurrogate.experimental,
          this@SearchParameterSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@SearchParameterSurrogate.date),
          this@SearchParameterSurrogate._date,
        ),
      publisher =
        R5String.of(
          this@SearchParameterSurrogate.publisher,
          this@SearchParameterSurrogate._publisher,
        ),
      contact = this@SearchParameterSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@SearchParameterSurrogate.description,
          this@SearchParameterSurrogate._description,
        )!!,
      useContext = this@SearchParameterSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@SearchParameterSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(this@SearchParameterSurrogate.purpose, this@SearchParameterSurrogate._purpose),
      copyright =
        Markdown.of(
          this@SearchParameterSurrogate.copyright,
          this@SearchParameterSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@SearchParameterSurrogate.copyrightLabel,
          this@SearchParameterSurrogate._copyrightLabel,
        ),
      code = Code.of(this@SearchParameterSurrogate.code, this@SearchParameterSurrogate._code)!!,
      base =
        if (
          this@SearchParameterSurrogate.base == null && this@SearchParameterSurrogate._base == null
        ) {
          mutableListOf()
        } else {
          (this@SearchParameterSurrogate.base
              ?: List(this@SearchParameterSurrogate._base!!.size) { null })
            .zip(
              this@SearchParameterSurrogate._base
                ?: List(this@SearchParameterSurrogate.base!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r5.SearchParameter.FHIRTypes.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      type =
        Enumeration.of(
          com.google.fhir.model.r5.SearchParamType.fromCode(this@SearchParameterSurrogate.type!!),
          this@SearchParameterSurrogate._type,
        ),
      expression =
        R5String.of(
          this@SearchParameterSurrogate.expression,
          this@SearchParameterSurrogate._expression,
        ),
      processingMode =
        this@SearchParameterSurrogate.processingMode?.let {
          Enumeration.of(
            com.google.fhir.model.r5.SearchParameter.SearchProcessingModeType.fromCode(it!!),
            this@SearchParameterSurrogate._processingMode,
          )
        },
      constraint =
        R5String.of(
          this@SearchParameterSurrogate.constraint,
          this@SearchParameterSurrogate._constraint,
        ),
      target =
        if (
          this@SearchParameterSurrogate.target == null &&
            this@SearchParameterSurrogate._target == null
        ) {
          mutableListOf()
        } else {
          (this@SearchParameterSurrogate.target
              ?: List(this@SearchParameterSurrogate._target!!.size) { null })
            .zip(
              this@SearchParameterSurrogate._target
                ?: List(this@SearchParameterSurrogate.target!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r5.SearchParameter.FHIRTypes.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      multipleOr =
        R5Boolean.of(
          this@SearchParameterSurrogate.multipleOr,
          this@SearchParameterSurrogate._multipleOr,
        ),
      multipleAnd =
        R5Boolean.of(
          this@SearchParameterSurrogate.multipleAnd,
          this@SearchParameterSurrogate._multipleAnd,
        ),
      comparator =
        if (
          this@SearchParameterSurrogate.comparator == null &&
            this@SearchParameterSurrogate._comparator == null
        ) {
          mutableListOf()
        } else {
          (this@SearchParameterSurrogate.comparator
              ?: List(this@SearchParameterSurrogate._comparator!!.size) { null })
            .zip(
              this@SearchParameterSurrogate._comparator
                ?: List(this@SearchParameterSurrogate.comparator!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.SearchParameter.SearchComparator.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      modifier =
        if (
          this@SearchParameterSurrogate.modifier == null &&
            this@SearchParameterSurrogate._modifier == null
        ) {
          mutableListOf()
        } else {
          (this@SearchParameterSurrogate.modifier
              ?: List(this@SearchParameterSurrogate._modifier!!.size) { null })
            .zip(
              this@SearchParameterSurrogate._modifier
                ?: List(this@SearchParameterSurrogate.modifier!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.SearchParameter.SearchModifierCode.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      chain =
        if (
          this@SearchParameterSurrogate.chain == null &&
            this@SearchParameterSurrogate._chain == null
        ) {
          mutableListOf()
        } else {
          (this@SearchParameterSurrogate.chain
              ?: List(this@SearchParameterSurrogate._chain!!.size) { null })
            .zip(
              this@SearchParameterSurrogate._chain
                ?: List(this@SearchParameterSurrogate.chain!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      component = this@SearchParameterSurrogate.component ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SearchParameter): SearchParameterSurrogate =
      with(model) {
        SearchParameterSurrogate(
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
          url = this@with.url.value,
          _url = this@with.url.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          derivedFrom = this@with.derivedFrom?.value,
          _derivedFrom = this@with.derivedFrom?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description.value,
          _description = this@with.description.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          base =
            this@with.base
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _base =
            this@with.base
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          expression = this@with.expression?.value,
          _expression = this@with.expression?.toElement(),
          processingMode = this@with.processingMode?.value?.getCode(),
          _processingMode = this@with.processingMode?.toElement(),
          constraint = this@with.constraint?.value,
          _constraint = this@with.constraint?.toElement(),
          target =
            this@with.target
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _target =
            this@with.target
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          multipleOr = this@with.multipleOr?.value,
          _multipleOr = this@with.multipleOr?.toElement(),
          multipleAnd = this@with.multipleAnd?.value,
          _multipleAnd = this@with.multipleAnd?.toElement(),
          comparator =
            this@with.comparator
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _comparator =
            this@with.comparator
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          modifier =
            this@with.modifier
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _modifier =
            this@with.modifier
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          chain =
            this@with.chain.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _chain =
            this@with.chain
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          component = this@with.component.takeUnless { it.all { it == null } },
        )
      }
  }
}
