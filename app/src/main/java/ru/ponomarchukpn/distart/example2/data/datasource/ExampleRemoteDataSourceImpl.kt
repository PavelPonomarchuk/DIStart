package ru.ponomarchukpn.distart.example2.data.datasource

import ru.ponomarchukpn.distart.example2.data.datasource.ExampleRemoteDataSource
import ru.ponomarchukpn.distart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
