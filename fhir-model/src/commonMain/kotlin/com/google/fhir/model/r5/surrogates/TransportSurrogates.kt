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
import com.google.fhir.model.r5.Narrative
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
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.SampledData
import com.google.fhir.model.r5.Signature
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Transport
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
import kotlin.collections.List
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TransportRestrictionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var repetitions: Int? = null,
  public var _repetitions: Element? = null,
  public var period: Period? = null,
  public var recipient: List<Reference?>? = null,
) {
  public fun toModel(): Transport.Restriction =
    Transport.Restriction().apply {
      id = this@TransportRestrictionSurrogate.id
      extension = this@TransportRestrictionSurrogate.extension
      modifierExtension = this@TransportRestrictionSurrogate.modifierExtension
      repetitions =
        PositiveInt.of(
          this@TransportRestrictionSurrogate.repetitions,
          this@TransportRestrictionSurrogate._repetitions,
        )
      period = this@TransportRestrictionSurrogate.period
      recipient = this@TransportRestrictionSurrogate.recipient
    }

  public companion object {
    public fun fromModel(model: Transport.Restriction): TransportRestrictionSurrogate =
      with(model) {
        TransportRestrictionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          repetitions = this@with.repetitions?.value
          _repetitions = this@with.repetitions?.toElement()
          period = this@with.period
          recipient = this@with.recipient
        }
      }
  }
}

