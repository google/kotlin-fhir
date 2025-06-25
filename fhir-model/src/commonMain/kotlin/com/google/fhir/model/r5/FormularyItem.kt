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

import com.google.fhir.model.r5.serializers.FormularyItemSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource describes a product or service that is available through a program and includes the
 * conditions and constraints of availability. All of the information in this resource is specific
 * to the inclusion of the item in the formulary and is not inherent to the item itself.
 */
@Serializable(with = FormularyItemSerializer::class)
@SerialName("FormularyItem")
public data class FormularyItem(
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
  /** Business identifier for this formulary item. */
  public var identifier: List<Identifier?>? = null,
  /**
   * A code (or set of codes) that specify the product or service that is identified by this
   * formulary item.
   */
  public var code: CodeableConcept? = null,
  /**
   * The validity about the information of the formulary item and not of the underlying product or
   * service itself.
   *
   * This status is intended to identify if the formulary item in a local system is in active use
   * within the formulary. For example, a formulary might include a medicinal product and the status
   * relates to its inclusion. At some point in the future, if the status of the formulary item is
   * changed to "inactive" that means that it is no longer valid in the formulary. But the product
   * itself might still be in active use and might be included in other formularies.
   */
  public var status: Enumeration<FormularyItemStatus>? = null,
) : DomainResource() {
  /** FormularyItem Status Codes */
  public enum class FormularyItemStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The service or product referred to by this FormularyItem is in active use within the drug
     * database or inventory system.
     */
    Active(
      "active",
      "http://hl7.org/fhir/CodeSystem/formularyitem-status",
      "Active",
      "The service or product referred to by this FormularyItem is in active use within the drug database or inventory system.",
    ),
    /**
     * The service or product referred to by this FormularyItem was entered in error within the drug
     * database or inventory system.
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/CodeSystem/formularyitem-status",
      "Entered in Error",
      "The service or product referred to by this FormularyItem was entered in error within the drug database or inventory system.",
    ),
    /**
     * The service or product referred to by this FormularyItem is not in active use within the drug
     * database or inventory system.
     */
    Inactive(
      "inactive",
      "http://hl7.org/fhir/CodeSystem/formularyitem-status",
      "Inactive",
      "The service or product referred to by this FormularyItem is not in active use within the drug database or inventory system.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): FormularyItemStatus =
        when (code) {
          "active" -> Active
          "entered-in-error" -> Entered_In_Error
          "inactive" -> Inactive
          else -> throw IllegalArgumentException("Unknown code $code for enum FormularyItemStatus")
        }
    }
  }
}
