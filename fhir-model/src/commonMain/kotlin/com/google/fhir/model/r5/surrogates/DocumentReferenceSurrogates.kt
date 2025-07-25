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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DocumentReferenceAttesterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: CodeableConcept,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): DocumentReference.Attester =
    DocumentReference.Attester(
      id = this@DocumentReferenceAttesterSurrogate.id,
      extension = this@DocumentReferenceAttesterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceAttesterSurrogate.modifierExtension ?: mutableListOf(),
      mode = this@DocumentReferenceAttesterSurrogate.mode,
      time =
        DateTime.of(
          FhirDateTime.fromString(this@DocumentReferenceAttesterSurrogate.time),
          this@DocumentReferenceAttesterSurrogate._time,
        ),
      party = this@DocumentReferenceAttesterSurrogate.party,
    )

  public companion object {
    public fun fromModel(model: DocumentReference.Attester): DocumentReferenceAttesterSurrogate =
      with(model) {
        DocumentReferenceAttesterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode,
          time = this@with.time?.value?.toString(),
          _time = this@with.time?.toElement(),
          party = this@with.party,
        )
      }
  }
}

@Serializable
internal data class DocumentReferenceRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var target: Reference,
) {
  public fun toModel(): DocumentReference.RelatesTo =
    DocumentReference.RelatesTo(
      id = this@DocumentReferenceRelatesToSurrogate.id,
      extension = this@DocumentReferenceRelatesToSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceRelatesToSurrogate.modifierExtension ?: mutableListOf(),
      code = this@DocumentReferenceRelatesToSurrogate.code,
      target = this@DocumentReferenceRelatesToSurrogate.target,
    )

  public companion object {
    public fun fromModel(model: DocumentReference.RelatesTo): DocumentReferenceRelatesToSurrogate =
      with(model) {
        DocumentReferenceRelatesToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          target = this@with.target,
        )
      }
  }
}

