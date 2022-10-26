package com.example.kotlinpreperation.retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface NetworkCallsInterface {
    @GET("/api/users?page=2")
    suspend fun getAllUserResponse() : Response<UsersResponse>
}