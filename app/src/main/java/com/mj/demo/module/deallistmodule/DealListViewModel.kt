package com.mj.demo.module.deallistmodule

import androidx.lifecycle.MutableLiveData
import com.mj.demo.core.base.BaseViewModel
import com.mj.demo.core.base.ErrorResponse
import com.mj.demo.core.base.ResponseListener
import com.mj.demo.module.cartmodule.CartNavigator
import com.mj.demo.module.cartmodule.CartRepository

class DealListViewModel constructor(val dealListRepository: DealListRepository) :
    BaseViewModel<DealListNavigator>() {

    var responseLiveData: MutableLiveData<ProductList> = MutableLiveData()

    fun loadDealList(){

        dealListRepository.getDealList(object : ResponseListener<ProductList> {
            override fun onSuccess(response: ProductList) {
                responseLiveData.postValue(response)
            }

            override fun onError(error: ErrorResponse) {

            }

        })

    }


}