@Serializable
internal data class DocumentReferenceContentProfileSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var valueCoding: Coding? = null,
  public var valueUri: KotlinString? = null,
  public var _valueUri: Element? = null,
  public var valueCanonical: KotlinString? = null,
  public var _valueCanonical: Element? = null,
) {
  public fun toModel(): DocumentReference.Content.Profile =
    DocumentReference.Content.Profile(
      id = this@DocumentReferenceContentProfileSurrogate.id,
      extension = this@DocumentReferenceContentProfileSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceContentProfileSurrogate.modifierExtension ?: mutableListOf(),
      `value` =
        DocumentReference.Content.Profile.Value.from(
          this@DocumentReferenceContentProfileSurrogate.valueCoding,
          Uri.of(
            this@DocumentReferenceContentProfileSurrogate.valueUri,
            this@DocumentReferenceContentProfileSurrogate._valueUri,
          ),
          Canonical.of(
            this@DocumentReferenceContentProfileSurrogate.valueCanonical,
            this@DocumentReferenceContentProfileSurrogate._valueCanonical,
          ),
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: DocumentReference.Content.Profile
    ): DocumentReferenceContentProfileSurrogate =
      with(model) {
        DocumentReferenceContentProfileSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          valueCoding = this@with.`value`?.asCoding()?.value,
          valueUri = this@with.`value`?.asUri()?.value?.value,
          _valueUri = this@with.`value`?.asUri()?.value?.toElement(),
          valueCanonical = this@with.`value`?.asCanonical()?.value?.value,
          _valueCanonical = this@with.`value`?.asCanonical()?.value?.toElement(),
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
  public var profile: MutableList<DocumentReference.Content.Profile>? = null,
) {
  public fun toModel(): DocumentReference.Content =
    DocumentReference.Content(
      id = this@DocumentReferenceContentSurrogate.id,
      extension = this@DocumentReferenceContentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DocumentReferenceContentSurrogate.modifierExtension ?: mutableListOf(),
      attachment = this@DocumentReferenceContentSurrogate.attachment,
      profile = this@DocumentReferenceContentSurrogate.profile ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DocumentReference.Content): DocumentReferenceContentSurrogate =
      with(model) {
        DocumentReferenceContentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          attachment = this@with.attachment,
          profile = this@with.profile.takeUnless { it.all { it == null } },
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
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var docStatus: KotlinString? = null,
  public var _docStatus: Element? = null,
  public var modality: MutableList<CodeableConcept>? = null,
  public var type: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var context: MutableList<Reference>? = null,
  public var event: MutableList<CodeableReference>? = null,
  public var bodySite: MutableList<CodeableReference>? = null,
  public var facilityType: CodeableConcept? = null,
  public var practiceSetting: CodeableConcept? = null,
  public var period: Period? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: MutableList<Reference>? = null,
  public var attester: MutableList<DocumentReference.Attester>? = null,
  public var custodian: Reference? = null,
  public var relatesTo: MutableList<DocumentReference.RelatesTo>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var securityLabel: MutableList<CodeableConcept>? = null,
  public var content: MutableList<DocumentReference.Content>? = null,
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
      identifier = this@DocumentReferenceSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(
          this@DocumentReferenceSurrogate.version,
          this@DocumentReferenceSurrogate._version,
        ),
      basedOn = this@DocumentReferenceSurrogate.basedOn ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.DocumentReferenceStatus.fromCode(
            this@DocumentReferenceSurrogate.status!!
          ),
          this@DocumentReferenceSurrogate._status,
        ),
      docStatus =
        this@DocumentReferenceSurrogate.docStatus?.let {
          Enumeration.of(
            com.google.fhir.model.r5.DocumentReference.ReferredDocumentStatus.fromCode(it!!),
            this@DocumentReferenceSurrogate._docStatus,
          )
        },
      modality = this@DocumentReferenceSurrogate.modality ?: mutableListOf(),
      type = this@DocumentReferenceSurrogate.type,
      category = this@DocumentReferenceSurrogate.category ?: mutableListOf(),
      subject = this@DocumentReferenceSurrogate.subject,
      context = this@DocumentReferenceSurrogate.context ?: mutableListOf(),
      event = this@DocumentReferenceSurrogate.event ?: mutableListOf(),
      bodySite = this@DocumentReferenceSurrogate.bodySite ?: mutableListOf(),
      facilityType = this@DocumentReferenceSurrogate.facilityType,
      practiceSetting = this@DocumentReferenceSurrogate.practiceSetting,
      period = this@DocumentReferenceSurrogate.period,
      date =
        Instant.of(
          FhirDateTime.fromString(this@DocumentReferenceSurrogate.date),
          this@DocumentReferenceSurrogate._date,
        ),
      author = this@DocumentReferenceSurrogate.author ?: mutableListOf(),
      attester = this@DocumentReferenceSurrogate.attester ?: mutableListOf(),
      custodian = this@DocumentReferenceSurrogate.custodian,
      relatesTo = this@DocumentReferenceSurrogate.relatesTo ?: mutableListOf(),
      description =
        Markdown.of(
          this@DocumentReferenceSurrogate.description,
          this@DocumentReferenceSurrogate._description,
        ),
      securityLabel = this@DocumentReferenceSurrogate.securityLabel ?: mutableListOf(),
      content = this@DocumentReferenceSurrogate.content ?: mutableListOf(),
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          docStatus = this@with.docStatus?.value?.getCode(),
          _docStatus = this@with.docStatus?.toElement(),
          modality = this@with.modality.takeUnless { it.all { it == null } },
          type = this@with.type,
          category = this@with.category.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          context = this@with.context.takeUnless { it.all { it == null } },
          event = this@with.event.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          facilityType = this@with.facilityType,
          practiceSetting = this@with.practiceSetting,
          period = this@with.period,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          author = this@with.author.takeUnless { it.all { it == null } },
          attester = this@with.attester.takeUnless { it.all { it == null } },
          custodian = this@with.custodian,
          relatesTo = this@with.relatesTo.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          securityLabel = this@with.securityLabel.takeUnless { it.all { it == null } },
          content = this@with.content.takeUnless { it.all { it == null } },
        )
      }
  }
}
