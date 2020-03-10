package com.mj.demo.module.deallistmodule

import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mj.demo.R
import com.mj.demo.core.base.BaseActivity
import com.mj.demo.databinding.ActivityAllDealBinding
import javax.inject.Inject

class AllDealActivity : BaseActivity<ActivityAllDealBinding, DealListViewModel>() {


    @Inject
    lateinit var mDealListViewModel: DealListViewModel

    private lateinit var dealListAdapter: DealListAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDealListViewModel.loadDealList()

        val name = Observer<ProductList> { s -> updateDealList(s) }
        mDealListViewModel.responseLiveData.observe(this, name)
    }

    private fun updateDealList(s: ProductList?) {


       dealListAdapter = DealListAdapter()
        viewManager = LinearLayoutManager(this)

        mViewDataBinding?.recyDealList?.initialize(dealListAdapter)

dealListAdapter.setOrderDataList(s?.items)


        Log.d("Response: ",""+s!!.items!!.size)

    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_all_deal
    }

    override fun getBindingVariable(): Int {
        return BR.model
    }

    override fun getViewModel(): DealListViewModel {
       return mDealListViewModel
    }
}

