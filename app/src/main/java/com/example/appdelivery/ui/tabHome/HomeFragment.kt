package com.example.appdelivery.ui.tabHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appdelivery.R
import com.example.appdelivery.databinding.FragmentHomeBinding
import com.example.appdelivery.ui.tabHome.adapters.TabFragPageAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setTabs()
        addTabsToPageIndicator()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setTabs(){
        val fm = requireActivity().supportFragmentManager
        val adapter = TabFragPageAdapter(fm, lifecycle)
        binding?.let {
            it.viewPagerHome.adapter = adapter
        }
    }

    private fun addTabsToPageIndicator() {
        binding?.let {
            TabLayoutMediator(
                it.tabLayout,
                it.viewPagerHome
            ) {tab, position ->
                when(position){
                    0 -> {
                        tab.text = "Combos"
                    }
                    1 -> {
                        tab.text = "Burgers"
                    }
                    2 -> {
                        tab.text = "Bebidas"
                    }
                    3 -> {
                        tab.text = "Sobremesas"
                    }
                }
            }.attach()
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}