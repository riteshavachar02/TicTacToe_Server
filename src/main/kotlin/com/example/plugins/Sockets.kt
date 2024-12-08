package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.websocket.*
import kotlin.time.toKotlinDuration
import java.time.Duration as JavaDuration

fun Application.configureSockets() {
    install(WebSockets) {
        pingPeriod = JavaDuration.ofSeconds(15).toKotlinDuration() // Convert to kotlin.time.Duration
        timeout = JavaDuration.ofSeconds(15).toKotlinDuration()    // Convert to kotlin.time.Duration
        maxFrameSize = Long.MAX_VALUE
        masking = false
    }
}
