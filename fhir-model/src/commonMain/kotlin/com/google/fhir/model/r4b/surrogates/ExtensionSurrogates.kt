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
import com.google.fhir.model.r4b.CodeableReference
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
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.Oid
import com.google.fhir.model.r4b.ParameterDefinition
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.RatioRange
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
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
  public var valueContributor: Contributor? = null,
  public var valueDataRequirement: DataRequirement? = null,
  public var valueExpression: Expression? = null,
  public var valueParameterDefinition: ParameterDefinition? = null,
  public var valueRelatedArtifact: RelatedArtifact? = null,
  public var valueTriggerDefinition: TriggerDefinition? = null,
  public var valueUsageContext: UsageContext? = null,
  public var valueDosage: Dosage? = null,
) {
  public fun toModel(): Extension.Value? =
    Extension.Value?.from(
      Base64Binary.of(
        this@ExtensionValueSurrogate.valueBase64Binary,
        this@ExtensionValueSurrogate._valueBase64Binary,
      ),
      R4bBoolean.of(
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
      Markdown.of(
        this@ExtensionValueSurrogate.valueMarkdown,
        this@ExtensionValueSurrogate._valueMarkdown,
      ),
      Oid.of(this@ExtensionValueSurrogate.valueOid, this@ExtensionValueSurrogate._valueOid),
      PositiveInt.of(
        this@ExtensionValueSurrogate.valuePositiveInt,
        this@ExtensionValueSurrogate._valuePositiveInt,
      ),
      R4bString.of(
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
      this@ExtensionValueSurrogate.valueContributor,
      this@ExtensionValueSurrogate.valueDataRequirement,
      this@ExtensionValueSurrogate.valueExpression,
      this@ExtensionValueSurrogate.valueParameterDefinition,
      this@ExtensionValueSurrogate.valueRelatedArtifact,
      this@ExtensionValueSurrogate.valueTriggerDefinition,
      this@ExtensionValueSurrogate.valueUsageContext,
      this@ExtensionValueSurrogate.valueDosage,
    )

  public companion object {
    public fun fromModel(model: Extension.Value): ExtensionValueSurrogate =
      with(model) {
        ExtensionValueSurrogate().apply {
          Extension.Value?.from(
            Base64Binary.of(
              this@ExtensionValueSurrogate.valueBase64Binary,
              this@ExtensionValueSurrogate._valueBase64Binary,
            ),
            R4bBoolean.of(
              this@ExtensionValueSurrogate.valueBoolean,
              this@ExtensionValueSurrogate._valueBoolean,
            ),
            Canonical.of(
              this@ExtensionValueSurrogate.valueCanonical,
              this@ExtensionValueSurrogate._valueCanonical,
            ),
            Code.of(
              this@ExtensionValueSurrogate.valueCode,
              this@ExtensionValueSurrogate._valueCode,
            ),
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
            Markdown.of(
              this@ExtensionValueSurrogate.valueMarkdown,
              this@ExtensionValueSurrogate._valueMarkdown,
            ),
            Oid.of(this@ExtensionValueSurrogate.valueOid, this@ExtensionValueSurrogate._valueOid),
            PositiveInt.of(
              this@ExtensionValueSurrogate.valuePositiveInt,
              this@ExtensionValueSurrogate._valuePositiveInt,
            ),
            R4bString.of(
              this@ExtensionValueSurrogate.valueString,
              this@ExtensionValueSurrogate._valueString,
            ),
            Time.of(
              this@ExtensionValueSurrogate.valueTime,
              this@ExtensionValueSurrogate._valueTime,
            ),
            UnsignedInt.of(
              this@ExtensionValueSurrogate.valueUnsignedInt,
              this@ExtensionValueSurrogate._valueUnsignedInt,
            ),
            Uri.of(this@ExtensionValueSurrogate.valueUri, this@ExtensionValueSurrogate._valueUri),
            Url.of(this@ExtensionValueSurrogate.valueUrl, this@ExtensionValueSurrogate._valueUrl),
            Uuid.of(
              this@ExtensionValueSurrogate.valueUuid,
              this@ExtensionValueSurrogate._valueUuid,
            ),
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
            this@ExtensionValueSurrogate.valueContributor,
            this@ExtensionValueSurrogate.valueDataRequirement,
            this@ExtensionValueSurrogate.valueExpression,
            this@ExtensionValueSurrogate.valueParameterDefinition,
            this@ExtensionValueSurrogate.valueRelatedArtifact,
            this@ExtensionValueSurrogate.valueTriggerDefinition,
            this@ExtensionValueSurrogate.valueUsageContext,
            this@ExtensionValueSurrogate.valueDosage,
          )
        }
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
