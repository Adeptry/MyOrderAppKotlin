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

import org.myorderapp.kotlin-client.models.SquareMoney

import com.squareup.moshi.Json

/**
 * 
 * @param uid 
 * @param name 
 * @param amountMoney 
 */

data class SquareOrderRoundingAdjustment (
    @Json(name = "uid")
    val uid: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "amountMoney")
    val amountMoney: SquareMoney? = null
)

