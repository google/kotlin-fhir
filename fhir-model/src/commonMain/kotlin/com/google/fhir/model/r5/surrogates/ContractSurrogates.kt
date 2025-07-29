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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Contract
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
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Signature
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.UnsignedInt
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
internal data class ContractContentDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var subType: CodeableConcept? = null,
  public var publisher: Reference? = null,
  public var publicationDate: KotlinString? = null,
  public var _publicationDate: Element? = null,
  public var publicationStatus: KotlinString? = null,
  public var _publicationStatus: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
) {
  public fun toModel(): Contract.ContentDefinition =
    Contract.ContentDefinition(
      id = this@ContractContentDefinitionSurrogate.id,
      extension = this@ContractContentDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ContractContentDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ContractContentDefinitionSurrogate.type,
      subType = this@ContractContentDefinitionSurrogate.subType,
      publisher = this@ContractContentDefinitionSurrogate.publisher,
      publicationDate =
        DateTime.of(
          FhirDateTime.fromString(this@ContractContentDefinitionSurrogate.publicationDate),
          this@ContractContentDefinitionSurrogate._publicationDate,
        ),
      publicationStatus =
        Enumeration.of(
          com.google.fhir.model.r5.Contract.ContractPublicationStatus.fromCode(
            this@ContractContentDefinitionSurrogate.publicationStatus!!
          ),
          this@ContractContentDefinitionSurrogate._publicationStatus,
        ),
      copyright =
        Markdown.of(
          this@ContractContentDefinitionSurrogate.copyright,
          this@ContractContentDefinitionSurrogate._copyright,
        ),
    )

  public companion object {
    public fun fromModel(model: Contract.ContentDefinition): ContractContentDefinitionSurrogate =
      with(model) {
        ContractContentDefinitionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          subType = this@with.subType,
          publisher = this@with.publisher,
          publicationDate = this@with.publicationDate?.value?.toString(),
          _publicationDate = this@with.publicationDate?.toElement(),
          publicationStatus = this@with.publicationStatus.value?.getCode(),
          _publicationStatus = this@with.publicationStatus.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ContractTermSecurityLabelSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var number: MutableList<Int?>? = null,
  public var _number: MutableList<Element?>? = null,
  public var classification: Coding,
  public var category: MutableList<Coding>? = null,
  public var control: MutableList<Coding>? = null,
) {
  public fun toModel(): Contract.Term.SecurityLabel =
    Contract.Term.SecurityLabel(
      id = this@ContractTermSecurityLabelSurrogate.id,
      extension = this@ContractTermSecurityLabelSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ContractTermSecurityLabelSurrogate.modifierExtension ?: mutableListOf(),
      number =
        if (
          this@ContractTermSecurityLabelSurrogate.number == null &&
            this@ContractTermSecurityLabelSurrogate._number == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermSecurityLabelSurrogate.number
              ?: List(this@ContractTermSecurityLabelSurrogate._number!!.size) { null })
            .zip(
              this@ContractTermSecurityLabelSurrogate._number
                ?: List(this@ContractTermSecurityLabelSurrogate.number!!.size) { null }
            )
            .map { (value, element) -> UnsignedInt.of(value, element)!! }
            .toMutableList()
        },
      classification = this@ContractTermSecurityLabelSurrogate.classification,
      category = this@ContractTermSecurityLabelSurrogate.category ?: mutableListOf(),
      control = this@ContractTermSecurityLabelSurrogate.control ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Contract.Term.SecurityLabel): ContractTermSecurityLabelSurrogate =
      with(model) {
        ContractTermSecurityLabelSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          number =
            this@with.number.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _number =
            this@with.number
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          classification = this@with.classification,
          category = this@with.category.takeUnless { it.all { it == null } },
          control = this@with.control.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ContractTermOfferPartySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: MutableList<Reference>? = null,
  public var role: CodeableConcept,
) {
  public fun toModel(): Contract.Term.Offer.Party =
    Contract.Term.Offer.Party(
      id = this@ContractTermOfferPartySurrogate.id,
      extension = this@ContractTermOfferPartySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractTermOfferPartySurrogate.modifierExtension ?: mutableListOf(),
      reference = this@ContractTermOfferPartySurrogate.reference ?: mutableListOf(),
      role = this@ContractTermOfferPartySurrogate.role,
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Offer.Party): ContractTermOfferPartySurrogate =
      with(model) {
        ContractTermOfferPartySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference.takeUnless { it.all { it == null } },
          role = this@with.role,
        )
      }
  }
}

