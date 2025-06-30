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

/** Concrete FHIR Resource Types */
public enum class FHIRResourceTypeExt(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Account("Account", "http://hl7.org/fhir/fhir-types", "Account", null),
  ActivityDefinition(
    "ActivityDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ActivityDefinition",
    null,
  ),
  ActorDefinition("ActorDefinition", "http://hl7.org/fhir/fhir-types", "ActorDefinition", null),
  AdministrableProductDefinition(
    "AdministrableProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "AdministrableProductDefinition",
    null,
  ),
  AdverseEvent("AdverseEvent", "http://hl7.org/fhir/fhir-types", "AdverseEvent", null),
  AllergyIntolerance(
    "AllergyIntolerance",
    "http://hl7.org/fhir/fhir-types",
    "AllergyIntolerance",
    null,
  ),
  Appointment("Appointment", "http://hl7.org/fhir/fhir-types", "Appointment", null),
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/fhir-types",
    "AppointmentResponse",
    null,
  ),
  ArtifactAssessment(
    "ArtifactAssessment",
    "http://hl7.org/fhir/fhir-types",
    "ArtifactAssessment",
    null,
  ),
  AuditEvent("AuditEvent", "http://hl7.org/fhir/fhir-types", "AuditEvent", null),
  Basic("Basic", "http://hl7.org/fhir/fhir-types", "Basic", null),
  Binary("Binary", "http://hl7.org/fhir/fhir-types", "Binary", null),
  BiologicallyDerivedProduct(
    "BiologicallyDerivedProduct",
    "http://hl7.org/fhir/fhir-types",
    "BiologicallyDerivedProduct",
    null,
  ),
  BiologicallyDerivedProductDispense(
    "BiologicallyDerivedProductDispense",
    "http://hl7.org/fhir/fhir-types",
    "BiologicallyDerivedProductDispense",
    null,
  ),
  BodyStructure("BodyStructure", "http://hl7.org/fhir/fhir-types", "BodyStructure", null),
  Bundle("Bundle", "http://hl7.org/fhir/fhir-types", "Bundle", null),
  CapabilityStatement(
    "CapabilityStatement",
    "http://hl7.org/fhir/fhir-types",
    "CapabilityStatement",
    null,
  ),
  CarePlan("CarePlan", "http://hl7.org/fhir/fhir-types", "CarePlan", null),
  CareTeam("CareTeam", "http://hl7.org/fhir/fhir-types", "CareTeam", null),
  ChargeItem("ChargeItem", "http://hl7.org/fhir/fhir-types", "ChargeItem", null),
  ChargeItemDefinition(
    "ChargeItemDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ChargeItemDefinition",
    null,
  ),
  Citation("Citation", "http://hl7.org/fhir/fhir-types", "Citation", null),
  Claim("Claim", "http://hl7.org/fhir/fhir-types", "Claim", null),
  ClaimResponse("ClaimResponse", "http://hl7.org/fhir/fhir-types", "ClaimResponse", null),
  ClinicalImpression(
    "ClinicalImpression",
    "http://hl7.org/fhir/fhir-types",
    "ClinicalImpression",
    null,
  ),
  ClinicalUseDefinition(
    "ClinicalUseDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ClinicalUseDefinition",
    null,
  ),
  CodeSystem("CodeSystem", "http://hl7.org/fhir/fhir-types", "CodeSystem", null),
  Communication("Communication", "http://hl7.org/fhir/fhir-types", "Communication", null),
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "CommunicationRequest",
    null,
  ),
  CompartmentDefinition(
    "CompartmentDefinition",
    "http://hl7.org/fhir/fhir-types",
    "CompartmentDefinition",
    null,
  ),
  Composition("Composition", "http://hl7.org/fhir/fhir-types", "Composition", null),
  ConceptMap("ConceptMap", "http://hl7.org/fhir/fhir-types", "ConceptMap", null),
  Condition("Condition", "http://hl7.org/fhir/fhir-types", "Condition", null),
  ConditionDefinition(
    "ConditionDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ConditionDefinition",
    null,
  ),
  Consent("Consent", "http://hl7.org/fhir/fhir-types", "Consent", null),
  Contract("Contract", "http://hl7.org/fhir/fhir-types", "Contract", null),
  Coverage("Coverage", "http://hl7.org/fhir/fhir-types", "Coverage", null),
  CoverageEligibilityRequest(
    "CoverageEligibilityRequest",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityRequest",
    null,
  ),
  CoverageEligibilityResponse(
    "CoverageEligibilityResponse",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityResponse",
    null,
  ),
  DetectedIssue("DetectedIssue", "http://hl7.org/fhir/fhir-types", "DetectedIssue", null),
  Device("Device", "http://hl7.org/fhir/fhir-types", "Device", null),
  DeviceAssociation(
    "DeviceAssociation",
    "http://hl7.org/fhir/fhir-types",
    "DeviceAssociation",
    null,
  ),
  DeviceDefinition("DeviceDefinition", "http://hl7.org/fhir/fhir-types", "DeviceDefinition", null),
  DeviceDispense("DeviceDispense", "http://hl7.org/fhir/fhir-types", "DeviceDispense", null),
  DeviceMetric("DeviceMetric", "http://hl7.org/fhir/fhir-types", "DeviceMetric", null),
  DeviceRequest("DeviceRequest", "http://hl7.org/fhir/fhir-types", "DeviceRequest", null),
  DeviceUsage("DeviceUsage", "http://hl7.org/fhir/fhir-types", "DeviceUsage", null),
  DiagnosticReport("DiagnosticReport", "http://hl7.org/fhir/fhir-types", "DiagnosticReport", null),
  DocumentReference(
    "DocumentReference",
    "http://hl7.org/fhir/fhir-types",
    "DocumentReference",
    null,
  ),
  Encounter("Encounter", "http://hl7.org/fhir/fhir-types", "Encounter", null),
  EncounterHistory("EncounterHistory", "http://hl7.org/fhir/fhir-types", "EncounterHistory", null),
  Endpoint("Endpoint", "http://hl7.org/fhir/fhir-types", "Endpoint", null),
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/fhir-types",
    "EnrollmentRequest",
    null,
  ),
  EnrollmentResponse(
    "EnrollmentResponse",
    "http://hl7.org/fhir/fhir-types",
    "EnrollmentResponse",
    null,
  ),
  EpisodeOfCare("EpisodeOfCare", "http://hl7.org/fhir/fhir-types", "EpisodeOfCare", null),
  EventDefinition("EventDefinition", "http://hl7.org/fhir/fhir-types", "EventDefinition", null),
  Evidence("Evidence", "http://hl7.org/fhir/fhir-types", "Evidence", null),
  EvidenceReport("EvidenceReport", "http://hl7.org/fhir/fhir-types", "EvidenceReport", null),
  EvidenceVariable("EvidenceVariable", "http://hl7.org/fhir/fhir-types", "EvidenceVariable", null),
  ExampleScenario("ExampleScenario", "http://hl7.org/fhir/fhir-types", "ExampleScenario", null),
  ExplanationOfBenefit(
    "ExplanationOfBenefit",
    "http://hl7.org/fhir/fhir-types",
    "ExplanationOfBenefit",
    null,
  ),
  FamilyMemberHistory(
    "FamilyMemberHistory",
    "http://hl7.org/fhir/fhir-types",
    "FamilyMemberHistory",
    null,
  ),
  Flag("Flag", "http://hl7.org/fhir/fhir-types", "Flag", null),
  FormularyItem("FormularyItem", "http://hl7.org/fhir/fhir-types", "FormularyItem", null),
  GenomicStudy("GenomicStudy", "http://hl7.org/fhir/fhir-types", "GenomicStudy", null),
  Goal("Goal", "http://hl7.org/fhir/fhir-types", "Goal", null),
  GraphDefinition("GraphDefinition", "http://hl7.org/fhir/fhir-types", "GraphDefinition", null),
  Group("Group", "http://hl7.org/fhir/fhir-types", "Group", null),
  GuidanceResponse("GuidanceResponse", "http://hl7.org/fhir/fhir-types", "GuidanceResponse", null),
  HealthcareService(
    "HealthcareService",
    "http://hl7.org/fhir/fhir-types",
    "HealthcareService",
    null,
  ),
  ImagingSelection("ImagingSelection", "http://hl7.org/fhir/fhir-types", "ImagingSelection", null),
  ImagingStudy("ImagingStudy", "http://hl7.org/fhir/fhir-types", "ImagingStudy", null),
  Immunization("Immunization", "http://hl7.org/fhir/fhir-types", "Immunization", null),
  ImmunizationEvaluation(
    "ImmunizationEvaluation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationEvaluation",
    null,
  ),
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationRecommendation",
    null,
  ),
  ImplementationGuide(
    "ImplementationGuide",
    "http://hl7.org/fhir/fhir-types",
    "ImplementationGuide",
    null,
  ),
  Ingredient("Ingredient", "http://hl7.org/fhir/fhir-types", "Ingredient", null),
  InsurancePlan("InsurancePlan", "http://hl7.org/fhir/fhir-types", "InsurancePlan", null),
  InventoryItem("InventoryItem", "http://hl7.org/fhir/fhir-types", "InventoryItem", null),
  InventoryReport("InventoryReport", "http://hl7.org/fhir/fhir-types", "InventoryReport", null),
  Invoice("Invoice", "http://hl7.org/fhir/fhir-types", "Invoice", null),
  Library("Library", "http://hl7.org/fhir/fhir-types", "Library", null),
  Linkage("Linkage", "http://hl7.org/fhir/fhir-types", "Linkage", null),
  List("List", "http://hl7.org/fhir/fhir-types", "List", null),
  Location("Location", "http://hl7.org/fhir/fhir-types", "Location", null),
  ManufacturedItemDefinition(
    "ManufacturedItemDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ManufacturedItemDefinition",
    null,
  ),
  Measure("Measure", "http://hl7.org/fhir/fhir-types", "Measure", null),
  MeasureReport("MeasureReport", "http://hl7.org/fhir/fhir-types", "MeasureReport", null),
  Medication("Medication", "http://hl7.org/fhir/fhir-types", "Medication", null),
  MedicationAdministration(
    "MedicationAdministration",
    "http://hl7.org/fhir/fhir-types",
    "MedicationAdministration",
    null,
  ),
  MedicationDispense(
    "MedicationDispense",
    "http://hl7.org/fhir/fhir-types",
    "MedicationDispense",
    null,
  ),
  MedicationKnowledge(
    "MedicationKnowledge",
    "http://hl7.org/fhir/fhir-types",
    "MedicationKnowledge",
    null,
  ),
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "MedicationRequest",
    null,
  ),
  MedicationStatement(
    "MedicationStatement",
    "http://hl7.org/fhir/fhir-types",
    "MedicationStatement",
    null,
  ),
  MedicinalProductDefinition(
    "MedicinalProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "MedicinalProductDefinition",
    null,
  ),
  MessageDefinition(
    "MessageDefinition",
    "http://hl7.org/fhir/fhir-types",
    "MessageDefinition",
    null,
  ),
  MessageHeader("MessageHeader", "http://hl7.org/fhir/fhir-types", "MessageHeader", null),
  MolecularSequence(
    "MolecularSequence",
    "http://hl7.org/fhir/fhir-types",
    "MolecularSequence",
    null,
  ),
  NamingSystem("NamingSystem", "http://hl7.org/fhir/fhir-types", "NamingSystem", null),
  NutritionIntake("NutritionIntake", "http://hl7.org/fhir/fhir-types", "NutritionIntake", null),
  NutritionOrder("NutritionOrder", "http://hl7.org/fhir/fhir-types", "NutritionOrder", null),
  NutritionProduct("NutritionProduct", "http://hl7.org/fhir/fhir-types", "NutritionProduct", null),
  Observation("Observation", "http://hl7.org/fhir/fhir-types", "Observation", null),
  ObservationDefinition(
    "ObservationDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ObservationDefinition",
    null,
  ),
  OperationDefinition(
    "OperationDefinition",
    "http://hl7.org/fhir/fhir-types",
    "OperationDefinition",
    null,
  ),
  OperationOutcome("OperationOutcome", "http://hl7.org/fhir/fhir-types", "OperationOutcome", null),
  Organization("Organization", "http://hl7.org/fhir/fhir-types", "Organization", null),
  OrganizationAffiliation(
    "OrganizationAffiliation",
    "http://hl7.org/fhir/fhir-types",
    "OrganizationAffiliation",
    null,
  ),
  PackagedProductDefinition(
    "PackagedProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "PackagedProductDefinition",
    null,
  ),
  Parameters("Parameters", "http://hl7.org/fhir/fhir-types", "Parameters", null),
  Patient("Patient", "http://hl7.org/fhir/fhir-types", "Patient", null),
  PaymentNotice("PaymentNotice", "http://hl7.org/fhir/fhir-types", "PaymentNotice", null),
  PaymentReconciliation(
    "PaymentReconciliation",
    "http://hl7.org/fhir/fhir-types",
    "PaymentReconciliation",
    null,
  ),
  Permission("Permission", "http://hl7.org/fhir/fhir-types", "Permission", null),
  Person("Person", "http://hl7.org/fhir/fhir-types", "Person", null),
  PlanDefinition("PlanDefinition", "http://hl7.org/fhir/fhir-types", "PlanDefinition", null),
  Practitioner("Practitioner", "http://hl7.org/fhir/fhir-types", "Practitioner", null),
  PractitionerRole("PractitionerRole", "http://hl7.org/fhir/fhir-types", "PractitionerRole", null),
  Procedure("Procedure", "http://hl7.org/fhir/fhir-types", "Procedure", null),
  Provenance("Provenance", "http://hl7.org/fhir/fhir-types", "Provenance", null),
  Questionnaire("Questionnaire", "http://hl7.org/fhir/fhir-types", "Questionnaire", null),
  QuestionnaireResponse(
    "QuestionnaireResponse",
    "http://hl7.org/fhir/fhir-types",
    "QuestionnaireResponse",
    null,
  ),
  RegulatedAuthorization(
    "RegulatedAuthorization",
    "http://hl7.org/fhir/fhir-types",
    "RegulatedAuthorization",
    null,
  ),
  RelatedPerson("RelatedPerson", "http://hl7.org/fhir/fhir-types", "RelatedPerson", null),
  RequestOrchestration(
    "RequestOrchestration",
    "http://hl7.org/fhir/fhir-types",
    "RequestOrchestration",
    null,
  ),
  Requirements("Requirements", "http://hl7.org/fhir/fhir-types", "Requirements", null),
  ResearchStudy("ResearchStudy", "http://hl7.org/fhir/fhir-types", "ResearchStudy", null),
  ResearchSubject("ResearchSubject", "http://hl7.org/fhir/fhir-types", "ResearchSubject", null),
  RiskAssessment("RiskAssessment", "http://hl7.org/fhir/fhir-types", "RiskAssessment", null),
  Schedule("Schedule", "http://hl7.org/fhir/fhir-types", "Schedule", null),
  SearchParameter("SearchParameter", "http://hl7.org/fhir/fhir-types", "SearchParameter", null),
  ServiceRequest("ServiceRequest", "http://hl7.org/fhir/fhir-types", "ServiceRequest", null),
  Slot("Slot", "http://hl7.org/fhir/fhir-types", "Slot", null),
  Specimen("Specimen", "http://hl7.org/fhir/fhir-types", "Specimen", null),
  SpecimenDefinition(
    "SpecimenDefinition",
    "http://hl7.org/fhir/fhir-types",
    "SpecimenDefinition",
    null,
  ),
  StructureDefinition(
    "StructureDefinition",
    "http://hl7.org/fhir/fhir-types",
    "StructureDefinition",
    null,
  ),
  StructureMap("StructureMap", "http://hl7.org/fhir/fhir-types", "StructureMap", null),
  Subscription("Subscription", "http://hl7.org/fhir/fhir-types", "Subscription", null),
  SubscriptionStatus(
    "SubscriptionStatus",
    "http://hl7.org/fhir/fhir-types",
    "SubscriptionStatus",
    null,
  ),
  SubscriptionTopic(
    "SubscriptionTopic",
    "http://hl7.org/fhir/fhir-types",
    "SubscriptionTopic",
    null,
  ),
  Substance("Substance", "http://hl7.org/fhir/fhir-types", "Substance", null),
  SubstanceDefinition(
    "SubstanceDefinition",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceDefinition",
    null,
  ),
  SubstanceNucleicAcid(
    "SubstanceNucleicAcid",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceNucleicAcid",
    null,
  ),
  SubstancePolymer("SubstancePolymer", "http://hl7.org/fhir/fhir-types", "SubstancePolymer", null),
  SubstanceProtein("SubstanceProtein", "http://hl7.org/fhir/fhir-types", "SubstanceProtein", null),
  SubstanceReferenceInformation(
    "SubstanceReferenceInformation",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceReferenceInformation",
    null,
  ),
  SubstanceSourceMaterial(
    "SubstanceSourceMaterial",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceSourceMaterial",
    null,
  ),
  SupplyDelivery("SupplyDelivery", "http://hl7.org/fhir/fhir-types", "SupplyDelivery", null),
  SupplyRequest("SupplyRequest", "http://hl7.org/fhir/fhir-types", "SupplyRequest", null),
  Task("Task", "http://hl7.org/fhir/fhir-types", "Task", null),
  TerminologyCapabilities(
    "TerminologyCapabilities",
    "http://hl7.org/fhir/fhir-types",
    "TerminologyCapabilities",
    null,
  ),
  TestPlan("TestPlan", "http://hl7.org/fhir/fhir-types", "TestPlan", null),
  TestReport("TestReport", "http://hl7.org/fhir/fhir-types", "TestReport", null),
  TestScript("TestScript", "http://hl7.org/fhir/fhir-types", "TestScript", null),
  Transport("Transport", "http://hl7.org/fhir/fhir-types", "Transport", null),
  ValueSet("ValueSet", "http://hl7.org/fhir/fhir-types", "ValueSet", null),
  VerificationResult(
    "VerificationResult",
    "http://hl7.org/fhir/fhir-types",
    "VerificationResult",
    null,
  ),
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/fhir-types",
    "VisionPrescription",
    null,
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): FHIRResourceTypeExt =
      when (code) {
        "Account" -> Account
        "ActivityDefinition" -> ActivityDefinition
        "ActorDefinition" -> ActorDefinition
        "AdministrableProductDefinition" -> AdministrableProductDefinition
        "AdverseEvent" -> AdverseEvent
        "AllergyIntolerance" -> AllergyIntolerance
        "Appointment" -> Appointment
        "AppointmentResponse" -> AppointmentResponse
        "ArtifactAssessment" -> ArtifactAssessment
        "AuditEvent" -> AuditEvent
        "Basic" -> Basic
        "Binary" -> Binary
        "BiologicallyDerivedProduct" -> BiologicallyDerivedProduct
        "BiologicallyDerivedProductDispense" -> BiologicallyDerivedProductDispense
        "BodyStructure" -> BodyStructure
        "Bundle" -> Bundle
        "CapabilityStatement" -> CapabilityStatement
        "CarePlan" -> CarePlan
        "CareTeam" -> CareTeam
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
        "ConditionDefinition" -> ConditionDefinition
        "Consent" -> Consent
        "Contract" -> Contract
        "Coverage" -> Coverage
        "CoverageEligibilityRequest" -> CoverageEligibilityRequest
        "CoverageEligibilityResponse" -> CoverageEligibilityResponse
        "DetectedIssue" -> DetectedIssue
        "Device" -> Device
        "DeviceAssociation" -> DeviceAssociation
        "DeviceDefinition" -> DeviceDefinition
        "DeviceDispense" -> DeviceDispense
        "DeviceMetric" -> DeviceMetric
        "DeviceRequest" -> DeviceRequest
        "DeviceUsage" -> DeviceUsage
        "DiagnosticReport" -> DiagnosticReport
        "DocumentReference" -> DocumentReference
        "Encounter" -> Encounter
        "EncounterHistory" -> EncounterHistory
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
        "FormularyItem" -> FormularyItem
        "GenomicStudy" -> GenomicStudy
        "Goal" -> Goal
        "GraphDefinition" -> GraphDefinition
        "Group" -> Group
        "GuidanceResponse" -> GuidanceResponse
        "HealthcareService" -> HealthcareService
        "ImagingSelection" -> ImagingSelection
        "ImagingStudy" -> ImagingStudy
        "Immunization" -> Immunization
        "ImmunizationEvaluation" -> ImmunizationEvaluation
        "ImmunizationRecommendation" -> ImmunizationRecommendation
        "ImplementationGuide" -> ImplementationGuide
        "Ingredient" -> Ingredient
        "InsurancePlan" -> InsurancePlan
        "InventoryItem" -> InventoryItem
        "InventoryReport" -> InventoryReport
        "Invoice" -> Invoice
        "Library" -> Library
        "Linkage" -> Linkage
        "List" -> List
        "Location" -> Location
        "ManufacturedItemDefinition" -> ManufacturedItemDefinition
        "Measure" -> Measure
        "MeasureReport" -> MeasureReport
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
        "NutritionIntake" -> NutritionIntake
        "NutritionOrder" -> NutritionOrder
        "NutritionProduct" -> NutritionProduct
        "Observation" -> Observation
        "ObservationDefinition" -> ObservationDefinition
        "OperationDefinition" -> OperationDefinition
        "OperationOutcome" -> OperationOutcome
        "Organization" -> Organization
        "OrganizationAffiliation" -> OrganizationAffiliation
        "PackagedProductDefinition" -> PackagedProductDefinition
        "Parameters" -> Parameters
        "Patient" -> Patient
        "PaymentNotice" -> PaymentNotice
        "PaymentReconciliation" -> PaymentReconciliation
        "Permission" -> Permission
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
        "RequestOrchestration" -> RequestOrchestration
        "Requirements" -> Requirements
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
        "SubstanceNucleicAcid" -> SubstanceNucleicAcid
        "SubstancePolymer" -> SubstancePolymer
        "SubstanceProtein" -> SubstanceProtein
        "SubstanceReferenceInformation" -> SubstanceReferenceInformation
        "SubstanceSourceMaterial" -> SubstanceSourceMaterial
        "SupplyDelivery" -> SupplyDelivery
        "SupplyRequest" -> SupplyRequest
        "Task" -> Task
        "TerminologyCapabilities" -> TerminologyCapabilities
        "TestPlan" -> TestPlan
        "TestReport" -> TestReport
        "TestScript" -> TestScript
        "Transport" -> Transport
        "ValueSet" -> ValueSet
        "VerificationResult" -> VerificationResult
        "VisionPrescription" -> VisionPrescription
        else -> throw IllegalArgumentException("Unknown code $code for enum FHIRResourceTypeExt")
      }
  }
}
