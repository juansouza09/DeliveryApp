package com.example.appdelivery.domain.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appdelivery.data.repositories.MainRepo
import com.example.appdelivery.model.ProdutoModel

class MainViewModel: ViewModel(){
    private val mainRepo: MainRepo
    val getCatList: MutableLiveData<MutableList<ProdutoModel>>
        get() = mainRepo.getCatModelLiveData

    init {
        mainRepo = MainRepo()
    }
}