package com.example.tempapplication.src.main.home

import com.example.tempapplication.src.main.home.models.SignUpResponse
import com.example.tempapplication.src.main.home.models.UserResponse

interface HomeView {
    fun onGetUserSuccess(response: UserResponse)

    fun onGetUserFailure(message: String)

    fun onPostSignUpSuccess(response: SignUpResponse)

    fun onPostSignUpFailure(response: String)
}