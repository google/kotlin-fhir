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

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.DataRequirement
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Duration
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DataRequirementCodeFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var searchParam: KotlinString? = null,
  public var _searchParam: Element? = null,
  public var valueSet: KotlinString? = null,
  public var _valueSet: Element? = null,
  public var code: List<Coding?>? = null,
) {
  public fun toModel(): DataRequirement.CodeFilter =
    DataRequirement.CodeFilter().apply {
      id = this@DataRequirementCodeFilterSurrogate.id
      extension = this@DataRequirementCodeFilterSurrogate.extension
      path =
        R4bString.of(
          this@DataRequirementCodeFilterSurrogate.path,
          this@DataRequirementCodeFilterSurrogate._path,
        )
      searchParam =
        R4bString.of(
          this@DataRequirementCodeFilterSurrogate.searchParam,
          this@DataRequirementCodeFilterSurrogate._searchParam,
        )
      valueSet =
        Canonical.of(
          this@DataRequirementCodeFilterSurrogate.valueSet,
          this@DataRequirementCodeFilterSurrogate._valueSet,
        )
      code = this@DataRequirementCodeFilterSurrogate.code
    }

  public companion object {
    public fun fromModel(model: DataRequirement.CodeFilter): DataRequirementCodeFilterSurrogate =
      with(model) {
        DataRequirementCodeFilterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          searchParam = this@with.searchParam?.value
          _searchParam = this@with.searchParam?.toElement()
          valueSet = this@with.valueSet?.value
          _valueSet = this@with.valueSet?.toElement()
          code = this@with.code
        }
      }
  }
}

@Serializable
internal data class DataRequirementDateFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
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
    DataRequirement.DateFilter().apply {
      id = this@DataRequirementDateFilterSurrogate.id
      extension = this@DataRequirementDateFilterSurrogate.extension
      path =
        R4bString.of(
          this@DataRequirementDateFilterSurrogate.path,
          this@DataRequirementDateFilterSurrogate._path,
        )
      searchParam =
        R4bString.of(
          this@DataRequirementDateFilterSurrogate.searchParam,
          this@DataRequirementDateFilterSurrogate._searchParam,
        )
      `value` =
        DataRequirement.DateFilter.Value?.from(
          DateTime.of(
            FhirDateTime.fromString(this@DataRequirementDateFilterSurrogate.valueDateTime),
            this@DataRequirementDateFilterSurrogate._valueDateTime,
          ),
          this@DataRequirementDateFilterSurrogate.valuePeriod,
          this@DataRequirementDateFilterSurrogate.valueDuration,
        )
    }

  public companion object {
    public fun fromModel(model: DataRequirement.DateFilter): DataRequirementDateFilterSurrogate =
      with(model) {
        DataRequirementDateFilterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          searchParam = this@with.searchParam?.value
          _searchParam = this@with.searchParam?.toElement()
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement()
          valuePeriod = this@with.`value`?.asPeriod()?.value
          valueDuration = this@with.`value`?.asDuration()?.value
        }
      }
  }
}

@Serializable
internal data class DataRequirementSortSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var direction: KotlinString? = null,
  public var _direction: Element? = null,
) {
  public fun toModel(): DataRequirement.Sort =
    DataRequirement.Sort().apply {
      id = this@DataRequirementSortSurrogate.id
      extension = this@DataRequirementSortSurrogate.extension
      path =
        R4bString.of(
          this@DataRequirementSortSurrogate.path,
          this@DataRequirementSortSurrogate._path,
        )
      direction =
        Enumeration.of(
          this@DataRequirementSortSurrogate.direction?.let {
            com.google.fhir.model.r4b.DataRequirement.SortDirection.fromCode(it)
          },
          this@DataRequirementSortSurrogate._direction,
        )
    }

  public companion object {
    public fun fromModel(model: DataRequirement.Sort): DataRequirementSortSurrogate =
      with(model) {
        DataRequirementSortSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          direction = this@with.direction?.value?.getCode()
          _direction = this@with.direction?.toElement()
        }
      }
  }
}

@Serializable
internal data class DataRequirementSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: List<KotlinString?>? = null,
  public var _profile: List<Element?>? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var mustSupport: List<KotlinString?>? = null,
  public var _mustSupport: List<Element?>? = null,
  public var codeFilter: List<DataRequirement.CodeFilter>? = null,
  public var dateFilter: List<DataRequirement.DateFilter>? = null,
  public var limit: Int? = null,
  public var _limit: Element? = null,
  public var sort: List<DataRequirement.Sort>? = null,
) {
  public fun toModel(): DataRequirement =
    DataRequirement().apply {
      id = this@DataRequirementSurrogate.id
      extension = this@DataRequirementSurrogate.extension
      type =
        Enumeration.of(
          this@DataRequirementSurrogate.type?.let {
            com.google.fhir.model.r4b.FHIRAllTypes.fromCode(it)
          },
          this@DataRequirementSurrogate._type,
        )
      profile =
        if (
          this@DataRequirementSurrogate.profile == null &&
            this@DataRequirementSurrogate._profile == null
        ) {
          null
        } else {
          (this@DataRequirementSurrogate.profile
              ?: List(this@DataRequirementSurrogate._profile!!.size) { null })
            .zip(
              this@DataRequirementSurrogate._profile
                ?: List(this@DataRequirementSurrogate.profile!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      subject =
        DataRequirement.Subject?.from(
          this@DataRequirementSurrogate.subjectCodeableConcept,
          this@DataRequirementSurrogate.subjectReference,
        )
      mustSupport =
        if (
          this@DataRequirementSurrogate.mustSupport == null &&
            this@DataRequirementSurrogate._mustSupport == null
        ) {
          null
        } else {
          (this@DataRequirementSurrogate.mustSupport
              ?: List(this@DataRequirementSurrogate._mustSupport!!.size) { null })
            .zip(
              this@DataRequirementSurrogate._mustSupport
                ?: List(this@DataRequirementSurrogate.mustSupport!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      codeFilter = this@DataRequirementSurrogate.codeFilter
      dateFilter = this@DataRequirementSurrogate.dateFilter
      limit =
        PositiveInt.of(this@DataRequirementSurrogate.limit, this@DataRequirementSurrogate._limit)
      sort = this@DataRequirementSurrogate.sort
    }

  public companion object {
    public fun fromModel(model: DataRequirement): DataRequirementSurrogate =
      with(model) {
        DataRequirementSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          profile = this@with.profile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _profile =
            this@with.profile?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          mustSupport =
            this@with.mustSupport?.map { it?.value }?.takeUnless { it.all { it == null } }
          _mustSupport =
            this@with.mustSupport?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          codeFilter = this@with.codeFilter
          dateFilter = this@with.dateFilter
          limit = this@with.limit?.value
          _limit = this@with.limit?.toElement()
          sort = this@with.sort
        }
      }
  }
}
