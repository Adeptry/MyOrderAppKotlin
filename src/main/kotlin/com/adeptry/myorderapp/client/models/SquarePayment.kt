/**
* MyOrderApp
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.adeptry.myorderapp.client.models

import com.adeptry.myorderapp.client.models.SquareAddress
import com.adeptry.myorderapp.client.models.SquareMoney

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param id 
 * @param createdAt 
 * @param updatedAt 
 * @param amountMoney 
 * @param tipMoney 
 * @param totalMoney 
 * @param appFeeMoney 
 * @param approvedMoney 
 * @param refundedMoney 
 * @param status 
 * @param delayDuration 
 * @param delayAction 
 * @param delayedUntil 
 * @param sourceType 
 * @param locationId 
 * @param orderId 
 * @param referenceId 
 * @param customerId 
 * @param employeeId 
 * @param refundIds 
 * @param buyerEmailAddress 
 * @param billingAddress 
 * @param shippingAddress 
 * @param note 
 * @param statementDescriptionIdentifier 
 * @param capabilities 
 * @param receiptNumber 
 * @param receiptUrl 
 * @param versionToken 
 */

data class SquarePayment (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "createdAt")
    val createdAt: kotlin.String? = null,
    @Json(name = "updatedAt")
    val updatedAt: kotlin.String? = null,
    @Json(name = "amountMoney")
    val amountMoney: SquareMoney? = null,
    @Json(name = "tipMoney")
    val tipMoney: SquareMoney? = null,
    @Json(name = "totalMoney")
    val totalMoney: SquareMoney? = null,
    @Json(name = "appFeeMoney")
    val appFeeMoney: SquareMoney? = null,
    @Json(name = "approvedMoney")
    val approvedMoney: SquareMoney? = null,
    @Json(name = "refundedMoney")
    val refundedMoney: SquareMoney? = null,
    @Json(name = "status")
    val status: kotlin.String? = null,
    @Json(name = "delayDuration")
    val delayDuration: kotlin.String? = null,
    @Json(name = "delayAction")
    val delayAction: kotlin.String? = null,
    @Json(name = "delayedUntil")
    val delayedUntil: kotlin.String? = null,
    @Json(name = "sourceType")
    val sourceType: kotlin.String? = null,
    @Json(name = "locationId")
    val locationId: kotlin.String? = null,
    @Json(name = "orderId")
    val orderId: kotlin.String? = null,
    @Json(name = "referenceId")
    val referenceId: kotlin.String? = null,
    @Json(name = "customerId")
    val customerId: kotlin.String? = null,
    @Json(name = "employeeId")
    val employeeId: kotlin.String? = null,
    @Json(name = "refundIds")
    val refundIds: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "buyerEmailAddress")
    val buyerEmailAddress: kotlin.String? = null,
    @Json(name = "billingAddress")
    val billingAddress: SquareAddress? = null,
    @Json(name = "shippingAddress")
    val shippingAddress: SquareAddress? = null,
    @Json(name = "note")
    val note: kotlin.String? = null,
    @Json(name = "statementDescriptionIdentifier")
    val statementDescriptionIdentifier: kotlin.String? = null,
    @Json(name = "capabilities")
    val capabilities: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "receiptNumber")
    val receiptNumber: kotlin.String? = null,
    @Json(name = "receiptUrl")
    val receiptUrl: kotlin.String? = null,
    @Json(name = "versionToken")
    val versionToken: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

