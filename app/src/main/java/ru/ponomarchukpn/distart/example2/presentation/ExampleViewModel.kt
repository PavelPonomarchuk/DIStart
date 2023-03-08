package ru.ponomarchukpn.distart.example2.presentation

import ru.ponomarchukpn.distart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
