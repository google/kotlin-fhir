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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DeviceMetric
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceMetricCalibrationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: String? = null,
  public var _type: Element? = null,
  public var state: String? = null,
  public var _state: Element? = null,
  public var time: String? = null,
  public var _time: Element? = null,
) {
  public fun toModel(): DeviceMetric.Calibration =
    DeviceMetric.Calibration(
      id = this@DeviceMetricCalibrationSurrogate.id,
      extension = this@DeviceMetricCalibrationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceMetricCalibrationSurrogate.modifierExtension ?: mutableListOf(),
      type =
        this@DeviceMetricCalibrationSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r4.DeviceMetric.DeviceMetricCalibrationType.fromCode(it!!),
            this@DeviceMetricCalibrationSurrogate._type,
          )
        },
      state =
        this@DeviceMetricCalibrationSurrogate.state?.let {
          Enumeration.of(
            com.google.fhir.model.r4.DeviceMetric.DeviceMetricCalibrationState.fromCode(it!!),
            this@DeviceMetricCalibrationSurrogate._state,
          )
        },
      time =
        Instant.of(
          FhirDateTime.fromString(this@DeviceMetricCalibrationSurrogate.time),
          this@DeviceMetricCalibrationSurrogate._time,
        ),
    )

  public companion object {
    public fun fromModel(model: DeviceMetric.Calibration): DeviceMetricCalibrationSurrogate =
      with(model) {
        DeviceMetricCalibrationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          state = this@with.state?.value?.getCode(),
          _state = this@with.state?.toElement(),
          time = this@with.time?.value?.toString(),
          _time = this@with.time?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceMetricSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept,
  public var unit: CodeableConcept? = null,
  public var source: Reference? = null,
  public var parent: Reference? = null,
  public var operationalStatus: String? = null,
  public var _operationalStatus: Element? = null,
  public var color: String? = null,
  public var _color: Element? = null,
  public var category: String? = null,
  public var _category: Element? = null,
  public var measurementPeriod: Timing? = null,
  public var calibration: MutableList<DeviceMetric.Calibration>? = null,
) {
  public fun toModel(): DeviceMetric =
    DeviceMetric(
      id = this@DeviceMetricSurrogate.id,
      meta = this@DeviceMetricSurrogate.meta,
      implicitRules =
        Uri.of(this@DeviceMetricSurrogate.implicitRules, this@DeviceMetricSurrogate._implicitRules),
      language = Code.of(this@DeviceMetricSurrogate.language, this@DeviceMetricSurrogate._language),
      text = this@DeviceMetricSurrogate.text,
      contained = this@DeviceMetricSurrogate.contained ?: mutableListOf(),
      extension = this@DeviceMetricSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceMetricSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DeviceMetricSurrogate.identifier ?: mutableListOf(),
      type = this@DeviceMetricSurrogate.type,
      unit = this@DeviceMetricSurrogate.unit,
      source = this@DeviceMetricSurrogate.source,
      parent = this@DeviceMetricSurrogate.parent,
      operationalStatus =
        this@DeviceMetricSurrogate.operationalStatus?.let {
          Enumeration.of(
            com.google.fhir.model.r4.DeviceMetric.DeviceMetricOperationalStatus.fromCode(it!!),
            this@DeviceMetricSurrogate._operationalStatus,
          )
        },
      color =
        this@DeviceMetricSurrogate.color?.let {
          Enumeration.of(
            com.google.fhir.model.r4.DeviceMetric.DeviceMetricColor.fromCode(it!!),
            this@DeviceMetricSurrogate._color,
          )
        },
      category =
        Enumeration.of(
          com.google.fhir.model.r4.DeviceMetric.DeviceMetricCategory.fromCode(
            this@DeviceMetricSurrogate.category!!
          ),
          this@DeviceMetricSurrogate._category,
        ),
      measurementPeriod = this@DeviceMetricSurrogate.measurementPeriod,
      calibration = this@DeviceMetricSurrogate.calibration ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceMetric): DeviceMetricSurrogate =
      with(model) {
        DeviceMetricSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          type = this@with.type,
          unit = this@with.unit,
          source = this@with.source,
          parent = this@with.parent,
          operationalStatus = this@with.operationalStatus?.value?.getCode(),
          _operationalStatus = this@with.operationalStatus?.toElement(),
          color = this@with.color?.value?.getCode(),
          _color = this@with.color?.toElement(),
          category = this@with.category.value?.getCode(),
          _category = this@with.category.toElement(),
          measurementPeriod = this@with.measurementPeriod,
          calibration = this@with.calibration.takeUnless { it.all { it == null } },
        )
      }
  }
}
