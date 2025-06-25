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
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.TestScript
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
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
internal data class TestScriptOriginSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var index: Int? = null,
  public var _index: Element? = null,
  public var profile: Coding? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): TestScript.Origin =
    TestScript.Origin().apply {
      id = this@TestScriptOriginSurrogate.id
      extension = this@TestScriptOriginSurrogate.extension
      modifierExtension = this@TestScriptOriginSurrogate.modifierExtension
      index =
        Integer.of(this@TestScriptOriginSurrogate.index, this@TestScriptOriginSurrogate._index)
      profile = this@TestScriptOriginSurrogate.profile
      url = Url.of(this@TestScriptOriginSurrogate.url, this@TestScriptOriginSurrogate._url)
    }

  public companion object {
    public fun fromModel(model: TestScript.Origin): TestScriptOriginSurrogate =
      with(model) {
        TestScriptOriginSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          index = this@with.index?.value
          _index = this@with.index?.toElement()
          profile = this@with.profile
          url = this@with.url?.value
          _url = this@with.url?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptDestinationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var index: Int? = null,
  public var _index: Element? = null,
  public var profile: Coding? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): TestScript.Destination =
    TestScript.Destination().apply {
      id = this@TestScriptDestinationSurrogate.id
      extension = this@TestScriptDestinationSurrogate.extension
      modifierExtension = this@TestScriptDestinationSurrogate.modifierExtension
      index =
        Integer.of(
          this@TestScriptDestinationSurrogate.index,
          this@TestScriptDestinationSurrogate._index,
        )
      profile = this@TestScriptDestinationSurrogate.profile
      url =
        Url.of(this@TestScriptDestinationSurrogate.url, this@TestScriptDestinationSurrogate._url)
    }

  public companion object {
    public fun fromModel(model: TestScript.Destination): TestScriptDestinationSurrogate =
      with(model) {
        TestScriptDestinationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          index = this@with.index?.value
          _index = this@with.index?.toElement()
          profile = this@with.profile
          url = this@with.url?.value
          _url = this@with.url?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptMetadataLinkSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): TestScript.Metadata.Link =
    TestScript.Metadata.Link().apply {
      id = this@TestScriptMetadataLinkSurrogate.id
      extension = this@TestScriptMetadataLinkSurrogate.extension
      modifierExtension = this@TestScriptMetadataLinkSurrogate.modifierExtension
      url =
        Uri.of(this@TestScriptMetadataLinkSurrogate.url, this@TestScriptMetadataLinkSurrogate._url)
      description =
        R5String.of(
          this@TestScriptMetadataLinkSurrogate.description,
          this@TestScriptMetadataLinkSurrogate._description,
        )
    }

  public companion object {
    public fun fromModel(model: TestScript.Metadata.Link): TestScriptMetadataLinkSurrogate =
      with(model) {
        TestScriptMetadataLinkSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptMetadataCapabilitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var required: KotlinBoolean? = null,
  public var _required: Element? = null,
  public var validated: KotlinBoolean? = null,
  public var _validated: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var origin: List<Int?>? = null,
  public var _origin: List<Element?>? = null,
  public var destination: Int? = null,
  public var _destination: Element? = null,
  public var link: List<KotlinString?>? = null,
  public var _link: List<Element?>? = null,
  public var capabilities: KotlinString? = null,
  public var _capabilities: Element? = null,
) {
  public fun toModel(): TestScript.Metadata.Capability =
    TestScript.Metadata.Capability().apply {
      id = this@TestScriptMetadataCapabilitySurrogate.id
      extension = this@TestScriptMetadataCapabilitySurrogate.extension
      modifierExtension = this@TestScriptMetadataCapabilitySurrogate.modifierExtension
      required =
        R5Boolean.of(
          this@TestScriptMetadataCapabilitySurrogate.required,
          this@TestScriptMetadataCapabilitySurrogate._required,
        )
      validated =
        R5Boolean.of(
          this@TestScriptMetadataCapabilitySurrogate.validated,
          this@TestScriptMetadataCapabilitySurrogate._validated,
        )
      description =
        R5String.of(
          this@TestScriptMetadataCapabilitySurrogate.description,
          this@TestScriptMetadataCapabilitySurrogate._description,
        )
      origin =
        if (
          this@TestScriptMetadataCapabilitySurrogate.origin == null &&
            this@TestScriptMetadataCapabilitySurrogate._origin == null
        ) {
          null
        } else {
          (this@TestScriptMetadataCapabilitySurrogate.origin
              ?: List(this@TestScriptMetadataCapabilitySurrogate._origin!!.size) { null })
            .zip(
              this@TestScriptMetadataCapabilitySurrogate._origin
                ?: List(this@TestScriptMetadataCapabilitySurrogate.origin!!.size) { null }
            )
            .mapNotNull { (value, element) -> Integer.of(value, element) }
        }
      destination =
        Integer.of(
          this@TestScriptMetadataCapabilitySurrogate.destination,
          this@TestScriptMetadataCapabilitySurrogate._destination,
        )
      link =
        if (
          this@TestScriptMetadataCapabilitySurrogate.link == null &&
            this@TestScriptMetadataCapabilitySurrogate._link == null
        ) {
          null
        } else {
          (this@TestScriptMetadataCapabilitySurrogate.link
              ?: List(this@TestScriptMetadataCapabilitySurrogate._link!!.size) { null })
            .zip(
              this@TestScriptMetadataCapabilitySurrogate._link
                ?: List(this@TestScriptMetadataCapabilitySurrogate.link!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      capabilities =
        Canonical.of(
          this@TestScriptMetadataCapabilitySurrogate.capabilities,
          this@TestScriptMetadataCapabilitySurrogate._capabilities,
        )
    }

  public companion object {
    public fun fromModel(
      model: TestScript.Metadata.Capability
    ): TestScriptMetadataCapabilitySurrogate =
      with(model) {
        TestScriptMetadataCapabilitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          required = this@with.required?.value
          _required = this@with.required?.toElement()
          validated = this@with.validated?.value
          _validated = this@with.validated?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          origin = this@with.origin?.map { it?.value }?.takeUnless { it.all { it == null } }
          _origin = this@with.origin?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          destination = this@with.destination?.value
          _destination = this@with.destination?.toElement()
          link = this@with.link?.map { it?.value }?.takeUnless { it.all { it == null } }
          _link = this@with.link?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          capabilities = this@with.capabilities?.value
          _capabilities = this@with.capabilities?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptMetadataSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var link: List<TestScript.Metadata.Link>? = null,
  public var capability: List<TestScript.Metadata.Capability>? = null,
) {
  public fun toModel(): TestScript.Metadata =
    TestScript.Metadata().apply {
      id = this@TestScriptMetadataSurrogate.id
      extension = this@TestScriptMetadataSurrogate.extension
      modifierExtension = this@TestScriptMetadataSurrogate.modifierExtension
      link = this@TestScriptMetadataSurrogate.link
      capability = this@TestScriptMetadataSurrogate.capability
    }

  public companion object {
    public fun fromModel(model: TestScript.Metadata): TestScriptMetadataSurrogate =
      with(model) {
        TestScriptMetadataSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          link = this@with.link
          capability = this@with.capability
        }
      }
  }
}

@Serializable
internal data class TestScriptScopeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var artifact: KotlinString? = null,
  public var _artifact: Element? = null,
  public var conformance: CodeableConcept? = null,
  public var phase: CodeableConcept? = null,
) {
  public fun toModel(): TestScript.Scope =
    TestScript.Scope().apply {
      id = this@TestScriptScopeSurrogate.id
      extension = this@TestScriptScopeSurrogate.extension
      modifierExtension = this@TestScriptScopeSurrogate.modifierExtension
      artifact =
        Canonical.of(
          this@TestScriptScopeSurrogate.artifact,
          this@TestScriptScopeSurrogate._artifact,
        )
      conformance = this@TestScriptScopeSurrogate.conformance
      phase = this@TestScriptScopeSurrogate.phase
    }

  public companion object {
    public fun fromModel(model: TestScript.Scope): TestScriptScopeSurrogate =
      with(model) {
        TestScriptScopeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          artifact = this@with.artifact?.value
          _artifact = this@with.artifact?.toElement()
          conformance = this@with.conformance
          phase = this@with.phase
        }
      }
  }
}

@Serializable
internal data class TestScriptFixtureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var autocreate: KotlinBoolean? = null,
  public var _autocreate: Element? = null,
  public var autodelete: KotlinBoolean? = null,
  public var _autodelete: Element? = null,
  public var resource: Reference? = null,
) {
  public fun toModel(): TestScript.Fixture =
    TestScript.Fixture().apply {
      id = this@TestScriptFixtureSurrogate.id
      extension = this@TestScriptFixtureSurrogate.extension
      modifierExtension = this@TestScriptFixtureSurrogate.modifierExtension
      autocreate =
        R5Boolean.of(
          this@TestScriptFixtureSurrogate.autocreate,
          this@TestScriptFixtureSurrogate._autocreate,
        )
      autodelete =
        R5Boolean.of(
          this@TestScriptFixtureSurrogate.autodelete,
          this@TestScriptFixtureSurrogate._autodelete,
        )
      resource = this@TestScriptFixtureSurrogate.resource
    }

  public companion object {
    public fun fromModel(model: TestScript.Fixture): TestScriptFixtureSurrogate =
      with(model) {
        TestScriptFixtureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          autocreate = this@with.autocreate?.value
          _autocreate = this@with.autocreate?.toElement()
          autodelete = this@with.autodelete?.value
          _autodelete = this@with.autodelete?.toElement()
          resource = this@with.resource
        }
      }
  }
}

@Serializable
internal data class TestScriptVariableSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var defaultValue: KotlinString? = null,
  public var _defaultValue: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
  public var headerField: KotlinString? = null,
  public var _headerField: Element? = null,
  public var hint: KotlinString? = null,
  public var _hint: Element? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var sourceId: KotlinString? = null,
  public var _sourceId: Element? = null,
) {
  public fun toModel(): TestScript.Variable =
    TestScript.Variable().apply {
      id = this@TestScriptVariableSurrogate.id
      extension = this@TestScriptVariableSurrogate.extension
      modifierExtension = this@TestScriptVariableSurrogate.modifierExtension
      name =
        R5String.of(this@TestScriptVariableSurrogate.name, this@TestScriptVariableSurrogate._name)
      defaultValue =
        R5String.of(
          this@TestScriptVariableSurrogate.defaultValue,
          this@TestScriptVariableSurrogate._defaultValue,
        )
      description =
        R5String.of(
          this@TestScriptVariableSurrogate.description,
          this@TestScriptVariableSurrogate._description,
        )
      expression =
        R5String.of(
          this@TestScriptVariableSurrogate.expression,
          this@TestScriptVariableSurrogate._expression,
        )
      headerField =
        R5String.of(
          this@TestScriptVariableSurrogate.headerField,
          this@TestScriptVariableSurrogate._headerField,
        )
      hint =
        R5String.of(this@TestScriptVariableSurrogate.hint, this@TestScriptVariableSurrogate._hint)
      path =
        R5String.of(this@TestScriptVariableSurrogate.path, this@TestScriptVariableSurrogate._path)
      sourceId =
        Id.of(this@TestScriptVariableSurrogate.sourceId, this@TestScriptVariableSurrogate._sourceId)
    }

  public companion object {
    public fun fromModel(model: TestScript.Variable): TestScriptVariableSurrogate =
      with(model) {
        TestScriptVariableSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          defaultValue = this@with.defaultValue?.value
          _defaultValue = this@with.defaultValue?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          expression = this@with.expression?.value
          _expression = this@with.expression?.toElement()
          headerField = this@with.headerField?.value
          _headerField = this@with.headerField?.toElement()
          hint = this@with.hint?.value
          _hint = this@with.hint?.toElement()
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          sourceId = this@with.sourceId?.value
          _sourceId = this@with.sourceId?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptSetupActionOperationRequestHeaderSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `field`: KotlinString? = null,
  public var _field: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): TestScript.Setup.Action.Operation.RequestHeader =
    TestScript.Setup.Action.Operation.RequestHeader().apply {
      id = this@TestScriptSetupActionOperationRequestHeaderSurrogate.id
      extension = this@TestScriptSetupActionOperationRequestHeaderSurrogate.extension
      modifierExtension =
        this@TestScriptSetupActionOperationRequestHeaderSurrogate.modifierExtension
      `field` =
        R5String.of(
          this@TestScriptSetupActionOperationRequestHeaderSurrogate.`field`,
          this@TestScriptSetupActionOperationRequestHeaderSurrogate._field,
        )
      `value` =
        R5String.of(
          this@TestScriptSetupActionOperationRequestHeaderSurrogate.`value`,
          this@TestScriptSetupActionOperationRequestHeaderSurrogate._value,
        )
    }

  public companion object {
    public fun fromModel(
      model: TestScript.Setup.Action.Operation.RequestHeader
    ): TestScriptSetupActionOperationRequestHeaderSurrogate =
      with(model) {
        TestScriptSetupActionOperationRequestHeaderSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `field` = this@with.`field`?.value
          _field = this@with.`field`?.toElement()
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptSetupActionOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: Coding? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var accept: KotlinString? = null,
  public var _accept: Element? = null,
  public var contentType: KotlinString? = null,
  public var _contentType: Element? = null,
  public var destination: Int? = null,
  public var _destination: Element? = null,
  public var encodeRequestUrl: KotlinBoolean? = null,
  public var _encodeRequestUrl: Element? = null,
  public var method: KotlinString? = null,
  public var _method: Element? = null,
  public var origin: Int? = null,
  public var _origin: Element? = null,
  public var params: KotlinString? = null,
  public var _params: Element? = null,
  public var requestHeader: List<TestScript.Setup.Action.Operation.RequestHeader>? = null,
  public var requestId: KotlinString? = null,
  public var _requestId: Element? = null,
  public var responseId: KotlinString? = null,
  public var _responseId: Element? = null,
  public var sourceId: KotlinString? = null,
  public var _sourceId: Element? = null,
  public var targetId: KotlinString? = null,
  public var _targetId: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): TestScript.Setup.Action.Operation =
    TestScript.Setup.Action.Operation().apply {
      id = this@TestScriptSetupActionOperationSurrogate.id
      extension = this@TestScriptSetupActionOperationSurrogate.extension
      modifierExtension = this@TestScriptSetupActionOperationSurrogate.modifierExtension
      type = this@TestScriptSetupActionOperationSurrogate.type
      resource =
        Uri.of(
          this@TestScriptSetupActionOperationSurrogate.resource,
          this@TestScriptSetupActionOperationSurrogate._resource,
        )
      label =
        R5String.of(
          this@TestScriptSetupActionOperationSurrogate.label,
          this@TestScriptSetupActionOperationSurrogate._label,
        )
      description =
        R5String.of(
          this@TestScriptSetupActionOperationSurrogate.description,
          this@TestScriptSetupActionOperationSurrogate._description,
        )
      accept =
        Code.of(
          this@TestScriptSetupActionOperationSurrogate.accept,
          this@TestScriptSetupActionOperationSurrogate._accept,
        )
      contentType =
        Code.of(
          this@TestScriptSetupActionOperationSurrogate.contentType,
          this@TestScriptSetupActionOperationSurrogate._contentType,
        )
      destination =
        Integer.of(
          this@TestScriptSetupActionOperationSurrogate.destination,
          this@TestScriptSetupActionOperationSurrogate._destination,
        )
      encodeRequestUrl =
        R5Boolean.of(
          this@TestScriptSetupActionOperationSurrogate.encodeRequestUrl,
          this@TestScriptSetupActionOperationSurrogate._encodeRequestUrl,
        )
      method =
        Enumeration.of(
          this@TestScriptSetupActionOperationSurrogate.method?.let {
            com.google.fhir.model.r5.TestScript.TestScriptRequestMethodCode.fromCode(it)
          },
          this@TestScriptSetupActionOperationSurrogate._method,
        )
      origin =
        Integer.of(
          this@TestScriptSetupActionOperationSurrogate.origin,
          this@TestScriptSetupActionOperationSurrogate._origin,
        )
      params =
        R5String.of(
          this@TestScriptSetupActionOperationSurrogate.params,
          this@TestScriptSetupActionOperationSurrogate._params,
        )
      requestHeader = this@TestScriptSetupActionOperationSurrogate.requestHeader
      requestId =
        Id.of(
          this@TestScriptSetupActionOperationSurrogate.requestId,
          this@TestScriptSetupActionOperationSurrogate._requestId,
        )
      responseId =
        Id.of(
          this@TestScriptSetupActionOperationSurrogate.responseId,
          this@TestScriptSetupActionOperationSurrogate._responseId,
        )
      sourceId =
        Id.of(
          this@TestScriptSetupActionOperationSurrogate.sourceId,
          this@TestScriptSetupActionOperationSurrogate._sourceId,
        )
      targetId =
        Id.of(
          this@TestScriptSetupActionOperationSurrogate.targetId,
          this@TestScriptSetupActionOperationSurrogate._targetId,
        )
      url =
        R5String.of(
          this@TestScriptSetupActionOperationSurrogate.url,
          this@TestScriptSetupActionOperationSurrogate._url,
        )
    }

  public companion object {
    public fun fromModel(
      model: TestScript.Setup.Action.Operation
    ): TestScriptSetupActionOperationSurrogate =
      with(model) {
        TestScriptSetupActionOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          resource = this@with.resource?.value
          _resource = this@with.resource?.toElement()
          label = this@with.label?.value
          _label = this@with.label?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          accept = this@with.accept?.value
          _accept = this@with.accept?.toElement()
          contentType = this@with.contentType?.value
          _contentType = this@with.contentType?.toElement()
          destination = this@with.destination?.value
          _destination = this@with.destination?.toElement()
          encodeRequestUrl = this@with.encodeRequestUrl?.value
          _encodeRequestUrl = this@with.encodeRequestUrl?.toElement()
          method = this@with.method?.value?.getCode()
          _method = this@with.method?.toElement()
          origin = this@with.origin?.value
          _origin = this@with.origin?.toElement()
          params = this@with.params?.value
          _params = this@with.params?.toElement()
          requestHeader = this@with.requestHeader
          requestId = this@with.requestId?.value
          _requestId = this@with.requestId?.toElement()
          responseId = this@with.responseId?.value
          _responseId = this@with.responseId?.toElement()
          sourceId = this@with.sourceId?.value
          _sourceId = this@with.sourceId?.toElement()
          targetId = this@with.targetId?.value
          _targetId = this@with.targetId?.toElement()
          url = this@with.url?.value
          _url = this@with.url?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptSetupActionAssertRequirementSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkUri: KotlinString? = null,
  public var _linkUri: Element? = null,
  public var linkCanonical: KotlinString? = null,
  public var _linkCanonical: Element? = null,
) {
  public fun toModel(): TestScript.Setup.Action.Assert.Requirement =
    TestScript.Setup.Action.Assert.Requirement().apply {
      id = this@TestScriptSetupActionAssertRequirementSurrogate.id
      extension = this@TestScriptSetupActionAssertRequirementSurrogate.extension
      modifierExtension = this@TestScriptSetupActionAssertRequirementSurrogate.modifierExtension
      link =
        TestScript.Setup.Action.Assert.Requirement.Link?.from(
          Uri.of(
            this@TestScriptSetupActionAssertRequirementSurrogate.linkUri,
            this@TestScriptSetupActionAssertRequirementSurrogate._linkUri,
          ),
          Canonical.of(
            this@TestScriptSetupActionAssertRequirementSurrogate.linkCanonical,
            this@TestScriptSetupActionAssertRequirementSurrogate._linkCanonical,
          ),
        )
    }

  public companion object {
    public fun fromModel(
      model: TestScript.Setup.Action.Assert.Requirement
    ): TestScriptSetupActionAssertRequirementSurrogate =
      with(model) {
        TestScriptSetupActionAssertRequirementSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkUri = this@with.link?.asUri()?.value?.value
          _linkUri = this@with.link?.asUri()?.value?.toElement()
          linkCanonical = this@with.link?.asCanonical()?.value?.value
          _linkCanonical = this@with.link?.asCanonical()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestScriptSetupActionAssertSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var direction: KotlinString? = null,
  public var _direction: Element? = null,
  public var compareToSourceId: KotlinString? = null,
  public var _compareToSourceId: Element? = null,
  public var compareToSourceExpression: KotlinString? = null,
  public var _compareToSourceExpression: Element? = null,
  public var compareToSourcePath: KotlinString? = null,
  public var _compareToSourcePath: Element? = null,
  public var contentType: KotlinString? = null,
  public var _contentType: Element? = null,
  public var defaultManualCompletion: KotlinString? = null,
  public var _defaultManualCompletion: Element? = null,
  public var expression: KotlinString? = null,
  public var _expression: Element? = null,
  public var headerField: KotlinString? = null,
  public var _headerField: Element? = null,
  public var minimumId: KotlinString? = null,
  public var _minimumId: Element? = null,
  public var navigationLinks: KotlinBoolean? = null,
  public var _navigationLinks: Element? = null,
  public var `operator`: KotlinString? = null,
  public var _operator: Element? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var requestMethod: KotlinString? = null,
  public var _requestMethod: Element? = null,
  public var requestURL: KotlinString? = null,
  public var _requestURL: Element? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var response: KotlinString? = null,
  public var _response: Element? = null,
  public var responseCode: KotlinString? = null,
  public var _responseCode: Element? = null,
  public var sourceId: KotlinString? = null,
  public var _sourceId: Element? = null,
  public var stopTestOnFail: KotlinBoolean? = null,
  public var _stopTestOnFail: Element? = null,
  public var validateProfileId: KotlinString? = null,
  public var _validateProfileId: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var warningOnly: KotlinBoolean? = null,
  public var _warningOnly: Element? = null,
  public var requirement: List<TestScript.Setup.Action.Assert.Requirement>? = null,
) {
  public fun toModel(): TestScript.Setup.Action.Assert =
    TestScript.Setup.Action.Assert().apply {
      id = this@TestScriptSetupActionAssertSurrogate.id
      extension = this@TestScriptSetupActionAssertSurrogate.extension
      modifierExtension = this@TestScriptSetupActionAssertSurrogate.modifierExtension
      label =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.label,
          this@TestScriptSetupActionAssertSurrogate._label,
        )
      description =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.description,
          this@TestScriptSetupActionAssertSurrogate._description,
        )
      direction =
        Enumeration.of(
          this@TestScriptSetupActionAssertSurrogate.direction?.let {
            com.google.fhir.model.r5.TestScript.AssertionDirectionType.fromCode(it)
          },
          this@TestScriptSetupActionAssertSurrogate._direction,
        )
      compareToSourceId =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.compareToSourceId,
          this@TestScriptSetupActionAssertSurrogate._compareToSourceId,
        )
      compareToSourceExpression =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.compareToSourceExpression,
          this@TestScriptSetupActionAssertSurrogate._compareToSourceExpression,
        )
      compareToSourcePath =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.compareToSourcePath,
          this@TestScriptSetupActionAssertSurrogate._compareToSourcePath,
        )
      contentType =
        Code.of(
          this@TestScriptSetupActionAssertSurrogate.contentType,
          this@TestScriptSetupActionAssertSurrogate._contentType,
        )
      defaultManualCompletion =
        Enumeration.of(
          this@TestScriptSetupActionAssertSurrogate.defaultManualCompletion?.let {
            com.google.fhir.model.r5.TestScript.AssertionManualCompletionType.fromCode(it)
          },
          this@TestScriptSetupActionAssertSurrogate._defaultManualCompletion,
        )
      expression =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.expression,
          this@TestScriptSetupActionAssertSurrogate._expression,
        )
      headerField =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.headerField,
          this@TestScriptSetupActionAssertSurrogate._headerField,
        )
      minimumId =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.minimumId,
          this@TestScriptSetupActionAssertSurrogate._minimumId,
        )
      navigationLinks =
        R5Boolean.of(
          this@TestScriptSetupActionAssertSurrogate.navigationLinks,
          this@TestScriptSetupActionAssertSurrogate._navigationLinks,
        )
      `operator` =
        Enumeration.of(
          this@TestScriptSetupActionAssertSurrogate.`operator`?.let {
            com.google.fhir.model.r5.TestScript.AssertionOperatorType.fromCode(it)
          },
          this@TestScriptSetupActionAssertSurrogate._operator,
        )
      path =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.path,
          this@TestScriptSetupActionAssertSurrogate._path,
        )
      requestMethod =
        Enumeration.of(
          this@TestScriptSetupActionAssertSurrogate.requestMethod?.let {
            com.google.fhir.model.r5.TestScript.TestScriptRequestMethodCode.fromCode(it)
          },
          this@TestScriptSetupActionAssertSurrogate._requestMethod,
        )
      requestURL =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.requestURL,
          this@TestScriptSetupActionAssertSurrogate._requestURL,
        )
      resource =
        Uri.of(
          this@TestScriptSetupActionAssertSurrogate.resource,
          this@TestScriptSetupActionAssertSurrogate._resource,
        )
      response =
        Enumeration.of(
          this@TestScriptSetupActionAssertSurrogate.response?.let {
            com.google.fhir.model.r5.TestScript.AssertionResponseTypes.fromCode(it)
          },
          this@TestScriptSetupActionAssertSurrogate._response,
        )
      responseCode =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.responseCode,
          this@TestScriptSetupActionAssertSurrogate._responseCode,
        )
      sourceId =
        Id.of(
          this@TestScriptSetupActionAssertSurrogate.sourceId,
          this@TestScriptSetupActionAssertSurrogate._sourceId,
        )
      stopTestOnFail =
        R5Boolean.of(
          this@TestScriptSetupActionAssertSurrogate.stopTestOnFail,
          this@TestScriptSetupActionAssertSurrogate._stopTestOnFail,
        )
      validateProfileId =
        Id.of(
          this@TestScriptSetupActionAssertSurrogate.validateProfileId,
          this@TestScriptSetupActionAssertSurrogate._validateProfileId,
        )
      `value` =
        R5String.of(
          this@TestScriptSetupActionAssertSurrogate.`value`,
          this@TestScriptSetupActionAssertSurrogate._value,
        )
      warningOnly =
        R5Boolean.of(
          this@TestScriptSetupActionAssertSurrogate.warningOnly,
          this@TestScriptSetupActionAssertSurrogate._warningOnly,
        )
      requirement = this@TestScriptSetupActionAssertSurrogate.requirement
    }

  public companion object {
    public fun fromModel(
      model: TestScript.Setup.Action.Assert
    ): TestScriptSetupActionAssertSurrogate =
      with(model) {
        TestScriptSetupActionAssertSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          label = this@with.label?.value
          _label = this@with.label?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          direction = this@with.direction?.value?.getCode()
          _direction = this@with.direction?.toElement()
          compareToSourceId = this@with.compareToSourceId?.value
          _compareToSourceId = this@with.compareToSourceId?.toElement()
          compareToSourceExpression = this@with.compareToSourceExpression?.value
          _compareToSourceExpression = this@with.compareToSourceExpression?.toElement()
          compareToSourcePath = this@with.compareToSourcePath?.value
          _compareToSourcePath = this@with.compareToSourcePath?.toElement()
          contentType = this@with.contentType?.value
          _contentType = this@with.contentType?.toElement()
          defaultManualCompletion = this@with.defaultManualCompletion?.value?.getCode()
          _defaultManualCompletion = this@with.defaultManualCompletion?.toElement()
          expression = this@with.expression?.value
          _expression = this@with.expression?.toElement()
          headerField = this@with.headerField?.value
          _headerField = this@with.headerField?.toElement()
          minimumId = this@with.minimumId?.value
          _minimumId = this@with.minimumId?.toElement()
          navigationLinks = this@with.navigationLinks?.value
          _navigationLinks = this@with.navigationLinks?.toElement()
          `operator` = this@with.`operator`?.value?.getCode()
          _operator = this@with.`operator`?.toElement()
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          requestMethod = this@with.requestMethod?.value?.getCode()
          _requestMethod = this@with.requestMethod?.toElement()
          requestURL = this@with.requestURL?.value
          _requestURL = this@with.requestURL?.toElement()
          resource = this@with.resource?.value
          _resource = this@with.resource?.toElement()
          response = this@with.response?.value?.getCode()
          _response = this@with.response?.toElement()
          responseCode = this@with.responseCode?.value
          _responseCode = this@with.responseCode?.toElement()
          sourceId = this@with.sourceId?.value
          _sourceId = this@with.sourceId?.toElement()
          stopTestOnFail = this@with.stopTestOnFail?.value
          _stopTestOnFail = this@with.stopTestOnFail?.toElement()
          validateProfileId = this@with.validateProfileId?.value
          _validateProfileId = this@with.validateProfileId?.toElement()
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
          warningOnly = this@with.warningOnly?.value
          _warningOnly = this@with.warningOnly?.toElement()
          requirement = this@with.requirement
        }
      }
  }
}

