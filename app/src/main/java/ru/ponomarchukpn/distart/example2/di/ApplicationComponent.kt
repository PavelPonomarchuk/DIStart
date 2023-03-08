package ru.ponomarchukpn.distart.example2.di

import dagger.Component
import ru.ponomarchukpn.distart.example2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}