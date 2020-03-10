package com.mj.demo.core.di

import com.mj.demo.module.deallistmodule.ProductList
import com.mj.demo.module.notificationmodule.CityUpdateModel
import com.mj.demo.module.notificationmodule.NotifyCityModel
import com.mj.demo.module.notificationmodule.SharedResponse
import com.mj.demo.module.ordermodule.OrderListResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("rest/default/V1/customers/orders")
    fun orderListApi(@Header("Authorization") s: String): Call<OrderListResponse>


    @GET("rest/default/V1/customers/alert")
    fun getNotifyCity(
        @Header("Authorization") autorizedToken: String?, @Query(
            "device_token"
        ) deviceToken: String?
    ): Call<List<NotifyCityModel>>

    @POST("rest/default/V1/customers/alert")
    fun updateCity(@Header("Authorization") autorizedToken: String?,
                   @Body alertDataBean: CityUpdateModel?): Call<SharedResponse?>?


    @GET("rest/default/V1/listproducts")
    fun getAllDealData(
        @Query("category_id") allDealCategoryid: String, @Query(
            "searchCriteria[sort_key]"
        ) sortKey: String, @Query("deal_category") dealCategory: String, @Query(
            "price"
        ) price: String, @Query("searchCriteria[currentPage]") currentPage: String, @Query(
            "searchCriteria[pageSize]"
        ) pageSize: String, @Query("app_city_id") cityId: String?, @Query(
            "searchCriteria[deal_type]"
        ) s: String, @Query("versionNumber") versionCode: Int
    ): Call<ProductList>

}