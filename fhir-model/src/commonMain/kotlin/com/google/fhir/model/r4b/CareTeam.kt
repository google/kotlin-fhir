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

import com.google.fhir.model.r4b.serializers.CareTeamParticipantSerializer
import com.google.fhir.model.r4b.serializers.CareTeamSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The Care Team includes all the people and organizations who plan to participate in the
 * coordination and delivery of care for a patient.
 */
@Serializable(with = CareTeamSerializer::class)
@SerialName("CareTeam")
public data class CareTeam(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override var id: kotlin.String? = null,
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
   * to an implementation guide that defines these special rules as part of it's narrative along
   * with other profiles, value sets, etc.
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
   * Contained resources do not have narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, and nor can they have their own independent
   * transaction scope.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags In their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: MutableList<Resource> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and manageable, there is a strict set of
   * governance applied to the definition and use of extensions. Though any implementer can define
   * an extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: MutableList<Extension> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
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
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /**
   * Business identifiers assigned to this care team by the performer or other systems which remain
   * constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * Indicates the current state of the care team.
   *
   * This element is labeled as a modifier because the status contains the code entered-in-error
   * that marks the care team as not currently valid.
   */
  public var status: Enumeration<CareTeamStatus>? = null,
  /**
   * Identifies what kind of team. This is to support differentiation between multiple co-existing
   * teams, such as care plan team, episode of care team, longitudinal care team.
   *
   * There may be multiple axis of categorization and one team may serve multiple purposes.
   */
  public var category: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * A label for human use intended to distinguish like teams. E.g. the "red" vs. "green" trauma
   * teams.
   *
   * The meaning/purpose of the team is conveyed in CareTeam.category. This element may also convey
   * semantics of the team (e.g. "Red trauma team"), but its primary purpose is to distinguish
   * between identical teams in a human-friendly way. ("Team 18735" isn't as friendly.).
   */
  public var name: String? = null,
  /** Identifies the patient or group whose intended care is handled by the team. */
  public var subject: Reference? = null,
  /**
   * The Encounter during which this CareTeam was created or to which the creation of this record is
   * tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter.
   */
  public var encounter: Reference? = null,
  /** Indicates when the team did (or is intended to) come into effect and end. */
  public var period: Period? = null,
  /** Identifies all people and organizations who are expected to be involved in the care team. */
  public var participant: MutableList<Participant> = mutableListOf(),
  /** Describes why the care team exists. */
  public var reasonCode: MutableList<CodeableConcept> = mutableListOf(),
  /** Condition(s) that this care team addresses. */
  public var reasonReference: MutableList<Reference> = mutableListOf(),
  /** The organization responsible for the care team. */
  public var managingOrganization: MutableList<Reference> = mutableListOf(),
  /**
   * A central contact detail for the care team (that applies to all members).
   *
   * The ContactPoint.use code of home is not appropriate to use. These contacts are not the contact
   * details of individual care team members.
   */
  public var telecom: MutableList<ContactPoint> = mutableListOf(),
  /** Comments made about the CareTeam. */
  public var note: MutableList<Annotation> = mutableListOf(),
) : DomainResource() {
  /** Identifies all people and organizations who are expected to be involved in the care team. */
  @Serializable(with = CareTeamParticipantSerializer::class)
  public class Participant(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: MutableList<Extension> = mutableListOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
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
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * Indicates specific responsibility of an individual within the care team, such as "Primary
     * care physician", "Trained social worker counselor", "Caregiver", etc.
     *
     * Roles may sometimes be inferred by type of Practitioner. These are relationships that hold
     * only within the context of the care team. General relationships should be handled as
     * properties of the Patient resource directly.
     */
    public var role: MutableList<CodeableConcept> = mutableListOf(),
    /**
     * The specific person or organization who is participating/expected to participate in the care
     * team.
     *
     * Patient only needs to be listed if they have a role other than "subject of care".
     *
     * Member is optional because some participants may be known only by their role, particularly in
     * draft plans.
     */
    public var member: Reference? = null,
    /** The organization of the practitioner. */
    public var onBehalfOf: Reference? = null,
    /**
     * Indicates when the specific member or organization did (or is intended to) come into effect
     * and end.
     */
    public var period: Period? = null,
  ) : BackboneElement()

  /** Indicates the status of the care team. */
  public enum class CareTeamStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Proposed("proposed", "http://hl7.org/fhir/care-team-status", "Proposed"),
    Active("active", "http://hl7.org/fhir/care-team-status", "Active"),
    Suspended("suspended", "http://hl7.org/fhir/care-team-status", "Suspended"),
    Inactive("inactive", "http://hl7.org/fhir/care-team-status", "Inactive"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/care-team-status",
      "Entered in Error",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): CareTeamStatus =
        when (code) {
          "proposed" -> Proposed
          "active" -> Active
          "suspended" -> Suspended
          "inactive" -> Inactive
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum CareTeamStatus")
        }
    }
  }
}
