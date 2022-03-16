package com.example.appdelivery.ui.tablayout.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.appdelivery.User
import com.example.appdelivery.databinding.FragmentCadastroBinding
import com.example.appdelivery.ui.HomeActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class CadastroFragment : Fragment() {

    private var _binding: FragmentCadastroBinding? = null
    private val binding get() = _binding!!
    private lateinit var myRef : DatabaseReference
    private val userId = "userid-dummy"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCadastroBinding.inflate(inflater, container, false)

        val name = binding.name.editText?.text.toString()
        val username = binding.loginText.editText?.text.toString()
        val password = binding.senha.editText?.text.toString()

        binding.bntCadastro.setOnClickListener {
            val user = User(name, username, password)
            myRef.child("users").setValue(user).addOnSuccessListener {

                Log.e("Cadastro", "Cadastro feito")
            }.addOnFailureListener {
                Log.e("Cadastro", "Não funcionou")
            }

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}