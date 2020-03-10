package com.mj.demo.module.cartmodule.model

import com.squareup.moshi.Json

data class CartModel(@Json(name = "savings")
                     val savings: String = "",
                     @Json(name = "items")
                     val items: List<ItemsItem>?,
                     @Json(name = "total_cart_qty")
                     val totalCartQty: String = "",
                     @Json(name = "total_segments")
                     val totalSegments: List<TotalSegmentsItem>?)