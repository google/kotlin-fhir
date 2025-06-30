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
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.DocumentReference
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
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
internal data class DocumentReferenceAttesterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var mode: CodeableConcept? = null,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): DocumentReference.Attester =
    DocumentReference.Attester().apply {
      id = this@DocumentReferenceAttesterSurrogate.id
      extension = this@DocumentReferenceAttesterSurrogate.extension
      modifierExtension = this@DocumentReferenceAttesterSurrogate.modifierExtension
      mode = this@DocumentReferenceAttesterSurrogate.mode
      time =
        DateTime.of(
          FhirDateTime.fromString(this@DocumentReferenceAttesterSurrogate.time),
          this@DocumentReferenceAttesterSurrogate._time,
        )
      party = this@DocumentReferenceAttesterSurrogate.party
    }

  public companion object {
    public fun fromModel(model: DocumentReference.Attester): DocumentReferenceAttesterSurrogate =
      with(model) {
        DocumentReferenceAttesterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          mode = this@with.mode
          time = this@with.time?.value?.toString()
          _time = this@with.time?.toElement()
          party = this@with.party
        }
      }
  }
}

@Serializable
internal data class DocumentReferenceRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var target: Reference? = null,
) {
  public fun toModel(): DocumentReference.RelatesTo =
    DocumentReference.RelatesTo().apply {
      id = this@DocumentReferenceRelatesToSurrogate.id
      extension = this@DocumentReferenceRelatesToSurrogate.extension
      modifierExtension = this@DocumentReferenceRelatesToSurrogate.modifierExtension
      code = this@DocumentReferenceRelatesToSurrogate.code
      target = this@DocumentReferenceRelatesToSurrogate.target
    }

  public companion object {
    public fun fromModel(model: DocumentReference.RelatesTo): DocumentReferenceRelatesToSurrogate =
      with(model) {
        DocumentReferenceRelatesToSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          target = this@with.target
        }
      }
  }
}

@Serializable
internal class DocumentReferenceContentProfileValueSurrogate {
  public var valueCoding: Coding? = null

  public var valueUri: KotlinString? = null

  public var _valueUri: Element? = null

  public var valueCanonical: KotlinString? = null

  public var _valueCanonical: Element? = null

  public fun toModel(): DocumentReference.Content.Profile.Value =
    DocumentReference.Content.Profile.Value?.from(
      this@DocumentReferenceContentProfileValueSurrogate.valueCoding,
      Uri.of(
        this@DocumentReferenceContentProfileValueSurrogate.valueUri,
        this@DocumentReferenceContentProfileValueSurrogate._valueUri,
      ),
      Canonical.of(
        this@DocumentReferenceContentProfileValueSurrogate.valueCanonical,
        this@DocumentReferenceContentProfileValueSurrogate._valueCanonical,
      ),
    ) ?: DocumentReference.Content.Profile.Value.Null

