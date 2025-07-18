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

import com.google.fhir.model.r5.Address
import com.google.fhir.model.r5.Age
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Availability
import com.google.fhir.model.r5.Base64Binary
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.ContactPoint
import com.google.fhir.model.r5.Count
import com.google.fhir.model.r5.DataRequirement
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Distance
import com.google.fhir.model.r5.Dosage
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.ElementDefinition
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.HumanName
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Integer64
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Oid
import com.google.fhir.model.r5.ParameterDefinition
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.RatioRange
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.SampledData
import com.google.fhir.model.r5.Signature
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.TriggerDefinition
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.Uuid
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ElementDefinitionSlicingDiscriminatorSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
) {
  public fun toModel(): ElementDefinition.Slicing.Discriminator =
    ElementDefinition.Slicing.Discriminator(
      id = this@ElementDefinitionSlicingDiscriminatorSurrogate.id,
      extension = this@ElementDefinitionSlicingDiscriminatorSurrogate.extension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.ElementDefinition.DiscriminatorType.fromCode(
            this@ElementDefinitionSlicingDiscriminatorSurrogate.type!!
          ),
          this@ElementDefinitionSlicingDiscriminatorSurrogate._type,
        ),
      path =
        R5String.of(
          this@ElementDefinitionSlicingDiscriminatorSurrogate.path,
          this@ElementDefinitionSlicingDiscriminatorSurrogate._path,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ElementDefinition.Slicing.Discriminator
    ): ElementDefinitionSlicingDiscriminatorSurrogate =
      with(model) {
        ElementDefinitionSlicingDiscriminatorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          path = this@with.path.value,
          _path = this@with.path.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionSlicingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var discriminator: MutableList<ElementDefinition.Slicing.Discriminator>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var ordered: KotlinBoolean? = null,
  public var _ordered: Element? = null,
  public var rules: KotlinString? = null,
  public var _rules: Element? = null,
) {
  public fun toModel(): ElementDefinition.Slicing =
    ElementDefinition.Slicing(
      id = this@ElementDefinitionSlicingSurrogate.id,
      extension = this@ElementDefinitionSlicingSurrogate.extension ?: mutableListOf(),
      discriminator = this@ElementDefinitionSlicingSurrogate.discriminator ?: mutableListOf(),
      description =
        R5String.of(
          this@ElementDefinitionSlicingSurrogate.description,
          this@ElementDefinitionSlicingSurrogate._description,
        ),
      ordered =
        R5Boolean.of(
          this@ElementDefinitionSlicingSurrogate.ordered,
          this@ElementDefinitionSlicingSurrogate._ordered,
        ),
      rules =
        Enumeration.of(
          com.google.fhir.model.r5.ElementDefinition.SlicingRules.fromCode(
            this@ElementDefinitionSlicingSurrogate.rules!!
          ),
          this@ElementDefinitionSlicingSurrogate._rules,
        ),
    )

  public companion object {
    public fun fromModel(model: ElementDefinition.Slicing): ElementDefinitionSlicingSurrogate =
      with(model) {
        ElementDefinitionSlicingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          discriminator = this@with.discriminator.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          ordered = this@with.ordered?.value,
          _ordered = this@with.ordered?.toElement(),
          rules = this@with.rules.value?.getCode(),
          _rules = this@with.rules.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionBaseSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
) {
  public fun toModel(): ElementDefinition.Base =
    ElementDefinition.Base(
      id = this@ElementDefinitionBaseSurrogate.id,
      extension = this@ElementDefinitionBaseSurrogate.extension ?: mutableListOf(),
      path =
        R5String.of(
          this@ElementDefinitionBaseSurrogate.path,
          this@ElementDefinitionBaseSurrogate._path,
        )!!,
      min =
        UnsignedInt.of(
          this@ElementDefinitionBaseSurrogate.min,
          this@ElementDefinitionBaseSurrogate._min,
        )!!,
      max =
        R5String.of(
          this@ElementDefinitionBaseSurrogate.max,
          this@ElementDefinitionBaseSurrogate._max,
        )!!,
    )

  public companion object {
    public fun fromModel(model: ElementDefinition.Base): ElementDefinitionBaseSurrogate =
      with(model) {
        ElementDefinitionBaseSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          path = this@with.path.value,
          _path = this@with.path.toElement(),
          min = this@with.min.value,
          _min = this@with.min.toElement(),
          max = this@with.max.value,
          _max = this@with.max.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionTypeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var profile: MutableList<KotlinString?>? = null,
  public var _profile: MutableList<Element?>? = null,
  public var targetProfile: MutableList<KotlinString?>? = null,
  public var _targetProfile: MutableList<Element?>? = null,
  public var aggregation: MutableList<KotlinString?>? = null,
  public var _aggregation: MutableList<Element?>? = null,
  public var versioning: KotlinString? = null,
  public var _versioning: Element? = null,
) {
  public fun toModel(): ElementDefinition.Type =
    ElementDefinition.Type(
      id = this@ElementDefinitionTypeSurrogate.id,
      extension = this@ElementDefinitionTypeSurrogate.extension ?: mutableListOf(),
      code =
        Uri.of(
          this@ElementDefinitionTypeSurrogate.code,
          this@ElementDefinitionTypeSurrogate._code,
        )!!,
      profile =
        if (
          this@ElementDefinitionTypeSurrogate.profile == null &&
            this@ElementDefinitionTypeSurrogate._profile == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionTypeSurrogate.profile
              ?: List(this@ElementDefinitionTypeSurrogate._profile!!.size) { null })
            .zip(
              this@ElementDefinitionTypeSurrogate._profile
                ?: List(this@ElementDefinitionTypeSurrogate.profile!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      targetProfile =
        if (
          this@ElementDefinitionTypeSurrogate.targetProfile == null &&
            this@ElementDefinitionTypeSurrogate._targetProfile == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionTypeSurrogate.targetProfile
              ?: List(this@ElementDefinitionTypeSurrogate._targetProfile!!.size) { null })
            .zip(
              this@ElementDefinitionTypeSurrogate._targetProfile
                ?: List(this@ElementDefinitionTypeSurrogate.targetProfile!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      aggregation =
        if (
          this@ElementDefinitionTypeSurrogate.aggregation == null &&
            this@ElementDefinitionTypeSurrogate._aggregation == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionTypeSurrogate.aggregation
              ?: List(this@ElementDefinitionTypeSurrogate._aggregation!!.size) { null })
            .zip(
              this@ElementDefinitionTypeSurrogate._aggregation
                ?: List(this@ElementDefinitionTypeSurrogate.aggregation!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.ElementDefinition.AggregationMode.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      versioning =
        this@ElementDefinitionTypeSurrogate.versioning?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ElementDefinition.ReferenceVersionRules.fromCode(it!!),
            this@ElementDefinitionTypeSurrogate._versioning,
          )
        },
    )

  public companion object {
    public fun fromModel(model: ElementDefinition.Type): ElementDefinitionTypeSurrogate =
      with(model) {
        ElementDefinitionTypeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          profile =
            this@with.profile.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _profile =
            this@with.profile
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
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
          aggregation =
            this@with.aggregation
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _aggregation =
            this@with.aggregation
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          versioning = this@with.versioning?.value?.getCode(),
          _versioning = this@with.versioning?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionExampleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var valueBase64Binary: KotlinString? = null,
  public var _valueBase64Binary: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueCanonical: KotlinString? = null,
  public var _valueCanonical: Element? = null,
  public var valueCode: KotlinString? = null,
  public var _valueCode: Element? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valueDecimal: Double? = null,
  public var _valueDecimal: Element? = null,
  public var valueId: KotlinString? = null,
  public var _valueId: Element? = null,
  public var valueInstant: KotlinString? = null,
  public var _valueInstant: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueInteger64: Int? = null,
  public var _valueInteger64: Element? = null,
  public var valueMarkdown: KotlinString? = null,
  public var _valueMarkdown: Element? = null,
  public var valueOid: KotlinString? = null,
  public var _valueOid: Element? = null,
  public var valuePositiveInt: Int? = null,
  public var _valuePositiveInt: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueTime: LocalTime? = null,
  public var _valueTime: Element? = null,
  public var valueUnsignedInt: Int? = null,
  public var _valueUnsignedInt: Element? = null,
  public var valueUri: KotlinString? = null,
  public var _valueUri: Element? = null,
  public var valueUrl: KotlinString? = null,
  public var _valueUrl: Element? = null,
  public var valueUuid: KotlinString? = null,
  public var _valueUuid: Element? = null,
  public var valueAddress: Address? = null,
  public var valueAge: Age? = null,
  public var valueAnnotation: Annotation? = null,
  public var valueAttachment: Attachment? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueCodeableReference: CodeableReference? = null,
  public var valueCoding: Coding? = null,
  public var valueContactPoint: ContactPoint? = null,
  public var valueCount: Count? = null,
  public var valueDistance: Distance? = null,
  public var valueDuration: Duration? = null,
  public var valueHumanName: HumanName? = null,
  public var valueIdentifier: Identifier? = null,
  public var valueMoney: Money? = null,
  public var valuePeriod: Period? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueRatio: Ratio? = null,
  public var valueRatioRange: RatioRange? = null,
  public var valueReference: Reference? = null,
  public var valueSampledData: SampledData? = null,
  public var valueSignature: Signature? = null,
  public var valueTiming: Timing? = null,
  public var valueContactDetail: ContactDetail? = null,
  public var valueDataRequirement: DataRequirement? = null,
  public var valueExpression: Expression? = null,
  public var valueParameterDefinition: ParameterDefinition? = null,
  public var valueRelatedArtifact: RelatedArtifact? = null,
  public var valueTriggerDefinition: TriggerDefinition? = null,
  public var valueUsageContext: UsageContext? = null,
  public var valueAvailability: Availability? = null,
  public var valueExtendedContactDetail: ExtendedContactDetail? = null,
  public var valueDosage: Dosage? = null,
  public var valueMeta: Meta? = null,
) {
  public fun toModel(): ElementDefinition.Example =
    ElementDefinition.Example(
      id = this@ElementDefinitionExampleSurrogate.id,
      extension = this@ElementDefinitionExampleSurrogate.extension ?: mutableListOf(),
      label =
        R5String.of(
          this@ElementDefinitionExampleSurrogate.label,
          this@ElementDefinitionExampleSurrogate._label,
        )!!,
      `value` =
        ElementDefinition.Example.Value.from(
          Base64Binary.of(
            this@ElementDefinitionExampleSurrogate.valueBase64Binary,
            this@ElementDefinitionExampleSurrogate._valueBase64Binary,
          ),
          R5Boolean.of(
            this@ElementDefinitionExampleSurrogate.valueBoolean,
            this@ElementDefinitionExampleSurrogate._valueBoolean,
          ),
          Canonical.of(
            this@ElementDefinitionExampleSurrogate.valueCanonical,
            this@ElementDefinitionExampleSurrogate._valueCanonical,
          ),
          Code.of(
            this@ElementDefinitionExampleSurrogate.valueCode,
            this@ElementDefinitionExampleSurrogate._valueCode,
          ),
          Date.of(
            FhirDate.fromString(this@ElementDefinitionExampleSurrogate.valueDate),
            this@ElementDefinitionExampleSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ElementDefinitionExampleSurrogate.valueDateTime),
            this@ElementDefinitionExampleSurrogate._valueDateTime,
          ),
          Decimal.of(
            this@ElementDefinitionExampleSurrogate.valueDecimal,
            this@ElementDefinitionExampleSurrogate._valueDecimal,
          ),
          Id.of(
            this@ElementDefinitionExampleSurrogate.valueId,
            this@ElementDefinitionExampleSurrogate._valueId,
          ),
          Instant.of(
            FhirDateTime.fromString(this@ElementDefinitionExampleSurrogate.valueInstant),
            this@ElementDefinitionExampleSurrogate._valueInstant,
          ),
          Integer.of(
            this@ElementDefinitionExampleSurrogate.valueInteger,
            this@ElementDefinitionExampleSurrogate._valueInteger,
          ),
          Integer64.of(
            this@ElementDefinitionExampleSurrogate.valueInteger64,
            this@ElementDefinitionExampleSurrogate._valueInteger64,
          ),
          Markdown.of(
            this@ElementDefinitionExampleSurrogate.valueMarkdown,
            this@ElementDefinitionExampleSurrogate._valueMarkdown,
          ),
          Oid.of(
            this@ElementDefinitionExampleSurrogate.valueOid,
            this@ElementDefinitionExampleSurrogate._valueOid,
          ),
          PositiveInt.of(
            this@ElementDefinitionExampleSurrogate.valuePositiveInt,
            this@ElementDefinitionExampleSurrogate._valuePositiveInt,
          ),
          R5String.of(
            this@ElementDefinitionExampleSurrogate.valueString,
            this@ElementDefinitionExampleSurrogate._valueString,
          ),
          Time.of(
            this@ElementDefinitionExampleSurrogate.valueTime,
            this@ElementDefinitionExampleSurrogate._valueTime,
          ),
          UnsignedInt.of(
            this@ElementDefinitionExampleSurrogate.valueUnsignedInt,
            this@ElementDefinitionExampleSurrogate._valueUnsignedInt,
          ),
          Uri.of(
            this@ElementDefinitionExampleSurrogate.valueUri,
            this@ElementDefinitionExampleSurrogate._valueUri,
          ),
          Url.of(
            this@ElementDefinitionExampleSurrogate.valueUrl,
            this@ElementDefinitionExampleSurrogate._valueUrl,
          ),
          Uuid.of(
            this@ElementDefinitionExampleSurrogate.valueUuid,
            this@ElementDefinitionExampleSurrogate._valueUuid,
          ),
          this@ElementDefinitionExampleSurrogate.valueAddress,
          this@ElementDefinitionExampleSurrogate.valueAge,
          this@ElementDefinitionExampleSurrogate.valueAnnotation,
          this@ElementDefinitionExampleSurrogate.valueAttachment,
          this@ElementDefinitionExampleSurrogate.valueCodeableConcept,
          this@ElementDefinitionExampleSurrogate.valueCodeableReference,
          this@ElementDefinitionExampleSurrogate.valueCoding,
          this@ElementDefinitionExampleSurrogate.valueContactPoint,
          this@ElementDefinitionExampleSurrogate.valueCount,
          this@ElementDefinitionExampleSurrogate.valueDistance,
          this@ElementDefinitionExampleSurrogate.valueDuration,
          this@ElementDefinitionExampleSurrogate.valueHumanName,
          this@ElementDefinitionExampleSurrogate.valueIdentifier,
          this@ElementDefinitionExampleSurrogate.valueMoney,
          this@ElementDefinitionExampleSurrogate.valuePeriod,
          this@ElementDefinitionExampleSurrogate.valueQuantity,
          this@ElementDefinitionExampleSurrogate.valueRange,
          this@ElementDefinitionExampleSurrogate.valueRatio,
          this@ElementDefinitionExampleSurrogate.valueRatioRange,
          this@ElementDefinitionExampleSurrogate.valueReference,
          this@ElementDefinitionExampleSurrogate.valueSampledData,
          this@ElementDefinitionExampleSurrogate.valueSignature,
          this@ElementDefinitionExampleSurrogate.valueTiming,
          this@ElementDefinitionExampleSurrogate.valueContactDetail,
          this@ElementDefinitionExampleSurrogate.valueDataRequirement,
          this@ElementDefinitionExampleSurrogate.valueExpression,
          this@ElementDefinitionExampleSurrogate.valueParameterDefinition,
          this@ElementDefinitionExampleSurrogate.valueRelatedArtifact,
          this@ElementDefinitionExampleSurrogate.valueTriggerDefinition,
          this@ElementDefinitionExampleSurrogate.valueUsageContext,
          this@ElementDefinitionExampleSurrogate.valueAvailability,
          this@ElementDefinitionExampleSurrogate.valueExtendedContactDetail,
          this@ElementDefinitionExampleSurrogate.valueDosage,
          this@ElementDefinitionExampleSurrogate.valueMeta,
        )!!,
    )

  public companion object {
    public fun fromModel(model: ElementDefinition.Example): ElementDefinitionExampleSurrogate =
      with(model) {
        ElementDefinitionExampleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          label = this@with.label.value,
          _label = this@with.label.toElement(),
          valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.value,
          _valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueCanonical = this@with.`value`?.asCanonical()?.value?.value,
          _valueCanonical = this@with.`value`?.asCanonical()?.value?.toElement(),
          valueCode = this@with.`value`?.asCode()?.value?.value,
          _valueCode = this@with.`value`?.asCode()?.value?.toElement(),
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString(),
          _valueDate = this@with.`value`?.asDate()?.value?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value,
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement(),
          valueId = this@with.`value`?.asId()?.value?.value,
          _valueId = this@with.`value`?.asId()?.value?.toElement(),
          valueInstant = this@with.`value`?.asInstant()?.value?.value?.toString(),
          _valueInstant = this@with.`value`?.asInstant()?.value?.toElement(),
          valueInteger = this@with.`value`?.asInteger()?.value?.value,
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement(),
          valueInteger64 = this@with.`value`?.asInteger64()?.value?.value,
          _valueInteger64 = this@with.`value`?.asInteger64()?.value?.toElement(),
          valueMarkdown = this@with.`value`?.asMarkdown()?.value?.value,
          _valueMarkdown = this@with.`value`?.asMarkdown()?.value?.toElement(),
          valueOid = this@with.`value`?.asOid()?.value?.value,
          _valueOid = this@with.`value`?.asOid()?.value?.toElement(),
          valuePositiveInt = this@with.`value`?.asPositiveInt()?.value?.value,
          _valuePositiveInt = this@with.`value`?.asPositiveInt()?.value?.toElement(),
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueTime = this@with.`value`?.asTime()?.value?.value,
          _valueTime = this@with.`value`?.asTime()?.value?.toElement(),
          valueUnsignedInt = this@with.`value`?.asUnsignedInt()?.value?.value,
          _valueUnsignedInt = this@with.`value`?.asUnsignedInt()?.value?.toElement(),
          valueUri = this@with.`value`?.asUri()?.value?.value,
          _valueUri = this@with.`value`?.asUri()?.value?.toElement(),
          valueUrl = this@with.`value`?.asUrl()?.value?.value,
          _valueUrl = this@with.`value`?.asUrl()?.value?.toElement(),
          valueUuid = this@with.`value`?.asUuid()?.value?.value,
          _valueUuid = this@with.`value`?.asUuid()?.value?.toElement(),
          valueAddress = this@with.`value`?.asAddress()?.value,
          valueAge = this@with.`value`?.asAge()?.value,
          valueAnnotation = this@with.`value`?.asAnnotation()?.value,
          valueAttachment = this@with.`value`?.asAttachment()?.value,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueCodeableReference = this@with.`value`?.asCodeableReference()?.value,
          valueCoding = this@with.`value`?.asCoding()?.value,
          valueContactPoint = this@with.`value`?.asContactPoint()?.value,
          valueCount = this@with.`value`?.asCount()?.value,
          valueDistance = this@with.`value`?.asDistance()?.value,
          valueDuration = this@with.`value`?.asDuration()?.value,
          valueHumanName = this@with.`value`?.asHumanName()?.value,
          valueIdentifier = this@with.`value`?.asIdentifier()?.value,
          valueMoney = this@with.`value`?.asMoney()?.value,
          valuePeriod = this@with.`value`?.asPeriod()?.value,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueRange = this@with.`value`?.asRange()?.value,
          valueRatio = this@with.`value`?.asRatio()?.value,
          valueRatioRange = this@with.`value`?.asRatioRange()?.value,
          valueReference = this@with.`value`?.asReference()?.value,
          valueSampledData = this@with.`value`?.asSampledData()?.value,
          valueSignature = this@with.`value`?.asSignature()?.value,
          valueTiming = this@with.`value`?.asTiming()?.value,
          valueContactDetail = this@with.`value`?.asContactDetail()?.value,
          valueDataRequirement = this@with.`value`?.asDataRequirement()?.value,
          valueExpression = this@with.`value`?.asExpression()?.value,
          valueParameterDefinition = this@with.`value`?.asParameterDefinition()?.value,
          valueRelatedArtifact = this@with.`value`?.asRelatedArtifact()?.value,
          valueTriggerDefinition = this@with.`value`?.asTriggerDefinition()?.value,
          valueUsageContext = this@with.`value`?.asUsageContext()?.value,
          valueAvailability = this@with.`value`?.asAvailability()?.value,
          valueExtendedContactDetail = this@with.`value`?.asExtendedContactDetail()?.value,
          valueDosage = this@with.`value`?.asDosage()?.value,
          valueMeta = this@with.`value`?.asMeta()?.value,
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionConstraintSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var key: KotlinString? = null,
  public var _key: Element? = null,
  public var requirements: KotlinString? = null,
  public var _requirements: Element? = null,
  public var severity: KotlinString? = null,
  public var _severity: Element? = null,
  public var suppress: KotlinBoolean? = null,
  public var _suppress: Element? = null,
  public var human: KotlinString? = null,
  public var _human: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
) {
  public fun toModel(): ElementDefinition.Constraint =
    ElementDefinition.Constraint(
      id = this@ElementDefinitionConstraintSurrogate.id,
      extension = this@ElementDefinitionConstraintSurrogate.extension ?: mutableListOf(),
      key =
        Id.of(
          this@ElementDefinitionConstraintSurrogate.key,
          this@ElementDefinitionConstraintSurrogate._key,
        )!!,
      requirements =
        Markdown.of(
          this@ElementDefinitionConstraintSurrogate.requirements,
          this@ElementDefinitionConstraintSurrogate._requirements,
        ),
      severity =
        Enumeration.of(
          com.google.fhir.model.r5.ElementDefinition.ConstraintSeverity.fromCode(
            this@ElementDefinitionConstraintSurrogate.severity!!
          ),
          this@ElementDefinitionConstraintSurrogate._severity,
        ),
      suppress =
        R5Boolean.of(
          this@ElementDefinitionConstraintSurrogate.suppress,
          this@ElementDefinitionConstraintSurrogate._suppress,
        ),
      human =
        R5String.of(
          this@ElementDefinitionConstraintSurrogate.human,
          this@ElementDefinitionConstraintSurrogate._human,
        )!!,
      expression =
        R5String.of(
          this@ElementDefinitionConstraintSurrogate.expression,
          this@ElementDefinitionConstraintSurrogate._expression,
        ),
      source =
        Canonical.of(
          this@ElementDefinitionConstraintSurrogate.source,
          this@ElementDefinitionConstraintSurrogate._source,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ElementDefinition.Constraint
    ): ElementDefinitionConstraintSurrogate =
      with(model) {
        ElementDefinitionConstraintSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          key = this@with.key.value,
          _key = this@with.key.toElement(),
          requirements = this@with.requirements?.value,
          _requirements = this@with.requirements?.toElement(),
          severity = this@with.severity.value?.getCode(),
          _severity = this@with.severity.toElement(),
          suppress = this@with.suppress?.value,
          _suppress = this@with.suppress?.toElement(),
          human = this@with.human.value,
          _human = this@with.human.toElement(),
          expression = this@with.expression?.value,
          _expression = this@with.expression?.toElement(),
          source = this@with.source?.value,
          _source = this@with.source?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionBindingAdditionalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var shortDoco: KotlinString? = null,
  public var _shortDoco: Element? = null,
  public var usage: MutableList<UsageContext>? = null,
  public var any: KotlinBoolean? = null,
  public var _any: Element? = null,
) {
  public fun toModel(): ElementDefinition.Binding.Additional =
    ElementDefinition.Binding.Additional(
      id = this@ElementDefinitionBindingAdditionalSurrogate.id,
      extension = this@ElementDefinitionBindingAdditionalSurrogate.extension ?: mutableListOf(),
      purpose =
        Enumeration.of(
          com.google.fhir.model.r5.ElementDefinition.AdditionalBindingPurpose.fromCode(
            this@ElementDefinitionBindingAdditionalSurrogate.purpose!!
          ),
          this@ElementDefinitionBindingAdditionalSurrogate._purpose,
        ),
      valueSet =
        Canonical.of(
          this@ElementDefinitionBindingAdditionalSurrogate.valueSet,
          this@ElementDefinitionBindingAdditionalSurrogate._valueSet,
        )!!,
      documentation =
        Markdown.of(
          this@ElementDefinitionBindingAdditionalSurrogate.documentation,
          this@ElementDefinitionBindingAdditionalSurrogate._documentation,
        ),
      shortDoco =
        R5String.of(
          this@ElementDefinitionBindingAdditionalSurrogate.shortDoco,
          this@ElementDefinitionBindingAdditionalSurrogate._shortDoco,
        ),
      usage = this@ElementDefinitionBindingAdditionalSurrogate.usage ?: mutableListOf(),
      any =
        R5Boolean.of(
          this@ElementDefinitionBindingAdditionalSurrogate.any,
          this@ElementDefinitionBindingAdditionalSurrogate._any,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ElementDefinition.Binding.Additional
    ): ElementDefinitionBindingAdditionalSurrogate =
      with(model) {
        ElementDefinitionBindingAdditionalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          purpose = this@with.purpose.value?.getCode(),
          _purpose = this@with.purpose.toElement(),
          valueSet = this@with.valueSet.value,
          _valueSet = this@with.valueSet.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          shortDoco = this@with.shortDoco?.value,
          _shortDoco = this@with.shortDoco?.toElement(),
          usage = this@with.usage.takeUnless { it.all { it == null } },
          any = this@with.any?.value,
          _any = this@with.any?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionBindingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var strength: KotlinString? = null,
  public var _strength: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var additional: MutableList<ElementDefinition.Binding.Additional>? = null,
) {
  public fun toModel(): ElementDefinition.Binding =
    ElementDefinition.Binding(
      id = this@ElementDefinitionBindingSurrogate.id,
      extension = this@ElementDefinitionBindingSurrogate.extension ?: mutableListOf(),
      strength =
        Enumeration.of(
          com.google.fhir.model.r5.BindingStrength.fromCode(
            this@ElementDefinitionBindingSurrogate.strength!!
          ),
          this@ElementDefinitionBindingSurrogate._strength,
        ),
      description =
        Markdown.of(
          this@ElementDefinitionBindingSurrogate.description,
          this@ElementDefinitionBindingSurrogate._description,
        ),
      valueSet =
        Canonical.of(
          this@ElementDefinitionBindingSurrogate.valueSet,
          this@ElementDefinitionBindingSurrogate._valueSet,
        ),
      additional = this@ElementDefinitionBindingSurrogate.additional ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ElementDefinition.Binding): ElementDefinitionBindingSurrogate =
      with(model) {
        ElementDefinitionBindingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          strength = this@with.strength.value?.getCode(),
          _strength = this@with.strength.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          additional = this@with.additional.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionMappingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var identity: KotlinString? = null,
  public var _identity: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var map: KotlinString? = null,
  public var _map: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): ElementDefinition.Mapping =
    ElementDefinition.Mapping(
      id = this@ElementDefinitionMappingSurrogate.id,
      extension = this@ElementDefinitionMappingSurrogate.extension ?: mutableListOf(),
      identity =
        Id.of(
          this@ElementDefinitionMappingSurrogate.identity,
          this@ElementDefinitionMappingSurrogate._identity,
        )!!,
      language =
        Code.of(
          this@ElementDefinitionMappingSurrogate.language,
          this@ElementDefinitionMappingSurrogate._language,
        ),
      map =
        R5String.of(
          this@ElementDefinitionMappingSurrogate.map,
          this@ElementDefinitionMappingSurrogate._map,
        )!!,
      comment =
        Markdown.of(
          this@ElementDefinitionMappingSurrogate.comment,
          this@ElementDefinitionMappingSurrogate._comment,
        ),
    )

  public companion object {
    public fun fromModel(model: ElementDefinition.Mapping): ElementDefinitionMappingSurrogate =
      with(model) {
        ElementDefinitionMappingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          identity = this@with.identity.value,
          _identity = this@with.identity.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          map = this@with.map.value,
          _map = this@with.map.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ElementDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var representation: MutableList<KotlinString?>? = null,
  public var _representation: MutableList<Element?>? = null,
  public var sliceName: KotlinString? = null,
  public var _sliceName: Element? = null,
  public var sliceIsConstraining: KotlinBoolean? = null,
  public var _sliceIsConstraining: Element? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var code: MutableList<Coding>? = null,
  public var slicing: ElementDefinition.Slicing? = null,
  public var short: KotlinString? = null,
  public var _short: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var requirements: KotlinString? = null,
  public var _requirements: Element? = null,
  public var alias: MutableList<KotlinString?>? = null,
  public var _alias: MutableList<Element?>? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
  public var base: ElementDefinition.Base? = null,
  public var contentReference: KotlinString? = null,
  public var _contentReference: Element? = null,
  public var type: MutableList<ElementDefinition.Type>? = null,
  public var defaultValueBase64Binary: KotlinString? = null,
  public var _defaultValueBase64Binary: Element? = null,
  public var defaultValueBoolean: KotlinBoolean? = null,
  public var _defaultValueBoolean: Element? = null,
  public var defaultValueCanonical: KotlinString? = null,
  public var _defaultValueCanonical: Element? = null,
  public var defaultValueCode: KotlinString? = null,
  public var _defaultValueCode: Element? = null,
  public var defaultValueDate: KotlinString? = null,
  public var _defaultValueDate: Element? = null,
  public var defaultValueDateTime: KotlinString? = null,
  public var _defaultValueDateTime: Element? = null,
  public var defaultValueDecimal: Double? = null,
  public var _defaultValueDecimal: Element? = null,
  public var defaultValueId: KotlinString? = null,
  public var _defaultValueId: Element? = null,
  public var defaultValueInstant: KotlinString? = null,
  public var _defaultValueInstant: Element? = null,
  public var defaultValueInteger: Int? = null,
  public var _defaultValueInteger: Element? = null,
  public var defaultValueInteger64: Int? = null,
  public var _defaultValueInteger64: Element? = null,
  public var defaultValueMarkdown: KotlinString? = null,
  public var _defaultValueMarkdown: Element? = null,
  public var defaultValueOid: KotlinString? = null,
  public var _defaultValueOid: Element? = null,
  public var defaultValuePositiveInt: Int? = null,
  public var _defaultValuePositiveInt: Element? = null,
  public var defaultValueString: KotlinString? = null,
  public var _defaultValueString: Element? = null,
  public var defaultValueTime: LocalTime? = null,
  public var _defaultValueTime: Element? = null,
  public var defaultValueUnsignedInt: Int? = null,
  public var _defaultValueUnsignedInt: Element? = null,
  public var defaultValueUri: KotlinString? = null,
  public var _defaultValueUri: Element? = null,
  public var defaultValueUrl: KotlinString? = null,
  public var _defaultValueUrl: Element? = null,
  public var defaultValueUuid: KotlinString? = null,
  public var _defaultValueUuid: Element? = null,
  public var defaultValueAddress: Address? = null,
  public var defaultValueAge: Age? = null,
  public var defaultValueAnnotation: Annotation? = null,
  public var defaultValueAttachment: Attachment? = null,
  public var defaultValueCodeableConcept: CodeableConcept? = null,
  public var defaultValueCodeableReference: CodeableReference? = null,
  public var defaultValueCoding: Coding? = null,
  public var defaultValueContactPoint: ContactPoint? = null,
  public var defaultValueCount: Count? = null,
  public var defaultValueDistance: Distance? = null,
  public var defaultValueDuration: Duration? = null,
  public var defaultValueHumanName: HumanName? = null,
  public var defaultValueIdentifier: Identifier? = null,
  public var defaultValueMoney: Money? = null,
  public var defaultValuePeriod: Period? = null,
  public var defaultValueQuantity: Quantity? = null,
  public var defaultValueRange: Range? = null,
  public var defaultValueRatio: Ratio? = null,
  public var defaultValueRatioRange: RatioRange? = null,
  public var defaultValueReference: Reference? = null,
  public var defaultValueSampledData: SampledData? = null,
  public var defaultValueSignature: Signature? = null,
  public var defaultValueTiming: Timing? = null,
  public var defaultValueContactDetail: ContactDetail? = null,
  public var defaultValueDataRequirement: DataRequirement? = null,
  public var defaultValueExpression: Expression? = null,
  public var defaultValueParameterDefinition: ParameterDefinition? = null,
  public var defaultValueRelatedArtifact: RelatedArtifact? = null,
  public var defaultValueTriggerDefinition: TriggerDefinition? = null,
  public var defaultValueUsageContext: UsageContext? = null,
  public var defaultValueAvailability: Availability? = null,
  public var defaultValueExtendedContactDetail: ExtendedContactDetail? = null,
  public var defaultValueDosage: Dosage? = null,
  public var defaultValueMeta: Meta? = null,
  public var meaningWhenMissing: KotlinString? = null,
  public var _meaningWhenMissing: Element? = null,
  public var orderMeaning: KotlinString? = null,
  public var _orderMeaning: Element? = null,
  public var fixedBase64Binary: KotlinString? = null,
  public var _fixedBase64Binary: Element? = null,
  public var fixedBoolean: KotlinBoolean? = null,
  public var _fixedBoolean: Element? = null,
  public var fixedCanonical: KotlinString? = null,
  public var _fixedCanonical: Element? = null,
  public var fixedCode: KotlinString? = null,
  public var _fixedCode: Element? = null,
  public var fixedDate: KotlinString? = null,
  public var _fixedDate: Element? = null,
  public var fixedDateTime: KotlinString? = null,
  public var _fixedDateTime: Element? = null,
  public var fixedDecimal: Double? = null,
  public var _fixedDecimal: Element? = null,
  public var fixedId: KotlinString? = null,
  public var _fixedId: Element? = null,
  public var fixedInstant: KotlinString? = null,
  public var _fixedInstant: Element? = null,
  public var fixedInteger: Int? = null,
  public var _fixedInteger: Element? = null,
  public var fixedInteger64: Int? = null,
  public var _fixedInteger64: Element? = null,
  public var fixedMarkdown: KotlinString? = null,
  public var _fixedMarkdown: Element? = null,
  public var fixedOid: KotlinString? = null,
  public var _fixedOid: Element? = null,
  public var fixedPositiveInt: Int? = null,
  public var _fixedPositiveInt: Element? = null,
  public var fixedString: KotlinString? = null,
  public var _fixedString: Element? = null,
  public var fixedTime: LocalTime? = null,
  public var _fixedTime: Element? = null,
  public var fixedUnsignedInt: Int? = null,
  public var _fixedUnsignedInt: Element? = null,
  public var fixedUri: KotlinString? = null,
  public var _fixedUri: Element? = null,
  public var fixedUrl: KotlinString? = null,
  public var _fixedUrl: Element? = null,
  public var fixedUuid: KotlinString? = null,
  public var _fixedUuid: Element? = null,
  public var fixedAddress: Address? = null,
  public var fixedAge: Age? = null,
  public var fixedAnnotation: Annotation? = null,
  public var fixedAttachment: Attachment? = null,
  public var fixedCodeableConcept: CodeableConcept? = null,
  public var fixedCodeableReference: CodeableReference? = null,
  public var fixedCoding: Coding? = null,
  public var fixedContactPoint: ContactPoint? = null,
  public var fixedCount: Count? = null,
  public var fixedDistance: Distance? = null,
  public var fixedDuration: Duration? = null,
  public var fixedHumanName: HumanName? = null,
  public var fixedIdentifier: Identifier? = null,
  public var fixedMoney: Money? = null,
  public var fixedPeriod: Period? = null,
  public var fixedQuantity: Quantity? = null,
  public var fixedRange: Range? = null,
  public var fixedRatio: Ratio? = null,
  public var fixedRatioRange: RatioRange? = null,
  public var fixedReference: Reference? = null,
  public var fixedSampledData: SampledData? = null,
  public var fixedSignature: Signature? = null,
  public var fixedTiming: Timing? = null,
  public var fixedContactDetail: ContactDetail? = null,
  public var fixedDataRequirement: DataRequirement? = null,
  public var fixedExpression: Expression? = null,
  public var fixedParameterDefinition: ParameterDefinition? = null,
  public var fixedRelatedArtifact: RelatedArtifact? = null,
  public var fixedTriggerDefinition: TriggerDefinition? = null,
  public var fixedUsageContext: UsageContext? = null,
  public var fixedAvailability: Availability? = null,
  public var fixedExtendedContactDetail: ExtendedContactDetail? = null,
  public var fixedDosage: Dosage? = null,
  public var fixedMeta: Meta? = null,
  public var example: MutableList<ElementDefinition.Example>? = null,
  public var minValueDate: KotlinString? = null,
  public var _minValueDate: Element? = null,
  public var minValueDateTime: KotlinString? = null,
  public var _minValueDateTime: Element? = null,
  public var minValueInstant: KotlinString? = null,
  public var _minValueInstant: Element? = null,
  public var minValueTime: LocalTime? = null,
  public var _minValueTime: Element? = null,
  public var minValueDecimal: Double? = null,
  public var _minValueDecimal: Element? = null,
  public var minValueInteger: Int? = null,
  public var _minValueInteger: Element? = null,
  public var minValueInteger64: Int? = null,
  public var _minValueInteger64: Element? = null,
  public var minValuePositiveInt: Int? = null,
  public var _minValuePositiveInt: Element? = null,
  public var minValueUnsignedInt: Int? = null,
  public var _minValueUnsignedInt: Element? = null,
  public var minValueQuantity: Quantity? = null,
  public var maxValueDate: KotlinString? = null,
  public var _maxValueDate: Element? = null,
  public var maxValueDateTime: KotlinString? = null,
  public var _maxValueDateTime: Element? = null,
  public var maxValueInstant: KotlinString? = null,
  public var _maxValueInstant: Element? = null,
  public var maxValueTime: LocalTime? = null,
  public var _maxValueTime: Element? = null,
  public var maxValueDecimal: Double? = null,
  public var _maxValueDecimal: Element? = null,
  public var maxValueInteger: Int? = null,
  public var _maxValueInteger: Element? = null,
  public var maxValueInteger64: Int? = null,
  public var _maxValueInteger64: Element? = null,
  public var maxValuePositiveInt: Int? = null,
  public var _maxValuePositiveInt: Element? = null,
  public var maxValueUnsignedInt: Int? = null,
  public var _maxValueUnsignedInt: Element? = null,
  public var maxValueQuantity: Quantity? = null,
  public var maxLength: Int? = null,
  public var _maxLength: Element? = null,
  public var condition: MutableList<KotlinString?>? = null,
  public var _condition: MutableList<Element?>? = null,
  public var constraint: MutableList<ElementDefinition.Constraint>? = null,
  public var mustHaveValue: KotlinBoolean? = null,
  public var _mustHaveValue: Element? = null,
  public var valueAlternatives: MutableList<KotlinString?>? = null,
  public var _valueAlternatives: MutableList<Element?>? = null,
  public var mustSupport: KotlinBoolean? = null,
  public var _mustSupport: Element? = null,
  public var isModifier: KotlinBoolean? = null,
  public var _isModifier: Element? = null,
  public var isModifierReason: KotlinString? = null,
  public var _isModifierReason: Element? = null,
  public var isSummary: KotlinBoolean? = null,
  public var _isSummary: Element? = null,
  public var binding: ElementDefinition.Binding? = null,
  public var mapping: MutableList<ElementDefinition.Mapping>? = null,
) {
  public fun toModel(): ElementDefinition =
    ElementDefinition(
      id = this@ElementDefinitionSurrogate.id,
      extension = this@ElementDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ElementDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      path =
        R5String.of(this@ElementDefinitionSurrogate.path, this@ElementDefinitionSurrogate._path)!!,
      representation =
        if (
          this@ElementDefinitionSurrogate.representation == null &&
            this@ElementDefinitionSurrogate._representation == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionSurrogate.representation
              ?: List(this@ElementDefinitionSurrogate._representation!!.size) { null })
            .zip(
              this@ElementDefinitionSurrogate._representation
                ?: List(this@ElementDefinitionSurrogate.representation!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.ElementDefinition.PropertyRepresentation.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      sliceName =
        R5String.of(
          this@ElementDefinitionSurrogate.sliceName,
          this@ElementDefinitionSurrogate._sliceName,
        ),
      sliceIsConstraining =
        R5Boolean.of(
          this@ElementDefinitionSurrogate.sliceIsConstraining,
          this@ElementDefinitionSurrogate._sliceIsConstraining,
        ),
      label =
        R5String.of(this@ElementDefinitionSurrogate.label, this@ElementDefinitionSurrogate._label),
      code = this@ElementDefinitionSurrogate.code ?: mutableListOf(),
      slicing = this@ElementDefinitionSurrogate.slicing,
      short =
        R5String.of(this@ElementDefinitionSurrogate.short, this@ElementDefinitionSurrogate._short),
      definition =
        Markdown.of(
          this@ElementDefinitionSurrogate.definition,
          this@ElementDefinitionSurrogate._definition,
        ),
      comment =
        Markdown.of(
          this@ElementDefinitionSurrogate.comment,
          this@ElementDefinitionSurrogate._comment,
        ),
      requirements =
        Markdown.of(
          this@ElementDefinitionSurrogate.requirements,
          this@ElementDefinitionSurrogate._requirements,
        ),
      alias =
        if (
          this@ElementDefinitionSurrogate.alias == null &&
            this@ElementDefinitionSurrogate._alias == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionSurrogate.alias
              ?: List(this@ElementDefinitionSurrogate._alias!!.size) { null })
            .zip(
              this@ElementDefinitionSurrogate._alias
                ?: List(this@ElementDefinitionSurrogate.alias!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      min =
        UnsignedInt.of(this@ElementDefinitionSurrogate.min, this@ElementDefinitionSurrogate._min),
      max = R5String.of(this@ElementDefinitionSurrogate.max, this@ElementDefinitionSurrogate._max),
      base = this@ElementDefinitionSurrogate.base,
      contentReference =
        Uri.of(
          this@ElementDefinitionSurrogate.contentReference,
          this@ElementDefinitionSurrogate._contentReference,
        ),
      type = this@ElementDefinitionSurrogate.type ?: mutableListOf(),
      defaultValue =
        ElementDefinition.DefaultValue?.from(
          Base64Binary.of(
            this@ElementDefinitionSurrogate.defaultValueBase64Binary,
            this@ElementDefinitionSurrogate._defaultValueBase64Binary,
          ),
          R5Boolean.of(
            this@ElementDefinitionSurrogate.defaultValueBoolean,
            this@ElementDefinitionSurrogate._defaultValueBoolean,
          ),
          Canonical.of(
            this@ElementDefinitionSurrogate.defaultValueCanonical,
            this@ElementDefinitionSurrogate._defaultValueCanonical,
          ),
          Code.of(
            this@ElementDefinitionSurrogate.defaultValueCode,
            this@ElementDefinitionSurrogate._defaultValueCode,
          ),
          Date.of(
            FhirDate.fromString(this@ElementDefinitionSurrogate.defaultValueDate),
            this@ElementDefinitionSurrogate._defaultValueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.defaultValueDateTime),
            this@ElementDefinitionSurrogate._defaultValueDateTime,
          ),
          Decimal.of(
            this@ElementDefinitionSurrogate.defaultValueDecimal,
            this@ElementDefinitionSurrogate._defaultValueDecimal,
          ),
          Id.of(
            this@ElementDefinitionSurrogate.defaultValueId,
            this@ElementDefinitionSurrogate._defaultValueId,
          ),
          Instant.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.defaultValueInstant),
            this@ElementDefinitionSurrogate._defaultValueInstant,
          ),
          Integer.of(
            this@ElementDefinitionSurrogate.defaultValueInteger,
            this@ElementDefinitionSurrogate._defaultValueInteger,
          ),
          Integer64.of(
            this@ElementDefinitionSurrogate.defaultValueInteger64,
            this@ElementDefinitionSurrogate._defaultValueInteger64,
          ),
          Markdown.of(
            this@ElementDefinitionSurrogate.defaultValueMarkdown,
            this@ElementDefinitionSurrogate._defaultValueMarkdown,
          ),
          Oid.of(
            this@ElementDefinitionSurrogate.defaultValueOid,
            this@ElementDefinitionSurrogate._defaultValueOid,
          ),
          PositiveInt.of(
            this@ElementDefinitionSurrogate.defaultValuePositiveInt,
            this@ElementDefinitionSurrogate._defaultValuePositiveInt,
          ),
          R5String.of(
            this@ElementDefinitionSurrogate.defaultValueString,
            this@ElementDefinitionSurrogate._defaultValueString,
          ),
          Time.of(
            this@ElementDefinitionSurrogate.defaultValueTime,
            this@ElementDefinitionSurrogate._defaultValueTime,
          ),
          UnsignedInt.of(
            this@ElementDefinitionSurrogate.defaultValueUnsignedInt,
            this@ElementDefinitionSurrogate._defaultValueUnsignedInt,
          ),
          Uri.of(
            this@ElementDefinitionSurrogate.defaultValueUri,
            this@ElementDefinitionSurrogate._defaultValueUri,
          ),
          Url.of(
            this@ElementDefinitionSurrogate.defaultValueUrl,
            this@ElementDefinitionSurrogate._defaultValueUrl,
          ),
          Uuid.of(
            this@ElementDefinitionSurrogate.defaultValueUuid,
            this@ElementDefinitionSurrogate._defaultValueUuid,
          ),
          this@ElementDefinitionSurrogate.defaultValueAddress,
          this@ElementDefinitionSurrogate.defaultValueAge,
          this@ElementDefinitionSurrogate.defaultValueAnnotation,
          this@ElementDefinitionSurrogate.defaultValueAttachment,
          this@ElementDefinitionSurrogate.defaultValueCodeableConcept,
          this@ElementDefinitionSurrogate.defaultValueCodeableReference,
          this@ElementDefinitionSurrogate.defaultValueCoding,
          this@ElementDefinitionSurrogate.defaultValueContactPoint,
          this@ElementDefinitionSurrogate.defaultValueCount,
          this@ElementDefinitionSurrogate.defaultValueDistance,
          this@ElementDefinitionSurrogate.defaultValueDuration,
          this@ElementDefinitionSurrogate.defaultValueHumanName,
          this@ElementDefinitionSurrogate.defaultValueIdentifier,
          this@ElementDefinitionSurrogate.defaultValueMoney,
          this@ElementDefinitionSurrogate.defaultValuePeriod,
          this@ElementDefinitionSurrogate.defaultValueQuantity,
          this@ElementDefinitionSurrogate.defaultValueRange,
          this@ElementDefinitionSurrogate.defaultValueRatio,
          this@ElementDefinitionSurrogate.defaultValueRatioRange,
          this@ElementDefinitionSurrogate.defaultValueReference,
          this@ElementDefinitionSurrogate.defaultValueSampledData,
          this@ElementDefinitionSurrogate.defaultValueSignature,
          this@ElementDefinitionSurrogate.defaultValueTiming,
          this@ElementDefinitionSurrogate.defaultValueContactDetail,
          this@ElementDefinitionSurrogate.defaultValueDataRequirement,
          this@ElementDefinitionSurrogate.defaultValueExpression,
          this@ElementDefinitionSurrogate.defaultValueParameterDefinition,
          this@ElementDefinitionSurrogate.defaultValueRelatedArtifact,
          this@ElementDefinitionSurrogate.defaultValueTriggerDefinition,
          this@ElementDefinitionSurrogate.defaultValueUsageContext,
          this@ElementDefinitionSurrogate.defaultValueAvailability,
          this@ElementDefinitionSurrogate.defaultValueExtendedContactDetail,
          this@ElementDefinitionSurrogate.defaultValueDosage,
          this@ElementDefinitionSurrogate.defaultValueMeta,
        ),
      meaningWhenMissing =
        Markdown.of(
          this@ElementDefinitionSurrogate.meaningWhenMissing,
          this@ElementDefinitionSurrogate._meaningWhenMissing,
        ),
      orderMeaning =
        R5String.of(
          this@ElementDefinitionSurrogate.orderMeaning,
          this@ElementDefinitionSurrogate._orderMeaning,
        ),
      fixed =
        ElementDefinition.Fixed?.from(
          Base64Binary.of(
            this@ElementDefinitionSurrogate.fixedBase64Binary,
            this@ElementDefinitionSurrogate._fixedBase64Binary,
          ),
          R5Boolean.of(
            this@ElementDefinitionSurrogate.fixedBoolean,
            this@ElementDefinitionSurrogate._fixedBoolean,
          ),
          Canonical.of(
            this@ElementDefinitionSurrogate.fixedCanonical,
            this@ElementDefinitionSurrogate._fixedCanonical,
          ),
          Code.of(
            this@ElementDefinitionSurrogate.fixedCode,
            this@ElementDefinitionSurrogate._fixedCode,
          ),
          Date.of(
            FhirDate.fromString(this@ElementDefinitionSurrogate.fixedDate),
            this@ElementDefinitionSurrogate._fixedDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.fixedDateTime),
            this@ElementDefinitionSurrogate._fixedDateTime,
          ),
          Decimal.of(
            this@ElementDefinitionSurrogate.fixedDecimal,
            this@ElementDefinitionSurrogate._fixedDecimal,
          ),
          Id.of(this@ElementDefinitionSurrogate.fixedId, this@ElementDefinitionSurrogate._fixedId),
          Instant.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.fixedInstant),
            this@ElementDefinitionSurrogate._fixedInstant,
          ),
          Integer.of(
            this@ElementDefinitionSurrogate.fixedInteger,
            this@ElementDefinitionSurrogate._fixedInteger,
          ),
          Integer64.of(
            this@ElementDefinitionSurrogate.fixedInteger64,
            this@ElementDefinitionSurrogate._fixedInteger64,
          ),
          Markdown.of(
            this@ElementDefinitionSurrogate.fixedMarkdown,
            this@ElementDefinitionSurrogate._fixedMarkdown,
          ),
          Oid.of(
            this@ElementDefinitionSurrogate.fixedOid,
            this@ElementDefinitionSurrogate._fixedOid,
          ),
          PositiveInt.of(
            this@ElementDefinitionSurrogate.fixedPositiveInt,
            this@ElementDefinitionSurrogate._fixedPositiveInt,
          ),
          R5String.of(
            this@ElementDefinitionSurrogate.fixedString,
            this@ElementDefinitionSurrogate._fixedString,
          ),
          Time.of(
            this@ElementDefinitionSurrogate.fixedTime,
            this@ElementDefinitionSurrogate._fixedTime,
          ),
          UnsignedInt.of(
            this@ElementDefinitionSurrogate.fixedUnsignedInt,
            this@ElementDefinitionSurrogate._fixedUnsignedInt,
          ),
          Uri.of(
            this@ElementDefinitionSurrogate.fixedUri,
            this@ElementDefinitionSurrogate._fixedUri,
          ),
          Url.of(
            this@ElementDefinitionSurrogate.fixedUrl,
            this@ElementDefinitionSurrogate._fixedUrl,
          ),
          Uuid.of(
            this@ElementDefinitionSurrogate.fixedUuid,
            this@ElementDefinitionSurrogate._fixedUuid,
          ),
          this@ElementDefinitionSurrogate.fixedAddress,
          this@ElementDefinitionSurrogate.fixedAge,
          this@ElementDefinitionSurrogate.fixedAnnotation,
          this@ElementDefinitionSurrogate.fixedAttachment,
          this@ElementDefinitionSurrogate.fixedCodeableConcept,
          this@ElementDefinitionSurrogate.fixedCodeableReference,
          this@ElementDefinitionSurrogate.fixedCoding,
          this@ElementDefinitionSurrogate.fixedContactPoint,
          this@ElementDefinitionSurrogate.fixedCount,
          this@ElementDefinitionSurrogate.fixedDistance,
          this@ElementDefinitionSurrogate.fixedDuration,
          this@ElementDefinitionSurrogate.fixedHumanName,
          this@ElementDefinitionSurrogate.fixedIdentifier,
          this@ElementDefinitionSurrogate.fixedMoney,
          this@ElementDefinitionSurrogate.fixedPeriod,
          this@ElementDefinitionSurrogate.fixedQuantity,
          this@ElementDefinitionSurrogate.fixedRange,
          this@ElementDefinitionSurrogate.fixedRatio,
          this@ElementDefinitionSurrogate.fixedRatioRange,
          this@ElementDefinitionSurrogate.fixedReference,
          this@ElementDefinitionSurrogate.fixedSampledData,
          this@ElementDefinitionSurrogate.fixedSignature,
          this@ElementDefinitionSurrogate.fixedTiming,
          this@ElementDefinitionSurrogate.fixedContactDetail,
          this@ElementDefinitionSurrogate.fixedDataRequirement,
          this@ElementDefinitionSurrogate.fixedExpression,
          this@ElementDefinitionSurrogate.fixedParameterDefinition,
          this@ElementDefinitionSurrogate.fixedRelatedArtifact,
          this@ElementDefinitionSurrogate.fixedTriggerDefinition,
          this@ElementDefinitionSurrogate.fixedUsageContext,
          this@ElementDefinitionSurrogate.fixedAvailability,
          this@ElementDefinitionSurrogate.fixedExtendedContactDetail,
          this@ElementDefinitionSurrogate.fixedDosage,
          this@ElementDefinitionSurrogate.fixedMeta,
        ),
      example = this@ElementDefinitionSurrogate.example ?: mutableListOf(),
      minValue =
        ElementDefinition.MinValue?.from(
          Date.of(
            FhirDate.fromString(this@ElementDefinitionSurrogate.minValueDate),
            this@ElementDefinitionSurrogate._minValueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.minValueDateTime),
            this@ElementDefinitionSurrogate._minValueDateTime,
          ),
          Instant.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.minValueInstant),
            this@ElementDefinitionSurrogate._minValueInstant,
          ),
          Time.of(
            this@ElementDefinitionSurrogate.minValueTime,
            this@ElementDefinitionSurrogate._minValueTime,
          ),
          Decimal.of(
            this@ElementDefinitionSurrogate.minValueDecimal,
            this@ElementDefinitionSurrogate._minValueDecimal,
          ),
          Integer.of(
            this@ElementDefinitionSurrogate.minValueInteger,
            this@ElementDefinitionSurrogate._minValueInteger,
          ),
          Integer64.of(
            this@ElementDefinitionSurrogate.minValueInteger64,
            this@ElementDefinitionSurrogate._minValueInteger64,
          ),
          PositiveInt.of(
            this@ElementDefinitionSurrogate.minValuePositiveInt,
            this@ElementDefinitionSurrogate._minValuePositiveInt,
          ),
          UnsignedInt.of(
            this@ElementDefinitionSurrogate.minValueUnsignedInt,
            this@ElementDefinitionSurrogate._minValueUnsignedInt,
          ),
          this@ElementDefinitionSurrogate.minValueQuantity,
        ),
      maxValue =
        ElementDefinition.MaxValue?.from(
          Date.of(
            FhirDate.fromString(this@ElementDefinitionSurrogate.maxValueDate),
            this@ElementDefinitionSurrogate._maxValueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.maxValueDateTime),
            this@ElementDefinitionSurrogate._maxValueDateTime,
          ),
          Instant.of(
            FhirDateTime.fromString(this@ElementDefinitionSurrogate.maxValueInstant),
            this@ElementDefinitionSurrogate._maxValueInstant,
          ),
          Time.of(
            this@ElementDefinitionSurrogate.maxValueTime,
            this@ElementDefinitionSurrogate._maxValueTime,
          ),
          Decimal.of(
            this@ElementDefinitionSurrogate.maxValueDecimal,
            this@ElementDefinitionSurrogate._maxValueDecimal,
          ),
          Integer.of(
            this@ElementDefinitionSurrogate.maxValueInteger,
            this@ElementDefinitionSurrogate._maxValueInteger,
          ),
          Integer64.of(
            this@ElementDefinitionSurrogate.maxValueInteger64,
            this@ElementDefinitionSurrogate._maxValueInteger64,
          ),
          PositiveInt.of(
            this@ElementDefinitionSurrogate.maxValuePositiveInt,
            this@ElementDefinitionSurrogate._maxValuePositiveInt,
          ),
          UnsignedInt.of(
            this@ElementDefinitionSurrogate.maxValueUnsignedInt,
            this@ElementDefinitionSurrogate._maxValueUnsignedInt,
          ),
          this@ElementDefinitionSurrogate.maxValueQuantity,
        ),
      maxLength =
        Integer.of(
          this@ElementDefinitionSurrogate.maxLength,
          this@ElementDefinitionSurrogate._maxLength,
        ),
      condition =
        if (
          this@ElementDefinitionSurrogate.condition == null &&
            this@ElementDefinitionSurrogate._condition == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionSurrogate.condition
              ?: List(this@ElementDefinitionSurrogate._condition!!.size) { null })
            .zip(
              this@ElementDefinitionSurrogate._condition
                ?: List(this@ElementDefinitionSurrogate.condition!!.size) { null }
            )
            .map { (value, element) -> Id.of(value, element)!! }
            .toMutableList()
        },
      constraint = this@ElementDefinitionSurrogate.constraint ?: mutableListOf(),
      mustHaveValue =
        R5Boolean.of(
          this@ElementDefinitionSurrogate.mustHaveValue,
          this@ElementDefinitionSurrogate._mustHaveValue,
        ),
      valueAlternatives =
        if (
          this@ElementDefinitionSurrogate.valueAlternatives == null &&
            this@ElementDefinitionSurrogate._valueAlternatives == null
        ) {
          mutableListOf()
        } else {
          (this@ElementDefinitionSurrogate.valueAlternatives
              ?: List(this@ElementDefinitionSurrogate._valueAlternatives!!.size) { null })
            .zip(
              this@ElementDefinitionSurrogate._valueAlternatives
                ?: List(this@ElementDefinitionSurrogate.valueAlternatives!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      mustSupport =
        R5Boolean.of(
          this@ElementDefinitionSurrogate.mustSupport,
          this@ElementDefinitionSurrogate._mustSupport,
        ),
      isModifier =
        R5Boolean.of(
          this@ElementDefinitionSurrogate.isModifier,
          this@ElementDefinitionSurrogate._isModifier,
        ),
      isModifierReason =
        R5String.of(
          this@ElementDefinitionSurrogate.isModifierReason,
          this@ElementDefinitionSurrogate._isModifierReason,
        ),
      isSummary =
        R5Boolean.of(
          this@ElementDefinitionSurrogate.isSummary,
          this@ElementDefinitionSurrogate._isSummary,
        ),
      binding = this@ElementDefinitionSurrogate.binding,
      mapping = this@ElementDefinitionSurrogate.mapping ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ElementDefinition): ElementDefinitionSurrogate =
      with(model) {
        ElementDefinitionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          path = this@with.path.value,
          _path = this@with.path.toElement(),
          representation =
            this@with.representation
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _representation =
            this@with.representation
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          sliceName = this@with.sliceName?.value,
          _sliceName = this@with.sliceName?.toElement(),
          sliceIsConstraining = this@with.sliceIsConstraining?.value,
          _sliceIsConstraining = this@with.sliceIsConstraining?.toElement(),
          label = this@with.label?.value,
          _label = this@with.label?.toElement(),
          code = this@with.code.takeUnless { it.all { it == null } },
          slicing = this@with.slicing,
          short = this@with.short?.value,
          _short = this@with.short?.toElement(),
          definition = this@with.definition?.value,
          _definition = this@with.definition?.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          requirements = this@with.requirements?.value,
          _requirements = this@with.requirements?.toElement(),
          alias =
            this@with.alias.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _alias =
            this@with.alias
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          min = this@with.min?.value,
          _min = this@with.min?.toElement(),
          max = this@with.max?.value,
          _max = this@with.max?.toElement(),
          base = this@with.base,
          contentReference = this@with.contentReference?.value,
          _contentReference = this@with.contentReference?.toElement(),
          type = this@with.type.takeUnless { it.all { it == null } },
          defaultValueBase64Binary = this@with.defaultValue?.asBase64Binary()?.value?.value,
          _defaultValueBase64Binary = this@with.defaultValue?.asBase64Binary()?.value?.toElement(),
          defaultValueBoolean = this@with.defaultValue?.asBoolean()?.value?.value,
          _defaultValueBoolean = this@with.defaultValue?.asBoolean()?.value?.toElement(),
          defaultValueCanonical = this@with.defaultValue?.asCanonical()?.value?.value,
          _defaultValueCanonical = this@with.defaultValue?.asCanonical()?.value?.toElement(),
          defaultValueCode = this@with.defaultValue?.asCode()?.value?.value,
          _defaultValueCode = this@with.defaultValue?.asCode()?.value?.toElement(),
          defaultValueDate = this@with.defaultValue?.asDate()?.value?.value?.toString(),
          _defaultValueDate = this@with.defaultValue?.asDate()?.value?.toElement(),
          defaultValueDateTime = this@with.defaultValue?.asDateTime()?.value?.value?.toString(),
          _defaultValueDateTime = this@with.defaultValue?.asDateTime()?.value?.toElement(),
          defaultValueDecimal = this@with.defaultValue?.asDecimal()?.value?.value,
          _defaultValueDecimal = this@with.defaultValue?.asDecimal()?.value?.toElement(),
          defaultValueId = this@with.defaultValue?.asId()?.value?.value,
          _defaultValueId = this@with.defaultValue?.asId()?.value?.toElement(),
          defaultValueInstant = this@with.defaultValue?.asInstant()?.value?.value?.toString(),
          _defaultValueInstant = this@with.defaultValue?.asInstant()?.value?.toElement(),
          defaultValueInteger = this@with.defaultValue?.asInteger()?.value?.value,
          _defaultValueInteger = this@with.defaultValue?.asInteger()?.value?.toElement(),
          defaultValueInteger64 = this@with.defaultValue?.asInteger64()?.value?.value,
          _defaultValueInteger64 = this@with.defaultValue?.asInteger64()?.value?.toElement(),
          defaultValueMarkdown = this@with.defaultValue?.asMarkdown()?.value?.value,
          _defaultValueMarkdown = this@with.defaultValue?.asMarkdown()?.value?.toElement(),
          defaultValueOid = this@with.defaultValue?.asOid()?.value?.value,
          _defaultValueOid = this@with.defaultValue?.asOid()?.value?.toElement(),
          defaultValuePositiveInt = this@with.defaultValue?.asPositiveInt()?.value?.value,
          _defaultValuePositiveInt = this@with.defaultValue?.asPositiveInt()?.value?.toElement(),
          defaultValueString = this@with.defaultValue?.asString()?.value?.value,
          _defaultValueString = this@with.defaultValue?.asString()?.value?.toElement(),
          defaultValueTime = this@with.defaultValue?.asTime()?.value?.value,
          _defaultValueTime = this@with.defaultValue?.asTime()?.value?.toElement(),
          defaultValueUnsignedInt = this@with.defaultValue?.asUnsignedInt()?.value?.value,
          _defaultValueUnsignedInt = this@with.defaultValue?.asUnsignedInt()?.value?.toElement(),
          defaultValueUri = this@with.defaultValue?.asUri()?.value?.value,
          _defaultValueUri = this@with.defaultValue?.asUri()?.value?.toElement(),
          defaultValueUrl = this@with.defaultValue?.asUrl()?.value?.value,
          _defaultValueUrl = this@with.defaultValue?.asUrl()?.value?.toElement(),
          defaultValueUuid = this@with.defaultValue?.asUuid()?.value?.value,
          _defaultValueUuid = this@with.defaultValue?.asUuid()?.value?.toElement(),
          defaultValueAddress = this@with.defaultValue?.asAddress()?.value,
          defaultValueAge = this@with.defaultValue?.asAge()?.value,
          defaultValueAnnotation = this@with.defaultValue?.asAnnotation()?.value,
          defaultValueAttachment = this@with.defaultValue?.asAttachment()?.value,
          defaultValueCodeableConcept = this@with.defaultValue?.asCodeableConcept()?.value,
          defaultValueCodeableReference = this@with.defaultValue?.asCodeableReference()?.value,
          defaultValueCoding = this@with.defaultValue?.asCoding()?.value,
          defaultValueContactPoint = this@with.defaultValue?.asContactPoint()?.value,
          defaultValueCount = this@with.defaultValue?.asCount()?.value,
          defaultValueDistance = this@with.defaultValue?.asDistance()?.value,
          defaultValueDuration = this@with.defaultValue?.asDuration()?.value,
          defaultValueHumanName = this@with.defaultValue?.asHumanName()?.value,
          defaultValueIdentifier = this@with.defaultValue?.asIdentifier()?.value,
          defaultValueMoney = this@with.defaultValue?.asMoney()?.value,
          defaultValuePeriod = this@with.defaultValue?.asPeriod()?.value,
          defaultValueQuantity = this@with.defaultValue?.asQuantity()?.value,
          defaultValueRange = this@with.defaultValue?.asRange()?.value,
          defaultValueRatio = this@with.defaultValue?.asRatio()?.value,
          defaultValueRatioRange = this@with.defaultValue?.asRatioRange()?.value,
          defaultValueReference = this@with.defaultValue?.asReference()?.value,
          defaultValueSampledData = this@with.defaultValue?.asSampledData()?.value,
          defaultValueSignature = this@with.defaultValue?.asSignature()?.value,
          defaultValueTiming = this@with.defaultValue?.asTiming()?.value,
          defaultValueContactDetail = this@with.defaultValue?.asContactDetail()?.value,
          defaultValueDataRequirement = this@with.defaultValue?.asDataRequirement()?.value,
          defaultValueExpression = this@with.defaultValue?.asExpression()?.value,
          defaultValueParameterDefinition = this@with.defaultValue?.asParameterDefinition()?.value,
          defaultValueRelatedArtifact = this@with.defaultValue?.asRelatedArtifact()?.value,
          defaultValueTriggerDefinition = this@with.defaultValue?.asTriggerDefinition()?.value,
          defaultValueUsageContext = this@with.defaultValue?.asUsageContext()?.value,
          defaultValueAvailability = this@with.defaultValue?.asAvailability()?.value,
          defaultValueExtendedContactDetail =
            this@with.defaultValue?.asExtendedContactDetail()?.value,
          defaultValueDosage = this@with.defaultValue?.asDosage()?.value,
          defaultValueMeta = this@with.defaultValue?.asMeta()?.value,
          meaningWhenMissing = this@with.meaningWhenMissing?.value,
          _meaningWhenMissing = this@with.meaningWhenMissing?.toElement(),
          orderMeaning = this@with.orderMeaning?.value,
          _orderMeaning = this@with.orderMeaning?.toElement(),
          fixedBase64Binary = this@with.fixed?.asBase64Binary()?.value?.value,
          _fixedBase64Binary = this@with.fixed?.asBase64Binary()?.value?.toElement(),
          fixedBoolean = this@with.fixed?.asBoolean()?.value?.value,
          _fixedBoolean = this@with.fixed?.asBoolean()?.value?.toElement(),
          fixedCanonical = this@with.fixed?.asCanonical()?.value?.value,
          _fixedCanonical = this@with.fixed?.asCanonical()?.value?.toElement(),
          fixedCode = this@with.fixed?.asCode()?.value?.value,
          _fixedCode = this@with.fixed?.asCode()?.value?.toElement(),
          fixedDate = this@with.fixed?.asDate()?.value?.value?.toString(),
          _fixedDate = this@with.fixed?.asDate()?.value?.toElement(),
          fixedDateTime = this@with.fixed?.asDateTime()?.value?.value?.toString(),
          _fixedDateTime = this@with.fixed?.asDateTime()?.value?.toElement(),
          fixedDecimal = this@with.fixed?.asDecimal()?.value?.value,
          _fixedDecimal = this@with.fixed?.asDecimal()?.value?.toElement(),
          fixedId = this@with.fixed?.asId()?.value?.value,
          _fixedId = this@with.fixed?.asId()?.value?.toElement(),
          fixedInstant = this@with.fixed?.asInstant()?.value?.value?.toString(),
          _fixedInstant = this@with.fixed?.asInstant()?.value?.toElement(),
          fixedInteger = this@with.fixed?.asInteger()?.value?.value,
          _fixedInteger = this@with.fixed?.asInteger()?.value?.toElement(),
          fixedInteger64 = this@with.fixed?.asInteger64()?.value?.value,
          _fixedInteger64 = this@with.fixed?.asInteger64()?.value?.toElement(),
          fixedMarkdown = this@with.fixed?.asMarkdown()?.value?.value,
          _fixedMarkdown = this@with.fixed?.asMarkdown()?.value?.toElement(),
          fixedOid = this@with.fixed?.asOid()?.value?.value,
          _fixedOid = this@with.fixed?.asOid()?.value?.toElement(),
          fixedPositiveInt = this@with.fixed?.asPositiveInt()?.value?.value,
          _fixedPositiveInt = this@with.fixed?.asPositiveInt()?.value?.toElement(),
          fixedString = this@with.fixed?.asString()?.value?.value,
          _fixedString = this@with.fixed?.asString()?.value?.toElement(),
          fixedTime = this@with.fixed?.asTime()?.value?.value,
          _fixedTime = this@with.fixed?.asTime()?.value?.toElement(),
          fixedUnsignedInt = this@with.fixed?.asUnsignedInt()?.value?.value,
          _fixedUnsignedInt = this@with.fixed?.asUnsignedInt()?.value?.toElement(),
          fixedUri = this@with.fixed?.asUri()?.value?.value,
          _fixedUri = this@with.fixed?.asUri()?.value?.toElement(),
          fixedUrl = this@with.fixed?.asUrl()?.value?.value,
          _fixedUrl = this@with.fixed?.asUrl()?.value?.toElement(),
          fixedUuid = this@with.fixed?.asUuid()?.value?.value,
          _fixedUuid = this@with.fixed?.asUuid()?.value?.toElement(),
          fixedAddress = this@with.fixed?.asAddress()?.value,
          fixedAge = this@with.fixed?.asAge()?.value,
          fixedAnnotation = this@with.fixed?.asAnnotation()?.value,
          fixedAttachment = this@with.fixed?.asAttachment()?.value,
          fixedCodeableConcept = this@with.fixed?.asCodeableConcept()?.value,
          fixedCodeableReference = this@with.fixed?.asCodeableReference()?.value,
          fixedCoding = this@with.fixed?.asCoding()?.value,
          fixedContactPoint = this@with.fixed?.asContactPoint()?.value,
          fixedCount = this@with.fixed?.asCount()?.value,
          fixedDistance = this@with.fixed?.asDistance()?.value,
          fixedDuration = this@with.fixed?.asDuration()?.value,
          fixedHumanName = this@with.fixed?.asHumanName()?.value,
          fixedIdentifier = this@with.fixed?.asIdentifier()?.value,
          fixedMoney = this@with.fixed?.asMoney()?.value,
          fixedPeriod = this@with.fixed?.asPeriod()?.value,
          fixedQuantity = this@with.fixed?.asQuantity()?.value,
          fixedRange = this@with.fixed?.asRange()?.value,
          fixedRatio = this@with.fixed?.asRatio()?.value,
          fixedRatioRange = this@with.fixed?.asRatioRange()?.value,
          fixedReference = this@with.fixed?.asReference()?.value,
          fixedSampledData = this@with.fixed?.asSampledData()?.value,
          fixedSignature = this@with.fixed?.asSignature()?.value,
          fixedTiming = this@with.fixed?.asTiming()?.value,
          fixedContactDetail = this@with.fixed?.asContactDetail()?.value,
          fixedDataRequirement = this@with.fixed?.asDataRequirement()?.value,
          fixedExpression = this@with.fixed?.asExpression()?.value,
          fixedParameterDefinition = this@with.fixed?.asParameterDefinition()?.value,
          fixedRelatedArtifact = this@with.fixed?.asRelatedArtifact()?.value,
          fixedTriggerDefinition = this@with.fixed?.asTriggerDefinition()?.value,
          fixedUsageContext = this@with.fixed?.asUsageContext()?.value,
          fixedAvailability = this@with.fixed?.asAvailability()?.value,
          fixedExtendedContactDetail = this@with.fixed?.asExtendedContactDetail()?.value,
          fixedDosage = this@with.fixed?.asDosage()?.value,
          fixedMeta = this@with.fixed?.asMeta()?.value,
          example = this@with.example.takeUnless { it.all { it == null } },
          minValueDate = this@with.minValue?.asDate()?.value?.value?.toString(),
          _minValueDate = this@with.minValue?.asDate()?.value?.toElement(),
          minValueDateTime = this@with.minValue?.asDateTime()?.value?.value?.toString(),
          _minValueDateTime = this@with.minValue?.asDateTime()?.value?.toElement(),
          minValueInstant = this@with.minValue?.asInstant()?.value?.value?.toString(),
          _minValueInstant = this@with.minValue?.asInstant()?.value?.toElement(),
          minValueTime = this@with.minValue?.asTime()?.value?.value,
          _minValueTime = this@with.minValue?.asTime()?.value?.toElement(),
          minValueDecimal = this@with.minValue?.asDecimal()?.value?.value,
          _minValueDecimal = this@with.minValue?.asDecimal()?.value?.toElement(),
          minValueInteger = this@with.minValue?.asInteger()?.value?.value,
          _minValueInteger = this@with.minValue?.asInteger()?.value?.toElement(),
          minValueInteger64 = this@with.minValue?.asInteger64()?.value?.value,
          _minValueInteger64 = this@with.minValue?.asInteger64()?.value?.toElement(),
          minValuePositiveInt = this@with.minValue?.asPositiveInt()?.value?.value,
          _minValuePositiveInt = this@with.minValue?.asPositiveInt()?.value?.toElement(),
          minValueUnsignedInt = this@with.minValue?.asUnsignedInt()?.value?.value,
          _minValueUnsignedInt = this@with.minValue?.asUnsignedInt()?.value?.toElement(),
          minValueQuantity = this@with.minValue?.asQuantity()?.value,
          maxValueDate = this@with.maxValue?.asDate()?.value?.value?.toString(),
          _maxValueDate = this@with.maxValue?.asDate()?.value?.toElement(),
          maxValueDateTime = this@with.maxValue?.asDateTime()?.value?.value?.toString(),
          _maxValueDateTime = this@with.maxValue?.asDateTime()?.value?.toElement(),
          maxValueInstant = this@with.maxValue?.asInstant()?.value?.value?.toString(),
          _maxValueInstant = this@with.maxValue?.asInstant()?.value?.toElement(),
          maxValueTime = this@with.maxValue?.asTime()?.value?.value,
          _maxValueTime = this@with.maxValue?.asTime()?.value?.toElement(),
          maxValueDecimal = this@with.maxValue?.asDecimal()?.value?.value,
          _maxValueDecimal = this@with.maxValue?.asDecimal()?.value?.toElement(),
          maxValueInteger = this@with.maxValue?.asInteger()?.value?.value,
          _maxValueInteger = this@with.maxValue?.asInteger()?.value?.toElement(),
          maxValueInteger64 = this@with.maxValue?.asInteger64()?.value?.value,
          _maxValueInteger64 = this@with.maxValue?.asInteger64()?.value?.toElement(),
          maxValuePositiveInt = this@with.maxValue?.asPositiveInt()?.value?.value,
          _maxValuePositiveInt = this@with.maxValue?.asPositiveInt()?.value?.toElement(),
          maxValueUnsignedInt = this@with.maxValue?.asUnsignedInt()?.value?.value,
          _maxValueUnsignedInt = this@with.maxValue?.asUnsignedInt()?.value?.toElement(),
          maxValueQuantity = this@with.maxValue?.asQuantity()?.value,
          maxLength = this@with.maxLength?.value,
          _maxLength = this@with.maxLength?.toElement(),
          condition =
            this@with.condition
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _condition =
            this@with.condition
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          constraint = this@with.constraint.takeUnless { it.all { it == null } },
          mustHaveValue = this@with.mustHaveValue?.value,
          _mustHaveValue = this@with.mustHaveValue?.toElement(),
          valueAlternatives =
            this@with.valueAlternatives
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _valueAlternatives =
            this@with.valueAlternatives
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          mustSupport = this@with.mustSupport?.value,
          _mustSupport = this@with.mustSupport?.toElement(),
          isModifier = this@with.isModifier?.value,
          _isModifier = this@with.isModifier?.toElement(),
          isModifierReason = this@with.isModifierReason?.value,
          _isModifierReason = this@with.isModifierReason?.toElement(),
          isSummary = this@with.isSummary?.value,
          _isSummary = this@with.isSummary?.toElement(),
          binding = this@with.binding,
          mapping = this@with.mapping.takeUnless { it.all { it == null } },
        )
      }
  }
}
