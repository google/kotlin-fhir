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
import com.google.fhir.model.r4b.Enumeration
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
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Oid
import com.google.fhir.model.r4b.ParameterDefinition
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
import com.google.fhir.model.r4b.StructureMap
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
internal data class StructureMapStructureSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var alias: KotlinString? = null,
  public var _alias: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): StructureMap.Structure =
    StructureMap.Structure(
      id = this@StructureMapStructureSurrogate.id,
      extension = this@StructureMapStructureSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@StructureMapStructureSurrogate.modifierExtension ?: mutableListOf(),
      url =
        Canonical.of(
          this@StructureMapStructureSurrogate.url,
          this@StructureMapStructureSurrogate._url,
        )!!,
      mode =
        Enumeration.of(
          com.google.fhir.model.r4b.StructureMap.StructureMapModelMode.fromCode(
            this@StructureMapStructureSurrogate.mode!!
          ),
          this@StructureMapStructureSurrogate._mode,
        ),
      alias =
        R4bString.of(
          this@StructureMapStructureSurrogate.alias,
          this@StructureMapStructureSurrogate._alias,
        ),
      documentation =
        R4bString.of(
          this@StructureMapStructureSurrogate.documentation,
          this@StructureMapStructureSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(model: StructureMap.Structure): StructureMapStructureSurrogate =
      with(model) {
        StructureMapStructureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          url = this@with.url.value,
          _url = this@with.url.toElement(),
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          alias = this@with.alias?.value,
          _alias = this@with.alias?.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): StructureMap.Group.Input =
    StructureMap.Group.Input(
      id = this@StructureMapGroupInputSurrogate.id,
      extension = this@StructureMapGroupInputSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@StructureMapGroupInputSurrogate.modifierExtension ?: mutableListOf(),
      name =
        Id.of(
          this@StructureMapGroupInputSurrogate.name,
          this@StructureMapGroupInputSurrogate._name,
        )!!,
      type =
        R4bString.of(
          this@StructureMapGroupInputSurrogate.type,
          this@StructureMapGroupInputSurrogate._type,
        ),
      mode =
        Enumeration.of(
          com.google.fhir.model.r4b.StructureMap.StructureMapInputMode.fromCode(
            this@StructureMapGroupInputSurrogate.mode!!
          ),
          this@StructureMapGroupInputSurrogate._mode,
        ),
      documentation =
        R4bString.of(
          this@StructureMapGroupInputSurrogate.documentation,
          this@StructureMapGroupInputSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(model: StructureMap.Group.Input): StructureMapGroupInputSurrogate =
      with(model) {
        StructureMapGroupInputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          type = this@with.type?.value,
          _type = this@with.type?.toElement(),
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleSourceDefaultValueSurrogate(
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
  public var defaultValueReference: Reference? = null,
  public var defaultValueSampledData: SampledData? = null,
  public var defaultValueSignature: Signature? = null,
  public var defaultValueTiming: Timing? = null,
  public var defaultValueContactDetail: ContactDetail? = null,
  public var defaultValueContributor: Contributor? = null,
  public var defaultValueDataRequirement: DataRequirement? = null,
  public var defaultValueExpression: Expression? = null,
  public var defaultValueParameterDefinition: ParameterDefinition? = null,
  public var defaultValueRelatedArtifact: RelatedArtifact? = null,
  public var defaultValueTriggerDefinition: TriggerDefinition? = null,
  public var defaultValueUsageContext: UsageContext? = null,
  public var defaultValueDosage: Dosage? = null,
  public var defaultValueMeta: Meta? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Source.DefaultValue? =
    StructureMap.Group.Rule.Source.DefaultValue?.from(
      Base64Binary.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueBase64Binary,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueBase64Binary,
      ),
      R4bBoolean.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueBoolean,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueBoolean,
      ),
      Canonical.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCanonical,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueCanonical,
      ),
      Code.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCode,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueCode,
      ),
      Date.of(
        FhirDate.fromString(this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDate),
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(
          this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDateTime
        ),
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueDateTime,
      ),
      Decimal.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDecimal,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueDecimal,
      ),
      Id.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueId,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueId,
      ),
      Instant.of(
        FhirDateTime.fromString(
          this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueInstant
        ),
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueInstant,
      ),
      Integer.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueInteger,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueInteger,
      ),
      Markdown.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueMarkdown,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueMarkdown,
      ),
      Oid.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueOid,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueOid,
      ),
      PositiveInt.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValuePositiveInt,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValuePositiveInt,
      ),
      R4bString.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueString,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueString,
      ),
      Time.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueTime,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueTime,
      ),
      UnsignedInt.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUnsignedInt,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUnsignedInt,
      ),
      Uri.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUri,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUri,
      ),
      Url.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUrl,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUrl,
      ),
      Uuid.of(
        this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUuid,
        this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUuid,
      ),
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAddress,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAge,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAnnotation,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAttachment,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCodeableConcept,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCoding,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueContactPoint,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCount,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDistance,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDuration,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueHumanName,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueIdentifier,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueMoney,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValuePeriod,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueQuantity,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueRange,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueRatio,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueReference,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueSampledData,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueSignature,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueTiming,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueContactDetail,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueContributor,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDataRequirement,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueExpression,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueParameterDefinition,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueRelatedArtifact,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueTriggerDefinition,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUsageContext,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDosage,
      this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueMeta,
    )

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Source.DefaultValue
    ): StructureMapGroupRuleSourceDefaultValueSurrogate =
      with(model) {
        StructureMapGroupRuleSourceDefaultValueSurrogate().apply {
          StructureMap.Group.Rule.Source.DefaultValue?.from(
            Base64Binary.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueBase64Binary,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueBase64Binary,
            ),
            R4bBoolean.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueBoolean,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueBoolean,
            ),
            Canonical.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCanonical,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueCanonical,
            ),
            Code.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCode,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueCode,
            ),
            Date.of(
              FhirDate.fromString(
                this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDate
              ),
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueDate,
            ),
            DateTime.of(
              FhirDateTime.fromString(
                this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDateTime
              ),
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueDateTime,
            ),
            Decimal.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDecimal,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueDecimal,
            ),
            Id.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueId,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueId,
            ),
            Instant.of(
              FhirDateTime.fromString(
                this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueInstant
              ),
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueInstant,
            ),
            Integer.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueInteger,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueInteger,
            ),
            Markdown.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueMarkdown,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueMarkdown,
            ),
            Oid.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueOid,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueOid,
            ),
            PositiveInt.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValuePositiveInt,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValuePositiveInt,
            ),
            R4bString.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueString,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueString,
            ),
            Time.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueTime,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueTime,
            ),
            UnsignedInt.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUnsignedInt,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUnsignedInt,
            ),
            Uri.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUri,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUri,
            ),
            Url.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUrl,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUrl,
            ),
            Uuid.of(
              this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUuid,
              this@StructureMapGroupRuleSourceDefaultValueSurrogate._defaultValueUuid,
            ),
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAddress,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAge,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAnnotation,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueAttachment,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCodeableConcept,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCoding,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueContactPoint,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueCount,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDistance,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDuration,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueHumanName,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueIdentifier,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueMoney,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValuePeriod,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueQuantity,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueRange,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueRatio,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueReference,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueSampledData,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueSignature,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueTiming,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueContactDetail,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueContributor,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDataRequirement,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueExpression,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueParameterDefinition,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueRelatedArtifact,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueTriggerDefinition,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueUsageContext,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueDosage,
            this@StructureMapGroupRuleSourceDefaultValueSurrogate.defaultValueMeta,
          )
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleSourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var context: KotlinString? = null,
  public var _context: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var element: KotlinString? = null,
  public var _element: Element? = null,
  public var listMode: KotlinString? = null,
  public var _listMode: Element? = null,
  public var variable: KotlinString? = null,
  public var _variable: Element? = null,
  public var condition: KotlinString? = null,
  public var _condition: Element? = null,
  public var check: KotlinString? = null,
  public var _check: Element? = null,
  public var logMessage: KotlinString? = null,
  public var _logMessage: Element? = null,
  public var defaultValue: StructureMap.Group.Rule.Source.DefaultValue? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Source =
    StructureMap.Group.Rule.Source(
      id = this@StructureMapGroupRuleSourceSurrogate.id,
      extension = this@StructureMapGroupRuleSourceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@StructureMapGroupRuleSourceSurrogate.modifierExtension ?: mutableListOf(),
      context =
        Id.of(
          this@StructureMapGroupRuleSourceSurrogate.context,
          this@StructureMapGroupRuleSourceSurrogate._context,
        )!!,
      min =
        Integer.of(
          this@StructureMapGroupRuleSourceSurrogate.min,
          this@StructureMapGroupRuleSourceSurrogate._min,
        ),
      max =
        R4bString.of(
          this@StructureMapGroupRuleSourceSurrogate.max,
          this@StructureMapGroupRuleSourceSurrogate._max,
        ),
      type =
        R4bString.of(
          this@StructureMapGroupRuleSourceSurrogate.type,
          this@StructureMapGroupRuleSourceSurrogate._type,
        ),
      defaultValue = this@StructureMapGroupRuleSourceSurrogate.defaultValue,
      element =
        R4bString.of(
          this@StructureMapGroupRuleSourceSurrogate.element,
          this@StructureMapGroupRuleSourceSurrogate._element,
        ),
      listMode =
        this@StructureMapGroupRuleSourceSurrogate.listMode?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.StructureMap.StructureMapSourceListMode.fromCode(it!!),
            this@StructureMapGroupRuleSourceSurrogate._listMode,
          )
        },
      variable =
        Id.of(
          this@StructureMapGroupRuleSourceSurrogate.variable,
          this@StructureMapGroupRuleSourceSurrogate._variable,
        ),
      condition =
        R4bString.of(
          this@StructureMapGroupRuleSourceSurrogate.condition,
          this@StructureMapGroupRuleSourceSurrogate._condition,
        ),
      check =
        R4bString.of(
          this@StructureMapGroupRuleSourceSurrogate.check,
          this@StructureMapGroupRuleSourceSurrogate._check,
        ),
      logMessage =
        R4bString.of(
          this@StructureMapGroupRuleSourceSurrogate.logMessage,
          this@StructureMapGroupRuleSourceSurrogate._logMessage,
        ),
    )

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Source
    ): StructureMapGroupRuleSourceSurrogate =
      with(model) {
        StructureMapGroupRuleSourceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          context = this@with.context.value,
          _context = this@with.context.toElement(),
          min = this@with.min?.value,
          _min = this@with.min?.toElement(),
          max = this@with.max?.value,
          _max = this@with.max?.toElement(),
          type = this@with.type?.value,
          _type = this@with.type?.toElement(),
          defaultValue = this@with.defaultValue,
          element = this@with.element?.value,
          _element = this@with.element?.toElement(),
          listMode = this@with.listMode?.value?.getCode(),
          _listMode = this@with.listMode?.toElement(),
          variable = this@with.variable?.value,
          _variable = this@with.variable?.toElement(),
          condition = this@with.condition?.value,
          _condition = this@with.condition?.toElement(),
          check = this@with.check?.value,
          _check = this@with.check?.toElement(),
          logMessage = this@with.logMessage?.value,
          _logMessage = this@with.logMessage?.toElement(),
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleTargetParameterValueSurrogate(
  public var valueId: KotlinString? = null,
  public var _valueId: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueDecimal: Double? = null,
  public var _valueDecimal: Element? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Target.Parameter.Value =
    StructureMap.Group.Rule.Target.Parameter.Value.from(
      Id.of(
        this@StructureMapGroupRuleTargetParameterValueSurrogate.valueId,
        this@StructureMapGroupRuleTargetParameterValueSurrogate._valueId,
      ),
      R4bString.of(
        this@StructureMapGroupRuleTargetParameterValueSurrogate.valueString,
        this@StructureMapGroupRuleTargetParameterValueSurrogate._valueString,
      ),
      R4bBoolean.of(
        this@StructureMapGroupRuleTargetParameterValueSurrogate.valueBoolean,
        this@StructureMapGroupRuleTargetParameterValueSurrogate._valueBoolean,
      ),
      Integer.of(
        this@StructureMapGroupRuleTargetParameterValueSurrogate.valueInteger,
        this@StructureMapGroupRuleTargetParameterValueSurrogate._valueInteger,
      ),
      Decimal.of(
        this@StructureMapGroupRuleTargetParameterValueSurrogate.valueDecimal,
        this@StructureMapGroupRuleTargetParameterValueSurrogate._valueDecimal,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Target.Parameter.Value
    ): StructureMapGroupRuleTargetParameterValueSurrogate =
      with(model) {
        StructureMapGroupRuleTargetParameterValueSurrogate().apply {
          StructureMap.Group.Rule.Target.Parameter.Value.from(
            Id.of(
              this@StructureMapGroupRuleTargetParameterValueSurrogate.valueId,
              this@StructureMapGroupRuleTargetParameterValueSurrogate._valueId,
            ),
            R4bString.of(
              this@StructureMapGroupRuleTargetParameterValueSurrogate.valueString,
              this@StructureMapGroupRuleTargetParameterValueSurrogate._valueString,
            ),
            R4bBoolean.of(
              this@StructureMapGroupRuleTargetParameterValueSurrogate.valueBoolean,
              this@StructureMapGroupRuleTargetParameterValueSurrogate._valueBoolean,
            ),
            Integer.of(
              this@StructureMapGroupRuleTargetParameterValueSurrogate.valueInteger,
              this@StructureMapGroupRuleTargetParameterValueSurrogate._valueInteger,
            ),
            Decimal.of(
              this@StructureMapGroupRuleTargetParameterValueSurrogate.valueDecimal,
              this@StructureMapGroupRuleTargetParameterValueSurrogate._valueDecimal,
            ),
          )!!
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleTargetParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `value`: StructureMap.Group.Rule.Target.Parameter.Value,
) {
  public fun toModel(): StructureMap.Group.Rule.Target.Parameter =
    StructureMap.Group.Rule.Target.Parameter(
      id = this@StructureMapGroupRuleTargetParameterSurrogate.id,
      extension = this@StructureMapGroupRuleTargetParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@StructureMapGroupRuleTargetParameterSurrogate.modifierExtension ?: mutableListOf(),
      `value` = this@StructureMapGroupRuleTargetParameterSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Target.Parameter
    ): StructureMapGroupRuleTargetParameterSurrogate =
      with(model) {
        StructureMapGroupRuleTargetParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var context: KotlinString? = null,
  public var _context: Element? = null,
  public var contextType: KotlinString? = null,
  public var _contextType: Element? = null,
  public var element: KotlinString? = null,
  public var _element: Element? = null,
  public var variable: KotlinString? = null,
  public var _variable: Element? = null,
  public var listMode: MutableList<KotlinString?>? = null,
  public var _listMode: MutableList<Element?>? = null,
  public var listRuleId: KotlinString? = null,
  public var _listRuleId: Element? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var parameter: MutableList<StructureMap.Group.Rule.Target.Parameter>? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Target =
    StructureMap.Group.Rule.Target(
      id = this@StructureMapGroupRuleTargetSurrogate.id,
      extension = this@StructureMapGroupRuleTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@StructureMapGroupRuleTargetSurrogate.modifierExtension ?: mutableListOf(),
      context =
        Id.of(
          this@StructureMapGroupRuleTargetSurrogate.context,
          this@StructureMapGroupRuleTargetSurrogate._context,
        ),
      contextType =
        this@StructureMapGroupRuleTargetSurrogate.contextType?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.StructureMap.StructureMapContextType.fromCode(it!!),
            this@StructureMapGroupRuleTargetSurrogate._contextType,
          )
        },
      element =
        R4bString.of(
          this@StructureMapGroupRuleTargetSurrogate.element,
          this@StructureMapGroupRuleTargetSurrogate._element,
        ),
      variable =
        Id.of(
          this@StructureMapGroupRuleTargetSurrogate.variable,
          this@StructureMapGroupRuleTargetSurrogate._variable,
        ),
      listMode =
        if (
          this@StructureMapGroupRuleTargetSurrogate.listMode == null &&
            this@StructureMapGroupRuleTargetSurrogate._listMode == null
        ) {
          mutableListOf()
        } else {
          (this@StructureMapGroupRuleTargetSurrogate.listMode
              ?: List(this@StructureMapGroupRuleTargetSurrogate._listMode!!.size) { null })
            .zip(
              this@StructureMapGroupRuleTargetSurrogate._listMode
                ?: List(this@StructureMapGroupRuleTargetSurrogate.listMode!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r4b.StructureMap.StructureMapTargetListMode.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      listRuleId =
        Id.of(
          this@StructureMapGroupRuleTargetSurrogate.listRuleId,
          this@StructureMapGroupRuleTargetSurrogate._listRuleId,
        ),
      transform =
        this@StructureMapGroupRuleTargetSurrogate.transform?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.StructureMap.StructureMapTransform.fromCode(it!!),
            this@StructureMapGroupRuleTargetSurrogate._transform,
          )
        },
      parameter = this@StructureMapGroupRuleTargetSurrogate.parameter ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Target
    ): StructureMapGroupRuleTargetSurrogate =
      with(model) {
        StructureMapGroupRuleTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          context = this@with.context?.value,
          _context = this@with.context?.toElement(),
          contextType = this@with.contextType?.value?.getCode(),
          _contextType = this@with.contextType?.toElement(),
          element = this@with.element?.value,
          _element = this@with.element?.toElement(),
          variable = this@with.variable?.value,
          _variable = this@with.variable?.toElement(),
          listMode =
            this@with.listMode
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _listMode =
            this@with.listMode
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          listRuleId = this@with.listRuleId?.value,
          _listRuleId = this@with.listRuleId?.toElement(),
          transform = this@with.transform?.value?.getCode(),
          _transform = this@with.transform?.toElement(),
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleDependentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var variable: MutableList<KotlinString?>? = null,
  public var _variable: MutableList<Element?>? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Dependent =
    StructureMap.Group.Rule.Dependent(
      id = this@StructureMapGroupRuleDependentSurrogate.id,
      extension = this@StructureMapGroupRuleDependentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@StructureMapGroupRuleDependentSurrogate.modifierExtension ?: mutableListOf(),
      name =
        Id.of(
          this@StructureMapGroupRuleDependentSurrogate.name,
          this@StructureMapGroupRuleDependentSurrogate._name,
        )!!,
      variable =
        if (
          this@StructureMapGroupRuleDependentSurrogate.variable == null &&
            this@StructureMapGroupRuleDependentSurrogate._variable == null
        ) {
          mutableListOf()
        } else {
          (this@StructureMapGroupRuleDependentSurrogate.variable
              ?: List(this@StructureMapGroupRuleDependentSurrogate._variable!!.size) { null })
            .zip(
              this@StructureMapGroupRuleDependentSurrogate._variable
                ?: List(this@StructureMapGroupRuleDependentSurrogate.variable!!.size) { null }
            )
            .map { (value, element) -> R4bString.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Dependent
    ): StructureMapGroupRuleDependentSurrogate =
      with(model) {
        StructureMapGroupRuleDependentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          variable =
            this@with.variable
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _variable =
            this@with.variable
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var source: MutableList<StructureMap.Group.Rule.Source>? = null,
  public var target: MutableList<StructureMap.Group.Rule.Target>? = null,
  public var rule: MutableList<StructureMap.Group.Rule>? = null,
  public var dependent: MutableList<StructureMap.Group.Rule.Dependent>? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): StructureMap.Group.Rule =
    StructureMap.Group.Rule(
      id = this@StructureMapGroupRuleSurrogate.id,
      extension = this@StructureMapGroupRuleSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@StructureMapGroupRuleSurrogate.modifierExtension ?: mutableListOf(),
      name =
        Id.of(
          this@StructureMapGroupRuleSurrogate.name,
          this@StructureMapGroupRuleSurrogate._name,
        )!!,
      source = this@StructureMapGroupRuleSurrogate.source ?: mutableListOf(),
      target = this@StructureMapGroupRuleSurrogate.target ?: mutableListOf(),
      rule = this@StructureMapGroupRuleSurrogate.rule ?: mutableListOf(),
      dependent = this@StructureMapGroupRuleSurrogate.dependent ?: mutableListOf(),
      documentation =
        R4bString.of(
          this@StructureMapGroupRuleSurrogate.documentation,
          this@StructureMapGroupRuleSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(model: StructureMap.Group.Rule): StructureMapGroupRuleSurrogate =
      with(model) {
        StructureMapGroupRuleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          source = this@with.source.takeUnless { it.all { it == null } },
          target = this@with.target.takeUnless { it.all { it == null } },
          rule = this@with.rule.takeUnless { it.all { it == null } },
          dependent = this@with.dependent.takeUnless { it.all { it == null } },
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class StructureMapGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var extends: KotlinString? = null,
  public var _extends: Element? = null,
  public var typeMode: KotlinString? = null,
  public var _typeMode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var input: MutableList<StructureMap.Group.Input>? = null,
  public var rule: MutableList<StructureMap.Group.Rule>? = null,
) {
  public fun toModel(): StructureMap.Group =
    StructureMap.Group(
      id = this@StructureMapGroupSurrogate.id,
      extension = this@StructureMapGroupSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@StructureMapGroupSurrogate.modifierExtension ?: mutableListOf(),
      name = Id.of(this@StructureMapGroupSurrogate.name, this@StructureMapGroupSurrogate._name)!!,
      extends =
        Id.of(this@StructureMapGroupSurrogate.extends, this@StructureMapGroupSurrogate._extends),
      typeMode =
        Enumeration.of(
          com.google.fhir.model.r4b.StructureMap.StructureMapGroupTypeMode.fromCode(
            this@StructureMapGroupSurrogate.typeMode!!
          ),
          this@StructureMapGroupSurrogate._typeMode,
        ),
      documentation =
        R4bString.of(
          this@StructureMapGroupSurrogate.documentation,
          this@StructureMapGroupSurrogate._documentation,
        ),
      input = this@StructureMapGroupSurrogate.input ?: mutableListOf(),
      rule = this@StructureMapGroupSurrogate.rule ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: StructureMap.Group): StructureMapGroupSurrogate =
      with(model) {
        StructureMapGroupSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          extends = this@with.extends?.value,
          _extends = this@with.extends?.toElement(),
          typeMode = this@with.typeMode.value?.getCode(),
          _typeMode = this@with.typeMode.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          input = this@with.input.takeUnless { it.all { it == null } },
          rule = this@with.rule.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class StructureMapSurrogate(
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
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var structure: MutableList<StructureMap.Structure>? = null,
  public var `import`: MutableList<KotlinString?>? = null,
  public var _import: MutableList<Element?>? = null,
  public var group: MutableList<StructureMap.Group>? = null,
) {
  public fun toModel(): StructureMap =
    StructureMap(
      id = this@StructureMapSurrogate.id,
      meta = this@StructureMapSurrogate.meta,
      implicitRules =
        Uri.of(this@StructureMapSurrogate.implicitRules, this@StructureMapSurrogate._implicitRules),
      language = Code.of(this@StructureMapSurrogate.language, this@StructureMapSurrogate._language),
      text = this@StructureMapSurrogate.text,
      contained = this@StructureMapSurrogate.contained ?: mutableListOf(),
      extension = this@StructureMapSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@StructureMapSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@StructureMapSurrogate.url, this@StructureMapSurrogate._url)!!,
      identifier = this@StructureMapSurrogate.identifier ?: mutableListOf(),
      version =
        R4bString.of(this@StructureMapSurrogate.version, this@StructureMapSurrogate._version),
      name = R4bString.of(this@StructureMapSurrogate.name, this@StructureMapSurrogate._name)!!,
      title = R4bString.of(this@StructureMapSurrogate.title, this@StructureMapSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(this@StructureMapSurrogate.status!!),
          this@StructureMapSurrogate._status,
        ),
      experimental =
        R4bBoolean.of(
          this@StructureMapSurrogate.experimental,
          this@StructureMapSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@StructureMapSurrogate.date),
          this@StructureMapSurrogate._date,
        ),
      publisher =
        R4bString.of(this@StructureMapSurrogate.publisher, this@StructureMapSurrogate._publisher),
      contact = this@StructureMapSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@StructureMapSurrogate.description,
          this@StructureMapSurrogate._description,
        ),
      useContext = this@StructureMapSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@StructureMapSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(this@StructureMapSurrogate.purpose, this@StructureMapSurrogate._purpose),
      copyright =
        Markdown.of(this@StructureMapSurrogate.copyright, this@StructureMapSurrogate._copyright),
      structure = this@StructureMapSurrogate.structure ?: mutableListOf(),
      `import` =
        if (
          this@StructureMapSurrogate.`import` == null && this@StructureMapSurrogate._import == null
        ) {
          mutableListOf()
        } else {
          (this@StructureMapSurrogate.`import`
              ?: List(this@StructureMapSurrogate._import!!.size) { null })
            .zip(
              this@StructureMapSurrogate._import
                ?: List(this@StructureMapSurrogate.`import`!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      group = this@StructureMapSurrogate.group ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: StructureMap): StructureMapSurrogate =
      with(model) {
        StructureMapSurrogate(
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
          url = this@with.url.value,
          _url = this@with.url.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name.value,
          _name = this@with.name.toElement(),
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
          structure = this@with.structure.takeUnless { it.all { it == null } },
          `import` =
            this@with.`import`
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _import =
            this@with.`import`
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          group = this@with.group.takeUnless { it.all { it == null } },
        )
      }
  }
}
