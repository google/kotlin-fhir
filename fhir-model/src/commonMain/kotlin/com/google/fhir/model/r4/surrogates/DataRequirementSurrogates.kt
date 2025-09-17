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

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import com.google.fhir.model.r4.terminologies.FHIRAllTypes
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
        R4String.of(
          this@DataRequirementCodeFilterSurrogate.path,
          this@DataRequirementCodeFilterSurrogate._path,
        ),
      searchParam =
        R4String.of(
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
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          searchParam = this@with.searchParam?.value,
          _searchParam = this@with.searchParam?.toElement(),
          valueSet = this@with.valueSet?.value,
          _valueSet = this@with.valueSet?.toElement(),
          code = this@with.code.takeIf { it.isNotEmpty() },
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
  public var `value`: DataRequirement.DateFilter.Value? = null,
) {
  public fun toModel(): DataRequirement.DateFilter =
    DataRequirement.DateFilter(
      id = this@DataRequirementDateFilterSurrogate.id,
      extension = this@DataRequirementDateFilterSurrogate.extension ?: mutableListOf(),
      path =
        R4String.of(
          this@DataRequirementDateFilterSurrogate.path,
          this@DataRequirementDateFilterSurrogate._path,
        ),
      searchParam =
        R4String.of(
          this@DataRequirementDateFilterSurrogate.searchParam,
          this@DataRequirementDateFilterSurrogate._searchParam,
        ),
      `value` = this@DataRequirementDateFilterSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: DataRequirement.DateFilter): DataRequirementDateFilterSurrogate =
      with(model) {
        DataRequirementDateFilterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          path = this@with.path?.value,
          _path = this@with.path?.toElement(),
          searchParam = this@with.searchParam?.value,
          _searchParam = this@with.searchParam?.toElement(),
          `value` = this@with.`value`,
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
        R4String.of(
          this@DataRequirementSortSurrogate.path,
          this@DataRequirementSortSurrogate._path,
        )!!,
      direction =
        Enumeration.of(
          DataRequirement.SortDirection.fromCode(this@DataRequirementSortSurrogate.direction!!),
          this@DataRequirementSortSurrogate._direction,
        ),
    )

  public companion object {
    public fun fromModel(model: DataRequirement.Sort): DataRequirementSortSurrogate =
      with(model) {
        DataRequirementSortSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          path = this@with.path.value,
          _path = this@with.path.toElement(),
          direction = this@with.direction.value?.getCode(),
          _direction = this@with.direction.toElement(),
        )
      }
  }
}

@Serializable
internal data class DataRequirementSubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
) {
  public fun toModel(): DataRequirement.Subject =
    DataRequirement.Subject.from(
      this@DataRequirementSubjectSurrogate.subjectCodeableConcept,
      this@DataRequirementSubjectSurrogate.subjectReference,
    )!!

  public companion object {
    public fun fromModel(model: DataRequirement.Subject): DataRequirementSubjectSurrogate =
      with(model) {
        DataRequirementSubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class DataRequirementDateFilterValueSurrogate(
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valuePeriod: Period? = null,
  public var valueDuration: Duration? = null,
) {
  public fun toModel(): DataRequirement.DateFilter.Value =
    DataRequirement.DateFilter.Value.from(
      DateTime.of(
        FhirDateTime.fromString(this@DataRequirementDateFilterValueSurrogate.valueDateTime),
        this@DataRequirementDateFilterValueSurrogate._valueDateTime,
      ),
      this@DataRequirementDateFilterValueSurrogate.valuePeriod,
      this@DataRequirementDateFilterValueSurrogate.valueDuration,
    )!!

  public companion object {
    public fun fromModel(
      model: DataRequirement.DateFilter.Value
    ): DataRequirementDateFilterValueSurrogate =
      with(model) {
        DataRequirementDateFilterValueSurrogate(
          valueDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.asDateTime()?.value?.toElement(),
          valuePeriod = this@with.asPeriod()?.value,
          valueDuration = this@with.asDuration()?.value,
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
  public var subject: DataRequirement.Subject? = null,
  public var mustSupport: MutableList<KotlinString?>? = null,
  public var _mustSupport: MutableList<Element?>? = null,
  public var codeFilter: MutableList<DataRequirement.CodeFilter>? = null,
  public var dateFilter: MutableList<DataRequirement.DateFilter>? = null,
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
          FHIRAllTypes.fromCode(this@DataRequirementSurrogate.type!!),
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
      subject = this@DataRequirementSurrogate.subject,
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
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      codeFilter = this@DataRequirementSurrogate.codeFilter ?: mutableListOf(),
      dateFilter = this@DataRequirementSurrogate.dateFilter ?: mutableListOf(),
      limit =
        PositiveInt.of(this@DataRequirementSurrogate.limit, this@DataRequirementSurrogate._limit),
      sort = this@DataRequirementSurrogate.sort ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DataRequirement): DataRequirementSurrogate =
      with(model) {
        DataRequirementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
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
          subject = this@with.subject,
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
          codeFilter = this@with.codeFilter.takeIf { it.isNotEmpty() },
          dateFilter = this@with.dateFilter.takeIf { it.isNotEmpty() },
          limit = this@with.limit?.value,
          _limit = this@with.limit?.toElement(),
          sort = this@with.sort.takeIf { it.isNotEmpty() },
        )
      }
  }
}
