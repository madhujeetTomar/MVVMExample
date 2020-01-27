package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class Payment(@Json(name = "base_amount_ordered")
                   val baseAmountOrdered: Double = 0.0,
                   @Json(name = "amount_paid")
                   val amountPaid: Double = 0.0,
                   @Json(name = "method")
                   val method: String = "",
                   @Json(name = "shipping_captured")
                   val shippingCaptured: Double = 0.0,
                   @Json(name = "entity_id")
                   val entityId: Double = 0.0,
                   @Json(name = "last_trans_id")
                   val lastTransId: String = "",
                   @Json(name = "amount_authorized")
                   val amountAuthorized: Double = 0.0,
                   @Json(name = "base_amount_paid")
                   val baseAmountPaid: Double = 0.0,
                   @Json(name = "shipping_amount")
                   val shippingAmount: Double = 0.0,
                   @Json(name = "additional_information")
                   val additionalInformation: List<String>?,
                   @Json(name = "base_amount_authorized")
                   val baseAmountAuthorized: Double = 0.0,
                   @Json(name = "base_shipping_amount")
                   val baseShippingAmount: Double = 0.0,
                   @Json(name = "parent_id")
                   val parentId: Double = 0.0,
                   @Json(name = "base_shipping_captured")
                   val baseShippingCaptured: Double = 0.0)