package com.abhishek.umbrella.di

import com.abhishek.umbrella.base.BaseApplication
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, FragmentsModule::class])
interface AppComponenet {

    fun inject(application: BaseApplication)
}