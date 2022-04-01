package com.example.appdelivery.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appdelivery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDashboard.setOnClickListener {
            abrirLogin()
        }
    }

    private fun abrirLogin() {
        val loginTela = Intent(this, LoginActivity::class.java)
        startActivity(loginTela)
    }
}