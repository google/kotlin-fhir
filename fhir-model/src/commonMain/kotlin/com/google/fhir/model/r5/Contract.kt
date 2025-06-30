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

import com.google.fhir.model.r5.serializers.ContractContentDefinitionSerializer
import com.google.fhir.model.r5.serializers.ContractFriendlySerializer
import com.google.fhir.model.r5.serializers.ContractLegalSerializer
import com.google.fhir.model.r5.serializers.ContractRuleSerializer
import com.google.fhir.model.r5.serializers.ContractSerializer
import com.google.fhir.model.r5.serializers.ContractSignerSerializer
import com.google.fhir.model.r5.serializers.ContractTermActionSerializer
import com.google.fhir.model.r5.serializers.ContractTermActionSubjectSerializer
import com.google.fhir.model.r5.serializers.ContractTermAssetContextSerializer
import com.google.fhir.model.r5.serializers.ContractTermAssetSerializer
import com.google.fhir.model.r5.serializers.ContractTermAssetValuedItemSerializer
import com.google.fhir.model.r5.serializers.ContractTermOfferAnswerSerializer
import com.google.fhir.model.r5.serializers.ContractTermOfferPartySerializer
import com.google.fhir.model.r5.serializers.ContractTermOfferSerializer
import com.google.fhir.model.r5.serializers.ContractTermSecurityLabelSerializer
import com.google.fhir.model.r5.serializers.ContractTermSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
 * agreement.
 */
