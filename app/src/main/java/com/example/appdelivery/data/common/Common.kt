package com.example.appdelivery.data.common

import com.example.appdelivery.data.network.APIService
import com.example.appdelivery.data.network.Retrofit

object Common {
    private const val BASE_URL = "https://lionburger.azurewebsites.net/"
    val getAPIService : APIService
        get() = Retrofit.getRetrofitClient(BASE_URL).create(APIService::class.java)
}