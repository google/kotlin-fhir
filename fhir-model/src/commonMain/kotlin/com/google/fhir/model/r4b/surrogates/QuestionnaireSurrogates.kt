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
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.ContactDetail
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
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Questionnaire
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Time
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.UsageContext
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
internal data class QuestionnaireItemEnableWhenAnswerSurrogate(
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
  public fun toModel(): Questionnaire.Item.EnableWhen.Answer =
    Questionnaire.Item.EnableWhen.Answer.from(
      R4bBoolean.of(
        this@QuestionnaireItemEnableWhenAnswerSurrogate.answerBoolean,
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerBoolean,
      ),
      Decimal.of(
        this@QuestionnaireItemEnableWhenAnswerSurrogate.answerDecimal,
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerDecimal,
      ),
      Integer.of(
        this@QuestionnaireItemEnableWhenAnswerSurrogate.answerInteger,
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerInteger,
      ),
      Date.of(
        FhirDate.fromString(this@QuestionnaireItemEnableWhenAnswerSurrogate.answerDate),
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@QuestionnaireItemEnableWhenAnswerSurrogate.answerDateTime),
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerDateTime,
      ),
      Time.of(
        this@QuestionnaireItemEnableWhenAnswerSurrogate.answerTime,
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerTime,
      ),
      R4bString.of(
        this@QuestionnaireItemEnableWhenAnswerSurrogate.answerString,
        this@QuestionnaireItemEnableWhenAnswerSurrogate._answerString,
      ),
      this@QuestionnaireItemEnableWhenAnswerSurrogate.answerCoding,
      this@QuestionnaireItemEnableWhenAnswerSurrogate.answerQuantity,
      this@QuestionnaireItemEnableWhenAnswerSurrogate.answerReference,
    )!!

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.EnableWhen.Answer
    ): QuestionnaireItemEnableWhenAnswerSurrogate =
      with(model) {
        QuestionnaireItemEnableWhenAnswerSurrogate().apply {
          Questionnaire.Item.EnableWhen.Answer.from(
            R4bBoolean.of(
              this@QuestionnaireItemEnableWhenAnswerSurrogate.answerBoolean,
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerBoolean,
            ),
            Decimal.of(
              this@QuestionnaireItemEnableWhenAnswerSurrogate.answerDecimal,
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerDecimal,
            ),
            Integer.of(
              this@QuestionnaireItemEnableWhenAnswerSurrogate.answerInteger,
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerInteger,
            ),
            Date.of(
              FhirDate.fromString(this@QuestionnaireItemEnableWhenAnswerSurrogate.answerDate),
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerDate,
            ),
            DateTime.of(
              FhirDateTime.fromString(
                this@QuestionnaireItemEnableWhenAnswerSurrogate.answerDateTime
              ),
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerDateTime,
            ),
            Time.of(
              this@QuestionnaireItemEnableWhenAnswerSurrogate.answerTime,
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerTime,
            ),
            R4bString.of(
              this@QuestionnaireItemEnableWhenAnswerSurrogate.answerString,
              this@QuestionnaireItemEnableWhenAnswerSurrogate._answerString,
            ),
            this@QuestionnaireItemEnableWhenAnswerSurrogate.answerCoding,
            this@QuestionnaireItemEnableWhenAnswerSurrogate.answerQuantity,
            this@QuestionnaireItemEnableWhenAnswerSurrogate.answerReference,
          )!!
        }
      }
  }
}

@Serializable
internal data class QuestionnaireItemEnableWhenSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var question: KotlinString? = null,
  public var _question: Element? = null,
  public var `operator`: KotlinString? = null,
  public var _operator: Element? = null,
  public var answer: Questionnaire.Item.EnableWhen.Answer,
) {
  public fun toModel(): Questionnaire.Item.EnableWhen =
    Questionnaire.Item.EnableWhen(
      id = this@QuestionnaireItemEnableWhenSurrogate.id,
      extension = this@QuestionnaireItemEnableWhenSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@QuestionnaireItemEnableWhenSurrogate.modifierExtension ?: mutableListOf(),
      question =
        R4bString.of(
          this@QuestionnaireItemEnableWhenSurrogate.question,
          this@QuestionnaireItemEnableWhenSurrogate._question,
        )!!,
      `operator` =
        Enumeration.of(
          com.google.fhir.model.r4b.Questionnaire.QuestionnaireItemOperator.fromCode(
            this@QuestionnaireItemEnableWhenSurrogate.`operator`!!
          ),
          this@QuestionnaireItemEnableWhenSurrogate._operator,
        ),
      answer = this@QuestionnaireItemEnableWhenSurrogate.answer,
    )

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.EnableWhen
    ): QuestionnaireItemEnableWhenSurrogate =
      with(model) {
        QuestionnaireItemEnableWhenSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          question = this@with.question.value,
          _question = this@with.question.toElement(),
          `operator` = this@with.`operator`.value?.getCode(),
          _operator = this@with.`operator`.toElement(),
          answer = this@with.answer,
        )
      }
  }
}

