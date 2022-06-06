package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Dog

interface DogRepository {

    val dogs: Map<Int, List<Dog>>

    val page1: List<Dog>
    val page2: List<Dog>
    val page3: List<Dog>
    val page4: List<Dog>
    val page5: List<Dog>

    suspend fun getAllDogs(page: Int = 1): ApiResponse
    suspend fun searchDogs(name: String?): ApiResponse
}