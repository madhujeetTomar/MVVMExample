package com.mj.demo.module.cartmodule

import com.mj.demo.core.base.ResponseListener
import com.mj.demo.core.di.ApiService
import com.mj.demo.module.cartmodule.model.CartModel
import javax.inject.Inject

class CartRepository @Inject constructor(val apiService: ApiService) {
    fun getCartList(responseListener: ResponseListener<CartModel>) {

       // apiService.



    }
}