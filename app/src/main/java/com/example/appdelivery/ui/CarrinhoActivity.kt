package com.example.appdelivery.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appdelivery.databinding.FragmentCarrinhoVazioBinding

class CarrinhoActivity : AppCompatActivity() {

    private lateinit var binding: FragmentCarrinhoVazioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentCarrinhoVazioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        newBuy()
        toBack()
    }

    private fun toBack() {
        val intent = Intent(this, HomeActivity::class.java)
        binding.btnBackCarrinho.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun newBuy() {
        val intent = Intent(this, HomeActivity::class.java)
        binding.bntLogin.setOnClickListener {
            startActivity(intent)
        }
    }

}