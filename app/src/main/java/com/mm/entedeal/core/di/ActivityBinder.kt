package com.mm.entedeal.core.di


import com.mm.entedeal.module.ordermodule.OrderListActivity
import com.mm.entedeal.module.ordermodule.di.OrderModule

import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module
abstract class ActivityBinder {


    @ContributesAndroidInjector(modules = arrayOf(OrderModule::class))
    abstract fun bindingOrderActivity(): OrderListActivity



}
