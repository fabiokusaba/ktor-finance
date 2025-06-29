package dev.fabiokusaba.plugins

import io.ktor.server.application.*
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

// Basicamente vai centralizar aqui pra gente tudo o que é framework relacionado e está fora do
// nosso projeto, no nosso caso temos o Koin (injeção de dependência)
fun Application.configureFrameworks() {
    install(Koin) {
        slf4jLogger()
        modules(module {})
    }
}
