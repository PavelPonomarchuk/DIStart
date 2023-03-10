package ru.ponomarchukpn.distart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.ponomarchukpn.distart.example2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}