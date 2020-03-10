package com.mj.demo.core.di


import com.mj.demo.module.deallistmodule.AllDealActivity
import com.mj.demo.module.deallistmodule.DealListActivity
import com.mj.demo.module.deallistmodule.DealListModule
import com.mj.demo.module.notificationmodule.NotificationSetting
import com.mj.demo.module.notificationmodule.NotificationSettingModule
import com.mj.demo.module.ordermodule.OrderListActivity
import com.mj.demo.module.ordermodule.di.OrderModule

import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBinder {


    @ContributesAndroidInjector(modules = arrayOf(OrderModule::class))
    abstract fun bindingOrderActivity(): OrderListActivity

    @ContributesAndroidInjector(modules = arrayOf(NotificationSettingModule::class))
    abstract fun bindingNotificationSettingActivity(): NotificationSetting

    @ContributesAndroidInjector(modules = arrayOf(DealListModule::class))
    abstract fun bindDealListActivity(): AllDealActivity

}
