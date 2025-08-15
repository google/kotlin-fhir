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
import com.google.fhir.model.r4b.Age
import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Base64Binary
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Contributor
import com.google.fhir.model.r4b.Count
import com.google.fhir.model.r4b.DataRequirement
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Distance
import com.google.fhir.model.r4b.Dosage
import com.google.fhir.model.r4b.Duration
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Expression
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.HumanName
import com.google.fhir.model.r4b.Id
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Instant
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.Oid
import com.google.fhir.model.r4b.ParameterDefinition
import com.google.fhir.model.r4b.Parameters
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.SampledData
import com.google.fhir.model.r4b.Signature
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Time
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.TriggerDefinition
import com.google.fhir.model.r4b.UnsignedInt
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.Url
import com.google.fhir.model.r4b.UsageContext
import com.google.fhir.model.r4b.Uuid
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
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
internal data class ParametersParameterValueSurrogate(
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
  public var valueReference: Reference? = null,
  public var valueSampledData: SampledData? = null,
  public var valueSignature: Signature? = null,
  public var valueTiming: Timing? = null,
  public var valueContactDetail: ContactDetail? = null,
  public var valueContributor: Contributor? = null,
  public var valueDataRequirement: DataRequirement? = null,
  public var valueExpression: Expression? = null,
  public var valueParameterDefinition: ParameterDefinition? = null,
  public var valueRelatedArtifact: RelatedArtifact? = null,
  public var valueTriggerDefinition: TriggerDefinition? = null,
  public var valueUsageContext: UsageContext? = null,
  public var valueDosage: Dosage? = null,
  public var valueMeta: Meta? = null,
) {
  public fun toModel(): Parameters.Parameter.Value =
    Parameters.Parameter.Value?.from(
      Base64Binary.of(
        this@ParametersParameterValueSurrogate.valueBase64Binary,
        this@ParametersParameterValueSurrogate._valueBase64Binary,
      ),
      R4bBoolean.of(
        this@ParametersParameterValueSurrogate.valueBoolean,
        this@ParametersParameterValueSurrogate._valueBoolean,
      ),
      Canonical.of(
        this@ParametersParameterValueSurrogate.valueCanonical,
        this@ParametersParameterValueSurrogate._valueCanonical,
      ),
      Code.of(
        this@ParametersParameterValueSurrogate.valueCode,
        this@ParametersParameterValueSurrogate._valueCode,
      ),
      Date.of(
        FhirDate.fromString(this@ParametersParameterValueSurrogate.valueDate),
        this@ParametersParameterValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@ParametersParameterValueSurrogate.valueDateTime),
        this@ParametersParameterValueSurrogate._valueDateTime,
      ),
      Decimal.of(
        this@ParametersParameterValueSurrogate.valueDecimal,
        this@ParametersParameterValueSurrogate._valueDecimal,
      ),
      Id.of(
        this@ParametersParameterValueSurrogate.valueId,
        this@ParametersParameterValueSurrogate._valueId,
      ),
      Instant.of(
        FhirDateTime.fromString(this@ParametersParameterValueSurrogate.valueInstant),
        this@ParametersParameterValueSurrogate._valueInstant,
      ),
      Integer.of(
        this@ParametersParameterValueSurrogate.valueInteger,
        this@ParametersParameterValueSurrogate._valueInteger,
      ),
      Markdown.of(
        this@ParametersParameterValueSurrogate.valueMarkdown,
        this@ParametersParameterValueSurrogate._valueMarkdown,
      ),
      Oid.of(
        this@ParametersParameterValueSurrogate.valueOid,
        this@ParametersParameterValueSurrogate._valueOid,
      ),
      PositiveInt.of(
        this@ParametersParameterValueSurrogate.valuePositiveInt,
        this@ParametersParameterValueSurrogate._valuePositiveInt,
      ),
      R4bString.of(
        this@ParametersParameterValueSurrogate.valueString,
        this@ParametersParameterValueSurrogate._valueString,
      ),
      Time.of(
        this@ParametersParameterValueSurrogate.valueTime,
        this@ParametersParameterValueSurrogate._valueTime,
      ),
      UnsignedInt.of(
        this@ParametersParameterValueSurrogate.valueUnsignedInt,
        this@ParametersParameterValueSurrogate._valueUnsignedInt,
      ),
      Uri.of(
        this@ParametersParameterValueSurrogate.valueUri,
        this@ParametersParameterValueSurrogate._valueUri,
      ),
      Url.of(
        this@ParametersParameterValueSurrogate.valueUrl,
        this@ParametersParameterValueSurrogate._valueUrl,
      ),
      Uuid.of(
        this@ParametersParameterValueSurrogate.valueUuid,
        this@ParametersParameterValueSurrogate._valueUuid,
      ),
      this@ParametersParameterValueSurrogate.valueAddress,
      this@ParametersParameterValueSurrogate.valueAge,
      this@ParametersParameterValueSurrogate.valueAnnotation,
      this@ParametersParameterValueSurrogate.valueAttachment,
      this@ParametersParameterValueSurrogate.valueCodeableConcept,
      this@ParametersParameterValueSurrogate.valueCoding,
      this@ParametersParameterValueSurrogate.valueContactPoint,
      this@ParametersParameterValueSurrogate.valueCount,
      this@ParametersParameterValueSurrogate.valueDistance,
      this@ParametersParameterValueSurrogate.valueDuration,
      this@ParametersParameterValueSurrogate.valueHumanName,
      this@ParametersParameterValueSurrogate.valueIdentifier,
      this@ParametersParameterValueSurrogate.valueMoney,
      this@ParametersParameterValueSurrogate.valuePeriod,
      this@ParametersParameterValueSurrogate.valueQuantity,
      this@ParametersParameterValueSurrogate.valueRange,
      this@ParametersParameterValueSurrogate.valueRatio,
      this@ParametersParameterValueSurrogate.valueReference,
      this@ParametersParameterValueSurrogate.valueSampledData,
      this@ParametersParameterValueSurrogate.valueSignature,
      this@ParametersParameterValueSurrogate.valueTiming,
      this@ParametersParameterValueSurrogate.valueContactDetail,
      this@ParametersParameterValueSurrogate.valueContributor,
      this@ParametersParameterValueSurrogate.valueDataRequirement,
      this@ParametersParameterValueSurrogate.valueExpression,
      this@ParametersParameterValueSurrogate.valueParameterDefinition,
      this@ParametersParameterValueSurrogate.valueRelatedArtifact,
      this@ParametersParameterValueSurrogate.valueTriggerDefinition,
      this@ParametersParameterValueSurrogate.valueUsageContext,
      this@ParametersParameterValueSurrogate.valueDosage,
      this@ParametersParameterValueSurrogate.valueMeta,
    )!!

  public companion object {
    public fun fromModel(model: Parameters.Parameter.Value): ParametersParameterValueSurrogate =
      with(model) {
        ParametersParameterValueSurrogate(
          valueBase64Binary = this@with.asBase64Binary()?.value?.value,
          _valueBase64Binary = this@with.asBase64Binary()?.value?.toElement(),
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
          valueCanonical = this@with.asCanonical()?.value?.value,
          _valueCanonical = this@with.asCanonical()?.value?.toElement(),
          valueCode = this@with.asCode()?.value?.value,
          _valueCode = this@with.asCode()?.value?.toElement(),
          valueDate = this@with.asDate()?.value?.value?.toString(),
          _valueDate = this@with.asDate()?.value?.toElement(),
          valueDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.asDateTime()?.value?.toElement(),
          valueDecimal = this@with.asDecimal()?.value?.value,
          _valueDecimal = this@with.asDecimal()?.value?.toElement(),
          valueId = this@with.asId()?.value?.value,
          _valueId = this@with.asId()?.value?.toElement(),
          valueInstant = this@with.asInstant()?.value?.value?.toString(),
          _valueInstant = this@with.asInstant()?.value?.toElement(),
          valueInteger = this@with.asInteger()?.value?.value,
          _valueInteger = this@with.asInteger()?.value?.toElement(),
          valueMarkdown = this@with.asMarkdown()?.value?.value,
          _valueMarkdown = this@with.asMarkdown()?.value?.toElement(),
          valueOid = this@with.asOid()?.value?.value,
          _valueOid = this@with.asOid()?.value?.toElement(),
          valuePositiveInt = this@with.asPositiveInt()?.value?.value,
          _valuePositiveInt = this@with.asPositiveInt()?.value?.toElement(),
          valueString = this@with.asString()?.value?.value,
          _valueString = this@with.asString()?.value?.toElement(),
          valueTime = this@with.asTime()?.value?.value,
          _valueTime = this@with.asTime()?.value?.toElement(),
          valueUnsignedInt = this@with.asUnsignedInt()?.value?.value,
          _valueUnsignedInt = this@with.asUnsignedInt()?.value?.toElement(),
          valueUri = this@with.asUri()?.value?.value,
          _valueUri = this@with.asUri()?.value?.toElement(),
          valueUrl = this@with.asUrl()?.value?.value,
          _valueUrl = this@with.asUrl()?.value?.toElement(),
          valueUuid = this@with.asUuid()?.value?.value,
          _valueUuid = this@with.asUuid()?.value?.toElement(),
          valueAddress = this@with.asAddress()?.value,
          valueAge = this@with.asAge()?.value,
          valueAnnotation = this@with.asAnnotation()?.value,
          valueAttachment = this@with.asAttachment()?.value,
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueCoding = this@with.asCoding()?.value,
          valueContactPoint = this@with.asContactPoint()?.value,
          valueCount = this@with.asCount()?.value,
          valueDistance = this@with.asDistance()?.value,
          valueDuration = this@with.asDuration()?.value,
          valueHumanName = this@with.asHumanName()?.value,
          valueIdentifier = this@with.asIdentifier()?.value,
          valueMoney = this@with.asMoney()?.value,
          valuePeriod = this@with.asPeriod()?.value,
          valueQuantity = this@with.asQuantity()?.value,
          valueRange = this@with.asRange()?.value,
          valueRatio = this@with.asRatio()?.value,
          valueReference = this@with.asReference()?.value,
          valueSampledData = this@with.asSampledData()?.value,
          valueSignature = this@with.asSignature()?.value,
          valueTiming = this@with.asTiming()?.value,
          valueContactDetail = this@with.asContactDetail()?.value,
          valueContributor = this@with.asContributor()?.value,
          valueDataRequirement = this@with.asDataRequirement()?.value,
          valueExpression = this@with.asExpression()?.value,
          valueParameterDefinition = this@with.asParameterDefinition()?.value,
          valueRelatedArtifact = this@with.asRelatedArtifact()?.value,
          valueTriggerDefinition = this@with.asTriggerDefinition()?.value,
          valueUsageContext = this@with.asUsageContext()?.value,
          valueDosage = this@with.asDosage()?.value,
          valueMeta = this@with.asMeta()?.value,
        )
      }
  }
}

