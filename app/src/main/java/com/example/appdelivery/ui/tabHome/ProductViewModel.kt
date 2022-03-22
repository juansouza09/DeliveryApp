package com.example.appdelivery.ui.tabHome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel: ViewModel() {

    var currentTabContent: String = "Current on Tab Combos!"
    var currentTab: String = "Tab Combos!"
    private val currentTabObserver: MutableLiveData<String> = MutableLiveData()

    fun getCurrent(tab: String): String {
        if (currentTab != tab){
            currentTabContent = "Toque anterior: $currentTab\n Ultimo toque: $tab"
            currentTab = tab
        }
        return currentTabContent
    }

    fun getContentObserver(): MutableLiveData<String> = currentTabObserver
}