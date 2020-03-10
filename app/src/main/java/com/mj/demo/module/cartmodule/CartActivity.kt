package com.mj.demo.module.cartmodule

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.mj.demo.BR
import com.mj.demo.R
import com.mj.demo.core.base.BaseActivity
import javax.inject.Inject

class CartActivity : BaseActivity<ViewDataBinding, CartViewModel>() {

    @Inject
    lateinit var mCartViewModel: CartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mCartViewModel.loadCartData()


    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_cart
    }

    override fun getBindingVariable(): Int {
    return BR.model
    }

    override fun getViewModel(): CartViewModel {
    return mCartViewModel

    }
}