@Serializable(with = ContractSerializer::class)
@SerialName("Contract")
public data class Contract(
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
  /** Unique identifier for this Contract or a derivative that references a Source Contract. */
  public var identifier: List<Identifier?>? = null,
  /**
   * Canonical identifier for this contract, represented as a URI (globally unique).
   *
   * Used in a domain that uses a supplied contract repository.
   */
  public var url: Uri? = null,
  /**
   * An edition identifier used for business purposes to label business significant variants.
   *
   * Note - This is a business versionId, not a resource version id (see discussion at
   * [Versioning](resource.html#versions)) Comments - There may be different contract instances that
   * have the same identifier but different versions. The version can be appended to the url in a
   * reference to allow a reference to a particular business version of the plan definition with the
   * format [url]|[version]. The version SHOULD NOT contain a '#' - see
   * [Business Version](resource.html#bv-format).
   */
  public var version: String? = null,
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the contract
   * as not currently valid or active.
   */
  public var status: Enumeration<ContractStatus>? = null,
  /**
   * Legal states of the formation of a legal instrument, which is a formally executed written
   * document that can be formally attributed to its author, records and formally expresses a
   * legally enforceable act, process, or contractual duty, obligation, or right, and therefore
   * evidences that act, process, or agreement.
   */
  public var legalState: CodeableConcept? = null,
  /**
   * The URL pointing to a FHIR-defined Contract Definition that is adhered to in whole or part by
   * this Contract.
   */
  public var instantiatesCanonical: Reference? = null,
  /**
   * The URL pointing to an externally maintained definition that is adhered to in whole or in part
   * by this Contract.
   */
  public var instantiatesUri: Uri? = null,
  /**
   * The minimal content derived from the basal information source at a specific stage in its
   * lifecycle.
   */
  public var contentDerivative: CodeableConcept? = null,
  /** When this Contract was issued. */
  public var issued: DateTime? = null,
  /** Relevant time or time-period when this Contract is applicable. */
  public var applies: Period? = null,
  /**
   * Event resulting in discontinuation or termination of this Contract instance by one or more
   * parties to the contract.
   */
  public var expirationType: CodeableConcept? = null,
  /**
   * The target entity impacted by or of interest to parties to the agreement.
   *
   * The Contract.subject is an entity that has some role with respect to the Contract.topic and
   * Contract.topic.term, which is of focal interest to the parties to the contract and likely
   * impacted in a significant way by the Contract.action/Contract.action.reason and the
   * Contract.term.action/Contract.action.reason. In many cases, the Contract.subject is a
   * Contract.signer if the subject is an adult; has a legal interest in the contract; and
   * incompetent to participate in the contract agreement.
   */
  public var subject: List<Reference?>? = null,
  /**
   * A formally or informally recognized grouping of people, principals, organizations, or
   * jurisdictions formed for the purpose of achieving some form of collective action such as the
   * promulgation, administration and enforcement of contracts and policies.
   */
  public var authority: List<Reference?>? = null,
  /**
   * Recognized governance framework or system operating with a circumscribed scope in accordance
   * with specified principles, policies, processes or procedures for managing rights, actions, or
   * behaviors of parties or principals relative to resources.
   */
  public var domain: List<Reference?>? = null,
  /** Sites in which the contract is complied with, exercised, or in force. */
  public var site: List<Reference?>? = null,
  /**
   * A natural language name identifying this Contract definition, derivative, or instance in any
   * legal state. Provides additional information about its content. This name should be usable as
   * an identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for this Contract definition, derivative, or instance
   * in any legal state.
   */
  public var title: String? = null,
  /**
   * A more detailed or qualifying explanatory or alternate user-friendly title for this Contract
   * definition, derivative, or instance in any legal state.
   */
  public var subtitle: String? = null,
  /**
   * Alternative representation of the title for this Contract definition, derivative, or instance
   * in any legal state., e.g., a domain specific contract number related to legislation.
   */
  public var alias: List<String?>? = null,
  /**
   * The individual or organization that authored the Contract definition, derivative, or instance
   * in any legal state.
   */
  public var author: Reference? = null,
  /**
   * A selector of legal concerns for this Contract definition, derivative, or instance in any legal
   * state.
   */
  public var scope: CodeableConcept? = null,
  /**
   * Narrows the range of legal concerns to focus on the achievement of specific contractual
   * objectives.
   *
   * Contractual areas of concern are very broad. This element supports narrowing the area of
   * concern to more specific term topics within this Contract. Given the wide range of contract
   * topics, implementers need to be cognizant of the business use case for which they are designing
   * a FHIR Contract, and narrowly specify the topic being represented with respect to the
   * Contract.type and any specializing Contract.subtype. The same topic, e.g., an asset such as a
   * good or service, such as a real property, medical supply, insurance, information, a procedure
   * or employment, or a manner of conduct, such adherence to a privacy, trust, or security policy,
   * may be the topic of multiple types of contracts. One way to determine the Contract.topic is to
   * answer the question: "What is the overall objective of this legal instrument?". The
   * Contract.topic is described with more detail by the terms of the Contract.
   */
  public var topic: Topic? = null,
  /**
   * A high-level category for the legal instrument, whether constructed as a Contract definition,
   * derivative, or instance in any legal state. Provides additional information about its content
   * within the context of the Contract's scope to distinguish the kinds of systems that would be
   * interested in the contract.
   */
  public var type: CodeableConcept? = null,
  /**
   * Sub-category for the Contract that distinguishes the kinds of systems that would be interested
   * in the Contract within the context of the Contract's scope.
   */
  public var subType: List<CodeableConcept?>? = null,
  /**
   * Precusory content developed with a focus and intent of supporting the formation a Contract
   * instance, which may be associated with and transformable into a Contract.
   */
  public var contentDefinition: ContentDefinition? = null,
  /**
   * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
   * nested groups.
   */
  public var term: List<Term>? = null,
  /**
   * Information that may be needed by/relevant to the performer in their execution of this term
   * action.
   */
  public var supportingInfo: List<Reference?>? = null,
  /**
   * Links to Provenance records for past versions of this Contract definition, derivative, or
   * instance, which identify key state transitions or updates that are likely to be relevant to a
   * user looking at the current version of the Contract. The Provenance.entity indicates the target
   * that was changed in the update (see
   * [Provenance.entity](provenance-definitions.html#Provenance.entity)).
   */
  public var relevantHistory: List<Reference?>? = null,
  /**
   * Parties with legal standing in the Contract, including the principal parties, the grantor(s)
   * and grantee(s), which are any person or organization bound by the contract, and any ancillary
   * parties, which facilitate the execution of the contract such as a notary or witness.
   *
   * Signers who are principal parties to the contract are bound by the Contract.activity related to
   * the Contract.topic, and the Contract.term(s), which either extend or restrict the overall
   * action on the topic by, for example, stipulating specific policies or obligations constraining
   * actions, action reason, or agents with respect to some or all of the topic. For example,
   * specifying how policies or obligations shall constrain actions and action reasons permitted or
   * denied on all or a subset of the Contract.topic (e.g., all or a portion of property being
   * transferred by the contract), agents (e.g., who can resell, assign interests, or alter the
   * property being transferred by the contract), actions, and action reasons; or with respect to
   * Contract.terms, stipulating, extending, or limiting the Contract.period of applicability or
   * valuation of items under consideration.
   */
  public var signer: List<Signer>? = null,
  /**
   * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
   * language" means the representation of the Contract and Contract Provisions in a manner that is
   * readily accessible and understandable by a layperson in accordance with best practices for
   * communication styles that ensure that those agreeing to or signing the Contract understand the
   * roles, actions, obligations, responsibilities, and implication of the agreement.
   */
  public var friendly: List<Friendly>? = null,
  /** List of Legal expressions or representations of this Contract. */
  public var legal: List<Legal>? = null,
  /** List of Computable Policy Rule Language Representations of this Contract. */
  public var rule: List<Rule>? = null,
  /**
   * Legally binding Contract: This is the signed and legally recognized representation of the
   * Contract, which is considered the "source of truth" and which would be the basis for legal
   * action related to enforcement of this Contract.
   */
  public var legallyBinding: LegallyBinding? = null,
) : DomainResource() {
  /**
   * Precusory content developed with a focus and intent of supporting the formation a Contract
   * instance, which may be associated with and transformable into a Contract.
   */
  @Serializable(with = ContractContentDefinitionSerializer::class)
  public class ContentDefinition(
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
     * Precusory content structure and use, i.e., a boilerplate, template, application for a
     * contract such as an insurance policy or benefits under a program, e.g., workers compensation.
     */
    public var type: CodeableConcept? = null,
    /** Detailed Precusory content type. */
    public var subType: CodeableConcept? = null,
    /** The individual or organization that published the Contract precursor content. */
    public var publisher: Reference? = null,
    /**
     * The date (and optionally time) when the contract was last significantly changed. The date
     * must change when the business version changes and it must change if the status code changes.
     * In addition, it should change when the substantive content of the contract changes.
     */
    public var publicationDate: DateTime? = null,
    /** amended | appended | cancelled | disputed | entered-in-error | executable +. */
    public var publicationStatus: Enumeration<ContractPublicationStatus>? = null,
    /**
     * A copyright statement relating to Contract precursor content. Copyright statements are
     * generally legal restrictions on the use and publishing of the Contract precursor content.
     */
    public var copyright: Markdown? = null,
  ) : BackboneElement()

  /**
   * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
   * nested groups.
   */
  @Serializable(with = ContractTermSerializer::class)
  public class Term(
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
    /** Unique identifier for this particular Contract Provision. */
    public var identifier: Identifier? = null,
    /** When this Contract Provision was issued. */
    public var issued: DateTime? = null,
    /** Relevant time or time-period when this Contract Provision is applicable. */
    public var applies: Period? = null,
    /** The entity that the term applies to. */
    public var topic: Topic? = null,
    /**
     * A legal clause or condition contained within a contract that requires one or both parties to
     * perform a particular requirement by some specified time or prevents one or both parties from
     * performing a particular requirement by some specified time.
     */
    public var type: CodeableConcept? = null,
    /** A specialized legal clause or condition based on overarching contract type. */
    public var subType: CodeableConcept? = null,
    /** Statement of a provision in a policy or a contract. */
    public var text: String? = null,
    /**
     * Security labels that protect the handling of information about the term and its elements,
     * which may be specifically identified.
     *
     * Within a Contract, a security label may apply to the one to many nested group of terms or to
     * a term, whether inside a group or a singleton. The security label on the entire set of term
     * provision elements may be different from the security labels on a contained offer, asset,
     * valuedItem, or data such as sensitive information, and must be the high water mark of all
     * security labels within the term. Rationale is that a labelled term, which may be
     * disaggregated from the Contract, and must persist the label on the term and on contained
     * elements within other contexts. If more than one policy dictates a level of confidentiality
     * of the term, then each applicable policy may be represented by a security label specific to
     * its requirements.
     *
     * A Security Label is comprised of 1..1 confidentiality code and 0..* other security label
     * codes (aka "privacy tags". A Security Label is metadata assigned (aka "tagged") to Resources
     * and Resource elements, which specify the confidentiality and sensitivity of the Resource or
     * element and their related attributes, the purposes for which tagged items may be collected,
     * access, used or disclosed, any limitation on the type of entities authorized to engage in
     * permitted purposes, and handling instructions that obligate or prohibit certain actions on
     * the tagged items.
     */
    public var securityLabel: List<SecurityLabel>? = null,
    /** The matter of concern in the context of this provision of the agrement. */
    public var offer: Offer? = null,
    /** Contract Term Asset List. */
    public var asset: List<Asset>? = null,
    /**
     * An actor taking a role in an activity for which it can be assigned some degree of
     * responsibility for the activity taking place.
     *
     * Several agents may be associated (i.e. has some responsibility for an activity) with an
     * activity and vice-versa. For example, in cases of actions initiated by one user for other
     * users, or in events that involve more than one user, hardware device, software, or system
     * process. However, only one user may be the initiator/requestor for the event.
     */
    public var action: List<Action>? = null,
    /** Nested group of Contract Provisions. */
    public var group: List<Term?>? = null,
  ) : BackboneElement() {
    /**
     * Security labels that protect the handling of information about the term and its elements,
     * which may be specifically identified.
     */
    @Serializable(with = ContractTermSecurityLabelSerializer::class)
    public class SecurityLabel(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /** Number used to link this term or term element to the applicable Security Label. */
      public var number: List<UnsignedInt?>? = null,
      /**
       * Security label privacy tag that specifies the level of confidentiality protection required
       * for this term and/or term elements.
       */
      public var classification: Coding? = null,
      /**
       * Security label privacy tag that specifies the applicable privacy and security policies
       * governing this term and/or term elements.
       */
      public var category: List<Coding?>? = null,
      /**
       * Security label privacy tag that specifies the manner in which term and/or term elements are
       * to be protected.
       */
      public var control: List<Coding?>? = null,
    ) : BackboneElement()

    /** The matter of concern in the context of this provision of the agrement. */
    @Serializable(with = ContractTermOfferSerializer::class)
    public class Offer(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /** Unique identifier for this particular Contract Provision. */
      public var identifier: List<Identifier?>? = null,
      /** Offer Recipient. */
      public var party: List<Party>? = null,
      /**
       * The owner of an asset has the residual control rights over the asset: the right to decide
       * all usages of the asset in any way not inconsistent with a prior contract, custom, or law
       * (Hart, 1995, p. 30).
       *
       * The Contract.topic may be an application for or offer of a policy or service (e.g., uri to
       * a consent directive form or a health insurance policy), which becomes the Contract once
       * accepted by both the grantor and grantee. The Contract Resource may function simply as the
       * computable representation of the executed contract, which may be the attached to the
       * Contract Resource as the “binding” or as the “friendly” electronic form. For example, a
       * Contract Resource may be automatically populated with the values expressed in a related
       * QuestionnaireResponse. However, the Contract Resource may be considered the legally binding
       * contract if it is the only “executed” form of this contract, and includes the signatures as
       * *The Contract Resource may function as the computable representation of an application or
       * offer in a pre-executed Contract if the grantor has not entered any values. In this case,
       * it is populated with values in a “legal” form of the application or offer or by the values
       * in an associated Questionnaire. If the grantor has filled in the legal form or the
       * associated Questionnaire Response, then these values are used to populate a pre-executed
       * Contract Resource. If the Contract.topic is considered an application or offer, then the
       * policy is often required to be attached as the “legal” basis for the application to ensure
       * “informed consent” to the contract, and that any discrepancy between the application and
       * the policy are interpreted against the policy. Implementers should check organizational and
       * jurisdictional policies to determine the relationship among multiple representations of a
       * contract pre- and post-execution.
       */
      public var topic: Reference? = null,
      /**
       * Type of Contract Provision such as specific requirements, purposes for actions,
       * obligations, prohibitions, e.g. life time maximum benefit.
       */
      public var type: CodeableConcept? = null,
      /**
       * Type of choice made by accepting party with respect to an offer made by an offeror/
       * grantee.
       */
      public var decision: CodeableConcept? = null,
      /** How the decision about a Contract was conveyed. */
      public var decisionMode: List<CodeableConcept?>? = null,
      /** Response to offer text. */
      public var answer: List<Answer>? = null,
      /** Human readable form of this Contract Offer. */
      public var text: String? = null,
      /**
       * The id of the clause or question text of the offer in the referenced
       * questionnaire/response.
       */
      public var linkId: List<String?>? = null,
      /** Security labels that protects the offer. */
      public var securityLabelNumber: List<UnsignedInt?>? = null,
    ) : BackboneElement() {
      /** Offer Recipient. */
      @Serializable(with = ContractTermOfferPartySerializer::class)
      public class Party(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
        /** Participant in the offer. */
        public var reference: List<Reference?>? = null,
        /** How the party participates in the offer. */
        public var role: CodeableConcept? = null,
      ) : BackboneElement()

      /** Response to offer text. */
      @Serializable(with = ContractTermOfferAnswerSerializer::class)
      public class Answer(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
         * Response to an offer clause or question text, which enables selection of values to be
         * agreed to, e.g., the period of participation, the date of occupancy of a rental, warranty
         * duration, or whether biospecimen may be used for further research.
         */
        public var `value`: Value? = null,
      ) : BackboneElement() {
        public sealed interface Value {
          public fun asBoolean(): Boolean? = this as? Boolean

          public fun asDecimal(): Decimal? = this as? Decimal

          public fun asInteger(): Integer? = this as? Integer

          public fun asDate(): Date? = this as? Date

          public fun asDateTime(): DateTime? = this as? DateTime

          public fun asTime(): Time? = this as? Time

          public fun asString(): String? = this as? String

          public fun asUri(): Uri? = this as? Uri

          public fun asAttachment(): Attachment? = this as? Attachment

          public fun asCoding(): Coding? = this as? Coding

          public fun asQuantity(): Quantity? = this as? Quantity

          public fun asReference(): Reference? = this as? Reference

          public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

          public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

          public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

          public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

          public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

          public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

          public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

          public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Value

          public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
            Value

          public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

          public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

          public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
            Value

          public companion object {
            public fun from(
              booleanValue: com.google.fhir.model.r5.Boolean?,
              decimalValue: com.google.fhir.model.r5.Decimal?,
              integerValue: com.google.fhir.model.r5.Integer?,
              dateValue: com.google.fhir.model.r5.Date?,
              dateTimeValue: com.google.fhir.model.r5.DateTime?,
              timeValue: com.google.fhir.model.r5.Time?,
              stringValue: com.google.fhir.model.r5.String?,
              uriValue: com.google.fhir.model.r5.Uri?,
              AttachmentValue: com.google.fhir.model.r5.Attachment?,
              CodingValue: com.google.fhir.model.r5.Coding?,
              QuantityValue: com.google.fhir.model.r5.Quantity?,
              ReferenceValue: com.google.fhir.model.r5.Reference?,
            ): Value? {
              if (booleanValue != null) return Boolean(booleanValue)
              if (decimalValue != null) return Decimal(decimalValue)
              if (integerValue != null) return Integer(integerValue)
              if (dateValue != null) return Date(dateValue)
              if (dateTimeValue != null) return DateTime(dateTimeValue)
              if (timeValue != null) return Time(timeValue)
              if (stringValue != null) return String(stringValue)
              if (uriValue != null) return Uri(uriValue)
              if (AttachmentValue != null) return Attachment(AttachmentValue)
              if (CodingValue != null) return Coding(CodingValue)
              if (QuantityValue != null) return Quantity(QuantityValue)
              if (ReferenceValue != null) return Reference(ReferenceValue)
              return null
            }
          }
        }
      }
    }

    /** Contract Term Asset List. */
    @Serializable(with = ContractTermAssetSerializer::class)
    public class Asset(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /** Differentiates the kind of the asset . */
      public var scope: CodeableConcept? = null,
      /** Target entity type about which the term may be concerned. */
      public var type: List<CodeableConcept?>? = null,
      /** Associated entities. */
      public var typeReference: List<Reference?>? = null,
      /** May be a subtype or part of an offered asset. */
      public var subtype: List<CodeableConcept?>? = null,
      /**
       * Specifies the applicability of the term to an asset resource instance, and instances it
       * refers to or instances that refer to it, and/or are owned by the offeree.
       */
      public var relationship: Coding? = null,
      /** Circumstance of the asset. */
      public var context: List<Context>? = null,
      /**
       * Description of the quality and completeness of the asset that may be a factor in its
       * valuation.
       */
      public var condition: String? = null,
      /** Type of Asset availability for use or ownership. */
      public var periodType: List<CodeableConcept?>? = null,
      /** Asset relevant contractual time period. */
      public var period: List<Period?>? = null,
      /** Time period of asset use. */
      public var usePeriod: List<Period?>? = null,
      /**
       * Clause or question text (Prose Object) concerning the asset in a linked form, such as a
       * QuestionnaireResponse used in the formation of the contract.
       */
      public var text: String? = null,
      /**
       * Id [identifier??] of the clause or question text about the asset in the referenced form or
       * QuestionnaireResponse.
       */
      public var linkId: List<String?>? = null,
      /** Response to assets. */
      public var answer: List<Offer.Answer?>? = null,
      /** Security labels that protects the asset. */
      public var securityLabelNumber: List<UnsignedInt?>? = null,
      /** Contract Valued Item List. */
      public var valuedItem: List<ValuedItem>? = null,
    ) : BackboneElement() {
      /** Circumstance of the asset. */
      @Serializable(with = ContractTermAssetContextSerializer::class)
      public class Context(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
         * Asset context reference may include the creator, custodian, or owning Person or
         * Organization (e.g., bank, repository), location held, e.g., building, jurisdiction.
         */
        public var reference: Reference? = null,
        /**
         * Coded representation of the context generally or of the Referenced entity, such as the
         * asset holder type or location.
         */
        public var code: List<CodeableConcept?>? = null,
        /** Context description. */
        public var text: String? = null,
      ) : BackboneElement()

      /** Contract Valued Item List. */
      @Serializable(with = ContractTermAssetValuedItemSerializer::class)
      public class ValuedItem(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
        /** Specific type of Contract Valued Item that may be priced. */
        public var entity: Entity? = null,
        /** Identifies a Contract Valued Item instance. */
        public var identifier: Identifier? = null,
        /** Indicates the time during which this Contract ValuedItem information is effective. */
        public var effectiveTime: DateTime? = null,
        /**
         * Specifies the units by which the Contract Valued Item is measured or counted, and
         * quantifies the countable or measurable Contract Valued Item instances.
         */
        public var quantity: Quantity? = null,
        /** A Contract Valued Item unit valuation measure. */
        public var unitPrice: Money? = null,
        /**
         * A real number that represents a multiplier used in determining the overall value of the
         * Contract Valued Item delivered. The concept of a Factor allows for a discount or
         * surcharge multiplier to be applied to a monetary amount.
         */
        public var factor: Decimal? = null,
        /**
         * An amount that expresses the weighting (based on difficulty, cost and/or resource
         * intensiveness) associated with the Contract Valued Item delivered. The concept of Points
         * allows for assignment of point values for a Contract Valued Item, such that a monetary
         * amount can be assigned to each point.
         */
        public var points: Decimal? = null,
        /**
         * Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For
         * example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number *
         * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
         */
        public var net: Money? = null,
        /** Terms of valuation. */
        public var payment: String? = null,
        /** When payment is due. */
        public var paymentDate: DateTime? = null,
        /** Who will make payment. */
        public var responsible: Reference? = null,
        /** Who will receive payment. */
        public var recipient: Reference? = null,
        /**
         * Id of the clause or question text related to the context of this valuedItem in the
         * referenced form or QuestionnaireResponse.
         */
        public var linkId: List<String?>? = null,
        /** A set of security labels that define which terms are controlled by this condition. */
        public var securityLabelNumber: List<UnsignedInt?>? = null,
      ) : BackboneElement() {
        public sealed interface Entity {
          public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

          public fun asReference(): Reference? = this as? Reference

          public data class CodeableConcept(
            public val `value`: com.google.fhir.model.r5.CodeableConcept
          ) : Entity

          public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
            Entity

          public companion object {
            public fun from(
              CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
              ReferenceValue: com.google.fhir.model.r5.Reference?,
            ): Entity? {
              if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
              if (ReferenceValue != null) return Reference(ReferenceValue)
              return null
            }
          }
        }
      }
    }

    /**
     * An actor taking a role in an activity for which it can be assigned some degree of
     * responsibility for the activity taking place.
     */
    @Serializable(with = ContractTermActionSerializer::class)
    public class Action(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /** True if the term prohibits the action. */
      public var doNotPerform: Boolean? = null,
      /**
       * Activity or service obligation to be done or not done, performed or not performed,
       * effectuated or not by this Contract term.
       */
      public var type: CodeableConcept? = null,
      /** Entity of the action. */
      public var subject: List<Subject>? = null,
      /** Reason or purpose for the action stipulated by this Contract Provision. */
      public var intent: CodeableConcept? = null,
      /**
       * Id [identifier??] of the clause or question text related to this action in the referenced
       * form or QuestionnaireResponse.
       */
      public var linkId: List<String?>? = null,
      /** Current state of the term action. */
      public var status: CodeableConcept? = null,
      /** Encounter or Episode with primary association to the specified term activity. */
      public var context: Reference? = null,
      /**
       * Id [identifier??] of the clause or question text related to the requester of this action in
       * the referenced form or QuestionnaireResponse.
       */
      public var contextLinkId: List<String?>? = null,
      /** When action happens. */
      public var occurrence: Occurrence? = null,
      /** Who or what initiated the action and has responsibility for its activation. */
      public var requester: List<Reference?>? = null,
      /**
       * Id [identifier??] of the clause or question text related to the requester of this action in
       * the referenced form or QuestionnaireResponse.
       */
      public var requesterLinkId: List<String?>? = null,
      /**
       * The type of individual that is desired or required to perform or not perform the action.
       */
      public var performerType: List<CodeableConcept?>? = null,
      /**
       * The type of role or competency of an individual desired or required to perform or not
       * perform the action.
       */
      public var performerRole: CodeableConcept? = null,
      /** Indicates who or what is being asked to perform (or not perform) the ction. */
      public var performer: Reference? = null,
      /**
       * Id [identifier??] of the clause or question text related to the reason type or reference of
       * this action in the referenced form or QuestionnaireResponse.
       */
      public var performerLinkId: List<String?>? = null,
      /**
       * Rationale for the action to be performed or not performed. Describes why the action is
       * permitted or prohibited. Either a coded concept, or another resource whose existence
       * justifies permitting or not permitting this action.
       */
      public var reason: List<CodeableReference?>? = null,
      /**
       * Id [identifier??] of the clause or question text related to the reason type or reference of
       * this action in the referenced form or QuestionnaireResponse.
       */
      public var reasonLinkId: List<String?>? = null,
      /**
       * Comments made about the term action made by the requester, performer, subject or other
       * participants.
       */
      public var note: List<Annotation?>? = null,
      /** Security labels that protects the action. */
      public var securityLabelNumber: List<UnsignedInt?>? = null,
    ) : BackboneElement() {
      /** Entity of the action. */
      @Serializable(with = ContractTermActionSubjectSerializer::class)
      public class Subject(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
        /** The entity the action is performed or not performed on or for. */
        public var reference: List<Reference?>? = null,
        /** Role type of agent assigned roles in this Contract. */
        public var role: CodeableConcept? = null,
      ) : BackboneElement()

      public sealed interface Occurrence {
        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asPeriod(): Period? = this as? Period

        public fun asTiming(): Timing? = this as? Timing

        public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) :
          Occurrence

        public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Occurrence

        public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Occurrence

        public companion object {
          public fun from(
            dateTimeValue: com.google.fhir.model.r5.DateTime?,
            PeriodValue: com.google.fhir.model.r5.Period?,
            TimingValue: com.google.fhir.model.r5.Timing?,
          ): Occurrence? {
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (PeriodValue != null) return Period(PeriodValue)
            if (TimingValue != null) return Timing(TimingValue)
            return null
          }
        }
      }
    }

    public sealed interface Topic {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Topic

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Topic

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Topic? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /**
   * Parties with legal standing in the Contract, including the principal parties, the grantor(s)
   * and grantee(s), which are any person or organization bound by the contract, and any ancillary
   * parties, which facilitate the execution of the contract such as a notary or witness.
   */
  @Serializable(with = ContractSignerSerializer::class)
  public class Signer(
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
    /** Role of this Contract signer, e.g. notary, grantee. */
    public var type: Coding? = null,
    /** Party which is a signator to this Contract. */
    public var party: Reference? = null,
    /** Legally binding Contract DSIG signature contents in Base64. */
    public var signature: List<Signature?>? = null,
  ) : BackboneElement()

  /**
   * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
   * language" means the representation of the Contract and Contract Provisions in a manner that is
   * readily accessible and understandable by a layperson in accordance with best practices for
   * communication styles that ensure that those agreeing to or signing the Contract understand the
   * roles, actions, obligations, responsibilities, and implication of the agreement.
   */
  @Serializable(with = ContractFriendlySerializer::class)
  public class Friendly(
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
     * Human readable rendering of this Contract in a format and representation intended to enhance
     * comprehension and ensure understandability.
     */
    public var content: Content? = null,
  ) : BackboneElement() {
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Content

      public companion object {
        public fun from(
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Content? {
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** List of Legal expressions or representations of this Contract. */
  @Serializable(with = ContractLegalSerializer::class)
  public class Legal(
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
    /** Contract legal text in human renderable form. */
    public var content: Content? = null,
  ) : BackboneElement() {
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Content

      public companion object {
        public fun from(
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Content? {
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** List of Computable Policy Rule Language Representations of this Contract. */
  @Serializable(with = ContractRuleSerializer::class)
  public class Rule(
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
    /** Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal). */
    public var content: Content? = null,
  ) : BackboneElement() {
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Content

      public companion object {
        public fun from(
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Content? {
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  public sealed interface Topic {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Topic

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Topic

    public companion object {
      public fun from(
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
      ): Topic? {
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  public sealed interface LegallyBinding {
    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asReference(): Reference? = this as? Reference

    public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
      LegallyBinding

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
      LegallyBinding

    public companion object {
      public fun from(
        AttachmentValue: com.google.fhir.model.r5.Attachment?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
      ): LegallyBinding? {
        if (AttachmentValue != null) return Attachment(AttachmentValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  /** This value set contract specific codes for status. */
  public enum class ContractPublicationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Amended("amended", "http://hl7.org/fhir/contract-publicationstatus", "Amended", null),
    Appended("appended", "http://hl7.org/fhir/contract-publicationstatus", "Appended", null),
    Cancelled("cancelled", "http://hl7.org/fhir/contract-publicationstatus", "Cancelled", null),
    Disputed("disputed", "http://hl7.org/fhir/contract-publicationstatus", "Disputed", null),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/contract-publicationstatus",
      "Entered in Error",
      null,
    ),
    Executable("executable", "http://hl7.org/fhir/contract-publicationstatus", "Executable", null),
    Executed("executed", "http://hl7.org/fhir/contract-publicationstatus", "Executed", null),
    Negotiable("negotiable", "http://hl7.org/fhir/contract-publicationstatus", "Negotiable", null),
    Offered("offered", "http://hl7.org/fhir/contract-publicationstatus", "Offered", null),
    Policy("policy", "http://hl7.org/fhir/contract-publicationstatus", "Policy", null),
    Rejected("rejected", "http://hl7.org/fhir/contract-publicationstatus", "Rejected", null),
    Renewed("renewed", "http://hl7.org/fhir/contract-publicationstatus", "Renewed", null),
    Revoked("revoked", "http://hl7.org/fhir/contract-publicationstatus", "Revoked", null),
    Resolved("resolved", "http://hl7.org/fhir/contract-publicationstatus", "Resolved", null),
    Terminated("terminated", "http://hl7.org/fhir/contract-publicationstatus", "Terminated", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ContractPublicationStatus =
        when (code) {
          "amended" -> Amended
          "appended" -> Appended
          "cancelled" -> Cancelled
          "disputed" -> Disputed
          "entered-in-error" -> Entered_In_Error
          "executable" -> Executable
          "executed" -> Executed
          "negotiable" -> Negotiable
          "offered" -> Offered
          "policy" -> Policy
          "rejected" -> Rejected
          "renewed" -> Renewed
          "revoked" -> Revoked
          "resolved" -> Resolved
          "terminated" -> Terminated
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ContractPublicationStatus")
        }
    }
  }

  /** This value set contract specific codes for status. */
  public enum class ContractStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Amended("amended", "http://hl7.org/fhir/contract-status", "Amended", null),
    Appended("appended", "http://hl7.org/fhir/contract-status", "Appended", null),
    Cancelled("cancelled", "http://hl7.org/fhir/contract-status", "Cancelled", null),
    Disputed("disputed", "http://hl7.org/fhir/contract-status", "Disputed", null),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/contract-status",
      "Entered in Error",
      null,
    ),
    Executable("executable", "http://hl7.org/fhir/contract-status", "Executable", null),
    Executed("executed", "http://hl7.org/fhir/contract-status", "Executed", null),
    Negotiable("negotiable", "http://hl7.org/fhir/contract-status", "Negotiable", null),
    Offered("offered", "http://hl7.org/fhir/contract-status", "Offered", null),
    Policy("policy", "http://hl7.org/fhir/contract-status", "Policy", null),
    Rejected("rejected", "http://hl7.org/fhir/contract-status", "Rejected", null),
    Renewed("renewed", "http://hl7.org/fhir/contract-status", "Renewed", null),
    Revoked("revoked", "http://hl7.org/fhir/contract-status", "Revoked", null),
    Resolved("resolved", "http://hl7.org/fhir/contract-status", "Resolved", null),
    Terminated("terminated", "http://hl7.org/fhir/contract-status", "Terminated", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ContractStatus =
        when (code) {
          "amended" -> Amended
          "appended" -> Appended
          "cancelled" -> Cancelled
          "disputed" -> Disputed
          "entered-in-error" -> Entered_In_Error
          "executable" -> Executable
          "executed" -> Executed
          "negotiable" -> Negotiable
          "offered" -> Offered
          "policy" -> Policy
          "rejected" -> Rejected
          "renewed" -> Renewed
          "revoked" -> Revoked
          "resolved" -> Resolved
          "terminated" -> Terminated
          else -> throw IllegalArgumentException("Unknown code $code for enum ContractStatus")
        }
    }
  }
}
