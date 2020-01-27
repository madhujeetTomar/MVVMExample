package com.mm.entedeal.module.ordermodule.model

import com.squareup.moshi.Json

data class SearchCriteria(@Json(name = "sort_orders")
                          val sortOrders: List<SortOrdersItem>?,
                          @Json(name = "filter_groups")
                          val filterGroups: List<FilterGroupsItem>?,
                          @Json(name = "current_page")
                          val currentPage: Int = 0,
                          @Json(name = "page_size")
                          val pageSize: Int = 0)