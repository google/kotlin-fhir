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

package com.google.fhir.model.r4

import com.google.fhir.model.r4.serializers.ContactPointSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for ContactPoint Type: Details for all kinds of technology mediated
 * contact points for a person or organization, including telephone, email, etc.
 */
@Serializable(with = ContactPointSerializer::class)
public data class ContactPoint(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and manageable, there is a strict set of governance
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
   * Telecommunications form for contact point - what communications system is required to make use
   * of the contact.
   */
  public var system: Enumeration<ContactPointSystem>? = null,
  /**
   * The actual contact point details, in a form that is meaningful to the designated communication
   * system (i.e. phone number or email address).
   *
   * Additional text data such as phone extension numbers, or notes about use of the contact are
   * sometimes included in the value.
   */
  public var `value`: String? = null,
  /**
   * Identifies the purpose for the contact point.
   *
   * Applications can assume that a contact is current unless it explicitly says that it is
   * temporary or old.
   */
  public var use: Enumeration<ContactPointUse>? = null,
  /**
   * Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank
   * values are more preferred than those with higher rank values.
   *
   * Note that rank does not necessarily follow the order in which the contacts are represented in
   * the instance.
   */
  public var rank: PositiveInt? = null,
  /** Time period when the contact point was/is in use. */
  public var period: Period? = null,
) : Element() {
  /** Telecommunications form for contact point. */
  public enum class ContactPointSystem(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The value is a telephone number used for voice calls. Use of full international numbers
     * starting with + is recommended to enable automatic dialing support but not required.
     */
    Phone(
      "phone",
      "http://hl7.org/fhir/contact-point-system",
      "Phone",
      "The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.",
    ),
    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended
     * to enable automatic dialing support but not required.
     */
    Fax(
      "fax",
      "http://hl7.org/fhir/contact-point-system",
      "Fax",
      "The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.",
    ),
    /** The value is an email address. */
    Email(
      "email",
      "http://hl7.org/fhir/contact-point-system",
      "Email",
      "The value is an email address.",
    ),
    /**
     * The value is a pager number. These may be local pager numbers that are only usable on a
     * particular pager system.
     */
    Pager(
      "pager",
      "http://hl7.org/fhir/contact-point-system",
      "Pager",
      "The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.",
    ),
    /**
     * A contact that is not a phone, fax, pager or email address and is expressed as a URL. This is
     * intended for various institutional or personal contacts including web sites, blogs, Skype,
     * Twitter, Facebook, etc. Do not use for email addresses.
     */
    Url(
      "url",
      "http://hl7.org/fhir/contact-point-system",
      "URL",
      "A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various institutional or personal contacts including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses.",
    ),
    /**
     * A contact that can be used for sending an sms message (e.g. mobile phones, some landlines).
     */
    Sms(
      "sms",
      "http://hl7.org/fhir/contact-point-system",
      "SMS",
      "A contact that can be used for sending an sms message (e.g. mobile phones, some landlines).",
    ),
    /**
     * A contact that is not a phone, fax, page or email address and is not expressible as a URL.
     * E.g. Internal mail address. This SHOULD NOT be used for contacts that are expressible as a
     * URL (e.g. Skype, Twitter, Facebook, etc.) Extensions may be used to distinguish "other"
     * contact types.
     */
    Other(
      "other",
      "http://hl7.org/fhir/contact-point-system",
      "Other",
      "A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish \"other\" contact types.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ContactPointSystem =
        when (code) {
          "phone" -> Phone
          "fax" -> Fax
          "email" -> Email
          "pager" -> Pager
          "url" -> Url
          "sms" -> Sms
          "other" -> Other
          else -> throw IllegalArgumentException("Unknown code $code for enum ContactPointSystem")
        }
    }
  }

  /** Use of contact point. */
  public enum class ContactPointUse(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * A communication contact point at a home; attempted contacts for business purposes might
     * intrude privacy and chances are one will contact family or other household members instead of
     * the person one wishes to call. Typically used with urgent cases, or if no other contacts are
     * available.
     */
    Home(
      "home",
      "http://hl7.org/fhir/contact-point-use",
      "Home",
      "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.",
    ),
    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    Work(
      "work",
      "http://hl7.org/fhir/contact-point-use",
      "Work",
      "An office contact point. First choice for business related contacts during business hours.",
    ),
    /** A temporary contact point. The period can provide more detailed information. */
    Temp(
      "temp",
      "http://hl7.org/fhir/contact-point-use",
      "Temp",
      "A temporary contact point. The period can provide more detailed information.",
    ),
    /** This contact point is no longer in use (or was never correct, but retained for records). */
    Old(
      "old",
      "http://hl7.org/fhir/contact-point-use",
      "Old",
      "This contact point is no longer in use (or was never correct, but retained for records).",
    ),
    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of
     * all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    Mobile(
      "mobile",
      "http://hl7.org/fhir/contact-point-use",
      "Mobile",
      "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ContactPointUse =
        when (code) {
          "home" -> Home
          "work" -> Work
          "temp" -> Temp
          "old" -> Old
          "mobile" -> Mobile
          else -> throw IllegalArgumentException("Unknown code $code for enum ContactPointUse")
        }
    }
  }
}
