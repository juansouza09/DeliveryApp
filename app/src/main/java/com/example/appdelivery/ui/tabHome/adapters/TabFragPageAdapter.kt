package com.example.appdelivery.ui.tabHome.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appdelivery.ui.tabHome.tabs.BebidasFragment
import com.example.appdelivery.ui.tabHome.tabs.BurgersFragment
import com.example.appdelivery.ui.tabHome.tabs.CombosFragment
import com.example.appdelivery.ui.tabHome.tabs.SobremesasFragment

class TabFragPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return NUMBER_OF_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CombosFragment()
            1 -> BurgersFragment()
            2 -> BebidasFragment()
            3 -> SobremesasFragment()
            else -> Fragment()
        }
    }

    companion object {
        const val NUMBER_OF_TABS = 4
    }
}