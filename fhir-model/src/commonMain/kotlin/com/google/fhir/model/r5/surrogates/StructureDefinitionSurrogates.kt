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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.ElementDefinition
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.StructureDefinition
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class StructureDefinitionMappingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identity: KotlinString? = null,
  public var _identity: Element? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
) {
  public fun toModel(): StructureDefinition.Mapping =
    StructureDefinition.Mapping().apply {
      id = this@StructureDefinitionMappingSurrogate.id
      extension = this@StructureDefinitionMappingSurrogate.extension
      modifierExtension = this@StructureDefinitionMappingSurrogate.modifierExtension
      identity =
        Id.of(
          this@StructureDefinitionMappingSurrogate.identity,
          this@StructureDefinitionMappingSurrogate._identity,
        )
      uri =
        Uri.of(
          this@StructureDefinitionMappingSurrogate.uri,
          this@StructureDefinitionMappingSurrogate._uri,
        )
      name =
        R5String.of(
          this@StructureDefinitionMappingSurrogate.name,
          this@StructureDefinitionMappingSurrogate._name,
        )
      comment =
        R5String.of(
          this@StructureDefinitionMappingSurrogate.comment,
          this@StructureDefinitionMappingSurrogate._comment,
        )
    }

  public companion object {
    public fun fromModel(model: StructureDefinition.Mapping): StructureDefinitionMappingSurrogate =
      with(model) {
        StructureDefinitionMappingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identity = this@with.identity?.value
          _identity = this@with.identity?.toElement()
          uri = this@with.uri?.value
          _uri = this@with.uri?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureDefinitionContextSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
) {
  public fun toModel(): StructureDefinition.Context =
    StructureDefinition.Context().apply {
      id = this@StructureDefinitionContextSurrogate.id
      extension = this@StructureDefinitionContextSurrogate.extension
      modifierExtension = this@StructureDefinitionContextSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@StructureDefinitionContextSurrogate.type?.let {
            com.google.fhir.model.r5.StructureDefinition.ExtensionContextType.fromCode(it)
          },
          this@StructureDefinitionContextSurrogate._type,
        )
      expression =
        R5String.of(
          this@StructureDefinitionContextSurrogate.expression,
          this@StructureDefinitionContextSurrogate._expression,
        )
    }

  public companion object {
    public fun fromModel(model: StructureDefinition.Context): StructureDefinitionContextSurrogate =
      with(model) {
        StructureDefinitionContextSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          expression = this@with.expression?.value
          _expression = this@with.expression?.toElement()
        }
      }
  }
}

@Serializable
internal data class StructureDefinitionSnapshotSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var element: List<ElementDefinition?>? = null,
) {
  public fun toModel(): StructureDefinition.Snapshot =
    StructureDefinition.Snapshot().apply {
      id = this@StructureDefinitionSnapshotSurrogate.id
      extension = this@StructureDefinitionSnapshotSurrogate.extension
      modifierExtension = this@StructureDefinitionSnapshotSurrogate.modifierExtension
      element = this@StructureDefinitionSnapshotSurrogate.element
    }

  public companion object {
    public fun fromModel(
      model: StructureDefinition.Snapshot
    ): StructureDefinitionSnapshotSurrogate =
      with(model) {
        StructureDefinitionSnapshotSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          element = this@with.element
        }
      }
  }
}

@Serializable
internal data class StructureDefinitionDifferentialSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var element: List<ElementDefinition?>? = null,
) {
  public fun toModel(): StructureDefinition.Differential =
    StructureDefinition.Differential().apply {
      id = this@StructureDefinitionDifferentialSurrogate.id
      extension = this@StructureDefinitionDifferentialSurrogate.extension
      modifierExtension = this@StructureDefinitionDifferentialSurrogate.modifierExtension
      element = this@StructureDefinitionDifferentialSurrogate.element
    }

  public companion object {
    public fun fromModel(
      model: StructureDefinition.Differential
    ): StructureDefinitionDifferentialSurrogate =
      with(model) {
        StructureDefinitionDifferentialSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          element = this@with.element
        }
      }
  }
}

