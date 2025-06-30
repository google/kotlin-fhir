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

/**
 * This example FHIR value set is comprised of example Actor Type codes, which can be used to value
 * FHIR agents, actors, and other role elements such as those specified in financial transactions.
 * The FHIR Actor value set is based on DICOM Audit Message, C402; ASTM Standard, E1762-95 [2013];
 * selected codes and derived actor roles from HL7 RoleClass OID 2.16.840.1.113883.5.110; HL7 Role
 * Code 2.16.840.1.113883.5.111, including AgentRoleType; HL7 ParticipationType OID:
 * 2.16.840.1.113883.5.90; and HL7 ParticipationFunction codes OID: 2.16.840.1.113883.5.88. This
 * value set includes, by reference, role codes from external code systems: NUCC Health Care
 * Provider Taxonomy OID: 2.16.840.1.113883.6.101; North American Industry Classification System
 * [NAICS]OID: 2.16.840.1.113883.6.85; IndustryClassificationSystem 2.16.840.1.113883.1.11.16039;
 * and US Census Occupation Code OID: 2.16.840.1.113883.6.243 for relevant recipient or custodian
 * codes not included in this value set. If no source is indicated in the definition comments, then
 * these are example FHIR codes. It can be extended with appropriate roles described by SNOMED as
 * well as those described in the HL7 Role Based Access Control Catalog and the HL7 Healthcare
 * (Security and Privacy) Access Control Catalog. In Role-Based Access Control (RBAC), permissions
 * are operations on an object that a user wishes to access. Permissions are grouped into roles. A
 * role characterizes the functions a user is allowed to perform. Roles are assigned to users. If
 * the user's role has the appropriate permissions to access an object, then that user is granted
 * access to the object. FHIR readily enables RBAC, as FHIR Resources are object types and the CRUDE
 * events (the FHIR equivalent to permissions in the RBAC scheme) are operations on those objects.
 * In Attribute-Based Access Control (ABAC), a user requests to perform operations on objects. That
 * user's access request is granted or denied based on a set of access control policies that are
 * specified in terms of attributes and conditions. FHIR readily enables ABAC, as instances of a
 * Resource in FHIR (again, Resources are object types) can have attributes associated with them.
 * These attributes include security tags, environment conditions, and a host of user and object
 * characteristics, which are the same attributes as those used in ABAC. Attributes help define the
 * access control policies that determine the operations a user may perform on a Resource (in FHIR)
 * or object (in ABAC). For example, a tag (or attribute) may specify that the identified Resource
 * (object) is not to be further disclosed without explicit consent from the patient.
 */
