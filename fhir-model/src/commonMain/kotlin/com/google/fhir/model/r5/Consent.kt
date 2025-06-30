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

import com.google.fhir.model.r5.serializers.ConsentPolicyBasisSerializer
import com.google.fhir.model.r5.serializers.ConsentProvisionActorSerializer
import com.google.fhir.model.r5.serializers.ConsentProvisionDataSerializer
import com.google.fhir.model.r5.serializers.ConsentProvisionSerializer
import com.google.fhir.model.r5.serializers.ConsentSerializer
import com.google.fhir.model.r5.serializers.ConsentVerificationSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of a healthcare consumer’s choices or choices made on their behalf by a third party,
 * which permits or denies identified recipient(s) or recipient role(s) to perform one or more
 * actions within a given policy context, for specific purposes and periods of time.
 */
@Serializable(with = ConsentSerializer::class)
@SerialName("Consent")
public data class Consent(
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
  /**
   * Unique identifier for this copy of the Consent Statement.
   *
   * This identifier identifies this copy of the consent. Where this identifier is also used
   * elsewhere as the identifier for a consent record (e.g. a CDA consent document) then the consent
   * details are expected to be the same.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * Indicates the current state of this Consent resource.
   *
   * This element is labeled as a modifier because the status contains the codes rejected and
   * entered-in-error that mark the Consent as not currently valid.
   */
  public var status: Enumeration<ConsentState>? = null,
  /**
   * A classification of the type of consents found in the statement. This element supports indexing
   * and retrieval of consent statements.
   */
  public var category: List<CodeableConcept?>? = null,
  /** The patient/healthcare practitioner or group of persons to whom this consent applies. */
  public var subject: Reference? = null,
  /** Date the consent instance was agreed to. */
  public var date: Date? = null,
  /**
   * Effective period for this Consent Resource and all provisions unless specified in that
   * provision.
   */
  public var period: Period? = null,
  /** The entity responsible for granting the rights listed in a Consent Directive. */
  public var grantor: List<Reference?>? = null,
  /**
   * The entity responsible for complying with the Consent Directive, including any obligations or
   * limitations on authorizations and enforcement of prohibitions.
   *
   * In a fully computable consent, both grantee and grantor will be listed as actors within the
   * consent. The Grantee and Grantor elements are for ease of search only.
   */
  public var grantee: List<Reference?>? = null,
  /** The actor that manages the consent through its lifecycle. */
  public var manager: List<Reference?>? = null,
  /** The actor that controls/enforces the access according to the consent. */
  public var controller: List<Reference?>? = null,
  /**
   * The source on which this consent statement is based. The source might be a scanned original
   * paper form.
   *
   * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a
   * consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA
   * document id.
   */
  public var sourceAttachment: List<Attachment?>? = null,
  /**
   * A reference to a consent that links back to such a source, a reference to a document repository
   * (e.g. XDS) that stores the original consent document.
   *
   * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a
   * consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA
   * document id.
   */
  public var sourceReference: List<Reference?>? = null,
  /** A set of codes that indicate the regulatory basis (if any) that this consent supports. */
  public var regulatoryBasis: List<CodeableConcept?>? = null,
  /**
   * A Reference or URL used to uniquely identify the policy the organization will enforce for this
   * Consent. This Reference or URL should be specific to the version of the policy and should be
   * dereferencable to a computable policy of some form.
   */
  public var policyBasis: PolicyBasis? = null,
  /** A Reference to the human readable policy explaining the basis for the Consent. */
  public var policyText: List<Reference?>? = null,
  /**
   * Whether a treatment instruction (e.g. artificial respiration: yes or no) was verified with the
   * patient, his/her family or another authorized person.
   */
  public var verification: List<Verification>? = null,
  /** Action to take - permit or deny - as default. */
  public var decision: Enumeration<ConsentProvisionType>? = null,
  /**
   * An exception to the base policy of this consent. An exception can be an addition or removal of
   * access permissions.
   */
  public var provision: List<Provision>? = null,
) : DomainResource() {
  /**
   * A Reference or URL used to uniquely identify the policy the organization will enforce for this
   * Consent. This Reference or URL should be specific to the version of the policy and should be
   * dereferencable to a computable policy of some form.
   */
  @Serializable(with = ConsentPolicyBasisSerializer::class)
  public class PolicyBasis(
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
     * A Reference that identifies the policy the organization will enforce for this Consent.
     *
     * While any resource may be used, Consent, PlanDefinition and Contract would be most frequent
     */
    public var reference: Reference? = null,
    /**
     * A URL that links to a computable version of the policy the organization will enforce for this
     * Consent.
     */
    public var url: Url? = null,
  ) : BackboneElement()

  /**
   * Whether a treatment instruction (e.g. artificial respiration: yes or no) was verified with the
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
    /** Has the instruction been verified. */
    public var verified: Boolean? = null,
    /**
     * Extensible list of verification type starting with verification and re-validation.
     *
     * This allows the verification element to hold multiple use cases including RelatedPerson
     * verification of the Grantee decision and periodic re-validation of the consent.
     */
    public var verificationType: CodeableConcept? = null,
    /** The person who conducted the verification/validation of the Grantor decision. */
    public var verifiedBy: Reference? = null,
    /** Who verified the instruction (Patient, Relative or other Authorized Person). */
    public var verifiedWith: Reference? = null,
    /**
     * Date(s) verification was collected.
     *
     * Allows for history of verification/validation.
     */
    public var verificationDate: List<DateTime?>? = null,
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
     * Timeframe for this provision.
     *
     * This is the bound effective time of the consent and should be in the base provision in the
     * Consent resource.
     */
    public var period: Period? = null,
    /**
     * Who or what is controlled by this provision. Use group to identify a set of actors by some
     * property they share (e.g. 'admitting officers').
     */
    public var actor: List<Actor>? = null,
    /**
     * Actions controlled by this provision.
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
     * are controlled by this provision.
     *
     * When the purpose of use tag is on the data, access request purpose of use shall not conflict.
     */
    public var purpose: List<Coding?>? = null,
    /**
     * The documentType(s) covered by this provision. The type can be a CDA document, or some other
     * type that indicates what sort of information the consent relates to.
     *
     * Multiple types are or'ed together. The intention of the documentType element is that the
     * codes refer to document types defined in a standard somewhere.
     */
    public var documentType: List<Coding?>? = null,
    /**
     * The resourceType(s) covered by this provision. The type can be a FHIR resource type or a
     * profile on a type that indicates what information the consent relates to.
     *
     * Multiple types are or'ed together. The intention of the resourceType element is that the
     * codes refer to profiles or document types defined in a standard or an implementation guide
     * somewhere.
     */
    public var resourceType: List<Coding?>? = null,
    /** If this code is found in an instance, then the provision applies. */
    public var code: List<CodeableConcept?>? = null,
    /**
     * Clinical or Operational Relevant period of time that bounds the data controlled by this
     * provision.
     *
     * This has a different sense to the Consent.period - that is when the consent agreement holds.
     * This is the time period of the data that is controlled by the agreement.
     */
    public var dataPeriod: Period? = null,
    /** The resources controlled by this provision if specific resources are referenced. */
    public var `data`: List<Data>? = null,
    /**
     * A computable (FHIRPath or other) definition of what is controlled by this consent.
     *
     * Constraining the expression type for a specific implementation via profile is recommended
     */
    public var expression: Expression? = null,
    /** Provisions which provide exceptions to the base provision or subprovisions. */
    public var provision: List<Provision?>? = null,
  ) : BackboneElement() {
    /**
     * Who or what is controlled by this provision. Use group to identify a set of actors by some
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
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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

    /** The resources controlled by this provision if specific resources are referenced. */
    @Serializable(with = ConsentProvisionDataSerializer::class)
    public class Data(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
    /** The consent is to be followed and enforced. */
    Active(
      "active",
      "http://hl7.org/fhir/consent-state-codes",
      "Active",
      "The consent is to be followed and enforced.",
    ),
    /** The consent is terminated or replaced. */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/consent-state-codes",
      "Inactive",
      "The consent is terminated or replaced.",
    ),
    /** The consent development has been terminated prior to completion. */
    Not_Done(
      "not-done",
      "http://hl7.org/fhir/consent-state-codes",
      "Abandoned",
      "The consent development has been terminated prior to completion.",
    ),
    /** The consent was created wrongly (e.g. wrong patient) and should be ignored. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/consent-state-codes",
      "Entered in Error",
      "The consent was created wrongly (e.g. wrong patient) and should be ignored.",
    ),
    /** The resource is in an indeterminate state. */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/consent-state-codes",
      "Unknown",
      "The resource is in an indeterminate state.",
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
          "active" -> Active
          "inactive" -> Inactive
          "not-done" -> Not_Done
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum ConsentState")
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
      "Deny",
      "Consent is denied for actions meeting these rules.",
    ),
    /** Consent is provided for actions meeting these rules. */
    Permit(
      "permit",
      "http://hl7.org/fhir/consent-provision-type",
      "Permit",
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
}
