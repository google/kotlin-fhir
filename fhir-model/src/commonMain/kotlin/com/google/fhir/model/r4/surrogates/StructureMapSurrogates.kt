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
import com.google.fhir.model.r4.Enumeration
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
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Oid
import com.google.fhir.model.r4.ParameterDefinition
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.SampledData
import com.google.fhir.model.r4.Signature
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.StructureMap
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
internal data class StructureMapStructureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
    StructureMap.Structure().apply {
      id = this@StructureMapStructureSurrogate.id
      extension = this@StructureMapStructureSurrogate.extension
      modifierExtension = this@StructureMapStructureSurrogate.modifierExtension
      url =
        Canonical.of(
          this@StructureMapStructureSurrogate.url,
          this@StructureMapStructureSurrogate._url,
        )
      mode =
        Enumeration.of(
          this@StructureMapStructureSurrogate.mode?.let {
            com.google.fhir.model.r4.StructureMap.StructureMapModelMode.fromCode(it)
          },
          this@StructureMapStructureSurrogate._mode,
        )
      alias =
        R4String.of(
          this@StructureMapStructureSurrogate.alias,
          this@StructureMapStructureSurrogate._alias,
        )
      documentation =
        R4String.of(
          this@StructureMapStructureSurrogate.documentation,
          this@StructureMapStructureSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(model: StructureMap.Structure): StructureMapStructureSurrogate =
      with(model) {
        StructureMapStructureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          alias = this@with.alias?.value
          _alias = this@with.alias?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
    StructureMap.Group.Input().apply {
      id = this@StructureMapGroupInputSurrogate.id
      extension = this@StructureMapGroupInputSurrogate.extension
      modifierExtension = this@StructureMapGroupInputSurrogate.modifierExtension
      name =
        Id.of(this@StructureMapGroupInputSurrogate.name, this@StructureMapGroupInputSurrogate._name)
      type =
        R4String.of(
          this@StructureMapGroupInputSurrogate.type,
          this@StructureMapGroupInputSurrogate._type,
        )
      mode =
        Enumeration.of(
          this@StructureMapGroupInputSurrogate.mode?.let {
            com.google.fhir.model.r4.StructureMap.StructureMapInputMode.fromCode(it)
          },
          this@StructureMapGroupInputSurrogate._mode,
        )
      documentation =
        R4String.of(
          this@StructureMapGroupInputSurrogate.documentation,
          this@StructureMapGroupInputSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(model: StructureMap.Group.Input): StructureMapGroupInputSurrogate =
      with(model) {
        StructureMapGroupInputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleSourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var context: KotlinString? = null,
  public var _context: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
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
) {
  public fun toModel(): StructureMap.Group.Rule.Source =
    StructureMap.Group.Rule.Source().apply {
      id = this@StructureMapGroupRuleSourceSurrogate.id
      extension = this@StructureMapGroupRuleSourceSurrogate.extension
      modifierExtension = this@StructureMapGroupRuleSourceSurrogate.modifierExtension
      context =
        Id.of(
          this@StructureMapGroupRuleSourceSurrogate.context,
          this@StructureMapGroupRuleSourceSurrogate._context,
        )
      min =
        Integer.of(
          this@StructureMapGroupRuleSourceSurrogate.min,
          this@StructureMapGroupRuleSourceSurrogate._min,
        )
      max =
        R4String.of(
          this@StructureMapGroupRuleSourceSurrogate.max,
          this@StructureMapGroupRuleSourceSurrogate._max,
        )
      type =
        R4String.of(
          this@StructureMapGroupRuleSourceSurrogate.type,
          this@StructureMapGroupRuleSourceSurrogate._type,
        )
      defaultValue =
        StructureMap.Group.Rule.Source.DefaultValue?.from(
          Base64Binary.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueBase64Binary,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueBase64Binary,
          ),
          R4Boolean.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueBoolean,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueBoolean,
          ),
          Canonical.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueCanonical,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueCanonical,
          ),
          Code.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueCode,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueCode,
          ),
          Date.of(
            FhirDate.fromString(this@StructureMapGroupRuleSourceSurrogate.defaultValueDate),
            this@StructureMapGroupRuleSourceSurrogate._defaultValueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@StructureMapGroupRuleSourceSurrogate.defaultValueDateTime),
            this@StructureMapGroupRuleSourceSurrogate._defaultValueDateTime,
          ),
          Decimal.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueDecimal,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueDecimal,
          ),
          Id.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueId,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueId,
          ),
          Instant.of(
            FhirDateTime.fromString(this@StructureMapGroupRuleSourceSurrogate.defaultValueInstant),
            this@StructureMapGroupRuleSourceSurrogate._defaultValueInstant,
          ),
          Integer.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueInteger,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueInteger,
          ),
          Markdown.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueMarkdown,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueMarkdown,
          ),
          Oid.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueOid,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueOid,
          ),
          PositiveInt.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValuePositiveInt,
            this@StructureMapGroupRuleSourceSurrogate._defaultValuePositiveInt,
          ),
          R4String.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueString,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueString,
          ),
          Time.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueTime,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueTime,
          ),
          UnsignedInt.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueUnsignedInt,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueUnsignedInt,
          ),
          Uri.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueUri,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueUri,
          ),
          Url.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueUrl,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueUrl,
          ),
          Uuid.of(
            this@StructureMapGroupRuleSourceSurrogate.defaultValueUuid,
            this@StructureMapGroupRuleSourceSurrogate._defaultValueUuid,
          ),
          this@StructureMapGroupRuleSourceSurrogate.defaultValueAddress,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueAge,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueAnnotation,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueAttachment,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueCodeableConcept,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueCoding,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueContactPoint,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueCount,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueDistance,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueDuration,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueHumanName,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueIdentifier,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueMoney,
          this@StructureMapGroupRuleSourceSurrogate.defaultValuePeriod,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueQuantity,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueRange,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueRatio,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueReference,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueSampledData,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueSignature,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueTiming,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueContactDetail,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueContributor,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueDataRequirement,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueExpression,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueParameterDefinition,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueRelatedArtifact,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueTriggerDefinition,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueUsageContext,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueDosage,
          this@StructureMapGroupRuleSourceSurrogate.defaultValueMeta,
        )
      element =
        R4String.of(
          this@StructureMapGroupRuleSourceSurrogate.element,
          this@StructureMapGroupRuleSourceSurrogate._element,
        )
      listMode =
        Enumeration.of(
          this@StructureMapGroupRuleSourceSurrogate.listMode?.let {
            com.google.fhir.model.r4.StructureMap.StructureMapSourceListMode.fromCode(it)
          },
          this@StructureMapGroupRuleSourceSurrogate._listMode,
        )
      variable =
        Id.of(
          this@StructureMapGroupRuleSourceSurrogate.variable,
          this@StructureMapGroupRuleSourceSurrogate._variable,
        )
      condition =
        R4String.of(
          this@StructureMapGroupRuleSourceSurrogate.condition,
          this@StructureMapGroupRuleSourceSurrogate._condition,
        )
      check =
        R4String.of(
          this@StructureMapGroupRuleSourceSurrogate.check,
          this@StructureMapGroupRuleSourceSurrogate._check,
        )
      logMessage =
        R4String.of(
          this@StructureMapGroupRuleSourceSurrogate.logMessage,
          this@StructureMapGroupRuleSourceSurrogate._logMessage,
        )
    }

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Source
    ): StructureMapGroupRuleSourceSurrogate =
      with(model) {
        StructureMapGroupRuleSourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          context = this@with.context?.value
          _context = this@with.context?.toElement()
          min = this@with.min?.value
          _min = this@with.min?.toElement()
          max = this@with.max?.value
          _max = this@with.max?.toElement()
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          defaultValueBase64Binary = this@with.defaultValue?.asBase64Binary()?.value?.value
          _defaultValueBase64Binary = this@with.defaultValue?.asBase64Binary()?.value?.toElement()
          defaultValueBoolean = this@with.defaultValue?.asBoolean()?.value?.value
          _defaultValueBoolean = this@with.defaultValue?.asBoolean()?.value?.toElement()
          defaultValueCanonical = this@with.defaultValue?.asCanonical()?.value?.value
          _defaultValueCanonical = this@with.defaultValue?.asCanonical()?.value?.toElement()
          defaultValueCode = this@with.defaultValue?.asCode()?.value?.value
          _defaultValueCode = this@with.defaultValue?.asCode()?.value?.toElement()
          defaultValueDate = this@with.defaultValue?.asDate()?.value?.value?.toString()
          _defaultValueDate = this@with.defaultValue?.asDate()?.value?.toElement()
          defaultValueDateTime = this@with.defaultValue?.asDateTime()?.value?.value?.toString()
          _defaultValueDateTime = this@with.defaultValue?.asDateTime()?.value?.toElement()
          defaultValueDecimal = this@with.defaultValue?.asDecimal()?.value?.value
          _defaultValueDecimal = this@with.defaultValue?.asDecimal()?.value?.toElement()
          defaultValueId = this@with.defaultValue?.asId()?.value?.value
          _defaultValueId = this@with.defaultValue?.asId()?.value?.toElement()
          defaultValueInstant = this@with.defaultValue?.asInstant()?.value?.value?.toString()
          _defaultValueInstant = this@with.defaultValue?.asInstant()?.value?.toElement()
          defaultValueInteger = this@with.defaultValue?.asInteger()?.value?.value
          _defaultValueInteger = this@with.defaultValue?.asInteger()?.value?.toElement()
          defaultValueMarkdown = this@with.defaultValue?.asMarkdown()?.value?.value
          _defaultValueMarkdown = this@with.defaultValue?.asMarkdown()?.value?.toElement()
          defaultValueOid = this@with.defaultValue?.asOid()?.value?.value
          _defaultValueOid = this@with.defaultValue?.asOid()?.value?.toElement()
          defaultValuePositiveInt = this@with.defaultValue?.asPositiveInt()?.value?.value
          _defaultValuePositiveInt = this@with.defaultValue?.asPositiveInt()?.value?.toElement()
          defaultValueString = this@with.defaultValue?.asString()?.value?.value
          _defaultValueString = this@with.defaultValue?.asString()?.value?.toElement()
          defaultValueTime = this@with.defaultValue?.asTime()?.value?.value
          _defaultValueTime = this@with.defaultValue?.asTime()?.value?.toElement()
          defaultValueUnsignedInt = this@with.defaultValue?.asUnsignedInt()?.value?.value
          _defaultValueUnsignedInt = this@with.defaultValue?.asUnsignedInt()?.value?.toElement()
          defaultValueUri = this@with.defaultValue?.asUri()?.value?.value
          _defaultValueUri = this@with.defaultValue?.asUri()?.value?.toElement()
          defaultValueUrl = this@with.defaultValue?.asUrl()?.value?.value
          _defaultValueUrl = this@with.defaultValue?.asUrl()?.value?.toElement()
          defaultValueUuid = this@with.defaultValue?.asUuid()?.value?.value
          _defaultValueUuid = this@with.defaultValue?.asUuid()?.value?.toElement()
          defaultValueAddress = this@with.defaultValue?.asAddress()?.value
          defaultValueAge = this@with.defaultValue?.asAge()?.value
          defaultValueAnnotation = this@with.defaultValue?.asAnnotation()?.value
          defaultValueAttachment = this@with.defaultValue?.asAttachment()?.value
          defaultValueCodeableConcept = this@with.defaultValue?.asCodeableConcept()?.value
          defaultValueCoding = this@with.defaultValue?.asCoding()?.value
          defaultValueContactPoint = this@with.defaultValue?.asContactPoint()?.value
          defaultValueCount = this@with.defaultValue?.asCount()?.value
          defaultValueDistance = this@with.defaultValue?.asDistance()?.value
          defaultValueDuration = this@with.defaultValue?.asDuration()?.value
          defaultValueHumanName = this@with.defaultValue?.asHumanName()?.value
          defaultValueIdentifier = this@with.defaultValue?.asIdentifier()?.value
          defaultValueMoney = this@with.defaultValue?.asMoney()?.value
          defaultValuePeriod = this@with.defaultValue?.asPeriod()?.value
          defaultValueQuantity = this@with.defaultValue?.asQuantity()?.value
          defaultValueRange = this@with.defaultValue?.asRange()?.value
          defaultValueRatio = this@with.defaultValue?.asRatio()?.value
          defaultValueReference = this@with.defaultValue?.asReference()?.value
          defaultValueSampledData = this@with.defaultValue?.asSampledData()?.value
          defaultValueSignature = this@with.defaultValue?.asSignature()?.value
          defaultValueTiming = this@with.defaultValue?.asTiming()?.value
          defaultValueContactDetail = this@with.defaultValue?.asContactDetail()?.value
          defaultValueContributor = this@with.defaultValue?.asContributor()?.value
          defaultValueDataRequirement = this@with.defaultValue?.asDataRequirement()?.value
          defaultValueExpression = this@with.defaultValue?.asExpression()?.value
          defaultValueParameterDefinition = this@with.defaultValue?.asParameterDefinition()?.value
          defaultValueRelatedArtifact = this@with.defaultValue?.asRelatedArtifact()?.value
          defaultValueTriggerDefinition = this@with.defaultValue?.asTriggerDefinition()?.value
          defaultValueUsageContext = this@with.defaultValue?.asUsageContext()?.value
          defaultValueDosage = this@with.defaultValue?.asDosage()?.value
          defaultValueMeta = this@with.defaultValue?.asMeta()?.value
          element = this@with.element?.value
          _element = this@with.element?.toElement()
          listMode = this@with.listMode?.value?.getCode()
          _listMode = this@with.listMode?.toElement()
          variable = this@with.variable?.value
          _variable = this@with.variable?.toElement()
          condition = this@with.condition?.value
          _condition = this@with.condition?.toElement()
          check = this@with.check?.value
          _check = this@with.check?.toElement()
          logMessage = this@with.logMessage?.value
          _logMessage = this@with.logMessage?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleTargetParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
  public fun toModel(): StructureMap.Group.Rule.Target.Parameter =
    StructureMap.Group.Rule.Target.Parameter().apply {
      id = this@StructureMapGroupRuleTargetParameterSurrogate.id
      extension = this@StructureMapGroupRuleTargetParameterSurrogate.extension
      modifierExtension = this@StructureMapGroupRuleTargetParameterSurrogate.modifierExtension
      `value` =
        StructureMap.Group.Rule.Target.Parameter.Value?.from(
          Id.of(
            this@StructureMapGroupRuleTargetParameterSurrogate.valueId,
            this@StructureMapGroupRuleTargetParameterSurrogate._valueId,
          ),
          R4String.of(
            this@StructureMapGroupRuleTargetParameterSurrogate.valueString,
            this@StructureMapGroupRuleTargetParameterSurrogate._valueString,
          ),
          R4Boolean.of(
            this@StructureMapGroupRuleTargetParameterSurrogate.valueBoolean,
            this@StructureMapGroupRuleTargetParameterSurrogate._valueBoolean,
          ),
          Integer.of(
            this@StructureMapGroupRuleTargetParameterSurrogate.valueInteger,
            this@StructureMapGroupRuleTargetParameterSurrogate._valueInteger,
          ),
          Decimal.of(
            this@StructureMapGroupRuleTargetParameterSurrogate.valueDecimal,
            this@StructureMapGroupRuleTargetParameterSurrogate._valueDecimal,
          ),
        )
    }

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Target.Parameter
    ): StructureMapGroupRuleTargetParameterSurrogate =
      with(model) {
        StructureMapGroupRuleTargetParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          valueId = this@with.`value`?.asId()?.value?.value
          _valueId = this@with.`value`?.asId()?.value?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var context: KotlinString? = null,
  public var _context: Element? = null,
  public var contextType: KotlinString? = null,
  public var _contextType: Element? = null,
  public var element: KotlinString? = null,
  public var _element: Element? = null,
  public var variable: KotlinString? = null,
  public var _variable: Element? = null,
  public var listMode: List<KotlinString?>? = null,
  public var _listMode: List<Element?>? = null,
  public var listRuleId: KotlinString? = null,
  public var _listRuleId: Element? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var parameter: List<StructureMap.Group.Rule.Target.Parameter>? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Target =
    StructureMap.Group.Rule.Target().apply {
      id = this@StructureMapGroupRuleTargetSurrogate.id
      extension = this@StructureMapGroupRuleTargetSurrogate.extension
      modifierExtension = this@StructureMapGroupRuleTargetSurrogate.modifierExtension
      context =
        Id.of(
          this@StructureMapGroupRuleTargetSurrogate.context,
          this@StructureMapGroupRuleTargetSurrogate._context,
        )
      contextType =
        Enumeration.of(
          this@StructureMapGroupRuleTargetSurrogate.contextType?.let {
            com.google.fhir.model.r4.StructureMap.StructureMapContextType.fromCode(it)
          },
          this@StructureMapGroupRuleTargetSurrogate._contextType,
        )
      element =
        R4String.of(
          this@StructureMapGroupRuleTargetSurrogate.element,
          this@StructureMapGroupRuleTargetSurrogate._element,
        )
      variable =
        Id.of(
          this@StructureMapGroupRuleTargetSurrogate.variable,
          this@StructureMapGroupRuleTargetSurrogate._variable,
        )
      listMode =
        if (
          this@StructureMapGroupRuleTargetSurrogate.listMode == null &&
            this@StructureMapGroupRuleTargetSurrogate._listMode == null
        ) {
          null
        } else {
          (this@StructureMapGroupRuleTargetSurrogate.listMode
              ?: List(this@StructureMapGroupRuleTargetSurrogate._listMode!!.size) { null })
            .zip(
              this@StructureMapGroupRuleTargetSurrogate._listMode
                ?: List(this@StructureMapGroupRuleTargetSurrogate.listMode!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let {
                  com.google.fhir.model.r4.StructureMap.StructureMapTargetListMode.fromCode(it)
                },
                element,
              )
            }
        }
      listRuleId =
        Id.of(
          this@StructureMapGroupRuleTargetSurrogate.listRuleId,
          this@StructureMapGroupRuleTargetSurrogate._listRuleId,
        )
      transform =
        Enumeration.of(
          this@StructureMapGroupRuleTargetSurrogate.transform?.let {
            com.google.fhir.model.r4.StructureMap.StructureMapTransform.fromCode(it)
          },
          this@StructureMapGroupRuleTargetSurrogate._transform,
        )
      parameter = this@StructureMapGroupRuleTargetSurrogate.parameter
    }

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Target
    ): StructureMapGroupRuleTargetSurrogate =
      with(model) {
        StructureMapGroupRuleTargetSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          context = this@with.context?.value
          _context = this@with.context?.toElement()
          contextType = this@with.contextType?.value?.getCode()
          _contextType = this@with.contextType?.toElement()
          element = this@with.element?.value
          _element = this@with.element?.toElement()
          variable = this@with.variable?.value
          _variable = this@with.variable?.toElement()
          listMode =
            this@with.listMode?.map { it?.value?.getCode() }?.takeUnless { it.all { it == null } }
          _listMode =
            this@with.listMode?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          listRuleId = this@with.listRuleId?.value
          _listRuleId = this@with.listRuleId?.toElement()
          transform = this@with.transform?.value?.getCode()
          _transform = this@with.transform?.toElement()
          parameter = this@with.parameter
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleDependentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var variable: List<KotlinString?>? = null,
  public var _variable: List<Element?>? = null,
) {
  public fun toModel(): StructureMap.Group.Rule.Dependent =
    StructureMap.Group.Rule.Dependent().apply {
      id = this@StructureMapGroupRuleDependentSurrogate.id
      extension = this@StructureMapGroupRuleDependentSurrogate.extension
      modifierExtension = this@StructureMapGroupRuleDependentSurrogate.modifierExtension
      name =
        Id.of(
          this@StructureMapGroupRuleDependentSurrogate.name,
          this@StructureMapGroupRuleDependentSurrogate._name,
        )
      variable =
        if (
          this@StructureMapGroupRuleDependentSurrogate.variable == null &&
            this@StructureMapGroupRuleDependentSurrogate._variable == null
        ) {
          null
        } else {
          (this@StructureMapGroupRuleDependentSurrogate.variable
              ?: List(this@StructureMapGroupRuleDependentSurrogate._variable!!.size) { null })
            .zip(
              this@StructureMapGroupRuleDependentSurrogate._variable
                ?: List(this@StructureMapGroupRuleDependentSurrogate.variable!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: StructureMap.Group.Rule.Dependent
    ): StructureMapGroupRuleDependentSurrogate =
      with(model) {
        StructureMapGroupRuleDependentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          variable = this@with.variable?.map { it?.value }?.takeUnless { it.all { it == null } }
          _variable =
            this@with.variable?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupRuleSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var source: List<StructureMap.Group.Rule.Source>? = null,
  public var target: List<StructureMap.Group.Rule.Target>? = null,
  public var rule: List<StructureMap.Group.Rule?>? = null,
  public var dependent: List<StructureMap.Group.Rule.Dependent>? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): StructureMap.Group.Rule =
    StructureMap.Group.Rule().apply {
      id = this@StructureMapGroupRuleSurrogate.id
      extension = this@StructureMapGroupRuleSurrogate.extension
      modifierExtension = this@StructureMapGroupRuleSurrogate.modifierExtension
      name =
        Id.of(this@StructureMapGroupRuleSurrogate.name, this@StructureMapGroupRuleSurrogate._name)
      source = this@StructureMapGroupRuleSurrogate.source
      target = this@StructureMapGroupRuleSurrogate.target
      rule = this@StructureMapGroupRuleSurrogate.rule
      dependent = this@StructureMapGroupRuleSurrogate.dependent
      documentation =
        R4String.of(
          this@StructureMapGroupRuleSurrogate.documentation,
          this@StructureMapGroupRuleSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(model: StructureMap.Group.Rule): StructureMapGroupRuleSurrogate =
      with(model) {
        StructureMapGroupRuleSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          source = this@with.source
          target = this@with.target
          rule = this@with.rule
          dependent = this@with.dependent
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureMapGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var extends: KotlinString? = null,
  public var _extends: Element? = null,
  public var typeMode: KotlinString? = null,
  public var _typeMode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var input: List<StructureMap.Group.Input>? = null,
  public var rule: List<StructureMap.Group.Rule>? = null,
) {
  public fun toModel(): StructureMap.Group =
    StructureMap.Group().apply {
      id = this@StructureMapGroupSurrogate.id
      extension = this@StructureMapGroupSurrogate.extension
      modifierExtension = this@StructureMapGroupSurrogate.modifierExtension
      name = Id.of(this@StructureMapGroupSurrogate.name, this@StructureMapGroupSurrogate._name)
      extends =
        Id.of(this@StructureMapGroupSurrogate.extends, this@StructureMapGroupSurrogate._extends)
      typeMode =
        Enumeration.of(
          this@StructureMapGroupSurrogate.typeMode?.let {
            com.google.fhir.model.r4.StructureMap.StructureMapGroupTypeMode.fromCode(it)
          },
          this@StructureMapGroupSurrogate._typeMode,
        )
      documentation =
        R4String.of(
          this@StructureMapGroupSurrogate.documentation,
          this@StructureMapGroupSurrogate._documentation,
        )
      input = this@StructureMapGroupSurrogate.input
      rule = this@StructureMapGroupSurrogate.rule
    }

  public companion object {
    public fun fromModel(model: StructureMap.Group): StructureMapGroupSurrogate =
      with(model) {
        StructureMapGroupSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          extends = this@with.extends?.value
          _extends = this@with.extends?.toElement()
          typeMode = this@with.typeMode?.value?.getCode()
          _typeMode = this@with.typeMode?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          input = this@with.input
          rule = this@with.rule
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
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
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var structure: List<StructureMap.Structure>? = null,
  public var `import`: List<KotlinString?>? = null,
  public var _import: List<Element?>? = null,
  public var group: List<StructureMap.Group>? = null,
) {
  public fun toModel(): StructureMap =
    StructureMap().apply {
      id = this@StructureMapSurrogate.id
      meta = this@StructureMapSurrogate.meta
      implicitRules =
        Uri.of(this@StructureMapSurrogate.implicitRules, this@StructureMapSurrogate._implicitRules)
      language = Code.of(this@StructureMapSurrogate.language, this@StructureMapSurrogate._language)
      text = this@StructureMapSurrogate.text
      contained = this@StructureMapSurrogate.contained
      extension = this@StructureMapSurrogate.extension
      modifierExtension = this@StructureMapSurrogate.modifierExtension
      url = Uri.of(this@StructureMapSurrogate.url, this@StructureMapSurrogate._url)
      identifier = this@StructureMapSurrogate.identifier
      version = R4String.of(this@StructureMapSurrogate.version, this@StructureMapSurrogate._version)
      name = R4String.of(this@StructureMapSurrogate.name, this@StructureMapSurrogate._name)
      title = R4String.of(this@StructureMapSurrogate.title, this@StructureMapSurrogate._title)
      status =
        Enumeration.of(
          this@StructureMapSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@StructureMapSurrogate._status,
        )
      experimental =
        R4Boolean.of(
          this@StructureMapSurrogate.experimental,
          this@StructureMapSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@StructureMapSurrogate.date),
          this@StructureMapSurrogate._date,
        )
      publisher =
        R4String.of(this@StructureMapSurrogate.publisher, this@StructureMapSurrogate._publisher)
      contact = this@StructureMapSurrogate.contact
      description =
        Markdown.of(this@StructureMapSurrogate.description, this@StructureMapSurrogate._description)
      useContext = this@StructureMapSurrogate.useContext
      jurisdiction = this@StructureMapSurrogate.jurisdiction
      purpose = Markdown.of(this@StructureMapSurrogate.purpose, this@StructureMapSurrogate._purpose)
      copyright =
        Markdown.of(this@StructureMapSurrogate.copyright, this@StructureMapSurrogate._copyright)
      structure = this@StructureMapSurrogate.structure
      `import` =
        if (
          this@StructureMapSurrogate.`import` == null && this@StructureMapSurrogate._import == null
        ) {
          null
        } else {
          (this@StructureMapSurrogate.`import`
              ?: List(this@StructureMapSurrogate._import!!.size) { null })
            .zip(
              this@StructureMapSurrogate._import
                ?: List(this@StructureMapSurrogate.`import`!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      group = this@StructureMapSurrogate.group
    }

  public companion object {
    public fun fromModel(model: StructureMap): StructureMapSurrogate =
      with(model) {
        StructureMapSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          structure = this@with.structure
          `import` = this@with.`import`?.map { it?.value }?.takeUnless { it.all { it == null } }
          _import =
            this@with.`import`?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          group = this@with.group
        }
      }
  }
}