@Serializable
internal data class QuestionnaireItemAnswerOptionValueSurrogate(
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
) {
  public fun toModel(): Questionnaire.Item.AnswerOption.Value =
    Questionnaire.Item.AnswerOption.Value.from(
      Integer.of(
        this@QuestionnaireItemAnswerOptionValueSurrogate.valueInteger,
        this@QuestionnaireItemAnswerOptionValueSurrogate._valueInteger,
      ),
      Date.of(
        FhirDate.fromString(this@QuestionnaireItemAnswerOptionValueSurrogate.valueDate),
        this@QuestionnaireItemAnswerOptionValueSurrogate._valueDate,
      ),
      Time.of(
        this@QuestionnaireItemAnswerOptionValueSurrogate.valueTime,
        this@QuestionnaireItemAnswerOptionValueSurrogate._valueTime,
      ),
      R4bString.of(
        this@QuestionnaireItemAnswerOptionValueSurrogate.valueString,
        this@QuestionnaireItemAnswerOptionValueSurrogate._valueString,
      ),
      this@QuestionnaireItemAnswerOptionValueSurrogate.valueCoding,
      this@QuestionnaireItemAnswerOptionValueSurrogate.valueReference,
    )!!

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.AnswerOption.Value
    ): QuestionnaireItemAnswerOptionValueSurrogate =
      with(model) {
        QuestionnaireItemAnswerOptionValueSurrogate().apply {
          Questionnaire.Item.AnswerOption.Value.from(
            Integer.of(
              this@QuestionnaireItemAnswerOptionValueSurrogate.valueInteger,
              this@QuestionnaireItemAnswerOptionValueSurrogate._valueInteger,
            ),
            Date.of(
              FhirDate.fromString(this@QuestionnaireItemAnswerOptionValueSurrogate.valueDate),
              this@QuestionnaireItemAnswerOptionValueSurrogate._valueDate,
            ),
            Time.of(
              this@QuestionnaireItemAnswerOptionValueSurrogate.valueTime,
              this@QuestionnaireItemAnswerOptionValueSurrogate._valueTime,
            ),
            R4bString.of(
              this@QuestionnaireItemAnswerOptionValueSurrogate.valueString,
              this@QuestionnaireItemAnswerOptionValueSurrogate._valueString,
            ),
            this@QuestionnaireItemAnswerOptionValueSurrogate.valueCoding,
            this@QuestionnaireItemAnswerOptionValueSurrogate.valueReference,
          )!!
        }
      }
  }
}

@Serializable
internal data class QuestionnaireItemAnswerOptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var initialSelected: KotlinBoolean? = null,
  public var _initialSelected: Element? = null,
  public var `value`: Questionnaire.Item.AnswerOption.Value,
) {
  public fun toModel(): Questionnaire.Item.AnswerOption =
    Questionnaire.Item.AnswerOption(
      id = this@QuestionnaireItemAnswerOptionSurrogate.id,
      extension = this@QuestionnaireItemAnswerOptionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@QuestionnaireItemAnswerOptionSurrogate.modifierExtension ?: mutableListOf(),
      `value` = this@QuestionnaireItemAnswerOptionSurrogate.`value`,
      initialSelected =
        R4bBoolean.of(
          this@QuestionnaireItemAnswerOptionSurrogate.initialSelected,
          this@QuestionnaireItemAnswerOptionSurrogate._initialSelected,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.AnswerOption
    ): QuestionnaireItemAnswerOptionSurrogate =
      with(model) {
        QuestionnaireItemAnswerOptionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
          initialSelected = this@with.initialSelected?.value,
          _initialSelected = this@with.initialSelected?.toElement(),
        )
      }
  }
}

