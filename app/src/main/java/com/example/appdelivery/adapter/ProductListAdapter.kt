package com.example.appdelivery.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appdelivery.R
import com.example.appdelivery.model.ProdutoModel
import com.squareup.picasso.Picasso

class ProductListAdapter(
    var context: Context,
    var productModelList: List<ProdutoModel>
): RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {
    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var imgBurger: ImageView
        var txtBurgerName: TextView
        var txtDesc: TextView
        var txtValor: TextView

        init {
            imgBurger = itemView.findViewById(R.id.img_lanche)
            txtBurgerName = itemView.findViewById(R.id.text_nome_lanche)
            txtDesc = itemView.findViewById(R.id.text_desc_lanche)
            txtValor = itemView.findViewById(R.id.text_valor_lanche)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductListAdapter.ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view_home, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductListAdapter.ProductViewHolder, position: Int) {
        Picasso.get().load(productModelList[position].photoUrl).into(holder.imgBurger)
        holder.txtBurgerName.text = productModelList[position].name
        holder.txtDesc.text = productModelList[position].description
        holder.txtValor.text = productModelList[position].price
    }

    override fun getItemCount(): Int {
        return productModelList.size
    }
}