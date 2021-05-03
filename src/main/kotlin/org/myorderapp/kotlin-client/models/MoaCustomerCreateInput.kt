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


import com.squareup.moshi.Json

/**
 * 
 * @param email 
 * @param password 
 * @param merchantId 
 */

data class MoaCustomerCreateInput (
    @Json(name = "email")
    val email: kotlin.String,
    @Json(name = "password")
    val password: kotlin.String,
    @Json(name = "merchantId")
    val merchantId: kotlin.String
)
