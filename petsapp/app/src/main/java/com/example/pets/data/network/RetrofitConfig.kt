package com.example.pets.data.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitConfig {

    val service: PetsApi = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder()
                    .addLast(KotlinJsonAdapterFactory())
                    .build()
            )
        )
        .build()
        .create(PetsApi::class.java)
}