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

import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DataRequirement
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DataRequirementCodeFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var searchParam: KotlinString? = null,
  public var _searchParam: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var code: MutableList<Coding>? = null,
) {
  public fun toModel(): DataRequirement.CodeFilter =
    DataRequirement.CodeFilter(
      id = this@DataRequirementCodeFilterSurrogate.id,
      extension = this@DataRequirementCodeFilterSurrogate.extension ?: mutableListOf(),
      path =
        R5String.of(
          this@DataRequirementCodeFilterSurrogate.path,
          this@DataRequirementCodeFilterSurrogate._path,
        ),
      searchParam =
        R5String.of(
          this@DataRequirementCodeFilterSurrogate.searchParam,
          this@DataRequirementCodeFilterSurrogate._searchParam,
        ),
      valueSet =
        Canonical.of(
          this@DataRequirementCodeFilterSurrogate.valueSet,
          this@DataRequirementCodeFilterSurrogate._valueSet,
        ),
      code = this@DataRequirementCodeFilterSurrogate.code ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DataRequirement.CodeFilter): DataRequirementCodeFilterSurrogate =
      with(model) {
        DataRequirementCodeFilterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          searchParam = this@with.searchParam?.value,
          _searchParam = this@with.searchParam?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          code = this@with.code.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DataRequirementDateFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var searchParam: KotlinString? = null,
  public var _searchParam: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valuePeriod: Period? = null,
  public var valueDuration: Duration? = null,
) {
  public fun toModel(): DataRequirement.DateFilter =
    DataRequirement.DateFilter(
      id = this@DataRequirementDateFilterSurrogate.id,
      extension = this@DataRequirementDateFilterSurrogate.extension ?: mutableListOf(),
      path =
        R5String.of(
          this@DataRequirementDateFilterSurrogate.path,
          this@DataRequirementDateFilterSurrogate._path,
        ),
      searchParam =
        R5String.of(
          this@DataRequirementDateFilterSurrogate.searchParam,
          this@DataRequirementDateFilterSurrogate._searchParam,
        ),
      `value` =
        DataRequirement.DateFilter.Value?.from(
          DateTime.of(
            FhirDateTime.fromString(this@DataRequirementDateFilterSurrogate.valueDateTime),
            this@DataRequirementDateFilterSurrogate._valueDateTime,
          ),
          this@DataRequirementDateFilterSurrogate.valuePeriod,
          this@DataRequirementDateFilterSurrogate.valueDuration,
        ),
    )

  public companion object {
    public fun fromModel(model: DataRequirement.DateFilter): DataRequirementDateFilterSurrogate =
      with(model) {
        DataRequirementDateFilterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          searchParam = this@with.searchParam?.value,
          _searchParam = this@with.searchParam?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
          valuePeriod = this@with.`value`?.asPeriod()?.value,
          valueDuration = this@with.`value`?.asDuration()?.value,
        )
      }
  }
}

@Serializable
internal data class DataRequirementValueFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var searchParam: KotlinString? = null,
  public var _searchParam: Element? = null,
  public var comparator: KotlinString? = null,
  public var _comparator: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valuePeriod: Period? = null,
  public var valueDuration: Duration? = null,
) {
  public fun toModel(): DataRequirement.ValueFilter =
    DataRequirement.ValueFilter(
      id = this@DataRequirementValueFilterSurrogate.id,
      extension = this@DataRequirementValueFilterSurrogate.extension ?: mutableListOf(),
      path =
        R5String.of(
          this@DataRequirementValueFilterSurrogate.path,
          this@DataRequirementValueFilterSurrogate._path,
        ),
      searchParam =
        R5String.of(
          this@DataRequirementValueFilterSurrogate.searchParam,
          this@DataRequirementValueFilterSurrogate._searchParam,
        ),
      comparator =
        this@DataRequirementValueFilterSurrogate.comparator?.let {
          Enumeration.of(
            com.google.fhir.model.r5.DataRequirement.ValueFilterComparator.fromCode(it!!),
            this@DataRequirementValueFilterSurrogate._comparator,
          )
        },
      `value` =
        DataRequirement.ValueFilter.Value?.from(
          DateTime.of(
            FhirDateTime.fromString(this@DataRequirementValueFilterSurrogate.valueDateTime),
            this@DataRequirementValueFilterSurrogate._valueDateTime,
          ),
          this@DataRequirementValueFilterSurrogate.valuePeriod,
          this@DataRequirementValueFilterSurrogate.valueDuration,
        ),
    )

  public companion object {
    public fun fromModel(model: DataRequirement.ValueFilter): DataRequirementValueFilterSurrogate =
      with(model) {
        DataRequirementValueFilterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          searchParam = this@with.searchParam?.value,
          _searchParam = this@with.searchParam?.toElement(),
          comparator = this@with.comparator?.value?.getCode(),
          _comparator = this@with.comparator?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
          valuePeriod = this@with.`value`?.asPeriod()?.value,
          valueDuration = this@with.`value`?.asDuration()?.value,
        )
      }
  }
}

