package com.mj.demo.module.deallistmodule

import com.squareup.moshi.Json

data class QuantityAndStockStatus(@Json(name = "is_in_stock")
                                  val isInStock: Boolean = false,
                                  @Json(name = "qty")
                                  val qty: Int = 0)