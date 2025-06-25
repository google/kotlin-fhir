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

import com.google.fhir.model.r5.serializers.GroupCharacteristicSerializer
import com.google.fhir.model.r5.serializers.GroupMemberSerializer
import com.google.fhir.model.r5.serializers.GroupSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a defined collection of entities that may be discussed or acted upon collectively but
 * which are not expected to act collectively, and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 */
@Serializable(with = GroupSerializer::class)
@SerialName("Group")
public data class Group(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
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
  /**
   * Business identifiers assigned to this participant by one of the applications involved. These
   * identifiers remain constant as the resource is updated and propagates from server to server.
   *
   * Note: This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * Indicates whether the record for the group is available for use or is merely being retained for
   * historical purposes.
   */
  public var active: Boolean? = null,
  /**
   * Identifies the broad classification of the kind of resources the group includes.
   *
   * Group members SHALL be of the appropriate resource type (Patient for person or animal; or
   * Practitioner, PractitionerRole, Device, CareTeam, HealthcareService, Location, Organization,
   * RelatedPerson, or Specimen for the other types.), or a Group of the resources of the
   * appropriate type.
   */
  public var type: Enumeration<GroupType>? = null,
  /**
   * Basis for membership in the Group:
   * * 'definitional': The Group.characteristics specified are both necessary and sufficient to
   *   determine membership. All entities that meet the criteria are considered to be members of the
   *   group, whether referenced by the group or not. If members are present, they are individuals
   *   that happen to be known as meeting the Group.characteristics. The list cannot be presumed to
   *   be complete.
   * * 'enumerated': The Group.characteristics are necessary but not sufficient to determine
   *   membership. Membership is determined by being listed as one of the Group.member.
   */
  public var membership: Code? = null,
  /**
   * Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
   *
   * This would generally be omitted for Person resources.
   */
  public var code: CodeableConcept? = null,
  /** A label assigned to the group for human identification and communication. */
  public var name: String? = null,
  /** Explanation of what the group represents and how it is intended to be used. */
  public var description: Markdown? = null,
  /**
   * A count of the number of resource instances that are part of the group.
   *
   * Note that the quantity may be less than the number of members if some of the members are not
   * active.
   */
  public var quantity: UnsignedInt? = null,
  /**
   * Entity responsible for defining and maintaining Group characteristics and/or registered
   * members.
   *
   * This does not strictly align with ownership of a herd or flock, but may suffice to represent
   * that relationship in simple cases. More complex cases will require an extension.
   */
  public var managingEntity: Reference? = null,
  /**
   * Identifies traits whose presence r absence is shared by members of the group.
   *
   * All the identified characteristics must be true for an entity to a member of the group.
   */
  public var characteristic: List<Characteristic>? = null,
  /** Identifies the resource instances that are members of the group. */
  public var member: List<Member>? = null,
) : DomainResource() {
  /** Identifies traits whose presence r absence is shared by members of the group. */
  @Serializable(with = GroupCharacteristicSerializer::class)
  public class Characteristic(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
    /** A code that identifies the kind of trait being asserted. */
    public var code: CodeableConcept? = null,
    /**
     * The value of the trait that holds (or does not hold - see 'exclude') for members of the
     * group.
     *
     * For Range, it means members of the group have a value that falls somewhere within the
     * specified range.
     */
    public var `value`: Value? = null,
    /**
     * If true, indicates the characteristic is one that is NOT held by members of the group.
     *
     * This is labeled as "Is Modifier" because applications cannot wrongly include excluded members
     * as included or vice versa.
     */
    public var exclude: Boolean? = null,
    /**
     * The period over which the characteristic is tested; e.g. the patient had an operation during
     * the month of June.
     */
    public var period: Period? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Value? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** Identifies the resource instances that are members of the group. */
  @Serializable(with = GroupMemberSerializer::class)
  public class Member(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
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
     * A reference to the entity that is a member of the group. Must be consistent with Group.type.
     * If the entity is another group, then the type must be the same.
     */
    public var entity: Reference? = null,
    /** The period that the member was in the group, if known. */
    public var period: Period? = null,
    /**
     * A flag to indicate that the member is no longer in the group, but previously may have been a
     * member.
     */
    public var inactive: Boolean? = null,
  ) : BackboneElement()

  /** Types of resources that are part of group. */
  public enum class GroupType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Group contains "person" Patient resources. */
    Person(
      "person",
      "http://hl7.org/fhir/group-type",
      "Person",
      "Group contains \"person\" Patient resources.",
    ),
    /** Group contains "animal" Patient resources. */
    Animal(
      "animal",
      "http://hl7.org/fhir/group-type",
      "Animal",
      "Group contains \"animal\" Patient resources.",
    ),
    /** Group contains healthcare practitioner resources (Practitioner or PractitionerRole). */
    Practitioner(
      "practitioner",
      "http://hl7.org/fhir/group-type",
      "Practitioner",
      "Group contains healthcare practitioner resources (Practitioner or PractitionerRole).",
    ),
    /** Group contains Device resources. */
    Device(
      "device",
      "http://hl7.org/fhir/group-type",
      "Device",
      "Group contains Device resources.",
    ),
    /** Group contains CareTeam resources. */
    Careteam(
      "careteam",
      "http://hl7.org/fhir/group-type",
      "CareTeam",
      "Group contains CareTeam resources.",
    ),
    /** Group contains HealthcareService resources. */
    Healthcareservice(
      "healthcareservice",
      "http://hl7.org/fhir/group-type",
      "HealthcareService",
      "Group contains HealthcareService resources.",
    ),
    /** Group contains Location resources. */
    Location(
      "location",
      "http://hl7.org/fhir/group-type",
      "Location",
      "Group contains Location resources.",
    ),
    /** Group contains Organization resources. */
    Organization(
      "organization",
      "http://hl7.org/fhir/group-type",
      "Organization",
      "Group contains Organization resources.",
    ),
    /** Group contains RelatedPerson resources. */
    Relatedperson(
      "relatedperson",
      "http://hl7.org/fhir/group-type",
      "RelatedPerson",
      "Group contains RelatedPerson resources.",
    ),
    /** Group contains Specimen resources. */
    Specimen(
      "specimen",
      "http://hl7.org/fhir/group-type",
      "Specimen",
      "Group contains Specimen resources.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): GroupType =
        when (code) {
          "person" -> Person
          "animal" -> Animal
          "practitioner" -> Practitioner
          "device" -> Device
          "careteam" -> Careteam
          "healthcareservice" -> Healthcareservice
          "location" -> Location
          "organization" -> Organization
          "relatedperson" -> Relatedperson
          "specimen" -> Specimen
          else -> throw IllegalArgumentException("Unknown code $code for enum GroupType")
        }
    }
  }
}
