package com.example.plugins

import com.example.routes.getAllDogs
import com.example.routes.root
import com.example.routes.searchDogs
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        root()
        getAllDogs()
        searchDogs()

        // this function
        static("/images") {
            resources("images")
        }
    }
}
