package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class SortOrdersItem(@Json(name = "field")
                          val field: String = "",
                          @Json(name = "direction")
                          val direction: String = "")