package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Dog(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val gender: String,
    val distance: String,
    val age: Double,
    val weight: Double,
    val color: String
)
