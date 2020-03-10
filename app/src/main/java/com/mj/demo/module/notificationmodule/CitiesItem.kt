package com.mj.demo.module.notificationmodule

import com.squareup.moshi.Json

data class CitiesItem(@Json(name = "city_name")
                      val cityName: String = "",
                      @Json(name = "selected")
                      val selected: Boolean = false,
                      @Json(name = "city_id")
                      val cityId: Int = 0)