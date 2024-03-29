package com.example.pets.data.network.mapper

interface DomainMapper<in T, out Model> {
    fun toDomain(from: T): Model
    fun toDomain(from: List<T>): List<Model>
}