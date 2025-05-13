package com.semenovdev.dependencyinjection.example2.di

import android.content.Context
import com.semenovdev.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.semenovdev.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.semenovdev.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.semenovdev.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideExampleLocalDataSource(
        impl: ExampleLocalDataSourceImpl
    ): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideExampleRemoteDataSource(
        impl: ExampleRemoteDataSourceImpl
    ): ExampleRemoteDataSource {
        return impl
    }
}