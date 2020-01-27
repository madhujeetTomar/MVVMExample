package com.mm.entedeal.module.ordermodule.model

import com.mm.entedeal.module.ordermodule.model.ItemsItem
import com.mm.entedeal.module.ordermodule.model.Shipping
import com.squareup.moshi.Json

data class ShippingAssignmentsItem(@Json(name = "shipping")
                                   val shipping: Shipping,
                                   @Json(name = "items")
                                   val items: List<ItemsItem>?)