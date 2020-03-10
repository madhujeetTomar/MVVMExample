package com.mj.demo.module.cartmodule

import com.mj.demo.core.base.BaseViewModel
import com.mj.demo.core.base.ErrorResponse
import com.mj.demo.core.base.ResponseListener
import com.mj.demo.module.cartmodule.model.CartModel


class CartViewModel constructor(val cartRepository: CartRepository) :
    BaseViewModel<CartNavigator>() {
    fun loadCartData() {

        cartRepository.getCartList(object : ResponseListener<CartModel> {
            override fun onError(error: ErrorResponse) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSuccess(response: CartModel) {

            }

        });


    }
}