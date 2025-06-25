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

import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.BodyStructure
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var device: List<CodeableReference?>? = null,
  public var `value`: List<Quantity?>? = null,
) {
  public fun toModel():
    BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark =
    BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark().apply {
      id =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate.id
      extension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .extension
      modifierExtension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .modifierExtension
      device =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .device
      `value` =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .`value`
    }

  public companion object {
    public fun fromModel(
      model: BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark
    ): BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate =
      with(model) {
        BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          device = this@with.device
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var landmarkDescription: List<CodeableConcept?>? = null,
  public var clockFacePosition: List<CodeableConcept?>? = null,
  public var distanceFromLandmark:
    List<BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark>? =
    null,
  public var surfaceOrientation: List<CodeableConcept?>? = null,
) {
  public fun toModel(): BodyStructure.IncludedStructure.BodyLandmarkOrientation =
    BodyStructure.IncludedStructure.BodyLandmarkOrientation().apply {
      id = this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.id
      extension = this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.extension
      modifierExtension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.modifierExtension
      landmarkDescription =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.landmarkDescription
      clockFacePosition =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.clockFacePosition
      distanceFromLandmark =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.distanceFromLandmark
      surfaceOrientation =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.surfaceOrientation
    }

  public companion object {
    public fun fromModel(
      model: BodyStructure.IncludedStructure.BodyLandmarkOrientation
    ): BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate =
      with(model) {
        BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          landmarkDescription = this@with.landmarkDescription
          clockFacePosition = this@with.clockFacePosition
          distanceFromLandmark = this@with.distanceFromLandmark
          surfaceOrientation = this@with.surfaceOrientation
        }
      }
  }
}

@Serializable
internal data class BodyStructureIncludedStructureSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var structure: CodeableConcept? = null,
  public var laterality: CodeableConcept? = null,
  public var bodyLandmarkOrientation:
    List<BodyStructure.IncludedStructure.BodyLandmarkOrientation>? =
    null,
  public var spatialReference: List<Reference?>? = null,
  public var qualifier: List<CodeableConcept?>? = null,
) {
  public fun toModel(): BodyStructure.IncludedStructure =
    BodyStructure.IncludedStructure().apply {
      id = this@BodyStructureIncludedStructureSurrogate.id
      extension = this@BodyStructureIncludedStructureSurrogate.extension
      modifierExtension = this@BodyStructureIncludedStructureSurrogate.modifierExtension
      structure = this@BodyStructureIncludedStructureSurrogate.structure
      laterality = this@BodyStructureIncludedStructureSurrogate.laterality
      bodyLandmarkOrientation = this@BodyStructureIncludedStructureSurrogate.bodyLandmarkOrientation
      spatialReference = this@BodyStructureIncludedStructureSurrogate.spatialReference
      qualifier = this@BodyStructureIncludedStructureSurrogate.qualifier
    }

  public companion object {
    public fun fromModel(
      model: BodyStructure.IncludedStructure
    ): BodyStructureIncludedStructureSurrogate =
      with(model) {
        BodyStructureIncludedStructureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          structure = this@with.structure
          laterality = this@with.laterality
          bodyLandmarkOrientation = this@with.bodyLandmarkOrientation
          spatialReference = this@with.spatialReference
          qualifier = this@with.qualifier
        }
      }
  }
}

@Serializable
internal data class BodyStructureSurrogate(
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
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var morphology: CodeableConcept? = null,
  public var includedStructure: List<BodyStructure.IncludedStructure>? = null,
  public var excludedStructure: List<BodyStructure.IncludedStructure?>? = null,
  public var description: String? = null,
  public var _description: Element? = null,
  public var image: List<Attachment?>? = null,
  public var patient: Reference? = null,
) {
  public fun toModel(): BodyStructure =
    BodyStructure().apply {
      id = this@BodyStructureSurrogate.id
      meta = this@BodyStructureSurrogate.meta
      implicitRules =
        Uri.of(
          this@BodyStructureSurrogate.implicitRules,
          this@BodyStructureSurrogate._implicitRules,
        )
      language =
        Code.of(this@BodyStructureSurrogate.language, this@BodyStructureSurrogate._language)
      text = this@BodyStructureSurrogate.text
      contained = this@BodyStructureSurrogate.contained
      extension = this@BodyStructureSurrogate.extension
      modifierExtension = this@BodyStructureSurrogate.modifierExtension
      identifier = this@BodyStructureSurrogate.identifier
      active = R5Boolean.of(this@BodyStructureSurrogate.active, this@BodyStructureSurrogate._active)
      morphology = this@BodyStructureSurrogate.morphology
      includedStructure = this@BodyStructureSurrogate.includedStructure
      excludedStructure = this@BodyStructureSurrogate.excludedStructure
      description =
        Markdown.of(
          this@BodyStructureSurrogate.description,
          this@BodyStructureSurrogate._description,
        )
      image = this@BodyStructureSurrogate.image
      patient = this@BodyStructureSurrogate.patient
    }

  public companion object {
    public fun fromModel(model: BodyStructure): BodyStructureSurrogate =
      with(model) {
        BodyStructureSurrogate().apply {
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
          active = this@with.active?.value
          _active = this@with.active?.toElement()
          morphology = this@with.morphology
          includedStructure = this@with.includedStructure
          excludedStructure = this@with.excludedStructure
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          image = this@with.image
          patient = this@with.patient
        }
      }
  }
}
