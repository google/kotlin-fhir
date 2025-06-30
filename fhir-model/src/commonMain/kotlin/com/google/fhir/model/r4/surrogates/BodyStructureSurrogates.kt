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

import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.BodyStructure
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class BodyStructureSurrogate(
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
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var morphology: CodeableConcept? = null,
  public var location: CodeableConcept? = null,
  public var locationQualifier: List<CodeableConcept?>? = null,
  public var description: KotlinString? = null,
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
      active = R4Boolean.of(this@BodyStructureSurrogate.active, this@BodyStructureSurrogate._active)
      morphology = this@BodyStructureSurrogate.morphology
      location = this@BodyStructureSurrogate.location
      locationQualifier = this@BodyStructureSurrogate.locationQualifier
      description =
        R4String.of(
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
          location = this@with.location
          locationQualifier = this@with.locationQualifier
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          image = this@with.image
          patient = this@with.patient
        }
      }
  }
}
