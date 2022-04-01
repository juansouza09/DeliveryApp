package com.example.appdelivery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appdelivery.databinding.ActivityLoginAndCadastroBinding
import com.example.appdelivery.ui.tablayout.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginAndCadastroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginAndCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = binding.tabLayout
        val viewPager2 = binding.viewPager2

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) {tab, position ->
            when(position){
                0 -> {
                    tab.text = "Login"
                }
                1 -> {
                    tab.text = "Cadastro"
                }
            }
        }.attach()
    }
}