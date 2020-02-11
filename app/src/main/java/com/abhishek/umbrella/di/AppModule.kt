package com.abhishek.umbrella.di

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

//import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
//import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class AppModule(private val app: Application) {

    @Provides
    fun provideContext(): Context = app.applicationContext

    @Provides
    fun provideResources(context: Context): Resources = context.resources

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("")
            //.addConverterFactory(MoshiConverterFactory.create())
            //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }
}