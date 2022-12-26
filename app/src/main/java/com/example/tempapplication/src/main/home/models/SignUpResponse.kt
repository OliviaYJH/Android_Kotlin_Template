package com.example.tempapplication.src.main.home.models

import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @SerializedName("result") val result: ResultSignUp
)
