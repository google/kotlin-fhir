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
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.ClaimResponse
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ClaimResponseEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var whenDateTime: KotlinString? = null,
  public var _whenDateTime: Element? = null,
  public var whenPeriod: Period? = null,
) {
  public fun toModel(): ClaimResponse.Event =
    ClaimResponse.Event(
      id = this@ClaimResponseEventSurrogate.id,
      extension = this@ClaimResponseEventSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseEventSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ClaimResponseEventSurrogate.type,
      `when` =
        ClaimResponse.Event.When.from(
          DateTime.of(
            FhirDateTime.fromString(this@ClaimResponseEventSurrogate.whenDateTime),
            this@ClaimResponseEventSurrogate._whenDateTime,
          ),
          this@ClaimResponseEventSurrogate.whenPeriod,
        )!!,
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Event): ClaimResponseEventSurrogate =
      with(model) {
        ClaimResponseEventSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          whenDateTime = this@with.`when`?.asDateTime()?.value?.value?.toString(),
          _whenDateTime = this@with.`when`?.asDateTime()?.value?.toElement(),
          whenPeriod = this@with.`when`?.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class ClaimResponseItemReviewOutcomeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var decision: CodeableConcept? = null,
  public var reason: MutableList<CodeableConcept>? = null,
  public var preAuthRef: KotlinString? = null,
  public var _preAuthRef: Element? = null,
  public var preAuthPeriod: Period? = null,
) {
  public fun toModel(): ClaimResponse.Item.ReviewOutcome =
    ClaimResponse.Item.ReviewOutcome(
      id = this@ClaimResponseItemReviewOutcomeSurrogate.id,
      extension = this@ClaimResponseItemReviewOutcomeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseItemReviewOutcomeSurrogate.modifierExtension ?: mutableListOf(),
      decision = this@ClaimResponseItemReviewOutcomeSurrogate.decision,
      reason = this@ClaimResponseItemReviewOutcomeSurrogate.reason ?: mutableListOf(),
      preAuthRef =
        R5String.of(
          this@ClaimResponseItemReviewOutcomeSurrogate.preAuthRef,
          this@ClaimResponseItemReviewOutcomeSurrogate._preAuthRef,
        ),
      preAuthPeriod = this@ClaimResponseItemReviewOutcomeSurrogate.preAuthPeriod,
    )

  public companion object {
    public fun fromModel(
      model: ClaimResponse.Item.ReviewOutcome
    ): ClaimResponseItemReviewOutcomeSurrogate =
      with(model) {
        ClaimResponseItemReviewOutcomeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          decision = this@with.decision,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          preAuthRef = this@with.preAuthRef?.value,
          _preAuthRef = this@with.preAuthRef?.toElement(),
          preAuthPeriod = this@with.preAuthPeriod,
        )
      }
  }
}

@Serializable
internal data class ClaimResponseItemAdjudicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept,
  public var reason: CodeableConcept? = null,
  public var amount: Money? = null,
  public var quantity: Quantity? = null,
) {
  public fun toModel(): ClaimResponse.Item.Adjudication =
    ClaimResponse.Item.Adjudication(
      id = this@ClaimResponseItemAdjudicationSurrogate.id,
      extension = this@ClaimResponseItemAdjudicationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseItemAdjudicationSurrogate.modifierExtension ?: mutableListOf(),
      category = this@ClaimResponseItemAdjudicationSurrogate.category,
      reason = this@ClaimResponseItemAdjudicationSurrogate.reason,
      amount = this@ClaimResponseItemAdjudicationSurrogate.amount,
      quantity = this@ClaimResponseItemAdjudicationSurrogate.quantity,
    )

  public companion object {
    public fun fromModel(
      model: ClaimResponse.Item.Adjudication
    ): ClaimResponseItemAdjudicationSurrogate =
      with(model) {
        ClaimResponseItemAdjudicationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          reason = this@with.reason,
          amount = this@with.amount,
          quantity = this@with.quantity,
        )
      }
  }
}

