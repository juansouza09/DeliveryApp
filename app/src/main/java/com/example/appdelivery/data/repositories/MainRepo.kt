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

    override fun getProducts(): List<ProdutoModel> {
        var products: List<ProdutoModel> = listOf()
        apiService.getProductList().enqueue(object : Callback<List<ProdutoModel>> {

            override fun onResponse(
                call: Call<List<ProdutoModel>>,
                response: Response<List<ProdutoModel>>
            ) {

                Log.e(TAG, "onResponse: " + response.code())
                if (response.isSuccessful) {
                    products = response.body() ?: listOf()
                    Log.i("RESPONSE_BODY", response.toString())
                } else {
                    products = mutableListOf()
                }
            }

            override fun onFailure(call: Call<List<ProdutoModel>>, t: Throwable) {
                products = listOf()
                Log.e(TAG, "OnResponse: " + t.message)
            }

        })
        return products
    }
}

interface MainRepo {
    fun getProducts(): List<ProdutoModel>
}

