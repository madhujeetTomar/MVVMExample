package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class FiltersItem(@Json(name = "field")
                       val field: String = "",
                       @Json(name = "condition_type")
                       val conditionType: String = "",
                       @Json(name = "value")
                       val value: String = "")