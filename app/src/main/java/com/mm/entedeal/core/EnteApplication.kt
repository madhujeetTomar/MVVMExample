package com.mm.entedeal.core

import android.app.Activity
import android.app.Application
import com.mm.entedeal.BuildConfig
import com.mm.entedeal.core.di.AppComponent
import com.mm.entedeal.core.di.DaggerAppComponent
import com.mm.entedeal.core.di.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class EnteApplication : Application(), HasActivityInjector {




    var appBaseUrl: String? = null


    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>


    var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        appComponent?.inject(this)

        DaggerAppComponent.builder().application(this).
            networkModuleapplication(NetworkModule(BuildConfig.BASE_URL))
            .build().inject(this)


    }

    fun changeBaseUrl(baseurl: String) {
        clearAppComponent()
        appComponent = getComponent(baseurl)
        appComponent?.inject(this)
        appBaseUrl = baseurl
    }

    private fun clearAppComponent() {
        appComponent = null
    }

    fun getComponent(baseUrl: String): AppComponent {
        return DaggerAppComponent.builder().application(this)
            .networkModuleapplication(NetworkModule(baseUrl))
            .build()
    }


    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector     }

}
   /* override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector     }
}*/