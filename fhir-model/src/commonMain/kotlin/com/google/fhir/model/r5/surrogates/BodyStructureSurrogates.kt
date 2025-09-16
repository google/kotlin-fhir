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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class BodyStructureIncludedStructureSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var structure: CodeableConcept,
  public var laterality: CodeableConcept? = null,
  public var bodyLandmarkOrientation:
    MutableList<BodyStructure.IncludedStructure.BodyLandmarkOrientation>? =
    null,
  public var spatialReference: MutableList<Reference>? = null,
  public var qualifier: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): BodyStructure.IncludedStructure =
    BodyStructure.IncludedStructure(
      id = this@BodyStructureIncludedStructureSurrogate.id,
      extension = this@BodyStructureIncludedStructureSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@BodyStructureIncludedStructureSurrogate.modifierExtension ?: mutableListOf(),
      structure = this@BodyStructureIncludedStructureSurrogate.structure,
      laterality = this@BodyStructureIncludedStructureSurrogate.laterality,
      bodyLandmarkOrientation =
        this@BodyStructureIncludedStructureSurrogate.bodyLandmarkOrientation ?: mutableListOf(),
      spatialReference =
        this@BodyStructureIncludedStructureSurrogate.spatialReference ?: mutableListOf(),
      qualifier = this@BodyStructureIncludedStructureSurrogate.qualifier ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: BodyStructure.IncludedStructure
    ): BodyStructureIncludedStructureSurrogate =
      with(model) {
        BodyStructureIncludedStructureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          structure = this@with.structure,
          laterality = this@with.laterality,
          bodyLandmarkOrientation =
            this@with.bodyLandmarkOrientation.takeUnless { it.all { it == null } },
          spatialReference = this@with.spatialReference.takeUnless { it.all { it == null } },
          qualifier = this@with.qualifier.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var landmarkDescription: MutableList<CodeableConcept>? = null,
  public var clockFacePosition: MutableList<CodeableConcept>? = null,
  public var distanceFromLandmark:
    MutableList<BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark>? =
    null,
  public var surfaceOrientation: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): BodyStructure.IncludedStructure.BodyLandmarkOrientation =
    BodyStructure.IncludedStructure.BodyLandmarkOrientation(
      id = this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.id,
      extension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.modifierExtension
          ?: mutableListOf(),
      landmarkDescription =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.landmarkDescription
          ?: mutableListOf(),
      clockFacePosition =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.clockFacePosition
          ?: mutableListOf(),
      distanceFromLandmark =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.distanceFromLandmark
          ?: mutableListOf(),
      surfaceOrientation =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate.surfaceOrientation
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: BodyStructure.IncludedStructure.BodyLandmarkOrientation
    ): BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate =
      with(model) {
        BodyStructureIncludedStructureBodyLandmarkOrientationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          landmarkDescription = this@with.landmarkDescription.takeUnless { it.all { it == null } },
          clockFacePosition = this@with.clockFacePosition.takeUnless { it.all { it == null } },
          distanceFromLandmark =
            this@with.distanceFromLandmark.takeUnless { it.all { it == null } },
          surfaceOrientation = this@with.surfaceOrientation.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var device: MutableList<CodeableReference>? = null,
  public var `value`: MutableList<Quantity>? = null,
) {
  public fun toModel():
    BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark =
    BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark(
      id =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate.id,
      extension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .extension ?: mutableListOf(),
      modifierExtension =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .modifierExtension ?: mutableListOf(),
      device =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .device ?: mutableListOf(),
      `value` =
        this@BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate
          .`value` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark
    ): BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate =
      with(model) {
        BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmarkSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          device = this@with.device.takeUnless { it.all { it == null } },
          `value` = this@with.`value`.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var morphology: CodeableConcept? = null,
  public var includedStructure: MutableList<BodyStructure.IncludedStructure>? = null,
  public var excludedStructure: MutableList<BodyStructure.IncludedStructure>? = null,
  public var description: String? = null,
  public var _description: Element? = null,
  public var image: MutableList<Attachment>? = null,
  public var patient: Reference,
) {
  public fun toModel(): BodyStructure =
    BodyStructure(
      id = this@BodyStructureSurrogate.id,
      meta = this@BodyStructureSurrogate.meta,
      implicitRules =
        Uri.of(
          this@BodyStructureSurrogate.implicitRules,
          this@BodyStructureSurrogate._implicitRules,
        ),
      language =
        Code.of(this@BodyStructureSurrogate.language, this@BodyStructureSurrogate._language),
      text = this@BodyStructureSurrogate.text,
      contained = this@BodyStructureSurrogate.contained ?: mutableListOf(),
      extension = this@BodyStructureSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@BodyStructureSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@BodyStructureSurrogate.identifier ?: mutableListOf(),
      active =
        R5Boolean.of(this@BodyStructureSurrogate.active, this@BodyStructureSurrogate._active),
      morphology = this@BodyStructureSurrogate.morphology,
      includedStructure = this@BodyStructureSurrogate.includedStructure ?: mutableListOf(),
      excludedStructure = this@BodyStructureSurrogate.excludedStructure ?: mutableListOf(),
      description =
        Markdown.of(
          this@BodyStructureSurrogate.description,
          this@BodyStructureSurrogate._description,
        ),
      image = this@BodyStructureSurrogate.image ?: mutableListOf(),
      patient = this@BodyStructureSurrogate.patient,
    )

  public companion object {
    public fun fromModel(model: BodyStructure): BodyStructureSurrogate =
      with(model) {
        BodyStructureSurrogate(
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
          active = this@with.active?.value,
          _active = this@with.active?.toElement(),
          morphology = this@with.morphology,
          includedStructure = this@with.includedStructure.takeUnless { it.all { it == null } },
          excludedStructure = this@with.excludedStructure.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          image = this@with.image.takeUnless { it.all { it == null } },
          patient = this@with.patient,
        )
      }
  }
}