@Serializable
internal data class TransportInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
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
  public fun toModel(): Transport.Input =
    Transport.Input().apply {
      id = this@TransportInputSurrogate.id
      extension = this@TransportInputSurrogate.extension
      modifierExtension = this@TransportInputSurrogate.modifierExtension
      type = this@TransportInputSurrogate.type
      `value` =
        Transport.Input.Value?.from(
          Base64Binary.of(
            this@TransportInputSurrogate.valueBase64Binary,
            this@TransportInputSurrogate._valueBase64Binary,
          ),
          R5Boolean.of(
            this@TransportInputSurrogate.valueBoolean,
            this@TransportInputSurrogate._valueBoolean,
          ),
          Canonical.of(
            this@TransportInputSurrogate.valueCanonical,
            this@TransportInputSurrogate._valueCanonical,
          ),
          Code.of(this@TransportInputSurrogate.valueCode, this@TransportInputSurrogate._valueCode),
          Date.of(
            FhirDate.fromString(this@TransportInputSurrogate.valueDate),
            this@TransportInputSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@TransportInputSurrogate.valueDateTime),
            this@TransportInputSurrogate._valueDateTime,
          ),
          Decimal.of(
            this@TransportInputSurrogate.valueDecimal,
            this@TransportInputSurrogate._valueDecimal,
          ),
          Id.of(this@TransportInputSurrogate.valueId, this@TransportInputSurrogate._valueId),
          Instant.of(
            FhirDateTime.fromString(this@TransportInputSurrogate.valueInstant),
            this@TransportInputSurrogate._valueInstant,
          ),
          Integer.of(
            this@TransportInputSurrogate.valueInteger,
            this@TransportInputSurrogate._valueInteger,
          ),
          Integer64.of(
            this@TransportInputSurrogate.valueInteger64,
            this@TransportInputSurrogate._valueInteger64,
          ),
          Markdown.of(
            this@TransportInputSurrogate.valueMarkdown,
            this@TransportInputSurrogate._valueMarkdown,
          ),
          Oid.of(this@TransportInputSurrogate.valueOid, this@TransportInputSurrogate._valueOid),
          PositiveInt.of(
            this@TransportInputSurrogate.valuePositiveInt,
            this@TransportInputSurrogate._valuePositiveInt,
          ),
          R5String.of(
            this@TransportInputSurrogate.valueString,
            this@TransportInputSurrogate._valueString,
          ),
          Time.of(this@TransportInputSurrogate.valueTime, this@TransportInputSurrogate._valueTime),
          UnsignedInt.of(
            this@TransportInputSurrogate.valueUnsignedInt,
            this@TransportInputSurrogate._valueUnsignedInt,
          ),
          Uri.of(this@TransportInputSurrogate.valueUri, this@TransportInputSurrogate._valueUri),
          Url.of(this@TransportInputSurrogate.valueUrl, this@TransportInputSurrogate._valueUrl),
          Uuid.of(this@TransportInputSurrogate.valueUuid, this@TransportInputSurrogate._valueUuid),
          this@TransportInputSurrogate.valueAddress,
          this@TransportInputSurrogate.valueAge,
          this@TransportInputSurrogate.valueAnnotation,
          this@TransportInputSurrogate.valueAttachment,
          this@TransportInputSurrogate.valueCodeableConcept,
          this@TransportInputSurrogate.valueCodeableReference,
          this@TransportInputSurrogate.valueCoding,
          this@TransportInputSurrogate.valueContactPoint,
          this@TransportInputSurrogate.valueCount,
          this@TransportInputSurrogate.valueDistance,
          this@TransportInputSurrogate.valueDuration,
          this@TransportInputSurrogate.valueHumanName,
          this@TransportInputSurrogate.valueIdentifier,
          this@TransportInputSurrogate.valueMoney,
          this@TransportInputSurrogate.valuePeriod,
          this@TransportInputSurrogate.valueQuantity,
          this@TransportInputSurrogate.valueRange,
          this@TransportInputSurrogate.valueRatio,
          this@TransportInputSurrogate.valueRatioRange,
          this@TransportInputSurrogate.valueReference,
          this@TransportInputSurrogate.valueSampledData,
          this@TransportInputSurrogate.valueSignature,
          this@TransportInputSurrogate.valueTiming,
          this@TransportInputSurrogate.valueContactDetail,
          this@TransportInputSurrogate.valueDataRequirement,
          this@TransportInputSurrogate.valueExpression,
          this@TransportInputSurrogate.valueParameterDefinition,
          this@TransportInputSurrogate.valueRelatedArtifact,
          this@TransportInputSurrogate.valueTriggerDefinition,
          this@TransportInputSurrogate.valueUsageContext,
          this@TransportInputSurrogate.valueAvailability,
          this@TransportInputSurrogate.valueExtendedContactDetail,
          this@TransportInputSurrogate.valueDosage,
          this@TransportInputSurrogate.valueMeta,
        )
    }

  public companion object {
    public fun fromModel(model: Transport.Input): TransportInputSurrogate =
      with(model) {
        TransportInputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueCanonical = this@with.`value`?.asCanonical()?.value?.value
          _valueCanonical = this@with.`value`?.asCanonical()?.value?.toElement()
          valueCode = this@with.`value`?.asCode()?.value?.value
          _valueCode = this@with.`value`?.asCode()?.value?.toElement()
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString()
          _valueDate = this@with.`value`?.asDate()?.value?.toElement()
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement()
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement()
          valueId = this@with.`value`?.asId()?.value?.value
          _valueId = this@with.`value`?.asId()?.value?.toElement()
          valueInstant = this@with.`value`?.asInstant()?.value?.value?.toString()
          _valueInstant = this@with.`value`?.asInstant()?.value?.toElement()
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueInteger64 = this@with.`value`?.asInteger64()?.value?.value
          _valueInteger64 = this@with.`value`?.asInteger64()?.value?.toElement()
          valueMarkdown = this@with.`value`?.asMarkdown()?.value?.value
          _valueMarkdown = this@with.`value`?.asMarkdown()?.value?.toElement()
          valueOid = this@with.`value`?.asOid()?.value?.value
          _valueOid = this@with.`value`?.asOid()?.value?.toElement()
          valuePositiveInt = this@with.`value`?.asPositiveInt()?.value?.value
          _valuePositiveInt = this@with.`value`?.asPositiveInt()?.value?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueTime = this@with.`value`?.asTime()?.value?.value
          _valueTime = this@with.`value`?.asTime()?.value?.toElement()
          valueUnsignedInt = this@with.`value`?.asUnsignedInt()?.value?.value
          _valueUnsignedInt = this@with.`value`?.asUnsignedInt()?.value?.toElement()
          valueUri = this@with.`value`?.asUri()?.value?.value
          _valueUri = this@with.`value`?.asUri()?.value?.toElement()
          valueUrl = this@with.`value`?.asUrl()?.value?.value
          _valueUrl = this@with.`value`?.asUrl()?.value?.toElement()
          valueUuid = this@with.`value`?.asUuid()?.value?.value
          _valueUuid = this@with.`value`?.asUuid()?.value?.toElement()
          valueAddress = this@with.`value`?.asAddress()?.value
          valueAge = this@with.`value`?.asAge()?.value
          valueAnnotation = this@with.`value`?.asAnnotation()?.value
          valueAttachment = this@with.`value`?.asAttachment()?.value
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueCodeableReference = this@with.`value`?.asCodeableReference()?.value
          valueCoding = this@with.`value`?.asCoding()?.value
          valueContactPoint = this@with.`value`?.asContactPoint()?.value
          valueCount = this@with.`value`?.asCount()?.value
          valueDistance = this@with.`value`?.asDistance()?.value
          valueDuration = this@with.`value`?.asDuration()?.value
          valueHumanName = this@with.`value`?.asHumanName()?.value
          valueIdentifier = this@with.`value`?.asIdentifier()?.value
          valueMoney = this@with.`value`?.asMoney()?.value
          valuePeriod = this@with.`value`?.asPeriod()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          valueRatio = this@with.`value`?.asRatio()?.value
          valueRatioRange = this@with.`value`?.asRatioRange()?.value
          valueReference = this@with.`value`?.asReference()?.value
          valueSampledData = this@with.`value`?.asSampledData()?.value
          valueSignature = this@with.`value`?.asSignature()?.value
          valueTiming = this@with.`value`?.asTiming()?.value
          valueContactDetail = this@with.`value`?.asContactDetail()?.value
          valueDataRequirement = this@with.`value`?.asDataRequirement()?.value
          valueExpression = this@with.`value`?.asExpression()?.value
          valueParameterDefinition = this@with.`value`?.asParameterDefinition()?.value
          valueRelatedArtifact = this@with.`value`?.asRelatedArtifact()?.value
          valueTriggerDefinition = this@with.`value`?.asTriggerDefinition()?.value
          valueUsageContext = this@with.`value`?.asUsageContext()?.value
          valueAvailability = this@with.`value`?.asAvailability()?.value
          valueExtendedContactDetail = this@with.`value`?.asExtendedContactDetail()?.value
          valueDosage = this@with.`value`?.asDosage()?.value
          valueMeta = this@with.`value`?.asMeta()?.value
        }
      }
  }
}

