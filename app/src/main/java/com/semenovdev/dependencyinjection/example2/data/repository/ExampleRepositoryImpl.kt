package com.semenovdev.dependencyinjection.example2.data.repository

import com.semenovdev.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.semenovdev.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.semenovdev.dependencyinjection.example2.data.mapper.ExampleMapper
import com.semenovdev.dependencyinjection.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        localDataSource.method()
        remoteDataSource.method()
        mapper.map()
    }
}