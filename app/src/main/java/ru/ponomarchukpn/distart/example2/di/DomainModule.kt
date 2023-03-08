package ru.ponomarchukpn.distart.example2.di

import dagger.Binds
import dagger.Module
import ru.ponomarchukpn.distart.example2.data.repository.ExampleRepositoryImpl
import ru.ponomarchukpn.distart.example2.domain.ExampleRepository

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}