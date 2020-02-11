package com.abhishek.umbrella.di

import com.abhishek.umbrella.view.ForecastFragment
import com.abhishek.umbrella.view.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentsModule {

    @ContributesAndroidInjector
    fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    fun contributeForecastFragment(): ForecastFragment
}