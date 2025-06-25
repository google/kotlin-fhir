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

import com.google.fhir.model.r4b.serializers.ConsentPolicySerializer
import com.google.fhir.model.r4b.serializers.ConsentProvisionActorSerializer
import com.google.fhir.model.r4b.serializers.ConsentProvisionDataSerializer
import com.google.fhir.model.r4b.serializers.ConsentProvisionSerializer
import com.google.fhir.model.r4b.serializers.ConsentSerializer
import com.google.fhir.model.r4b.serializers.ConsentVerificationSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or
 * recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 */
@Serializable(with = ConsentSerializer::class)
@SerialName("Consent")
public data class Consent(
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
  /**
   * Unique identifier for this copy of the Consent Statement.
   *
   * This identifier identifies this copy of the consent. Where this identifier is also used
   * elsewhere as the identifier for a consent record (e.g. a CDA consent document) then the consent
   * details are expected to be the same.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * Indicates the current state of this consent.
   *
   * This element is labeled as a modifier because the status contains the codes rejected and
   * entered-in-error that mark the Consent as not currently valid.
   */
  public var status: Enumeration<ConsentState>? = null,
  /**
   * A selector of the type of consent being presented: ADR, Privacy, Treatment, Research. This list
   * is now extensible.
   */
  public var scope: CodeableConcept? = null,
  /**
   * A classification of the type of consents found in the statement. This element supports indexing
   * and retrieval of consent statements.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * The patient/healthcare consumer to whom this consent applies.
   *
   * Commonly, the patient the consent pertains to is the author, but for young and old people, it
   * may be some other person.
   */
  public var patient: Reference? = null,
  /**
   * When this Consent was issued / created / indexed.
   *
   * This is not the time of the original consent, but the time that this statement was made or
   * derived.
   */
  public var dateTime: DateTime? = null,
  /**
   * Either the Grantor, which is the entity responsible for granting the rights listed in a Consent
   * Directive or the Grantee, which is the entity responsible for complying with the Consent
   * Directive, including any obligations or limitations on authorizations and enforcement of
   * prohibitions.
   *
   * Commonly, the patient the consent pertains to is the consentor, but particularly for young and
   * old people, it may be some other person - e.g. a legal guardian.
   */
  public var performer: List<Reference?>? = null,
  /** The organization that manages the consent, and the framework within which it is executed. */
  public var organization: List<Reference?>? = null,
  /**
   * The source on which this consent statement is based. The source might be a scanned original
   * paper form, or a reference to a consent that links back to such a source, a reference to a
   * document repository (e.g. XDS) that stores the original consent document.
   *
   * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a
   * consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA
   * document id.
   */
  public var source: Source? = null,
  /**
   * The references to the policies that are included in this consent scope. Policies may be
   * organizational, but are often defined jurisdictionally, or in law.
   */
  public var policy: List<Policy>? = null,
  /**
   * A reference to the specific base computable regulation or policy.
   *
   * If the policyRule is absent, computable consent would need to be constructed from the elements
   * of the Consent resource.
   */
  public var policyRule: CodeableConcept? = null,
  /**
   * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the
   * patient, his/her family or another authorized person.
   */
  public var verification: List<Verification>? = null,
  /**
   * An exception to the base policy of this consent. An exception can be an addition or removal of
   * access permissions.
   */
  public var provision: Provision? = null,
) : DomainResource() {
  /**
   * The references to the policies that are included in this consent scope. Policies may be
   * organizational, but are often defined jurisdictionally, or in law.
   */
  @Serializable(with = ConsentPolicySerializer::class)
  public class Policy(
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
    /**
     * Entity or Organization having regulatory jurisdiction or accountability for enforcing
     * policies pertaining to Consent Directives.
     */
    public var authority: Uri? = null,
    /**
     * The references to the policies that are included in this consent scope. Policies may be
     * organizational, but are often defined jurisdictionally, or in law.
     *
     * This element is for discoverability / documentation and does not modify or qualify the policy
     * rules.
     */
    public var uri: Uri? = null,
  ) : BackboneElement()

  /**
   * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the
   * patient, his/her family or another authorized person.
   */
  @Serializable(with = ConsentVerificationSerializer::class)
  public class Verification(
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
    /** Has the instruction been verified. */
    public var verified: Boolean? = null,
    /** Who verified the instruction (Patient, Relative or other Authorized Person). */
    public var verifiedWith: Reference? = null,
    /** Date verification was collected. */
    public var verificationDate: DateTime? = null,
  ) : BackboneElement()

  /**
   * An exception to the base policy of this consent. An exception can be an addition or removal of
   * access permissions.
   */
  @Serializable(with = ConsentProvisionSerializer::class)
  public class Provision(
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
    /**
     * Action to take - permit or deny - when the rule conditions are met. Not permitted in root
     * rule, required in all nested rules.
     */
    public var type: Enumeration<ConsentProvisionType>? = null,
    /** The timeframe in this rule is valid. */
    public var period: Period? = null,
    /**
     * Who or what is controlled by this rule. Use group to identify a set of actors by some
     * property they share (e.g. 'admitting officers').
     */
    public var actor: List<Actor>? = null,
    /**
     * Actions controlled by this Rule.
     *
     * Note that this is the direct action (not the grounds for the action covered in the purpose
     * element). At present, the only action in the understood and tested scope of this resource is
     * 'read'.
     */
    public var action: List<CodeableConcept?>? = null,
    /**
     * A security label, comprised of 0..* security label fields (Privacy tags), which define which
     * resources are controlled by this exception.
     *
     * If the consent specifies a security label of "R" then it applies to all resources that are
     * labeled "R" or lower. E.g. for Confidentiality, it's a high water mark. For other kinds of
     * security labels, subsumption logic applies. When the purpose of use tag is on the data,
     * access request purpose of use shall not conflict.
     */
    public var securityLabel: List<Coding?>? = null,
    /**
     * The context of the activities a user is taking - why the user is accessing the data - that
     * are controlled by this rule.
     *
     * When the purpose of use tag is on the data, access request purpose of use shall not conflict.
     */
    public var purpose: List<Coding?>? = null,
    /**
     * The class of information covered by this rule. The type can be a FHIR resource type, a
     * profile on a type, or a CDA document, or some other type that indicates what sort of
     * information the consent relates to.
     *
     * Multiple types are or'ed together. The intention of the contentType element is that the codes
     * refer to profiles or document types defined in a standard or an implementation guide
     * somewhere.
     */
    public var `class`: List<Coding?>? = null,
    /**
     * If this code is found in an instance, then the rule applies.
     *
     * Typical use of this is a Document code with class = CDA.
     */
    public var code: List<CodeableConcept?>? = null,
    /**
     * Clinical or Operational Relevant period of time that bounds the data controlled by this rule.
     *
     * This has a different sense to the Consent.period - that is when the consent agreement holds.
     * This is the time period of the data that is controlled by the agreement.
     */
    public var dataPeriod: Period? = null,
    /** The resources controlled by this rule if specific resources are referenced. */
    public var `data`: List<Data>? = null,
    /** Rules which provide exceptions to the base rule or subrules. */
    public var provision: List<Provision?>? = null,
  ) : BackboneElement() {
    /**
     * Who or what is controlled by this rule. Use group to identify a set of actors by some
     * property they share (e.g. 'admitting officers').
     */
    @Serializable(with = ConsentProvisionActorSerializer::class)
    public class Actor(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /**
       * How the individual is involved in the resources content that is described in the exception.
       */
      public var role: CodeableConcept? = null,
      /**
       * The resource that identifies the actor. To identify actors by type, use group to identify a
       * set of actors by some property they share (e.g. 'admitting officers').
       */
      public var reference: Reference? = null,
    ) : BackboneElement()

    /** The resources controlled by this rule if specific resources are referenced. */
    @Serializable(with = ConsentProvisionDataSerializer::class)
    public class Data(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /** How the resource reference is interpreted when testing consent restrictions. */
      public var meaning: Enumeration<ConsentDataMeaning>? = null,
      /**
       * A reference to a specific resource that defines which resources are covered by this
       * consent.
       */
      public var reference: Reference? = null,
    ) : BackboneElement()
  }

  public sealed interface Source {
    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asReference(): Reference? = this as? Reference

    public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) : Source

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Source

    public companion object {
      public fun from(
        AttachmentValue: com.google.fhir.model.r4b.Attachment?,
        ReferenceValue: com.google.fhir.model.r4b.Reference?,
      ): Source? {
        if (AttachmentValue != null) return Attachment(AttachmentValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  /** How a rule statement is applied, such as adding additional consent or removing consent. */
  public enum class ConsentProvisionType(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** Consent is denied for actions meeting these rules. */
    Deny(
      "deny",
      "http://hl7.org/fhir/consent-provision-type",
      "Opt Out",
      "Consent is denied for actions meeting these rules.",
    ),
    /** Consent is provided for actions meeting these rules. */
    Permit(
      "permit",
      "http://hl7.org/fhir/consent-provision-type",
      "Opt In",
      "Consent is provided for actions meeting these rules.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ConsentProvisionType =
        when (code) {
          "deny" -> Deny
          "permit" -> Permit
          else -> throw IllegalArgumentException("Unknown code $code for enum ConsentProvisionType")
        }
    }
  }

  /** How a resource reference is interpreted when testing consent restrictions. */
  public enum class ConsentDataMeaning(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The consent applies directly to the instance of the resource. */
    Instance(
      "instance",
      "http://hl7.org/fhir/consent-data-meaning",
      "Instance",
      "The consent applies directly to the instance of the resource.",
    ),
    /** The consent applies directly to the instance of the resource and instances it refers to. */
    Related(
      "related",
      "http://hl7.org/fhir/consent-data-meaning",
      "Related",
      "The consent applies directly to the instance of the resource and instances it refers to.",
    ),
    /**
     * The consent applies directly to the instance of the resource and instances that refer to it.
     */
    Dependents(
      "dependents",
      "http://hl7.org/fhir/consent-data-meaning",
      "Dependents",
      "The consent applies directly to the instance of the resource and instances that refer to it.",
    ),
    /** The consent applies to instances of resources that are authored by. */
    Authoredby(
      "authoredby",
      "http://hl7.org/fhir/consent-data-meaning",
      "AuthoredBy",
      "The consent applies to instances of resources that are authored by.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ConsentDataMeaning =
        when (code) {
          "instance" -> Instance
          "related" -> Related
          "dependents" -> Dependents
          "authoredby" -> Authoredby
          else -> throw IllegalArgumentException("Unknown code $code for enum ConsentDataMeaning")
        }
    }
  }

  /** Indicates the state of the consent. */
  public enum class ConsentState(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The consent is in development or awaiting use but is not yet intended to be acted upon. */
    Draft(
      "draft",
      "http://hl7.org/fhir/consent-state-codes",
      "Pending",
      "The consent is in development or awaiting use but is not yet intended to be acted upon.",
    ),
    /**
     * The consent has been proposed but not yet agreed to by all parties. The negotiation stage.
     */
    Proposed(
      "proposed",
      "http://hl7.org/fhir/consent-state-codes",
      "Proposed",
      "The consent has been proposed but not yet agreed to by all parties. The negotiation stage.",
    ),
    /** The consent is to be followed and enforced. */
    Active(
      "active",
      "http://hl7.org/fhir/consent-state-codes",
      "Active",
      "The consent is to be followed and enforced.",
    ),
    /** The consent has been rejected by one or more of the parties. */
    Rejected(
      "rejected",
      "http://hl7.org/fhir/consent-state-codes",
      "Rejected",
      "The consent has been rejected by one or more of the parties.",
    ),
    /** The consent is terminated or replaced. */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/consent-state-codes",
      "Inactive",
      "The consent is terminated or replaced.",
    ),
    /** The consent was created wrongly (e.g. wrong patient) and should be ignored. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/consent-state-codes",
      "Entered in Error",
      "The consent was created wrongly (e.g. wrong patient) and should be ignored.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ConsentState =
        when (code) {
          "draft" -> Draft
          "proposed" -> Proposed
          "active" -> Active
          "rejected" -> Rejected
          "inactive" -> Inactive
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum ConsentState")
        }
    }
  }
}
