package com.example.routes

import com.example.repository.DogRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchDogs() {

    val dogRepository: DogRepository by inject()

    get("/dog/allDogs/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = dogRepository.searchDogs(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}