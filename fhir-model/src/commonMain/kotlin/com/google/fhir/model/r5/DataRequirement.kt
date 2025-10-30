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

import com.google.fhir.model.r5.serializers.DataRequirementCodeFilterSerializer
import com.google.fhir.model.r5.serializers.DataRequirementDateFilterSerializer
import com.google.fhir.model.r5.serializers.DataRequirementDateFilterValueSerializer
import com.google.fhir.model.r5.serializers.DataRequirementSerializer
import com.google.fhir.model.r5.serializers.DataRequirementSortSerializer
import com.google.fhir.model.r5.serializers.DataRequirementSubjectSerializer
import com.google.fhir.model.r5.serializers.DataRequirementValueFilterSerializer
import com.google.fhir.model.r5.serializers.DataRequirementValueFilterValueSerializer
import com.google.fhir.model.r5.terminologies.FHIRTypes
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * DataRequirement Type: Describes a required data item for evaluation in terms of the type of data,
 * and optional code or date-based filters of the data.
 */
@Serializable(with = DataRequirementSerializer::class)
public data class DataRequirement(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override val id: kotlin.String? = null,
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
  override val extension: List<Extension> = listOf(),
  /**
   * The type of the required data, specified as the type name of a resource. For profiles, this
   * value is set to the type of the base resource of the profile.
   */
  public val type: Enumeration<FHIRTypes>,
  /** The profile of the required data, specified as the uri of the profile definition. */
  public val profile: List<Canonical> = listOf(),
  /**
   * The intended subjects of the data requirement. If this element is not provided, a Patient
   * subject is assumed.
   *
   * The subject of a data requirement is critical, as the data being specified is determined with
   * respect to a particular subject. This corresponds roughly to the notion of a Compartment in
   * that it limits what data is available based on its relationship to the subject. In CQL, this
   * corresponds to the context declaration.
   */
  public val subject: Subject? = null,
  /**
   * Indicates that specific elements of the type are referenced by the knowledge module and must be
   * supported by the consumer in order to obtain an effective evaluation. This does not mean that a
   * value is required for this element, only that the consuming system must understand the element
   * and be able to provide values for it if they are available.
   *
   * The value of mustSupport SHALL be a FHIRPath resolvable on the type of the DataRequirement. The
   * path SHALL consist only of identifiers, constant indexers, and .resolve() (see the
   * [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
   */
  public val mustSupport: List<String> = listOf(),
  /**
   * Code filters specify additional constraints on the data, specifying the value set of interest
   * for a particular element of the data. Each code filter defines an additional constraint on the
   * data, i.e. code filters are AND'ed, not OR'ed.
   */
  public val codeFilter: List<CodeFilter> = listOf(),
  /**
   * Date filters specify additional constraints on the data in terms of the applicable date range
   * for specific elements. Each date filter specifies an additional constraint on the data, i.e.
   * date filters are AND'ed, not OR'ed.
   */
  public val dateFilter: List<DateFilter> = listOf(),
  /**
   * Value filters specify additional constraints on the data for elements other than code-valued or
   * date-valued. Each value filter specifies an additional constraint on the data (i.e.
   * valueFilters are AND'ed, not OR'ed).
   */
  public val valueFilter: List<ValueFilter> = listOf(),
  /**
   * Specifies a maximum number of results that are required (uses the _count search parameter).
   *
   * This element can be used in combination with the sort element to specify quota requirements
   * such as "the most recent 5" or "the highest 5".
   */
  public val limit: PositiveInt? = null,
  /**
   * Specifies the order of the results to be returned.
   *
   * This element can be used in combination with the sort element to specify quota requirements
   * such as "the most recent 5" or "the highest 5". When multiple sorts are specified, they are
   * applied in the order they appear in the resource.
   */
  public val sort: List<Sort> = listOf(),
) : DataType() {
  /**
   * Code filters specify additional constraints on the data, specifying the value set of interest
   * for a particular element of the data. Each code filter defines an additional constraint on the
   * data, i.e. code filters are AND'ed, not OR'ed.
   */
  @Serializable(with = DataRequirementCodeFilterSerializer::class)
  public class CodeFilter(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
    /**
     * The code-valued attribute of the filter. The specified path SHALL be a FHIRPath resolvable on
     * the specified type of the DataRequirement, and SHALL consist only of identifiers, constant
     * indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse
     * sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see
     * the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index
     * must be an integer constant. The path must resolve to an element of type code, Coding, or
     * CodeableConcept.
     *
     * The path attribute contains a [Simple FHIRPath Subset](fhirpath.html#simple) that allows path
     * traversal, but not calculation.
     */
    public val path: String? = null,
    /**
     * A token parameter that refers to a search parameter defined on the specified type of the
     * DataRequirement, and which searches on elements of type code, Coding, or CodeableConcept.
     */
    public val searchParam: String? = null,
    /**
     * The valueset for the code filter. The valueSet and code elements are additive. If valueSet is
     * specified, the filter will return only those data items for which the value of the
     * code-valued element specified in the path is a member of the specified valueset.
     */
    public val valueSet: Canonical? = null,
    /**
     * The codes for the code filter. If values are given, the filter will return only those data
     * items for which the code-valued attribute specified by the path has a value that is one of
     * the specified codes. If codes are specified in addition to a value set, the filter returns
     * items matching a code in the value set or one of the specified codes.
     */
    public val code: List<Coding> = listOf(),
  ) : Element()

  /**
   * Date filters specify additional constraints on the data in terms of the applicable date range
   * for specific elements. Each date filter specifies an additional constraint on the data, i.e.
   * date filters are AND'ed, not OR'ed.
   */
  @Serializable(with = DataRequirementDateFilterSerializer::class)
  public class DateFilter(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
    /**
     * The date-valued attribute of the filter. The specified path SHALL be a FHIRPath resolvable on
     * the specified type of the DataRequirement, and SHALL consist only of identifiers, constant
     * indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse
     * sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see
     * the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index
     * must be an integer constant. The path must resolve to an element of type date, dateTime,
     * Period, Schedule, or Timing.
     *
     * The path attribute contains a [Simple FHIR Subset](fhirpath.html#simple) that allows path
     * traversal, but not calculation.
     */
    public val path: String? = null,
    /**
     * A date parameter that refers to a search parameter defined on the specified type of the
     * DataRequirement, and which searches on elements of type date, dateTime, Period, Schedule, or
     * Timing.
     */
    public val searchParam: String? = null,
    /**
     * The value of the filter. If period is specified, the filter will return only those data items
     * that fall within the bounds determined by the Period, inclusive of the period boundaries. If
     * dateTime is specified, the filter will return only those data items that are equal to the
     * specified dateTime. If a Duration is specified, the filter will return only those data items
     * that fall within Duration before now.
     */
    public val `value`: Value? = null,
  ) : Element() {
    @Serializable(with = DataRequirementDateFilterValueSerializer::class)
    public sealed interface Value {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Value

      public companion object {
        internal fun from(
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          periodValue: com.google.fhir.model.r5.Period?,
          durationValue: com.google.fhir.model.r5.Duration?,
        ): Value? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (periodValue != null) return Period(periodValue)
          if (durationValue != null) return Duration(durationValue)
          return null
        }
      }
    }
  }

  /**
   * Value filters specify additional constraints on the data for elements other than code-valued or
   * date-valued. Each value filter specifies an additional constraint on the data (i.e.
   * valueFilters are AND'ed, not OR'ed).
   */
  @Serializable(with = DataRequirementValueFilterSerializer::class)
  public class ValueFilter(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
    /**
     * The attribute of the filter. The specified path SHALL be a FHIRPath resolvable on the
     * specified type of the DataRequirement, and SHALL consist only of identifiers, constant
     * indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse
     * sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see
     * the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index
     * must be an integer constant. The path must resolve to an element of a type that is comparable
     * to the valueFilter.value[x] element for the filter.
     *
     * The path attribute contains a [Simple FHIR Subset](fhirpath.html#simple) that allows path
     * traversal, but not calculation.
     */
    public val path: String? = null,
    /**
     * A search parameter defined on the specified type of the DataRequirement, and which searches
     * on elements of a type compatible with the type of the valueFilter.value[x] for the filter.
     */
    public val searchParam: String? = null,
    /** The comparator to be used to determine whether the value is matching. */
    public val comparator: Enumeration<ValueFilterComparator>? = null,
    /** The value of the filter. */
    public val `value`: Value? = null,
  ) : Element() {
    @Serializable(with = DataRequirementValueFilterValueSerializer::class)
    public sealed interface Value {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Value

      public companion object {
        internal fun from(
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          periodValue: com.google.fhir.model.r5.Period?,
          durationValue: com.google.fhir.model.r5.Duration?,
        ): Value? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (periodValue != null) return Period(periodValue)
          if (durationValue != null) return Duration(durationValue)
          return null
        }
      }
    }
  }

  /** Specifies the order of the results to be returned. */
  @Serializable(with = DataRequirementSortSerializer::class)
  public class Sort(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: kotlin.String? = null,
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
    override val extension: List<Extension> = listOf(),
    /**
     * The attribute of the sort. The specified path must be resolvable from the type of the
     * required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as
     * well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index
     * must be an integer constant.
     */
    public val path: String,
    /** The direction of the sort, ascending or descending. */
    public val direction: Enumeration<SortDirection>,
  ) : Element()

  @Serializable(with = DataRequirementSubjectSerializer::class)
  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Subject

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        referenceValue: com.google.fhir.model.r5.Reference?,
      ): Subject? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  /** The type of comparator operator to use */
  public enum class ValueFilterComparator(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Eq("eq", "http://hl7.org/fhir/search-comparator", "Equals"),
    Gt("gt", "http://hl7.org/fhir/search-comparator", "Greater Than"),
    Lt("lt", "http://hl7.org/fhir/search-comparator", "Less Than"),
    Ge("ge", "http://hl7.org/fhir/search-comparator", "Greater or Equals"),
    Le("le", "http://hl7.org/fhir/search-comparator", "Less of Equal"),
    Sa("sa", "http://hl7.org/fhir/search-comparator", "Starts After"),
    Eb("eb", "http://hl7.org/fhir/search-comparator", "Ends Before");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ValueFilterComparator =
        when (code) {
          "eq" -> Eq
          "gt" -> Gt
          "lt" -> Lt
          "ge" -> Ge
          "le" -> Le
          "sa" -> Sa
          "eb" -> Eb
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ValueFilterComparator")
        }
    }
  }

  /** The possible sort directions, ascending or descending. */
  public enum class SortDirection(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Ascending("ascending", "http://hl7.org/fhir/sort-direction", "Ascending"),
    Descending("descending", "http://hl7.org/fhir/sort-direction", "Descending");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): SortDirection =
        when (code) {
          "ascending" -> Ascending
          "descending" -> Descending
          else -> throw IllegalArgumentException("Unknown code $code for enum SortDirection")
        }
    }
  }
}
