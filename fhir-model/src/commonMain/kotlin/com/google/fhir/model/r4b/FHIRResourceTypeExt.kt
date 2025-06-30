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

/** One of the resource types defined as part of this version of FHIR. */
public enum class FHIRResourceTypeExt(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Resource("Resource", "http://hl7.org/fhir/resource-types", "Resource", null),
  Binary("Binary", "http://hl7.org/fhir/resource-types", "Binary", null),
  Bundle("Bundle", "http://hl7.org/fhir/resource-types", "Bundle", null),
  DomainResource("DomainResource", "http://hl7.org/fhir/resource-types", "DomainResource", null),
  Account("Account", "http://hl7.org/fhir/resource-types", "Account", null),
  ActivityDefinition(
    "ActivityDefinition",
    "http://hl7.org/fhir/resource-types",
    "ActivityDefinition",
    null,
  ),
  AdministrableProductDefinition(
    "AdministrableProductDefinition",
    "http://hl7.org/fhir/resource-types",
    "AdministrableProductDefinition",
    null,
  ),
  AdverseEvent("AdverseEvent", "http://hl7.org/fhir/resource-types", "AdverseEvent", null),
  AllergyIntolerance(
    "AllergyIntolerance",
    "http://hl7.org/fhir/resource-types",
    "AllergyIntolerance",
    null,
  ),
  Appointment("Appointment", "http://hl7.org/fhir/resource-types", "Appointment", null),
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/resource-types",
    "AppointmentResponse",
    null,
  ),
  AuditEvent("AuditEvent", "http://hl7.org/fhir/resource-types", "AuditEvent", null),
  Basic("Basic", "http://hl7.org/fhir/resource-types", "Basic", null),
  BiologicallyDerivedProduct(
    "BiologicallyDerivedProduct",
    "http://hl7.org/fhir/resource-types",
    "BiologicallyDerivedProduct",
    null,
  ),
  BodyStructure("BodyStructure", "http://hl7.org/fhir/resource-types", "BodyStructure", null),
  CapabilityStatement(
    "CapabilityStatement",
    "http://hl7.org/fhir/resource-types",
    "CapabilityStatement",
    null,
  ),
  CarePlan("CarePlan", "http://hl7.org/fhir/resource-types", "CarePlan", null),
  CareTeam("CareTeam", "http://hl7.org/fhir/resource-types", "CareTeam", null),
  CatalogEntry("CatalogEntry", "http://hl7.org/fhir/resource-types", "CatalogEntry", null),
  ChargeItem("ChargeItem", "http://hl7.org/fhir/resource-types", "ChargeItem", null),
  ChargeItemDefinition(
    "ChargeItemDefinition",
    "http://hl7.org/fhir/resource-types",
    "ChargeItemDefinition",
    null,
  ),
  Citation("Citation", "http://hl7.org/fhir/resource-types", "Citation", null),
  Claim("Claim", "http://hl7.org/fhir/resource-types", "Claim", null),
  ClaimResponse("ClaimResponse", "http://hl7.org/fhir/resource-types", "ClaimResponse", null),
  ClinicalImpression(
    "ClinicalImpression",
    "http://hl7.org/fhir/resource-types",
    "ClinicalImpression",
    null,
  ),
  ClinicalUseDefinition(
    "ClinicalUseDefinition",
    "http://hl7.org/fhir/resource-types",
    "ClinicalUseDefinition",
    null,
  ),
  CodeSystem("CodeSystem", "http://hl7.org/fhir/resource-types", "CodeSystem", null),
  Communication("Communication", "http://hl7.org/fhir/resource-types", "Communication", null),
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/resource-types",
    "CommunicationRequest",
    null,
  ),
  CompartmentDefinition(
    "CompartmentDefinition",
    "http://hl7.org/fhir/resource-types",
    "CompartmentDefinition",
    null,
  ),
  Composition("Composition", "http://hl7.org/fhir/resource-types", "Composition", null),
  ConceptMap("ConceptMap", "http://hl7.org/fhir/resource-types", "ConceptMap", null),
  Condition("Condition", "http://hl7.org/fhir/resource-types", "Condition", null),
  Consent("Consent", "http://hl7.org/fhir/resource-types", "Consent", null),
  Contract("Contract", "http://hl7.org/fhir/resource-types", "Contract", null),
  Coverage("Coverage", "http://hl7.org/fhir/resource-types", "Coverage", null),
  CoverageEligibilityRequest(
    "CoverageEligibilityRequest",
    "http://hl7.org/fhir/resource-types",
    "CoverageEligibilityRequest",
    null,
  ),
  CoverageEligibilityResponse(
    "CoverageEligibilityResponse",
    "http://hl7.org/fhir/resource-types",
    "CoverageEligibilityResponse",
    null,
  ),
  DetectedIssue("DetectedIssue", "http://hl7.org/fhir/resource-types", "DetectedIssue", null),
  Device("Device", "http://hl7.org/fhir/resource-types", "Device", null),
  DeviceDefinition(
    "DeviceDefinition",
    "http://hl7.org/fhir/resource-types",
    "DeviceDefinition",
    null,
  ),
  DeviceMetric("DeviceMetric", "http://hl7.org/fhir/resource-types", "DeviceMetric", null),
  DeviceRequest("DeviceRequest", "http://hl7.org/fhir/resource-types", "DeviceRequest", null),
  DeviceUseStatement(
    "DeviceUseStatement",
    "http://hl7.org/fhir/resource-types",
    "DeviceUseStatement",
    null,
  ),
  DiagnosticReport(
    "DiagnosticReport",
    "http://hl7.org/fhir/resource-types",
    "DiagnosticReport",
    null,
  ),
  DocumentManifest(
    "DocumentManifest",
    "http://hl7.org/fhir/resource-types",
    "DocumentManifest",
    null,
  ),
  DocumentReference(
    "DocumentReference",
    "http://hl7.org/fhir/resource-types",
    "DocumentReference",
    null,
  ),
  Encounter("Encounter", "http://hl7.org/fhir/resource-types", "Encounter", null),
  Endpoint("Endpoint", "http://hl7.org/fhir/resource-types", "Endpoint", null),
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/resource-types",
    "EnrollmentRequest",
    null,
  ),
  EnrollmentResponse(
    "EnrollmentResponse",
    "http://hl7.org/fhir/resource-types",
    "EnrollmentResponse",
    null,
  ),
  EpisodeOfCare("EpisodeOfCare", "http://hl7.org/fhir/resource-types", "EpisodeOfCare", null),
  EventDefinition("EventDefinition", "http://hl7.org/fhir/resource-types", "EventDefinition", null),
  Evidence("Evidence", "http://hl7.org/fhir/resource-types", "Evidence", null),
  EvidenceReport("EvidenceReport", "http://hl7.org/fhir/resource-types", "EvidenceReport", null),
  EvidenceVariable(
    "EvidenceVariable",
    "http://hl7.org/fhir/resource-types",
    "EvidenceVariable",
    null,
  ),
  ExampleScenario("ExampleScenario", "http://hl7.org/fhir/resource-types", "ExampleScenario", null),
  ExplanationOfBenefit(
    "ExplanationOfBenefit",
    "http://hl7.org/fhir/resource-types",
    "ExplanationOfBenefit",
    null,
  ),
  FamilyMemberHistory(
    "FamilyMemberHistory",
    "http://hl7.org/fhir/resource-types",
    "FamilyMemberHistory",
    null,
  ),
  Flag("Flag", "http://hl7.org/fhir/resource-types", "Flag", null),
  Goal("Goal", "http://hl7.org/fhir/resource-types", "Goal", null),
  GraphDefinition("GraphDefinition", "http://hl7.org/fhir/resource-types", "GraphDefinition", null),
  Group("Group", "http://hl7.org/fhir/resource-types", "Group", null),
  GuidanceResponse(
    "GuidanceResponse",
    "http://hl7.org/fhir/resource-types",
    "GuidanceResponse",
    null,
  ),
  HealthcareService(
    "HealthcareService",
    "http://hl7.org/fhir/resource-types",
    "HealthcareService",
    null,
  ),
  ImagingStudy("ImagingStudy", "http://hl7.org/fhir/resource-types", "ImagingStudy", null),
  Immunization("Immunization", "http://hl7.org/fhir/resource-types", "Immunization", null),
  ImmunizationEvaluation(
    "ImmunizationEvaluation",
    "http://hl7.org/fhir/resource-types",
    "ImmunizationEvaluation",
    null,
  ),
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/resource-types",
    "ImmunizationRecommendation",
    null,
  ),
  ImplementationGuide(
    "ImplementationGuide",
    "http://hl7.org/fhir/resource-types",
    "ImplementationGuide",
    null,
  ),
  Ingredient("Ingredient", "http://hl7.org/fhir/resource-types", "Ingredient", null),
  InsurancePlan("InsurancePlan", "http://hl7.org/fhir/resource-types", "InsurancePlan", null),
  Invoice("Invoice", "http://hl7.org/fhir/resource-types", "Invoice", null),
  Library("Library", "http://hl7.org/fhir/resource-types", "Library", null),
  Linkage("Linkage", "http://hl7.org/fhir/resource-types", "Linkage", null),
  List("List", "http://hl7.org/fhir/resource-types", "List", null),
  Location("Location", "http://hl7.org/fhir/resource-types", "Location", null),
  ManufacturedItemDefinition(
    "ManufacturedItemDefinition",
    "http://hl7.org/fhir/resource-types",
    "ManufacturedItemDefinition",
    null,
  ),
  Measure("Measure", "http://hl7.org/fhir/resource-types", "Measure", null),
  MeasureReport("MeasureReport", "http://hl7.org/fhir/resource-types", "MeasureReport", null),
  Media("Media", "http://hl7.org/fhir/resource-types", "Media", null),
  Medication("Medication", "http://hl7.org/fhir/resource-types", "Medication", null),
  MedicationAdministration(
    "MedicationAdministration",
    "http://hl7.org/fhir/resource-types",
    "MedicationAdministration",
    null,
  ),
  MedicationDispense(
    "MedicationDispense",
    "http://hl7.org/fhir/resource-types",
    "MedicationDispense",
    null,
  ),
  MedicationKnowledge(
    "MedicationKnowledge",
    "http://hl7.org/fhir/resource-types",
    "MedicationKnowledge",
    null,
  ),
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/resource-types",
    "MedicationRequest",
    null,
  ),
  MedicationStatement(
    "MedicationStatement",
    "http://hl7.org/fhir/resource-types",
    "MedicationStatement",
    null,
  ),
  MedicinalProductDefinition(
    "MedicinalProductDefinition",
    "http://hl7.org/fhir/resource-types",
    "MedicinalProductDefinition",
    null,
  ),
  MessageDefinition(
    "MessageDefinition",
    "http://hl7.org/fhir/resource-types",
    "MessageDefinition",
    null,
  ),
  MessageHeader("MessageHeader", "http://hl7.org/fhir/resource-types", "MessageHeader", null),
  MolecularSequence(
    "MolecularSequence",
    "http://hl7.org/fhir/resource-types",
    "MolecularSequence",
    null,
  ),
  NamingSystem("NamingSystem", "http://hl7.org/fhir/resource-types", "NamingSystem", null),
  NutritionOrder("NutritionOrder", "http://hl7.org/fhir/resource-types", "NutritionOrder", null),
  NutritionProduct(
    "NutritionProduct",
    "http://hl7.org/fhir/resource-types",
    "NutritionProduct",
    null,
  ),
  Observation("Observation", "http://hl7.org/fhir/resource-types", "Observation", null),
  ObservationDefinition(
    "ObservationDefinition",
    "http://hl7.org/fhir/resource-types",
    "ObservationDefinition",
    null,
  ),
  OperationDefinition(
    "OperationDefinition",
    "http://hl7.org/fhir/resource-types",
    "OperationDefinition",
    null,
  ),
  OperationOutcome(
    "OperationOutcome",
    "http://hl7.org/fhir/resource-types",
    "OperationOutcome",
    null,
  ),
  Organization("Organization", "http://hl7.org/fhir/resource-types", "Organization", null),
  OrganizationAffiliation(
    "OrganizationAffiliation",
    "http://hl7.org/fhir/resource-types",
    "OrganizationAffiliation",
    null,
  ),
  PackagedProductDefinition(
    "PackagedProductDefinition",
    "http://hl7.org/fhir/resource-types",
    "PackagedProductDefinition",
    null,
  ),
  Patient("Patient", "http://hl7.org/fhir/resource-types", "Patient", null),
  PaymentNotice("PaymentNotice", "http://hl7.org/fhir/resource-types", "PaymentNotice", null),
  PaymentReconciliation(
    "PaymentReconciliation",
    "http://hl7.org/fhir/resource-types",
    "PaymentReconciliation",
    null,
  ),
  Person("Person", "http://hl7.org/fhir/resource-types", "Person", null),
  PlanDefinition("PlanDefinition", "http://hl7.org/fhir/resource-types", "PlanDefinition", null),
  Practitioner("Practitioner", "http://hl7.org/fhir/resource-types", "Practitioner", null),
  PractitionerRole(
    "PractitionerRole",
    "http://hl7.org/fhir/resource-types",
    "PractitionerRole",
    null,
  ),
  Procedure("Procedure", "http://hl7.org/fhir/resource-types", "Procedure", null),
  Provenance("Provenance", "http://hl7.org/fhir/resource-types", "Provenance", null),
  Questionnaire("Questionnaire", "http://hl7.org/fhir/resource-types", "Questionnaire", null),
  QuestionnaireResponse(
    "QuestionnaireResponse",
    "http://hl7.org/fhir/resource-types",
    "QuestionnaireResponse",
    null,
  ),
  RegulatedAuthorization(
    "RegulatedAuthorization",
    "http://hl7.org/fhir/resource-types",
    "RegulatedAuthorization",
    null,
  ),
  RelatedPerson("RelatedPerson", "http://hl7.org/fhir/resource-types", "RelatedPerson", null),
  RequestGroup("RequestGroup", "http://hl7.org/fhir/resource-types", "RequestGroup", null),
  ResearchDefinition(
    "ResearchDefinition",
    "http://hl7.org/fhir/resource-types",
    "ResearchDefinition",
    null,
  ),
  ResearchElementDefinition(
    "ResearchElementDefinition",
    "http://hl7.org/fhir/resource-types",
    "ResearchElementDefinition",
    null,
  ),
  ResearchStudy("ResearchStudy", "http://hl7.org/fhir/resource-types", "ResearchStudy", null),
  ResearchSubject("ResearchSubject", "http://hl7.org/fhir/resource-types", "ResearchSubject", null),
  RiskAssessment("RiskAssessment", "http://hl7.org/fhir/resource-types", "RiskAssessment", null),
  Schedule("Schedule", "http://hl7.org/fhir/resource-types", "Schedule", null),
  SearchParameter("SearchParameter", "http://hl7.org/fhir/resource-types", "SearchParameter", null),
  ServiceRequest("ServiceRequest", "http://hl7.org/fhir/resource-types", "ServiceRequest", null),
  Slot("Slot", "http://hl7.org/fhir/resource-types", "Slot", null),
  Specimen("Specimen", "http://hl7.org/fhir/resource-types", "Specimen", null),
  SpecimenDefinition(
    "SpecimenDefinition",
    "http://hl7.org/fhir/resource-types",
    "SpecimenDefinition",
    null,
  ),
  StructureDefinition(
    "StructureDefinition",
    "http://hl7.org/fhir/resource-types",
    "StructureDefinition",
    null,
  ),
  StructureMap("StructureMap", "http://hl7.org/fhir/resource-types", "StructureMap", null),
  Subscription("Subscription", "http://hl7.org/fhir/resource-types", "Subscription", null),
  SubscriptionStatus(
    "SubscriptionStatus",
    "http://hl7.org/fhir/resource-types",
    "SubscriptionStatus",
    null,
  ),
  SubscriptionTopic(
    "SubscriptionTopic",
    "http://hl7.org/fhir/resource-types",
    "SubscriptionTopic",
    null,
  ),
  Substance("Substance", "http://hl7.org/fhir/resource-types", "Substance", null),
  SubstanceDefinition(
    "SubstanceDefinition",
    "http://hl7.org/fhir/resource-types",
    "SubstanceDefinition",
    null,
  ),
  SupplyDelivery("SupplyDelivery", "http://hl7.org/fhir/resource-types", "SupplyDelivery", null),
  SupplyRequest("SupplyRequest", "http://hl7.org/fhir/resource-types", "SupplyRequest", null),
  Task("Task", "http://hl7.org/fhir/resource-types", "Task", null),
  TerminologyCapabilities(
    "TerminologyCapabilities",
    "http://hl7.org/fhir/resource-types",
    "TerminologyCapabilities",
    null,
  ),
  TestReport("TestReport", "http://hl7.org/fhir/resource-types", "TestReport", null),
  TestScript("TestScript", "http://hl7.org/fhir/resource-types", "TestScript", null),
  ValueSet("ValueSet", "http://hl7.org/fhir/resource-types", "ValueSet", null),
  VerificationResult(
    "VerificationResult",
    "http://hl7.org/fhir/resource-types",
    "VerificationResult",
    null,
  ),
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/resource-types",
    "VisionPrescription",
    null,
  ),
  Parameters("Parameters", "http://hl7.org/fhir/resource-types", "Parameters", null);

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): FHIRResourceTypeExt =
      when (code) {
        "Resource" -> Resource
        "Binary" -> Binary
        "Bundle" -> Bundle
        "DomainResource" -> DomainResource
        "Account" -> Account
        "ActivityDefinition" -> ActivityDefinition
        "AdministrableProductDefinition" -> AdministrableProductDefinition
        "AdverseEvent" -> AdverseEvent
        "AllergyIntolerance" -> AllergyIntolerance
        "Appointment" -> Appointment
        "AppointmentResponse" -> AppointmentResponse
        "AuditEvent" -> AuditEvent
        "Basic" -> Basic
        "BiologicallyDerivedProduct" -> BiologicallyDerivedProduct
        "BodyStructure" -> BodyStructure
        "CapabilityStatement" -> CapabilityStatement
        "CarePlan" -> CarePlan
        "CareTeam" -> CareTeam
        "CatalogEntry" -> CatalogEntry
        "ChargeItem" -> ChargeItem
        "ChargeItemDefinition" -> ChargeItemDefinition
        "Citation" -> Citation
        "Claim" -> Claim
        "ClaimResponse" -> ClaimResponse
        "ClinicalImpression" -> ClinicalImpression
        "ClinicalUseDefinition" -> ClinicalUseDefinition
        "CodeSystem" -> CodeSystem
        "Communication" -> Communication
        "CommunicationRequest" -> CommunicationRequest
        "CompartmentDefinition" -> CompartmentDefinition
        "Composition" -> Composition
        "ConceptMap" -> ConceptMap
        "Condition" -> Condition
        "Consent" -> Consent
        "Contract" -> Contract
        "Coverage" -> Coverage
        "CoverageEligibilityRequest" -> CoverageEligibilityRequest
        "CoverageEligibilityResponse" -> CoverageEligibilityResponse
        "DetectedIssue" -> DetectedIssue
        "Device" -> Device
        "DeviceDefinition" -> DeviceDefinition
        "DeviceMetric" -> DeviceMetric
        "DeviceRequest" -> DeviceRequest
        "DeviceUseStatement" -> DeviceUseStatement
        "DiagnosticReport" -> DiagnosticReport
        "DocumentManifest" -> DocumentManifest
        "DocumentReference" -> DocumentReference
        "Encounter" -> Encounter
        "Endpoint" -> Endpoint
        "EnrollmentRequest" -> EnrollmentRequest
        "EnrollmentResponse" -> EnrollmentResponse
        "EpisodeOfCare" -> EpisodeOfCare
        "EventDefinition" -> EventDefinition
        "Evidence" -> Evidence
        "EvidenceReport" -> EvidenceReport
        "EvidenceVariable" -> EvidenceVariable
        "ExampleScenario" -> ExampleScenario
        "ExplanationOfBenefit" -> ExplanationOfBenefit
        "FamilyMemberHistory" -> FamilyMemberHistory
        "Flag" -> Flag
        "Goal" -> Goal
        "GraphDefinition" -> GraphDefinition
        "Group" -> Group
        "GuidanceResponse" -> GuidanceResponse
        "HealthcareService" -> HealthcareService
        "ImagingStudy" -> ImagingStudy
        "Immunization" -> Immunization
        "ImmunizationEvaluation" -> ImmunizationEvaluation
        "ImmunizationRecommendation" -> ImmunizationRecommendation
        "ImplementationGuide" -> ImplementationGuide
        "Ingredient" -> Ingredient
        "InsurancePlan" -> InsurancePlan
        "Invoice" -> Invoice
        "Library" -> Library
        "Linkage" -> Linkage
        "List" -> List
        "Location" -> Location
        "ManufacturedItemDefinition" -> ManufacturedItemDefinition
        "Measure" -> Measure
        "MeasureReport" -> MeasureReport
        "Media" -> Media
        "Medication" -> Medication
        "MedicationAdministration" -> MedicationAdministration
        "MedicationDispense" -> MedicationDispense
        "MedicationKnowledge" -> MedicationKnowledge
        "MedicationRequest" -> MedicationRequest
        "MedicationStatement" -> MedicationStatement
        "MedicinalProductDefinition" -> MedicinalProductDefinition
        "MessageDefinition" -> MessageDefinition
        "MessageHeader" -> MessageHeader
        "MolecularSequence" -> MolecularSequence
        "NamingSystem" -> NamingSystem
        "NutritionOrder" -> NutritionOrder
        "NutritionProduct" -> NutritionProduct
        "Observation" -> Observation
        "ObservationDefinition" -> ObservationDefinition
        "OperationDefinition" -> OperationDefinition
        "OperationOutcome" -> OperationOutcome
        "Organization" -> Organization
        "OrganizationAffiliation" -> OrganizationAffiliation
        "PackagedProductDefinition" -> PackagedProductDefinition
        "Patient" -> Patient
        "PaymentNotice" -> PaymentNotice
        "PaymentReconciliation" -> PaymentReconciliation
        "Person" -> Person
        "PlanDefinition" -> PlanDefinition
        "Practitioner" -> Practitioner
        "PractitionerRole" -> PractitionerRole
        "Procedure" -> Procedure
        "Provenance" -> Provenance
        "Questionnaire" -> Questionnaire
        "QuestionnaireResponse" -> QuestionnaireResponse
        "RegulatedAuthorization" -> RegulatedAuthorization
        "RelatedPerson" -> RelatedPerson
        "RequestGroup" -> RequestGroup
        "ResearchDefinition" -> ResearchDefinition
        "ResearchElementDefinition" -> ResearchElementDefinition
        "ResearchStudy" -> ResearchStudy
        "ResearchSubject" -> ResearchSubject
        "RiskAssessment" -> RiskAssessment
        "Schedule" -> Schedule
        "SearchParameter" -> SearchParameter
        "ServiceRequest" -> ServiceRequest
        "Slot" -> Slot
        "Specimen" -> Specimen
        "SpecimenDefinition" -> SpecimenDefinition
        "StructureDefinition" -> StructureDefinition
        "StructureMap" -> StructureMap
        "Subscription" -> Subscription
        "SubscriptionStatus" -> SubscriptionStatus
        "SubscriptionTopic" -> SubscriptionTopic
        "Substance" -> Substance
        "SubstanceDefinition" -> SubstanceDefinition
        "SupplyDelivery" -> SupplyDelivery
        "SupplyRequest" -> SupplyRequest
        "Task" -> Task
        "TerminologyCapabilities" -> TerminologyCapabilities
        "TestReport" -> TestReport
        "TestScript" -> TestScript
        "ValueSet" -> ValueSet
        "VerificationResult" -> VerificationResult
        "VisionPrescription" -> VisionPrescription
        "Parameters" -> Parameters
        else -> throw IllegalArgumentException("Unknown code $code for enum FHIRResourceTypeExt")
      }
  }
}
