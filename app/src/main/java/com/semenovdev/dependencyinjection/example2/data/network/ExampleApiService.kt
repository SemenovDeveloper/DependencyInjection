package com.semenovdev.dependencyinjection.example2.data.network

import android.content.Context
import android.util.Log
import com.semenovdev.dependencyinjection.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleNetwork ${context.getString(R.string.app_name)}")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}