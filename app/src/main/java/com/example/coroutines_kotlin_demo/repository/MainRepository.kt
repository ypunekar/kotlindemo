package com.example.coroutines_kotlin_demo.repository

import com.example.coroutines_kotlin_demo.api.ApiHelper


class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}