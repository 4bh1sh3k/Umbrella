package com.abhishek.umbrella.di

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.abhishek.umbrella.repository.IconAdapter
import com.abhishek.umbrella.repository.OpenWeatherMapApi
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class AppModule(private val app: Application) {

    @Provides
    fun provideContext(): Context = app.applicationContext

    @Provides
    fun provideResources(context: Context): Resources = context.resources

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(
                MoshiConverterFactory.create(
                    Moshi.Builder()
                        .add(IconAdapter())
                        .build()
                )
            )
            .build()
    }

    // FIXME Should it be in app module?
    @Provides
    fun provideApi(retrofit: Retrofit): OpenWeatherMapApi {
        return retrofit.create(OpenWeatherMapApi::class.java)
    }
}