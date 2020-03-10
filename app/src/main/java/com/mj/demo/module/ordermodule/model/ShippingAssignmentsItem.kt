package com.mj.demo.module.ordermodule.model

import com.squareup.moshi.Json

data class ShippingAssignmentsItem(@Json(name = "shipping")
                                   val shipping: Shipping,
                                   @Json(name = "items")
                                   val items: List<ItemsItem>?)