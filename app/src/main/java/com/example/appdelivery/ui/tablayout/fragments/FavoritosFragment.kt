package com.example.appdelivery.ui.tablayout.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appdelivery.R
import com.example.appdelivery.adapter.ProductListAdapter
import com.example.appdelivery.adapter.ProductListFavoAdapter
import com.example.appdelivery.databinding.FragmentComboBinding
import com.example.appdelivery.databinding.FragmentFavoritosBinding
import com.example.appdelivery.domain.viewModel.MainViewModel

class FavoritosFragment : Fragment() {

    var mainViewModel: MainViewModel? = null
    var recyclerview : RecyclerView? = null
    var adapter : ProductListFavoAdapter? = null
    var layoutManager: LinearLayoutManager? =  null
    var binding: FragmentFavoritosBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFavoritosBinding.inflate(inflater, container, false)
        mainViewModel = ViewModelProvider(this.requireActivity())[MainViewModel::class.java]
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    recyclerview = binding?.recyclerFavorite
        recyclerview!!.setHasFixedSize(true)
        layoutManager = GridLayoutManager(this.requireContext(), 2)
        recyclerview!!.layoutManager = layoutManager

        mainViewModel!!.products.observe(requireActivity()){productModels ->
            Log.e("Main", "ProductList: " + productModels.firstOrNull()?.name)
            adapter = ProductListFavoAdapter(requireContext(), productModels)
            recyclerview!!.adapter = adapter
        }

    }
}