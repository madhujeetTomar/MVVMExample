package com.mj.demo.module.notificationmodule

import com.mj.demo.core.di.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class NotificationSettingModule {

    @Provides
    fun providesNotificationSettingViewModel(notificationSettingRepository: NotificationSettingRepository): NotificationSettingViewModel {
        return NotificationSettingViewModel(notificationSettingRepository)
    }

    @Provides
    open fun providesOrderApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun providesOrderRepo(
        notificationApiService: ApiService
    ): NotificationSettingRepository {
        return NotificationSettingRepository(
            notificationApiService
        )
    }
}