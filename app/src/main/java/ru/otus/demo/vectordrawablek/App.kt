package ru.otus.demo.vectordrawablek

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class App : Application()  {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}