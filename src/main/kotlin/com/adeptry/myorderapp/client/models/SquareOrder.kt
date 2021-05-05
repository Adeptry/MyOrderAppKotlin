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
import com.adeptry.myorderapp.client.models.SquareOrderFulfillment
import com.adeptry.myorderapp.client.models.SquareOrderLineItem
import com.adeptry.myorderapp.client.models.SquareOrderLineItemDiscount
import com.adeptry.myorderapp.client.models.SquareOrderLineItemTax
import com.adeptry.myorderapp.client.models.SquareOrderMoneyAmounts
import com.adeptry.myorderapp.client.models.SquareOrderRoundingAdjustment
import com.adeptry.myorderapp.client.models.SquareOrderServiceCharge
import com.adeptry.myorderapp.client.models.SquareRefund
import com.adeptry.myorderapp.client.models.SquareTender

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param locationId 
 * @param referenceId 
 * @param customerId 
 * @param lineItems 
 * @param taxes 
 * @param discounts 
 * @param serviceCharges 
 * @param fulfillments 
 * @param returnAmounts 
 * @param netAmounts 
 * @param roundingAdjustment 
 * @param tenders 
 * @param refunds 
 * @param createdAt 
 * @param updatedAt 
 * @param closedAt 
 * @param state 
 * @param version 
 * @param totalMoney 
 * @param totalTaxMoney 
 * @param totalDiscountMoney 
 * @param totalTipMoney 
 * @param totalServiceChargeMoney 
 */

data class SquareOrder (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "locationId")
    val locationId: kotlin.String? = null,
    @Json(name = "referenceId")
    val referenceId: kotlin.String? = null,
    @Json(name = "customerId")
    val customerId: kotlin.String? = null,
    @Json(name = "lineItems")
    val lineItems: kotlin.collections.List<SquareOrderLineItem>? = null,
    @Json(name = "taxes")
    val taxes: kotlin.collections.List<SquareOrderLineItemTax>? = null,
    @Json(name = "discounts")
    val discounts: kotlin.collections.List<SquareOrderLineItemDiscount>? = null,
    @Json(name = "serviceCharges")
    val serviceCharges: kotlin.collections.List<SquareOrderServiceCharge>? = null,
    @Json(name = "fulfillments")
    val fulfillments: kotlin.collections.List<SquareOrderFulfillment>? = null,
    @Json(name = "returnAmounts")
    val returnAmounts: SquareOrderMoneyAmounts? = null,
    @Json(name = "netAmounts")
    val netAmounts: SquareOrderMoneyAmounts? = null,
    @Json(name = "roundingAdjustment")
    val roundingAdjustment: SquareOrderRoundingAdjustment? = null,
    @Json(name = "tenders")
    val tenders: kotlin.collections.List<SquareTender>? = null,
    @Json(name = "refunds")
    val refunds: kotlin.collections.List<SquareRefund>? = null,
    @Json(name = "createdAt")
    val createdAt: kotlin.String? = null,
    @Json(name = "updatedAt")
    val updatedAt: kotlin.String? = null,
    @Json(name = "closedAt")
    val closedAt: kotlin.String? = null,
    @Json(name = "state")
    val state: kotlin.String? = null,
    @Json(name = "version")
    val version: java.math.BigDecimal? = null,
    @Json(name = "totalMoney")
    val totalMoney: SquareMoney? = null,
    @Json(name = "totalTaxMoney")
    val totalTaxMoney: SquareMoney? = null,
    @Json(name = "totalDiscountMoney")
    val totalDiscountMoney: SquareMoney? = null,
    @Json(name = "totalTipMoney")
    val totalTipMoney: SquareMoney? = null,
    @Json(name = "totalServiceChargeMoney")
    val totalServiceChargeMoney: SquareMoney? = null
)
