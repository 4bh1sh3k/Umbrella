package com.abhishek.umbrella.repository

import com.abhishek.umbrella.model.Greeting
import kotlinx.coroutines.delay
import javax.inject.Inject

class ServiceRepository @Inject constructor() {
    suspend fun getGreeting(): Greeting {
        delay(2000)
        return Greeting("Hello, Umbrella!")
    }
}