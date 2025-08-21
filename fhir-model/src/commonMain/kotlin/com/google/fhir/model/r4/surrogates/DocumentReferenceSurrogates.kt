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
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.DocumentReference
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DocumentReferenceRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var target: Reference,
) {
  public fun toModel(): DocumentReference.RelatesTo =
    DocumentReference.RelatesTo(
      id = this@DocumentReferenceRelatesToSurrogate.id,
      extension = this@DocumentReferenceRelatesToSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceRelatesToSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.DocumentReference.DocumentRelationshipType.fromCode(
            this@DocumentReferenceRelatesToSurrogate.code!!
          ),
          this@DocumentReferenceRelatesToSurrogate._code,
        ),
      target = this@DocumentReferenceRelatesToSurrogate.target,
    )

  public companion object {
    public fun fromModel(model: DocumentReference.RelatesTo): DocumentReferenceRelatesToSurrogate =
      with(model) {
        DocumentReferenceRelatesToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          target = this@with.target,
        )
      }
  }
}

@Serializable
internal data class DocumentReferenceContentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var attachment: Attachment,
  public var format: Coding? = null,
) {
  public fun toModel(): DocumentReference.Content =
    DocumentReference.Content(
      id = this@DocumentReferenceContentSurrogate.id,
      extension = this@DocumentReferenceContentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceContentSurrogate.modifierExtension ?: mutableListOf(),
      attachment = this@DocumentReferenceContentSurrogate.attachment,
      format = this@DocumentReferenceContentSurrogate.format,
    )

  public companion object {
    public fun fromModel(model: DocumentReference.Content): DocumentReferenceContentSurrogate =
      with(model) {
        DocumentReferenceContentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          attachment = this@with.attachment,
          format = this@with.format,
        )
      }
  }
}

@Serializable
internal data class DocumentReferenceContextSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var encounter: MutableList<Reference>? = null,
  public var event: MutableList<CodeableConcept>? = null,
  public var period: Period? = null,
  public var facilityType: CodeableConcept? = null,
  public var practiceSetting: CodeableConcept? = null,
  public var sourcePatientInfo: Reference? = null,
  public var related: MutableList<Reference>? = null,
) {
  public fun toModel(): DocumentReference.Context =
    DocumentReference.Context(
      id = this@DocumentReferenceContextSurrogate.id,
      extension = this@DocumentReferenceContextSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceContextSurrogate.modifierExtension ?: mutableListOf(),
      encounter = this@DocumentReferenceContextSurrogate.encounter ?: mutableListOf(),
      event = this@DocumentReferenceContextSurrogate.event ?: mutableListOf(),
      period = this@DocumentReferenceContextSurrogate.period,
      facilityType = this@DocumentReferenceContextSurrogate.facilityType,
      practiceSetting = this@DocumentReferenceContextSurrogate.practiceSetting,
      sourcePatientInfo = this@DocumentReferenceContextSurrogate.sourcePatientInfo,
      related = this@DocumentReferenceContextSurrogate.related ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DocumentReference.Context): DocumentReferenceContextSurrogate =
      with(model) {
        DocumentReferenceContextSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          encounter = this@with.encounter.takeUnless { it.all { it == null } },
          event = this@with.event.takeUnless { it.all { it == null } },
          period = this@with.period,
          facilityType = this@with.facilityType,
          practiceSetting = this@with.practiceSetting,
          sourcePatientInfo = this@with.sourcePatientInfo,
          related = this@with.related.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var masterIdentifier: Identifier? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var docStatus: KotlinString? = null,
  public var _docStatus: Element? = null,
  public var type: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: MutableList<Reference>? = null,
  public var authenticator: Reference? = null,
  public var custodian: Reference? = null,
  public var relatesTo: MutableList<DocumentReference.RelatesTo>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var securityLabel: MutableList<CodeableConcept>? = null,
  public var content: MutableList<DocumentReference.Content>? = null,
  public var context: DocumentReference.Context? = null,
) {
  public fun toModel(): DocumentReference =
    DocumentReference(
      id = this@DocumentReferenceSurrogate.id,
      meta = this@DocumentReferenceSurrogate.meta,
      implicitRules =
        Uri.of(
          this@DocumentReferenceSurrogate.implicitRules,
          this@DocumentReferenceSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@DocumentReferenceSurrogate.language,
          this@DocumentReferenceSurrogate._language,
        ),
      text = this@DocumentReferenceSurrogate.text,
      contained = this@DocumentReferenceSurrogate.contained ?: mutableListOf(),
      extension = this@DocumentReferenceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DocumentReferenceSurrogate.modifierExtension ?: mutableListOf(),
      masterIdentifier = this@DocumentReferenceSurrogate.masterIdentifier,
      identifier = this@DocumentReferenceSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.terminologies.DocumentReferenceStatus.fromCode(
            this@DocumentReferenceSurrogate.status!!
          ),
          this@DocumentReferenceSurrogate._status,
        ),
      docStatus =
        this@DocumentReferenceSurrogate.docStatus?.let {
          Enumeration.of(
            com.google.fhir.model.r4.DocumentReference.CompositionStatus.fromCode(it!!),
            this@DocumentReferenceSurrogate._docStatus,
          )
        },
      type = this@DocumentReferenceSurrogate.type,
      category = this@DocumentReferenceSurrogate.category ?: mutableListOf(),
      subject = this@DocumentReferenceSurrogate.subject,
      date =
        Instant.of(
          FhirDateTime.fromString(this@DocumentReferenceSurrogate.date),
          this@DocumentReferenceSurrogate._date,
        ),
      author = this@DocumentReferenceSurrogate.author ?: mutableListOf(),
      authenticator = this@DocumentReferenceSurrogate.authenticator,
      custodian = this@DocumentReferenceSurrogate.custodian,
      relatesTo = this@DocumentReferenceSurrogate.relatesTo ?: mutableListOf(),
      description =
        R4String.of(
          this@DocumentReferenceSurrogate.description,
          this@DocumentReferenceSurrogate._description,
        ),
      securityLabel = this@DocumentReferenceSurrogate.securityLabel ?: mutableListOf(),
      content = this@DocumentReferenceSurrogate.content ?: mutableListOf(),
      context = this@DocumentReferenceSurrogate.context,
    )

  public companion object {
    public fun fromModel(model: DocumentReference): DocumentReferenceSurrogate =
      with(model) {
        DocumentReferenceSurrogate(
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
          masterIdentifier = this@with.masterIdentifier,
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          docStatus = this@with.docStatus?.value?.getCode(),
          _docStatus = this@with.docStatus?.toElement(),
          type = this@with.type,
          category = this@with.category.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          author = this@with.author.takeUnless { it.all { it == null } },
          authenticator = this@with.authenticator,
          custodian = this@with.custodian,
          relatesTo = this@with.relatesTo.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          securityLabel = this@with.securityLabel.takeUnless { it.all { it == null } },
          content = this@with.content.takeUnless { it.all { it == null } },
          context = this@with.context,
        )
      }
  }
}
