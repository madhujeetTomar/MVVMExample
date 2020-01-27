package com.mm.entedeal.module.ordermodule.di

import com.mm.entedeal.module.ordermodule.OrderApiService
import com.mm.entedeal.module.ordermodule.OrderRepository
import com.mm.entedeal.module.ordermodule.OrderViewModel
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
    open fun providesOrderApiService(retrofit: Retrofit): OrderApiService {
        return retrofit.create(OrderApiService::class.java)
    }

    @Provides
    fun providesOrderRepo(
      orderApiService: OrderApiService
    ): OrderRepository {
        return OrderRepository(
            orderApiService
        )
    }
}