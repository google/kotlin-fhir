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
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Citation
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CitationSummarySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var style: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Citation.Summary =
    Citation.Summary().apply {
      id = this@CitationSummarySurrogate.id
      extension = this@CitationSummarySurrogate.extension
      modifierExtension = this@CitationSummarySurrogate.modifierExtension
      style = this@CitationSummarySurrogate.style
      text = Markdown.of(this@CitationSummarySurrogate.text, this@CitationSummarySurrogate._text)
    }

  public companion object {
    public fun fromModel(model: Citation.Summary): CitationSummarySurrogate =
      with(model) {
        CitationSummarySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          style = this@with.style
          text = this@with.text?.value
          _text = this@with.text?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var classifier: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Citation.Classification =
    Citation.Classification().apply {
      id = this@CitationClassificationSurrogate.id
      extension = this@CitationClassificationSurrogate.extension
      modifierExtension = this@CitationClassificationSurrogate.modifierExtension
      type = this@CitationClassificationSurrogate.type
      classifier = this@CitationClassificationSurrogate.classifier
    }

  public companion object {
    public fun fromModel(model: Citation.Classification): CitationClassificationSurrogate =
      with(model) {
        CitationClassificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          classifier = this@with.classifier
        }
      }
  }
}

@Serializable
internal data class CitationStatusDateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var activity: CodeableConcept? = null,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Citation.StatusDate =
    Citation.StatusDate().apply {
      id = this@CitationStatusDateSurrogate.id
      extension = this@CitationStatusDateSurrogate.extension
      modifierExtension = this@CitationStatusDateSurrogate.modifierExtension
      activity = this@CitationStatusDateSurrogate.activity
      `actual` =
        R5Boolean.of(
          this@CitationStatusDateSurrogate.`actual`,
          this@CitationStatusDateSurrogate._actual,
        )
      period = this@CitationStatusDateSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Citation.StatusDate): CitationStatusDateSurrogate =
      with(model) {
        CitationStatusDateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          activity = this@with.activity
          `actual` = this@with.`actual`?.value
          _actual = this@with.`actual`?.toElement()
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactVersionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var baseCitation: Reference? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Version =
    Citation.CitedArtifact.Version().apply {
      id = this@CitationCitedArtifactVersionSurrogate.id
      extension = this@CitationCitedArtifactVersionSurrogate.extension
      modifierExtension = this@CitationCitedArtifactVersionSurrogate.modifierExtension
      `value` =
        R5String.of(
          this@CitationCitedArtifactVersionSurrogate.`value`,
          this@CitationCitedArtifactVersionSurrogate._value,
        )
      baseCitation = this@CitationCitedArtifactVersionSurrogate.baseCitation
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Version
    ): CitationCitedArtifactVersionSurrogate =
      with(model) {
        CitationCitedArtifactVersionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
          baseCitation = this@with.baseCitation
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactStatusDateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var activity: CodeableConcept? = null,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Citation.CitedArtifact.StatusDate =
    Citation.CitedArtifact.StatusDate().apply {
      id = this@CitationCitedArtifactStatusDateSurrogate.id
      extension = this@CitationCitedArtifactStatusDateSurrogate.extension
      modifierExtension = this@CitationCitedArtifactStatusDateSurrogate.modifierExtension
      activity = this@CitationCitedArtifactStatusDateSurrogate.activity
      `actual` =
        R5Boolean.of(
          this@CitationCitedArtifactStatusDateSurrogate.`actual`,
          this@CitationCitedArtifactStatusDateSurrogate._actual,
        )
      period = this@CitationCitedArtifactStatusDateSurrogate.period
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.StatusDate
    ): CitationCitedArtifactStatusDateSurrogate =
      with(model) {
        CitationCitedArtifactStatusDateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          activity = this@with.activity
          `actual` = this@with.`actual`?.value
          _actual = this@with.`actual`?.toElement()
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactTitleSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var language: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Title =
    Citation.CitedArtifact.Title().apply {
      id = this@CitationCitedArtifactTitleSurrogate.id
      extension = this@CitationCitedArtifactTitleSurrogate.extension
      modifierExtension = this@CitationCitedArtifactTitleSurrogate.modifierExtension
      type = this@CitationCitedArtifactTitleSurrogate.type
      language = this@CitationCitedArtifactTitleSurrogate.language
      text =
        Markdown.of(
          this@CitationCitedArtifactTitleSurrogate.text,
          this@CitationCitedArtifactTitleSurrogate._text,
        )
    }

  public companion object {
    public fun fromModel(model: Citation.CitedArtifact.Title): CitationCitedArtifactTitleSurrogate =
      with(model) {
        CitationCitedArtifactTitleSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          language = this@with.language
          text = this@with.text?.value
          _text = this@with.text?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactAbstractSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var language: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Abstract =
    Citation.CitedArtifact.Abstract().apply {
      id = this@CitationCitedArtifactAbstractSurrogate.id
      extension = this@CitationCitedArtifactAbstractSurrogate.extension
      modifierExtension = this@CitationCitedArtifactAbstractSurrogate.modifierExtension
      type = this@CitationCitedArtifactAbstractSurrogate.type
      language = this@CitationCitedArtifactAbstractSurrogate.language
      text =
        Markdown.of(
          this@CitationCitedArtifactAbstractSurrogate.text,
          this@CitationCitedArtifactAbstractSurrogate._text,
        )
      copyright =
        Markdown.of(
          this@CitationCitedArtifactAbstractSurrogate.copyright,
          this@CitationCitedArtifactAbstractSurrogate._copyright,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Abstract
    ): CitationCitedArtifactAbstractSurrogate =
      with(model) {
        CitationCitedArtifactAbstractSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          language = this@with.language
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactPartSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var baseCitation: Reference? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Part =
    Citation.CitedArtifact.Part().apply {
      id = this@CitationCitedArtifactPartSurrogate.id
      extension = this@CitationCitedArtifactPartSurrogate.extension
      modifierExtension = this@CitationCitedArtifactPartSurrogate.modifierExtension
      type = this@CitationCitedArtifactPartSurrogate.type
      `value` =
        R5String.of(
          this@CitationCitedArtifactPartSurrogate.`value`,
          this@CitationCitedArtifactPartSurrogate._value,
        )
      baseCitation = this@CitationCitedArtifactPartSurrogate.baseCitation
    }

  public companion object {
    public fun fromModel(model: Citation.CitedArtifact.Part): CitationCitedArtifactPartSurrogate =
      with(model) {
        CitationCitedArtifactPartSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
          baseCitation = this@with.baseCitation
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var classifier: List<CodeableConcept?>? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var citation: KotlinString? = null,
  public var _citation: Element? = null,
  public var document: Attachment? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var resourceReference: Reference? = null,
) {
  public fun toModel(): Citation.CitedArtifact.RelatesTo =
    Citation.CitedArtifact.RelatesTo().apply {
      id = this@CitationCitedArtifactRelatesToSurrogate.id
      extension = this@CitationCitedArtifactRelatesToSurrogate.extension
      modifierExtension = this@CitationCitedArtifactRelatesToSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@CitationCitedArtifactRelatesToSurrogate.type?.let {
            com.google.fhir.model.r5.Citation.RelatedArtifactTypeExpanded.fromCode(it)
          },
          this@CitationCitedArtifactRelatesToSurrogate._type,
        )
      classifier = this@CitationCitedArtifactRelatesToSurrogate.classifier
      label =
        R5String.of(
          this@CitationCitedArtifactRelatesToSurrogate.label,
          this@CitationCitedArtifactRelatesToSurrogate._label,
        )
      display =
        R5String.of(
          this@CitationCitedArtifactRelatesToSurrogate.display,
          this@CitationCitedArtifactRelatesToSurrogate._display,
        )
      citation =
        Markdown.of(
          this@CitationCitedArtifactRelatesToSurrogate.citation,
          this@CitationCitedArtifactRelatesToSurrogate._citation,
        )
      document = this@CitationCitedArtifactRelatesToSurrogate.document
      resource =
        Canonical.of(
          this@CitationCitedArtifactRelatesToSurrogate.resource,
          this@CitationCitedArtifactRelatesToSurrogate._resource,
        )
      resourceReference = this@CitationCitedArtifactRelatesToSurrogate.resourceReference
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.RelatesTo
    ): CitationCitedArtifactRelatesToSurrogate =
      with(model) {
        CitationCitedArtifactRelatesToSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          classifier = this@with.classifier
          label = this@with.label?.value
          _label = this@with.label?.toElement()
          display = this@with.display?.value
          _display = this@with.display?.toElement()
          citation = this@with.citation?.value
          _citation = this@with.citation?.toElement()
          document = this@with.document
          resource = this@with.resource?.value
          _resource = this@with.resource?.toElement()
          resourceReference = this@with.resourceReference
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactPublicationFormPublishedInSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var identifier: List<Identifier?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var publisher: Reference? = null,
  public var publisherLocation: KotlinString? = null,
  public var _publisherLocation: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.PublicationForm.PublishedIn =
    Citation.CitedArtifact.PublicationForm.PublishedIn().apply {
      id = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.id
      extension = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.extension
      modifierExtension =
        this@CitationCitedArtifactPublicationFormPublishedInSurrogate.modifierExtension
      type = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.type
      identifier = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.identifier
      title =
        R5String.of(
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate.title,
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate._title,
        )
      publisher = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.publisher
      publisherLocation =
        R5String.of(
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate.publisherLocation,
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate._publisherLocation,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.PublicationForm.PublishedIn
    ): CitationCitedArtifactPublicationFormPublishedInSurrogate =
      with(model) {
        CitationCitedArtifactPublicationFormPublishedInSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          identifier = this@with.identifier
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          publisher = this@with.publisher
          publisherLocation = this@with.publisherLocation?.value
          _publisherLocation = this@with.publisherLocation?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactPublicationFormSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var publishedIn: Citation.CitedArtifact.PublicationForm.PublishedIn? = null,
  public var citedMedium: CodeableConcept? = null,
  public var volume: KotlinString? = null,
  public var _volume: Element? = null,
  public var issue: KotlinString? = null,
  public var _issue: Element? = null,
  public var articleDate: KotlinString? = null,
  public var _articleDate: Element? = null,
  public var publicationDateText: KotlinString? = null,
  public var _publicationDateText: Element? = null,
  public var publicationDateSeason: KotlinString? = null,
  public var _publicationDateSeason: Element? = null,
  public var lastRevisionDate: KotlinString? = null,
  public var _lastRevisionDate: Element? = null,
  public var language: List<CodeableConcept?>? = null,
  public var accessionNumber: KotlinString? = null,
  public var _accessionNumber: Element? = null,
  public var pageString: KotlinString? = null,
  public var _pageString: Element? = null,
  public var firstPage: KotlinString? = null,
  public var _firstPage: Element? = null,
  public var lastPage: KotlinString? = null,
  public var _lastPage: Element? = null,
  public var pageCount: KotlinString? = null,
  public var _pageCount: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.PublicationForm =
    Citation.CitedArtifact.PublicationForm().apply {
      id = this@CitationCitedArtifactPublicationFormSurrogate.id
      extension = this@CitationCitedArtifactPublicationFormSurrogate.extension
      modifierExtension = this@CitationCitedArtifactPublicationFormSurrogate.modifierExtension
      publishedIn = this@CitationCitedArtifactPublicationFormSurrogate.publishedIn
      citedMedium = this@CitationCitedArtifactPublicationFormSurrogate.citedMedium
      volume =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.volume,
          this@CitationCitedArtifactPublicationFormSurrogate._volume,
        )
      issue =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.issue,
          this@CitationCitedArtifactPublicationFormSurrogate._issue,
        )
      articleDate =
        DateTime.of(
          FhirDateTime.fromString(this@CitationCitedArtifactPublicationFormSurrogate.articleDate),
          this@CitationCitedArtifactPublicationFormSurrogate._articleDate,
        )
      publicationDateText =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.publicationDateText,
          this@CitationCitedArtifactPublicationFormSurrogate._publicationDateText,
        )
      publicationDateSeason =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.publicationDateSeason,
          this@CitationCitedArtifactPublicationFormSurrogate._publicationDateSeason,
        )
      lastRevisionDate =
        DateTime.of(
          FhirDateTime.fromString(
            this@CitationCitedArtifactPublicationFormSurrogate.lastRevisionDate
          ),
          this@CitationCitedArtifactPublicationFormSurrogate._lastRevisionDate,
        )
      language = this@CitationCitedArtifactPublicationFormSurrogate.language
      accessionNumber =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.accessionNumber,
          this@CitationCitedArtifactPublicationFormSurrogate._accessionNumber,
        )
      pageString =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.pageString,
          this@CitationCitedArtifactPublicationFormSurrogate._pageString,
        )
      firstPage =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.firstPage,
          this@CitationCitedArtifactPublicationFormSurrogate._firstPage,
        )
      lastPage =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.lastPage,
          this@CitationCitedArtifactPublicationFormSurrogate._lastPage,
        )
      pageCount =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.pageCount,
          this@CitationCitedArtifactPublicationFormSurrogate._pageCount,
        )
      copyright =
        Markdown.of(
          this@CitationCitedArtifactPublicationFormSurrogate.copyright,
          this@CitationCitedArtifactPublicationFormSurrogate._copyright,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.PublicationForm
    ): CitationCitedArtifactPublicationFormSurrogate =
      with(model) {
        CitationCitedArtifactPublicationFormSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          publishedIn = this@with.publishedIn
          citedMedium = this@with.citedMedium
          volume = this@with.volume?.value
          _volume = this@with.volume?.toElement()
          issue = this@with.issue?.value
          _issue = this@with.issue?.toElement()
          articleDate = this@with.articleDate?.value?.toString()
          _articleDate = this@with.articleDate?.toElement()
          publicationDateText = this@with.publicationDateText?.value
          _publicationDateText = this@with.publicationDateText?.toElement()
          publicationDateSeason = this@with.publicationDateSeason?.value
          _publicationDateSeason = this@with.publicationDateSeason?.toElement()
          lastRevisionDate = this@with.lastRevisionDate?.value?.toString()
          _lastRevisionDate = this@with.lastRevisionDate?.toElement()
          language = this@with.language
          accessionNumber = this@with.accessionNumber?.value
          _accessionNumber = this@with.accessionNumber?.toElement()
          pageString = this@with.pageString?.value
          _pageString = this@with.pageString?.toElement()
          firstPage = this@with.firstPage?.value
          _firstPage = this@with.firstPage?.toElement()
          lastPage = this@with.lastPage?.value
          _lastPage = this@with.lastPage?.toElement()
          pageCount = this@with.pageCount?.value
          _pageCount = this@with.pageCount?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactWebLocationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var classifier: List<CodeableConcept?>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.WebLocation =
    Citation.CitedArtifact.WebLocation().apply {
      id = this@CitationCitedArtifactWebLocationSurrogate.id
      extension = this@CitationCitedArtifactWebLocationSurrogate.extension
      modifierExtension = this@CitationCitedArtifactWebLocationSurrogate.modifierExtension
      classifier = this@CitationCitedArtifactWebLocationSurrogate.classifier
      url =
        Uri.of(
          this@CitationCitedArtifactWebLocationSurrogate.url,
          this@CitationCitedArtifactWebLocationSurrogate._url,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.WebLocation
    ): CitationCitedArtifactWebLocationSurrogate =
      with(model) {
        CitationCitedArtifactWebLocationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          classifier = this@with.classifier
          url = this@with.url?.value
          _url = this@with.url?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var classifier: List<CodeableConcept?>? = null,
  public var artifactAssessment: List<Reference?>? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Classification =
    Citation.CitedArtifact.Classification().apply {
      id = this@CitationCitedArtifactClassificationSurrogate.id
      extension = this@CitationCitedArtifactClassificationSurrogate.extension
      modifierExtension = this@CitationCitedArtifactClassificationSurrogate.modifierExtension
      type = this@CitationCitedArtifactClassificationSurrogate.type
      classifier = this@CitationCitedArtifactClassificationSurrogate.classifier
      artifactAssessment = this@CitationCitedArtifactClassificationSurrogate.artifactAssessment
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Classification
    ): CitationCitedArtifactClassificationSurrogate =
      with(model) {
        CitationCitedArtifactClassificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          classifier = this@with.classifier
          artifactAssessment = this@with.artifactAssessment
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship.Entry.ContributionInstance =
    Citation.CitedArtifact.Contributorship.Entry.ContributionInstance().apply {
      id = this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.id
      extension =
        this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.extension
      modifierExtension =
        this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate
          .modifierExtension
      type = this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.type
      time =
        DateTime.of(
          FhirDateTime.fromString(
            this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.time
          ),
          this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate._time,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship.Entry.ContributionInstance
    ): CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate =
      with(model) {
        CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          time = this@with.time?.value?.toString()
          _time = this@with.time?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipEntrySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var contributor: Reference? = null,
  public var forenameInitials: KotlinString? = null,
  public var _forenameInitials: Element? = null,
  public var affiliation: List<Reference?>? = null,
  public var contributionType: List<CodeableConcept?>? = null,
  public var role: CodeableConcept? = null,
  public var contributionInstance:
    List<Citation.CitedArtifact.Contributorship.Entry.ContributionInstance>? =
    null,
  public var correspondingContact: KotlinBoolean? = null,
  public var _correspondingContact: Element? = null,
  public var rankingOrder: Int? = null,
  public var _rankingOrder: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship.Entry =
    Citation.CitedArtifact.Contributorship.Entry().apply {
      id = this@CitationCitedArtifactContributorshipEntrySurrogate.id
      extension = this@CitationCitedArtifactContributorshipEntrySurrogate.extension
      modifierExtension = this@CitationCitedArtifactContributorshipEntrySurrogate.modifierExtension
      contributor = this@CitationCitedArtifactContributorshipEntrySurrogate.contributor
      forenameInitials =
        R5String.of(
          this@CitationCitedArtifactContributorshipEntrySurrogate.forenameInitials,
          this@CitationCitedArtifactContributorshipEntrySurrogate._forenameInitials,
        )
      affiliation = this@CitationCitedArtifactContributorshipEntrySurrogate.affiliation
      contributionType = this@CitationCitedArtifactContributorshipEntrySurrogate.contributionType
      role = this@CitationCitedArtifactContributorshipEntrySurrogate.role
      contributionInstance =
        this@CitationCitedArtifactContributorshipEntrySurrogate.contributionInstance
      correspondingContact =
        R5Boolean.of(
          this@CitationCitedArtifactContributorshipEntrySurrogate.correspondingContact,
          this@CitationCitedArtifactContributorshipEntrySurrogate._correspondingContact,
        )
      rankingOrder =
        PositiveInt.of(
          this@CitationCitedArtifactContributorshipEntrySurrogate.rankingOrder,
          this@CitationCitedArtifactContributorshipEntrySurrogate._rankingOrder,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship.Entry
    ): CitationCitedArtifactContributorshipEntrySurrogate =
      with(model) {
        CitationCitedArtifactContributorshipEntrySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          contributor = this@with.contributor
          forenameInitials = this@with.forenameInitials?.value
          _forenameInitials = this@with.forenameInitials?.toElement()
          affiliation = this@with.affiliation
          contributionType = this@with.contributionType
          role = this@with.role
          contributionInstance = this@with.contributionInstance
          correspondingContact = this@with.correspondingContact?.value
          _correspondingContact = this@with.correspondingContact?.toElement()
          rankingOrder = this@with.rankingOrder?.value
          _rankingOrder = this@with.rankingOrder?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipSummarySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var style: CodeableConcept? = null,
  public var source: CodeableConcept? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship.Summary =
    Citation.CitedArtifact.Contributorship.Summary().apply {
      id = this@CitationCitedArtifactContributorshipSummarySurrogate.id
      extension = this@CitationCitedArtifactContributorshipSummarySurrogate.extension
      modifierExtension =
        this@CitationCitedArtifactContributorshipSummarySurrogate.modifierExtension
      type = this@CitationCitedArtifactContributorshipSummarySurrogate.type
      style = this@CitationCitedArtifactContributorshipSummarySurrogate.style
      source = this@CitationCitedArtifactContributorshipSummarySurrogate.source
      `value` =
        Markdown.of(
          this@CitationCitedArtifactContributorshipSummarySurrogate.`value`,
          this@CitationCitedArtifactContributorshipSummarySurrogate._value,
        )
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship.Summary
    ): CitationCitedArtifactContributorshipSummarySurrogate =
      with(model) {
        CitationCitedArtifactContributorshipSummarySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          style = this@with.style
          source = this@with.source
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var complete: KotlinBoolean? = null,
  public var _complete: Element? = null,
  public var entry: List<Citation.CitedArtifact.Contributorship.Entry>? = null,
  public var summary: List<Citation.CitedArtifact.Contributorship.Summary>? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship =
    Citation.CitedArtifact.Contributorship().apply {
      id = this@CitationCitedArtifactContributorshipSurrogate.id
      extension = this@CitationCitedArtifactContributorshipSurrogate.extension
      modifierExtension = this@CitationCitedArtifactContributorshipSurrogate.modifierExtension
      complete =
        R5Boolean.of(
          this@CitationCitedArtifactContributorshipSurrogate.complete,
          this@CitationCitedArtifactContributorshipSurrogate._complete,
        )
      entry = this@CitationCitedArtifactContributorshipSurrogate.entry
      summary = this@CitationCitedArtifactContributorshipSurrogate.summary
    }

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship
    ): CitationCitedArtifactContributorshipSurrogate =
      with(model) {
        CitationCitedArtifactContributorshipSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          complete = this@with.complete?.value
          _complete = this@with.complete?.toElement()
          entry = this@with.entry
          summary = this@with.summary
        }
      }
  }
}

@Serializable
internal data class CitationCitedArtifactSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var relatedIdentifier: List<Identifier?>? = null,
  public var dateAccessed: KotlinString? = null,
  public var _dateAccessed: Element? = null,
  public var version: Citation.CitedArtifact.Version? = null,
  public var currentState: List<CodeableConcept?>? = null,
  public var statusDate: List<Citation.CitedArtifact.StatusDate>? = null,
  public var title: List<Citation.CitedArtifact.Title>? = null,
  public var `abstract`: List<Citation.CitedArtifact.Abstract>? = null,
  public var part: Citation.CitedArtifact.Part? = null,
  public var relatesTo: List<Citation.CitedArtifact.RelatesTo>? = null,
  public var publicationForm: List<Citation.CitedArtifact.PublicationForm>? = null,
  public var webLocation: List<Citation.CitedArtifact.WebLocation>? = null,
  public var classification: List<Citation.CitedArtifact.Classification>? = null,
  public var contributorship: Citation.CitedArtifact.Contributorship? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): Citation.CitedArtifact =
    Citation.CitedArtifact().apply {
      id = this@CitationCitedArtifactSurrogate.id
      extension = this@CitationCitedArtifactSurrogate.extension
      modifierExtension = this@CitationCitedArtifactSurrogate.modifierExtension
      identifier = this@CitationCitedArtifactSurrogate.identifier
      relatedIdentifier = this@CitationCitedArtifactSurrogate.relatedIdentifier
      dateAccessed =
        DateTime.of(
          FhirDateTime.fromString(this@CitationCitedArtifactSurrogate.dateAccessed),
          this@CitationCitedArtifactSurrogate._dateAccessed,
        )
      version = this@CitationCitedArtifactSurrogate.version
      currentState = this@CitationCitedArtifactSurrogate.currentState
      statusDate = this@CitationCitedArtifactSurrogate.statusDate
      title = this@CitationCitedArtifactSurrogate.title
      `abstract` = this@CitationCitedArtifactSurrogate.`abstract`
      part = this@CitationCitedArtifactSurrogate.part
      relatesTo = this@CitationCitedArtifactSurrogate.relatesTo
      publicationForm = this@CitationCitedArtifactSurrogate.publicationForm
      webLocation = this@CitationCitedArtifactSurrogate.webLocation
      classification = this@CitationCitedArtifactSurrogate.classification
      contributorship = this@CitationCitedArtifactSurrogate.contributorship
      note = this@CitationCitedArtifactSurrogate.note
    }

  public companion object {
    public fun fromModel(model: Citation.CitedArtifact): CitationCitedArtifactSurrogate =
      with(model) {
        CitationCitedArtifactSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          relatedIdentifier = this@with.relatedIdentifier
          dateAccessed = this@with.dateAccessed?.value?.toString()
          _dateAccessed = this@with.dateAccessed?.toElement()
          version = this@with.version
          currentState = this@with.currentState
          statusDate = this@with.statusDate
          title = this@with.title
          `abstract` = this@with.`abstract`
          part = this@with.part
          relatesTo = this@with.relatesTo
          publicationForm = this@with.publicationForm
          webLocation = this@with.webLocation
          classification = this@with.classification
          contributorship = this@with.contributorship
          note = this@with.note
        }
      }
  }
}

@Serializable
internal data class CitationSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var summary: List<Citation.Summary>? = null,
  public var classification: List<Citation.Classification>? = null,
  public var note: List<Annotation?>? = null,
  public var currentState: List<CodeableConcept?>? = null,
  public var statusDate: List<Citation.StatusDate>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var citedArtifact: Citation.CitedArtifact? = null,
) {
  public fun toModel(): Citation =
    Citation().apply {
      id = this@CitationSurrogate.id
      meta = this@CitationSurrogate.meta
      implicitRules =
        Uri.of(this@CitationSurrogate.implicitRules, this@CitationSurrogate._implicitRules)
      language = Code.of(this@CitationSurrogate.language, this@CitationSurrogate._language)
      text = this@CitationSurrogate.text
      contained = this@CitationSurrogate.contained
      extension = this@CitationSurrogate.extension
      modifierExtension = this@CitationSurrogate.modifierExtension
      url = Uri.of(this@CitationSurrogate.url, this@CitationSurrogate._url)
      identifier = this@CitationSurrogate.identifier
      version = R5String.of(this@CitationSurrogate.version, this@CitationSurrogate._version)
      versionAlgorithm =
        Citation.VersionAlgorithm?.from(
          R5String.of(
            this@CitationSurrogate.versionAlgorithmString,
            this@CitationSurrogate._versionAlgorithmString,
          ),
          this@CitationSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@CitationSurrogate.name, this@CitationSurrogate._name)
      title = R5String.of(this@CitationSurrogate.title, this@CitationSurrogate._title)
      status =
        Enumeration.of(
          this@CitationSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@CitationSurrogate._status,
        )
      experimental =
        R5Boolean.of(this@CitationSurrogate.experimental, this@CitationSurrogate._experimental)
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CitationSurrogate.date),
          this@CitationSurrogate._date,
        )
      publisher = R5String.of(this@CitationSurrogate.publisher, this@CitationSurrogate._publisher)
      contact = this@CitationSurrogate.contact
      description =
        Markdown.of(this@CitationSurrogate.description, this@CitationSurrogate._description)
      useContext = this@CitationSurrogate.useContext
      jurisdiction = this@CitationSurrogate.jurisdiction
      purpose = Markdown.of(this@CitationSurrogate.purpose, this@CitationSurrogate._purpose)
      copyright = Markdown.of(this@CitationSurrogate.copyright, this@CitationSurrogate._copyright)
      copyrightLabel =
        R5String.of(this@CitationSurrogate.copyrightLabel, this@CitationSurrogate._copyrightLabel)
      approvalDate =
        Date.of(
          FhirDate.fromString(this@CitationSurrogate.approvalDate),
          this@CitationSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@CitationSurrogate.lastReviewDate),
          this@CitationSurrogate._lastReviewDate,
        )
      effectivePeriod = this@CitationSurrogate.effectivePeriod
      author = this@CitationSurrogate.author
      editor = this@CitationSurrogate.editor
      reviewer = this@CitationSurrogate.reviewer
      endorser = this@CitationSurrogate.endorser
      summary = this@CitationSurrogate.summary
      classification = this@CitationSurrogate.classification
      note = this@CitationSurrogate.note
      currentState = this@CitationSurrogate.currentState
      statusDate = this@CitationSurrogate.statusDate
      relatedArtifact = this@CitationSurrogate.relatedArtifact
      citedArtifact = this@CitationSurrogate.citedArtifact
    }

  public companion object {
    public fun fromModel(model: Citation): CitationSurrogate =
      with(model) {
        CitationSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          effectivePeriod = this@with.effectivePeriod
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          summary = this@with.summary
          classification = this@with.classification
          note = this@with.note
          currentState = this@with.currentState
          statusDate = this@with.statusDate
          relatedArtifact = this@with.relatedArtifact
          citedArtifact = this@with.citedArtifact
        }
      }
  }
}
