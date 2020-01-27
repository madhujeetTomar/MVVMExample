package com.mm.entedeal.module.ordermodule

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mm.entedeal.R
import com.mm.entedeal.core.base.BaseActivity
import com.mm.entedeal.databinding.ActivityOrderListBinding
import javax.inject.Inject

class OrderListActivity : BaseActivity<ActivityOrderListBinding, OrderViewModel>() {

    @Inject
    lateinit var orderViewModel: OrderViewModel

    private lateinit var orderListAdapter: OrderListAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        orderViewModel.loadPosts()

        val name = Observer<OrderListResponse> { s -> updateOrderList(s) }
        orderViewModel.responseLiveData.observe(this, name)


    }

    private fun updateOrderList(s: OrderListResponse?) {

        orderListAdapter = OrderListAdapter()
        viewManager = LinearLayoutManager(this)

        mViewDataBinding?.recyItem?.setHasFixedSize(true)
        mViewDataBinding?.recyItem?.layoutManager = viewManager

        mViewDataBinding?.recyItem?.adapter = orderListAdapter

        orderListAdapter.setOrderDataList(s?.items)




    }

    override fun getLayoutResId() = R.layout.activity_order_list

    override fun getBindingVariable() = 0

    override fun getViewModel(): OrderViewModel = orderViewModel


}
