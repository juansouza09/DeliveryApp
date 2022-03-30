package com.example.appdelivery.data.repositories

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.appdelivery.data.common.Common
import com.example.appdelivery.data.network.APIService
import com.example.appdelivery.model.ProdutoModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepoImpl(
    private val apiService: APIService
) : MainRepo {

    companion object {
        private const val TAG = "MainRepo"
    }

//    init {
//        apiService = Common.getAPIService
//    }

//    val getCatModelLiveData: MutableLiveData<MutableList<ProdutoModel>>
//        get() {
//            val data: MutableLiveData<MutableList<ProdutoModel>> =
//                MutableLiveData<MutableList<ProdutoModel>>()
//
//            return data
//        }

    override suspend fun getProducts(): List<ProdutoModel> {
        var products: List<ProdutoModel> = listOf()
        return apiService.getProductList()
    }
}

interface MainRepo {
    suspend fun getProducts(): List<ProdutoModel>
}

