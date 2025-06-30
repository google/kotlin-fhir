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

package com.google.fhir.model.r4b

import kotlin.String

/** A list of all the request resource types defined in this version of the FHIR specification. */
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
    "http://hl7.org/fhir/request-resource-types",
    "Appointment",
    "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).",
  ),
  /**
   * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation
   * or rejection.
   */
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/request-resource-types",
    "AppointmentResponse",
    "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.",
  ),
  /** Healthcare plan for patient or group. */
  CarePlan(
    "CarePlan",
    "http://hl7.org/fhir/request-resource-types",
    "CarePlan",
    "Healthcare plan for patient or group.",
  ),
  /** Claim, Pre-determination or Pre-authorization. */
  Claim(
    "Claim",
    "http://hl7.org/fhir/request-resource-types",
    "Claim",
    "Claim, Pre-determination or Pre-authorization.",
  ),
  /** A request for information to be sent to a receiver. */
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/request-resource-types",
    "CommunicationRequest",
    "A request for information to be sent to a receiver.",
  ),
  /** Legal Agreement. */
  Contract(
    "Contract",
    "http://hl7.org/fhir/request-resource-types",
    "Contract",
    "Legal Agreement.",
  ),
  /** Medical device request. */
  DeviceRequest(
    "DeviceRequest",
    "http://hl7.org/fhir/request-resource-types",
    "DeviceRequest",
    "Medical device request.",
  ),
  /** Enrollment request. */
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/request-resource-types",
    "EnrollmentRequest",
    "Enrollment request.",
  ),
  /** Guidance or advice relating to an immunization. */
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/request-resource-types",
    "ImmunizationRecommendation",
    "Guidance or advice relating to an immunization.",
  ),
  /** Ordering of medication for patient or group. */
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/request-resource-types",
    "MedicationRequest",
    "Ordering of medication for patient or group.",
  ),
  /** Diet, formula or nutritional supplement request. */
  NutritionOrder(
    "NutritionOrder",
    "http://hl7.org/fhir/request-resource-types",
    "NutritionOrder",
    "Diet, formula or nutritional supplement request.",
  ),
  /**
   * A record of a request for service such as diagnostic investigations, treatments, or operations
   * to be performed.
   */
  ServiceRequest(
    "ServiceRequest",
    "http://hl7.org/fhir/request-resource-types",
    "ServiceRequest",
    "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.",
  ),
  /** Request for a medication, substance or device. */
  SupplyRequest(
    "SupplyRequest",
    "http://hl7.org/fhir/request-resource-types",
    "SupplyRequest",
    "Request for a medication, substance or device.",
  ),
  /** A task to be performed. */
  Task("Task", "http://hl7.org/fhir/request-resource-types", "Task", "A task to be performed."),
  /** Prescription for vision correction products for a patient. */
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/request-resource-types",
    "VisionPrescription",
    "Prescription for vision correction products for a patient.",
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
        "Contract" -> Contract
        "DeviceRequest" -> DeviceRequest
        "EnrollmentRequest" -> EnrollmentRequest
        "ImmunizationRecommendation" -> ImmunizationRecommendation
        "MedicationRequest" -> MedicationRequest
        "NutritionOrder" -> NutritionOrder
        "ServiceRequest" -> ServiceRequest
        "SupplyRequest" -> SupplyRequest
        "Task" -> Task
        "VisionPrescription" -> VisionPrescription
        else -> throw IllegalArgumentException("Unknown code $code for enum ActivityDefinitionKind")
      }
  }
}