@Serializable
internal data class ParametersParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var `value`: Parameters.Parameter.Value? = null,
  public var resource: Resource? = null,
  public var part: MutableList<Parameters.Parameter>? = null,
) {
  public fun toModel(): Parameters.Parameter =
    Parameters.Parameter(
      id = this@ParametersParameterSurrogate.id,
      extension = this@ParametersParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ParametersParameterSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R4bString.of(
          this@ParametersParameterSurrogate.name,
          this@ParametersParameterSurrogate._name,
        )!!,
      `value` = this@ParametersParameterSurrogate.`value`,
      resource = this@ParametersParameterSurrogate.resource,
      part = this@ParametersParameterSurrogate.part ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Parameters.Parameter): ParametersParameterSurrogate =
      with(model) {
        ParametersParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          `value` = this@with.`value`,
          resource = this@with.resource,
          part = this@with.part.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ParametersSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var parameter: MutableList<Parameters.Parameter>? = null,
) {
  public fun toModel(): Parameters =
    Parameters(
      id = this@ParametersSurrogate.id,
      meta = this@ParametersSurrogate.meta,
      implicitRules =
        Uri.of(this@ParametersSurrogate.implicitRules, this@ParametersSurrogate._implicitRules),
      language = Code.of(this@ParametersSurrogate.language, this@ParametersSurrogate._language),
      parameter = this@ParametersSurrogate.parameter ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Parameters): ParametersSurrogate =
      with(model) {
        ParametersSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
        )
      }
  }
}
