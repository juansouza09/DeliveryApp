package com.example.appdelivery.data.repositories

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.appdelivery.data.common.Common
import com.example.appdelivery.data.network.APIService
import com.example.appdelivery.model.ProdutoModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepo {
    private val apiService: APIService

    companion object {
        private const val TAG = "MainRepo"
    }

    init {
        apiService = Common.getAPIService
    }

    val getCatModelLiveData: MutableLiveData<MutableList<ProdutoModel>>
        get() {
            val data: MutableLiveData<MutableList<ProdutoModel>> =
                MutableLiveData<MutableList<ProdutoModel>>()
            apiService.getProductList().enqueue(object : Callback<MutableList<ProdutoModel>> {
                override fun onResponse(
                    call: Call<MutableList<ProdutoModel>>,
                    response: Response<MutableList<ProdutoModel>>
                ) {
                    Log.e(TAG, "onResponse: " + response.code())
                    if (response.isSuccessful){
                        data.value = response.body()
                    }
                    else {
                        data.value = mutableListOf()
                    }
                }

                override fun onFailure(call: Call<MutableList<ProdutoModel>>, t: Throwable) {
                    Log.e(TAG, "OnResponse: " + t.message)
                    data.value = mutableListOf()
                }

            })
            return data
        }
}