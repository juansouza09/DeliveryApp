package com.example.appdelivery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.appdelivery.R
import com.example.appdelivery.databinding.ActivityPrincipalBinding
import com.example.appdelivery.ui.tablayout.fragments.FavoritosFragment
import com.example.appdelivery.ui.tablayout.fragments.HistoricoFragment
import com.example.appdelivery.ui.tabHome.HomeFragment
import com.example.appdelivery.ui.tablayout.fragments.PerfilFragment

class HomeActivity : AppCompatActivity() {

    private var homeFragment = HomeFragment()
    private lateinit var binding: ActivityPrincipalBinding
    private var favoritosFragment = FavoritosFragment()
    private var perfilFragment = PerfilFragment()
    private var historicoFragment = HistoricoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation = binding.bottomNavigation
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeFragment2 -> replaceFragment(homeFragment)
                R.id.favoriteFragment2 -> replaceFragment(favoritosFragment)
                R.id.perfilFragment -> replaceFragment(perfilFragment)
                R.id.historicFragment -> replaceFragment(historicoFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.navHostFragment, fragment)
        transaction.commit()
    }
}