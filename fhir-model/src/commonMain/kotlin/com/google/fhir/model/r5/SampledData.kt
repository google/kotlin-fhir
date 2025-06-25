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

import com.google.fhir.model.r5.serializers.SampledDataSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * SampledData Type: A series of measurements taken by a device, with upper and lower limits. There
 * may be more than one dimension in the data.
 */
@Serializable(with = SampledDataSerializer::class)
public data class SampledData(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
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
  override var extension: List<Extension?>? = null,
  /**
   * The base quantity that a measured value of zero represents. In addition, this provides the
   * units of the entire measurement series.
   */
  public var origin: Quantity? = null,
  /**
   * Amount of intervalUnits between samples, e.g. milliseconds for time-based sampling.
   *
   * This is usually a whole number.
   */
  public var interval: Decimal? = null,
  /** The measurement unit in which the sample interval is expressed. */
  public var intervalUnit: Code? = null,
  /**
   * A correction factor that is applied to the sampled data points before they are added to the
   * origin.
   */
  public var factor: Decimal? = null,
  /**
   * The lower limit of detection of the measured points. This is needed if any of the data points
   * have the value "L" (lower than detection limit).
   */
  public var lowerLimit: Decimal? = null,
  /**
   * The upper limit of detection of the measured points. This is needed if any of the data points
   * have the value "U" (higher than detection limit).
   */
  public var upperLimit: Decimal? = null,
  /**
   * The number of sample points at each time point. If this value is greater than one, then the
   * dimensions will be interlaced - all the sample points for a point in time will be recorded at
   * once.
   *
   * If there is more than one dimension, the code for the type of data will define the meaning of
   * the dimensions (typically ECG data).
   */
  public var dimensions: PositiveInt? = null,
  /**
   * Reference to ConceptMap that defines the codes used in the data.
   *
   * The ConceptMap cannot define meanings for the codes 'E', 'U', or 'L' (nor 'e', 'u', or 'l').
   */
  public var codeMap: Canonical? = null,
  /**
   * A series of data points which are decimal values separated by a single space (character u20).
   * The units in which the offsets are expressed are found in intervalUnit. The absolute point at
   * which the measurements begin SHALL be conveyed outside the scope of this datatype, e.g.
   * Observation.effectiveDateTime for a timing offset.
   *
   * If offsets is present, the number of data points must be equal to the number of offsets
   * mlutipled by the dimensions.
   */
  public var offsets: String? = null,
  /**
   * A series of data points which are decimal values or codes separated by a single space
   * (character u20). The special codes "E" (error), "L" (below detection limit) and "U" (above
   * detection limit) are also defined for used in place of decimal values.
   *
   * The data may be missing if it is omitted for summarization purposes. In general, data is
   * required for any actual use of a SampledData.
   */
  public var `data`: String? = null,
) : DataType()
