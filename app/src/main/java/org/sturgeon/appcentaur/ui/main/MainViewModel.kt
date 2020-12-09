package org.sturgeon.appcentaur.ui.main

import androidx.lifecycle.ViewModel
import com.microsoft.appcenter.analytics.Analytics

class MainViewModel : ViewModel() {


    fun thing() {
        Analytics.trackEvent("Something happened!")
    }

}