package com.mj.demo.module.ordermodule.model

import com.squareup.moshi.Json

data class FilterGroupsItem(@Json(name = "filters")
                            val filters: List<FiltersItem>?)