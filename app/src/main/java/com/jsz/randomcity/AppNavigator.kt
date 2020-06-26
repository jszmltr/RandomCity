package com.jsz.randomcity

import android.app.Activity
import androidx.annotation.ColorRes
import com.jsz.randomcity.details.DetailsActivity
import com.jsz.randomcity.main.MainActivity

class AppNavigator(private val activity: Activity) {

    fun toMain() {
        activity.startActivity(MainActivity.buildIntent(activity))
    }

    fun toDetails(name: String, @ColorRes color: Int, latitude: Double, longitude: Double) {
        activity.startActivity(
            DetailsActivity.buildIntent(activity, name, color, latitude, longitude)
        )
    }
}
