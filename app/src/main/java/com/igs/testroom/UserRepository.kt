package com.igs.testroom

import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDao) {
    // Expose data as Flow for reactive UI updates
    val allUsers: Flow<List<User>> = userDao.getAllUsers()

    suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }
}