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
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
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
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Questionnaire
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
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
internal data class QuestionnaireItemEnableWhenSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var question: KotlinString? = null,
  public var _question: Element? = null,
  public var `operator`: KotlinString? = null,
  public var _operator: Element? = null,
  public var answerBoolean: KotlinBoolean? = null,
  public var _answerBoolean: Element? = null,
  public var answerDecimal: Double? = null,
  public var _answerDecimal: Element? = null,
  public var answerInteger: Int? = null,
  public var _answerInteger: Element? = null,
  public var answerDate: KotlinString? = null,
  public var _answerDate: Element? = null,
  public var answerDateTime: KotlinString? = null,
  public var _answerDateTime: Element? = null,
  public var answerTime: LocalTime? = null,
  public var _answerTime: Element? = null,
  public var answerString: KotlinString? = null,
  public var _answerString: Element? = null,
  public var answerCoding: Coding? = null,
  public var answerQuantity: Quantity? = null,
  public var answerReference: Reference? = null,
) {
  public fun toModel(): Questionnaire.Item.EnableWhen =
    Questionnaire.Item.EnableWhen().apply {
      id = this@QuestionnaireItemEnableWhenSurrogate.id
      extension = this@QuestionnaireItemEnableWhenSurrogate.extension
      modifierExtension = this@QuestionnaireItemEnableWhenSurrogate.modifierExtension
      question =
        R5String.of(
          this@QuestionnaireItemEnableWhenSurrogate.question,
          this@QuestionnaireItemEnableWhenSurrogate._question,
        )
      `operator` =
        Enumeration.of(
          this@QuestionnaireItemEnableWhenSurrogate.`operator`?.let {
            com.google.fhir.model.r5.Questionnaire.QuestionnaireItemOperator.fromCode(it)
          },
          this@QuestionnaireItemEnableWhenSurrogate._operator,
        )
      answer =
        Questionnaire.Item.EnableWhen.Answer?.from(
          R5Boolean.of(
            this@QuestionnaireItemEnableWhenSurrogate.answerBoolean,
            this@QuestionnaireItemEnableWhenSurrogate._answerBoolean,
          ),
          Decimal.of(
            this@QuestionnaireItemEnableWhenSurrogate.answerDecimal,
            this@QuestionnaireItemEnableWhenSurrogate._answerDecimal,
          ),
          Integer.of(
            this@QuestionnaireItemEnableWhenSurrogate.answerInteger,
            this@QuestionnaireItemEnableWhenSurrogate._answerInteger,
          ),
          Date.of(
            FhirDate.fromString(this@QuestionnaireItemEnableWhenSurrogate.answerDate),
            this@QuestionnaireItemEnableWhenSurrogate._answerDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@QuestionnaireItemEnableWhenSurrogate.answerDateTime),
            this@QuestionnaireItemEnableWhenSurrogate._answerDateTime,
          ),
          Time.of(
            this@QuestionnaireItemEnableWhenSurrogate.answerTime,
            this@QuestionnaireItemEnableWhenSurrogate._answerTime,
          ),
          R5String.of(
            this@QuestionnaireItemEnableWhenSurrogate.answerString,
            this@QuestionnaireItemEnableWhenSurrogate._answerString,
          ),
          this@QuestionnaireItemEnableWhenSurrogate.answerCoding,
          this@QuestionnaireItemEnableWhenSurrogate.answerQuantity,
          this@QuestionnaireItemEnableWhenSurrogate.answerReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.EnableWhen
    ): QuestionnaireItemEnableWhenSurrogate =
      with(model) {
        QuestionnaireItemEnableWhenSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          question = this@with.question?.value
          _question = this@with.question?.toElement()
          `operator` = this@with.`operator`?.value?.getCode()
          _operator = this@with.`operator`?.toElement()
          answerBoolean = this@with.answer?.asBoolean()?.value?.value
          _answerBoolean = this@with.answer?.asBoolean()?.value?.toElement()
          answerDecimal = this@with.answer?.asDecimal()?.value?.value
          _answerDecimal = this@with.answer?.asDecimal()?.value?.toElement()
          answerInteger = this@with.answer?.asInteger()?.value?.value
          _answerInteger = this@with.answer?.asInteger()?.value?.toElement()
          answerDate = this@with.answer?.asDate()?.value?.value?.toString()
          _answerDate = this@with.answer?.asDate()?.value?.toElement()
          answerDateTime = this@with.answer?.asDateTime()?.value?.value?.toString()
          _answerDateTime = this@with.answer?.asDateTime()?.value?.toElement()
          answerTime = this@with.answer?.asTime()?.value?.value
          _answerTime = this@with.answer?.asTime()?.value?.toElement()
          answerString = this@with.answer?.asString()?.value?.value
          _answerString = this@with.answer?.asString()?.value?.toElement()
          answerCoding = this@with.answer?.asCoding()?.value
          answerQuantity = this@with.answer?.asQuantity()?.value
          answerReference = this@with.answer?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class QuestionnaireItemAnswerOptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueTime: LocalTime? = null,
  public var _valueTime: Element? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueCoding: Coding? = null,
  public var valueReference: Reference? = null,
  public var initialSelected: KotlinBoolean? = null,
  public var _initialSelected: Element? = null,
) {
  public fun toModel(): Questionnaire.Item.AnswerOption =
    Questionnaire.Item.AnswerOption().apply {
      id = this@QuestionnaireItemAnswerOptionSurrogate.id
      extension = this@QuestionnaireItemAnswerOptionSurrogate.extension
      modifierExtension = this@QuestionnaireItemAnswerOptionSurrogate.modifierExtension
      `value` =
        Questionnaire.Item.AnswerOption.Value?.from(
          Integer.of(
            this@QuestionnaireItemAnswerOptionSurrogate.valueInteger,
            this@QuestionnaireItemAnswerOptionSurrogate._valueInteger,
          ),
          Date.of(
            FhirDate.fromString(this@QuestionnaireItemAnswerOptionSurrogate.valueDate),
            this@QuestionnaireItemAnswerOptionSurrogate._valueDate,
          ),
          Time.of(
            this@QuestionnaireItemAnswerOptionSurrogate.valueTime,
            this@QuestionnaireItemAnswerOptionSurrogate._valueTime,
          ),
          R5String.of(
            this@QuestionnaireItemAnswerOptionSurrogate.valueString,
            this@QuestionnaireItemAnswerOptionSurrogate._valueString,
          ),
          this@QuestionnaireItemAnswerOptionSurrogate.valueCoding,
          this@QuestionnaireItemAnswerOptionSurrogate.valueReference,
        )
      initialSelected =
        R5Boolean.of(
          this@QuestionnaireItemAnswerOptionSurrogate.initialSelected,
          this@QuestionnaireItemAnswerOptionSurrogate._initialSelected,
        )
    }

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.AnswerOption
    ): QuestionnaireItemAnswerOptionSurrogate =
      with(model) {
        QuestionnaireItemAnswerOptionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString()
          _valueDate = this@with.`value`?.asDate()?.value?.toElement()
          valueTime = this@with.`value`?.asTime()?.value?.value
          _valueTime = this@with.`value`?.asTime()?.value?.toElement()
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueCoding = this@with.`value`?.asCoding()?.value
          valueReference = this@with.`value`?.asReference()?.value
          initialSelected = this@with.initialSelected?.value
          _initialSelected = this@with.initialSelected?.toElement()
        }
      }
  }
}

