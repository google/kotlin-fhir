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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.MetaSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for Meta Type: The metadata about a resource. This is content in the
 * resource that is maintained by the infrastructure. Changes to the content might not always be
 * associated with version changes to the resource.
 */
@Serializable(with = MetaSerializer::class)
public data class Meta(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and manageable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: List<Extension?>? = null,
  /**
   * The version specific identifier, as it appears in the version portion of the URL. This value
   * changes when the resource is created, updated, or deleted.
   *
   * The server assigns this value, and ignores what the client specifies, except in the case that
   * the server is imposing version integrity on updates/deletes.
   */
  public var versionId: Id? = null,
  /**
   * When the resource last changed - e.g. when the version changed.
   *
   * This value is always populated except when the resource is first being created. The server /
   * resource manager sets this value; what a client provides is irrelevant. This is equivalent to
   * the HTTP Last-Modified and SHOULD have the same value on a [read](http.html#read) interaction.
   */
  public var lastUpdated: Instant? = null,
  /**
   * A uri that identifies the source system of the resource. This provides a minimal amount of
   * [Provenance](provenance.html#) information that can be used to track or differentiate the
   * source of information in the resource. The source may identify another FHIR server, document,
   * message, database, etc.
   *
   * In the provenance resource, this corresponds to Provenance.entity.what[x]. The exact use of the
   * source (and the implied Provenance.entity.role) is left to implementer discretion. Only one
   * nominated source is allowed; for additional provenance details, a full Provenance resource
   * should be used.
   *
   * This element can be used to indicate where the current master source of a resource that has a
   * canonical URL if the resource is no longer hosted at the canonical URL.
   */
  public var source: Uri? = null,
  /**
   * A list of profiles (references to [StructureDefinition](structuredefinition.html#) resources)
   * that this resource claims to conform to. The URL is a reference to
   * [StructureDefinition.url](structuredefinition-definitions.html#StructureDefinition.url).
   *
   * It is up to the server and/or other infrastructure of policy to determine whether/how these
   * claims are verified and/or updated over time. The list of profile URLs is a set.
   */
  public var profile: List<Canonical?>? = null,
  /**
   * Security labels applied to this resource. These tags connect specific resources to the overall
   * security policy and infrastructure.
   *
   * The security labels can be updated without changing the stated version of the resource. The
   * list of security labels is a set. Uniqueness is based the system/code, and version and display
   * are ignored.
   */
  public var security: List<Coding?>? = null,
  /**
   * Tags applied to this resource. Tags are intended to be used to identify and relate resources to
   * process and workflow, and applications are not required to consider the tags when interpreting
   * the meaning of a resource.
   *
   * The tags can be updated without changing the stated version of the resource. The list of tags
   * is a set. Uniqueness is based the system/code, and version and display are ignored.
   */
  public var tag: List<Coding?>? = null,
) : Element()
