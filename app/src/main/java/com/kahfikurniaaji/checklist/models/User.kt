package com.kahfikurniaaji.checklist.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("email")
    private val email: String,
    @SerializedName("username")
    private val username: String,
    @SerializedName("password")
    private val password: String
)