@Serializable
internal data class TransportOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
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
  public fun toModel(): Transport.Output =
    Transport.Output().apply {
      id = this@TransportOutputSurrogate.id
      extension = this@TransportOutputSurrogate.extension
      modifierExtension = this@TransportOutputSurrogate.modifierExtension
      type = this@TransportOutputSurrogate.type
      `value` =
        Transport.Output.Value?.from(
          Base64Binary.of(
            this@TransportOutputSurrogate.valueBase64Binary,
            this@TransportOutputSurrogate._valueBase64Binary,
          ),
          R5Boolean.of(
            this@TransportOutputSurrogate.valueBoolean,
            this@TransportOutputSurrogate._valueBoolean,
          ),
          Canonical.of(
            this@TransportOutputSurrogate.valueCanonical,
            this@TransportOutputSurrogate._valueCanonical,
          ),
          Code.of(
            this@TransportOutputSurrogate.valueCode,
            this@TransportOutputSurrogate._valueCode,
          ),
          Date.of(
            FhirDate.fromString(this@TransportOutputSurrogate.valueDate),
            this@TransportOutputSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@TransportOutputSurrogate.valueDateTime),
            this@TransportOutputSurrogate._valueDateTime,
          ),
          Decimal.of(
            this@TransportOutputSurrogate.valueDecimal,
            this@TransportOutputSurrogate._valueDecimal,
          ),
          Id.of(this@TransportOutputSurrogate.valueId, this@TransportOutputSurrogate._valueId),
          Instant.of(
            FhirDateTime.fromString(this@TransportOutputSurrogate.valueInstant),
            this@TransportOutputSurrogate._valueInstant,
          ),
          Integer.of(
            this@TransportOutputSurrogate.valueInteger,
            this@TransportOutputSurrogate._valueInteger,
          ),
          Integer64.of(
            this@TransportOutputSurrogate.valueInteger64,
            this@TransportOutputSurrogate._valueInteger64,
          ),
          Markdown.of(
            this@TransportOutputSurrogate.valueMarkdown,
            this@TransportOutputSurrogate._valueMarkdown,
          ),
          Oid.of(this@TransportOutputSurrogate.valueOid, this@TransportOutputSurrogate._valueOid),
          PositiveInt.of(
            this@TransportOutputSurrogate.valuePositiveInt,
            this@TransportOutputSurrogate._valuePositiveInt,
          ),
          R5String.of(
            this@TransportOutputSurrogate.valueString,
            this@TransportOutputSurrogate._valueString,
          ),
          Time.of(
            this@TransportOutputSurrogate.valueTime,
            this@TransportOutputSurrogate._valueTime,
          ),
          UnsignedInt.of(
            this@TransportOutputSurrogate.valueUnsignedInt,
            this@TransportOutputSurrogate._valueUnsignedInt,
          ),
          Uri.of(this@TransportOutputSurrogate.valueUri, this@TransportOutputSurrogate._valueUri),
          Url.of(this@TransportOutputSurrogate.valueUrl, this@TransportOutputSurrogate._valueUrl),
          Uuid.of(
            this@TransportOutputSurrogate.valueUuid,
            this@TransportOutputSurrogate._valueUuid,
          ),
          this@TransportOutputSurrogate.valueAddress,
          this@TransportOutputSurrogate.valueAge,
          this@TransportOutputSurrogate.valueAnnotation,
          this@TransportOutputSurrogate.valueAttachment,
          this@TransportOutputSurrogate.valueCodeableConcept,
          this@TransportOutputSurrogate.valueCodeableReference,
          this@TransportOutputSurrogate.valueCoding,
          this@TransportOutputSurrogate.valueContactPoint,
          this@TransportOutputSurrogate.valueCount,
          this@TransportOutputSurrogate.valueDistance,
          this@TransportOutputSurrogate.valueDuration,
          this@TransportOutputSurrogate.valueHumanName,
          this@TransportOutputSurrogate.valueIdentifier,
          this@TransportOutputSurrogate.valueMoney,
          this@TransportOutputSurrogate.valuePeriod,
          this@TransportOutputSurrogate.valueQuantity,
          this@TransportOutputSurrogate.valueRange,
          this@TransportOutputSurrogate.valueRatio,
          this@TransportOutputSurrogate.valueRatioRange,
          this@TransportOutputSurrogate.valueReference,
          this@TransportOutputSurrogate.valueSampledData,
          this@TransportOutputSurrogate.valueSignature,
          this@TransportOutputSurrogate.valueTiming,
          this@TransportOutputSurrogate.valueContactDetail,
          this@TransportOutputSurrogate.valueDataRequirement,
          this@TransportOutputSurrogate.valueExpression,
          this@TransportOutputSurrogate.valueParameterDefinition,
          this@TransportOutputSurrogate.valueRelatedArtifact,
          this@TransportOutputSurrogate.valueTriggerDefinition,
          this@TransportOutputSurrogate.valueUsageContext,
          this@TransportOutputSurrogate.valueAvailability,
          this@TransportOutputSurrogate.valueExtendedContactDetail,
          this@TransportOutputSurrogate.valueDosage,
          this@TransportOutputSurrogate.valueMeta,
        )
    }

  public companion object {
    public fun fromModel(model: Transport.Output): TransportOutputSurrogate =
      with(model) {
        TransportOutputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.value
          _valueBase64Binary = this@with.`value`?.asBase64Binary()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueCanonical = this@with.`value`?.asCanonical()?.value?.value
          _valueCanonical = this@with.`value`?.asCanonical()?.value?.toElement()
          valueCode = this@with.`value`?.asCode()?.value?.value
          _valueCode = this@with.`value`?.asCode()?.value?.toElement()
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString()
          _valueDate = this@with.`value`?.asDate()?.value?.toElement()
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement()
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement()
          valueId = this@with.`value`?.asId()?.value?.value
          _valueId = this@with.`value`?.asId()?.value?.toElement()
          valueInstant = this@with.`value`?.asInstant()?.value?.value?.toString()
          _valueInstant = this@with.`value`?.asInstant()?.value?.toElement()
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueInteger64 = this@with.`value`?.asInteger64()?.value?.value
          _valueInteger64 = this@with.`value`?.asInteger64()?.value?.toElement()
          valueMarkdown = this@with.`value`?.asMarkdown()?.value?.value
          _valueMarkdown = this@with.`value`?.asMarkdown()?.value?.toElement()
          valueOid = this@with.`value`?.asOid()?.value?.value
          _valueOid = this@with.`value`?.asOid()?.value?.toElement()
          valuePositiveInt = this@with.`value`?.asPositiveInt()?.value?.value
          _valuePositiveInt = this@with.`value`?.asPositiveInt()?.value?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueTime = this@with.`value`?.asTime()?.value?.value
          _valueTime = this@with.`value`?.asTime()?.value?.toElement()
          valueUnsignedInt = this@with.`value`?.asUnsignedInt()?.value?.value
          _valueUnsignedInt = this@with.`value`?.asUnsignedInt()?.value?.toElement()
          valueUri = this@with.`value`?.asUri()?.value?.value
          _valueUri = this@with.`value`?.asUri()?.value?.toElement()
          valueUrl = this@with.`value`?.asUrl()?.value?.value
          _valueUrl = this@with.`value`?.asUrl()?.value?.toElement()
          valueUuid = this@with.`value`?.asUuid()?.value?.value
          _valueUuid = this@with.`value`?.asUuid()?.value?.toElement()
          valueAddress = this@with.`value`?.asAddress()?.value
          valueAge = this@with.`value`?.asAge()?.value
          valueAnnotation = this@with.`value`?.asAnnotation()?.value
          valueAttachment = this@with.`value`?.asAttachment()?.value
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueCodeableReference = this@with.`value`?.asCodeableReference()?.value
          valueCoding = this@with.`value`?.asCoding()?.value
          valueContactPoint = this@with.`value`?.asContactPoint()?.value
          valueCount = this@with.`value`?.asCount()?.value
          valueDistance = this@with.`value`?.asDistance()?.value
          valueDuration = this@with.`value`?.asDuration()?.value
          valueHumanName = this@with.`value`?.asHumanName()?.value
          valueIdentifier = this@with.`value`?.asIdentifier()?.value
          valueMoney = this@with.`value`?.asMoney()?.value
          valuePeriod = this@with.`value`?.asPeriod()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          valueRatio = this@with.`value`?.asRatio()?.value
          valueRatioRange = this@with.`value`?.asRatioRange()?.value
          valueReference = this@with.`value`?.asReference()?.value
          valueSampledData = this@with.`value`?.asSampledData()?.value
          valueSignature = this@with.`value`?.asSignature()?.value
          valueTiming = this@with.`value`?.asTiming()?.value
          valueContactDetail = this@with.`value`?.asContactDetail()?.value
          valueDataRequirement = this@with.`value`?.asDataRequirement()?.value
          valueExpression = this@with.`value`?.asExpression()?.value
          valueParameterDefinition = this@with.`value`?.asParameterDefinition()?.value
          valueRelatedArtifact = this@with.`value`?.asRelatedArtifact()?.value
          valueTriggerDefinition = this@with.`value`?.asTriggerDefinition()?.value
          valueUsageContext = this@with.`value`?.asUsageContext()?.value
          valueAvailability = this@with.`value`?.asAvailability()?.value
          valueExtendedContactDetail = this@with.`value`?.asExtendedContactDetail()?.value
          valueDosage = this@with.`value`?.asDosage()?.value
          valueMeta = this@with.`value`?.asMeta()?.value
        }
      }
  }
}

