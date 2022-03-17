package com.example.appdelivery.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.appdelivery.db.cadastro.RegistrationViewParams
import com.example.appdelivery.db.model.User

@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val username: String,
    val name: String,
    val password: String
)

fun RegistrationViewParams.toUserEntity(): UserEntity {
    return with(this) {
        UserEntity(
            name = this.name,
            username = this.username,
            password = this.password
        )
    }
}

fun UserEntity.toUser(): User {
    return User(
        id = this.id.toString(),
        name = this.name,
        username = this.username,
        password = this.password
    )

}