package com.example.appdelivery.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appdelivery.databinding.ActivityDetalhesBinding
import com.example.appdelivery.databinding.FragmentCarrinhoVazioBinding
import com.example.appdelivery.databinding.ItemViewPesquisaBinding.inflate

class DetalhesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}