@Serializable
internal data class ContractTermOfferAnswerValueSurrogate(
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
  public fun toModel(): Contract.Term.Offer.Answer.Value =
    Contract.Term.Offer.Answer.Value.from(
      R5Boolean.of(
        this@ContractTermOfferAnswerValueSurrogate.valueBoolean,
        this@ContractTermOfferAnswerValueSurrogate._valueBoolean,
      ),
      Decimal.of(
        this@ContractTermOfferAnswerValueSurrogate.valueDecimal,
        this@ContractTermOfferAnswerValueSurrogate._valueDecimal,
      ),
      Integer.of(
        this@ContractTermOfferAnswerValueSurrogate.valueInteger,
        this@ContractTermOfferAnswerValueSurrogate._valueInteger,
      ),
      Date.of(
        FhirDate.fromString(this@ContractTermOfferAnswerValueSurrogate.valueDate),
        this@ContractTermOfferAnswerValueSurrogate._valueDate,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@ContractTermOfferAnswerValueSurrogate.valueDateTime),
        this@ContractTermOfferAnswerValueSurrogate._valueDateTime,
      ),
      Time.of(
        this@ContractTermOfferAnswerValueSurrogate.valueTime,
        this@ContractTermOfferAnswerValueSurrogate._valueTime,
      ),
      R5String.of(
        this@ContractTermOfferAnswerValueSurrogate.valueString,
        this@ContractTermOfferAnswerValueSurrogate._valueString,
      ),
      Uri.of(
        this@ContractTermOfferAnswerValueSurrogate.valueUri,
        this@ContractTermOfferAnswerValueSurrogate._valueUri,
      ),
      this@ContractTermOfferAnswerValueSurrogate.valueAttachment,
      this@ContractTermOfferAnswerValueSurrogate.valueCoding,
      this@ContractTermOfferAnswerValueSurrogate.valueQuantity,
      this@ContractTermOfferAnswerValueSurrogate.valueReference,
    )!!

  public companion object {
    public fun fromModel(
      model: Contract.Term.Offer.Answer.Value
    ): ContractTermOfferAnswerValueSurrogate =
      with(model) {
        ContractTermOfferAnswerValueSurrogate(
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
internal data class ContractTermOfferAnswerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `value`: Contract.Term.Offer.Answer.Value,
) {
  public fun toModel(): Contract.Term.Offer.Answer =
    Contract.Term.Offer.Answer(
      id = this@ContractTermOfferAnswerSurrogate.id,
      extension = this@ContractTermOfferAnswerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ContractTermOfferAnswerSurrogate.modifierExtension ?: mutableListOf(),
      `value` = this@ContractTermOfferAnswerSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Offer.Answer): ContractTermOfferAnswerSurrogate =
      with(model) {
        ContractTermOfferAnswerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class ContractTermOfferSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var party: MutableList<Contract.Term.Offer.Party>? = null,
  public var topic: Reference? = null,
  public var type: CodeableConcept? = null,
  public var decision: CodeableConcept? = null,
  public var decisionMode: MutableList<CodeableConcept>? = null,
  public var answer: MutableList<Contract.Term.Offer.Answer>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var linkId: MutableList<KotlinString?>? = null,
  public var _linkId: MutableList<Element?>? = null,
  public var securityLabelNumber: MutableList<Int?>? = null,
  public var _securityLabelNumber: MutableList<Element?>? = null,
) {
  public fun toModel(): Contract.Term.Offer =
    Contract.Term.Offer(
      id = this@ContractTermOfferSurrogate.id,
      extension = this@ContractTermOfferSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractTermOfferSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ContractTermOfferSurrogate.identifier ?: mutableListOf(),
      party = this@ContractTermOfferSurrogate.party ?: mutableListOf(),
      topic = this@ContractTermOfferSurrogate.topic,
      type = this@ContractTermOfferSurrogate.type,
      decision = this@ContractTermOfferSurrogate.decision,
      decisionMode = this@ContractTermOfferSurrogate.decisionMode ?: mutableListOf(),
      answer = this@ContractTermOfferSurrogate.answer ?: mutableListOf(),
      text =
        R5String.of(this@ContractTermOfferSurrogate.text, this@ContractTermOfferSurrogate._text),
      linkId =
        if (
          this@ContractTermOfferSurrogate.linkId == null &&
            this@ContractTermOfferSurrogate._linkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermOfferSurrogate.linkId
              ?: List(this@ContractTermOfferSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermOfferSurrogate._linkId
                ?: List(this@ContractTermOfferSurrogate.linkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      securityLabelNumber =
        if (
          this@ContractTermOfferSurrogate.securityLabelNumber == null &&
            this@ContractTermOfferSurrogate._securityLabelNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermOfferSurrogate.securityLabelNumber
              ?: List(this@ContractTermOfferSurrogate._securityLabelNumber!!.size) { null })
            .zip(
              this@ContractTermOfferSurrogate._securityLabelNumber
                ?: List(this@ContractTermOfferSurrogate.securityLabelNumber!!.size) { null }
            )
            .map { (value, element) -> UnsignedInt.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Offer): ContractTermOfferSurrogate =
      with(model) {
        ContractTermOfferSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          party = this@with.party.takeUnless { it.all { it == null } },
          topic = this@with.topic,
          type = this@with.type,
          decision = this@with.decision,
          decisionMode = this@with.decisionMode.takeUnless { it.all { it == null } },
          answer = this@with.answer.takeUnless { it.all { it == null } },
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          linkId =
            this@with.linkId.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _linkId =
            this@with.linkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ContractTermAssetContextSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: Reference? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Contract.Term.Asset.Context =
    Contract.Term.Asset.Context(
      id = this@ContractTermAssetContextSurrogate.id,
      extension = this@ContractTermAssetContextSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ContractTermAssetContextSurrogate.modifierExtension ?: mutableListOf(),
      reference = this@ContractTermAssetContextSurrogate.reference,
      code = this@ContractTermAssetContextSurrogate.code ?: mutableListOf(),
      text =
        R5String.of(
          this@ContractTermAssetContextSurrogate.text,
          this@ContractTermAssetContextSurrogate._text,
        ),
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Asset.Context): ContractTermAssetContextSurrogate =
      with(model) {
        ContractTermAssetContextSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference,
          code = this@with.code.takeUnless { it.all { it == null } },
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ContractTermAssetValuedItemEntitySurrogate(
  public var entityCodeableConcept: CodeableConcept? = null,
  public var entityReference: Reference? = null,
) {
  public fun toModel(): Contract.Term.Asset.ValuedItem.Entity? =
    Contract.Term.Asset.ValuedItem.Entity?.from(
      this@ContractTermAssetValuedItemEntitySurrogate.entityCodeableConcept,
      this@ContractTermAssetValuedItemEntitySurrogate.entityReference,
    )

  public companion object {
    public fun fromModel(
      model: Contract.Term.Asset.ValuedItem.Entity
    ): ContractTermAssetValuedItemEntitySurrogate =
      with(model) {
        ContractTermAssetValuedItemEntitySurrogate(
          entityCodeableConcept = this@with.asCodeableConcept()?.value,
          entityReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractTermAssetValuedItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var effectiveTime: KotlinString? = null,
  public var _effectiveTime: Element? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var points: Double? = null,
  public var _points: Element? = null,
  public var net: Money? = null,
  public var payment: KotlinString? = null,
  public var _payment: Element? = null,
  public var paymentDate: KotlinString? = null,
  public var _paymentDate: Element? = null,
  public var responsible: Reference? = null,
  public var recipient: Reference? = null,
  public var linkId: MutableList<KotlinString?>? = null,
  public var _linkId: MutableList<Element?>? = null,
  public var securityLabelNumber: MutableList<Int?>? = null,
  public var _securityLabelNumber: MutableList<Element?>? = null,
  public var entity: Contract.Term.Asset.ValuedItem.Entity? = null,
) {
  public fun toModel(): Contract.Term.Asset.ValuedItem =
    Contract.Term.Asset.ValuedItem(
      id = this@ContractTermAssetValuedItemSurrogate.id,
      extension = this@ContractTermAssetValuedItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ContractTermAssetValuedItemSurrogate.modifierExtension ?: mutableListOf(),
      entity = this@ContractTermAssetValuedItemSurrogate.entity,
      identifier = this@ContractTermAssetValuedItemSurrogate.identifier,
      effectiveTime =
        DateTime.of(
          FhirDateTime.fromString(this@ContractTermAssetValuedItemSurrogate.effectiveTime),
          this@ContractTermAssetValuedItemSurrogate._effectiveTime,
        ),
      quantity = this@ContractTermAssetValuedItemSurrogate.quantity,
      unitPrice = this@ContractTermAssetValuedItemSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ContractTermAssetValuedItemSurrogate.factor,
          this@ContractTermAssetValuedItemSurrogate._factor,
        ),
      points =
        Decimal.of(
          this@ContractTermAssetValuedItemSurrogate.points,
          this@ContractTermAssetValuedItemSurrogate._points,
        ),
      net = this@ContractTermAssetValuedItemSurrogate.net,
      payment =
        R5String.of(
          this@ContractTermAssetValuedItemSurrogate.payment,
          this@ContractTermAssetValuedItemSurrogate._payment,
        ),
      paymentDate =
        DateTime.of(
          FhirDateTime.fromString(this@ContractTermAssetValuedItemSurrogate.paymentDate),
          this@ContractTermAssetValuedItemSurrogate._paymentDate,
        ),
      responsible = this@ContractTermAssetValuedItemSurrogate.responsible,
      recipient = this@ContractTermAssetValuedItemSurrogate.recipient,
      linkId =
        if (
          this@ContractTermAssetValuedItemSurrogate.linkId == null &&
            this@ContractTermAssetValuedItemSurrogate._linkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermAssetValuedItemSurrogate.linkId
              ?: List(this@ContractTermAssetValuedItemSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermAssetValuedItemSurrogate._linkId
                ?: List(this@ContractTermAssetValuedItemSurrogate.linkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      securityLabelNumber =
        if (
          this@ContractTermAssetValuedItemSurrogate.securityLabelNumber == null &&
            this@ContractTermAssetValuedItemSurrogate._securityLabelNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermAssetValuedItemSurrogate.securityLabelNumber
              ?: List(this@ContractTermAssetValuedItemSurrogate._securityLabelNumber!!.size) {
                null
              })
            .zip(
              this@ContractTermAssetValuedItemSurrogate._securityLabelNumber
                ?: List(this@ContractTermAssetValuedItemSurrogate.securityLabelNumber!!.size) {
                  null
                }
            )
            .map { (value, element) -> UnsignedInt.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: Contract.Term.Asset.ValuedItem
    ): ContractTermAssetValuedItemSurrogate =
      with(model) {
        ContractTermAssetValuedItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          entity = this@with.entity,
          identifier = this@with.identifier,
          effectiveTime = this@with.effectiveTime?.value?.toString(),
          _effectiveTime = this@with.effectiveTime?.toElement(),
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          points = this@with.points?.value,
          _points = this@with.points?.toElement(),
          net = this@with.net,
          payment = this@with.payment?.value,
          _payment = this@with.payment?.toElement(),
          paymentDate = this@with.paymentDate?.value?.toString(),
          _paymentDate = this@with.paymentDate?.toElement(),
          responsible = this@with.responsible,
          recipient = this@with.recipient,
          linkId =
            this@with.linkId.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _linkId =
            this@with.linkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ContractTermAssetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var scope: CodeableConcept? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var typeReference: MutableList<Reference>? = null,
  public var subtype: MutableList<CodeableConcept>? = null,
  public var relationship: Coding? = null,
  public var context: MutableList<Contract.Term.Asset.Context>? = null,
  public var condition: KotlinString? = null,
  public var _condition: Element? = null,
  public var periodType: MutableList<CodeableConcept>? = null,
  public var period: MutableList<Period>? = null,
  public var usePeriod: MutableList<Period>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var linkId: MutableList<KotlinString?>? = null,
  public var _linkId: MutableList<Element?>? = null,
  public var answer: MutableList<Contract.Term.Offer.Answer>? = null,
  public var securityLabelNumber: MutableList<Int?>? = null,
  public var _securityLabelNumber: MutableList<Element?>? = null,
  public var valuedItem: MutableList<Contract.Term.Asset.ValuedItem>? = null,
) {
  public fun toModel(): Contract.Term.Asset =
    Contract.Term.Asset(
      id = this@ContractTermAssetSurrogate.id,
      extension = this@ContractTermAssetSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractTermAssetSurrogate.modifierExtension ?: mutableListOf(),
      scope = this@ContractTermAssetSurrogate.scope,
      type = this@ContractTermAssetSurrogate.type ?: mutableListOf(),
      typeReference = this@ContractTermAssetSurrogate.typeReference ?: mutableListOf(),
      subtype = this@ContractTermAssetSurrogate.subtype ?: mutableListOf(),
      relationship = this@ContractTermAssetSurrogate.relationship,
      context = this@ContractTermAssetSurrogate.context ?: mutableListOf(),
      condition =
        R5String.of(
          this@ContractTermAssetSurrogate.condition,
          this@ContractTermAssetSurrogate._condition,
        ),
      periodType = this@ContractTermAssetSurrogate.periodType ?: mutableListOf(),
      period = this@ContractTermAssetSurrogate.period ?: mutableListOf(),
      usePeriod = this@ContractTermAssetSurrogate.usePeriod ?: mutableListOf(),
      text =
        R5String.of(this@ContractTermAssetSurrogate.text, this@ContractTermAssetSurrogate._text),
      linkId =
        if (
          this@ContractTermAssetSurrogate.linkId == null &&
            this@ContractTermAssetSurrogate._linkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermAssetSurrogate.linkId
              ?: List(this@ContractTermAssetSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermAssetSurrogate._linkId
                ?: List(this@ContractTermAssetSurrogate.linkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      answer = this@ContractTermAssetSurrogate.answer ?: mutableListOf(),
      securityLabelNumber =
        if (
          this@ContractTermAssetSurrogate.securityLabelNumber == null &&
            this@ContractTermAssetSurrogate._securityLabelNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermAssetSurrogate.securityLabelNumber
              ?: List(this@ContractTermAssetSurrogate._securityLabelNumber!!.size) { null })
            .zip(
              this@ContractTermAssetSurrogate._securityLabelNumber
                ?: List(this@ContractTermAssetSurrogate.securityLabelNumber!!.size) { null }
            )
            .map { (value, element) -> UnsignedInt.of(value, element)!! }
            .toMutableList()
        },
      valuedItem = this@ContractTermAssetSurrogate.valuedItem ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Asset): ContractTermAssetSurrogate =
      with(model) {
        ContractTermAssetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          scope = this@with.scope,
          type = this@with.type.takeUnless { it.all { it == null } },
          typeReference = this@with.typeReference.takeUnless { it.all { it == null } },
          subtype = this@with.subtype.takeUnless { it.all { it == null } },
          relationship = this@with.relationship,
          context = this@with.context.takeUnless { it.all { it == null } },
          condition = this@with.condition?.value,
          _condition = this@with.condition?.toElement(),
          periodType = this@with.periodType.takeUnless { it.all { it == null } },
          period = this@with.period.takeUnless { it.all { it == null } },
          usePeriod = this@with.usePeriod.takeUnless { it.all { it == null } },
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          linkId =
            this@with.linkId.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _linkId =
            this@with.linkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          answer = this@with.answer.takeUnless { it.all { it == null } },
          securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          valuedItem = this@with.valuedItem.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ContractTermActionSubjectSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: MutableList<Reference>? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): Contract.Term.Action.Subject =
    Contract.Term.Action.Subject(
      id = this@ContractTermActionSubjectSurrogate.id,
      extension = this@ContractTermActionSubjectSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ContractTermActionSubjectSurrogate.modifierExtension ?: mutableListOf(),
      reference = this@ContractTermActionSubjectSurrogate.reference ?: mutableListOf(),
      role = this@ContractTermActionSubjectSurrogate.role,
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Action.Subject): ContractTermActionSubjectSurrogate =
      with(model) {
        ContractTermActionSubjectSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference.takeUnless { it.all { it == null } },
          role = this@with.role,
        )
      }
  }
}

@Serializable
internal data class ContractTermActionOccurrenceSurrogate(
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
) {
  public fun toModel(): Contract.Term.Action.Occurrence? =
    Contract.Term.Action.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ContractTermActionOccurrenceSurrogate.occurrenceDateTime),
        this@ContractTermActionOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@ContractTermActionOccurrenceSurrogate.occurrencePeriod,
      this@ContractTermActionOccurrenceSurrogate.occurrenceTiming,
    )

  public companion object {
    public fun fromModel(
      model: Contract.Term.Action.Occurrence
    ): ContractTermActionOccurrenceSurrogate =
      with(model) {
        ContractTermActionOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractTermActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var type: CodeableConcept,
  public var subject: MutableList<Contract.Term.Action.Subject>? = null,
  public var intent: CodeableConcept,
  public var linkId: MutableList<KotlinString?>? = null,
  public var _linkId: MutableList<Element?>? = null,
  public var status: CodeableConcept,
  public var context: Reference? = null,
  public var contextLinkId: MutableList<KotlinString?>? = null,
  public var _contextLinkId: MutableList<Element?>? = null,
  public var requester: MutableList<Reference>? = null,
  public var requesterLinkId: MutableList<KotlinString?>? = null,
  public var _requesterLinkId: MutableList<Element?>? = null,
  public var performerType: MutableList<CodeableConcept>? = null,
  public var performerRole: CodeableConcept? = null,
  public var performer: Reference? = null,
  public var performerLinkId: MutableList<KotlinString?>? = null,
  public var _performerLinkId: MutableList<Element?>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var reasonLinkId: MutableList<KotlinString?>? = null,
  public var _reasonLinkId: MutableList<Element?>? = null,
  public var note: MutableList<Annotation>? = null,
  public var securityLabelNumber: MutableList<Int?>? = null,
  public var _securityLabelNumber: MutableList<Element?>? = null,
  public var occurrence: Contract.Term.Action.Occurrence? = null,
) {
  public fun toModel(): Contract.Term.Action =
    Contract.Term.Action(
      id = this@ContractTermActionSurrogate.id,
      extension = this@ContractTermActionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractTermActionSurrogate.modifierExtension ?: mutableListOf(),
      doNotPerform =
        R5Boolean.of(
          this@ContractTermActionSurrogate.doNotPerform,
          this@ContractTermActionSurrogate._doNotPerform,
        ),
      type = this@ContractTermActionSurrogate.type,
      subject = this@ContractTermActionSurrogate.subject ?: mutableListOf(),
      intent = this@ContractTermActionSurrogate.intent,
      linkId =
        if (
          this@ContractTermActionSurrogate.linkId == null &&
            this@ContractTermActionSurrogate._linkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermActionSurrogate.linkId
              ?: List(this@ContractTermActionSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._linkId
                ?: List(this@ContractTermActionSurrogate.linkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      status = this@ContractTermActionSurrogate.status,
      context = this@ContractTermActionSurrogate.context,
      contextLinkId =
        if (
          this@ContractTermActionSurrogate.contextLinkId == null &&
            this@ContractTermActionSurrogate._contextLinkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermActionSurrogate.contextLinkId
              ?: List(this@ContractTermActionSurrogate._contextLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._contextLinkId
                ?: List(this@ContractTermActionSurrogate.contextLinkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      occurrence = this@ContractTermActionSurrogate.occurrence,
      requester = this@ContractTermActionSurrogate.requester ?: mutableListOf(),
      requesterLinkId =
        if (
          this@ContractTermActionSurrogate.requesterLinkId == null &&
            this@ContractTermActionSurrogate._requesterLinkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermActionSurrogate.requesterLinkId
              ?: List(this@ContractTermActionSurrogate._requesterLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._requesterLinkId
                ?: List(this@ContractTermActionSurrogate.requesterLinkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      performerType = this@ContractTermActionSurrogate.performerType ?: mutableListOf(),
      performerRole = this@ContractTermActionSurrogate.performerRole,
      performer = this@ContractTermActionSurrogate.performer,
      performerLinkId =
        if (
          this@ContractTermActionSurrogate.performerLinkId == null &&
            this@ContractTermActionSurrogate._performerLinkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermActionSurrogate.performerLinkId
              ?: List(this@ContractTermActionSurrogate._performerLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._performerLinkId
                ?: List(this@ContractTermActionSurrogate.performerLinkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      reason = this@ContractTermActionSurrogate.reason ?: mutableListOf(),
      reasonLinkId =
        if (
          this@ContractTermActionSurrogate.reasonLinkId == null &&
            this@ContractTermActionSurrogate._reasonLinkId == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermActionSurrogate.reasonLinkId
              ?: List(this@ContractTermActionSurrogate._reasonLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._reasonLinkId
                ?: List(this@ContractTermActionSurrogate.reasonLinkId!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      note = this@ContractTermActionSurrogate.note ?: mutableListOf(),
      securityLabelNumber =
        if (
          this@ContractTermActionSurrogate.securityLabelNumber == null &&
            this@ContractTermActionSurrogate._securityLabelNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ContractTermActionSurrogate.securityLabelNumber
              ?: List(this@ContractTermActionSurrogate._securityLabelNumber!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._securityLabelNumber
                ?: List(this@ContractTermActionSurrogate.securityLabelNumber!!.size) { null }
            )
            .map { (value, element) -> UnsignedInt.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Action): ContractTermActionSurrogate =
      with(model) {
        ContractTermActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          type = this@with.type,
          subject = this@with.subject.takeUnless { it.all { it == null } },
          intent = this@with.intent,
          linkId =
            this@with.linkId.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _linkId =
            this@with.linkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status,
          context = this@with.context,
          contextLinkId =
            this@with.contextLinkId
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _contextLinkId =
            this@with.contextLinkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          occurrence = this@with.occurrence,
          requester = this@with.requester.takeUnless { it.all { it == null } },
          requesterLinkId =
            this@with.requesterLinkId
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _requesterLinkId =
            this@with.requesterLinkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          performerType = this@with.performerType.takeUnless { it.all { it == null } },
          performerRole = this@with.performerRole,
          performer = this@with.performer,
          performerLinkId =
            this@with.performerLinkId
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _performerLinkId =
            this@with.performerLinkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reason = this@with.reason.takeUnless { it.all { it == null } },
          reasonLinkId =
            this@with.reasonLinkId
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _reasonLinkId =
            this@with.reasonLinkId
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          note = this@with.note.takeUnless { it.all { it == null } },
          securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _securityLabelNumber =
            this@with.securityLabelNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ContractTermTopicSurrogate(
  public var topicCodeableConcept: CodeableConcept? = null,
  public var topicReference: Reference? = null,
) {
  public fun toModel(): Contract.Term.Topic? =
    Contract.Term.Topic?.from(
      this@ContractTermTopicSurrogate.topicCodeableConcept,
      this@ContractTermTopicSurrogate.topicReference,
    )

  public companion object {
    public fun fromModel(model: Contract.Term.Topic): ContractTermTopicSurrogate =
      with(model) {
        ContractTermTopicSurrogate(
          topicCodeableConcept = this@with.asCodeableConcept()?.value,
          topicReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractTermSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var applies: Period? = null,
  public var type: CodeableConcept? = null,
  public var subType: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var securityLabel: MutableList<Contract.Term.SecurityLabel>? = null,
  public var offer: Contract.Term.Offer,
  public var asset: MutableList<Contract.Term.Asset>? = null,
  public var action: MutableList<Contract.Term.Action>? = null,
  public var group: MutableList<Contract.Term>? = null,
  public var topic: Contract.Term.Topic? = null,
) {
  public fun toModel(): Contract.Term =
    Contract.Term(
      id = this@ContractTermSurrogate.id,
      extension = this@ContractTermSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractTermSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ContractTermSurrogate.identifier,
      issued =
        DateTime.of(
          FhirDateTime.fromString(this@ContractTermSurrogate.issued),
          this@ContractTermSurrogate._issued,
        ),
      applies = this@ContractTermSurrogate.applies,
      topic = this@ContractTermSurrogate.topic,
      type = this@ContractTermSurrogate.type,
      subType = this@ContractTermSurrogate.subType,
      text = R5String.of(this@ContractTermSurrogate.text, this@ContractTermSurrogate._text),
      securityLabel = this@ContractTermSurrogate.securityLabel ?: mutableListOf(),
      offer = this@ContractTermSurrogate.offer,
      asset = this@ContractTermSurrogate.asset ?: mutableListOf(),
      action = this@ContractTermSurrogate.action ?: mutableListOf(),
      group = this@ContractTermSurrogate.group ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Contract.Term): ContractTermSurrogate =
      with(model) {
        ContractTermSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier,
          issued = this@with.issued?.value?.toString(),
          _issued = this@with.issued?.toElement(),
          applies = this@with.applies,
          topic = this@with.topic,
          type = this@with.type,
          subType = this@with.subType,
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          securityLabel = this@with.securityLabel.takeUnless { it.all { it == null } },
          offer = this@with.offer,
          asset = this@with.asset.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
          group = this@with.group.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ContractSignerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: Coding,
  public var party: Reference,
  public var signature: MutableList<Signature>? = null,
) {
  public fun toModel(): Contract.Signer =
    Contract.Signer(
      id = this@ContractSignerSurrogate.id,
      extension = this@ContractSignerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractSignerSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ContractSignerSurrogate.type,
      party = this@ContractSignerSurrogate.party,
      signature = this@ContractSignerSurrogate.signature ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Contract.Signer): ContractSignerSurrogate =
      with(model) {
        ContractSignerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          party = this@with.party,
          signature = this@with.signature.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ContractFriendlyContentSurrogate(
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): Contract.Friendly.Content =
    Contract.Friendly.Content.from(
      this@ContractFriendlyContentSurrogate.contentAttachment,
      this@ContractFriendlyContentSurrogate.contentReference,
    )!!

  public companion object {
    public fun fromModel(model: Contract.Friendly.Content): ContractFriendlyContentSurrogate =
      with(model) {
        ContractFriendlyContentSurrogate(
          contentAttachment = this@with.asAttachment()?.value,
          contentReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractFriendlySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var content: Contract.Friendly.Content,
) {
  public fun toModel(): Contract.Friendly =
    Contract.Friendly(
      id = this@ContractFriendlySurrogate.id,
      extension = this@ContractFriendlySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractFriendlySurrogate.modifierExtension ?: mutableListOf(),
      content = this@ContractFriendlySurrogate.content,
    )

  public companion object {
    public fun fromModel(model: Contract.Friendly): ContractFriendlySurrogate =
      with(model) {
        ContractFriendlySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          content = this@with.content,
        )
      }
  }
}

@Serializable
internal data class ContractLegalContentSurrogate(
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): Contract.Legal.Content =
    Contract.Legal.Content.from(
      this@ContractLegalContentSurrogate.contentAttachment,
      this@ContractLegalContentSurrogate.contentReference,
    )!!

  public companion object {
    public fun fromModel(model: Contract.Legal.Content): ContractLegalContentSurrogate =
      with(model) {
        ContractLegalContentSurrogate(
          contentAttachment = this@with.asAttachment()?.value,
          contentReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractLegalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var content: Contract.Legal.Content,
) {
  public fun toModel(): Contract.Legal =
    Contract.Legal(
      id = this@ContractLegalSurrogate.id,
      extension = this@ContractLegalSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractLegalSurrogate.modifierExtension ?: mutableListOf(),
      content = this@ContractLegalSurrogate.content,
    )

  public companion object {
    public fun fromModel(model: Contract.Legal): ContractLegalSurrogate =
      with(model) {
        ContractLegalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          content = this@with.content,
        )
      }
  }
}

@Serializable
internal data class ContractRuleContentSurrogate(
  public var contentAttachment: Attachment? = null,
  public var contentReference: Reference? = null,
) {
  public fun toModel(): Contract.Rule.Content =
    Contract.Rule.Content.from(
      this@ContractRuleContentSurrogate.contentAttachment,
      this@ContractRuleContentSurrogate.contentReference,
    )!!

  public companion object {
    public fun fromModel(model: Contract.Rule.Content): ContractRuleContentSurrogate =
      with(model) {
        ContractRuleContentSurrogate(
          contentAttachment = this@with.asAttachment()?.value,
          contentReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractRuleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var content: Contract.Rule.Content,
) {
  public fun toModel(): Contract.Rule =
    Contract.Rule(
      id = this@ContractRuleSurrogate.id,
      extension = this@ContractRuleSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractRuleSurrogate.modifierExtension ?: mutableListOf(),
      content = this@ContractRuleSurrogate.content,
    )

  public companion object {
    public fun fromModel(model: Contract.Rule): ContractRuleSurrogate =
      with(model) {
        ContractRuleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          content = this@with.content,
        )
      }
  }
}

@Serializable
internal data class ContractTopicSurrogate(
  public var topicCodeableConcept: CodeableConcept? = null,
  public var topicReference: Reference? = null,
) {
  public fun toModel(): Contract.Topic? =
    Contract.Topic?.from(
      this@ContractTopicSurrogate.topicCodeableConcept,
      this@ContractTopicSurrogate.topicReference,
    )

  public companion object {
    public fun fromModel(model: Contract.Topic): ContractTopicSurrogate =
      with(model) {
        ContractTopicSurrogate(
          topicCodeableConcept = this@with.asCodeableConcept()?.value,
          topicReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractLegallyBindingSurrogate(
  public var legallyBindingAttachment: Attachment? = null,
  public var legallyBindingReference: Reference? = null,
) {
  public fun toModel(): Contract.LegallyBinding? =
    Contract.LegallyBinding?.from(
      this@ContractLegallyBindingSurrogate.legallyBindingAttachment,
      this@ContractLegallyBindingSurrogate.legallyBindingReference,
    )

  public companion object {
    public fun fromModel(model: Contract.LegallyBinding): ContractLegallyBindingSurrogate =
      with(model) {
        ContractLegallyBindingSurrogate(
          legallyBindingAttachment = this@with.asAttachment()?.value,
          legallyBindingReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ContractSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var legalState: CodeableConcept? = null,
  public var instantiatesCanonical: Reference? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var contentDerivative: CodeableConcept? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var applies: Period? = null,
  public var expirationType: CodeableConcept? = null,
  public var subject: MutableList<Reference>? = null,
  public var authority: MutableList<Reference>? = null,
  public var domain: MutableList<Reference>? = null,
  public var site: MutableList<Reference>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var alias: MutableList<KotlinString?>? = null,
  public var _alias: MutableList<Element?>? = null,
  public var author: Reference? = null,
  public var scope: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var subType: MutableList<CodeableConcept>? = null,
  public var contentDefinition: Contract.ContentDefinition? = null,
  public var term: MutableList<Contract.Term>? = null,
  public var supportingInfo: MutableList<Reference>? = null,
  public var relevantHistory: MutableList<Reference>? = null,
  public var signer: MutableList<Contract.Signer>? = null,
  public var friendly: MutableList<Contract.Friendly>? = null,
  public var legal: MutableList<Contract.Legal>? = null,
  public var rule: MutableList<Contract.Rule>? = null,
  public var topic: Contract.Topic? = null,
  public var legallyBinding: Contract.LegallyBinding? = null,
) {
  public fun toModel(): Contract =
    Contract(
      id = this@ContractSurrogate.id,
      meta = this@ContractSurrogate.meta,
      implicitRules =
        Uri.of(this@ContractSurrogate.implicitRules, this@ContractSurrogate._implicitRules),
      language = Code.of(this@ContractSurrogate.language, this@ContractSurrogate._language),
      text = this@ContractSurrogate.text,
      contained = this@ContractSurrogate.contained ?: mutableListOf(),
      extension = this@ContractSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ContractSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ContractSurrogate.identifier ?: mutableListOf(),
      url = Uri.of(this@ContractSurrogate.url, this@ContractSurrogate._url),
      version = R5String.of(this@ContractSurrogate.version, this@ContractSurrogate._version),
      status =
        this@ContractSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Contract.ContractStatus.fromCode(it!!),
            this@ContractSurrogate._status,
          )
        },
      legalState = this@ContractSurrogate.legalState,
      instantiatesCanonical = this@ContractSurrogate.instantiatesCanonical,
      instantiatesUri =
        Uri.of(this@ContractSurrogate.instantiatesUri, this@ContractSurrogate._instantiatesUri),
      contentDerivative = this@ContractSurrogate.contentDerivative,
      issued =
        DateTime.of(
          FhirDateTime.fromString(this@ContractSurrogate.issued),
          this@ContractSurrogate._issued,
        ),
      applies = this@ContractSurrogate.applies,
      expirationType = this@ContractSurrogate.expirationType,
      subject = this@ContractSurrogate.subject ?: mutableListOf(),
      authority = this@ContractSurrogate.authority ?: mutableListOf(),
      domain = this@ContractSurrogate.domain ?: mutableListOf(),
      site = this@ContractSurrogate.site ?: mutableListOf(),
      name = R5String.of(this@ContractSurrogate.name, this@ContractSurrogate._name),
      title = R5String.of(this@ContractSurrogate.title, this@ContractSurrogate._title),
      subtitle = R5String.of(this@ContractSurrogate.subtitle, this@ContractSurrogate._subtitle),
      alias =
        if (this@ContractSurrogate.alias == null && this@ContractSurrogate._alias == null) {
          mutableListOf()
        } else {
          (this@ContractSurrogate.alias ?: List(this@ContractSurrogate._alias!!.size) { null })
            .zip(
              this@ContractSurrogate._alias ?: List(this@ContractSurrogate.alias!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      author = this@ContractSurrogate.author,
      scope = this@ContractSurrogate.scope,
      topic = this@ContractSurrogate.topic,
      type = this@ContractSurrogate.type,
      subType = this@ContractSurrogate.subType ?: mutableListOf(),
      contentDefinition = this@ContractSurrogate.contentDefinition,
      term = this@ContractSurrogate.term ?: mutableListOf(),
      supportingInfo = this@ContractSurrogate.supportingInfo ?: mutableListOf(),
      relevantHistory = this@ContractSurrogate.relevantHistory ?: mutableListOf(),
      signer = this@ContractSurrogate.signer ?: mutableListOf(),
      friendly = this@ContractSurrogate.friendly ?: mutableListOf(),
      legal = this@ContractSurrogate.legal ?: mutableListOf(),
      rule = this@ContractSurrogate.rule ?: mutableListOf(),
      legallyBinding = this@ContractSurrogate.legallyBinding,
    )

  public companion object {
    public fun fromModel(model: Contract): ContractSurrogate =
      with(model) {
        ContractSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          legalState = this@with.legalState,
          instantiatesCanonical = this@with.instantiatesCanonical,
          instantiatesUri = this@with.instantiatesUri?.value,
          _instantiatesUri = this@with.instantiatesUri?.toElement(),
          contentDerivative = this@with.contentDerivative,
          issued = this@with.issued?.value?.toString(),
          _issued = this@with.issued?.toElement(),
          applies = this@with.applies,
          expirationType = this@with.expirationType,
          subject = this@with.subject.takeUnless { it.all { it == null } },
          authority = this@with.authority.takeUnless { it.all { it == null } },
          domain = this@with.domain.takeUnless { it.all { it == null } },
          site = this@with.site.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          alias =
            this@with.alias.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _alias =
            this@with.alias
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          author = this@with.author,
          scope = this@with.scope,
          topic = this@with.topic,
          type = this@with.type,
          subType = this@with.subType.takeUnless { it.all { it == null } },
          contentDefinition = this@with.contentDefinition,
          term = this@with.term.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          relevantHistory = this@with.relevantHistory.takeUnless { it.all { it == null } },
          signer = this@with.signer.takeUnless { it.all { it == null } },
          friendly = this@with.friendly.takeUnless { it.all { it == null } },
          legal = this@with.legal.takeUnless { it.all { it == null } },
          rule = this@with.rule.takeUnless { it.all { it == null } },
          legallyBinding = this@with.legallyBinding,
        )
      }
  }
}
