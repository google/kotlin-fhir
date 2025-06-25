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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.DocumentReference
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Instant
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DocumentReferenceRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var target: Reference? = null,
) {
  public fun toModel(): DocumentReference.RelatesTo =
    DocumentReference.RelatesTo().apply {
      id = this@DocumentReferenceRelatesToSurrogate.id
      extension = this@DocumentReferenceRelatesToSurrogate.extension
      modifierExtension = this@DocumentReferenceRelatesToSurrogate.modifierExtension
      code =
        Enumeration.of(
          this@DocumentReferenceRelatesToSurrogate.code?.let {
            com.google.fhir.model.r4b.DocumentReference.DocumentRelationshipType.fromCode(it)
          },
          this@DocumentReferenceRelatesToSurrogate._code,
        )
      target = this@DocumentReferenceRelatesToSurrogate.target
    }

  public companion object {
    public fun fromModel(model: DocumentReference.RelatesTo): DocumentReferenceRelatesToSurrogate =
      with(model) {
        DocumentReferenceRelatesToSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          target = this@with.target
        }
      }
  }
}

@Serializable
internal data class DocumentReferenceContentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var attachment: Attachment? = null,
  public var format: Coding? = null,
) {
  public fun toModel(): DocumentReference.Content =
    DocumentReference.Content().apply {
      id = this@DocumentReferenceContentSurrogate.id
      extension = this@DocumentReferenceContentSurrogate.extension
      modifierExtension = this@DocumentReferenceContentSurrogate.modifierExtension
      attachment = this@DocumentReferenceContentSurrogate.attachment
      format = this@DocumentReferenceContentSurrogate.format
    }

  public companion object {
    public fun fromModel(model: DocumentReference.Content): DocumentReferenceContentSurrogate =
      with(model) {
        DocumentReferenceContentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          attachment = this@with.attachment
          format = this@with.format
        }
      }
  }
}

@Serializable
internal data class DocumentReferenceContextSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var encounter: List<Reference?>? = null,
  public var event: List<CodeableConcept?>? = null,
  public var period: Period? = null,
  public var facilityType: CodeableConcept? = null,
  public var practiceSetting: CodeableConcept? = null,
  public var sourcePatientInfo: Reference? = null,
  public var related: List<Reference?>? = null,
) {
  public fun toModel(): DocumentReference.Context =
    DocumentReference.Context().apply {
      id = this@DocumentReferenceContextSurrogate.id
      extension = this@DocumentReferenceContextSurrogate.extension
      modifierExtension = this@DocumentReferenceContextSurrogate.modifierExtension
      encounter = this@DocumentReferenceContextSurrogate.encounter
      event = this@DocumentReferenceContextSurrogate.event
      period = this@DocumentReferenceContextSurrogate.period
      facilityType = this@DocumentReferenceContextSurrogate.facilityType
      practiceSetting = this@DocumentReferenceContextSurrogate.practiceSetting
      sourcePatientInfo = this@DocumentReferenceContextSurrogate.sourcePatientInfo
      related = this@DocumentReferenceContextSurrogate.related
    }

  public companion object {
    public fun fromModel(model: DocumentReference.Context): DocumentReferenceContextSurrogate =
      with(model) {
        DocumentReferenceContextSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          encounter = this@with.encounter
          event = this@with.event
          period = this@with.period
          facilityType = this@with.facilityType
          practiceSetting = this@with.practiceSetting
          sourcePatientInfo = this@with.sourcePatientInfo
          related = this@with.related
        }
      }
  }
}

@Serializable
internal data class DocumentReferenceSurrogate(
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
  public var masterIdentifier: Identifier? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var docStatus: KotlinString? = null,
  public var _docStatus: Element? = null,
  public var type: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: List<Reference?>? = null,
  public var authenticator: Reference? = null,
  public var custodian: Reference? = null,
  public var relatesTo: List<DocumentReference.RelatesTo>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var securityLabel: List<CodeableConcept?>? = null,
  public var content: List<DocumentReference.Content>? = null,
  public var context: DocumentReference.Context? = null,
) {
  public fun toModel(): DocumentReference =
    DocumentReference().apply {
      id = this@DocumentReferenceSurrogate.id
      meta = this@DocumentReferenceSurrogate.meta
      implicitRules =
        Uri.of(
          this@DocumentReferenceSurrogate.implicitRules,
          this@DocumentReferenceSurrogate._implicitRules,
        )
      language =
        Code.of(this@DocumentReferenceSurrogate.language, this@DocumentReferenceSurrogate._language)
      text = this@DocumentReferenceSurrogate.text
      contained = this@DocumentReferenceSurrogate.contained
      extension = this@DocumentReferenceSurrogate.extension
      modifierExtension = this@DocumentReferenceSurrogate.modifierExtension
      masterIdentifier = this@DocumentReferenceSurrogate.masterIdentifier
      identifier = this@DocumentReferenceSurrogate.identifier
      status =
        Enumeration.of(
          this@DocumentReferenceSurrogate.status?.let {
            com.google.fhir.model.r4b.DocumentReferenceStatus.fromCode(it)
          },
          this@DocumentReferenceSurrogate._status,
        )
      docStatus =
        Enumeration.of(
          this@DocumentReferenceSurrogate.docStatus?.let {
            com.google.fhir.model.r4b.DocumentReference.ReferredDocumentStatus.fromCode(it)
          },
          this@DocumentReferenceSurrogate._docStatus,
        )
      type = this@DocumentReferenceSurrogate.type
      category = this@DocumentReferenceSurrogate.category
      subject = this@DocumentReferenceSurrogate.subject
      date =
        Instant.of(
          FhirDateTime.fromString(this@DocumentReferenceSurrogate.date),
          this@DocumentReferenceSurrogate._date,
        )
      author = this@DocumentReferenceSurrogate.author
      authenticator = this@DocumentReferenceSurrogate.authenticator
      custodian = this@DocumentReferenceSurrogate.custodian
      relatesTo = this@DocumentReferenceSurrogate.relatesTo
      description =
        R4bString.of(
          this@DocumentReferenceSurrogate.description,
          this@DocumentReferenceSurrogate._description,
        )
      securityLabel = this@DocumentReferenceSurrogate.securityLabel
      content = this@DocumentReferenceSurrogate.content
      context = this@DocumentReferenceSurrogate.context
    }

  public companion object {
    public fun fromModel(model: DocumentReference): DocumentReferenceSurrogate =
      with(model) {
        DocumentReferenceSurrogate().apply {
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
          masterIdentifier = this@with.masterIdentifier
          identifier = this@with.identifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          docStatus = this@with.docStatus?.value?.getCode()
          _docStatus = this@with.docStatus?.toElement()
          type = this@with.type
          category = this@with.category
          subject = this@with.subject
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          author = this@with.author
          authenticator = this@with.authenticator
          custodian = this@with.custodian
          relatesTo = this@with.relatesTo
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          securityLabel = this@with.securityLabel
          content = this@with.content
          context = this@with.context
        }
      }
  }
}
