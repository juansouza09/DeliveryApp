package com.example.appdelivery.ui.tabHome.tabs

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appdelivery.adapter.ProductListAdapter
import com.example.appdelivery.databinding.FragmentSobremesasBinding
import com.example.appdelivery.domain.MainViewModel
import com.example.appdelivery.ui.DetalhesActivity

class SobremesasFragment : Fragment() {

    var binding: FragmentSobremesasBinding? = null
    var recyclerView: RecyclerView? = null
    var adapter: ProductListAdapter? = null
    var layoutManager: LinearLayoutManager? = null
    var mainViewModel: MainViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSobremesasBinding.inflate(inflater, container, false)
        mainViewModel = ViewModelProvider(this.requireActivity())[MainViewModel::class.java]
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        recyclerView = binding?.recyclerSobremesas
        recyclerView!!.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this.requireContext(), RecyclerView.VERTICAL, false)
        recyclerView!!.layoutManager = layoutManager

        mainViewModel!!.products.observe(requireActivity()) { productModels ->
            Log.e("Main", "ProductList: " + productModels.firstOrNull()?.name)
            adapter = ProductListAdapter(requireContext(), productModels)
            recyclerView!!.adapter = adapter
            adapter!!.setOnItemClickListener(object : ProductListAdapter.onItemClickListener {
                override fun onItemClick(position: Int) {
                    val detalhesItem = Intent(requireContext(), DetalhesActivity::class.java)

                    startActivity(detalhesItem)
                }
            })
        }
    }

}