@Serializable
internal data class QuestionnaireItemInitialValueSurrogate(
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
  public fun toModel(): Questionnaire.Item.Initial.Value =
    Questionnaire.Item.Initial.Value.from(
      R4bBoolean.of(
        this@QuestionnaireItemInitialValueSurrogate.valueBoolean,
        this@QuestionnaireItemInitialValueSurrogate._valueBoolean,
      ),
      Decimal.of(
        this@QuestionnaireItemInitialValueSurrogate.valueDecimal,
        this@QuestionnaireItemInitialValueSurrogate._valueDecimal,
      ),
      Integer.of(
        this@QuestionnaireItemInitialValueSurrogate.valueInteger,
        this@QuestionnaireItemInitialValueSurrogate._valueInteger,
      ),
      Date.of(
        FhirDate.fromString(this@QuestionnaireItemInitialValueSurrogate.valueDate),
        this@QuestionnaireItemInitialValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@QuestionnaireItemInitialValueSurrogate.valueDateTime),
        this@QuestionnaireItemInitialValueSurrogate._valueDateTime,
      ),
      Time.of(
        this@QuestionnaireItemInitialValueSurrogate.valueTime,
        this@QuestionnaireItemInitialValueSurrogate._valueTime,
      ),
      R4bString.of(
        this@QuestionnaireItemInitialValueSurrogate.valueString,
        this@QuestionnaireItemInitialValueSurrogate._valueString,
      ),
      Uri.of(
        this@QuestionnaireItemInitialValueSurrogate.valueUri,
        this@QuestionnaireItemInitialValueSurrogate._valueUri,
      ),
      this@QuestionnaireItemInitialValueSurrogate.valueAttachment,
      this@QuestionnaireItemInitialValueSurrogate.valueCoding,
      this@QuestionnaireItemInitialValueSurrogate.valueQuantity,
      this@QuestionnaireItemInitialValueSurrogate.valueReference,
    )!!

  public companion object {
    public fun fromModel(
      model: Questionnaire.Item.Initial.Value
    ): QuestionnaireItemInitialValueSurrogate =
      with(model) {
        QuestionnaireItemInitialValueSurrogate().apply {
          Questionnaire.Item.Initial.Value.from(
            R4bBoolean.of(
              this@QuestionnaireItemInitialValueSurrogate.valueBoolean,
              this@QuestionnaireItemInitialValueSurrogate._valueBoolean,
            ),
            Decimal.of(
              this@QuestionnaireItemInitialValueSurrogate.valueDecimal,
              this@QuestionnaireItemInitialValueSurrogate._valueDecimal,
            ),
            Integer.of(
              this@QuestionnaireItemInitialValueSurrogate.valueInteger,
              this@QuestionnaireItemInitialValueSurrogate._valueInteger,
            ),
            Date.of(
              FhirDate.fromString(this@QuestionnaireItemInitialValueSurrogate.valueDate),
              this@QuestionnaireItemInitialValueSurrogate._valueDate,
            ),
            DateTime.of(
              FhirDateTime.fromString(this@QuestionnaireItemInitialValueSurrogate.valueDateTime),
              this@QuestionnaireItemInitialValueSurrogate._valueDateTime,
            ),
            Time.of(
              this@QuestionnaireItemInitialValueSurrogate.valueTime,
              this@QuestionnaireItemInitialValueSurrogate._valueTime,
            ),
            R4bString.of(
              this@QuestionnaireItemInitialValueSurrogate.valueString,
              this@QuestionnaireItemInitialValueSurrogate._valueString,
            ),
            Uri.of(
              this@QuestionnaireItemInitialValueSurrogate.valueUri,
              this@QuestionnaireItemInitialValueSurrogate._valueUri,
            ),
            this@QuestionnaireItemInitialValueSurrogate.valueAttachment,
            this@QuestionnaireItemInitialValueSurrogate.valueCoding,
            this@QuestionnaireItemInitialValueSurrogate.valueQuantity,
            this@QuestionnaireItemInitialValueSurrogate.valueReference,
          )!!
        }
      }
  }
}

