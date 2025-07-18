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
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.ValueSet
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
internal data class ValueSetComposeIncludeConceptDesignationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var use: Coding? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): ValueSet.Compose.Include.Concept.Designation =
    ValueSet.Compose.Include.Concept.Designation(
      id = this@ValueSetComposeIncludeConceptDesignationSurrogate.id,
      extension =
        this@ValueSetComposeIncludeConceptDesignationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetComposeIncludeConceptDesignationSurrogate.modifierExtension ?: mutableListOf(),
      language =
        Code.of(
          this@ValueSetComposeIncludeConceptDesignationSurrogate.language,
          this@ValueSetComposeIncludeConceptDesignationSurrogate._language,
        ),
      use = this@ValueSetComposeIncludeConceptDesignationSurrogate.use,
      `value` =
        R4String.of(
          this@ValueSetComposeIncludeConceptDesignationSurrogate.`value`,
          this@ValueSetComposeIncludeConceptDesignationSurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ValueSet.Compose.Include.Concept.Designation
    ): ValueSetComposeIncludeConceptDesignationSurrogate =
      with(model) {
        ValueSetComposeIncludeConceptDesignationSurrogate(
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
internal data class ValueSetComposeIncludeConceptSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var designation: MutableList<ValueSet.Compose.Include.Concept.Designation>? = null,
) {
  public fun toModel(): ValueSet.Compose.Include.Concept =
    ValueSet.Compose.Include.Concept(
      id = this@ValueSetComposeIncludeConceptSurrogate.id,
      extension = this@ValueSetComposeIncludeConceptSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetComposeIncludeConceptSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ValueSetComposeIncludeConceptSurrogate.code,
          this@ValueSetComposeIncludeConceptSurrogate._code,
        )!!,
      display =
        R4String.of(
          this@ValueSetComposeIncludeConceptSurrogate.display,
          this@ValueSetComposeIncludeConceptSurrogate._display,
        ),
      designation = this@ValueSetComposeIncludeConceptSurrogate.designation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ValueSet.Compose.Include.Concept
    ): ValueSetComposeIncludeConceptSurrogate =
      with(model) {
        ValueSetComposeIncludeConceptSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          designation = this@with.designation.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ValueSetComposeIncludeFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `property`: KotlinString? = null,
  public var _property: Element? = null,
  public var op: KotlinString? = null,
  public var _op: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): ValueSet.Compose.Include.Filter =
    ValueSet.Compose.Include.Filter(
      id = this@ValueSetComposeIncludeFilterSurrogate.id,
      extension = this@ValueSetComposeIncludeFilterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetComposeIncludeFilterSurrogate.modifierExtension ?: mutableListOf(),
      `property` =
        Code.of(
          this@ValueSetComposeIncludeFilterSurrogate.`property`,
          this@ValueSetComposeIncludeFilterSurrogate._property,
        )!!,
      op =
        Enumeration.of(
          com.google.fhir.model.r4.ValueSet.FilterOperator.fromCode(
            this@ValueSetComposeIncludeFilterSurrogate.op!!
          ),
          this@ValueSetComposeIncludeFilterSurrogate._op,
        ),
      `value` =
        R4String.of(
          this@ValueSetComposeIncludeFilterSurrogate.`value`,
          this@ValueSetComposeIncludeFilterSurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ValueSet.Compose.Include.Filter
    ): ValueSetComposeIncludeFilterSurrogate =
      with(model) {
        ValueSetComposeIncludeFilterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.value,
          _property = this@with.`property`.toElement(),
          op = this@with.op.value?.getCode(),
          _op = this@with.op.toElement(),
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class ValueSetComposeIncludeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var system: KotlinString? = null,
  public var _system: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var concept: MutableList<ValueSet.Compose.Include.Concept>? = null,
  public var filter: MutableList<ValueSet.Compose.Include.Filter>? = null,
  public var valueSet: MutableList<KotlinString?>? = null,
  public var _valueSet: MutableList<Element?>? = null,
) {
  public fun toModel(): ValueSet.Compose.Include =
    ValueSet.Compose.Include(
      id = this@ValueSetComposeIncludeSurrogate.id,
      extension = this@ValueSetComposeIncludeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ValueSetComposeIncludeSurrogate.modifierExtension ?: mutableListOf(),
      system =
        Uri.of(
          this@ValueSetComposeIncludeSurrogate.system,
          this@ValueSetComposeIncludeSurrogate._system,
        ),
      version =
        R4String.of(
          this@ValueSetComposeIncludeSurrogate.version,
          this@ValueSetComposeIncludeSurrogate._version,
        ),
      concept = this@ValueSetComposeIncludeSurrogate.concept ?: mutableListOf(),
      filter = this@ValueSetComposeIncludeSurrogate.filter ?: mutableListOf(),
      valueSet =
        if (
          this@ValueSetComposeIncludeSurrogate.valueSet == null &&
            this@ValueSetComposeIncludeSurrogate._valueSet == null
        ) {
          mutableListOf()
        } else {
          (this@ValueSetComposeIncludeSurrogate.valueSet
              ?: List(this@ValueSetComposeIncludeSurrogate._valueSet!!.size) { null })
            .zip(
              this@ValueSetComposeIncludeSurrogate._valueSet
                ?: List(this@ValueSetComposeIncludeSurrogate.valueSet!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: ValueSet.Compose.Include): ValueSetComposeIncludeSurrogate =
      with(model) {
        ValueSetComposeIncludeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          system = this@with.system?.value,
          _system = this@with.system?.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          concept = this@with.concept.takeUnless { it.all { it == null } },
          filter = this@with.filter.takeUnless { it.all { it == null } },
          valueSet =
            this@with.valueSet
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _valueSet =
            this@with.valueSet
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ValueSetComposeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var lockedDate: KotlinString? = null,
  public var _lockedDate: Element? = null,
  public var inactive: KotlinBoolean? = null,
  public var _inactive: Element? = null,
  public var include: MutableList<ValueSet.Compose.Include>? = null,
  public var exclude: MutableList<ValueSet.Compose.Include>? = null,
) {
  public fun toModel(): ValueSet.Compose =
    ValueSet.Compose(
      id = this@ValueSetComposeSurrogate.id,
      extension = this@ValueSetComposeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ValueSetComposeSurrogate.modifierExtension ?: mutableListOf(),
      lockedDate =
        Date.of(
          FhirDate.fromString(this@ValueSetComposeSurrogate.lockedDate),
          this@ValueSetComposeSurrogate._lockedDate,
        ),
      inactive =
        R4Boolean.of(
          this@ValueSetComposeSurrogate.inactive,
          this@ValueSetComposeSurrogate._inactive,
        ),
      include = this@ValueSetComposeSurrogate.include ?: mutableListOf(),
      exclude = this@ValueSetComposeSurrogate.exclude ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ValueSet.Compose): ValueSetComposeSurrogate =
      with(model) {
        ValueSetComposeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          lockedDate = this@with.lockedDate?.value?.toString(),
          _lockedDate = this@with.lockedDate?.toElement(),
          inactive = this@with.inactive?.value,
          _inactive = this@with.inactive?.toElement(),
          include = this@with.include.takeUnless { it.all { it == null } },
          exclude = this@with.exclude.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueDecimal: Double? = null,
  public var _valueDecimal: Element? = null,
  public var valueUri: KotlinString? = null,
  public var _valueUri: Element? = null,
  public var valueCode: KotlinString? = null,
  public var _valueCode: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
) {
  public fun toModel(): ValueSet.Expansion.Parameter =
    ValueSet.Expansion.Parameter(
      id = this@ValueSetExpansionParameterSurrogate.id,
      extension = this@ValueSetExpansionParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetExpansionParameterSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R4String.of(
          this@ValueSetExpansionParameterSurrogate.name,
          this@ValueSetExpansionParameterSurrogate._name,
        )!!,
      `value` =
        ValueSet.Expansion.Parameter.Value?.from(
          R4String.of(
            this@ValueSetExpansionParameterSurrogate.valueString,
            this@ValueSetExpansionParameterSurrogate._valueString,
          ),
          R4Boolean.of(
            this@ValueSetExpansionParameterSurrogate.valueBoolean,
            this@ValueSetExpansionParameterSurrogate._valueBoolean,
          ),
          Integer.of(
            this@ValueSetExpansionParameterSurrogate.valueInteger,
            this@ValueSetExpansionParameterSurrogate._valueInteger,
          ),
          Decimal.of(
            this@ValueSetExpansionParameterSurrogate.valueDecimal,
            this@ValueSetExpansionParameterSurrogate._valueDecimal,
          ),
          Uri.of(
            this@ValueSetExpansionParameterSurrogate.valueUri,
            this@ValueSetExpansionParameterSurrogate._valueUri,
          ),
          Code.of(
            this@ValueSetExpansionParameterSurrogate.valueCode,
            this@ValueSetExpansionParameterSurrogate._valueCode,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ValueSetExpansionParameterSurrogate.valueDateTime),
            this@ValueSetExpansionParameterSurrogate._valueDateTime,
          ),
        ),
    )

  public companion object {
    public fun fromModel(model: ValueSet.Expansion.Parameter): ValueSetExpansionParameterSurrogate =
      with(model) {
        ValueSetExpansionParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueInteger = this@with.`value`?.asInteger()?.value?.value,
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement(),
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value,
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement(),
          valueUri = this@with.`value`?.asUri()?.value?.value,
          _valueUri = this@with.`value`?.asUri()?.value?.toElement(),
          valueCode = this@with.`value`?.asCode()?.value?.value,
          _valueCode = this@with.`value`?.asCode()?.value?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionContainsSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var system: KotlinString? = null,
  public var _system: Element? = null,
  public var `abstract`: KotlinBoolean? = null,
  public var _abstract: Element? = null,
  public var inactive: KotlinBoolean? = null,
  public var _inactive: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var designation: MutableList<ValueSet.Compose.Include.Concept.Designation>? = null,
  public var contains: MutableList<ValueSet.Expansion.Contains>? = null,
) {
  public fun toModel(): ValueSet.Expansion.Contains =
    ValueSet.Expansion.Contains(
      id = this@ValueSetExpansionContainsSurrogate.id,
      extension = this@ValueSetExpansionContainsSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetExpansionContainsSurrogate.modifierExtension ?: mutableListOf(),
      system =
        Uri.of(
          this@ValueSetExpansionContainsSurrogate.system,
          this@ValueSetExpansionContainsSurrogate._system,
        ),
      `abstract` =
        R4Boolean.of(
          this@ValueSetExpansionContainsSurrogate.`abstract`,
          this@ValueSetExpansionContainsSurrogate._abstract,
        ),
      inactive =
        R4Boolean.of(
          this@ValueSetExpansionContainsSurrogate.inactive,
          this@ValueSetExpansionContainsSurrogate._inactive,
        ),
      version =
        R4String.of(
          this@ValueSetExpansionContainsSurrogate.version,
          this@ValueSetExpansionContainsSurrogate._version,
        ),
      code =
        Code.of(
          this@ValueSetExpansionContainsSurrogate.code,
          this@ValueSetExpansionContainsSurrogate._code,
        ),
      display =
        R4String.of(
          this@ValueSetExpansionContainsSurrogate.display,
          this@ValueSetExpansionContainsSurrogate._display,
        ),
      designation = this@ValueSetExpansionContainsSurrogate.designation ?: mutableListOf(),
      contains = this@ValueSetExpansionContainsSurrogate.contains ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ValueSet.Expansion.Contains): ValueSetExpansionContainsSurrogate =
      with(model) {
        ValueSetExpansionContainsSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          system = this@with.system?.value,
          _system = this@with.system?.toElement(),
          `abstract` = this@with.`abstract`?.value,
          _abstract = this@with.`abstract`?.toElement(),
          inactive = this@with.inactive?.value,
          _inactive = this@with.inactive?.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          designation = this@with.designation.takeUnless { it.all { it == null } },
          contains = this@with.contains.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: KotlinString? = null,
  public var _identifier: Element? = null,
  public var timestamp: KotlinString? = null,
  public var _timestamp: Element? = null,
  public var total: Int? = null,
  public var _total: Element? = null,
  public var offset: Int? = null,
  public var _offset: Element? = null,
  public var parameter: MutableList<ValueSet.Expansion.Parameter>? = null,
  public var contains: MutableList<ValueSet.Expansion.Contains>? = null,
) {
  public fun toModel(): ValueSet.Expansion =
    ValueSet.Expansion(
      id = this@ValueSetExpansionSurrogate.id,
      extension = this@ValueSetExpansionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ValueSetExpansionSurrogate.modifierExtension ?: mutableListOf(),
      identifier =
        Uri.of(
          this@ValueSetExpansionSurrogate.identifier,
          this@ValueSetExpansionSurrogate._identifier,
        ),
      timestamp =
        DateTime.of(
          FhirDateTime.fromString(this@ValueSetExpansionSurrogate.timestamp),
          this@ValueSetExpansionSurrogate._timestamp,
        )!!,
      total =
        Integer.of(this@ValueSetExpansionSurrogate.total, this@ValueSetExpansionSurrogate._total),
      offset =
        Integer.of(this@ValueSetExpansionSurrogate.offset, this@ValueSetExpansionSurrogate._offset),
      parameter = this@ValueSetExpansionSurrogate.parameter ?: mutableListOf(),
      contains = this@ValueSetExpansionSurrogate.contains ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ValueSet.Expansion): ValueSetExpansionSurrogate =
      with(model) {
        ValueSetExpansionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier?.value,
          _identifier = this@with.identifier?.toElement(),
          timestamp = this@with.timestamp.value?.toString(),
          _timestamp = this@with.timestamp.toElement(),
          total = this@with.total?.value,
          _total = this@with.total?.toElement(),
          offset = this@with.offset?.value,
          _offset = this@with.offset?.toElement(),
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
          contains = this@with.contains.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ValueSetSurrogate(
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
  public var immutable: KotlinBoolean? = null,
  public var _immutable: Element? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var compose: ValueSet.Compose? = null,
  public var expansion: ValueSet.Expansion? = null,
) {
  public fun toModel(): ValueSet =
    ValueSet(
      id = this@ValueSetSurrogate.id,
      meta = this@ValueSetSurrogate.meta,
      implicitRules =
        Uri.of(this@ValueSetSurrogate.implicitRules, this@ValueSetSurrogate._implicitRules),
      language = Code.of(this@ValueSetSurrogate.language, this@ValueSetSurrogate._language),
      text = this@ValueSetSurrogate.text,
      contained = this@ValueSetSurrogate.contained ?: mutableListOf(),
      extension = this@ValueSetSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ValueSetSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@ValueSetSurrogate.url, this@ValueSetSurrogate._url),
      identifier = this@ValueSetSurrogate.identifier ?: mutableListOf(),
      version = R4String.of(this@ValueSetSurrogate.version, this@ValueSetSurrogate._version),
      name = R4String.of(this@ValueSetSurrogate.name, this@ValueSetSurrogate._name),
      title = R4String.of(this@ValueSetSurrogate.title, this@ValueSetSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PublicationStatus.fromCode(this@ValueSetSurrogate.status!!),
          this@ValueSetSurrogate._status,
        ),
      experimental =
        R4Boolean.of(this@ValueSetSurrogate.experimental, this@ValueSetSurrogate._experimental),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ValueSetSurrogate.date),
          this@ValueSetSurrogate._date,
        ),
      publisher = R4String.of(this@ValueSetSurrogate.publisher, this@ValueSetSurrogate._publisher),
      contact = this@ValueSetSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@ValueSetSurrogate.description, this@ValueSetSurrogate._description),
      useContext = this@ValueSetSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ValueSetSurrogate.jurisdiction ?: mutableListOf(),
      immutable = R4Boolean.of(this@ValueSetSurrogate.immutable, this@ValueSetSurrogate._immutable),
      purpose = Markdown.of(this@ValueSetSurrogate.purpose, this@ValueSetSurrogate._purpose),
      copyright = Markdown.of(this@ValueSetSurrogate.copyright, this@ValueSetSurrogate._copyright),
      compose = this@ValueSetSurrogate.compose,
      expansion = this@ValueSetSurrogate.expansion,
    )

  public companion object {
    public fun fromModel(model: ValueSet): ValueSetSurrogate =
      with(model) {
        ValueSetSurrogate(
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
          immutable = this@with.immutable?.value,
          _immutable = this@with.immutable?.toElement(),
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          compose = this@with.compose,
          expansion = this@with.expansion,
        )
      }
  }
}
