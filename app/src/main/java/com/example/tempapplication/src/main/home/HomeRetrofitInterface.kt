package com.example.tempapplication.src.main.home

import com.example.tempapplication.src.main.home.models.PostSignUpRequest
import com.example.tempapplication.src.main.home.models.SignUpResponse
import com.example.tempapplication.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface HomeRetrofitInterface {
    // Get의 경우, Body 사용 x

    @GET("/template/users")
    fun getUsers(): Call<UserResponse>

    @POST("/template/users")
    fun postSignUp(@Body params: PostSignUpRequest): Call<SignUpResponse>

    // Query 사용경우
    @GET("/template/users")
    fun getUsersQuery(
        @Query("query") query: Int
    ): Call<UserResponse>

    // Path 사용경우
    @GET("/template/users/{userIdx}")
    fun getUsersPath(
        @Path("userIdx") userIdx: Int
    ): Call<UserResponse>
}