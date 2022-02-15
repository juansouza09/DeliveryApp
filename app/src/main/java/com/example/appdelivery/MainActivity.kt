package com.example.appdelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_screen)

        val button = findViewById<Button>(R.id.buttonDashboard)

        button.setOnClickListener {
            abrirLogin()
        }
    }
    private fun abrirLogin(){
        val loginTela = Intent(this, LoginActivity::class.java)
        startActivity(loginTela)
    }
}