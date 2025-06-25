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

package com.google.fhir.model.r4

import com.google.fhir.model.r4.serializers.AttachmentSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for Attachment Type: For referring to data content defined in other
 * formats.
 */
@Serializable(with = AttachmentSerializer::class)
public data class Attachment(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
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
   * Identifies the type of the data in the attachment and allows a method to be chosen to interpret
   * or render the data. Includes mime type parameters such as charset where appropriate.
   */
  public var contentType: Code? = null,
  /** The human language of the content. The value can be any valid value according to BCP 47. */
  public var language: Code? = null,
  /**
   * The actual data of the attachment - a sequence of bytes, base64 encoded.
   *
   * The base64-encoded data SHALL be expressed in the same character set as the base resource XML
   * or JSON.
   */
  public var `data`: Base64Binary? = null,
  /**
   * A location where the data can be accessed.
   *
   * If both data and url are provided, the url SHALL point to the same content as the data
   * contains. Urls may be relative references or may reference transient locations such as a
   * wrapping envelope using cid: though this has ramifications for using signatures. Relative URLs
   * are interpreted relative to the service url, like a resource reference, rather than relative to
   * the resource itself. If a URL is provided, it SHALL resolve to actual data.
   */
  public var url: Url? = null,
  /**
   * The number of bytes of data that make up this attachment (before base64 encoding, if that is
   * done).
   *
   * The number of bytes is redundant if the data is provided as a base64binary, but is useful if
   * the data is provided as a url reference.
   */
  public var size: UnsignedInt? = null,
  /**
   * The calculated hash of the data using SHA-1. Represented using base64.
   *
   * The hash is calculated on the data prior to base64 encoding, if the data is based64 encoded.
   * The hash is not intended to support digital signatures. Where protection against malicious
   * threats a digital signature should be considered, see
   * [Provenance.signature](provenance-definitions.html#Provenance.signature) for mechanism to
   * protect a resource with a digital signature.
   */
  public var hash: Base64Binary? = null,
  /** A label or set of text to display in place of the data. */
  public var title: String? = null,
  /** The date that the attachment was first created. */
  public var creation: DateTime? = null,
) : Element()
