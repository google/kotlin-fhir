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

import com.google.fhir.model.r4b.serializers.DataRequirementCodeFilterSerializer
import com.google.fhir.model.r4b.serializers.DataRequirementDateFilterSerializer
import com.google.fhir.model.r4b.serializers.DataRequirementSerializer
import com.google.fhir.model.r4b.serializers.DataRequirementSortSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for DataRequirement Type: Describes a required data item for evaluation
 * in terms of the type of data, and optional code or date-based filters of the data.
 */
@Serializable(with = DataRequirementSerializer::class)
public data class DataRequirement(
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
   * The type of the required data, specified as the type name of a resource. For profiles, this
   * value is set to the type of the base resource of the profile.
   */
  public var type: Enumeration<FHIRAllTypes>? = null,
  /** The profile of the required data, specified as the uri of the profile definition. */
  public var profile: List<Canonical?>? = null,
  /**
   * The intended subjects of the data requirement. If this element is not provided, a Patient
   * subject is assumed.
   *
   * The subject of a data requirement is critical, as the data being specified is determined with
   * respect to a particular subject. This corresponds roughly to the notion of a Compartment in
   * that it limits what data is available based on its relationship to the subject. In CQL, this
   * corresponds to the context declaration.
   */
  public var subject: Subject? = null,
  /**
   * Indicates that specific elements of the type are referenced by the knowledge module and must be
   * supported by the consumer in order to obtain an effective evaluation. This does not mean that a
   * value is required for this element, only that the consuming system must understand the element
   * and be able to provide values for it if they are available.
   *
   * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement.
   * The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the
   * [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
   */
  public var mustSupport: List<String?>? = null,
  /**
   * Code filters specify additional constraints on the data, specifying the value set of interest
   * for a particular element of the data. Each code filter defines an additional constraint on the
   * data, i.e. code filters are AND'ed, not OR'ed.
   */
  public var codeFilter: List<CodeFilter>? = null,
  /**
   * Date filters specify additional constraints on the data in terms of the applicable date range
   * for specific elements. Each date filter specifies an additional constraint on the data, i.e.
   * date filters are AND'ed, not OR'ed.
   */
  public var dateFilter: List<DateFilter>? = null,
  /**
   * Specifies a maximum number of results that are required (uses the _count search parameter).
   *
   * This element can be used in combination with the sort element to specify quota requirements
   * such as "the most recent 5" or "the highest 5".
   */
  public var limit: PositiveInt? = null,
  /**
   * Specifies the order of the results to be returned.
   *
   * This element can be used in combination with the sort element to specify quota requirements
   * such as "the most recent 5" or "the highest 5". When multiple sorts are specified, they are
   * applied in the order they appear in the resource.
   */
  public var sort: List<Sort>? = null,
) : Element() {
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
     * The code-valued attribute of the filter. The specified path SHALL be a FHIRPath resolveable
     * on the specified type of the DataRequirement, and SHALL consist only of identifiers, constant
     * indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse
     * sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see
     * the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index
     * must be an integer constant. The path must resolve to an element of type code, Coding, or
     * CodeableConcept.
     *
     * The path attribute contains a [Simple FHIRPath Subset](fhirpath.html#simple) that allows path
     * traversal, but not calculation.
     */
    public var path: String? = null,
    /**
     * A token parameter that refers to a search parameter defined on the specified type of the
     * DataRequirement, and which searches on elements of type code, Coding, or CodeableConcept.
     */
    public var searchParam: String? = null,
    /**
     * The valueset for the code filter. The valueSet and code elements are additive. If valueSet is
     * specified, the filter will return only those data items for which the value of the
     * code-valued element specified in the path is a member of the specified valueset.
     */
    public var valueSet: Canonical? = null,
    /**
     * The codes for the code filter. If values are given, the filter will return only those data
     * items for which the code-valued attribute specified by the path has a value that is one of
     * the specified codes. If codes are specified in addition to a value set, the filter returns
     * items matching a code in the value set or one of the specified codes.
     */
    public var code: List<Coding?>? = null,
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
     * The date-valued attribute of the filter. The specified path SHALL be a FHIRPath resolveable
     * on the specified type of the DataRequirement, and SHALL consist only of identifiers, constant
     * indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse
     * sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see
     * the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index
     * must be an integer constant. The path must resolve to an element of type date, dateTime,
     * Period, Schedule, or Timing.
     *
     * The path attribute contains a [Simple FHIR Subset](fhirpath.html#simple) that allows path
     * traversal, but not calculation.
     */
    public var path: String? = null,
    /**
     * A date parameter that refers to a search parameter defined on the specified type of the
     * DataRequirement, and which searches on elements of type date, dateTime, Period, Schedule, or
     * Timing.
     */
    public var searchParam: String? = null,
    /**
     * The value of the filter. If period is specified, the filter will return only those data items
     * that fall within the bounds determined by the Period, inclusive of the period boundaries. If
     * dateTime is specified, the filter will return only those data items that are equal to the
     * specified dateTime. If a Duration is specified, the filter will return only those data items
     * that fall within Duration before now.
     */
    public var `value`: Value? = null,
  ) : Element() {
    public sealed interface Value {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Value

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) : Value

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r4b.DateTime?,
          PeriodValue: com.google.fhir.model.r4b.Period?,
          DurationValue: com.google.fhir.model.r4b.Duration?,
        ): Value? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (DurationValue != null) return Duration(DurationValue)
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
     * The attribute of the sort. The specified path must be resolvable from the type of the
     * required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as
     * well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index
     * must be an integer constant.
     */
    public var path: String? = null,
    /** The direction of the sort, ascending or descending. */
    public var direction: Enumeration<SortDirection>? = null,
  ) : Element()

  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Subject

    public companion object {
      public fun from(
        CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        ReferenceValue: com.google.fhir.model.r4b.Reference?,
      ): Subject? {
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  /** The possible sort directions, ascending or descending. */
  public enum class SortDirection(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Ascending("ascending", "http://hl7.org/fhir/sort-direction", "Ascending", null),
    Descending("descending", "http://hl7.org/fhir/sort-direction", "Descending", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
