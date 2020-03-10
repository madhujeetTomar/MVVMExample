package com.mj.demo.module.notificationmodule

import com.squareup.moshi.Json

data class CityUpdateModel(@Json(name = "alertData")
                           val alertData: AlertData)