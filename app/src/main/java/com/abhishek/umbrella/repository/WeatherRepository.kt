package com.abhishek.umbrella.repository

import com.abhishek.umbrella.model.WeatherInfo
import com.abhishek.umbrella.model.convertToWeather
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val api: OpenWeatherMapApi
) {
    // TODO Send error scenarios
    suspend fun getWeatherByCity(city: String): WeatherInfo? {
        val result = api.getWeatherInfo(city)
        return if (result.isSuccessful) convertToWeather(result.body()) else null
    }
}