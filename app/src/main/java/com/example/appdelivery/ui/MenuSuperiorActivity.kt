package com.example.appdelivery.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appdelivery.R
import com.example.appdelivery.databinding.FragmentMenuSuperiorBinding
import com.example.appdelivery.ui.tablayout.fragments.FavoritosFragment
import com.example.appdelivery.ui.tablayout.fragments.HistoricoFragment
import com.example.appdelivery.ui.tabHome.HomeFragment
import com.example.appdelivery.ui.tablayout.fragments.PerfilFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuSuperiorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_menu_superior)
        toBack()
        openProfile()
        openBag()
        openPromo()
        exitAccount()
    }

    private fun toBack() {
        val btn = findViewById<ImageButton>(R.id.btn_voltar)
        val intent = Intent(this, HomeActivity::class.java)
        btn.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun openProfile() {
        val btn = findViewById<Button>(R.id.btn_perfil)
        val intent = Intent(this, HomeActivity::class.java)
        btn.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun openBag() {
        val btn = findViewById<Button>(R.id.btn_carrinho)
        val intent = Intent(this, CarrinhoActivity::class.java)
        btn.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun openPromo() {
        val btn = findViewById<Button>(R.id.btn_promo)
        val intent = Intent(this, HomeActivity::class.java)
        btn.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun exitAccount() {
        val btn = findViewById<Button>(R.id.btn_sair_da_conta)
        val intent = Intent(this, LoginActivity::class.java)
        btn.setOnClickListener {
            Toast.makeText(this, "Conta deslogada!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}