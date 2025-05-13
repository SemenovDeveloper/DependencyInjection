package com.semenovdev.dependencyinjection.example2.di

import android.content.Context
import com.semenovdev.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.semenovdev.dependencyinjection.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides


@Module
class DomainModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideRepository ( impl: ExampleRepositoryImpl ): ExampleRepository { return impl }
}