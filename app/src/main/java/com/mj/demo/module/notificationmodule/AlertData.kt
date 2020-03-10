package com.mj.demo.module.notificationmodule

import com.squareup.moshi.Json

data class AlertData(@Json(name = "email_alert")
                     val emailAlert: Int = 0,
                     @Json(name = "mobile_alert")
                     val mobileAlert: Int = 0,
                     @Json(name = "notification_alert")
                     val notificationAlert: Int = 0,
                     @Json(name = "deal_city")
                     val dealCity: List<String>?)