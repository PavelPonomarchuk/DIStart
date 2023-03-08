package ru.ponomarchukpn.distart.example2.di

import dagger.Binds
import dagger.Module
import ru.ponomarchukpn.distart.example2.data.datasource.ExampleLocalDataSource
import ru.ponomarchukpn.distart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.ponomarchukpn.distart.example2.data.datasource.ExampleRemoteDataSource
import ru.ponomarchukpn.distart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}