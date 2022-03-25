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
import com.example.appdelivery.R
import com.example.appdelivery.adapter.ProductListAdapter
import com.example.appdelivery.databinding.FragmentComboBinding
import com.example.appdelivery.domain.viewModel.MainViewModel
import com.example.appdelivery.ui.HomeActivity


class CombosFragment : Fragment() {

    var mainViewModel: MainViewModel? = null
    var recyclerview : RecyclerView? = null
    var adapter : ProductListAdapter? = null
    var layoutManager: LinearLayoutManager? = null
    var binding: FragmentComboBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_combo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        recyclerview = binding?.recyclerCombos
        recyclerview!!.setHasFixedSize(false)
        layoutManager = LinearLayoutManager(requireContext())
        recyclerview!!.layoutManager = layoutManager

        mainViewModel!!.getCatList.observe(requireActivity()){productModels ->
            Log.e("Main", "ProductList: " + productModels.firstOrNull()?.name)

            adapter!!.notifyDataSetChanged()
            recyclerview!!.adapter = adapter
        }
    }
}