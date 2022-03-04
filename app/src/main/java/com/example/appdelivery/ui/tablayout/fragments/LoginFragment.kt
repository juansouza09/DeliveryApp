package com.example.appdelivery.ui.tablayout.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appdelivery.R
import com.example.appdelivery.databinding.FragmentLoginBinding
import com.example.appdelivery.ui.PrincipalActivity

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.bntLogin.setOnClickListener {
            //inflater.inflate(R.layout.activity_principal, container, false)
            this.activity?.startActivity(Intent(this.context, PrincipalActivity::class.java))
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}