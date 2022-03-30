package com.example.appdelivery.model

import com.google.gson.annotations.SerializedName

class ProdutoModel {
    var id : Int = 0
    var name: String? = null
    var description: String? = null
    var photoUrl : String? = null
    var price: String? = null
}

class Image {
    var id : String? = null
    var url : String? = null
}