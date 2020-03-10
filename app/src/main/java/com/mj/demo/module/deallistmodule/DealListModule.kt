package com.mj.demo.module.deallistmodule

import com.mj.demo.core.di.ApiService
import com.mj.demo.module.ordermodule.OrderRepository
import com.mj.demo.module.ordermodule.OrderViewModel
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class DealListModule {

    @Provides
    fun providesDealListViewModel(dealListRepository: DealListRepository): DealListViewModel {
        return DealListViewModel(dealListRepository)
    }

    @Provides
    open fun providesDealListApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun providesDealListrRepo(
      dealListApiService: ApiService
    ): DealListRepository {
        return DealListRepository(
            dealListApiService
        )
    }
}