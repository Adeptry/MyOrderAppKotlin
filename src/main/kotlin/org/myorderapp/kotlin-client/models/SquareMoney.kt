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
 * @param amount 
 * @param currency 
 */

data class SquareMoney (
    @Json(name = "amount")
    val amount: java.math.BigDecimal? = null,
    @Json(name = "currency")
    val currency: kotlin.String? = null
)

