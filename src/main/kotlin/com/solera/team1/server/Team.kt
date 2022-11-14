package com.solera.team1.server

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

val teamsFile: File = File("teams.json")

/**
 * This is like a Java class,
 * but with getters created automatically.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Serializable
data class Team(
        val id: Int,
        val name: String,
) {
        companion object {
                @JvmStatic fun deserializeTeams(): List<Team> {
                        return Json.decodeFromStream(teamsFile.inputStream())
                }
        }
}