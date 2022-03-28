package com.example.appdelivery.data.network

import com.example.appdelivery.model.ProdutoModel
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("api/Products")
    fun getProductList(): Call<List<ProdutoModel>>
}