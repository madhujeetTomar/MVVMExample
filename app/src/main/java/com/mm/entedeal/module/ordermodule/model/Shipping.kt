package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class Shipping(@Json(name = "total")
                    val total: Total
)