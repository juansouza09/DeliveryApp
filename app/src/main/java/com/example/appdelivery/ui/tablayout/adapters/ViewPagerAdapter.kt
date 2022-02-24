package com.example.appdelivery.ui.tablayout.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appdelivery.ui.tablayout.fragments.CadastroFragment
import com.example.appdelivery.ui.tablayout.fragments.LoginFragment

class ViewPagerAdapter(fragmenManager : FragmentManager, lifecycle : Lifecycle): FragmentStateAdapter(fragmenManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
       return  when(position){
            0 -> {
                LoginFragment()
            }
            1 -> {
                CadastroFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}