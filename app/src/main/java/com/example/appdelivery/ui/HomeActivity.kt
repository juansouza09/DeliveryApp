package com.example.appdelivery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.appdelivery.R
import com.example.appdelivery.databinding.ActivityPrincipalBinding

class HomeActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.navHostFragment) }
    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation = binding.bottomNavigation
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            navController.navigate(item.itemId)
            true
        }
        bottomNavigation.setupWithNavController(navController)
    }
}