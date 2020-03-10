package com.mj.demo.module.ordermodule.di

import com.mj.demo.core.di.ApiService
import com.mj.demo.module.ordermodule.OrderRepository
import com.mj.demo.module.ordermodule.OrderViewModel
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class OrderModule {

    @Provides
    fun providesOrderViewModel(orderRepository: OrderRepository): OrderViewModel {
        return OrderViewModel(orderRepository)
    }

    @Provides
    open fun providesOrderApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun providesOrderRepo(
      orderApiService: ApiService
    ): OrderRepository {
        return OrderRepository(
            orderApiService
        )
    }
}