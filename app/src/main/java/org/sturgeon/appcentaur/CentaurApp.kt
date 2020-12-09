package org.sturgeon.appcentaur

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class CentaurApp: Application() {


    override fun onCreate() {
        super.onCreate()

        AppCenter.start(
            this, "6a5943f9-3e06-4f3e-a9d0-4c42ca508e2b",
            Analytics::class.java, Crashes::class.java
        )

    }



}