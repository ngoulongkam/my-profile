package com.myprofile.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun provideHttpClient() = HttpClient {
    install(ContentNegotiation) {
        json(
            Json {
                coerceInputValues = true
                ignoreUnknownKeys = true
                isLenient = true
            },
            contentType = ContentType.parse("application/json")
        )
    }

    install(Logging) {
        logger = Logger.DEFAULT
        level = LogLevel.NONE
    }
}