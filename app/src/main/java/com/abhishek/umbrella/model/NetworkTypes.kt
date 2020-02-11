package com.abhishek.umbrella.model

import com.abhishek.umbrella.repository.Icon
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

// @JsonClass annotation is necessary if the class has an annotation like @Json or custom qualifier

@JsonClass(generateAdapter = true)
class WeatherResponse(
    val weather: List<Summary>,
    @Json(name = "main") val condition: Condition
)

@JsonClass(generateAdapter = true)
class Summary(
    val id: Int,
    val main: String,
    val description: String,
    @Icon val icon: String
)

@JsonClass(generateAdapter = true)
class Condition(
    val temp: Double,
    val pressure: Int,
    val humidity: Double,
    @Json(name = "temp_min") val minTemp: Double,
    @Json(name = "temp_max") val maxTemp: Double
)