  public companion object {
    public fun fromModel(
      model: DocumentReference.Content.Profile.Value
    ): DocumentReferenceContentProfileValueSurrogate =
      with(model) {
        DocumentReferenceContentProfileValueSurrogate().apply {
          valueCoding = this@with.asCoding()?.value
          valueUri = this@with.asUri()?.value?.value
          _valueUri = this@with.asUri()?.value?.toElement()
          valueCanonical = this@with.asCanonical()?.value?.value
          _valueCanonical = this@with.asCanonical()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class DocumentReferenceContentProfileSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `value`: DocumentReference.Content.Profile.Value? = null,
) {
  public fun toModel(): DocumentReference.Content.Profile =
    DocumentReference.Content.Profile().apply {
      id = this@DocumentReferenceContentProfileSurrogate.id
      extension = this@DocumentReferenceContentProfileSurrogate.extension
      modifierExtension = this@DocumentReferenceContentProfileSurrogate.modifierExtension
      `value` = this@DocumentReferenceContentProfileSurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: DocumentReference.Content.Profile
    ): DocumentReferenceContentProfileSurrogate =
      with(model) {
        DocumentReferenceContentProfileSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `value` = this@with.`value`
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
  public var profile: List<DocumentReference.Content.Profile>? = null,
) {
  public fun toModel(): DocumentReference.Content =
    DocumentReference.Content().apply {
      id = this@DocumentReferenceContentSurrogate.id
      extension = this@DocumentReferenceContentSurrogate.extension
      modifierExtension = this@DocumentReferenceContentSurrogate.modifierExtension
      attachment = this@DocumentReferenceContentSurrogate.attachment
      profile = this@DocumentReferenceContentSurrogate.profile
    }

  public companion object {
    public fun fromModel(model: DocumentReference.Content): DocumentReferenceContentSurrogate =
      with(model) {
        DocumentReferenceContentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          attachment = this@with.attachment
          profile = this@with.profile
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
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var basedOn: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var docStatus: KotlinString? = null,
  public var _docStatus: Element? = null,
  public var modality: List<CodeableConcept?>? = null,
  public var type: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var context: List<Reference?>? = null,
  public var event: List<CodeableReference?>? = null,
  public var bodySite: List<CodeableReference?>? = null,
  public var facilityType: CodeableConcept? = null,
  public var practiceSetting: CodeableConcept? = null,
  public var period: Period? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: List<Reference?>? = null,
  public var attester: List<DocumentReference.Attester>? = null,
  public var custodian: Reference? = null,
  public var relatesTo: List<DocumentReference.RelatesTo>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var securityLabel: List<CodeableConcept?>? = null,
  public var content: List<DocumentReference.Content>? = null,
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
      identifier = this@DocumentReferenceSurrogate.identifier
      version =
        R5String.of(
          this@DocumentReferenceSurrogate.version,
          this@DocumentReferenceSurrogate._version,
        )
      basedOn = this@DocumentReferenceSurrogate.basedOn
      status =
        Enumeration.of(
          this@DocumentReferenceSurrogate.status?.let {
            com.google.fhir.model.r5.DocumentReferenceStatus.fromCode(it)
          },
          this@DocumentReferenceSurrogate._status,
        )
      docStatus =
        Enumeration.of(
          this@DocumentReferenceSurrogate.docStatus?.let {
            com.google.fhir.model.r5.DocumentReference.ReferredDocumentStatus.fromCode(it)
          },
          this@DocumentReferenceSurrogate._docStatus,
        )
      modality = this@DocumentReferenceSurrogate.modality
      type = this@DocumentReferenceSurrogate.type
      category = this@DocumentReferenceSurrogate.category
      subject = this@DocumentReferenceSurrogate.subject
      context = this@DocumentReferenceSurrogate.context
      event = this@DocumentReferenceSurrogate.event
      bodySite = this@DocumentReferenceSurrogate.bodySite
      facilityType = this@DocumentReferenceSurrogate.facilityType
      practiceSetting = this@DocumentReferenceSurrogate.practiceSetting
      period = this@DocumentReferenceSurrogate.period
      date =
        Instant.of(
          FhirDateTime.fromString(this@DocumentReferenceSurrogate.date),
          this@DocumentReferenceSurrogate._date,
        )
      author = this@DocumentReferenceSurrogate.author
      attester = this@DocumentReferenceSurrogate.attester
      custodian = this@DocumentReferenceSurrogate.custodian
      relatesTo = this@DocumentReferenceSurrogate.relatesTo
      description =
        Markdown.of(
          this@DocumentReferenceSurrogate.description,
          this@DocumentReferenceSurrogate._description,
        )
      securityLabel = this@DocumentReferenceSurrogate.securityLabel
      content = this@DocumentReferenceSurrogate.content
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
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          basedOn = this@with.basedOn
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          docStatus = this@with.docStatus?.value?.getCode()
          _docStatus = this@with.docStatus?.toElement()
          modality = this@with.modality
          type = this@with.type
          category = this@with.category
          subject = this@with.subject
          context = this@with.context
          event = this@with.event
          bodySite = this@with.bodySite
          facilityType = this@with.facilityType
          practiceSetting = this@with.practiceSetting
          period = this@with.period
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          author = this@with.author
          attester = this@with.attester
          custodian = this@with.custodian
          relatesTo = this@with.relatesTo
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          securityLabel = this@with.securityLabel
          content = this@with.content
        }
      }
  }
}
