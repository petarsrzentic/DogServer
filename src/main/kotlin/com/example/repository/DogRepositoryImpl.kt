package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Dog

const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"

class DogRepositoryImpl : DogRepository {
    override val dogs: Map<Int, List<Dog>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
        )
    }

    override val page1: List<Dog> = listOf(
        Dog(
            id = 1,
            name = "Davis",
            image = "/images/Davis1.jpg",
            about = "Davis is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "224m away",
            age = 1.5,
            weight = 14.1,
            color = "creme"
        ),
        Dog(
            id = 2,
            name = "Marry",
            image = "/images/Marry1.jpg",
            about = "Marry is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "female",
            distance = "224m away",
            age = 1.0,
            weight = 6.8,
            color = "black"
        ),
        Dog(
            id = 3,
            name = "Alicia",
            image = "/images/Alicia1.jpg",
            about = "Alicia is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "female",
            distance = "748m away",
            age = 3.5,
            weight = 7.7,
            color = "black/white/brown"
        )

    )
    override val page2: List<Dog> = listOf(
        Dog(
            id = 4,
            name = "Pierre",
            image = "/images/Pierre1.jpg",
            about = "Pierre is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book!",
            gender = "male",
            distance = "224m away",
            age = 2.1,
            weight = 4.2,
            color = "black/white"
        ),
        Dog(
            id = 5,
            name = "Bern",
            image = "/images/Bern1.jpg",
            about = "Bern is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            gender = "male",
            distance = "660, away",
            age = 6.5,
            weight = 11.3,
            color = "brown"
        ),
        Dog(
            id = 6,
            name = "Lilly",
            image = "/images/Lilly1.jpg",
            about = "Lilly is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "female",
            distance = "138m away",
            age = 4.5,
            weight = 9.6,
            color = "white"
        )
    )
    override val page3: List<Dog> = listOf(
        Dog(
            id = 7,
            name = "Mike",
            image = "/images/Mike1.jpg",
            about = "Mike is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "1km away",
            age = 0.5,
            weight = 1.2,
            color = "brown/white"
        ),
        Dog(
            id = 8,
            name = "Fred",
            image = "/images/Fred1.jpg",
            about = "Fred is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "1,2km away",
            age = 0.6,
            weight = 0.8,
            color = "brown,white"
        ),
        Dog(
            id = 9,
            name = "Rex",
            image = "/images/Rex1.jpg",
            about = "Rex is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "1,5km away",
            age = 1.5,
            weight = 8.9,
            color = "black/brown,white"
        )
    )
    override val page4: List<Dog> = listOf(
        Dog(
            id = 10,
            name = "Jacky",
            image = "/images/Jacky1.jpg",
            about = "Jacky is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "330m away",
            age = 2.3,
            weight = 4.6,
            color = "creme/white"
        ),
        Dog(
            id = 11,
            name = "Nelly",
            image = "/images/Nelly1.jpg",
            about = "Nelly is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "female",
            distance = "754m away",
            age = 4.1,
            weight = 10.4,
            color = "black/brown"
        ),
        Dog(
            id = 12,
            name = "Loco",
            image = "/images/Loco1.jpg",
            about = "Loco is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "614m away",
            age = 3.1,
            weight = 9.9,
            color = "brown"
        )

    )
    override val page5: List<Dog> = listOf(
        Dog(
            id = 13,
            name = "Rosemary",
            image = "/images/Rosemary1.jpg",
            about = "Rosemary is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "female",
            distance = "294m away",
            age = 2.4,
            weight = 3.4,
            color = "brown/orange"
        ),
        Dog(
            id = 14,
            name = "Fifi",
            image = "/images/Fifi1.jpg",
            about = "Fifi is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "female",
            distance = "582m away",
            age = 3.5,
            weight = 5.8,
            color = "brown"
        ),
        Dog(
            id = 15,
            name = "Marley",
            image = "/images/Marley1.jpg",
            about = "Rosemary is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            gender = "male",
            distance = "904m away",
            age = 9.4,
            weight = 11.7,
            color = "yellow/gold"
        )
    )


    override suspend fun getAllDogs(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            dogs = dogs[page]!!
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf("prevPage" to prevPage, "nextPage" to nextPage)
    }

    override suspend fun searchDogs(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            dogs = findDogs(query = name)
        )
    }

    private fun findDogs(query: String?): List<Dog> {
        val founded = mutableListOf<Dog>()
        return if (!query.isNullOrEmpty()) {
            dogs.forEach { (_, dogs) ->
                dogs.forEach { dog ->
                    if (dog.name.lowercase().contains(query.lowercase())) {
                        founded.add(dog)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}