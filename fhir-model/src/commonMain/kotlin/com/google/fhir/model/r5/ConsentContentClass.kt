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
public enum class ConsentContentClass(
  private val code: String,
  private val system: String,
  private val display: String?,
) {
  Account("Account", "http://hl7.org/fhir/fhir-types", "Account"),
  ActivityDefinition("ActivityDefinition", "http://hl7.org/fhir/fhir-types", "ActivityDefinition"),
  ActorDefinition("ActorDefinition", "http://hl7.org/fhir/fhir-types", "ActorDefinition"),
  AdministrableProductDefinition(
    "AdministrableProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "AdministrableProductDefinition",
  ),
  AdverseEvent("AdverseEvent", "http://hl7.org/fhir/fhir-types", "AdverseEvent"),
  AllergyIntolerance("AllergyIntolerance", "http://hl7.org/fhir/fhir-types", "AllergyIntolerance"),
  Appointment("Appointment", "http://hl7.org/fhir/fhir-types", "Appointment"),
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/fhir-types",
    "AppointmentResponse",
  ),
  ArtifactAssessment("ArtifactAssessment", "http://hl7.org/fhir/fhir-types", "ArtifactAssessment"),
  AuditEvent("AuditEvent", "http://hl7.org/fhir/fhir-types", "AuditEvent"),
  Basic("Basic", "http://hl7.org/fhir/fhir-types", "Basic"),
  Binary("Binary", "http://hl7.org/fhir/fhir-types", "Binary"),
  BiologicallyDerivedProduct(
    "BiologicallyDerivedProduct",
    "http://hl7.org/fhir/fhir-types",
    "BiologicallyDerivedProduct",
  ),
  BiologicallyDerivedProductDispense(
    "BiologicallyDerivedProductDispense",
    "http://hl7.org/fhir/fhir-types",
    "BiologicallyDerivedProductDispense",
  ),
  BodyStructure("BodyStructure", "http://hl7.org/fhir/fhir-types", "BodyStructure"),
  Bundle("Bundle", "http://hl7.org/fhir/fhir-types", "Bundle"),
  CapabilityStatement(
    "CapabilityStatement",
    "http://hl7.org/fhir/fhir-types",
    "CapabilityStatement",
  ),
  CarePlan("CarePlan", "http://hl7.org/fhir/fhir-types", "CarePlan"),
  CareTeam("CareTeam", "http://hl7.org/fhir/fhir-types", "CareTeam"),
  ChargeItem("ChargeItem", "http://hl7.org/fhir/fhir-types", "ChargeItem"),
  ChargeItemDefinition(
    "ChargeItemDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ChargeItemDefinition",
  ),
  Citation("Citation", "http://hl7.org/fhir/fhir-types", "Citation"),
  Claim("Claim", "http://hl7.org/fhir/fhir-types", "Claim"),
  ClaimResponse("ClaimResponse", "http://hl7.org/fhir/fhir-types", "ClaimResponse"),
  ClinicalImpression("ClinicalImpression", "http://hl7.org/fhir/fhir-types", "ClinicalImpression"),
  ClinicalUseDefinition(
    "ClinicalUseDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ClinicalUseDefinition",
  ),
  CodeSystem("CodeSystem", "http://hl7.org/fhir/fhir-types", "CodeSystem"),
  Communication("Communication", "http://hl7.org/fhir/fhir-types", "Communication"),
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "CommunicationRequest",
  ),
  CompartmentDefinition(
    "CompartmentDefinition",
    "http://hl7.org/fhir/fhir-types",
    "CompartmentDefinition",
  ),
  Composition("Composition", "http://hl7.org/fhir/fhir-types", "Composition"),
  ConceptMap("ConceptMap", "http://hl7.org/fhir/fhir-types", "ConceptMap"),
  Condition("Condition", "http://hl7.org/fhir/fhir-types", "Condition"),
  ConditionDefinition(
    "ConditionDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ConditionDefinition",
  ),
  Consent("Consent", "http://hl7.org/fhir/fhir-types", "Consent"),
  Contract("Contract", "http://hl7.org/fhir/fhir-types", "Contract"),
  Coverage("Coverage", "http://hl7.org/fhir/fhir-types", "Coverage"),
  CoverageEligibilityRequest(
    "CoverageEligibilityRequest",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityRequest",
  ),
  CoverageEligibilityResponse(
    "CoverageEligibilityResponse",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityResponse",
  ),
  DetectedIssue("DetectedIssue", "http://hl7.org/fhir/fhir-types", "DetectedIssue"),
  Device("Device", "http://hl7.org/fhir/fhir-types", "Device"),
  DeviceAssociation("DeviceAssociation", "http://hl7.org/fhir/fhir-types", "DeviceAssociation"),
  DeviceDefinition("DeviceDefinition", "http://hl7.org/fhir/fhir-types", "DeviceDefinition"),
  DeviceDispense("DeviceDispense", "http://hl7.org/fhir/fhir-types", "DeviceDispense"),
  DeviceMetric("DeviceMetric", "http://hl7.org/fhir/fhir-types", "DeviceMetric"),
  DeviceRequest("DeviceRequest", "http://hl7.org/fhir/fhir-types", "DeviceRequest"),
  DeviceUsage("DeviceUsage", "http://hl7.org/fhir/fhir-types", "DeviceUsage"),
  DiagnosticReport("DiagnosticReport", "http://hl7.org/fhir/fhir-types", "DiagnosticReport"),
  DocumentReference("DocumentReference", "http://hl7.org/fhir/fhir-types", "DocumentReference"),
  Encounter("Encounter", "http://hl7.org/fhir/fhir-types", "Encounter"),
  EncounterHistory("EncounterHistory", "http://hl7.org/fhir/fhir-types", "EncounterHistory"),
  Endpoint("Endpoint", "http://hl7.org/fhir/fhir-types", "Endpoint"),
  EnrollmentRequest("EnrollmentRequest", "http://hl7.org/fhir/fhir-types", "EnrollmentRequest"),
  EnrollmentResponse("EnrollmentResponse", "http://hl7.org/fhir/fhir-types", "EnrollmentResponse"),
  EpisodeOfCare("EpisodeOfCare", "http://hl7.org/fhir/fhir-types", "EpisodeOfCare"),
  EventDefinition("EventDefinition", "http://hl7.org/fhir/fhir-types", "EventDefinition"),
  Evidence("Evidence", "http://hl7.org/fhir/fhir-types", "Evidence"),
  EvidenceReport("EvidenceReport", "http://hl7.org/fhir/fhir-types", "EvidenceReport"),
  EvidenceVariable("EvidenceVariable", "http://hl7.org/fhir/fhir-types", "EvidenceVariable"),
  ExampleScenario("ExampleScenario", "http://hl7.org/fhir/fhir-types", "ExampleScenario"),
  ExplanationOfBenefit(
    "ExplanationOfBenefit",
    "http://hl7.org/fhir/fhir-types",
    "ExplanationOfBenefit",
  ),
  FamilyMemberHistory(
    "FamilyMemberHistory",
    "http://hl7.org/fhir/fhir-types",
    "FamilyMemberHistory",
  ),
  Flag("Flag", "http://hl7.org/fhir/fhir-types", "Flag"),
  FormularyItem("FormularyItem", "http://hl7.org/fhir/fhir-types", "FormularyItem"),
  GenomicStudy("GenomicStudy", "http://hl7.org/fhir/fhir-types", "GenomicStudy"),
  Goal("Goal", "http://hl7.org/fhir/fhir-types", "Goal"),
  GraphDefinition("GraphDefinition", "http://hl7.org/fhir/fhir-types", "GraphDefinition"),
  Group("Group", "http://hl7.org/fhir/fhir-types", "Group"),
  GuidanceResponse("GuidanceResponse", "http://hl7.org/fhir/fhir-types", "GuidanceResponse"),
  HealthcareService("HealthcareService", "http://hl7.org/fhir/fhir-types", "HealthcareService"),
  ImagingSelection("ImagingSelection", "http://hl7.org/fhir/fhir-types", "ImagingSelection"),
  ImagingStudy("ImagingStudy", "http://hl7.org/fhir/fhir-types", "ImagingStudy"),
  Immunization("Immunization", "http://hl7.org/fhir/fhir-types", "Immunization"),
  ImmunizationEvaluation(
    "ImmunizationEvaluation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationEvaluation",
  ),
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationRecommendation",
  ),
  ImplementationGuide(
    "ImplementationGuide",
    "http://hl7.org/fhir/fhir-types",
    "ImplementationGuide",
  ),
  Ingredient("Ingredient", "http://hl7.org/fhir/fhir-types", "Ingredient"),
  InsurancePlan("InsurancePlan", "http://hl7.org/fhir/fhir-types", "InsurancePlan"),
  InventoryItem("InventoryItem", "http://hl7.org/fhir/fhir-types", "InventoryItem"),
  InventoryReport("InventoryReport", "http://hl7.org/fhir/fhir-types", "InventoryReport"),
  Invoice("Invoice", "http://hl7.org/fhir/fhir-types", "Invoice"),
  Library("Library", "http://hl7.org/fhir/fhir-types", "Library"),
  Linkage("Linkage", "http://hl7.org/fhir/fhir-types", "Linkage"),
  List("List", "http://hl7.org/fhir/fhir-types", "List"),
  Location("Location", "http://hl7.org/fhir/fhir-types", "Location"),
  ManufacturedItemDefinition(
    "ManufacturedItemDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ManufacturedItemDefinition",
  ),
  Measure("Measure", "http://hl7.org/fhir/fhir-types", "Measure"),
  MeasureReport("MeasureReport", "http://hl7.org/fhir/fhir-types", "MeasureReport"),
  Medication("Medication", "http://hl7.org/fhir/fhir-types", "Medication"),
  MedicationAdministration(
    "MedicationAdministration",
    "http://hl7.org/fhir/fhir-types",
    "MedicationAdministration",
  ),
  MedicationDispense("MedicationDispense", "http://hl7.org/fhir/fhir-types", "MedicationDispense"),
  MedicationKnowledge(
    "MedicationKnowledge",
    "http://hl7.org/fhir/fhir-types",
    "MedicationKnowledge",
  ),
  MedicationRequest("MedicationRequest", "http://hl7.org/fhir/fhir-types", "MedicationRequest"),
  MedicationStatement(
    "MedicationStatement",
    "http://hl7.org/fhir/fhir-types",
    "MedicationStatement",
  ),
  MedicinalProductDefinition(
    "MedicinalProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "MedicinalProductDefinition",
  ),
  MessageDefinition("MessageDefinition", "http://hl7.org/fhir/fhir-types", "MessageDefinition"),
  MessageHeader("MessageHeader", "http://hl7.org/fhir/fhir-types", "MessageHeader"),
  MolecularSequence("MolecularSequence", "http://hl7.org/fhir/fhir-types", "MolecularSequence"),
  NamingSystem("NamingSystem", "http://hl7.org/fhir/fhir-types", "NamingSystem"),
  NutritionIntake("NutritionIntake", "http://hl7.org/fhir/fhir-types", "NutritionIntake"),
  NutritionOrder("NutritionOrder", "http://hl7.org/fhir/fhir-types", "NutritionOrder"),
  NutritionProduct("NutritionProduct", "http://hl7.org/fhir/fhir-types", "NutritionProduct"),
  Observation("Observation", "http://hl7.org/fhir/fhir-types", "Observation"),
  ObservationDefinition(
    "ObservationDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ObservationDefinition",
  ),
  OperationDefinition(
    "OperationDefinition",
    "http://hl7.org/fhir/fhir-types",
    "OperationDefinition",
  ),
  OperationOutcome("OperationOutcome", "http://hl7.org/fhir/fhir-types", "OperationOutcome"),
  Organization("Organization", "http://hl7.org/fhir/fhir-types", "Organization"),
  OrganizationAffiliation(
    "OrganizationAffiliation",
    "http://hl7.org/fhir/fhir-types",
    "OrganizationAffiliation",
  ),
  PackagedProductDefinition(
    "PackagedProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "PackagedProductDefinition",
  ),
  Parameters("Parameters", "http://hl7.org/fhir/fhir-types", "Parameters"),
  Patient("Patient", "http://hl7.org/fhir/fhir-types", "Patient"),
  PaymentNotice("PaymentNotice", "http://hl7.org/fhir/fhir-types", "PaymentNotice"),
  PaymentReconciliation(
    "PaymentReconciliation",
    "http://hl7.org/fhir/fhir-types",
    "PaymentReconciliation",
  ),
  Permission("Permission", "http://hl7.org/fhir/fhir-types", "Permission"),
  Person("Person", "http://hl7.org/fhir/fhir-types", "Person"),
  PlanDefinition("PlanDefinition", "http://hl7.org/fhir/fhir-types", "PlanDefinition"),
  Practitioner("Practitioner", "http://hl7.org/fhir/fhir-types", "Practitioner"),
  PractitionerRole("PractitionerRole", "http://hl7.org/fhir/fhir-types", "PractitionerRole"),
  Procedure("Procedure", "http://hl7.org/fhir/fhir-types", "Procedure"),
  Provenance("Provenance", "http://hl7.org/fhir/fhir-types", "Provenance"),
  Questionnaire("Questionnaire", "http://hl7.org/fhir/fhir-types", "Questionnaire"),
  QuestionnaireResponse(
    "QuestionnaireResponse",
    "http://hl7.org/fhir/fhir-types",
    "QuestionnaireResponse",
  ),
  RegulatedAuthorization(
    "RegulatedAuthorization",
    "http://hl7.org/fhir/fhir-types",
    "RegulatedAuthorization",
  ),
  RelatedPerson("RelatedPerson", "http://hl7.org/fhir/fhir-types", "RelatedPerson"),
  RequestOrchestration(
    "RequestOrchestration",
    "http://hl7.org/fhir/fhir-types",
    "RequestOrchestration",
  ),
  Requirements("Requirements", "http://hl7.org/fhir/fhir-types", "Requirements"),
  ResearchStudy("ResearchStudy", "http://hl7.org/fhir/fhir-types", "ResearchStudy"),
  ResearchSubject("ResearchSubject", "http://hl7.org/fhir/fhir-types", "ResearchSubject"),
  RiskAssessment("RiskAssessment", "http://hl7.org/fhir/fhir-types", "RiskAssessment"),
  Schedule("Schedule", "http://hl7.org/fhir/fhir-types", "Schedule"),
  SearchParameter("SearchParameter", "http://hl7.org/fhir/fhir-types", "SearchParameter"),
  ServiceRequest("ServiceRequest", "http://hl7.org/fhir/fhir-types", "ServiceRequest"),
  Slot("Slot", "http://hl7.org/fhir/fhir-types", "Slot"),
  Specimen("Specimen", "http://hl7.org/fhir/fhir-types", "Specimen"),
  SpecimenDefinition("SpecimenDefinition", "http://hl7.org/fhir/fhir-types", "SpecimenDefinition"),
  StructureDefinition(
    "StructureDefinition",
    "http://hl7.org/fhir/fhir-types",
    "StructureDefinition",
  ),
  StructureMap("StructureMap", "http://hl7.org/fhir/fhir-types", "StructureMap"),
  Subscription("Subscription", "http://hl7.org/fhir/fhir-types", "Subscription"),
  SubscriptionStatus("SubscriptionStatus", "http://hl7.org/fhir/fhir-types", "SubscriptionStatus"),
  SubscriptionTopic("SubscriptionTopic", "http://hl7.org/fhir/fhir-types", "SubscriptionTopic"),
  Substance("Substance", "http://hl7.org/fhir/fhir-types", "Substance"),
  SubstanceDefinition(
    "SubstanceDefinition",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceDefinition",
  ),
  SubstanceNucleicAcid(
    "SubstanceNucleicAcid",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceNucleicAcid",
  ),
  SubstancePolymer("SubstancePolymer", "http://hl7.org/fhir/fhir-types", "SubstancePolymer"),
  SubstanceProtein("SubstanceProtein", "http://hl7.org/fhir/fhir-types", "SubstanceProtein"),
  SubstanceReferenceInformation(
    "SubstanceReferenceInformation",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceReferenceInformation",
  ),
  SubstanceSourceMaterial(
    "SubstanceSourceMaterial",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceSourceMaterial",
  ),
  SupplyDelivery("SupplyDelivery", "http://hl7.org/fhir/fhir-types", "SupplyDelivery"),
  SupplyRequest("SupplyRequest", "http://hl7.org/fhir/fhir-types", "SupplyRequest"),
  Task("Task", "http://hl7.org/fhir/fhir-types", "Task"),
  TerminologyCapabilities(
    "TerminologyCapabilities",
    "http://hl7.org/fhir/fhir-types",
    "TerminologyCapabilities",
  ),
  TestPlan("TestPlan", "http://hl7.org/fhir/fhir-types", "TestPlan"),
  TestReport("TestReport", "http://hl7.org/fhir/fhir-types", "TestReport"),
  TestScript("TestScript", "http://hl7.org/fhir/fhir-types", "TestScript"),
  Transport("Transport", "http://hl7.org/fhir/fhir-types", "Transport"),
  ValueSet("ValueSet", "http://hl7.org/fhir/fhir-types", "ValueSet"),
  VerificationResult("VerificationResult", "http://hl7.org/fhir/fhir-types", "VerificationResult"),
  VisionPrescription("VisionPrescription", "http://hl7.org/fhir/fhir-types", "VisionPrescription");

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public companion object {
    public fun fromCode(code: String): ConsentContentClass =
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
        else -> throw IllegalArgumentException("Unknown code $code for enum ConsentContentClass")
      }
  }
}