@Serializable
internal data class QuestionnaireItemInitialSurrogate(
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
) {
  public fun toModel(): Questionnaire.Item.Initial =
    Questionnaire.Item.Initial().apply {
      id = this@QuestionnaireItemInitialSurrogate.id
      extension = this@QuestionnaireItemInitialSurrogate.extension
      modifierExtension = this@QuestionnaireItemInitialSurrogate.modifierExtension
      `value` =
        Questionnaire.Item.Initial.Value?.from(
          R5Boolean.of(
            this@QuestionnaireItemInitialSurrogate.valueBoolean,
            this@QuestionnaireItemInitialSurrogate._valueBoolean,
          ),
          Decimal.of(
            this@QuestionnaireItemInitialSurrogate.valueDecimal,
            this@QuestionnaireItemInitialSurrogate._valueDecimal,
          ),
          Integer.of(
            this@QuestionnaireItemInitialSurrogate.valueInteger,
            this@QuestionnaireItemInitialSurrogate._valueInteger,
          ),
          Date.of(
            FhirDate.fromString(this@QuestionnaireItemInitialSurrogate.valueDate),
            this@QuestionnaireItemInitialSurrogate._valueDate,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@QuestionnaireItemInitialSurrogate.valueDateTime),
            this@QuestionnaireItemInitialSurrogate._valueDateTime,
          ),
          Time.of(
            this@QuestionnaireItemInitialSurrogate.valueTime,
            this@QuestionnaireItemInitialSurrogate._valueTime,
          ),
          R5String.of(
            this@QuestionnaireItemInitialSurrogate.valueString,
            this@QuestionnaireItemInitialSurrogate._valueString,
          ),
          Uri.of(
            this@QuestionnaireItemInitialSurrogate.valueUri,
            this@QuestionnaireItemInitialSurrogate._valueUri,
          ),
          this@QuestionnaireItemInitialSurrogate.valueAttachment,
          this@QuestionnaireItemInitialSurrogate.valueCoding,
          this@QuestionnaireItemInitialSurrogate.valueQuantity,
          this@QuestionnaireItemInitialSurrogate.valueReference,
        )
    }

  public companion object {
    public fun fromModel(model: Questionnaire.Item.Initial): QuestionnaireItemInitialSurrogate =
      with(model) {
        QuestionnaireItemInitialSurrogate().apply {
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
        }
      }
  }
}

