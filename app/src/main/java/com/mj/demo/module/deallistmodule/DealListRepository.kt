package com.mj.demo.module.deallistmodule

import android.util.Log
import com.mj.demo.core.base.ResponseListener
import com.mj.demo.core.di.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class DealListRepository @Inject constructor(val apiService: ApiService) {


    fun getDealList(responseListener: ResponseListener<ProductList>) {

        apiService.getAllDealData("32","","","",
            "","","17","",47).enqueue(object : Callback<ProductList> {
            override fun onFailure(call: Call<ProductList>, t: Throwable) {
                Log.d("Error", t.message!!)
            }

            override fun onResponse(call: Call<ProductList>, response: Response<ProductList>) {
                responseListener.onSuccess(response.body()!!)

            }

        });


    }


}