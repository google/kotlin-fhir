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

import com.google.fhir.model.r5.serializers.EvidenceVariableCategorySerializer
import com.google.fhir.model.r5.serializers.EvidenceVariableCharacteristicDefinitionByCombinationSerializer
import com.google.fhir.model.r5.serializers.EvidenceVariableCharacteristicDefinitionByTypeAndValueSerializer
import com.google.fhir.model.r5.serializers.EvidenceVariableCharacteristicSerializer
import com.google.fhir.model.r5.serializers.EvidenceVariableCharacteristicTimeFromEventSerializer
import com.google.fhir.model.r5.serializers.EvidenceVariableSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** The EvidenceVariable resource describes an element that knowledge (Evidence) is about. */
@Serializable(with = EvidenceVariableSerializer::class)
@SerialName("EvidenceVariable")
public data class EvidenceVariable(
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
   * An absolute URI that is used to identify this evidence variable when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * evidence variable is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the evidence variable is stored on different servers.
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the meta.source element to indicate where the current master
   * source of the resource can be found.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this evidence variable when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this evidence variable outside of FHIR, where it is not possible to
   * use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the evidence variable when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the evidence variable author and is not expected to be globally unique. For example, it might
   * be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence. To provide a version
   * consistent with the Decision Support Service specification, use the format Major.Minor.Revision
   * (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision
   * Support Service specification. Note that a version is required for non-experimental active
   * artifacts.
   *
   * There may be different evidence variable instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the evidence variable with the format [url]|[version]. The
   * version SHOULD NOT contain a '#' - see [Business Version](resource.html#bv-format).
   */
  public var version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which is more current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 is newer, and a 0 if the version ordering can't successfully be
   * determined.
   */
  public var versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the evidence variable. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the evidence variable.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The short title provides an alternate title for use in informal descriptive contexts where the
   * full, formal title is not necessary.
   */
  public var shortTitle: String? = null,
  /**
   * The status of this evidence variable. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of evidence variables that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this resource is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the evidence variable was last significantly changed. The
   * date must change when the business version changes and it must change if the status code
   * changes. In addition, it should change when the substantive content of the evidence variable
   * changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the evidence variable. Additional specific dates may be
   * added as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the evidence variable.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the evidence
   * variable is the organization or individual primarily responsible for the maintenance and upkeep
   * of the evidence variable. This is not necessarily the same individual or organization that
   * developed and initially authored the content. The publisher is the primary point of contact for
   * questions or issues with the evidence variable. This item SHOULD be populated unless the
   * information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the evidence variable from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the evidence variable as conveyed in the 'text' field of the resource
   * itself. This item SHOULD be populated unless the information is available from context (e.g.
   * the language of the evidence variable is presumed to be the predominant language in the place
   * the evidence variable was created).
   */
  public var description: Markdown? = null,
  /** A human-readable string to clarify or explain concepts about the resource. */
  public var note: List<Annotation?>? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate evidence variable instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * Explanation of why this EvidenceVariable is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the EvidenceVariable. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * EvidenceVariable.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the resource and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the resource.
   */
  public var copyright: Markdown? = null,
  /**
   * A short string (<50 characters), suitable for inclusion in a page footer that identifies the
   * copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All
   * rights reserved', 'Some rights reserved').
   *
   * The (c) symbol should NOT be included in this string. It will be added by software when
   * rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in
   * the more general 'copyright' element.
   */
  public var copyrightLabel: String? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the resource content was or is planned to be in active use.
   *
   * The effective period for an EvidenceVariable determines when the content is applicable for
   * usage and is independent of publication and review dates. For example, a variable intended to
   * be used for the year 2016 might be published in 2015.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var effectivePeriod: Period? = null,
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   */
  public var author: List<ContactDetail?>? = null,
  /**
   * An individual or organization primarily responsible for internal coherence of the content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   */
  public var editor: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be primarily responsible for review
   * of some aspect of the content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var reviewer: List<ContactDetail?>? = null,
  /**
   * An individual or organization asserted by the publisher to be responsible for officially
   * endorsing the content for use in some setting.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var endorser: List<ContactDetail?>? = null,
  /**
   * Related artifacts such as additional documentation, justification, or bibliographic references.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /**
   * True if the actual variable measured, false if a conceptual representation of the intended
   * variable.
   */
  public var `actual`: Boolean? = null,
  /**
   * A defining factor of the EvidenceVariable. Multiple characteristics are applied with "and"
   * semantics.
   *
   * Characteristics can be defined flexibly to accommodate different use cases for membership
   * criteria, ranging from simple codes, all the way to using an expression language to express the
   * criteria.
   */
  public var characteristic: List<Characteristic>? = null,
  /** The method of handling in statistical analysis. */
  public var handling: Enumeration<EvidenceVariableHandling>? = null,
  /** A grouping for ordinal or polychotomous variables. */
  public var category: List<Category>? = null,
) : DomainResource() {
  /**
   * A defining factor of the EvidenceVariable. Multiple characteristics are applied with "and"
   * semantics.
   */
  @Serializable(with = EvidenceVariableCharacteristicSerializer::class)
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
    /** Label used for when a characteristic refers to another characteristic. */
    public var linkId: Id? = null,
    /**
     * A short, natural language description of the characteristic that could be used to communicate
     * the criteria to an end-user.
     */
    public var description: Markdown? = null,
    /** A human-readable string to clarify or explain concepts about the characteristic. */
    public var note: List<Annotation?>? = null,
    /**
     * When true, this characteristic is an exclusion criterion. In other words, not matching this
     * characteristic definition is equivalent to meeting this criterion.
     */
    public var exclude: Boolean? = null,
    /** Defines the characteristic using a Reference. */
    public var definitionReference: Reference? = null,
    /** Defines the characteristic using Canonical. */
    public var definitionCanonical: Canonical? = null,
    /** Defines the characteristic using CodeableConcept. */
    public var definitionCodeableConcept: CodeableConcept? = null,
    /**
     * Defines the characteristic using Expression.
     *
     * When another element provides a definition of the characteristic, the definitionExpression
     * content SHALL match the definition (only adding technical concepts necessary for
     * implementation) without changing the meaning.
     */
    public var definitionExpression: Expression? = null,
    /** Defines the characteristic using id. */
    public var definitionId: Id? = null,
    /** Defines the characteristic using both a type and value[x] elements. */
    public var definitionByTypeAndValue: DefinitionByTypeAndValue? = null,
    /** Defines the characteristic as a combination of two or more characteristics. */
    public var definitionByCombination: DefinitionByCombination? = null,
    /** Number of occurrences meeting the characteristic. */
    public var instances: Instances? = null,
    /** Length of time in which the characteristic is met. */
    public var duration: Duration? = null,
    /** Timing in which the characteristic is determined. */
    public var timeFromEvent: List<TimeFromEvent>? = null,
  ) : BackboneElement() {
    /** Defines the characteristic using both a type and value[x] elements. */
    @Serializable(with = EvidenceVariableCharacteristicDefinitionByTypeAndValueSerializer::class)
    public class DefinitionByTypeAndValue(
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
      /** Used to express the type of characteristic. */
      public var type: CodeableConcept? = null,
      /** Method for how the characteristic value was determined. */
      public var method: List<CodeableConcept?>? = null,
      /** Device used for determining characteristic. */
      public var device: Reference? = null,
      /** Defines the characteristic when paired with characteristic.type. */
      public var `value`: Value? = null,
      /**
       * Defines the reference point for comparison when valueQuantity or valueRange is not compared
       * to zero.
       */
      public var offset: CodeableConcept? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asRange(): Range? = this as? Range

        public fun asReference(): Reference? = this as? Reference

        public fun asId(): Id? = this as? Id

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Value

        public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

        public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

        public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Value

        public companion object {
          public fun from(
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            booleanValue: com.google.fhir.model.r5.Boolean?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            RangeValue: com.google.fhir.model.r5.Range?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
            idValue: com.google.fhir.model.r5.Id?,
          ): Value? {
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (booleanValue != null) return Boolean(booleanValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (RangeValue != null) return Range(RangeValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            if (idValue != null) return Id(idValue)
            return null
          }
        }
      }
    }

    /** Defines the characteristic as a combination of two or more characteristics. */
    @Serializable(with = EvidenceVariableCharacteristicDefinitionByCombinationSerializer::class)
    public class DefinitionByCombination(
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
      /** Used to specify if two or more characteristics are combined with OR or AND. */
      public var code: Enumeration<CharacteristicCombination>? = null,
      /** Provides the value of "n" when "at-least" or "at-most" codes are used. */
      public var threshold: PositiveInt? = null,
      /** A defining factor of the characteristic. */
      public var characteristic: List<Characteristic?>? = null,
    ) : BackboneElement()

    /** Timing in which the characteristic is determined. */
    @Serializable(with = EvidenceVariableCharacteristicTimeFromEventSerializer::class)
    public class TimeFromEvent(
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
      /** Human readable description. */
      public var description: Markdown? = null,
      /** A human-readable string to clarify or explain concepts about the timeFromEvent. */
      public var note: List<Annotation?>? = null,
      /** The event used as a base point (reference point) in time. */
      public var event: Event? = null,
      /** Used to express the observation at a defined amount of time before or after the event. */
      public var quantity: Quantity? = null,
      /** Used to express the observation within a period before and/or after the event. */
      public var range: Range? = null,
    ) : BackboneElement() {
      public sealed interface Event {
        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asReference(): Reference? = this as? Reference

        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asId(): Id? = this as? Id

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Event

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Event

        public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Event

        public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Event

        public companion object {
          public fun from(
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
            dateTimeValue: com.google.fhir.model.r5.DateTime?,
            idValue: com.google.fhir.model.r5.Id?,
          ): Event? {
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (idValue != null) return Id(idValue)
            return null
          }
        }
      }
    }

    public sealed interface Instances {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Instances

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Instances

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
        ): Instances? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          return null
        }
      }
    }

    public sealed interface Duration {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Duration

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Duration

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
        ): Duration? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          return null
        }
      }
    }
  }

  /** A grouping for ordinal or polychotomous variables. */
  @Serializable(with = EvidenceVariableCategorySerializer::class)
  public class Category(
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
    /** Description of the grouping. */
    public var name: String? = null,
    /** Definition of the grouping. */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
        ): Value? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          return null
        }
      }
    }
  }

  public sealed interface VersionAlgorithm {
    public fun asString(): String? = this as? String

    public fun asCoding(): Coding? = this as? Coding

    public data class String(public val `value`: com.google.fhir.model.r5.String) :
      VersionAlgorithm

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) :
      VersionAlgorithm

    public companion object {
      public fun from(
        stringValue: com.google.fhir.model.r5.String?,
        CodingValue: com.google.fhir.model.r5.Coding?,
      ): VersionAlgorithm? {
        if (stringValue != null) return String(stringValue)
        if (CodingValue != null) return Coding(CodingValue)
        return null
      }
    }
  }

  /** Logical grouping of characteristics. */
  public enum class CharacteristicCombination(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Combine characteristics with AND. */
    All_Of(
      "all-of",
      "http://hl7.org/fhir/characteristic-combination",
      "All of",
      "Combine characteristics with AND.",
    ),
    /** Combine characteristics with OR. */
    Any_Of(
      "any-of",
      "http://hl7.org/fhir/characteristic-combination",
      "Any of",
      "Combine characteristics with OR.",
    ),
    /** Meet at least the threshold number of characteristics for definition. */
    At_Least(
      "at-least",
      "http://hl7.org/fhir/characteristic-combination",
      "At least",
      "Meet at least the threshold number of characteristics for definition.",
    ),
    /** Meet at most the threshold number of characteristics for definition. */
    At_Most(
      "at-most",
      "http://hl7.org/fhir/characteristic-combination",
      "At most",
      "Meet at most the threshold number of characteristics for definition.",
    ),
    /** Combine characteristics statistically. Use method to specify the statistical method. */
    Statistical(
      "statistical",
      "http://hl7.org/fhir/characteristic-combination",
      "Statistical",
      "Combine characteristics statistically. Use method to specify the statistical method.",
    ),
    /** Combine characteristics by addition of benefits and subtraction of harms. */
    Net_Effect(
      "net-effect",
      "http://hl7.org/fhir/characteristic-combination",
      "Net effect",
      "Combine characteristics by addition of benefits and subtraction of harms.",
    ),
    /** Combine characteristics as a collection used as the dataset. */
    Dataset(
      "dataset",
      "http://hl7.org/fhir/characteristic-combination",
      "Dataset",
      "Combine characteristics as a collection used as the dataset.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CharacteristicCombination =
        when (code) {
          "all-of" -> All_Of
          "any-of" -> Any_Of
          "at-least" -> At_Least
          "at-most" -> At_Most
          "statistical" -> Statistical
          "net-effect" -> Net_Effect
          "dataset" -> Dataset
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CharacteristicCombination")
        }
    }
  }

  /**
   * The handling of the variable in statistical analysis for exposures or outcomes (E.g.
   * Dichotomous, Continuous, Descriptive).
   */
  public enum class EvidenceVariableHandling(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * A continuous variable is one for which, within the limits the variable ranges, any value is
     * possible (from STATO http://purl.obolibrary.org/obo/STATO_0000251).
     */
    Continuous(
      "continuous",
      "http://hl7.org/fhir/variable-handling",
      "continuous variable",
      "A continuous variable is one for which, within the limits the variable ranges, any value is possible (from STATO http://purl.obolibrary.org/obo/STATO_0000251).",
    ),
    /**
     * A dichotomous variable is a categorical variable which is defined to have only 2 categories
     * or possible values (from STATO http://purl.obolibrary.org/obo/STATO_0000090).
     */
    Dichotomous(
      "dichotomous",
      "http://hl7.org/fhir/variable-handling",
      "dichotomous variable",
      "A dichotomous variable is a categorical variable which is defined to have only 2 categories or possible values (from STATO http://purl.obolibrary.org/obo/STATO_0000090).",
    ),
    /**
     * An ordinal variable is a categorical variable where the discrete possible values are ordered
     * or correspond to an implicit ranking (from STATO
     * http://purl.obolibrary.org/obo/STATO_0000228).
     */
    Ordinal(
      "ordinal",
      "http://hl7.org/fhir/variable-handling",
      "ordinal variable",
      "An ordinal variable is a categorical variable where the discrete possible values are ordered or correspond to an implicit ranking (from STATO http://purl.obolibrary.org/obo/STATO_0000228).",
    ),
    /**
     * A polychotomous variable is a categorical variable which is defined to have minimally 2
     * categories or possible values. (from STATO http://purl.obolibrary.org/obo/STATO_0000087).
     * Suggestion to limit code use to situations when neither dichotomous nor ordinal variables
     * apply.
     */
    Polychotomous(
      "polychotomous",
      "http://hl7.org/fhir/variable-handling",
      "polychotomous variable",
      "A polychotomous variable is a categorical variable which is defined to have minimally 2 categories or possible values. (from STATO  http://purl.obolibrary.org/obo/STATO_0000087).  Suggestion to limit code use to situations when neither dichotomous nor ordinal variables apply.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): EvidenceVariableHandling =
        when (code) {
          "continuous" -> Continuous
          "dichotomous" -> Dichotomous
          "ordinal" -> Ordinal
          "polychotomous" -> Polychotomous
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EvidenceVariableHandling")
        }
    }
  }
}
