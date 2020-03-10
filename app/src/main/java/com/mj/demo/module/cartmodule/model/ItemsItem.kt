package com.mj.demo.module.cartmodule.model

import com.squareup.moshi.Json

data class ItemsItem(@Json(name = "product_type")
                     val productType: String = "",
                     @Json(name = "item_id")
                     val itemId: Int = 0,
                     @Json(name = "price")
                     val price: Int = 0,
                     @Json(name = "qty")
                     val qty: Int = 0,
                     @Json(name = "quote_id")
                     val quoteId: String = "",
                     @Json(name = "name")
                     val name: String = "",
                     @Json(name = "extension_attributes")
                     val extensionAttributes: ExtensionAttributes,
                     @Json(name = "sku")
                     val sku: String = "")