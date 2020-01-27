package com.mm.entedeal.module.ordermodule

import com.mm.entedeal.module.ordermodule.model.ItemsItem
import com.mm.entedeal.module.ordermodule.model.SearchCriteria
import com.squareup.moshi.Json

data class OrderListResponse(@Json(name = "total_count")
                             val totalCount: Int = 0,
                             @Json(name = "items")
                             val items: MutableList<ItemsItem>?)
