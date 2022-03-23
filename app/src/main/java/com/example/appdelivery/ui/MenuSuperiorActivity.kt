package com.example.appdelivery.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    }
}