package com.kahfikurniaaji.checklist.utilities

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    fun getRetorClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://94.74.86.174:8080/api")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}