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

import com.google.fhir.model.r5.serializers.AvailabilityAvailableTimeSerializer
import com.google.fhir.model.r5.serializers.AvailabilityNotAvailableTimeSerializer
import com.google.fhir.model.r5.serializers.AvailabilitySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/** Availability Type: Availability data for an {item}. */
@Serializable(with = AvailabilitySerializer::class)
public data class Availability(
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
  /** Times the {item} is available. */
  public var availableTime: List<AvailableTime>? = null,
  /** Not available during this time due to provided reason. */
  public var notAvailableTime: List<NotAvailableTime>? = null,
) : DataType() {
  /** Times the {item} is available. */
  @Serializable(with = AvailabilityAvailableTimeSerializer::class)
  public class AvailableTime(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: List<Extension?>? = null,
    /** mon | tue | wed | thu | fri | sat | sun. */
    public var daysOfWeek: List<Enumeration<DaysOfWeek>>? = null,
    /** Always available? i.e. 24 hour service. */
    public var allDay: Boolean? = null,
    /**
     * Opening time of day (ignored if allDay = true).
     *
     * The timezone is expected to be specified or implied by the context this datatype is used.
     */
    public var availableStartTime: Time? = null,
    /**
     * Closing time of day (ignored if allDay = true).
     *
     * The timezone is expected to be specified or implied by the context this datatype is used.
     */
    public var availableEndTime: Time? = null,
  ) : Element()

  /** Not available during this time due to provided reason. */
  @Serializable(with = AvailabilityNotAvailableTimeSerializer::class)
  public class NotAvailableTime(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: List<Extension?>? = null,
    /**
     * Reason presented to the user explaining why time not available.
     *
     * The reason will generally be provided to give the textual reason for displaying when the
     * {item} is not available, e.g. 'Closed public holidays' or 'Independence Day'. In cases such
     * as this, the `during` might not be included and local knowledge would be required in such
     * cases (as don't desire to keep updating when the holiday occurs each year).
     *
     * e.g.2: 'Closed for maintenance over the summer' for this example you would want to include
     * the `during` period, unless this was a university hospital and the "summer" period was well
     * known, but would recommend its inclusion anyway.
     */
    public var description: String? = null,
    /** Service not available during this period. */
    public var during: Period? = null,
  ) : Element()

  /** The days of the week. */
  public enum class DaysOfWeek(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Monday. */
    Mon("mon", "http://hl7.org/fhir/days-of-week", "Monday", "Monday."),
    /** Tuesday. */
    Tue("tue", "http://hl7.org/fhir/days-of-week", "Tuesday", "Tuesday."),
    /** Wednesday. */
    Wed("wed", "http://hl7.org/fhir/days-of-week", "Wednesday", "Wednesday."),
    /** Thursday. */
    Thu("thu", "http://hl7.org/fhir/days-of-week", "Thursday", "Thursday."),
    /** Friday. */
    Fri("fri", "http://hl7.org/fhir/days-of-week", "Friday", "Friday."),
    /** Saturday. */
    Sat("sat", "http://hl7.org/fhir/days-of-week", "Saturday", "Saturday."),
    /** Sunday. */
    Sun("sun", "http://hl7.org/fhir/days-of-week", "Sunday", "Sunday.");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DaysOfWeek =
        when (code) {
          "mon" -> Mon
          "tue" -> Tue
          "wed" -> Wed
          "thu" -> Thu
          "fri" -> Fri
          "sat" -> Sat
          "sun" -> Sun
          else -> throw IllegalArgumentException("Unknown code $code for enum DaysOfWeek")
        }
    }
  }
}
