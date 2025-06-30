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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.BiologicallyDerivedProductDispense
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class BiologicallyDerivedProductDispensePerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): BiologicallyDerivedProductDispense.Performer =
    BiologicallyDerivedProductDispense.Performer().apply {
      id = this@BiologicallyDerivedProductDispensePerformerSurrogate.id
      extension = this@BiologicallyDerivedProductDispensePerformerSurrogate.extension
      modifierExtension =
        this@BiologicallyDerivedProductDispensePerformerSurrogate.modifierExtension
      function = this@BiologicallyDerivedProductDispensePerformerSurrogate.function
      actor = this@BiologicallyDerivedProductDispensePerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProductDispense.Performer
    ): BiologicallyDerivedProductDispensePerformerSurrogate =
      with(model) {
        BiologicallyDerivedProductDispensePerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class BiologicallyDerivedProductDispenseSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var originRelationshipType: CodeableConcept? = null,
  public var product: Reference? = null,
  public var patient: Reference? = null,
  public var matchStatus: CodeableConcept? = null,
  public var performer: List<BiologicallyDerivedProductDispense.Performer>? = null,
  public var location: Reference? = null,
  public var quantity: Quantity? = null,
  public var preparedDate: KotlinString? = null,
  public var _preparedDate: Element? = null,
  public var whenHandedOver: KotlinString? = null,
  public var _whenHandedOver: Element? = null,
  public var destination: Reference? = null,
  public var note: List<Annotation?>? = null,
  public var usageInstruction: KotlinString? = null,
  public var _usageInstruction: Element? = null,
) {
  public fun toModel(): BiologicallyDerivedProductDispense =
    BiologicallyDerivedProductDispense().apply {
      id = this@BiologicallyDerivedProductDispenseSurrogate.id
      meta = this@BiologicallyDerivedProductDispenseSurrogate.meta
      implicitRules =
        Uri.of(
          this@BiologicallyDerivedProductDispenseSurrogate.implicitRules,
          this@BiologicallyDerivedProductDispenseSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@BiologicallyDerivedProductDispenseSurrogate.language,
          this@BiologicallyDerivedProductDispenseSurrogate._language,
        )
      text = this@BiologicallyDerivedProductDispenseSurrogate.text
      contained = this@BiologicallyDerivedProductDispenseSurrogate.contained
      extension = this@BiologicallyDerivedProductDispenseSurrogate.extension
      modifierExtension = this@BiologicallyDerivedProductDispenseSurrogate.modifierExtension
      identifier = this@BiologicallyDerivedProductDispenseSurrogate.identifier
      basedOn = this@BiologicallyDerivedProductDispenseSurrogate.basedOn
      partOf = this@BiologicallyDerivedProductDispenseSurrogate.partOf
      status =
        Enumeration.of(
          this@BiologicallyDerivedProductDispenseSurrogate.status?.let {
            com.google.fhir.model.r5.BiologicallyDerivedProductDispense
              .BiologicallyDerivedProductDispenseStatus
              .fromCode(it)
          },
          this@BiologicallyDerivedProductDispenseSurrogate._status,
        )
      originRelationshipType =
        this@BiologicallyDerivedProductDispenseSurrogate.originRelationshipType
      product = this@BiologicallyDerivedProductDispenseSurrogate.product
      patient = this@BiologicallyDerivedProductDispenseSurrogate.patient
      matchStatus = this@BiologicallyDerivedProductDispenseSurrogate.matchStatus
      performer = this@BiologicallyDerivedProductDispenseSurrogate.performer
      location = this@BiologicallyDerivedProductDispenseSurrogate.location
      quantity = this@BiologicallyDerivedProductDispenseSurrogate.quantity
      preparedDate =
        DateTime.of(
          FhirDateTime.fromString(this@BiologicallyDerivedProductDispenseSurrogate.preparedDate),
          this@BiologicallyDerivedProductDispenseSurrogate._preparedDate,
        )
      whenHandedOver =
        DateTime.of(
          FhirDateTime.fromString(this@BiologicallyDerivedProductDispenseSurrogate.whenHandedOver),
          this@BiologicallyDerivedProductDispenseSurrogate._whenHandedOver,
        )
      destination = this@BiologicallyDerivedProductDispenseSurrogate.destination
      note = this@BiologicallyDerivedProductDispenseSurrogate.note
      usageInstruction =
        R5String.of(
          this@BiologicallyDerivedProductDispenseSurrogate.usageInstruction,
          this@BiologicallyDerivedProductDispenseSurrogate._usageInstruction,
        )
    }

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProductDispense
    ): BiologicallyDerivedProductDispenseSurrogate =
      with(model) {
        BiologicallyDerivedProductDispenseSurrogate().apply {
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
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          originRelationshipType = this@with.originRelationshipType
          product = this@with.product
          patient = this@with.patient
          matchStatus = this@with.matchStatus
          performer = this@with.performer
          location = this@with.location
          quantity = this@with.quantity
          preparedDate = this@with.preparedDate?.value?.toString()
          _preparedDate = this@with.preparedDate?.toElement()
          whenHandedOver = this@with.whenHandedOver?.value?.toString()
          _whenHandedOver = this@with.whenHandedOver?.toElement()
          destination = this@with.destination
          note = this@with.note
          usageInstruction = this@with.usageInstruction?.value
          _usageInstruction = this@with.usageInstruction?.toElement()
        }
      }
  }
}
