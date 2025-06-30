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

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.TimingRepeatBoundsSerializer
import com.google.fhir.model.r4b.serializers.TimingRepeatSerializer
import com.google.fhir.model.r4b.serializers.TimingSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for Timing Type: Specifies an event that may occur multiple times.
 * Timing schedules are used to record when things are planned, expected or requested to occur. The
 * most common usage is in dosage instructions for medications. They are also used when planning
 * care of various kinds, and may be used for reporting the schedule to which past regular
 * activities were carried out.
 */
@Serializable(with = TimingSerializer::class)
public data class Timing(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: String? = null,
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
   * May be used to represent additional information that is not part of the basic definition of the
   * element and that modifies the understanding of the element in which it is contained and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met as part of the definition
   * of the extension. Applications processing a resource are required to check for modifier
   * extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource
   * (including cannot change the meaning of modifierExtension itself).
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var modifierExtension: List<Extension?>? = null,
  /** Identifies specific times when the event occurs. */
  public var event: List<DateTime?>? = null,
  /** A set of rules that describe when the event is scheduled. */
  public var repeat: Repeat? = null,
  /**
   * A code for the timing schedule (or just text in code.text). Some codes such as BID are
   * ubiquitous, but many institutions define their own additional codes. If a code is provided, the
   * code is understood to be a complete statement of whatever is specified in the structured timing
   * data, and either the code or the data may be used to interpret the Timing, with the exception
   * that .repeat.bounds still applies over the code (and is not contained in the code).
   *
   * BID etc. are defined as 'at institutionally specified times'. For example, an institution may
   * choose that BID is "always at 7am and 6pm". If it is inappropriate for this choice to be made,
   * the code BID should not be used. Instead, a distinct organization-specific code should be used
   * in place of the HL7-defined BID code and/or a structured representation should be used (in this
   * case, specifying the two event times).
   */
  public var code: CodeableConcept? = null,
) : BackboneElement() {
  /** A set of rules that describe when the event is scheduled. */
  @Serializable(with = TimingRepeatSerializer::class)
  public class Repeat(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
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
     * Either a duration for the length of the timing schedule, a range of possible length, or outer
     * bounds for start and/or end limits of the timing schedule.
     */
    public var bounds: Bounds? = null,
    /**
     * A total count of the desired number of repetitions across the duration of the entire timing
     * specification. If countMax is present, this element indicates the lower bound of the allowed
     * range of count values.
     *
     * If you have both bounds and count, then this should be understood as within the bounds
     * period, until count times happens.
     */
    public var count: PositiveInt? = null,
    /**
     * If present, indicates that the count is a range - so to perform the action between [count]
     * and [countMax] times.
     */
    public var countMax: PositiveInt? = null,
    /**
     * How long this thing happens for when it happens. If durationMax is present, this element
     * indicates the lower bound of the allowed range of the duration.
     *
     * For some events the duration is part of the definition of the event (e.g. IV infusions, where
     * the duration is implicit in the specified quantity and rate). For others, it's part of the
     * timing specification (e.g. exercise).
     */
    public var duration: Decimal? = null,
    /**
     * If present, indicates that the duration is a range - so to perform the action between
     * [duration] and [durationMax] time length.
     *
     * For some events the duration is part of the definition of the event (e.g. IV infusions, where
     * the duration is implicit in the specified quantity and rate). For others, it's part of the
     * timing specification (e.g. exercise).
     */
    public var durationMax: Decimal? = null,
    /** The units of time for the duration, in UCUM units. */
    public var durationUnit: Code? = null,
    /**
     * The number of times to repeat the action within the specified period. If frequencyMax is
     * present, this element indicates the lower bound of the allowed range of the frequency.
     */
    public var frequency: PositiveInt? = null,
    /**
     * If present, indicates that the frequency is a range - so to repeat between [frequency] and
     * [frequencyMax] times within the period or period range.
     */
    public var frequencyMax: PositiveInt? = null,
    /**
     * Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times
     * per day", 3 would be the frequency and "1 day" would be the period. If periodMax is present,
     * this element indicates the lower bound of the allowed range of the period length.
     */
    public var period: Decimal? = null,
    /**
     * If present, indicates that the period is a range from [period] to [periodMax], allowing
     * expressing concepts such as "do this once every 3-5 days.
     */
    public var periodMax: Decimal? = null,
    /** The units of time for the period in UCUM units. */
    public var periodUnit: Code? = null,
    /**
     * If one or more days of week is provided, then the action happens only on the specified
     * day(s).
     *
     * If no days are specified, the action is assumed to happen every day as otherwise specified.
     * The elements frequency and period cannot be used as well as dayOfWeek.
     */
    public var dayOfWeek: List<Enumeration<DayOfWeek>>? = null,
    /**
     * Specified time of day for action to take place.
     *
     * When time of day is specified, it is inferred that the action happens every day (as filtered
     * by dayofWeek) on the specified times. The elements when, frequency and period cannot be used
     * as well as timeOfDay.
     */
    public var timeOfDay: List<Time?>? = null,
    /**
     * An approximate time period during the day, potentially linked to an event of daily living
     * that indicates when the action should occur.
     *
     * When more than one event is listed, the event is tied to the union of the specified events.
     */
    public var `when`: List<Enumeration<EventTiming>>? = null,
    /**
     * The number of minutes from the event. If the event code does not indicate whether the minutes
     * is before or after the event, then the offset is assumed to be after the event.
     */
    public var offset: UnsignedInt? = null,
  ) : Element() {
    @Serializable(with = TimingRepeatBoundsSerializer::class)
    public sealed interface Bounds {
      public fun asDuration(): Duration? = this as? Duration

      public fun asRange(): Range? = this as? Range

      public fun asPeriod(): Period? = this as? Period

      public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) : Bounds

      public data class Range(public val `value`: com.google.fhir.model.r4b.Range) : Bounds

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Bounds

      public data object Null : Bounds

      public companion object {
        public fun from(
          DurationValue: com.google.fhir.model.r4b.Duration?,
          RangeValue: com.google.fhir.model.r4b.Range?,
          PeriodValue: com.google.fhir.model.r4b.Period?,
        ): Bounds {
          if (DurationValue != null) return Duration(DurationValue)
          if (RangeValue != null) return Range(RangeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return Null
        }
      }
    }
  }

  /** The days of the week. */
  public enum class DayOfWeek(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
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

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): DayOfWeek =
        when (code) {
          "mon" -> Mon
          "tue" -> Tue
          "wed" -> Wed
          "thu" -> Thu
          "fri" -> Fri
          "sat" -> Sat
          "sun" -> Sun
          else -> throw IllegalArgumentException("Unknown code $code for enum DayOfWeek")
        }
    }
  }

  /** Real world event relating to the schedule. */
  public enum class EventTiming(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * Event occurs during the morning. The exact time is unspecified and established by institution
     * convention or patient interpretation.
     */
    Morn(
      "MORN",
      "http://hl7.org/fhir/event-timing",
      "Morning",
      "Event occurs during the morning. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the early morning. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Morn_Early(
      "MORN.early",
      "http://hl7.org/fhir/event-timing",
      "Early Morning",
      "Event occurs during the early morning. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the late morning. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Morn_Late(
      "MORN.late",
      "http://hl7.org/fhir/event-timing",
      "Late Morning",
      "Event occurs during the late morning. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs around 12:00pm. The exact time is unspecified and established by institution
     * convention or patient interpretation.
     */
    Noon(
      "NOON",
      "http://hl7.org/fhir/event-timing",
      "Noon",
      "Event occurs around 12:00pm. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the afternoon. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Aft(
      "AFT",
      "http://hl7.org/fhir/event-timing",
      "Afternoon",
      "Event occurs during the afternoon. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the early afternoon. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Aft_Early(
      "AFT.early",
      "http://hl7.org/fhir/event-timing",
      "Early Afternoon",
      "Event occurs during the early afternoon. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the late afternoon. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Aft_Late(
      "AFT.late",
      "http://hl7.org/fhir/event-timing",
      "Late Afternoon",
      "Event occurs during the late afternoon. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the evening. The exact time is unspecified and established by institution
     * convention or patient interpretation.
     */
    Eve(
      "EVE",
      "http://hl7.org/fhir/event-timing",
      "Evening",
      "Event occurs during the evening. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the early evening. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Eve_Early(
      "EVE.early",
      "http://hl7.org/fhir/event-timing",
      "Early Evening",
      "Event occurs during the early evening. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the late evening. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    Eve_Late(
      "EVE.late",
      "http://hl7.org/fhir/event-timing",
      "Late Evening",
      "Event occurs during the late evening. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs during the night. The exact time is unspecified and established by institution
     * convention or patient interpretation.
     */
    Night(
      "NIGHT",
      "http://hl7.org/fhir/event-timing",
      "Night",
      "Event occurs during the night. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    /**
     * Event occurs [offset] after subject goes to sleep. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    Phs(
      "PHS",
      "http://hl7.org/fhir/event-timing",
      "After Sleep",
      "Event occurs [offset] after subject goes to sleep. The exact time is unspecified and established by institution convention or patient interpretation.",
    ),
    Hs("HS", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Wake("WAKE", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    C("C", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Cm("CM", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Cd("CD", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Cv("CV", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Ac("AC", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Acm("ACM", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Acd("ACD", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Acv("ACV", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Pc("PC", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Pcm("PCM", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Pcd("PCD", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null),
    Pcv("PCV", "http://terminology.hl7.org/CodeSystem/v3-TimingEvent", null, null);

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): EventTiming =
        when (code) {
          "MORN" -> Morn
          "MORN.early" -> Morn_Early
          "MORN.late" -> Morn_Late
          "NOON" -> Noon
          "AFT" -> Aft
          "AFT.early" -> Aft_Early
          "AFT.late" -> Aft_Late
          "EVE" -> Eve
          "EVE.early" -> Eve_Early
          "EVE.late" -> Eve_Late
          "NIGHT" -> Night
          "PHS" -> Phs
          "HS" -> Hs
          "WAKE" -> Wake
          "C" -> C
          "CM" -> Cm
          "CD" -> Cd
          "CV" -> Cv
          "AC" -> Ac
          "ACM" -> Acm
          "ACD" -> Acd
          "ACV" -> Acv
          "PC" -> Pc
          "PCM" -> Pcm
          "PCD" -> Pcd
          "PCV" -> Pcv
          else -> throw IllegalArgumentException("Unknown code $code for enum EventTiming")
        }
    }
  }
}