@Serializable
internal data class QuestionnaireItemInitialSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `value`: Questionnaire.Item.Initial.Value,
) {
  public fun toModel(): Questionnaire.Item.Initial =
    Questionnaire.Item.Initial(
      id = this@QuestionnaireItemInitialSurrogate.id,
      extension = this@QuestionnaireItemInitialSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@QuestionnaireItemInitialSurrogate.modifierExtension ?: mutableListOf(),
      `value` = this@QuestionnaireItemInitialSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: Questionnaire.Item.Initial): QuestionnaireItemInitialSurrogate =
      with(model) {
        QuestionnaireItemInitialSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class QuestionnaireItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var code: MutableList<Coding>? = null,
  public var prefix: KotlinString? = null,
  public var _prefix: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var enableWhen: MutableList<Questionnaire.Item.EnableWhen>? = null,
  public var enableBehavior: KotlinString? = null,
  public var _enableBehavior: Element? = null,
  public var required: KotlinBoolean? = null,
  public var _required: Element? = null,
  public var repeats: KotlinBoolean? = null,
  public var _repeats: Element? = null,
  public var readOnly: KotlinBoolean? = null,
  public var _readOnly: Element? = null,
  public var maxLength: Int? = null,
  public var _maxLength: Element? = null,
  public var answerValueSet: KotlinString? = null,
  public var _answerValueSet: Element? = null,
  public var answerOption: MutableList<Questionnaire.Item.AnswerOption>? = null,
  public var initial: MutableList<Questionnaire.Item.Initial>? = null,
  public var item: MutableList<Questionnaire.Item>? = null,
) {
  public fun toModel(): Questionnaire.Item =
    Questionnaire.Item(
      id = this@QuestionnaireItemSurrogate.id,
      extension = this@QuestionnaireItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@QuestionnaireItemSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R4bString.of(
          this@QuestionnaireItemSurrogate.linkId,
          this@QuestionnaireItemSurrogate._linkId,
        )!!,
      definition =
        Uri.of(
          this@QuestionnaireItemSurrogate.definition,
          this@QuestionnaireItemSurrogate._definition,
        ),
      code = this@QuestionnaireItemSurrogate.code ?: mutableListOf(),
      prefix =
        R4bString.of(
          this@QuestionnaireItemSurrogate.prefix,
          this@QuestionnaireItemSurrogate._prefix,
        ),
      text =
        R4bString.of(this@QuestionnaireItemSurrogate.text, this@QuestionnaireItemSurrogate._text),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.Questionnaire.QuestionnaireItemType.fromCode(
            this@QuestionnaireItemSurrogate.type!!
          ),
          this@QuestionnaireItemSurrogate._type,
        ),
      enableWhen = this@QuestionnaireItemSurrogate.enableWhen ?: mutableListOf(),
      enableBehavior =
        this@QuestionnaireItemSurrogate.enableBehavior?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.Questionnaire.EnableWhenBehavior.fromCode(it!!),
            this@QuestionnaireItemSurrogate._enableBehavior,
          )
        },
      required =
        R4bBoolean.of(
          this@QuestionnaireItemSurrogate.required,
          this@QuestionnaireItemSurrogate._required,
        ),
      repeats =
        R4bBoolean.of(
          this@QuestionnaireItemSurrogate.repeats,
          this@QuestionnaireItemSurrogate._repeats,
        ),
      readOnly =
        R4bBoolean.of(
          this@QuestionnaireItemSurrogate.readOnly,
          this@QuestionnaireItemSurrogate._readOnly,
        ),
      maxLength =
        Integer.of(
          this@QuestionnaireItemSurrogate.maxLength,
          this@QuestionnaireItemSurrogate._maxLength,
        ),
      answerValueSet =
        Canonical.of(
          this@QuestionnaireItemSurrogate.answerValueSet,
          this@QuestionnaireItemSurrogate._answerValueSet,
        ),
      answerOption = this@QuestionnaireItemSurrogate.answerOption ?: mutableListOf(),
      initial = this@QuestionnaireItemSurrogate.initial ?: mutableListOf(),
      item = this@QuestionnaireItemSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Questionnaire.Item): QuestionnaireItemSurrogate =
      with(model) {
        QuestionnaireItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId.value,
          _linkId = this@with.linkId.toElement(),
          definition = this@with.definition?.value,
          _definition = this@with.definition?.toElement(),
          code = this@with.code.takeUnless { it.all { it == null } },
          prefix = this@with.prefix?.value,
          _prefix = this@with.prefix?.toElement(),
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          enableWhen = this@with.enableWhen.takeUnless { it.all { it == null } },
          enableBehavior = this@with.enableBehavior?.value?.getCode(),
          _enableBehavior = this@with.enableBehavior?.toElement(),
          required = this@with.required?.value,
          _required = this@with.required?.toElement(),
          repeats = this@with.repeats?.value,
          _repeats = this@with.repeats?.toElement(),
          readOnly = this@with.readOnly?.value,
          _readOnly = this@with.readOnly?.toElement(),
          maxLength = this@with.maxLength?.value,
          _maxLength = this@with.maxLength?.toElement(),
          answerValueSet = this@with.answerValueSet?.value,
          _answerValueSet = this@with.answerValueSet?.toElement(),
          answerOption = this@with.answerOption.takeUnless { it.all { it == null } },
          initial = this@with.initial.takeUnless { it.all { it == null } },
          item = this@with.item.takeUnless { it.all { it == null } },
        )
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
  public var derivedFrom: MutableList<KotlinString?>? = null,
  public var _derivedFrom: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subjectType: MutableList<KotlinString?>? = null,
  public var _subjectType: MutableList<Element?>? = null,
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
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var code: MutableList<Coding>? = null,
  public var item: MutableList<Questionnaire.Item>? = null,
) {
  public fun toModel(): Questionnaire =
    Questionnaire(
      id = this@QuestionnaireSurrogate.id,
      meta = this@QuestionnaireSurrogate.meta,
      implicitRules =
        Uri.of(
          this@QuestionnaireSurrogate.implicitRules,
          this@QuestionnaireSurrogate._implicitRules,
        ),
      language =
        Code.of(this@QuestionnaireSurrogate.language, this@QuestionnaireSurrogate._language),
      text = this@QuestionnaireSurrogate.text,
      contained = this@QuestionnaireSurrogate.contained ?: mutableListOf(),
      extension = this@QuestionnaireSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@QuestionnaireSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@QuestionnaireSurrogate.url, this@QuestionnaireSurrogate._url),
      identifier = this@QuestionnaireSurrogate.identifier ?: mutableListOf(),
      version =
        R4bString.of(this@QuestionnaireSurrogate.version, this@QuestionnaireSurrogate._version),
      name = R4bString.of(this@QuestionnaireSurrogate.name, this@QuestionnaireSurrogate._name),
      title = R4bString.of(this@QuestionnaireSurrogate.title, this@QuestionnaireSurrogate._title),
      derivedFrom =
        if (
          this@QuestionnaireSurrogate.derivedFrom == null &&
            this@QuestionnaireSurrogate._derivedFrom == null
        ) {
          mutableListOf()
        } else {
          (this@QuestionnaireSurrogate.derivedFrom
              ?: List(this@QuestionnaireSurrogate._derivedFrom!!.size) { null })
            .zip(
              this@QuestionnaireSurrogate._derivedFrom
                ?: List(this@QuestionnaireSurrogate.derivedFrom!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(
            this@QuestionnaireSurrogate.status!!
          ),
          this@QuestionnaireSurrogate._status,
        ),
      experimental =
        R4bBoolean.of(
          this@QuestionnaireSurrogate.experimental,
          this@QuestionnaireSurrogate._experimental,
        ),
      subjectType =
        if (
          this@QuestionnaireSurrogate.subjectType == null &&
            this@QuestionnaireSurrogate._subjectType == null
        ) {
          mutableListOf()
        } else {
          (this@QuestionnaireSurrogate.subjectType
              ?: List(this@QuestionnaireSurrogate._subjectType!!.size) { null })
            .zip(
              this@QuestionnaireSurrogate._subjectType
                ?: List(this@QuestionnaireSurrogate.subjectType!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r4b.ResourceType.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      date =
        DateTime.of(
          FhirDateTime.fromString(this@QuestionnaireSurrogate.date),
          this@QuestionnaireSurrogate._date,
        ),
      publisher =
        R4bString.of(this@QuestionnaireSurrogate.publisher, this@QuestionnaireSurrogate._publisher),
      contact = this@QuestionnaireSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@QuestionnaireSurrogate.description,
          this@QuestionnaireSurrogate._description,
        ),
      useContext = this@QuestionnaireSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@QuestionnaireSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(this@QuestionnaireSurrogate.purpose, this@QuestionnaireSurrogate._purpose),
      copyright =
        Markdown.of(this@QuestionnaireSurrogate.copyright, this@QuestionnaireSurrogate._copyright),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@QuestionnaireSurrogate.approvalDate),
          this@QuestionnaireSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@QuestionnaireSurrogate.lastReviewDate),
          this@QuestionnaireSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@QuestionnaireSurrogate.effectivePeriod,
      code = this@QuestionnaireSurrogate.code ?: mutableListOf(),
      item = this@QuestionnaireSurrogate.item ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Questionnaire): QuestionnaireSurrogate =
      with(model) {
        QuestionnaireSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          derivedFrom =
            this@with.derivedFrom
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _derivedFrom =
            this@with.derivedFrom
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          subjectType =
            this@with.subjectType
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _subjectType =
            this@with.subjectType
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
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
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          effectivePeriod = this@with.effectivePeriod,
          code = this@with.code.takeUnless { it.all { it == null } },
          item = this@with.item.takeUnless { it.all { it == null } },
        )
      }
  }
}
