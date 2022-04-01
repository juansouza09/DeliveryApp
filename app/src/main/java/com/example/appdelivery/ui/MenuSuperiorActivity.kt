package com.example.appdelivery.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appdelivery.databinding.ActivityMenuSuperiorBinding

class MenuSuperiorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuSuperiorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuSuperiorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toBack()
        openProfile()
        openBag()
        openPromo()
        exitAccount()
    }

    private fun toBack() {
        val intent = Intent(this, HomeActivity::class.java)
        binding.btnVoltar.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun openProfile() {
        val intent = Intent(this, HomeActivity::class.java)
        binding.btnPerfil.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun openBag() {
        val intent = Intent(this, CarrinhoActivity::class.java)
        binding.btnCarrinho.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun openPromo() {
        val intent = Intent(this, HomeActivity::class.java)
        binding.btnPromo.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun exitAccount() {
        val intent = Intent(this, LoginActivity::class.java)
        binding.btnSairDaConta.setOnClickListener {
            Toast.makeText(this, "Conta deslogada!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}