@Serializable
internal data class TestScriptSetupActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operation: TestScript.Setup.Action.Operation? = null,
  public var assert: TestScript.Setup.Action.Assert? = null,
) {
  public fun toModel(): TestScript.Setup.Action =
    TestScript.Setup.Action().apply {
      id = this@TestScriptSetupActionSurrogate.id
      extension = this@TestScriptSetupActionSurrogate.extension
      modifierExtension = this@TestScriptSetupActionSurrogate.modifierExtension
      operation = this@TestScriptSetupActionSurrogate.operation
      assert = this@TestScriptSetupActionSurrogate.assert
    }

  public companion object {
    public fun fromModel(model: TestScript.Setup.Action): TestScriptSetupActionSurrogate =
      with(model) {
        TestScriptSetupActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operation = this@with.operation
          assert = this@with.assert
        }
      }
  }
}

@Serializable
internal data class TestScriptSetupSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var action: List<TestScript.Setup.Action>? = null,
) {
  public fun toModel(): TestScript.Setup =
    TestScript.Setup().apply {
      id = this@TestScriptSetupSurrogate.id
      extension = this@TestScriptSetupSurrogate.extension
      modifierExtension = this@TestScriptSetupSurrogate.modifierExtension
      action = this@TestScriptSetupSurrogate.action
    }

  public companion object {
    public fun fromModel(model: TestScript.Setup): TestScriptSetupSurrogate =
      with(model) {
        TestScriptSetupSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class TestScriptTestActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operation: TestScript.Setup.Action.Operation? = null,
  public var assert: TestScript.Setup.Action.Assert? = null,
) {
  public fun toModel(): TestScript.Test.Action =
    TestScript.Test.Action().apply {
      id = this@TestScriptTestActionSurrogate.id
      extension = this@TestScriptTestActionSurrogate.extension
      modifierExtension = this@TestScriptTestActionSurrogate.modifierExtension
      operation = this@TestScriptTestActionSurrogate.operation
      assert = this@TestScriptTestActionSurrogate.assert
    }

  public companion object {
    public fun fromModel(model: TestScript.Test.Action): TestScriptTestActionSurrogate =
      with(model) {
        TestScriptTestActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operation = this@with.operation
          assert = this@with.assert
        }
      }
  }
}

@Serializable
internal data class TestScriptTestSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var action: List<TestScript.Test.Action>? = null,
) {
  public fun toModel(): TestScript.Test =
    TestScript.Test().apply {
      id = this@TestScriptTestSurrogate.id
      extension = this@TestScriptTestSurrogate.extension
      modifierExtension = this@TestScriptTestSurrogate.modifierExtension
      name = R5String.of(this@TestScriptTestSurrogate.name, this@TestScriptTestSurrogate._name)
      description =
        R5String.of(
          this@TestScriptTestSurrogate.description,
          this@TestScriptTestSurrogate._description,
        )
      action = this@TestScriptTestSurrogate.action
    }

  public companion object {
    public fun fromModel(model: TestScript.Test): TestScriptTestSurrogate =
      with(model) {
        TestScriptTestSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class TestScriptTeardownActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operation: TestScript.Setup.Action.Operation? = null,
) {
  public fun toModel(): TestScript.Teardown.Action =
    TestScript.Teardown.Action().apply {
      id = this@TestScriptTeardownActionSurrogate.id
      extension = this@TestScriptTeardownActionSurrogate.extension
      modifierExtension = this@TestScriptTeardownActionSurrogate.modifierExtension
      operation = this@TestScriptTeardownActionSurrogate.operation
    }

  public companion object {
    public fun fromModel(model: TestScript.Teardown.Action): TestScriptTeardownActionSurrogate =
      with(model) {
        TestScriptTeardownActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operation = this@with.operation
        }
      }
  }
}

@Serializable
internal data class TestScriptTeardownSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var action: List<TestScript.Teardown.Action>? = null,
) {
  public fun toModel(): TestScript.Teardown =
    TestScript.Teardown().apply {
      id = this@TestScriptTeardownSurrogate.id
      extension = this@TestScriptTeardownSurrogate.extension
      modifierExtension = this@TestScriptTeardownSurrogate.modifierExtension
      action = this@TestScriptTeardownSurrogate.action
    }

  public companion object {
    public fun fromModel(model: TestScript.Teardown): TestScriptTeardownSurrogate =
      with(model) {
        TestScriptTeardownSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class TestScriptSurrogate(
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
  public var origin: List<TestScript.Origin>? = null,
  public var destination: List<TestScript.Destination>? = null,
  public var metadata: TestScript.Metadata? = null,
  public var scope: List<TestScript.Scope>? = null,
  public var fixture: List<TestScript.Fixture>? = null,
  public var profile: List<KotlinString?>? = null,
  public var _profile: List<Element?>? = null,
  public var variable: List<TestScript.Variable>? = null,
  public var setup: TestScript.Setup? = null,
  public var test: List<TestScript.Test>? = null,
  public var teardown: TestScript.Teardown? = null,
) {
  public fun toModel(): TestScript =
    TestScript().apply {
      id = this@TestScriptSurrogate.id
      meta = this@TestScriptSurrogate.meta
      implicitRules =
        Uri.of(this@TestScriptSurrogate.implicitRules, this@TestScriptSurrogate._implicitRules)
      language = Code.of(this@TestScriptSurrogate.language, this@TestScriptSurrogate._language)
      text = this@TestScriptSurrogate.text
      contained = this@TestScriptSurrogate.contained
      extension = this@TestScriptSurrogate.extension
      modifierExtension = this@TestScriptSurrogate.modifierExtension
      url = Uri.of(this@TestScriptSurrogate.url, this@TestScriptSurrogate._url)
      identifier = this@TestScriptSurrogate.identifier
      version = R5String.of(this@TestScriptSurrogate.version, this@TestScriptSurrogate._version)
      versionAlgorithm =
        TestScript.VersionAlgorithm?.from(
          R5String.of(
            this@TestScriptSurrogate.versionAlgorithmString,
            this@TestScriptSurrogate._versionAlgorithmString,
          ),
          this@TestScriptSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@TestScriptSurrogate.name, this@TestScriptSurrogate._name)
      title = R5String.of(this@TestScriptSurrogate.title, this@TestScriptSurrogate._title)
      status =
        Enumeration.of(
          this@TestScriptSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@TestScriptSurrogate._status,
        )
      experimental =
        R5Boolean.of(this@TestScriptSurrogate.experimental, this@TestScriptSurrogate._experimental)
      date =
        DateTime.of(
          FhirDateTime.fromString(this@TestScriptSurrogate.date),
          this@TestScriptSurrogate._date,
        )
      publisher =
        R5String.of(this@TestScriptSurrogate.publisher, this@TestScriptSurrogate._publisher)
      contact = this@TestScriptSurrogate.contact
      description =
        Markdown.of(this@TestScriptSurrogate.description, this@TestScriptSurrogate._description)
      useContext = this@TestScriptSurrogate.useContext
      jurisdiction = this@TestScriptSurrogate.jurisdiction
      purpose = Markdown.of(this@TestScriptSurrogate.purpose, this@TestScriptSurrogate._purpose)
      copyright =
        Markdown.of(this@TestScriptSurrogate.copyright, this@TestScriptSurrogate._copyright)
      copyrightLabel =
        R5String.of(
          this@TestScriptSurrogate.copyrightLabel,
          this@TestScriptSurrogate._copyrightLabel,
        )
      origin = this@TestScriptSurrogate.origin
      destination = this@TestScriptSurrogate.destination
      metadata = this@TestScriptSurrogate.metadata
      scope = this@TestScriptSurrogate.scope
      fixture = this@TestScriptSurrogate.fixture
      profile =
        if (this@TestScriptSurrogate.profile == null && this@TestScriptSurrogate._profile == null) {
          null
        } else {
          (this@TestScriptSurrogate.profile
              ?: List(this@TestScriptSurrogate._profile!!.size) { null })
            .zip(
              this@TestScriptSurrogate._profile
                ?: List(this@TestScriptSurrogate.profile!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      variable = this@TestScriptSurrogate.variable
      setup = this@TestScriptSurrogate.setup
      test = this@TestScriptSurrogate.test
      teardown = this@TestScriptSurrogate.teardown
    }

  public companion object {
    public fun fromModel(model: TestScript): TestScriptSurrogate =
      with(model) {
        TestScriptSurrogate().apply {
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
          origin = this@with.origin
          destination = this@with.destination
          metadata = this@with.metadata
          scope = this@with.scope
          fixture = this@with.fixture
          profile = this@with.profile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _profile =
            this@with.profile?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          variable = this@with.variable
          setup = this@with.setup
          test = this@with.test
          teardown = this@with.teardown
        }
      }
  }
}
