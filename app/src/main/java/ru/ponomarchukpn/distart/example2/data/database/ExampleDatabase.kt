package ru.ponomarchukpn.distart.example2.data.database

import android.content.Context
import android.util.Log
import ru.ponomarchukpn.distart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $timeMillis")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
