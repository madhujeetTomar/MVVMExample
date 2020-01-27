package com.mm.entedeal.module.ordermodule

import androidx.lifecycle.MutableLiveData
import com.mm.entedeal.core.base.BaseViewModel
import com.mm.entedeal.core.base.ErrorResponse
import com.mm.entedeal.core.base.ResponseListener

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



        /*  orderApiHelper.getOrderList().s

        *//*disposables = orderApiHelper.getOrderList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {ResultState.Loading }

            .subscribe(
                {response->
                  onFetchSuccessOrder(responseLiveData.postValue(ResultState.Successful(response)))
                    onFetchFailedOrder(ResultState.Error(""))
                }
            )*/
    }

     fun getOrderData(): MutableLiveData<OrderListResponse>? {
        return responseLiveData
    }


    fun onFetchFailedOrder(error: Any?)
    {

    }


}