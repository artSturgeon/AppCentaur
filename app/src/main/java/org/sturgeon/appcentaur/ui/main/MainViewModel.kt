package org.sturgeon.appcentaur.ui.main

import androidx.lifecycle.ViewModel
import com.microsoft.appcenter.analytics.Analytics

class MainViewModel : ViewModel() {

    private lateinit var horse: String

    fun walkBackwards(): String {
        Analytics.trackEvent("Something happened!")

        return horse.reversed()
    }

    fun eventor() {
        Analytics.trackEvent("Eventor ! ! !")
    }

}