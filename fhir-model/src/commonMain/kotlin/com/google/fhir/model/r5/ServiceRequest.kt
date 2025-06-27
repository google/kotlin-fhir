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

import com.google.fhir.model.r5.serializers.ServiceRequestOrderDetailParameterSerializer
import com.google.fhir.model.r5.serializers.ServiceRequestOrderDetailSerializer
import com.google.fhir.model.r5.serializers.ServiceRequestPatientInstructionSerializer
import com.google.fhir.model.r5.serializers.ServiceRequestSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of a request for service such as diagnostic investigations, treatments, or operations to
 * be performed.
 */
@Serializable(with = ServiceRequestSerializer::class)
@SerialName("ServiceRequest")
public data class ServiceRequest(
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
   * Identifiers assigned to this order instance by the orderer and/or the receiver and/or order
   * fulfiller.
   *
   * The identifier.type element is used to distinguish between the identifiers assigned by the
   * orderer (known as the 'Placer' in HL7 V2) and the producer of the observations in response to
   * the order (known as the 'Filler' in HL7 V2). For further discussion and examples see the
   * resource notes section below.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is
   * adhered to in whole or in part by this ServiceRequest.
   *
   * The PlanDefinition resource is used to describe series, sequences, or groups of actions to be
   * taken, while the ActivityDefinition resource is used to define each specific step or activity
   * to be performed. More information can be found in the
   * [Boundaries and Relationships](plandefinition.html#12.23.2) section for PlanDefinition.
   */
  public var instantiatesCanonical: List<Canonical?>? = null,
  /**
   * The URL pointing to an externally maintained protocol, guideline, orderset or other definition
   * that is adhered to in whole or in part by this ServiceRequest.
   *
   * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
   */
  public var instantiatesUri: List<Uri?>? = null,
  /** Plan/proposal/order fulfilled by this request. */
  public var basedOn: List<Reference?>? = null,
  /** The request takes the place of the referenced completed or terminated request(s). */
  public var replaces: List<Reference?>? = null,
  /**
   * A shared identifier common to all service requests that were authorized more or less
   * simultaneously by a single author, representing the composite or group identifier.
   *
   * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another)
   * or by having a common requisition. Requests that are part of the same requisition are generally
   * treated independently from the perspective of changing their state or maintaining them after
   * initial creation.
   */
  public var requisition: Identifier? = null,
  /**
   * The status of the order.
   *
   * The status is generally fully in the control of the requester - they determine whether the
   * order is draft or active and, after it has been activated, competed, revoked or placed on-hold.
   * States relating to the activities of the performer are reflected on either the corresponding
   * event (see [Event Pattern](event.html) for general discussion) or using the [Task](task.html)
   * resource.
   */
  public var status: Enumeration<ServiceRequestStatus>? = null,
  /**
   * Whether the request is a proposal, plan, an original order or a reflex order.
   *
   * This element is labeled as a modifier because the intent alters when and how the resource is
   * actually applicable.
   */
  public var intent: Enumeration<ServiceRequestIntent>? = null,
  /**
   * A code that classifies the service for searching, sorting and display purposes (e.g. "Surgical
   * Procedure").
   *
   * There may be multiple axis of categorization depending on the context or use case for
   * retrieving or displaying the resource. The level of granularity is defined by the category
   * concepts in the value set.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
   */
  public var priority: Enumeration<ServiceRequestPriority>? = null,
  /**
   * Set this to true if the record is saying that the service/procedure should NOT be performed.
   *
   * In general, only the code and timeframe will be present, though occasional additional
   * qualifiers such as body site or even performer could be included to narrow the scope of the
   * prohibition. If the ServiceRequest.code and ServiceRequest.doNotPerform both contain negation,
   * that will reinforce prohibition and should not have a double negative interpretation.
   */
  public var doNotPerform: Boolean? = null,
  /**
   * A code or reference that identifies a particular service (i.e., procedure, diagnostic
   * investigation, or panel of investigations) that have been requested.
   *
   * Many laboratory and radiology procedure codes embed the specimen/organ system in the test order
   * name, for example, serum or serum/plasma glucose, or a chest x-ray. The specimen might not be
   * recorded separately from the test code.
   */
  public var code: CodeableReference? = null,
  /**
   * Additional details and instructions about the how the services are to be delivered. For
   * example, and order for a urinary catheter may have an order detail for an external or
   * indwelling catheter, or an order for a bandage may require additional instructions specifying
   * how the bandage should be applied.
   *
   * For information from the medical record intended to support the delivery of the requested
   * services, use the `supportingInformation` element.
   */
  public var orderDetail: List<OrderDetail>? = null,
  /**
   * An amount of service being requested which can be a quantity ( for example $1,500 home
   * modification), a ratio ( for example, 20 half day visits per month), or a range (2.0 to 1.8 Gy
   * per fraction).
   */
  public var quantity: Quantity? = null,
  /**
   * On whom or what the service is to be performed. This is usually a human patient, but can also
   * be requested on animals, groups of humans or animals, devices such as dialysis machines, or
   * even locations (typically for environmental scans).
   */
  public var subject: Reference? = null,
  /**
   * The actual focus of a service request when it is not the subject of record representing
   * something or someone associated with the subject such as a spouse, parent, fetus, or donor. The
   * focus of a service request could also be an existing condition, an intervention, the subject's
   * diet, another service request on the subject, or a body structure such as tumor or implanted
   * device.
   */
  public var focus: List<Reference?>? = null,
  /**
   * An encounter that provides additional information about the healthcare context in which this
   * request is made.
   */
  public var encounter: Reference? = null,
  /** The date/time at which the requested service should occur. */
  public var occurrence: Occurrence? = null,
  /**
   * If a CodeableConcept is present, it indicates the pre-condition for performing the service. For
   * example "pain", "on flare-up", etc.
   */
  public var asNeeded: AsNeeded? = null,
  /** When the request transitioned to being actionable. */
  public var authoredOn: DateTime? = null,
  /**
   * The individual who initiated the request and has responsibility for its activation.
   *
   * This not the dispatcher, but rather who is the authorizer. This element is not intended to
   * handle delegation which would generally be managed through the Provenance resource.
   */
  public var requester: Reference? = null,
  /**
   * Desired type of performer for doing the requested service.
   *
   * This is a role, not a participation type. In other words, does not describe the task but
   * describes the capacity. For example, “compounding pharmacy”, “psychiatrist” or “internal
   * referral”.
   */
  public var performerType: CodeableConcept? = null,
  /**
   * The desired performer for doing the requested service. For example, the surgeon,
   * dermatopathologist, endoscopist, etc.
   *
   * If multiple performers are present, it is interpreted as a list of *alternative* performers
   * without any preference regardless of order. If order of preference is needed use the
   * [http://hl7.org/fhir/StructureDefinition/request-performerOrder](http://hl7.org/fhir/extensions/StructureDefinition-request-performerOrder.html).
   * Use CareTeam to represent a group of performers (for example, Practitioner A *and* Practitioner
   * B).
   */
  public var performer: List<Reference?>? = null,
  /**
   * The preferred location(s) where the procedure should actually happen in coded or free text
   * form. E.g. at home or nursing day care center.
   */
  public var location: List<CodeableReference?>? = null,
  /**
   * An explanation or justification for why this service is being requested in coded or textual
   * form. This is often for billing purposes. May relate to the resources referred to in
   * `supportingInfo`.
   *
   * This element represents why the referral is being made and may be used to decide how the
   * service will be performed, or even if it will be performed at all. To be as specific as
   * possible, a reference to *Observation* or *Condition* should be used if available. Otherwise,
   * use `concept.text` element if the data is free (uncoded) text as shown in the
   * [CT Scan example](servicerequest-example-di.html).
   */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be
   * needed for delivering the requested service.
   */
  public var insurance: List<Reference?>? = null,
  /**
   * Additional clinical information about the patient or specimen that may influence the services
   * or their interpretations. This information includes diagnosis, clinical findings and other
   * observations. In laboratory ordering these are typically referred to as "ask at order entry
   * questions (AOEs)". This includes observations explicitly requested by the producer (filler) to
   * provide context or supporting information needed to complete the order. For example, reporting
   * the amount of inspired oxygen for blood gas measurements.
   *
   * To represent information about how the services are to be delivered use the `instructions`
   * element.
   */
  public var supportingInfo: List<CodeableReference?>? = null,
  /**
   * One or more specimens that the laboratory procedure will use.
   *
   * The purpose of the ServiceRequest.specimen is to reflect the actual specimen that the requested
   * test/procedure is asked to be performed on, whether the lab already has it or not. References
   * to specimens for purposes other than to perform a test/procedure on should be made using the
   * ServiceRequest.supportingInfo or the Specimen.parent where the Specimen.parent would enable
   * descendency and ServiceRequest.supportingInfo a general reference for context.
   */
  public var specimen: List<Reference?>? = null,
  /**
   * Anatomic location where the procedure should be performed. This is the target site.
   *
   * Only used if not implicit in the code found in ServiceRequest.code. If the use case requires
   * BodySite to be handled as a separate resource instead of an inline coded element (e.g. to
   * identify and track separately) then use the standard extension
   * [http://hl7.org/fhir/StructureDefinition/procedure-targetBodyStructure](http://hl7.org/fhir/extensions/StructureDefinition-procedure-targetBodyStructure.html).
   */
  public var bodySite: List<CodeableConcept?>? = null,
  /** Anatomic location where the procedure should be performed. This is the target site. */
  public var bodyStructure: Reference? = null,
  /**
   * Any other notes and comments made about the service request. For example, internal billing
   * notes.
   */
  public var note: List<Annotation?>? = null,
  /** Instructions in terms that are understood by the patient or consumer. */
  public var patientInstruction: List<PatientInstruction>? = null,
  /**
   * Key events in the history of the request.
   *
   * This might not include provenances for all versions of the request – only those deemed
   * “relevant” or important. This SHALL NOT include the Provenance associated with this current
   * version of the resource. (If that provenance is deemed to be a “relevant” change, it will need
   * to be added as part of a later update. Until then, it can be queried directly as the Provenance
   * that points to this version using _revinclude All Provenances should have some historical
   * version of this Request as their subject.
   */
  public var relevantHistory: List<Reference?>? = null,
) : DomainResource() {
  /**
   * Additional details and instructions about the how the services are to be delivered. For
   * example, and order for a urinary catheter may have an order detail for an external or
   * indwelling catheter, or an order for a bandage may require additional instructions specifying
   * how the bandage should be applied.
   */
  @Serializable(with = ServiceRequestOrderDetailSerializer::class)
  public class OrderDetail(
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
    /** Indicates the context of the order details by reference. */
    public var parameterFocus: CodeableReference? = null,
    /** The parameter details for the service being requested. */
    public var parameter: List<Parameter>? = null,
  ) : BackboneElement() {
    /** The parameter details for the service being requested. */
    @Serializable(with = ServiceRequestOrderDetailParameterSerializer::class)
    public class Parameter(
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
       * A value representing the additional detail or instructions for the order (e.g., catheter
       * insertion, body elevation, descriptive device configuration and/or setting instructions).
       */
      public var code: CodeableConcept? = null,
      /**
       * Indicates a value for the order detail.
       *
       * CodeableConcept values are indented to express concepts that would normally be coded - when
       * a code is not available for a concept, CodeableConcept.text can be used. When the data is a
       * text or not a single identifiable concept, string should be used.
       */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asRatio(): Ratio? = this as? Ratio

        public fun asRange(): Range? = this as? Range

        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asString(): String? = this as? String

        public fun asPeriod(): Period? = this as? Period

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

        public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

        public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

        public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Value

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

        public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

        public companion object {
          public fun from(
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            RatioValue: com.google.fhir.model.r5.Ratio?,
            RangeValue: com.google.fhir.model.r5.Range?,
            booleanValue: com.google.fhir.model.r5.Boolean?,
            CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            stringValue: com.google.fhir.model.r5.String?,
            PeriodValue: com.google.fhir.model.r5.Period?,
          ): Value? {
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (RatioValue != null) return Ratio(RatioValue)
            if (RangeValue != null) return Range(RangeValue)
            if (booleanValue != null) return Boolean(booleanValue)
            if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
            if (stringValue != null) return String(stringValue)
            if (PeriodValue != null) return Period(PeriodValue)
            return null
          }
        }
      }
    }
  }

  /** Instructions in terms that are understood by the patient or consumer. */
  @Serializable(with = ServiceRequestPatientInstructionSerializer::class)
  public class PatientInstruction(
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
    /** Instructions in terms that are understood by the patient or consumer. */
    public var instruction: Instruction? = null,
  ) : BackboneElement() {
    public sealed interface Instruction {
      public fun asMarkdown(): Markdown? = this as? Markdown

      public fun asReference(): Reference? = this as? Reference

      public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) :
        Instruction

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
        Instruction

      public companion object {
        public fun from(
          markdownValue: com.google.fhir.model.r5.Markdown?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Instruction? {
          if (markdownValue != null) return Markdown(markdownValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  public sealed interface Quantity {
    public fun asQuantity(): Quantity? = this as? Quantity

    public fun asRatio(): Ratio? = this as? Ratio

    public fun asRange(): Range? = this as? Range

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
      ServiceRequest.Quantity

    public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) :
      ServiceRequest.Quantity

    public data class Range(public val `value`: com.google.fhir.model.r5.Range) :
      ServiceRequest.Quantity

    public companion object {
      public fun from(
        QuantityValue: com.google.fhir.model.r5.Quantity?,
        RatioValue: com.google.fhir.model.r5.Ratio?,
        RangeValue: com.google.fhir.model.r5.Range?,
      ): ServiceRequest.Quantity? {
        if (QuantityValue != null) return Quantity(QuantityValue)
        if (RatioValue != null) return Ratio(RatioValue)
        if (RangeValue != null) return Range(RangeValue)
        return null
      }
    }
  }

  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asTiming(): Timing? = this as? Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Occurrence

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

  public sealed interface AsNeeded {
    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : AsNeeded

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : AsNeeded

    public companion object {
      public fun from(
        booleanValue: com.google.fhir.model.r5.Boolean?,
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
      ): AsNeeded? {
        if (booleanValue != null) return Boolean(booleanValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        return null
      }
    }
  }

  /** Codes identifying the lifecycle stage of a request. */
  public enum class ServiceRequestStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The request has been created but is not yet complete or ready for action. */
    Draft(
      "draft",
      "http://hl7.org/fhir/request-status",
      "Draft",
      "The request has been created but is not yet complete or ready for action.",
    ),
    /** The request is in force and ready to be acted upon. */
    Active(
      "active",
      "http://hl7.org/fhir/request-status",
      "Active",
      "The request is in force and ready to be acted upon.",
    ),
    /**
     * The request (and any implicit authorization to act) has been temporarily withdrawn but is
     * expected to resume in the future.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/request-status",
      "On Hold",
      "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.",
    ),
    /**
     * The request (and any implicit authorization to act) has been terminated prior to the known
     * full completion of the intended actions. No further activity should occur.
     */
    Revoked(
      "revoked",
      "http://hl7.org/fhir/request-status",
      "Revoked",
      "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.",
    ),
    /**
     * The activity described by the request has been fully performed. No further activity will
     * occur.
     */
    Completed(
      "completed",
      "http://hl7.org/fhir/request-status",
      "Completed",
      "The activity described by the request has been fully performed.  No further activity will occur.",
    ),
    /**
     * This request should never have existed and should be considered 'void'. (It is possible that
     * real-world decisions were based on it. If real-world activity has occurred, the status should
     * be "revoked" rather than "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/request-status",
      "Entered in Error",
      "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this request. Note: This concept is not to be used for "other" - one of the listed statuses
     * is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/request-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ServiceRequestStatus =
        when (code) {
          "draft" -> Draft
          "active" -> Active
          "on-hold" -> On_Hold
          "revoked" -> Revoked
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum ServiceRequestStatus")
        }
    }
  }

  /** Codes indicating the degree of authority/intentionality associated with a request. */
  public enum class ServiceRequestIntent(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The request is a suggestion made by someone/something that does not have an intention to
     * ensure it occurs and without providing an authorization to act.
     */
    Proposal(
      "proposal",
      "http://hl7.org/fhir/request-intent",
      "Proposal",
      "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.",
    ),
    /**
     * The request represents an intention to ensure something occurs without providing an
     * authorization for others to act.
     */
    Plan(
      "plan",
      "http://hl7.org/fhir/request-intent",
      "Plan",
      "The request represents an intention to ensure something occurs without providing an authorization for others to act.",
    ),
    /**
     * The request represents a legally binding instruction authored by a Patient or RelatedPerson.
     */
    Directive(
      "directive",
      "http://hl7.org/fhir/request-intent",
      "Directive",
      "The request represents a legally binding instruction authored by a Patient or RelatedPerson.",
    ),
    /** The request represents a request/demand and authorization for action by the requestor. */
    Order(
      "order",
      "http://hl7.org/fhir/request-intent",
      "Order",
      "The request represents a request/demand and authorization for action by the requestor.",
    ),
    /** The request represents an original authorization for action. */
    Original_Order(
      "original-order",
      "http://hl7.org/fhir/request-intent",
      "Original Order",
      "The request represents an original authorization for action.",
    ),
    /**
     * The request represents an automatically generated supplemental authorization for action based
     * on a parent authorization together with initial results of the action taken against that
     * parent authorization.
     */
    Reflex_Order(
      "reflex-order",
      "http://hl7.org/fhir/request-intent",
      "Reflex Order",
      "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.",
    ),
    /**
     * The request represents the view of an authorization instantiated by a fulfilling system
     * representing the details of the fulfiller's intention to act upon a submitted order.
     */
    Filler_Order(
      "filler-order",
      "http://hl7.org/fhir/request-intent",
      "Filler Order",
      "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.",
    ),
    /**
     * An order created in fulfillment of a broader order that represents the authorization for a
     * single activity occurrence. E.g. The administration of a single dose of a drug.
     */
    Instance_Order(
      "instance-order",
      "http://hl7.org/fhir/request-intent",
      "Instance Order",
      "An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.",
    ),
    /**
     * The request represents a component or option for a RequestOrchestration that establishes
     * timing, conditionality and/or other constraints among a set of requests. Refer to
     * [[[RequestOrchestration]]] for additional information on how this status is used.
     */
    Option(
      "option",
      "http://hl7.org/fhir/request-intent",
      "Option",
      "The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ServiceRequestIntent =
        when (code) {
          "proposal" -> Proposal
          "plan" -> Plan
          "directive" -> Directive
          "order" -> Order
          "original-order" -> Original_Order
          "reflex-order" -> Reflex_Order
          "filler-order" -> Filler_Order
          "instance-order" -> Instance_Order
          "option" -> Option
          else -> throw IllegalArgumentException("Unknown code $code for enum ServiceRequestIntent")
        }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class ServiceRequestPriority(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The request has normal priority. */
    Routine(
      "routine",
      "http://hl7.org/fhir/request-priority",
      "Routine",
      "The request has normal priority.",
    ),
    /** The request should be actioned promptly - higher priority than routine. */
    Urgent(
      "urgent",
      "http://hl7.org/fhir/request-priority",
      "Urgent",
      "The request should be actioned promptly - higher priority than routine.",
    ),
    /** The request should be actioned as soon as possible - higher priority than urgent. */
    Asap(
      "asap",
      "http://hl7.org/fhir/request-priority",
      "ASAP",
      "The request should be actioned as soon as possible - higher priority than urgent.",
    ),
    /**
     * The request should be actioned immediately - highest possible priority. E.g. an emergency.
     */
    Stat(
      "stat",
      "http://hl7.org/fhir/request-priority",
      "STAT",
      "The request should be actioned immediately - highest possible priority.  E.g. an emergency.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ServiceRequestPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ServiceRequestPriority")
        }
    }
  }
}
