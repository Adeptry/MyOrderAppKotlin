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

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param createDate 
 * @param updateDate 
 * @param name 
 * @param description 
 * @param phoneNumber 
 * @param latitude 
 * @param longitude 
 * @param status 
 * @param merchantId 
 * @param merchant 
 */

data class MoaLocation (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "createDate")
    val createDate: java.time.OffsetDateTime? = null,
    @Json(name = "updateDate")
    val updateDate: java.time.OffsetDateTime? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "phoneNumber")
    val phoneNumber: kotlin.String? = null,
    @Json(name = "latitude")
    val latitude: java.math.BigDecimal? = null,
    @Json(name = "longitude")
    val longitude: java.math.BigDecimal? = null,
    @Json(name = "status")
    val status: kotlin.String? = null,
    @Json(name = "merchantId")
    val merchantId: kotlin.String? = null,
    @Json(name = "merchant")
    val merchant: MoaMerchant? = null
)

