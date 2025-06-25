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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DeviceAssociation
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceAssociationOperationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var status: CodeableConcept? = null,
  public var `operator`: List<Reference?>? = null,
  public var period: Period? = null,
) {
  public fun toModel(): DeviceAssociation.Operation =
    DeviceAssociation.Operation().apply {
      id = this@DeviceAssociationOperationSurrogate.id
      extension = this@DeviceAssociationOperationSurrogate.extension
      modifierExtension = this@DeviceAssociationOperationSurrogate.modifierExtension
      status = this@DeviceAssociationOperationSurrogate.status
      `operator` = this@DeviceAssociationOperationSurrogate.`operator`
      period = this@DeviceAssociationOperationSurrogate.period
    }

  public companion object {
    public fun fromModel(model: DeviceAssociation.Operation): DeviceAssociationOperationSurrogate =
      with(model) {
        DeviceAssociationOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          status = this@with.status
          `operator` = this@with.`operator`
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class DeviceAssociationSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var device: Reference? = null,
  public var category: List<CodeableConcept?>? = null,
  public var status: CodeableConcept? = null,
  public var statusReason: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var bodyStructure: Reference? = null,
  public var period: Period? = null,
  public var operation: List<DeviceAssociation.Operation>? = null,
) {
  public fun toModel(): DeviceAssociation =
    DeviceAssociation().apply {
      id = this@DeviceAssociationSurrogate.id
      meta = this@DeviceAssociationSurrogate.meta
      implicitRules =
        Uri.of(
          this@DeviceAssociationSurrogate.implicitRules,
          this@DeviceAssociationSurrogate._implicitRules,
        )
      language =
        Code.of(this@DeviceAssociationSurrogate.language, this@DeviceAssociationSurrogate._language)
      text = this@DeviceAssociationSurrogate.text
      contained = this@DeviceAssociationSurrogate.contained
      extension = this@DeviceAssociationSurrogate.extension
      modifierExtension = this@DeviceAssociationSurrogate.modifierExtension
      identifier = this@DeviceAssociationSurrogate.identifier
      device = this@DeviceAssociationSurrogate.device
      category = this@DeviceAssociationSurrogate.category
      status = this@DeviceAssociationSurrogate.status
      statusReason = this@DeviceAssociationSurrogate.statusReason
      subject = this@DeviceAssociationSurrogate.subject
      bodyStructure = this@DeviceAssociationSurrogate.bodyStructure
      period = this@DeviceAssociationSurrogate.period
      operation = this@DeviceAssociationSurrogate.operation
    }

  public companion object {
    public fun fromModel(model: DeviceAssociation): DeviceAssociationSurrogate =
      with(model) {
        DeviceAssociationSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          device = this@with.device
          category = this@with.category
          status = this@with.status
          statusReason = this@with.statusReason
          subject = this@with.subject
          bodyStructure = this@with.bodyStructure
          period = this@with.period
          operation = this@with.operation
        }
      }
  }
}
