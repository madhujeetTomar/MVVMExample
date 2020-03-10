package com.mj.demo.module.ordermodule

import com.mj.demo.module.ordermodule.model.ItemsItem
import com.squareup.moshi.Json

data class OrderListResponse(@Json(name = "total_count")
                             val totalCount: Int = 0,
                             @Json(name = "items")
                             val items: MutableList<ItemsItem>?)
