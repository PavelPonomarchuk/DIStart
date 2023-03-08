package ru.ponomarchukpn.distart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.ponomarchukpn.distart.R
import ru.ponomarchukpn.distart.example2.di.ContextModule
import ru.ponomarchukpn.distart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(application))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}