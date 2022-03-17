package com.example.appdelivery.db.repository

import com.example.appdelivery.db.cadastro.RegistrationViewParams
import com.example.appdelivery.db.dao.UserDao
import com.example.appdelivery.db.model.User
import com.example.appdelivery.db.toUser
import com.example.appdelivery.db.toUserEntity

class UserDbDataSource(
    private val userDao: UserDao
) : UserRepository {
    override suspend fun createUser(registrationViewParams: RegistrationViewParams) {
        val userEntity = registrationViewParams.toUserEntity()
        userDao.save(userEntity)
    }

    override suspend fun getUser(id: Long): User? {
        return userDao.getUser(id)?.toUser()
    }

    override suspend fun login(username: String, password: String): Long? {
        return userDao.login(username, password)
    }
}