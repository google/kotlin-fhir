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
import com.google.fhir.model.r5.ConceptMap
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
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
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
internal data class ConceptMapPropertySurrogate(
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
  public var system: KotlinString? = null,
  public var _system: Element? = null,
) {
  public fun toModel(): ConceptMap.Property =
    ConceptMap.Property(
      id = this@ConceptMapPropertySurrogate.id,
      extension = this@ConceptMapPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapPropertySurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(this@ConceptMapPropertySurrogate.code, this@ConceptMapPropertySurrogate._code)!!,
      uri = Uri.of(this@ConceptMapPropertySurrogate.uri, this@ConceptMapPropertySurrogate._uri),
      description =
        R5String.of(
          this@ConceptMapPropertySurrogate.description,
          this@ConceptMapPropertySurrogate._description,
        ),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.ConceptMap.PropertyType.fromCode(
            this@ConceptMapPropertySurrogate.type!!
          ),
          this@ConceptMapPropertySurrogate._type,
        ),
      system =
        Canonical.of(
          this@ConceptMapPropertySurrogate.system,
          this@ConceptMapPropertySurrogate._system,
        ),
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Property): ConceptMapPropertySurrogate =
      with(model) {
        ConceptMapPropertySurrogate(
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
          system = this@with.system?.value,
          _system = this@with.system?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConceptMapAdditionalAttributeSurrogate(
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
  public fun toModel(): ConceptMap.AdditionalAttribute =
    ConceptMap.AdditionalAttribute(
      id = this@ConceptMapAdditionalAttributeSurrogate.id,
      extension = this@ConceptMapAdditionalAttributeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapAdditionalAttributeSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ConceptMapAdditionalAttributeSurrogate.code,
          this@ConceptMapAdditionalAttributeSurrogate._code,
        )!!,
      uri =
        Uri.of(
          this@ConceptMapAdditionalAttributeSurrogate.uri,
          this@ConceptMapAdditionalAttributeSurrogate._uri,
        ),
      description =
        R5String.of(
          this@ConceptMapAdditionalAttributeSurrogate.description,
          this@ConceptMapAdditionalAttributeSurrogate._description,
        ),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.ConceptMap.ConceptMapmapAttributeType.fromCode(
            this@ConceptMapAdditionalAttributeSurrogate.type!!
          ),
          this@ConceptMapAdditionalAttributeSurrogate._type,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ConceptMap.AdditionalAttribute
    ): ConceptMapAdditionalAttributeSurrogate =
      with(model) {
        ConceptMapAdditionalAttributeSurrogate(
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
internal data class ConceptMapGroupElementTargetPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
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
  public var valueCode: KotlinString? = null,
  public var _valueCode: Element? = null,
) {
  public fun toModel(): ConceptMap.Group.Element.Target.Property =
    ConceptMap.Group.Element.Target.Property(
      id = this@ConceptMapGroupElementTargetPropertySurrogate.id,
      extension = this@ConceptMapGroupElementTargetPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupElementTargetPropertySurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ConceptMapGroupElementTargetPropertySurrogate.code,
          this@ConceptMapGroupElementTargetPropertySurrogate._code,
        )!!,
      `value` =
        ConceptMap.Group.Element.Target.Property.Value.from(
          this@ConceptMapGroupElementTargetPropertySurrogate.valueCoding,
          R5String.of(
            this@ConceptMapGroupElementTargetPropertySurrogate.valueString,
            this@ConceptMapGroupElementTargetPropertySurrogate._valueString,
          ),
          Integer.of(
            this@ConceptMapGroupElementTargetPropertySurrogate.valueInteger,
            this@ConceptMapGroupElementTargetPropertySurrogate._valueInteger,
          ),
          R5Boolean.of(
            this@ConceptMapGroupElementTargetPropertySurrogate.valueBoolean,
            this@ConceptMapGroupElementTargetPropertySurrogate._valueBoolean,
          ),
          DateTime.of(
            FhirDateTime.fromString(
              this@ConceptMapGroupElementTargetPropertySurrogate.valueDateTime
            ),
            this@ConceptMapGroupElementTargetPropertySurrogate._valueDateTime,
          ),
          Decimal.of(
            this@ConceptMapGroupElementTargetPropertySurrogate.valueDecimal,
            this@ConceptMapGroupElementTargetPropertySurrogate._valueDecimal,
          ),
          Code.of(
            this@ConceptMapGroupElementTargetPropertySurrogate.valueCode,
            this@ConceptMapGroupElementTargetPropertySurrogate._valueCode,
          ),
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ConceptMap.Group.Element.Target.Property
    ): ConceptMapGroupElementTargetPropertySurrogate =
      with(model) {
        ConceptMapGroupElementTargetPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
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
          valueCode = this@with.`value`?.asCode()?.value?.value,
          _valueCode = this@with.`value`?.asCode()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupElementTargetDependsOnSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var attribute: KotlinString? = null,
  public var _attribute: Element? = null,
  public var valueCode: KotlinString? = null,
  public var _valueCode: Element? = null,
  public var valueCoding: Coding? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
) {
  public fun toModel(): ConceptMap.Group.Element.Target.DependsOn =
    ConceptMap.Group.Element.Target.DependsOn(
      id = this@ConceptMapGroupElementTargetDependsOnSurrogate.id,
      extension = this@ConceptMapGroupElementTargetDependsOnSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupElementTargetDependsOnSurrogate.modifierExtension ?: mutableListOf(),
      attribute =
        Code.of(
          this@ConceptMapGroupElementTargetDependsOnSurrogate.attribute,
          this@ConceptMapGroupElementTargetDependsOnSurrogate._attribute,
        )!!,
      `value` =
        ConceptMap.Group.Element.Target.DependsOn.Value?.from(
          Code.of(
            this@ConceptMapGroupElementTargetDependsOnSurrogate.valueCode,
            this@ConceptMapGroupElementTargetDependsOnSurrogate._valueCode,
          ),
          this@ConceptMapGroupElementTargetDependsOnSurrogate.valueCoding,
          R5String.of(
            this@ConceptMapGroupElementTargetDependsOnSurrogate.valueString,
            this@ConceptMapGroupElementTargetDependsOnSurrogate._valueString,
          ),
          R5Boolean.of(
            this@ConceptMapGroupElementTargetDependsOnSurrogate.valueBoolean,
            this@ConceptMapGroupElementTargetDependsOnSurrogate._valueBoolean,
          ),
          this@ConceptMapGroupElementTargetDependsOnSurrogate.valueQuantity,
        ),
      valueSet =
        Canonical.of(
          this@ConceptMapGroupElementTargetDependsOnSurrogate.valueSet,
          this@ConceptMapGroupElementTargetDependsOnSurrogate._valueSet,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ConceptMap.Group.Element.Target.DependsOn
    ): ConceptMapGroupElementTargetDependsOnSurrogate =
      with(model) {
        ConceptMapGroupElementTargetDependsOnSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          attribute = this@with.attribute.value,
          _attribute = this@with.attribute.toElement(),
          valueCode = this@with.`value`?.asCode()?.value?.value,
          _valueCode = this@with.`value`?.asCode()?.value?.toElement(),
          valueCoding = this@with.`value`?.asCoding()?.value,
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupElementTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var relationship: KotlinString? = null,
  public var _relationship: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var `property`: MutableList<ConceptMap.Group.Element.Target.Property>? = null,
  public var dependsOn: MutableList<ConceptMap.Group.Element.Target.DependsOn>? = null,
  public var product: MutableList<ConceptMap.Group.Element.Target.DependsOn>? = null,
) {
  public fun toModel(): ConceptMap.Group.Element.Target =
    ConceptMap.Group.Element.Target(
      id = this@ConceptMapGroupElementTargetSurrogate.id,
      extension = this@ConceptMapGroupElementTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupElementTargetSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ConceptMapGroupElementTargetSurrogate.code,
          this@ConceptMapGroupElementTargetSurrogate._code,
        ),
      display =
        R5String.of(
          this@ConceptMapGroupElementTargetSurrogate.display,
          this@ConceptMapGroupElementTargetSurrogate._display,
        ),
      valueSet =
        Canonical.of(
          this@ConceptMapGroupElementTargetSurrogate.valueSet,
          this@ConceptMapGroupElementTargetSurrogate._valueSet,
        ),
      relationship =
        Enumeration.of(
          com.google.fhir.model.r5.ConceptMapRelationship.fromCode(
            this@ConceptMapGroupElementTargetSurrogate.relationship!!
          ),
          this@ConceptMapGroupElementTargetSurrogate._relationship,
        ),
      comment =
        R5String.of(
          this@ConceptMapGroupElementTargetSurrogate.comment,
          this@ConceptMapGroupElementTargetSurrogate._comment,
        ),
      `property` = this@ConceptMapGroupElementTargetSurrogate.`property` ?: mutableListOf(),
      dependsOn = this@ConceptMapGroupElementTargetSurrogate.dependsOn ?: mutableListOf(),
      product = this@ConceptMapGroupElementTargetSurrogate.product ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ConceptMap.Group.Element.Target
    ): ConceptMapGroupElementTargetSurrogate =
      with(model) {
        ConceptMapGroupElementTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          relationship = this@with.relationship.value?.getCode(),
          _relationship = this@with.relationship.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          dependsOn = this@with.dependsOn.takeUnless { it.all { it == null } },
          product = this@with.product.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupElementSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var noMap: KotlinBoolean? = null,
  public var _noMap: Element? = null,
  public var target: MutableList<ConceptMap.Group.Element.Target>? = null,
) {
  public fun toModel(): ConceptMap.Group.Element =
    ConceptMap.Group.Element(
      id = this@ConceptMapGroupElementSurrogate.id,
      extension = this@ConceptMapGroupElementSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapGroupElementSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ConceptMapGroupElementSurrogate.code,
          this@ConceptMapGroupElementSurrogate._code,
        ),
      display =
        R5String.of(
          this@ConceptMapGroupElementSurrogate.display,
          this@ConceptMapGroupElementSurrogate._display,
        ),
      valueSet =
        Canonical.of(
          this@ConceptMapGroupElementSurrogate.valueSet,
          this@ConceptMapGroupElementSurrogate._valueSet,
        ),
      noMap =
        R5Boolean.of(
          this@ConceptMapGroupElementSurrogate.noMap,
          this@ConceptMapGroupElementSurrogate._noMap,
        ),
      target = this@ConceptMapGroupElementSurrogate.target ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Group.Element): ConceptMapGroupElementSurrogate =
      with(model) {
        ConceptMapGroupElementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          noMap = this@with.noMap?.value,
          _noMap = this@with.noMap?.toElement(),
          target = this@with.target.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupUnmappedSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var relationship: KotlinString? = null,
  public var _relationship: Element? = null,
  public var otherMap: KotlinString? = null,
  public var _otherMap: Element? = null,
) {
  public fun toModel(): ConceptMap.Group.Unmapped =
    ConceptMap.Group.Unmapped(
      id = this@ConceptMapGroupUnmappedSurrogate.id,
      extension = this@ConceptMapGroupUnmappedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupUnmappedSurrogate.modifierExtension ?: mutableListOf(),
      mode =
        Enumeration.of(
          com.google.fhir.model.r5.ConceptMap.ConceptMapGroupUnmappedMode.fromCode(
            this@ConceptMapGroupUnmappedSurrogate.mode!!
          ),
          this@ConceptMapGroupUnmappedSurrogate._mode,
        ),
      code =
        Code.of(
          this@ConceptMapGroupUnmappedSurrogate.code,
          this@ConceptMapGroupUnmappedSurrogate._code,
        ),
      display =
        R5String.of(
          this@ConceptMapGroupUnmappedSurrogate.display,
          this@ConceptMapGroupUnmappedSurrogate._display,
        ),
      valueSet =
        Canonical.of(
          this@ConceptMapGroupUnmappedSurrogate.valueSet,
          this@ConceptMapGroupUnmappedSurrogate._valueSet,
        ),
      relationship =
        this@ConceptMapGroupUnmappedSurrogate.relationship?.let {
          Enumeration.of(
            com.google.fhir.model.r5.UnmappedConceptMapRelationship.fromCode(it!!),
            this@ConceptMapGroupUnmappedSurrogate._relationship,
          )
        },
      otherMap =
        Canonical.of(
          this@ConceptMapGroupUnmappedSurrogate.otherMap,
          this@ConceptMapGroupUnmappedSurrogate._otherMap,
        ),
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Group.Unmapped): ConceptMapGroupUnmappedSurrogate =
      with(model) {
        ConceptMapGroupUnmappedSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          relationship = this@with.relationship?.value?.getCode(),
          _relationship = this@with.relationship?.toElement(),
          otherMap = this@with.otherMap?.value,
          _otherMap = this@with.otherMap?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var target: KotlinString? = null,
  public var _target: Element? = null,
  public var element: MutableList<ConceptMap.Group.Element>? = null,
  public var unmapped: ConceptMap.Group.Unmapped? = null,
) {
  public fun toModel(): ConceptMap.Group =
    ConceptMap.Group(
      id = this@ConceptMapGroupSurrogate.id,
      extension = this@ConceptMapGroupSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapGroupSurrogate.modifierExtension ?: mutableListOf(),
      source =
        Canonical.of(this@ConceptMapGroupSurrogate.source, this@ConceptMapGroupSurrogate._source),
      target =
        Canonical.of(this@ConceptMapGroupSurrogate.target, this@ConceptMapGroupSurrogate._target),
      element = this@ConceptMapGroupSurrogate.element ?: mutableListOf(),
      unmapped = this@ConceptMapGroupSurrogate.unmapped,
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Group): ConceptMapGroupSurrogate =
      with(model) {
        ConceptMapGroupSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          source = this@with.source?.value,
          _source = this@with.source?.toElement(),
          target = this@with.target?.value,
          _target = this@with.target?.toElement(),
          element = this@with.element.takeUnless { it.all { it == null } },
          unmapped = this@with.unmapped,
        )
      }
  }
}

@Serializable
internal data class ConceptMapSurrogate(
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
  public var `property`: MutableList<ConceptMap.Property>? = null,
  public var additionalAttribute: MutableList<ConceptMap.AdditionalAttribute>? = null,
  public var sourceScopeUri: KotlinString? = null,
  public var _sourceScopeUri: Element? = null,
  public var sourceScopeCanonical: KotlinString? = null,
  public var _sourceScopeCanonical: Element? = null,
  public var targetScopeUri: KotlinString? = null,
  public var _targetScopeUri: Element? = null,
  public var targetScopeCanonical: KotlinString? = null,
  public var _targetScopeCanonical: Element? = null,
  public var group: MutableList<ConceptMap.Group>? = null,
) {
  public fun toModel(): ConceptMap =
    ConceptMap(
      id = this@ConceptMapSurrogate.id,
      meta = this@ConceptMapSurrogate.meta,
      implicitRules =
        Uri.of(this@ConceptMapSurrogate.implicitRules, this@ConceptMapSurrogate._implicitRules),
      language = Code.of(this@ConceptMapSurrogate.language, this@ConceptMapSurrogate._language),
      text = this@ConceptMapSurrogate.text,
      contained = this@ConceptMapSurrogate.contained ?: mutableListOf(),
      extension = this@ConceptMapSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@ConceptMapSurrogate.url, this@ConceptMapSurrogate._url),
      identifier = this@ConceptMapSurrogate.identifier ?: mutableListOf(),
      version = R5String.of(this@ConceptMapSurrogate.version, this@ConceptMapSurrogate._version),
      versionAlgorithm =
        ConceptMap.VersionAlgorithm?.from(
          R5String.of(
            this@ConceptMapSurrogate.versionAlgorithmString,
            this@ConceptMapSurrogate._versionAlgorithmString,
          ),
          this@ConceptMapSurrogate.versionAlgorithmCoding,
        ),
      name = R5String.of(this@ConceptMapSurrogate.name, this@ConceptMapSurrogate._name),
      title = R5String.of(this@ConceptMapSurrogate.title, this@ConceptMapSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(this@ConceptMapSurrogate.status!!),
          this@ConceptMapSurrogate._status,
        ),
      experimental =
        R5Boolean.of(this@ConceptMapSurrogate.experimental, this@ConceptMapSurrogate._experimental),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ConceptMapSurrogate.date),
          this@ConceptMapSurrogate._date,
        ),
      publisher =
        R5String.of(this@ConceptMapSurrogate.publisher, this@ConceptMapSurrogate._publisher),
      contact = this@ConceptMapSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@ConceptMapSurrogate.description, this@ConceptMapSurrogate._description),
      useContext = this@ConceptMapSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ConceptMapSurrogate.jurisdiction ?: mutableListOf(),
      purpose = Markdown.of(this@ConceptMapSurrogate.purpose, this@ConceptMapSurrogate._purpose),
      copyright =
        Markdown.of(this@ConceptMapSurrogate.copyright, this@ConceptMapSurrogate._copyright),
      copyrightLabel =
        R5String.of(
          this@ConceptMapSurrogate.copyrightLabel,
          this@ConceptMapSurrogate._copyrightLabel,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ConceptMapSurrogate.approvalDate),
          this@ConceptMapSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ConceptMapSurrogate.lastReviewDate),
          this@ConceptMapSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@ConceptMapSurrogate.effectivePeriod,
      topic = this@ConceptMapSurrogate.topic ?: mutableListOf(),
      author = this@ConceptMapSurrogate.author ?: mutableListOf(),
      editor = this@ConceptMapSurrogate.editor ?: mutableListOf(),
      reviewer = this@ConceptMapSurrogate.reviewer ?: mutableListOf(),
      endorser = this@ConceptMapSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@ConceptMapSurrogate.relatedArtifact ?: mutableListOf(),
      `property` = this@ConceptMapSurrogate.`property` ?: mutableListOf(),
      additionalAttribute = this@ConceptMapSurrogate.additionalAttribute ?: mutableListOf(),
      sourceScope =
        ConceptMap.SourceScope?.from(
          Uri.of(this@ConceptMapSurrogate.sourceScopeUri, this@ConceptMapSurrogate._sourceScopeUri),
          Canonical.of(
            this@ConceptMapSurrogate.sourceScopeCanonical,
            this@ConceptMapSurrogate._sourceScopeCanonical,
          ),
        ),
      targetScope =
        ConceptMap.TargetScope?.from(
          Uri.of(this@ConceptMapSurrogate.targetScopeUri, this@ConceptMapSurrogate._targetScopeUri),
          Canonical.of(
            this@ConceptMapSurrogate.targetScopeCanonical,
            this@ConceptMapSurrogate._targetScopeCanonical,
          ),
        ),
      group = this@ConceptMapSurrogate.group ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ConceptMap): ConceptMapSurrogate =
      with(model) {
        ConceptMapSurrogate(
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
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
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
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          additionalAttribute = this@with.additionalAttribute.takeUnless { it.all { it == null } },
          sourceScopeUri = this@with.sourceScope?.asUri()?.value?.value,
          _sourceScopeUri = this@with.sourceScope?.asUri()?.value?.toElement(),
          sourceScopeCanonical = this@with.sourceScope?.asCanonical()?.value?.value,
          _sourceScopeCanonical = this@with.sourceScope?.asCanonical()?.value?.toElement(),
          targetScopeUri = this@with.targetScope?.asUri()?.value?.value,
          _targetScopeUri = this@with.targetScope?.asUri()?.value?.toElement(),
          targetScopeCanonical = this@with.targetScope?.asCanonical()?.value?.value,
          _targetScopeCanonical = this@with.targetScope?.asCanonical()?.value?.toElement(),
          group = this@with.group.takeUnless { it.all { it == null } },
        )
      }
  }
}
