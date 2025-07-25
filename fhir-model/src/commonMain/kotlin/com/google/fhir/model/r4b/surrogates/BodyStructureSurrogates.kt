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

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.BodyStructure
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var active: KotlinBoolean? = null,
  public var _active: Element? = null,
  public var morphology: CodeableConcept? = null,
  public var location: CodeableConcept? = null,
  public var locationQualifier: MutableList<CodeableConcept>? = null,
  public var description: KotlinString? = null,
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
        R4bBoolean.of(this@BodyStructureSurrogate.active, this@BodyStructureSurrogate._active),
      morphology = this@BodyStructureSurrogate.morphology,
      location = this@BodyStructureSurrogate.location,
      locationQualifier = this@BodyStructureSurrogate.locationQualifier ?: mutableListOf(),
      description =
        R4bString.of(
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
          location = this@with.location,
          locationQualifier = this@with.locationQualifier.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          image = this@with.image.takeUnless { it.all { it == null } },
          patient = this@with.patient,
        )
      }
  }
}
