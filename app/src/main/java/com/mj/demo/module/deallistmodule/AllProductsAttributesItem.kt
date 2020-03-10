package com.mj.demo.module.deallistmodule

import com.squareup.moshi.Json

data class AllProductsAttributesItem(@Json(name = "image")
                                     val image: String = "",
                                     @Json(name = "quantity_and_stock_status")
                                     val quantityAndStockStatus: QuantityAndStockStatus,
                                     @Json(name = "special_price")
                                     val specialPrice: String = "",
                                     @Json(name = "category_icon")
                                     val categoryIcon: String = "",
                                     @Json(name = "deal_to_date")
                                     val dealToDate: String = "",
                                     @Json(name = "deal_from_date")
                                     val dealFromDate: String = "",
                                     @Json(name = "description")
                                     val description: String = "",
                                     @Json(name = "flash_deal")
                                     val flashDeal: String = "")