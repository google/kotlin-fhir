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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DataRequirement
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.GuidanceResponse
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
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
    )!!

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
  public var contained: List<Resource>? = null,
  public var extension: List<Extension>? = null,
  public var modifierExtension: List<Extension>? = null,
  public var requestIdentifier: Identifier? = null,
  public var identifier: List<Identifier>? = null,
  public var module: GuidanceResponse.Module,
  public var status: String? = null,
  public var _status: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var performer: Reference? = null,
  public var reasonCode: List<CodeableConcept>? = null,
  public var reasonReference: List<Reference>? = null,
  public var note: List<Annotation>? = null,
  public var evaluationMessage: List<Reference>? = null,
  public var outputParameters: Reference? = null,
  public var result: Reference? = null,
  public var dataRequirement: List<DataRequirement>? = null,
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
      contained = this@GuidanceResponseSurrogate.contained ?: listOf(),
      extension = this@GuidanceResponseSurrogate.extension ?: listOf(),
      modifierExtension = this@GuidanceResponseSurrogate.modifierExtension ?: listOf(),
      requestIdentifier = this@GuidanceResponseSurrogate.requestIdentifier,
      identifier = this@GuidanceResponseSurrogate.identifier ?: listOf(),
      module = this@GuidanceResponseSurrogate.module,
      status =
        Enumeration.of(
          GuidanceResponse.GuidanceResponseStatus.fromCode(this@GuidanceResponseSurrogate.status!!),
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
      reasonCode = this@GuidanceResponseSurrogate.reasonCode ?: listOf(),
      reasonReference = this@GuidanceResponseSurrogate.reasonReference ?: listOf(),
      note = this@GuidanceResponseSurrogate.note ?: listOf(),
      evaluationMessage = this@GuidanceResponseSurrogate.evaluationMessage ?: listOf(),
      outputParameters = this@GuidanceResponseSurrogate.outputParameters,
      result = this@GuidanceResponseSurrogate.result,
      dataRequirement = this@GuidanceResponseSurrogate.dataRequirement ?: listOf(),
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
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          requestIdentifier = this@with.requestIdentifier,
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          module = this@with.module,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          occurrenceDateTime = this@with.occurrenceDateTime?.value?.toString(),
          _occurrenceDateTime = this@with.occurrenceDateTime?.toElement(),
          performer = this@with.performer,
          reasonCode = this@with.reasonCode.takeIf { it.isNotEmpty() },
          reasonReference = this@with.reasonReference.takeIf { it.isNotEmpty() },
          note = this@with.note.takeIf { it.isNotEmpty() },
          evaluationMessage = this@with.evaluationMessage.takeIf { it.isNotEmpty() },
          outputParameters = this@with.outputParameters,
          result = this@with.result,
          dataRequirement = this@with.dataRequirement.takeIf { it.isNotEmpty() },
        )
      }
  }
}
