package com.example.appdelivery.domain.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appdelivery.data.common.Common
import com.example.appdelivery.data.repositories.MainRepo
import com.example.appdelivery.data.repositories.MainRepoImpl
import com.example.appdelivery.model.ProdutoModel
import kotlinx.coroutines.launch

class MainViewModel(
) : ViewModel() {
    private val _products = MutableLiveData<List<ProdutoModel>>()
    val products: LiveData<List<ProdutoModel>> get() = _products
//    val getCatList: MutableLiveData<MutableList<ProdutoModel>>
//        get() = mainRepo.getCatModelLiveData

    init {
        val service = Common.getAPIService
        val mainRepo: MainRepo = MainRepoImpl(service)
        viewModelScope.launch {
            val productsResponse = mainRepo.getProducts()
            _products.postValue(productsResponse)
        }
    }
}