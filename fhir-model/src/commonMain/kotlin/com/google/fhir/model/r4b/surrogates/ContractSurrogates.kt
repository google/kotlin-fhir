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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.Contract
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
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Signature
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Time
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.UnsignedInt
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
internal data class ContractContentDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
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
    Contract.ContentDefinition().apply {
      id = this@ContractContentDefinitionSurrogate.id
      extension = this@ContractContentDefinitionSurrogate.extension
      modifierExtension = this@ContractContentDefinitionSurrogate.modifierExtension
      type = this@ContractContentDefinitionSurrogate.type
      subType = this@ContractContentDefinitionSurrogate.subType
      publisher = this@ContractContentDefinitionSurrogate.publisher
      publicationDate =
        DateTime.of(
          FhirDateTime.fromString(this@ContractContentDefinitionSurrogate.publicationDate),
          this@ContractContentDefinitionSurrogate._publicationDate,
        )
      publicationStatus =
        Enumeration.of(
          this@ContractContentDefinitionSurrogate.publicationStatus?.let {
            com.google.fhir.model.r4b.Contract.ContractPublicationStatus.fromCode(it)
          },
          this@ContractContentDefinitionSurrogate._publicationStatus,
        )
      copyright =
        Markdown.of(
          this@ContractContentDefinitionSurrogate.copyright,
          this@ContractContentDefinitionSurrogate._copyright,
        )
    }

  public companion object {
    public fun fromModel(model: Contract.ContentDefinition): ContractContentDefinitionSurrogate =
      with(model) {
        ContractContentDefinitionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          subType = this@with.subType
          publisher = this@with.publisher
          publicationDate = this@with.publicationDate?.value?.toString()
          _publicationDate = this@with.publicationDate?.toElement()
          publicationStatus = this@with.publicationStatus?.value?.getCode()
          _publicationStatus = this@with.publicationStatus?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
        }
      }
  }
}

@Serializable
internal data class ContractTermSecurityLabelSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var number: List<Int?>? = null,
  public var _number: List<Element?>? = null,
  public var classification: Coding? = null,
  public var category: List<Coding?>? = null,
  public var control: List<Coding?>? = null,
) {
  public fun toModel(): Contract.Term.SecurityLabel =
    Contract.Term.SecurityLabel().apply {
      id = this@ContractTermSecurityLabelSurrogate.id
      extension = this@ContractTermSecurityLabelSurrogate.extension
      modifierExtension = this@ContractTermSecurityLabelSurrogate.modifierExtension
      number =
        if (
          this@ContractTermSecurityLabelSurrogate.number == null &&
            this@ContractTermSecurityLabelSurrogate._number == null
        ) {
          null
        } else {
          (this@ContractTermSecurityLabelSurrogate.number
              ?: List(this@ContractTermSecurityLabelSurrogate._number!!.size) { null })
            .zip(
              this@ContractTermSecurityLabelSurrogate._number
                ?: List(this@ContractTermSecurityLabelSurrogate.number!!.size) { null }
            )
            .mapNotNull { (value, element) -> UnsignedInt.of(value, element) }
        }
      classification = this@ContractTermSecurityLabelSurrogate.classification
      category = this@ContractTermSecurityLabelSurrogate.category
      control = this@ContractTermSecurityLabelSurrogate.control
    }

  public companion object {
    public fun fromModel(model: Contract.Term.SecurityLabel): ContractTermSecurityLabelSurrogate =
      with(model) {
        ContractTermSecurityLabelSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          number = this@with.number?.map { it?.value }?.takeUnless { it.all { it == null } }
          _number = this@with.number?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          classification = this@with.classification
          category = this@with.category
          control = this@with.control
        }
      }
  }
}

@Serializable
internal data class ContractTermOfferPartySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: List<Reference?>? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): Contract.Term.Offer.Party =
    Contract.Term.Offer.Party().apply {
      id = this@ContractTermOfferPartySurrogate.id
      extension = this@ContractTermOfferPartySurrogate.extension
      modifierExtension = this@ContractTermOfferPartySurrogate.modifierExtension
      reference = this@ContractTermOfferPartySurrogate.reference
      role = this@ContractTermOfferPartySurrogate.role
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Offer.Party): ContractTermOfferPartySurrogate =
      with(model) {
        ContractTermOfferPartySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference
          role = this@with.role
        }
      }
  }
}

@Serializable
internal class ContractTermOfferAnswerValueSurrogate {
  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueDecimal: Double? = null

  public var _valueDecimal: Element? = null

  public var valueInteger: Int? = null

  public var _valueInteger: Element? = null

  public var valueDate: KotlinString? = null

  public var _valueDate: Element? = null

  public var valueDateTime: KotlinString? = null

  public var _valueDateTime: Element? = null

  public var valueTime: LocalTime? = null

  public var _valueTime: Element? = null

  public var valueString: KotlinString? = null

  public var _valueString: Element? = null

  public var valueUri: KotlinString? = null

  public var _valueUri: Element? = null

  public var valueAttachment: Attachment? = null

  public var valueCoding: Coding? = null

  public var valueQuantity: Quantity? = null

  public var valueReference: Reference? = null

