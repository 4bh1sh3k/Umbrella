package com.abhishek.umbrella.repository

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class Icon

class IconAdapter {
    @FromJson
    @Icon
    fun fromJson(iconVal: String) = "http://www.openweathermap.org/img/w/$iconVal.png"

    @ToJson
    fun toJson(@Icon icon: String) = ""
}