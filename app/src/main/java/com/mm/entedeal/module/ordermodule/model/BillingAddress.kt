package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class BillingAddress(@Json(name = "firstname")
                          val firstname: String = "",
                          @Json(name = "address_type")
                          val addressType: String = "",
                          @Json(name = "city")
                          val city: String = "",
                          @Json(name = "postcode")
                          val postcode: String = "",
                          @Json(name = "region_id")
                          val regionId: Int = 0,
                          @Json(name = "telephone")
                          val telephone: String = "",
                          @Json(name = "entity_id")
                          val entityId: Int = 0,
                          @Json(name = "lastname")
                          val lastname: String = "",
                          @Json(name = "parent_id")
                          val parentId: Int = 0,
                          @Json(name = "street")
                          val street: List<String>?,
                          @Json(name = "region")
                          val region: String = "",
                          @Json(name = "country_id")
                          val countryId: String = "",
                          @Json(name = "email")
                          val email: String = "",
                          @Json(name = "region_code")
                          val regionCode: String = "")