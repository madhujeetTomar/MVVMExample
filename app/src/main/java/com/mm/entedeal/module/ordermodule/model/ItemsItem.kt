package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class ItemsItem(@Json(name = "tax_amount")
                     val taxAmount: Double = 0.0,
                     @Json(name = "tax_invoiced")
                     val taxInvoiced: Double = 0.0,
                     @Json(name = "customer_note_notify")
                     val customerNoteNotify: Double = 0.0,
                     @Json(name = "shipping_discount_amount")
                     val shippingDiscountAmount: Double = 0.0,
                     @Json(name = "base_discount_tax_compensation_invoiced")
                     val baseDiscountTaxCompensationInvoiced: Double = 0.0,
                     @Json(name = "customer_firstname")
                     val customerFirstname: String = "",
                     @Json(name = "discount_amount")
                     val discountAmount: Double = 0.0,
                     @Json(name = "billing_address")
                     val billingAddress: BillingAddress,
                     @Json(name = "total_paid")
                     val totalPaid: Double = 0.0,
                     @Json(name = "increment_id")
                     val incrementId: String = "",
                     @Json(name = "payment")
                     val payment: Payment,
                     @Json(name = "state")
                     val state: String = "",
                     @Json(name = "base_shipping_tax_amount")
                     val baseShippingTaxAmount: Double = 0.0,
                     @Json(name = "base_grand_total")
                     val baseGrandTotal: Double = 0.0,
                     @Json(name = "billing_address_id")
                     val billingAddressId: Double = 0.0,
                     @Json(name = "customer_lastname")
                     val customerLastname: String = "",
                     @Json(name = "quote_id")
                     val quoteId: Double = 0.0,
                     @Json(name = "shipping_invoiced")
                     val shippingInvoiced: Double = 0.0,
                     @Json(name = "discount_tax_compensation_amount")
                     val discountTaxCompensationAmount: Double = 0.0,
                     @Json(name = "weight")
                     val weight: Double = 0.0,
                     @Json(name = "entity_id")
                     val entityId: Int = 0,
                     @Json(name = "base_total_invoiced")
                     val baseTotalInvoiced: Double = 0.0,
                     @Json(name = "base_shipping_amount")
                     val baseShippingAmount: Double = 0.0,
                     @Json(name = "base_subtotal_invoiced")
                     val baseSubtotalInvoiced: Double = 0.0,
                     @Json(name = "subtotal_incl_tax")
                     val subtotalInclTax: Double = 0.0,
                     @Json(name = "base_shipping_discount_tax_compensation_amnt")
                     val baseShippingDiscountTaxCompensationAmnt: Double = 0.0,
                     @Json(name = "subtotal")
                     val subtotal: Double = 0.0,
                     @Json(name = "base_shipping_incl_tax")
                     val baseShippingInclTax: Double = 0.0,
                     @Json(name = "customer_email")
                     val customerEmail: String = "",
                     @Json(name = "base_discount_invoiced")
                     val baseDiscountInvoiced: Double = 0.0,
                     @Json(name = "total_invoiced")
                     val totalInvoiced: Double = 0.0,
                     @Json(name = "base_to_global_rate")
                     val baseToGlobalRate: Double = 0.0,
                     @Json(name = "customer_is_guest")
                     val customerIsGuest: Double = 0.0,
                     @Json(name = "items")
                     val items: List<ItemsItem>?,
                     @Json(name = "global_currency_code")
                     val globalCurrencyCode: String = "",
                     @Json(name = "status")
                     val status: String = "",
                     @Json(name = "is_virtual")
                     val isVirtual: Double = 0.0,
                     @Json(name = "base_total_invoiced_cost")
                     val baseTotalInvoicedCost: Double = 0.0,
                     @Json(name = "discount_tax_compensation_invoiced")
                     val discountTaxCompensationInvoiced: Double = 0.0,
                     @Json(name = "store_currency_code")
                     val storeCurrencyCode: String = "",
                     @Json(name = "created_at")
                     val createdAt: String = "",
                     @Json(name = "total_item_count")
                     val totalItemCount: Double = 0.0,
                     @Json(name = "shipping_tax_amount")
                     val shippingTaxAmount: Double = 0.0,
                     @Json(name = "store_to_base_rate")
                     val storeToBaseRate: Double = 0.0,
                     @Json(name = "updated_at")
                     val updatedAt: String = "",
                     @Json(name = "base_shipping_discount_amount")
                     val baseShippingDiscountAmount: Double = 0.0,
                     @Json(name = "store_name")
                     val storeName: String = "",
                     @Json(name = "grand_total")
                     val grandTotal: Double = 0.0,
                     @Json(name = "base_currency_code")
                     val baseCurrencyCode: String = "",
                     @Json(name = "base_total_paid")
                     val baseTotalPaid: Double = 0.0,
                     @Json(name = "base_tax_amount")
                     val baseTaxAmount: Double = 0.0,
                     @Json(name = "store_id")
                     val storeId: Double = 0.0,
                     @Json(name = "shipping_discount_tax_compensation_amount")
                     val shippingDiscountTaxCompensationAmount: Double = 0.0,
                     @Json(name = "total_due")
                     val totalDue: Double = 0.0,
                     @Json(name = "total_qty_ordered")
                     val totalQtyOrdered: Double = 0.0,
                     @Json(name = "base_discount_amount")
                     val baseDiscountAmount: Double = 0.0,
                     @Json(name = "extension_attributes")
                     val extensionAttributes: ExtensionAttributes,
                     @Json(name = "store_to_order_rate")
                     val storeToOrderRate: Double = 0.0,
                     @Json(name = "shipping_amount")
                     val shippingAmount: Double = 0.0,
                     @Json(name = "base_discount_tax_compensation_amount")
                     val baseDiscountTaxCompensationAmount: Double = 0.0,
                     @Json(name = "subtotal_invoiced")
                     val subtotalInvoiced: Double = 0.0,
                     @Json(name = "base_to_order_rate")
                     val baseToOrderRate: Double = 0.0,
                     @Json(name = "base_subtotal")
                     val baseSubtotal: Double = 0.0,
                     @Json(name = "protect_code")
                     val protectCode: String = "",
                     @Json(name = "base_total_due")
                     val baseTotalDue: Double = 0.0,
                     @Json(name = "base_subtotal_incl_tax")
                     val baseSubtotalInclTax: Double = 0.0,
                     @Json(name = "customer_id")
                     val customerId: Double = 0.0,
                     @Json(name = "customer_group_id")
                     val customerGroupId: Double = 0.0,
                     @Json(name = "discount_invoiced")
                     val discountInvoiced: Double = 0.0,
                     @Json(name = "order_currency_code")
                     val orderCurrencyCode: String = "",
                     @Json(name = "base_tax_invoiced")
                     val baseTaxInvoiced: Double = 0.0,
                     @Json(name = "customer_gender")
                     val customerGender: Double = 0.0,
                     @Json(name = "shipping_incl_tax")
                     val shippingInclTax: Double = 0.0,
                     @Json(name = "base_shipping_invoiced")
                     val baseShippingInvoiced: Double = 0.0)