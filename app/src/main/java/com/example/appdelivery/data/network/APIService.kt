package com.example.appdelivery.data.network

import com.example.appdelivery.model.ProdutoModel
import retrofit2.http.GET

interface APIService {

    @GET("api/Products")
    suspend fun getProductList(): List<ProdutoModel>
}