package com.mj.demo.module.deallistmodule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mj.demo.databinding.ItemDealListBinding

class DealListAdapter : RecyclerView.Adapter<DealListAdapter.ItemViewHolder>() {


    var dealList: MutableList<ItemsItem> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var viewName: ItemViewHolder? = null
        viewName = ItemViewHolder(
            ItemDealListBinding.inflate(
                LayoutInflater.from(parent?.context),
                parent,
                false
            )
        )
        return viewName
    }

    override fun getItemCount(): Int {
        return dealList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.model = DealListItemViewModel(dealList[position])

        holder.binding.executePendingBindings()
    }

    fun setOrderDataList(items: MutableList<ItemsItem>?) {

        this.dealList = items!!
        notifyDataSetChanged()
    }


    inner class ItemViewHolder(item: ItemDealListBinding) :
        RecyclerView.ViewHolder(item.root) {
        var binding: ItemDealListBinding = item
    }
}