@Serializable
internal data class TransportSurrogate(
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
  public var identifier: List<Identifier?>? = null,
  public var instantiatesCanonical: KotlinString? = null,
  public var _instantiatesCanonical: Element? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var basedOn: List<Reference?>? = null,
  public var groupIdentifier: Identifier? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var focus: Reference? = null,
  public var `for`: Reference? = null,
  public var encounter: Reference? = null,
  public var completionTime: KotlinString? = null,
  public var _completionTime: Element? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var lastModified: KotlinString? = null,
  public var _lastModified: Element? = null,
  public var requester: Reference? = null,
  public var performerType: List<CodeableConcept?>? = null,
  public var owner: Reference? = null,
  public var location: Reference? = null,
  public var insurance: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var relevantHistory: List<Reference?>? = null,
  public var restriction: Transport.Restriction? = null,
  public var input: List<Transport.Input>? = null,
  public var output: List<Transport.Output>? = null,
  public var requestedLocation: Reference? = null,
  public var currentLocation: Reference? = null,
  public var reason: CodeableReference? = null,
  public var history: Reference? = null,
) {
  public fun toModel(): Transport =
    Transport().apply {
      id = this@TransportSurrogate.id
      meta = this@TransportSurrogate.meta
      implicitRules =
        Uri.of(this@TransportSurrogate.implicitRules, this@TransportSurrogate._implicitRules)
      language = Code.of(this@TransportSurrogate.language, this@TransportSurrogate._language)
      text = this@TransportSurrogate.text
      contained = this@TransportSurrogate.contained
      extension = this@TransportSurrogate.extension
      modifierExtension = this@TransportSurrogate.modifierExtension
      identifier = this@TransportSurrogate.identifier
      instantiatesCanonical =
        Canonical.of(
          this@TransportSurrogate.instantiatesCanonical,
          this@TransportSurrogate._instantiatesCanonical,
        )
      instantiatesUri =
        Uri.of(this@TransportSurrogate.instantiatesUri, this@TransportSurrogate._instantiatesUri)
      basedOn = this@TransportSurrogate.basedOn
      groupIdentifier = this@TransportSurrogate.groupIdentifier
      partOf = this@TransportSurrogate.partOf
      status =
        Enumeration.of(
          this@TransportSurrogate.status?.let {
            com.google.fhir.model.r5.Transport.TransportStatus.fromCode(it)
          },
          this@TransportSurrogate._status,
        )
      statusReason = this@TransportSurrogate.statusReason
      intent =
        Enumeration.of(
          this@TransportSurrogate.intent?.let {
            com.google.fhir.model.r5.Transport.TransportIntent.fromCode(it)
          },
          this@TransportSurrogate._intent,
        )
      priority =
        Enumeration.of(
          this@TransportSurrogate.priority?.let {
            com.google.fhir.model.r5.Transport.TransportPriority.fromCode(it)
          },
          this@TransportSurrogate._priority,
        )
      code = this@TransportSurrogate.code
      description =
        R5String.of(this@TransportSurrogate.description, this@TransportSurrogate._description)
      focus = this@TransportSurrogate.focus
      `for` = this@TransportSurrogate.`for`
      encounter = this@TransportSurrogate.encounter
      completionTime =
        DateTime.of(
          FhirDateTime.fromString(this@TransportSurrogate.completionTime),
          this@TransportSurrogate._completionTime,
        )
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@TransportSurrogate.authoredOn),
          this@TransportSurrogate._authoredOn,
        )
      lastModified =
        DateTime.of(
          FhirDateTime.fromString(this@TransportSurrogate.lastModified),
          this@TransportSurrogate._lastModified,
        )
      requester = this@TransportSurrogate.requester
      performerType = this@TransportSurrogate.performerType
      owner = this@TransportSurrogate.owner
      location = this@TransportSurrogate.location
      insurance = this@TransportSurrogate.insurance
      note = this@TransportSurrogate.note
      relevantHistory = this@TransportSurrogate.relevantHistory
      restriction = this@TransportSurrogate.restriction
      input = this@TransportSurrogate.input
      output = this@TransportSurrogate.output
      requestedLocation = this@TransportSurrogate.requestedLocation
      currentLocation = this@TransportSurrogate.currentLocation
      reason = this@TransportSurrogate.reason
      history = this@TransportSurrogate.history
    }

  public companion object {
    public fun fromModel(model: Transport): TransportSurrogate =
      with(model) {
        TransportSurrogate().apply {
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
          identifier = this@with.identifier
          instantiatesCanonical = this@with.instantiatesCanonical?.value
          _instantiatesCanonical = this@with.instantiatesCanonical?.toElement()
          instantiatesUri = this@with.instantiatesUri?.value
          _instantiatesUri = this@with.instantiatesUri?.toElement()
          basedOn = this@with.basedOn
          groupIdentifier = this@with.groupIdentifier
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          focus = this@with.focus
          `for` = this@with.`for`
          encounter = this@with.encounter
          completionTime = this@with.completionTime?.value?.toString()
          _completionTime = this@with.completionTime?.toElement()
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          lastModified = this@with.lastModified?.value?.toString()
          _lastModified = this@with.lastModified?.toElement()
          requester = this@with.requester
          performerType = this@with.performerType
          owner = this@with.owner
          location = this@with.location
          insurance = this@with.insurance
          note = this@with.note
          relevantHistory = this@with.relevantHistory
          restriction = this@with.restriction
          input = this@with.input
          output = this@with.output
          requestedLocation = this@with.requestedLocation
          currentLocation = this@with.currentLocation
          reason = this@with.reason
          history = this@with.history
        }
      }
  }
}
