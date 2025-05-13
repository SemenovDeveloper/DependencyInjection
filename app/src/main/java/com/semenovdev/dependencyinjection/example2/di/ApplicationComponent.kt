package com.semenovdev.dependencyinjection.example2.di

import com.semenovdev.dependencyinjection.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class, ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}