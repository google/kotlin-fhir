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

import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DeviceMetric
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Instant
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
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
            DeviceMetric.DeviceMetricCalibrationType.fromCode(it),
            this@DeviceMetricCalibrationSurrogate._type,
          )
        },
      state =
        this@DeviceMetricCalibrationSurrogate.state?.let {
          Enumeration.of(
            DeviceMetric.DeviceMetricCalibrationState.fromCode(it),
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
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
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
            DeviceMetric.DeviceMetricOperationalStatus.fromCode(it),
            this@DeviceMetricSurrogate._operationalStatus,
          )
        },
      color =
        this@DeviceMetricSurrogate.color?.let {
          Enumeration.of(
            DeviceMetric.DeviceMetricColor.fromCode(it),
            this@DeviceMetricSurrogate._color,
          )
        },
      category =
        Enumeration.of(
          DeviceMetric.DeviceMetricCategory.fromCode(this@DeviceMetricSurrogate.category!!),
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
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
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
          calibration = this@with.calibration.takeIf { it.isNotEmpty() },
        )
      }
  }
}
