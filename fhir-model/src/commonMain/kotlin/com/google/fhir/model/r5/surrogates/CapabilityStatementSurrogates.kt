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
import com.google.fhir.model.r5.CapabilityStatement
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CapabilityStatementSoftwareSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var releaseDate: KotlinString? = null,
  public var _releaseDate: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Software =
    CapabilityStatement.Software(
      id = this@CapabilityStatementSoftwareSurrogate.id,
      extension = this@CapabilityStatementSoftwareSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementSoftwareSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@CapabilityStatementSoftwareSurrogate.name,
          this@CapabilityStatementSoftwareSurrogate._name,
        )!!,
      version =
        R5String.of(
          this@CapabilityStatementSoftwareSurrogate.version,
          this@CapabilityStatementSoftwareSurrogate._version,
        ),
      releaseDate =
        DateTime.of(
          FhirDateTime.fromString(this@CapabilityStatementSoftwareSurrogate.releaseDate),
          this@CapabilityStatementSoftwareSurrogate._releaseDate,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Software
    ): CapabilityStatementSoftwareSurrogate =
      with(model) {
        CapabilityStatementSoftwareSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          releaseDate = this@with.releaseDate?.value?.toString(),
          _releaseDate = this@with.releaseDate?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementImplementationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var custodian: Reference? = null,
) {
  public fun toModel(): CapabilityStatement.Implementation =
    CapabilityStatement.Implementation(
      id = this@CapabilityStatementImplementationSurrogate.id,
      extension = this@CapabilityStatementImplementationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementImplementationSurrogate.modifierExtension ?: mutableListOf(),
      description =
        Markdown.of(
          this@CapabilityStatementImplementationSurrogate.description,
          this@CapabilityStatementImplementationSurrogate._description,
        )!!,
      url =
        Url.of(
          this@CapabilityStatementImplementationSurrogate.url,
          this@CapabilityStatementImplementationSurrogate._url,
        ),
      custodian = this@CapabilityStatementImplementationSurrogate.custodian,
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Implementation
    ): CapabilityStatementImplementationSurrogate =
      with(model) {
        CapabilityStatementImplementationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description.value,
          _description = this@with.description.toElement(),
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          custodian = this@with.custodian,
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestSecuritySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var cors: KotlinBoolean? = null,
  public var _cors: Element? = null,
  public var service: MutableList<CodeableConcept>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Security =
    CapabilityStatement.Rest.Security(
      id = this@CapabilityStatementRestSecuritySurrogate.id,
      extension = this@CapabilityStatementRestSecuritySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestSecuritySurrogate.modifierExtension ?: mutableListOf(),
      cors =
        R5Boolean.of(
          this@CapabilityStatementRestSecuritySurrogate.cors,
          this@CapabilityStatementRestSecuritySurrogate._cors,
        ),
      service = this@CapabilityStatementRestSecuritySurrogate.service ?: mutableListOf(),
      description =
        Markdown.of(
          this@CapabilityStatementRestSecuritySurrogate.description,
          this@CapabilityStatementRestSecuritySurrogate._description,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Security
    ): CapabilityStatementRestSecuritySurrogate =
      with(model) {
        CapabilityStatementRestSecuritySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          cors = this@with.cors?.value,
          _cors = this@with.cors?.toElement(),
          service = this@with.service.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceInteractionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource.Interaction =
    CapabilityStatement.Rest.Resource.Interaction(
      id = this@CapabilityStatementRestResourceInteractionSurrogate.id,
      extension =
        this@CapabilityStatementRestResourceInteractionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestResourceInteractionSurrogate.modifierExtension
          ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r5.CapabilityStatement.TypeRestfulInteraction.fromCode(
            this@CapabilityStatementRestResourceInteractionSurrogate.code!!
          ),
          this@CapabilityStatementRestResourceInteractionSurrogate._code,
        ),
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceInteractionSurrogate.documentation,
          this@CapabilityStatementRestResourceInteractionSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource.Interaction
    ): CapabilityStatementRestResourceInteractionSurrogate =
      with(model) {
        CapabilityStatementRestResourceInteractionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceSearchParamSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
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
    CapabilityStatement.Rest.Resource.SearchParam(
      id = this@CapabilityStatementRestResourceSearchParamSurrogate.id,
      extension =
        this@CapabilityStatementRestResourceSearchParamSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestResourceSearchParamSurrogate.modifierExtension
          ?: mutableListOf(),
      name =
        R5String.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.name,
          this@CapabilityStatementRestResourceSearchParamSurrogate._name,
        )!!,
      definition =
        Canonical.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.definition,
          this@CapabilityStatementRestResourceSearchParamSurrogate._definition,
        ),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.SearchParamType.fromCode(
            this@CapabilityStatementRestResourceSearchParamSurrogate.type!!
          ),
          this@CapabilityStatementRestResourceSearchParamSurrogate._type,
        ),
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceSearchParamSurrogate.documentation,
          this@CapabilityStatementRestResourceSearchParamSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource.SearchParam
    ): CapabilityStatementRestResourceSearchParamSurrogate =
      with(model) {
        CapabilityStatementRestResourceSearchParamSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          definition = this@with.definition?.value,
          _definition = this@with.definition?.toElement(),
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource.Operation =
    CapabilityStatement.Rest.Resource.Operation(
      id = this@CapabilityStatementRestResourceOperationSurrogate.id,
      extension =
        this@CapabilityStatementRestResourceOperationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestResourceOperationSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@CapabilityStatementRestResourceOperationSurrogate.name,
          this@CapabilityStatementRestResourceOperationSurrogate._name,
        )!!,
      definition =
        Canonical.of(
          this@CapabilityStatementRestResourceOperationSurrogate.definition,
          this@CapabilityStatementRestResourceOperationSurrogate._definition,
        )!!,
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceOperationSurrogate.documentation,
          this@CapabilityStatementRestResourceOperationSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource.Operation
    ): CapabilityStatementRestResourceOperationSurrogate =
      with(model) {
        CapabilityStatementRestResourceOperationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          definition = this@with.definition.value,
          _definition = this@with.definition.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
  public var supportedProfile: MutableList<KotlinString?>? = null,
  public var _supportedProfile: MutableList<Element?>? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var interaction: MutableList<CapabilityStatement.Rest.Resource.Interaction>? = null,
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
  public var conditionalPatch: KotlinBoolean? = null,
  public var _conditionalPatch: Element? = null,
  public var conditionalDelete: KotlinString? = null,
  public var _conditionalDelete: Element? = null,
  public var referencePolicy: MutableList<KotlinString?>? = null,
  public var _referencePolicy: MutableList<Element?>? = null,
  public var searchInclude: MutableList<KotlinString?>? = null,
  public var _searchInclude: MutableList<Element?>? = null,
  public var searchRevInclude: MutableList<KotlinString?>? = null,
  public var _searchRevInclude: MutableList<Element?>? = null,
  public var searchParam: MutableList<CapabilityStatement.Rest.Resource.SearchParam>? = null,
  public var operation: MutableList<CapabilityStatement.Rest.Resource.Operation>? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Resource =
    CapabilityStatement.Rest.Resource(
      id = this@CapabilityStatementRestResourceSurrogate.id,
      extension = this@CapabilityStatementRestResourceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestResourceSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.ResourceType.fromCode(
            this@CapabilityStatementRestResourceSurrogate.type!!
          ),
          this@CapabilityStatementRestResourceSurrogate._type,
        ),
      profile =
        Canonical.of(
          this@CapabilityStatementRestResourceSurrogate.profile,
          this@CapabilityStatementRestResourceSurrogate._profile,
        ),
      supportedProfile =
        if (
          this@CapabilityStatementRestResourceSurrogate.supportedProfile == null &&
            this@CapabilityStatementRestResourceSurrogate._supportedProfile == null
        ) {
          mutableListOf()
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
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      documentation =
        Markdown.of(
          this@CapabilityStatementRestResourceSurrogate.documentation,
          this@CapabilityStatementRestResourceSurrogate._documentation,
        ),
      interaction = this@CapabilityStatementRestResourceSurrogate.interaction ?: mutableListOf(),
      versioning =
        this@CapabilityStatementRestResourceSurrogate.versioning?.let {
          Enumeration.of(
            com.google.fhir.model.r5.CapabilityStatement.ResourceVersionPolicy.fromCode(it!!),
            this@CapabilityStatementRestResourceSurrogate._versioning,
          )
        },
      readHistory =
        R5Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.readHistory,
          this@CapabilityStatementRestResourceSurrogate._readHistory,
        ),
      updateCreate =
        R5Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.updateCreate,
          this@CapabilityStatementRestResourceSurrogate._updateCreate,
        ),
      conditionalCreate =
        R5Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalCreate,
          this@CapabilityStatementRestResourceSurrogate._conditionalCreate,
        ),
      conditionalRead =
        this@CapabilityStatementRestResourceSurrogate.conditionalRead?.let {
          Enumeration.of(
            com.google.fhir.model.r5.CapabilityStatement.ConditionalReadStatus.fromCode(it!!),
            this@CapabilityStatementRestResourceSurrogate._conditionalRead,
          )
        },
      conditionalUpdate =
        R5Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalUpdate,
          this@CapabilityStatementRestResourceSurrogate._conditionalUpdate,
        ),
      conditionalPatch =
        R5Boolean.of(
          this@CapabilityStatementRestResourceSurrogate.conditionalPatch,
          this@CapabilityStatementRestResourceSurrogate._conditionalPatch,
        ),
      conditionalDelete =
        this@CapabilityStatementRestResourceSurrogate.conditionalDelete?.let {
          Enumeration.of(
            com.google.fhir.model.r5.CapabilityStatement.ConditionalDeleteStatus.fromCode(it!!),
            this@CapabilityStatementRestResourceSurrogate._conditionalDelete,
          )
        },
      referencePolicy =
        if (
          this@CapabilityStatementRestResourceSurrogate.referencePolicy == null &&
            this@CapabilityStatementRestResourceSurrogate._referencePolicy == null
        ) {
          mutableListOf()
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
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.CapabilityStatement.ReferenceHandlingPolicy.fromCode(
                    it!!
                  )!!
                },
                element,
              )
            }
            .toMutableList()
        },
      searchInclude =
        if (
          this@CapabilityStatementRestResourceSurrogate.searchInclude == null &&
            this@CapabilityStatementRestResourceSurrogate._searchInclude == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementRestResourceSurrogate.searchInclude
              ?: List(this@CapabilityStatementRestResourceSurrogate._searchInclude!!.size) { null })
            .zip(
              this@CapabilityStatementRestResourceSurrogate._searchInclude
                ?: List(this@CapabilityStatementRestResourceSurrogate.searchInclude!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      searchRevInclude =
        if (
          this@CapabilityStatementRestResourceSurrogate.searchRevInclude == null &&
            this@CapabilityStatementRestResourceSurrogate._searchRevInclude == null
        ) {
          mutableListOf()
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
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      searchParam = this@CapabilityStatementRestResourceSurrogate.searchParam ?: mutableListOf(),
      operation = this@CapabilityStatementRestResourceSurrogate.operation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Resource
    ): CapabilityStatementRestResourceSurrogate =
      with(model) {
        CapabilityStatementRestResourceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          profile = this@with.profile?.value,
          _profile = this@with.profile?.toElement(),
          supportedProfile =
            this@with.supportedProfile
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _supportedProfile =
            this@with.supportedProfile
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          interaction = this@with.interaction.takeUnless { it.all { it == null } },
          versioning = this@with.versioning?.value?.getCode(),
          _versioning = this@with.versioning?.toElement(),
          readHistory = this@with.readHistory?.value,
          _readHistory = this@with.readHistory?.toElement(),
          updateCreate = this@with.updateCreate?.value,
          _updateCreate = this@with.updateCreate?.toElement(),
          conditionalCreate = this@with.conditionalCreate?.value,
          _conditionalCreate = this@with.conditionalCreate?.toElement(),
          conditionalRead = this@with.conditionalRead?.value?.getCode(),
          _conditionalRead = this@with.conditionalRead?.toElement(),
          conditionalUpdate = this@with.conditionalUpdate?.value,
          _conditionalUpdate = this@with.conditionalUpdate?.toElement(),
          conditionalPatch = this@with.conditionalPatch?.value,
          _conditionalPatch = this@with.conditionalPatch?.toElement(),
          conditionalDelete = this@with.conditionalDelete?.value?.getCode(),
          _conditionalDelete = this@with.conditionalDelete?.toElement(),
          referencePolicy =
            this@with.referencePolicy
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _referencePolicy =
            this@with.referencePolicy
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          searchInclude =
            this@with.searchInclude
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _searchInclude =
            this@with.searchInclude
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          searchRevInclude =
            this@with.searchRevInclude
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _searchRevInclude =
            this@with.searchRevInclude
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          searchParam = this@with.searchParam.takeUnless { it.all { it == null } },
          operation = this@with.operation.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestInteractionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Rest.Interaction =
    CapabilityStatement.Rest.Interaction(
      id = this@CapabilityStatementRestInteractionSurrogate.id,
      extension = this@CapabilityStatementRestInteractionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestInteractionSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r5.CapabilityStatement.SystemRestfulInteraction.fromCode(
            this@CapabilityStatementRestInteractionSurrogate.code!!
          ),
          this@CapabilityStatementRestInteractionSurrogate._code,
        ),
      documentation =
        Markdown.of(
          this@CapabilityStatementRestInteractionSurrogate.documentation,
          this@CapabilityStatementRestInteractionSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Rest.Interaction
    ): CapabilityStatementRestInteractionSurrogate =
      with(model) {
        CapabilityStatementRestInteractionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementRestSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var security: CapabilityStatement.Rest.Security? = null,
  public var resource: MutableList<CapabilityStatement.Rest.Resource>? = null,
  public var interaction: MutableList<CapabilityStatement.Rest.Interaction>? = null,
  public var searchParam: MutableList<CapabilityStatement.Rest.Resource.SearchParam>? = null,
  public var operation: MutableList<CapabilityStatement.Rest.Resource.Operation>? = null,
  public var compartment: MutableList<KotlinString?>? = null,
  public var _compartment: MutableList<Element?>? = null,
) {
  public fun toModel(): CapabilityStatement.Rest =
    CapabilityStatement.Rest(
      id = this@CapabilityStatementRestSurrogate.id,
      extension = this@CapabilityStatementRestSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementRestSurrogate.modifierExtension ?: mutableListOf(),
      mode =
        Enumeration.of(
          com.google.fhir.model.r5.CapabilityStatement.RestfulCapabilityMode.fromCode(
            this@CapabilityStatementRestSurrogate.mode!!
          ),
          this@CapabilityStatementRestSurrogate._mode,
        ),
      documentation =
        Markdown.of(
          this@CapabilityStatementRestSurrogate.documentation,
          this@CapabilityStatementRestSurrogate._documentation,
        ),
      security = this@CapabilityStatementRestSurrogate.security,
      resource = this@CapabilityStatementRestSurrogate.resource ?: mutableListOf(),
      interaction = this@CapabilityStatementRestSurrogate.interaction ?: mutableListOf(),
      searchParam = this@CapabilityStatementRestSurrogate.searchParam ?: mutableListOf(),
      operation = this@CapabilityStatementRestSurrogate.operation ?: mutableListOf(),
      compartment =
        if (
          this@CapabilityStatementRestSurrogate.compartment == null &&
            this@CapabilityStatementRestSurrogate._compartment == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementRestSurrogate.compartment
              ?: List(this@CapabilityStatementRestSurrogate._compartment!!.size) { null })
            .zip(
              this@CapabilityStatementRestSurrogate._compartment
                ?: List(this@CapabilityStatementRestSurrogate.compartment!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: CapabilityStatement.Rest): CapabilityStatementRestSurrogate =
      with(model) {
        CapabilityStatementRestSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          security = this@with.security,
          resource = this@with.resource.takeUnless { it.all { it == null } },
          interaction = this@with.interaction.takeUnless { it.all { it == null } },
          searchParam = this@with.searchParam.takeUnless { it.all { it == null } },
          operation = this@with.operation.takeUnless { it.all { it == null } },
          compartment =
            this@with.compartment
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _compartment =
            this@with.compartment
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementMessagingEndpointSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var protocol: Coding,
  public var address: KotlinString? = null,
  public var _address: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Messaging.Endpoint =
    CapabilityStatement.Messaging.Endpoint(
      id = this@CapabilityStatementMessagingEndpointSurrogate.id,
      extension = this@CapabilityStatementMessagingEndpointSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementMessagingEndpointSurrogate.modifierExtension ?: mutableListOf(),
      protocol = this@CapabilityStatementMessagingEndpointSurrogate.protocol,
      address =
        Url.of(
          this@CapabilityStatementMessagingEndpointSurrogate.address,
          this@CapabilityStatementMessagingEndpointSurrogate._address,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Messaging.Endpoint
    ): CapabilityStatementMessagingEndpointSurrogate =
      with(model) {
        CapabilityStatementMessagingEndpointSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          protocol = this@with.protocol,
          address = this@with.address.value,
          _address = this@with.address.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementMessagingSupportedMessageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Messaging.SupportedMessage =
    CapabilityStatement.Messaging.SupportedMessage(
      id = this@CapabilityStatementMessagingSupportedMessageSurrogate.id,
      extension =
        this@CapabilityStatementMessagingSupportedMessageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementMessagingSupportedMessageSurrogate.modifierExtension
          ?: mutableListOf(),
      mode =
        Enumeration.of(
          com.google.fhir.model.r5.CapabilityStatement.EventCapabilityMode.fromCode(
            this@CapabilityStatementMessagingSupportedMessageSurrogate.mode!!
          ),
          this@CapabilityStatementMessagingSupportedMessageSurrogate._mode,
        ),
      definition =
        Canonical.of(
          this@CapabilityStatementMessagingSupportedMessageSurrogate.definition,
          this@CapabilityStatementMessagingSupportedMessageSurrogate._definition,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Messaging.SupportedMessage
    ): CapabilityStatementMessagingSupportedMessageSurrogate =
      with(model) {
        CapabilityStatementMessagingSupportedMessageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          definition = this@with.definition.value,
          _definition = this@with.definition.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementMessagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var endpoint: MutableList<CapabilityStatement.Messaging.Endpoint>? = null,
  public var reliableCache: Int? = null,
  public var _reliableCache: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var supportedMessage: MutableList<CapabilityStatement.Messaging.SupportedMessage>? = null,
) {
  public fun toModel(): CapabilityStatement.Messaging =
    CapabilityStatement.Messaging(
      id = this@CapabilityStatementMessagingSurrogate.id,
      extension = this@CapabilityStatementMessagingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementMessagingSurrogate.modifierExtension ?: mutableListOf(),
      endpoint = this@CapabilityStatementMessagingSurrogate.endpoint ?: mutableListOf(),
      reliableCache =
        UnsignedInt.of(
          this@CapabilityStatementMessagingSurrogate.reliableCache,
          this@CapabilityStatementMessagingSurrogate._reliableCache,
        ),
      documentation =
        Markdown.of(
          this@CapabilityStatementMessagingSurrogate.documentation,
          this@CapabilityStatementMessagingSurrogate._documentation,
        ),
      supportedMessage =
        this@CapabilityStatementMessagingSurrogate.supportedMessage ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Messaging
    ): CapabilityStatementMessagingSurrogate =
      with(model) {
        CapabilityStatementMessagingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
          reliableCache = this@with.reliableCache?.value,
          _reliableCache = this@with.reliableCache?.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          supportedMessage = this@with.supportedMessage.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementDocumentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
) {
  public fun toModel(): CapabilityStatement.Document =
    CapabilityStatement.Document(
      id = this@CapabilityStatementDocumentSurrogate.id,
      extension = this@CapabilityStatementDocumentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CapabilityStatementDocumentSurrogate.modifierExtension ?: mutableListOf(),
      mode =
        Enumeration.of(
          com.google.fhir.model.r5.CapabilityStatement.DocumentMode.fromCode(
            this@CapabilityStatementDocumentSurrogate.mode!!
          ),
          this@CapabilityStatementDocumentSurrogate._mode,
        ),
      documentation =
        Markdown.of(
          this@CapabilityStatementDocumentSurrogate.documentation,
          this@CapabilityStatementDocumentSurrogate._documentation,
        ),
      profile =
        Canonical.of(
          this@CapabilityStatementDocumentSurrogate.profile,
          this@CapabilityStatementDocumentSurrogate._profile,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.Document
    ): CapabilityStatementDocumentSurrogate =
      with(model) {
        CapabilityStatementDocumentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
          profile = this@with.profile.value,
          _profile = this@with.profile.toElement(),
        )
      }
  }
}

@Serializable
internal data class CapabilityStatementVersionAlgorithmSurrogate(
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
) {
  public fun toModel(): CapabilityStatement.VersionAlgorithm =
    CapabilityStatement.VersionAlgorithm?.from(
      R5String.of(
        this@CapabilityStatementVersionAlgorithmSurrogate.versionAlgorithmString,
        this@CapabilityStatementVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@CapabilityStatementVersionAlgorithmSurrogate.versionAlgorithmCoding,
    )!!

  public companion object {
    public fun fromModel(
      model: CapabilityStatement.VersionAlgorithm
    ): CapabilityStatementVersionAlgorithmSurrogate =
      with(model) {
        CapabilityStatementVersionAlgorithmSurrogate(
          versionAlgorithmString = this@with.asString()?.value?.value,
          _versionAlgorithmString = this@with.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.asCoding()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
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
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var instantiates: MutableList<KotlinString?>? = null,
  public var _instantiates: MutableList<Element?>? = null,
  public var imports: MutableList<KotlinString?>? = null,
  public var _imports: MutableList<Element?>? = null,
  public var software: CapabilityStatement.Software? = null,
  public var implementation: CapabilityStatement.Implementation? = null,
  public var fhirVersion: KotlinString? = null,
  public var _fhirVersion: Element? = null,
  public var format: MutableList<KotlinString?>? = null,
  public var _format: MutableList<Element?>? = null,
  public var patchFormat: MutableList<KotlinString?>? = null,
  public var _patchFormat: MutableList<Element?>? = null,
  public var acceptLanguage: MutableList<KotlinString?>? = null,
  public var _acceptLanguage: MutableList<Element?>? = null,
  public var implementationGuide: MutableList<KotlinString?>? = null,
  public var _implementationGuide: MutableList<Element?>? = null,
  public var rest: MutableList<CapabilityStatement.Rest>? = null,
  public var messaging: MutableList<CapabilityStatement.Messaging>? = null,
  public var document: MutableList<CapabilityStatement.Document>? = null,
  public var versionAlgorithm: CapabilityStatement.VersionAlgorithm? = null,
) {
  public fun toModel(): CapabilityStatement =
    CapabilityStatement(
      id = this@CapabilityStatementSurrogate.id,
      meta = this@CapabilityStatementSurrogate.meta,
      implicitRules =
        Uri.of(
          this@CapabilityStatementSurrogate.implicitRules,
          this@CapabilityStatementSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@CapabilityStatementSurrogate.language,
          this@CapabilityStatementSurrogate._language,
        ),
      text = this@CapabilityStatementSurrogate.text,
      contained = this@CapabilityStatementSurrogate.contained ?: mutableListOf(),
      extension = this@CapabilityStatementSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CapabilityStatementSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@CapabilityStatementSurrogate.url, this@CapabilityStatementSurrogate._url),
      identifier = this@CapabilityStatementSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(
          this@CapabilityStatementSurrogate.version,
          this@CapabilityStatementSurrogate._version,
        ),
      versionAlgorithm = this@CapabilityStatementSurrogate.versionAlgorithm,
      name =
        R5String.of(
          this@CapabilityStatementSurrogate.name,
          this@CapabilityStatementSurrogate._name,
        ),
      title =
        R5String.of(
          this@CapabilityStatementSurrogate.title,
          this@CapabilityStatementSurrogate._title,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@CapabilityStatementSurrogate.status!!
          ),
          this@CapabilityStatementSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@CapabilityStatementSurrogate.experimental,
          this@CapabilityStatementSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CapabilityStatementSurrogate.date),
          this@CapabilityStatementSurrogate._date,
        )!!,
      publisher =
        R5String.of(
          this@CapabilityStatementSurrogate.publisher,
          this@CapabilityStatementSurrogate._publisher,
        ),
      contact = this@CapabilityStatementSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@CapabilityStatementSurrogate.description,
          this@CapabilityStatementSurrogate._description,
        ),
      useContext = this@CapabilityStatementSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@CapabilityStatementSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@CapabilityStatementSurrogate.purpose,
          this@CapabilityStatementSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@CapabilityStatementSurrogate.copyright,
          this@CapabilityStatementSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@CapabilityStatementSurrogate.copyrightLabel,
          this@CapabilityStatementSurrogate._copyrightLabel,
        ),
      kind =
        Enumeration.of(
          com.google.fhir.model.r5.CapabilityStatement.CapabilityStatementKind.fromCode(
            this@CapabilityStatementSurrogate.kind!!
          ),
          this@CapabilityStatementSurrogate._kind,
        ),
      instantiates =
        if (
          this@CapabilityStatementSurrogate.instantiates == null &&
            this@CapabilityStatementSurrogate._instantiates == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementSurrogate.instantiates
              ?: List(this@CapabilityStatementSurrogate._instantiates!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._instantiates
                ?: List(this@CapabilityStatementSurrogate.instantiates!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      imports =
        if (
          this@CapabilityStatementSurrogate.imports == null &&
            this@CapabilityStatementSurrogate._imports == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementSurrogate.imports
              ?: List(this@CapabilityStatementSurrogate._imports!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._imports
                ?: List(this@CapabilityStatementSurrogate.imports!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      software = this@CapabilityStatementSurrogate.software,
      implementation = this@CapabilityStatementSurrogate.implementation,
      fhirVersion =
        Enumeration.of(
          com.google.fhir.model.r5.FHIRVersion.fromCode(
            this@CapabilityStatementSurrogate.fhirVersion!!
          ),
          this@CapabilityStatementSurrogate._fhirVersion,
        ),
      format =
        if (
          this@CapabilityStatementSurrogate.format == null &&
            this@CapabilityStatementSurrogate._format == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementSurrogate.format
              ?: List(this@CapabilityStatementSurrogate._format!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._format
                ?: List(this@CapabilityStatementSurrogate.format!!.size) { null }
            )
            .map { (value, element) -> Code.of(value, element)!! }
            .toMutableList()
        },
      patchFormat =
        if (
          this@CapabilityStatementSurrogate.patchFormat == null &&
            this@CapabilityStatementSurrogate._patchFormat == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementSurrogate.patchFormat
              ?: List(this@CapabilityStatementSurrogate._patchFormat!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._patchFormat
                ?: List(this@CapabilityStatementSurrogate.patchFormat!!.size) { null }
            )
            .map { (value, element) -> Code.of(value, element)!! }
            .toMutableList()
        },
      acceptLanguage =
        if (
          this@CapabilityStatementSurrogate.acceptLanguage == null &&
            this@CapabilityStatementSurrogate._acceptLanguage == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementSurrogate.acceptLanguage
              ?: List(this@CapabilityStatementSurrogate._acceptLanguage!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._acceptLanguage
                ?: List(this@CapabilityStatementSurrogate.acceptLanguage!!.size) { null }
            )
            .map { (value, element) -> Code.of(value, element)!! }
            .toMutableList()
        },
      implementationGuide =
        if (
          this@CapabilityStatementSurrogate.implementationGuide == null &&
            this@CapabilityStatementSurrogate._implementationGuide == null
        ) {
          mutableListOf()
        } else {
          (this@CapabilityStatementSurrogate.implementationGuide
              ?: List(this@CapabilityStatementSurrogate._implementationGuide!!.size) { null })
            .zip(
              this@CapabilityStatementSurrogate._implementationGuide
                ?: List(this@CapabilityStatementSurrogate.implementationGuide!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      rest = this@CapabilityStatementSurrogate.rest ?: mutableListOf(),
      messaging = this@CapabilityStatementSurrogate.messaging ?: mutableListOf(),
      document = this@CapabilityStatementSurrogate.document ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CapabilityStatement): CapabilityStatementSurrogate =
      with(model) {
        CapabilityStatementSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithm = this@with.versionAlgorithm,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date.value?.toString(),
          _date = this@with.date.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          kind = this@with.kind.value?.getCode(),
          _kind = this@with.kind.toElement(),
          instantiates =
            this@with.instantiates
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiates =
            this@with.instantiates
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          imports =
            this@with.imports.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _imports =
            this@with.imports
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          software = this@with.software,
          implementation = this@with.implementation,
          fhirVersion = this@with.fhirVersion.value?.getCode(),
          _fhirVersion = this@with.fhirVersion.toElement(),
          format =
            this@with.format.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _format =
            this@with.format
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          patchFormat =
            this@with.patchFormat
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _patchFormat =
            this@with.patchFormat
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          acceptLanguage =
            this@with.acceptLanguage
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _acceptLanguage =
            this@with.acceptLanguage
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          implementationGuide =
            this@with.implementationGuide
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _implementationGuide =
            this@with.implementationGuide
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          rest = this@with.rest.takeUnless { it.all { it == null } },
          messaging = this@with.messaging.takeUnless { it.all { it == null } },
          document = this@with.document.takeUnless { it.all { it == null } },
        )
      }
  }
}
