package com.abhishek.umbrella.repository

import com.abhishek.umbrella.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapApi {
    //TODO Move app id to interceptor
    @GET("weather?APPID=c7f70b304193d95af8e425b117f45e8a")
    suspend fun getWeatherInfo(@Query("q") city: String): Response<WeatherResponse>
}