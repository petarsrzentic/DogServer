package com.example

import io.ktor.application.*
import com.example.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureKoin() // this must be called first, otherwise it may have compiled time error.
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
    configureStatusPages()
}
