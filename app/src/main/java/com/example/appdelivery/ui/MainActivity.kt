package com.example.appdelivery.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.appdelivery.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val button = findViewById<ImageButton>(R.id.buttonDashboard)

        button.setOnClickListener {
            abrirLogin()
        }
    }

    private fun abrirLogin() {
        val loginTela = Intent(this, LoginActivity::class.java)
        startActivity(loginTela)

    }
}