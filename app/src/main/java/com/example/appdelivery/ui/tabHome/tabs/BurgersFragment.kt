package com.example.appdelivery.ui.tabHome.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appdelivery.R
import com.example.appdelivery.adapter.ProductListAdapter

class BurgersFragment : Fragment() {

    var context = null
    var recyclerView: RecyclerView? =  null
    var adapter: ProductListAdapter? =  null
    var layoutManager: LinearLayoutManager? =  null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_burgers, container, false)
        recyclerView = view.findViewById(R.id.recycler_burgers)
        recyclerView!!.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = layoutManager
        return view
    }
}