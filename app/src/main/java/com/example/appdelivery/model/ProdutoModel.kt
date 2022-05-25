package com.example.appdelivery.model

data class ProdutoModel (
    var id : Int = 0,
    var name: String? = null,
    var description: String? = null,
    var photoUrl : String? = null,
    var price: String? = null
)

data class Image (
    var id : String? = null,
    var url : String? = null
)