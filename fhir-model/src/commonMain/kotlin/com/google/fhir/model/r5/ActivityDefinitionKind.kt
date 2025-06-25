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

/** All Resource Types that represent request resources */
public enum class ActivityDefinitionKind(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /**
   * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
   * device(s) for a specific date/time. This may result in one or more Encounter(s).
   */
  Appointment(
    "Appointment",
    "http://hl7.org/fhir/fhir-types",
    "Appointment",
    "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).",
  ),
  /**
   * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation
   * or rejection.
   */
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/fhir-types",
    "AppointmentResponse",
    "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.",
  ),
  /**
   * Describes the intention of how one or more practitioners intend to deliver care for a
   * particular patient, group or community for a period of time, possibly limited to care for a
   * specific condition or set of conditions.
   */
  CarePlan(
    "CarePlan",
    "http://hl7.org/fhir/fhir-types",
    "CarePlan",
    "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.",
  ),
  /**
   * A provider issued list of professional services and products which have been provided, or are
   * to be provided, to a patient which is sent to an insurer for reimbursement.
   */
  Claim(
    "Claim",
    "http://hl7.org/fhir/fhir-types",
    "Claim",
    "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.",
  ),
  /**
   * A request to convey information; e.g. the CDS system proposes that an alert be sent to a
   * responsible provider, the CDS system proposes that the public health agency be notified about a
   * reportable condition.
   */
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "CommunicationRequest",
    "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.",
  ),
  /**
   * The CoverageEligibilityRequest provides patient and insurance coverage information to an
   * insurer for them to respond, in the form of an CoverageEligibilityResponse, with information
   * regarding whether the stated coverage is valid and in-force and optionally to provide the
   * insurance details of the policy.
   */
  CoverageEligibilityRequest(
    "CoverageEligibilityRequest",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityRequest",
    "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.",
  ),
  /**
   * Represents a request a device to be provided to a specific patient. The device may be an
   * implantable device to be subsequently implanted, or an external assistive device, such as a
   * walker, to be delivered and subsequently be used.
   */
  DeviceRequest(
    "DeviceRequest",
    "http://hl7.org/fhir/fhir-types",
    "DeviceRequest",
    "Represents a request a device to be provided to a specific patient. The device may be an implantable device to be subsequently implanted, or an external assistive device, such as a walker, to be delivered and subsequently be used.",
  ),
  /**
   * This resource provides the insurance enrollment details to the insurer regarding a specified
   * coverage.
   */
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/fhir-types",
    "EnrollmentRequest",
    "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.",
  ),
  /**
   * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
   * schedule with optional supporting justification.
   */
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationRecommendation",
    "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.",
  ),
  /**
   * An order or request for both supply of the medication and the instructions for administration
   * of the medication to a patient. The resource is called "MedicationRequest" rather than
   * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and
   * outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
   */
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "MedicationRequest",
    "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.",
  ),
  /**
   * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
   * patient/resident.
   */
  NutritionOrder(
    "NutritionOrder",
    "http://hl7.org/fhir/fhir-types",
    "NutritionOrder",
    "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.",
  ),
  /**
   * A set of related requests that can be used to capture intended activities that have
   * inter-dependencies such as "give this medication after that one".
   */
  RequestOrchestration(
    "RequestOrchestration",
    "http://hl7.org/fhir/fhir-types",
    "RequestOrchestration",
    "A set of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".",
  ),
  /**
   * A record of a request for service such as diagnostic investigations, treatments, or operations
   * to be performed.
   */
  ServiceRequest(
    "ServiceRequest",
    "http://hl7.org/fhir/fhir-types",
    "ServiceRequest",
    "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.",
  ),
  /**
   * A record of a non-patient specific request for a medication, substance, device, certain types
   * of biologically derived product, and nutrition product used in the healthcare setting.
   */
  SupplyRequest(
    "SupplyRequest",
    "http://hl7.org/fhir/fhir-types",
    "SupplyRequest",
    "A record of a non-patient specific request for a medication, substance, device, certain types of biologically derived product, and nutrition product used in the healthcare setting.",
  ),
  /** A task to be performed. */
  Task("Task", "http://hl7.org/fhir/fhir-types", "Task", "A task to be performed."),
  /** Record of transport. */
  Transport("Transport", "http://hl7.org/fhir/fhir-types", "Transport", "Record of transport."),
  /** An authorization for the provision of glasses and/or contact lenses to a patient. */
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/fhir-types",
    "VisionPrescription",
    "An authorization for the provision of glasses and/or contact lenses to a patient.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): ActivityDefinitionKind =
      when (code) {
        "Appointment" -> Appointment
        "AppointmentResponse" -> AppointmentResponse
        "CarePlan" -> CarePlan
        "Claim" -> Claim
        "CommunicationRequest" -> CommunicationRequest
        "CoverageEligibilityRequest" -> CoverageEligibilityRequest
        "DeviceRequest" -> DeviceRequest
        "EnrollmentRequest" -> EnrollmentRequest
        "ImmunizationRecommendation" -> ImmunizationRecommendation
        "MedicationRequest" -> MedicationRequest
        "NutritionOrder" -> NutritionOrder
        "RequestOrchestration" -> RequestOrchestration
        "ServiceRequest" -> ServiceRequest
        "SupplyRequest" -> SupplyRequest
        "Task" -> Task
        "Transport" -> Transport
        "VisionPrescription" -> VisionPrescription
        else -> throw IllegalArgumentException("Unknown code $code for enum ActivityDefinitionKind")
      }
  }
}
