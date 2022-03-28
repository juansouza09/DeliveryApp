package com.example.appdelivery.model

import com.google.gson.annotations.SerializedName

class ProdutoModel {
    var id : String? = null
    var name: String? = null
    @SerializedName("description")
    var desc: String? = null
    @SerializedName("photoUrl")
    var image : String? = null
    var price: String? = null
}

class Image {
    var id : String? = null
    var url : String? = null
}