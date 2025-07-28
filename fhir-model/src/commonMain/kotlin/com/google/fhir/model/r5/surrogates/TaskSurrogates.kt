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
import kotlin.collections.MutableList
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TaskPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): Task.Performer =
    Task.Performer(
      id = this@TaskPerformerSurrogate.id,
      extension = this@TaskPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TaskPerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@TaskPerformerSurrogate.function,
      actor = this@TaskPerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: Task.Performer): TaskPerformerSurrogate =
      with(model) {
        TaskPerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class TaskRestrictionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var repetitions: Int? = null,
  public var _repetitions: Element? = null,
  public var period: Period? = null,
  public var recipient: MutableList<Reference>? = null,
) {
  public fun toModel(): Task.Restriction =
    Task.Restriction(
      id = this@TaskRestrictionSurrogate.id,
      extension = this@TaskRestrictionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TaskRestrictionSurrogate.modifierExtension ?: mutableListOf(),
      repetitions =
        PositiveInt.of(
          this@TaskRestrictionSurrogate.repetitions,
          this@TaskRestrictionSurrogate._repetitions,
        ),
      period = this@TaskRestrictionSurrogate.period,
      recipient = this@TaskRestrictionSurrogate.recipient ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Task.Restriction): TaskRestrictionSurrogate =
      with(model) {
        TaskRestrictionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          repetitions = this@with.repetitions?.value,
          _repetitions = this@with.repetitions?.toElement(),
          period = this@with.period,
          recipient = this@with.recipient.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class TaskInputValueSurrogate(
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
  public fun toModel(): Task.Input.Value =
    Task.Input.Value.from(
      Base64Binary.of(
        this@TaskInputValueSurrogate.valueBase64Binary,
        this@TaskInputValueSurrogate._valueBase64Binary,
      ),
      R5Boolean.of(
        this@TaskInputValueSurrogate.valueBoolean,
        this@TaskInputValueSurrogate._valueBoolean,
      ),
      Canonical.of(
        this@TaskInputValueSurrogate.valueCanonical,
        this@TaskInputValueSurrogate._valueCanonical,
      ),
      Code.of(this@TaskInputValueSurrogate.valueCode, this@TaskInputValueSurrogate._valueCode),
      Date.of(
        FhirDate.fromString(this@TaskInputValueSurrogate.valueDate),
        this@TaskInputValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@TaskInputValueSurrogate.valueDateTime),
        this@TaskInputValueSurrogate._valueDateTime,
      ),
      Decimal.of(
        this@TaskInputValueSurrogate.valueDecimal,
        this@TaskInputValueSurrogate._valueDecimal,
      ),
      Id.of(this@TaskInputValueSurrogate.valueId, this@TaskInputValueSurrogate._valueId),
      Instant.of(
        FhirDateTime.fromString(this@TaskInputValueSurrogate.valueInstant),
        this@TaskInputValueSurrogate._valueInstant,
      ),
      Integer.of(
        this@TaskInputValueSurrogate.valueInteger,
        this@TaskInputValueSurrogate._valueInteger,
      ),
      Integer64.of(
        this@TaskInputValueSurrogate.valueInteger64,
        this@TaskInputValueSurrogate._valueInteger64,
      ),
      Markdown.of(
        this@TaskInputValueSurrogate.valueMarkdown,
        this@TaskInputValueSurrogate._valueMarkdown,
      ),
      Oid.of(this@TaskInputValueSurrogate.valueOid, this@TaskInputValueSurrogate._valueOid),
      PositiveInt.of(
        this@TaskInputValueSurrogate.valuePositiveInt,
        this@TaskInputValueSurrogate._valuePositiveInt,
      ),
      R5String.of(
        this@TaskInputValueSurrogate.valueString,
        this@TaskInputValueSurrogate._valueString,
      ),
      Time.of(this@TaskInputValueSurrogate.valueTime, this@TaskInputValueSurrogate._valueTime),
      UnsignedInt.of(
        this@TaskInputValueSurrogate.valueUnsignedInt,
        this@TaskInputValueSurrogate._valueUnsignedInt,
      ),
      Uri.of(this@TaskInputValueSurrogate.valueUri, this@TaskInputValueSurrogate._valueUri),
      Url.of(this@TaskInputValueSurrogate.valueUrl, this@TaskInputValueSurrogate._valueUrl),
      Uuid.of(this@TaskInputValueSurrogate.valueUuid, this@TaskInputValueSurrogate._valueUuid),
      this@TaskInputValueSurrogate.valueAddress,
      this@TaskInputValueSurrogate.valueAge,
      this@TaskInputValueSurrogate.valueAnnotation,
      this@TaskInputValueSurrogate.valueAttachment,
      this@TaskInputValueSurrogate.valueCodeableConcept,
      this@TaskInputValueSurrogate.valueCodeableReference,
      this@TaskInputValueSurrogate.valueCoding,
      this@TaskInputValueSurrogate.valueContactPoint,
      this@TaskInputValueSurrogate.valueCount,
      this@TaskInputValueSurrogate.valueDistance,
      this@TaskInputValueSurrogate.valueDuration,
      this@TaskInputValueSurrogate.valueHumanName,
      this@TaskInputValueSurrogate.valueIdentifier,
      this@TaskInputValueSurrogate.valueMoney,
      this@TaskInputValueSurrogate.valuePeriod,
      this@TaskInputValueSurrogate.valueQuantity,
      this@TaskInputValueSurrogate.valueRange,
      this@TaskInputValueSurrogate.valueRatio,
      this@TaskInputValueSurrogate.valueRatioRange,
      this@TaskInputValueSurrogate.valueReference,
      this@TaskInputValueSurrogate.valueSampledData,
      this@TaskInputValueSurrogate.valueSignature,
      this@TaskInputValueSurrogate.valueTiming,
      this@TaskInputValueSurrogate.valueContactDetail,
      this@TaskInputValueSurrogate.valueDataRequirement,
      this@TaskInputValueSurrogate.valueExpression,
      this@TaskInputValueSurrogate.valueParameterDefinition,
      this@TaskInputValueSurrogate.valueRelatedArtifact,
      this@TaskInputValueSurrogate.valueTriggerDefinition,
      this@TaskInputValueSurrogate.valueUsageContext,
      this@TaskInputValueSurrogate.valueAvailability,
      this@TaskInputValueSurrogate.valueExtendedContactDetail,
      this@TaskInputValueSurrogate.valueDosage,
      this@TaskInputValueSurrogate.valueMeta,
    )!!

  public companion object {
    public fun fromModel(model: Task.Input.Value): TaskInputValueSurrogate =
      with(model) {
        TaskInputValueSurrogate().apply {
          Task.Input.Value.from(
            Base64Binary.of(
              this@TaskInputValueSurrogate.valueBase64Binary,
              this@TaskInputValueSurrogate._valueBase64Binary,
            ),
            R5Boolean.of(
              this@TaskInputValueSurrogate.valueBoolean,
              this@TaskInputValueSurrogate._valueBoolean,
            ),
            Canonical.of(
              this@TaskInputValueSurrogate.valueCanonical,
              this@TaskInputValueSurrogate._valueCanonical,
            ),
            Code.of(
              this@TaskInputValueSurrogate.valueCode,
              this@TaskInputValueSurrogate._valueCode,
            ),
            Date.of(
              FhirDate.fromString(this@TaskInputValueSurrogate.valueDate),
              this@TaskInputValueSurrogate._valueDate,
            ),
            DateTime.of(
              FhirDateTime.fromString(this@TaskInputValueSurrogate.valueDateTime),
              this@TaskInputValueSurrogate._valueDateTime,
            ),
            Decimal.of(
              this@TaskInputValueSurrogate.valueDecimal,
              this@TaskInputValueSurrogate._valueDecimal,
            ),
            Id.of(this@TaskInputValueSurrogate.valueId, this@TaskInputValueSurrogate._valueId),
            Instant.of(
              FhirDateTime.fromString(this@TaskInputValueSurrogate.valueInstant),
              this@TaskInputValueSurrogate._valueInstant,
            ),
            Integer.of(
              this@TaskInputValueSurrogate.valueInteger,
              this@TaskInputValueSurrogate._valueInteger,
            ),
            Integer64.of(
              this@TaskInputValueSurrogate.valueInteger64,
              this@TaskInputValueSurrogate._valueInteger64,
            ),
            Markdown.of(
              this@TaskInputValueSurrogate.valueMarkdown,
              this@TaskInputValueSurrogate._valueMarkdown,
            ),
            Oid.of(this@TaskInputValueSurrogate.valueOid, this@TaskInputValueSurrogate._valueOid),
            PositiveInt.of(
              this@TaskInputValueSurrogate.valuePositiveInt,
              this@TaskInputValueSurrogate._valuePositiveInt,
            ),
            R5String.of(
              this@TaskInputValueSurrogate.valueString,
              this@TaskInputValueSurrogate._valueString,
            ),
            Time.of(
              this@TaskInputValueSurrogate.valueTime,
              this@TaskInputValueSurrogate._valueTime,
            ),
            UnsignedInt.of(
              this@TaskInputValueSurrogate.valueUnsignedInt,
              this@TaskInputValueSurrogate._valueUnsignedInt,
            ),
            Uri.of(this@TaskInputValueSurrogate.valueUri, this@TaskInputValueSurrogate._valueUri),
            Url.of(this@TaskInputValueSurrogate.valueUrl, this@TaskInputValueSurrogate._valueUrl),
            Uuid.of(
              this@TaskInputValueSurrogate.valueUuid,
              this@TaskInputValueSurrogate._valueUuid,
            ),
            this@TaskInputValueSurrogate.valueAddress,
            this@TaskInputValueSurrogate.valueAge,
            this@TaskInputValueSurrogate.valueAnnotation,
            this@TaskInputValueSurrogate.valueAttachment,
            this@TaskInputValueSurrogate.valueCodeableConcept,
            this@TaskInputValueSurrogate.valueCodeableReference,
            this@TaskInputValueSurrogate.valueCoding,
            this@TaskInputValueSurrogate.valueContactPoint,
            this@TaskInputValueSurrogate.valueCount,
            this@TaskInputValueSurrogate.valueDistance,
            this@TaskInputValueSurrogate.valueDuration,
            this@TaskInputValueSurrogate.valueHumanName,
            this@TaskInputValueSurrogate.valueIdentifier,
            this@TaskInputValueSurrogate.valueMoney,
            this@TaskInputValueSurrogate.valuePeriod,
            this@TaskInputValueSurrogate.valueQuantity,
            this@TaskInputValueSurrogate.valueRange,
            this@TaskInputValueSurrogate.valueRatio,
            this@TaskInputValueSurrogate.valueRatioRange,
            this@TaskInputValueSurrogate.valueReference,
            this@TaskInputValueSurrogate.valueSampledData,
            this@TaskInputValueSurrogate.valueSignature,
            this@TaskInputValueSurrogate.valueTiming,
            this@TaskInputValueSurrogate.valueContactDetail,
            this@TaskInputValueSurrogate.valueDataRequirement,
            this@TaskInputValueSurrogate.valueExpression,
            this@TaskInputValueSurrogate.valueParameterDefinition,
            this@TaskInputValueSurrogate.valueRelatedArtifact,
            this@TaskInputValueSurrogate.valueTriggerDefinition,
            this@TaskInputValueSurrogate.valueUsageContext,
            this@TaskInputValueSurrogate.valueAvailability,
            this@TaskInputValueSurrogate.valueExtendedContactDetail,
            this@TaskInputValueSurrogate.valueDosage,
            this@TaskInputValueSurrogate.valueMeta,
          )!!
        }
      }
  }
}

@Serializable
internal data class TaskInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: Task.Input.Value,
) {
  public fun toModel(): Task.Input =
    Task.Input(
      id = this@TaskInputSurrogate.id,
      extension = this@TaskInputSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TaskInputSurrogate.modifierExtension ?: mutableListOf(),
      type = this@TaskInputSurrogate.type,
      `value` = this@TaskInputSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: Task.Input): TaskInputSurrogate =
      with(model) {
        TaskInputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class TaskOutputValueSurrogate(
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
  public fun toModel(): Task.Output.Value =
    Task.Output.Value.from(
      Base64Binary.of(
        this@TaskOutputValueSurrogate.valueBase64Binary,
        this@TaskOutputValueSurrogate._valueBase64Binary,
      ),
      R5Boolean.of(
        this@TaskOutputValueSurrogate.valueBoolean,
        this@TaskOutputValueSurrogate._valueBoolean,
      ),
      Canonical.of(
        this@TaskOutputValueSurrogate.valueCanonical,
        this@TaskOutputValueSurrogate._valueCanonical,
      ),
      Code.of(this@TaskOutputValueSurrogate.valueCode, this@TaskOutputValueSurrogate._valueCode),
      Date.of(
        FhirDate.fromString(this@TaskOutputValueSurrogate.valueDate),
        this@TaskOutputValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@TaskOutputValueSurrogate.valueDateTime),
        this@TaskOutputValueSurrogate._valueDateTime,
      ),
      Decimal.of(
        this@TaskOutputValueSurrogate.valueDecimal,
        this@TaskOutputValueSurrogate._valueDecimal,
      ),
      Id.of(this@TaskOutputValueSurrogate.valueId, this@TaskOutputValueSurrogate._valueId),
      Instant.of(
        FhirDateTime.fromString(this@TaskOutputValueSurrogate.valueInstant),
        this@TaskOutputValueSurrogate._valueInstant,
      ),
      Integer.of(
        this@TaskOutputValueSurrogate.valueInteger,
        this@TaskOutputValueSurrogate._valueInteger,
      ),
      Integer64.of(
        this@TaskOutputValueSurrogate.valueInteger64,
        this@TaskOutputValueSurrogate._valueInteger64,
      ),
      Markdown.of(
        this@TaskOutputValueSurrogate.valueMarkdown,
        this@TaskOutputValueSurrogate._valueMarkdown,
      ),
      Oid.of(this@TaskOutputValueSurrogate.valueOid, this@TaskOutputValueSurrogate._valueOid),
      PositiveInt.of(
        this@TaskOutputValueSurrogate.valuePositiveInt,
        this@TaskOutputValueSurrogate._valuePositiveInt,
      ),
      R5String.of(
        this@TaskOutputValueSurrogate.valueString,
        this@TaskOutputValueSurrogate._valueString,
      ),
      Time.of(this@TaskOutputValueSurrogate.valueTime, this@TaskOutputValueSurrogate._valueTime),
      UnsignedInt.of(
        this@TaskOutputValueSurrogate.valueUnsignedInt,
        this@TaskOutputValueSurrogate._valueUnsignedInt,
      ),
      Uri.of(this@TaskOutputValueSurrogate.valueUri, this@TaskOutputValueSurrogate._valueUri),
      Url.of(this@TaskOutputValueSurrogate.valueUrl, this@TaskOutputValueSurrogate._valueUrl),
      Uuid.of(this@TaskOutputValueSurrogate.valueUuid, this@TaskOutputValueSurrogate._valueUuid),
      this@TaskOutputValueSurrogate.valueAddress,
      this@TaskOutputValueSurrogate.valueAge,
      this@TaskOutputValueSurrogate.valueAnnotation,
      this@TaskOutputValueSurrogate.valueAttachment,
      this@TaskOutputValueSurrogate.valueCodeableConcept,
      this@TaskOutputValueSurrogate.valueCodeableReference,
      this@TaskOutputValueSurrogate.valueCoding,
      this@TaskOutputValueSurrogate.valueContactPoint,
      this@TaskOutputValueSurrogate.valueCount,
      this@TaskOutputValueSurrogate.valueDistance,
      this@TaskOutputValueSurrogate.valueDuration,
      this@TaskOutputValueSurrogate.valueHumanName,
      this@TaskOutputValueSurrogate.valueIdentifier,
      this@TaskOutputValueSurrogate.valueMoney,
      this@TaskOutputValueSurrogate.valuePeriod,
      this@TaskOutputValueSurrogate.valueQuantity,
      this@TaskOutputValueSurrogate.valueRange,
      this@TaskOutputValueSurrogate.valueRatio,
      this@TaskOutputValueSurrogate.valueRatioRange,
      this@TaskOutputValueSurrogate.valueReference,
      this@TaskOutputValueSurrogate.valueSampledData,
      this@TaskOutputValueSurrogate.valueSignature,
      this@TaskOutputValueSurrogate.valueTiming,
      this@TaskOutputValueSurrogate.valueContactDetail,
      this@TaskOutputValueSurrogate.valueDataRequirement,
      this@TaskOutputValueSurrogate.valueExpression,
      this@TaskOutputValueSurrogate.valueParameterDefinition,
      this@TaskOutputValueSurrogate.valueRelatedArtifact,
      this@TaskOutputValueSurrogate.valueTriggerDefinition,
      this@TaskOutputValueSurrogate.valueUsageContext,
      this@TaskOutputValueSurrogate.valueAvailability,
      this@TaskOutputValueSurrogate.valueExtendedContactDetail,
      this@TaskOutputValueSurrogate.valueDosage,
      this@TaskOutputValueSurrogate.valueMeta,
    )!!

  public companion object {
    public fun fromModel(model: Task.Output.Value): TaskOutputValueSurrogate =
      with(model) {
        TaskOutputValueSurrogate().apply {
          Task.Output.Value.from(
            Base64Binary.of(
              this@TaskOutputValueSurrogate.valueBase64Binary,
              this@TaskOutputValueSurrogate._valueBase64Binary,
            ),
            R5Boolean.of(
              this@TaskOutputValueSurrogate.valueBoolean,
              this@TaskOutputValueSurrogate._valueBoolean,
            ),
            Canonical.of(
              this@TaskOutputValueSurrogate.valueCanonical,
              this@TaskOutputValueSurrogate._valueCanonical,
            ),
            Code.of(
              this@TaskOutputValueSurrogate.valueCode,
              this@TaskOutputValueSurrogate._valueCode,
            ),
            Date.of(
              FhirDate.fromString(this@TaskOutputValueSurrogate.valueDate),
              this@TaskOutputValueSurrogate._valueDate,
            ),
            DateTime.of(
              FhirDateTime.fromString(this@TaskOutputValueSurrogate.valueDateTime),
              this@TaskOutputValueSurrogate._valueDateTime,
            ),
            Decimal.of(
              this@TaskOutputValueSurrogate.valueDecimal,
              this@TaskOutputValueSurrogate._valueDecimal,
            ),
            Id.of(this@TaskOutputValueSurrogate.valueId, this@TaskOutputValueSurrogate._valueId),
            Instant.of(
              FhirDateTime.fromString(this@TaskOutputValueSurrogate.valueInstant),
              this@TaskOutputValueSurrogate._valueInstant,
            ),
            Integer.of(
              this@TaskOutputValueSurrogate.valueInteger,
              this@TaskOutputValueSurrogate._valueInteger,
            ),
            Integer64.of(
              this@TaskOutputValueSurrogate.valueInteger64,
              this@TaskOutputValueSurrogate._valueInteger64,
            ),
            Markdown.of(
              this@TaskOutputValueSurrogate.valueMarkdown,
              this@TaskOutputValueSurrogate._valueMarkdown,
            ),
            Oid.of(this@TaskOutputValueSurrogate.valueOid, this@TaskOutputValueSurrogate._valueOid),
            PositiveInt.of(
              this@TaskOutputValueSurrogate.valuePositiveInt,
              this@TaskOutputValueSurrogate._valuePositiveInt,
            ),
            R5String.of(
              this@TaskOutputValueSurrogate.valueString,
              this@TaskOutputValueSurrogate._valueString,
            ),
            Time.of(
              this@TaskOutputValueSurrogate.valueTime,
              this@TaskOutputValueSurrogate._valueTime,
            ),
            UnsignedInt.of(
              this@TaskOutputValueSurrogate.valueUnsignedInt,
              this@TaskOutputValueSurrogate._valueUnsignedInt,
            ),
            Uri.of(this@TaskOutputValueSurrogate.valueUri, this@TaskOutputValueSurrogate._valueUri),
            Url.of(this@TaskOutputValueSurrogate.valueUrl, this@TaskOutputValueSurrogate._valueUrl),
            Uuid.of(
              this@TaskOutputValueSurrogate.valueUuid,
              this@TaskOutputValueSurrogate._valueUuid,
            ),
            this@TaskOutputValueSurrogate.valueAddress,
            this@TaskOutputValueSurrogate.valueAge,
            this@TaskOutputValueSurrogate.valueAnnotation,
            this@TaskOutputValueSurrogate.valueAttachment,
            this@TaskOutputValueSurrogate.valueCodeableConcept,
            this@TaskOutputValueSurrogate.valueCodeableReference,
            this@TaskOutputValueSurrogate.valueCoding,
            this@TaskOutputValueSurrogate.valueContactPoint,
            this@TaskOutputValueSurrogate.valueCount,
            this@TaskOutputValueSurrogate.valueDistance,
            this@TaskOutputValueSurrogate.valueDuration,
            this@TaskOutputValueSurrogate.valueHumanName,
            this@TaskOutputValueSurrogate.valueIdentifier,
            this@TaskOutputValueSurrogate.valueMoney,
            this@TaskOutputValueSurrogate.valuePeriod,
            this@TaskOutputValueSurrogate.valueQuantity,
            this@TaskOutputValueSurrogate.valueRange,
            this@TaskOutputValueSurrogate.valueRatio,
            this@TaskOutputValueSurrogate.valueRatioRange,
            this@TaskOutputValueSurrogate.valueReference,
            this@TaskOutputValueSurrogate.valueSampledData,
            this@TaskOutputValueSurrogate.valueSignature,
            this@TaskOutputValueSurrogate.valueTiming,
            this@TaskOutputValueSurrogate.valueContactDetail,
            this@TaskOutputValueSurrogate.valueDataRequirement,
            this@TaskOutputValueSurrogate.valueExpression,
            this@TaskOutputValueSurrogate.valueParameterDefinition,
            this@TaskOutputValueSurrogate.valueRelatedArtifact,
            this@TaskOutputValueSurrogate.valueTriggerDefinition,
            this@TaskOutputValueSurrogate.valueUsageContext,
            this@TaskOutputValueSurrogate.valueAvailability,
            this@TaskOutputValueSurrogate.valueExtendedContactDetail,
            this@TaskOutputValueSurrogate.valueDosage,
            this@TaskOutputValueSurrogate.valueMeta,
          )!!
        }
      }
  }
}

@Serializable
internal data class TaskOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: Task.Output.Value,
) {
  public fun toModel(): Task.Output =
    Task.Output(
      id = this@TaskOutputSurrogate.id,
      extension = this@TaskOutputSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TaskOutputSurrogate.modifierExtension ?: mutableListOf(),
      type = this@TaskOutputSurrogate.type,
      `value` = this@TaskOutputSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: Task.Output): TaskOutputSurrogate =
      with(model) {
        TaskOutputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiatesCanonical: KotlinString? = null,
  public var _instantiatesCanonical: Element? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var partOf: MutableList<Reference>? = null,
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
  public var requestedPerformer: MutableList<CodeableReference>? = null,
  public var owner: Reference? = null,
  public var performer: MutableList<Task.Performer>? = null,
  public var location: Reference? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var insurance: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var relevantHistory: MutableList<Reference>? = null,
  public var restriction: Task.Restriction? = null,
  public var input: MutableList<Task.Input>? = null,
  public var output: MutableList<Task.Output>? = null,
) {
  public fun toModel(): Task =
    Task(
      id = this@TaskSurrogate.id,
      meta = this@TaskSurrogate.meta,
      implicitRules = Uri.of(this@TaskSurrogate.implicitRules, this@TaskSurrogate._implicitRules),
      language = Code.of(this@TaskSurrogate.language, this@TaskSurrogate._language),
      text = this@TaskSurrogate.text,
      contained = this@TaskSurrogate.contained ?: mutableListOf(),
      extension = this@TaskSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TaskSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@TaskSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        Canonical.of(
          this@TaskSurrogate.instantiatesCanonical,
          this@TaskSurrogate._instantiatesCanonical,
        ),
      instantiatesUri =
        Uri.of(this@TaskSurrogate.instantiatesUri, this@TaskSurrogate._instantiatesUri),
      basedOn = this@TaskSurrogate.basedOn ?: mutableListOf(),
      groupIdentifier = this@TaskSurrogate.groupIdentifier,
      partOf = this@TaskSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Task.TaskStatus.fromCode(this@TaskSurrogate.status!!),
          this@TaskSurrogate._status,
        ),
      statusReason = this@TaskSurrogate.statusReason,
      businessStatus = this@TaskSurrogate.businessStatus,
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.Task.TaskIntent.fromCode(this@TaskSurrogate.intent!!),
          this@TaskSurrogate._intent,
        ),
      priority =
        this@TaskSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Task.TaskPriority.fromCode(it!!),
            this@TaskSurrogate._priority,
          )
        },
      doNotPerform =
        R5Boolean.of(this@TaskSurrogate.doNotPerform, this@TaskSurrogate._doNotPerform),
      code = this@TaskSurrogate.code,
      description = R5String.of(this@TaskSurrogate.description, this@TaskSurrogate._description),
      focus = this@TaskSurrogate.focus,
      `for` = this@TaskSurrogate.`for`,
      encounter = this@TaskSurrogate.encounter,
      requestedPeriod = this@TaskSurrogate.requestedPeriod,
      executionPeriod = this@TaskSurrogate.executionPeriod,
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@TaskSurrogate.authoredOn),
          this@TaskSurrogate._authoredOn,
        ),
      lastModified =
        DateTime.of(
          FhirDateTime.fromString(this@TaskSurrogate.lastModified),
          this@TaskSurrogate._lastModified,
        ),
      requester = this@TaskSurrogate.requester,
      requestedPerformer = this@TaskSurrogate.requestedPerformer ?: mutableListOf(),
      owner = this@TaskSurrogate.owner,
      performer = this@TaskSurrogate.performer ?: mutableListOf(),
      location = this@TaskSurrogate.location,
      reason = this@TaskSurrogate.reason ?: mutableListOf(),
      insurance = this@TaskSurrogate.insurance ?: mutableListOf(),
      note = this@TaskSurrogate.note ?: mutableListOf(),
      relevantHistory = this@TaskSurrogate.relevantHistory ?: mutableListOf(),
      restriction = this@TaskSurrogate.restriction,
      input = this@TaskSurrogate.input ?: mutableListOf(),
      output = this@TaskSurrogate.output ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Task): TaskSurrogate =
      with(model) {
        TaskSurrogate(
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          instantiatesCanonical = this@with.instantiatesCanonical?.value,
          _instantiatesCanonical = this@with.instantiatesCanonical?.toElement(),
          instantiatesUri = this@with.instantiatesUri?.value,
          _instantiatesUri = this@with.instantiatesUri?.toElement(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          groupIdentifier = this@with.groupIdentifier,
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          businessStatus = this@with.businessStatus,
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          code = this@with.code,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          focus = this@with.focus,
          `for` = this@with.`for`,
          encounter = this@with.encounter,
          requestedPeriod = this@with.requestedPeriod,
          executionPeriod = this@with.executionPeriod,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          lastModified = this@with.lastModified?.value?.toString(),
          _lastModified = this@with.lastModified?.toElement(),
          requester = this@with.requester,
          requestedPerformer = this@with.requestedPerformer.takeUnless { it.all { it == null } },
          owner = this@with.owner,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          location = this@with.location,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          relevantHistory = this@with.relevantHistory.takeUnless { it.all { it == null } },
          restriction = this@with.restriction,
          input = this@with.input.takeUnless { it.all { it == null } },
          output = this@with.output.takeUnless { it.all { it == null } },
        )
      }
  }
}
