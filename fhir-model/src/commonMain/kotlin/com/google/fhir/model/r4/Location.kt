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

import com.google.fhir.model.r4.serializers.LocationHoursOfOperationSerializer
import com.google.fhir.model.r4.serializers.LocationPositionSerializer
import com.google.fhir.model.r4.serializers.LocationSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details and position information for a physical place where services are provided and resources
 * and participants may be stored, found, contained, or accommodated.
 */
@Serializable(with = LocationSerializer::class)
@SerialName("Location")
public data class Location(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override var id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override var meta: Meta? = null,
  /**
   * A reference to a set of rules that were followed when the resource was constructed, and which
   * must be understood when processing the content. Often, this is a reference to an implementation
   * guide that defines the special rules along with other profiles etc.
   *
   * Asserting this rule set restricts the content to be only understood by a limited set of trading
   * partners. This inherently limits the usefulness of the data in the long term. However, the
   * existing health eco-system is highly fractured, and not yet ready to define, collect, and
   * exchange data in a generally computable sense. Wherever possible, implementers and/or
   * specification writers should avoid using this element. Often, when used, the URL is a reference
   * to an implementation guide that defines these special rules as part of it's narrative along
   * with other profiles, value sets, etc.
   */
  override var implicitRules: Uri? = null,
  /**
   * The base language in which the resource is written.
   *
   * Language is provided to support indexing and accessibility (typically, services such as text to
   * speech use the language tag). The html language tag in the narrative applies to the narrative.
   * The language tag on the resource may be used to specify the language of other presentations
   * generated from the data in the resource. Not all the content has to be in the base language.
   * The Resource.language should not be assumed to apply to the narrative automatically. If a
   * language is specified, it should it also be specified on the div element in the html (see rules
   * in HTML5 for information about the relationship between xml:lang and the html lang attribute).
   */
  override var language: Code? = null,
  /**
   * A human-readable narrative that contains a summary of the resource and can be used to represent
   * the content of the resource to a human. The narrative need not encode all the structured data,
   * but is required to contain sufficient detail to make it "clinically safe" for a human to just
   * read the narrative. Resource definitions may define what content should be represented in the
   * narrative to ensure clinical safety.
   *
   * Contained resources do not have narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, and nor can they have their own independent
   * transaction scope.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags In their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: List<Resource?>? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and manageable, there is a strict set of
   * governance applied to the definition and use of extensions. Though any implementer can define
   * an extension, there is a set of requirements that SHALL be met as part of the definition of the
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
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer is
   * allowed to define an extension, there is a set of requirements that SHALL be met as part of the
   * definition of the extension. Applications processing a resource are required to check for
   * modifier extensions.
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
  /** Unique code or number identifying the location to its users. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The status property covers the general availability of the resource, not the current value
   * which may be covered by the operationStatus, or by a schedule/slots if they are configured for
   * the location.
   */
  public var status: Enumeration<LocationStatus>? = null,
  /**
   * The operational status covers operation values most relevant to beds (but can also apply to
   * rooms/units/chairs/etc. such as an isolation unit/dialysis chair). This typically covers
   * concepts such as contamination, housekeeping, and other activities like maintenance.
   */
  public var operationalStatus: Coding? = null,
  /**
   * Name of the location as used by humans. Does not need to be unique.
   *
   * If the name of a location changes, consider putting the old name in the alias column so that it
   * can still be located through searches.
   */
  public var name: String? = null,
  /**
   * A list of alternate names that the location is known as, or was known as, in the past.
   *
   * There are no dates associated with the alias/historic names, as this is not intended to track
   * when names were used, but to assist in searching so that older names can still result in
   * identifying the location.
   */
  public var alias: List<String?>? = null,
  /** Description of the Location, which helps in finding or referencing the place. */
  public var description: String? = null,
  /**
   * Indicates whether a resource instance represents a specific location or a class of locations.
   *
   * This is labeled as a modifier because whether or not the location is a class of locations
   * changes how it can be used and understood.
   */
  public var mode: Enumeration<LocationMode>? = null,
  /** Indicates the type of function performed at the location. */
  public var type: List<CodeableConcept?>? = null,
  /**
   * The contact details of communication devices available at the location. This can include phone
   * numbers, fax numbers, mobile numbers, email addresses and web sites.
   */
  public var telecom: List<ContactPoint?>? = null,
  /**
   * Physical location.
   *
   * Additional addresses should be recorded using another instance of the Location resource, or via
   * the Organization.
   */
  public var address: Address? = null,
  /** Physical form of the location, e.g. building, room, vehicle, road. */
  public var physicalType: CodeableConcept? = null,
  /**
   * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the
   * same co-ordinate system used in KML).
   */
  public var position: Position? = null,
  /**
   * The organization responsible for the provisioning and upkeep of the location.
   *
   * This can also be used as the part of the organization hierarchy where this location provides
   * services. These services can be defined through the HealthcareService resource.
   */
  public var managingOrganization: Reference? = null,
  /** Another Location of which this Location is physically a part of. */
  public var partOf: Reference? = null,
  /**
   * What days/times during a week is this location usually open.
   *
   * This type of information is commonly found published in directories and on websites informing
   * customers when the facility is available.
   *
   * Specific services within the location may have their own hours which could be shorter (or
   * longer) than the locations hours.
   */
  public var hoursOfOperation: List<HoursOfOperation>? = null,
  /**
   * A description of when the locations opening ours are different to normal, e.g. public holiday
   * availability. Succinctly describing all possible exceptions to normal site availability as
   * detailed in the opening hours Times.
   */
  public var availabilityExceptions: String? = null,
  /** Technical endpoints providing access to services operated for the location. */
  public var endpoint: List<Reference?>? = null,
) : DomainResource() {
  /**
   * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the
   * same co-ordinate system used in KML).
   */
  @Serializable(with = LocationPositionSerializer::class)
  public class Position(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: List<Extension?>? = null,
    /**
     * Longitude. The value domain and the interpretation are the same as for the text of the
     * longitude element in KML (see notes below).
     */
    public var longitude: Decimal? = null,
    /**
     * Latitude. The value domain and the interpretation are the same as for the text of the
     * latitude element in KML (see notes below).
     */
    public var latitude: Decimal? = null,
    /**
     * Altitude. The value domain and the interpretation are the same as for the text of the
     * altitude element in KML (see notes below).
     */
    public var altitude: Decimal? = null,
  ) : BackboneElement()

  /** What days/times during a week is this location usually open. */
  @Serializable(with = LocationHoursOfOperationSerializer::class)
  public class HoursOfOperation(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: List<Extension?>? = null,
    /** Indicates which days of the week are available between the start and end Times. */
    public var daysOfWeek: List<Enumeration<DaysOfWeek>>? = null,
    /** The Location is open all day. */
    public var allDay: Boolean? = null,
    /** Time that the Location opens. */
    public var openingTime: Time? = null,
    /** Time that the Location closes. */
    public var closingTime: Time? = null,
  ) : BackboneElement()

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

  /** Indicates whether the location is still in use. */
  public enum class LocationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The location is operational. */
    Active(
      "active",
      "http://hl7.org/fhir/location-status",
      "Active",
      "The location is operational.",
    ),
    /** The location is temporarily closed. */
    Suspended(
      "suspended",
      "http://hl7.org/fhir/location-status",
      "Suspended",
      "The location is temporarily closed.",
    ),
    /** The location is no longer used. */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/location-status",
      "Inactive",
      "The location is no longer used.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): LocationStatus =
        when (code) {
          "active" -> Active
          "suspended" -> Suspended
          "inactive" -> Inactive
          else -> throw IllegalArgumentException("Unknown code $code for enum LocationStatus")
        }
    }
  }

  /**
   * Indicates whether a resource instance represents a specific location or a class of locations.
   */
  public enum class LocationMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The Location resource represents a specific instance of a location (e.g. Operating Theatre
     * 1A).
     */
    Instance(
      "instance",
      "http://hl7.org/fhir/location-mode",
      "Instance",
      "The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A).",
    ),
    /**
     * The Location represents a class of locations (e.g. Any Operating Theatre) although this class
     * of locations could be constrained within a specific boundary (such as organization, or parent
     * location, address etc.).
     */
    Kind(
      "kind",
      "http://hl7.org/fhir/location-mode",
      "Kind",
      "The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): LocationMode =
        when (code) {
          "instance" -> Instance
          "kind" -> Kind
          else -> throw IllegalArgumentException("Unknown code $code for enum LocationMode")
        }
    }
  }
}
