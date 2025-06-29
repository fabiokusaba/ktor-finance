package dev.fabiokusaba.plugins

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import kotlinx.serialization.json.Json

// Parte de serialização onde a gente vai configurar o nosso plugin Content Negotiation para que
// os objetos que estejam vindo serializados tanto das nossas requisições quanto das nossas responses
fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json(Json {
            prettyPrint = true // torna o JSON mais legível
            isLenient = true // permite flexibilização na formatação do JSON
            ignoreUnknownKeys = true // ignorar campos desconhecidos
        })
    }
}
