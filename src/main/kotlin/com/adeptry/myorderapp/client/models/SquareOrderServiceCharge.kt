/**
* MyOrderApp
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.adeptry.myorderapp.client.models

import com.adeptry.myorderapp.client.models.SquareMoney

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param uid 
 * @param name 
 * @param catalogObjectId 
 * @param percentage 
 * @param amountMoney 
 * @param appliedMoney 
 * @param totalMoney 
 * @param totalTaxMoney 
 * @param calculationPhase 
 * @param taxable 
 */

data class SquareOrderServiceCharge (
    @Json(name = "uid")
    val uid: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "catalogObjectId")
    val catalogObjectId: kotlin.String? = null,
    @Json(name = "percentage")
    val percentage: kotlin.String? = null,
    @Json(name = "amountMoney")
    val amountMoney: SquareMoney? = null,
    @Json(name = "appliedMoney")
    val appliedMoney: SquareMoney? = null,
    @Json(name = "totalMoney")
    val totalMoney: SquareMoney? = null,
    @Json(name = "totalTaxMoney")
    val totalTaxMoney: SquareMoney? = null,
    @Json(name = "calculationPhase")
    val calculationPhase: kotlin.String? = null,
    @Json(name = "taxable")
    val taxable: kotlin.Boolean? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

