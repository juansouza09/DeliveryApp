package com.example.appdelivery.model

data class LoginResponse (
    var id : Int = 0,
    var fisrtName: String,
    var lastName: String,
    var username: String,
    var token: String
)