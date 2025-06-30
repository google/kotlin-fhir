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

package com.google.fhir.model.r5

import com.google.fhir.model.r5.serializers.VirtualServiceDetailSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/** VirtualServiceDetail Type: Virtual Service Contact Details. */
@Serializable(with = VirtualServiceDetailSerializer::class)
public data class VirtualServiceDetail(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and managable, there is a strict set of governance
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
   * The type of virtual service to connect to (i.e. Teams, Zoom, Specific VMR technology,
   * WhatsApp).
   *
   * As this type defines what the virtual service is, it then defines what address and additional
   * information might be relevant.
   *
   * Some profiles could be used for specific types to define what the other values could/should be.
   */
  public var channelType: Coding? = null,
  /**
   * What address or number needs to be used for a user to connect to the virtual service to join.
   * The channelType informs as to which datatype is appropriate to use (requires knowledge of the
   * specific type).
   */
  public var address: Address? = null,
  /**
   * Address to see alternative connection details.
   *
   * This web address can be used to provide additional details on the call, such as
   * alternative/regional call in numbers, or other associated services.
   */
  public var additionalInfo: List<Url?>? = null,
  /**
   * Maximum number of participants supported by the virtual service.
   *
   * Some services have only a limitted number of participants permitted to connect at a time, this
   * is typically used in "shared" virtual services that you might find on location resources.
   *
   * Typically on-demand services might not have these restrictions.
   */
  public var maxParticipants: PositiveInt? = null,
  /**
   * Session Key required by the virtual service.
   *
   * Some services require a session key to be able to access the service once connected.
   *
   * This could be in cases where a shared number is used, and a session key is added to put into a
   * private line, or to identify the participant in a call.
   */
  public var sessionKey: String? = null,
) : DataType() {
  public sealed interface Address {
    public fun asUrl(): Url? = this as? Url

    public fun asString(): String? = this as? String

    public fun asContactPoint(): ContactPoint? = this as? ContactPoint

    public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

    public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Address

    public data class String(public val `value`: com.google.fhir.model.r5.String) : Address

    public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
      Address

    public data class ExtendedContactDetail(
      public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
    ) : Address

    public companion object {
      public fun from(
        urlValue: com.google.fhir.model.r5.Url?,
        stringValue: com.google.fhir.model.r5.String?,
        ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
        ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
      ): Address? {
        if (urlValue != null) return Url(urlValue)
        if (stringValue != null) return String(stringValue)
        if (ContactPointValue != null) return ContactPoint(ContactPointValue)
        if (ExtendedContactDetailValue != null)
          return ExtendedContactDetail(ExtendedContactDetailValue)
        return null
      }
    }
  }
}
