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

import com.google.fhir.model.r4.serializers.MedicinalProductAuthorizationJurisdictionalAuthorizationSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductAuthorizationProcedureSerializer
import com.google.fhir.model.r4.serializers.MedicinalProductAuthorizationSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** The regulatory authorization of a medicinal product. */
@Serializable(with = MedicinalProductAuthorizationSerializer::class)
@SerialName("MedicinalProductAuthorization")
public data class MedicinalProductAuthorization(
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
  /** Business identifier for the marketing authorization, as assigned by a regulator. */
  public var identifier: List<Identifier?>? = null,
  /** The medicinal product that is being authorized. */
  public var subject: Reference? = null,
  /** The country in which the marketing authorization has been granted. */
  public var country: List<CodeableConcept?>? = null,
  /** Jurisdiction within a country. */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /** The status of the marketing authorization. */
  public var status: CodeableConcept? = null,
  /** The date at which the given status has become applicable. */
  public var statusDate: DateTime? = null,
  /**
   * The date when a suspended the marketing or the marketing authorization of the product is
   * anticipated to be restored.
   */
  public var restoreDate: DateTime? = null,
  /**
   * The beginning of the time period in which the marketing authorization is in the specific status
   * shall be specified A complete date consisting of day, month and year shall be specified using
   * the ISO 8601 date format.
   */
  public var validityPeriod: Period? = null,
  /** A period of time after authorization before generic product applicatiosn can be submitted. */
  public var dataExclusivityPeriod: Period? = null,
  /** The date when the first authorization was granted by a Medicines Regulatory Agency. */
  public var dateOfFirstAuthorization: DateTime? = null,
  /**
   * Date of first marketing authorization for a company's new medicinal product in any country in
   * the World.
   */
  public var internationalBirthDate: DateTime? = null,
  /** The legal framework against which this authorization is granted. */
  public var legalBasis: CodeableConcept? = null,
  /** Authorization in areas within a country. */
  public var jurisdictionalAuthorization: List<JurisdictionalAuthorization>? = null,
  /** Marketing Authorization Holder. */
  public var holder: Reference? = null,
  /** Medicines Regulatory Agency. */
  public var regulator: Reference? = null,
  /** The regulatory procedure for granting or amending a marketing authorization. */
  public var procedure: Procedure? = null,
) : DomainResource() {
  /** Authorization in areas within a country. */
  @Serializable(with = MedicinalProductAuthorizationJurisdictionalAuthorizationSerializer::class)
  public class JurisdictionalAuthorization(
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
    /** The assigned number for the marketing authorization. */
    public var identifier: List<Identifier?>? = null,
    /** Country of authorization. */
    public var country: CodeableConcept? = null,
    /** Jurisdiction within a country. */
    public var jurisdiction: List<CodeableConcept?>? = null,
    /** The legal status of supply in a jurisdiction or region. */
    public var legalStatusOfSupply: CodeableConcept? = null,
    /** The start and expected end date of the authorization. */
    public var validityPeriod: Period? = null,
  ) : BackboneElement()

  /** The regulatory procedure for granting or amending a marketing authorization. */
  @Serializable(with = MedicinalProductAuthorizationProcedureSerializer::class)
  public class Procedure(
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
    /** Identifier for this procedure. */
    public var identifier: Identifier? = null,
    /** Type of procedure. */
    public var type: CodeableConcept? = null,
    /** Date of procedure. */
    public var date: Date? = null,
    /** Applcations submitted to obtain a marketing authorization. */
    public var application: List<Procedure?>? = null,
  ) : BackboneElement() {
    public sealed interface Date {
      public fun asPeriod(): Period? = this as? Period

      public fun asDateTime(): DateTime? = this as? DateTime

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Date

      public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Date

      public companion object {
        public fun from(
          PeriodValue: com.google.fhir.model.r4.Period?,
          dateTimeValue: com.google.fhir.model.r4.DateTime?,
        ): Date? {
          if (PeriodValue != null) return Period(PeriodValue)
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          return null
        }
      }
    }
  }
}
