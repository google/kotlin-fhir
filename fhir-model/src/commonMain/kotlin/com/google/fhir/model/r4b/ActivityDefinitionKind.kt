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
  Appointment("Appointment", "http://hl7.org/fhir/request-resource-types", "Appointment", null),
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/request-resource-types",
    "AppointmentResponse",
    null,
  ),
  CarePlan("CarePlan", "http://hl7.org/fhir/request-resource-types", "CarePlan", null),
  Claim("Claim", "http://hl7.org/fhir/request-resource-types", "Claim", null),
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/request-resource-types",
    "CommunicationRequest",
    null,
  ),
  Contract("Contract", "http://hl7.org/fhir/request-resource-types", "Contract", null),
  DeviceRequest(
    "DeviceRequest",
    "http://hl7.org/fhir/request-resource-types",
    "DeviceRequest",
    null,
  ),
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/request-resource-types",
    "EnrollmentRequest",
    null,
  ),
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/request-resource-types",
    "ImmunizationRecommendation",
    null,
  ),
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/request-resource-types",
    "MedicationRequest",
    null,
  ),
  NutritionOrder(
    "NutritionOrder",
    "http://hl7.org/fhir/request-resource-types",
    "NutritionOrder",
    null,
  ),
  ServiceRequest(
    "ServiceRequest",
    "http://hl7.org/fhir/request-resource-types",
    "ServiceRequest",
    null,
  ),
  SupplyRequest(
    "SupplyRequest",
    "http://hl7.org/fhir/request-resource-types",
    "SupplyRequest",
    null,
  ),
  Task("Task", "http://hl7.org/fhir/request-resource-types", "Task", null),
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/request-resource-types",
    "VisionPrescription",
    null,
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
