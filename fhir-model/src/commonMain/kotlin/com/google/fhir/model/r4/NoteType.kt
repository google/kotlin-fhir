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

package com.google.fhir.model.r4

import kotlin.String

/** The presentation types of notes. */
public enum class NoteType(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** Display the note. */
  Display("display", "http://hl7.org/fhir/note-type", "Display", "Display the note."),
  /** Print the note on the form. */
  Print("print", "http://hl7.org/fhir/note-type", "Print (Form)", "Print the note on the form."),
  /** Print the note for the operator. */
  Printoper(
    "printoper",
    "http://hl7.org/fhir/note-type",
    "Print (Operator)",
    "Print the note for the operator.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): NoteType =
      when (code) {
        "display" -> Display
        "print" -> Print
        "printoper" -> Printoper
        else -> throw IllegalArgumentException("Unknown code $code for enum NoteType")
      }
  }
}
