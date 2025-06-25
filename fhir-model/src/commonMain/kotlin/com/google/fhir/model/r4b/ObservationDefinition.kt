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

import com.google.fhir.model.r4b.serializers.ObservationDefinitionQualifiedIntervalSerializer
import com.google.fhir.model.r4b.serializers.ObservationDefinitionQuantitativeDetailsSerializer
import com.google.fhir.model.r4b.serializers.ObservationDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed
 * by an orderable health care service.
 */
@Serializable(with = ObservationDefinitionSerializer::class)
@SerialName("ObservationDefinition")
public data class ObservationDefinition(
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
  /**
   * A code that classifies the general type of observation.
   *
   * This element allows various categorization schemes based on the owner’s definition of the
   * category and effectively multiple categories can be used for one instance of
   * ObservationDefinition. The level of granularity is defined by the category concepts in the
   * value set.
   */
  public var category: List<CodeableConcept?>? = null,
  /** Describes what will be observed. Sometimes this is called the observation "name". */
  public var code: CodeableConcept? = null,
  /** A unique identifier assigned to this ObservationDefinition artifact. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The data types allowed for the value element of the instance observations conforming to this
   * ObservationDefinition.
   */
  public var permittedDataType: List<Enumeration<ObservationDataType>>? = null,
  /**
   * Multiple results allowed for observations conforming to this ObservationDefinition.
   *
   * An example of observation allowing multiple results is "bacteria identified by culture".
   * Conversely, the measurement of a potassium level allows a single result.
   */
  public var multipleResultsAllowed: Boolean? = null,
  /**
   * The method or technique used to perform the observation.
   *
   * Only used if not implicit in observation code.
   */
  public var method: CodeableConcept? = null,
  /**
   * The preferred name to be used when reporting the results of observations conforming to this
   * ObservationDefinition.
   */
  public var preferredReportName: String? = null,
  /** Characteristics for quantitative results of this observation. */
  public var quantitativeDetails: QuantitativeDetails? = null,
  /**
   * Multiple ranges of results qualified by different contexts for ordinal or continuous
   * observations conforming to this ObservationDefinition.
   */
  public var qualifiedInterval: List<QualifiedInterval>? = null,
  /**
   * The set of valid coded results for the observations conforming to this ObservationDefinition.
   */
  public var validCodedValueSet: Reference? = null,
  /**
   * The set of normal coded results for the observations conforming to this ObservationDefinition.
   */
  public var normalCodedValueSet: Reference? = null,
  /**
   * The set of abnormal coded results for the observation conforming to this ObservationDefinition.
   */
  public var abnormalCodedValueSet: Reference? = null,
  /**
   * The set of critical coded results for the observation conforming to this ObservationDefinition.
   */
  public var criticalCodedValueSet: Reference? = null,
) : DomainResource() {
  /** Characteristics for quantitative results of this observation. */
  @Serializable(with = ObservationDefinitionQuantitativeDetailsSerializer::class)
  public class QuantitativeDetails(
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
     * Customary unit used to report quantitative results of observations conforming to this
     * ObservationDefinition.
     */
    public var customaryUnit: CodeableConcept? = null,
    /**
     * SI unit used to report quantitative results of observations conforming to this
     * ObservationDefinition.
     */
    public var unit: CodeableConcept? = null,
    /**
     * Factor for converting value expressed with SI unit to value expressed with customary unit.
     */
    public var conversionFactor: Decimal? = null,
    /**
     * Number of digits after decimal separator when the results of such observations are of type
     * Quantity.
     */
    public var decimalPrecision: Integer? = null,
  ) : BackboneElement()

  /**
   * Multiple ranges of results qualified by different contexts for ordinal or continuous
   * observations conforming to this ObservationDefinition.
   */
  @Serializable(with = ObservationDefinitionQualifiedIntervalSerializer::class)
  public class QualifiedInterval(
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
     * The category of interval of values for continuous or ordinal observations conforming to this
     * ObservationDefinition.
     */
    public var category: Enumeration<ObservationRangeCategory>? = null,
    /** The low and high values determining the interval. There may be only one of the two. */
    public var range: Range? = null,
    /**
     * Codes to indicate the health context the range applies to. For example, the normal or
     * therapeutic range.
     */
    public var context: CodeableConcept? = null,
    /**
     * Codes to indicate the target population this reference range applies to.
     *
     * If this element is not present then the global population is assumed.
     */
    public var appliesTo: List<CodeableConcept?>? = null,
    /** Sex of the population the range applies to. */
    public var gender: Enumeration<AdministrativeGender>? = null,
    /**
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of
     * weeks at term) if the meaning says so.
     *
     * Some analytes vary greatly over age.
     */
    public var age: Range? = null,
    /**
     * The gestational age to which this reference range is applicable, in the context of pregnancy.
     */
    public var gestationalAge: Range? = null,
    /** Text based condition for which the reference range is valid. */
    public var condition: String? = null,
  ) : BackboneElement()

  /** Codes identifying the category of observation range. */
  public enum class ObservationRangeCategory(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Reference (Normal) Range for Ordinal and Continuous Observations. */
    Reference(
      "reference",
      "http://hl7.org/fhir/observation-range-category",
      "reference range",
      "Reference (Normal) Range for Ordinal and Continuous Observations.",
    ),
    /** Critical Range for Ordinal and Continuous Observations. */
    Critical(
      "critical",
      "http://hl7.org/fhir/observation-range-category",
      "critical range",
      "Critical Range for Ordinal and Continuous Observations.",
    ),
    /**
     * Absolute Range for Ordinal and Continuous Observations. Results outside this range are not
     * possible.
     */
    Absolute(
      "absolute",
      "http://hl7.org/fhir/observation-range-category",
      "absolute range",
      "Absolute Range for Ordinal and Continuous Observations. Results outside this range are not possible.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ObservationRangeCategory =
        when (code) {
          "reference" -> Reference
          "critical" -> Critical
          "absolute" -> Absolute
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ObservationRangeCategory")
        }
    }
  }

  /** Permitted data type for observation value. */
  public enum class ObservationDataType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** A measured amount. */
    Quantity(
      "Quantity",
      "http://hl7.org/fhir/permitted-data-type",
      "Quantity",
      "A measured amount.",
    ),
    /** A coded concept from a reference terminology and/or text. */
    CodeableConcept(
      "CodeableConcept",
      "http://hl7.org/fhir/permitted-data-type",
      "CodeableConcept",
      "A coded concept from a reference terminology and/or text.",
    ),
    /** A sequence of Unicode characters. */
    String(
      "string",
      "http://hl7.org/fhir/permitted-data-type",
      "string",
      "A sequence of Unicode characters.",
    ),
    /** true or false. */
    Boolean("boolean", "http://hl7.org/fhir/permitted-data-type", "boolean", "true or false."),
    /** A signed integer. */
    Integer("integer", "http://hl7.org/fhir/permitted-data-type", "integer", "A signed integer."),
    /** A set of values bounded by low and high. */
    Range(
      "Range",
      "http://hl7.org/fhir/permitted-data-type",
      "Range",
      "A set of values bounded by low and high.",
    ),
    /** A ratio of two Quantity values - a numerator and a denominator. */
    Ratio(
      "Ratio",
      "http://hl7.org/fhir/permitted-data-type",
      "Ratio",
      "A ratio of two Quantity values - a numerator and a denominator.",
    ),
    /** A series of measurements taken by a device. */
    SampledData(
      "SampledData",
      "http://hl7.org/fhir/permitted-data-type",
      "SampledData",
      "A series of measurements taken by a device.",
    ),
    /** A time during the day, in the format hh:mm:ss. */
    Time(
      "time",
      "http://hl7.org/fhir/permitted-data-type",
      "time",
      "A time during the day, in the format hh:mm:ss.",
    ),
    /**
     * A date, date-time or partial date (e.g. just year or year + month) as used in human
     * communication.
     */
    DateTime(
      "dateTime",
      "http://hl7.org/fhir/permitted-data-type",
      "dateTime",
      "A date, date-time or partial date (e.g. just year or year + month) as used in human communication.",
    ),
    /** A time range defined by start and end date/time. */
    Period(
      "Period",
      "http://hl7.org/fhir/permitted-data-type",
      "Period",
      "A time range defined by start and end date/time.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ObservationDataType =
        when (code) {
          "Quantity" -> Quantity
          "CodeableConcept" -> CodeableConcept
          "string" -> String
          "boolean" -> Boolean
          "integer" -> Integer
          "Range" -> Range
          "Ratio" -> Ratio
          "SampledData" -> SampledData
          "time" -> Time
          "dateTime" -> DateTime
          "Period" -> Period
          else -> throw IllegalArgumentException("Unknown code $code for enum ObservationDataType")
        }
    }
  }
}
