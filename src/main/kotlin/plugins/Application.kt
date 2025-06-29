package dev.fabiokusaba.plugins

import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain

// Ponto de partida da nossa aplicação Ktor
fun main(args: Array<String>) {
    EngineMain.main(args)
}

// Coração do nosso backend onde esta localizado os modulos, ou seja, vai carregar todos os plugins
// que foram adicionados na criação do projeto
fun Application.module() {
    configureFrameworks()
    configureSerialization()
    configureStatusPage()
    configureMonitoring()
    configureRouting()
}
