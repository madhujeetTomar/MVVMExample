package com.mj.demo.module.deallistmodule

import com.squareup.moshi.Json

data class ProductList(
                       @Json(name = "total_count")
                       val totalCount: Int = 0,
                       @Json(name = "items")
                       val items: MutableList<ItemsItem>?,
                       @Json(name = "search_criteria")
                       val searchCriteria: SearchCriteria)