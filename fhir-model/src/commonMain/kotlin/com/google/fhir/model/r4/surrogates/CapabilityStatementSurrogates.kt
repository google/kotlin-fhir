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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.CapabilityStatement
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.UnsignedInt
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.Url
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CapabilityStatementSoftwareSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var releaseDate: KotlinString? = null,
  public var _releaseDate: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Software =
    CapabilityStatement.Software().apply {
      id = this@CapabilityStatementSoftwareSurrogate.id
      extension = this@CapabilityStatementSoftwareSurrogate.extension
      modifierExtension = this@CapabilityStatementSoftwareSurrogate.modifierExtension
      name =
        R4String.of(
          this@CapabilityStatementSoftwareSurrogate.name,
          this@CapabilityStatementSoftwareSurrogate._name,
        )
      version =
        R4String.of(
          this@CapabilityStatementSoftwareSurrogate.version,
          this@CapabilityStatementSoftwareSurrogate._version,
        )
      releaseDate =
        DateTime.of(
          FhirDateTime.fromString(this@CapabilityStatementSoftwareSurrogate.releaseDate),
          this@CapabilityStatementSoftwareSurrogate._releaseDate,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Software
    ): CapabilityStatementSoftwareSurrogate =
      with(model) {
        CapabilityStatementSoftwareSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          releaseDate = this@with.releaseDate?.value?.toString()
          _releaseDate = this@with.releaseDate?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementImplementationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var custodian: Reference? = null,
) {
  public fun toModel(): CapabilityStatement.Implementation =
    CapabilityStatement.Implementation().apply {
      id = this@CapabilityStatementImplementationSurrogate.id
      extension = this@CapabilityStatementImplementationSurrogate.extension
      modifierExtension = this@CapabilityStatementImplementationSurrogate.modifierExtension
      description =
        R4String.of(
          this@CapabilityStatementImplementationSurrogate.description,
          this@CapabilityStatementImplementationSurrogate._description,
        )
      url =
        Url.of(
          this@CapabilityStatementImplementationSurrogate.url,
          this@CapabilityStatementImplementationSurrogate._url,
        )
      custodian = this@CapabilityStatementImplementationSurrogate.custodian
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Implementation
    ): CapabilityStatementImplementationSurrogate =
      with(model) {
        CapabilityStatementImplementationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          custodian = this@with.custodian
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestSecuritySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var cors: KotlinBoolean? = null,
  public var _cors: Element? = null,
  public var service: List<CodeableConcept?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Security =
    CapabilityStatement.Rest.Security().apply {
      id = this@CapabilityStatementRestSecuritySurrogate.id
      extension = this@CapabilityStatementRestSecuritySurrogate.extension
      modifierExtension = this@CapabilityStatementRestSecuritySurrogate.modifierExtension
      cors =
        R4Boolean.of(
          this@CapabilityStatementRestSecuritySurrogate.cors,
          this@CapabilityStatementRestSecuritySurrogate._cors,
        )
      service = this@CapabilityStatementRestSecuritySurrogate.service
      description =
        Markdown.of(
          this@CapabilityStatementRestSecuritySurrogate.description,
          this@CapabilityStatementRestSecuritySurrogate._description,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Security
    ): CapabilityStatementRestSecuritySurrogate =
      with(model) {
        CapabilityStatementRestSecuritySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          cors = this@with.cors?.value
          _cors = this@with.cors?.toElement()
          service = this@with.service
          description = this@with.description?.value
          _description = this@with.description?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceInteractionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource.Interaction =
    CapabilityStatement.Rest.Resource.Interaction().apply {
      id = this@CapabilityStatementRestResourceInteractionSurrogate.id
      extension = this@CapabilityStatementRestResourceInteractionSurrogate.extension
      modifierExtension = this@CapabilityStatementRestResourceInteractionSurrogate.modifierExtension
      code =
        Enumeration.of(
          this@CapabilityStatementRestResourceInteractionSurrogate.code?.let {
            com.google.fhir.model.r4.CapabilityStatement.TypeRestfulInteraction.fromCode(it)
          },
          this@CapabilityStatementRestResourceInteractionSurrogate._code,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceInteractionSurrogate.documentation,
          this@CapabilityStatementRestResourceInteractionSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource.Interaction
    ): CapabilityStatementRestResourceInteractionSurrogate =
      with(model) {
        CapabilityStatementRestResourceInteractionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceSearchParamSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource.SearchParam =
    CapabilityStatement.Rest.Resource.SearchParam().apply {
      id = this@CapabilityStatementRestResourceSearchParamSurrogate.id
      extension = this@CapabilityStatementRestResourceSearchParamSurrogate.extension
      modifierExtension = this@CapabilityStatementRestResourceSearchParamSurrogate.modifierExtension
      name =
        R4String.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.name,
          this@CapabilityStatementRestResourceSearchParamSurrogate._name,
        )
      definition =
        Canonical.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.definition,
          this@CapabilityStatementRestResourceSearchParamSurrogate._definition,
        )
      type =
        Enumeration.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.type?.let {
            com.google.fhir.model.r4.SearchParamType.fromCode(it)
          },
          this@CapabilityStatementRestResourceSearchParamSurrogate._type,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.documentation,
          this@CapabilityStatementRestResourceSearchParamSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource.SearchParam
    ): CapabilityStatementRestResourceSearchParamSurrogate =
      with(model) {
        CapabilityStatementRestResourceSearchParamSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource.Operation =
    CapabilityStatement.Rest.Resource.Operation().apply {
      id = this@CapabilityStatementRestResourceOperationSurrogate.id
      extension = this@CapabilityStatementRestResourceOperationSurrogate.extension
      modifierExtension = this@CapabilityStatementRestResourceOperationSurrogate.modifierExtension
      name =
        R4String.of(
          this@CapabilityStatementRestResourceOperationSurrogate.name,
          this@CapabilityStatementRestResourceOperationSurrogate._name,
        )
      definition =
        Canonical.of(
          this@CapabilityStatementRestResourceOperationSurrogate.definition,
          this@CapabilityStatementRestResourceOperationSurrogate._definition,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceOperationSurrogate.documentation,
          this@CapabilityStatementRestResourceOperationSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource.Operation
    ): CapabilityStatementRestResourceOperationSurrogate =
      with(model) {
        CapabilityStatementRestResourceOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
  public var supportedProfile: List<KotlinString?>? = null,
  public var _supportedProfile: List<Element?>? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var interaction: List<CapabilityStatement.Rest.Resource.Interaction>? = null,
  public var versioning: KotlinString? = null,
  public var _versioning: Element? = null,
  public var readHistory: KotlinBoolean? = null,
  public var _readHistory: Element? = null,
  public var updateCreate: KotlinBoolean? = null,
  public var _updateCreate: Element? = null,
  public var conditionalCreate: KotlinBoolean? = null,
  public var _conditionalCreate: Element? = null,
  public var conditionalRead: KotlinString? = null,
  public var _conditionalRead: Element? = null,
  public var conditionalUpdate: KotlinBoolean? = null,
  public var _conditionalUpdate: Element? = null,
  public var conditionalDelete: KotlinString? = null,
  public var _conditionalDelete: Element? = null,
  public var referencePolicy: List<KotlinString?>? = null,
  public var _referencePolicy: List<Element?>? = null,
  public var searchInclude: List<KotlinString?>? = null,
  public var _searchInclude: List<Element?>? = null,
  public var searchRevInclude: List<KotlinString?>? = null,
  public var _searchRevInclude: List<Element?>? = null,
  public var searchParam: List<CapabilityStatement.Rest.Resource.SearchParam>? = null,
  public var operation: List<CapabilityStatement.Rest.Resource.Operation>? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource =
    CapabilityStatement.Rest.Resource().apply {
      id = this@CapabilityStatementRestResourceSurrogate.id
      extension = this@CapabilityStatementRestResourceSurrogate.extension
      modifierExtension = this@CapabilityStatementRestResourceSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@CapabilityStatementRestResourceSurrogate.type?.let {
            com.google.fhir.model.r4.ResourceType.fromCode(it)
          },
          this@CapabilityStatementRestResourceSurrogate._type,
        )
      profile =
        Canonical.of(
          this@CapabilityStatementRestResourceSurrogate.profile,
          this@CapabilityStatementRestResourceSurrogate._profile,
        )
      supportedProfile =
        if (
          this@CapabilityStatementRestResourceSurrogate.supportedProfile == null &&
            this@CapabilityStatementRestResourceSurrogate._supportedProfile == null
        ) {
          null
        } else {
          (this@CapabilityStatementRestResourceSurrogate.supportedProfile
              ?: List(this@CapabilityStatementRestResourceSurrogate._supportedProfile!!.size) {
                null
              })
            .zip(
              this@CapabilityStatementRestResourceSurrogate._supportedProfile
                ?: List(this@CapabilityStatementRestResourceSurrogate.supportedProfile!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceSurrogate.documentation,
          this@CapabilityStatementRestResourceSurrogate._documentation,
        )
      interaction = this@CapabilityStatementRestResourceSurrogate.interaction
      versioning =
        Enumeration.of(
          this@CapabilityStatementRestResourceSurrogate.versioning?.let {
            com.google.fhir.model.r4.CapabilityStatement.ResourceVersionPolicy.fromCode(it)
          },
          this@CapabilityStatementRestResourceSurrogate._versioning,
        )
      readHistory =
        R4Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.readHistory,
          this@CapabilityStatementRestResourceSurrogate._readHistory,
        )
      updateCreate =
        R4Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.updateCreate,
          this@CapabilityStatementRestResourceSurrogate._updateCreate,
        )
      conditionalCreate =
        R4Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalCreate,
          this@CapabilityStatementRestResourceSurrogate._conditionalCreate,
        )
      conditionalRead =
        Enumeration.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalRead?.let {
            com.google.fhir.model.r4.CapabilityStatement.ConditionalReadStatus.fromCode(it)
          },
          this@CapabilityStatementRestResourceSurrogate._conditionalRead,
        )
      conditionalUpdate =
        R4Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalUpdate,
          this@CapabilityStatementRestResourceSurrogate._conditionalUpdate,
        )
      conditionalDelete =
        Enumeration.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalDelete?.let {
            com.google.fhir.model.r4.CapabilityStatement.ConditionalDeleteStatus.fromCode(it)
          },
          this@CapabilityStatementRestResourceSurrogate._conditionalDelete,
        )
      referencePolicy =
        if (
          this@CapabilityStatementRestResourceSurrogate.referencePolicy == null &&
            this@CapabilityStatementRestResourceSurrogate._referencePolicy == null
        ) {
          null
        } else {
          (this@CapabilityStatementRestResourceSurrogate.referencePolicy
              ?: List(this@CapabilityStatementRestResourceSurrogate._referencePolicy!!.size) {
                null
              })
            .zip(
              this@CapabilityStatementRestResourceSurrogate._referencePolicy
                ?: List(this@CapabilityStatementRestResourceSurrogate.referencePolicy!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let {
                  com.google.fhir.model.r4.CapabilityStatement.ReferenceHandlingPolicy.fromCode(it)
                },
                element,
              )
            }
        }
      searchInclude =
        if (
          this@CapabilityStatementRestResourceSurrogate.searchInclude == null &&
            this@CapabilityStatementRestResourceSurrogate._searchInclude == null
        ) {
          null
        } else {
          (this@CapabilityStatementRestResourceSurrogate.searchInclude
              ?: List(this@CapabilityStatementRestResourceSurrogate._searchInclude!!.size) { null })
            .zip(
              this@CapabilityStatementRestResourceSurrogate._searchInclude
                ?: List(this@CapabilityStatementRestResourceSurrogate.searchInclude!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      searchRevInclude =
        if (
          this@CapabilityStatementRestResourceSurrogate.searchRevInclude == null &&
            this@CapabilityStatementRestResourceSurrogate._searchRevInclude == null
        ) {
          null
        } else {
          (this@CapabilityStatementRestResourceSurrogate.searchRevInclude
              ?: List(this@CapabilityStatementRestResourceSurrogate._searchRevInclude!!.size) {
                null
              })
            .zip(
              this@CapabilityStatementRestResourceSurrogate._searchRevInclude
                ?: List(this@CapabilityStatementRestResourceSurrogate.searchRevInclude!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      searchParam = this@CapabilityStatementRestResourceSurrogate.searchParam
      operation = this@CapabilityStatementRestResourceSurrogate.operation
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource
    ): CapabilityStatementRestResourceSurrogate =
      with(model) {
        CapabilityStatementRestResourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          profile = this@with.profile?.value
          _profile = this@with.profile?.toElement()
          supportedProfile =
            this@with.supportedProfile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _supportedProfile =
            this@with.supportedProfile
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          interaction = this@with.interaction
          versioning = this@with.versioning?.value?.getCode()
          _versioning = this@with.versioning?.toElement()
          readHistory = this@with.readHistory?.value
          _readHistory = this@with.readHistory?.toElement()
          updateCreate = this@with.updateCreate?.value
          _updateCreate = this@with.updateCreate?.toElement()
          conditionalCreate = this@with.conditionalCreate?.value
          _conditionalCreate = this@with.conditionalCreate?.toElement()
          conditionalRead = this@with.conditionalRead?.value?.getCode()
          _conditionalRead = this@with.conditionalRead?.toElement()
          conditionalUpdate = this@with.conditionalUpdate?.value
          _conditionalUpdate = this@with.conditionalUpdate?.toElement()
          conditionalDelete = this@with.conditionalDelete?.value?.getCode()
          _conditionalDelete = this@with.conditionalDelete?.toElement()
          referencePolicy =
            this@with.referencePolicy
              ?.map { it?.value?.getCode() }
              ?.takeUnless { it.all { it == null } }
          _referencePolicy =
            this@with.referencePolicy?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          searchInclude =
            this@with.searchInclude?.map { it?.value }?.takeUnless { it.all { it == null } }
          _searchInclude =
            this@with.searchInclude?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          searchRevInclude =
            this@with.searchRevInclude?.map { it?.value }?.takeUnless { it.all { it == null } }
          _searchRevInclude =
            this@with.searchRevInclude
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          searchParam = this@with.searchParam
          operation = this@with.operation
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestInteractionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Interaction =
    CapabilityStatement.Rest.Interaction().apply {
      id = this@CapabilityStatementRestInteractionSurrogate.id
      extension = this@CapabilityStatementRestInteractionSurrogate.extension
      modifierExtension = this@CapabilityStatementRestInteractionSurrogate.modifierExtension
      code =
        Enumeration.of(
          this@CapabilityStatementRestInteractionSurrogate.code?.let {
            com.google.fhir.model.r4.CapabilityStatement.SystemRestfulInteraction.fromCode(it)
          },
          this@CapabilityStatementRestInteractionSurrogate._code,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementRestInteractionSurrogate.documentation,
          this@CapabilityStatementRestInteractionSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Interaction
    ): CapabilityStatementRestInteractionSurrogate =
      with(model) {
        CapabilityStatementRestInteractionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementRestSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var security: CapabilityStatement.Rest.Security? = null,
  public var resource: List<CapabilityStatement.Rest.Resource>? = null,
  public var interaction: List<CapabilityStatement.Rest.Interaction>? = null,
  public var searchParam: List<CapabilityStatement.Rest.Resource.SearchParam?>? = null,
  public var operation: List<CapabilityStatement.Rest.Resource.Operation?>? = null,
  public var compartment: List<KotlinString?>? = null,
  public var _compartment: List<Element?>? = null,
) {
  public fun toModel(): CapabilityStatement.Rest =
    CapabilityStatement.Rest().apply {
      id = this@CapabilityStatementRestSurrogate.id
      extension = this@CapabilityStatementRestSurrogate.extension
      modifierExtension = this@CapabilityStatementRestSurrogate.modifierExtension
      mode =
        Enumeration.of(
          this@CapabilityStatementRestSurrogate.mode?.let {
            com.google.fhir.model.r4.CapabilityStatement.RestfulCapabilityMode.fromCode(it)
          },
          this@CapabilityStatementRestSurrogate._mode,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementRestSurrogate.documentation,
          this@CapabilityStatementRestSurrogate._documentation,
        )
      security = this@CapabilityStatementRestSurrogate.security
      resource = this@CapabilityStatementRestSurrogate.resource
      interaction = this@CapabilityStatementRestSurrogate.interaction
      searchParam = this@CapabilityStatementRestSurrogate.searchParam
      operation = this@CapabilityStatementRestSurrogate.operation
      compartment =
        if (
          this@CapabilityStatementRestSurrogate.compartment == null &&
            this@CapabilityStatementRestSurrogate._compartment == null
        ) {
          null
        } else {
          (this@CapabilityStatementRestSurrogate.compartment
              ?: List(this@CapabilityStatementRestSurrogate._compartment!!.size) { null })
            .zip(
              this@CapabilityStatementRestSurrogate._compartment
                ?: List(this@CapabilityStatementRestSurrogate.compartment!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: CapabilityStatement.Rest): CapabilityStatementRestSurrogate =
      with(model) {
        CapabilityStatementRestSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          security = this@with.security
          resource = this@with.resource
          interaction = this@with.interaction
          searchParam = this@with.searchParam
          operation = this@with.operation
          compartment =
            this@with.compartment?.map { it?.value }?.takeUnless { it.all { it == null } }
          _compartment =
            this@with.compartment?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementMessagingEndpointSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var protocol: Coding? = null,
  public var address: KotlinString? = null,
  public var _address: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Messaging.Endpoint =
    CapabilityStatement.Messaging.Endpoint().apply {
      id = this@CapabilityStatementMessagingEndpointSurrogate.id
      extension = this@CapabilityStatementMessagingEndpointSurrogate.extension
      modifierExtension = this@CapabilityStatementMessagingEndpointSurrogate.modifierExtension
      protocol = this@CapabilityStatementMessagingEndpointSurrogate.protocol
      address =
        Url.of(
          this@CapabilityStatementMessagingEndpointSurrogate.address,
          this@CapabilityStatementMessagingEndpointSurrogate._address,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Messaging.Endpoint
    ): CapabilityStatementMessagingEndpointSurrogate =
      with(model) {
        CapabilityStatementMessagingEndpointSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          protocol = this@with.protocol
          address = this@with.address?.value
          _address = this@with.address?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementMessagingSupportedMessageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Messaging.SupportedMessage =
    CapabilityStatement.Messaging.SupportedMessage().apply {
      id = this@CapabilityStatementMessagingSupportedMessageSurrogate.id
      extension = this@CapabilityStatementMessagingSupportedMessageSurrogate.extension
      modifierExtension =
        this@CapabilityStatementMessagingSupportedMessageSurrogate.modifierExtension
      mode =
        Enumeration.of(
          this@CapabilityStatementMessagingSupportedMessageSurrogate.mode?.let {
            com.google.fhir.model.r4.CapabilityStatement.EventCapabilityMode.fromCode(it)
          },
          this@CapabilityStatementMessagingSupportedMessageSurrogate._mode,
        )
      definition =
        Canonical.of(
          this@CapabilityStatementMessagingSupportedMessageSurrogate.definition,
          this@CapabilityStatementMessagingSupportedMessageSurrogate._definition,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Messaging.SupportedMessage
    ): CapabilityStatementMessagingSupportedMessageSurrogate =
      with(model) {
        CapabilityStatementMessagingSupportedMessageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementMessagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var endpoint: List<CapabilityStatement.Messaging.Endpoint>? = null,
  public var reliableCache: Int? = null,
  public var _reliableCache: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var supportedMessage: List<CapabilityStatement.Messaging.SupportedMessage>? = null,
) {
  public fun toModel(): CapabilityStatement.Messaging =
    CapabilityStatement.Messaging().apply {
      id = this@CapabilityStatementMessagingSurrogate.id
      extension = this@CapabilityStatementMessagingSurrogate.extension
      modifierExtension = this@CapabilityStatementMessagingSurrogate.modifierExtension
      endpoint = this@CapabilityStatementMessagingSurrogate.endpoint
      reliableCache =
        UnsignedInt.of(
          this@CapabilityStatementMessagingSurrogate.reliableCache,
          this@CapabilityStatementMessagingSurrogate._reliableCache,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementMessagingSurrogate.documentation,
          this@CapabilityStatementMessagingSurrogate._documentation,
        )
      supportedMessage = this@CapabilityStatementMessagingSurrogate.supportedMessage
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Messaging
    ): CapabilityStatementMessagingSurrogate =
      with(model) {
        CapabilityStatementMessagingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          endpoint = this@with.endpoint
          reliableCache = this@with.reliableCache?.value
          _reliableCache = this@with.reliableCache?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          supportedMessage = this@with.supportedMessage
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementDocumentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Document =
    CapabilityStatement.Document().apply {
      id = this@CapabilityStatementDocumentSurrogate.id
      extension = this@CapabilityStatementDocumentSurrogate.extension
      modifierExtension = this@CapabilityStatementDocumentSurrogate.modifierExtension
      mode =
        Enumeration.of(
          this@CapabilityStatementDocumentSurrogate.mode?.let {
            com.google.fhir.model.r4.CapabilityStatement.DocumentMode.fromCode(it)
          },
          this@CapabilityStatementDocumentSurrogate._mode,
        )
      documentation =
        Markdown.of(
          this@CapabilityStatementDocumentSurrogate.documentation,
          this@CapabilityStatementDocumentSurrogate._documentation,
        )
      profile =
        Canonical.of(
          this@CapabilityStatementDocumentSurrogate.profile,
          this@CapabilityStatementDocumentSurrogate._profile,
        )
    }

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Document
    ): CapabilityStatementDocumentSurrogate =
      with(model) {
        CapabilityStatementDocumentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
          profile = this@with.profile?.value
          _profile = this@with.profile?.toElement()
        }
      }
  }
}

@Serializable
internal data class CapabilityStatementSurrogate(
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
  public var version: KotlinString? = null,
  public var _version: Element? = null,
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
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var instantiates: List<KotlinString?>? = null,
  public var _instantiates: List<Element?>? = null,
  public var imports: List<KotlinString?>? = null,
  public var _imports: List<Element?>? = null,
  public var software: CapabilityStatement.Software? = null,
  public var implementation: CapabilityStatement.Implementation? = null,
  public var fhirVersion: KotlinString? = null,
  public var _fhirVersion: Element? = null,
  public var format: List<KotlinString?>? = null,
  public var _format: List<Element?>? = null,
  public var patchFormat: List<KotlinString?>? = null,
  public var _patchFormat: List<Element?>? = null,
  public var implementationGuide: List<KotlinString?>? = null,
  public var _implementationGuide: List<Element?>? = null,
  public var rest: List<CapabilityStatement.Rest>? = null,
  public var messaging: List<CapabilityStatement.Messaging>? = null,
  public var document: List<CapabilityStatement.Document>? = null,
) {
  public fun toModel(): CapabilityStatement =
    CapabilityStatement().apply {
      id = this@CapabilityStatementSurrogate.id
      meta = this@CapabilityStatementSurrogate.meta
      implicitRules =
        Uri.of(
          this@CapabilityStatementSurrogate.implicitRules,
          this@CapabilityStatementSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@CapabilityStatementSurrogate.language,
          this@CapabilityStatementSurrogate._language,
        )
      text = this@CapabilityStatementSurrogate.text
      contained = this@CapabilityStatementSurrogate.contained
      extension = this@CapabilityStatementSurrogate.extension
      modifierExtension = this@CapabilityStatementSurrogate.modifierExtension
      url = Uri.of(this@CapabilityStatementSurrogate.url, this@CapabilityStatementSurrogate._url)
      version =
        R4String.of(
          this@CapabilityStatementSurrogate.version,
          this@CapabilityStatementSurrogate._version,
        )
      name =
        R4String.of(this@CapabilityStatementSurrogate.name, this@CapabilityStatementSurrogate._name)
      title =
        R4String.of(
          this@CapabilityStatementSurrogate.title,
          this@CapabilityStatementSurrogate._title,
        )
      status =
        Enumeration.of(
          this@CapabilityStatementSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@CapabilityStatementSurrogate._status,
        )
      experimental =
        R4Boolean.of(
          this@CapabilityStatementSurrogate.experimental,
          this@CapabilityStatementSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CapabilityStatementSurrogate.date),
          this@CapabilityStatementSurrogate._date,
        )
      publisher =
        R4String.of(
          this@CapabilityStatementSurrogate.publisher,
          this@CapabilityStatementSurrogate._publisher,
        )
      contact = this@CapabilityStatementSurrogate.contact
      description =
        Markdown.of(
          this@CapabilityStatementSurrogate.description,
          this@CapabilityStatementSurrogate._description,
        )
      useContext = this@CapabilityStatementSurrogate.useContext
      jurisdiction = this@CapabilityStatementSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@CapabilityStatementSurrogate.purpose,
          this@CapabilityStatementSurrogate._purpose,
        )
      copyright =
        Markdown.of(
          this@CapabilityStatementSurrogate.copyright,
          this@CapabilityStatementSurrogate._copyright,
        )
      kind =
        Enumeration.of(
          this@CapabilityStatementSurrogate.kind?.let {
            com.google.fhir.model.r4.CapabilityStatement.CapabilityStatementKind.fromCode(it)
          },
          this@CapabilityStatementSurrogate._kind,
        )
      instantiates =
        if (
          this@CapabilityStatementSurrogate.instantiates == null &&
            this@CapabilityStatementSurrogate._instantiates == null
        ) {
          null
        } else {
          (this@CapabilityStatementSurrogate.instantiates
              ?: List(this@CapabilityStatementSurrogate._instantiates!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._instantiates
                ?: List(this@CapabilityStatementSurrogate.instantiates!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      imports =
        if (
          this@CapabilityStatementSurrogate.imports == null &&
            this@CapabilityStatementSurrogate._imports == null
        ) {
          null
        } else {
          (this@CapabilityStatementSurrogate.imports
              ?: List(this@CapabilityStatementSurrogate._imports!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._imports
                ?: List(this@CapabilityStatementSurrogate.imports!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      software = this@CapabilityStatementSurrogate.software
      implementation = this@CapabilityStatementSurrogate.implementation
      fhirVersion =
        Enumeration.of(
          this@CapabilityStatementSurrogate.fhirVersion?.let {
            com.google.fhir.model.r4.FHIRVersion.fromCode(it)
          },
          this@CapabilityStatementSurrogate._fhirVersion,
        )
      format =
        if (
          this@CapabilityStatementSurrogate.format == null &&
            this@CapabilityStatementSurrogate._format == null
        ) {
          null
        } else {
          (this@CapabilityStatementSurrogate.format
              ?: List(this@CapabilityStatementSurrogate._format!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._format
                ?: List(this@CapabilityStatementSurrogate.format!!.size) { null }
            )
            .mapNotNull { (value, element) -> Code.of(value, element) }
        }
      patchFormat =
        if (
          this@CapabilityStatementSurrogate.patchFormat == null &&
            this@CapabilityStatementSurrogate._patchFormat == null
        ) {
          null
        } else {
          (this@CapabilityStatementSurrogate.patchFormat
              ?: List(this@CapabilityStatementSurrogate._patchFormat!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._patchFormat
                ?: List(this@CapabilityStatementSurrogate.patchFormat!!.size) { null }
            )
            .mapNotNull { (value, element) -> Code.of(value, element) }
        }
      implementationGuide =
        if (
          this@CapabilityStatementSurrogate.implementationGuide == null &&
            this@CapabilityStatementSurrogate._implementationGuide == null
        ) {
          null
        } else {
          (this@CapabilityStatementSurrogate.implementationGuide
              ?: List(this@CapabilityStatementSurrogate._implementationGuide!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._implementationGuide
                ?: List(this@CapabilityStatementSurrogate.implementationGuide!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      rest = this@CapabilityStatementSurrogate.rest
      messaging = this@CapabilityStatementSurrogate.messaging
      document = this@CapabilityStatementSurrogate.document
    }

  public companion object {
    public fun fromModel(model: CapabilityStatement): CapabilityStatementSurrogate =
      with(model) {
        CapabilityStatementSurrogate().apply {
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
          version = this@with.version?.value
          _version = this@with.version?.toElement()
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
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          instantiates =
            this@with.instantiates?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiates =
            this@with.instantiates?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          imports = this@with.imports?.map { it?.value }?.takeUnless { it.all { it == null } }
          _imports =
            this@with.imports?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          software = this@with.software
          implementation = this@with.implementation
          fhirVersion = this@with.fhirVersion?.value?.getCode()
          _fhirVersion = this@with.fhirVersion?.toElement()
          format = this@with.format?.map { it?.value }?.takeUnless { it.all { it == null } }
          _format = this@with.format?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          patchFormat =
            this@with.patchFormat?.map { it?.value }?.takeUnless { it.all { it == null } }
          _patchFormat =
            this@with.patchFormat?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          implementationGuide =
            this@with.implementationGuide?.map { it?.value }?.takeUnless { it.all { it == null } }
          _implementationGuide =
            this@with.implementationGuide
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          rest = this@with.rest
          messaging = this@with.messaging
          document = this@with.document
        }
      }
  }
}