@Serializable
internal data class StructureDefinitionSurrogate(
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
  public var keyword: List<Coding?>? = null,
  public var fhirVersion: KotlinString? = null,
  public var _fhirVersion: Element? = null,
  public var mapping: List<StructureDefinition.Mapping>? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var `abstract`: KotlinBoolean? = null,
  public var _abstract: Element? = null,
  public var context: List<StructureDefinition.Context>? = null,
  public var contextInvariant: List<KotlinString?>? = null,
  public var _contextInvariant: List<Element?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var baseDefinition: KotlinString? = null,
  public var _baseDefinition: Element? = null,
  public var derivation: KotlinString? = null,
  public var _derivation: Element? = null,
  public var snapshot: StructureDefinition.Snapshot? = null,
  public var differential: StructureDefinition.Differential? = null,
) {
  public fun toModel(): StructureDefinition =
    StructureDefinition().apply {
      id = this@StructureDefinitionSurrogate.id
      meta = this@StructureDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@StructureDefinitionSurrogate.implicitRules,
          this@StructureDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@StructureDefinitionSurrogate.language,
          this@StructureDefinitionSurrogate._language,
        )
      text = this@StructureDefinitionSurrogate.text
      contained = this@StructureDefinitionSurrogate.contained
      extension = this@StructureDefinitionSurrogate.extension
      modifierExtension = this@StructureDefinitionSurrogate.modifierExtension
      url = Uri.of(this@StructureDefinitionSurrogate.url, this@StructureDefinitionSurrogate._url)
      identifier = this@StructureDefinitionSurrogate.identifier
      version =
        R5String.of(
          this@StructureDefinitionSurrogate.version,
          this@StructureDefinitionSurrogate._version,
        )
      versionAlgorithm =
        StructureDefinition.VersionAlgorithm?.from(
          R5String.of(
            this@StructureDefinitionSurrogate.versionAlgorithmString,
            this@StructureDefinitionSurrogate._versionAlgorithmString,
          ),
          this@StructureDefinitionSurrogate.versionAlgorithmCoding,
        )
      name =
        R5String.of(this@StructureDefinitionSurrogate.name, this@StructureDefinitionSurrogate._name)
      title =
        R5String.of(
          this@StructureDefinitionSurrogate.title,
          this@StructureDefinitionSurrogate._title,
        )
      status =
        Enumeration.of(
          this@StructureDefinitionSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@StructureDefinitionSurrogate._status,
        )
      experimental =
        R5Boolean.of(
          this@StructureDefinitionSurrogate.experimental,
          this@StructureDefinitionSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@StructureDefinitionSurrogate.date),
          this@StructureDefinitionSurrogate._date,
        )
      publisher =
        R5String.of(
          this@StructureDefinitionSurrogate.publisher,
          this@StructureDefinitionSurrogate._publisher,
        )
      contact = this@StructureDefinitionSurrogate.contact
      description =
        Markdown.of(
          this@StructureDefinitionSurrogate.description,
          this@StructureDefinitionSurrogate._description,
        )
      useContext = this@StructureDefinitionSurrogate.useContext
      jurisdiction = this@StructureDefinitionSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@StructureDefinitionSurrogate.purpose,
          this@StructureDefinitionSurrogate._purpose,
        )
      copyright =
        Markdown.of(
          this@StructureDefinitionSurrogate.copyright,
          this@StructureDefinitionSurrogate._copyright,
        )
      copyrightLabel =
        R5String.of(
          this@StructureDefinitionSurrogate.copyrightLabel,
          this@StructureDefinitionSurrogate._copyrightLabel,
        )
      keyword = this@StructureDefinitionSurrogate.keyword
      fhirVersion =
        Enumeration.of(
          this@StructureDefinitionSurrogate.fhirVersion?.let {
            com.google.fhir.model.r5.FHIRVersion.fromCode(it)
          },
          this@StructureDefinitionSurrogate._fhirVersion,
        )
      mapping = this@StructureDefinitionSurrogate.mapping
      kind =
        Enumeration.of(
          this@StructureDefinitionSurrogate.kind?.let {
            com.google.fhir.model.r5.StructureDefinition.StructureDefinitionKind.fromCode(it)
          },
          this@StructureDefinitionSurrogate._kind,
        )
      `abstract` =
        R5Boolean.of(
          this@StructureDefinitionSurrogate.`abstract`,
          this@StructureDefinitionSurrogate._abstract,
        )
      context = this@StructureDefinitionSurrogate.context
      contextInvariant =
        if (
          this@StructureDefinitionSurrogate.contextInvariant == null &&
            this@StructureDefinitionSurrogate._contextInvariant == null
        ) {
          null
        } else {
          (this@StructureDefinitionSurrogate.contextInvariant
              ?: List(this@StructureDefinitionSurrogate._contextInvariant!!.size) { null })
            .zip(
              this@StructureDefinitionSurrogate._contextInvariant
                ?: List(this@StructureDefinitionSurrogate.contextInvariant!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      type = Uri.of(this@StructureDefinitionSurrogate.type, this@StructureDefinitionSurrogate._type)
      baseDefinition =
        Canonical.of(
          this@StructureDefinitionSurrogate.baseDefinition,
          this@StructureDefinitionSurrogate._baseDefinition,
        )
      derivation =
        Enumeration.of(
          this@StructureDefinitionSurrogate.derivation?.let {
            com.google.fhir.model.r5.StructureDefinition.TypeDerivationRule.fromCode(it)
          },
          this@StructureDefinitionSurrogate._derivation,
        )
      snapshot = this@StructureDefinitionSurrogate.snapshot
      differential = this@StructureDefinitionSurrogate.differential
    }

  public companion object {
    public fun fromModel(model: StructureDefinition): StructureDefinitionSurrogate =
      with(model) {
        StructureDefinitionSurrogate().apply {
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
          keyword = this@with.keyword
          fhirVersion = this@with.fhirVersion?.value?.getCode()
          _fhirVersion = this@with.fhirVersion?.toElement()
          mapping = this@with.mapping
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          `abstract` = this@with.`abstract`?.value
          _abstract = this@with.`abstract`?.toElement()
          context = this@with.context
          contextInvariant =
            this@with.contextInvariant?.map { it?.value }?.takeUnless { it.all { it == null } }
          _contextInvariant =
            this@with.contextInvariant
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          baseDefinition = this@with.baseDefinition?.value
          _baseDefinition = this@with.baseDefinition?.toElement()
          derivation = this@with.derivation?.value?.getCode()
          _derivation = this@with.derivation?.toElement()
          snapshot = this@with.snapshot
          differential = this@with.differential
        }
      }
  }
}
