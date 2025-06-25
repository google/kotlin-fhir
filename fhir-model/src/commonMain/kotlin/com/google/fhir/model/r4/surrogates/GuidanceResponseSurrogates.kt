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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.GuidanceResponse
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class GuidanceResponseSurrogate(
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
  public var requestIdentifier: Identifier? = null,
  public var identifier: List<Identifier?>? = null,
  public var moduleUri: String? = null,
  public var _moduleUri: Element? = null,
  public var moduleCanonical: String? = null,
  public var _moduleCanonical: Element? = null,
  public var moduleCodeableConcept: CodeableConcept? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var performer: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var evaluationMessage: List<Reference?>? = null,
  public var outputParameters: Reference? = null,
  public var result: Reference? = null,
  public var dataRequirement: List<DataRequirement?>? = null,
) {
  public fun toModel(): GuidanceResponse =
    GuidanceResponse().apply {
      id = this@GuidanceResponseSurrogate.id
      meta = this@GuidanceResponseSurrogate.meta
      implicitRules =
        Uri.of(
          this@GuidanceResponseSurrogate.implicitRules,
          this@GuidanceResponseSurrogate._implicitRules,
        )
      language =
        Code.of(this@GuidanceResponseSurrogate.language, this@GuidanceResponseSurrogate._language)
      text = this@GuidanceResponseSurrogate.text
      contained = this@GuidanceResponseSurrogate.contained
      extension = this@GuidanceResponseSurrogate.extension
      modifierExtension = this@GuidanceResponseSurrogate.modifierExtension
      requestIdentifier = this@GuidanceResponseSurrogate.requestIdentifier
      identifier = this@GuidanceResponseSurrogate.identifier
      module =
        GuidanceResponse.Module?.from(
          Uri.of(
            this@GuidanceResponseSurrogate.moduleUri,
            this@GuidanceResponseSurrogate._moduleUri,
          ),
          Canonical.of(
            this@GuidanceResponseSurrogate.moduleCanonical,
            this@GuidanceResponseSurrogate._moduleCanonical,
          ),
          this@GuidanceResponseSurrogate.moduleCodeableConcept,
        )
      status =
        Enumeration.of(
          this@GuidanceResponseSurrogate.status?.let {
            com.google.fhir.model.r4.GuidanceResponse.GuidanceResponseStatus.fromCode(it)
          },
          this@GuidanceResponseSurrogate._status,
        )
      subject = this@GuidanceResponseSurrogate.subject
      encounter = this@GuidanceResponseSurrogate.encounter
      occurrenceDateTime =
        DateTime.of(
          FhirDateTime.fromString(this@GuidanceResponseSurrogate.occurrenceDateTime),
          this@GuidanceResponseSurrogate._occurrenceDateTime,
        )
      performer = this@GuidanceResponseSurrogate.performer
      reasonCode = this@GuidanceResponseSurrogate.reasonCode
      reasonReference = this@GuidanceResponseSurrogate.reasonReference
      note = this@GuidanceResponseSurrogate.note
      evaluationMessage = this@GuidanceResponseSurrogate.evaluationMessage
      outputParameters = this@GuidanceResponseSurrogate.outputParameters
      result = this@GuidanceResponseSurrogate.result
      dataRequirement = this@GuidanceResponseSurrogate.dataRequirement
    }

  public companion object {
    public fun fromModel(model: GuidanceResponse): GuidanceResponseSurrogate =
      with(model) {
        GuidanceResponseSurrogate().apply {
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
          requestIdentifier = this@with.requestIdentifier
          identifier = this@with.identifier
          moduleUri = this@with.module?.asUri()?.value?.value
          _moduleUri = this@with.module?.asUri()?.value?.toElement()
          moduleCanonical = this@with.module?.asCanonical()?.value?.value
          _moduleCanonical = this@with.module?.asCanonical()?.value?.toElement()
          moduleCodeableConcept = this@with.module?.asCodeableConcept()?.value
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          subject = this@with.subject
          encounter = this@with.encounter
          occurrenceDateTime = this@with.occurrenceDateTime?.value?.toString()
          _occurrenceDateTime = this@with.occurrenceDateTime?.toElement()
          performer = this@with.performer
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          note = this@with.note
          evaluationMessage = this@with.evaluationMessage
          outputParameters = this@with.outputParameters
          result = this@with.result
          dataRequirement = this@with.dataRequirement
        }
      }
  }
}
