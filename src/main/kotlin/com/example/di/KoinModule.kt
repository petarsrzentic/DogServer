package com.example.di

import com.example.repository.DogRepository
import com.example.repository.DogRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<DogRepository> {
        DogRepositoryImpl()
    }
}