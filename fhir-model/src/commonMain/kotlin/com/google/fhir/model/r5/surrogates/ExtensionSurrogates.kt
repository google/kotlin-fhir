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
internal data class ExtensionValueSurrogate(
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
  public fun toModel(): Extension.Value =
    Extension.Value?.from(
      Base64Binary.of(
        this@ExtensionValueSurrogate.valueBase64Binary,
        this@ExtensionValueSurrogate._valueBase64Binary,
      ),
      R5Boolean.of(
        this@ExtensionValueSurrogate.valueBoolean,
        this@ExtensionValueSurrogate._valueBoolean,
      ),
      Canonical.of(
        this@ExtensionValueSurrogate.valueCanonical,
        this@ExtensionValueSurrogate._valueCanonical,
      ),
      Code.of(this@ExtensionValueSurrogate.valueCode, this@ExtensionValueSurrogate._valueCode),
      Date.of(
        FhirDate.fromString(this@ExtensionValueSurrogate.valueDate),
        this@ExtensionValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@ExtensionValueSurrogate.valueDateTime),
        this@ExtensionValueSurrogate._valueDateTime,
      ),
      Decimal.of(
        this@ExtensionValueSurrogate.valueDecimal,
        this@ExtensionValueSurrogate._valueDecimal,
      ),
      Id.of(this@ExtensionValueSurrogate.valueId, this@ExtensionValueSurrogate._valueId),
      Instant.of(
        FhirDateTime.fromString(this@ExtensionValueSurrogate.valueInstant),
        this@ExtensionValueSurrogate._valueInstant,
      ),
      Integer.of(
        this@ExtensionValueSurrogate.valueInteger,
        this@ExtensionValueSurrogate._valueInteger,
      ),
      Integer64.of(
        this@ExtensionValueSurrogate.valueInteger64,
        this@ExtensionValueSurrogate._valueInteger64,
      ),
      Markdown.of(
        this@ExtensionValueSurrogate.valueMarkdown,
        this@ExtensionValueSurrogate._valueMarkdown,
      ),
      Oid.of(this@ExtensionValueSurrogate.valueOid, this@ExtensionValueSurrogate._valueOid),
      PositiveInt.of(
        this@ExtensionValueSurrogate.valuePositiveInt,
        this@ExtensionValueSurrogate._valuePositiveInt,
      ),
      R5String.of(
        this@ExtensionValueSurrogate.valueString,
        this@ExtensionValueSurrogate._valueString,
      ),
      Time.of(this@ExtensionValueSurrogate.valueTime, this@ExtensionValueSurrogate._valueTime),
      UnsignedInt.of(
        this@ExtensionValueSurrogate.valueUnsignedInt,
        this@ExtensionValueSurrogate._valueUnsignedInt,
      ),
      Uri.of(this@ExtensionValueSurrogate.valueUri, this@ExtensionValueSurrogate._valueUri),
      Url.of(this@ExtensionValueSurrogate.valueUrl, this@ExtensionValueSurrogate._valueUrl),
      Uuid.of(this@ExtensionValueSurrogate.valueUuid, this@ExtensionValueSurrogate._valueUuid),
      this@ExtensionValueSurrogate.valueAddress,
      this@ExtensionValueSurrogate.valueAge,
      this@ExtensionValueSurrogate.valueAnnotation,
      this@ExtensionValueSurrogate.valueAttachment,
      this@ExtensionValueSurrogate.valueCodeableConcept,
      this@ExtensionValueSurrogate.valueCodeableReference,
      this@ExtensionValueSurrogate.valueCoding,
      this@ExtensionValueSurrogate.valueContactPoint,
      this@ExtensionValueSurrogate.valueCount,
      this@ExtensionValueSurrogate.valueDistance,
      this@ExtensionValueSurrogate.valueDuration,
      this@ExtensionValueSurrogate.valueHumanName,
      this@ExtensionValueSurrogate.valueIdentifier,
      this@ExtensionValueSurrogate.valueMoney,
      this@ExtensionValueSurrogate.valuePeriod,
      this@ExtensionValueSurrogate.valueQuantity,
      this@ExtensionValueSurrogate.valueRange,
      this@ExtensionValueSurrogate.valueRatio,
      this@ExtensionValueSurrogate.valueRatioRange,
      this@ExtensionValueSurrogate.valueReference,
      this@ExtensionValueSurrogate.valueSampledData,
      this@ExtensionValueSurrogate.valueSignature,
      this@ExtensionValueSurrogate.valueTiming,
      this@ExtensionValueSurrogate.valueContactDetail,
      this@ExtensionValueSurrogate.valueDataRequirement,
      this@ExtensionValueSurrogate.valueExpression,
      this@ExtensionValueSurrogate.valueParameterDefinition,
      this@ExtensionValueSurrogate.valueRelatedArtifact,
      this@ExtensionValueSurrogate.valueTriggerDefinition,
      this@ExtensionValueSurrogate.valueUsageContext,
      this@ExtensionValueSurrogate.valueAvailability,
      this@ExtensionValueSurrogate.valueExtendedContactDetail,
      this@ExtensionValueSurrogate.valueDosage,
      this@ExtensionValueSurrogate.valueMeta,
    )!!

  public companion object {
    public fun fromModel(model: Extension.Value): ExtensionValueSurrogate =
      with(model) {
        ExtensionValueSurrogate(
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
          valueInteger64 = this@with.asInteger64()?.value?.value,
          _valueInteger64 = this@with.asInteger64()?.value?.toElement(),
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
          valueCodeableReference = this@with.asCodeableReference()?.value,
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
          valueRatioRange = this@with.asRatioRange()?.value,
          valueReference = this@with.asReference()?.value,
          valueSampledData = this@with.asSampledData()?.value,
          valueSignature = this@with.asSignature()?.value,
          valueTiming = this@with.asTiming()?.value,
          valueContactDetail = this@with.asContactDetail()?.value,
          valueDataRequirement = this@with.asDataRequirement()?.value,
          valueExpression = this@with.asExpression()?.value,
          valueParameterDefinition = this@with.asParameterDefinition()?.value,
          valueRelatedArtifact = this@with.asRelatedArtifact()?.value,
          valueTriggerDefinition = this@with.asTriggerDefinition()?.value,
          valueUsageContext = this@with.asUsageContext()?.value,
          valueAvailability = this@with.asAvailability()?.value,
          valueExtendedContactDetail = this@with.asExtendedContactDetail()?.value,
          valueDosage = this@with.asDosage()?.value,
          valueMeta = this@with.asMeta()?.value,
        )
      }
  }
}

@Serializable
internal data class ExtensionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var url: KotlinString,
  public var `value`: Extension.Value? = null,
) {
  public fun toModel(): Extension =
    Extension(
      id = this@ExtensionSurrogate.id,
      extension = this@ExtensionSurrogate.extension ?: mutableListOf(),
      url = this@ExtensionSurrogate.url,
      `value` = this@ExtensionSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: Extension): ExtensionSurrogate =
      with(model) {
        ExtensionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          url = this@with.url,
          `value` = this@with.`value`,
        )
      }
  }
}