@Serializable
internal data class ClaimResponseItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var subDetailSequence: Int? = null,
  public var _subDetailSequence: Element? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ClaimResponse.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
) {
  public fun toModel(): ClaimResponse.Item.Detail.SubDetail =
    ClaimResponse.Item.Detail.SubDetail(
      id = this@ClaimResponseItemDetailSubDetailSurrogate.id,
      extension = this@ClaimResponseItemDetailSubDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseItemDetailSubDetailSurrogate.modifierExtension ?: mutableListOf(),
      subDetailSequence =
        PositiveInt.of(
          this@ClaimResponseItemDetailSubDetailSurrogate.subDetailSequence,
          this@ClaimResponseItemDetailSubDetailSurrogate._subDetailSequence,
        )!!,
      traceNumber = this@ClaimResponseItemDetailSubDetailSurrogate.traceNumber ?: mutableListOf(),
      noteNumber =
        if (
          this@ClaimResponseItemDetailSubDetailSurrogate.noteNumber == null &&
            this@ClaimResponseItemDetailSubDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseItemDetailSubDetailSurrogate.noteNumber
              ?: List(this@ClaimResponseItemDetailSubDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ClaimResponseItemDetailSubDetailSurrogate._noteNumber
                ?: List(this@ClaimResponseItemDetailSubDetailSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ClaimResponseItemDetailSubDetailSurrogate.reviewOutcome,
      adjudication = this@ClaimResponseItemDetailSubDetailSurrogate.adjudication ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ClaimResponse.Item.Detail.SubDetail
    ): ClaimResponseItemDetailSubDetailSurrogate =
      with(model) {
        ClaimResponseItemDetailSubDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          subDetailSequence = this@with.subDetailSequence.value,
          _subDetailSequence = this@with.subDetailSequence.toElement(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var detailSequence: Int? = null,
  public var _detailSequence: Element? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ClaimResponse.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
  public var subDetail: MutableList<ClaimResponse.Item.Detail.SubDetail>? = null,
) {
  public fun toModel(): ClaimResponse.Item.Detail =
    ClaimResponse.Item.Detail(
      id = this@ClaimResponseItemDetailSurrogate.id,
      extension = this@ClaimResponseItemDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseItemDetailSurrogate.modifierExtension ?: mutableListOf(),
      detailSequence =
        PositiveInt.of(
          this@ClaimResponseItemDetailSurrogate.detailSequence,
          this@ClaimResponseItemDetailSurrogate._detailSequence,
        )!!,
      traceNumber = this@ClaimResponseItemDetailSurrogate.traceNumber ?: mutableListOf(),
      noteNumber =
        if (
          this@ClaimResponseItemDetailSurrogate.noteNumber == null &&
            this@ClaimResponseItemDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseItemDetailSurrogate.noteNumber
              ?: List(this@ClaimResponseItemDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ClaimResponseItemDetailSurrogate._noteNumber
                ?: List(this@ClaimResponseItemDetailSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ClaimResponseItemDetailSurrogate.reviewOutcome,
      adjudication = this@ClaimResponseItemDetailSurrogate.adjudication ?: mutableListOf(),
      subDetail = this@ClaimResponseItemDetailSurrogate.subDetail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Item.Detail): ClaimResponseItemDetailSurrogate =
      with(model) {
        ClaimResponseItemDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          detailSequence = this@with.detailSequence.value,
          _detailSequence = this@with.detailSequence.toElement(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          subDetail = this@with.subDetail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var itemSequence: Int? = null,
  public var _itemSequence: Element? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ClaimResponse.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
  public var detail: MutableList<ClaimResponse.Item.Detail>? = null,
) {
  public fun toModel(): ClaimResponse.Item =
    ClaimResponse.Item(
      id = this@ClaimResponseItemSurrogate.id,
      extension = this@ClaimResponseItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseItemSurrogate.modifierExtension ?: mutableListOf(),
      itemSequence =
        PositiveInt.of(
          this@ClaimResponseItemSurrogate.itemSequence,
          this@ClaimResponseItemSurrogate._itemSequence,
        )!!,
      traceNumber = this@ClaimResponseItemSurrogate.traceNumber ?: mutableListOf(),
      noteNumber =
        if (
          this@ClaimResponseItemSurrogate.noteNumber == null &&
            this@ClaimResponseItemSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseItemSurrogate.noteNumber
              ?: List(this@ClaimResponseItemSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ClaimResponseItemSurrogate._noteNumber
                ?: List(this@ClaimResponseItemSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ClaimResponseItemSurrogate.reviewOutcome,
      adjudication = this@ClaimResponseItemSurrogate.adjudication ?: mutableListOf(),
      detail = this@ClaimResponseItemSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Item): ClaimResponseItemSurrogate =
      with(model) {
        ClaimResponseItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          itemSequence = this@with.itemSequence.value,
          _itemSequence = this@with.itemSequence.toElement(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseAddItemBodySiteSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var site: MutableList<CodeableReference>? = null,
  public var subSite: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): ClaimResponse.AddItem.BodySite =
    ClaimResponse.AddItem.BodySite(
      id = this@ClaimResponseAddItemBodySiteSurrogate.id,
      extension = this@ClaimResponseAddItemBodySiteSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseAddItemBodySiteSurrogate.modifierExtension ?: mutableListOf(),
      site = this@ClaimResponseAddItemBodySiteSurrogate.site ?: mutableListOf(),
      subSite = this@ClaimResponseAddItemBodySiteSurrogate.subSite ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ClaimResponse.AddItem.BodySite
    ): ClaimResponseAddItemBodySiteSurrogate =
      with(model) {
        ClaimResponseAddItemBodySiteSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          site = this@with.site.takeUnless { it.all { it == null } },
          subSite = this@with.subSite.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseAddItemDetailSubDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ClaimResponse.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
) {
  public fun toModel(): ClaimResponse.AddItem.Detail.SubDetail =
    ClaimResponse.AddItem.Detail.SubDetail(
      id = this@ClaimResponseAddItemDetailSubDetailSurrogate.id,
      extension = this@ClaimResponseAddItemDetailSubDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseAddItemDetailSubDetailSurrogate.modifierExtension ?: mutableListOf(),
      traceNumber =
        this@ClaimResponseAddItemDetailSubDetailSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ClaimResponseAddItemDetailSubDetailSurrogate.revenue,
      productOrService = this@ClaimResponseAddItemDetailSubDetailSurrogate.productOrService,
      productOrServiceEnd = this@ClaimResponseAddItemDetailSubDetailSurrogate.productOrServiceEnd,
      modifier = this@ClaimResponseAddItemDetailSubDetailSurrogate.modifier ?: mutableListOf(),
      quantity = this@ClaimResponseAddItemDetailSubDetailSurrogate.quantity,
      unitPrice = this@ClaimResponseAddItemDetailSubDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ClaimResponseAddItemDetailSubDetailSurrogate.factor,
          this@ClaimResponseAddItemDetailSubDetailSurrogate._factor,
        ),
      tax = this@ClaimResponseAddItemDetailSubDetailSurrogate.tax,
      net = this@ClaimResponseAddItemDetailSubDetailSurrogate.net,
      noteNumber =
        if (
          this@ClaimResponseAddItemDetailSubDetailSurrogate.noteNumber == null &&
            this@ClaimResponseAddItemDetailSubDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseAddItemDetailSubDetailSurrogate.noteNumber
              ?: List(this@ClaimResponseAddItemDetailSubDetailSurrogate._noteNumber!!.size) {
                null
              })
            .zip(
              this@ClaimResponseAddItemDetailSubDetailSurrogate._noteNumber
                ?: List(this@ClaimResponseAddItemDetailSubDetailSurrogate.noteNumber!!.size) {
                  null
                }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ClaimResponseAddItemDetailSubDetailSurrogate.reviewOutcome,
      adjudication =
        this@ClaimResponseAddItemDetailSubDetailSurrogate.adjudication ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ClaimResponse.AddItem.Detail.SubDetail
    ): ClaimResponseAddItemDetailSubDetailSurrogate =
      with(model) {
        ClaimResponseAddItemDetailSubDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseAddItemDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ClaimResponse.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
  public var subDetail: MutableList<ClaimResponse.AddItem.Detail.SubDetail>? = null,
) {
  public fun toModel(): ClaimResponse.AddItem.Detail =
    ClaimResponse.AddItem.Detail(
      id = this@ClaimResponseAddItemDetailSurrogate.id,
      extension = this@ClaimResponseAddItemDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseAddItemDetailSurrogate.modifierExtension ?: mutableListOf(),
      traceNumber = this@ClaimResponseAddItemDetailSurrogate.traceNumber ?: mutableListOf(),
      revenue = this@ClaimResponseAddItemDetailSurrogate.revenue,
      productOrService = this@ClaimResponseAddItemDetailSurrogate.productOrService,
      productOrServiceEnd = this@ClaimResponseAddItemDetailSurrogate.productOrServiceEnd,
      modifier = this@ClaimResponseAddItemDetailSurrogate.modifier ?: mutableListOf(),
      quantity = this@ClaimResponseAddItemDetailSurrogate.quantity,
      unitPrice = this@ClaimResponseAddItemDetailSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ClaimResponseAddItemDetailSurrogate.factor,
          this@ClaimResponseAddItemDetailSurrogate._factor,
        ),
      tax = this@ClaimResponseAddItemDetailSurrogate.tax,
      net = this@ClaimResponseAddItemDetailSurrogate.net,
      noteNumber =
        if (
          this@ClaimResponseAddItemDetailSurrogate.noteNumber == null &&
            this@ClaimResponseAddItemDetailSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseAddItemDetailSurrogate.noteNumber
              ?: List(this@ClaimResponseAddItemDetailSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ClaimResponseAddItemDetailSurrogate._noteNumber
                ?: List(this@ClaimResponseAddItemDetailSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ClaimResponseAddItemDetailSurrogate.reviewOutcome,
      adjudication = this@ClaimResponseAddItemDetailSurrogate.adjudication ?: mutableListOf(),
      subDetail = this@ClaimResponseAddItemDetailSurrogate.subDetail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.AddItem.Detail): ClaimResponseAddItemDetailSurrogate =
      with(model) {
        ClaimResponseAddItemDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          subDetail = this@with.subDetail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseAddItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var itemSequence: MutableList<Int?>? = null,
  public var _itemSequence: MutableList<Element?>? = null,
  public var detailSequence: MutableList<Int?>? = null,
  public var _detailSequence: MutableList<Element?>? = null,
  public var subdetailSequence: MutableList<Int?>? = null,
  public var _subdetailSequence: MutableList<Element?>? = null,
  public var traceNumber: MutableList<Identifier>? = null,
  public var provider: MutableList<Reference>? = null,
  public var revenue: CodeableConcept? = null,
  public var productOrService: CodeableConcept? = null,
  public var productOrServiceEnd: CodeableConcept? = null,
  public var request: MutableList<Reference>? = null,
  public var modifier: MutableList<CodeableConcept>? = null,
  public var programCode: MutableList<CodeableConcept>? = null,
  public var servicedDate: KotlinString? = null,
  public var _servicedDate: Element? = null,
  public var servicedPeriod: Period? = null,
  public var locationCodeableConcept: CodeableConcept? = null,
  public var locationAddress: Address? = null,
  public var locationReference: Reference? = null,
  public var quantity: Quantity? = null,
  public var unitPrice: Money? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var tax: Money? = null,
  public var net: Money? = null,
  public var bodySite: MutableList<ClaimResponse.AddItem.BodySite>? = null,
  public var noteNumber: MutableList<Int?>? = null,
  public var _noteNumber: MutableList<Element?>? = null,
  public var reviewOutcome: ClaimResponse.Item.ReviewOutcome? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
  public var detail: MutableList<ClaimResponse.AddItem.Detail>? = null,
) {
  public fun toModel(): ClaimResponse.AddItem =
    ClaimResponse.AddItem(
      id = this@ClaimResponseAddItemSurrogate.id,
      extension = this@ClaimResponseAddItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseAddItemSurrogate.modifierExtension ?: mutableListOf(),
      itemSequence =
        if (
          this@ClaimResponseAddItemSurrogate.itemSequence == null &&
            this@ClaimResponseAddItemSurrogate._itemSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseAddItemSurrogate.itemSequence
              ?: List(this@ClaimResponseAddItemSurrogate._itemSequence!!.size) { null })
            .zip(
              this@ClaimResponseAddItemSurrogate._itemSequence
                ?: List(this@ClaimResponseAddItemSurrogate.itemSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      detailSequence =
        if (
          this@ClaimResponseAddItemSurrogate.detailSequence == null &&
            this@ClaimResponseAddItemSurrogate._detailSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseAddItemSurrogate.detailSequence
              ?: List(this@ClaimResponseAddItemSurrogate._detailSequence!!.size) { null })
            .zip(
              this@ClaimResponseAddItemSurrogate._detailSequence
                ?: List(this@ClaimResponseAddItemSurrogate.detailSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      subdetailSequence =
        if (
          this@ClaimResponseAddItemSurrogate.subdetailSequence == null &&
            this@ClaimResponseAddItemSurrogate._subdetailSequence == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseAddItemSurrogate.subdetailSequence
              ?: List(this@ClaimResponseAddItemSurrogate._subdetailSequence!!.size) { null })
            .zip(
              this@ClaimResponseAddItemSurrogate._subdetailSequence
                ?: List(this@ClaimResponseAddItemSurrogate.subdetailSequence!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      traceNumber = this@ClaimResponseAddItemSurrogate.traceNumber ?: mutableListOf(),
      provider = this@ClaimResponseAddItemSurrogate.provider ?: mutableListOf(),
      revenue = this@ClaimResponseAddItemSurrogate.revenue,
      productOrService = this@ClaimResponseAddItemSurrogate.productOrService,
      productOrServiceEnd = this@ClaimResponseAddItemSurrogate.productOrServiceEnd,
      request = this@ClaimResponseAddItemSurrogate.request ?: mutableListOf(),
      modifier = this@ClaimResponseAddItemSurrogate.modifier ?: mutableListOf(),
      programCode = this@ClaimResponseAddItemSurrogate.programCode ?: mutableListOf(),
      serviced =
        ClaimResponse.AddItem.Serviced?.from(
          Date.of(
            FhirDate.fromString(this@ClaimResponseAddItemSurrogate.servicedDate),
            this@ClaimResponseAddItemSurrogate._servicedDate,
          ),
          this@ClaimResponseAddItemSurrogate.servicedPeriod,
        ),
      location =
        ClaimResponse.AddItem.Location?.from(
          this@ClaimResponseAddItemSurrogate.locationCodeableConcept,
          this@ClaimResponseAddItemSurrogate.locationAddress,
          this@ClaimResponseAddItemSurrogate.locationReference,
        ),
      quantity = this@ClaimResponseAddItemSurrogate.quantity,
      unitPrice = this@ClaimResponseAddItemSurrogate.unitPrice,
      factor =
        Decimal.of(
          this@ClaimResponseAddItemSurrogate.factor,
          this@ClaimResponseAddItemSurrogate._factor,
        ),
      tax = this@ClaimResponseAddItemSurrogate.tax,
      net = this@ClaimResponseAddItemSurrogate.net,
      bodySite = this@ClaimResponseAddItemSurrogate.bodySite ?: mutableListOf(),
      noteNumber =
        if (
          this@ClaimResponseAddItemSurrogate.noteNumber == null &&
            this@ClaimResponseAddItemSurrogate._noteNumber == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseAddItemSurrogate.noteNumber
              ?: List(this@ClaimResponseAddItemSurrogate._noteNumber!!.size) { null })
            .zip(
              this@ClaimResponseAddItemSurrogate._noteNumber
                ?: List(this@ClaimResponseAddItemSurrogate.noteNumber!!.size) { null }
            )
            .map { (value, element) -> PositiveInt.of(value, element)!! }
            .toMutableList()
        },
      reviewOutcome = this@ClaimResponseAddItemSurrogate.reviewOutcome,
      adjudication = this@ClaimResponseAddItemSurrogate.adjudication ?: mutableListOf(),
      detail = this@ClaimResponseAddItemSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.AddItem): ClaimResponseAddItemSurrogate =
      with(model) {
        ClaimResponseAddItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          itemSequence =
            this@with.itemSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _itemSequence =
            this@with.itemSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          detailSequence =
            this@with.detailSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _detailSequence =
            this@with.detailSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          subdetailSequence =
            this@with.subdetailSequence
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _subdetailSequence =
            this@with.subdetailSequence
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          provider = this@with.provider.takeUnless { it.all { it == null } },
          revenue = this@with.revenue,
          productOrService = this@with.productOrService,
          productOrServiceEnd = this@with.productOrServiceEnd,
          request = this@with.request.takeUnless { it.all { it == null } },
          modifier = this@with.modifier.takeUnless { it.all { it == null } },
          programCode = this@with.programCode.takeUnless { it.all { it == null } },
          servicedDate = this@with.serviced?.asDate()?.value?.value?.toString(),
          _servicedDate = this@with.serviced?.asDate()?.value?.toElement(),
          servicedPeriod = this@with.serviced?.asPeriod()?.value,
          locationCodeableConcept = this@with.location?.asCodeableConcept()?.value,
          locationAddress = this@with.location?.asAddress()?.value,
          locationReference = this@with.location?.asReference()?.value,
          quantity = this@with.quantity,
          unitPrice = this@with.unitPrice,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          tax = this@with.tax,
          net = this@with.net,
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          noteNumber =
            this@with.noteNumber
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _noteNumber =
            this@with.noteNumber
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          reviewOutcome = this@with.reviewOutcome,
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClaimResponseTotalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept,
  public var amount: Money,
) {
  public fun toModel(): ClaimResponse.Total =
    ClaimResponse.Total(
      id = this@ClaimResponseTotalSurrogate.id,
      extension = this@ClaimResponseTotalSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseTotalSurrogate.modifierExtension ?: mutableListOf(),
      category = this@ClaimResponseTotalSurrogate.category,
      amount = this@ClaimResponseTotalSurrogate.amount,
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Total): ClaimResponseTotalSurrogate =
      with(model) {
        ClaimResponseTotalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class ClaimResponsePaymentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var adjustment: Money? = null,
  public var adjustmentReason: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var amount: Money,
  public var identifier: Identifier? = null,
) {
  public fun toModel(): ClaimResponse.Payment =
    ClaimResponse.Payment(
      id = this@ClaimResponsePaymentSurrogate.id,
      extension = this@ClaimResponsePaymentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponsePaymentSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ClaimResponsePaymentSurrogate.type,
      adjustment = this@ClaimResponsePaymentSurrogate.adjustment,
      adjustmentReason = this@ClaimResponsePaymentSurrogate.adjustmentReason,
      date =
        Date.of(
          FhirDate.fromString(this@ClaimResponsePaymentSurrogate.date),
          this@ClaimResponsePaymentSurrogate._date,
        ),
      amount = this@ClaimResponsePaymentSurrogate.amount,
      identifier = this@ClaimResponsePaymentSurrogate.identifier,
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Payment): ClaimResponsePaymentSurrogate =
      with(model) {
        ClaimResponsePaymentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          adjustment = this@with.adjustment,
          adjustmentReason = this@with.adjustmentReason,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          amount = this@with.amount,
          identifier = this@with.identifier,
        )
      }
  }
}

@Serializable
internal data class ClaimResponseProcessNoteSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var type: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var language: CodeableConcept? = null,
) {
  public fun toModel(): ClaimResponse.ProcessNote =
    ClaimResponse.ProcessNote(
      id = this@ClaimResponseProcessNoteSurrogate.id,
      extension = this@ClaimResponseProcessNoteSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClaimResponseProcessNoteSurrogate.modifierExtension ?: mutableListOf(),
      number =
        PositiveInt.of(
          this@ClaimResponseProcessNoteSurrogate.number,
          this@ClaimResponseProcessNoteSurrogate._number,
        ),
      type = this@ClaimResponseProcessNoteSurrogate.type,
      text =
        R5String.of(
          this@ClaimResponseProcessNoteSurrogate.text,
          this@ClaimResponseProcessNoteSurrogate._text,
        )!!,
      language = this@ClaimResponseProcessNoteSurrogate.language,
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.ProcessNote): ClaimResponseProcessNoteSurrogate =
      with(model) {
        ClaimResponseProcessNoteSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          number = this@with.number?.value,
          _number = this@with.number?.toElement(),
          type = this@with.type,
          text = this@with.text.value,
          _text = this@with.text.toElement(),
          language = this@with.language,
        )
      }
  }
}

@Serializable
internal data class ClaimResponseInsuranceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var focal: KotlinBoolean? = null,
  public var _focal: Element? = null,
  public var coverage: Reference,
  public var businessArrangement: KotlinString? = null,
  public var _businessArrangement: Element? = null,
  public var claimResponse: Reference? = null,
) {
  public fun toModel(): ClaimResponse.Insurance =
    ClaimResponse.Insurance(
      id = this@ClaimResponseInsuranceSurrogate.id,
      extension = this@ClaimResponseInsuranceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseInsuranceSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@ClaimResponseInsuranceSurrogate.sequence,
          this@ClaimResponseInsuranceSurrogate._sequence,
        )!!,
      focal =
        R5Boolean.of(
          this@ClaimResponseInsuranceSurrogate.focal,
          this@ClaimResponseInsuranceSurrogate._focal,
        )!!,
      coverage = this@ClaimResponseInsuranceSurrogate.coverage,
      businessArrangement =
        R5String.of(
          this@ClaimResponseInsuranceSurrogate.businessArrangement,
          this@ClaimResponseInsuranceSurrogate._businessArrangement,
        ),
      claimResponse = this@ClaimResponseInsuranceSurrogate.claimResponse,
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Insurance): ClaimResponseInsuranceSurrogate =
      with(model) {
        ClaimResponseInsuranceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence.value,
          _sequence = this@with.sequence.toElement(),
          focal = this@with.focal.value,
          _focal = this@with.focal.toElement(),
          coverage = this@with.coverage,
          businessArrangement = this@with.businessArrangement?.value,
          _businessArrangement = this@with.businessArrangement?.toElement(),
          claimResponse = this@with.claimResponse,
        )
      }
  }
}

@Serializable
internal data class ClaimResponseErrorSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var itemSequence: Int? = null,
  public var _itemSequence: Element? = null,
  public var detailSequence: Int? = null,
  public var _detailSequence: Element? = null,
  public var subDetailSequence: Int? = null,
  public var _subDetailSequence: Element? = null,
  public var code: CodeableConcept,
  public var expression: MutableList<KotlinString?>? = null,
  public var _expression: MutableList<Element?>? = null,
) {
  public fun toModel(): ClaimResponse.Error =
    ClaimResponse.Error(
      id = this@ClaimResponseErrorSurrogate.id,
      extension = this@ClaimResponseErrorSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseErrorSurrogate.modifierExtension ?: mutableListOf(),
      itemSequence =
        PositiveInt.of(
          this@ClaimResponseErrorSurrogate.itemSequence,
          this@ClaimResponseErrorSurrogate._itemSequence,
        ),
      detailSequence =
        PositiveInt.of(
          this@ClaimResponseErrorSurrogate.detailSequence,
          this@ClaimResponseErrorSurrogate._detailSequence,
        ),
      subDetailSequence =
        PositiveInt.of(
          this@ClaimResponseErrorSurrogate.subDetailSequence,
          this@ClaimResponseErrorSurrogate._subDetailSequence,
        ),
      code = this@ClaimResponseErrorSurrogate.code,
      expression =
        if (
          this@ClaimResponseErrorSurrogate.expression == null &&
            this@ClaimResponseErrorSurrogate._expression == null
        ) {
          mutableListOf()
        } else {
          (this@ClaimResponseErrorSurrogate.expression
              ?: List(this@ClaimResponseErrorSurrogate._expression!!.size) { null })
            .zip(
              this@ClaimResponseErrorSurrogate._expression
                ?: List(this@ClaimResponseErrorSurrogate.expression!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: ClaimResponse.Error): ClaimResponseErrorSurrogate =
      with(model) {
        ClaimResponseErrorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          itemSequence = this@with.itemSequence?.value,
          _itemSequence = this@with.itemSequence?.toElement(),
          detailSequence = this@with.detailSequence?.value,
          _detailSequence = this@with.detailSequence?.toElement(),
          subDetailSequence = this@with.subDetailSequence?.value,
          _subDetailSequence = this@with.subDetailSequence?.toElement(),
          code = this@with.code,
          expression =
            this@with.expression
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _expression =
            this@with.expression
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ClaimResponseSurrogate(
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
  public var traceNumber: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept,
  public var subType: CodeableConcept? = null,
  public var use: KotlinString? = null,
  public var _use: Element? = null,
  public var patient: Reference,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var insurer: Reference? = null,
  public var requestor: Reference? = null,
  public var request: Reference? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var decision: CodeableConcept? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var preAuthRef: KotlinString? = null,
  public var _preAuthRef: Element? = null,
  public var preAuthPeriod: Period? = null,
  public var event: MutableList<ClaimResponse.Event>? = null,
  public var payeeType: CodeableConcept? = null,
  public var encounter: MutableList<Reference>? = null,
  public var diagnosisRelatedGroup: CodeableConcept? = null,
  public var item: MutableList<ClaimResponse.Item>? = null,
  public var addItem: MutableList<ClaimResponse.AddItem>? = null,
  public var adjudication: MutableList<ClaimResponse.Item.Adjudication>? = null,
  public var total: MutableList<ClaimResponse.Total>? = null,
  public var payment: ClaimResponse.Payment? = null,
  public var fundsReserve: CodeableConcept? = null,
  public var formCode: CodeableConcept? = null,
  public var form: Attachment? = null,
  public var processNote: MutableList<ClaimResponse.ProcessNote>? = null,
  public var communicationRequest: MutableList<Reference>? = null,
  public var insurance: MutableList<ClaimResponse.Insurance>? = null,
  public var error: MutableList<ClaimResponse.Error>? = null,
) {
  public fun toModel(): ClaimResponse =
    ClaimResponse(
      id = this@ClaimResponseSurrogate.id,
      meta = this@ClaimResponseSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ClaimResponseSurrogate.implicitRules,
          this@ClaimResponseSurrogate._implicitRules,
        ),
      language =
        Code.of(this@ClaimResponseSurrogate.language, this@ClaimResponseSurrogate._language),
      text = this@ClaimResponseSurrogate.text,
      contained = this@ClaimResponseSurrogate.contained ?: mutableListOf(),
      extension = this@ClaimResponseSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClaimResponseSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ClaimResponseSurrogate.identifier ?: mutableListOf(),
      traceNumber = this@ClaimResponseSurrogate.traceNumber ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.ClaimResponse.ClaimResponseStatus.fromCode(
            this@ClaimResponseSurrogate.status!!
          ),
          this@ClaimResponseSurrogate._status,
        ),
      type = this@ClaimResponseSurrogate.type,
      subType = this@ClaimResponseSurrogate.subType,
      use =
        Enumeration.of(
          com.google.fhir.model.r5.ClaimResponse.Use.fromCode(this@ClaimResponseSurrogate.use!!),
          this@ClaimResponseSurrogate._use,
        ),
      patient = this@ClaimResponseSurrogate.patient,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@ClaimResponseSurrogate.created),
          this@ClaimResponseSurrogate._created,
        )!!,
      insurer = this@ClaimResponseSurrogate.insurer,
      requestor = this@ClaimResponseSurrogate.requestor,
      request = this@ClaimResponseSurrogate.request,
      outcome =
        Enumeration.of(
          com.google.fhir.model.r5.ClaimResponse.RemittanceOutcome.fromCode(
            this@ClaimResponseSurrogate.outcome!!
          ),
          this@ClaimResponseSurrogate._outcome,
        ),
      decision = this@ClaimResponseSurrogate.decision,
      disposition =
        R5String.of(
          this@ClaimResponseSurrogate.disposition,
          this@ClaimResponseSurrogate._disposition,
        ),
      preAuthRef =
        R5String.of(
          this@ClaimResponseSurrogate.preAuthRef,
          this@ClaimResponseSurrogate._preAuthRef,
        ),
      preAuthPeriod = this@ClaimResponseSurrogate.preAuthPeriod,
      event = this@ClaimResponseSurrogate.event ?: mutableListOf(),
      payeeType = this@ClaimResponseSurrogate.payeeType,
      encounter = this@ClaimResponseSurrogate.encounter ?: mutableListOf(),
      diagnosisRelatedGroup = this@ClaimResponseSurrogate.diagnosisRelatedGroup,
      item = this@ClaimResponseSurrogate.item ?: mutableListOf(),
      addItem = this@ClaimResponseSurrogate.addItem ?: mutableListOf(),
      adjudication = this@ClaimResponseSurrogate.adjudication ?: mutableListOf(),
      total = this@ClaimResponseSurrogate.total ?: mutableListOf(),
      payment = this@ClaimResponseSurrogate.payment,
      fundsReserve = this@ClaimResponseSurrogate.fundsReserve,
      formCode = this@ClaimResponseSurrogate.formCode,
      form = this@ClaimResponseSurrogate.form,
      processNote = this@ClaimResponseSurrogate.processNote ?: mutableListOf(),
      communicationRequest = this@ClaimResponseSurrogate.communicationRequest ?: mutableListOf(),
      insurance = this@ClaimResponseSurrogate.insurance ?: mutableListOf(),
      error = this@ClaimResponseSurrogate.error ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ClaimResponse): ClaimResponseSurrogate =
      with(model) {
        ClaimResponseSurrogate(
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
          traceNumber = this@with.traceNumber.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          type = this@with.type,
          subType = this@with.subType,
          use = this@with.use.value?.getCode(),
          _use = this@with.use.toElement(),
          patient = this@with.patient,
          created = this@with.created.value?.toString(),
          _created = this@with.created.toElement(),
          insurer = this@with.insurer,
          requestor = this@with.requestor,
          request = this@with.request,
          outcome = this@with.outcome.value?.getCode(),
          _outcome = this@with.outcome.toElement(),
          decision = this@with.decision,
          disposition = this@with.disposition?.value,
          _disposition = this@with.disposition?.toElement(),
          preAuthRef = this@with.preAuthRef?.value,
          _preAuthRef = this@with.preAuthRef?.toElement(),
          preAuthPeriod = this@with.preAuthPeriod,
          event = this@with.event.takeUnless { it.all { it == null } },
          payeeType = this@with.payeeType,
          encounter = this@with.encounter.takeUnless { it.all { it == null } },
          diagnosisRelatedGroup = this@with.diagnosisRelatedGroup,
          item = this@with.item.takeUnless { it.all { it == null } },
          addItem = this@with.addItem.takeUnless { it.all { it == null } },
          adjudication = this@with.adjudication.takeUnless { it.all { it == null } },
          total = this@with.total.takeUnless { it.all { it == null } },
          payment = this@with.payment,
          fundsReserve = this@with.fundsReserve,
          formCode = this@with.formCode,
          form = this@with.form,
          processNote = this@with.processNote.takeUnless { it.all { it == null } },
          communicationRequest =
            this@with.communicationRequest.takeUnless { it.all { it == null } },
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          error = this@with.error.takeUnless { it.all { it == null } },
        )
      }
  }
}
