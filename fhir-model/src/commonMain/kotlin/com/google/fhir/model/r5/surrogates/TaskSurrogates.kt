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
import com.google.fhir.model.r5.Task
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
import kotlin.collections.List
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TaskPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): Task.Performer =
    Task.Performer().apply {
      id = this@TaskPerformerSurrogate.id
      extension = this@TaskPerformerSurrogate.extension
      modifierExtension = this@TaskPerformerSurrogate.modifierExtension
      function = this@TaskPerformerSurrogate.function
      actor = this@TaskPerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(model: Task.Performer): TaskPerformerSurrogate =
      with(model) {
        TaskPerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class TaskRestrictionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var repetitions: Int? = null,
  public var _repetitions: Element? = null,
  public var period: Period? = null,
  public var recipient: List<Reference?>? = null,
) {
  public fun toModel(): Task.Restriction =
    Task.Restriction().apply {
      id = this@TaskRestrictionSurrogate.id
      extension = this@TaskRestrictionSurrogate.extension
      modifierExtension = this@TaskRestrictionSurrogate.modifierExtension
      repetitions =
        PositiveInt.of(
          this@TaskRestrictionSurrogate.repetitions,
          this@TaskRestrictionSurrogate._repetitions,
        )
      period = this@TaskRestrictionSurrogate.period
      recipient = this@TaskRestrictionSurrogate.recipient
    }

  public companion object {
    public fun fromModel(model: Task.Restriction): TaskRestrictionSurrogate =
      with(model) {
        TaskRestrictionSurrogate().apply {
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
internal data class TaskInputSurrogate(
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
  public fun toModel(): Task.Input =
    Task.Input().apply {
      id = this@TaskInputSurrogate.id
      extension = this@TaskInputSurrogate.extension
      modifierExtension = this@TaskInputSurrogate.modifierExtension
      type = this@TaskInputSurrogate.type
      `value` =
        Task.Input.Value?.from(
          Base64Binary.of(
            this@TaskInputSurrogate.valueBase64Binary,
            this@TaskInputSurrogate._valueBase64Binary,
          ),
          R5Boolean.of(this@TaskInputSurrogate.valueBoolean, this@TaskInputSurrogate._valueBoolean),
          Canonical.of(
            this@TaskInputSurrogate.valueCanonical,
            this@TaskInputSurrogate._valueCanonical,
          ),
          Code.of(this@TaskInputSurrogate.valueCode, this@TaskInputSurrogate._valueCode),
          Date.of(
            FhirDate.fromString(this@TaskInputSurrogate.valueDate),
            this@TaskInputSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@TaskInputSurrogate.valueDateTime),
            this@TaskInputSurrogate._valueDateTime,
          ),
          Decimal.of(this@TaskInputSurrogate.valueDecimal, this@TaskInputSurrogate._valueDecimal),
          Id.of(this@TaskInputSurrogate.valueId, this@TaskInputSurrogate._valueId),
          Instant.of(
            FhirDateTime.fromString(this@TaskInputSurrogate.valueInstant),
            this@TaskInputSurrogate._valueInstant,
          ),
          Integer.of(this@TaskInputSurrogate.valueInteger, this@TaskInputSurrogate._valueInteger),
          Integer64.of(
            this@TaskInputSurrogate.valueInteger64,
            this@TaskInputSurrogate._valueInteger64,
          ),
          Markdown.of(
            this@TaskInputSurrogate.valueMarkdown,
            this@TaskInputSurrogate._valueMarkdown,
          ),
          Oid.of(this@TaskInputSurrogate.valueOid, this@TaskInputSurrogate._valueOid),
          PositiveInt.of(
            this@TaskInputSurrogate.valuePositiveInt,
            this@TaskInputSurrogate._valuePositiveInt,
          ),
          R5String.of(this@TaskInputSurrogate.valueString, this@TaskInputSurrogate._valueString),
          Time.of(this@TaskInputSurrogate.valueTime, this@TaskInputSurrogate._valueTime),
          UnsignedInt.of(
            this@TaskInputSurrogate.valueUnsignedInt,
            this@TaskInputSurrogate._valueUnsignedInt,
          ),
          Uri.of(this@TaskInputSurrogate.valueUri, this@TaskInputSurrogate._valueUri),
          Url.of(this@TaskInputSurrogate.valueUrl, this@TaskInputSurrogate._valueUrl),
          Uuid.of(this@TaskInputSurrogate.valueUuid, this@TaskInputSurrogate._valueUuid),
          this@TaskInputSurrogate.valueAddress,
          this@TaskInputSurrogate.valueAge,
          this@TaskInputSurrogate.valueAnnotation,
          this@TaskInputSurrogate.valueAttachment,
          this@TaskInputSurrogate.valueCodeableConcept,
          this@TaskInputSurrogate.valueCodeableReference,
          this@TaskInputSurrogate.valueCoding,
          this@TaskInputSurrogate.valueContactPoint,
          this@TaskInputSurrogate.valueCount,
          this@TaskInputSurrogate.valueDistance,
          this@TaskInputSurrogate.valueDuration,
          this@TaskInputSurrogate.valueHumanName,
          this@TaskInputSurrogate.valueIdentifier,
          this@TaskInputSurrogate.valueMoney,
          this@TaskInputSurrogate.valuePeriod,
          this@TaskInputSurrogate.valueQuantity,
          this@TaskInputSurrogate.valueRange,
          this@TaskInputSurrogate.valueRatio,
          this@TaskInputSurrogate.valueRatioRange,
          this@TaskInputSurrogate.valueReference,
          this@TaskInputSurrogate.valueSampledData,
          this@TaskInputSurrogate.valueSignature,
          this@TaskInputSurrogate.valueTiming,
          this@TaskInputSurrogate.valueContactDetail,
          this@TaskInputSurrogate.valueDataRequirement,
          this@TaskInputSurrogate.valueExpression,
          this@TaskInputSurrogate.valueParameterDefinition,
          this@TaskInputSurrogate.valueRelatedArtifact,
          this@TaskInputSurrogate.valueTriggerDefinition,
          this@TaskInputSurrogate.valueUsageContext,
          this@TaskInputSurrogate.valueAvailability,
          this@TaskInputSurrogate.valueExtendedContactDetail,
          this@TaskInputSurrogate.valueDosage,
          this@TaskInputSurrogate.valueMeta,
        )
    }

  public companion object {
    public fun fromModel(model: Task.Input): TaskInputSurrogate =
      with(model) {
        TaskInputSurrogate().apply {
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
internal data class TaskOutputSurrogate(
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
  public fun toModel(): Task.Output =
    Task.Output().apply {
      id = this@TaskOutputSurrogate.id
      extension = this@TaskOutputSurrogate.extension
      modifierExtension = this@TaskOutputSurrogate.modifierExtension
      type = this@TaskOutputSurrogate.type
      `value` =
        Task.Output.Value?.from(
          Base64Binary.of(
            this@TaskOutputSurrogate.valueBase64Binary,
            this@TaskOutputSurrogate._valueBase64Binary,
          ),
          R5Boolean.of(
            this@TaskOutputSurrogate.valueBoolean,
            this@TaskOutputSurrogate._valueBoolean,
          ),
          Canonical.of(
            this@TaskOutputSurrogate.valueCanonical,
            this@TaskOutputSurrogate._valueCanonical,
          ),
          Code.of(this@TaskOutputSurrogate.valueCode, this@TaskOutputSurrogate._valueCode),
          Date.of(
            FhirDate.fromString(this@TaskOutputSurrogate.valueDate),
            this@TaskOutputSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@TaskOutputSurrogate.valueDateTime),
            this@TaskOutputSurrogate._valueDateTime,
          ),
          Decimal.of(this@TaskOutputSurrogate.valueDecimal, this@TaskOutputSurrogate._valueDecimal),
          Id.of(this@TaskOutputSurrogate.valueId, this@TaskOutputSurrogate._valueId),
          Instant.of(
            FhirDateTime.fromString(this@TaskOutputSurrogate.valueInstant),
            this@TaskOutputSurrogate._valueInstant,
          ),
          Integer.of(this@TaskOutputSurrogate.valueInteger, this@TaskOutputSurrogate._valueInteger),
          Integer64.of(
            this@TaskOutputSurrogate.valueInteger64,
            this@TaskOutputSurrogate._valueInteger64,
          ),
          Markdown.of(
            this@TaskOutputSurrogate.valueMarkdown,
            this@TaskOutputSurrogate._valueMarkdown,
          ),
          Oid.of(this@TaskOutputSurrogate.valueOid, this@TaskOutputSurrogate._valueOid),
          PositiveInt.of(
            this@TaskOutputSurrogate.valuePositiveInt,
            this@TaskOutputSurrogate._valuePositiveInt,
          ),
          R5String.of(this@TaskOutputSurrogate.valueString, this@TaskOutputSurrogate._valueString),
          Time.of(this@TaskOutputSurrogate.valueTime, this@TaskOutputSurrogate._valueTime),
          UnsignedInt.of(
            this@TaskOutputSurrogate.valueUnsignedInt,
            this@TaskOutputSurrogate._valueUnsignedInt,
          ),
          Uri.of(this@TaskOutputSurrogate.valueUri, this@TaskOutputSurrogate._valueUri),
          Url.of(this@TaskOutputSurrogate.valueUrl, this@TaskOutputSurrogate._valueUrl),
          Uuid.of(this@TaskOutputSurrogate.valueUuid, this@TaskOutputSurrogate._valueUuid),
          this@TaskOutputSurrogate.valueAddress,
          this@TaskOutputSurrogate.valueAge,
          this@TaskOutputSurrogate.valueAnnotation,
          this@TaskOutputSurrogate.valueAttachment,
          this@TaskOutputSurrogate.valueCodeableConcept,
          this@TaskOutputSurrogate.valueCodeableReference,
          this@TaskOutputSurrogate.valueCoding,
          this@TaskOutputSurrogate.valueContactPoint,
          this@TaskOutputSurrogate.valueCount,
          this@TaskOutputSurrogate.valueDistance,
          this@TaskOutputSurrogate.valueDuration,
          this@TaskOutputSurrogate.valueHumanName,
          this@TaskOutputSurrogate.valueIdentifier,
          this@TaskOutputSurrogate.valueMoney,
          this@TaskOutputSurrogate.valuePeriod,
          this@TaskOutputSurrogate.valueQuantity,
          this@TaskOutputSurrogate.valueRange,
          this@TaskOutputSurrogate.valueRatio,
          this@TaskOutputSurrogate.valueRatioRange,
          this@TaskOutputSurrogate.valueReference,
          this@TaskOutputSurrogate.valueSampledData,
          this@TaskOutputSurrogate.valueSignature,
          this@TaskOutputSurrogate.valueTiming,
          this@TaskOutputSurrogate.valueContactDetail,
          this@TaskOutputSurrogate.valueDataRequirement,
          this@TaskOutputSurrogate.valueExpression,
          this@TaskOutputSurrogate.valueParameterDefinition,
          this@TaskOutputSurrogate.valueRelatedArtifact,
          this@TaskOutputSurrogate.valueTriggerDefinition,
          this@TaskOutputSurrogate.valueUsageContext,
          this@TaskOutputSurrogate.valueAvailability,
          this@TaskOutputSurrogate.valueExtendedContactDetail,
          this@TaskOutputSurrogate.valueDosage,
          this@TaskOutputSurrogate.valueMeta,
        )
    }

  public companion object {
    public fun fromModel(model: Task.Output): TaskOutputSurrogate =
      with(model) {
        TaskOutputSurrogate().apply {
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
internal data class TaskSurrogate(
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
  public var statusReason: CodeableReference? = null,
  public var businessStatus: CodeableConcept? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var focus: Reference? = null,
  public var `for`: Reference? = null,
  public var encounter: Reference? = null,
  public var requestedPeriod: Period? = null,
  public var executionPeriod: Period? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var lastModified: KotlinString? = null,
  public var _lastModified: Element? = null,
  public var requester: Reference? = null,
  public var requestedPerformer: List<CodeableReference?>? = null,
  public var owner: Reference? = null,
  public var performer: List<Task.Performer>? = null,
  public var location: Reference? = null,
  public var reason: List<CodeableReference?>? = null,
  public var insurance: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var relevantHistory: List<Reference?>? = null,
  public var restriction: Task.Restriction? = null,
  public var input: List<Task.Input>? = null,
  public var output: List<Task.Output>? = null,
) {
  public fun toModel(): Task =
    Task().apply {
      id = this@TaskSurrogate.id
      meta = this@TaskSurrogate.meta
      implicitRules = Uri.of(this@TaskSurrogate.implicitRules, this@TaskSurrogate._implicitRules)
      language = Code.of(this@TaskSurrogate.language, this@TaskSurrogate._language)
      text = this@TaskSurrogate.text
      contained = this@TaskSurrogate.contained
      extension = this@TaskSurrogate.extension
      modifierExtension = this@TaskSurrogate.modifierExtension
      identifier = this@TaskSurrogate.identifier
      instantiatesCanonical =
        Canonical.of(
          this@TaskSurrogate.instantiatesCanonical,
          this@TaskSurrogate._instantiatesCanonical,
        )
      instantiatesUri =
        Uri.of(this@TaskSurrogate.instantiatesUri, this@TaskSurrogate._instantiatesUri)
      basedOn = this@TaskSurrogate.basedOn
      groupIdentifier = this@TaskSurrogate.groupIdentifier
      partOf = this@TaskSurrogate.partOf
      status =
        Enumeration.of(
          this@TaskSurrogate.status?.let { com.google.fhir.model.r5.Task.TaskStatus.fromCode(it) },
          this@TaskSurrogate._status,
        )
      statusReason = this@TaskSurrogate.statusReason
      businessStatus = this@TaskSurrogate.businessStatus
      intent =
        Enumeration.of(
          this@TaskSurrogate.intent?.let { com.google.fhir.model.r5.Task.TaskIntent.fromCode(it) },
          this@TaskSurrogate._intent,
        )
      priority =
        Enumeration.of(
          this@TaskSurrogate.priority?.let {
            com.google.fhir.model.r5.Task.TaskPriority.fromCode(it)
          },
          this@TaskSurrogate._priority,
        )
      doNotPerform = R5Boolean.of(this@TaskSurrogate.doNotPerform, this@TaskSurrogate._doNotPerform)
      code = this@TaskSurrogate.code
      description = R5String.of(this@TaskSurrogate.description, this@TaskSurrogate._description)
      focus = this@TaskSurrogate.focus
      `for` = this@TaskSurrogate.`for`
      encounter = this@TaskSurrogate.encounter
      requestedPeriod = this@TaskSurrogate.requestedPeriod
      executionPeriod = this@TaskSurrogate.executionPeriod
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@TaskSurrogate.authoredOn),
          this@TaskSurrogate._authoredOn,
        )
      lastModified =
        DateTime.of(
          FhirDateTime.fromString(this@TaskSurrogate.lastModified),
          this@TaskSurrogate._lastModified,
        )
      requester = this@TaskSurrogate.requester
      requestedPerformer = this@TaskSurrogate.requestedPerformer
      owner = this@TaskSurrogate.owner
      performer = this@TaskSurrogate.performer
      location = this@TaskSurrogate.location
      reason = this@TaskSurrogate.reason
      insurance = this@TaskSurrogate.insurance
      note = this@TaskSurrogate.note
      relevantHistory = this@TaskSurrogate.relevantHistory
      restriction = this@TaskSurrogate.restriction
      input = this@TaskSurrogate.input
      output = this@TaskSurrogate.output
    }

  public companion object {
    public fun fromModel(model: Task): TaskSurrogate =
      with(model) {
        TaskSurrogate().apply {
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
          businessStatus = this@with.businessStatus
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          doNotPerform = this@with.doNotPerform?.value
          _doNotPerform = this@with.doNotPerform?.toElement()
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          focus = this@with.focus
          `for` = this@with.`for`
          encounter = this@with.encounter
          requestedPeriod = this@with.requestedPeriod
          executionPeriod = this@with.executionPeriod
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          lastModified = this@with.lastModified?.value?.toString()
          _lastModified = this@with.lastModified?.toElement()
          requester = this@with.requester
          requestedPerformer = this@with.requestedPerformer
          owner = this@with.owner
          performer = this@with.performer
          location = this@with.location
          reason = this@with.reason
          insurance = this@with.insurance
          note = this@with.note
          relevantHistory = this@with.relevantHistory
          restriction = this@with.restriction
          input = this@with.input
          output = this@with.output
        }
      }
  }
}
