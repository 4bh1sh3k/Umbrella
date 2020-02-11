package com.abhishek.umbrella.di

import com.abhishek.umbrella.view.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentsModule {

    @ContributesAndroidInjector
    fun contributeHomeFragment(): HomeFragment
}