@Serializable
internal data class QuestionnaireItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var code: List<Coding?>? = null,
  public var prefix: KotlinString? = null,
  public var _prefix: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var enableWhen: List<Questionnaire.Item.EnableWhen>? = null,
  public var enableBehavior: KotlinString? = null,
  public var _enableBehavior: Element? = null,
  public var disabledDisplay: KotlinString? = null,
  public var _disabledDisplay: Element? = null,
  public var required: KotlinBoolean? = null,
  public var _required: Element? = null,
  public var repeats: KotlinBoolean? = null,
  public var _repeats: Element? = null,
  public var readOnly: KotlinBoolean? = null,
  public var _readOnly: Element? = null,
  public var maxLength: Int? = null,
  public var _maxLength: Element? = null,
  public var answerConstraint: KotlinString? = null,
  public var _answerConstraint: Element? = null,
  public var answerValueSet: KotlinString? = null,
  public var _answerValueSet: Element? = null,
  public var answerOption: List<Questionnaire.Item.AnswerOption>? = null,
  public var initial: List<Questionnaire.Item.Initial>? = null,
  public var item: List<Questionnaire.Item?>? = null,
) {
  public fun toModel(): Questionnaire.Item =
    Questionnaire.Item().apply {
      id = this@QuestionnaireItemSurrogate.id
      extension = this@QuestionnaireItemSurrogate.extension
      modifierExtension = this@QuestionnaireItemSurrogate.modifierExtension
      linkId =
        R5String.of(this@QuestionnaireItemSurrogate.linkId, this@QuestionnaireItemSurrogate._linkId)
      definition =
        Uri.of(
          this@QuestionnaireItemSurrogate.definition,
          this@QuestionnaireItemSurrogate._definition,
        )
      code = this@QuestionnaireItemSurrogate.code
      prefix =
        R5String.of(this@QuestionnaireItemSurrogate.prefix, this@QuestionnaireItemSurrogate._prefix)
      text =
        R5String.of(this@QuestionnaireItemSurrogate.text, this@QuestionnaireItemSurrogate._text)
      type =
        Enumeration.of(
          this@QuestionnaireItemSurrogate.type?.let {
            com.google.fhir.model.r5.Questionnaire.QuestionnaireItemType.fromCode(it)
          },
          this@QuestionnaireItemSurrogate._type,
        )
      enableWhen = this@QuestionnaireItemSurrogate.enableWhen
      enableBehavior =
        Enumeration.of(
          this@QuestionnaireItemSurrogate.enableBehavior?.let {
            com.google.fhir.model.r5.Questionnaire.EnableWhenBehavior.fromCode(it)
          },
          this@QuestionnaireItemSurrogate._enableBehavior,
        )
      disabledDisplay =
        Enumeration.of(
          this@QuestionnaireItemSurrogate.disabledDisplay?.let {
            com.google.fhir.model.r5.Questionnaire.DisabledDisplay.fromCode(it)
          },
          this@QuestionnaireItemSurrogate._disabledDisplay,
        )
      required =
        R5Boolean.of(
          this@QuestionnaireItemSurrogate.required,
          this@QuestionnaireItemSurrogate._required,
        )
      repeats =
        R5Boolean.of(
          this@QuestionnaireItemSurrogate.repeats,
          this@QuestionnaireItemSurrogate._repeats,
        )
      readOnly =
        R5Boolean.of(
          this@QuestionnaireItemSurrogate.readOnly,
          this@QuestionnaireItemSurrogate._readOnly,
        )
      maxLength =
        Integer.of(
          this@QuestionnaireItemSurrogate.maxLength,
          this@QuestionnaireItemSurrogate._maxLength,
        )
      answerConstraint =
        Enumeration.of(
          this@QuestionnaireItemSurrogate.answerConstraint?.let {
            com.google.fhir.model.r5.Questionnaire.QuestionnaireAnswerConstraint.fromCode(it)
          },
          this@QuestionnaireItemSurrogate._answerConstraint,
        )
      answerValueSet =
        Canonical.of(
          this@QuestionnaireItemSurrogate.answerValueSet,
          this@QuestionnaireItemSurrogate._answerValueSet,
        )
      answerOption = this@QuestionnaireItemSurrogate.answerOption
      initial = this@QuestionnaireItemSurrogate.initial
      item = this@QuestionnaireItemSurrogate.item
    }

  public companion object {
    public fun fromModel(model: Questionnaire.Item): QuestionnaireItemSurrogate =
      with(model) {
        QuestionnaireItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
          code = this@with.code
          prefix = this@with.prefix?.value
          _prefix = this@with.prefix?.toElement()
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          enableWhen = this@with.enableWhen
          enableBehavior = this@with.enableBehavior?.value?.getCode()
          _enableBehavior = this@with.enableBehavior?.toElement()
          disabledDisplay = this@with.disabledDisplay?.value?.getCode()
          _disabledDisplay = this@with.disabledDisplay?.toElement()
          required = this@with.required?.value
          _required = this@with.required?.toElement()
          repeats = this@with.repeats?.value
          _repeats = this@with.repeats?.toElement()
          readOnly = this@with.readOnly?.value
          _readOnly = this@with.readOnly?.toElement()
          maxLength = this@with.maxLength?.value
          _maxLength = this@with.maxLength?.toElement()
          answerConstraint = this@with.answerConstraint?.value?.getCode()
          _answerConstraint = this@with.answerConstraint?.toElement()
          answerValueSet = this@with.answerValueSet?.value
          _answerValueSet = this@with.answerValueSet?.toElement()
          answerOption = this@with.answerOption
          initial = this@with.initial
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class QuestionnaireSurrogate(
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
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var derivedFrom: List<KotlinString?>? = null,
  public var _derivedFrom: List<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subjectType: List<KotlinString?>? = null,
  public var _subjectType: List<Element?>? = null,
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
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var code: List<Coding?>? = null,
  public var item: List<Questionnaire.Item>? = null,
) {
  public fun toModel(): Questionnaire =
    Questionnaire().apply {
      id = this@QuestionnaireSurrogate.id
      meta = this@QuestionnaireSurrogate.meta
      implicitRules =
        Uri.of(
          this@QuestionnaireSurrogate.implicitRules,
          this@QuestionnaireSurrogate._implicitRules,
        )
      language =
        Code.of(this@QuestionnaireSurrogate.language, this@QuestionnaireSurrogate._language)
      text = this@QuestionnaireSurrogate.text
      contained = this@QuestionnaireSurrogate.contained
      extension = this@QuestionnaireSurrogate.extension
      modifierExtension = this@QuestionnaireSurrogate.modifierExtension
      url = Uri.of(this@QuestionnaireSurrogate.url, this@QuestionnaireSurrogate._url)
      identifier = this@QuestionnaireSurrogate.identifier
      version =
        R5String.of(this@QuestionnaireSurrogate.version, this@QuestionnaireSurrogate._version)
      versionAlgorithm =
        Questionnaire.VersionAlgorithm?.from(
          R5String.of(
            this@QuestionnaireSurrogate.versionAlgorithmString,
            this@QuestionnaireSurrogate._versionAlgorithmString,
          ),
          this@QuestionnaireSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@QuestionnaireSurrogate.name, this@QuestionnaireSurrogate._name)
      title = R5String.of(this@QuestionnaireSurrogate.title, this@QuestionnaireSurrogate._title)
      derivedFrom =
        if (
          this@QuestionnaireSurrogate.derivedFrom == null &&
            this@QuestionnaireSurrogate._derivedFrom == null
        ) {
          null
        } else {
          (this@QuestionnaireSurrogate.derivedFrom
              ?: List(this@QuestionnaireSurrogate._derivedFrom!!.size) { null })
            .zip(
              this@QuestionnaireSurrogate._derivedFrom
                ?: List(this@QuestionnaireSurrogate.derivedFrom!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      status =
        Enumeration.of(
          this@QuestionnaireSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@QuestionnaireSurrogate._status,
        )
      experimental =
        R5Boolean.of(
          this@QuestionnaireSurrogate.experimental,
          this@QuestionnaireSurrogate._experimental,
        )
      subjectType =
        if (
          this@QuestionnaireSurrogate.subjectType == null &&
            this@QuestionnaireSurrogate._subjectType == null
        ) {
          null
        } else {
          (this@QuestionnaireSurrogate.subjectType
              ?: List(this@QuestionnaireSurrogate._subjectType!!.size) { null })
            .zip(
              this@QuestionnaireSurrogate._subjectType
                ?: List(this@QuestionnaireSurrogate.subjectType!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let { com.google.fhir.model.r5.ResourceType.fromCode(it) },
                element,
              )
            }
        }
      date =
        DateTime.of(
          FhirDateTime.fromString(this@QuestionnaireSurrogate.date),
          this@QuestionnaireSurrogate._date,
        )
      publisher =
        R5String.of(this@QuestionnaireSurrogate.publisher, this@QuestionnaireSurrogate._publisher)
      contact = this@QuestionnaireSurrogate.contact
      description =
        Markdown.of(
          this@QuestionnaireSurrogate.description,
          this@QuestionnaireSurrogate._description,
        )
      useContext = this@QuestionnaireSurrogate.useContext
      jurisdiction = this@QuestionnaireSurrogate.jurisdiction
      purpose =
        Markdown.of(this@QuestionnaireSurrogate.purpose, this@QuestionnaireSurrogate._purpose)
      copyright =
        Markdown.of(this@QuestionnaireSurrogate.copyright, this@QuestionnaireSurrogate._copyright)
      copyrightLabel =
        R5String.of(
          this@QuestionnaireSurrogate.copyrightLabel,
          this@QuestionnaireSurrogate._copyrightLabel,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@QuestionnaireSurrogate.approvalDate),
          this@QuestionnaireSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@QuestionnaireSurrogate.lastReviewDate),
          this@QuestionnaireSurrogate._lastReviewDate,
        )
      effectivePeriod = this@QuestionnaireSurrogate.effectivePeriod
      code = this@QuestionnaireSurrogate.code
      item = this@QuestionnaireSurrogate.item
    }

  public companion object {
    public fun fromModel(model: Questionnaire): QuestionnaireSurrogate =
      with(model) {
        QuestionnaireSurrogate().apply {
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
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          derivedFrom =
            this@with.derivedFrom?.map { it?.value }?.takeUnless { it.all { it == null } }
          _derivedFrom =
            this@with.derivedFrom?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          subjectType =
            this@with.subjectType
              ?.map { it?.value?.getCode() }
              ?.takeUnless { it.all { it == null } }
          _subjectType =
            this@with.subjectType?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
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
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          effectivePeriod = this@with.effectivePeriod
          code = this@with.code
          item = this@with.item
        }
      }
  }
}