  public fun toModel(): Contract.Term.Offer.Answer.Value =
    Contract.Term.Offer.Answer.Value?.from(
      R4bBoolean.of(
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
      R4bString.of(
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
    ) ?: Contract.Term.Offer.Answer.Value.Null

  public companion object {
    public fun fromModel(
      model: Contract.Term.Offer.Answer.Value
    ): ContractTermOfferAnswerValueSurrogate =
      with(model) {
        ContractTermOfferAnswerValueSurrogate().apply {
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueDecimal = this@with.asDecimal()?.value?.value
          _valueDecimal = this@with.asDecimal()?.value?.toElement()
          valueInteger = this@with.asInteger()?.value?.value
          _valueInteger = this@with.asInteger()?.value?.toElement()
          valueDate = this@with.asDate()?.value?.value?.toString()
          _valueDate = this@with.asDate()?.value?.toElement()
          valueDateTime = this@with.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.asDateTime()?.value?.toElement()
          valueTime = this@with.asTime()?.value?.value
          _valueTime = this@with.asTime()?.value?.toElement()
          valueString = this@with.asString()?.value?.value
          _valueString = this@with.asString()?.value?.toElement()
          valueUri = this@with.asUri()?.value?.value
          _valueUri = this@with.asUri()?.value?.toElement()
          valueAttachment = this@with.asAttachment()?.value
          valueCoding = this@with.asCoding()?.value
          valueQuantity = this@with.asQuantity()?.value
          valueReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ContractTermOfferAnswerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `value`: Contract.Term.Offer.Answer.Value? = null,
) {
  public fun toModel(): Contract.Term.Offer.Answer =
    Contract.Term.Offer.Answer().apply {
      id = this@ContractTermOfferAnswerSurrogate.id
      extension = this@ContractTermOfferAnswerSurrogate.extension
      modifierExtension = this@ContractTermOfferAnswerSurrogate.modifierExtension
      `value` = this@ContractTermOfferAnswerSurrogate.`value`
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Offer.Answer): ContractTermOfferAnswerSurrogate =
      with(model) {
        ContractTermOfferAnswerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class ContractTermOfferSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var party: List<Contract.Term.Offer.Party>? = null,
  public var topic: Reference? = null,
  public var type: CodeableConcept? = null,
  public var decision: CodeableConcept? = null,
  public var decisionMode: List<CodeableConcept?>? = null,
  public var answer: List<Contract.Term.Offer.Answer>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var linkId: List<KotlinString?>? = null,
  public var _linkId: List<Element?>? = null,
  public var securityLabelNumber: List<Int?>? = null,
  public var _securityLabelNumber: List<Element?>? = null,
) {
  public fun toModel(): Contract.Term.Offer =
    Contract.Term.Offer().apply {
      id = this@ContractTermOfferSurrogate.id
      extension = this@ContractTermOfferSurrogate.extension
      modifierExtension = this@ContractTermOfferSurrogate.modifierExtension
      identifier = this@ContractTermOfferSurrogate.identifier
      party = this@ContractTermOfferSurrogate.party
      topic = this@ContractTermOfferSurrogate.topic
      type = this@ContractTermOfferSurrogate.type
      decision = this@ContractTermOfferSurrogate.decision
      decisionMode = this@ContractTermOfferSurrogate.decisionMode
      answer = this@ContractTermOfferSurrogate.answer
      text =
        R4bString.of(this@ContractTermOfferSurrogate.text, this@ContractTermOfferSurrogate._text)
      linkId =
        if (
          this@ContractTermOfferSurrogate.linkId == null &&
            this@ContractTermOfferSurrogate._linkId == null
        ) {
          null
        } else {
          (this@ContractTermOfferSurrogate.linkId
              ?: List(this@ContractTermOfferSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermOfferSurrogate._linkId
                ?: List(this@ContractTermOfferSurrogate.linkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      securityLabelNumber =
        if (
          this@ContractTermOfferSurrogate.securityLabelNumber == null &&
            this@ContractTermOfferSurrogate._securityLabelNumber == null
        ) {
          null
        } else {
          (this@ContractTermOfferSurrogate.securityLabelNumber
              ?: List(this@ContractTermOfferSurrogate._securityLabelNumber!!.size) { null })
            .zip(
              this@ContractTermOfferSurrogate._securityLabelNumber
                ?: List(this@ContractTermOfferSurrogate.securityLabelNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> UnsignedInt.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Offer): ContractTermOfferSurrogate =
      with(model) {
        ContractTermOfferSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          party = this@with.party
          topic = this@with.topic
          type = this@with.type
          decision = this@with.decision
          decisionMode = this@with.decisionMode
          answer = this@with.answer
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          linkId = this@with.linkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _linkId = this@with.linkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          securityLabelNumber =
            this@with.securityLabelNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _securityLabelNumber =
            this@with.securityLabelNumber
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class ContractTermAssetContextSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: Reference? = null,
  public var code: List<CodeableConcept?>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Contract.Term.Asset.Context =
    Contract.Term.Asset.Context().apply {
      id = this@ContractTermAssetContextSurrogate.id
      extension = this@ContractTermAssetContextSurrogate.extension
      modifierExtension = this@ContractTermAssetContextSurrogate.modifierExtension
      reference = this@ContractTermAssetContextSurrogate.reference
      code = this@ContractTermAssetContextSurrogate.code
      text =
        R4bString.of(
          this@ContractTermAssetContextSurrogate.text,
          this@ContractTermAssetContextSurrogate._text,
        )
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Asset.Context): ContractTermAssetContextSurrogate =
      with(model) {
        ContractTermAssetContextSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference
          code = this@with.code
          text = this@with.text?.value
          _text = this@with.text?.toElement()
        }
      }
  }
}

@Serializable
internal class ContractTermAssetValuedItemEntitySurrogate {
  public var entityCodeableConcept: CodeableConcept? = null

  public var entityReference: Reference? = null

  public fun toModel(): Contract.Term.Asset.ValuedItem.Entity =
    Contract.Term.Asset.ValuedItem.Entity?.from(
      this@ContractTermAssetValuedItemEntitySurrogate.entityCodeableConcept,
      this@ContractTermAssetValuedItemEntitySurrogate.entityReference,
    ) ?: Contract.Term.Asset.ValuedItem.Entity.Null

  public companion object {
    public fun fromModel(
      model: Contract.Term.Asset.ValuedItem.Entity
    ): ContractTermAssetValuedItemEntitySurrogate =
      with(model) {
        ContractTermAssetValuedItemEntitySurrogate().apply {
          entityCodeableConcept = this@with.asCodeableConcept()?.value
          entityReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ContractTermAssetValuedItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
  public var linkId: List<KotlinString?>? = null,
  public var _linkId: List<Element?>? = null,
  public var securityLabelNumber: List<Int?>? = null,
  public var _securityLabelNumber: List<Element?>? = null,
  public var entity: Contract.Term.Asset.ValuedItem.Entity? = null,
) {
  public fun toModel(): Contract.Term.Asset.ValuedItem =
    Contract.Term.Asset.ValuedItem().apply {
      id = this@ContractTermAssetValuedItemSurrogate.id
      extension = this@ContractTermAssetValuedItemSurrogate.extension
      modifierExtension = this@ContractTermAssetValuedItemSurrogate.modifierExtension
      entity = this@ContractTermAssetValuedItemSurrogate.entity
      identifier = this@ContractTermAssetValuedItemSurrogate.identifier
      effectiveTime =
        DateTime.of(
          FhirDateTime.fromString(this@ContractTermAssetValuedItemSurrogate.effectiveTime),
          this@ContractTermAssetValuedItemSurrogate._effectiveTime,
        )
      quantity = this@ContractTermAssetValuedItemSurrogate.quantity
      unitPrice = this@ContractTermAssetValuedItemSurrogate.unitPrice
      factor =
        Decimal.of(
          this@ContractTermAssetValuedItemSurrogate.factor,
          this@ContractTermAssetValuedItemSurrogate._factor,
        )
      points =
        Decimal.of(
          this@ContractTermAssetValuedItemSurrogate.points,
          this@ContractTermAssetValuedItemSurrogate._points,
        )
      net = this@ContractTermAssetValuedItemSurrogate.net
      payment =
        R4bString.of(
          this@ContractTermAssetValuedItemSurrogate.payment,
          this@ContractTermAssetValuedItemSurrogate._payment,
        )
      paymentDate =
        DateTime.of(
          FhirDateTime.fromString(this@ContractTermAssetValuedItemSurrogate.paymentDate),
          this@ContractTermAssetValuedItemSurrogate._paymentDate,
        )
      responsible = this@ContractTermAssetValuedItemSurrogate.responsible
      recipient = this@ContractTermAssetValuedItemSurrogate.recipient
      linkId =
        if (
          this@ContractTermAssetValuedItemSurrogate.linkId == null &&
            this@ContractTermAssetValuedItemSurrogate._linkId == null
        ) {
          null
        } else {
          (this@ContractTermAssetValuedItemSurrogate.linkId
              ?: List(this@ContractTermAssetValuedItemSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermAssetValuedItemSurrogate._linkId
                ?: List(this@ContractTermAssetValuedItemSurrogate.linkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      securityLabelNumber =
        if (
          this@ContractTermAssetValuedItemSurrogate.securityLabelNumber == null &&
            this@ContractTermAssetValuedItemSurrogate._securityLabelNumber == null
        ) {
          null
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
            .mapNotNull { (value, element) -> UnsignedInt.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: Contract.Term.Asset.ValuedItem
    ): ContractTermAssetValuedItemSurrogate =
      with(model) {
        ContractTermAssetValuedItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          entity = this@with.entity
          identifier = this@with.identifier
          effectiveTime = this@with.effectiveTime?.value?.toString()
          _effectiveTime = this@with.effectiveTime?.toElement()
          quantity = this@with.quantity
          unitPrice = this@with.unitPrice
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          points = this@with.points?.value
          _points = this@with.points?.toElement()
          net = this@with.net
          payment = this@with.payment?.value
          _payment = this@with.payment?.toElement()
          paymentDate = this@with.paymentDate?.value?.toString()
          _paymentDate = this@with.paymentDate?.toElement()
          responsible = this@with.responsible
          recipient = this@with.recipient
          linkId = this@with.linkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _linkId = this@with.linkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          securityLabelNumber =
            this@with.securityLabelNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _securityLabelNumber =
            this@with.securityLabelNumber
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class ContractTermAssetSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var scope: CodeableConcept? = null,
  public var type: List<CodeableConcept?>? = null,
  public var typeReference: List<Reference?>? = null,
  public var subtype: List<CodeableConcept?>? = null,
  public var relationship: Coding? = null,
  public var context: List<Contract.Term.Asset.Context>? = null,
  public var condition: KotlinString? = null,
  public var _condition: Element? = null,
  public var periodType: List<CodeableConcept?>? = null,
  public var period: List<Period?>? = null,
  public var usePeriod: List<Period?>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var linkId: List<KotlinString?>? = null,
  public var _linkId: List<Element?>? = null,
  public var answer: List<Contract.Term.Offer.Answer?>? = null,
  public var securityLabelNumber: List<Int?>? = null,
  public var _securityLabelNumber: List<Element?>? = null,
  public var valuedItem: List<Contract.Term.Asset.ValuedItem>? = null,
) {
  public fun toModel(): Contract.Term.Asset =
    Contract.Term.Asset().apply {
      id = this@ContractTermAssetSurrogate.id
      extension = this@ContractTermAssetSurrogate.extension
      modifierExtension = this@ContractTermAssetSurrogate.modifierExtension
      scope = this@ContractTermAssetSurrogate.scope
      type = this@ContractTermAssetSurrogate.type
      typeReference = this@ContractTermAssetSurrogate.typeReference
      subtype = this@ContractTermAssetSurrogate.subtype
      relationship = this@ContractTermAssetSurrogate.relationship
      context = this@ContractTermAssetSurrogate.context
      condition =
        R4bString.of(
          this@ContractTermAssetSurrogate.condition,
          this@ContractTermAssetSurrogate._condition,
        )
      periodType = this@ContractTermAssetSurrogate.periodType
      period = this@ContractTermAssetSurrogate.period
      usePeriod = this@ContractTermAssetSurrogate.usePeriod
      text =
        R4bString.of(this@ContractTermAssetSurrogate.text, this@ContractTermAssetSurrogate._text)
      linkId =
        if (
          this@ContractTermAssetSurrogate.linkId == null &&
            this@ContractTermAssetSurrogate._linkId == null
        ) {
          null
        } else {
          (this@ContractTermAssetSurrogate.linkId
              ?: List(this@ContractTermAssetSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermAssetSurrogate._linkId
                ?: List(this@ContractTermAssetSurrogate.linkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      answer = this@ContractTermAssetSurrogate.answer
      securityLabelNumber =
        if (
          this@ContractTermAssetSurrogate.securityLabelNumber == null &&
            this@ContractTermAssetSurrogate._securityLabelNumber == null
        ) {
          null
        } else {
          (this@ContractTermAssetSurrogate.securityLabelNumber
              ?: List(this@ContractTermAssetSurrogate._securityLabelNumber!!.size) { null })
            .zip(
              this@ContractTermAssetSurrogate._securityLabelNumber
                ?: List(this@ContractTermAssetSurrogate.securityLabelNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> UnsignedInt.of(value, element) }
        }
      valuedItem = this@ContractTermAssetSurrogate.valuedItem
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Asset): ContractTermAssetSurrogate =
      with(model) {
        ContractTermAssetSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          scope = this@with.scope
          type = this@with.type
          typeReference = this@with.typeReference
          subtype = this@with.subtype
          relationship = this@with.relationship
          context = this@with.context
          condition = this@with.condition?.value
          _condition = this@with.condition?.toElement()
          periodType = this@with.periodType
          period = this@with.period
          usePeriod = this@with.usePeriod
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          linkId = this@with.linkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _linkId = this@with.linkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          answer = this@with.answer
          securityLabelNumber =
            this@with.securityLabelNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _securityLabelNumber =
            this@with.securityLabelNumber
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          valuedItem = this@with.valuedItem
        }
      }
  }
}

@Serializable
internal data class ContractTermActionSubjectSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: List<Reference?>? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): Contract.Term.Action.Subject =
    Contract.Term.Action.Subject().apply {
      id = this@ContractTermActionSubjectSurrogate.id
      extension = this@ContractTermActionSubjectSurrogate.extension
      modifierExtension = this@ContractTermActionSubjectSurrogate.modifierExtension
      reference = this@ContractTermActionSubjectSurrogate.reference
      role = this@ContractTermActionSubjectSurrogate.role
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Action.Subject): ContractTermActionSubjectSurrogate =
      with(model) {
        ContractTermActionSubjectSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference
          role = this@with.role
        }
      }
  }
}

@Serializable
internal class ContractTermActionOccurrenceSurrogate {
  public var occurrenceDateTime: KotlinString? = null

  public var _occurrenceDateTime: Element? = null

  public var occurrencePeriod: Period? = null

  public var occurrenceTiming: Timing? = null

  public fun toModel(): Contract.Term.Action.Occurrence =
    Contract.Term.Action.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ContractTermActionOccurrenceSurrogate.occurrenceDateTime),
        this@ContractTermActionOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@ContractTermActionOccurrenceSurrogate.occurrencePeriod,
      this@ContractTermActionOccurrenceSurrogate.occurrenceTiming,
    ) ?: Contract.Term.Action.Occurrence.Null

  public companion object {
    public fun fromModel(
      model: Contract.Term.Action.Occurrence
    ): ContractTermActionOccurrenceSurrogate =
      with(model) {
        ContractTermActionOccurrenceSurrogate().apply {
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.asPeriod()?.value
          occurrenceTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal data class ContractTermActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var type: CodeableConcept? = null,
  public var subject: List<Contract.Term.Action.Subject>? = null,
  public var intent: CodeableConcept? = null,
  public var linkId: List<KotlinString?>? = null,
  public var _linkId: List<Element?>? = null,
  public var status: CodeableConcept? = null,
  public var context: Reference? = null,
  public var contextLinkId: List<KotlinString?>? = null,
  public var _contextLinkId: List<Element?>? = null,
  public var requester: List<Reference?>? = null,
  public var requesterLinkId: List<KotlinString?>? = null,
  public var _requesterLinkId: List<Element?>? = null,
  public var performerType: List<CodeableConcept?>? = null,
  public var performerRole: CodeableConcept? = null,
  public var performer: Reference? = null,
  public var performerLinkId: List<KotlinString?>? = null,
  public var _performerLinkId: List<Element?>? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var reason: List<KotlinString?>? = null,
  public var _reason: List<Element?>? = null,
  public var reasonLinkId: List<KotlinString?>? = null,
  public var _reasonLinkId: List<Element?>? = null,
  public var note: List<Annotation?>? = null,
  public var securityLabelNumber: List<Int?>? = null,
  public var _securityLabelNumber: List<Element?>? = null,
  public var occurrence: Contract.Term.Action.Occurrence? = null,
) {
  public fun toModel(): Contract.Term.Action =
    Contract.Term.Action().apply {
      id = this@ContractTermActionSurrogate.id
      extension = this@ContractTermActionSurrogate.extension
      modifierExtension = this@ContractTermActionSurrogate.modifierExtension
      doNotPerform =
        R4bBoolean.of(
          this@ContractTermActionSurrogate.doNotPerform,
          this@ContractTermActionSurrogate._doNotPerform,
        )
      type = this@ContractTermActionSurrogate.type
      subject = this@ContractTermActionSurrogate.subject
      intent = this@ContractTermActionSurrogate.intent
      linkId =
        if (
          this@ContractTermActionSurrogate.linkId == null &&
            this@ContractTermActionSurrogate._linkId == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.linkId
              ?: List(this@ContractTermActionSurrogate._linkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._linkId
                ?: List(this@ContractTermActionSurrogate.linkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      status = this@ContractTermActionSurrogate.status
      context = this@ContractTermActionSurrogate.context
      contextLinkId =
        if (
          this@ContractTermActionSurrogate.contextLinkId == null &&
            this@ContractTermActionSurrogate._contextLinkId == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.contextLinkId
              ?: List(this@ContractTermActionSurrogate._contextLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._contextLinkId
                ?: List(this@ContractTermActionSurrogate.contextLinkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      occurrence = this@ContractTermActionSurrogate.occurrence
      requester = this@ContractTermActionSurrogate.requester
      requesterLinkId =
        if (
          this@ContractTermActionSurrogate.requesterLinkId == null &&
            this@ContractTermActionSurrogate._requesterLinkId == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.requesterLinkId
              ?: List(this@ContractTermActionSurrogate._requesterLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._requesterLinkId
                ?: List(this@ContractTermActionSurrogate.requesterLinkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      performerType = this@ContractTermActionSurrogate.performerType
      performerRole = this@ContractTermActionSurrogate.performerRole
      performer = this@ContractTermActionSurrogate.performer
      performerLinkId =
        if (
          this@ContractTermActionSurrogate.performerLinkId == null &&
            this@ContractTermActionSurrogate._performerLinkId == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.performerLinkId
              ?: List(this@ContractTermActionSurrogate._performerLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._performerLinkId
                ?: List(this@ContractTermActionSurrogate.performerLinkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      reasonCode = this@ContractTermActionSurrogate.reasonCode
      reasonReference = this@ContractTermActionSurrogate.reasonReference
      reason =
        if (
          this@ContractTermActionSurrogate.reason == null &&
            this@ContractTermActionSurrogate._reason == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.reason
              ?: List(this@ContractTermActionSurrogate._reason!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._reason
                ?: List(this@ContractTermActionSurrogate.reason!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      reasonLinkId =
        if (
          this@ContractTermActionSurrogate.reasonLinkId == null &&
            this@ContractTermActionSurrogate._reasonLinkId == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.reasonLinkId
              ?: List(this@ContractTermActionSurrogate._reasonLinkId!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._reasonLinkId
                ?: List(this@ContractTermActionSurrogate.reasonLinkId!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      note = this@ContractTermActionSurrogate.note
      securityLabelNumber =
        if (
          this@ContractTermActionSurrogate.securityLabelNumber == null &&
            this@ContractTermActionSurrogate._securityLabelNumber == null
        ) {
          null
        } else {
          (this@ContractTermActionSurrogate.securityLabelNumber
              ?: List(this@ContractTermActionSurrogate._securityLabelNumber!!.size) { null })
            .zip(
              this@ContractTermActionSurrogate._securityLabelNumber
                ?: List(this@ContractTermActionSurrogate.securityLabelNumber!!.size) { null }
            )
            .mapNotNull { (value, element) -> UnsignedInt.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: Contract.Term.Action): ContractTermActionSurrogate =
      with(model) {
        ContractTermActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          doNotPerform = this@with.doNotPerform?.value
          _doNotPerform = this@with.doNotPerform?.toElement()
          type = this@with.type
          subject = this@with.subject
          intent = this@with.intent
          linkId = this@with.linkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _linkId = this@with.linkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          status = this@with.status
          context = this@with.context
          contextLinkId =
            this@with.contextLinkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _contextLinkId =
            this@with.contextLinkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          occurrence = this@with.occurrence
          requester = this@with.requester
          requesterLinkId =
            this@with.requesterLinkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _requesterLinkId =
            this@with.requesterLinkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          performerType = this@with.performerType
          performerRole = this@with.performerRole
          performer = this@with.performer
          performerLinkId =
            this@with.performerLinkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _performerLinkId =
            this@with.performerLinkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          reason = this@with.reason?.map { it?.value }?.takeUnless { it.all { it == null } }
          _reason = this@with.reason?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          reasonLinkId =
            this@with.reasonLinkId?.map { it?.value }?.takeUnless { it.all { it == null } }
          _reasonLinkId =
            this@with.reasonLinkId?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          note = this@with.note
          securityLabelNumber =
            this@with.securityLabelNumber?.map { it?.value }?.takeUnless { it.all { it == null } }
          _securityLabelNumber =
            this@with.securityLabelNumber
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal class ContractTermTopicSurrogate {
  public var topicCodeableConcept: CodeableConcept? = null

  public var topicReference: Reference? = null

  public fun toModel(): Contract.Term.Topic =
    Contract.Term.Topic?.from(
      this@ContractTermTopicSurrogate.topicCodeableConcept,
      this@ContractTermTopicSurrogate.topicReference,
    ) ?: Contract.Term.Topic.Null

  public companion object {
    public fun fromModel(model: Contract.Term.Topic): ContractTermTopicSurrogate =
      with(model) {
        ContractTermTopicSurrogate().apply {
          topicCodeableConcept = this@with.asCodeableConcept()?.value
          topicReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ContractTermSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: Identifier? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var applies: Period? = null,
  public var type: CodeableConcept? = null,
  public var subType: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var securityLabel: List<Contract.Term.SecurityLabel>? = null,
  public var offer: Contract.Term.Offer? = null,
  public var asset: List<Contract.Term.Asset>? = null,
  public var action: List<Contract.Term.Action>? = null,
  public var group: List<Contract.Term?>? = null,
  public var topic: Contract.Term.Topic? = null,
) {
  public fun toModel(): Contract.Term =
    Contract.Term().apply {
      id = this@ContractTermSurrogate.id
      extension = this@ContractTermSurrogate.extension
      modifierExtension = this@ContractTermSurrogate.modifierExtension
      identifier = this@ContractTermSurrogate.identifier
      issued =
        DateTime.of(
          FhirDateTime.fromString(this@ContractTermSurrogate.issued),
          this@ContractTermSurrogate._issued,
        )
      applies = this@ContractTermSurrogate.applies
      topic = this@ContractTermSurrogate.topic
      type = this@ContractTermSurrogate.type
      subType = this@ContractTermSurrogate.subType
      text = R4bString.of(this@ContractTermSurrogate.text, this@ContractTermSurrogate._text)
      securityLabel = this@ContractTermSurrogate.securityLabel
      offer = this@ContractTermSurrogate.offer
      asset = this@ContractTermSurrogate.asset
      action = this@ContractTermSurrogate.action
      group = this@ContractTermSurrogate.group
    }

  public companion object {
    public fun fromModel(model: Contract.Term): ContractTermSurrogate =
      with(model) {
        ContractTermSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          issued = this@with.issued?.value?.toString()
          _issued = this@with.issued?.toElement()
          applies = this@with.applies
          topic = this@with.topic
          type = this@with.type
          subType = this@with.subType
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          securityLabel = this@with.securityLabel
          offer = this@with.offer
          asset = this@with.asset
          action = this@with.action
          group = this@with.group
        }
      }
  }
}

@Serializable
internal data class ContractSignerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: Coding? = null,
  public var party: Reference? = null,
  public var signature: List<Signature?>? = null,
) {
  public fun toModel(): Contract.Signer =
    Contract.Signer().apply {
      id = this@ContractSignerSurrogate.id
      extension = this@ContractSignerSurrogate.extension
      modifierExtension = this@ContractSignerSurrogate.modifierExtension
      type = this@ContractSignerSurrogate.type
      party = this@ContractSignerSurrogate.party
      signature = this@ContractSignerSurrogate.signature
    }

  public companion object {
    public fun fromModel(model: Contract.Signer): ContractSignerSurrogate =
      with(model) {
        ContractSignerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          party = this@with.party
          signature = this@with.signature
        }
      }
  }
}

@Serializable
internal class ContractFriendlyContentSurrogate {
  public var contentAttachment: Attachment? = null

  public var contentReference: Reference? = null

  public fun toModel(): Contract.Friendly.Content =
    Contract.Friendly.Content?.from(
      this@ContractFriendlyContentSurrogate.contentAttachment,
      this@ContractFriendlyContentSurrogate.contentReference,
    ) ?: Contract.Friendly.Content.Null

  public companion object {
    public fun fromModel(model: Contract.Friendly.Content): ContractFriendlyContentSurrogate =
      with(model) {
        ContractFriendlyContentSurrogate().apply {
          contentAttachment = this@with.asAttachment()?.value
          contentReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ContractFriendlySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var content: Contract.Friendly.Content? = null,
) {
  public fun toModel(): Contract.Friendly =
    Contract.Friendly().apply {
      id = this@ContractFriendlySurrogate.id
      extension = this@ContractFriendlySurrogate.extension
      modifierExtension = this@ContractFriendlySurrogate.modifierExtension
      content = this@ContractFriendlySurrogate.content
    }

  public companion object {
    public fun fromModel(model: Contract.Friendly): ContractFriendlySurrogate =
      with(model) {
        ContractFriendlySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          content = this@with.content
        }
      }
  }
}

@Serializable
internal class ContractLegalContentSurrogate {
  public var contentAttachment: Attachment? = null

  public var contentReference: Reference? = null

  public fun toModel(): Contract.Legal.Content =
    Contract.Legal.Content?.from(
      this@ContractLegalContentSurrogate.contentAttachment,
      this@ContractLegalContentSurrogate.contentReference,
    ) ?: Contract.Legal.Content.Null

  public companion object {
    public fun fromModel(model: Contract.Legal.Content): ContractLegalContentSurrogate =
      with(model) {
        ContractLegalContentSurrogate().apply {
          contentAttachment = this@with.asAttachment()?.value
          contentReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ContractLegalSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var content: Contract.Legal.Content? = null,
) {
  public fun toModel(): Contract.Legal =
    Contract.Legal().apply {
      id = this@ContractLegalSurrogate.id
      extension = this@ContractLegalSurrogate.extension
      modifierExtension = this@ContractLegalSurrogate.modifierExtension
      content = this@ContractLegalSurrogate.content
    }

  public companion object {
    public fun fromModel(model: Contract.Legal): ContractLegalSurrogate =
      with(model) {
        ContractLegalSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          content = this@with.content
        }
      }
  }
}

@Serializable
internal class ContractRuleContentSurrogate {
  public var contentAttachment: Attachment? = null

  public var contentReference: Reference? = null

  public fun toModel(): Contract.Rule.Content =
    Contract.Rule.Content?.from(
      this@ContractRuleContentSurrogate.contentAttachment,
      this@ContractRuleContentSurrogate.contentReference,
    ) ?: Contract.Rule.Content.Null

  public companion object {
    public fun fromModel(model: Contract.Rule.Content): ContractRuleContentSurrogate =
      with(model) {
        ContractRuleContentSurrogate().apply {
          contentAttachment = this@with.asAttachment()?.value
          contentReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ContractRuleSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var content: Contract.Rule.Content? = null,
) {
  public fun toModel(): Contract.Rule =
    Contract.Rule().apply {
      id = this@ContractRuleSurrogate.id
      extension = this@ContractRuleSurrogate.extension
      modifierExtension = this@ContractRuleSurrogate.modifierExtension
      content = this@ContractRuleSurrogate.content
    }

  public companion object {
    public fun fromModel(model: Contract.Rule): ContractRuleSurrogate =
      with(model) {
        ContractRuleSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          content = this@with.content
        }
      }
  }
}

@Serializable
internal class ContractTopicSurrogate {
  public var topicCodeableConcept: CodeableConcept? = null

  public var topicReference: Reference? = null

  public fun toModel(): Contract.Topic =
    Contract.Topic?.from(
      this@ContractTopicSurrogate.topicCodeableConcept,
      this@ContractTopicSurrogate.topicReference,
    ) ?: Contract.Topic.Null

  public companion object {
    public fun fromModel(model: Contract.Topic): ContractTopicSurrogate =
      with(model) {
        ContractTopicSurrogate().apply {
          topicCodeableConcept = this@with.asCodeableConcept()?.value
          topicReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal class ContractLegallyBindingSurrogate {
  public var legallyBindingAttachment: Attachment? = null

  public var legallyBindingReference: Reference? = null

  public fun toModel(): Contract.LegallyBinding =
    Contract.LegallyBinding?.from(
      this@ContractLegallyBindingSurrogate.legallyBindingAttachment,
      this@ContractLegallyBindingSurrogate.legallyBindingReference,
    ) ?: Contract.LegallyBinding.Null

  public companion object {
    public fun fromModel(model: Contract.LegallyBinding): ContractLegallyBindingSurrogate =
      with(model) {
        ContractLegallyBindingSurrogate().apply {
          legallyBindingAttachment = this@with.asAttachment()?.value
          legallyBindingReference = this@with.asReference()?.value
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
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
  public var subject: List<Reference?>? = null,
  public var authority: List<Reference?>? = null,
  public var domain: List<Reference?>? = null,
  public var site: List<Reference?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var alias: List<KotlinString?>? = null,
  public var _alias: List<Element?>? = null,
  public var author: Reference? = null,
  public var scope: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var subType: List<CodeableConcept?>? = null,
  public var contentDefinition: Contract.ContentDefinition? = null,
  public var term: List<Contract.Term>? = null,
  public var supportingInfo: List<Reference?>? = null,
  public var relevantHistory: List<Reference?>? = null,
  public var signer: List<Contract.Signer>? = null,
  public var friendly: List<Contract.Friendly>? = null,
  public var legal: List<Contract.Legal>? = null,
  public var rule: List<Contract.Rule>? = null,
  public var topic: Contract.Topic? = null,
  public var legallyBinding: Contract.LegallyBinding? = null,
) {
  public fun toModel(): Contract =
    Contract().apply {
      id = this@ContractSurrogate.id
      meta = this@ContractSurrogate.meta
      implicitRules =
        Uri.of(this@ContractSurrogate.implicitRules, this@ContractSurrogate._implicitRules)
      language = Code.of(this@ContractSurrogate.language, this@ContractSurrogate._language)
      text = this@ContractSurrogate.text
      contained = this@ContractSurrogate.contained
      extension = this@ContractSurrogate.extension
      modifierExtension = this@ContractSurrogate.modifierExtension
      identifier = this@ContractSurrogate.identifier
      url = Uri.of(this@ContractSurrogate.url, this@ContractSurrogate._url)
      version = R4bString.of(this@ContractSurrogate.version, this@ContractSurrogate._version)
      status =
        Enumeration.of(
          this@ContractSurrogate.status?.let {
            com.google.fhir.model.r4b.Contract.ContractStatus.fromCode(it)
          },
          this@ContractSurrogate._status,
        )
      legalState = this@ContractSurrogate.legalState
      instantiatesCanonical = this@ContractSurrogate.instantiatesCanonical
      instantiatesUri =
        Uri.of(this@ContractSurrogate.instantiatesUri, this@ContractSurrogate._instantiatesUri)
      contentDerivative = this@ContractSurrogate.contentDerivative
      issued =
        DateTime.of(
          FhirDateTime.fromString(this@ContractSurrogate.issued),
          this@ContractSurrogate._issued,
        )
      applies = this@ContractSurrogate.applies
      expirationType = this@ContractSurrogate.expirationType
      subject = this@ContractSurrogate.subject
      authority = this@ContractSurrogate.authority
      domain = this@ContractSurrogate.domain
      site = this@ContractSurrogate.site
      name = R4bString.of(this@ContractSurrogate.name, this@ContractSurrogate._name)
      title = R4bString.of(this@ContractSurrogate.title, this@ContractSurrogate._title)
      subtitle = R4bString.of(this@ContractSurrogate.subtitle, this@ContractSurrogate._subtitle)
      alias =
        if (this@ContractSurrogate.alias == null && this@ContractSurrogate._alias == null) {
          null
        } else {
          (this@ContractSurrogate.alias ?: List(this@ContractSurrogate._alias!!.size) { null })
            .zip(
              this@ContractSurrogate._alias ?: List(this@ContractSurrogate.alias!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      author = this@ContractSurrogate.author
      scope = this@ContractSurrogate.scope
      topic = this@ContractSurrogate.topic
      type = this@ContractSurrogate.type
      subType = this@ContractSurrogate.subType
      contentDefinition = this@ContractSurrogate.contentDefinition
      term = this@ContractSurrogate.term
      supportingInfo = this@ContractSurrogate.supportingInfo
      relevantHistory = this@ContractSurrogate.relevantHistory
      signer = this@ContractSurrogate.signer
      friendly = this@ContractSurrogate.friendly
      legal = this@ContractSurrogate.legal
      rule = this@ContractSurrogate.rule
      legallyBinding = this@ContractSurrogate.legallyBinding
    }

  public companion object {
    public fun fromModel(model: Contract): ContractSurrogate =
      with(model) {
        ContractSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          legalState = this@with.legalState
          instantiatesCanonical = this@with.instantiatesCanonical
          instantiatesUri = this@with.instantiatesUri?.value
          _instantiatesUri = this@with.instantiatesUri?.toElement()
          contentDerivative = this@with.contentDerivative
          issued = this@with.issued?.value?.toString()
          _issued = this@with.issued?.toElement()
          applies = this@with.applies
          expirationType = this@with.expirationType
          subject = this@with.subject
          authority = this@with.authority
          domain = this@with.domain
          site = this@with.site
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          subtitle = this@with.subtitle?.value
          _subtitle = this@with.subtitle?.toElement()
          alias = this@with.alias?.map { it?.value }?.takeUnless { it.all { it == null } }
          _alias = this@with.alias?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          author = this@with.author
          scope = this@with.scope
          topic = this@with.topic
          type = this@with.type
          subType = this@with.subType
          contentDefinition = this@with.contentDefinition
          term = this@with.term
          supportingInfo = this@with.supportingInfo
          relevantHistory = this@with.relevantHistory
          signer = this@with.signer
          friendly = this@with.friendly
          legal = this@with.legal
          rule = this@with.rule
          legallyBinding = this@with.legallyBinding
        }
      }
  }
}