public enum class AuditAgentRole(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Amender("AMENDER", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Coauth("COAUTH", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Cont("CONT", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Evtwit("EVTWIT", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Primauth("PRIMAUTH", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Reviewer("REVIEWER", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Source("SOURCE", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Trans("TRANS", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Valid("VALID", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Verf("VERF", "http://terminology.hl7.org/CodeSystem/contractsignertypecodes", null, null),
  Affl("AFFL", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Agnt("AGNT", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Assigned("ASSIGNED", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Claim("CLAIM", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Covpty("COVPTY", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Depen("DEPEN", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Econ("ECON", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Emp("EMP", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Guard("GUARD", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Invsbj("INVSBJ", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Named("NAMED", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Nok("NOK", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Pat("PAT", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Prov("PROV", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Not("NOT", "http://terminology.hl7.org/CodeSystem/v3-RoleClass", null, null),
  Classifier("CLASSIFIER", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Consenter("CONSENTER", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Conswit("CONSWIT", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Copart("COPART", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Declassifier("DECLASSIFIER", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Delegatee("DELEGATEE", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Delegator("DELEGATOR", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Downgrder("DOWNGRDER", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Dpowatt("DPOWATT", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Excest("EXCEST", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Grantee("GRANTEE", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Grantor("GRANTOR", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Gt("GT", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Guadltm("GUADLTM", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Hpowatt("HPOWATT", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Intprter("INTPRTER", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Powatt("POWATT", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Resprsn("RESPRSN", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Spowatt("SPOWATT", "http://terminology.hl7.org/CodeSystem/v3-RoleCode", null, null),
  Aucg("AUCG", "http://terminology.hl7.org/CodeSystem/v3-ParticipationFunction", null, null),
  Aulr("AULR", "http://terminology.hl7.org/CodeSystem/v3-ParticipationFunction", null, null),
  Autm("AUTM", "http://terminology.hl7.org/CodeSystem/v3-ParticipationFunction", null, null),
  Auwa("AUWA", "http://terminology.hl7.org/CodeSystem/v3-ParticipationFunction", null, null),
  Promsk("PROMSK", "http://terminology.hl7.org/CodeSystem/v3-ParticipationFunction", null, null),
  Aut("AUT", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  Cst("CST", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  Inf("INF", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  Ircp("IRCP", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  La("LA", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  Trc("TRC", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  Wit("WIT", "http://terminology.hl7.org/CodeSystem/v3-ParticipationType", null, null),
  /**
   * An entity providing authorization services to enable the electronic sharing of health-related
   * information based on resource owner's preapproved permissions. For example, an UMA
   * Authorization Server[UMA]
   */
  Authserver(
    "authserver",
    "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
    "authorization server",
    "An entity providing authorization services to enable the electronic sharing of health-related information based on resource owner's preapproved permissions. For example, an UMA Authorization Server[UMA]",
  ),
  /**
   * An entity that collects information over which the data subject may have certain rights under
   * policy or law to control that information's management and distribution by data collectors,
   * including the right to access, retrieve, distribute, or delete that information.
   */
  Datacollector(
    "datacollector",
    "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
    "data collector",
    "An entity that collects information over which the data subject may have certain rights under policy or law to control that information's management and distribution by data collectors, including the right to access, retrieve, distribute, or delete that information.",
  ),
  /**
   * An entity that processes collected information over which the data subject may have certain
   * rights under policy or law to control that information's management and distribution by data
   * processors, including the right to access, retrieve, distribute, or delete that information.
   */
  Dataprocessor(
    "dataprocessor",
    "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
    "data processor",
    "An entity that processes collected information over which the data subject may have certain rights under policy or law to control that information's management and distribution by data processors, including the right to access, retrieve, distribute, or delete that information.",
  ),
  /**
   * A person whose personal information is collected or processed, and who may have certain rights
   * under policy or law to control that information's management and distribution by data
   * collectors or processors, including the right to access, retrieve, distribute, or delete that
   * information.
   */
  Datasubject(
    "datasubject",
    "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
    "data subject",
    "A person whose personal information is collected or processed, and who may have certain rights under policy or law to control that information's management and distribution by data collectors or processors, including the right to access, retrieve, distribute, or delete that information.",
  ),
  /** The human user that has participated. */
  Humanuser(
    "humanuser",
    "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
    "human user",
    "The human user that has participated.",
  ),
  /** Audit participant role ID of software application */
  _110150(
    "110150",
    "http://dicom.nema.org/resources/ontology/DCM",
    "Application",
    "Audit participant role ID of software application",
  ),
  /**
   * Audit participant role ID of software application launcher, i.e., the entity that started or
   * stopped an application
   */
  _110151(
    "110151",
    "http://dicom.nema.org/resources/ontology/DCM",
    "Application Launcher",
    "Audit participant role ID of software application launcher, i.e., the entity that started or stopped an application",
  ),
  /** Audit participant role ID of the receiver of data */
  _110152(
    "110152",
    "http://dicom.nema.org/resources/ontology/DCM",
    "Destination Role ID",
    "Audit participant role ID of the receiver of data",
  ),
  /** Audit participant role ID of the sender of data */
  _110153(
    "110153",
    "http://dicom.nema.org/resources/ontology/DCM",
    "Source Role ID",
    "Audit participant role ID of the sender of data",
  ),
  /** Audit participant role ID of media receiving data during an export */
  _110154(
    "110154",
    "http://dicom.nema.org/resources/ontology/DCM",
    "Destination Media",
    "Audit participant role ID of media receiving data during an export",
  ),
  /** Audit participant role ID of media providing data during an import */
  _110155(
    "110155",
    "http://dicom.nema.org/resources/ontology/DCM",
    "Source Media",
    "Audit participant role ID of media providing data during an import",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): AuditAgentRole =
      when (code) {
        "AMENDER" -> Amender
        "COAUTH" -> Coauth
        "CONT" -> Cont
        "EVTWIT" -> Evtwit
        "PRIMAUTH" -> Primauth
        "REVIEWER" -> Reviewer
        "SOURCE" -> Source
        "TRANS" -> Trans
        "VALID" -> Valid
        "VERF" -> Verf
        "AFFL" -> Affl
        "AGNT" -> Agnt
        "ASSIGNED" -> Assigned
        "CLAIM" -> Claim
        "COVPTY" -> Covpty
        "DEPEN" -> Depen
        "ECON" -> Econ
        "EMP" -> Emp
        "GUARD" -> Guard
        "INVSBJ" -> Invsbj
        "NAMED" -> Named
        "NOK" -> Nok
        "PAT" -> Pat
        "PROV" -> Prov
        "NOT" -> Not
        "CLASSIFIER" -> Classifier
        "CONSENTER" -> Consenter
        "CONSWIT" -> Conswit
        "COPART" -> Copart
        "DECLASSIFIER" -> Declassifier
        "DELEGATEE" -> Delegatee
        "DELEGATOR" -> Delegator
        "DOWNGRDER" -> Downgrder
        "DPOWATT" -> Dpowatt
        "EXCEST" -> Excest
        "GRANTEE" -> Grantee
        "GRANTOR" -> Grantor
        "GT" -> Gt
        "GUADLTM" -> Guadltm
        "HPOWATT" -> Hpowatt
        "INTPRTER" -> Intprter
        "POWATT" -> Powatt
        "RESPRSN" -> Resprsn
        "SPOWATT" -> Spowatt
        "AUCG" -> Aucg
        "AULR" -> Aulr
        "AUTM" -> Autm
        "AUWA" -> Auwa
        "PROMSK" -> Promsk
        "AUT" -> Aut
        "CST" -> Cst
        "INF" -> Inf
        "IRCP" -> Ircp
        "LA" -> La
        "IRCP" -> Ircp
        "TRC" -> Trc
        "WIT" -> Wit
        "authserver" -> Authserver
        "datacollector" -> Datacollector
        "dataprocessor" -> Dataprocessor
        "datasubject" -> Datasubject
        "humanuser" -> Humanuser
        "110150" -> _110150
        "110151" -> _110151
        "110152" -> _110152
        "110153" -> _110153
        "110154" -> _110154
        "110155" -> _110155
        else -> throw IllegalArgumentException("Unknown code $code for enum AuditAgentRole")
      }
  }
}
