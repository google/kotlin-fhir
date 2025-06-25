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

import com.google.fhir.model.r4.Address
import com.google.fhir.model.r4.Age
import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Base64Binary
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.ContactPoint
import com.google.fhir.model.r4.Contributor
import com.google.fhir.model.r4.Count
import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Distance
import com.google.fhir.model.r4.Dosage
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Expression
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.HumanName
import com.google.fhir.model.r4.Id
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Money
import com.google.fhir.model.r4.Oid
import com.google.fhir.model.r4.ParameterDefinition
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
import com.google.fhir.model.r4.SampledData
import com.google.fhir.model.r4.Signature
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Time
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.TriggerDefinition
import com.google.fhir.model.r4.UnsignedInt
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.Url
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.Uuid
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
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
internal data class ExtensionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var url: KotlinString? = null,
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
  public fun toModel(): Extension =
    Extension().apply {
      id = this@ExtensionSurrogate.id
      extension = this@ExtensionSurrogate.extension
      url = this@ExtensionSurrogate.url
      `value` =
        Extension.Value?.from(
          Base64Binary.of(
            this@ExtensionSurrogate.valueBase64Binary,
            this@ExtensionSurrogate._valueBase64Binary,
          ),
          R4Boolean.of(this@ExtensionSurrogate.valueBoolean, this@ExtensionSurrogate._valueBoolean),
          Canonical.of(
            this@ExtensionSurrogate.valueCanonical,
            this@ExtensionSurrogate._valueCanonical,
          ),
          Code.of(this@ExtensionSurrogate.valueCode, this@ExtensionSurrogate._valueCode),
          Date.of(
            FhirDate.fromString(this@ExtensionSurrogate.valueDate),
            this@ExtensionSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ExtensionSurrogate.valueDateTime),
            this@ExtensionSurrogate._valueDateTime,
          ),
          Decimal.of(this@ExtensionSurrogate.valueDecimal, this@ExtensionSurrogate._valueDecimal),
          Id.of(this@ExtensionSurrogate.valueId, this@ExtensionSurrogate._valueId),
          Instant.of(
            FhirDateTime.fromString(this@ExtensionSurrogate.valueInstant),
            this@ExtensionSurrogate._valueInstant,
          ),
          Integer.of(this@ExtensionSurrogate.valueInteger, this@ExtensionSurrogate._valueInteger),
          Markdown.of(
            this@ExtensionSurrogate.valueMarkdown,
            this@ExtensionSurrogate._valueMarkdown,
          ),
          Oid.of(this@ExtensionSurrogate.valueOid, this@ExtensionSurrogate._valueOid),
          PositiveInt.of(
            this@ExtensionSurrogate.valuePositiveInt,
            this@ExtensionSurrogate._valuePositiveInt,
          ),
          R4String.of(this@ExtensionSurrogate.valueString, this@ExtensionSurrogate._valueString),
          Time.of(this@ExtensionSurrogate.valueTime, this@ExtensionSurrogate._valueTime),
          UnsignedInt.of(
            this@ExtensionSurrogate.valueUnsignedInt,
            this@ExtensionSurrogate._valueUnsignedInt,
          ),
          Uri.of(this@ExtensionSurrogate.valueUri, this@ExtensionSurrogate._valueUri),
          Url.of(this@ExtensionSurrogate.valueUrl, this@ExtensionSurrogate._valueUrl),
          Uuid.of(this@ExtensionSurrogate.valueUuid, this@ExtensionSurrogate._valueUuid),
          this@ExtensionSurrogate.valueAddress,
          this@ExtensionSurrogate.valueAge,
          this@ExtensionSurrogate.valueAnnotation,
          this@ExtensionSurrogate.valueAttachment,
          this@ExtensionSurrogate.valueCodeableConcept,
          this@ExtensionSurrogate.valueCoding,
          this@ExtensionSurrogate.valueContactPoint,
          this@ExtensionSurrogate.valueCount,
          this@ExtensionSurrogate.valueDistance,
          this@ExtensionSurrogate.valueDuration,
          this@ExtensionSurrogate.valueHumanName,
          this@ExtensionSurrogate.valueIdentifier,
          this@ExtensionSurrogate.valueMoney,
          this@ExtensionSurrogate.valuePeriod,
          this@ExtensionSurrogate.valueQuantity,
          this@ExtensionSurrogate.valueRange,
          this@ExtensionSurrogate.valueRatio,
          this@ExtensionSurrogate.valueReference,
          this@ExtensionSurrogate.valueSampledData,
          this@ExtensionSurrogate.valueSignature,
          this@ExtensionSurrogate.valueTiming,
          this@ExtensionSurrogate.valueContactDetail,
          this@ExtensionSurrogate.valueContributor,
          this@ExtensionSurrogate.valueDataRequirement,
          this@ExtensionSurrogate.valueExpression,
          this@ExtensionSurrogate.valueParameterDefinition,
          this@ExtensionSurrogate.valueRelatedArtifact,
          this@ExtensionSurrogate.valueTriggerDefinition,
          this@ExtensionSurrogate.valueUsageContext,
          this@ExtensionSurrogate.valueDosage,
          this@ExtensionSurrogate.valueMeta,
        )
    }

  public companion object {
    public fun fromModel(model: Extension): ExtensionSurrogate =
      with(model) {
        ExtensionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          url = this@with.url
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
          valueReference = this@with.`value`?.asReference()?.value
          valueSampledData = this@with.`value`?.asSampledData()?.value
          valueSignature = this@with.`value`?.asSignature()?.value
          valueTiming = this@with.`value`?.asTiming()?.value
          valueContactDetail = this@with.`value`?.asContactDetail()?.value
          valueContributor = this@with.`value`?.asContributor()?.value
          valueDataRequirement = this@with.`value`?.asDataRequirement()?.value
          valueExpression = this@with.`value`?.asExpression()?.value
          valueParameterDefinition = this@with.`value`?.asParameterDefinition()?.value
          valueRelatedArtifact = this@with.`value`?.asRelatedArtifact()?.value
          valueTriggerDefinition = this@with.`value`?.asTriggerDefinition()?.value
          valueUsageContext = this@with.`value`?.asUsageContext()?.value
          valueDosage = this@with.`value`?.asDosage()?.value
          valueMeta = this@with.`value`?.asMeta()?.value
        }
      }
  }
}
