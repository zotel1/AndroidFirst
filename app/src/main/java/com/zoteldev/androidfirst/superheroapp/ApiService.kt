package com.zoteldev.androidfirst.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/acces-token/search/{name}")
    suspend fun getSuperheroes(@Path("name") superHeroName :String):Response<SuperHeroDataResponse>
}