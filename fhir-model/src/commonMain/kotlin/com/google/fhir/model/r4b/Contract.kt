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

import com.google.fhir.model.r4b.serializers.ContractContentDefinitionSerializer
import com.google.fhir.model.r4b.serializers.ContractFriendlyContentSerializer
import com.google.fhir.model.r4b.serializers.ContractFriendlySerializer
import com.google.fhir.model.r4b.serializers.ContractLegalContentSerializer
import com.google.fhir.model.r4b.serializers.ContractLegalSerializer
import com.google.fhir.model.r4b.serializers.ContractLegallyBindingSerializer
import com.google.fhir.model.r4b.serializers.ContractRuleContentSerializer
import com.google.fhir.model.r4b.serializers.ContractRuleSerializer
import com.google.fhir.model.r4b.serializers.ContractSerializer
import com.google.fhir.model.r4b.serializers.ContractSignerSerializer
import com.google.fhir.model.r4b.serializers.ContractTermActionOccurrenceSerializer
import com.google.fhir.model.r4b.serializers.ContractTermActionSerializer
import com.google.fhir.model.r4b.serializers.ContractTermActionSubjectSerializer
import com.google.fhir.model.r4b.serializers.ContractTermAssetContextSerializer
import com.google.fhir.model.r4b.serializers.ContractTermAssetSerializer
import com.google.fhir.model.r4b.serializers.ContractTermAssetValuedItemEntitySerializer
import com.google.fhir.model.r4b.serializers.ContractTermAssetValuedItemSerializer
import com.google.fhir.model.r4b.serializers.ContractTermOfferAnswerSerializer
import com.google.fhir.model.r4b.serializers.ContractTermOfferAnswerValueSerializer
import com.google.fhir.model.r4b.serializers.ContractTermOfferPartySerializer
import com.google.fhir.model.r4b.serializers.ContractTermOfferSerializer
import com.google.fhir.model.r4b.serializers.ContractTermSecurityLabelSerializer
import com.google.fhir.model.r4b.serializers.ContractTermSerializer
import com.google.fhir.model.r4b.serializers.ContractTermTopicSerializer
import com.google.fhir.model.r4b.serializers.ContractTopicSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
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
  /** Unique identifier for this Contract or a derivative that references a Source Contract. */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * Canonical identifier for this contract, represented as a URI (globally unique).
   *
   * Used in a domain that uses a supplied contract repository.
   */
  public var url: Uri? = null,
  /**
   * An edition identifier used for business purposes to label business significant variants.
   *
   * Note - This is a business versionId, not a resource version id (see discussion
   * http://build.fhir.org/resource.html#versions) Comments - There may be different contract
   * instances that have the same identifier but different versions. The version can be appended to
   * the url in a reference to allow a reference to a particular business version of the plan
   * definition with the format [url]|[version].
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
  public var subject: MutableList<Reference> = mutableListOf(),
  /**
   * A formally or informally recognized grouping of people, principals, organizations, or
   * jurisdictions formed for the purpose of achieving some form of collective action such as the
   * promulgation, administration and enforcement of contracts and policies.
   */
  public var authority: MutableList<Reference> = mutableListOf(),
  /**
   * Recognized governance framework or system operating with a circumscribed scope in accordance
   * with specified principles, policies, processes or procedures for managing rights, actions, or
   * behaviors of parties or principals relative to resources.
   */
  public var domain: MutableList<Reference> = mutableListOf(),
  /** Sites in which the contract is complied with, exercised, or in force. */
  public var site: MutableList<Reference> = mutableListOf(),
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
   * in any legal state.t giving additional information about its content.
   */
  public var title: String? = null,
  /**
   * An explanatory or alternate user-friendly title for this Contract definition, derivative, or
   * instance in any legal state.t giving additional information about its content.
   */
  public var subtitle: String? = null,
  /**
   * Alternative representation of the title for this Contract definition, derivative, or instance
   * in any legal state., e.g., a domain specific contract number related to legislation.
   */
  public var alias: MutableList<String> = mutableListOf(),
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
  public var subType: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Precusory content developed with a focus and intent of supporting the formation a Contract
   * instance, which may be associated with and transformable into a Contract.
   */
  public var contentDefinition: ContentDefinition? = null,
  /**
   * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
   * nested groups.
   */
  public var term: MutableList<Term> = mutableListOf(),
  /**
   * Information that may be needed by/relevant to the performer in their execution of this term
   * action.
   */
  public var supportingInfo: MutableList<Reference> = mutableListOf(),
  /**
   * Links to Provenance records for past versions of this Contract definition, derivative, or
   * instance, which identify key state transitions or updates that are likely to be relevant to a
   * user looking at the current version of the Contract. The Provence.entity indicates the target
   * that was changed in the update.
   * http://build.fhir.org/provenance-definitions.html#Provenance.entity.
   */
  public var relevantHistory: MutableList<Reference> = mutableListOf(),
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
  public var signer: MutableList<Signer> = mutableListOf(),
  /**
   * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
   * language" means the representation of the Contract and Contract Provisions in a manner that is
   * readily accessible and understandable by a layperson in accordance with best practices for
   * communication styles that ensure that those agreeing to or signing the Contract understand the
   * roles, actions, obligations, responsibilities, and implication of the agreement.
   */
  public var friendly: MutableList<Friendly> = mutableListOf(),
  /** List of Legal expressions or representations of this Contract. */
  public var legal: MutableList<Legal> = mutableListOf(),
  /** List of Computable Policy Rule Language Representations of this Contract. */
  public var rule: MutableList<Rule> = mutableListOf(),
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
     * Precusory content structure and use, i.e., a boilerplate, template, application for a
     * contract such as an insurance policy or benefits under a program, e.g., workers compensation.
     */
    public var type: CodeableConcept,
    /** Detailed Precusory content type. */
    public var subType: CodeableConcept? = null,
    /** The individual or organization that published the Contract precursor content. */
    public var publisher: Reference? = null,
    /**
     * The date (and optionally time) when the contract was published. The date must change when the
     * business version changes and it must change if the status code changes. In addition, it
     * should change when the substantive content of the contract changes.
     */
    public var publicationDate: DateTime? = null,
    /**
     * amended | appended | cancelled | disputed | entered-in-error | executable | executed |
     * negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated.
     */
    public var publicationStatus: Enumeration<ContractPublicationStatus>,
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
     * which may be specifically identified..
     */
    public var securityLabel: MutableList<SecurityLabel> = mutableListOf(),
    /** The matter of concern in the context of this provision of the agrement. */
    public var offer: Offer,
    /** Contract Term Asset List. */
    public var asset: MutableList<Asset> = mutableListOf(),
    /**
     * An actor taking a role in an activity for which it can be assigned some degree of
     * responsibility for the activity taking place.
     *
     * Several agents may be associated (i.e. has some responsibility for an activity) with an
     * activity and vice-versa. For example, in cases of actions initiated by one user for other
     * users, or in events that involve more than one user, hardware device, software, or system
     * process. However, only one user may be the initiator/requestor for the event.
     */
    public var action: MutableList<Action> = mutableListOf(),
    /** Nested group of Contract Provisions. */
    public var group: MutableList<Term> = mutableListOf(),
  ) : BackboneElement() {
    /**
     * Security labels that protect the handling of information about the term and its elements,
     * which may be specifically identified..
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Number used to link this term or term element to the applicable Security Label. */
      public var number: MutableList<UnsignedInt> = mutableListOf(),
      /**
       * Security label privacy tag that species the level of confidentiality protection required
       * for this term and/or term elements.
       */
      public var classification: Coding,
      /**
       * Security label privacy tag that species the applicable privacy and security policies
       * governing this term and/or term elements.
       */
      public var category: MutableList<Coding> = mutableListOf(),
      /**
       * Security label privacy tag that species the manner in which term and/or term elements are
       * to be protected.
       */
      public var control: MutableList<Coding> = mutableListOf(),
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Unique identifier for this particular Contract Provision. */
      public var identifier: MutableList<Identifier> = mutableListOf(),
      /** Offer Recipient. */
      public var party: MutableList<Party> = mutableListOf(),
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
      public var decisionMode: MutableList<CodeableConcept> = mutableListOf(),
      /** Response to offer text. */
      public var answer: MutableList<Answer> = mutableListOf(),
      /** Human readable form of this Contract Offer. */
      public var text: String? = null,
      /**
       * The id of the clause or question text of the offer in the referenced
       * questionnaire/response.
       */
      public var linkId: MutableList<String> = mutableListOf(),
      /** Security labels that protects the offer. */
      public var securityLabelNumber: MutableList<UnsignedInt> = mutableListOf(),
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /** Participant in the offer. */
        public var reference: MutableList<Reference> = mutableListOf(),
        /** How the party participates in the offer. */
        public var role: CodeableConcept,
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * Response to an offer clause or question text, which enables selection of values to be
         * agreed to, e.g., the period of participation, the date of occupancy of a rental,
         * warrently duration, or whether biospecimen may be used for further research.
         */
        public var `value`: Value,
      ) : BackboneElement() {
        @Serializable(with = ContractTermOfferAnswerValueSerializer::class)
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

          public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) : Value

          public data class Decimal(public val `value`: com.google.fhir.model.r4b.Decimal) : Value

          public data class Integer(public val `value`: com.google.fhir.model.r4b.Integer) : Value

          public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Value

          public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
            Value

          public data class Time(public val `value`: com.google.fhir.model.r4b.Time) : Value

          public data class String(public val `value`: com.google.fhir.model.r4b.String) : Value

          public data class Uri(public val `value`: com.google.fhir.model.r4b.Uri) : Value

          public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
            Value

          public data class Coding(public val `value`: com.google.fhir.model.r4b.Coding) : Value

          public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) :
            Value

          public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
            Value

          public companion object {
            internal fun from(
              booleanValue: com.google.fhir.model.r4b.Boolean?,
              decimalValue: com.google.fhir.model.r4b.Decimal?,
              integerValue: com.google.fhir.model.r4b.Integer?,
              dateValue: com.google.fhir.model.r4b.Date?,
              dateTimeValue: com.google.fhir.model.r4b.DateTime?,
              timeValue: com.google.fhir.model.r4b.Time?,
              stringValue: com.google.fhir.model.r4b.String?,
              uriValue: com.google.fhir.model.r4b.Uri?,
              attachmentValue: com.google.fhir.model.r4b.Attachment?,
              codingValue: com.google.fhir.model.r4b.Coding?,
              quantityValue: com.google.fhir.model.r4b.Quantity?,
              referenceValue: com.google.fhir.model.r4b.Reference?,
            ): Value? {
              if (booleanValue != null) return Boolean(booleanValue)
              if (decimalValue != null) return Decimal(decimalValue)
              if (integerValue != null) return Integer(integerValue)
              if (dateValue != null) return Date(dateValue)
              if (dateTimeValue != null) return DateTime(dateTimeValue)
              if (timeValue != null) return Time(timeValue)
              if (stringValue != null) return String(stringValue)
              if (uriValue != null) return Uri(uriValue)
              if (attachmentValue != null) return Attachment(attachmentValue)
              if (codingValue != null) return Coding(codingValue)
              if (quantityValue != null) return Quantity(quantityValue)
              if (referenceValue != null) return Reference(referenceValue)
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Differentiates the kind of the asset . */
      public var scope: CodeableConcept? = null,
      /** Target entity type about which the term may be concerned. */
      public var type: MutableList<CodeableConcept> = mutableListOf(),
      /** Associated entities. */
      public var typeReference: MutableList<Reference> = mutableListOf(),
      /** May be a subtype or part of an offered asset. */
      public var subtype: MutableList<CodeableConcept> = mutableListOf(),
      /**
       * Specifies the applicability of the term to an asset resource instance, and instances it
       * refers to orinstances that refer to it, and/or are owned by the offeree.
       */
      public var relationship: Coding? = null,
      /** Circumstance of the asset. */
      public var context: MutableList<Context> = mutableListOf(),
      /**
       * Description of the quality and completeness of the asset that imay be a factor in its
       * valuation.
       */
      public var condition: String? = null,
      /** Type of Asset availability for use or ownership. */
      public var periodType: MutableList<CodeableConcept> = mutableListOf(),
      /** Asset relevant contractual time period. */
      public var period: MutableList<Period> = mutableListOf(),
      /** Time period of asset use. */
      public var usePeriod: MutableList<Period> = mutableListOf(),
      /**
       * Clause or question text (Prose Object) concerning the asset in a linked form, such as a
       * QuestionnaireResponse used in the formation of the contract.
       */
      public var text: String? = null,
      /**
       * Id [identifier??] of the clause or question text about the asset in the referenced form or
       * QuestionnaireResponse.
       */
      public var linkId: MutableList<String> = mutableListOf(),
      /** Response to assets. */
      public var answer: MutableList<Offer.Answer> = mutableListOf(),
      /** Security labels that protects the asset. */
      public var securityLabelNumber: MutableList<UnsignedInt> = mutableListOf(),
      /** Contract Valued Item List. */
      public var valuedItem: MutableList<ValuedItem> = mutableListOf(),
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * Asset context reference may include the creator, custodian, or owning Person or
         * Organization (e.g., bank, repository), location held, e.g., building, jurisdiction.
         */
        public var reference: Reference? = null,
        /**
         * Coded representation of the context generally or of the Referenced entity, such as the
         * asset holder type or location.
         */
        public var code: MutableList<CodeableConcept> = mutableListOf(),
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
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
        public var linkId: MutableList<String> = mutableListOf(),
        /** A set of security labels that define which terms are controlled by this condition. */
        public var securityLabelNumber: MutableList<UnsignedInt> = mutableListOf(),
      ) : BackboneElement() {
        @Serializable(with = ContractTermAssetValuedItemEntitySerializer::class)
        public sealed interface Entity {
          public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

          public fun asReference(): Reference? = this as? Reference

          public data class CodeableConcept(
            public val `value`: com.google.fhir.model.r4b.CodeableConcept
          ) : Entity

          public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
            Entity

          public companion object {
            internal fun from(
              codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
              referenceValue: com.google.fhir.model.r4b.Reference?,
            ): Entity? {
              if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
              if (referenceValue != null) return Reference(referenceValue)
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
      override var extension: MutableList<Extension> = mutableListOf(),
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** True if the term prohibits the action. */
      public var doNotPerform: Boolean? = null,
      /**
       * Activity or service obligation to be done or not done, performed or not performed,
       * effectuated or not by this Contract term.
       */
      public var type: CodeableConcept,
      /** Entity of the action. */
      public var subject: MutableList<Subject> = mutableListOf(),
      /** Reason or purpose for the action stipulated by this Contract Provision. */
      public var intent: CodeableConcept,
      /**
       * Id [identifier??] of the clause or question text related to this action in the referenced
       * form or QuestionnaireResponse.
       */
      public var linkId: MutableList<String> = mutableListOf(),
      /** Current state of the term action. */
      public var status: CodeableConcept,
      /** Encounter or Episode with primary association to specified term activity. */
      public var context: Reference? = null,
      /**
       * Id [identifier??] of the clause or question text related to the requester of this action in
       * the referenced form or QuestionnaireResponse.
       */
      public var contextLinkId: MutableList<String> = mutableListOf(),
      /** When action happens. */
      public var occurrence: Occurrence? = null,
      /** Who or what initiated the action and has responsibility for its activation. */
      public var requester: MutableList<Reference> = mutableListOf(),
      /**
       * Id [identifier??] of the clause or question text related to the requester of this action in
       * the referenced form or QuestionnaireResponse.
       */
      public var requesterLinkId: MutableList<String> = mutableListOf(),
      /**
       * The type of individual that is desired or required to perform or not perform the action.
       */
      public var performerType: MutableList<CodeableConcept> = mutableListOf(),
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
      public var performerLinkId: MutableList<String> = mutableListOf(),
      /**
       * Rationale for the action to be performed or not performed. Describes why the action is
       * permitted or prohibited.
       */
      public var reasonCode: MutableList<CodeableConcept> = mutableListOf(),
      /**
       * Indicates another resource whose existence justifies permitting or not permitting this
       * action.
       */
      public var reasonReference: MutableList<Reference> = mutableListOf(),
      /** Describes why the action is to be performed or not performed in textual form. */
      public var reason: MutableList<String> = mutableListOf(),
      /**
       * Id [identifier??] of the clause or question text related to the reason type or reference of
       * this action in the referenced form or QuestionnaireResponse.
       */
      public var reasonLinkId: MutableList<String> = mutableListOf(),
      /**
       * Comments made about the term action made by the requester, performer, subject or other
       * participants.
       */
      public var note: MutableList<Annotation> = mutableListOf(),
      /** Security labels that protects the action. */
      public var securityLabelNumber: MutableList<UnsignedInt> = mutableListOf(),
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /** The entity the action is performed or not performed on or for. */
        public var reference: MutableList<Reference> = mutableListOf(),
        /** Role type of agent assigned roles in this Contract. */
        public var role: CodeableConcept? = null,
      ) : BackboneElement()

      @Serializable(with = ContractTermActionOccurrenceSerializer::class)
      public sealed interface Occurrence {
        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asPeriod(): Period? = this as? Period

        public fun asTiming(): Timing? = this as? Timing

        public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
          Occurrence

        public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Occurrence

        public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) : Occurrence

        public companion object {
          internal fun from(
            dateTimeValue: com.google.fhir.model.r4b.DateTime?,
            periodValue: com.google.fhir.model.r4b.Period?,
            timingValue: com.google.fhir.model.r4b.Timing?,
          ): Occurrence? {
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (periodValue != null) return Period(periodValue)
            if (timingValue != null) return Timing(timingValue)
            return null
          }
        }
      }
    }

    @Serializable(with = ContractTermTopicSerializer::class)
    public sealed interface Topic {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Topic

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Topic

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          referenceValue: com.google.fhir.model.r4b.Reference?,
        ): Topic? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    /** Role of this Contract signer, e.g. notary, grantee. */
    public var type: Coding,
    /** Party which is a signator to this Contract. */
    public var party: Reference,
    /** Legally binding Contract DSIG signature contents in Base64. */
    public var signature: MutableList<Signature> = mutableListOf(),
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
     * Human readable rendering of this Contract in a format and representation intended to enhance
     * comprehension and ensure understandability.
     */
    public var content: Content,
  ) : BackboneElement() {
    @Serializable(with = ContractFriendlyContentSerializer::class)
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Content

      public companion object {
        internal fun from(
          attachmentValue: com.google.fhir.model.r4b.Attachment?,
          referenceValue: com.google.fhir.model.r4b.Reference?,
        ): Content? {
          if (attachmentValue != null) return Attachment(attachmentValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    /** Contract legal text in human renderable form. */
    public var content: Content,
  ) : BackboneElement() {
    @Serializable(with = ContractLegalContentSerializer::class)
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Content

      public companion object {
        internal fun from(
          attachmentValue: com.google.fhir.model.r4b.Attachment?,
          referenceValue: com.google.fhir.model.r4b.Reference?,
        ): Content? {
          if (attachmentValue != null) return Attachment(attachmentValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    /** Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal). */
    public var content: Content,
  ) : BackboneElement() {
    @Serializable(with = ContractRuleContentSerializer::class)
    public sealed interface Content {
      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Content

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Content

      public companion object {
        internal fun from(
          attachmentValue: com.google.fhir.model.r4b.Attachment?,
          referenceValue: com.google.fhir.model.r4b.Reference?,
        ): Content? {
          if (attachmentValue != null) return Attachment(attachmentValue)
          if (referenceValue != null) return Reference(referenceValue)
          return null
        }
      }
    }
  }

  @Serializable(with = ContractTopicSerializer::class)
  public sealed interface Topic {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Topic

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Topic

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        referenceValue: com.google.fhir.model.r4b.Reference?,
      ): Topic? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  @Serializable(with = ContractLegallyBindingSerializer::class)
  public sealed interface LegallyBinding {
    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asReference(): Reference? = this as? Reference

    public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
      LegallyBinding

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
      LegallyBinding

    public companion object {
      internal fun from(
        attachmentValue: com.google.fhir.model.r4b.Attachment?,
        referenceValue: com.google.fhir.model.r4b.Reference?,
      ): LegallyBinding? {
        if (attachmentValue != null) return Attachment(attachmentValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  /** This value set contract specific codes for status. */
  public enum class ContractPublicationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Amended("amended", "http://hl7.org/fhir/contract-publicationstatus", "Amended"),
    Appended("appended", "http://hl7.org/fhir/contract-publicationstatus", "Appended"),
    Cancelled("cancelled", "http://hl7.org/fhir/contract-publicationstatus", "Cancelled"),
    Disputed("disputed", "http://hl7.org/fhir/contract-publicationstatus", "Disputed"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/contract-publicationstatus",
      "Entered in Error",
    ),
    Executable("executable", "http://hl7.org/fhir/contract-publicationstatus", "Executable"),
    Executed("executed", "http://hl7.org/fhir/contract-publicationstatus", "Executed"),
    Negotiable("negotiable", "http://hl7.org/fhir/contract-publicationstatus", "Negotiable"),
    Offered("offered", "http://hl7.org/fhir/contract-publicationstatus", "Offered"),
    Policy("policy", "http://hl7.org/fhir/contract-publicationstatus", "Policy"),
    Rejected("rejected", "http://hl7.org/fhir/contract-publicationstatus", "Rejected"),
    Renewed("renewed", "http://hl7.org/fhir/contract-publicationstatus", "Renewed"),
    Revoked("revoked", "http://hl7.org/fhir/contract-publicationstatus", "Revoked"),
    Resolved("resolved", "http://hl7.org/fhir/contract-publicationstatus", "Resolved"),
    Terminated("terminated", "http://hl7.org/fhir/contract-publicationstatus", "Terminated");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

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
  ) {
    Amended("amended", "http://hl7.org/fhir/contract-status", "Amended"),
    Appended("appended", "http://hl7.org/fhir/contract-status", "Appended"),
    Cancelled("cancelled", "http://hl7.org/fhir/contract-status", "Cancelled"),
    Disputed("disputed", "http://hl7.org/fhir/contract-status", "Disputed"),
    Entered_In_Error("entered-in-error", "http://hl7.org/fhir/contract-status", "Entered in Error"),
    Executable("executable", "http://hl7.org/fhir/contract-status", "Executable"),
    Executed("executed", "http://hl7.org/fhir/contract-status", "Executed"),
    Negotiable("negotiable", "http://hl7.org/fhir/contract-status", "Negotiable"),
    Offered("offered", "http://hl7.org/fhir/contract-status", "Offered"),
    Policy("policy", "http://hl7.org/fhir/contract-status", "Policy"),
    Rejected("rejected", "http://hl7.org/fhir/contract-status", "Rejected"),
    Renewed("renewed", "http://hl7.org/fhir/contract-status", "Renewed"),
    Revoked("revoked", "http://hl7.org/fhir/contract-status", "Revoked"),
    Resolved("resolved", "http://hl7.org/fhir/contract-status", "Resolved"),
    Terminated("terminated", "http://hl7.org/fhir/contract-status", "Terminated");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

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
