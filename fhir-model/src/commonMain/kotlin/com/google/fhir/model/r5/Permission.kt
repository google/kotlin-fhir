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

import com.google.fhir.model.r5.serializers.PermissionJustificationSerializer
import com.google.fhir.model.r5.serializers.PermissionRuleActivitySerializer
import com.google.fhir.model.r5.serializers.PermissionRuleDataResourceSerializer
import com.google.fhir.model.r5.serializers.PermissionRuleDataSerializer
import com.google.fhir.model.r5.serializers.PermissionRuleSerializer
import com.google.fhir.model.r5.serializers.PermissionSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Permission resource holds access rules for a given data and context. */
@Serializable(with = PermissionSerializer::class)
@SerialName("Permission")
public data class Permission(
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
  /** Status. */
  public var status: Enumeration<PermissionStatus>? = null,
  /** The person or entity that asserts the permission. */
  public var asserter: Reference? = null,
  /** The date that permission was asserted. */
  public var date: List<DateTime?>? = null,
  /** The period in which the permission is active. */
  public var validity: Period? = null,
  /** The asserted justification for using the data. */
  public var justification: Justification? = null,
  /**
   * Defines a procedure for arriving at an access decision given the set of rules.
   *
   * see
   * [XACML Combining Rules](http://docs.oasis-open.org/xacml/3.0/xacml-3.0-core-spec-cos01-en.html#_Toc325047267)
   */
  public var combining: Enumeration<PermissionCombining>? = null,
  /** A set of rules. */
  public var rule: List<Rule>? = null,
) : DomainResource() {
  /** The asserted justification for using the data. */
  @Serializable(with = PermissionJustificationSerializer::class)
  public class Justification(
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
     * This would be a codeableconcept, or a coding, which can be constrained to , for example, the
     * 6 grounds for processing in GDPR.
     */
    public var basis: List<CodeableConcept?>? = null,
    /**
     * Justifing rational.
     *
     * While any resource may be used, DocumentReference, Consent, PlanDefinition, and Contract
     * would be most frequent
     */
    public var evidence: List<Reference?>? = null,
  ) : BackboneElement()

  /** A set of rules. */
  @Serializable(with = PermissionRuleSerializer::class)
  public class Rule(
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
    /** deny | permit. */
    public var type: Enumeration<PermissionProvisionType>? = null,
    /** A description or definition of which activities are allowed to be done on the data. */
    public var `data`: List<Data>? = null,
    /** A description or definition of which activities are allowed to be done on the data. */
    public var activity: List<Activity>? = null,
    /** What limits apply to the use of the data. */
    public var limit: List<CodeableConcept?>? = null,
  ) : BackboneElement() {
    /** A description or definition of which activities are allowed to be done on the data. */
    @Serializable(with = PermissionRuleDataSerializer::class)
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
      /** Explicit FHIR Resource references. */
      public var resource: List<Resource>? = null,
      /**
       * The data in scope are those with the given codes present in that data .meta.security
       * element.
       *
       * Note the ConfidentialityCode vocabulary indicates the highest value, thus a security label
       * of "R" then it applies to all resources that are labeled "R" or lower. E.g. for
       * Confidentiality, it's a high water mark. For other kinds of security labels, subsumption
       * logic applies. When the purpose of use tag is on the data, access request purpose of use
       * shall not conflict.
       */
      public var security: List<Coding?>? = null,
      /**
       * Clinical or Operational Relevant period of time that bounds the data controlled by this
       * rule.
       *
       * This has a different sense to the .validity.
       */
      public var period: List<Period?>? = null,
      /** Used when other data selection elements are insufficient. */
      public var expression: Expression? = null,
    ) : BackboneElement() {
      /** Explicit FHIR Resource references. */
      @Serializable(with = PermissionRuleDataResourceSerializer::class)
      public class Resource(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: String? = null,
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
        /** How the resource reference is interpreted when testing consent restrictions. */
        public var meaning: Enumeration<ConsentDataMeaning>? = null,
        /**
         * A reference to a specific resource that defines which resources are covered by this
         * consent.
         */
        public var reference: Reference? = null,
      ) : BackboneElement()
    }

    /** A description or definition of which activities are allowed to be done on the data. */
    @Serializable(with = PermissionRuleActivitySerializer::class)
    public class Activity(
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
      /** The actor(s) authorized for the defined activity. */
      public var actor: List<Reference?>? = null,
      /**
       * Actions controlled by this Rule.
       *
       * Note that this is the direct action (not the grounds for the action covered in the purpose
       * element). At present, the only action in the understood and tested scope of this resource
       * is 'read'.
       */
      public var action: List<CodeableConcept?>? = null,
      /** The purpose for which the permission is given. */
      public var purpose: List<CodeableConcept?>? = null,
    ) : BackboneElement()
  }

  /** How a rule statement is applied, such as adding additional consent or removing consent. */
  public enum class PermissionProvisionType(
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
      public fun fromCode(code: String): PermissionProvisionType =
        when (code) {
          "deny" -> Deny
          "permit" -> Permit
          else ->
            throw IllegalArgumentException("Unknown code $code for enum PermissionProvisionType")
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

  /** Codes identifying the lifecycle stage of a product. */
  public enum class PermissionStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** Permission is given. */
    Active("active", "http://hl7.org/fhir/permission-status", "Active", "Permission is given."),
    /** Permission was entered in error and is not active. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/permission-status",
      "Entered in Error",
      "Permission was entered in error and is not active.",
    ),
    /** Permission is being defined. */
    Draft(
      "draft",
      "http://hl7.org/fhir/permission-status",
      "Draft",
      "Permission is being defined.",
    ),
    /** Permission not granted. */
    Rejected(
      "rejected",
      "http://hl7.org/fhir/permission-status",
      "Rejected",
      "Permission not granted.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): PermissionStatus =
        when (code) {
          "active" -> Active
          "entered-in-error" -> Entered_In_Error
          "draft" -> Draft
          "rejected" -> Rejected
          else -> throw IllegalArgumentException("Unknown code $code for enum PermissionStatus")
        }
    }
  }

  /** Codes identifying rule combining algorithm. */
  public enum class PermissionCombining(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The deny overrides combining algorithm is intended for those cases where a deny decision
     * should have priority over a permit decision.
     */
    Deny_Overrides(
      "deny-overrides",
      "http://hl7.org/fhir/permission-rule-combining",
      "Deny-overrides",
      "The deny overrides combining algorithm is intended for those cases where a deny decision should have priority over a permit decision.",
    ),
    /**
     * The permit overrides combining algorithm is intended for those cases where a permit decision
     * should have priority over a deny decision.
     */
    Permit_Overrides(
      "permit-overrides",
      "http://hl7.org/fhir/permission-rule-combining",
      "Permit-overrides",
      "The permit overrides combining algorithm is intended for those cases where a permit decision should have priority over a deny decision.",
    ),
    /**
     * The behavior of this algorithm is identical to that of the “Deny-overrides” rule-combining
     * algorithm with one exception. The order in which the collection of rules is evaluated SHALL
     * match the order as listed in the permission.
     */
    Ordered_Deny_Overrides(
      "ordered-deny-overrides",
      "http://hl7.org/fhir/permission-rule-combining",
      "Ordered-deny-overrides",
      "The behavior of this algorithm is identical to that of the “Deny-overrides” rule-combining algorithm with one exception.  The order in which the collection of rules is evaluated SHALL match the order as listed in the permission.",
    ),
    /**
     * The behavior of this algorithm is identical to that of the “Permit-overrides” rule-combining
     * algorithm with one exception. The order in which the collection of rules is evaluated SHALL
     * match the order as listed in the permission.
     */
    Ordered_Permit_Overrides(
      "ordered-permit-overrides",
      "http://hl7.org/fhir/permission-rule-combining",
      "Ordered-permit-overrides",
      "The behavior of this algorithm is identical to that of the “Permit-overrides” rule-combining algorithm with one exception.  The order in which the collection of rules is evaluated SHALL match the order as listed in the permission.",
    ),
    /**
     * The “Deny-unless-permit” combining algorithm is intended for those cases where a permit
     * decision should have priority over a deny decision, and an “Indeterminate” or “NotApplicable”
     * must never be the result. It is particularly useful at the top level in a policy structure to
     * ensure that a PDP will always return a definite “Permit” or “Deny” result.
     */
    Deny_Unless_Permit(
      "deny-unless-permit",
      "http://hl7.org/fhir/permission-rule-combining",
      "Deny-unless-permit",
      "The “Deny-unless-permit” combining algorithm is intended for those cases where a permit decision should have priority over a deny decision, and an “Indeterminate” or “NotApplicable” must never be the result. It is particularly useful at the top level in a policy structure to ensure that a PDP will always return a definite “Permit” or “Deny” result.",
    ),
    /**
     * The “Permit-unless-deny” combining algorithm is intended for those cases where a deny
     * decision should have priority over a permit decision, and an “Indeterminate” or
     * “NotApplicable” must never be the result. It is particularly useful at the top level in a
     * policy structure to ensure that a PDP will always return a definite “Permit” or “Deny”
     * result. This algorithm has the following behavior.
     */
    Permit_Unless_Deny(
      "permit-unless-deny",
      "http://hl7.org/fhir/permission-rule-combining",
      "Permit-unless-deny",
      "The “Permit-unless-deny” combining algorithm is intended for those cases where a deny decision should have priority over a permit decision, and an “Indeterminate” or “NotApplicable” must never be the result. It is particularly useful at the top level in a policy structure to ensure that a PDP will always return a definite “Permit” or “Deny” result. This algorithm has the following behavior.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): PermissionCombining =
        when (code) {
          "deny-overrides" -> Deny_Overrides
          "permit-overrides" -> Permit_Overrides
          "ordered-deny-overrides" -> Ordered_Deny_Overrides
          "ordered-permit-overrides" -> Ordered_Permit_Overrides
          "deny-unless-permit" -> Deny_Unless_Permit
          "permit-unless-deny" -> Permit_Unless_Deny
          else -> throw IllegalArgumentException("Unknown code $code for enum PermissionCombining")
        }
    }
  }
}
