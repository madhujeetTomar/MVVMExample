package com.mj.demo.module.cartmodule.model

import com.squareup.moshi.Json

data class TotalSegmentsItem(@Json(name = "code")
                             val code: String = "",
                             @Json(name = "title")
                             val title: String = "",
                             @Json(name = "value")
                             val value: Int = 0)