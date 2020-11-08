package com.example.coroutines_kotlin_demo.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}