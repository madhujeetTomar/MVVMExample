package com.mj.demo.module.deallistmodule

import com.squareup.moshi.Json

data class ItemsItem(@Json(name = "all_products_attributes")
                     val allProductsAttributes: List<AllProductsAttributesItem>?,
                     @Json(name = "price")
                     val price: Double = 0.0,
                     @Json(name = "name")
                     val name: String = "",
                     @Json(name = "deal_end_date")
                     val dealEndDate: String = "",
                     @Json(name = "id")
                     val id: Int = 0,
                     @Json(name = "sku")
                     val sku: String = "",
                     @Json(name = "deal_status")
                     val dealStatus: Int = 0)