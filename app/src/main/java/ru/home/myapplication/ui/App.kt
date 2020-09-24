package ru.home.myapplication.ui

import android.app.Application
import org.koin.android.ext.android.startKoin
import ru.home.myapplication.di.appModule
import ru.home.myapplication.di.mainModule
import ru.home.myapplication.di.noteModule
import ru.home.myapplication.di.splashModule

class App : Application() {

    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin(this, listOf(appModule, splashModule, mainModule, noteModule))
    }
}
