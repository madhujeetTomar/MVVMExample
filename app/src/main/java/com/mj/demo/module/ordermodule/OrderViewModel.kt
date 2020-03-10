package com.mj.demo.module.ordermodule

import androidx.lifecycle.MutableLiveData
import com.mj.demo.core.base.BaseViewModel
import com.mj.demo.core.base.ErrorResponse
import com.mj.demo.core.base.ResponseListener

class OrderViewModel constructor(val orderRepository: OrderRepository) :
    BaseViewModel<OrderViewNavigator>() {
    var responseLiveData: MutableLiveData<OrderListResponse> = MutableLiveData()


     fun loadPosts(){

        orderRepository.getOrderList(object : ResponseListener<OrderListResponse>{
            override fun onSuccess(response: OrderListResponse) {
                responseLiveData.postValue(response)
            }

            override fun onError(error: ErrorResponse) {

            }

        })

    }

     fun getOrderData(): MutableLiveData<OrderListResponse>? {
        return responseLiveData
    }


    fun onFetchFailedOrder(error: Any?)
    {

    }


}