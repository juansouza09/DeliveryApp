package com.example.appdelivery.model

import android.media.Image

class ProdutoModel {
    var id : String? = null
    var name: String? = null
    var image : Image? = null
    var desc: String? = null
    var price: String? = null
}

class Image {
    var id : String? = null
    var url : String? = null
}