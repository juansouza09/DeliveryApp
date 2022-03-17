package com.example.appdelivery.db.repository

import com.example.appdelivery.db.cadastro.RegistrationViewParams
import com.example.appdelivery.db.model.User

interface UserRepository {

    suspend fun createUser(registrationViewParams: RegistrationViewParams)

    suspend fun getUser(id: Long): User?

    suspend fun login(username: String, password: String): Long?
}