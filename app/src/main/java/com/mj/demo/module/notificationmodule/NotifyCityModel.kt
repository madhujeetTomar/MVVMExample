package com.mj.demo.module.notificationmodule

import com.squareup.moshi.Json

data class NotifyCityModel(@Json(name = "cities")
                           val cities: List<CitiesItem>?,
                           @Json(name = "sms_alert")
                           val smsAlert: Int = 0,
                           @Json(name = "email_alert")
                           val emailAlert: Int = 0,
                           @Json(name = "notification_alert")
                           val notificationAlert: Int = 0)