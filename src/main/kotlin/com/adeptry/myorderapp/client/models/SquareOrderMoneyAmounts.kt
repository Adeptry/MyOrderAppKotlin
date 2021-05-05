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

import com.adeptry.myorderapp.client.models.SquareMoney

import com.squareup.moshi.Json

/**
 * 
 * @param totalMoney 
 * @param taxMoney 
 * @param discountMoney 
 * @param tipMoney 
 * @param serviceChargeMoney 
 */

data class SquareOrderMoneyAmounts (
    @Json(name = "totalMoney")
    val totalMoney: SquareMoney? = null,
    @Json(name = "taxMoney")
    val taxMoney: SquareMoney? = null,
    @Json(name = "discountMoney")
    val discountMoney: SquareMoney? = null,
    @Json(name = "tipMoney")
    val tipMoney: SquareMoney? = null,
    @Json(name = "serviceChargeMoney")
    val serviceChargeMoney: SquareMoney? = null
)

