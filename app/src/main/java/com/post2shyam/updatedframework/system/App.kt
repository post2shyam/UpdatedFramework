package com.post2shyam.updatedframework.system

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {

    @Inject
    lateinit var timberTree: Timber.Tree

    override fun onCreate() {
        super.onCreate()
        initAnalytics()
        initLogger()
    }

    private fun initAnalytics() {
        if (!AppCenter.isConfigured()) {
            AppCenter.start(
                this,
                "d67bce8d-ff48-40d0-a1b6-6f4b7052d687",
                Analytics::class.java,
                Crashes::class.java
            )
        }
    }

    private fun initLogger() {
        Timber.plant(timberTree)
    }
}