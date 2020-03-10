package com.mj.demo.module.deallistmodule

import com.squareup.moshi.Json

data class SearchCriteria(@Json(name = "current_page")
                          val currentPage: Int = 0)