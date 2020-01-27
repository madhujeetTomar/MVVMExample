package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class ExtensionAttributes(@Json(name = "gift_cards_amount")
                               val giftCardsAmount: Int = 0,
                               @Json(name = "gw_price")
                               val gwPrice: String = "",
                               @Json(name = "shipping_assignments")
                               val shippingAssignments: List<ShippingAssignmentsItem>?,
                               @Json(name = "gw_items_price")
                               val gwItemsPrice: String = "",
                               @Json(name = "gw_card_price")
                               val gwCardPrice: String = "",
                               @Json(name = "gw_base_price")
                               val gwBasePrice: String = "",
                               @Json(name = "gw_card_base_price")
                               val gwCardBasePrice: String = "",
                               @Json(name = "gw_items_base_price")
                               val gwItemsBasePrice: String = "",
                               @Json(name = "can_create_return")
                               val canCreateReturn: Boolean = false,
                               @Json(name = "base_gift_cards_amount")
                               val baseGiftCardsAmount: Int = 0)