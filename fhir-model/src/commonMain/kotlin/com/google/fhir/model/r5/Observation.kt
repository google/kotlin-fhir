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

import com.google.fhir.model.r5.serializers.ObservationComponentSerializer
import com.google.fhir.model.r5.serializers.ObservationReferenceRangeSerializer
import com.google.fhir.model.r5.serializers.ObservationSerializer
import com.google.fhir.model.r5.serializers.ObservationTriggeredBySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Measurements and simple assertions made about a patient, device or other subject. */
@Serializable(with = ObservationSerializer::class)
@SerialName("Observation")
public data class Observation(
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
  /** A unique identifier assigned to this observation. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The reference to a FHIR ObservationDefinition resource that provides the definition that is
   * adhered to in whole or in part by this Observation instance.
   *
   * ObservationDefinition can be referenced by its canonical url using instantiatesCanonical, or by
   * a name or an identifier using the appropriate sub-elements of instantiatesReference.
   */
  public var instantiates: Instantiates? = null,
  /**
   * A plan, proposal or order that is fulfilled in whole or in part by this event. For example, a
   * MedicationRequest may require a patient to have laboratory test performed before it is
   * dispensed.
   */
  public var basedOn: List<Reference?>? = null,
  /** Identifies the observation(s) that triggered the performance of this observation. */
  public var triggeredBy: List<TriggeredBy>? = null,
  /**
   * A larger event of which this particular Observation is a component or step. For example, an
   * observation as part of a procedure.
   *
   * To link an Observation to an Encounter use `encounter`. See the
   * [Notes](observation.html#obsgrouping) below for guidance on referencing another Observation.
   */
  public var partOf: List<Reference?>? = null,
  /**
   * The status of the result value.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<ObservationStatus>? = null,
  /**
   * A code that classifies the general type of observation being made.
   *
   * In addition to the required category valueset, this element allows various categorization
   * schemes based on the owner’s definition of the category and effectively multiple categories can
   * be used at once. The level of granularity is defined by the category concepts in the value set.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Describes what was observed. Sometimes this is called the observation "name".
   *
   * *All* code-value and, if present, component.code-component.value pairs need to be taken into
   * account to correctly understand the meaning of the observation.
   */
  public var code: CodeableConcept? = null,
  /**
   * The patient, or group of patients, location, device, organization, procedure or practitioner
   * this observation is about and into whose or what record the observation is placed. If the
   * actual focus of the observation is different from the subject (or a sample of, part, or region
   * of the subject), the `focus` element or the `code` itself specifies the actual focus of the
   * observation.
   *
   * One would expect this element to be a cardinality of 1..1. The only circumstance in which the
   * subject can be missing is when the observation is made by a device that does not know the
   * patient. In this case, the observation SHALL be matched to a patient through some
   * context/channel matching technique, and at this point, the observation should be updated. The
   * subject of an Observation may in some cases be a procedure. This supports the regulatory
   * inspection use case where observations are captured during inspections of a procedure that is
   * being performed (independent of any particular patient or whether patient related at all).
   */
  public var subject: Reference? = null,
  /**
   * The actual focus of an observation when it is not the patient of record representing something
   * or someone associated with the patient such as a spouse, parent, fetus, or donor. For example,
   * fetus observations in a mother's record. The focus of an observation could also be an existing
   * condition, an intervention, the subject's diet, another observation of the subject, or a body
   * structure such as tumor or implanted device. An example use case would be using the Observation
   * resource to capture whether the mother is trained to change her child's tracheostomy tube. In
   * this example, the child is the patient of record and the mother is the focus.
   *
   * Typically, an observation is made about the subject - a patient, or group of patients,
   * location, or device - and the distinction between the subject and what is directly measured for
   * an observation is specified in the observation code itself ( e.g., "Blood Glucose") and does
   * not need to be represented separately using this element. Use `specimen` if a reference to a
   * specimen is required. If a code is required instead of a resource use either `bodysite` for
   * bodysites or the standard extension
   * [http://hl7.org/fhir/StructureDefinition/observation-focusCode](http://hl7.org/fhir/extensions/StructureDefinition-observation-focusCode.html).
   */
  public var focus: List<Reference?>? = null,
  /**
   * The healthcare event (e.g. a patient and healthcare provider interaction) during which this
   * observation is made.
   *
   * This will typically be the encounter the event occurred within, but some events may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter (e.g. pre-admission laboratory tests).
   */
  public var encounter: Reference? = null,
  /**
   * The time or time-period the observed value is asserted as being true. For biological subjects -
   * e.g. human patients - this is usually called the "physiologically relevant time". This is
   * usually either the time of the procedure or of specimen collection, but very often the source
   * of the date/time is not known, only the date/time itself.
   *
   * At least a date should be present unless this observation is a historical report. For recording
   * imprecise or "fuzzy" times (For example, a blood glucose measurement taken "after breakfast")
   * use the [Timing](datatypes.html#timing) datatype which allow the measurement to be tied to
   * regular life events.
   */
  public var effective: Effective? = null,
  /**
   * The date and time this version of the observation was made available to providers, typically
   * after the results have been reviewed and verified.
   *
   * For Observations that don't require review and verification, it may be the same as the
   * [`lastUpdated` ](resource-definitions.html#Meta.lastUpdated) time of the resource itself. For
   * Observations that do require review and verification for certain updates, it might not be the
   * same as the `lastUpdated` time of the resource itself due to a non-clinically significant
   * update that doesn't require the new version to be reviewed and verified again.
   */
  public var issued: Instant? = null,
  /** Who was responsible for asserting the observed value as "true". */
  public var performer: List<Reference?>? = null,
  /**
   * The information determined as a result of making the observation, if the information has a
   * simple value.
   * - An observation may have:
   *     1. a single value here
   *     1. both a value and a set of related or component values
   *     1. only a set of related or component values.
   * - If a value is present, the datatype for this element should be determined by the `code`.
   * - *CodeableConcept* with just a text would be used instead of a string if the field was usually
   *   coded, or if the type associated with the `code` defines a coded value.
   * - *Attachment* is used if the observation result value is a binary file such as an image. If
   *   the observation result value is derived from the binary file (for example 'X' detected and
   *   here is the the proof in this image), the binary file may be directly represented using
   *   *DocumentReference* and referenced by `derivedFrom`.
   * - The usage of valueReference is restricted to the MolecularSequence resource when used as a
   *   definitional resource, not as a patient-specific finding. .
   * - For additional guidance, see the [Notes section](observation.html#notes) below.
   */
  public var `value`: Value? = null,
  /**
   * Provides a reason why the expected value in the element Observation.value[x] is missing.
   *
   * Null or exceptional values can be represented two ways in FHIR Observations. One way is to
   * simply include them in the value set and represent the exceptions in the value. For example,
   * measurement values for a serology test could be "detected", "not detected", "inconclusive", or
   * "specimen unsatisfactory".
   *
   * The alternate way is to use the value element for actual observations and use the explicit
   * dataAbsentReason element to record exceptional values. For example, the dataAbsentReason code
   * "error" could be used when the measurement was not completed. Note that an observation may only
   * be reported if there are values to report. For example differential cell counts values may be
   * reported only when > 0. Because of these options, use-case agreements are required to interpret
   * general observations for null or exceptional values.
   */
  public var dataAbsentReason: CodeableConcept? = null,
  /**
   * A categorical assessment of an observation value. For example, high, low, normal.
   *
   * Historically used for laboratory results (known as 'abnormal flag' ), its use extends to other
   * use cases where coded interpretations are relevant. Often reported as one or more simple
   * compact codes this element is often placed adjacent to the result value in reports and flow
   * sheets to signal the meaning/normalcy status of the result.
   */
  public var interpretation: List<CodeableConcept?>? = null,
  /**
   * Comments about the observation or the results.
   *
   * May include general statements about the observation, or statements about significant,
   * unexpected or unreliable results values, or information about its source when relevant to its
   * interpretation.
   */
  public var note: List<Annotation?>? = null,
  /**
   * Indicates the site on the subject's body where the observation was made (i.e. the target site).
   *
   * Only used if not implicit in code found in Observation.code. In many systems, this may be
   * represented as a related observation instead of an inline component.
   */
  public var bodySite: CodeableConcept? = null,
  /**
   * Indicates the body structure on the subject's body where the observation was made (i.e. the
   * target site).
   *
   * Only used if not implicit in code found in Observation.code or bodySite is used. In many
   * systems, this may be represented as a related observation instead of an inline component.
   */
  public var bodyStructure: Reference? = null,
  /**
   * Indicates the mechanism used to perform the observation.
   *
   * Only used if not implicit in code for Observation.code.
   */
  public var method: CodeableConcept? = null,
  /**
   * The specimen that was used when this observation was made.
   *
   * Should only be used if not implicit in code found in `Observation.code`. Observations are not
   * made on specimens themselves; they are made on a subject, but in many cases by the means of a
   * specimen. Note that although specimens are often involved, they are not always tracked and
   * reported explicitly. Also note that observation resources may be used in contexts that track
   * the specimen explicitly (e.g. Diagnostic Report).
   */
  public var specimen: Reference? = null,
  /**
   * A reference to the device that generates the measurements or the device settings for the
   * device.
   *
   * Note that this is not meant to represent a device involved in the transmission of the result,
   * e.g., a gateway. Such devices may be documented using the Provenance resource where relevant.
   */
  public var device: Reference? = null,
  /**
   * Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple
   * reference ranges are interpreted as an "OR". In other words, to represent two distinct target
   * populations, two `referenceRange` elements would be used.
   *
   * Most observations only have one generic reference range. Systems MAY choose to restrict to only
   * supplying the relevant reference range based on knowledge about the patient (e.g., specific to
   * the patient's age, gender, weight and other factors), but this might not be possible or
   * appropriate. Whenever more than one reference range is supplied, the differences between them
   * SHOULD be provided in the reference range and/or age properties.
   */
  public var referenceRange: List<ReferenceRange>? = null,
  /**
   * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign
   * measurements) that includes the target as a member of the group.
   *
   * When using this element, an observation will typically have either a value or a set of related
   * resources, although both may be present in some cases. For a discussion on the ways
   * Observations can assembled in groups together, see [Notes](observation.html#obsgrouping) below.
   * Note that a system may calculate results from
   * [QuestionnaireResponse](questionnaireresponse.html) into a final score and represent the score
   * as an Observation.
   */
  public var hasMember: List<Reference?>? = null,
  /**
   * The target resource that represents a measurement from which this observation value is derived.
   * For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
   *
   * All the reference choices that are listed in this element can represent clinical observations
   * and other measurements that may be the source for a derived value. The most common reference
   * will be another Observation. For a discussion on the ways Observations can assembled in groups
   * together, see [Notes](observation.html#obsgrouping) below.
   */
  public var derivedFrom: List<Reference?>? = null,
  /**
   * Some observations have multiple component observations. These component observations are
   * expressed as separate code value pairs that share the same attributes. Examples include
   * systolic and diastolic component observations for blood pressure measurement and multiple
   * component observations for genetics observations.
   *
   * For a discussion on the ways Observations can be assembled in groups together see
   * [Notes](observation.html#notes) below.
   */
  public var component: List<Component>? = null,
) : DomainResource() {
  /** Identifies the observation(s) that triggered the performance of this observation. */
  @Serializable(with = ObservationTriggeredBySerializer::class)
  public class TriggeredBy(
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
    /** Reference to the triggering observation. */
    public var observation: Reference? = null,
    /** The type of trigger. Reflex | Repeat | Re-run. */
    public var type: Enumeration<TriggeredByType>? = null,
    /**
     * Provides the reason why this observation was performed as a result of the observation(s)
     * referenced.
     */
    public var reason: String? = null,
  ) : BackboneElement()

  /**
   * Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple
   * reference ranges are interpreted as an "OR". In other words, to represent two distinct target
   * populations, two `referenceRange` elements would be used.
   */
  @Serializable(with = ObservationReferenceRangeSerializer::class)
  public class ReferenceRange(
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
     * The value of the low bound of the reference range. The low bound of the reference range
     * endpoint is inclusive of the value (e.g. reference range is >=5 - <=9). If the low bound is
     * omitted, it is assumed to be meaningless (e.g. reference range is <=2.3).
     */
    public var low: Quantity? = null,
    /**
     * The value of the high bound of the reference range. The high bound of the reference range
     * endpoint is inclusive of the value (e.g. reference range is >=5 - <=9). If the high bound is
     * omitted, it is assumed to be meaningless (e.g. reference range is >= 2.3).
     */
    public var high: Quantity? = null,
    /** The value of the normal value of the reference range. */
    public var normalValue: CodeableConcept? = null,
    /**
     * Codes to indicate the what part of the targeted reference population it applies to. For
     * example, the normal or therapeutic range.
     *
     * This SHOULD be populated if there is more than one range. If this element is not present then
     * the normal range is assumed.
     */
    public var type: CodeableConcept? = null,
    /**
     * Codes to indicate the target population this reference range applies to. For example, a
     * reference range may be based on the normal population or a particular sex or race. Multiple
     * `appliesTo` are interpreted as an "AND" of the target populations. For example, to represent
     * a target population of African American females, both a code of female and a code for African
     * American would be used.
     *
     * This SHOULD be populated if there is more than one range. If this element is not present then
     * the normal population is assumed.
     */
    public var appliesTo: List<CodeableConcept?>? = null,
    /**
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of
     * weeks at term) if the meaning says so.
     */
    public var age: Range? = null,
    /**
     * Text based reference range in an observation which may be used when a quantitative range is
     * not appropriate for an observation. An example would be a reference value of "Negative" or a
     * list or table of "normals".
     */
    public var text: Markdown? = null,
  ) : BackboneElement()

  /**
   * Some observations have multiple component observations. These component observations are
   * expressed as separate code value pairs that share the same attributes. Examples include
   * systolic and diastolic component observations for blood pressure measurement and multiple
   * component observations for genetics observations.
   */
  @Serializable(with = ObservationComponentSerializer::class)
  public class Component(
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
     * Describes what was observed. Sometimes this is called the observation "code".
     *
     * *All* code-value and component.code-component.value pairs need to be taken into account to
     * correctly understand the meaning of the observation.
     */
    public var code: CodeableConcept? = null,
    /**
     * The information determined as a result of making the observation, if the information has a
     * simple value.
     *
     * Used when observation has a set of component observations:
     * - An observation may have both a value (e.g. an Apgar score) and component observations (the
     *   observations from which the Apgar score was derived).
     * - If a value is present, the datatype for this element should be determined by the `code`.
     * - *CodeableConcept* with just a text would be used instead of a string if the field was
     *   usually coded, or if the type associated with the `code` defines a coded value.
     * - *Attachment* is used if the observation result value is a binary file such as an image. If
     *   the observation result value is derived from the binary file (for example 'X' detected and
     *   here is the the proof in this image), the binary file may be directly represented using
     *   *DocumentReference* and referenced by `derivedFrom`.
     * - If a value is present, the datatype for this element should be determined by the `code`.
     * - *CodeableConcept* with just a text would be used instead of a string if the field was
     *   usually coded, or if the type associated with the `code` defines a coded value.
     * - *Attachment* is used if the observation result value is a binary file such as an image. If
     *   the observation result value is derived from the binary file (for example 'X' detected and
     *   here is the the proof in this image), the binary file may be directly represented using
     *   *DocumentReference* and referenced by `derivedFrom`.
     * - The usage of valueReference is restricted to the MolecularSequence resource when used as a
     *   definitional resource, not as a patient-specific finding. .
     * - For additional guidance, see the [Notes section](observation.html#notes) below.
     */
    public var `value`: Value? = null,
    /**
     * Provides a reason why the expected value in the element Observation.component.value[x] is
     * missing.
     *
     * "Null" or exceptional values can be represented two ways in FHIR Observations. One way is to
     * simply include them in the value set and represent the exceptions in the value. For example,
     * measurement values for a serology test could be "detected", "not detected", "inconclusive",
     * or "test not done".
     *
     * The alternate way is to use the value element for actual observations and use the explicit
     * dataAbsentReason element to record exceptional values. For example, the dataAbsentReason code
     * "error" could be used when the measurement was not completed. Because of these options,
     * use-case agreements are required to interpret general observations for exceptional values.
     */
    public var dataAbsentReason: CodeableConcept? = null,
    /**
     * A categorical assessment of an observation value. For example, high, low, normal.
     *
     * Historically used for laboratory results (known as 'abnormal flag' ), its use extends to
     * other use cases where coded interpretations are relevant. Often reported as one or more
     * simple compact codes this element is often placed adjacent to the result value in reports and
     * flow sheets to signal the meaning/normalcy status of the result.
     */
    public var interpretation: List<CodeableConcept?>? = null,
    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     *
     * Most observations only have one generic reference range. Systems MAY choose to restrict to
     * only supplying the relevant reference range based on knowledge about the patient (e.g.,
     * specific to the patient's age, gender, weight and other factors), but this might not be
     * possible or appropriate. Whenever more than one reference range is supplied, the differences
     * between them SHOULD be provided in the reference range and/or age properties.
     */
    public var referenceRange: List<ReferenceRange?>? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asString(): String? = this as? String

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asInteger(): Integer? = this as? Integer

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asTime(): Time? = this as? Time

      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) :
        Value

      public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          stringValue: com.google.fhir.model.r5.String?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          integerValue: com.google.fhir.model.r5.Integer?,
          RangeValue: com.google.fhir.model.r5.Range?,
          RatioValue: com.google.fhir.model.r5.Ratio?,
          SampledDataValue: com.google.fhir.model.r5.SampledData?,
          timeValue: com.google.fhir.model.r5.Time?,
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          PeriodValue: com.google.fhir.model.r5.Period?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Value? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (stringValue != null) return String(stringValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (integerValue != null) return Integer(integerValue)
          if (RangeValue != null) return Range(RangeValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (timeValue != null) return Time(timeValue)
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  public sealed interface Instantiates {
    public fun asCanonical(): Canonical? = this as? Canonical

    public fun asReference(): Reference? = this as? Reference

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
      Instantiates

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
      Instantiates

    public companion object {
      public fun from(
        canonicalValue: com.google.fhir.model.r5.Canonical?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
      ): Instantiates? {
        if (canonicalValue != null) return Canonical(canonicalValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  public sealed interface Effective {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asTiming(): Timing? = this as? Timing

    public fun asInstant(): Instant? = this as? Instant

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Effective

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Effective

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Effective

    public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : Effective

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        TimingValue: com.google.fhir.model.r5.Timing?,
        instantValue: com.google.fhir.model.r5.Instant?,
      ): Effective? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (instantValue != null) return Instant(instantValue)
        return null
      }
    }
  }

  public sealed interface Value {
    public fun asQuantity(): Quantity? = this as? Quantity

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asString(): String? = this as? String

    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asInteger(): Integer? = this as? Integer

    public fun asRange(): Range? = this as? Range

    public fun asRatio(): Ratio? = this as? Ratio

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asTime(): Time? = this as? Time

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asReference(): Reference? = this as? Reference

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Value

    public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

    public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

    public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

    public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

    public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) : Value

    public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

    public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

    public companion object {
      public fun from(
        QuantityValue: com.google.fhir.model.r5.Quantity?,
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        stringValue: com.google.fhir.model.r5.String?,
        booleanValue: com.google.fhir.model.r5.Boolean?,
        integerValue: com.google.fhir.model.r5.Integer?,
        RangeValue: com.google.fhir.model.r5.Range?,
        RatioValue: com.google.fhir.model.r5.Ratio?,
        SampledDataValue: com.google.fhir.model.r5.SampledData?,
        timeValue: com.google.fhir.model.r5.Time?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        AttachmentValue: com.google.fhir.model.r5.Attachment?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
      ): Value? {
        if (QuantityValue != null) return Quantity(QuantityValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (stringValue != null) return String(stringValue)
        if (booleanValue != null) return Boolean(booleanValue)
        if (integerValue != null) return Integer(integerValue)
        if (RangeValue != null) return Range(RangeValue)
        if (RatioValue != null) return Ratio(RatioValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (timeValue != null) return Time(timeValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (AttachmentValue != null) return Attachment(AttachmentValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  /** Codes providing the type of triggeredBy observation. */
  public enum class TriggeredByType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Performance of one or more other tests depending on the results of the initial test. This may
     * include collection of additional specimen. While a new ServiceRequest is not required to
     * perform the additional test, where it is still needed (e.g., requesting another laboratory to
     * perform the reflex test), the Observation.basedOn would reference the new ServiceRequest that
     * requested the additional test to be performed as well as the original ServiceRequest to
     * reflect the one that provided the authorization.
     */
    Reflex(
      "reflex",
      "http://hl7.org/fhir/observation-triggeredbytype",
      "Reflex",
      "Performance of one or more other tests depending on the results of the initial test.  This may include collection of additional specimen. While a new ServiceRequest is not required to perform the additional test, where it is still needed (e.g., requesting another laboratory to perform the reflex test), the Observation.basedOn would reference the new ServiceRequest that requested the additional test to be performed as well as the original ServiceRequest to reflect the one that provided the authorization.",
    ),
    /** Performance of the same test again with the same parameters/settings/solution. */
    Repeat(
      "repeat",
      "http://hl7.org/fhir/observation-triggeredbytype",
      "Repeat (per policy)",
      "Performance of the same test again with the same parameters/settings/solution.",
    ),
    /** Performance of the same test but with different parameters/settings/solution. */
    Re_Run(
      "re-run",
      "http://hl7.org/fhir/observation-triggeredbytype",
      "Re-run (per policy)",
      "Performance of the same test but with different parameters/settings/solution.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TriggeredByType =
        when (code) {
          "reflex" -> Reflex
          "repeat" -> Repeat
          "re-run" -> Re_Run
          else -> throw IllegalArgumentException("Unknown code $code for enum TriggeredByType")
        }
    }
  }

  /** Codes providing the status of an observation. */
  public enum class ObservationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The existence of the observation is registered, but there is no result yet available. */
    Registered(
      "registered",
      "http://hl7.org/fhir/observation-status",
      "Registered",
      "The existence of the observation is registered, but there is no result yet available.",
    ),
    /** This is an initial or interim observation: data may be incomplete or unverified. */
    Preliminary(
      "preliminary",
      "http://hl7.org/fhir/observation-status",
      "Preliminary",
      "This is an initial or interim observation: data may be incomplete or unverified.",
    ),
    /**
     * The observation is complete and there are no further actions needed. Additional information
     * such "released", "signed", etc. would be represented using [Provenance](provenance.html)
     * which provides not only the act but also the actors and dates and other related data. These
     * act states would be associated with an observation status of `preliminary` until they are all
     * completed and then a status of `final` would be applied.
     */
    Final(
      "final",
      "http://hl7.org/fhir/observation-status",
      "Final",
      "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc. would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.",
    ),
    /**
     * Subsequent to being Final, the observation has been modified subsequent. This includes
     * updates/new information and corrections.
     */
    Amended(
      "amended",
      "http://hl7.org/fhir/observation-status",
      "Amended",
      "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.",
    ),
    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test
     * result.
     */
    Corrected(
      "corrected",
      "http://hl7.org/fhir/observation-status",
      "Corrected",
      "Subsequent to being Final, the observation has been modified to correct an error in the test result.",
    ),
    /**
     * The observation is unavailable because the measurement was not started or not completed (also
     * sometimes called "aborted").
     */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/observation-status",
      "Cancelled",
      "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").",
    ),
    /**
     * The observation has been withdrawn following previous final release. This electronic record
     * should never have existed, though it is possible that real-world decisions were based on it.
     * (If real-world activity has occurred, the status should be "cancelled" rather than
     * "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/observation-status",
      "Entered in Error",
      "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this observation. Note: This concept is not to be used for "other" - one of the listed
     * statuses is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/observation-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ObservationStatus =
        when (code) {
          "registered" -> Registered
          "preliminary" -> Preliminary
          "final" -> Final
          "amended" -> Amended
          "corrected" -> Corrected
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum ObservationStatus")
        }
    }
  }
}
