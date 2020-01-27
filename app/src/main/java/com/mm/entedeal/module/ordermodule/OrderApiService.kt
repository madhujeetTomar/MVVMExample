package com.mm.entedeal.module.ordermodule

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface OrderApiService {

    @GET("rest/default/V1/customers/orders")
    fun orderListApi(@Header("Authorization")s: String): Call<OrderListResponse>
}