@Serializable
internal data class DataRequirementSortSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var direction: KotlinString? = null,
  public var _direction: Element? = null,
) {
  public fun toModel(): DataRequirement.Sort =
    DataRequirement.Sort(
      id = this@DataRequirementSortSurrogate.id,
      extension = this@DataRequirementSortSurrogate.extension ?: mutableListOf(),
      path =
        R5String.of(
          this@DataRequirementSortSurrogate.path,
          this@DataRequirementSortSurrogate._path,
        )!!,
      direction =
        Enumeration.of(
          com.google.fhir.model.r5.DataRequirement.SortDirection.fromCode(
            this@DataRequirementSortSurrogate.direction!!
          ),
          this@DataRequirementSortSurrogate._direction,
        ),
    )

  public companion object {
    public fun fromModel(model: DataRequirement.Sort): DataRequirementSortSurrogate =
      with(model) {
        DataRequirementSortSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          path = this@with.path.value,
          _path = this@with.path.toElement(),
          direction = this@with.direction.value?.getCode(),
          _direction = this@with.direction.toElement(),
        )
      }
  }
}

@Serializable
internal data class DataRequirementSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: MutableList<KotlinString?>? = null,
  public var _profile: MutableList<Element?>? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var mustSupport: MutableList<KotlinString?>? = null,
  public var _mustSupport: MutableList<Element?>? = null,
  public var codeFilter: MutableList<DataRequirement.CodeFilter>? = null,
  public var dateFilter: MutableList<DataRequirement.DateFilter>? = null,
  public var valueFilter: MutableList<DataRequirement.ValueFilter>? = null,
  public var limit: Int? = null,
  public var _limit: Element? = null,
  public var sort: MutableList<DataRequirement.Sort>? = null,
) {
  public fun toModel(): DataRequirement =
    DataRequirement(
      id = this@DataRequirementSurrogate.id,
      extension = this@DataRequirementSurrogate.extension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.FHIRTypes.fromCode(this@DataRequirementSurrogate.type!!),
          this@DataRequirementSurrogate._type,
        ),
      profile =
        if (
          this@DataRequirementSurrogate.profile == null &&
            this@DataRequirementSurrogate._profile == null
        ) {
          mutableListOf()
        } else {
          (this@DataRequirementSurrogate.profile
              ?: List(this@DataRequirementSurrogate._profile!!.size) { null })
            .zip(
              this@DataRequirementSurrogate._profile
                ?: List(this@DataRequirementSurrogate.profile!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      subject =
        DataRequirement.Subject?.from(
          this@DataRequirementSurrogate.subjectCodeableConcept,
          this@DataRequirementSurrogate.subjectReference,
        ),
      mustSupport =
        if (
          this@DataRequirementSurrogate.mustSupport == null &&
            this@DataRequirementSurrogate._mustSupport == null
        ) {
          mutableListOf()
        } else {
          (this@DataRequirementSurrogate.mustSupport
              ?: List(this@DataRequirementSurrogate._mustSupport!!.size) { null })
            .zip(
              this@DataRequirementSurrogate._mustSupport
                ?: List(this@DataRequirementSurrogate.mustSupport!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      codeFilter = this@DataRequirementSurrogate.codeFilter ?: mutableListOf(),
      dateFilter = this@DataRequirementSurrogate.dateFilter ?: mutableListOf(),
      valueFilter = this@DataRequirementSurrogate.valueFilter ?: mutableListOf(),
      limit =
        PositiveInt.of(this@DataRequirementSurrogate.limit, this@DataRequirementSurrogate._limit),
      sort = this@DataRequirementSurrogate.sort ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DataRequirement): DataRequirementSurrogate =
      with(model) {
        DataRequirementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          profile =
            this@with.profile.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _profile =
            this@with.profile
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value,
          subjectReference = this@with.subject?.asReference()?.value,
          mustSupport =
            this@with.mustSupport
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _mustSupport =
            this@with.mustSupport
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          codeFilter = this@with.codeFilter.takeUnless { it.all { it == null } },
          dateFilter = this@with.dateFilter.takeUnless { it.all { it == null } },
          valueFilter = this@with.valueFilter.takeUnless { it.all { it == null } },
          limit = this@with.limit?.value,
          _limit = this@with.limit?.toElement(),
          sort = this@with.sort.takeUnless { it.all { it == null } },
        )
      }
  }
}
