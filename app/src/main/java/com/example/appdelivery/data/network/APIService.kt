package com.example.appdelivery.data.network

import com.example.appdelivery.model.LoginResponse
import com.example.appdelivery.model.ProdutoModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface APIService {

    @FormUrlEncoded
    @GET("api/Products")
    fun getProductList(): List<ProdutoModel>

    @FormUrlEncoded
    @POST("api/User/authenticate")
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<LoginResponse>

}