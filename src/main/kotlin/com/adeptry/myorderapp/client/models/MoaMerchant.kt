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

import com.adeptry.myorderapp.client.models.MoaCatalog

import com.squareup.moshi.Json

/**
 * 
 * @param catalog 
 * @param moaId 
 * @param createDate 
 * @param updateDate 
 * @param email 
 * @param firstName 
 * @param lastName 
 * @param phoneNumber 
 */

data class MoaMerchant (
    @Json(name = "catalog")
    val catalog: MoaCatalog? = null,
    @Json(name = "moaId")
    val moaId: kotlin.String? = null,
    @Json(name = "createDate")
    val createDate: java.time.OffsetDateTime? = null,
    @Json(name = "updateDate")
    val updateDate: java.time.OffsetDateTime? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "phoneNumber")
    val phoneNumber: kotlin.String? = null
)

