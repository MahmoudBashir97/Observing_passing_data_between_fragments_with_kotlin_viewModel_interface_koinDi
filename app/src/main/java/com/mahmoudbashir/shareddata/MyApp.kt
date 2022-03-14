package com.mahmoudbashir.shareddata

import android.app.Application
import com.mahmoudbashir.shareddata.koin.mainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(mainViewModel)
        }
    }
}