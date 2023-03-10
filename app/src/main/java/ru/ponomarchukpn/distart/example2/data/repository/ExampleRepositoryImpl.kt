package ru.ponomarchukpn.distart.example2.data.repository

import ru.ponomarchukpn.distart.example2.data.datasource.ExampleLocalDataSource
import ru.ponomarchukpn.distart.example2.data.datasource.ExampleRemoteDataSource
import ru.ponomarchukpn.distart.example2.data.mapper.ExampleMapper
import ru.ponomarchukpn.distart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
