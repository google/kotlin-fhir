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

package com.google.fhir.model.r5

import kotlin.String

/** All Resource Types that represent participant resources */
public enum class SubjectType(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /**
   * The Care Team includes all the people and organizations who plan to participate in the
   * coordination and delivery of care.
   */
  CareTeam(
    "CareTeam",
    "http://hl7.org/fhir/fhir-types",
    "CareTeam",
    "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care.",
  ),
  /**
   * This resource describes the properties (regulated, has real time clock, etc.), adminstrative
   * (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement,
   * blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a
   * given module, for example the serail number, manufacturer name, and model number). An actual
   * unit may consist of several modules in a distinct hierarchy and these are represented by
   * multiple Device resources and bound through the 'parent' element.
   */
  Device(
    "Device",
    "http://hl7.org/fhir/fhir-types",
    "Device",
    "This resource describes the properties (regulated, has real time clock, etc.), adminstrative (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement, blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a given module, for example the serail number, manufacturer name, and model number). An actual unit may consist of several modules in a distinct hierarchy and these are represented by multiple Device resources and bound through the 'parent' element.",
  ),
  /**
   * Represents a defined collection of entities that may be discussed or acted upon collectively
   * but which are not expected to act collectively, and are not formally or legally recognized;
   * i.e. a collection of entities that isn't an Organization.
   */
  Group(
    "Group",
    "http://hl7.org/fhir/fhir-types",
    "Group",
    "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.",
  ),
  /**
   * The details of a healthcare service available at a location or in a catalog. In the case where
   * there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be
   * represented using a set of linked HealthcareServices.
   */
  HealthcareService(
    "HealthcareService",
    "http://hl7.org/fhir/fhir-types",
    "HealthcareService",
    "The details of a healthcare service available at a location or in a catalog.  In the case where there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be represented using a set of linked HealthcareServices.",
  ),
  /**
   * Details and position information for a place where services are provided and resources and
   * participants may be stored, found, contained, or accommodated.
   */
  Location(
    "Location",
    "http://hl7.org/fhir/fhir-types",
    "Location",
    "Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.",
  ),
  /**
   * A formally or informally recognized grouping of people or organizations formed for the purpose
   * of achieving some form of collective action. Includes companies, institutions, corporations,
   * departments, community groups, healthcare practice groups, payer/insurer, etc.
   */
  Organization(
    "Organization",
    "http://hl7.org/fhir/fhir-types",
    "Organization",
    "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.",
  ),
  /**
   * Demographics and other administrative information about an individual or animal receiving care
   * or other health-related services.
   */
  Patient(
    "Patient",
    "http://hl7.org/fhir/fhir-types",
    "Patient",
    "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
  ),
  /**
   * A person who is directly or indirectly involved in the provisioning of healthcare or related
   * services.
   */
  Practitioner(
    "Practitioner",
    "http://hl7.org/fhir/fhir-types",
    "Practitioner",
    "A person who is directly or indirectly involved in the provisioning of healthcare or related services.",
  ),
  /**
   * A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has
   * performed at an organization during a period of time.
   */
  PractitionerRole(
    "PractitionerRole",
    "http://hl7.org/fhir/fhir-types",
    "PractitionerRole",
    "A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has performed at an organization during a period of time.",
  ),
  /**
   * Information about a person that is involved in a patient's health or the care for a patient,
   * but who is not the target of healthcare, nor has a formal responsibility in the care process.
   */
  RelatedPerson(
    "RelatedPerson",
    "http://hl7.org/fhir/fhir-types",
    "RelatedPerson",
    "Information about a person that is involved in a patient's health or the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): SubjectType =
      when (code) {
        "CareTeam" -> CareTeam
        "Device" -> Device
        "Group" -> Group
        "HealthcareService" -> HealthcareService
        "Location" -> Location
        "Organization" -> Organization
        "Patient" -> Patient
        "Practitioner" -> Practitioner
        "PractitionerRole" -> PractitionerRole
        "RelatedPerson" -> RelatedPerson
        else -> throw IllegalArgumentException("Unknown code $code for enum SubjectType")
      }
  }
}
