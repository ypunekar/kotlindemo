package com.example.coroutines_kotlin_demo.api

import com.example.coroutines_kotlin_demo.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}