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

import com.google.fhir.model.r4b.serializers.AdverseEventSerializer
import com.google.fhir.model.r4b.serializers.AdverseEventSuspectEntityCausalitySerializer
import com.google.fhir.model.r4b.serializers.AdverseEventSuspectEntitySerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Actual or potential/avoided event causing unintended physical injury resulting from or
 * contributed to by medical care, a research study or other healthcare setting factors that
 * requires additional monitoring, treatment, or hospitalization, or that results in death.
 */
@Serializable(with = AdverseEventSerializer::class)
@SerialName("AdverseEvent")
public data class AdverseEvent(
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
   * Business identifiers assigned to this adverse event by the performer or other systems which
   * remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var identifier: Identifier? = null,
  /**
   * Whether the event actually happened, or just had the potential to. Note that this is
   * independent of whether anyone was affected or harmed or how severely.
   */
  public var actuality: Enumeration<AdverseEventActuality>? = null,
  /** The overall type of event, intended for search and filtering purposes. */
  public var category: List<CodeableConcept?>? = null,
  /**
   * This element defines the specific type of event that occurred or that was prevented from
   * occurring.
   */
  public var event: CodeableConcept? = null,
  /**
   * This subject or group impacted by the event.
   *
   * If AdverseEvent.resultingCondition differs among members of the group, then use Patient as the
   * subject.
   */
  public var subject: Reference? = null,
  /**
   * The Encounter during which AdverseEvent was created or to which the creation of this record is
   * tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter. For example, if a medication administration was considered an adverse
   * event because it resulted in a rash, then the encounter when the medication administration was
   * given is the context. If the patient reports the AdverseEvent during a second encounter, that
   * second encounter is not the context.
   */
  public var encounter: Reference? = null,
  /** The date (and perhaps time) when the adverse event occurred. */
  public var date: DateTime? = null,
  /** Estimated or actual date the AdverseEvent began, in the opinion of the reporter. */
  public var detected: DateTime? = null,
  /**
   * The date on which the existence of the AdverseEvent was first recorded.
   *
   * The recordedDate represents the date when this particular AdverseEvent record was created in
   * the system, not the date of the most recent update. The date of the last record modification
   * can be retrieved from the resource metadata.
   */
  public var recordedDate: DateTime? = null,
  /**
   * Includes information about the reaction that occurred as a result of exposure to a substance
   * (for example, a drug or a chemical).
   */
  public var resultingCondition: List<Reference?>? = null,
  /** The information about where the adverse event occurred. */
  public var location: Reference? = null,
  /** Assessment whether this event was of real importance. */
  public var seriousness: CodeableConcept? = null,
  /**
   * Describes the severity of the adverse event, in relation to the subject. Contrast to
   * AdverseEvent.seriousness - a severe rash might not be serious, but a mild heart problem is.
   */
  public var severity: CodeableConcept? = null,
  /** Describes the type of outcome from the adverse event. */
  public var outcome: CodeableConcept? = null,
  /** Information on who recorded the adverse event. May be the patient or a practitioner. */
  public var recorder: Reference? = null,
  /**
   * Parties that may or should contribute or have contributed information to the adverse event,
   * which can consist of one or more activities. Such information includes information leading to
   * the decision to perform the activity and how to perform the activity (e.g. consultant),
   * information that the activity itself seeks to reveal (e.g. informant of clinical history), or
   * information about what activity was performed (e.g. informant witness).
   */
  public var contributor: List<Reference?>? = null,
  /** Describes the entity that is suspected to have caused the adverse event. */
  public var suspectEntity: List<SuspectEntity>? = null,
  /** AdverseEvent.subjectMedicalHistory. */
  public var subjectMedicalHistory: List<Reference?>? = null,
  /** AdverseEvent.referenceDocument. */
  public var referenceDocument: List<Reference?>? = null,
  /** AdverseEvent.study. */
  public var study: List<Reference?>? = null,
) : DomainResource() {
  /** Describes the entity that is suspected to have caused the adverse event. */
  @Serializable(with = AdverseEventSuspectEntitySerializer::class)
  public class SuspectEntity(
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
     * Identifies the actual instance of what caused the adverse event. May be a substance,
     * medication, medication administration, medication statement or a device.
     */
    public var instance: Reference? = null,
    /** Information on the possible cause of the event. */
    public var causality: List<Causality>? = null,
  ) : BackboneElement() {
    /** Information on the possible cause of the event. */
    @Serializable(with = AdverseEventSuspectEntityCausalitySerializer::class)
    public class Causality(
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
      /** Assessment of if the entity caused the event. */
      public var assessment: CodeableConcept? = null,
      /** AdverseEvent.suspectEntity.causalityProductRelatedness. */
      public var productRelatedness: String? = null,
      /** AdverseEvent.suspectEntity.causalityAuthor. */
      public var author: Reference? = null,
      /** ProbabilityScale | Bayesian | Checklist. */
      public var method: CodeableConcept? = null,
    ) : BackboneElement()
  }

  /** Overall nature of the adverse event, e.g. real or potential. */
  public enum class AdverseEventActuality(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The adverse event actually happened regardless of whether anyone was affected or harmed. */
    Actual(
      "actual",
      "http://hl7.org/fhir/adverse-event-actuality",
      "Adverse Event",
      "The adverse event actually happened regardless of whether anyone was affected or harmed.",
    ),
    /** A potential adverse event. */
    Potential(
      "potential",
      "http://hl7.org/fhir/adverse-event-actuality",
      "Potential Adverse Event",
      "A potential adverse event.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AdverseEventActuality =
        when (code) {
          "actual" -> Actual
          "potential" -> Potential
          else ->
            throw IllegalArgumentException("Unknown code $code for enum AdverseEventActuality")
        }
    }
  }
}
