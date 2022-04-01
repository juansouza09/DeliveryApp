package com.example.appdelivery.ui.tablayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appdelivery.databinding.FragmentPerfilBinding

class PerfilFragment : Fragment() {

    private var binding: FragmentPerfilBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPerfilBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changePayment()
    }

    private fun changePayment(){
        binding?.bntLogin?.setOnClickListener {
            Toast.makeText(requireContext(), "Método de Pagamento alterado!", Toast.LENGTH_SHORT)
                .show()
        }
    }
}