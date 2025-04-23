package com.igs.testroom

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class UserRepository(private val userDao: UserDao) {
    // Expose data as Flow for reactive UI updates
    val allUsers: Flow<List<User>> = userDao.getAllUsers()

    suspend fun insertUser(user: User) {
        withContext(Dispatchers.IO) {
            userDao.insertUser(user)
        }
    }

    suspend fun updateUser(user: User) {
        withContext(Dispatchers.IO) {
            userDao.updateUser(user)
        }
    }

    suspend fun deleteUser(user: User) {
        withContext(Dispatchers.IO) {//sleep 10 seconds to simulate a long running operation
            // print thread name to see that this is running on a background thread
            Log.d("UserRepo", "Thread name: ${Thread.currentThread().name}")
            Thread.sleep(10000)
            userDao.deleteUser(user)
        }
    }
}