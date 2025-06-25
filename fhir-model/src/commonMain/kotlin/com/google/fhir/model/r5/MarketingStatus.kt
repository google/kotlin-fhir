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

import com.google.fhir.model.r5.serializers.MarketingStatusSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * MarketingStatus Type: The marketing status describes the date when a medicinal product is
 * actually put on the market or the date as of which it is no longer available.
 */
@Serializable(with = MarketingStatusSerializer::class)
public data class MarketingStatus(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: String? = null,
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
   * May be used to represent additional information that is not part of the basic definition of the
   * element and that modifies the understanding of the element in which it is contained and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and managable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met as part of the definition
   * of the extension. Applications processing a resource are required to check for modifier
   * extensions.
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
   * The country in which the marketing authorization has been granted shall be specified It should
   * be specified using the ISO 3166 ‑ 1 alpha-2 code elements.
   */
  public var country: CodeableConcept? = null,
  /**
   * Where a Medicines Regulatory Agency has granted a marketing authorization for which specific
   * provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate
   * controlled terminology The controlled term and the controlled term identifier shall be
   * specified.
   */
  public var jurisdiction: CodeableConcept? = null,
  /**
   * This attribute provides information on the status of the marketing of the medicinal product See
   * ISO/TS 20443 for more information and examples.
   */
  public var status: CodeableConcept? = null,
  /**
   * The date when the Medicinal Product is placed on the market by the Marketing Authorization
   * Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction
   * shall be provided A complete date consisting of day, month and year shall be specified using
   * the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal
   * Product into the distribution chain.
   */
  public var dateRange: Period? = null,
  /**
   * The date when the Medicinal Product is placed on the market by the Marketing Authorization
   * Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction
   * shall be provided A complete date consisting of day, month and year shall be specified using
   * the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal
   * Product into the distribution chain.
   */
  public var restoreDate: DateTime? = null,
) : BackboneType()
