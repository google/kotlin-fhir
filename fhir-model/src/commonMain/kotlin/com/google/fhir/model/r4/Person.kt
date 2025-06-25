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

import com.google.fhir.model.r4.serializers.PersonLinkSerializer
import com.google.fhir.model.r4.serializers.PersonSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Demographics and administrative information about a person independent of a specific
 * health-related context.
 */
@Serializable(with = PersonSerializer::class)
@SerialName("Person")
public data class Person(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
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
  override var contained: List<Resource?>? = null,
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
  override var extension: List<Extension?>? = null,
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
  override var modifierExtension: List<Extension?>? = null,
  /** Identifier for a person within a particular scope. */
  public var identifier: List<Identifier?>? = null,
  /**
   * A name associated with the person.
   *
   * Person may have multiple names with different uses or applicable periods.
   */
  public var name: List<HumanName?>? = null,
  /**
   * A contact detail for the person, e.g. a telephone number or an email address.
   *
   * Person may have multiple ways to be contacted with different uses or applicable periods. May
   * need to have options for contacting the person urgently and also to help with identification.
   */
  public var telecom: List<ContactPoint?>? = null,
  /**
   * Administrative Gender.
   *
   * The gender might not match the biological sex as determined by genetics, or the individual's
   * preferred identification. Note that for both humans and particularly animals, there are other
   * legitimate possibilities than M and F, though a clear majority of systems and contexts only
   * support M and F.
   */
  public var gender: Enumeration<AdministrativeGender>? = null,
  /**
   * The birth date for the person.
   *
   * At least an estimated year should be provided as a guess if the real DOB is unknown.
   */
  public var birthDate: Date? = null,
  /**
   * One or more addresses for the person.
   *
   * Person may have multiple addresses with different uses or applicable periods.
   */
  public var address: List<Address?>? = null,
  /**
   * An image that can be displayed as a thumbnail of the person to enhance the identification of
   * the individual.
   */
  public var photo: Attachment? = null,
  /** The organization that is the custodian of the person record. */
  public var managingOrganization: Reference? = null,
  /** Whether this person's record is in active use. */
  public var active: Boolean? = null,
  /** Link to a resource that concerns the same actual person. */
  public var link: List<Link>? = null,
) : DomainResource() {
  /** Link to a resource that concerns the same actual person. */
  @Serializable(with = PersonLinkSerializer::class)
  public class Link(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    override var extension: List<Extension?>? = null,
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
    override var modifierExtension: List<Extension?>? = null,
    /** The resource to which this actual person is associated. */
    public var target: Reference? = null,
    /** Level of assurance that this link is associated with the target resource. */
    public var assurance: Enumeration<IdentityAssuranceLevel>? = null,
  ) : BackboneElement()

  /**
   * The level of confidence that this link represents the same actual person, based on NIST
   * Authentication Levels.
   */
  public enum class IdentityAssuranceLevel(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** Little or no confidence in the asserted identity's accuracy. */
    Level1(
      "level1",
      "http://hl7.org/fhir/identity-assuranceLevel",
      "Level 1",
      "Little or no confidence in the asserted identity's accuracy.",
    ),
    /** Some confidence in the asserted identity's accuracy. */
    Level2(
      "level2",
      "http://hl7.org/fhir/identity-assuranceLevel",
      "Level 2",
      "Some confidence in the asserted identity's accuracy.",
    ),
    /** High confidence in the asserted identity's accuracy. */
    Level3(
      "level3",
      "http://hl7.org/fhir/identity-assuranceLevel",
      "Level 3",
      "High confidence in the asserted identity's accuracy.",
    ),
    /** Very high confidence in the asserted identity's accuracy. */
    Level4(
      "level4",
      "http://hl7.org/fhir/identity-assuranceLevel",
      "Level 4",
      "Very high confidence in the asserted identity's accuracy.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): IdentityAssuranceLevel =
        when (code) {
          "level1" -> Level1
          "level2" -> Level2
          "level3" -> Level3
          "level4" -> Level4
          else ->
            throw IllegalArgumentException("Unknown code $code for enum IdentityAssuranceLevel")
        }
    }
  }
}
