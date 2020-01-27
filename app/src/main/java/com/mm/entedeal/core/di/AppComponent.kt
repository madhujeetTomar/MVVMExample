package com.mm.entedeal.core.di

import android.app.Application
import com.mm.entedeal.core.EnteApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class,
        NetworkModule::class, ActivityBinder::class]
)
interface AppComponent {

    fun inject(app: EnteApplication )

    fun inject(networkModule: NetworkModule)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun networkModuleapplication(networkModule: NetworkModule): Builder

        fun build(): AppComponent

        //  fun buildBase(baseComponent: BaseComponent): Builder

    }




}