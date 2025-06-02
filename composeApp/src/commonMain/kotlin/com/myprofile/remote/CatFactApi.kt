package com.myprofile.remote

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.serialization.Serializable

class CatFactApi(
    private val client: HttpClient
) {
    private val baseUrl = "https://catfact.ninja"

    suspend fun getFact() = client.get("$baseUrl/fact").body<CatFactResponseDto>()
}

@Serializable
data class CatFactResponseDto(val fact: String)