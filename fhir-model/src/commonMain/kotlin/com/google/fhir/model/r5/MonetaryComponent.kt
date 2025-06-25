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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r5

import com.google.fhir.model.r5.serializers.MonetaryComponentSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/** MonetaryComponent Type: Availability data for an {item}. */
@Serializable(with = MonetaryComponentSerializer::class)
public data class MonetaryComponent(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and managable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: List<Extension?>? = null,
  /** base | surcharge | deduction | discount | tax | informational. */
  public var type: Enumeration<PriceComponentType>? = null,
  /** Codes may be used to differentiate between kinds of taxes, surcharges, discounts etc. */
  public var code: CodeableConcept? = null,
  /** Factor used for calculating this component. */
  public var factor: Decimal? = null,
  /** Explicit value amount to be used. */
  public var amount: Money? = null,
) : DataType() {
  /** Codes indicating the kind of the price component. */
  public enum class PriceComponentType(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * the amount is the base price used for calculating the total price before applying surcharges,
     * discount or taxes.
     */
    Base(
      "base",
      "http://hl7.org/fhir/price-component-type",
      "base price",
      "the amount is the base price used for calculating the total price before applying surcharges, discount or taxes.",
    ),
    /** the amount is a surcharge applied on the base price. */
    Surcharge(
      "surcharge",
      "http://hl7.org/fhir/price-component-type",
      "surcharge",
      "the amount is a surcharge applied on the base price.",
    ),
    /** the amount is a deduction applied on the base price. */
    Deduction(
      "deduction",
      "http://hl7.org/fhir/price-component-type",
      "deduction",
      "the amount is a deduction applied on the base price.",
    ),
    /** the amount is a discount applied on the base price. */
    Discount(
      "discount",
      "http://hl7.org/fhir/price-component-type",
      "discount",
      "the amount is a discount applied on the base price.",
    ),
    /** the amount is the tax component of the total price. */
    Tax(
      "tax",
      "http://hl7.org/fhir/price-component-type",
      "tax",
      "the amount is the tax component of the total price.",
    ),
    /**
     * the amount is of informational character, it has not been applied in the calculation of the
     * total price.
     */
    Informational(
      "informational",
      "http://hl7.org/fhir/price-component-type",
      "informational",
      "the amount is of informational character, it has not been applied in the calculation of the total price.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): PriceComponentType =
        when (code) {
          "base" -> Base
          "surcharge" -> Surcharge
          "deduction" -> Deduction
          "discount" -> Discount
          "tax" -> Tax
          "informational" -> Informational
          else -> throw IllegalArgumentException("Unknown code $code for enum PriceComponentType")
        }
    }
  }
}
