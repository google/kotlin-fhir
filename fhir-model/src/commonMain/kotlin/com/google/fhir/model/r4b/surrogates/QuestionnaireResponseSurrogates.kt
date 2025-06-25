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

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.QuestionnaireResponse
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Time
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
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
internal data class QuestionnaireResponseItemAnswerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueDecimal: Double? = null,
  public var _valueDecimal: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valueTime: LocalTime? = null,
  public var _valueTime: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueUri: KotlinString? = null,
  public var _valueUri: Element? = null,
  public var valueAttachment: Attachment? = null,
  public var valueCoding: Coding? = null,
  public var valueQuantity: Quantity? = null,
  public var valueReference: Reference? = null,
  public var item: List<QuestionnaireResponse.Item?>? = null,
) {
  public fun toModel(): QuestionnaireResponse.Item.Answer =
    QuestionnaireResponse.Item.Answer().apply {
      id = this@QuestionnaireResponseItemAnswerSurrogate.id
      extension = this@QuestionnaireResponseItemAnswerSurrogate.extension
      modifierExtension = this@QuestionnaireResponseItemAnswerSurrogate.modifierExtension
      `value` =
        QuestionnaireResponse.Item.Answer.Value?.from(
          R4bBoolean.of(
            this@QuestionnaireResponseItemAnswerSurrogate.valueBoolean,
            this@QuestionnaireResponseItemAnswerSurrogate._valueBoolean,
          ),
          Decimal.of(
            this@QuestionnaireResponseItemAnswerSurrogate.valueDecimal,
            this@QuestionnaireResponseItemAnswerSurrogate._valueDecimal,
          ),
          Integer.of(
            this@QuestionnaireResponseItemAnswerSurrogate.valueInteger,
            this@QuestionnaireResponseItemAnswerSurrogate._valueInteger,
          ),
          Date.of(
            FhirDate.fromString(this@QuestionnaireResponseItemAnswerSurrogate.valueDate),
            this@QuestionnaireResponseItemAnswerSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@QuestionnaireResponseItemAnswerSurrogate.valueDateTime),
            this@QuestionnaireResponseItemAnswerSurrogate._valueDateTime,
          ),
          Time.of(
            this@QuestionnaireResponseItemAnswerSurrogate.valueTime,
            this@QuestionnaireResponseItemAnswerSurrogate._valueTime,
          ),
          R4bString.of(
            this@QuestionnaireResponseItemAnswerSurrogate.valueString,
            this@QuestionnaireResponseItemAnswerSurrogate._valueString,
          ),
          Uri.of(
            this@QuestionnaireResponseItemAnswerSurrogate.valueUri,
            this@QuestionnaireResponseItemAnswerSurrogate._valueUri,
          ),
          this@QuestionnaireResponseItemAnswerSurrogate.valueAttachment,
          this@QuestionnaireResponseItemAnswerSurrogate.valueCoding,
          this@QuestionnaireResponseItemAnswerSurrogate.valueQuantity,
          this@QuestionnaireResponseItemAnswerSurrogate.valueReference,
        )
      item = this@QuestionnaireResponseItemAnswerSurrogate.item
    }

  public companion object {
    public fun fromModel(
      model: QuestionnaireResponse.Item.Answer
    ): QuestionnaireResponseItemAnswerSurrogate =
      with(model) {
        QuestionnaireResponseItemAnswerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueDecimal = this@with.`value`?.asDecimal()?.value?.value
          _valueDecimal = this@with.`value`?.asDecimal()?.value?.toElement()
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString()
          _valueDate = this@with.`value`?.asDate()?.value?.toElement()
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement()
          valueTime = this@with.`value`?.asTime()?.value?.value
          _valueTime = this@with.`value`?.asTime()?.value?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueUri = this@with.`value`?.asUri()?.value?.value
          _valueUri = this@with.`value`?.asUri()?.value?.toElement()
          valueAttachment = this@with.`value`?.asAttachment()?.value
          valueCoding = this@with.`value`?.asCoding()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueReference = this@with.`value`?.asReference()?.value
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class QuestionnaireResponseItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var answer: List<QuestionnaireResponse.Item.Answer>? = null,
  public var item: List<QuestionnaireResponse.Item?>? = null,
) {
  public fun toModel(): QuestionnaireResponse.Item =
    QuestionnaireResponse.Item().apply {
      id = this@QuestionnaireResponseItemSurrogate.id
      extension = this@QuestionnaireResponseItemSurrogate.extension
      modifierExtension = this@QuestionnaireResponseItemSurrogate.modifierExtension
      linkId =
        R4bString.of(
          this@QuestionnaireResponseItemSurrogate.linkId,
          this@QuestionnaireResponseItemSurrogate._linkId,
        )
      definition =
        Uri.of(
          this@QuestionnaireResponseItemSurrogate.definition,
          this@QuestionnaireResponseItemSurrogate._definition,
        )
      text =
        R4bString.of(
          this@QuestionnaireResponseItemSurrogate.text,
          this@QuestionnaireResponseItemSurrogate._text,
        )
      answer = this@QuestionnaireResponseItemSurrogate.answer
      item = this@QuestionnaireResponseItemSurrogate.item
    }

  public companion object {
    public fun fromModel(model: QuestionnaireResponse.Item): QuestionnaireResponseItemSurrogate =
      with(model) {
        QuestionnaireResponseItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          answer = this@with.answer
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class QuestionnaireResponseSurrogate(
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
  public var identifier: Identifier? = null,
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var questionnaire: KotlinString? = null,
  public var _questionnaire: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var authored: KotlinString? = null,
  public var _authored: Element? = null,
  public var author: Reference? = null,
  public var source: Reference? = null,
  public var item: List<QuestionnaireResponse.Item>? = null,
) {
  public fun toModel(): QuestionnaireResponse =
    QuestionnaireResponse().apply {
      id = this@QuestionnaireResponseSurrogate.id
      meta = this@QuestionnaireResponseSurrogate.meta
      implicitRules =
        Uri.of(
          this@QuestionnaireResponseSurrogate.implicitRules,
          this@QuestionnaireResponseSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@QuestionnaireResponseSurrogate.language,
          this@QuestionnaireResponseSurrogate._language,
        )
      text = this@QuestionnaireResponseSurrogate.text
      contained = this@QuestionnaireResponseSurrogate.contained
      extension = this@QuestionnaireResponseSurrogate.extension
      modifierExtension = this@QuestionnaireResponseSurrogate.modifierExtension
      identifier = this@QuestionnaireResponseSurrogate.identifier
      basedOn = this@QuestionnaireResponseSurrogate.basedOn
      partOf = this@QuestionnaireResponseSurrogate.partOf
      questionnaire =
        Canonical.of(
          this@QuestionnaireResponseSurrogate.questionnaire,
          this@QuestionnaireResponseSurrogate._questionnaire,
        )
      status =
        Enumeration.of(
          this@QuestionnaireResponseSurrogate.status?.let {
            com.google.fhir.model.r4b.QuestionnaireResponse.QuestionnaireResponseStatus.fromCode(it)
          },
          this@QuestionnaireResponseSurrogate._status,
        )
      subject = this@QuestionnaireResponseSurrogate.subject
      encounter = this@QuestionnaireResponseSurrogate.encounter
      authored =
        DateTime.of(
          FhirDateTime.fromString(this@QuestionnaireResponseSurrogate.authored),
          this@QuestionnaireResponseSurrogate._authored,
        )
      author = this@QuestionnaireResponseSurrogate.author
      source = this@QuestionnaireResponseSurrogate.source
      item = this@QuestionnaireResponseSurrogate.item
    }

  public companion object {
    public fun fromModel(model: QuestionnaireResponse): QuestionnaireResponseSurrogate =
      with(model) {
        QuestionnaireResponseSurrogate().apply {
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
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          questionnaire = this@with.questionnaire?.value
          _questionnaire = this@with.questionnaire?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          subject = this@with.subject
          encounter = this@with.encounter
          authored = this@with.authored?.value?.toString()
          _authored = this@with.authored?.toElement()
          author = this@with.author
          source = this@with.source
          item = this@with.item
        }
      }
  }
}
