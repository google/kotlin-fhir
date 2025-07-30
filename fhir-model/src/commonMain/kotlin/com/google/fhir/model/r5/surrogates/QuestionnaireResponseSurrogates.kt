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

import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.QuestionnaireResponse
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Uri
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
internal data class QuestionnaireResponseItemAnswerValueSurrogate(
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
) {
  public fun toModel(): QuestionnaireResponse.Item.Answer.Value =
    QuestionnaireResponse.Item.Answer.Value.from(
      R5Boolean.of(
        this@QuestionnaireResponseItemAnswerValueSurrogate.valueBoolean,
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueBoolean,
      ),
      Decimal.of(
        this@QuestionnaireResponseItemAnswerValueSurrogate.valueDecimal,
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueDecimal,
      ),
      Integer.of(
        this@QuestionnaireResponseItemAnswerValueSurrogate.valueInteger,
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueInteger,
      ),
      Date.of(
        FhirDate.fromString(this@QuestionnaireResponseItemAnswerValueSurrogate.valueDate),
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@QuestionnaireResponseItemAnswerValueSurrogate.valueDateTime),
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueDateTime,
      ),
      Time.of(
        this@QuestionnaireResponseItemAnswerValueSurrogate.valueTime,
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueTime,
      ),
      R5String.of(
        this@QuestionnaireResponseItemAnswerValueSurrogate.valueString,
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueString,
      ),
      Uri.of(
        this@QuestionnaireResponseItemAnswerValueSurrogate.valueUri,
        this@QuestionnaireResponseItemAnswerValueSurrogate._valueUri,
      ),
      this@QuestionnaireResponseItemAnswerValueSurrogate.valueAttachment,
      this@QuestionnaireResponseItemAnswerValueSurrogate.valueCoding,
      this@QuestionnaireResponseItemAnswerValueSurrogate.valueQuantity,
      this@QuestionnaireResponseItemAnswerValueSurrogate.valueReference,
    )!! !!

  public companion object {
    public fun fromModel(
      model: QuestionnaireResponse.Item.Answer.Value
    ): QuestionnaireResponseItemAnswerValueSurrogate =
      with(model) {
        QuestionnaireResponseItemAnswerValueSurrogate(
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
          valueDecimal = this@with.asDecimal()?.value?.value,
          _valueDecimal = this@with.asDecimal()?.value?.toElement(),
          valueInteger = this@with.asInteger()?.value?.value,
          _valueInteger = this@with.asInteger()?.value?.toElement(),
          valueDate = this@with.asDate()?.value?.value?.toString(),
          _valueDate = this@with.asDate()?.value?.toElement(),
          valueDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.asDateTime()?.value?.toElement(),
          valueTime = this@with.asTime()?.value?.value,
          _valueTime = this@with.asTime()?.value?.toElement(),
          valueString = this@with.asString()?.value?.value,
          _valueString = this@with.asString()?.value?.toElement(),
          valueUri = this@with.asUri()?.value?.value,
          _valueUri = this@with.asUri()?.value?.toElement(),
          valueAttachment = this@with.asAttachment()?.value,
          valueCoding = this@with.asCoding()?.value,
          valueQuantity = this@with.asQuantity()?.value,
          valueReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class QuestionnaireResponseItemAnswerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: MutableList<QuestionnaireResponse.Item>? = null,
  public var `value`: QuestionnaireResponse.Item.Answer.Value,
) {
  public fun toModel(): QuestionnaireResponse.Item.Answer =
    QuestionnaireResponse.Item.Answer(
      id = this@QuestionnaireResponseItemAnswerSurrogate.id,
      extension = this@QuestionnaireResponseItemAnswerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@QuestionnaireResponseItemAnswerSurrogate.modifierExtension ?: mutableListOf(),
      `value` = this@QuestionnaireResponseItemAnswerSurrogate.`value`,
      item = this@QuestionnaireResponseItemAnswerSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: QuestionnaireResponse.Item.Answer
    ): QuestionnaireResponseItemAnswerSurrogate =
      with(model) {
        QuestionnaireResponseItemAnswerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
          item = this@with.item.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class QuestionnaireResponseItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var answer: MutableList<QuestionnaireResponse.Item.Answer>? = null,
  public var item: MutableList<QuestionnaireResponse.Item>? = null,
) {
  public fun toModel(): QuestionnaireResponse.Item =
    QuestionnaireResponse.Item(
      id = this@QuestionnaireResponseItemSurrogate.id,
      extension = this@QuestionnaireResponseItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@QuestionnaireResponseItemSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@QuestionnaireResponseItemSurrogate.linkId,
          this@QuestionnaireResponseItemSurrogate._linkId,
        )!!,
      definition =
        Uri.of(
          this@QuestionnaireResponseItemSurrogate.definition,
          this@QuestionnaireResponseItemSurrogate._definition,
        ),
      text =
        R5String.of(
          this@QuestionnaireResponseItemSurrogate.text,
          this@QuestionnaireResponseItemSurrogate._text,
        ),
      answer = this@QuestionnaireResponseItemSurrogate.answer ?: mutableListOf(),
      item = this@QuestionnaireResponseItemSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: QuestionnaireResponse.Item): QuestionnaireResponseItemSurrogate =
      with(model) {
        QuestionnaireResponseItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId.value,
          _linkId = this@with.linkId.toElement(),
          definition = this@with.definition?.value,
          _definition = this@with.definition?.toElement(),
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          answer = this@with.answer.takeUnless { it.all { it == null } },
          item = this@with.item.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
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
  public var item: MutableList<QuestionnaireResponse.Item>? = null,
) {
  public fun toModel(): QuestionnaireResponse =
    QuestionnaireResponse(
      id = this@QuestionnaireResponseSurrogate.id,
      meta = this@QuestionnaireResponseSurrogate.meta,
      implicitRules =
        Uri.of(
          this@QuestionnaireResponseSurrogate.implicitRules,
          this@QuestionnaireResponseSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@QuestionnaireResponseSurrogate.language,
          this@QuestionnaireResponseSurrogate._language,
        ),
      text = this@QuestionnaireResponseSurrogate.text,
      contained = this@QuestionnaireResponseSurrogate.contained ?: mutableListOf(),
      extension = this@QuestionnaireResponseSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@QuestionnaireResponseSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@QuestionnaireResponseSurrogate.identifier ?: mutableListOf(),
      basedOn = this@QuestionnaireResponseSurrogate.basedOn ?: mutableListOf(),
      partOf = this@QuestionnaireResponseSurrogate.partOf ?: mutableListOf(),
      questionnaire =
        Canonical.of(
          this@QuestionnaireResponseSurrogate.questionnaire,
          this@QuestionnaireResponseSurrogate._questionnaire,
        )!!,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.QuestionnaireResponse.QuestionnaireResponseStatus.fromCode(
            this@QuestionnaireResponseSurrogate.status!!
          ),
          this@QuestionnaireResponseSurrogate._status,
        ),
      subject = this@QuestionnaireResponseSurrogate.subject,
      encounter = this@QuestionnaireResponseSurrogate.encounter,
      authored =
        DateTime.of(
          FhirDateTime.fromString(this@QuestionnaireResponseSurrogate.authored),
          this@QuestionnaireResponseSurrogate._authored,
        ),
      author = this@QuestionnaireResponseSurrogate.author,
      source = this@QuestionnaireResponseSurrogate.source,
      item = this@QuestionnaireResponseSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: QuestionnaireResponse): QuestionnaireResponseSurrogate =
      with(model) {
        QuestionnaireResponseSurrogate(
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          questionnaire = this@with.questionnaire.value,
          _questionnaire = this@with.questionnaire.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          authored = this@with.authored?.value?.toString(),
          _authored = this@with.authored?.toElement(),
          author = this@with.author,
          source = this@with.source,
          item = this@with.item.takeUnless { it.all { it == null } },
        )
      }
  }
}
