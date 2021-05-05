/**
* MyOrderApp
* API for MyOrderApp
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.adeptry.myorderapp.client.models

import com.adeptry.myorderapp.client.models.MoaOrder

import com.squareup.moshi.Json

/**
 * 
 * @param entities 
 * @param count 
 * @param pages 
 */

data class MoaOrderPaginatedResponse (
    @Json(name = "entities")
    val entities: kotlin.collections.List<MoaOrder>? = null,
    @Json(name = "count")
    val count: java.math.BigDecimal? = null,
    @Json(name = "pages")
    val pages: java.math.BigDecimal? = null
)

