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
 * @param catalogObjectId 
 * @param name 
 * @param type 
 * @param percentage 
 * @param amountMoney 
 * @param appliedMoney 
 * @param scope 
 * @param rewardIds 
 * @param pricingRuleId 
 */

data class SquareOrderLineItemDiscount (
    @Json(name = "uid")
    val uid: kotlin.String? = null,
    @Json(name = "catalogObjectId")
    val catalogObjectId: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "percentage")
    val percentage: kotlin.String? = null,
    @Json(name = "amountMoney")
    val amountMoney: SquareMoney? = null,
    @Json(name = "appliedMoney")
    val appliedMoney: SquareMoney? = null,
    @Json(name = "scope")
    val scope: kotlin.String? = null,
    @Json(name = "rewardIds")
    val rewardIds: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "pricingRuleId")
    val pricingRuleId: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

