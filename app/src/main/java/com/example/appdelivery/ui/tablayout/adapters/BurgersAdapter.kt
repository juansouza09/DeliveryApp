package com.example.appdelivery.ui.tablayout.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appdelivery.R
import com.example.appdelivery.model.ProdutoModel
import com.example.appdelivery.ui.tablayout.fragments.CadastroFragment
import com.example.appdelivery.ui.tablayout.fragments.LoginFragment

class BurgersListAdapter(
    var context: Context,
    var burgersModelList: MutableList<ProdutoModel>
) :
    RecyclerView.Adapter<BurgersListAdapter.BurgersViewHolder>() {
    inner class BurgersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgBurger: ImageView
        var txtBurgerName: TextView
        var txtDesc: TextView
        var txtValor: TextView

        init {
            imgBurger = itemView.findViewById(R.id.img_burger)
            txtBurgerName = itemView.findViewById(R.id.text_nome_lanche)
            txtDesc = itemView.findViewById(R.id.text_desc_lanche)
            txtValor = itemView.findViewById(R.id.text_valor_lanche)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgersListAdapter.BurgersViewHolder {
        return BurgersViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view_home, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BurgersListAdapter.BurgersViewHolder, position: Int) {
       //Picasso.get().load(burgersModelList[position].image?.url).into(holder.imgBurger)
        holder.txtBurgerName.text = burgersModelList[position].name
        holder.txtDesc.text = burgersModelList[position].desc
        holder.txtValor.text = burgersModelList[position].price
    }

    override fun getItemCount(): Int {
        return burgersModelList.size
    }
}