package com.mj.demo.module.ordermodule.model

import com.squareup.moshi.Json

data class StatusHistoriesItem(@Json(name = "is_visible_on_front")
                               val isVisibleOnFront: Int = 0,
                               @Json(name = "entity_name")
                               val entityName: String = "",
                               @Json(name = "parent_id")
                               val parentId: Int = 0,
                               @Json(name = "created_at")
                               val createdAt: String = "",
                               @Json(name = "comment")
                               val comment: String = "",
                               @Json(name = "is_customer_notified")
                               val isCustomerNotified: Int = 0,
                               @Json(name = "entity_id")
                               val entityId: Int = 0,
                               @Json(name = "status")
                               val status: String = "")