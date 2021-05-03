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
 * @param id 
 * @param locationId 
 * @param transactionId 
 * @param createdAt 
 * @param note 
 * @param amountMoney 
 * @param tipMoney 
 * @param processingFeeMoney 
 * @param customerId 
 * @param type 
 * @param paymentId 
 */

data class SquareTender (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "locationId")
    val locationId: kotlin.String? = null,
    @Json(name = "transactionId")
    val transactionId: kotlin.String? = null,
    @Json(name = "createdAt")
    val createdAt: kotlin.String? = null,
    @Json(name = "note")
    val note: kotlin.String? = null,
    @Json(name = "amountMoney")
    val amountMoney: SquareMoney? = null,
    @Json(name = "tipMoney")
    val tipMoney: SquareMoney? = null,
    @Json(name = "processingFeeMoney")
    val processingFeeMoney: SquareMoney? = null,
    @Json(name = "customerId")
    val customerId: kotlin.String? = null,
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "paymentId")
    val paymentId: kotlin.String? = null
)

