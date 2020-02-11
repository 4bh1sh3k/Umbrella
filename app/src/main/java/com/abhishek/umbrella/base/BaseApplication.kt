package com.abhishek.umbrella.base

import android.app.Application
import com.abhishek.umbrella.di.AppModule
import com.abhishek.umbrella.di.DaggerAppComponenet
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BaseApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector() = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponenet.builder()
            .appModule(AppModule(this))
            .build()
            .inject(this)
    }
}