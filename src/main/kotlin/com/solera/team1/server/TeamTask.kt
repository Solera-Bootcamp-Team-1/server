package com.solera.team1.server

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

val tasksFile: File = File("tasks.json")

/**
 * This is like a Java class,
 * but with getters created automatically.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Serializable
data class TeamTask(
        val teamID: Int,
        val task: String,
        val points: Int
) {
        companion object {
                @JvmStatic fun deserializeTasks(): List<TeamTask> {
                        return Json.decodeFromStream(tasksFile.inputStream())
                }
        }
}