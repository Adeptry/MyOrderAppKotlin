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
import com.adeptry.myorderapp.client.models.SquareOrderLineItemModifier

import com.squareup.moshi.Json

/**
 * 
 * @param uid 
 * @param name 
 * @param quantity 
 * @param note 
 * @param catalogObjectId 
 * @param variationName 
 * @param modifiers 
 * @param basePriceMoney 
 * @param variationTotalPriceMoney 
 * @param grossSalesMoney 
 * @param totalTaxMoney 
 * @param totalDiscountMoney 
 * @param totalMoney 
 */

data class SquareOrderLineItem (
    @Json(name = "uid")
    val uid: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "quantity")
    val quantity: kotlin.String? = null,
    @Json(name = "note")
    val note: kotlin.String? = null,
    @Json(name = "catalogObjectId")
    val catalogObjectId: kotlin.String? = null,
    @Json(name = "variationName")
    val variationName: kotlin.String? = null,
    @Json(name = "modifiers")
    val modifiers: kotlin.collections.List<SquareOrderLineItemModifier>? = null,
    @Json(name = "basePriceMoney")
    val basePriceMoney: SquareMoney? = null,
    @Json(name = "variationTotalPriceMoney")
    val variationTotalPriceMoney: SquareMoney? = null,
    @Json(name = "grossSalesMoney")
    val grossSalesMoney: SquareMoney? = null,
    @Json(name = "totalTaxMoney")
    val totalTaxMoney: SquareMoney? = null,
    @Json(name = "totalDiscountMoney")
    val totalDiscountMoney: SquareMoney? = null,
    @Json(name = "totalMoney")
    val totalMoney: SquareMoney? = null
)
