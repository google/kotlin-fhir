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
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DataRequirement
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.GuidanceResponse
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class GuidanceResponseModuleSurrogate(
  public var moduleUri: String? = null,
  public var _moduleUri: Element? = null,
  public var moduleCanonical: String? = null,
  public var _moduleCanonical: Element? = null,
  public var moduleCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): GuidanceResponse.Module =
    GuidanceResponse.Module.from(
      Uri.of(
        this@GuidanceResponseModuleSurrogate.moduleUri,
        this@GuidanceResponseModuleSurrogate._moduleUri,
      ),
      Canonical.of(
        this@GuidanceResponseModuleSurrogate.moduleCanonical,
        this@GuidanceResponseModuleSurrogate._moduleCanonical,
      ),
      this@GuidanceResponseModuleSurrogate.moduleCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(model: GuidanceResponse.Module): GuidanceResponseModuleSurrogate =
      with(model) {
        GuidanceResponseModuleSurrogate(
          moduleUri = this@with.asUri()?.value?.value,
          _moduleUri = this@with.asUri()?.value?.toElement(),
          moduleCanonical = this@with.asCanonical()?.value?.value,
          _moduleCanonical = this@with.asCanonical()?.value?.toElement(),
          moduleCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class GuidanceResponseSurrogate(
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
  public var requestIdentifier: Identifier? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var performer: Reference? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var evaluationMessage: Reference? = null,
  public var outputParameters: Reference? = null,
  public var result: MutableList<Reference>? = null,
  public var dataRequirement: MutableList<DataRequirement>? = null,
  public var module: GuidanceResponse.Module,
) {
  public fun toModel(): GuidanceResponse =
    GuidanceResponse(
      id = this@GuidanceResponseSurrogate.id,
      meta = this@GuidanceResponseSurrogate.meta,
      implicitRules =
        Uri.of(
          this@GuidanceResponseSurrogate.implicitRules,
          this@GuidanceResponseSurrogate._implicitRules,
        ),
      language =
        Code.of(this@GuidanceResponseSurrogate.language, this@GuidanceResponseSurrogate._language),
      text = this@GuidanceResponseSurrogate.text,
      contained = this@GuidanceResponseSurrogate.contained ?: mutableListOf(),
      extension = this@GuidanceResponseSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GuidanceResponseSurrogate.modifierExtension ?: mutableListOf(),
      requestIdentifier = this@GuidanceResponseSurrogate.requestIdentifier,
      identifier = this@GuidanceResponseSurrogate.identifier ?: mutableListOf(),
      module = this@GuidanceResponseSurrogate.module,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.GuidanceResponse.GuidanceResponseStatus.fromCode(
            this@GuidanceResponseSurrogate.status!!
          ),
          this@GuidanceResponseSurrogate._status,
        ),
      subject = this@GuidanceResponseSurrogate.subject,
      encounter = this@GuidanceResponseSurrogate.encounter,
      occurrenceDateTime =
        DateTime.of(
          FhirDateTime.fromString(this@GuidanceResponseSurrogate.occurrenceDateTime),
          this@GuidanceResponseSurrogate._occurrenceDateTime,
        ),
      performer = this@GuidanceResponseSurrogate.performer,
      reason = this@GuidanceResponseSurrogate.reason ?: mutableListOf(),
      note = this@GuidanceResponseSurrogate.note ?: mutableListOf(),
      evaluationMessage = this@GuidanceResponseSurrogate.evaluationMessage,
      outputParameters = this@GuidanceResponseSurrogate.outputParameters,
      result = this@GuidanceResponseSurrogate.result ?: mutableListOf(),
      dataRequirement = this@GuidanceResponseSurrogate.dataRequirement ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: GuidanceResponse): GuidanceResponseSurrogate =
      with(model) {
        GuidanceResponseSurrogate(
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
          requestIdentifier = this@with.requestIdentifier,
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          module = this@with.module,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          occurrenceDateTime = this@with.occurrenceDateTime?.value?.toString(),
          _occurrenceDateTime = this@with.occurrenceDateTime?.toElement(),
          performer = this@with.performer,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          evaluationMessage = this@with.evaluationMessage,
          outputParameters = this@with.outputParameters,
          result = this@with.result.takeUnless { it.all { it == null } },
          dataRequirement = this@with.dataRequirement.takeUnless { it.all { it == null } },
        )
      }
  }
}
