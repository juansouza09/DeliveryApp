package com.example.appdelivery.db.cadastro

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.appdelivery.db.repository.UserRepository
import kotlinx.coroutines.launch

class RegistrationViewModel(
    val userRepository: UserRepository
) : ViewModel() {

    class RegistrationViewModelFactory(private val userRepository: UserRepository) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return RegistrationViewModel(userRepository) as T
        }
    }

    fun createUser(name: String, username: String, password: String) {
        viewModelScope.launch {
            userRepository.createUser(RegistrationViewParams(name, username, password))
            val userId = userRepository.login(username, password)
        }
    }

    fun isValidProfileData(name: String, username: String, password: String): Boolean {
        return when {
            name.isEmpty() ||
                    username.isEmpty() ||
                    password.isEmpty() -> false
            else -> true
        }
    }
}