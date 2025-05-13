package com.semenovdev.dependencyinjection.example2.di

import com.semenovdev.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.semenovdev.dependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module


@Module
abstract class DomainModule {

    @Binds
    abstract fun bindRepository ( impl: ExampleRepositoryImpl ): ExampleRepository
}