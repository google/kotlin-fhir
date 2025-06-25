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

import com.google.fhir.model.r5.serializers.PractitionerCommunicationSerializer
import com.google.fhir.model.r5.serializers.PractitionerQualificationSerializer
import com.google.fhir.model.r5.serializers.PractitionerSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A person who is directly or indirectly involved in the provisioning of healthcare or related
 * services.
 */
@Serializable(with = PractitionerSerializer::class)
@SerialName("Practitioner")
public data class Practitioner(
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
  /** An identifier that applies to this person in this role. */
  public var identifier: List<Identifier?>? = null,
  /**
   * Whether this practitioner's record is in active use.
   *
   * If the practitioner is not in use by one organization, then it should mark the period on the
   * PractitonerRole with an end date (even if they are active) as they may be active in another
   * role.
   */
  public var active: Boolean? = null,
  /**
   * The name(s) associated with the practitioner.
   *
   * The selection of the use property should ensure that there is a single usual name specified,
   * and others use the nickname (alias), old, or other values as appropriate.
   *
   * In general, select the value to be used in the ResourceReference.display based on this:
   * 1. There is more than 1 name
   * 2. Use = usual
   * 3. Period is current to the date of the usage
   * 4. Use = official
   * 5. Other order as decided by internal business rules.
   */
  public var name: List<HumanName?>? = null,
  /**
   * A contact detail for the practitioner, e.g. a telephone number or an email address.
   *
   * Person may have multiple ways to be contacted with different uses or applicable periods. May
   * need to have options for contacting the person urgently and to help with identification. These
   * typically will have home numbers, or mobile numbers that are not role specific.
   */
  public var telecom: List<ContactPoint?>? = null,
  /**
   * Administrative Gender - the gender that the person is considered to have for administration and
   * record keeping purposes.
   */
  public var gender: Enumeration<AdministrativeGender>? = null,
  /** The date of birth for the practitioner. */
  public var birthDate: Date? = null,
  /**
   * Indicates if the practitioner is deceased or not.
   *
   * If there's no value in the instance, it means there is no statement on whether or not the
   * practitioner is deceased. Most systems will interpret the absence of a value as a sign of the
   * person being alive.
   */
  public var deceased: Deceased? = null,
  /**
   * Address(es) of the practitioner that are not role specific (typically home address). Work
   * addresses are not typically entered in this property as they are usually role dependent.
   *
   * The PractitionerRole does not have an address value on it, as it is expected that the location
   * property be used for this purpose (which has an address).
   */
  public var address: List<Address?>? = null,
  /** Image of the person. */
  public var photo: List<Attachment?>? = null,
  /**
   * The official qualifications, certifications, accreditations, training, licenses (and other
   * types of educations/skills/capabilities) that authorize or otherwise pertain to the provision
   * of care by the practitioner.
   *
   * For example, a medical license issued by a medical board of licensure authorizing the
   * practitioner to practice medicine within a certain locality.
   *
   * The PractitionerRole.specialty defines the functional role that they are practicing at a given
   * organization or location. Those specialties may or might not require a qualification, and are
   * not defined on the practitioner.
   */
  public var qualification: List<Qualification>? = null,
  /**
   * A language which may be used to communicate with the practitioner, often for
   * correspondence/administrative purposes.
   *
   * The `PractitionerRole.communication` property should be used for publishing the languages that
   * a practitioner is able to communicate with patients (on a per Organization/Role basis).
   *
   * If no language is specified, this *implies* that the default local language is spoken. If you
   * need to convey proficiency for multiple modes, then you need multiple
   * Practitioner.Communication associations.
   *
   * For animals, language is not a relevant field, and should be absent from the instance.
   */
  public var communication: List<Communication>? = null,
) : DomainResource() {
  /**
   * The official qualifications, certifications, accreditations, training, licenses (and other
   * types of educations/skills/capabilities) that authorize or otherwise pertain to the provision
   * of care by the practitioner.
   *
   * For example, a medical license issued by a medical board of licensure authorizing the
   * practitioner to practice medicine within a certain locality.
   */
  @Serializable(with = PractitionerQualificationSerializer::class)
  public class Qualification(
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
    /** An identifier that applies to this person's qualification. */
    public var identifier: List<Identifier?>? = null,
    /** Coded representation of the qualification. */
    public var code: CodeableConcept? = null,
    /** Period during which the qualification is valid. */
    public var period: Period? = null,
    /** Organization that regulates and issues the qualification. */
    public var issuer: Reference? = null,
  ) : BackboneElement()

  /**
   * A language which may be used to communicate with the practitioner, often for
   * correspondence/administrative purposes.
   *
   * The `PractitionerRole.communication` property should be used for publishing the languages that
   * a practitioner is able to communicate with patients (on a per Organization/Role basis).
   */
  @Serializable(with = PractitionerCommunicationSerializer::class)
  public class Communication(
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
     * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen
     * and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or
     * "en-US" for American English versus "en-AU" for Australian English.
     *
     * The structure aa-BB with this exact casing is one the most widely used notations for locale.
     * However not all systems actually code this but instead have it as free text. Hence
     * CodeableConcept instead of code as the data type.
     */
    public var language: CodeableConcept? = null,
    /**
     * Indicates whether or not the person prefers this language (over other languages he masters up
     * a certain level).
     *
     * This language is specifically identified for communicating directly with the practitioner
     * (typically un-related to patient communications).
     */
    public var preferred: Boolean? = null,
  ) : BackboneElement()

  public sealed interface Deceased {
    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asDateTime(): DateTime? = this as? DateTime

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Deceased

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Deceased

    public companion object {
      public fun from(
        booleanValue: com.google.fhir.model.r5.Boolean?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
      ): Deceased? {
        if (booleanValue != null) return Boolean(booleanValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        return null
      }
    }
  }
}
