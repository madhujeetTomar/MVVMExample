package com.mm.entedeal.module.ordermodule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mm.entedeal.databinding.ItemOrdersBinding
import com.mm.entedeal.module.ordermodule.model.ItemsItem
import com.mm.entedeal.module.ordermodule.model.OrderItemViewModel

class OrderListAdapter : RecyclerView.Adapter<OrderListAdapter.ItemViewHolder>() {


    var orderList: MutableList<ItemsItem> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var viewName: ItemViewHolder? = null
        viewName = ItemViewHolder(ItemOrdersBinding.inflate(LayoutInflater.from(parent?.context), parent, false))
        return viewName
    }

    override fun getItemCount(): Int {
return orderList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
holder.binding.model= OrderItemViewModel(orderList[position])

        holder.binding.executePendingBindings()
    }

    fun setOrderDataList(items: MutableList<ItemsItem>?) {

        this.orderList=items!!
        notifyDataSetChanged()
    }


    inner class ItemViewHolder(itemOrdersBinding: ItemOrdersBinding) :
       RecyclerView.ViewHolder(itemOrdersBinding.root)
   {
       var binding: ItemOrdersBinding = itemOrdersBinding
    }
}