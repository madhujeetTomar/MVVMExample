package com.mj.demo.module.deallistmodule

import androidx.databinding.ObservableField

class DealListItemViewModel(itemsItem: ItemsItem) {

    val itemId : ObservableField<String> = ObservableField()

    init {
        this.itemId.set(itemsItem.name)
    }

}