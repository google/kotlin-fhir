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
  /** --- Abstract Type! ---This is the base resource type for everything. */
  Resource(
    "Resource",
    "http://hl7.org/fhir/resource-types",
    "Resource",
    "--- Abstract Type! ---This is the base resource type for everything.",
  ),
  /**
   * A resource that represents the data of a single raw artifact as digital content accessible in
   * its native format. A Binary resource can contain any content, whether text, image, pdf, zip
   * archive, etc.
   */
  Binary(
    "Binary",
    "http://hl7.org/fhir/resource-types",
    "Binary",
    "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.",
  ),
  /** A container for a collection of resources. */
  Bundle(
    "Bundle",
    "http://hl7.org/fhir/resource-types",
    "Bundle",
    "A container for a collection of resources.",
  ),
  /**
   * --- Abstract Type! ---A resource that includes narrative, extensions, and contained resources.
   */
  DomainResource(
    "DomainResource",
    "http://hl7.org/fhir/resource-types",
    "DomainResource",
    "--- Abstract Type! ---A resource that includes narrative, extensions, and contained resources.",
  ),
  /**
   * A financial tool for tracking value accrued for a particular purpose. In the healthcare field,
   * used to track charges for a patient, cost centers, etc.
   */
  Account(
    "Account",
    "http://hl7.org/fhir/resource-types",
    "Account",
    "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.",
  ),
  /**
   * This resource allows for the definition of some activity to be performed, independent of a
   * particular patient, practitioner, or other performance context.
   */
  ActivityDefinition(
    "ActivityDefinition",
    "http://hl7.org/fhir/resource-types",
    "ActivityDefinition",
    "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.",
  ),
  /**
   * A medicinal product in the final form which is suitable for administering to a patient (after
   * any mixing of multiple components, dissolution etc. has been performed).
   */
  AdministrableProductDefinition(
    "AdministrableProductDefinition",
    "http://hl7.org/fhir/resource-types",
    "AdministrableProductDefinition",
    "A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).",
  ),
  /**
   * Actual or potential/avoided event causing unintended physical injury resulting from or
   * contributed to by medical care, a research study or other healthcare setting factors that
   * requires additional monitoring, treatment, or hospitalization, or that results in death.
   */
  AdverseEvent(
    "AdverseEvent",
    "http://hl7.org/fhir/resource-types",
    "AdverseEvent",
    "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.",
  ),
  /**
   * Risk of harmful or undesirable, physiological response which is unique to an individual and
   * associated with exposure to a substance.
   */
  AllergyIntolerance(
    "AllergyIntolerance",
    "http://hl7.org/fhir/resource-types",
    "AllergyIntolerance",
    "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.",
  ),
  /**
   * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
   * device(s) for a specific date/time. This may result in one or more Encounter(s).
   */
  Appointment(
    "Appointment",
    "http://hl7.org/fhir/resource-types",
    "Appointment",
    "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).",
  ),
  /**
   * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation
   * or rejection.
   */
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/resource-types",
    "AppointmentResponse",
    "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.",
  ),
  /**
   * A record of an event made for purposes of maintaining a security log. Typical uses include
   * detection of intrusion attempts and monitoring for inappropriate usage.
   */
  AuditEvent(
    "AuditEvent",
    "http://hl7.org/fhir/resource-types",
    "AuditEvent",
    "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.",
  ),
  /**
   * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that
   * don't map to an existing resource, and custom resources not appropriate for inclusion in the
   * FHIR specification.
   */
  Basic(
    "Basic",
    "http://hl7.org/fhir/resource-types",
    "Basic",
    "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.",
  ),
  /**
   * A material substance originating from a biological entity intended to be transplanted or
   * infused into another (possibly the same) biological entity.
   */
  BiologicallyDerivedProduct(
    "BiologicallyDerivedProduct",
    "http://hl7.org/fhir/resource-types",
    "BiologicallyDerivedProduct",
    """
  |A material substance originating from a biological entity intended to be transplanted or infused
  |into another (possibly the same) biological entity.
  """
      .trimMargin(),
  ),
  /**
   * Record details about an anatomical structure. This resource may be used when a coded concept
   * does not provide the necessary detail needed for the use case.
   */
  BodyStructure(
    "BodyStructure",
    "http://hl7.org/fhir/resource-types",
    "BodyStructure",
    "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.",
  ),
  /**
   * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a
   * particular version of FHIR that may be used as a statement of actual server functionality or a
   * statement of required or desired server implementation.
   */
  CapabilityStatement(
    "CapabilityStatement",
    "http://hl7.org/fhir/resource-types",
    "CapabilityStatement",
    "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.",
  ),
  /**
   * Describes the intention of how one or more practitioners intend to deliver care for a
   * particular patient, group or community for a period of time, possibly limited to care for a
   * specific condition or set of conditions.
   */
  CarePlan(
    "CarePlan",
    "http://hl7.org/fhir/resource-types",
    "CarePlan",
    "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.",
  ),
  /**
   * The Care Team includes all the people and organizations who plan to participate in the
   * coordination and delivery of care for a patient.
   */
  CareTeam(
    "CareTeam",
    "http://hl7.org/fhir/resource-types",
    "CareTeam",
    "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.",
  ),
  /** Catalog entries are wrappers that contextualize items included in a catalog. */
  CatalogEntry(
    "CatalogEntry",
    "http://hl7.org/fhir/resource-types",
    "CatalogEntry",
    "Catalog entries are wrappers that contextualize items included in a catalog.",
  ),
  /**
   * The resource ChargeItem describes the provision of healthcare provider products for a certain
   * patient, therefore referring not only to the product, but containing in addition details of the
   * provision, like date, time, amounts and participating organizations and persons. Main Usage of
   * the ChargeItem is to enable the billing process and internal cost allocation.
   */
  ChargeItem(
    "ChargeItem",
    "http://hl7.org/fhir/resource-types",
    "ChargeItem",
    "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.",
  ),
  /**
   * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
   * necessary to calculate costs and prices. The properties may differ largely depending on type
   * and realm, therefore this resource gives only a rough structure and requires profiling for each
   * type of billing code system.
   */
  ChargeItemDefinition(
    "ChargeItemDefinition",
    "http://hl7.org/fhir/resource-types",
    "ChargeItemDefinition",
    "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.",
  ),
  /**
   * The Citation Resource enables reference to any knowledge artifact for purposes of
   * identification and attribution. The Citation Resource supports existing reference structures
   * and developing publication practices such as versioning, expressing complex contributorship
   * roles, and referencing computable resources.
   */
  Citation(
    "Citation",
    "http://hl7.org/fhir/resource-types",
    "Citation",
    "The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.",
  ),
  /**
   * A provider issued list of professional services and products which have been provided, or are
   * to be provided, to a patient which is sent to an insurer for reimbursement.
   */
  Claim(
    "Claim",
    "http://hl7.org/fhir/resource-types",
    "Claim",
    "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.",
  ),
  /** This resource provides the adjudication details from the processing of a Claim resource. */
  ClaimResponse(
    "ClaimResponse",
    "http://hl7.org/fhir/resource-types",
    "ClaimResponse",
    "This resource provides the adjudication details from the processing of a Claim resource.",
  ),
  /**
   * A record of a clinical assessment performed to determine what problem(s) may affect the patient
   * and before planning the treatments or management strategies that are best to manage a patient's
   * condition. Assessments are often 1:1 with a clinical consultation / encounter, but this varies
   * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather
   * than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as
   * Apgar score.
   */
  ClinicalImpression(
    "ClinicalImpression",
    "http://hl7.org/fhir/resource-types",
    "ClinicalImpression",
    "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score.",
  ),
  /**
   * A single issue - either an indication, contraindication, interaction or an undesirable effect
   * for a medicinal product, medication, device or procedure.
   */
  ClinicalUseDefinition(
    "ClinicalUseDefinition",
    "http://hl7.org/fhir/resource-types",
    "ClinicalUseDefinition",
    "A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.",
  ),
  /**
   * The CodeSystem resource is used to declare the existence of and describe a code system or code
   * system supplement and its key properties, and optionally define a part or all of its content.
   */
  CodeSystem(
    "CodeSystem",
    "http://hl7.org/fhir/resource-types",
    "CodeSystem",
    "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.",
  ),
  /**
   * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible
   * provider, a public health agency that was notified about a reportable condition.
   */
  Communication(
    "Communication",
    "http://hl7.org/fhir/resource-types",
    "Communication",
    "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.",
  ),
  /**
   * A request to convey information; e.g. the CDS system proposes that an alert be sent to a
   * responsible provider, the CDS system proposes that the public health agency be notified about a
   * reportable condition.
   */
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/resource-types",
    "CommunicationRequest",
    "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.",
  ),
  /** A compartment definition that defines how resources are accessed on a server. */
  CompartmentDefinition(
    "CompartmentDefinition",
    "http://hl7.org/fhir/resource-types",
    "CompartmentDefinition",
    "A compartment definition that defines how resources are accessed on a server.",
  ),
  /**
   * A set of healthcare-related information that is assembled together into a single logical
   * package that provides a single coherent statement of meaning, establishes its own context and
   * that has clinical attestation with regard to who is making the statement. A Composition defines
   * the structure and narrative content necessary for a document. However, a Composition alone does
   * not constitute a document. Rather, the Composition must be the first entry in a Bundle where
   * Bundle.type=document, and any other resources referenced from Composition must be included as
   * subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
   */
  Composition(
    "Composition",
    "http://hl7.org/fhir/resource-types",
    "Composition",
    "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).",
  ),
  /**
   * A statement of relationships from one set of concepts to one or more other concepts - either
   * concepts in code systems, or data element/data element concepts, or classes in class models.
   */
  ConceptMap(
    "ConceptMap",
    "http://hl7.org/fhir/resource-types",
    "ConceptMap",
    "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.",
  ),
  /**
   * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept
   * that has risen to a level of concern.
   */
  Condition(
    "Condition",
    "http://hl7.org/fhir/resource-types",
    "Condition",
    "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.",
  ),
  /**
   * A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or
   * recipient role(s) to perform one or more actions within a given policy context, for specific
   * purposes and periods of time.
   */
  Consent(
    "Consent",
    "http://hl7.org/fhir/resource-types",
    "Consent",
    "A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.",
  ),
  /**
   * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
   * agreement.
   */
  Contract(
    "Contract",
    "http://hl7.org/fhir/resource-types",
    "Contract",
    "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.",
  ),
  /**
   * Financial instrument which may be used to reimburse or pay for health care products and
   * services. Includes both insurance and self-payment.
   */
  Coverage(
    "Coverage",
    "http://hl7.org/fhir/resource-types",
    "Coverage",
    "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.",
  ),
  /**
   * The CoverageEligibilityRequest provides patient and insurance coverage information to an
   * insurer for them to respond, in the form of an CoverageEligibilityResponse, with information
   * regarding whether the stated coverage is valid and in-force and optionally to provide the
   * insurance details of the policy.
   */
  CoverageEligibilityRequest(
    "CoverageEligibilityRequest",
    "http://hl7.org/fhir/resource-types",
    "CoverageEligibilityRequest",
    "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.",
  ),
  /**
   * This resource provides eligibility and plan details from the processing of an
   * CoverageEligibilityRequest resource.
   */
  CoverageEligibilityResponse(
    "CoverageEligibilityResponse",
    "http://hl7.org/fhir/resource-types",
    "CoverageEligibilityResponse",
    "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.",
  ),
  /**
   * Indicates an actual or potential clinical issue with or between one or more active or proposed
   * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
   * Procedure-condition conflict, etc.
   */
  DetectedIssue(
    "DetectedIssue",
    "http://hl7.org/fhir/resource-types",
    "DetectedIssue",
    "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.",
  ),
  /**
   * A type of a manufactured item that is used in the provision of healthcare without being
   * substantially changed through that activity. The device may be a medical or non-medical device.
   */
  Device(
    "Device",
    "http://hl7.org/fhir/resource-types",
    "Device",
    "A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.",
  ),
  /**
   * The characteristics, operational status and capabilities of a medical-related component of a
   * medical device.
   */
  DeviceDefinition(
    "DeviceDefinition",
    "http://hl7.org/fhir/resource-types",
    "DeviceDefinition",
    "The characteristics, operational status and capabilities of a medical-related component of a medical device.",
  ),
  /** Describes a measurement, calculation or setting capability of a medical device. */
  DeviceMetric(
    "DeviceMetric",
    "http://hl7.org/fhir/resource-types",
    "DeviceMetric",
    "Describes a measurement, calculation or setting capability of a medical device.",
  ),
  /**
   * Represents a request for a patient to employ a medical device. The device may be an implantable
   * device, or an external assistive device, such as a walker.
   */
  DeviceRequest(
    "DeviceRequest",
    "http://hl7.org/fhir/resource-types",
    "DeviceRequest",
    "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.",
  ),
  /**
   * A record of a device being used by a patient where the record is the result of a report from
   * the patient or another clinician.
   */
  DeviceUseStatement(
    "DeviceUseStatement",
    "http://hl7.org/fhir/resource-types",
    "DeviceUseStatement",
    "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.",
  ),
  /**
   * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
   * devices, and locations, and/or specimens derived from these. The report includes clinical
   * context such as requesting and provider information, and some mix of atomic results, images,
   * textual and coded interpretations, and formatted representation of diagnostic reports.
   */
  DiagnosticReport(
    "DiagnosticReport",
    "http://hl7.org/fhir/resource-types",
    "DiagnosticReport",
    "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.",
  ),
  /**
   * A collection of documents compiled for a purpose together with metadata that applies to the
   * collection.
   */
  DocumentManifest(
    "DocumentManifest",
    "http://hl7.org/fhir/resource-types",
    "DocumentManifest",
    "A collection of documents compiled for a purpose together with metadata that applies to the collection.",
  ),
  /**
   * A reference to a document of any kind for any purpose. Provides metadata about the document so
   * that the document can be discovered and managed. The scope of a document is any seralized
   * object with a mime-type, so includes formal patient centric documents (CDA), cliical notes,
   * scanned paper, and non-patient specific documents like policy text.
   */
  DocumentReference(
    "DocumentReference",
    "http://hl7.org/fhir/resource-types",
    "DocumentReference",
    "A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.",
  ),
  /**
   * An interaction between a patient and healthcare provider(s) for the purpose of providing
   * healthcare service(s) or assessing the health status of a patient.
   */
  Encounter(
    "Encounter",
    "http://hl7.org/fhir/resource-types",
    "Encounter",
    "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.",
  ),
  /**
   * The technical details of an endpoint that can be used for electronic services, such as for web
   * services providing XDS.b or a REST endpoint for another FHIR server. This may include any
   * security context information.
   */
  Endpoint(
    "Endpoint",
    "http://hl7.org/fhir/resource-types",
    "Endpoint",
    "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.",
  ),
  /**
   * This resource provides the insurance enrollment details to the insurer regarding a specified
   * coverage.
   */
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/resource-types",
    "EnrollmentRequest",
    "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.",
  ),
  /**
   * This resource provides enrollment and plan details from the processing of an EnrollmentRequest
   * resource.
   */
  EnrollmentResponse(
    "EnrollmentResponse",
    "http://hl7.org/fhir/resource-types",
    "EnrollmentResponse",
    "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.",
  ),
  /**
   * An association between a patient and an organization / healthcare provider(s) during which time
   * encounters may occur. The managing organization assumes a level of responsibility for the
   * patient during this time.
   */
  EpisodeOfCare(
    "EpisodeOfCare",
    "http://hl7.org/fhir/resource-types",
    "EpisodeOfCare",
    "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.",
  ),
  /**
   * The EventDefinition resource provides a reusable description of when a particular event can
   * occur.
   */
  EventDefinition(
    "EventDefinition",
    "http://hl7.org/fhir/resource-types",
    "EventDefinition",
    "The EventDefinition resource provides a reusable description of when a particular event can occur.",
  ),
  /**
   * The Evidence Resource provides a machine-interpretable expression of an evidence concept
   * including the evidence variables (eg population, exposures/interventions, comparators,
   * outcomes, measured variables, confounding variables), the statistics, and the certainty of this
   * evidence.
   */
  Evidence(
    "Evidence",
    "http://hl7.org/fhir/resource-types",
    "Evidence",
    "The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (eg population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.",
  ),
  /**
   * The EvidenceReport Resource is a specialized container for a collection of resources and
   * codable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation
   * resources and related concepts.
   */
  EvidenceReport(
    "EvidenceReport",
    "http://hl7.org/fhir/resource-types",
    "EvidenceReport",
    "The EvidenceReport Resource is a specialized container for a collection of resources and codable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and related concepts.",
  ),
  /** The EvidenceVariable resource describes an element that knowledge (Evidence) is about. */
  EvidenceVariable(
    "EvidenceVariable",
    "http://hl7.org/fhir/resource-types",
    "EvidenceVariable",
    "The EvidenceVariable resource describes an element that knowledge (Evidence) is about.",
  ),
  /** Example of workflow instance. */
  ExampleScenario(
    "ExampleScenario",
    "http://hl7.org/fhir/resource-types",
    "ExampleScenario",
    "Example of workflow instance.",
  ),
  /**
   * This resource provides: the claim details; adjudication details from the processing of a Claim;
   * and optionally account balance information, for informing the subscriber of the benefits
   * provided.
   */
  ExplanationOfBenefit(
    "ExplanationOfBenefit",
    "http://hl7.org/fhir/resource-types",
    "ExplanationOfBenefit",
    "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.",
  ),
  /**
   * Significant health conditions for a person related to the patient relevant in the context of
   * care for the patient.
   */
  FamilyMemberHistory(
    "FamilyMemberHistory",
    "http://hl7.org/fhir/resource-types",
    "FamilyMemberHistory",
    "Significant health conditions for a person related to the patient relevant in the context of care for the patient.",
  ),
  /** Prospective warnings of potential issues when providing care to the patient. */
  Flag(
    "Flag",
    "http://hl7.org/fhir/resource-types",
    "Flag",
    "Prospective warnings of potential issues when providing care to the patient.",
  ),
  /**
   * Describes the intended objective(s) for a patient, group or organization care, for example,
   * weight loss, restoring an activity of daily living, obtaining herd immunity via immunization,
   * meeting a process improvement objective, etc.
   */
  Goal(
    "Goal",
    "http://hl7.org/fhir/resource-types",
    "Goal",
    "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.",
  ),
  /**
   * A formal computable definition of a graph of resources - that is, a coherent set of resources
   * that form a graph by following references. The Graph Definition resource defines a set and
   * makes rules about the set.
   */
  GraphDefinition(
    "GraphDefinition",
    "http://hl7.org/fhir/resource-types",
    "GraphDefinition",
    "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.",
  ),
  /**
   * Represents a defined collection of entities that may be discussed or acted upon collectively
   * but which are not expected to act collectively, and are not formally or legally recognized;
   * i.e. a collection of entities that isn't an Organization.
   */
  Group(
    "Group",
    "http://hl7.org/fhir/resource-types",
    "Group",
    "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.",
  ),
  /**
   * A guidance response is the formal response to a guidance request, including any output
   * parameters returned by the evaluation, as well as the description of any proposed actions to be
   * taken.
   */
  GuidanceResponse(
    "GuidanceResponse",
    "http://hl7.org/fhir/resource-types",
    "GuidanceResponse",
    "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.",
  ),
  /** The details of a healthcare service available at a location. */
  HealthcareService(
    "HealthcareService",
    "http://hl7.org/fhir/resource-types",
    "HealthcareService",
    "The details of a healthcare service available at a location.",
  ),
  /**
   * Representation of the content produced in a DICOM imaging study. A study comprises a set of
   * series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images
   * or other data) acquired or produced in a common context. A series is of only one modality (e.g.
   * X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
   */
  ImagingStudy(
    "ImagingStudy",
    "http://hl7.org/fhir/resource-types",
    "ImagingStudy",
    "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.",
  ),
  /**
   * Describes the event of a patient being administered a vaccine or a record of an immunization as
   * reported by a patient, a clinician or another party.
   */
  Immunization(
    "Immunization",
    "http://hl7.org/fhir/resource-types",
    "Immunization",
    "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.",
  ),
  /**
   * Describes a comparison of an immunization event against published recommendations to determine
   * if the administration is "valid" in relation to those recommendations.
   */
  ImmunizationEvaluation(
    "ImmunizationEvaluation",
    "http://hl7.org/fhir/resource-types",
    "ImmunizationEvaluation",
    "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations.",
  ),
  /**
   * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
   * schedule with optional supporting justification.
   */
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/resource-types",
    "ImmunizationRecommendation",
    "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.",
  ),
  /**
   * A set of rules of how a particular interoperability or standards problem is solved - typically
   * through the use of FHIR resources. This resource is used to gather all the parts of an
   * implementation guide into a logical whole and to publish a computable definition of all the
   * parts.
   */
  ImplementationGuide(
    "ImplementationGuide",
    "http://hl7.org/fhir/resource-types",
    "ImplementationGuide",
    "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.",
  ),
  /** An ingredient of a manufactured item or pharmaceutical product. */
  Ingredient(
    "Ingredient",
    "http://hl7.org/fhir/resource-types",
    "Ingredient",
    "An ingredient of a manufactured item or pharmaceutical product.",
  ),
  /** Details of a Health Insurance product/plan provided by an organization. */
  InsurancePlan(
    "InsurancePlan",
    "http://hl7.org/fhir/resource-types",
    "InsurancePlan",
    "Details of a Health Insurance product/plan provided by an organization.",
  ),
  /**
   * Invoice containing collected ChargeItems from an Account with calculated individual and total
   * price for Billing purpose.
   */
  Invoice(
    "Invoice",
    "http://hl7.org/fhir/resource-types",
    "Invoice",
    "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.",
  ),
  /**
   * The Library resource is a general-purpose container for knowledge asset definitions. It can be
   * used to describe and expose existing knowledge assets such as logic libraries and information
   * model descriptions, as well as to describe a collection of knowledge assets.
   */
  Library(
    "Library",
    "http://hl7.org/fhir/resource-types",
    "Library",
    "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.",
  ),
  /**
   * Identifies two or more records (resource instances) that refer to the same real-world
   * "occurrence".
   */
  Linkage(
    "Linkage",
    "http://hl7.org/fhir/resource-types",
    "Linkage",
    "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\".",
  ),
  /** A list is a curated collection of resources. */
  List(
    "List",
    "http://hl7.org/fhir/resource-types",
    "List",
    "A list is a curated collection of resources.",
  ),
  /**
   * Details and position information for a physical place where services are provided and resources
   * and participants may be stored, found, contained, or accommodated.
   */
  Location(
    "Location",
    "http://hl7.org/fhir/resource-types",
    "Location",
    "Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.",
  ),
  /**
   * The definition and characteristics of a medicinal manufactured item, such as a tablet or
   * capsule, as contained in a packaged medicinal product.
   */
  ManufacturedItemDefinition(
    "ManufacturedItemDefinition",
    "http://hl7.org/fhir/resource-types",
    "ManufacturedItemDefinition",
    "The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.",
  ),
  /** The Measure resource provides the definition of a quality measure. */
  Measure(
    "Measure",
    "http://hl7.org/fhir/resource-types",
    "Measure",
    "The Measure resource provides the definition of a quality measure.",
  ),
  /**
   * The MeasureReport resource contains the results of the calculation of a measure; and optionally
   * a reference to the resources involved in that calculation.
   */
  MeasureReport(
    "MeasureReport",
    "http://hl7.org/fhir/resource-types",
    "MeasureReport",
    "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.",
  ),
  /**
   * A photo, video, or audio recording acquired or used in healthcare. The actual content may be
   * inline or provided by direct reference.
   */
  Media(
    "Media",
    "http://hl7.org/fhir/resource-types",
    "Media",
    "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.",
  ),
  /**
   * This resource is primarily used for the identification and definition of a medication for the
   * purposes of prescribing, dispensing, and administering a medication as well as for making
   * statements about medication use.
   */
  Medication(
    "Medication",
    "http://hl7.org/fhir/resource-types",
    "Medication",
    "This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.",
  ),
  /**
   * Describes the event of a patient consuming or otherwise being administered a medication. This
   * may be as simple as swallowing a tablet or it may be a long running infusion. Related resources
   * tie this event to the authorizing prescription, and the specific encounter between patient and
   * health care practitioner.
   */
  MedicationAdministration(
    "MedicationAdministration",
    "http://hl7.org/fhir/resource-types",
    "MedicationAdministration",
    "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.",
  ),
  /**
   * Indicates that a medication product is to be or has been dispensed for a named person/patient.
   * This includes a description of the medication product (supply) provided and the instructions
   * for administering the medication. The medication dispense is the result of a pharmacy system
   * responding to a medication order.
   */
  MedicationDispense(
    "MedicationDispense",
    "http://hl7.org/fhir/resource-types",
    "MedicationDispense",
    "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.",
  ),
  /** Information about a medication that is used to support knowledge. */
  MedicationKnowledge(
    "MedicationKnowledge",
    "http://hl7.org/fhir/resource-types",
    "MedicationKnowledge",
    "Information about a medication that is used to support knowledge.",
  ),
  /**
   * An order or request for both supply of the medication and the instructions for administration
   * of the medication to a patient. The resource is called "MedicationRequest" rather than
   * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and
   * outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
   */
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/resource-types",
    "MedicationRequest",
    "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.",
  ),
  /**
   * A record of a medication that is being consumed by a patient. A MedicationStatement may
   * indicate that the patient may be taking the medication now or has taken the medication in the
   * past or will be taking the medication in the future. The source of this information can be the
   * patient, significant other (such as a family member or spouse), or a clinician. A common
   * scenario where this information is captured is during the history taking process during a
   * patient visit or stay. The medication information may come from sources such as the patient's
   * memory, from a prescription bottle, or from a list of medications the patient, clinician or
   * other party maintains.
   *
   * The primary difference between a medication statement and a medication administration is that
   * the medication administration has complete administration information and is based on actual
   * administration information from the person who administered the medication. A medication
   * statement is often, if not always, less specific. There is no required date/time when the
   * medication was administered, in fact we only know that a source has reported the patient is
   * taking this medication, where details such as time, quantity, or rate or even medication
   * product may be incomplete or missing or less precise. As stated earlier, the medication
   * statement information may come from the patient's memory, from a prescription bottle or from a
   * list of medications the patient, clinician or other party maintains. Medication administration
   * is more formal and is not missing detailed information.
   */
  MedicationStatement(
    "MedicationStatement",
    "http://hl7.org/fhir/resource-types",
    "MedicationStatement",
    """
  |A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 
  |
  |The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
  """
      .trimMargin(),
  ),
  /**
   * Detailed definition of a medicinal product, typically for uses other than direct patient care
   * (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).
   */
  MedicinalProductDefinition(
    "MedicinalProductDefinition",
    "http://hl7.org/fhir/resource-types",
    "MedicinalProductDefinition",
    "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).",
  ),
  /**
   * Defines the characteristics of a message that can be shared between systems, including the type
   * of event that initiates the message, the content to be transmitted and what response(s), if
   * any, are permitted.
   */
  MessageDefinition(
    "MessageDefinition",
    "http://hl7.org/fhir/resource-types",
    "MessageDefinition",
    "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.",
  ),
  /**
   * The header for a message exchange that is either requesting or responding to an action. The
   * reference(s) that are the subject of the action as well as other information related to the
   * action are typically transmitted in a bundle in which the MessageHeader resource instance is
   * the first resource in the bundle.
   */
  MessageHeader(
    "MessageHeader",
    "http://hl7.org/fhir/resource-types",
    "MessageHeader",
    "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.",
  ),
  /** Raw data describing a biological sequence. */
  MolecularSequence(
    "MolecularSequence",
    "http://hl7.org/fhir/resource-types",
    "MolecularSequence",
    "Raw data describing a biological sequence.",
  ),
  /**
   * A curated namespace that issues unique symbols within that namespace for the identification of
   * concepts, people, devices, etc. Represents a "System" used within the Identifier and Coding
   * data types.
   */
  NamingSystem(
    "NamingSystem",
    "http://hl7.org/fhir/resource-types",
    "NamingSystem",
    "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.",
  ),
  /**
   * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
   * patient/resident.
   */
  NutritionOrder(
    "NutritionOrder",
    "http://hl7.org/fhir/resource-types",
    "NutritionOrder",
    "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.",
  ),
  /** A food or fluid product that is consumed by patients. */
  NutritionProduct(
    "NutritionProduct",
    "http://hl7.org/fhir/resource-types",
    "NutritionProduct",
    "A food or fluid product that is consumed by patients.",
  ),
  /** Measurements and simple assertions made about a patient, device or other subject. */
  Observation(
    "Observation",
    "http://hl7.org/fhir/resource-types",
    "Observation",
    "Measurements and simple assertions made about a patient, device or other subject.",
  ),
  /**
   * Set of definitional characteristics for a kind of observation or measurement produced or
   * consumed by an orderable health care service.
   */
  ObservationDefinition(
    "ObservationDefinition",
    "http://hl7.org/fhir/resource-types",
    "ObservationDefinition",
    "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.",
  ),
  /**
   * A formal computable definition of an operation (on the RESTful interface) or a named query
   * (using the search interaction).
   */
  OperationDefinition(
    "OperationDefinition",
    "http://hl7.org/fhir/resource-types",
    "OperationDefinition",
    "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).",
  ),
  /** A collection of error, warning, or information messages that result from a system action. */
  OperationOutcome(
    "OperationOutcome",
    "http://hl7.org/fhir/resource-types",
    "OperationOutcome",
    "A collection of error, warning, or information messages that result from a system action.",
  ),
  /**
   * A formally or informally recognized grouping of people or organizations formed for the purpose
   * of achieving some form of collective action. Includes companies, institutions, corporations,
   * departments, community groups, healthcare practice groups, payer/insurer, etc.
   */
  Organization(
    "Organization",
    "http://hl7.org/fhir/resource-types",
    "Organization",
    "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.",
  ),
  /**
   * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a
   * part-of relationship/sub-division relationship.
   */
  OrganizationAffiliation(
    "OrganizationAffiliation",
    "http://hl7.org/fhir/resource-types",
    "OrganizationAffiliation",
    "Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.",
  ),
  /** A medically related item or items, in a container or package. */
  PackagedProductDefinition(
    "PackagedProductDefinition",
    "http://hl7.org/fhir/resource-types",
    "PackagedProductDefinition",
    "A medically related item or items, in a container or package.",
  ),
  /**
   * Demographics and other administrative information about an individual or animal receiving care
   * or other health-related services.
   */
  Patient(
    "Patient",
    "http://hl7.org/fhir/resource-types",
    "Patient",
    "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
  ),
  /**
   * This resource provides the status of the payment for goods and services rendered, and the
   * request and response resource references.
   */
  PaymentNotice(
    "PaymentNotice",
    "http://hl7.org/fhir/resource-types",
    "PaymentNotice",
    "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.",
  ),
  /**
   * This resource provides the details including amount of a payment and allocates the payment
   * items being paid.
   */
  PaymentReconciliation(
    "PaymentReconciliation",
    "http://hl7.org/fhir/resource-types",
    "PaymentReconciliation",
    "This resource provides the details including amount of a payment and allocates the payment items being paid.",
  ),
  /**
   * Demographics and administrative information about a person independent of a specific
   * health-related context.
   */
  Person(
    "Person",
    "http://hl7.org/fhir/resource-types",
    "Person",
    "Demographics and administrative information about a person independent of a specific health-related context.",
  ),
  /**
   * This resource allows for the definition of various types of plans as a sharable, consumable,
   * and executable artifact. The resource is general enough to support the description of a broad
   * range of clinical and non-clinical artifacts such as clinical decision support rules, order
   * sets, protocols, and drug quality specifications.
   */
  PlanDefinition(
    "PlanDefinition",
    "http://hl7.org/fhir/resource-types",
    "PlanDefinition",
    "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, and drug quality specifications.",
  ),
  /** A person who is directly or indirectly involved in the provisioning of healthcare. */
  Practitioner(
    "Practitioner",
    "http://hl7.org/fhir/resource-types",
    "Practitioner",
    "A person who is directly or indirectly involved in the provisioning of healthcare.",
  ),
  /**
   * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
   * organization for a period of time.
   */
  PractitionerRole(
    "PractitionerRole",
    "http://hl7.org/fhir/resource-types",
    "PractitionerRole",
    "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.",
  ),
  /**
   * An action that is or was performed on or for a patient. This can be a physical intervention
   * like an operation, or less invasive like long term services, counseling, or hypnotherapy.
   */
  Procedure(
    "Procedure",
    "http://hl7.org/fhir/resource-types",
    "Procedure",
    "An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.",
  ),
  /**
   * Provenance of a resource is a record that describes entities and processes involved in
   * producing and delivering or otherwise influencing that resource. Provenance provides a critical
   * foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance
   * assertions are a form of contextual metadata and can themselves become important records with
   * their own provenance. Provenance statement indicates clinical significance in terms of
   * confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle
   * (e.g. Document Completion - has the artifact been legally authenticated), all of which may
   * impact security, privacy, and trust policies.
   */
  Provenance(
    "Provenance",
    "http://hl7.org/fhir/resource-types",
    "Provenance",
    "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.",
  ),
  /**
   * A structured set of questions intended to guide the collection of answers from end-users.
   * Questionnaires provide detailed control over order, presentation, phraseology and grouping to
   * allow coherent, consistent data collection.
   */
  Questionnaire(
    "Questionnaire",
    "http://hl7.org/fhir/resource-types",
    "Questionnaire",
    "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.",
  ),
  /**
   * A structured set of questions and their answers. The questions are ordered and grouped into
   * coherent subsets, corresponding to the structure of the grouping of the questionnaire being
   * responded to.
   */
  QuestionnaireResponse(
    "QuestionnaireResponse",
    "http://hl7.org/fhir/resource-types",
    "QuestionnaireResponse",
    "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.",
  ),
  /**
   * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility
   * or activity that is cited in a guidance, regulation, rule or legislative act. An example is
   * Market Authorization relating to a Medicinal Product.
   */
  RegulatedAuthorization(
    "RegulatedAuthorization",
    "http://hl7.org/fhir/resource-types",
    "RegulatedAuthorization",
    "Regulatory approval, clearance or licencing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.",
  ),
  /**
   * Information about a person that is involved in the care for a patient, but who is not the
   * target of healthcare, nor has a formal responsibility in the care process.
   */
  RelatedPerson(
    "RelatedPerson",
    "http://hl7.org/fhir/resource-types",
    "RelatedPerson",
    "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.",
  ),
  /**
   * A group of related requests that can be used to capture intended activities that have
   * inter-dependencies such as "give this medication after that one".
   */
  RequestGroup(
    "RequestGroup",
    "http://hl7.org/fhir/resource-types",
    "RequestGroup",
    "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".",
  ),
  /**
   * The ResearchDefinition resource describes the conditional state (population and any exposures
   * being compared within the population) and outcome (if specified) that the knowledge (evidence,
   * assertion, recommendation) is about.
   */
  ResearchDefinition(
    "ResearchDefinition",
    "http://hl7.org/fhir/resource-types",
    "ResearchDefinition",
    "The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.",
  ),
  /**
   * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence,
   * assertion, recommendation) is about.
   */
  ResearchElementDefinition(
    "ResearchElementDefinition",
    "http://hl7.org/fhir/resource-types",
    "ResearchElementDefinition",
    "The ResearchElementDefinition resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.",
  ),
  /**
   * A process where a researcher or organization plans and then executes a series of steps intended
   * to increase the field of healthcare-related knowledge. This includes studies of safety,
   * efficacy, comparative effectiveness and other information about medications, devices, therapies
   * and other interventional and investigative techniques. A ResearchStudy involves the gathering
   * of information about human or animal subjects.
   */
  ResearchStudy(
    "ResearchStudy",
    "http://hl7.org/fhir/resource-types",
    "ResearchStudy",
    "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.",
  ),
  /**
   * A physical entity which is the primary unit of operational and/or administrative interest in a
   * study.
   */
  ResearchSubject(
    "ResearchSubject",
    "http://hl7.org/fhir/resource-types",
    "ResearchSubject",
    "A physical entity which is the primary unit of operational and/or administrative interest in a study.",
  ),
  /**
   * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood
   * of each outcome.
   */
  RiskAssessment(
    "RiskAssessment",
    "http://hl7.org/fhir/resource-types",
    "RiskAssessment",
    "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.",
  ),
  /** A container for slots of time that may be available for booking appointments. */
  Schedule(
    "Schedule",
    "http://hl7.org/fhir/resource-types",
    "Schedule",
    "A container for slots of time that may be available for booking appointments.",
  ),
  /**
   * A search parameter that defines a named search item that can be used to search/filter on a
   * resource.
   */
  SearchParameter(
    "SearchParameter",
    "http://hl7.org/fhir/resource-types",
    "SearchParameter",
    "A search parameter that defines a named search item that can be used to search/filter on a resource.",
  ),
  /**
   * A record of a request for service such as diagnostic investigations, treatments, or operations
   * to be performed.
   */
  ServiceRequest(
    "ServiceRequest",
    "http://hl7.org/fhir/resource-types",
    "ServiceRequest",
    "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.",
  ),
  /** A slot of time on a schedule that may be available for booking appointments. */
  Slot(
    "Slot",
    "http://hl7.org/fhir/resource-types",
    "Slot",
    "A slot of time on a schedule that may be available for booking appointments.",
  ),
  /** A sample to be used for analysis. */
  Specimen(
    "Specimen",
    "http://hl7.org/fhir/resource-types",
    "Specimen",
    "A sample to be used for analysis.",
  ),
  /** A kind of specimen with associated set of requirements. */
  SpecimenDefinition(
    "SpecimenDefinition",
    "http://hl7.org/fhir/resource-types",
    "SpecimenDefinition",
    "A kind of specimen with associated set of requirements.",
  ),
  /**
   * A definition of a FHIR structure. This resource is used to describe the underlying resources,
   * data types defined in FHIR, and also for describing extensions and constraints on resources and
   * data types.
   */
  StructureDefinition(
    "StructureDefinition",
    "http://hl7.org/fhir/resource-types",
    "StructureDefinition",
    "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.",
  ),
  /** A Map of relationships between 2 structures that can be used to transform data. */
  StructureMap(
    "StructureMap",
    "http://hl7.org/fhir/resource-types",
    "StructureMap",
    "A Map of relationships between 2 structures that can be used to transform data.",
  ),
  /**
   * The subscription resource is used to define a push-based subscription from a server to another
   * system. Once a subscription is registered with the server, the server checks every resource
   * that is created or updated, and if the resource matches the given criteria, it sends a message
   * on the defined "channel" so that another system can take an appropriate action.
   */
  Subscription(
    "Subscription",
    "http://hl7.org/fhir/resource-types",
    "Subscription",
    "The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system can take an appropriate action.",
  ),
  /** The SubscriptionStatus resource describes the state of a Subscription during notifications. */
  SubscriptionStatus(
    "SubscriptionStatus",
    "http://hl7.org/fhir/resource-types",
    "SubscriptionStatus",
    "The SubscriptionStatus resource describes the state of a Subscription during notifications.",
  ),
  /**
   * Describes a stream of resource state changes identified by trigger criteria and annotated with
   * labels useful to filter projections from this topic.
   */
  SubscriptionTopic(
    "SubscriptionTopic",
    "http://hl7.org/fhir/resource-types",
    "SubscriptionTopic",
    "Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.",
  ),
  /** A homogeneous material with a definite composition. */
  Substance(
    "Substance",
    "http://hl7.org/fhir/resource-types",
    "Substance",
    "A homogeneous material with a definite composition.",
  ),
  /**
   * The detailed description of a substance, typically at a level beyond what is used for
   * prescribing.
   */
  SubstanceDefinition(
    "SubstanceDefinition",
    "http://hl7.org/fhir/resource-types",
    "SubstanceDefinition",
    "The detailed description of a substance, typically at a level beyond what is used for prescribing.",
  ),
  /** Record of delivery of what is supplied. */
  SupplyDelivery(
    "SupplyDelivery",
    "http://hl7.org/fhir/resource-types",
    "SupplyDelivery",
    "Record of delivery of what is supplied.",
  ),
  /** A record of a request for a medication, substance or device used in the healthcare setting. */
  SupplyRequest(
    "SupplyRequest",
    "http://hl7.org/fhir/resource-types",
    "SupplyRequest",
    "A record of a request for a medication, substance or device used in the healthcare setting.",
  ),
  /** A task to be performed. */
  Task("Task", "http://hl7.org/fhir/resource-types", "Task", "A task to be performed."),
  /**
   * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR
   * Terminology Server that may be used as a statement of actual server functionality or a
   * statement of required or desired server implementation.
   */
  TerminologyCapabilities(
    "TerminologyCapabilities",
    "http://hl7.org/fhir/resource-types",
    "TerminologyCapabilities",
    "A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.",
  ),
  /** A summary of information based on the results of executing a TestScript. */
  TestReport(
    "TestReport",
    "http://hl7.org/fhir/resource-types",
    "TestReport",
    "A summary of information based on the results of executing a TestScript.",
  ),
  /**
   * A structured set of tests against a FHIR server or client implementation to determine
   * compliance against the FHIR specification.
   */
  TestScript(
    "TestScript",
    "http://hl7.org/fhir/resource-types",
    "TestScript",
    "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.",
  ),
  /**
   * A ValueSet resource instance specifies a set of codes drawn from one or more code systems,
   * intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions
   * and their use in [coded elements](terminologies.html).
   */
  ValueSet(
    "ValueSet",
    "http://hl7.org/fhir/resource-types",
    "ValueSet",
    "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).",
  ),
  /** Describes validation requirements, source(s), status and dates for one or more elements. */
  VerificationResult(
    "VerificationResult",
    "http://hl7.org/fhir/resource-types",
    "VerificationResult",
    "Describes validation requirements, source(s), status and dates for one or more elements.",
  ),
  /** An authorization for the provision of glasses and/or contact lenses to a patient. */
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/resource-types",
    "VisionPrescription",
    "An authorization for the provision of glasses and/or contact lenses to a patient.",
  ),
  /**
   * This resource is a non-persisted resource used to pass information into and back from an
   * [operation](operations.html). It has no other use, and there is no RESTful endpoint associated
   * with it.
   */
  Parameters(
    "Parameters",
    "http://hl7.org/fhir/resource-types",
    "Parameters",
    "This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.",
  );

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
