package com.mj.demo.module.notificationmodule

import com.squareup.moshi.Json

data class SharedResponse(@Json(name = "message")
                          val message: String = "",
                          @Json(name = "status")
                          val status: Boolean = false)