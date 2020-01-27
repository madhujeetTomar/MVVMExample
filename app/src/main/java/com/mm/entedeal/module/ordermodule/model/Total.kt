package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class Total(@Json(name = "shipping_amount")
                 val shippingAmount: Int = 0,
                 @Json(name = "base_shipping_amount")
                 val baseShippingAmount: Int = 0,
                 @Json(name = "shipping_discount_tax_compensation_amount")
                 val shippingDiscountTaxCompensationAmount: Int = 0,
                 @Json(name = "shipping_discount_amount")
                 val shippingDiscountAmount: Int = 0,
                 @Json(name = "base_shipping_discount_amount")
                 val baseShippingDiscountAmount: Int = 0,
                 @Json(name = "base_shipping_discount_tax_compensation_amnt")
                 val baseShippingDiscountTaxCompensationAmnt: Int = 0,
                 @Json(name = "base_shipping_incl_tax")
                 val baseShippingInclTax: Int = 0,
                 @Json(name = "shipping_invoiced")
                 val shippingInvoiced: Int = 0,
                 @Json(name = "shipping_incl_tax")
                 val shippingInclTax: Int = 0,
                 @Json(name = "base_shipping_invoiced")
                 val baseShippingInvoiced: Int = 0,
                 @Json(name = "base_shipping_tax_amount")
                 val baseShippingTaxAmount: Int = 0,
                 @Json(name = "shipping_tax_amount")
                 val shippingTaxAmount: Int = 0)