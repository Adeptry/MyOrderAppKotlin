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

import org.myorderapp.kotlin-client.models.MoaModifierList

import com.squareup.moshi.Json

/**
 * 
 * @param modifierList 
 * @param id 
 * @param createDate 
 * @param updateDate 
 * @param squareId 
 * @param name 
 * @param priceInCents 
 * @param ordinal 
 */

data class MoaModifier (
    @Json(name = "modifierList")
    val modifierList: MoaModifierList? = null,
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "createDate")
    val createDate: java.time.OffsetDateTime? = null,
    @Json(name = "updateDate")
    val updateDate: java.time.OffsetDateTime? = null,
    @Json(name = "squareId")
    val squareId: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "priceInCents")
    val priceInCents: java.math.BigDecimal? = null,
    @Json(name = "ordinal")
    val ordinal: java.math.BigDecimal? = null
)
