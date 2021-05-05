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

import com.adeptry.myorderapp.client.models.MoaItem
import com.adeptry.myorderapp.client.models.MoaModifier

import com.squareup.moshi.Json

/**
 * 
 * @param item 
 * @param modifiers 
 * @param moaId 
 * @param createDate 
 * @param updateDate 
 * @param squareId 
 * @param minSelectedModifiers 
 * @param maxSelectedModifiers 
 * @param enabled 
 * @param name 
 */

data class MoaModifierList (
    @Json(name = "item")
    val item: MoaItem? = null,
    @Json(name = "modifiers")
    val modifiers: kotlin.collections.List<MoaModifier>? = null,
    @Json(name = "moaId")
    val moaId: kotlin.String? = null,
    @Json(name = "createDate")
    val createDate: java.time.OffsetDateTime? = null,
    @Json(name = "updateDate")
    val updateDate: java.time.OffsetDateTime? = null,
    @Json(name = "squareId")
    val squareId: kotlin.String? = null,
    @Json(name = "minSelectedModifiers")
    val minSelectedModifiers: java.math.BigDecimal? = null,
    @Json(name = "maxSelectedModifiers")
    val maxSelectedModifiers: java.math.BigDecimal? = null,
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,
    @Json(name = "name")
    val name: kotlin.String? = null
)

