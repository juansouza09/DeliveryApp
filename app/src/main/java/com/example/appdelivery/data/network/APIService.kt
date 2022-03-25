package com.example.appdelivery.data.network

import com.example.appdelivery.model.ProdutoModel
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("Products")
    fun getProductList(): Call<MutableList<ProdutoModel>>
}