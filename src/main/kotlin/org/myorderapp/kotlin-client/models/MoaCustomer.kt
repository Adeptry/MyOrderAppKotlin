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
package org.myorderapp.kotlin-client.models

import org.myorderapp.kotlin-client.models.MoaMerchant
import org.myorderapp.kotlin-client.models.MoaOrder

import com.squareup.moshi.Json

/**
 * 
 * @param accessToken 
 * @param currentOrder 
 * @param orders 
 * @param id 
 * @param createDate 
 * @param updateDate 
 * @param email 
 * @param phoneNumber 
 * @param merchantId 
 * @param merchant 
 */

data class MoaCustomer (
    @Json(name = "accessToken")
    val accessToken: kotlin.String? = null,
    @Json(name = "currentOrder")
    val currentOrder: MoaOrder? = null,
    @Json(name = "orders")
    val orders: kotlin.collections.List<MoaOrder>? = null,
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "createDate")
    val createDate: java.time.OffsetDateTime? = null,
    @Json(name = "updateDate")
    val updateDate: java.time.OffsetDateTime? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "phoneNumber")
    val phoneNumber: kotlin.String? = null,
    @Json(name = "merchantId")
    val merchantId: kotlin.String? = null,
    @Json(name = "merchant")
    val merchant: MoaMerchant? = null
)
