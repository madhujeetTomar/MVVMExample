package com.mj.demo.core

import android.app.Activity
import android.app.Application
import com.mj.demo.BuildConfig
import com.mj.demo.core.di.AppComponent
import com.mj.demo.core.di.DaggerAppComponent
import com.mj.demo.core.di.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class EnteApplication : Application(), HasActivityInjector {

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


    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector     }

}
