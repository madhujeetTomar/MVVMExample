package com.mj.demo.module.ordermodule.model

import androidx.databinding.ObservableField

class OrderItemViewModel(item:ItemsItem) {

    val itemId : ObservableField<String> = ObservableField()

    init {
        this.itemId.set(item.incrementId)
    }
}