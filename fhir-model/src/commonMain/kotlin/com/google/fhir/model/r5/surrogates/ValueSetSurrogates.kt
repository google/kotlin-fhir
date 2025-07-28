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
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.ValueSet
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
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
  public var additionalUse: MutableList<Coding>? = null,
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
      additionalUse =
        this@ValueSetComposeIncludeConceptDesignationSurrogate.additionalUse ?: mutableListOf(),
      `value` =
        R5String.of(
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
          additionalUse = this@with.additionalUse.takeUnless { it.all { it == null } },
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
        R5String.of(
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
          com.google.fhir.model.r5.ValueSet.FilterOperator.fromCode(
            this@ValueSetComposeIncludeFilterSurrogate.op!!
          ),
          this@ValueSetComposeIncludeFilterSurrogate._op,
        ),
      `value` =
        R5String.of(
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
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
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
        R5String.of(
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
      copyright =
        R5String.of(
          this@ValueSetComposeIncludeSurrogate.copyright,
          this@ValueSetComposeIncludeSurrogate._copyright,
        ),
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
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
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
  public var `property`: MutableList<KotlinString?>? = null,
  public var _property: MutableList<Element?>? = null,
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
        R5Boolean.of(
          this@ValueSetComposeSurrogate.inactive,
          this@ValueSetComposeSurrogate._inactive,
        ),
      include = this@ValueSetComposeSurrogate.include ?: mutableListOf(),
      exclude = this@ValueSetComposeSurrogate.exclude ?: mutableListOf(),
      `property` =
        if (
          this@ValueSetComposeSurrogate.`property` == null &&
            this@ValueSetComposeSurrogate._property == null
        ) {
          mutableListOf()
        } else {
          (this@ValueSetComposeSurrogate.`property`
              ?: List(this@ValueSetComposeSurrogate._property!!.size) { null })
            .zip(
              this@ValueSetComposeSurrogate._property
                ?: List(this@ValueSetComposeSurrogate.`property`!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
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
          `property` =
            this@with.`property`
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _property =
            this@with.`property`
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionParameterValueSurrogate(
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
  public fun toModel(): ValueSet.Expansion.Parameter.Value? =
    ValueSet.Expansion.Parameter.Value?.from(
      R5String.of(
        this@ValueSetExpansionParameterValueSurrogate.valueString,
        this@ValueSetExpansionParameterValueSurrogate._valueString,
      ),
      R5Boolean.of(
        this@ValueSetExpansionParameterValueSurrogate.valueBoolean,
        this@ValueSetExpansionParameterValueSurrogate._valueBoolean,
      ),
      Integer.of(
        this@ValueSetExpansionParameterValueSurrogate.valueInteger,
        this@ValueSetExpansionParameterValueSurrogate._valueInteger,
      ),
      Decimal.of(
        this@ValueSetExpansionParameterValueSurrogate.valueDecimal,
        this@ValueSetExpansionParameterValueSurrogate._valueDecimal,
      ),
      Uri.of(
        this@ValueSetExpansionParameterValueSurrogate.valueUri,
        this@ValueSetExpansionParameterValueSurrogate._valueUri,
      ),
      Code.of(
        this@ValueSetExpansionParameterValueSurrogate.valueCode,
        this@ValueSetExpansionParameterValueSurrogate._valueCode,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@ValueSetExpansionParameterValueSurrogate.valueDateTime),
        this@ValueSetExpansionParameterValueSurrogate._valueDateTime,
      ),
    )

  public companion object {
    public fun fromModel(
      model: ValueSet.Expansion.Parameter.Value
    ): ValueSetExpansionParameterValueSurrogate =
      with(model) {
        ValueSetExpansionParameterValueSurrogate().apply {
          ValueSet.Expansion.Parameter.Value?.from(
            R5String.of(
              this@ValueSetExpansionParameterValueSurrogate.valueString,
              this@ValueSetExpansionParameterValueSurrogate._valueString,
            ),
            R5Boolean.of(
              this@ValueSetExpansionParameterValueSurrogate.valueBoolean,
              this@ValueSetExpansionParameterValueSurrogate._valueBoolean,
            ),
            Integer.of(
              this@ValueSetExpansionParameterValueSurrogate.valueInteger,
              this@ValueSetExpansionParameterValueSurrogate._valueInteger,
            ),
            Decimal.of(
              this@ValueSetExpansionParameterValueSurrogate.valueDecimal,
              this@ValueSetExpansionParameterValueSurrogate._valueDecimal,
            ),
            Uri.of(
              this@ValueSetExpansionParameterValueSurrogate.valueUri,
              this@ValueSetExpansionParameterValueSurrogate._valueUri,
            ),
            Code.of(
              this@ValueSetExpansionParameterValueSurrogate.valueCode,
              this@ValueSetExpansionParameterValueSurrogate._valueCode,
            ),
            DateTime.of(
              FhirDateTime.fromString(this@ValueSetExpansionParameterValueSurrogate.valueDateTime),
              this@ValueSetExpansionParameterValueSurrogate._valueDateTime,
            ),
          )
        }
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
  public var `value`: ValueSet.Expansion.Parameter.Value? = null,
) {
  public fun toModel(): ValueSet.Expansion.Parameter =
    ValueSet.Expansion.Parameter(
      id = this@ValueSetExpansionParameterSurrogate.id,
      extension = this@ValueSetExpansionParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetExpansionParameterSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@ValueSetExpansionParameterSurrogate.name,
          this@ValueSetExpansionParameterSurrogate._name,
        )!!,
      `value` = this@ValueSetExpansionParameterSurrogate.`value`,
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
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
) {
  public fun toModel(): ValueSet.Expansion.Property =
    ValueSet.Expansion.Property(
      id = this@ValueSetExpansionPropertySurrogate.id,
      extension = this@ValueSetExpansionPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetExpansionPropertySurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ValueSetExpansionPropertySurrogate.code,
          this@ValueSetExpansionPropertySurrogate._code,
        )!!,
      uri =
        Uri.of(
          this@ValueSetExpansionPropertySurrogate.uri,
          this@ValueSetExpansionPropertySurrogate._uri,
        ),
    )

  public companion object {
    public fun fromModel(model: ValueSet.Expansion.Property): ValueSetExpansionPropertySurrogate =
      with(model) {
        ValueSetExpansionPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          uri = this@with.uri?.value,
          _uri = this@with.uri?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionContainsPropertySubPropertyValueSurrogate(
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
  public fun toModel(): ValueSet.Expansion.Contains.Property.SubProperty.Value =
    ValueSet.Expansion.Contains.Property.SubProperty.Value.from(
      Code.of(
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueCode,
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueCode,
      ),
      this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueCoding,
      R5String.of(
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueString,
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueString,
      ),
      Integer.of(
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueInteger,
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueInteger,
      ),
      R5Boolean.of(
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueBoolean,
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueBoolean,
      ),
      DateTime.of(
        FhirDateTime.fromString(
          this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueDateTime
        ),
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueDateTime,
      ),
      Decimal.of(
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueDecimal,
        this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueDecimal,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ValueSet.Expansion.Contains.Property.SubProperty.Value
    ): ValueSetExpansionContainsPropertySubPropertyValueSurrogate =
      with(model) {
        ValueSetExpansionContainsPropertySubPropertyValueSurrogate().apply {
          ValueSet.Expansion.Contains.Property.SubProperty.Value.from(
            Code.of(
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueCode,
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueCode,
            ),
            this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueCoding,
            R5String.of(
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueString,
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueString,
            ),
            Integer.of(
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueInteger,
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueInteger,
            ),
            R5Boolean.of(
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueBoolean,
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueBoolean,
            ),
            DateTime.of(
              FhirDateTime.fromString(
                this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueDateTime
              ),
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueDateTime,
            ),
            Decimal.of(
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate.valueDecimal,
              this@ValueSetExpansionContainsPropertySubPropertyValueSurrogate._valueDecimal,
            ),
          )!!
        }
      }
  }
}

@Serializable
internal data class ValueSetExpansionContainsPropertySubPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var `value`: ValueSet.Expansion.Contains.Property.SubProperty.Value,
) {
  public fun toModel(): ValueSet.Expansion.Contains.Property.SubProperty =
    ValueSet.Expansion.Contains.Property.SubProperty(
      id = this@ValueSetExpansionContainsPropertySubPropertySurrogate.id,
      extension =
        this@ValueSetExpansionContainsPropertySubPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetExpansionContainsPropertySubPropertySurrogate.modifierExtension
          ?: mutableListOf(),
      code =
        Code.of(
          this@ValueSetExpansionContainsPropertySubPropertySurrogate.code,
          this@ValueSetExpansionContainsPropertySubPropertySurrogate._code,
        )!!,
      `value` = this@ValueSetExpansionContainsPropertySubPropertySurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: ValueSet.Expansion.Contains.Property.SubProperty
    ): ValueSetExpansionContainsPropertySubPropertySurrogate =
      with(model) {
        ValueSetExpansionContainsPropertySubPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class ValueSetExpansionContainsPropertyValueSurrogate(
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
  public fun toModel(): ValueSet.Expansion.Contains.Property.Value =
    ValueSet.Expansion.Contains.Property.Value.from(
      Code.of(
        this@ValueSetExpansionContainsPropertyValueSurrogate.valueCode,
        this@ValueSetExpansionContainsPropertyValueSurrogate._valueCode,
      ),
      this@ValueSetExpansionContainsPropertyValueSurrogate.valueCoding,
      R5String.of(
        this@ValueSetExpansionContainsPropertyValueSurrogate.valueString,
        this@ValueSetExpansionContainsPropertyValueSurrogate._valueString,
      ),
      Integer.of(
        this@ValueSetExpansionContainsPropertyValueSurrogate.valueInteger,
        this@ValueSetExpansionContainsPropertyValueSurrogate._valueInteger,
      ),
      R5Boolean.of(
        this@ValueSetExpansionContainsPropertyValueSurrogate.valueBoolean,
        this@ValueSetExpansionContainsPropertyValueSurrogate._valueBoolean,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@ValueSetExpansionContainsPropertyValueSurrogate.valueDateTime),
        this@ValueSetExpansionContainsPropertyValueSurrogate._valueDateTime,
      ),
      Decimal.of(
        this@ValueSetExpansionContainsPropertyValueSurrogate.valueDecimal,
        this@ValueSetExpansionContainsPropertyValueSurrogate._valueDecimal,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ValueSet.Expansion.Contains.Property.Value
    ): ValueSetExpansionContainsPropertyValueSurrogate =
      with(model) {
        ValueSetExpansionContainsPropertyValueSurrogate().apply {
          ValueSet.Expansion.Contains.Property.Value.from(
            Code.of(
              this@ValueSetExpansionContainsPropertyValueSurrogate.valueCode,
              this@ValueSetExpansionContainsPropertyValueSurrogate._valueCode,
            ),
            this@ValueSetExpansionContainsPropertyValueSurrogate.valueCoding,
            R5String.of(
              this@ValueSetExpansionContainsPropertyValueSurrogate.valueString,
              this@ValueSetExpansionContainsPropertyValueSurrogate._valueString,
            ),
            Integer.of(
              this@ValueSetExpansionContainsPropertyValueSurrogate.valueInteger,
              this@ValueSetExpansionContainsPropertyValueSurrogate._valueInteger,
            ),
            R5Boolean.of(
              this@ValueSetExpansionContainsPropertyValueSurrogate.valueBoolean,
              this@ValueSetExpansionContainsPropertyValueSurrogate._valueBoolean,
            ),
            DateTime.of(
              FhirDateTime.fromString(
                this@ValueSetExpansionContainsPropertyValueSurrogate.valueDateTime
              ),
              this@ValueSetExpansionContainsPropertyValueSurrogate._valueDateTime,
            ),
            Decimal.of(
              this@ValueSetExpansionContainsPropertyValueSurrogate.valueDecimal,
              this@ValueSetExpansionContainsPropertyValueSurrogate._valueDecimal,
            ),
          )!!
        }
      }
  }
}

@Serializable
internal data class ValueSetExpansionContainsPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var subProperty: MutableList<ValueSet.Expansion.Contains.Property.SubProperty>? = null,
  public var `value`: ValueSet.Expansion.Contains.Property.Value,
) {
  public fun toModel(): ValueSet.Expansion.Contains.Property =
    ValueSet.Expansion.Contains.Property(
      id = this@ValueSetExpansionContainsPropertySurrogate.id,
      extension = this@ValueSetExpansionContainsPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ValueSetExpansionContainsPropertySurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ValueSetExpansionContainsPropertySurrogate.code,
          this@ValueSetExpansionContainsPropertySurrogate._code,
        )!!,
      `value` = this@ValueSetExpansionContainsPropertySurrogate.`value`,
      subProperty = this@ValueSetExpansionContainsPropertySurrogate.subProperty ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ValueSet.Expansion.Contains.Property
    ): ValueSetExpansionContainsPropertySurrogate =
      with(model) {
        ValueSetExpansionContainsPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          `value` = this@with.`value`,
          subProperty = this@with.subProperty.takeUnless { it.all { it == null } },
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
  public var `property`: MutableList<ValueSet.Expansion.Contains.Property>? = null,
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
        R5Boolean.of(
          this@ValueSetExpansionContainsSurrogate.`abstract`,
          this@ValueSetExpansionContainsSurrogate._abstract,
        ),
      inactive =
        R5Boolean.of(
          this@ValueSetExpansionContainsSurrogate.inactive,
          this@ValueSetExpansionContainsSurrogate._inactive,
        ),
      version =
        R5String.of(
          this@ValueSetExpansionContainsSurrogate.version,
          this@ValueSetExpansionContainsSurrogate._version,
        ),
      code =
        Code.of(
          this@ValueSetExpansionContainsSurrogate.code,
          this@ValueSetExpansionContainsSurrogate._code,
        ),
      display =
        R5String.of(
          this@ValueSetExpansionContainsSurrogate.display,
          this@ValueSetExpansionContainsSurrogate._display,
        ),
      designation = this@ValueSetExpansionContainsSurrogate.designation ?: mutableListOf(),
      `property` = this@ValueSetExpansionContainsSurrogate.`property` ?: mutableListOf(),
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
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
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
  public var next: KotlinString? = null,
  public var _next: Element? = null,
  public var timestamp: KotlinString? = null,
  public var _timestamp: Element? = null,
  public var total: Int? = null,
  public var _total: Element? = null,
  public var offset: Int? = null,
  public var _offset: Element? = null,
  public var parameter: MutableList<ValueSet.Expansion.Parameter>? = null,
  public var `property`: MutableList<ValueSet.Expansion.Property>? = null,
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
      next = Uri.of(this@ValueSetExpansionSurrogate.next, this@ValueSetExpansionSurrogate._next),
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
      `property` = this@ValueSetExpansionSurrogate.`property` ?: mutableListOf(),
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
          next = this@with.next?.value,
          _next = this@with.next?.toElement(),
          timestamp = this@with.timestamp.value?.toString(),
          _timestamp = this@with.timestamp.toElement(),
          total = this@with.total?.value,
          _total = this@with.total?.toElement(),
          offset = this@with.offset?.value,
          _offset = this@with.offset?.toElement(),
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          contains = this@with.contains.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ValueSetScopeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var inclusionCriteria: KotlinString? = null,
  public var _inclusionCriteria: Element? = null,
  public var exclusionCriteria: KotlinString? = null,
  public var _exclusionCriteria: Element? = null,
) {
  public fun toModel(): ValueSet.Scope =
    ValueSet.Scope(
      id = this@ValueSetScopeSurrogate.id,
      extension = this@ValueSetScopeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ValueSetScopeSurrogate.modifierExtension ?: mutableListOf(),
      inclusionCriteria =
        R5String.of(
          this@ValueSetScopeSurrogate.inclusionCriteria,
          this@ValueSetScopeSurrogate._inclusionCriteria,
        ),
      exclusionCriteria =
        R5String.of(
          this@ValueSetScopeSurrogate.exclusionCriteria,
          this@ValueSetScopeSurrogate._exclusionCriteria,
        ),
    )

  public companion object {
    public fun fromModel(model: ValueSet.Scope): ValueSetScopeSurrogate =
      with(model) {
        ValueSetScopeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          inclusionCriteria = this@with.inclusionCriteria?.value,
          _inclusionCriteria = this@with.inclusionCriteria?.toElement(),
          exclusionCriteria = this@with.exclusionCriteria?.value,
          _exclusionCriteria = this@with.exclusionCriteria?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ValueSetVersionAlgorithmSurrogate(
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
) {
  public fun toModel(): ValueSet.VersionAlgorithm? =
    ValueSet.VersionAlgorithm?.from(
      R5String.of(
        this@ValueSetVersionAlgorithmSurrogate.versionAlgorithmString,
        this@ValueSetVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@ValueSetVersionAlgorithmSurrogate.versionAlgorithmCoding,
    )

  public companion object {
    public fun fromModel(model: ValueSet.VersionAlgorithm): ValueSetVersionAlgorithmSurrogate =
      with(model) {
        ValueSetVersionAlgorithmSurrogate().apply {
          ValueSet.VersionAlgorithm?.from(
            R5String.of(
              this@ValueSetVersionAlgorithmSurrogate.versionAlgorithmString,
              this@ValueSetVersionAlgorithmSurrogate._versionAlgorithmString,
            ),
            this@ValueSetVersionAlgorithmSurrogate.versionAlgorithmCoding,
          )
        }
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
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: MutableList<CodeableConcept>? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var compose: ValueSet.Compose? = null,
  public var expansion: ValueSet.Expansion? = null,
  public var scope: ValueSet.Scope? = null,
  public var versionAlgorithm: ValueSet.VersionAlgorithm? = null,
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
      version = R5String.of(this@ValueSetSurrogate.version, this@ValueSetSurrogate._version),
      versionAlgorithm = this@ValueSetSurrogate.versionAlgorithm,
      name = R5String.of(this@ValueSetSurrogate.name, this@ValueSetSurrogate._name),
      title = R5String.of(this@ValueSetSurrogate.title, this@ValueSetSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(this@ValueSetSurrogate.status!!),
          this@ValueSetSurrogate._status,
        ),
      experimental =
        R5Boolean.of(this@ValueSetSurrogate.experimental, this@ValueSetSurrogate._experimental),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ValueSetSurrogate.date),
          this@ValueSetSurrogate._date,
        ),
      publisher = R5String.of(this@ValueSetSurrogate.publisher, this@ValueSetSurrogate._publisher),
      contact = this@ValueSetSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@ValueSetSurrogate.description, this@ValueSetSurrogate._description),
      useContext = this@ValueSetSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ValueSetSurrogate.jurisdiction ?: mutableListOf(),
      immutable = R5Boolean.of(this@ValueSetSurrogate.immutable, this@ValueSetSurrogate._immutable),
      purpose = Markdown.of(this@ValueSetSurrogate.purpose, this@ValueSetSurrogate._purpose),
      copyright = Markdown.of(this@ValueSetSurrogate.copyright, this@ValueSetSurrogate._copyright),
      copyrightLabel =
        R5String.of(this@ValueSetSurrogate.copyrightLabel, this@ValueSetSurrogate._copyrightLabel),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ValueSetSurrogate.approvalDate),
          this@ValueSetSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ValueSetSurrogate.lastReviewDate),
          this@ValueSetSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@ValueSetSurrogate.effectivePeriod,
      topic = this@ValueSetSurrogate.topic ?: mutableListOf(),
      author = this@ValueSetSurrogate.author ?: mutableListOf(),
      editor = this@ValueSetSurrogate.editor ?: mutableListOf(),
      reviewer = this@ValueSetSurrogate.reviewer ?: mutableListOf(),
      endorser = this@ValueSetSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@ValueSetSurrogate.relatedArtifact ?: mutableListOf(),
      compose = this@ValueSetSurrogate.compose,
      expansion = this@ValueSetSurrogate.expansion,
      scope = this@ValueSetSurrogate.scope,
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
          versionAlgorithm = this@with.versionAlgorithm,
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
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          effectivePeriod = this@with.effectivePeriod,
          topic = this@with.topic.takeUnless { it.all { it == null } },
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          compose = this@with.compose,
          expansion = this@with.expansion,
          scope = this@with.scope,
        )
      }
  }
}
