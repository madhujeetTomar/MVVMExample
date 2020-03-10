package com.mj.demo.module.cartmodule.model

import com.squareup.moshi.Json

data class ExtensionAttributes(@Json(name = "is_giftcart")
                               val isGiftcart: String = "",
                               @Json(name = "image_url")
                               val imageUrl: String = "",
                               @Json(name = "product_status")
                               val productStatus: Boolean = false,
                               @Json(name = "is_returnable")
                               val isReturnable: Int = 0,
                               @Json(name = "product_availableqty")
                               val productAvailableqty: Int = 0)