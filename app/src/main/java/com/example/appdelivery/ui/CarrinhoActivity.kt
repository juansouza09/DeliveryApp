package com.example.appdelivery.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.appdelivery.R
import com.example.appdelivery.ui.tablayout.fragments.FavoritosFragment
import com.example.appdelivery.ui.tablayout.fragments.HistoricoFragment
import com.example.appdelivery.ui.tabHome.HomeFragment
import com.example.appdelivery.ui.tablayout.fragments.PerfilFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class CarrinhoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_carrinho_vazio)
        newBuy()
        toBack()
    }

    private fun toBack() {
        val btn = findViewById<ImageButton>(R.id.btn_back_carrinho)
        val intent = Intent(this, HomeActivity::class.java)
        btn.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun newBuy() {
        val btnBuy = findViewById<ImageButton>(R.id.bnt_login)
        val intent = Intent(this, HomeActivity::class.java)
        btnBuy.setOnClickListener {
            startActivity(intent)
        }
    }

}