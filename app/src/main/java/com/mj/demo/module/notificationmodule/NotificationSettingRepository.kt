package com.mj.demo.module.notificationmodule

import com.mj.demo.core.base.ErrorResponse
import com.mj.demo.core.base.ResponseListener
import com.mj.demo.core.di.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NotificationSettingRepository @Inject constructor(val notificationApiService : ApiService) {



    fun getNotificationSettingData(listener: ResponseListener<List<NotifyCityModel>>) {
        notificationApiService.getNotifyCity("bearer etmbwhl82zhavqj4s9bjf0s2ilg6mdi5","").enqueue(object :
            Callback<List<NotifyCityModel>> {
            override fun onFailure(call: Call<List<NotifyCityModel>>, t: Throwable) {

                val errorResponse: ErrorResponse?=null


                println(t.message)
                // listener.onError(errorResponse!!)

            }

            override fun onResponse(
                call: Call<List<NotifyCityModel>>,
                response: Response<List<NotifyCityModel>>
            ) {

                listener.onSuccess(response.body()!!)

            }
        })
    }


}