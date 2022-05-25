package com.example.appdelivery.data.repositories

import com.example.appdelivery.data.network.APIService
import com.example.appdelivery.model.ProdutoModel

class MainRepoImpl(
    private val apiService: APIService
) : MainRepo {

    companion object {
        private const val TAG = "MainRepo"
    }

    override suspend fun getProducts(): List<ProdutoModel> {
        var products: List<ProdutoModel> = listOf()
        return apiService.getProductList()
    }
}

interface MainRepo {
    suspend fun getProducts(): List<ProdutoModel>
}
