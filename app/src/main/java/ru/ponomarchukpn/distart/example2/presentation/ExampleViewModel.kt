package ru.ponomarchukpn.distart.example2.presentation

import ru.ponomarchukpn.distart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
