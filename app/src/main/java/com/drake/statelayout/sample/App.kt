package com.drake.statelayout.sample

import android.app.Application
import com.drake.statelayout.StateConfig

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        StateConfig.apply {
            emptyLayout = R.layout.layout_empty
            errorLayout = R.layout.layout_error
            loadingLayout = R.layout.layout_loading

            setRetryIds(R.id.msg)
        }
    }
}