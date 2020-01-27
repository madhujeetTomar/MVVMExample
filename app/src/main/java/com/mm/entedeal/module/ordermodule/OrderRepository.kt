package com.mm.entedeal.module.ordermodule

import com.mm.entedeal.core.base.ErrorResponse
import com.mm.entedeal.core.base.ResponseListener

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class OrderRepository @Inject constructor(val orderApiService: OrderApiService) {

    fun getOrderList(listener: ResponseListener<OrderListResponse>) {
        orderApiService.orderListApi("bearer etmbwhl82zhavqj4s9bjf0s2ilg6mdi5").enqueue(object : Callback<OrderListResponse> {
            override fun onFailure(call: Call<OrderListResponse>, t: Throwable) {

                val errorResponse:ErrorResponse?=null


                println(t.message)
               // listener.onError(errorResponse!!)

            }

            override fun onResponse(
                call: Call<OrderListResponse>,
                response: Response<OrderListResponse>
            ) {

                listener.onSuccess(response.body()!!)

            }
        })
    }
}




