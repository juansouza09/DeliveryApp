package com.example.appdelivery.ui.tablayout.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appdelivery.data.network.APIService
import com.example.appdelivery.databinding.FragmentLoginBinding
import com.example.appdelivery.model.LoginResponse
import com.example.appdelivery.ui.HomeActivity
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private val api : APIService? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.bntLogin.setOnClickListener {
            startActivity(Intent(requireContext(), HomeActivity::class.java))
        }

        binding.bntLogin.setOnClickListener {
            userLogin()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun userLogin(){
        val username = binding.loginText.editText.toString().trim()
        val password = binding.senha.editText.toString().trim()

        var callback = api?.login(username, password);
        callback?.enqueue(object : Callback<LoginResponse>{
            override fun onResponse(call: Call<LoginResponse>, response : Response<LoginResponse>){

            }
        })
    }
}