package com.abhishek.umbrella.model

data class WeatherInfo(
    val temperature: String = "",
    val icon: String = ""
)

fun convertToWeather(response: WeatherResponse?) =
    WeatherInfo(
        temperature = response?.condition?.temp.toString(),
        icon = response?.weather?.get(0)?.icon ?: ""
    )