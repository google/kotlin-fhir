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
import com.google.fhir.model.r4.CodeSystem
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.UnsignedInt
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CodeSystemFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var `operator`: MutableList<KotlinString?>? = null,
  public var _operator: MutableList<Element?>? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): CodeSystem.Filter =
    CodeSystem.Filter(
      id = this@CodeSystemFilterSurrogate.id,
      extension = this@CodeSystemFilterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CodeSystemFilterSurrogate.modifierExtension ?: mutableListOf(),
      code = Code.of(this@CodeSystemFilterSurrogate.code, this@CodeSystemFilterSurrogate._code)!!,
      description =
        R4String.of(
          this@CodeSystemFilterSurrogate.description,
          this@CodeSystemFilterSurrogate._description,
        ),
      `operator` =
        if (
          this@CodeSystemFilterSurrogate.`operator` == null &&
            this@CodeSystemFilterSurrogate._operator == null
        ) {
          mutableListOf()
        } else {
          (this@CodeSystemFilterSurrogate.`operator`
              ?: List(this@CodeSystemFilterSurrogate._operator!!.size) { null })
            .zip(
              this@CodeSystemFilterSurrogate._operator
                ?: List(this@CodeSystemFilterSurrogate.`operator`!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r4.CodeSystem.FilterOperator.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      `value` =
        R4String.of(this@CodeSystemFilterSurrogate.`value`, this@CodeSystemFilterSurrogate._value)!!,
    )

  public companion object {
    public fun fromModel(model: CodeSystem.Filter): CodeSystemFilterSurrogate =
      with(model) {
        CodeSystemFilterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          `operator` =
            this@with.`operator`
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _operator =
            this@with.`operator`
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class CodeSystemPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): CodeSystem.Property =
    CodeSystem.Property(
      id = this@CodeSystemPropertySurrogate.id,
      extension = this@CodeSystemPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CodeSystemPropertySurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(this@CodeSystemPropertySurrogate.code, this@CodeSystemPropertySurrogate._code)!!,
      uri = Uri.of(this@CodeSystemPropertySurrogate.uri, this@CodeSystemPropertySurrogate._uri),
      description =
        R4String.of(
          this@CodeSystemPropertySurrogate.description,
          this@CodeSystemPropertySurrogate._description,
        ),
      type =
        Enumeration.of(
          com.google.fhir.model.r4.CodeSystem.PropertyType.fromCode(
            this@CodeSystemPropertySurrogate.type!!
          ),
          this@CodeSystemPropertySurrogate._type,
        ),
    )

  public companion object {
    public fun fromModel(model: CodeSystem.Property): CodeSystemPropertySurrogate =
      with(model) {
        CodeSystemPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          uri = this@with.uri?.value,
          _uri = this@with.uri?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
        )
      }
  }
}

@Serializable
internal data class CodeSystemConceptDesignationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var use: Coding? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): CodeSystem.Concept.Designation =
    CodeSystem.Concept.Designation(
      id = this@CodeSystemConceptDesignationSurrogate.id,
      extension = this@CodeSystemConceptDesignationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CodeSystemConceptDesignationSurrogate.modifierExtension ?: mutableListOf(),
      language =
        Code.of(
          this@CodeSystemConceptDesignationSurrogate.language,
          this@CodeSystemConceptDesignationSurrogate._language,
        ),
      use = this@CodeSystemConceptDesignationSurrogate.use,
      `value` =
        R4String.of(
          this@CodeSystemConceptDesignationSurrogate.`value`,
          this@CodeSystemConceptDesignationSurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: CodeSystem.Concept.Designation
    ): CodeSystemConceptDesignationSurrogate =
      with(model) {
        CodeSystemConceptDesignationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          use = this@with.use,
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class CodeSystemConceptPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var valueCode: KotlinString? = null,
  public var _valueCode: Element? = null,
  public var valueCoding: Coding? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valueDecimal: Double? = null,
  public var _valueDecimal: Element? = null,
) {
  public fun toModel(): CodeSystem.Concept.Property =
    CodeSystem.Concept.Property(
      id = this@CodeSystemConceptPropertySurrogate.id,
      extension = this@CodeSystemConceptPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CodeSystemConceptPropertySurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@CodeSystemConceptPropertySurrogate.code,
          this@CodeSystemConceptPropertySurrogate._code,
        )!!,
      `value` =
        CodeSystem.Concept.Property.Value.from(
          Code.of(
            this@CodeSystemConceptPropertySurrogate.valueCode,
            this@CodeSystemConceptPropertySurrogate._valueCode,
          ),
          this@CodeSystemConceptPropertySurrogate.valueCoding,
          R4String.of(
            this@CodeSystemConceptPropertySurrogate.valueString,
            this@CodeSystemConceptPropertySurrogate._valueString,
          ),
          Integer.of(
            this@CodeSystemConceptPropertySurrogate.valueInteger,
            this@CodeSystemConceptPropertySurrogate._valueInteger,
          ),
          R4Boolean.of(
            this@CodeSystemConceptPropertySurrogate.valueBoolean,
            this@CodeSystemConceptPropertySurrogate._valueBoolean,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@CodeSystemConceptPropertySurrogate.valueDateTime),
            this@CodeSystemConceptPropertySurrogate._valueDateTime,
          ),
          Decimal.of(
            this@CodeSystemConceptPropertySurrogate.valueDecimal,
            this@CodeSystemConceptPropertySurrogate._valueDecimal,
          ),
        )!!,
    )

  public companion object {
    public fun fromModel(model: CodeSystem.Concept.Property): CodeSystemConceptPropertySurrogate =
      with(model) {
        CodeSystemConceptPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          valueCode = this@with.`value`?.asCode()?.value?.value,
          _valueCode = this@with.`value`?.asCode()?.value?.toElement(),
          valueCoding = this@with.`value`?.asCoding()?.value,
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueInteger = this@with.`value`?.asInteger()?.value?.value,
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value,
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CodeSystemConceptSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var designation: MutableList<CodeSystem.Concept.Designation>? = null,
  public var `property`: MutableList<CodeSystem.Concept.Property>? = null,
  public var concept: MutableList<CodeSystem.Concept>? = null,
) {
  public fun toModel(): CodeSystem.Concept =
    CodeSystem.Concept(
      id = this@CodeSystemConceptSurrogate.id,
      extension = this@CodeSystemConceptSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CodeSystemConceptSurrogate.modifierExtension ?: mutableListOf(),
      code = Code.of(this@CodeSystemConceptSurrogate.code, this@CodeSystemConceptSurrogate._code)!!,
      display =
        R4String.of(
          this@CodeSystemConceptSurrogate.display,
          this@CodeSystemConceptSurrogate._display,
        ),
      definition =
        R4String.of(
          this@CodeSystemConceptSurrogate.definition,
          this@CodeSystemConceptSurrogate._definition,
        ),
      designation = this@CodeSystemConceptSurrogate.designation ?: mutableListOf(),
      `property` = this@CodeSystemConceptSurrogate.`property` ?: mutableListOf(),
      concept = this@CodeSystemConceptSurrogate.concept ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CodeSystem.Concept): CodeSystemConceptSurrogate =
      with(model) {
        CodeSystemConceptSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          definition = this@with.definition?.value,
          _definition = this@with.definition?.toElement(),
          designation = this@with.designation.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          concept = this@with.concept.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CodeSystemSurrogate(
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
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
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
  public var caseSensitive: KotlinBoolean? = null,
  public var _caseSensitive: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var hierarchyMeaning: KotlinString? = null,
  public var _hierarchyMeaning: Element? = null,
  public var compositional: KotlinBoolean? = null,
  public var _compositional: Element? = null,
  public var versionNeeded: KotlinBoolean? = null,
  public var _versionNeeded: Element? = null,
  public var content: KotlinString? = null,
  public var _content: Element? = null,
  public var supplements: KotlinString? = null,
  public var _supplements: Element? = null,
  public var count: Int? = null,
  public var _count: Element? = null,
  public var filter: MutableList<CodeSystem.Filter>? = null,
  public var `property`: MutableList<CodeSystem.Property>? = null,
  public var concept: MutableList<CodeSystem.Concept>? = null,
) {
  public fun toModel(): CodeSystem =
    CodeSystem(
      id = this@CodeSystemSurrogate.id,
      meta = this@CodeSystemSurrogate.meta,
      implicitRules =
        Uri.of(this@CodeSystemSurrogate.implicitRules, this@CodeSystemSurrogate._implicitRules),
      language = Code.of(this@CodeSystemSurrogate.language, this@CodeSystemSurrogate._language),
      text = this@CodeSystemSurrogate.text,
      contained = this@CodeSystemSurrogate.contained ?: mutableListOf(),
      extension = this@CodeSystemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CodeSystemSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@CodeSystemSurrogate.url, this@CodeSystemSurrogate._url),
      identifier = this@CodeSystemSurrogate.identifier ?: mutableListOf(),
      version = R4String.of(this@CodeSystemSurrogate.version, this@CodeSystemSurrogate._version),
      name = R4String.of(this@CodeSystemSurrogate.name, this@CodeSystemSurrogate._name),
      title = R4String.of(this@CodeSystemSurrogate.title, this@CodeSystemSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PublicationStatus.fromCode(this@CodeSystemSurrogate.status!!),
          this@CodeSystemSurrogate._status,
        ),
      experimental =
        R4Boolean.of(this@CodeSystemSurrogate.experimental, this@CodeSystemSurrogate._experimental),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CodeSystemSurrogate.date),
          this@CodeSystemSurrogate._date,
        ),
      publisher =
        R4String.of(this@CodeSystemSurrogate.publisher, this@CodeSystemSurrogate._publisher),
      contact = this@CodeSystemSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@CodeSystemSurrogate.description, this@CodeSystemSurrogate._description),
      useContext = this@CodeSystemSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@CodeSystemSurrogate.jurisdiction ?: mutableListOf(),
      purpose = Markdown.of(this@CodeSystemSurrogate.purpose, this@CodeSystemSurrogate._purpose),
      copyright =
        Markdown.of(this@CodeSystemSurrogate.copyright, this@CodeSystemSurrogate._copyright),
      caseSensitive =
        R4Boolean.of(
          this@CodeSystemSurrogate.caseSensitive,
          this@CodeSystemSurrogate._caseSensitive,
        ),
      valueSet =
        Canonical.of(this@CodeSystemSurrogate.valueSet, this@CodeSystemSurrogate._valueSet),
      hierarchyMeaning =
        this@CodeSystemSurrogate.hierarchyMeaning?.let {
          Enumeration.of(
            com.google.fhir.model.r4.CodeSystem.CodeSystemHierarchyMeaning.fromCode(it!!),
            this@CodeSystemSurrogate._hierarchyMeaning,
          )
        },
      compositional =
        R4Boolean.of(
          this@CodeSystemSurrogate.compositional,
          this@CodeSystemSurrogate._compositional,
        ),
      versionNeeded =
        R4Boolean.of(
          this@CodeSystemSurrogate.versionNeeded,
          this@CodeSystemSurrogate._versionNeeded,
        ),
      content =
        Enumeration.of(
          com.google.fhir.model.r4.CodeSystem.CodeSystemContentMode.fromCode(
            this@CodeSystemSurrogate.content!!
          ),
          this@CodeSystemSurrogate._content,
        ),
      supplements =
        Canonical.of(this@CodeSystemSurrogate.supplements, this@CodeSystemSurrogate._supplements),
      count = UnsignedInt.of(this@CodeSystemSurrogate.count, this@CodeSystemSurrogate._count),
      filter = this@CodeSystemSurrogate.filter ?: mutableListOf(),
      `property` = this@CodeSystemSurrogate.`property` ?: mutableListOf(),
      concept = this@CodeSystemSurrogate.concept ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CodeSystem): CodeSystemSurrogate =
      with(model) {
        CodeSystemSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          caseSensitive = this@with.caseSensitive?.value,
          _caseSensitive = this@with.caseSensitive?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          hierarchyMeaning = this@with.hierarchyMeaning?.value?.getCode(),
          _hierarchyMeaning = this@with.hierarchyMeaning?.toElement(),
          compositional = this@with.compositional?.value,
          _compositional = this@with.compositional?.toElement(),
          versionNeeded = this@with.versionNeeded?.value,
          _versionNeeded = this@with.versionNeeded?.toElement(),
          content = this@with.content.value?.getCode(),
          _content = this@with.content.toElement(),
          supplements = this@with.supplements?.value,
          _supplements = this@with.supplements?.toElement(),
          count = this@with.count?.value,
          _count = this@with.count?.toElement(),
          filter = this@with.filter.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          concept = this@with.concept.takeUnless { it.all { it == null } },
        )
      }
  }
}
