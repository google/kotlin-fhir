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

import com.google.fhir.model.r5.serializers.AddressSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Address Type: An address expressed using postal conventions (as opposed to GPS or other location
 * definition formats). This data type may be used to convey addresses for use in delivering mail as
 * well as for visiting locations which might not be valid for mail delivery. There are a variety of
 * postal address formats defined around the world. The ISO21090-codedString may be used to provide
 * a coded representation of the contents of strings in an Address.
 */
@Serializable(with = AddressSerializer::class)
public data class Address(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
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
  /**
   * The purpose of this address.
   *
   * Applications can assume that an address is current unless it explicitly says that it is
   * temporary or old.
   */
  public var use: Enumeration<AddressUse>? = null,
  /**
   * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO
   * Boxes and care-of addresses). Most addresses are both.
   *
   * The definition of Address states that "address is intended to describe postal addresses, not
   * physical locations". However, many applications track whether an address has a dual purpose of
   * being a location that can be visited as well as being a valid delivery destination, and Postal
   * addresses are often used as proxies for physical locations (also see the
   * [Location](location.html#) resource).
   */
  public var type: Enumeration<AddressType>? = null,
  /**
   * Specifies the entire address as it should be displayed e.g. on a postal label. This may be
   * provided instead of or as well as the specific parts.
   *
   * Can provide both a text representation and parts. Applications updating an address SHALL ensure
   * that when both text and parts are present, no content is included in the text that isn't found
   * in a part.
   */
  public var text: String? = null,
  /**
   * This component contains the house number, apartment number, street name, street direction, P.O.
   * Box number, delivery hints, and similar address information.
   */
  public var line: List<String?>? = null,
  /** The name of the city, town, suburb, village or other community or delivery center. */
  public var city: String? = null,
  /**
   * The name of the administrative area (county).
   *
   * District is sometimes known as county, but in some regions 'county' is used in place of city
   * (municipality), so county name should be conveyed in city instead.
   */
  public var district: String? = null,
  /**
   * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be
   * used if codes are in common use (e.g. US 2 letter state codes).
   */
  public var state: String? = null,
  /** A postal code designating a region defined by the postal service. */
  public var postalCode: String? = null,
  /**
   * Country - a nation as commonly understood or generally accepted.
   *
   * ISO 3166 2- or 3- letter codes MAY be used in place of a human readable country name.
   */
  public var country: String? = null,
  /** Time period when address was/is in use. */
  public var period: Period? = null,
) : DataType() {
  /** The use of an address. */
  public enum class AddressUse(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** A communication address at a home. */
    Home("home", "http://hl7.org/fhir/address-use", "Home", "A communication address at a home."),
    /** An office address. First choice for business related contacts during business hours. */
    Work(
      "work",
      "http://hl7.org/fhir/address-use",
      "Work",
      "An office address. First choice for business related contacts during business hours.",
    ),
    /** A temporary address. The period can provide more detailed information. */
    Temp(
      "temp",
      "http://hl7.org/fhir/address-use",
      "Temporary",
      "A temporary address. The period can provide more detailed information.",
    ),
    /** This address is no longer in use (or was never correct but retained for records). */
    Old(
      "old",
      "http://hl7.org/fhir/address-use",
      "Old / Incorrect",
      "This address is no longer in use (or was never correct but retained for records).",
    ),
    /** An address to be used to send bills, invoices, receipts etc. */
    Billing(
      "billing",
      "http://hl7.org/fhir/address-use",
      "Billing",
      "An address to be used to send bills, invoices, receipts etc.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AddressUse =
        when (code) {
          "home" -> Home
          "work" -> Work
          "temp" -> Temp
          "old" -> Old
          "billing" -> Billing
          else -> throw IllegalArgumentException("Unknown code $code for enum AddressUse")
        }
    }
  }

  /** The type of an address (physical / postal). */
  public enum class AddressType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Mailing addresses - PO Boxes and care-of addresses. */
    Postal(
      "postal",
      "http://hl7.org/fhir/address-type",
      "Postal",
      "Mailing addresses - PO Boxes and care-of addresses.",
    ),
    /** A physical address that can be visited. */
    Physical(
      "physical",
      "http://hl7.org/fhir/address-type",
      "Physical",
      "A physical address that can be visited.",
    ),
    /** An address that is both physical and postal. */
    Both(
      "both",
      "http://hl7.org/fhir/address-type",
      "Postal & Physical",
      "An address that is both physical and postal.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AddressType =
        when (code) {
          "postal" -> Postal
          "physical" -> Physical
          "both" -> Both
          else -> throw IllegalArgumentException("Unknown code $code for enum AddressType")
        }
    }
  }
}
