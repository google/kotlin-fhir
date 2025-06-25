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

import com.google.fhir.model.r4b.serializers.AccountCoverageSerializer
import com.google.fhir.model.r4b.serializers.AccountGuarantorSerializer
import com.google.fhir.model.r4b.serializers.AccountSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A financial tool for tracking value accrued for a particular purpose. In the healthcare field,
 * used to track charges for a patient, cost centers, etc.
 */
@Serializable(with = AccountSerializer::class)
@SerialName("Account")
public data class Account(
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
   * Unique identifier used to reference the account. Might or might not be intended for human use
   * (e.g. credit card number).
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * Indicates whether the account is presently used/usable or not.
   *
   * This element is labeled as a modifier because the status contains the codes inactive and
   * entered-in-error that mark the Account as not currently valid.
   */
  public var status: Enumeration<AccountStatus>? = null,
  /** Categorizes the account for reporting and searching purposes. */
  public var type: CodeableConcept? = null,
  /** Name used for the account when displaying it to humans in reports, etc. */
  public var name: String? = null,
  /**
   * Identifies the entity which incurs the expenses. While the immediate recipients of services or
   * goods might be entities related to the subject, the expenses were ultimately incurred by the
   * subject of the Account.
   *
   * Accounts can be applied to non-patients for tracking other non-patient related activities, such
   * as group services (patients not tracked, and costs charged to another body), or might not be
   * allocated.
   */
  public var subject: List<Reference?>? = null,
  /**
   * The date range of services associated with this account.
   *
   * It is possible for transactions to be posted outside the service period, as long as the service
   * was provided within the defined service period.
   */
  public var servicePeriod: Period? = null,
  /**
   * The party(s) that are responsible for covering the payment of this account, and what order
   * should they be applied to the account.
   *
   * Typically. this may be some form of insurance, internal charges, or self-pay.
   *
   * Local or jurisdictional business rules may determine which coverage covers which types of
   * billable items charged to the account, and in which order. Where the order is important, a
   * local/jurisdictional extension may be defined to specify the order for the type of charge.
   */
  public var coverage: List<Coverage>? = null,
  /**
   * Indicates the service area, hospital, department, etc. with responsibility for managing the
   * Account.
   */
  public var owner: Reference? = null,
  /** Provides additional information about what the account tracks and how it is used. */
  public var description: String? = null,
  /** The parties responsible for balancing the account if other payment options fall short. */
  public var guarantor: List<Guarantor>? = null,
  /** Reference to a parent Account. */
  public var partOf: Reference? = null,
) : DomainResource() {
  /**
   * The party(s) that are responsible for covering the payment of this account, and what order
   * should they be applied to the account.
   */
  @Serializable(with = AccountCoverageSerializer::class)
  public class Coverage(
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
     * The party(s) that contribute to payment (or part of) of the charges applied to this account
     * (including self-pay).
     *
     * A coverage may only be responsible for specific types of charges, and the sequence of the
     * coverages in the account could be important when processing billing.
     */
    public var coverage: Reference? = null,
    /**
     * The priority of the coverage in the context of this account.
     *
     * It is common in some jurisdictions for there to be multiple coverages allocated to an
     * account, and a sequence is required to order the settling of the account (often with
     * insurance claiming).
     */
    public var priority: PositiveInt? = null,
  ) : BackboneElement()

  /** The parties responsible for balancing the account if other payment options fall short. */
  @Serializable(with = AccountGuarantorSerializer::class)
  public class Guarantor(
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
    /** The entity who is responsible. */
    public var party: Reference? = null,
    /**
     * A guarantor may be placed on credit hold or otherwise have their role temporarily suspended.
     */
    public var onHold: Boolean? = null,
    /** The timeframe during which the guarantor accepts responsibility for the account. */
    public var period: Period? = null,
  ) : BackboneElement()

  /** Indicates whether the account is available to be used. */
  public enum class AccountStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** This account is active and may be used. */
    Active(
      "active",
      "http://hl7.org/fhir/account-status",
      "Active",
      "This account is active and may be used.",
    ),
    /** This account is inactive and should not be used to track financial information. */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/account-status",
      "Inactive",
      "This account is inactive and should not be used to track financial information.",
    ),
    /** This instance should not have been part of this patient's medical record. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/account-status",
      "Entered in error",
      "This instance should not have been part of this patient's medical record.",
    ),
    /** This account is on hold. */
    On_Hold("on-hold", "http://hl7.org/fhir/account-status", "On Hold", "This account is on hold."),
    /** The account status is unknown. */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/account-status",
      "Unknown",
      "The account status is unknown.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AccountStatus =
        when (code) {
          "active" -> Active
          "inactive" -> Inactive
          "entered-in-error" -> Entered_In_Error
          "on-hold" -> On_Hold
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum AccountStatus")
        }
    }
  }
}
