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

import com.google.fhir.model.r5.serializers.SubscriptionStatusNotificationEventSerializer
import com.google.fhir.model.r5.serializers.SubscriptionStatusSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The SubscriptionStatus resource describes the state of a Subscription during notifications. It is
 * not persisted.
 */
@Serializable(with = SubscriptionStatusSerializer::class)
@SerialName("SubscriptionStatus")
public data class SubscriptionStatus(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override var id: String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override var meta: Meta? = null,
  /**
   * A reference to a set of rules that were followed when the resource was constructed, and which
   * must be understood when processing the content. Often, this is a reference to an implementation
   * guide that defines the special rules along with other profiles etc.
   *
   * Asserting this rule set restricts the content to be only understood by a limited set of trading
   * partners. This inherently limits the usefulness of the data in the long term. However, the
   * existing health eco-system is highly fractured, and not yet ready to define, collect, and
   * exchange data in a generally computable sense. Wherever possible, implementers and/or
   * specification writers should avoid using this element. Often, when used, the URL is a reference
   * to an implementation guide that defines these special rules as part of its narrative along with
   * other profiles, value sets, etc.
   */
  override var implicitRules: Uri? = null,
  /**
   * The base language in which the resource is written.
   *
   * Language is provided to support indexing and accessibility (typically, services such as text to
   * speech use the language tag). The html language tag in the narrative applies to the narrative.
   * The language tag on the resource may be used to specify the language of other presentations
   * generated from the data in the resource. Not all the content has to be in the base language.
   * The Resource.language should not be assumed to apply to the narrative automatically. If a
   * language is specified, it should it also be specified on the div element in the html (see rules
   * in HTML5 for information about the relationship between xml:lang and the html lang attribute).
   */
  override var language: Code? = null,
  /**
   * A human-readable narrative that contains a summary of the resource and can be used to represent
   * the content of the resource to a human. The narrative need not encode all the structured data,
   * but is required to contain sufficient detail to make it "clinically safe" for a human to just
   * read the narrative. Resource definitions may define what content should be represented in the
   * narrative to ensure clinical safety.
   *
   * Contained resources do not have a narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, nor can they have their own independent
   * transaction scope. This is allowed to be a Parameters resource if and only if it is referenced
   * by a resource that provides context/meaning.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags in their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: List<Resource?>? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and managable, there is a strict set of governance
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
   * May be used to represent additional information that is not part of the basic definition of the
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and managable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer is
   * allowed to define an extension, there is a set of requirements that SHALL be met as part of the
   * definition of the extension. Applications processing a resource are required to check for
   * modifier extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource
   * (including cannot change the meaning of modifierExtension itself).
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var modifierExtension: List<Extension?>? = null,
  /** The status of the subscription, which marks the server state for managing the subscription. */
  public var status: Enumeration<SubscriptionStatus>? = null,
  /** The type of event being conveyed with this notification. */
  public var type: Enumeration<SubscriptionNotificationType>? = null,
  /**
   * The total number of actual events which have been generated since the Subscription was created
   * (inclusive of this notification) - regardless of how many have been successfully communicated.
   * This number is NOT incremented for handshake and heartbeat notifications.
   */
  public var eventsSinceSubscriptionStart: Integer64? = null,
  /** Detailed information about events relevant to this subscription notification. */
  public var notificationEvent: List<NotificationEvent>? = null,
  /** The reference to the Subscription which generated this notification. */
  public var subscription: Reference? = null,
  /**
   * The reference to the SubscriptionTopic for the Subscription which generated this notification.
   *
   * This value SHOULD NOT be present when using `empty` payloads, MAY be present when using
   * `id-only` payloads, and SHOULD be present when using `full-resource` payloads.
   */
  public var topic: Canonical? = null,
  /**
   * A record of errors that occurred when the server processed a notification.
   *
   * Recommended practice: clear errors when status is updated.
   */
  public var error: List<CodeableConcept?>? = null,
) : DomainResource() {
  /** Detailed information about events relevant to this subscription notification. */
  @Serializable(with = SubscriptionStatusNotificationEventSerializer::class)
  public class NotificationEvent(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: List<Extension?>? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and managable, there is
     * a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: List<Extension?>? = null,
    /**
     * Either the sequential number of this event in this subscription context or a relative event
     * number for this notification.
     *
     * In subscriptions where delivery of notifications IS NOT guaranteed (e.g., REST-Hook), this
     * number is a unique and monotonically-increasing event number for a subscription. In channels
     * where delivery of notifications IS guaranteed, this number is a relative index for the events
     * present in the notification (e.g., 1, 2, etc.).
     */
    public var eventNumber: Integer64? = null,
    /** The actual time this event occurred on the server. */
    public var timestamp: Instant? = null,
    /**
     * The focus of this event. While this will usually be a reference to the focus resource of the
     * event, it MAY contain a reference to a non-FHIR object.
     */
    public var focus: Reference? = null,
    /**
     * Additional context information for this event. Generally, this will contain references to
     * additional resources included with the event (e.g., the Patient relevant to an Encounter),
     * however it MAY refer to non-FHIR objects.
     */
    public var additionalContext: List<Reference?>? = null,
  ) : BackboneElement()

  /** State values for FHIR Subscriptions. */
  public enum class SubscriptionStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The client has requested the subscription, and the server has not yet set it up. */
    Requested(
      "requested",
      "http://hl7.org/fhir/subscription-status",
      "Requested",
      "The client has requested the subscription, and the server has not yet set it up.",
    ),
    /** The subscription is active. */
    Active(
      "active",
      "http://hl7.org/fhir/subscription-status",
      "Active",
      "The subscription is active.",
    ),
    /** The server has an error executing the notification. */
    Error(
      "error",
      "http://hl7.org/fhir/subscription-status",
      "Error",
      "The server has an error executing the notification.",
    ),
    /** Too many errors have occurred or the subscription has expired. */
    Off(
      "off",
      "http://hl7.org/fhir/subscription-status",
      "Off",
      "Too many errors have occurred or the subscription has expired.",
    ),
    /** This subscription has been flagged as incorrect. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/subscription-status",
      "Entered in Error",
      "This subscription has been flagged as incorrect.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): SubscriptionStatus =
        when (code) {
          "requested" -> Requested
          "active" -> Active
          "error" -> Error
          "off" -> Off
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum SubscriptionStatus")
        }
    }
  }

  /** The type of notification represented by the status message. */
  public enum class SubscriptionNotificationType(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The status was generated as part of the setup or verification of a communications channel.
     */
    Handshake(
      "handshake",
      "http://hl7.org/fhir/subscription-notification-type",
      "Handshake",
      "The status was generated as part of the setup or verification of a communications channel.",
    ),
    /** The status was generated to perform a heartbeat notification to the subscriber. */
    Heartbeat(
      "heartbeat",
      "http://hl7.org/fhir/subscription-notification-type",
      "Heartbeat",
      "The status was generated to perform a heartbeat notification to the subscriber.",
    ),
    /** The status was generated for an event to the subscriber. */
    Event_Notification(
      "event-notification",
      "http://hl7.org/fhir/subscription-notification-type",
      "Event Notification",
      "The status was generated for an event to the subscriber.",
    ),
    /** The status was generated in response to a status query/request. */
    Query_Status(
      "query-status",
      "http://hl7.org/fhir/subscription-notification-type",
      "Query Status",
      "The status was generated in response to a status query/request.",
    ),
    /** The status was generated in response to an event query/request. */
    Query_Event(
      "query-event",
      "http://hl7.org/fhir/subscription-notification-type",
      "Query Event",
      "The status was generated in response to an event query/request.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): SubscriptionNotificationType =
        when (code) {
          "handshake" -> Handshake
          "heartbeat" -> Heartbeat
          "event-notification" -> Event_Notification
          "query-status" -> Query_Status
          "query-event" -> Query_Event
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum SubscriptionNotificationType"
            )
        }
    }
  }
}
