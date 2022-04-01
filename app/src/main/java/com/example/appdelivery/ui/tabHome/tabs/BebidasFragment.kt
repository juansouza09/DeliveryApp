package com.example.appdelivery.ui.tabHome.tabs

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
import com.example.appdelivery.databinding.FragmentBebidasBinding
import com.example.appdelivery.domain.viewModel.MainViewModel

class BebidasFragment : Fragment() {

    var binding: FragmentBebidasBinding? = null
    var recyclerView: RecyclerView? = null
    var adapter: ProductListAdapter? = null
    var layoutManager: LinearLayoutManager? = null
    var mainViewModel: MainViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBebidasBinding.inflate(inflater, container, false)
        mainViewModel = ViewModelProvider(this.requireActivity())[MainViewModel::class.java]
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        recyclerView = binding?.recyclerBebidas
        recyclerView!!.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this.requireContext(), RecyclerView.VERTICAL, false)
        recyclerView!!.layoutManager = layoutManager

        mainViewModel!!.products.observe(requireActivity()) { productModels ->
            Log.e("Main", "ProductList: " + productModels.firstOrNull()?.name)
            adapter = ProductListAdapter(requireContext(), productModels)
            recyclerView!!.adapter = adapter
        }
    }
}