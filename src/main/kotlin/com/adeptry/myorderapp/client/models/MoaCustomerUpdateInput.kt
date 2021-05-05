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


import com.squareup.moshi.Json

/**
 * 
 * @param password 
 * @param email 
 * @param phoneNumber 
 */

data class MoaCustomerUpdateInput (
    @Json(name = "password")
    val password: kotlin.String,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "phoneNumber")
    val phoneNumber: kotlin.String? = null
)

