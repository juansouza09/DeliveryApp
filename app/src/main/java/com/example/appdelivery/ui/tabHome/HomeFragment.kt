package com.example.appdelivery.ui.tabHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appdelivery.R
import com.example.appdelivery.databinding.FragmentHomeBinding
import com.example.appdelivery.ui.tabHome.adapters.TabFragPageAdapter
import com.example.appdelivery.ui.tabHome.listeners.CustomTabLayoutClickListener

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
        observeProductState()
        setTabs()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun observeProductState(){

    }

    private fun setTabs(){
        val fm = requireActivity().supportFragmentManager
        val adapter = TabFragPageAdapter(fm, lifecycle)
        binding?.let {
            it.viewPagerHome.adapter = adapter
            it.tabLayout.addOnTabSelectedListener(CustomTabLayoutClickListener(it.viewPagerHome))
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}